package codingtest.lv1;

import java.util.*;

public class present {
    public static int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        
        Map<String, Integer> nameToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nameToIndex.put(friends[i], i);
        }
        
        int[][] giftRecord = new int[n][n];
        
        int[] given = new int[n];
        int[] received = new int[n];
        
        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            int giver = nameToIndex.get(parts[0]);
            int receiver = nameToIndex.get(parts[1]);
            
            giftRecord[giver][receiver]++;
            given[giver]++;
            received[receiver]++;
        }
        
        int[] giftIndex = new int[n];
        for (int i = 0; i < n; i++) {
            giftIndex[i] = given[i] - received[i];
        }
        
        int[] nextMonthGifts = new int[n];
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int iToJ = giftRecord[i][j];
                int jToI = giftRecord[j][i];
                
                if (iToJ > jToI) {
                    nextMonthGifts[i]++;
                } else if (jToI > iToJ) {
                    nextMonthGifts[j]++;
                } else {
                    if (giftIndex[i] > giftIndex[j]) {
                        nextMonthGifts[i]++;
                    } else if (giftIndex[j] > giftIndex[i]) {
                        nextMonthGifts[j]++;
                    }
                }
            }
        }
        
        int maxGifts = 0;
        for (int gifts_count : nextMonthGifts) {
            maxGifts = Math.max(maxGifts, gifts_count);
        }
        
        return maxGifts;
    }
    
    public static void main(String[] args) {
        // Test case 1
        String[] friends1 = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts1 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println("Test case 1 result: " + solution(friends1, gifts1));
        
        // Test case 2
        String[] friends2 = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts2 = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        System.out.println("Test case 2 result: " + solution(friends2, gifts2));
        
        // Test case 3
        String[] friends3 = {"a", "b", "c"};
        String[] gifts3 = {"a b", "b a", "c a", "a c", "a c", "c a"};
        System.out.println("Test case 3 result: " + solution(friends3, gifts3));
    }
}