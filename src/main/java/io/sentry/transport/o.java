package io.sentry.transport;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import io.sentry.ILogger;
import io.sentry.a4;
import io.sentry.b7;
import io.sentry.p5;
import io.sentry.q7;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes9.dex */
final class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Charset f81393e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Proxy f81394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a4 f81395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q7 f81396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f81397d;

    public o(q7 q7Var, a4 a4Var, a0 a0Var) {
        this(q7Var, a4Var, m.a(), a0Var);
    }

    private void a(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private HttpURLConnection b() throws IOException {
        HttpURLConnection httpURLConnectionE = e();
        for (Map.Entry<String, String> entry : this.f81395b.a().entrySet()) {
            httpURLConnectionE.setRequestProperty(entry.getKey(), entry.getValue());
        }
        httpURLConnectionE.setRequestMethod("POST");
        httpURLConnectionE.setDoOutput(true);
        httpURLConnectionE.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnectionE.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnectionE.setRequestProperty("Accept", "application/json");
        httpURLConnectionE.setRequestProperty("Connection", "close");
        httpURLConnectionE.setConnectTimeout(this.f81396c.getConnectionTimeoutMillis());
        httpURLConnectionE.setReadTimeout(this.f81396c.getReadTimeoutMillis());
        SSLSocketFactory sslSocketFactory = this.f81396c.getSslSocketFactory();
        if ((httpURLConnectionE instanceof HttpsURLConnection) && sslSocketFactory != null) {
            ((HttpsURLConnection) httpURLConnectionE).setSSLSocketFactory(sslSocketFactory);
        }
        httpURLConnectionE.connect();
        return httpURLConnectionE;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private String c(HttpURLConnection httpURLConnection) {
        try {
            InputStream errorStream = httpURLConnection.getErrorStream();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f81393e));
                try {
                    StringBuilder sb2 = new StringBuilder();
                    boolean z11 = true;
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!z11) {
                            sb2.append("\n");
                        }
                        sb2.append(line);
                        z11 = false;
                        if (errorStream != null) {
                            try {
                                errorStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                    String string = sb2.toString();
                    bufferedReader.close();
                    if (errorStream != null) {
                        errorStream.close();
                    }
                    return string;
                } catch (Throwable th3) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (errorStream != null) {
                    errorStream.close();
                }
                throw th5;
            }
        } catch (IOException unused) {
            return "Failed to obtain error message while analyzing send failure.";
        }
    }

    private boolean d(int i11) {
        return i11 == 200;
    }

    private c0 f(HttpURLConnection httpURLConnection) {
        try {
            int responseCode = httpURLConnection.getResponseCode();
            i(httpURLConnection, responseCode);
            if (d(responseCode)) {
                this.f81396c.getLogger().c(b7.DEBUG, "Envelope sent successfully.", new Object[0]);
                return c0.e();
            }
            ILogger logger = this.f81396c.getLogger();
            b7 b7Var = b7.ERROR;
            logger.c(b7Var, "Request failed, API returned %s", Integer.valueOf(responseCode));
            if (this.f81396c.isDebug()) {
                this.f81396c.getLogger().c(b7Var, "%s", c(httpURLConnection));
            }
            return c0.b(responseCode);
        } catch (IOException e11) {
            this.f81396c.getLogger().b(b7.ERROR, e11, "Error reading and logging the response stream", new Object[0]);
            return c0.a();
        } finally {
            a(httpURLConnection);
        }
    }

    private Proxy g(q7.l lVar) {
        if (lVar == null) {
            return null;
        }
        String strC = lVar.c();
        String strA = lVar.a();
        if (strC == null || strA == null) {
            return null;
        }
        try {
            return new Proxy(lVar.d() != null ? lVar.d() : Proxy.Type.HTTP, new InetSocketAddress(strA, Integer.parseInt(strC)));
        } catch (NumberFormatException e11) {
            this.f81396c.getLogger().b(b7.ERROR, e11, "Failed to parse Sentry Proxy port: " + lVar.c() + ". Proxy is ignored", new Object[0]);
            return null;
        }
    }

    HttpURLConnection e() {
        return (HttpURLConnection) (this.f81394a == null ? (URLConnection) FirebasePerfUrlConnection.instrument(this.f81395b.b().openConnection()) : (URLConnection) FirebasePerfUrlConnection.instrument(this.f81395b.b().openConnection(this.f81394a)));
    }

    public c0 h(p5 p5Var) throws IOException {
        c0 c0VarF;
        this.f81396c.getSocketTagger().b();
        HttpURLConnection httpURLConnectionB = b();
        try {
            OutputStream outputStream = httpURLConnectionB.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f81396c.getSerializer().b(p5Var, gZIPOutputStream);
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                }
                throw th4;
            }
        } catch (Throwable th6) {
            try {
                this.f81396c.getLogger().b(b7.ERROR, th6, "An exception occurred while submitting the envelope to the Sentry server.", new Object[0]);
            } finally {
                f(httpURLConnectionB);
                this.f81396c.getSocketTagger().a();
            }
        }
        return c0VarF;
    }

    public void i(HttpURLConnection httpURLConnection, int i11) {
        String headerField = httpURLConnection.getHeaderField("Retry-After");
        this.f81397d.n0(httpURLConnection.getHeaderField("X-Sentry-Rate-Limits"), headerField, i11);
    }

    o(q7 q7Var, a4 a4Var, m mVar, a0 a0Var) {
        this.f81395b = a4Var;
        this.f81396c = q7Var;
        this.f81397d = a0Var;
        Proxy proxyG = g(q7Var.getProxy());
        this.f81394a = proxyG;
        if (proxyG == null || q7Var.getProxy() == null) {
            return;
        }
        String strE = q7Var.getProxy().e();
        String strB = q7Var.getProxy().b();
        if (strE == null || strB == null) {
            return;
        }
        mVar.b(new v(strE, strB));
    }
}
