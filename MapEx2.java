import java.util.*;

 class MapEx2 // Combare with Key in Map
{
 public static void main(String args[])
  {

	Map<String, String> mv = new HashMap<String, String>();
	  mv.put("111", "Loki");
	  mv.put("112", "Priya");
	  mv.put("113", "Mahi");
	  mv.put("114", "Prithi");
	  mv.put("115", "Jeeva");
	  mv.put("116", "Sanjay");
	  mv.put("117", "Prithi");
	  mv.put("118", "Mahesh");
	  mv.put("119", "Saba");
		System.out.println(mv);

	mv.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
 }
}