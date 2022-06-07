import java.util.HashMap;

class Marathoner {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Boolean> result = new HashMap<>();
        for(String p : participant) {
            if(result.containsKey(p)) {
                result.replace(p, !result.get(p));
            } else {
                result.put(p, false);
            }
        }

        for(String c : completion) {
            result.replace(c, !result.get(c));
        }

        String answer = "";
        for(String p : participant) {
            if(!result.get(p)) {
                answer = p;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Marathoner marathoner = new Marathoner();
        String result = marathoner.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"});
        System.out.println("result = " + result);
    }
}
