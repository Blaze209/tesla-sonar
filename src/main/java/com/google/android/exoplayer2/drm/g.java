package com.google.android.exoplayer2.drm;

import android.net.Uri;
import com.google.android.exoplayer2.x0;
import com.google.common.collect.d1;
import java.util.Map;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g implements gr.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f39815a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private x0.f f39816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f39817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ss.i.a f39818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f39819e;

    private j b(x0.f fVar) {
        ss.i.a aVarC = this.f39818d;
        if (aVarC == null) {
            aVarC = new ss.q.b().c(this.f39819e);
        }
        Uri uri = fVar.f41222c;
        p pVar = new p(uri == null ? null : uri.toString(), fVar.f41227h, aVarC);
        d1<Map.Entry<String, String>> it = fVar.f41224e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            pVar.e(next.getKey(), next.getValue());
        }
        DefaultDrmSessionManager defaultDrmSessionManagerA = new DefaultDrmSessionManager.b().e(fVar.f41220a, o.f39843d).b(fVar.f41225f).c(fVar.f41226g).d(ru.f.n(fVar.f41229j)).a(pVar);
        defaultDrmSessionManagerA.F(0, fVar.e());
        return defaultDrmSessionManagerA;
    }

    @Override // gr.k
    public j a(x0 x0Var) {
        j jVar;
        ts.a.e(x0Var.f41167b);
        x0.f fVar = x0Var.f41167b.f41266c;
        if (fVar == null || p0.f115040a < 18) {
            return j.f39834a;
        }
        synchronized (this.f39815a) {
            try {
                if (!p0.c(fVar, this.f39816b)) {
                    this.f39816b = fVar;
                    this.f39817c = b(fVar);
                }
                jVar = (j) ts.a.e(this.f39817c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jVar;
    }
}
