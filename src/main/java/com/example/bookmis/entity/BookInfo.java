package com.example.bookmis.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "book_info",schema = "bookmis")
public class BookInfo {
    private String bookId;
    private String bookName;
    private String bookAuthor;
    private Timestamp bookPubdate;
    private BigDecimal bookPrice;

    public BookInfo() {
    }

    @Id
    @Column(name = "book_id", nullable = false, length = 64)
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    @Basic
    @Column(name = "book_name", nullable = false, length = 512)
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Basic
    @Column(name = "book_author", nullable = false, length = 256)
    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Basic
    @Column(name = "book_pubdate", nullable = false)
    public Timestamp getBookPubdate() {
        return bookPubdate;
    }

    public void setBookPubdate(Timestamp bookPubdate) {
        this.bookPubdate = bookPubdate;
    }

    @Basic
    @Column(name = "book_price", nullable = false,length = 16,precision = 2)
    public BigDecimal getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(BigDecimal bookPrice) {
        this.bookPrice = bookPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BookInfo)) return false;

        BookInfo bookInfo = (BookInfo) o;

        if (bookId != null ? !bookId.equals(bookInfo.bookId) : bookInfo.bookId != null) return false;
        if (bookName != null ? !bookName.equals(bookInfo.bookName) : bookInfo.bookName != null) return false;
        if (bookAuthor != null ? !bookAuthor.equals(bookInfo.bookAuthor) : bookInfo.bookAuthor != null) return false;
        if (bookPubdate != null ? !bookPubdate.equals(bookInfo.bookPubdate) : bookInfo.bookPubdate != null)
            return false;
        return bookPrice != null ? bookPrice.equals(bookInfo.bookPrice) : bookInfo.bookPrice == null;
    }

    @Override
    public int hashCode() {
        int result = bookId != null ? bookId.hashCode() : 0;
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (bookAuthor != null ? bookAuthor.hashCode() : 0);
        result = 31 * result + (bookPubdate != null ? bookPubdate.hashCode() : 0);
        result = 31 * result + (bookPrice != null ? bookPrice.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BookInfo{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookPubdate=" + bookPubdate +
                ", bookPrice=" + bookPrice +
                '}';
    }
}
