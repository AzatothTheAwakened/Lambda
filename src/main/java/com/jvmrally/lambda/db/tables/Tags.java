/*
 * This file is generated by jOOQ.
 */
package com.jvmrally.lambda.db.tables;


import com.jvmrally.lambda.db.DefaultSchema;
import com.jvmrally.lambda.db.Indexes;
import com.jvmrally.lambda.db.Keys;
import com.jvmrally.lambda.db.tables.records.TagsRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class Tags extends TableImpl<TagsRecord> {

    private static final long serialVersionUID = 1654135961;

    /**
     * The reference instance of <code>tags</code>
     */
    public static final Tags TAGS = new Tags();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TagsRecord> getRecordType() {
        return TagsRecord.class;
    }

    /**
     * The column <code>tags.id</code>.
     */
    public final TableField<TagsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaultValue(org.jooq.impl.DSL.field("nextval('tags_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>tags.tagname</code>.
     */
    public final TableField<TagsRecord, String> TAGNAME = createField("tagname", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>tags.content</code>.
     */
    public final TableField<TagsRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>tags.updated_at</code>.
     */
    public final TableField<TagsRecord, OffsetDateTime> UPDATED_AT = createField("updated_at", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE.nullable(false), this, "");

    /**
     * Create a <code>tags</code> table reference
     */
    public Tags() {
        this(DSL.name("tags"), null);
    }

    /**
     * Create an aliased <code>tags</code> table reference
     */
    public Tags(String alias) {
        this(DSL.name(alias), TAGS);
    }

    /**
     * Create an aliased <code>tags</code> table reference
     */
    public Tags(Name alias) {
        this(alias, TAGS);
    }

    private Tags(Name alias, Table<TagsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tags(Name alias, Table<TagsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Tags(Table<O> child, ForeignKey<O, TagsRecord> key) {
        super(child, key, TAGS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return DefaultSchema.DEFAULT_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.TAGS_PKEY, Indexes.TAGS_TAGNAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<TagsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TAGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TagsRecord> getPrimaryKey() {
        return Keys.TAGS_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TagsRecord>> getKeys() {
        return Arrays.<UniqueKey<TagsRecord>>asList(Keys.TAGS_PKEY, Keys.TAGS_TAGNAME_KEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tags as(String alias) {
        return new Tags(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Tags as(Name alias) {
        return new Tags(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tags rename(String name) {
        return new Tags(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tags rename(Name name) {
        return new Tags(name, null);
    }
}
