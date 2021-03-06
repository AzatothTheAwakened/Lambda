/*
 * This file is generated by jOOQ.
 */
package com.jvmrally.lambda.db.tables.records;


import com.jvmrally.lambda.db.enums.AuditAction;
import com.jvmrally.lambda.db.tables.Audit;

import java.time.OffsetDateTime;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class AuditRecord extends UpdatableRecordImpl<AuditRecord> implements Record6<Integer, Long, AuditAction, Long, String, OffsetDateTime> {

    private static final long serialVersionUID = 1194168714;

    /**
     * Setter for <code>audit.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>audit.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>audit.user_id</code>.
     */
    public void setUserId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>audit.user_id</code>.
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>audit.mod_action</code>.
     */
    public void setModAction(AuditAction value) {
        set(2, value);
    }

    /**
     * Getter for <code>audit.mod_action</code>.
     */
    public AuditAction getModAction() {
        return (AuditAction) get(2);
    }

    /**
     * Setter for <code>audit.target_user</code>.
     */
    public void setTargetUser(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>audit.target_user</code>.
     */
    public Long getTargetUser() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>audit.reason</code>.
     */
    public void setReason(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>audit.reason</code>.
     */
    public String getReason() {
        return (String) get(4);
    }

    /**
     * Setter for <code>audit.created</code>.
     */
    public void setCreated(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>audit.created</code>.
     */
    public OffsetDateTime getCreated() {
        return (OffsetDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Long, AuditAction, Long, String, OffsetDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Long, AuditAction, Long, String, OffsetDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Audit.AUDIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Audit.AUDIT.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<AuditAction> field3() {
        return Audit.AUDIT.MOD_ACTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Audit.AUDIT.TARGET_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Audit.AUDIT.REASON;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<OffsetDateTime> field6() {
        return Audit.AUDIT.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditAction component3() {
        return getModAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getTargetUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime component6() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditAction value3() {
        return getModAction();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getTargetUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getReason();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OffsetDateTime value6() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value3(AuditAction value) {
        setModAction(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value4(Long value) {
        setTargetUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value5(String value) {
        setReason(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value6(OffsetDateTime value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord values(Integer value1, Long value2, AuditAction value3, Long value4, String value5, OffsetDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditRecord
     */
    public AuditRecord() {
        super(Audit.AUDIT);
    }

    /**
     * Create a detached, initialised AuditRecord
     */
    public AuditRecord(Integer id, Long userId, AuditAction modAction, Long targetUser, String reason, OffsetDateTime created) {
        super(Audit.AUDIT);

        set(0, id);
        set(1, userId);
        set(2, modAction);
        set(3, targetUser);
        set(4, reason);
        set(5, created);
    }
}
