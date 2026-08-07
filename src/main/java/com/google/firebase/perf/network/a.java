package com.google.firebase.perf.network;

import com.google.firebase.perf.util.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;
import lw.h;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends HttpURLConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f44496a;

    a(HttpURLConnection httpURLConnection, l lVar, h hVar) {
        super(httpURLConnection.getURL());
        this.f44496a = new c(httpURLConnection, lVar, hVar);
    }

    @Override // java.net.URLConnection
    public void addRequestProperty(String str, String str2) {
        this.f44496a.a(str, str2);
    }

    @Override // java.net.URLConnection
    public void connect() {
        this.f44496a.b();
    }

    @Override // java.net.HttpURLConnection
    public void disconnect() {
        this.f44496a.c();
    }

    public boolean equals(Object obj) {
        return this.f44496a.equals(obj);
    }

    @Override // java.net.URLConnection
    public boolean getAllowUserInteraction() {
        return this.f44496a.d();
    }

    @Override // java.net.URLConnection
    public int getConnectTimeout() {
        return this.f44496a.e();
    }

    @Override // java.net.URLConnection
    public Object getContent() {
        return this.f44496a.f();
    }

    @Override // java.net.URLConnection
    public String getContentEncoding() {
        return this.f44496a.h();
    }

    @Override // java.net.URLConnection
    public int getContentLength() {
        return this.f44496a.i();
    }

    @Override // java.net.URLConnection
    public long getContentLengthLong() {
        return this.f44496a.j();
    }

    @Override // java.net.URLConnection
    public String getContentType() {
        return this.f44496a.k();
    }

    @Override // java.net.URLConnection
    public long getDate() {
        return this.f44496a.l();
    }

    @Override // java.net.URLConnection
    public boolean getDefaultUseCaches() {
        return this.f44496a.m();
    }

    @Override // java.net.URLConnection
    public boolean getDoInput() {
        return this.f44496a.n();
    }

    @Override // java.net.URLConnection
    public boolean getDoOutput() {
        return this.f44496a.o();
    }

    @Override // java.net.HttpURLConnection
    public InputStream getErrorStream() {
        return this.f44496a.p();
    }

    @Override // java.net.URLConnection
    public long getExpiration() {
        return this.f44496a.q();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderField(int i11) {
        return this.f44496a.r(i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public long getHeaderFieldDate(String str, long j11) {
        return this.f44496a.t(str, j11);
    }

    @Override // java.net.URLConnection
    public int getHeaderFieldInt(String str, int i11) {
        return this.f44496a.u(str, i11);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public String getHeaderFieldKey(int i11) {
        return this.f44496a.v(i11);
    }

    @Override // java.net.URLConnection
    public long getHeaderFieldLong(String str, long j11) {
        return this.f44496a.w(str, j11);
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getHeaderFields() {
        return this.f44496a.x();
    }

    @Override // java.net.URLConnection
    public long getIfModifiedSince() {
        return this.f44496a.y();
    }

    @Override // java.net.URLConnection
    public InputStream getInputStream() {
        return this.f44496a.z();
    }

    @Override // java.net.HttpURLConnection
    public boolean getInstanceFollowRedirects() {
        return this.f44496a.A();
    }

    @Override // java.net.URLConnection
    public long getLastModified() {
        return this.f44496a.B();
    }

    @Override // java.net.URLConnection
    public OutputStream getOutputStream() {
        return this.f44496a.C();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public Permission getPermission() {
        return this.f44496a.D();
    }

    @Override // java.net.URLConnection
    public int getReadTimeout() {
        return this.f44496a.E();
    }

    @Override // java.net.HttpURLConnection
    public String getRequestMethod() {
        return this.f44496a.F();
    }

    @Override // java.net.URLConnection
    public Map<String, List<String>> getRequestProperties() {
        return this.f44496a.G();
    }

    @Override // java.net.URLConnection
    public String getRequestProperty(String str) {
        return this.f44496a.H(str);
    }

    @Override // java.net.HttpURLConnection
    public int getResponseCode() {
        return this.f44496a.I();
    }

    @Override // java.net.HttpURLConnection
    public String getResponseMessage() {
        return this.f44496a.J();
    }

    @Override // java.net.URLConnection
    public URL getURL() {
        return this.f44496a.K();
    }

    @Override // java.net.URLConnection
    public boolean getUseCaches() {
        return this.f44496a.L();
    }

    public int hashCode() {
        return this.f44496a.hashCode();
    }

    @Override // java.net.URLConnection
    public void setAllowUserInteraction(boolean z11) {
        this.f44496a.M(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setChunkedStreamingMode(int i11) {
        this.f44496a.N(i11);
    }

    @Override // java.net.URLConnection
    public void setConnectTimeout(int i11) {
        this.f44496a.O(i11);
    }

    @Override // java.net.URLConnection
    public void setDefaultUseCaches(boolean z11) {
        this.f44496a.P(z11);
    }

    @Override // java.net.URLConnection
    public void setDoInput(boolean z11) {
        this.f44496a.Q(z11);
    }

    @Override // java.net.URLConnection
    public void setDoOutput(boolean z11) {
        this.f44496a.R(z11);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(int i11) {
        this.f44496a.S(i11);
    }

    @Override // java.net.URLConnection
    public void setIfModifiedSince(long j11) {
        this.f44496a.U(j11);
    }

    @Override // java.net.HttpURLConnection
    public void setInstanceFollowRedirects(boolean z11) {
        this.f44496a.V(z11);
    }

    @Override // java.net.URLConnection
    public void setReadTimeout(int i11) {
        this.f44496a.W(i11);
    }

    @Override // java.net.HttpURLConnection
    public void setRequestMethod(String str) {
        this.f44496a.X(str);
    }

    @Override // java.net.URLConnection
    public void setRequestProperty(String str, String str2) {
        this.f44496a.Y(str, str2);
    }

    @Override // java.net.URLConnection
    public void setUseCaches(boolean z11) {
        this.f44496a.Z(z11);
    }

    @Override // java.net.URLConnection
    public String toString() {
        return this.f44496a.toString();
    }

    @Override // java.net.HttpURLConnection
    public boolean usingProxy() {
        return this.f44496a.b0();
    }

    @Override // java.net.URLConnection
    public Object getContent(Class[] clsArr) {
        return this.f44496a.g(clsArr);
    }

    @Override // java.net.URLConnection
    public String getHeaderField(String str) {
        return this.f44496a.s(str);
    }

    @Override // java.net.HttpURLConnection
    public void setFixedLengthStreamingMode(long j11) {
        this.f44496a.T(j11);
    }
}
