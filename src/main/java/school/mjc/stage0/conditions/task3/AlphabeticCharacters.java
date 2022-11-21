package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        if(!Character.toString(character).matches("[a-z][A-Z]"))
            System.out.println("wrong alphabet!");
        else if(Character.toString(character).matches("[aieouAIEOU]"))
            System.out.println("Vowel");
        else
            System.out.println("Consonant");
    }
}
