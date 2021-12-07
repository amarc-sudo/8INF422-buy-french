package com.u8inf422.spring.beans;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "productCommand")
public class ProductCommand {
    @EmbeddedId
    private ProductCommandId id;

    public ProductCommandId getId() {
        return id;
    }

    public void setId(ProductCommandId id) {
        this.id = id;
    }
}