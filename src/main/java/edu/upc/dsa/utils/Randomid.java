package edu.upc.dsa.utils;
import net.moznion.random.string.RandomStringGenerator;
public class Randomid {
    public static String getId() {
        RandomStringGenerator generator = new RandomStringGenerator();
        String randomString = generator.generateByRegex("\\w+\\d*[0-9]{0,8}");

        return randomString;
    }
}
