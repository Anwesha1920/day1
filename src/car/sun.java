package car;

@SuppressWarnings("serial")
////import java.util.ArrayList;
////import java.util.List;
////class sun {
////    public List<Integer> findAnagrams(String s, String p) {
////        List<Integer> result = new ArrayList<>();
////        if (s == null || s.length() == 0 || p == null || p.length() == 0)
////            return result;
////
////        int[] charCount = new int[26]; // Assuming lowercase English letters
////        for (char c : p.toCharArray())
////            charCount[c - 'a']++;
////        int start = 0, end = 0, count = p.length();
////        while (end < s.length()) {
////            if (charCount[s.charAt(end) - 'a'] > 0) {
////                count--;
////                charCount[s.charAt(end) - 'a']--;
////                end++;
////            } else {
////                charCount[s.charAt(start) - 'a']++;
////                count++;
////                start++;
////            }
////            if (count == 0)
////                result.add(start);
////        }
////        return result;
////    }
////    public static void main(String[] args) {
////        sun source = new sun();
////        String s = "cbaebabacd";
////        String p = "abc";
////        List<Integer> indices = source.findAnagrams(s, p);
////        System.out.println("Indices of anagrams: " + indices);
////    }
////}
//
//
//
//import java.util.*;
//import java.util.List;
//
//public class sun {
//    public static List<Integer> findAnagrams(String s , String p){
//        List<Integer> res =new ArrayList<>();
//        int len = p.length();
//        char[] c = p.toCharArray();
//        Arrays.sort(c);
//        String sorted_p=new String(c);
//        for(int i=0;i<s.length()-len;i++){
//            String temp = s.substring(i, i+len);
//            char[] t_c=temp.toCharArray();
//            Arrays.sort(t_c);
//            String t_s = new String(t_c);
//            if(t_s.compareTo(sorted_p)==0){
//                res.add(i);
//            }
//
//        }
//        return res;
//    }
//    public static void main(String[] args) {
//     System.out.println(findAnagrams("cbaebabacd","abc"));
//     String p = "asd";   
//     System.out.println(p);
//    }
//}
//


//class BMI
//{
//    public float returnWeight(String str)
//    {
//        String s = str.split("@")[0].replace('-', '.');
//        float weight = Float.parseFloat(s);
//        return weight;
//    }
//    public float returnHeight(String str)
//    {
//        String s = str.split("@")[1].replace('-', '.');
//        float height = Float.parseFloat(s);
//        return height;
//    }
//    public float calculateBMI(float height,float weight)
//    {
//        try
//        {
//            if(height==0 || weight==0)
//            { 
//                throw new Exception();
//            }
//            float b = weight / (height * height);
//            return b;
//        }
//        catch (Exception ex)
//        {
//            return -1f;
//        }
//    }
//    public String checkStatus(float bmi)
//    {
//        if (bmi >= 20.0 && bmi <= 24.0)
//            return "nourished";
//        else
//            return "malnourished";
//    }
//}
//class sun
//{
//    public static void main(String[] args)
//    {
//        BMI bmi = new BMI();
//        float w=bmi.returnWeight("68-45@1-78");
//        float h=bmi.returnHeight("68-45@01-78");
//        float bmival=bmi.calculateBMI(h,w);
//        String status=bmi.checkStatus(bmival);
//        System.out.println(w);
//        System.out.println(h);
//        System.out.println(bmival);
//        System.out.println(status);
//    }
//}

//Above example with Custom Exception
class CustomException extends Exception
{
	public CustomException(String s)
	{
		super(s);
	}

	public CustomException() {
		// TODO Auto-generated constructor stub
	}
}
class BMI
{
  public float returnWeight(String str)
  {
      String s = str.split("@")[0].replace('-', '.');
      float weight = Float.parseFloat(s);
      return weight;
  }
  public float returnHeight(String str)
  {
      String s = str.split("@")[1].replace('-', '.');
      float height = Float.parseFloat(s);
      return height;
  }
  public float calculateBMI(float height,float weight)
  {
      try
      {
          if(height==0 || weight==0)
          { 
              throw new CustomException();
          }
          float b = weight / (height * height);
          return b;
      }
      catch (CustomException ex)
      {
          return -1f;
      }
  }
  public String checkStatus(float bmi)
  {
      if (bmi >= 20.0 && bmi <= 24.0)
          return "nourished";
      else
          return "malnourished";
  }
}
class sun
{
  public static void main(String[] args)
  {
      BMI bmi = new BMI();
      float w=bmi.returnWeight("68-45@1-78");
      float h=bmi.returnHeight("68-45@01-78");
      float bmival=bmi.calculateBMI(h,w);
      String status=bmi.checkStatus(bmival);
      System.out.println(w);
      System.out.println(h);
      System.out.println(bmival);
      System.out.println(status);
  }
}