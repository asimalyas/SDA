/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mvcpattern;
import mvcpattern.Model.Book;
import mvcpattern.presentation.BookDetails;
import mvcpattern.controller.BookController;
/**
 *
 * @author WALEED TRADERS
 */
public class MVCPattern
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        
        Book book = new Book("SDA","Sir Mukhtiar");
        BookDetails bookDetails = new BookDetails();
        
        BookController bc = new BookController(book,bookDetails);
       
        bc.detailsOfBook();
        bc.setBookAut("Asim Ilyas");
         bc.setBookRating(8);
        bc.detailsOfBook();
        bc.setBookRating(5);
        bc.detailsOfBook();
    }
    
}
