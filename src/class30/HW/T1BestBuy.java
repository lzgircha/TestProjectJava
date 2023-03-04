package class30.HW;

import java.util.TreeMap;
public class T1BestBuy {
 //Create a map of Best Buy store. Place item id and item name into it.
    // Example (7664847 = Printer, 7879885= TV etc )
 //Retrieve all keys and values from a Best Buy map using EntrySet.
 public static void main(String[] args) {
  TreeMap<Integer,String>bestBuyStore=new TreeMap<>();
  bestBuyStore.put(3736254,"TV");
  bestBuyStore.put(3382754,"Printer");
  bestBuyStore.put(2038645,"Office Chair");
  bestBuyStore.put(1263544,"Table");
  bestBuyStore.put(7653774,"Lamp");

  var entrySet=bestBuyStore.entrySet();
  for(var entry:entrySet){
   System.out.println(entry.getKey()+" = "+entry.getValue());
  }
 }
}
/* outcome
1263544 = Table
2038645 = Office Chair
3382754 = Printer
3736254 = TV
7653774 = Lamp
 */