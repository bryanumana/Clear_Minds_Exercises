package com.bryan.cm.class_review.main;

import com.bryan.cm.class_review.classes.Account;

public class CM_Test_Account {
    public static void main(String[] args) {
        Account account1 = new Account("03476");
        account1.setSaldo(675);
        Account account2 = new Account("03476", "C", 98);
        Account account3 = new Account("03476");
        System.out.println("--------Valores Iniciales---------");
        account1.imprimir();
        account2.imprimir();
        account3.imprimir();
        account1.setSaldo(444);
        account3.setSaldo(567);
        account2.setTipoCuenta("D");
        System.out.println("--------Valores Modificados---------");
        account1.imprimir();
        account2.imprimir();
        account3.imprimir();
        System.out.println("--------Cuenta 4---------");
        Account account4 = new Account("0987");
        account4.setSaldo(10);
        account4.imprimirConMiEstilo();
        System.out.println("--------Cuenta 5---------");
        Account account5 = new Account("0557", "C", 10);
        account5.imprimirConMiEstilo();
        System.out.println("--------Cuenta 6---------");
        Account account6 = new Account("0666");
        account6.imprimirConMiEstilo();
    }
}
