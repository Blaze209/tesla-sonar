package com.google.firebase.perf.network;

import com.google.firebase.perf.util.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import lw.h;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends HttpsURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f44497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HttpsURLConnection f44498b;

    b(HttpsURLConnection httpsURLConnection, l lVar, h hVar) {
        super(httpsURLConnection.getURL());
        this.f44498b = httpsURLConnection;
        this.f44497a = new c(httpsURLConnection, lVar, hVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f44497a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f44497a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f44497a.c();
    }

    public boolean equals(Object obj) {
        return this.f44497a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f44497a.d();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public String getCipherSuite() {
        return this.f44498b.getCipherSuite();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f44497a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f44497a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f44497a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f44497a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f44497a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f44497a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f44497a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f44497a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f44497a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f44497a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f44497a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f44497a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i11) {
        return this.f44497a.r(i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j11) {
        return this.f44497a.t(str, j11);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i11) {
        return this.f44497a.u(str, i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i11) {
        return this.f44497a.v(i11);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j11) {
        return this.f44497a.w(str, j11);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f44497a.x();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public HostnameVerifier getHostnameVerifier() {
        return this.f44498b.getHostnameVerifier();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f44497a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f44497a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f44497a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f44497a.B();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getLocalCertificates() {
        return this.f44498b.getLocalCertificates();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getLocalPrincipal() {
        return this.f44498b.getLocalPrincipal();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f44497a.C();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Principal getPeerPrincipal() {
        return this.f44498b.getPeerPrincipal();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f44497a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f44497a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f44497a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f44497a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f44497a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f44497a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f44497a.J();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public SSLSocketFactory getSSLSocketFactory() {
        return this.f44498b.getSSLSocketFactory();
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public Certificate[] getServerCertificates() {
        return this.f44498b.getServerCertificates();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f44497a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f44497a.L();
    }

    public int hashCode() {
        return this.f44497a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z11) {
        this.f44497a.M(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i11) {
        this.f44497a.N(i11);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i11) {
        this.f44497a.O(i11);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z11) {
        this.f44497a.P(z11);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z11) {
        this.f44497a.Q(z11);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z11) {
        this.f44497a.R(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i11) {
        this.f44497a.S(i11);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f44498b.setHostnameVerifier(hostnameVerifier);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j11) {
        this.f44497a.U(j11);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z11) {
        this.f44497a.V(z11);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i11) {
        this.f44497a.W(i11);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f44497a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f44497a.Y(str, str2);
    }

    @Override // javax.net.ssl.HttpsURLConnection
    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f44498b.setSSLSocketFactory(sSLSocketFactory);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z11) {
        this.f44497a.Z(z11);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f44497a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f44497a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f44497a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f44497a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j11) {
        this.f44497a.T(j11);
    }
}
