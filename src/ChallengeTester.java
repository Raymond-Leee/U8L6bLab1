import java.util.Scanner;

public class ChallengeTester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        while (!exit)
        {
            System.out.println("Choices:");
            System.out.println("(E)ncrypt Message");
            System.out.println("(D)ecrypt Message");
            System.out.println("(Q)uit");
            System.out.print("User Choice: ");
            String userChoice = sc.next();
            if (userChoice.equals("E") || userChoice.equals("e"))
            {
                System.out.print("Enter row number: ");
                String numRow = sc.next();
                if (!(isNum(numRow)))
                {
                    System.out.println("Please enter a number");
                    System.exit(1);
                }
                int numRows = Integer.parseInt(numRow);
                System.out.print("Enter column number: ");
                String numCol = sc.next();
                if (!(isNum(numCol)))
                {
                    System.out.println("Please enter a number");
                    System.exit(1);
                }
                int numCols = Integer.parseInt(numCol);
                System.out.print("Enter row shift: ");
                String shiftR = sc.next();
                if (!(isNum(shiftR)))
                {
                    System.out.println("Please enter a number");
                    System.exit(1);
                }
                int shiftRow = Integer.parseInt(shiftR);
                System.out.print("Enter column shift: ");
                String shiftC = sc.next();
                if (!(isNum(shiftC)))
                {
                    System.out.println("Please enter a number");
                    System.exit(1);
                }
                int shiftCol = Integer.parseInt(shiftC);
                Encryptor secretMessage = new Encryptor(numRows, numCols, shiftRow, shiftCol);
                System.out.print("Enter message that will be encrypted: ");
                sc.nextLine();
                String userMessage = sc.nextLine();
                System.out.println("Encrypted message: " + secretMessage.encryptMessage(userMessage));
            }
            else if (userChoice.equals("D") || userChoice.equals("d"))
            {
                System.out.print("Enter row number: ");
                String numRow = sc.next();
                if (!(isNum(numRow)))
                {
                    System.out.println("Please enter a number");
                    System.exit(1);
                }
                int numRows = Integer.parseInt(numRow);
                System.out.print("Enter column number: ");
                String numCol = sc.next();
                if (!(isNum(numCol)))
                {
                    System.out.println("Please enter a number");
                    System.exit(1);
                }
                int numCols = Integer.parseInt(numCol);
                System.out.print("Enter row shift: ");
                String shiftR = sc.next();
                if (!(isNum(shiftR)))
                {
                    System.out.println("Please enter a number");
                    System.exit(1);
                }
                int shiftRow = Integer.parseInt(shiftR);
                System.out.print("Enter column shift: ");
                String shiftC = sc.next();
                if (!(isNum(shiftC)))
                {
                    System.out.println("Please enter a number");
                    System.exit(1);
                }
                int shiftCol = Integer.parseInt(shiftC);
                Encryptor secretMessage = new Encryptor(numRows, numCols, shiftRow, shiftCol);
                System.out.print("Enter the message that will be decrypted: ");
                sc.nextLine();
                String userMessage = sc.nextLine();
                System.out.println("Decrypted message: " + secretMessage.decryptMessage(userMessage));
            }
            else if (userChoice.equals("Q") || userChoice.equals("q"))
            {
                exit = true;
            }
            else
            {
                System.out.println("Please enter an aforementioned choice.");
            }
        }
    }

    static boolean isNum(String number)
    {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String check = String.valueOf(number);
        for (char i : check.toCharArray())
        {
            if (Character.isDigit(i))
            {
                return true;
            }
        }
        return false;
    }
}
