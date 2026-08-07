package com.alipay.android.phone.mrpc.core;

import android.content.ContentResolver;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.google.firebase.perf.network.FirebasePerfHttpClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes3.dex */
public class q implements Callable<v> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HttpRequestRetryHandler f20029e = new af();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f20030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f20031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f20032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f20033d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HttpUriRequest f20034f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CookieManager f20037i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AbstractHttpEntity f20038j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HttpHost f20039k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private URL f20040l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f20045q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HttpContext f20035g = new BasicHttpContext();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CookieStore f20036h = new BasicCookieStore();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20041m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f20042n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f20043o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f20044p = null;

    public q(l lVar, o oVar) {
        this.f20030a = lVar;
        this.f20031b = lVar.f20007a;
        this.f20032c = oVar;
    }

    private HttpUriRequest f() {
        HttpUriRequest httpUriRequest = this.f20034f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        AbstractHttpEntity abstractHttpEntityB = b();
        if (abstractHttpEntityB != null) {
            HttpPost httpPost = new HttpPost(a());
            httpPost.setEntity(abstractHttpEntityB);
            this.f20034f = httpPost;
        } else {
            this.f20034f = new HttpGet(a());
        }
        return this.f20034f;
    }

    private void g() {
        HttpUriRequest httpUriRequest = this.f20034f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private ae h() {
        return this.f20032c.f();
    }

    private HttpResponse i() {
        return j();
    }

    private HttpResponse j() {
        Log.d("HttpWorker", "By Http/Https to request. operationType=" + k() + " url=" + this.f20034f.getURI().toString());
        l().getParams().setParameter("http.route.default-proxy", q());
        HttpHost httpHostN = n();
        if (o() == 80) {
            httpHostN = new HttpHost(p().getHost());
        }
        return FirebasePerfHttpClient.execute(l(), httpHostN, this.f20034f, this.f20035g);
    }

    private String k() {
        if (!TextUtils.isEmpty(this.f20045q)) {
            return this.f20045q;
        }
        String strB = this.f20032c.b("operationType");
        this.f20045q = strB;
        return strB;
    }

    private b l() {
        return this.f20030a.a();
    }

    private void m() {
        ArrayList<Header> arrayListC = c();
        if (arrayListC != null && !arrayListC.isEmpty()) {
            Iterator<Header> it = arrayListC.iterator();
            while (it.hasNext()) {
                f().addHeader(it.next());
            }
        }
        b.a((HttpRequest) f());
        b.b(f());
        f().addHeader("cookie", r().getCookie(this.f20032c.a()));
    }

    private HttpHost n() {
        HttpHost httpHost = this.f20039k;
        if (httpHost != null) {
            return httpHost;
        }
        URL urlP = p();
        HttpHost httpHost2 = new HttpHost(urlP.getHost(), o(), urlP.getProtocol());
        this.f20039k = httpHost2;
        return httpHost2;
    }

    private int o() {
        URL urlP = p();
        return urlP.getPort() == -1 ? urlP.getDefaultPort() : urlP.getPort();
    }

    private URL p() {
        URL url = this.f20040l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f20032c.a());
        this.f20040l = url2;
        return url2;
    }

    private HttpHost q() {
        HttpHost httpHostA = t.a(this.f20031b);
        if (httpHostA != null && TextUtils.equals(httpHostA.getHostName(), "127.0.0.1") && httpHostA.getPort() == 8087) {
            return null;
        }
        return httpHostA;
    }

    private CookieManager r() {
        CookieManager cookieManager = this.f20037i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.f20037i = cookieManager2;
        return cookieManager2;
    }

    public long a(String[] strArr) {
        String str;
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if ("max-age".equalsIgnoreCase(strArr[i11]) && (str = strArr[i11 + 1]) != null) {
                try {
                    return Long.parseLong(str);
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return 0L;
    }

    public long b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] strArrSplit = firstHeader.getValue().split("=");
            if (strArrSplit.length >= 2) {
                try {
                    return a(strArrSplit);
                } catch (NumberFormatException e11) {
                    Log.w("HttpWorker", e11);
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return b.b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    public ArrayList<Header> c() {
        return this.f20032c.d();
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public v call() throws HttpException {
        long j11;
        long length;
        try {
            if (!t.c(this.f20031b)) {
                throw new HttpException(1, "The network is not available");
            }
            if (h() != null) {
                h().b(this.f20032c);
            }
            m();
            this.f20035g.setAttribute("http.cookie-store", this.f20036h);
            l().a(f20029e);
            long jCurrentTimeMillis = System.currentTimeMillis();
            HttpResponse httpResponseI = i();
            this.f20030a.b(System.currentTimeMillis() - jCurrentTimeMillis);
            List<Cookie> cookies = this.f20036h.getCookies();
            if (this.f20032c.e()) {
                r().removeAllCookie();
            }
            if (!cookies.isEmpty()) {
                for (Cookie cookie : cookies) {
                    if (cookie.getDomain() != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(cookie.getName());
                        sb2.append("=");
                        sb2.append(cookie.getValue());
                        sb2.append("; domain=");
                        sb2.append(cookie.getDomain());
                        sb2.append(cookie.isSecure() ? "; Secure" : "");
                        r().setCookie(this.f20032c.a(), sb2.toString());
                        CookieSyncManager.getInstance().sync();
                    }
                }
            }
            v vVarA = a(httpResponseI, this.f20032c);
            if (vVarA == null || vVarA.b() == null) {
                j11 = -1;
                length = -1;
            } else {
                j11 = -1;
                length = vVarA.b().length;
            }
            if (length == j11 && (vVarA instanceof p)) {
                try {
                    Long.parseLong(((p) vVarA).a().getHead("Content-Length"));
                } catch (Exception unused) {
                    Log.e("HttpWorker", "parse Content-Length error");
                }
            }
            if (this.f20032c.a() != null && !TextUtils.isEmpty(k())) {
                k();
            }
            return vVarA;
        } catch (HttpException e11) {
            g();
            if (h() != null) {
                h().a(this.f20032c, e11.getCode(), e11.getMsg());
            }
            Log.e("HttpManager", e11 + "");
            throw e11;
        } catch (NullPointerException e12) {
            g();
            int i11 = this.f20041m;
            if (i11 < 1) {
                this.f20041m = i11 + 1;
                return call();
            }
            Log.e("HttpManager", e12 + "");
            throw new HttpException(0, e12 + "");
        } catch (SocketTimeoutException e13) {
            g();
            if (h() != null) {
                h().a(this.f20032c, 4, e13 + "");
            }
            Log.e("HttpManager", e13 + "");
            throw new HttpException(4, e13 + "");
        } catch (URISyntaxException e14) {
            throw new RuntimeException("Url parser error!", e14.getCause());
        } catch (UnknownHostException e15) {
            g();
            if (h() != null) {
                h().a(this.f20032c, 9, e15 + "");
            }
            Log.e("HttpManager", e15 + "");
            throw new HttpException(9, e15 + "");
        } catch (SSLHandshakeException e16) {
            g();
            if (h() != null) {
                h().a(this.f20032c, 2, e16 + "");
            }
            Log.e("HttpManager", e16 + "");
            throw new HttpException(2, e16 + "");
        } catch (SSLPeerUnverifiedException e17) {
            g();
            if (h() != null) {
                h().a(this.f20032c, 2, e17 + "");
            }
            Log.e("HttpManager", e17 + "");
            throw new HttpException(2, e17 + "");
        } catch (SSLException e18) {
            g();
            if (h() != null) {
                h().a(this.f20032c, 6, e18 + "");
            }
            Log.e("HttpManager", e18 + "");
            throw new HttpException(6, e18 + "");
        } catch (NoHttpResponseException e19) {
            g();
            if (h() != null) {
                h().a(this.f20032c, 5, e19 + "");
            }
            Log.e("HttpManager", e19 + "");
            throw new HttpException(5, e19 + "");
        } catch (ConnectionPoolTimeoutException e21) {
            g();
            if (h() != null) {
                h().a(this.f20032c, 3, e21 + "");
            }
            Log.e("HttpManager", e21 + "");
            throw new HttpException(3, e21 + "");
        } catch (ConnectTimeoutException e22) {
            g();
            if (h() != null) {
                h().a(this.f20032c, 3, e22 + "");
            }
            Log.e("HttpManager", e22 + "");
            throw new HttpException(3, e22 + "");
        } catch (HttpHostConnectException e23) {
            g();
            if (h() != null) {
                h().a(this.f20032c, 8, e23 + "");
            }
            Log.e("HttpManager", "", e23);
            throw new HttpException(8, e23 + "");
        } catch (IOException e24) {
            g();
            if (h() != null) {
                h().a(this.f20032c, 6, e24 + "");
            }
            Log.e("HttpManager", e24 + "");
            throw new HttpException(6, e24 + "");
        } catch (Exception e25) {
            Log.e("HttpManager", "", e25);
            g();
            if (h() != null) {
                h().a(this.f20032c, 0, e25 + "");
            }
            throw new HttpException(0, e25 + "");
        }
    }

    public o e() {
        return this.f20032c;
    }

    public HttpUrlHeader a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    public AbstractHttpEntity b() {
        AbstractHttpEntity abstractHttpEntity = this.f20038j;
        if (abstractHttpEntity != null) {
            return abstractHttpEntity;
        }
        byte[] bArrB = this.f20032c.b();
        String strB = this.f20032c.b("gzip");
        if (bArrB != null) {
            if (TextUtils.equals(strB, "true")) {
                this.f20038j = b.a(bArrB, (ContentResolver) null);
            } else {
                this.f20038j = new ByteArrayEntity(bArrB);
            }
            this.f20038j.setContentType(this.f20032c.c());
        }
        return this.f20038j;
    }

    public v a(HttpResponse httpResponse, int i11, String str) throws Throwable {
        Log.d("HttpWorker", "开始handle，handleResponse-1," + Thread.currentThread().getId());
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity == null) {
                httpResponse.getStatusLine().getStatusCode();
            }
            return null;
        }
        Log.d("HttpWorker", "200，开始处理，handleResponse-2,threadid = " + Thread.currentThread().getId());
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                a(entity, 0L, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                this.f20043o = false;
                this.f20030a.c(System.currentTimeMillis() - jCurrentTimeMillis);
                this.f20030a.a(byteArray.length);
                Log.i("HttpWorker", "res:" + byteArray.length);
                p pVar = new p(a(httpResponse), i11, str, byteArray);
                a(pVar, httpResponse);
                try {
                    byteArrayOutputStream2.close();
                    Log.d("HttpWorker", "finally,handleResponse");
                    return pVar;
                } catch (IOException e11) {
                    throw new RuntimeException("ArrayOutputStream close error!", e11.getCause());
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e12) {
                        throw new RuntimeException("ArrayOutputStream close error!", e12.getCause());
                    }
                }
                Log.d("HttpWorker", "finally,handleResponse");
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public v a(HttpResponse httpResponse, o oVar) throws HttpException {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String reasonPhrase = httpResponse.getStatusLine().getReasonPhrase();
        if (statusCode == 200 || a(statusCode, reasonPhrase)) {
            return a(httpResponse, statusCode, reasonPhrase);
        }
        throw new HttpException(Integer.valueOf(httpResponse.getStatusLine().getStatusCode()), httpResponse.getStatusLine().getReasonPhrase());
    }

    public URI a() {
        String strA = this.f20032c.a();
        String str = this.f20033d;
        if (str != null) {
            strA = str;
        }
        if (strA != null) {
            return new URI(strA);
        }
        throw new RuntimeException("url should not be null");
    }

    public HashMap<String, String> a(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] strArrSplit = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split("=");
            map.put(strArrSplit[0], strArrSplit[1]);
        }
        return map;
    }

    public void a(p pVar, HttpResponse httpResponse) {
        String str;
        String str2;
        long jB = b(httpResponse);
        Header contentType = httpResponse.getEntity().getContentType();
        if (contentType != null) {
            HashMap<String, String> mapA = a(contentType.getValue());
            str = mapA.get("charset");
            str2 = mapA.get("Content-Type");
        } else {
            str = null;
            str2 = null;
        }
        pVar.b(str2);
        pVar.a(str);
        pVar.a(System.currentTimeMillis());
        pVar.b(jB);
    }

    public void a(HttpEntity httpEntity, long j11, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            httpEntity.consumeContent();
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream inputStreamA = b.a(httpEntity);
        long contentLength = httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int i11 = inputStreamA.read(bArr);
                    if (i11 == -1 || this.f20032c.h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, i11);
                    j11 += (long) i11;
                    if (h() != null && contentLength > 0) {
                        h().a(this.f20032c, j11 / contentLength);
                    }
                }
                outputStream.flush();
                r.a(inputStreamA);
            } catch (Exception e11) {
                Log.w("HttpWorker", e11.getCause());
                throw new IOException("HttpWorker Request Error!" + e11.getLocalizedMessage());
            }
        } catch (Throwable th2) {
            r.a(inputStreamA);
            throw th2;
        }
    }

    public boolean a(int i11, String str) {
        return i11 == 304;
    }
}
