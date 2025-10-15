package codingtest.lv1;

import java.util.*;

public class report_optimized {
    public int[] solution(String[] id_list, String[] report, int k) {
        int n = id_list.length;
        
        Map<String, Integer> nameToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            nameToIndex.put(id_list[i], i);
        }
        
        Map<String, Set<String>> reportedBy = new HashMap<>();
        
        for (String r : report) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            reportedBy.computeIfAbsent(reported, k1 -> new HashSet<>()).add(reporter);
        }
        
        Set<String> suspendedUsers = new HashSet<>();
        for (Map.Entry<String, Set<String>> entry : reportedBy.entrySet()) {
            if (entry.getValue().size() >= k) {
                suspendedUsers.add(entry.getKey());
            }
        }
        
        int[] result = new int[n];
        for (String suspended : suspendedUsers) {
            Set<String> reporters = reportedBy.get(suspended);
            for (String reporter : reporters) {
                int reporterIndex = nameToIndex.get(reporter);
                result[reporterIndex]++;
            }
        }
        
        return result;
    }
    
    public int[] solutionV2(String[] id_list, String[] report, int k) {
        Map<String, Integer> nameToIndex = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            nameToIndex.put(id_list[i], i);
        }
        
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        
        Map<String, Integer> reportCount = new HashMap<>();
        Map<String, List<String>> reportMap = new HashMap<>();
        
        for (String r : reportSet) {
            String[] parts = r.split(" ");
            String reporter = parts[0];
            String reported = parts[1];
            
            reportCount.put(reported, reportCount.getOrDefault(reported, 0) + 1);
            reportMap.computeIfAbsent(reporter, k1 -> new ArrayList<>()).add(reported);
        }
        
        int[] result = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            if (reportMap.containsKey(user)) {
                for (String reported : reportMap.get(user)) {
                    if (reportCount.get(reported) >= k) {
                        result[i]++;
                    }
                }
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        report_optimized solution = new report_optimized();
        
        String[] id_list1 = {"muzi", "frodo", "apeach", "neo"};
        String[] report1 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k1 = 2;
        
        System.out.println("=== Test Case 1 ===");
        System.out.println("Original solution: " + Arrays.toString(solution.solution(id_list1, report1, k1)));
        System.out.println("Optimized V2: " + Arrays.toString(solution.solutionV2(id_list1, report1, k1)));
        
        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k2 = 3;
        
        System.out.println("\n=== Test Case 2 ===");
        System.out.println("Original solution: " + Arrays.toString(solution.solution(id_list2, report2, k2)));
        System.out.println("Optimized V2: " + Arrays.toString(solution.solutionV2(id_list2, report2, k2)));
        
        performanceTest(solution);
    }
    
    public static void performanceTest(report_optimized solution) {
        System.out.println("\n=== Performance Test ===");
        
        int userCount = 1000;
        String[] id_list = new String[userCount];
        for (int i = 0; i < userCount; i++) {
            id_list[i] = "user" + i;
        }
        
        List<String> reportList = new ArrayList<>();
        for (int i = 0; i < userCount; i++) {
            for (int j = 0; j < 10; j++) {
                reportList.add("user" + i + " user" + ((i + j + 1) % userCount));
                reportList.add("user" + i + " user" + ((i + j + 1) % userCount));
            }
        }
        String[] report = reportList.toArray(new String[0]);
        int k = 5;
        
        long startTime = System.currentTimeMillis();
        int[] result1 = solution.solution(id_list, report, k);
        long endTime = System.currentTimeMillis();
        System.out.println("Original solution execution time: " + (endTime - startTime) + "ms");
        
        startTime = System.currentTimeMillis();
        int[] result2 = solution.solutionV2(id_list, report, k);
        endTime = System.currentTimeMillis();
        System.out.println("Optimized V2 execution time: " + (endTime - startTime) + "ms");
        
        System.out.println("Results match: " + Arrays.equals(result1, result2));
    }
}