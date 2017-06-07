package utility;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DataGenerator {

    private List<String> fName = new ArrayList();
    private List<String> lName = new ArrayList();
    private List<String> street = new ArrayList();
    private List<String> city = new ArrayList();

    public DataGenerator() {

        populateLists();

    }

    private void populateLists() {

        fName.add("Christian");
        fName.add("Bjørn");
        fName.add("Hannibal");
        fName.add("Martin");
        fName.add("Menja");
        fName.add("Niki");
        fName.add("Scarlet");
        fName.add("Chuck");
        fName.add("Anna");
        fName.add("Nathan");
        fName.add("Donald");
        fName.add("Mickey");
        fName.add("Daisy");
        fName.add("Rikke");
        fName.add("Bruce");
        fName.add("Elena");
        fName.add("Lara");
        fName.add("Evie");
        fName.add("Jessica");
        fName.add("Bill");
        fName.add("Steve");
        fName.add("Alan");
        fName.add("Linus");
        fName.add("Indiana");
        fName.add("Kimberly");
        fName.add("Peach");
        fName.add("Arnold");
        fName.add("Aki");
        fName.add("Marcus");
        fName.add("Victor");
        fName.add("Sofie");
        fName.add("Cecilie");
        fName.add("Shigeru");
        fName.add("Phil");
        fName.add("Hironobu");
        fName.add("Albert");

        lName.add("Drake");
        lName.add("Wake");
        lName.add("Wayne");
        lName.add("Croft");
        lName.add("Olsen");
        lName.add("Gates");
        lName.add("Jobs");
        lName.add("Hansen");
        lName.add("Kristiansen");
        lName.add("Skriver");
        lName.add("Malcom");
        lName.add("Petersen");
        lName.add("Knoop");
        lName.add("Kjær");
        lName.add("Johansen");
        lName.add("Bale");
        lName.add("Jørgensen");
        lName.add("Duck");
        lName.add("Mouse");
        lName.add("Jones");
        lName.add("Boss");
        lName.add("Forsberg");
        lName.add("Vettergren");
        lName.add("Akara");
        lName.add("Engelbrekt");
        lName.add("Miyamoto");
        lName.add("Spencer");
        lName.add("Sakaguchi");
        lName.add("Wesker");
        lName.add("Schwarzenegger");

        street.add("Kongevejen " + randInt(1, 200));
        street.add("Knud den storesvej " + randInt(1, 200));
        street.add("Nordrefrihanvs gade " + randInt(1, 200));
        street.add("Jernbanegade " + randInt(1, 200));
        street.add("Hermosavej " + randInt(1, 200));
        street.add("Firskovsvej " + randInt(1, 200));
        street.add("Bellisvej " + randInt(1, 200));
        street.add("Anemonevej " + randInt(1, 200));
        street.add("Eriksvej " + randInt(1, 200));
        street.add("Algade " + randInt(1, 200));
        street.add("Lærkevej " + randInt(1, 200));
        street.add("Ludovej " + randInt(1, 200));
        street.add("Hovedgaden " + randInt(1, 200));
        street.add("Kompostvej " + randInt(1, 200));
        street.add("Ved kirkebjerg " + randInt(1, 200));
        street.add("Pandekagevej " + randInt(1, 200));
        street.add("Nyhavn " + randInt(1, 200));
        street.add("Papirhaven " + randInt(1, 200));
        street.add("Odinsvej " + randInt(1, 200));
        street.add("Thorsvej " + randInt(1, 200));
        street.add("Frejasvej " + randInt(1, 200));
        street.add("Lokesvej " + randInt(1, 200));
        street.add("Kong Christiansvej " + randInt(1, 200));
        street.add("Brombærvej " + randInt(1, 200));
        street.add("Hindbærvej " + randInt(1, 200));
        street.add("Solbærvej " + randInt(1, 200));
        street.add("Melonvej " + randInt(1, 200));
        street.add("Kedsomhedsvej " + randInt(1, 200));

        city.add("Lyngby");
        city.add("København");

    }

    public String getData(int amountOfPeople, String properties) {

        JsonArray persons = new JsonArray();

        for (int i = 0; i < amountOfPeople; i++) {
            
            JsonObject person = new JsonObject();
            
            if(properties.contains("fname")){
                
                person.addProperty("fName", fName.get(randInt(0, fName.size() - 1)));
                
            }
            if(properties.contains("lname")){
                
                person.addProperty("lName", lName.get(randInt(0, lName.size() - 1)));
                
            }
            if(properties.contains("street")){
                
                person.addProperty("street", street.get(randInt(0, street.size() - 1)));
                
            }
            if(properties.contains("city")){
                
                person.addProperty("city", city.get(randInt(0, city.size() - 1)));
                
            }
            
            persons.add(person);

        }

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        return gson.toJson(persons);
        
    }

    /**
     * Returns a random number between min and max, inclusive. The difference
     * between min and max can be at most <code>Integer.MAX_VALUE - 1</code>.
     *
     * @param min Minimum value
     * @param max Maximum value. Must be greater than min.
     * @return Integer between min and max, inclusive.
     * @see java.util.Random#nextInt(int)
     */
    public static int randInt(int min, int max) {

        // Usually this can be a field rather than a method variable
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;

    }

}
