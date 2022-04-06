package Program1_3;

public class Book {
 private String BookTitle;
 private int BookPrice;
public String getBookTitle() {
	return BookTitle;
}
public void setBookTitle(String bookTitle) {
	BookTitle = bookTitle;
}
public int getBookPrice() {
	return BookPrice;
}
public void setBookPrice(int bookPrice) {
	BookPrice = bookPrice;
}
 public Book(String booktitle,int bookprice) {
	 super();
	 this.BookTitle=booktitle;
	 this.BookPrice=bookprice;
	 
 }
 public void showbook() {
	 System.out.println("The book title is:"+getBookTitle()+"The book price is"+getBookPrice());
 }
 public static void main(String[] args) {
	Book[] b1=new Book[2];
	b1[0]=new Book("java programming",200);
	b1[0].showbook();
	b1[1]=new Book("Let Us C",250);
	b1[1].showbook();
}
 }

