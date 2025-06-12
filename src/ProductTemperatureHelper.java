import java.util.HashMap;
import java.util.Map;

public class ProductTemperatureHelper {
    private static final Map<String, Double> allowedTemperatures = new HashMap<>() {{
        put("Bananas", 13.3);
        put("Chocolate", 18.0);
        put("Fish", 2.0);
        put("Meat", -15.0);
        put("FrozenPizza", -30.0);
        put("Cheese", 7.2);
        put("Sausages", 5.0);
        put("Butter", 20.5);
        put("Eggs", 19.0);
        put("IceCream", 18.0);
    }};

    public static double getProductAllowedTemperature(String productType) {
        Double temperature = allowedTemperatures.get(productType);
        if (temperature == null) {
            throw new IllegalArgumentException("Unknown product: " + productType);
        }
        return temperature;
    }

    public static boolean isValid(String productTypeToVerify, double currentTemperature)
    {
        var allowedProductTemperature = getProductAllowedTemperature(productTypeToVerify);
        return currentTemperature >= allowedProductTemperature;
    }
}
