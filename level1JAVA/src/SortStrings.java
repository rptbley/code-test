import java.util.*;

class SortStrings {
    public String[] solution(String[] strings, int n) {
        TreeMap<String, TreeSet<String>> strMap = new TreeMap<>();
        for(String str : strings) {
            String index = String.valueOf(str.charAt(n));
            TreeSet<String> value = strMap.getOrDefault(index, new TreeSet<>());
            value.add(str);
            strMap.put(index, value);
        }

        List<String> answer = new ArrayList<>();
        for(TreeSet<String> value : strMap.values()) {
            for(String valueStr : value) {
                answer.add(valueStr);
            }
        }
        return answer.toArray(new String[0]);
    }

    public static void main(String[] args) {
        SortStrings sortStrings = new SortStrings();
        String[] strings = new String[]{"sun", "bed", "car"};
        int n = 1;
        String[] result = sortStrings.solution(strings, n);
        System.out.println("result = " + Arrays.toString(result));
    }
}
