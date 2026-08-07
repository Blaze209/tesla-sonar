package hx;

import jx.n;

/* JADX INFO: loaded from: classes5.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f73683a;

    protected void a() {
        h hVar = this.f73683a;
        if (!(hVar instanceof n)) {
            throw new UnsupportedOperationException("Stored renderer is not a KmlRenderer");
        }
        ((n) hVar).q0();
    }

    protected Iterable<jx.b> b() {
        h hVar = this.f73683a;
        if (hVar instanceof n) {
            return ((n) hVar).w0();
        }
        return null;
    }

    protected void c(h hVar) {
        this.f73683a = hVar;
    }
}
