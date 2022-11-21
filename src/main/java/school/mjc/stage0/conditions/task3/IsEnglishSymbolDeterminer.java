package school.mjc.stage0.conditions.task3;

public class IsEnglishSymbolDeterminer {
    public void isEnglishSymbol(char symbol) {
        String string = "[a-z][A-Z]";

        if(Character.toString(symbol).matches(string))
            System.out.println("English");
        else
            System.out.println("Non English");
    }
}
