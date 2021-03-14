package com.epam.test.automation.java.practice13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class Util {

    /**
     * pattern takes latin letters.
     */
    public static final String LATIN = "\\p{Alpha}+";

    /**
     * file's encoding.
     */
    public static final String ENCODING = "utf-8";

    /**
     * Don't let anyone instantiate this class.
     */
    private Util() {
        throw new AssertionError();
    }

    /**
     * Return an information that was read from the file according
     * to this path.
     *
     * @param path path to file.
     * @return information from the file in {@code String} format.
     */
    public static String readFile(final String path) {
        String res = null;
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(path));
            res = new String(bytes, ENCODING);
        } catch (IOException ex) {
            ex.printStackTrace();//NOSONAR
        }
        return res;
    }

}
