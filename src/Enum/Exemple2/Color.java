package Enum.Exemple2;

/**
 * @author ronaldosilva
 */
public enum Color {
    RED("#FF0000"),
    GREEN("#00FF00"),
    BLACK("#000000"),
    BLUE("#0000FF"),
    INDIGO("#4B0082"),
    PURPLE("#A020F0"),
    AZURE("#F0FFFF");

    public final String hashcode;

    Color(String hashcode){
        this.hashcode = hashcode;
    }

    public String getHashcode() {
        return hashcode;
    }

    public static void PrintValues(){
        Color[] colors = Color.values();
        for(Color color : colors){
            System.out.println(color + " - " + color.getHashcode());
        }
    }
}
