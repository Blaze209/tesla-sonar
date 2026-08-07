package gs;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class n extends fr.f implements i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f69536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f69537e;

    @Override // gs.i
    public long a(int i11) {
        return ((i) ts.a.e(this.f69536d)).a(i11) + this.f69537e;
    }

    @Override // gs.i
    public int b() {
        return ((i) ts.a.e(this.f69536d)).b();
    }

    @Override // gs.i
    public int c(long j11) {
        return ((i) ts.a.e(this.f69536d)).c(j11 - this.f69537e);
    }

    @Override // gs.i
    public List<b> d(long j11) {
        return ((i) ts.a.e(this.f69536d)).d(j11 - this.f69537e);
    }

    @Override // fr.a
    public void f() {
        super.f();
        this.f69536d = null;
    }

    public void q(long j11, i iVar, long j12) {
        this.f66354b = j11;
        this.f69536d = iVar;
        if (j12 != Long.MAX_VALUE) {
            j11 = j12;
        }
        this.f69537e = j11;
    }
}
