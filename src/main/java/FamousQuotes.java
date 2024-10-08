import java.util.Scanner;

public class FamousQuotes {
    public static void main(String[] args) {
        String[] quotes = {
                "Technology is anything that wasn’t around when you were born",
                "Any sufficiently advanced technology is equivalent to magic",
                "Just because something doesn’t do what you planned it to do doesn’t mean it’s useless.",
                "It has become appallingly obvious that our technology has exceeded our humanity",
                "Technology is a word that describes something that doesn’t work yet.",
                "The human spirit must prevail over technology",
                "The great myth of our times is that technology is communication",
                "We are stuck with technology when what we really want is just stuff that works",
                "Technology made large populations possible; large populations now make technology indispensable",
                "The real danger is not that computers will begin to think like men, but that men will begin to think like computers"
        };
        //prompt the user
        Scanner scanner = new Scanner(System.in);
        boolean loop = true;

        do {


            try {
                System.out.println("Select a number between 1 & 10");
                int num = scanner.nextInt();
                scanner.nextLine();

                System.out.println(quotes[num - 1]);

            } catch (Exception e) {
                System.out.println("Invalid number");
            }
            System.out.println("Want to see another quote? Yes or no?");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("yes")  ){
                loop = true;
            }
            else {
                loop = false;
                System.out.println("bye!");
            }
        }
        while (loop);

    }

    }

