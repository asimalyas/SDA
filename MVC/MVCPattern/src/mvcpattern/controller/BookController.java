/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcpattern.controller;

import mvcpattern.Model.Book;
import mvcpattern.presentation.BookDetails;

/**
 *
 * @author WALEED TRADERS
 */
public class BookController
{
     private Book book;
    private BookDetails bookDetails;

    public BookController(Book book, BookDetails bookDetails)
    {
        this.book = book;
        this.bookDetails = bookDetails;
    }
    public void setBookTitle(String tit)
    {
        this.book.setTitle(tit);
    }
    
    public void setBookAut(String aut)
    {
        this.book.setAuter(aut);
    }
    
    
    public String getBookTitle()
    {
        return book.getTitle();
    }
    
    public String getBookAuther()
    {
        return book.getAuter();
    }
    public void detailsOfBook()
    {
        bookDetails.PrintBookDetails(book.getTitle(),book.getAuter(),book.getRating());
    }
    
    public void setBookRating(double rating) {
        if (rating >= 0 && rating <= 5) { // Validate rating range.
            book.setRating(rating);
        } else {
            System.out.println("Invalid rating. Please enter a value between 0 and 5.");
        }
    }
     public double getBookRating() {
        return book.getRating();
    }
}
