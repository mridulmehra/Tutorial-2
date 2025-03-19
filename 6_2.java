package library.books;

public class Book {
    String title;
    String author;
    String isbn;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

package library.members;

import java.util.ArrayList;
import java.util.List;
import library.books.Book;

public class Member {
    String name;
    String memberId;
    List<Book> borrowedBooks;
    
    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }
    
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }
    
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }
}

package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public void borrowBook(Book book, Member member) {
        member.borrowBook(book);
        System.out.println(member.name + " borrowed " + book.title);
    }
    
    public void returnBook(Book book, Member member) {
        member.returnBook(book);
        System.out.println(member.name + " returned " + book.title);
    }
}

import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", "123456789");
        Member member1 = new Member("Alice", "M001");
        Transaction transaction = new Transaction();
        
        transaction.borrowBook(book1, member1);
        transaction.returnBook(book1, member1);
    }
}
