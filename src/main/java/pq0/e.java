package pq0;

import sq0.w;

/* JADX INFO: loaded from: classes10.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f103649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f103650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f103652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f103653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f103654f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f103655g = false;

    private e(w wVar, int i11, e eVar, f fVar, boolean z11) {
        this.f103649a = wVar;
        this.f103650b = i11;
        this.f103651c = z11;
        this.f103652d = eVar;
        this.f103653e = fVar;
    }

    public static e a(w wVar, int i11, e eVar, f fVar) {
        return new e(wVar, i11, eVar, fVar, true);
    }

    public static e b(w wVar, int i11, e eVar, f fVar) {
        return new e(wVar, i11, eVar, fVar, false);
    }
}
