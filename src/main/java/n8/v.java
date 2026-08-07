package n8;

import p7.r0;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends androidx.media3.exoplayer.source.m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p7.y f93612f;

    public v(r0 r0Var, p7.y yVar) {
        super(r0Var);
        this.f93612f = yVar;
    }

    @Override // androidx.media3.exoplayer.source.m, p7.r0
    public r0.d s(int i11, r0.d dVar, long j11) {
        super.s(i11, dVar, j11);
        p7.y yVar = this.f93612f;
        dVar.f101483c = yVar;
        p7.y.h hVar = yVar.f101682b;
        dVar.f101482b = hVar != null ? hVar.f101791i : null;
        return dVar;
    }
}
