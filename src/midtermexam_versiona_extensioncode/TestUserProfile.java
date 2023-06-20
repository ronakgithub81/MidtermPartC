package midtermexam_versiona_extensioncode;

import java.util.Scanner;

public class TestUserProfile {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        UserProfile userProfile = new UserProfile(" ", " ");

        String[] genres = userProfile.getGenres();

        System.out.println("Pick your favourite genre: ");

        for (int i = 0; i < genres.length; i++) {
            System.out.println((i + 1) + ". " + genres[i]);
        }

        System.out.print(" Enter your userID: ");
        String userID = input.nextLine();

        System.out.print("Enter the number corresponding to your favourite genre: ");
        int genreChoice = input.nextInt();

        if (genreChoice < 1 || genreChoice > genres.length) {
            System.out.println("Invalid genre choice!");
            return;
        }

        String favouriteGenre = genres[genreChoice - 1];
        UserProfile user = new UserProfile(userID, favouriteGenre);

        System.out.println("User profile created!");
        System.out.println("UserID: " + user.getUserID());
        System.out.println("Favourite Genre: " + user.getGenre());
    }
}