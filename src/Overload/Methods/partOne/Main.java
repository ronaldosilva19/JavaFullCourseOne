package Overload.Methods.partOne;

public class Main {

    public int a, b;
    public double c, d;
    public String first = "";
    public String last_name = "";
   public int add(int a, int b){
        this.a = a;
        this.b = b;
        return a + b;
    }

    public double add(double c, double d){
       this.c = c;
       this.d = d;
        return c + d;
    }

    public String FullName(String first, String last_name){
       this.first = first;
       this.last_name = last_name;

       return first + " " + last_name;
    }

    public char[] FullName(char[] name, char[] last_name){
       int n = name.length;
       int m = last_name.length;

       char[] fullname = new char[n + m + 1];

       for(int i = 0; i < m; i++){
           fullname[i] = last_name[i];
       }
       fullname[m] = ' ';
       int index = 0;
       for(int j = m + 1; j < n + m + 1; j++){
           fullname[j] = name[index];
           index++;
       }
       return fullname;
    }
    public static void main(String[] args){
        char[] name = {'R', 'O', 'N', 'A', 'L', 'D', 'O'};
        char[] last = {'S', 'I', 'L', 'V', 'A'};

        char[] fullname;
        String first;
        int sum;
        double sum1;
        Main m = new Main();
        fullname = m.FullName(last, name);
        first = m.FullName("Ronaldo", "Silva");
        sum = m.add(10, 20);
        sum1 = m.add(3.14, 7.89);

        System.out.println(fullname);
        System.out.println(first);
        System.out.println(sum);
        System.out.println(sum1);
    }
}
