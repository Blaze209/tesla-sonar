package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class c1 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p0 f8048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f8049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object[] f8050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8051d;

    c1(p0 p0Var, String str, Object[] objArr) {
        this.f8048a = p0Var;
        this.f8049b = str;
        this.f8050c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f8051d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char cCharAt2 = str.charAt(i13);
            if (cCharAt2 < 55296) {
                this.f8051d = i11 | (cCharAt2 << i12);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i13 = i14;
            }
        }
    }

    Object[] a() {
        return this.f8050c;
    }

    String b() {
        return this.f8049b;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public p0 getDefaultInstance() {
        return this.f8048a;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public z0 getSyntax() {
        int i11 = this.f8051d;
        if ((i11 & 1) != 0) {
            return z0.PROTO2;
        }
        return (i11 & 4) == 4 ? z0.EDITIONS : z0.PROTO3;
    }

    @Override // androidx.datastore.preferences.protobuf.n0
    public boolean isMessageSetWireFormat() {
        return (this.f8051d & 2) == 2;
    }
}
