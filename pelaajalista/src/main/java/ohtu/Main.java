/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohtu;

import com.google.gson.Gson;
import java.io.IOException;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

import org.apache.http.client.fluent.Request;

/**

 *
 * @author mluukkai
 */
public class Main {

    public static void main(String[] args) throws IOException {
        String url = "https://nhlstatisticsforohtu.herokuapp.com/players";
        
        String bodyText = Request.Get(url).execute().returnContent().asString();
                
        Gson mapper = new Gson();
        Player[] players = mapper.fromJson(bodyText, Player[].class);
        Arrays.sort(players);
        System.out.println("Player from FIN " + Date.from(Instant.now()));
        for (Player player : players) {
            if(player.getNationality().equals("FIN")) {
                System.out.println(player);
            }
        }   
    }
}
