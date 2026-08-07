package u0;

import androidx.annotation.NonNull;
import androidx.camera.extensions.impl.ExtensionVersionImpl;
import c0.y0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile h f115228a;

    private static class a extends h {
        a() {
        }

        @Override // u0.h
        q c() {
            return null;
        }

        @Override // u0.h
        boolean e() {
            return false;
        }
    }

    private static class b extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static ExtensionVersionImpl f115229c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private q f115230b;

        b() {
            if (f115229c == null) {
                f115229c = new ExtensionVersionImpl();
            }
            q qVarI = q.i(f115229c.checkApiVersion(g.a().e()));
            if (qVarI != null && g.a().b().f() == qVarI.f()) {
                this.f115230b = qVarI;
            }
            y0.a("ExtenderVersion", "Selected vendor runtime: " + this.f115230b);
        }

        @Override // u0.h
        q c() {
            return this.f115230b;
        }

        @Override // u0.h
        boolean e() {
            try {
                return f115229c.isAdvancedExtenderImplemented();
            } catch (NoSuchMethodError unused) {
                return false;
            }
        }
    }

    private static h a() {
        if (f115228a != null) {
            return f115228a;
        }
        synchronized (h.class) {
            if (f115228a == null) {
                try {
                    f115228a = new b();
                } catch (NoClassDefFoundError unused) {
                    y0.a("ExtenderVersion", "No versioning extender found. Falling back to default.");
                    f115228a = new a();
                }
            }
        }
        return f115228a;
    }

    public static q b() {
        return a().c();
    }

    public static boolean d() {
        return a().e();
    }

    public static boolean f(@NonNull q qVar) {
        return b().a(qVar.f(), qVar.g()) <= 0;
    }

    public static boolean g(@NonNull q qVar) {
        return b().a(qVar.f(), qVar.g()) >= 0;
    }

    abstract q c();

    abstract boolean e();
}
