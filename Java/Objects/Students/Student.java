public class Student{

    String n ="name";
    int g = 0;
    public Student (String name, int grade) {
        this.n=name;
        this.g=grade;
    }

        //getters and setters
        public String getName(){
            return this.n;
        }
        public int getGrade(){
            return this.g;
        }
        public void resetName(String newName){
            this.n = newName;
        }
        public void setGrade(int newGrade){
            this.g = newGrade;
        }



        //toString
        @Override
        public String toString( ){
            String out = " ";
            out+=("name:\t"+this.n);
            out+=("\ngrade:\t"+this.g);
            return out;
        }
        
    }