package io.sentry;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URLConnection;
import java.util.concurrent.RejectedExecutionException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes9.dex */
public final class SpotlightIntegration implements o1, q7.b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q7 f79209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ILogger f79210b = m2.e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c1 f79211c = z2.f();

    /* JADX INFO: Access modifiers changed from: private */
    public void C(p5 p5Var) {
        try {
            if (this.f79209a == null) {
                throw new IllegalArgumentException("SentryOptions are required to send envelopes.");
            }
            HttpURLConnection httpURLConnectionT = t(B());
            try {
                OutputStream outputStream = httpURLConnectionT.getOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                    try {
                        this.f79209a.getSerializer().b(p5Var, gZIPOutputStream);
                        gZIPOutputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        this.f79210b.c(b7.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionT.getResponseCode()));
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
                    this.f79210b.a(b7.ERROR, "An exception occurred while submitting the envelope to the Sentry server.", th6);
                    this.f79210b.c(b7.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionT.getResponseCode()));
                } finally {
                    this.f79210b.c(b7.DEBUG, "Envelope sent to spotlight: %d", Integer.valueOf(httpURLConnectionT.getResponseCode()));
                    p(httpURLConnectionT);
                }
            }
        } catch (Exception e11) {
            this.f79210b.a(b7.ERROR, "An exception occurred while creating the connection to spotlight.", e11);
        }
    }

    private void p(HttpURLConnection httpURLConnection) {
        try {
            httpURLConnection.getInputStream().close();
        } catch (IOException unused) {
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private HttpURLConnection t(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(URI.create(str).toURL().openConnection()));
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setConnectTimeout(1000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/x-sentry-envelope");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("Connection", "close");
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public String B() {
        q7 q7Var = this.f79209a;
        if (q7Var == null || q7Var.getSpotlightConnectionUrl() == null) {
            return io.sentry.util.a0.a() ? "http://10.0.2.2:8969/stream" : "http://localhost:8969/stream";
        }
        return this.f79209a.getSpotlightConnectionUrl();
    }

    @Override // io.sentry.q7.b
    public void c(final p5 p5Var, h0 h0Var) {
        try {
            this.f79211c.submit(new Runnable() { // from class: io.sentry.s8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81333a.C(p5Var);
                }
            });
        } catch (RejectedExecutionException e11) {
            this.f79210b.a(b7.WARNING, "Spotlight envelope submission rejected.", e11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f79211c.c(0L);
        q7 q7Var = this.f79209a;
        if (q7Var == null || q7Var.getBeforeEnvelopeCallback() != this) {
            return;
        }
        this.f79209a.setBeforeEnvelopeCallback(null);
    }

    @Override // io.sentry.o1
    public void n(z0 z0Var, q7 q7Var) {
        this.f79209a = q7Var;
        this.f79210b = q7Var.getLogger();
        if (q7Var.getBeforeEnvelopeCallback() != null || !q7Var.isEnableSpotlight()) {
            this.f79210b.c(b7.DEBUG, "SpotlightIntegration is not enabled. BeforeEnvelopeCallback is already set or spotlight is not enabled.", new Object[0]);
            return;
        }
        this.f79211c = new v6(q7Var);
        q7Var.setBeforeEnvelopeCallback(this);
        this.f79210b.c(b7.DEBUG, "SpotlightIntegration enabled.", new Object[0]);
        io.sentry.util.p.a("Spotlight");
    }
}
