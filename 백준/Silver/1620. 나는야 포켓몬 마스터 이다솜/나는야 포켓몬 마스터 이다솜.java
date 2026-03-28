import java.util.*;
class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<String, Integer> master1 = new HashMap<>();
    HashMap<Integer, String> master2 = new HashMap<>();
    int T = sc.nextInt();
    int getT = sc.nextInt();
    sc.nextLine();
    for(int i=0;i<T;i++) {
        String pokemon = sc.nextLine();
        master1.put(pokemon, i+1);
        master2.put(i+1, pokemon);
    }
    for(int i=0; i<getT;i++) {
        String line = sc.next();
        if (Character.isDigit(line.charAt(0))) { 
            int num = Integer.parseInt(line);
            System.out.println(master2.get(num)); 
        } else {
            System.out.println(master1.get(line)); 
        }
       }
    }
}
