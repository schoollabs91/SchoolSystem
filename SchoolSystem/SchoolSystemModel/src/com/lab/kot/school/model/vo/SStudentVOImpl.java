package com.lab.kot.school.model.vo;

import com.lab.kot.school.model.vo.common.SStudentVO;

import oracle.jbo.Row;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Oct 02 17:51:30 IST 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SStudentVOImpl extends ViewObjectImpl implements SStudentVO {
    /**
     * This is the default constructor (do not remove).
     */
    public SStudentVOImpl() {
    }
    public void createNInit() {
        SStudentVORowImpl currRow = (SStudentVORowImpl)this.createRow();
        Row cRow = currRow.getSRunningSessionVO().createRow();
        currRow.getSRunningSessionVO().insertRow(cRow);
        this.insertRow(currRow);        
    }
}

