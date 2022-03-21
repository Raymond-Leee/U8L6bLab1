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
                int numRows = sc.nextInt();
                System.out.print("Enter column number: ");
                int numColumns = sc.nextInt();
                System.out.print("Enter row shift: ");
                int shiftRow = sc.nextInt();
                System.out.print("Enter column shift: ");
                int shiftCol = sc.nextInt();
                Encryptor secretMessage = new Encryptor(numRows, numColumns, shiftRow, shiftCol);
                System.out.print("Enter message that will be encrypted: ");
                sc.nextLine();
                String userMessage = sc.nextLine();
                System.out.println("Encrypted message: " + secretMessage.encryptMessage(userMessage));
            }
            else if (userChoice.equals("D") || userChoice.equals("d"))
            {
                System.out.print("Enter row number: ");
                int numRows = sc.nextInt();
                System.out.print("Enter column number: ");
                int numColumns = sc.nextInt();
                System.out.print("Enter row shift: ");
                int rowShift = sc.nextInt();
                System.out.print("Enter column shift: ");
                int colShift = sc.nextInt();
                Encryptor secretMessage = new Encryptor(numRows, numColumns, rowShift, colShift);
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
}

