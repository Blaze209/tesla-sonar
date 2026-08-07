package el;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import pm.t;
import pm.u;
import pm.y;
import pm.z;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Class<?> f63037a = d.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f63038b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f63039c = false;

    private d() {
    }

    public static t a() {
        return b().j();
    }

    public static y b() {
        return y.l();
    }

    public static void c(Context context, u uVar, b bVar) {
        d(context, uVar, bVar, true);
    }

    public static void d(Context context, u uVar, b bVar, boolean z11) {
        if (bn.b.d()) {
            bn.b.a("Fresco#initialize");
        }
        if (f63039c) {
            qk.a.E(f63037a, "Fresco has already been initialized! `Fresco.initialize(...)` should only be called 1 single time to avoid memory leaks!");
        } else {
            f63039c = true;
        }
        z.b(z11);
        if (!bp.a.c()) {
            if (bn.b.d()) {
                bn.b.a("Fresco.initialize->SoLoader.init");
            }
            try {
                Class.forName("com.facebook.imagepipeline.nativecode.NativeCodeInitializer").getMethod("init", Context.class).invoke(null, context);
            } catch (IllegalAccessException unused) {
                bp.a.b(new bp.c());
            } catch (InvocationTargetException unused2) {
                bp.a.b(new bp.c());
            } catch (ClassNotFoundException unused3) {
                bp.a.b(new bp.c());
            } catch (NoSuchMethodException unused4) {
                bp.a.b(new bp.c());
            } finally {
                if (bn.b.d()) {
                    bn.b.b();
                }
            }
        }
        Context applicationContext = context.getApplicationContext();
        if (uVar == null) {
            y.s(applicationContext);
        } else {
            y.t(uVar);
        }
        e(applicationContext, bVar);
        if (bn.b.d()) {
            bn.b.b();
        }
    }

    private static void e(Context context, b bVar) {
        if (bn.b.d()) {
            bn.b.a("Fresco.initializeDrawee");
        }
        g gVar = new g(context, bVar);
        f63038b = gVar;
        pl.e.i(gVar);
        if (bn.b.d()) {
            bn.b.b();
        }
    }

    public static f f() {
        return f63038b.get();
    }
}
