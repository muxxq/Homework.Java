import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Config {
    private static Config instance = null;
    private String color;
    private int weight;

    private Config() {
        loadConfigFromFile();
    }

    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    private void loadConfigFromFile() {
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("src/resources/config.json")) {
            JSONObject jsonObject = (JSONObject) parser.parse(reader);
            this.color = (String) jsonObject.get("color");
            this.weight = ((Long) jsonObject.get("weight")).intValue();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
}
