package mu;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Map;
import java.util.Scanner;

/* JADX INFO: loaded from: classes5.dex */
public class b {
    public static void a(URI uri, Map<String, String> map) {
        String strDecode;
        Scanner scanner = new Scanner(uri.getRawQuery());
        scanner.useDelimiter("&");
        while (scanner.hasNext()) {
            try {
                String[] strArrSplit = scanner.next().split("=");
                if (strArrSplit.length == 1) {
                    strDecode = null;
                } else {
                    if (strArrSplit.length != 2) {
                        throw new IllegalArgumentException("query parameter invalid");
                    }
                    strDecode = URLDecoder.decode(strArrSplit[1], "UTF-8");
                }
                map.put(URLDecoder.decode(strArrSplit[0], "UTF-8"), strDecode);
            } catch (UnsupportedEncodingException unused) {
                Log.e("URIQueryDecoder", "UTF-8 Not Recognized as a charset.  Device configuration Error.");
                return;
            }
        }
    }
}
