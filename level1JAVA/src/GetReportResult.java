import java.util.*;
import java.util.stream.Collectors;

public class GetReportResult {
    public static void main(String[] args) {
        String[] idList = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k = 2;
        int[] result = solution(idList, report, k);
        System.out.println(Arrays.toString(result));
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        HashMap<String, List<String>> user = new HashMap<>();
        HashMap<String, Integer> reportedTime = new HashMap<>();
        for(String id : id_list) {
            user.put(id, new ArrayList<>());
            reportedTime.put(id, 0);
        }

        List<String> reportList = Arrays.stream(report).distinct().collect(Collectors.toList());
        for(String r : reportList) {
            String[] target = r.split(" ");
            String reportUser = target[0];
            String reportedUser = target[1];

            user.get(reportUser).add(reportedUser);
            int reportTime = reportedTime.get(reportedUser) + 1;
            reportedTime.put(reportedUser, reportTime);
        }

        for(int i = 0; i < id_list.length; i++) {
            List<String> reportUserList = user.get(id_list[i]);
            int count = 0;
            for(String reportUser : reportUserList) {
                int reportTime = reportedTime.get(reportUser);
                if(reportTime == k) count++;
            }
            answer[i] = count;
        }

        return answer;
    }
}
