public class Solution {
    public String largestNumber(int[] nums) {
        // 1) Convert to strings
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = String.valueOf(nums[i]);
        }

        // 2) Sort with custom comparator: ab vs ba
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String ab = a + b;
                String ba = b + a;
                // We want descending order
                return ba.compareTo(ab);
            }
        });

        // 3) If the largest is "0", the entire number is 0
        if (s.length > 0 && s[0].equals("0")) {
            return "0";
        }

        // 4) Join all parts
        StringBuilder sb = new StringBuilder();
        for (String part : s) {
            sb.append(part);
        }
        return sb.toString();
    }
}