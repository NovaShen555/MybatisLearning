package top.novashen.utils;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class IdUtils {
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }

}
