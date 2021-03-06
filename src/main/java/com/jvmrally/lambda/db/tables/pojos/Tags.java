/*
 * This file is generated by jOOQ.
 */
package com.jvmrally.lambda.db.tables.pojos;


import java.io.Serializable;
import java.time.OffsetDateTime;

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
public class Tags implements Serializable {

    private static final long serialVersionUID = 1815401649;

    private Integer        id;
    private String         tagname;
    private String         content;
    private OffsetDateTime updatedAt;

    public Tags() {}

    public Tags(Tags value) {
        this.id = value.id;
        this.tagname = value.tagname;
        this.content = value.content;
        this.updatedAt = value.updatedAt;
    }

    public Tags(
        Integer        id,
        String         tagname,
        String         content,
        OffsetDateTime updatedAt
    ) {
        this.id = id;
        this.tagname = tagname;
        this.content = content;
        this.updatedAt = updatedAt;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagname() {
        return this.tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public OffsetDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tags (");

        sb.append(id);
        sb.append(", ").append(tagname);
        sb.append(", ").append(content);
        sb.append(", ").append(updatedAt);

        sb.append(")");
        return sb.toString();
    }
}
