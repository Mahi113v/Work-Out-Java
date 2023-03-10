import java.util.*;

 class MapEx1 // Combare with Key in Map
{
 public static void main(String args[])
  {

	Map<String, String> mv = new HashMap<String, String>();
	  mv.put("111", "Loki");
	  mv.put("112", "Priya");
	  mv.put("113", "Mahi");
	  mv.put("113", "Mahesh");
	  mv.put("114", "Prithi");
	  mv.put("115", "Jeeva");
	  mv.put("116", "Sanjay");
	  mv.put("117", "Mahi");
	  mv.put("117", "Mahi");

	mv.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
 }
}