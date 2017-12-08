public class Book // sets the class named Book 
{
    private String title; 
    private boolean onLoan=false;
    private String dateAcquired;
    private String author;
    private String isbn;
    
    public Book(String author,String title,String isbn, String dateAcquired){
        this.author=author; 
        this.title=title;
        this.isbn=isbn;
        this.dateAcquired=dateAcquired;
    }
    
    public static void main(String[] args){
        System.out.println(" ");
        Book harryPotter = new Book("JK","Harry Potter", "1234567890", "25/04/2017");
        harryPotter.borrowBook();
        harryPotter.dislayDetails();
    }
    
    public void dislayDetails (){
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Isbn:" + isbn);
        System.out.println("Date acquired:" + dateAcquired);
        
        if(onLoan)System.out.println("Book is on loan") ;
        
    }
    
    public void borrowBook(){onLoan=true;}
    
    public void returnBook(){onLoan=false;}
    
    
}
// class = templates used to create objects such as in this case is caled book
// object = instens of the class / contans data and/or code 


