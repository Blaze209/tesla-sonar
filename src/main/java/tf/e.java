package tf;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f113298a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f113299b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f113300c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f113301d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static eg.f f113303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static eg.e f113304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile eg.h f113305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static volatile eg.g f113306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ThreadLocal<hg.g> f113307j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f113302e = a.AUTOMATIC;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static yf.b f113308k = new yf.c();

    public static /* synthetic */ File a(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static void b(String str) {
        if (f113299b) {
            g().a(str);
        }
    }

    public static float c(String str) {
        return !f113299b ? BitmapDescriptorFactory.HUE_RED : g().b(str);
    }

    public static a d() {
        return f113302e;
    }

    public static boolean e() {
        return f113301d;
    }

    public static yf.b f() {
        return f113308k;
    }

    private static hg.g g() {
        hg.g gVar = f113307j.get();
        if (gVar != null) {
            return gVar;
        }
        hg.g gVar2 = new hg.g();
        f113307j.set(gVar2);
        return gVar2;
    }

    public static boolean h() {
        return f113299b;
    }

    public static eg.g i(@NonNull Context context) {
        eg.g gVar;
        if (!f113300c) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        eg.g gVar2 = f113306i;
        if (gVar2 != null) {
            return gVar2;
        }
        synchronized (eg.g.class) {
            try {
                gVar = f113306i;
                if (gVar == null) {
                    eg.e eVar = f113304g;
                    if (eVar == null) {
                        eVar = new eg.e() { // from class: tf.d
                            @Override // eg.e
                            public final File a() {
                                return e.a(applicationContext);
                            }
                        };
                    }
                    gVar = new eg.g(eVar);
                    f113306i = gVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    @NonNull
    public static eg.h j(@NonNull Context context) {
        eg.h hVar;
        eg.h hVar2 = f113305h;
        if (hVar2 != null) {
            return hVar2;
        }
        synchronized (eg.h.class) {
            try {
                hVar = f113305h;
                if (hVar == null) {
                    eg.g gVarI = i(context);
                    eg.f bVar = f113303f;
                    if (bVar == null) {
                        bVar = new eg.b();
                    }
                    hVar = new eg.h(gVarI, bVar);
                    f113305h = hVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hVar;
    }
}
