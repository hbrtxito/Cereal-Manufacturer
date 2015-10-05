package com.malcolm;



/**
 * Created by Malcolm on 10/5/2015.
 */
public class CerealClass {

    String cerealName="";
    double riceContainsGrams;
    double cornContainsGrams;
    double sugarContainsGrams;
    double saltContainsGrams;

    public CerealClass(String cerealName, double riceContainsGrams,double cornContainsGrams, double sugarContainsGrams, double saltContainsGrams) {
        this.cerealName=cerealName;
        this.riceContainsGrams = riceContainsGrams;
        this.cornContainsGrams=cornContainsGrams;
        this.sugarContainsGrams=sugarContainsGrams;
        this.saltContainsGrams=saltContainsGrams;
    }

    public String getCerealName() {
        return cerealName;
    }

    public void setCerealName(String cerealName) {
        this.cerealName = cerealName;
    }

    public double getRiceContainsGrams() {
        return riceContainsGrams;
    }

    public void setRiceContainsGrams(double riceContainsGrams) {
        this.riceContainsGrams = riceContainsGrams;
    }

    public double getCornContainsGrams() {
        return cornContainsGrams;
    }

    public void setCornContainsGrams(double cornContainsGrams) {
        this.cornContainsGrams = cornContainsGrams;
    }

    public double getSugarContainsGrams() {
        return sugarContainsGrams;
    }

    public void setSugarContainsGrams(double sugarContainsGrams) {
        this.sugarContainsGrams = sugarContainsGrams;
    }

    public double getSaltContainsGrams() {
        return saltContainsGrams;
    }

    public void setSaltContainsGrams(double saltContainsGrams) {
        this.saltContainsGrams = saltContainsGrams;
    }
}
