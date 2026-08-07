package q9;

import org.spongycastle.asn1.cmp.PKIFailureInfo;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f104976a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f104977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f104978c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f104979d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f104980e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f104981f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f104982g;

        private b(long[] jArr, int[] iArr, int i11, long[] jArr2, int[] iArr2, long j11, long j12) {
            this.f104976a = jArr;
            this.f104977b = iArr;
            this.f104978c = i11;
            this.f104979d = jArr2;
            this.f104980e = iArr2;
            this.f104981f = j11;
            this.f104982g = j12;
        }
    }

    public static b a(int i11, long[] jArr, int[] iArr, long j11) {
        int[] iArr2 = iArr;
        int i12 = PKIFailureInfo.certRevoked / i11;
        int i13 = 0;
        int iN = 0;
        for (int i14 : iArr2) {
            iN += q0.n(i14, i12);
        }
        long[] jArr2 = new long[iN];
        int[] iArr3 = new int[iN];
        long[] jArr3 = new long[iN];
        int[] iArr4 = new int[iN];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int iMax = 0;
        while (i13 < iArr2.length) {
            int i18 = iArr2[i13];
            long j12 = jArr[i13];
            while (i18 > 0) {
                int iMin = Math.min(i12, i18);
                jArr2[i17] = j12;
                int i19 = i11 * iMin;
                iArr3[i17] = i19;
                i16 += i19;
                iMax = Math.max(iMax, i19);
                jArr3[i17] = ((long) i15) * j11;
                iArr4[i17] = 1;
                j12 += (long) iArr3[i17];
                i15 += iMin;
                i18 -= iMin;
                i17++;
                i12 = i12;
            }
            i13++;
            iArr2 = iArr;
        }
        return new b(jArr2, iArr3, iMax, jArr3, iArr4, j11 * ((long) i15), i16);
    }
}
