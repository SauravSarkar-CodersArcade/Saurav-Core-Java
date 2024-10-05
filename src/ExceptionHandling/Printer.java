package ExceptionHandling;

import java.util.Scanner;

class Printer {
    private String name;
    private int availablePaper;

    public Printer(String printerName, int initialPaper) {
        this.name = printerName;
        this.availablePaper = initialPaper;
    }

    public void printDocument(String textDocument) {
        try {
            int pagesNeeded = (int) Math.ceil(textDocument.length() / 10.0);

            if (pagesNeeded <= availablePaper) {
                System.out.println("Printing document...");
                availablePaper -= pagesNeeded;
                System.out.println("Printing completed. " + availablePaper + " pages remaining.");
            } else {
                throw new Exception("Out of paper exception!");
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public int getAvailablePaper() {
        return availablePaper;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter printer name: ");
        String printerName = scanner.nextLine();

        System.out.print("Enter initial number of papers: ");
        int initialPaper = scanner.nextInt();

        Printer printer = new Printer(printerName, initialPaper);

        scanner.nextLine(); // Consume the newline character left by nextInt()

        System.out.print("Enter the text document: ");
        String textDocument = scanner.nextLine();

        printer.printDocument(textDocument);

        scanner.close();
    }
}

