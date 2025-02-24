package ejercicios_repaso.repaso_clases.main;

import ejercicios_repaso.repaso_clases.entidades.Person;

public class CM_Test_Person {
    public static void main(String[] args) {

        System.out.println("____Object_Person_1____");
        Person person1 = new Person();
        person1.name = "Angie";
        person1.age = 26;
        person1.sendInformation();
    }
}