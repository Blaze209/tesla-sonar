package com.plaid.internal;

import android.text.TextUtils;
import ch.qos.logback.classic.spi.CallerData;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: renamed from: com.plaid.internal.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4537t1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C4572x0 f48115h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final URL f48117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f48118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f48119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f48120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f48121f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f48122g;

    /* JADX INFO: renamed from: com.plaid.internal.t1$a */
    public class a implements Comparator<String> {
        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            if ("host".equals(str3)) {
                return -1;
            }
            if ("host".equals(str4)) {
                return 1;
            }
            return str3.compareTo(str4);
        }
    }

    /* JADX INFO: renamed from: com.plaid.internal.t1$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48123a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f48124b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f48125c;

        public b(String str, boolean z11) {
            this.f48123a = str;
            this.f48124b = z11;
            this.f48125c = z11 ? AbstractC4555v1.a(str) : str.getBytes(StandardCharsets.UTF_8);
        }
    }

    static {
        W3 w11 = Z3.f46846a;
        f48115h = new C4572x0("http-request");
    }

    public C4537t1(URL url, String str) {
        String host;
        HashMap map = new HashMap();
        this.f48118c = map;
        this.f48116a = "HTTP/1.1";
        this.f48120e = str.toUpperCase();
        this.f48117b = url;
        this.f48119d = AbstractC4555v1.b(url.toString());
        if (url.getPort() == -1) {
            host = url.getHost();
        } else {
            host = url.getHost() + ":" + url.getPort();
        }
        map.put("host".toLowerCase(), host);
        map.put("connection".toLowerCase(), "close");
        map.put("cache-control".toLowerCase(), "no-cache");
        map.put("accept".toLowerCase(), "*/*");
        map.put("accept-encoding".toLowerCase(), (String) C4403e1.f47632c.a("http.accept-encoding", "gzip", String.class));
    }

    public static void a(OutputStream outputStream, b bVar) throws IOException {
        if (bVar.f48125c.length > 0) {
            f48115h.a(W3.TRACE, bVar.f48124b ? "Socket.gzip(`%s`)" : "Socket.write(`%s`)", bVar.f48123a.trim());
            outputStream.write(bVar.f48125c);
        }
    }

    public final void a(OutputStream outputStream) throws IOException {
        b bVar = new b("", false);
        if (this.f48120e.equals("GET")) {
            f48115h.a(W3.TRACE, "Sending GET Request", new Object[0]);
        } else if (this.f48120e.equals("POST")) {
            f48115h.a(W3.TRACE, "Sending POST Request", new Object[0]);
            String str = this.f48121f;
            if (str != null && str.length() > 0) {
                bVar = new b(this.f48121f, this.f48122g);
                if (this.f48122g) {
                    this.f48118c.put("content-encoding".toLowerCase(), "gzip");
                } else {
                    this.f48118c.remove("content-encoding");
                }
                this.f48118c.put("content-length".toLowerCase(), String.valueOf(bVar.f48125c.length));
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f48120e);
        sb2.append(" ");
        String path = this.f48117b.getPath();
        StringBuilder sb3 = new StringBuilder();
        boolean z11 = true;
        for (Map.Entry entry : this.f48119d.entrySet()) {
            if (z11) {
                z11 = false;
            } else {
                sb3.append("&");
            }
            sb3.append((String) entry.getKey());
            sb3.append("=");
            try {
                sb3.append(URLEncoder.encode((String) entry.getValue(), "utf-8"));
            } catch (UnsupportedEncodingException e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        String string = sb3.toString();
        if (string.length() > 0) {
            path = this.f48117b.getPath() + CallerData.NA + string;
        }
        if (path == null || path.length() == 0) {
            path = "/";
        }
        sb2.append(path);
        sb2.append(" ");
        sb2.append(this.f48116a);
        sb2.append("\r\n");
        a(outputStream, new b(sb2.toString(), false));
        TreeSet<String> treeSet = new TreeSet(new a());
        treeSet.addAll(this.f48118c.keySet());
        for (String str2 : treeSet) {
            String[] strArrSplit = str2.toLowerCase().split("-");
            LinkedList linkedList = new LinkedList();
            for (String str3 : strArrSplit) {
                if (str3.length() > 0) {
                    str3 = str3.substring(0, 1).toUpperCase() + str3.substring(1);
                }
                linkedList.add(str3);
            }
            a(outputStream, new b(TextUtils.join("-", linkedList) + ": " + ((String) this.f48118c.get(str2)) + "\r\n", false));
        }
        a(outputStream, new b("\r\n", false));
        a(outputStream, bVar);
        outputStream.flush();
    }
}
