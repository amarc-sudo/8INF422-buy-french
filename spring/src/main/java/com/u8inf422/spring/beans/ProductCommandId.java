package com.u8inf422.spring.beans;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProductCommandId implements Serializable {
    private static final long serialVersionUID = 8116998428318038304L;
    @Column(name = "productID", nullable = false)
    private Integer productID;
    @Column(name = "commandID", nullable = false)
    private Integer commandID;

    public Integer getCommandID() {
        return commandID;
    }

    public void setCommandID(Integer commandID) {
        this.commandID = commandID;
    }

    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productID, commandID);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProductCommandId entity = (ProductCommandId) o;
        return Objects.equals(this.productID, entity.productID) &&
                Objects.equals(this.commandID, entity.commandID);
    }
}