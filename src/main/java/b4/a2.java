package b4;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lb4/a2;", "Lr2/a;", "Lb4/g0;", "root", "<init>", "(Lb4/g0;)V", "", "index", "instance", "Ljn0/h0;", "n", "(ILb4/g0;)V", "m", "count", "a", "(II)V", "from", "to", "e", "(III)V", "k", "()V", "c", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a2 extends p020r2.a<g0> {
    public a2(g0 g0Var) {
        super(g0Var);
    }

    @Override // p020r2.f
    public void a(int index, int count) {
        b().n1(index, count);
    }

    @Override // p020r2.f
    public void c() {
        super.c();
        j1 owner = j().getOwner();
        if (owner != null) {
            owner.l();
        }
    }

    @Override // p020r2.f
    public void e(int from, int to2, int count) {
        b().e1(from, to2, count);
    }

    @Override // p020r2.a
    protected void k() {
        j().m1();
    }

    @Override // p020r2.f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void g(int index, g0 instance) {
        b().B0(index, instance);
    }

    @Override // p020r2.f
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void f(int index, g0 instance) {
    }
}
