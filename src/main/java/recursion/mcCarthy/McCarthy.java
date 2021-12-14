package recursion.mcCarthy;

public class McCarthy {

    public static int cpt =0;
    public static int mc91(int x) {
        cpt++;
        if(x>100)
            return(x-10);
        else
            return mc91(mc91(x+11));
    }

    /*int x;
        StreamTokenizer st = new StreamTokenizer(new BufferedReader
                (new InputStreamReader(System.in)));

        try{
            System.out.println("Type x number");
            while(st.nextToken() != StreamTokenizer.TT_NUMBER) {
                System.out.println("Type correct x number");
            }
            x=(int) st.nval;
            System.out.println("McCarthy("+x+") = " + mc91(x));
            System.out.println("Function called "+cpt+" times");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
}
