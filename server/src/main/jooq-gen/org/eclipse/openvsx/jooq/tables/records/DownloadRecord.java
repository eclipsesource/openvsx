/*
 * This file is generated by jOOQ.
 */
package org.eclipse.openvsx.jooq.tables.records;


import java.time.LocalDateTime;

import org.eclipse.openvsx.jooq.tables.Download;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DownloadRecord extends UpdatableRecordImpl<DownloadRecord> implements Record4<Long, Long, LocalDateTime, Integer> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.download.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.download.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.download.file_resource_id_not_fk</code>.
     */
    public void setFileResourceIdNotFk(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.download.file_resource_id_not_fk</code>.
     */
    public Long getFileResourceIdNotFk() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.download.timestamp</code>.
     */
    public void setTimestamp(LocalDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.download.timestamp</code>.
     */
    public LocalDateTime getTimestamp() {
        return (LocalDateTime) get(2);
    }

    /**
     * Setter for <code>public.download.amount</code>.
     */
    public void setAmount(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.download.amount</code>.
     */
    public Integer getAmount() {
        return (Integer) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, LocalDateTime, Integer> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Long, LocalDateTime, Integer> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Download.DOWNLOAD.ID;
    }

    @Override
    public Field<Long> field2() {
        return Download.DOWNLOAD.FILE_RESOURCE_ID_NOT_FK;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Download.DOWNLOAD.TIMESTAMP;
    }

    @Override
    public Field<Integer> field4() {
        return Download.DOWNLOAD.AMOUNT;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getFileResourceIdNotFk();
    }

    @Override
    public LocalDateTime component3() {
        return getTimestamp();
    }

    @Override
    public Integer component4() {
        return getAmount();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getFileResourceIdNotFk();
    }

    @Override
    public LocalDateTime value3() {
        return getTimestamp();
    }

    @Override
    public Integer value4() {
        return getAmount();
    }

    @Override
    public DownloadRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public DownloadRecord value2(Long value) {
        setFileResourceIdNotFk(value);
        return this;
    }

    @Override
    public DownloadRecord value3(LocalDateTime value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public DownloadRecord value4(Integer value) {
        setAmount(value);
        return this;
    }

    @Override
    public DownloadRecord values(Long value1, Long value2, LocalDateTime value3, Integer value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DownloadRecord
     */
    public DownloadRecord() {
        super(Download.DOWNLOAD);
    }

    /**
     * Create a detached, initialised DownloadRecord
     */
    public DownloadRecord(Long id, Long fileResourceIdNotFk, LocalDateTime timestamp, Integer amount) {
        super(Download.DOWNLOAD);

        setId(id);
        setFileResourceIdNotFk(fileResourceIdNotFk);
        setTimestamp(timestamp);
        setAmount(amount);
    }
}
