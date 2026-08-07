package q9;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f105075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f105076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f105077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f105078d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f105079e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f105080f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p7.u f105081g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f105082h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long[] f105083i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long[] f105084j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f105085k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final u[] f105086l;

    public t(int i11, int i12, long j11, long j12, long j13, long j14, p7.u uVar, int i13, u[] uVarArr, int i14, long[] jArr, long[] jArr2) {
        this.f105075a = i11;
        this.f105076b = i12;
        this.f105077c = j11;
        this.f105078d = j12;
        this.f105079e = j13;
        this.f105080f = j14;
        this.f105081g = uVar;
        this.f105082h = i13;
        this.f105086l = uVarArr;
        this.f105085k = i14;
        this.f105083i = jArr;
        this.f105084j = jArr2;
    }

    public t a(p7.u uVar) {
        return new t(this.f105075a, this.f105076b, this.f105077c, this.f105078d, this.f105079e, this.f105080f, uVar, this.f105082h, this.f105086l, this.f105085k, this.f105083i, this.f105084j);
    }

    public u b(int i11) {
        u[] uVarArr = this.f105086l;
        if (uVarArr == null) {
            return null;
        }
        return uVarArr[i11];
    }
}
