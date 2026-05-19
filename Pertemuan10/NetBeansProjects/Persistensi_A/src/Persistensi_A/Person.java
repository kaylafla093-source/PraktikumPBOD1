/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistensi_A;

/**
 *
 * @author Kayla Febrina Laura Ayu 24060124120004
 */

/*
 * File : Person.java
 * Deskripsi : Person database model
*/

public class Person{
    private int id;
    private String name;

    public Person(String n){
        name = n;
    }

    public Person(int i,String n){
        id = i;
        name = n;
    }

    public int getId(){
        return id;
    }

    public String getName (){
        return name;
    }
}