package com.mycompany;

import io.github.cdimascio.dotenv.Dotenv;

public class config {
   public static Dotenv dotenv = Dotenv.load();
   public static String db_url = dotenv.get("URL_DB");
   public static String db_username = dotenv.get("USERNAME_DB");
   public static String db_pass = dotenv.get("PASS_DB");
}
