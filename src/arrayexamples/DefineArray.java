package arrayexamples;

public class DefineArray {
    public static void main(String[] args) {
        // here we have to take the multiple variables to store the multiple data
        int num1 = 10, num2 = 20, num3 = 30, num4 = 40;

        /* now we can use ARRAY to store the multiple data of the same data type in single variable of ARRAY
        we can write 1) datatype[] arrayname 2) datatype arrayname[];
        we can use advance for loop to iterate each array and print it one by one
         */
        int[] arraynum = {10, 20, 30, 40};

        // printing the particular number of array
        System.out.println("index 2 value = " + arraynum[2]);

        // using advance for loop to print array
        for(int value : arraynum) {
            System.out.println("Advance for loop Array value is = " + value);
        }
        System.out.println();

        // using the normal for loop
        for(int i=0; i<arraynum.length; i++){
            System.out.println("Normal for loop array = " + arraynum[i]);
        }

        // define array using new keyword
        int[] arraynum1 = new int[4];
        arraynum1[0]= 50;
        arraynum1[1]= 60;
        arraynum1[2]= 70;
        arraynum1[3]= 80;
        System.out.println("arraynum1 values = " + arraynum1[1]);

        // reverse the array
        for(int i=arraynum1.length-1; i>= 0; i--){
            System.out.print(arraynum1[i] + " ");
            arraynum1[2]= 100;  // changing the value here
        }

        int[] arraynum2 = {90, 100, 110, 120};
        // using while loop
        int i=0;
        while(i < arraynum2.length){
            System.out.println("using while loop = " + arraynum2[i]);
            i++;
        }

        // using the do while loop
        System.out.println("using do while loop");
        int j=0;
        do{
            if(j < arraynum2.length){
                System.out.println("using do while loop = " + arraynum2[j]);
            }
            j++;
        } while(j < arraynum2.length);

    }
}
