import java.util.*;

 class MapEx
{
 public static void main(String args[])
  {

	Map<String, String> mv = new HashMap<String, String>();
	  mv.put("111", "Loki");
	  mv.put("113", "Mahi");
	  mv.put("114", "Prithi");
	  mv.put("115", "Jeeva");
	  mv.put("116", "Sanjay");
	  mv.put("117", " ");
	  mv.put("118", "Saba");
	  mv.put("", "Mahi");
	    System.out.println(mv);

	//Collections.sort(mv);
	   //System.out.println(mv); Collections are not useable

	for(Map.Entry m : mv.entrySet())
  {
	    System.out.println(m.getKey()+ " " + m.getValue());
  }
 }
}