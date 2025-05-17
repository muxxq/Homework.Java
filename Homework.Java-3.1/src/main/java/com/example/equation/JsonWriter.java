
package com.example.equation;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonWriter {
    public static void writeResultToJson(EquationResult result, String filePath) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
