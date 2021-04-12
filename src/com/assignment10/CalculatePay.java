package com.assignment10;


import com.assignment10.salesPerson.CommissionRate;

import java.util.Scanner;


class calculatePay {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the monthly sales of the person:");
        double sales = myObj.nextDouble();
        System.out.println("Enter the advance pay:");
        double advance= myObj.nextDouble();
        CommissionRate cR = new CommissionRate(sales,advance);
        cR.display();

    }
}
