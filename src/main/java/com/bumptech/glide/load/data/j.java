package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.HttpException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class j implements d<InputStream> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final b f20538g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final jj.h f20539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f20541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpURLConnection f20542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f20543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f20544f;

    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    public j(jj.h hVar, int i11) {
        this(hVar, i11, f20538g);
    }

    private HttpURLConnection e(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection httpURLConnectionA = this.f20541c.a(url);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f20540b);
            httpURLConnectionA.setReadTimeout(this.f20540b);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e11) {
            throw new HttpException("URL.openConnection threw", 0, e11);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e11) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e11);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f20543e = xj.c.n(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f20543e = httpURLConnection.getInputStream();
            }
            return this.f20543e;
        } catch (IOException e11) {
            throw new HttpException("Failed to obtain InputStream", f(httpURLConnection), e11);
        }
    }

    private static boolean h(int i11) {
        return i11 / 100 == 2;
    }

    private static boolean i(int i11) {
        return i11 / 100 == 3;
    }

    private InputStream j(URL url, int i11, URL url2, Map<String, String> map) throws HttpException {
        if (i11 >= 5) {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new HttpException("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionE = e(url, map);
        this.f20542d = httpURLConnectionE;
        try {
            httpURLConnectionE.connect();
            this.f20543e = this.f20542d.getInputStream();
            if (this.f20544f) {
                return null;
            }
            int iF = f(this.f20542d);
            if (h(iF)) {
                return g(this.f20542d);
            }
            if (!i(iF)) {
                if (iF == -1) {
                    throw new HttpException(iF);
                }
                try {
                    throw new HttpException(this.f20542d.getResponseMessage(), iF);
                } catch (IOException e11) {
                    throw new HttpException("Failed to get a response message", iF, e11);
                }
            }
            String headerField = this.f20542d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new HttpException("Received empty or null redirect url", iF);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i11 + 1, url, map);
            } catch (MalformedURLException e12) {
                throw new HttpException("Bad redirect url: " + headerField, iF, e12);
            }
        } catch (IOException e13) {
            throw new HttpException("Failed to connect or obtain data", f(this.f20542d), e13);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f20543e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f20542d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f20542d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    @NonNull
    public dj.a c() {
        return dj.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f20544f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(@NonNull com.bumptech.glide.h hVar, @NonNull d.a<? super InputStream> aVar) {
        long jB = xj.g.b();
        try {
            aVar.e(j(this.f20539a.i(), 0, null, this.f20539a.e()));
        } catch (IOException e11) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e11);
            }
            aVar.f(e11);
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + xj.g.a(jB));
            }
        }
    }

    j(jj.h hVar, int i11, b bVar) {
        this.f20539a = hVar;
        this.f20540b = i11;
        this.f20541c = bVar;
    }
}
