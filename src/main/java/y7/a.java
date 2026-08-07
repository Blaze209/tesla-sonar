package y7;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f125180a;

    public final void e(int i11) {
        this.f125180a = i11 | this.f125180a;
    }

    public void f() {
        this.f125180a = 0;
    }

    protected final boolean g(int i11) {
        return (this.f125180a & i11) == i11;
    }

    public final boolean h() {
        return g(268435456);
    }

    public final boolean i() {
        return g(4);
    }

    public final boolean j() {
        return g(134217728);
    }

    public final boolean k() {
        return g(1);
    }

    public final boolean l() {
        return g(PKIFailureInfo.duplicateCertReq);
    }

    public final boolean m() {
        return g(67108864);
    }

    public final void n(int i11) {
        this.f125180a = i11;
    }
}
