/*
 * This file is generated by jOOQ.
 */
package com.jvmrally.lambda.db.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.11"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Ban implements Serializable {

    private static final long serialVersionUID = 739716797;

    private Long userid;
    private Long banExpiry;

    public Ban() {}

    public Ban(Ban value) {
        this.userid = value.userid;
        this.banExpiry = value.banExpiry;
    }

    public Ban(
        Long userid,
        Long banExpiry
    ) {
        this.userid = userid;
        this.banExpiry = banExpiry;
    }

    public Long getUserid() {
        return this.userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public Long getBanExpiry() {
        return this.banExpiry;
    }

    public void setBanExpiry(Long banExpiry) {
        this.banExpiry = banExpiry;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Ban (");

        sb.append(userid);
        sb.append(", ").append(banExpiry);

        sb.append(")");
        return sb.toString();
    }
}
