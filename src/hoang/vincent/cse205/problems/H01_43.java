package hoang.vincent.cse205.problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class H01_43 {

    public static void main(String[] args) {
        new H01_43().run();
    }

    private void run() {
        String userFileName = promptUser();

        try {
            String outputFileName = userFileName.split("\\.")[0] + ".txt";
            FileWriter mFileWriter = new FileWriter(outputFileName);

            Scanner mScanner = new Scanner(new File(userFileName));

            int rowCount = 0;

            while (mScanner.hasNextLine()) {
                mFileWriter.write("[" + String.format("%03d", rowCount) + "] " + mScanner.nextLine() + "\n");
                mFileWriter.flush();

                rowCount++;
            }

            mFileWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("File " + userFileName + " not found.");
        } catch (IOException e) {
            System.out.println("Output file not able to be written to directory.");
        }
    }

    private String promptUser() {
        Scanner mScanner = new Scanner(System.in);

        System.out.print("Enter the name of the Java source file: ");

        String userInput = mScanner.nextLine();

        mScanner.close();

        return userInput;
    }

}
