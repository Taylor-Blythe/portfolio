public class Movie {
    String name,author;
    public Book(){};
    public Book(String title){
         this.name = title;
         
    }
    public Book(String title, String creator){
         this.name = title;
         this.creator = creator;
    }
    @Override
    public String toString() {
         String out="";
         out+="title: "+this.name;
         out+="creator: "+this.creator;
         // TODO Auto-generated method stub
         return out;
    }
}