package com.vladproduction._6_input_and_output.try_with_resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new StringReader("Hello World"));
            StringWriter writer = new StringWriter();) {

            writer.write(reader.readLine());
            System.out.println(writer);

        } catch (IOException ioe) {
            ioe.printStackTrace();

        }
    }
}
