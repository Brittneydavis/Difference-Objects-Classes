//This is the start of the class where we are going to build the blueprint for our new housing project.
public class House{

    //Attributes we are defining to make up our blueprint
    private String paintColor;
    private String shingleColor;

    //Using a constructor to build our house
    public House(String paintColor, String shingleColor){
        this.paintColor = paintColor;
        this.shingleColor = shingleColor;
    }


//This is going to display the details of our house
    public void displayDetails(){
    System.out.println("Here is the blueprint for our new house: Paint Color- " + paintColor + ", Shingles Color- " + shingleColor + ".");
    }
}

//Here is where objects are used to customized our new house
class newNeighborhood {
   public static void main(String[] args) {
       System.out.println("Let's make some plans for our new neighborhood!\n");

       //Details created for house 1
       House houseOne = new House("Pink", "Gray");
       System.out.println("House 1: ");
       houseOne.displayDetails();

      System.out.println();

       //Details created for house 2
       House houseTwo = new House("Blue", "Red");
       System.out.println("House 2: ");
       houseTwo.displayDetails();

   }
}