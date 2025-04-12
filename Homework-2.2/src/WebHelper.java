import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WebHelper {
    private static WebHelper instance = null;
    private String content = null;

    private final String URL_STRING = "https://example.com";

    private WebHelper() {
        loadWebContent();
    }

    public static WebHelper getInstance() {
        if (instance == null) {
            instance = new WebHelper();
        }
        return instance;
    }

    private void loadWebContent() {
        StringBuilder result = new StringBuilder();
        try {
            URL url = new URL(URL_STRING);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line).append("\n");
                }
            }

            this.content = result.toString();
        } catch (Exception e) {
            e.printStackTrace();
            this.content = "Eroare la citirea paginii.";
        }
    }

    public String getWebSiteContent() {
        return content;
    }
}
