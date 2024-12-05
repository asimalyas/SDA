/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mvcpattern.Model;

/**
 *
 * @author WALEED TRADERS
 */
public class Book
{
 private String title;
 private String auter;
 private double rating;

    public void setRating(double rating)
    {
        this.rating = rating;
    }

    public double getRating()
    {
        return rating;
    }
    public Book(String title, String auter)
    {
        this.title = title;
        this.auter = auter;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuter()
    {
        return auter;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setAuter(String auter)
    {
        this.auter = auter;
    }
 
 
}


