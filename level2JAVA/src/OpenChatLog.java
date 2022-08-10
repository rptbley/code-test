import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class OpenChatLog {
    public String[] solution(String[] record) {
        Map<String, UserInfo> userInfoMap = new HashMap<>();
        List<Map<String, String>> parsedLogList = new ArrayList<>();

        for (String log : record) {
            String[] parsedLog = log.split(" ");

            if(parsedLog[0].equals("Enter")) {
                UserInfo userInfo = new UserInfo(parsedLog[2]);
                userInfoMap.put(parsedLog[1], userInfo);

                Map<String, String> logMap = new HashMap<>();
                logMap.put("uuid", parsedLog[1]);
                logMap.put("cmd", parsedLog[0]);

                parsedLogList.add(logMap);
            } else if(parsedLog[0].equals("Change")) {
                UserInfo userInfo = userInfoMap.get(parsedLog[1]);
                userInfo.setNickName(parsedLog[2]);
            } else {
                Map<String, String> logMap = new HashMap<>();
                logMap.put("uuid", parsedLog[1]);
                logMap.put("cmd", parsedLog[0]);
                parsedLogList.add(logMap);
            }
        }

        String[] answer = new String[parsedLogList.size()];

        for(int i = 0; i < parsedLogList.size(); i++) {
            answer[i] = userInfoMap.get(parsedLogList.get(i).get("uuid")).getKoLog(parsedLogList.get(i).get("cmd"));
        }

        return answer;
    }

    class UserInfo {
        private String nickName;

        public UserInfo(String nickName) {
            this.nickName = nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getKoLog(String cmd) {
            StringBuilder parsedLog = new StringBuilder();

            parsedLog.append(this.nickName).append("님이 ");
            switch (cmd) {
                case "Enter":
                    parsedLog.append("들어왔습니다.");
                    break;
                case "Leave":
                    parsedLog.append("나갔습니다.");
                    break;
                default:
                    break;
            }

            return parsedLog.toString();
        }
    }

    public static void main(String[] args) {
        OpenChatLog openChatLog = new OpenChatLog();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result = openChatLog.solution(record);
        for (String s : result) {
            System.out.println("s = " + s);
        }
    }
}
