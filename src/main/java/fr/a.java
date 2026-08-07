package fr;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f66329a;

    public final void e(int i11) {
        this.f66329a = i11 | this.f66329a;
    }

    public void f() {
        this.f66329a = 0;
    }

    public final void g(int i11) {
        this.f66329a = (~i11) & this.f66329a;
    }

    protected final boolean h(int i11) {
        return (this.f66329a & i11) == i11;
    }

    public final boolean i() {
        return h(268435456);
    }

    public final boolean j() {
        return h(Integer.MIN_VALUE);
    }

    public final boolean k() {
        return h(4);
    }

    public final boolean l() {
        return h(134217728);
    }

    public final boolean m() {
        return h(1);
    }

    public final boolean n() {
        return h(PKIFailureInfo.duplicateCertReq);
    }

    public final void o(int i11) {
        this.f66329a = i11;
    }
}
