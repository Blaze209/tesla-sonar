package nm;

import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public class p implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static p f95182a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f95183b = false;

    protected p() {
    }

    public static synchronized p f() {
        try {
            if (f95182a == null) {
                f95182a = new p();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f95182a;
    }

    @Override // nm.k
    public jk.d a(com.facebook.imagepipeline.request.a aVar, Object obj) {
        jk.d dVar;
        String name;
        an.b bVarL = aVar.l();
        if (bVarL != null) {
            jk.d dVarA = bVarL.a();
            name = bVarL.getClass().getName();
            dVar = dVarA;
        } else {
            dVar = null;
            name = null;
        }
        BitmapMemoryCacheKey bitmapMemoryCacheKey = new BitmapMemoryCacheKey(e(aVar.v()).toString(), aVar.r(), aVar.t(), aVar.h(), dVar, name);
        if (f95183b) {
            bitmapMemoryCacheKey.d(null);
            return bitmapMemoryCacheKey;
        }
        bitmapMemoryCacheKey.d(obj);
        return bitmapMemoryCacheKey;
    }

    @Override // nm.k
    public jk.d b(com.facebook.imagepipeline.request.a aVar, Object obj) {
        return d(aVar, aVar.v(), obj);
    }

    @Override // nm.k
    public jk.d c(com.facebook.imagepipeline.request.a aVar, Object obj) {
        BitmapMemoryCacheKey bitmapMemoryCacheKey = new BitmapMemoryCacheKey(e(aVar.v()).toString(), aVar.r(), aVar.t(), aVar.h(), null, null);
        if (f95183b) {
            bitmapMemoryCacheKey.d(null);
            return bitmapMemoryCacheKey;
        }
        bitmapMemoryCacheKey.d(obj);
        return bitmapMemoryCacheKey;
    }

    @Override // nm.k
    public jk.d d(com.facebook.imagepipeline.request.a aVar, Uri uri, Object obj) {
        return new jk.i(e(uri).toString());
    }

    protected Uri e(Uri uri) {
        return uri;
    }
}
