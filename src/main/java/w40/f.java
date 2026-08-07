package w40;

import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements d.InterfaceC2577d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f120804a;

    f(e eVar) {
        this.f120804a = eVar;
    }

    public static i<d.InterfaceC2577d> b(e eVar) {
        return qj0.f.a(new f(eVar));
    }

    @Override // w40.d.InterfaceC2577d
    public d a(ExitState exitState) {
        return this.f120804a.b(exitState);
    }
}
