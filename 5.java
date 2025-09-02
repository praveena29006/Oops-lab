    }

    public void display() {
        System.out.println("Current Text: " + text.toString());
    }
}

// ----------- Main Class -----------
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor(new ArrayStack<>(100));

        while (true) {
            System.out.println("\n--- Text Editor Menu ---");
            System.out.println("1. Type Text");
            System.out.println("2. Delete Text");
            System.out.println("3. Undo");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text to type: ");
                    String text = sc.nextLine();
                    editor.type(text);
                    break;
                case 2:
                    System.out.print("Enter number of characters to delete: ");
                    int count = sc.nextInt();
                    editor.delete(count);
                    break;
                case 3:
                    editor.undo();
                    break;
                case 4:
                    editor.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
