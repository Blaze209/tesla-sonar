package com.plaid.internal;

import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.plaid.internal.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4392d implements InterfaceC4519r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4572x0 f47607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4424g4 f47608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47609c;

    public C4392d(C4424g4 c4424g4) {
        W3 w11 = Z3.f46846a;
        this.f47607a = new C4572x0("http-client");
        this.f47609c = 0;
        this.f47608b = c4424g4;
    }

    @Override // com.plaid.internal.InterfaceC4519r1
    public final void a() {
        try {
            C4424g4 c4424g4 = this.f47608b;
            if (c4424g4.f47683d) {
                return;
            }
            c4424g4.f47683d = true;
            c4424g4.f47681b.run();
        } catch (Exception e11) {
            this.f47607a.a(e11, "couldn't release the network");
        }
    }

    @Override // com.plaid.internal.InterfaceC4519r1
    public final EnumC4589z isConnected() {
        C4424g4 c4424g4 = this.f47608b;
        return c4424g4.f47683d ? EnumC4589z.NO : c4424g4.f47682c;
    }

    @Override // com.plaid.internal.InterfaceC4519r1
    public final InterfaceC4519r1.b a(InterfaceC4519r1.a aVar) throws Throwable {
        InputStream errorStream;
        byte[] bytes;
        C4572x0 c4572x0 = this.f47607a;
        StringBuilder sb2 = new StringBuilder("request ");
        sb2.append(aVar.f48079b ? "POST" : "GET");
        sb2.append(" ");
        sb2.append(aVar.f48078a);
        c4572x0.a(W3.DEBUG, sb2.toString(), new Object[0]);
        int i11 = aVar.f48080c;
        if (i11 <= -1) {
            i11 = this.f47609c;
        }
        HttpURLConnection httpURLConnection = null;
        OutputStream outputStream = null;
        String str = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) this.f47608b.f47680a.openConnection(new URL(aVar.f48078a));
            try {
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setConnectTimeout(i11);
                httpURLConnection2.setReadTimeout(i11);
                httpURLConnection2.setRequestProperty("Connection", "close");
                httpURLConnection2.setRequestProperty("Cache-Control", "no-cache");
                C4403e1 c4403e1 = C4403e1.f47632c;
                if (!c4403e1.a("http.no-user-agent")) {
                    StringBuilder sb3 = new StringBuilder("Prove SDK;version=2.9.1;os=Android ");
                    sb3.append(Build.VERSION.RELEASE);
                    sb3.append(";device=");
                    String str2 = Build.MANUFACTURER;
                    String str3 = Build.MODEL;
                    if (!str3.toLowerCase().startsWith(str2.toLowerCase())) {
                        str3 = str2 + " " + str3;
                    }
                    sb3.append(str3);
                    httpURLConnection2.setRequestProperty("user-agent", sb3.toString());
                }
                if (aVar.f48079b) {
                    httpURLConnection2.setRequestMethod("POST");
                    httpURLConnection2.setRequestProperty("Accept", (String) c4403e1.a("http.accept.post", "application/json", String.class));
                    httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                    httpURLConnection2.setDoOutput(true);
                    boolean zA = c4403e1.a("http.no-gzip");
                    if (!zA) {
                        bytes = AbstractC4555v1.a(aVar.f48081d);
                    } else {
                        bytes = aVar.f48081d.getBytes(StandardCharsets.UTF_8);
                    }
                    if (!zA) {
                        httpURLConnection2.setRequestProperty("Content-Encoding", "gzip");
                    }
                    httpURLConnection2.setRequestProperty("Content-Length", String.valueOf(bytes.length));
                    try {
                        OutputStream outputStream2 = httpURLConnection2.getOutputStream();
                        try {
                            outputStream2.write(bytes, 0, bytes.length);
                            AbstractC4555v1.a(outputStream2);
                        } catch (Throwable th2) {
                            th = th2;
                            outputStream = outputStream2;
                            AbstractC4555v1.a(outputStream);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    httpURLConnection2.setRequestProperty("Accept", (String) c4403e1.a("http.accept.get", "application/json, */*", String.class));
                }
                httpURLConnection2.connect();
                try {
                    errorStream = httpURLConnection2.getInputStream();
                } catch (FileNotFoundException unused) {
                    errorStream = httpURLConnection2.getErrorStream();
                }
                int responseCode = httpURLConnection2.getResponseCode();
                String responseMessage = httpURLConnection2.getResponseMessage();
                if (errorStream != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i12 = errorStream.read(bArr, 0, 1024);
                        if (i12 == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, i12);
                    }
                    byteArrayOutputStream.flush();
                    str = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                }
                InterfaceC4519r1.b bVar = new InterfaceC4519r1.b(responseCode, responseMessage, str, httpURLConnection2.getHeaderFields());
                httpURLConnection2.disconnect();
                return bVar;
            } catch (Throwable th4) {
                th = th4;
                httpURLConnection = httpURLConnection2;
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
