package k50;

import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements d.InterfaceC1799d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f85058a;

    f(e eVar) {
        this.f85058a = eVar;
    }

    public static i<d.InterfaceC1799d> b(e eVar) {
        return qj0.f.a(new f(eVar));
    }

    @Override // k50.d.InterfaceC1799d
    public d a(SuccessState successState) {
        return this.f85058a.b(successState);
    }
}
