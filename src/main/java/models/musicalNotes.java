package models;

import java.math.BigDecimal;
import java.util.Scanner;

public class musicalNotes {

    private String C_I;
    private String C_ii;
    private String C_iii;
    private String C_IV;
    private String C_V;
    private String C_vi;
    private String C_viio;

    public void listOfChords(String C_I, String C_ii, String C_iii, String C_IV, String C_V, String C_vi, String C_viio) {
        this.C_I = C_I;
        this.C_ii = C_ii;
        this.C_iii = C_iii;
        this.C_IV = C_IV;
        this.C_V = C_V;
        this.C_vi = C_vi;
        this.C_viio = C_viio;
    }

    public String getC_I() {
        return C_I;
    }

    public void setC_I(String c_I) {
        C_I = c_I;
    }

    public String getC_ii() {
        return C_ii;
    }

    public void setC_ii(String c_ii) {
        C_ii = c_ii;
    }

    public String getC_iii() {
        return C_iii;
    }

    public void setC_iii(String c_iii) {
        C_iii = c_iii;
    }

    public String getC_IV() {
        return C_IV;
    }

    public void setC_IV(String c_IV) {
        C_IV = c_IV;
    }

    public String getC_V() {
        return C_V;
    }

    public void setC_V(String c_V) {
        C_V = c_V;
    }

    public String getC_vi() {
        return C_vi;
    }

    public void setC_vi(String c_vi) {
        C_vi = c_vi;
    }

    public String getC_viio() {
        return C_viio;
    }

    public void setC_viio(String c_viio) {
        C_viio = c_viio;
    }
}
