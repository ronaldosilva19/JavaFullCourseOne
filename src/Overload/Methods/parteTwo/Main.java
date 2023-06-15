package Overload.Methods.parteTwo;

import java.util.TreeSet;
import java.util.Set;
public class Main {

    public Set<Character> Gather(String name){
        Set<Character> Hash_String = new TreeSet<>();
        for(int i = 0; i < name.length(); i++){
            char character = name.charAt(i);
            Hash_String.add(character);
        }
        return Hash_String;
    }

    public Set<Integer> Gather(int number){
        Set<Integer> Hash_Int = new TreeSet<>();
        for(int i = 0; i <= number; i++){
            int aux;
            if(i % 2 == 0){
                aux = ((i * i) / 2);
            }else{
                aux = (i * ( -i));
            }
            Hash_Int.add(aux);
        }
        return Hash_Int;
    }
    public static void main(String[] args){
        String name = "RONALDO";

        Main m = new Main();
       Set<Integer> In = m.Gather(10);
       Set<Character> S = m.Gather(name);

        System.out.println(In);
        System.out.println(S);

    }
}
