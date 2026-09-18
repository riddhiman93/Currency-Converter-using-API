import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("|----- Currency Converter -----|");
        System.out.println("1. INR to Dollar");
        System.out.println("2. INR to Euro");
        System.out.println("3. INR to GBP");
        System.out.println("4. Dollar to INR");
        System.out.println("5. Euro to INR");
        System.out.println("6. GBP to INR");
        System.out.println("|------------------------------|");

        System.out.print("Choose an option (1-6): ");
        int choice = scanner.nextInt();

        System.out.print("Enter amount to convert: ");
        double amount = scanner.nextDouble();
        scanner.close();

        double result = -1;
        String targetSymbol = "";

        switch (choice) {
            case 1:
                result = InrToDollar.convert(amount);
                targetSymbol = "$";
                break;
            case 2:
                result = InrToEuro.convert(amount);
                targetSymbol = "€";
                break;
            case 3:
                result = InrToGbp.convert(amount);
                targetSymbol = "£";
                break;
            case 4:
                result = DollarToInr.convert(amount);
                targetSymbol = "₹";
                break;
            case 5:
                result = EuroToInr.convert(amount);
                targetSymbol = "₹";
                break;
            case 6:
                result = GbpToInr.convert(amount);
                targetSymbol = "₹";
                break;
            default:
                System.out.println("Invalid choice!");
                return;
        }

        if (result != -1) {
            System.out.printf("Converted Amount: %s %.2f%n", targetSymbol, result);
        } else {
            System.out.println("Conversion failed due to an error.");
        }
    }
}

class apiClass {
    public static double fetchConversion(String base, String target, double val) {
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
                }
            }
        } catch (Exception err) {
            System.out.println("Something went wrong: " + err.getMessage());
        }
        return -1;
    }
}

class InrToDollar {
    public static double convert(double amount) {
        return apiClass.fetchConversion("INR", "USD", amount);
    }
}

class InrToEuro {
    public static double convert(double amount) {
        return apiClass.fetchConversion("INR", "EUR", amount);
    }
}

class InrToGbp {
    public static double convert(double amount) {
        return apiClass.fetchConversion("INR", "GBP", amount);
    }
}

class DollarToInr {
    public static double convert(double amount) {
        return apiClass.fetchConversion("USD", "INR", amount);
    }
}

class EuroToInr {
    public static double convert(double amount) {
        return apiClass.fetchConversion("EUR", "INR", amount);
    }
}

class GbpToInr {
    public static double convert(double amount) {
        return apiClass.fetchConversion("GBP", "INR", amount);
    }
}
