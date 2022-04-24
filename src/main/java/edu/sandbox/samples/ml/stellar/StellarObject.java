package edu.sandbox.samples.ml.stellar;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;

import java.math.BigDecimal;

public class StellarObject {

    @CsvBindByName(column = "obj_ID")
    String getId;

    @CsvBindByName(column = "spec_obj_ID")
    String specialId;

    @CsvBindByName(column = "alpha")
    BigDecimal rightAscension;

    @CsvBindByName(column = "delta")
    BigDecimal declination;

    @CsvBindByName(column = "u")
    BigDecimal ultraviolet;

    @CsvBindByName(column = "g")
    BigDecimal green;

    @CsvBindByName(column = "r")
    BigDecimal red;

    @CsvBindByName(column = "i")
    BigDecimal nearInfrared;

    @CsvBindByName(column = "z")
    BigDecimal infrared;

    @CsvBindByName(column = "run_ID")
    int run;

    @CsvBindByName(column = "rerun_ID")
    int rerun;

    @CsvBindByName(column = "cam_col")
    int cameraColumn;

    @CsvBindByName(column = "field_ID")
    int field;

    @CsvCustomBindByName(column = "class", converter = StellarClassConverter.class)
    StellarClass outputClass;

    @CsvBindByName(column = "redshift")
    BigDecimal redshift;

    @CsvBindByName(column = "plate")
    int plate;

    @CsvBindByName(column = "MJD")
    int modifiedJulianDate;

    @CsvBindByName(column = "fiber_ID")
    int fiber;


    public String getGetId() {
        return getId;
    }

    public void setGetId(String getId) {
        this.getId = getId;
    }

    public String getSpecialId() {
        return specialId;
    }

    public void setSpecialId(String specialId) {
        this.specialId = specialId;
    }

    public BigDecimal getRightAscension() {
        return rightAscension;
    }

    public void setRightAscension(BigDecimal rightAscension) {
        this.rightAscension = rightAscension;
    }

    public BigDecimal getDeclination() {
        return declination;
    }

    public void setDeclination(BigDecimal declination) {
        this.declination = declination;
    }

    public BigDecimal getUltraviolet() {
        return ultraviolet;
    }

    public void setUltraviolet(BigDecimal ultraviolet) {
        this.ultraviolet = ultraviolet;
    }

    public BigDecimal getGreen() {
        return green;
    }

    public void setGreen(BigDecimal green) {
        this.green = green;
    }

    public BigDecimal getRed() {
        return red;
    }

    public void setRed(BigDecimal red) {
        this.red = red;
    }

    public BigDecimal getNearInfrared() {
        return nearInfrared;
    }

    public void setNearInfrared(BigDecimal nearInfrared) {
        this.nearInfrared = nearInfrared;
    }

    public BigDecimal getInfrared() {
        return infrared;
    }

    public void setInfrared(BigDecimal infrared) {
        this.infrared = infrared;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getRerun() {
        return rerun;
    }

    public void setRerun(int rerun) {
        this.rerun = rerun;
    }

    public int getCameraColumn() {
        return cameraColumn;
    }

    public void setCameraColumn(int cameraColumn) {
        this.cameraColumn = cameraColumn;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public StellarClass getOutputClass() {
        return outputClass;
    }

    public void setOutputClass(StellarClass outputClass) {
        this.outputClass = outputClass;
    }

    public BigDecimal getRedshift() {
        return redshift;
    }

    public void setRedshift(BigDecimal redshift) {
        this.redshift = redshift;
    }

    public int getPlate() {
        return plate;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    public int getModifiedJulianDate() {
        return modifiedJulianDate;
    }

    public void setModifiedJulianDate(int modifiedJulianDate) {
        this.modifiedJulianDate = modifiedJulianDate;
    }

    public int getFiber() {
        return fiber;
    }

    public void setFiber(int fiber) {
        this.fiber = fiber;
    }
}
