package com.lab.kot.school.model.eo;

import java.sql.Blob;
import java.sql.Date;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.domain.Number;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.SequenceImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 31 17:58:03 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SBookEOImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BookId,
        Isbn,
        BookTitle,
        BookAuthor,
        BookRemarks,
        BookPublishDate,
        ActiveYn,
        BookTypeCode,
        BookCover,
        LocDirection,
        LocShelve;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int BOOKID = AttributesEnum.BookId.index();
    public static final int ISBN = AttributesEnum.Isbn.index();
    public static final int BOOKTITLE = AttributesEnum.BookTitle.index();
    public static final int BOOKAUTHOR = AttributesEnum.BookAuthor.index();
    public static final int BOOKREMARKS = AttributesEnum.BookRemarks.index();
    public static final int BOOKPUBLISHDATE = AttributesEnum.BookPublishDate.index();
    public static final int ACTIVEYN = AttributesEnum.ActiveYn.index();
    public static final int BOOKTYPECODE = AttributesEnum.BookTypeCode.index();
    public static final int BOOKCOVER = AttributesEnum.BookCover.index();
    public static final int LOCDIRECTION = AttributesEnum.LocDirection.index();
    public static final int LOCSHELVE = AttributesEnum.LocShelve.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SBookEOImpl() {
    }

    /**
     * Gets the attribute value for BookId, using the alias name BookId.
     * @return the value of BookId
     */
    public Long getBookId() {
        return (Long) getAttributeInternal(BOOKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BookId.
     * @param value value to set the BookId
     */
    public void setBookId(Long value) {
        setAttributeInternal(BOOKID, value);
    }

    /**
     * Gets the attribute value for Isbn, using the alias name Isbn.
     * @return the value of Isbn
     */
    public String getIsbn() {
        return (String) getAttributeInternal(ISBN);
    }

    /**
     * Sets <code>value</code> as the attribute value for Isbn.
     * @param value value to set the Isbn
     */
    public void setIsbn(String value) {
        setAttributeInternal(ISBN, value);
    }

    /**
     * Gets the attribute value for BookTitle, using the alias name BookTitle.
     * @return the value of BookTitle
     */
    public String getBookTitle() {
        return (String) getAttributeInternal(BOOKTITLE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BookTitle.
     * @param value value to set the BookTitle
     */
    public void setBookTitle(String value) {
        setAttributeInternal(BOOKTITLE, value);
    }

    /**
     * Gets the attribute value for BookAuthor, using the alias name BookAuthor.
     * @return the value of BookAuthor
     */
    public String getBookAuthor() {
        return (String) getAttributeInternal(BOOKAUTHOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for BookAuthor.
     * @param value value to set the BookAuthor
     */
    public void setBookAuthor(String value) {
        setAttributeInternal(BOOKAUTHOR, value);
    }

    /**
     * Gets the attribute value for BookRemarks, using the alias name BookRemarks.
     * @return the value of BookRemarks
     */
    public String getBookRemarks() {
        return (String) getAttributeInternal(BOOKREMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for BookRemarks.
     * @param value value to set the BookRemarks
     */
    public void setBookRemarks(String value) {
        setAttributeInternal(BOOKREMARKS, value);
    }

    /**
     * Gets the attribute value for BookPublishDate, using the alias name BookPublishDate.
     * @return the value of BookPublishDate
     */
    public Date getBookPublishDate() {
        return (Date) getAttributeInternal(BOOKPUBLISHDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BookPublishDate.
     * @param value value to set the BookPublishDate
     */
    public void setBookPublishDate(Date value) {
        setAttributeInternal(BOOKPUBLISHDATE, value);
    }

    /**
     * Gets the attribute value for ActiveYn, using the alias name ActiveYn.
     * @return the value of ActiveYn
     */
    public String getActiveYn() {
        return (String) getAttributeInternal(ACTIVEYN);
    }

    /**
     * Sets <code>value</code> as the attribute value for ActiveYn.
     * @param value value to set the ActiveYn
     */
    public void setActiveYn(String value) {
        setAttributeInternal(ACTIVEYN, value);
    }

    /**
     * Gets the attribute value for BookTypeCode, using the alias name BookTypeCode.
     * @return the value of BookTypeCode
     */
    public String getBookTypeCode() {
        return (String) getAttributeInternal(BOOKTYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BookTypeCode.
     * @param value value to set the BookTypeCode
     */
    public void setBookTypeCode(String value) {
        setAttributeInternal(BOOKTYPECODE, value);
    }

    /**
     * Gets the attribute value for BookCover, using the alias name BookCover.
     * @return the value of BookCover
     */
    public Blob getBookCover() {
        return (Blob) getAttributeInternal(BOOKCOVER);
    }

    /**
     * Sets <code>value</code> as the attribute value for BookCover.
     * @param value value to set the BookCover
     */
    public void setBookCover(Blob value) {
        setAttributeInternal(BOOKCOVER, value);
    }

    /**
     * Gets the attribute value for LocDirection, using the alias name LocDirection.
     * @return the value of LocDirection
     */
    public String getLocDirection() {
        return (String) getAttributeInternal(LOCDIRECTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocDirection.
     * @param value value to set the LocDirection
     */
    public void setLocDirection(String value) {
        setAttributeInternal(LOCDIRECTION, value);
    }

    /**
     * Gets the attribute value for LocShelve, using the alias name LocShelve.
     * @return the value of LocShelve
     */
    public String getLocShelve() {
        return (String) getAttributeInternal(LOCSHELVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocShelve.
     * @param value value to set the LocShelve
     */
    public void setLocShelve(String value) {
        setAttributeInternal(LOCSHELVE, value);
    }

    /**
     * @param bookId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Long bookId) {
        return new Key(new Object[] { bookId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.lab.kot.school.model.eo.SBookEO");
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
        SequenceImpl tranSeq = new SequenceImpl("LIST_ID", this.getDBTransaction());        
        Number tNumber = tranSeq.getSequenceNumber();
        this.setBookId(tNumber.longValue());
    }
}
