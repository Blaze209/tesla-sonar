package ss;

import java.util.ArrayList;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class e implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f111647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<z> f111648b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f111649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private l f111650d;

    protected e(boolean z11) {
        this.f111647a = z11;
    }

    @Override // ss.i
    public final void m(z zVar) {
        ts.a.e(zVar);
        if (this.f111648b.contains(zVar)) {
            return;
        }
        this.f111648b.add(zVar);
        this.f111649c++;
    }

    protected final void n(int i11) {
        l lVar = (l) p0.j(this.f111650d);
        for (int i12 = 0; i12 < this.f111649c; i12++) {
            this.f111648b.get(i12).b(this, lVar, this.f111647a, i11);
        }
    }

    protected final void o() {
        l lVar = (l) p0.j(this.f111650d);
        for (int i11 = 0; i11 < this.f111649c; i11++) {
            this.f111648b.get(i11).c(this, lVar, this.f111647a);
        }
        this.f111650d = null;
    }

    protected final void p(l lVar) {
        for (int i11 = 0; i11 < this.f111649c; i11++) {
            this.f111648b.get(i11).f(this, lVar, this.f111647a);
        }
    }

    protected final void q(l lVar) {
        this.f111650d = lVar;
        for (int i11 = 0; i11 < this.f111649c; i11++) {
            this.f111648b.get(i11).e(this, lVar, this.f111647a);
        }
    }
}
