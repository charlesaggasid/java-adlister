import java.util.ArrayList;

public class BeanTest {

    public static void main(String[] args) {
        Album dayDream = new Album(1, "Mariah Carey", "Daydream", 1995, 20, "R&B, Pop");
        Author ibongAdarna = new Author (1, "Bartolome", "Ibarra");
        Quote dailyQuote = new Quote(1, "The true secret of happiness lies in taking a genuine interest in all the details of daily life.", ibongAdarna);

//        System.out.println(dayDream.getArtist());
//        System.out.println(dailyQuote.getAuthor().getFirstName());


        ArrayList<Quote> quotes = new ArrayList<>();
        quotes.add(dailyQuote);
        quotes.add(new Quote(2, "No man is good enough to be another's master.", new Author(2, "William", "Morris")));
        quotes.add(new Quote(3, "Give me love and work - these two only.", ibongAdarna));

        for (Quote quote : quotes) {
            System.out.println(quote.getAuthor().getFirstName() + ", " + quote.getAuthor().getLastName() + "\n" + "'"+quote.getContent()+"'");
        }

    }

}
