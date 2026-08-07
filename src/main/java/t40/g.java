package t40;

import qj0.i;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements d.InterfaceC2397d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f112480a;

    g(f fVar) {
        this.f112480a = fVar;
    }

    public static i<d.InterfaceC2397d> b(f fVar) {
        return qj0.f.a(new g(fVar));
    }

    @Override // t40.d.InterfaceC2397d
    public d a(ConsentState consentState) {
        return this.f112480a.b(consentState);
    }
}
