/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcpattern.presentation;

/**
 *
 * @author WALEED TRADERS
 */
public class BookDetails
{
     public void PrintBookDetails(String title,String auther,double rating)
    {
        System.out.println("Book Detail");
        System.out.println("_______________________");
        System.out.println("Book Title : "+title);
        System.out.println("Book Auther : "+auther);
        System.out.println("Rating: " + rating + "/5.0");
        System.out.println("___________________________");
    }
}


