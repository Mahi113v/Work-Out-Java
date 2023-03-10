import java.util.*;

 class LinkedHashMapEx // Combare with Key in Map
{
 public static void main(String args[])
  {

	LinkedHashMap<Integer, String> mv = new LinkedHashMap<Integer, String>();
	  mv.put(111, "Loki");
	  mv.put(112, "Priya");
	  mv.put(113, "Mahi");
	  mv.put(null, "Mahesh");
	  mv.put(114, "Prithi");
	  mv.put(115, "Jeeva");
	  mv.put(116, "Sanjay");
	  mv.put(117, "Sam");
	  mv.put(118, "");
	  mv.put(119, "Saba");
	  mv.put(null, "Sarun");
	  mv.put(120, "");
	  mv.put(null, "Santhosh");
		System.out.println(mv);

	mv.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
	//for(Map.Entry m : mv.entrySet()){
	        //System.out.println(m.getKey()+ " " + m.getValue());
  //}
 }
}