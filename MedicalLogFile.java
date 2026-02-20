import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MedicalLogFile {
    public static void main(String[] args) {
        File medicalLogFile = new File("medicalLogFile.txt");
        Scanner scanner = null;

        try {
            if (!medicalLogFile.exists()) {
                FileWriter writer = new FileWriter(medicalLogFile);
                writer.write("Patient ID: P001, Name: Dorothy, Allergy: Penicillin\n");
                writer.write("Patient ID: P002, Name: Fizzo, Allergy: Honey\n");
                writer.write("Patient ID: P003, Name: Emmanuella, Allergy: Nuts\n");
                writer.write("Patient ID: P004, Name: Achai, Allergy: Fish\n");
                writer.write("Patient ID: P005, Name: Phoebe, Allergy: Milk\n");
                writer.write("Patient ID: P006, Name: Agado, Allergy: None\n");
                writer.close();
                System.out.println("File created successfully!");
            }
            scanner = new Scanner(medicalLogFile);
            System.out.println("\nReading file content:\n");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: The file was not found.");
        } catch (IOException e) {
            System.out.println("IOException: An error occurred while reading or writing the file.");
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}