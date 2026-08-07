package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.util.n;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import lw.h;
import pw.k;

/* JADX INFO: loaded from: classes5.dex */
public class FirebasePerfUrlConnection {
    private FirebasePerfUrlConnection() {
    }

    static Object a(n nVar, k kVar, l lVar) throws IOException {
        lVar.g();
        long jE = lVar.e();
        h hVarC = h.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) uRLConnectionA, lVar, hVarC).getContent();
            }
            return uRLConnectionA instanceof HttpURLConnection ? new a((HttpURLConnection) uRLConnectionA, lVar, hVarC).getContent() : uRLConnectionA.getContent();
        } catch (IOException e11) {
            hVarC.s(jE);
            hVarC.x(lVar.c());
            hVarC.z(nVar.toString());
            nw.d.d(hVarC);
            throw e11;
        }
    }

    static Object b(n nVar, Class[] clsArr, k kVar, l lVar) throws IOException {
        lVar.g();
        long jE = lVar.e();
        h hVarC = h.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) uRLConnectionA, lVar, hVarC).getContent(clsArr);
            }
            return uRLConnectionA instanceof HttpURLConnection ? new a((HttpURLConnection) uRLConnectionA, lVar, hVarC).getContent(clsArr) : uRLConnectionA.getContent(clsArr);
        } catch (IOException e11) {
            hVarC.s(jE);
            hVarC.x(lVar.c());
            hVarC.z(nVar.toString());
            nw.d.d(hVarC);
            throw e11;
        }
    }

    static InputStream c(n nVar, k kVar, l lVar) throws IOException {
        if (!k.k().u()) {
            return nVar.a().getInputStream();
        }
        lVar.g();
        long jE = lVar.e();
        h hVarC = h.c(kVar);
        try {
            URLConnection uRLConnectionA = nVar.a();
            if (uRLConnectionA instanceof HttpsURLConnection) {
                return new b((HttpsURLConnection) uRLConnectionA, lVar, hVarC).getInputStream();
            }
            return uRLConnectionA instanceof HttpURLConnection ? new a((HttpURLConnection) uRLConnectionA, lVar, hVarC).getInputStream() : uRLConnectionA.getInputStream();
        } catch (IOException e11) {
            hVarC.s(jE);
            hVarC.x(lVar.c());
            hVarC.z(nVar.toString());
            nw.d.d(hVarC);
            throw e11;
        }
    }

    @Keep
    public static Object getContent(URL url) {
        return a(new n(url), k.k(), new l());
    }

    @Keep
    public static Object instrument(Object obj) {
        if (obj instanceof HttpsURLConnection) {
            return new b((HttpsURLConnection) obj, new l(), h.c(k.k()));
        }
        return obj instanceof HttpURLConnection ? new a((HttpURLConnection) obj, new l(), h.c(k.k())) : obj;
    }

    @Keep
    public static InputStream openStream(URL url) {
        return c(new n(url), k.k(), new l());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) {
        return b(new n(url), clsArr, k.k(), new l());
    }
}
