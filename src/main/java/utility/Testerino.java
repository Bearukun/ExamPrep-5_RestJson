package utility;


public class Testerino {
    
    public static void main(String[] args) {
        
        DataGenerator dG = new DataGenerator(); 
        
        System.out.println(dG.getData(100, "fname,lname,street,city"));
        
        
    }
    
}
