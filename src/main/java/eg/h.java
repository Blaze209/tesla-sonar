package eg;

import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import tf.e0;
import tf.i;
import tf.u;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f62926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private final f f62927b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f62928a;

        static {
            int[] iArr = new int[c.values().length];
            f62928a = iArr;
            try {
                iArr[c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f62928a[c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(g gVar, @NonNull f fVar) {
        this.f62926a = gVar;
        this.f62927b = fVar;
    }

    private i a(Context context, @NonNull String str, String str2) {
        g gVar;
        Pair<c, InputStream> pairA;
        e0<i> e0VarL;
        if (str2 == null || (gVar = this.f62926a) == null || (pairA = gVar.a(str)) == null) {
            return null;
        }
        c cVar = (c) pairA.first;
        InputStream inputStream = (InputStream) pairA.second;
        int i11 = a.f62928a[cVar.ordinal()];
        if (i11 == 1) {
            e0VarL = u.L(context, new ZipInputStream(inputStream), str2);
        } else if (i11 != 2) {
            e0VarL = u.u(inputStream, str2);
        } else {
            try {
                e0VarL = u.u(new GZIPInputStream(inputStream), str2);
            } catch (IOException e11) {
                e0VarL = new e0<>(e11);
            }
        }
        if (e0VarL.b() != null) {
            return e0VarL.b();
        }
        return null;
    }

    @NonNull
    private e0<i> b(Context context, @NonNull String str, String str2) {
        e0<i> e0Var;
        hg.e.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d dVarA = this.f62927b.a(str);
                if (dVarA.isSuccessful()) {
                    e0Var = e(context, str, dVarA.p2(), dVarA.k2(), str2);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Completed fetch from network. Success: ");
                    sb2.append(e0Var.b() != null);
                    hg.e.a(sb2.toString());
                } else {
                    e0Var = new e0<>(new IllegalArgumentException(dVarA.g1()));
                }
                try {
                    dVarA.close();
                    return e0Var;
                } catch (IOException e11) {
                    hg.e.d("LottieFetchResult close failed ", e11);
                    return e0Var;
                }
            } catch (Exception e12) {
                e0<i> e0Var2 = new e0<>(e12);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e13) {
                        hg.e.d("LottieFetchResult close failed ", e13);
                    }
                }
                return e0Var2;
            }
        } catch (Throwable th2) {
            if (0 == 0) {
                throw th2;
            }
            try {
                closeable.close();
                throw th2;
            } catch (IOException e14) {
                hg.e.d("LottieFetchResult close failed ", e14);
                throw th2;
            }
        }
    }

    @NonNull
    private e0<i> d(@NonNull String str, @NonNull InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f62926a) == null) ? u.u(new GZIPInputStream(inputStream), null) : u.u(new GZIPInputStream(new FileInputStream(gVar.g(str, inputStream, c.GZIP))), str);
    }

    @NonNull
    private e0<i> e(Context context, @NonNull String str, @NonNull InputStream inputStream, String str2, String str3) {
        e0<i> e0VarG;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            hg.e.a("Handling zip response.");
            c cVar2 = c.ZIP;
            e0VarG = g(context, str, inputStream, str3);
            cVar = cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            hg.e.a("Handling gzip response.");
            cVar = c.GZIP;
            e0VarG = d(str, inputStream, str3);
        } else {
            hg.e.a("Received json response.");
            cVar = c.JSON;
            e0VarG = f(str, inputStream, str3);
        }
        if (str3 != null && e0VarG.b() != null && (gVar = this.f62926a) != null) {
            gVar.f(str, cVar);
        }
        return e0VarG;
    }

    @NonNull
    private e0<i> f(@NonNull String str, @NonNull InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f62926a) == null) ? u.u(inputStream, null) : u.u(new FileInputStream(gVar.g(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    @NonNull
    private e0<i> g(Context context, @NonNull String str, @NonNull InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f62926a) == null) ? u.L(context, new ZipInputStream(inputStream), null) : u.L(context, new ZipInputStream(new FileInputStream(gVar.g(str, inputStream, c.ZIP))), str);
    }

    @NonNull
    public e0<i> c(Context context, @NonNull String str, String str2) {
        i iVarA = a(context, str, str2);
        if (iVarA != null) {
            return new e0<>(iVarA);
        }
        hg.e.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}
