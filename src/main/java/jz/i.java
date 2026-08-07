package jz;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f84490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yz.c f84491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final yz.c f84492c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final yz.c f84493d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yz.c f84494e;

    public i(l lVar, yz.c cVar, yz.c cVar2, yz.c cVar3, yz.c cVar4) {
        this.f84490a = lVar;
        this.f84491b = cVar;
        this.f84492c = cVar2;
        if (cVar3 == null) {
            throw new IllegalArgumentException("The cipher text must not be null");
        }
        this.f84493d = cVar3;
        this.f84494e = cVar4;
    }

    public yz.c a() {
        return this.f84494e;
    }

    public yz.c b() {
        return this.f84493d;
    }

    public yz.c c() {
        return this.f84491b;
    }

    public l d() {
        return this.f84490a;
    }

    public yz.c e() {
        return this.f84492c;
    }
}
