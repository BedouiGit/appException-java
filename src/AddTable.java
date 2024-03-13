public class AddTable {

    public static void main(String[] args) {
        int[] array = new int[3];
        try
        {
            for (int i=0;i< 4;i++){
                array[i]= i;
            }
            System.out.println(array);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.err.println("array 'array' pointe sur NULL");
        }

    }
}
