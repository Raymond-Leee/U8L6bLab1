import java.util.Scanner;

public class ChallengeTester
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean userQuit = false;
        while (!userQuit)
        {
            System.out.println("Choices:");
            System.out.println("(E)ncrypt Message");
            System.out.println("(D)ecrypt Message");
            System.out.println("(Q)uit");
            System.out.print("User Choice: ");
            String choice = sc.next();
            if (choice.equals("E") || choice.equals("e"))
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
                String message = sc.nextLine();
                System.out.println("Encrypted message: " + secretMessage.encryptMessage(message));
            }
            else if (choice.equals("D") || choice.equals("d"))
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
                String message = sc.nextLine();
                System.out.println("Decrypted message: " + secretMessage.decryptMessage(message));
            }
            else if (choice.equals("Q") || choice.equals("q"))
            {
                userQuit = true;
            }
            else
            {
                System.out.println("Please enter an aforementioned choice.");
            }
        }
    }
}

