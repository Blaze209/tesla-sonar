package k5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private ConcurrentHashMap<Long, j5.e.c> f84952a = new ConcurrentHashMap<>();

    class a implements b<r5.g.b> {
        a() {
        }

        @Override // k5.n.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int a(r5.g.b bVar) {
            return bVar.e();
        }

        @Override // k5.n.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean b(r5.g.b bVar) {
            return bVar.f();
        }
    }

    private interface b<T> {
        int a(T t11);

        boolean b(T t11);
    }

    n() {
    }

    private static <T> T f(T[] tArr, int i11, b<T> bVar) {
        return (T) g(tArr, (i11 & 1) == 0 ? 400 : 700, (i11 & 2) != 0, bVar);
    }

    private static <T> T g(T[] tArr, int i11, boolean z11, b<T> bVar) {
        T t11 = null;
        int i12 = Integer.MAX_VALUE;
        for (T t12 : tArr) {
            int iAbs = (Math.abs(bVar.a(t12) - i11) * 2) + (bVar.b(t12) == z11 ? 0 : 1);
            if (t11 == null || i12 > iAbs) {
                t11 = t12;
                i12 = iAbs;
            }
        }
        return t11;
    }

    public Typeface a(Context context, j5.e.c cVar, Resources resources, int i11) {
        throw null;
    }

    public Typeface b(Context context, CancellationSignal cancellationSignal, r5.g.b[] bVarArr, int i11) {
        throw null;
    }

    public Typeface c(Context context, CancellationSignal cancellationSignal, List<r5.g.b[]> list, int i11) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface d(Context context, InputStream inputStream) {
        File fileE = o.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (o.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface e(Context context, Resources resources, int i11, String str, int i12) {
        File fileE = o.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (o.c(fileE, resources, i11)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected r5.g.b h(r5.g.b[] bVarArr, int i11) {
        return (r5.g.b) f(bVarArr, i11, new a());
    }
}
