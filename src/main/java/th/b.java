package th;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;
import ch.qos.logback.classic.Level;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import di.g;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CookieManager f113530a = new CookieManager();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f113531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f113532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map<String, String> f113533c;

        public a(String str, Map<String, String> map, byte[] bArr) {
            this.f113531a = str;
            this.f113532b = bArr;
            this.f113533c = map;
        }

        public String toString() {
            return String.format("<UrlConnectionConfigure url=%s headers=%s>", this.f113531a, this.f113533c);
        }
    }

    /* JADX INFO: renamed from: th.b$b, reason: collision with other inner class name */
    public static final class C2420b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<String, List<String>> f113534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f113535b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f113536c;

        public C2420b(Map<String, List<String>> map, String str, byte[] bArr) {
            this.f113534a = map;
            this.f113535b = str;
            this.f113536c = bArr;
        }
    }

    public static String a(Context context) {
        try {
            NetworkInfo networkInfoA = mg.b.a(null, context);
            if (networkInfoA != null && networkInfoA.isAvailable()) {
                return networkInfoA.getType() == 1 ? "wifi" : networkInfoA.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        return "none";
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01b3 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x01b8 A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01bd A[DONT_GENERATE, EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static C2420b b(Context context, a aVar) {
        HttpURLConnection httpURLConnection;
        BufferedInputStream bufferedInputStream;
        ?? r11;
        BufferedOutputStream bufferedOutputStream;
        if (context == null) {
            return null;
        }
        try {
            g.h("mspl", "conn config: " + aVar);
            URL url = new URL(aVar.f113531a);
            Proxy proxyD = d(context);
            g.h("mspl", "conn proxy: " + proxyD);
            HttpURLConnection httpURLConnection2 = proxyD != null ? (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection(proxyD))) : (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
            try {
                System.setProperty("http.keepAlive", "false");
                CookieManager cookieManager = f113530a;
                if (cookieManager.getCookieStore().getCookies().size() > 0) {
                    httpURLConnection2.setRequestProperty("Cookie", TextUtils.join(";", cookieManager.getCookieStore().getCookies()));
                }
                httpURLConnection2.setConnectTimeout(Level.INFO_INT);
                httpURLConnection2.setReadTimeout(30000);
                httpURLConnection2.setInstanceFollowRedirects(true);
                httpURLConnection2.setRequestProperty("User-Agent", "msp");
                byte[] bArr = aVar.f113532b;
                if (bArr == null || bArr.length <= 0) {
                    httpURLConnection2.setRequestMethod("GET");
                } else {
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setRequestProperty("Content-Type", "application/octet-stream;binary/octet-stream");
                    httpURLConnection2.setRequestProperty("Accept-Charset", "UTF-8");
                    httpURLConnection2.setRequestProperty("Connection", "Keep-Alive");
                    httpURLConnection2.setRequestProperty("Keep-Alive", "timeout=180, max=100");
                }
                Map<String, String> map = aVar.f113533c;
                if (map != null) {
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (entry.getKey() != null) {
                            httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                        }
                    }
                }
                httpURLConnection2.setDoInput(true);
                if ("POST".equals(httpURLConnection2.getRequestMethod())) {
                    httpURLConnection2.setDoOutput(true);
                }
                if ("POST".equals(httpURLConnection2.getRequestMethod())) {
                    bufferedOutputStream = new BufferedOutputStream(httpURLConnection2.getOutputStream());
                    try {
                        bufferedOutputStream.write(aVar.f113532b);
                        bufferedOutputStream.flush();
                    } catch (Throwable th2) {
                        httpURLConnection = httpURLConnection2;
                        th = th2;
                        r11 = bufferedOutputStream;
                        bufferedInputStream = null;
                        try {
                            g.d(th);
                            return null;
                        } finally {
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                } catch (Throwable unused) {
                                }
                            }
                            if (bufferedInputStream != null) {
                                try {
                                    bufferedInputStream.close();
                                } catch (Throwable unused2) {
                                }
                            }
                            if (r11 != 0) {
                                try {
                                    r11.close();
                                } catch (Throwable unused3) {
                                }
                            }
                        }
                    }
                } else {
                    bufferedOutputStream = null;
                }
                BufferedInputStream bufferedInputStream2 = new BufferedInputStream(httpURLConnection2.getInputStream());
                try {
                    byte[] bArrC = c(bufferedInputStream2);
                    Map<String, List<String>> headerFields = httpURLConnection2.getHeaderFields();
                    String strJoin = (headerFields == null || headerFields.get(null) == null) ? null : TextUtils.join(",", headerFields.get(null));
                    List<String> list = headerFields.get("Set-Cookie");
                    if (list != null) {
                        Iterator<String> it = list.iterator();
                        while (it.hasNext()) {
                            List<HttpCookie> list2 = HttpCookie.parse(it.next());
                            if (list2 != null && !list2.isEmpty()) {
                                f113530a.getCookieStore().add(url.toURI(), list2.get(0));
                            }
                        }
                    }
                    C2420b c2420b = new C2420b(headerFields, strJoin, bArrC);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Throwable unused4) {
                    }
                    try {
                        bufferedInputStream2.close();
                    } catch (Throwable unused5) {
                    }
                    if (bufferedOutputStream != null) {
                        try {
                            bufferedOutputStream.close();
                        } catch (Throwable unused6) {
                        }
                    }
                    return c2420b;
                } catch (Throwable th3) {
                    httpURLConnection = httpURLConnection2;
                    th = th3;
                    r11 = bufferedOutputStream;
                    bufferedInputStream = bufferedInputStream2;
                    g.d(th);
                    return null;
                }
            } catch (Throwable th4) {
                httpURLConnection = httpURLConnection2;
                th = th4;
                bufferedInputStream = null;
                r11 = bufferedInputStream;
                g.d(th);
                return null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            bufferedInputStream = null;
        }
    }

    public static byte[] c(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int i11 = inputStream.read(bArr, 0, 1024);
            if (i11 == -1) {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i11);
        }
    }

    public static Proxy d(Context context) {
        String strA = a(context);
        if (strA != null && !strA.contains("wap")) {
            return null;
        }
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (!TextUtils.isEmpty(property)) {
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
