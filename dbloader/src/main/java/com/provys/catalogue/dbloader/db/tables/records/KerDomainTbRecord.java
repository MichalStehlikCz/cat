/*
 * This file is generated by jOOQ.
 */
package com.provys.catalogue.dbloader.db.tables.records;


import com.provys.catalogue.dbloader.db.tables.KerDomainTb;

import java.math.BigInteger;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Domain - attribute type (catalogue)
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class KerDomainTbRecord extends UpdatableRecordImpl<KerDomainTbRecord> implements Record14<BigInteger, String, String, String, String, Short, Byte, String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 348581828;

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.DOMAIN_ID</code>. UID of domain
     */
    public void setDomainId(BigInteger value) {
        set(0, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.DOMAIN_ID</code>. UID of domain
     */
    public BigInteger getDomainId() {
        return (BigInteger) get(0);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.NAME_NM</code>. Internal name of domain
     */
    public void setNameNm(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.NAME_NM</code>. Internal name of domain
     */
    public String getNameNm() {
        return (String) get(1);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.NAME</code>. Name of domain
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.NAME</code>. Name of domain
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.X_UPNAME</code>. Calculated column - uppercase of NAME
     */
    public void setXUpname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.X_UPNAME</code>. Calculated column - uppercase of NAME
     */
    public String getXUpname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.DATATYPE_NM</code>. PROVYS datatype used for implementation of column of this domain
     */
    public void setDatatypeNm(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.DATATYPE_NM</code>. PROVYS datatype used for implementation of column of this domain
     */
    public String getDatatypeNm() {
        return (String) get(4);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.DATALENGTH</code>. Length (maximum length) of data column corresponding to this domain
     */
    public void setDatalength(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.DATALENGTH</code>. Length (maximum length) of data column corresponding to this domain
     */
    public Short getDatalength() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.DATAPRECISION</code>. Precision of columns from this domain (for numbers only)
     */
    public void setDataprecision(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.DATAPRECISION</code>. Precision of columns from this domain (for numbers only)
     */
    public Byte getDataprecision() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.QVISIBLE</code>. Default query visibility for columns from this domain
     */
    public void setQvisible(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.QVISIBLE</code>. Default query visibility for columns from this domain
     */
    public String getQvisible() {
        return (String) get(7);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.LVISIBLE</code>. Default lists visibility for columns from this domain
     */
    public void setLvisible(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.LVISIBLE</code>. Default lists visibility for columns from this domain
     */
    public String getLvisible() {
        return (String) get(8);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.VALIDATE_CD</code>. PL/SQL block for standard validation (used if no format-specific validation is specified); value should be bound to IN/OUT :c_Value bind variable
     */
    public void setValidateCd(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.VALIDATE_CD</code>. PL/SQL block for standard validation (used if no format-specific validation is specified); value should be bound to IN/OUT :c_Value bind variable
     */
    public String getValidateCd() {
        return (String) get(9);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.LFORMAT_CD</code>. PL/SQL block for creation of formated output in list
     */
    public void setLformatCd(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.LFORMAT_CD</code>. PL/SQL block for creation of formated output in list
     */
    public String getLformatCd() {
        return (String) get(10);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.NATORDER</code>. When domain has native ordering, unmodified attribute value is used for ordering in XML lists. For domains without native ordering, formatted value (converted to string) is used
     */
    public void setNatorder(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.NATORDER</code>. When domain has native ordering, unmodified attribute value is used for ordering in XML lists. For domains without native ordering, formatted value (converted to string) is used
     */
    public String getNatorder() {
        return (String) get(11);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.NOTE</code>. Notes for administrator of catalogue
     */
    public void setNote(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.NOTE</code>. Notes for administrator of catalogue
     */
    public String getNote() {
        return (String) get(12);
    }

    /**
     * Setter for <code>KER.KER_DOMAIN_TB.ALLOWED</code>. Not allowed domains cannot be manualy created and they are reported in servercheck. Items (e.g. attributes or components) with non-allowed domains should be changed to allowed ones.
     */
    public void setAllowed(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>KER.KER_DOMAIN_TB.ALLOWED</code>. Not allowed domains cannot be manualy created and they are reported in servercheck. Items (e.g. attributes or components) with non-allowed domains should be changed to allowed ones.
     */
    public String getAllowed() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<BigInteger> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<BigInteger, String, String, String, String, Short, Byte, String, String, String, String, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<BigInteger, String, String, String, String, Short, Byte, String, String, String, String, String, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigInteger> field1() {
        return KerDomainTb.KER_DOMAIN_TB.DOMAIN_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return KerDomainTb.KER_DOMAIN_TB.NAME_NM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return KerDomainTb.KER_DOMAIN_TB.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return KerDomainTb.KER_DOMAIN_TB.X_UPNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return KerDomainTb.KER_DOMAIN_TB.DATATYPE_NM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return KerDomainTb.KER_DOMAIN_TB.DATALENGTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Byte> field7() {
        return KerDomainTb.KER_DOMAIN_TB.DATAPRECISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return KerDomainTb.KER_DOMAIN_TB.QVISIBLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return KerDomainTb.KER_DOMAIN_TB.LVISIBLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return KerDomainTb.KER_DOMAIN_TB.VALIDATE_CD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return KerDomainTb.KER_DOMAIN_TB.LFORMAT_CD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return KerDomainTb.KER_DOMAIN_TB.NATORDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return KerDomainTb.KER_DOMAIN_TB.NOTE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return KerDomainTb.KER_DOMAIN_TB.ALLOWED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger component1() {
        return getDomainId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNameNm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getXUpname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDatatypeNm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getDatalength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte component7() {
        return getDataprecision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getQvisible();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getLvisible();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getValidateCd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getLformatCd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component12() {
        return getNatorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getAllowed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigInteger value1() {
        return getDomainId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNameNm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getXUpname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDatatypeNm();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getDatalength();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Byte value7() {
        return getDataprecision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getQvisible();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getLvisible();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getValidateCd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getLformatCd();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getNatorder();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getNote();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getAllowed();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value1(BigInteger value) {
        setDomainId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value2(String value) {
        setNameNm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value3(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value4(String value) {
        setXUpname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value5(String value) {
        setDatatypeNm(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value6(Short value) {
        setDatalength(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value7(Byte value) {
        setDataprecision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value8(String value) {
        setQvisible(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value9(String value) {
        setLvisible(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value10(String value) {
        setValidateCd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value11(String value) {
        setLformatCd(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value12(String value) {
        setNatorder(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value13(String value) {
        setNote(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord value14(String value) {
        setAllowed(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public KerDomainTbRecord values(BigInteger value1, String value2, String value3, String value4, String value5, Short value6, Byte value7, String value8, String value9, String value10, String value11, String value12, String value13, String value14) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached KerDomainTbRecord
     */
    public KerDomainTbRecord() {
        super(KerDomainTb.KER_DOMAIN_TB);
    }

    /**
     * Create a detached, initialised KerDomainTbRecord
     */
    public KerDomainTbRecord(BigInteger domainId, String nameNm, String name, String xUpname, String datatypeNm, Short datalength, Byte dataprecision, String qvisible, String lvisible, String validateCd, String lformatCd, String natorder, String note, String allowed) {
        super(KerDomainTb.KER_DOMAIN_TB);

        set(0, domainId);
        set(1, nameNm);
        set(2, name);
        set(3, xUpname);
        set(4, datatypeNm);
        set(5, datalength);
        set(6, dataprecision);
        set(7, qvisible);
        set(8, lvisible);
        set(9, validateCd);
        set(10, lformatCd);
        set(11, natorder);
        set(12, note);
        set(13, allowed);
    }
}
