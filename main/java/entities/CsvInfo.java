/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author JSI-Christine
 */
import java.util.*;
public class CsvInfo {
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;    
    
    public CsvInfo (String a,String b,String c,String d,String e,String f,String g,String h,String i,String j){
        super();
        this.a= a;
        this.b= b;
        this.c= c;
        this.d= d;
        this.e= e; 
        this.f= f;
        this.g= g;
        this.h= h;
        this.i= i;
        this.j= j;
    }  
    public String toString(){
        return "CsvInfo [a = "+a+",b= "+b+",c= "+c+",d= "+d+",e= "+e+",f= "+f+",g= "+g+",h="
                + " "+h+",i= "+i+",j= "+j+" ]";
    }
    
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d;
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getG() {
        return g;
    }

    public void setG(String g) {
        this.g = g;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

}
