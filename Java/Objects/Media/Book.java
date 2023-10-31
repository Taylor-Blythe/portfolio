public class Book {
    String name,author;
    public Book(){};
    public Book(String title){
         this.name = title;
         
    }
    public Book(String title, String author){
         this.name = title;
         this.author = author;
    }
    @Override
    public String toString() {
         String out="";
         out+="title: "+this.name;
         out+="author: "+this.author;
         // TODO Auto-generated method stub
         return out;
    }
}