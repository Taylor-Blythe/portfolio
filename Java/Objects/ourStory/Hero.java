//do not name this the same thing as something built in
public class Hero{

    String name;
    String superpower;
    //no-args Constructors
    //Name of contructor has to match
    public Hero(){

    }
    //Contructor Signature
    public Hero(String newName){
        this.name = newName;
}
    public Hero(String newName, String power){
        this.name = newName;
        this.superpower = power;
    }
    //public Hero(String newName,Srting power){ is a signature}
    // need to 

    public void newPower(String newPower){
        this.superpower = newPower;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        String out ="";
        out+="Name: "+this.name;
        if(this.superpower==null){
            out+="\nsuperpower: "+"no powers... womp womp";
        }
        else{
            out+="\nsuperpower: "+this.superpower;
        }

        out+="\n";


        return out;
    }
}