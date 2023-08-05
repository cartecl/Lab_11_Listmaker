import java.util.Scanner;
import java.util.ArrayList;
public class ListMaker {
    static ArrayList<String> list = new ArrayList<>();
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        final String menu = "A - Add D - Delete P - Print Q - Quit";
        boolean done = false;
        String cmd = "";
        String item = "";
        do
        {
            //display list
            displayLIst();
            //display menu options

            //get menu choice
            cmd = SafeInput.getRegExString(console, menu, " [AaDdPpQq] ");

            //execute choice
            switch(cmd)
            {
                case "A":
                    break;
                    item = SafeInput.getNonZeroLenString(console, "Enter your item: ");
                    list.add(item);
                    //prompt user for list item
                    //add to list


                case "D":
                    item = SafeInput.getNonZeroLenString(console, "Enter item you want to remove: "); //prompt user for number of item to delete
                    //translate to index by subtracting 1
                    //remove the item from the list
                    list.remove(item);
                    break;

                case "P":
                    break;

                case "Q":
                    System.exit(0);
                    break;

            }
            System.out.println("cmd is " + cmd);

        }
        while(!done);

    }
    private static void displayLIst()
    {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        if(list.size() != 0)
        {
            for(int i = 0; i < list.size(); i++)
            {
                System.out.printf("%3d%35s", i+1, list.get(i) );
            }

        }
        else
            System.out.println("+++            List is empty            ***");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
    }

}
