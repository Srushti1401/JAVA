package ClassesObjects;

class Book {

    int id;
    String title;
    boolean available=true;

    Book(int i,String t){
        id=i;
        title=t;
    }

    void issueBook(){
        if(available){
            available=false;
            System.out.println("Book Issued");
        }
        else
            System.out.println("Not Available");
    }

    void returnBook(){
        available=true;
        System.out.println("Returned");
    }

    public static void main(String[] args){
        Book b=new Book(1,"Java");
        b.issueBook();
        b.returnBook();
    }
}