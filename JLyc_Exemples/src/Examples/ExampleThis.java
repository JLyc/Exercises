package Examples;

/**
 * Created by JLyc on 5/16/2015.
 */
public class ExampleThis {
    private String vlastnost;

    public ExampleThis(String vlastnost) {
        this.vlastnost = vlastnost;
        // wrong initialization
        vlastnost = vlastnost;
        // look at error
        String vlastnost = vlastnost;
        // without this example use only not working infinite cycling
        new ExampleThis("mojaVlastnost").vlastnost = vlastnost;
    }

    public static void main(String[] args) {
        new ExampleThis(args[0]);
    }
}
