package com.plaid.internal;

import android.net.Network;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* JADX INFO: loaded from: classes6.dex */
public final class J {
    public final C4433h4 a(String urlText, Network network) throws AbstractC4525r7.d, AbstractC4525r7.c {
        p013kotlin.jvm.internal.s.k(urlText, "urlText");
        p013kotlin.jvm.internal.s.k(network, "network");
        try {
            URLConnection uRLConnectionOpenConnection = network.openConnection(new URL(urlText));
            if (uRLConnectionOpenConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setRequestMethod("POST");
            C4433h4 c4433h4 = new C4433h4(httpURLConnection.getResponseCode(), a(httpURLConnection));
            httpURLConnection.disconnect();
            return c4433h4;
        } catch (AbstractC4525r7.d e11) {
            throw e11;
        } catch (Exception e12) {
            throw new AbstractC4525r7.c(e12);
        }
    }

    public static String a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
        String str = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return str;
            }
            str = str + line;
        }
    }
}
