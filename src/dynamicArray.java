public class dynamicArray {
    public static void main(String[] args) {

        DynamicArrays dynamicArrays = new DynamicArrays(5);

        dynamicArrays.add("A");
        dynamicArrays.add("B");
        dynamicArrays.add("C");
        dynamicArrays.add("D");
        dynamicArrays.add("E");
        dynamicArrays.add("F");
        
        dynamicArrays.delete("A");
        dynamicArrays.delete("B");
        dynamicArrays.delete("C");

        //dynamicArrays.insert(0, "X");
        //dynamicArrays.delete("A");
        //System.out.println(dynamicArrays.search("C"));

        System.out.println(dynamicArrays);
        System.out.println("size: " + dynamicArrays.size);
        System.out.println("capacity: " + dynamicArrays.capacity);
        System.out.println("empty: " + dynamicArrays.isEmpty());


    }
}