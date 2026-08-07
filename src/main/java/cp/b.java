package cp;

import com.facebook.soloader.d0;
import com.facebook.soloader.w;
import dp.h;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference<a[]> f58899a = new AtomicReference<>();

    public static void a(Throwable th2) {
        a[] aVarArr = f58899a.get();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.l(th2);
            }
        }
    }

    public static void b() {
        a[] aVarArr = f58899a.get();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.j();
            }
        }
    }

    public static void c(Throwable th2, boolean z11) {
        a[] aVarArr = f58899a.get();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.g(th2, z11);
            }
        }
    }

    public static void d(String str, int i11) {
        a[] aVarArr = f58899a.get();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.i(str, i11);
            }
        }
    }

    public static void e(Throwable th2, boolean z11) {
        a[] aVarArr = f58899a.get();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.k(th2, z11);
            }
        }
    }

    public static void f(String str, String str2, int i11) {
        a[] aVarArr = f58899a.get();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.d(str, str2, i11);
            }
        }
    }

    public static void g(Throwable th2) {
        a[] aVarArr = f58899a.get();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.f(th2);
            }
        }
    }

    public static void h(h hVar) {
        a[] aVarArr = f58899a.get();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.a(hVar);
            }
        }
    }

    public static void i(Throwable th2) {
        a[] aVarArr = f58899a.get();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.e(th2);
            }
        }
    }

    public static void j(w wVar, String str, int i11) {
        a[] aVarArr = f58899a.get();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.c(wVar, str, i11);
            }
        }
    }

    public static void k(Throwable th2) {
        a[] aVarArr = f58899a.get();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.b(th2);
            }
        }
    }

    public static void l(d0 d0Var) {
        a[] aVarArr = f58899a.get();
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                aVar.h(d0Var);
            }
        }
    }
}
