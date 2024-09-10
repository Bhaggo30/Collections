import java.util.HashMap;
import java.util.Map;

public class SongplayList {
        public static void main(String[] args) {
            Map<String, String> map = new HashMap<>();
            map.put("A", "1:1");
            map.put("B", "2:2");
            map.put("C", "3:3");
            int totalSeconds = calculateTotalTime(map);

            int hours = totalSeconds%3600;
            int minutes = (totalSeconds % 3600) / 60;
            int seconds = totalSeconds % 60;

            System.out.println("Total playlist time:-" + minutes + ":" + seconds);
        }

        public static int calculateTotalTime(Map<String, String> playlist) {
            int totalSeconds = 0;

            for (Map.Entry<String, String> entry : playlist.entrySet()) {
                String[] timeParts = entry.getValue().split(":");
                int minutes = Integer.parseInt(timeParts[0]);
                int seconds = Integer.parseInt(timeParts[1]);

                totalSeconds += minutes * 60 + seconds;
            }

            return totalSeconds;
        }
    }



