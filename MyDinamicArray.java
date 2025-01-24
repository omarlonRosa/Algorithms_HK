/**
 * MyDinamicArray
 */
public class MyDinamicArray {
  public static void main(String[] args) {
    
    /*
     * Advantages:
     * 1. Random access of elements O(1)
     * 2. Good locality of reference and data cache utilizations
     * 3. Easy to insert/delete at the end
     *
     *
     * Disadvantages:
     * 1. Wastes more memory 
     * 2. Shifting elements is time consuming O(n)
     * 3. Expanding/Srinking the array is time consuming O(n)
     * */
    DynamicArray dynamicArray = new DynamicArray(5);

    dynamicArray.add("A");
    dynamicArray.add("B");
    dynamicArray.add("C");
    dynamicArray.add("D");
    dynamicArray.add("E");
    dynamicArray.add("F");

    /*
    
    dynamicArray.insert(0, "X");
    dynamicArray.delete("A");
    System.out.println(dynamicArray.search("C"));
    
    */

    System.out.println(dynamicArray);
    System.out.println("Size: " + dynamicArray.size);
    System.out.println("Capacity: " + dynamicArray.capacity);
    System.out.println("Empty: " + dynamicArray.isEmpty());

  }
 
  
}
