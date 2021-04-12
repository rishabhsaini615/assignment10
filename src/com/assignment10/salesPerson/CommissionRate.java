package com.assignment10.salesPerson;

import com.assignment10.util.CurrencyConvertor;

public class CommissionRate extends salesPerson {
    double rate;
    double pay;
    public CommissionRate(double sales, double advance) {
        super(sales, advance);
        this.rate = rate;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double calculateTotalPay() {
        setPay((this.sales * getRate())- this.advance);
        return getPay();
    }

    @Override
    public void display() {
        if  (this.sales<10000){
            setRate(0.5);
        }
        else if (this.sales>=10000 &&  this.sales<14999 ){
            setRate(0.10);
        }
        else if (this.sales>=15000 &&  this.sales<17999 ){
            setRate(0.12);
        }
        else if (this.sales>=18000 &&  this.sales<21999 ){
            setRate(0.15);
        }
        else if (this.sales>=22000){
            setRate(0.16);
        }
        System.out.println("Commission: "+ CurrencyConvertor.formatOfCurrency(calculateTotalPay()+this.advance));
        System.out.println("After deducting advance pay Final commission: "+CurrencyConvertor.formatOfCurrency(calculateTotalPay()));
        if (getPay()<0){
            setPay(-(this.pay));
            System.out.println("The Amount that you have to reimburse "+CurrencyConvertor.formatOfCurrency(getPay())+" to the company ");
        }
    }
}

