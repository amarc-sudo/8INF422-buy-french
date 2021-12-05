package com.tpam.inviteme;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tpam.inviteme.beans.Person;
import com.tpam.inviteme.beans.User;
import com.tpam.inviteme.services.PersonService;
import com.tpam.inviteme.utils.Cryptage;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@Slf4j
@AutoConfigureMockMvc
class InvitemeApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private PersonService userService;

    private List<Person> Persons;

    private Person personBean;

    private User userBean;

    @Autowired
    private ObjectMapper mapper;

    private String URI = "/rest/api/user/login";

    @Test
    void contextLoads() throws NoSuchAlgorithmException {
        personBean = new Person();
        personBean.setSurname("aurelien");

        userBean = new User();
        userBean.setEmail("email");
        String encryptedPassword = Cryptage.crypteString("password");
        userBean.setEmail(encryptedPassword);
    }

    @Test
    void connectionTest() throws Exception {
        MvcResult result = mockMvc.perform(MockMvcRequestBuilders.post(URI)
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(mapper.writeValueAsString(userBean).getBytes(StandardCharsets.UTF_8))
                        .accept(MediaType.APPLICATION_JSON)).andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();

        mockMvc.perform(post("/api/employee")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(toJson(emp)))
                .andExpect(status().isOk());
    }

}
