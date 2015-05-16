package Examples;

/**
 * Created by JLyc on 5/16/2015.
 */
public class ExempleThis {
    private String vlastnost;

    public ExempleThis(String vlastnost) {
        this.vlastnost = vlastnost;
        // wrong initialization
        vlastnost = vlastnost;
    }

    public static void main(String[] args) {
        new ExempleThis(args[0]);
    }
}
