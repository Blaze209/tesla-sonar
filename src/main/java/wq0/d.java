package wq0;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final ExecutorService f122283m = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f122288e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    boolean f122290g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f122291h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    List<xq0.b> f122293j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    f f122294k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    g f122295l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f122284a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f122285b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f122286c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f122287d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f122289f = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ExecutorService f122292i = f122283m;

    d() {
    }

    Object a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    f b() {
        f fVar = this.f122294k;
        if (fVar != null) {
            return fVar;
        }
        return (!f.a.c() || a() == null) ? new f.b() : new f.a("EventBus");
    }

    g c() {
        Object objA;
        g gVar = this.f122295l;
        if (gVar != null) {
            return gVar;
        }
        if (!f.a.c() || (objA = a()) == null) {
            return null;
        }
        return new g.a((Looper) objA);
    }
}
