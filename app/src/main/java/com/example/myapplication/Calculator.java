package com.example.myapplication;

public class Calculator {
   public Double operant1;
   public Double operant2;
   public String operation;

   public String plus() {
     Double res=this.operant1 + this.operant2;
     this.operant2 = null;
             this.operant1 = res;
             return String.valueOf(res);
   }
    public String minus() {
        Double res = this.operant1 - this.operant2;
        this.operant2 = null;
        this.operant1 = res;
        return String.valueOf(res);
    }

    public String multiply() {
        Double res = this.operant1 * this.operant2;
        this.operant2 = null;
        this.operant1 = res;
        return String.valueOf(res);
    }

    public String divide() {
        Double res = this.operant1 / this.operant2;
        this.operant2 = null;
        this.operant1 = res;
        return String.valueOf(res);
    }
    public String equals() {
        Double res = 0.0;
        if (this.operation.equals("+")) {
            res = operant1 + operant2;
        }
        if (this.operation.equals("-")) {
            res = operant1 - operant2;
        }
        if (this.operation.equals("*")) {
            res = operant1 * operant2;
        }
        if (this.operation.equals("/")) {
            res = operant1 / operant2;
        }

        return String.valueOf(res);

    }
}

