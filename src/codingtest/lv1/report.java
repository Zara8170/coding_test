package codingtest.lv1;

import java.util.*;

public class report {
    public int[] solution(String[] id_list, String[] report, int k) {
        int n = id_list.length;

        Map<String, Integer> nameToIndex = new HashMap<>();
        for(int i = 0; i < n; i++) {
            nameToIndex.put(id_list[i], i);
        }

        int[][] reportRecord = new int[n][n];
        int[] received = new int[n];

        for(String r : report) {
            String[] parts = r.split(" ");

            int giver = nameToIndex.get(parts[0]);
            int receiver = nameToIndex.get(parts[1]);

            if(reportRecord[giver][receiver] > 0) {
                continue;
            }
            reportRecord[giver][receiver]++;
            received[receiver]++;
        }

        int[] receivedMail = new int[n];
        for(int i = 0; i < n; i++) {
            if(received[i] >= k) {
                for(int j = 0; j < n; j++) {
                    if(reportRecord[j][i] > 0) {
                        receivedMail[j]++;
                    }
                }
            }
        }

        return receivedMail;
    }
}
