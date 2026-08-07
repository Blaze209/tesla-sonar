package androidx.media3.exoplayer.drm;

import android.net.Uri;
import com.google.common.collect.d1;
import java.util.Map;
import p7.y;

/* JADX INFO: loaded from: classes.dex */
public final class g implements e8.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9795a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private y.f f9796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f9797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.media3.datasource.a.InterfaceC0192a f9798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private androidx.media3.exoplayer.upstream.b f9800f;

    private i b(y.f fVar) {
        androidx.media3.datasource.a.InterfaceC0192a interfaceC0192aC = this.f9798d;
        if (interfaceC0192aC == null) {
            interfaceC0192aC = new androidx.media3.datasource.d.b().c(this.f9799e);
        }
        Uri uri = fVar.f101742c;
        o oVar = new o(uri == null ? null : uri.toString(), fVar.f101747h, interfaceC0192aC);
        d1<Map.Entry<String, String>> it = fVar.f101744e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            oVar.c(next.getKey(), next.getValue());
        }
        DefaultDrmSessionManager.b bVarF = new DefaultDrmSessionManager.b().g(fVar.f101740a, n.f9814d).d(fVar.f101745f).e(fVar.f101746g).f(ru.f.n(fVar.f101749j));
        androidx.media3.exoplayer.upstream.b bVar = this.f9800f;
        if (bVar != null) {
            bVarF.c(bVar);
        }
        DefaultDrmSessionManager defaultDrmSessionManagerA = bVarF.a(oVar);
        defaultDrmSessionManagerA.F(0, fVar.d());
        return defaultDrmSessionManagerA;
    }

    @Override // e8.k
    public i a(y yVar) {
        i iVar;
        s7.a.f(yVar.f101682b);
        y.f fVar = yVar.f101682b.f101785c;
        if (fVar == null) {
            return i.f9806a;
        }
        synchronized (this.f9795a) {
            try {
                if (!fVar.equals(this.f9796b)) {
                    this.f9796b = fVar;
                    this.f9797c = b(fVar);
                }
                iVar = (i) s7.a.f(this.f9797c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }
}
