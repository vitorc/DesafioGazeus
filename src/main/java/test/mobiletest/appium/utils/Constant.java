package test.mobiletest.appium.utils;

import java.nio.file.FileSystems;

/**
 * Created by Vitor Cardoso on 24/07/2016.
 */
public class Constant {

    public static String getPathDriver(){

        final String separator = FileSystems.getDefault().getSeparator();

        StringBuilder builder = new StringBuilder();
        builder.append("files");
        builder.append(separator);
        builder.append("appium");
        return builder.toString();
    }
}
