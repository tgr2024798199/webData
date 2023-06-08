package dao;

import dto.Book;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.DruidUtils;

import java.sql.SQLException;
import java.util.List;

/**
 * 描述：
 * 作者：小陶不慌张
 * 文件：BookDAO
 * 日期：2023/6/7 22:10
 */

public class BookDAO {
    //添加图书信息
    public int insertBook(Book book){
        int i = 0;
        try{
            String sql = "INSERT INTO book(book_id, book_name, book_author, book_price, book_stock, book_type, book_publisher, book_desc) values(?,?,?,?,?,?,?,?)";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            Object[] params = {book.getBookId(), book.getBookName(), book.getBookAuthor(), book.getBookPrice(),book.getBookStock(),book.getBookType(),book.getBookPublisher(),book.getBookDesc()};
            i = queryRunner.update(sql, params);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return i;
    }
    //查询所有图书信息
    public List<Book> selectBook(){
        List<Book> bookList = null;
        try{
            String sql = "select book_id bookId,book_name bookName,book_author bookAuthor,book_price bookPrice,book_stock bookStock,book_type bookType,book_publisher bookPublisher,book_desc bookDesc from book ";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            bookList = queryRunner.query(sql,new BeanListHandler<Book>(Book.class));
        }catch(SQLException e){
            e.printStackTrace();
        }
        return bookList;
    }
    //根据图书ID删除一个图书信息
    public int deleteBook(String bookId){
        int i = 0;
        try{
            String sql = "delete from book where book_id=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            i = queryRunner.update(sql,bookId);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return i;
    }
    //根据图书ID查询一个图书信息
    public Book selectBookByBookId(String bookId){
        Book book = null;
        try{
            String sql = "select book_id bookId,book_name bookName,book_author bookAuthor,book_price bookPrice,book_stock bookStock,book_type bookType,book_publisher bookPublisher,book_desc bookDesc from book where book_id=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            book = queryRunner.query(sql, new BeanHandler<Book>(Book.class),bookId);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return book;
    }
    //根据图书ID修改一个图书信息
    public int updateBook(Book book){
        int i = 0;
        try{
            String sql = "update book set book_name=?,book_author=?,book_price=?, book_stock=?, book_type=?, book_publisher=?, book_desc=? where book_id=?";
            QueryRunner queryRunner = new QueryRunner(DruidUtils.getDataSource());
            Object[] params = {book.getBookName(), book.getBookAuthor(), book.getBookPrice(),book.getBookStock(),book.getBookType(),book.getBookPublisher(),book.getBookDesc()};
            i = queryRunner.update(sql,params);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return i;
    }
}
