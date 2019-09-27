package utils;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonUtils {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Object jsonToPojo(String jsonString, Class cz) {
        Object obj = null;
        try {
            obj = objectMapper.readValue(jsonString, cz);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public static void PojoToJson(File file, Object obj) {

        try {
            objectMapper.writeValue(file, obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
