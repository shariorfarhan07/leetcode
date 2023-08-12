package algo;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Sample {
    public static boolean useRegex(final String input) {
        // Compile regular expression
//        final Pattern pattern = Pattern.compile("fhnb_cardops_imb_\\d\\d\\d\\d\\d\\d\\d\\d.csv", Pattern.CASE_INSENSITIVE);
        final Pattern pattern = Pattern.compile("", Pattern.CASE_INSENSITIVE);
        // Match regex against input
        final Matcher matcher = pattern.matcher(input);        // Use results...
        return matcher.matches();
    }
    public static void main(String[] args){
        System.out.println(useRegex("fhnb_cardops_imb_08092023.csv"));
    }
}