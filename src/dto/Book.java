package dto;

/**
 * 描述：
 * 作者：小陶不慌张
 * 文件：Books
 * 日期：2023/6/7 20:18
 */

public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPrice;
    private String bookStock;
    private String bookType;
    private String bookPublisher;
    private String bookDesc;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookStock() {
        return bookStock;
    }

    public void setBookStock(String bookStock) {
        this.bookStock = bookStock;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }
}
