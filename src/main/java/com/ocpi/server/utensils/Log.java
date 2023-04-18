package com.ocpi.server.utensils;

public class Log {
    
    final static int WARN = 0xFF0000; // Red
    final static int DONE = 0x008000; // Green
    final static int INFO = 0xFFFF00; // Yellow
    
    public static String done(String str) {
        return paint("[DONE]: ", DONE) + str;
    }
    public static String warn(String str) {
        return paint("[DONE]: ", WARN) + str;
    }
    public static String info(String str) {
        return paint("[DONE]: ", INFO) + str;
    }
    public static String note(String str) {
        return str;
    }
    
    public static String paint(String str, int background) {
        return switch (background) {
            // Hexadecimal colors to ANSI escape code
            case 0xFF0000 -> "\u001B[41m" + str;
            case 0x008000 -> "\u001B[42m" + str;
            case 0xFFFF00 -> "\u001B[43m" + str;
            default -> str;
        };
    }
}
