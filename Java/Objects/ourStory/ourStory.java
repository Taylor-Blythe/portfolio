public class outStory{
    public static void main(String[] args) {
        //Clas object name = new Constructor(perameters)
        Hero mainCharacter = new Hero("Power Scheller","manipulates the matrix");
        System.out.println(mainCharacter);

        Hero bestFriend = new Hero("Nick Cage","steals declaration of independance");
        System.out.println(bestFriend);

        Hero villain = new Hero("word search","makes people suffer");
        System.out.println(villain);

        Hero civilian1 = new Hero("dave the office worker");
        System.out.println(civilian1);

        Hero underDog = new Hero("Scotty Pippin");
        System.out.println(underDog);
        underDog.newPower("Micheal Jordan");
    }
}