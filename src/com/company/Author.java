package com.company;

public class Author
{
    private  String name;
    private String email;
    private char gender;

    Author(String n, String e, char g)
    {
        this.name = n;
        this.email = e;
        this.gender = g;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getName()
    {
        return name;
    }
    public String getEmail()
    {
        return email;
    }
    public char getGender()
    {
        return gender;
    }

    public String toString()
    {
        String str = this.name + " (" + this.gender + ") at " + this.email;
        return str;
    }
}
