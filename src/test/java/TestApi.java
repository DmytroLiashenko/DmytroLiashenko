import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.BeforeClass;
import org.junit.Test;
import rest.Rest;

public class TestApi {
    static JSONArray jsonArray;

    @BeforeClass
    public static void tt() {
        jsonArray = new JSONArray(Rest.getRest("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?json"));
    }


    @Test
    public void testEUR() {
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject object = jsonArray.getJSONObject(i);
            if (object.getString("cc").equals("EUR")) {
                System.out.println(object.getString("cc") + " = " + object.getDouble("rate"));

            }
        }

    }
    @Test
    public void testUSA() {
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject object = jsonArray.getJSONObject(i);
            if (object.getString("cc").equals("USD")) {
                System.out.println(object.getString("cc") + " = " + object.getDouble("rate"));

            }
        }

    }
    @Test
    public void testCAN() {
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject object = jsonArray.getJSONObject(i);
            if (object.getString("cc").equals("CAD")) {
                System.out.println(object.getString("cc") + " = " + object.getDouble("rate"));

            }
        }

    }
}
