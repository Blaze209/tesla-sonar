package t9;

import android.util.SparseArray;
import w8.j0;
import w8.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements w8.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w8.r f112986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q.a f112987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<t> f112988c = new SparseArray<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f112989d;

    public r(w8.r rVar, q.a aVar) {
        this.f112986a = rVar;
        this.f112987b = aVar;
    }

    @Override // w8.r
    public o0 b(int i11, int i12) {
        if (i12 != 3) {
            this.f112989d = true;
            return this.f112986a.b(i11, i12);
        }
        t tVar = this.f112988c.get(i11);
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this.f112986a.b(i11, i12), this.f112987b);
        this.f112988c.put(i11, tVar2);
        return tVar2;
    }

    @Override // w8.r
    public void j() {
        this.f112986a.j();
        if (this.f112989d) {
            for (int i11 = 0; i11 < this.f112988c.size(); i11++) {
                this.f112988c.valueAt(i11).k(true);
            }
        }
    }

    @Override // w8.r
    public void t(j0 j0Var) {
        this.f112986a.t(j0Var);
    }
}
