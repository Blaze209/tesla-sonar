package ly;

/* JADX INFO: loaded from: classes6.dex */
public enum a {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final a[] FOR_BITS;
    private final int bits;

    static {
        a aVar = L;
        a aVar2 = M;
        a aVar3 = Q;
        FOR_BITS = new a[]{aVar2, aVar, H, aVar3};
    }

    a(int i11) {
        this.bits = i11;
    }

    public static a forBits(int i11) {
        if (i11 >= 0) {
            a[] aVarArr = FOR_BITS;
            if (i11 < aVarArr.length) {
                return aVarArr[i11];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }
}
