package k5;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.collection.x;
import c0.h0;
import ch.qos.logback.core.CoreConstants;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f84933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final x<String, Typeface> f84934b;

    public static class a extends r5.g.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private j5.h.f f84935a;

        public a(j5.h.f fVar) {
            this.f84935a = fVar;
        }

        @Override // r5.g.c
        public void a(int i11) {
            j5.h.f fVar = this.f84935a;
            if (fVar != null) {
                fVar.f(i11);
            }
        }

        @Override // r5.g.c
        public void b(Typeface typeface) {
            j5.h.f fVar = this.f84935a;
            if (fVar != null) {
                fVar.g(typeface);
            }
        }
    }

    static {
        eb.a.c("TypefaceCompat static init");
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29) {
            f84933a = new m();
        } else if (i11 >= 28) {
            f84933a = new l();
        } else if (i11 >= 26) {
            f84933a = new k();
        } else if (j.k()) {
            f84933a = new j();
        } else {
            f84933a = new i();
        }
        f84934b = new x<>(16);
        eb.a.f();
    }

    public static Typeface a(Context context, Typeface typeface, int i11) {
        if (context != null) {
            return Typeface.create(typeface, i11);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, r5.g.b[] bVarArr, int i11) {
        eb.a.c("TypefaceCompat.createFromFontInfo");
        try {
            return f84933a.b(context, cancellationSignal, bVarArr, i11);
        } finally {
            eb.a.f();
        }
    }

    public static Typeface c(Context context, CancellationSignal cancellationSignal, List<r5.g.b[]> list, int i11) {
        eb.a.c("TypefaceCompat.createFromFontInfoWithFallback");
        try {
            return f84933a.c(context, cancellationSignal, list, i11);
        } finally {
            eb.a.f();
        }
    }

    public static Typeface d(Context context, j5.e.b bVar, Resources resources, int i11, String str, int i12, int i13, j5.h.f fVar, Handler handler, boolean z11) {
        Typeface typefaceA;
        if (bVar instanceof j5.e.C1726e) {
            j5.e.C1726e c1726e = (j5.e.C1726e) bVar;
            Typeface typefaceH = h(c1726e.d());
            if (typefaceH != null) {
                if (fVar != null) {
                    fVar.d(typefaceH, handler);
                }
                return typefaceH;
            }
            typefaceA = r5.g.c(context, c1726e.a() != null ? h0.a(new Object[]{c1726e.c(), c1726e.a()}) : h0.a(new Object[]{c1726e.c()}), i13, !z11 ? fVar != null : c1726e.b() != 0, z11 ? c1726e.e() : -1, j5.h.f.e(handler), new a(fVar));
        } else {
            typefaceA = f84933a.a(context, (j5.e.c) bVar, resources, i13);
            if (fVar != null) {
                if (typefaceA != null) {
                    fVar.d(typefaceA, handler);
                } else {
                    fVar.c(-3, handler);
                }
            }
        }
        if (typefaceA != null) {
            f84934b.put(f(resources, i11, str, i12, i13), typefaceA);
        }
        return typefaceA;
    }

    public static Typeface e(Context context, Resources resources, int i11, String str, int i12, int i13) {
        Typeface typefaceE = f84933a.e(context, resources, i11, str, i13);
        if (typefaceE != null) {
            f84934b.put(f(resources, i11, str, i12, i13), typefaceE);
        }
        return typefaceE;
    }

    private static String f(Resources resources, int i11, String str, int i12, int i13) {
        return resources.getResourcePackageName(i11) + CoreConstants.DASH_CHAR + str + CoreConstants.DASH_CHAR + i12 + CoreConstants.DASH_CHAR + i11 + CoreConstants.DASH_CHAR + i13;
    }

    public static Typeface g(Resources resources, int i11, String str, int i12, int i13) {
        return f84934b.get(f(resources, i11, str, i12, i13));
    }

    private static Typeface h(String str) {
        if (str != null && !str.isEmpty()) {
            Typeface typefaceCreate = Typeface.create(str, 0);
            Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
            if (typefaceCreate != null && !typefaceCreate.equals(typefaceCreate2)) {
                return typefaceCreate;
            }
        }
        return null;
    }
}
