package lw;

import com.google.firebase.perf.util.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import pw.k;

/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final kw.a f90837f = kw.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f90838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f90839b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f90842e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f90841d = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, String> f90840c = new ConcurrentHashMap();

    public g(String str, String str2, k kVar, l lVar) {
        this.f90842e = false;
        this.f90839b = lVar;
        h hVarK = h.c(kVar).z(str).k(str2);
        this.f90838a = hVarK;
        hVarK.m();
        if (com.google.firebase.perf.config.a.g().K()) {
            return;
        }
        f90837f.g("HttpMetric feature is disabled. URL %s", str);
        this.f90842e = true;
    }

    public void a(int i11) {
        this.f90838a.l(i11);
    }

    public void b(long j11) {
        this.f90838a.r(j11);
    }

    public void c(String str) {
        this.f90838a.u(str);
    }

    public void d(long j11) {
        this.f90838a.v(j11);
    }

    public void e() {
        this.f90839b.g();
        this.f90838a.s(this.f90839b.e());
    }

    public void f() {
        if (this.f90842e) {
            return;
        }
        this.f90838a.x(this.f90839b.c()).j(this.f90840c).b();
        this.f90841d = true;
    }
}
