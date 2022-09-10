/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import dol.Gender;
import dol.Person;

/**
 *
 * @author JADPA-06
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Belen");
        person.setLastName("Marquez");
        person.setGender(Gender.FEMALE);
        System.out.println(person.toString());
    }
    
}
