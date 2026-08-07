package com.google.firebase.perf.network;

import com.google.firebase.perf.util.l;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import lw.h;

/* JADX INFO: loaded from: classes5.dex */
class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kw.a f44499f = kw.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpURLConnection f44500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f44501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f44502c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f44503d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f44504e;

    public c(HttpURLConnection httpURLConnection, l lVar, h hVar) {
        this.f44500a = httpURLConnection;
        this.f44501b = hVar;
        this.f44504e = lVar;
        hVar.z(httpURLConnection.getURL().toString());
    }

    private void a0() {
        if (this.f44502c == -1) {
            this.f44504e.g();
            long jE = this.f44504e.e();
            this.f44502c = jE;
            this.f44501b.s(jE);
        }
        String strF = F();
        if (strF != null) {
            this.f44501b.k(strF);
        } else if (o()) {
            this.f44501b.k("POST");
        } else {
            this.f44501b.k("GET");
        }
    }

    public boolean A() {
        return this.f44500a.getInstanceFollowRedirects();
    }

    public long B() {
        a0();
        return this.f44500a.getLastModified();
    }

    public OutputStream C() throws IOException {
        try {
            OutputStream outputStream = this.f44500a.getOutputStream();
            return outputStream != null ? new nw.b(outputStream, this.f44501b, this.f44504e) : outputStream;
        } catch (IOException e11) {
            this.f44501b.x(this.f44504e.c());
            nw.d.d(this.f44501b);
            throw e11;
        }
    }

    public Permission D() throws IOException {
        try {
            return this.f44500a.getPermission();
        } catch (IOException e11) {
            this.f44501b.x(this.f44504e.c());
            nw.d.d(this.f44501b);
            throw e11;
        }
    }

    public int E() {
        return this.f44500a.getReadTimeout();
    }

    public String F() {
        return this.f44500a.getRequestMethod();
    }

    public Map<String, List<String>> G() {
        return this.f44500a.getRequestProperties();
    }

    public String H(String str) {
        return this.f44500a.getRequestProperty(str);
    }

    public int I() throws IOException {
        a0();
        if (this.f44503d == -1) {
            long jC = this.f44504e.c();
            this.f44503d = jC;
            this.f44501b.y(jC);
        }
        try {
            int responseCode = this.f44500a.getResponseCode();
            this.f44501b.l(responseCode);
            return responseCode;
        } catch (IOException e11) {
            this.f44501b.x(this.f44504e.c());
            nw.d.d(this.f44501b);
            throw e11;
        }
    }

    public String J() throws IOException {
        a0();
        if (this.f44503d == -1) {
            long jC = this.f44504e.c();
            this.f44503d = jC;
            this.f44501b.y(jC);
        }
        try {
            String responseMessage = this.f44500a.getResponseMessage();
            this.f44501b.l(this.f44500a.getResponseCode());
            return responseMessage;
        } catch (IOException e11) {
            this.f44501b.x(this.f44504e.c());
            nw.d.d(this.f44501b);
            throw e11;
        }
    }

    public URL K() {
        return this.f44500a.getURL();
    }

    public boolean L() {
        return this.f44500a.getUseCaches();
    }

    public void M(boolean z11) {
        this.f44500a.setAllowUserInteraction(z11);
    }

    public void N(int i11) {
        this.f44500a.setChunkedStreamingMode(i11);
    }

    public void O(int i11) {
        this.f44500a.setConnectTimeout(i11);
    }

    public void P(boolean z11) {
        this.f44500a.setDefaultUseCaches(z11);
    }

    public void Q(boolean z11) {
        this.f44500a.setDoInput(z11);
    }

    public void R(boolean z11) {
        this.f44500a.setDoOutput(z11);
    }

    public void S(int i11) {
        this.f44500a.setFixedLengthStreamingMode(i11);
    }

    public void T(long j11) {
        this.f44500a.setFixedLengthStreamingMode(j11);
    }

    public void U(long j11) {
        this.f44500a.setIfModifiedSince(j11);
    }

    public void V(boolean z11) {
        this.f44500a.setInstanceFollowRedirects(z11);
    }

    public void W(int i11) {
        this.f44500a.setReadTimeout(i11);
    }

    public void X(String str) {
        this.f44500a.setRequestMethod(str);
    }

    public void Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f44501b.A(str2);
        }
        this.f44500a.setRequestProperty(str, str2);
    }

    public void Z(boolean z11) {
        this.f44500a.setUseCaches(z11);
    }

    public void a(String str, String str2) {
        this.f44500a.addRequestProperty(str, str2);
    }

    public void b() {
        if (this.f44502c == -1) {
            this.f44504e.g();
            long jE = this.f44504e.e();
            this.f44502c = jE;
            this.f44501b.s(jE);
        }
        try {
            this.f44500a.connect();
        } catch (IOException e11) {
            this.f44501b.x(this.f44504e.c());
            nw.d.d(this.f44501b);
            throw e11;
        }
    }

    public boolean b0() {
        return this.f44500a.usingProxy();
    }

    public void c() {
        this.f44501b.x(this.f44504e.c());
        this.f44501b.b();
        this.f44500a.disconnect();
    }

    public boolean d() {
        return this.f44500a.getAllowUserInteraction();
    }

    public int e() {
        return this.f44500a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f44500a.equals(obj);
    }

    public Object f() throws IOException {
        a0();
        this.f44501b.l(this.f44500a.getResponseCode());
        try {
            Object content = this.f44500a.getContent();
            if (content instanceof InputStream) {
                this.f44501b.u(this.f44500a.getContentType());
                return new nw.a((InputStream) content, this.f44501b, this.f44504e);
            }
            this.f44501b.u(this.f44500a.getContentType());
            this.f44501b.v(this.f44500a.getContentLength());
            this.f44501b.x(this.f44504e.c());
            this.f44501b.b();
            return content;
        } catch (IOException e11) {
            this.f44501b.x(this.f44504e.c());
            nw.d.d(this.f44501b);
            throw e11;
        }
    }

    public Object g(Class[] clsArr) throws IOException {
        a0();
        this.f44501b.l(this.f44500a.getResponseCode());
        try {
            Object content = this.f44500a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f44501b.u(this.f44500a.getContentType());
                return new nw.a((InputStream) content, this.f44501b, this.f44504e);
            }
            this.f44501b.u(this.f44500a.getContentType());
            this.f44501b.v(this.f44500a.getContentLength());
            this.f44501b.x(this.f44504e.c());
            this.f44501b.b();
            return content;
        } catch (IOException e11) {
            this.f44501b.x(this.f44504e.c());
            nw.d.d(this.f44501b);
            throw e11;
        }
    }

    public String h() {
        a0();
        return this.f44500a.getContentEncoding();
    }

    public int hashCode() {
        return this.f44500a.hashCode();
    }

    public int i() {
        a0();
        return this.f44500a.getContentLength();
    }

    public long j() {
        a0();
        return this.f44500a.getContentLengthLong();
    }

    public String k() {
        a0();
        return this.f44500a.getContentType();
    }

    public long l() {
        a0();
        return this.f44500a.getDate();
    }

    public boolean m() {
        return this.f44500a.getDefaultUseCaches();
    }

    public boolean n() {
        return this.f44500a.getDoInput();
    }

    public boolean o() {
        return this.f44500a.getDoOutput();
    }

    public InputStream p() {
        a0();
        try {
            this.f44501b.l(this.f44500a.getResponseCode());
        } catch (IOException unused) {
            f44499f.a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f44500a.getErrorStream();
        return errorStream != null ? new nw.a(errorStream, this.f44501b, this.f44504e) : errorStream;
    }

    public long q() {
        a0();
        return this.f44500a.getExpiration();
    }

    public String r(int i11) {
        a0();
        return this.f44500a.getHeaderField(i11);
    }

    public String s(String str) {
        a0();
        return this.f44500a.getHeaderField(str);
    }

    public long t(String str, long j11) {
        a0();
        return this.f44500a.getHeaderFieldDate(str, j11);
    }

    public String toString() {
        return this.f44500a.toString();
    }

    public int u(String str, int i11) {
        a0();
        return this.f44500a.getHeaderFieldInt(str, i11);
    }

    public String v(int i11) {
        a0();
        return this.f44500a.getHeaderFieldKey(i11);
    }

    public long w(String str, long j11) {
        a0();
        return this.f44500a.getHeaderFieldLong(str, j11);
    }

    public Map<String, List<String>> x() {
        a0();
        return this.f44500a.getHeaderFields();
    }

    public long y() {
        return this.f44500a.getIfModifiedSince();
    }

    public InputStream z() throws IOException {
        a0();
        this.f44501b.l(this.f44500a.getResponseCode());
        this.f44501b.u(this.f44500a.getContentType());
        try {
            InputStream inputStream = this.f44500a.getInputStream();
            return inputStream != null ? new nw.a(inputStream, this.f44501b, this.f44504e) : inputStream;
        } catch (IOException e11) {
            this.f44501b.x(this.f44504e.c());
            nw.d.d(this.f44501b);
            throw e11;
        }
    }
}
