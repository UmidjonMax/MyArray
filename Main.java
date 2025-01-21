public class Main {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();

        myArray.add(1); // 0
        myArray.add(4); // 1
        myArray.add(5); // 2
        myArray.add(6); // 2
        myArray.add(66); // 2
        System.out.println(myArray);


        myArray.add(1,14);
         // 2
      //  [1,4,5,8,null]

       // 8
        System.out.println(myArray);

    }
}
