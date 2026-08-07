package v7;

import java.util.ArrayList;
import s7.q0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements androidx.media3.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f118083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<q> f118084b = new ArrayList<>(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f118085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f118086d;

    protected a(boolean z11) {
        this.f118083a = z11;
    }

    @Override // androidx.media3.datasource.a
    public final void n(q qVar) {
        s7.a.f(qVar);
        if (this.f118084b.contains(qVar)) {
            return;
        }
        this.f118084b.add(qVar);
        this.f118085c++;
    }

    protected final void o(int i11) {
        j jVar = (j) q0.l(this.f118086d);
        for (int i12 = 0; i12 < this.f118085c; i12++) {
            this.f118084b.get(i12).h(this, jVar, this.f118083a, i11);
        }
    }

    protected final void p() {
        j jVar = (j) q0.l(this.f118086d);
        for (int i11 = 0; i11 < this.f118085c; i11++) {
            this.f118084b.get(i11).f(this, jVar, this.f118083a);
        }
        this.f118086d = null;
    }

    protected final void q(j jVar) {
        for (int i11 = 0; i11 < this.f118085c; i11++) {
            this.f118084b.get(i11).b(this, jVar, this.f118083a);
        }
    }

    protected final void r(j jVar) {
        this.f118086d = jVar;
        for (int i11 = 0; i11 < this.f118085c; i11++) {
            this.f118084b.get(i11).i(this, jVar, this.f118083a);
        }
    }
}
