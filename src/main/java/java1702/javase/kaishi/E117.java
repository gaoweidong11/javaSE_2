package java1702.javase.kaishi;

import java.util.*;
/**
 * Created by 高伟冬 on 2017/4/15.
 * javaSE_2
 * 8:45
 * 星期六
 */
//找出字符串中出现次数最多的字母和出现的次数
public class E117 {
    public static void main(String[] args) {
        String input = "aaaaaaaaaaabbbcccccccccccrefhdfh";
        Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        int len = input.length();
        for (int i = 0; i < len; i++) {
            set.add(input.charAt(i) + "");
            list.add(input.charAt(i) + "");
        }
        Collections.sort(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : list) {
            stringBuilder.append(string);
        }
        String orderString = stringBuilder.toString();
        int maxTimes = 0;
        String maxStr = "";
        Iterator<String> iterator = set.iterator();
        Map<String, Integer> result = new HashMap<>();
        List<String> resultList = new ArrayList<>();
        while (iterator.hasNext()) {
            String str = iterator.next();
            int start = orderString.indexOf(str);
            int end = orderString.lastIndexOf(str);
            if ((end - start) > maxTimes) {
                maxTimes = end - start + 1;
                maxStr = str;
                result.put(str, maxTimes);
                resultList.add(str);
            } else if ((end - start) == maxTimes) {
                result.put(str, maxTimes);
                resultList.add(str);
            }
        }
        int index = 0;
        for (int i = 0; i < resultList.size(); i++) {
            if (resultList.get(i).equals(maxStr)) {
                index = i;
                break;
            }
        }
        for (int i = index; i < result.size(); i++) {
            System.out.println(resultList.get(i) + " 出现的最多，出现了 "
                    + result.get(resultList.get(i)) + " 次");
        }
    }
}

