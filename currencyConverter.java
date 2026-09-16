import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Currency;
import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Information Chart
        System.out.println("|-----Currency Converter-----|");
        System.out.println("1. US Dollar Code: USD");
        System.out.println("2. Euro Code: EUR");
        System.out.println("3. Japanese Yen Code: JPY");
        System.out.println("4. British Pound Sterling Code: GBP");
        System.out.println("5. Chinese Renminbi (Yuan) Code: CNY");
        System.out.println("6. Swiss Franc Code: CHF");
        System.out.println("7. Australian Dollar Code: AUD");
        System.out.println("8. Canadian Dollar Code: CAD");
        System.out.println("9. Hong Kong Dollar Code: HKD");
        System.out.println("10. Indian Rupee Code: INR");
        System.out.println("|-----****************-----|");

        // User Input
        System.out.print("Select Currency to convert from: ");
        String fromCurrency = scanner.next().toUpperCase();

        System.out.print("Select Currency to convert to: ");
        String toCurrency = scanner.next().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();

        scanner.close();
        
        double finalVal = convertCurrency(fromCurrency, toCurrency, amount);

        if (finalVal != -1) {
            Currency cur = Currency.getInstance(toCurrency);
            System.out.printf("Converted Amount: %s %.2f%n", cur.getSymbol(), finalVal);
        } else {
            System.out.println("Conversion failed due to error.");
        }
    }

    //Conversion Function
    public static double convertCurrency(String base, String target, double val) {
        try {
            String myKey = "ea47c2f05d143f5737838ef6";
            String endpoint = "https://v6.exchangerate-api.com/v6/" + myKey + "/pair/" + base + "/" + target + "/" + val;

            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest apiReq = HttpRequest.newBuilder()
                    .uri(URI.create(endpoint))
                    .GET()
                    .build();

            HttpResponse<String> resp = httpClient.send(apiReq, HttpResponse.BodyHandlers.ofString());

            if (resp.statusCode() == 200) {
                String bodyText = resp.body();
                
                if (bodyText.contains("conversion_result")) {
                    String[] splitData = bodyText.split("\"conversion_result\":");
                    String rawNumber = splitData[1].split("[,}]")[0].trim();
                    return Double.parseDouble(rawNumber);
                } else {
                    System.out.println("Server response issue: " + bodyText);
                }
            } else {
                System.out.println("Bad status code: " + resp.statusCode());
            }
        } catch (Exception err) {
            System.out.println("Something went wrong: " + err.getMessage());
        }
        
        return -1;
    }
}