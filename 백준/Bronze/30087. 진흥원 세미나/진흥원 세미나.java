import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        Map<String, String> room = new HashMap<>();
        room.put("Algorithm", "204");
        room.put("DataAnalysis", "207");
        room.put("ArtificialIntelligence", "302");
        room.put("CyberSecurity", "B101");
        room.put("Network", "303");
        room.put("Startup", "501");
        room.put("TestStrategy", "105");

        for (int i = 0; i < N; i++) {
            String seminar = sc.nextLine();
            System.out.println(room.get(seminar));
        }
    }
}
