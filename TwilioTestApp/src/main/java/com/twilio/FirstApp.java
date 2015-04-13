/*
 *  Copyright (c) 2013-2014 Rajan Arora
 *  All Rights Reserved Worldwide.
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.twilio;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * @author Rajan Arora
 * @since Nov 7, 2014
 */
public class FirstApp {

    private static String twilioTextUrl = "https://api.twilio.com/2010-04-01/Accounts/ACdcffb78ce2e388163bad6fde4b468e52/SMS/Messages.json -u ACdcffb78ce2e388163bad6fde4b468e52:b66a3bbfa4aa5f395c1fd84dfff3ca3e";
    private static String twilioJsonBody = "This%20is%20from%20Twilio%20via%20CODE..%20wohoo!";
    private static String moreJsonBody = "--data-urlencode \"From=+14157797725\"     --data-urlencode \"To=+13314727672\"";

    private static void sendAText() throws UnsupportedEncodingException {
        HttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost httpPost = new HttpPost(twilioTextUrl);
        HttpEntity entity = new StringEntity(twilioJsonBody);
        httpPost.setEntity(entity);
        HttpResponse response = null;
        try {
            response = httpClient.execute(httpPost);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        HttpEntity httpEntity = response.getEntity();
        String responseBody = "";
        try {
            responseBody = EntityUtils.toString(httpEntity);
            System.out.println(responseBody);
            JSONObject jsonResponse = new JSONObject(responseBody);
            System.out.println(jsonResponse.get("body"));
        } catch (ParseException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JSONException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        sendAText();
    }
}
