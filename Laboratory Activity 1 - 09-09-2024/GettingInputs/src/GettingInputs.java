import java.util.Scanner;

class GettingInputs {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        //For year
        System.out.print("Enter the year: ");
        int year = Integer.parseInt(value.nextLine());
        //For genre
        System.out.print("Enter the genre: ");
        String genre = value.nextLine();

        System.out.print("Enter the album: ");
        String album = value.nextLine();

        System.out.print("Enter the song title: ");
        String title = value.nextLine();

        System.out.print("Enter the artist: ");
        String artist = value.nextLine();

        System.out.println("=========================");
        System.out.println("SONG DETAILS");
        System.out.println("=========================");
       
        System.out.println("Year released: " + year);
        System.out.println("Genre: " + genre);
        System.out.println("Album: " + album);
        System.out.println("Title: " + "\"" + title + "\"");
        System.out.println("Artist: " + artist);
    }
}
