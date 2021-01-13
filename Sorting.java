package Sort.java;

import java.util.*;  
import java.util.stream.*;  
public class SortListExample1  
{  
public static void main(String[] args)   
{  
   
List<String> slist = Arrays.asList("Tanu", "Kavya", "Diksha", "Honey", "Bunty", "Ankit");  
List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());     
sortedList.forEach(System.out::println);  
}  
}  
