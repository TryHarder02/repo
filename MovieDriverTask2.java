import java.util.Scanner;

public class MovieDriverTask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while (answer.equalsIgnoreCase("yes")) {

            Movie movie = new Movie();

            System.out.println("Enter the title of a movie");
            String title = input.nextLine();
            movie.setTitle(title);

            System.out.println("Enter the movie's rating");
            String rating = input.nextLine();
            movie.setRating(rating);

            System.out.println("Enter the number of tickets sold at an unnamed theater");
            int soldTickets = input.nextInt();
            movie.setSoldTickets(soldTickets);

            System.out.println(movie.toString());

            input.nextLine(); // clears the Enter key

            System.out.println("Do you want to enter another movie? (yes or no)");
            answer = input.nextLine();
        }

        input.close();
    }
}