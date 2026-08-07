package di;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public class e {
    public static WebResourceResponse a(String str) {
        WebResourceResponse webResourceResponse = null;
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(c(str));
                    HashMap map = new HashMap();
                    map.put("Access-Control-Allow-Origin", Marker.ANY_MARKER);
                    WebResourceResponse webResourceResponse2 = new WebResourceResponse(mimeTypeFromExtension, "UTF-8", fileInputStream);
                    try {
                        webResourceResponse2.setResponseHeaders(map);
                        return webResourceResponse2;
                    } catch (Throwable th2) {
                        th = th2;
                        webResourceResponse = webResourceResponse2;
                        g.d(th);
                        return webResourceResponse;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        }
        return webResourceResponse;
    }

    public static void b(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        b(file2.getAbsolutePath());
                    } else {
                        file2.delete();
                    }
                }
            }
            file.delete();
        }
    }

    public static String c(String str) {
        return str.substring(str.lastIndexOf(".") + 1);
    }

    public static JSONObject d(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    bufferedReader.close();
                    String string = sb2.toString();
                    g.f("mspl", "readFileToJSON result=" + string);
                    return new JSONObject(string);
                }
                sb2.append(line);
            }
        } catch (Throwable th2) {
            g.d(th2);
            return null;
        }
    }
}
