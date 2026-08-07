package fo0;

import p013kotlin.Lazy;

/* JADX INFO: loaded from: classes9.dex */
class s2 implements wn0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t2 f66233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f66234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f66235c;

    public s2(t2 t2Var, int i11, Lazy lazy) {
        this.f66233a = t2Var;
        this.f66234b = i11;
        this.f66235c = lazy;
    }

    @Override // wn0.a
    public Object invoke() {
        return t2.p(this.f66233a, this.f66234b, this.f66235c);
    }
}
