package u0;

/* JADX INFO: loaded from: classes.dex */
final class d extends q {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f115212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f115213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f115214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f115215j;

    d(int i11, int i12, int i13, String str) {
        this.f115212g = i11;
        this.f115213h = i12;
        this.f115214i = i13;
        if (str == null) {
            throw new NullPointerException("Null description");
        }
        this.f115215j = str;
    }

    @Override // u0.q
    String e() {
        return this.f115215j;
    }

    @Override // u0.q
    public int f() {
        return this.f115212g;
    }

    @Override // u0.q
    int g() {
        return this.f115213h;
    }

    @Override // u0.q
    int h() {
        return this.f115214i;
    }
}
