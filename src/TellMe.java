import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;

public class TellMe {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Date birthDate = new Date();

        System.out.println("Please enter your first name:");
        String firstName;
        firstName = scanner.nextLine();

        System.out.println("Please enter your grade average:");
        double averageGrade;
        averageGrade = scanner.nextDouble();

        System.out.println("Please enter your date of birth:");
        long birthday; // for some reason recommended by the sources on this topic
        birthday = scanner.nextLong();

        boolean isMarried = false;
        boolean isMale = true;

        String gender = isMale ? "male" : "female";
        String pronoun = isMale ? "he" : "she";
        String married = isMarried ? "married" : "not married";

        System.out.println("This is " + firstName + ", " + /*age +*/ " years of age, and born "
                + birthday + ".");
        System.out.println(firstName + "'s average grade is " + averageGrade + ", "
                + pronoun + " is " + gender + " and "+ married + ".");

    }
}
