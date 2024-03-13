public class SuperHotel {
    static int[] tab=new int[1];

    public void reserve()
    {
        tab[0] = 1;
    }

    public static void main(String[] args) {
        SuperHotel sp = new SuperHotel();
        try
        {
            sp.reserve();
        }
        catch ( NullPointerException ex)
        {
            System.out.println("array 'tab' is not initialized !");
        }

    }
}
