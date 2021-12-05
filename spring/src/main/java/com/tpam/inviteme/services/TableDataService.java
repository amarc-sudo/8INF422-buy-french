package com.tpam.inviteme.services;

import com.tpam.inviteme.dao.IPersonDao;
import com.tpam.inviteme.dao.ITableDataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service("tableDataService")
@Transactional
public class TableDataService {

    @Autowired
    private ITableDataDao tableDataDao;

}
