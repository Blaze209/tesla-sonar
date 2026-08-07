package pw;

import androidx.annotation.NonNull;
import com.google.firebase.perf.v1.PerfMetric;

/* JADX INFO: loaded from: classes5.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final kw.a f104013d = kw.a.e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f104014a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yv.b<nq.j> f104015b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private nq.i<PerfMetric> f104016c;

    b(yv.b<nq.j> bVar, String str) {
        this.f104014a = str;
        this.f104015b = bVar;
    }

    private boolean a() {
        if (this.f104016c == null) {
            nq.j jVar = this.f104015b.get();
            if (jVar != null) {
                this.f104016c = jVar.a(this.f104014a, PerfMetric.class, nq.c.b("proto"), new nq.h() { // from class: pw.a
                    @Override // nq.h
                    public final Object apply(Object obj) {
                        return ((PerfMetric) obj).toByteArray();
                    }
                });
            } else {
                f104013d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f104016c != null;
    }

    public void b(@NonNull PerfMetric perfMetric) {
        if (a()) {
            this.f104016c.a(nq.d.f(perfMetric));
        } else {
            f104013d.j("Unable to dispatch event because Flg Transport is not available");
        }
    }
}
