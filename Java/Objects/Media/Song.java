
public class Song {
     //field variable
     String name, artist;
     double rating, duration;
     public Song(){}
     public Song(String title){
          this.name = title;
     }
     public Song(String title, String artist){
          this.name = title;
          this.artist = artist;
     }
     public Song(String title,String artist,double rate){
          this.name = title;
          this.artist = artist;
          this.rating = rate;
     }
     public Song(String title, String artist, double rate, double time){
          this.name = title;
          this.artist = artist;
          this.rating = rate;
          this.duration = time;
     }
     //getters & setters
     //accessors & mutators
     //will have a getter and setter for each field variable
     public void setRating(double newRating){
          this.rating=newRating;
     }
     public double getRating(){
          return this.rating;
     }
     public void setName(String newName){
          this.name=newName;
     }
     public String getName(){
          return this.name;
     }
     public void setDuration(double newDuration){
          this.duration = newDuration;
     }
     public double getDuration(){
          return this.duration;
     }
     @Override
     public String toString() {
          String out="";
          out += "title: "+this.name;
          out += "\nartist: "+this.artist;
          out += "\nrating: "+this.rating;
          out += "\nduration "+this.duration;
          out+="\n";
          return out;
     }
}