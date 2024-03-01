package day1;

import java.util.ArrayList;
import java.util.List;

class Source {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || p == null || p.length() == 0)
            return result;

        int[] charCount = new int[26]; // Assuming lowercase English letters
        for (char c : p.toCharArray())
            charCount[c - 'a']++;

        int start = 0, end = 0, count = p.length();

        while (end < s.length()) {
            if (charCount[s.charAt(end) - 'a'] > 0) {
                count--;
                charCount[s.charAt(end) - 'a']--;
                end++;
            } else {
                charCount[s.charAt(start) - 'a']++;
                count++;
                start++;
            }

            if (count == 0)
                result.add(start);
        }

        return result;
    }

    public static void main(String[] args) {
        Source source = new Source();
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> indices = source.findAnagrams(s, p);
        System.out.println("Indices of anagrams: " + indices);
    }
}
