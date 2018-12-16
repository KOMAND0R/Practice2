package com.company;

public class TestAuthor
{
    public static void main(String[] args)
    {
        Author author1 = new Author("Михаил Булгаков", "bulgakov1891@yandex.ru", 'M');
        Author author2 = new Author("Оскар Уайльд", "wilde1854@gmail.com", 'M');

        System.out.println(author1.toString() + "\n");
        System.out.println(author2.toString());
    }
}
