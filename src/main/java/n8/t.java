package n8;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public interface t {

    public static class a implements t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Random f93594a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f93595b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f93596c;

        public a(int i11) {
            this(i11, new Random());
        }

        private static int[] i(int i11, Random random) {
            int[] iArr = new int[i11];
            int i12 = 0;
            while (i12 < i11) {
                int i13 = i12 + 1;
                int iNextInt = random.nextInt(i13);
                iArr[i12] = iArr[iNextInt];
                iArr[iNextInt] = i12;
                i12 = i13;
            }
            return iArr;
        }

        @Override // n8.t
        public int a(int i11) {
            int i12 = this.f93596c[i11] - 1;
            if (i12 >= 0) {
                return this.f93595b[i12];
            }
            return -1;
        }

        @Override // n8.t
        public int b(int i11) {
            int i12 = this.f93596c[i11] + 1;
            int[] iArr = this.f93595b;
            if (i12 < iArr.length) {
                return iArr[i12];
            }
            return -1;
        }

        @Override // n8.t
        public int c() {
            int[] iArr = this.f93595b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // n8.t
        public t d() {
            return new a(0, new Random(this.f93594a.nextLong()));
        }

        @Override // n8.t
        public int e() {
            int[] iArr = this.f93595b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // n8.t
        public t f(int i11, int i12) {
            int i13 = i12 - i11;
            int[] iArr = new int[this.f93595b.length - i13];
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int[] iArr2 = this.f93595b;
                if (i14 >= iArr2.length) {
                    return new a(iArr, new Random(this.f93594a.nextLong()));
                }
                int i16 = iArr2[i14];
                if (i16 < i11 || i16 >= i12) {
                    int i17 = i14 - i15;
                    if (i16 >= i11) {
                        i16 -= i13;
                    }
                    iArr[i17] = i16;
                } else {
                    i15++;
                }
                i14++;
            }
        }

        @Override // n8.t
        public t g(int i11, int i12) {
            int[] iArr = new int[i12];
            int[] iArr2 = new int[i12];
            int i13 = 0;
            int i14 = 0;
            while (i14 < i12) {
                iArr[i14] = this.f93594a.nextInt(this.f93595b.length + 1);
                int i15 = i14 + 1;
                int iNextInt = this.f93594a.nextInt(i15);
                iArr2[i14] = iArr2[iNextInt];
                iArr2[iNextInt] = i14 + i11;
                i14 = i15;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f93595b.length + i12];
            int i16 = 0;
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f93595b;
                if (i13 >= iArr4.length + i12) {
                    return new a(iArr3, new Random(this.f93594a.nextLong()));
                }
                if (i16 >= i12 || i17 != iArr[i16]) {
                    int i18 = i17 + 1;
                    int i19 = iArr4[i17];
                    iArr3[i13] = i19;
                    if (i19 >= i11) {
                        iArr3[i13] = i19 + i12;
                    }
                    i17 = i18;
                } else {
                    iArr3[i13] = iArr2[i16];
                    i16++;
                }
                i13++;
            }
        }

        @Override // n8.t
        public int getLength() {
            return this.f93595b.length;
        }

        private a(int i11, Random random) {
            this(i(i11, random), random);
        }

        private a(int[] iArr, Random random) {
            this.f93595b = iArr;
            this.f93594a = random;
            this.f93596c = new int[iArr.length];
            for (int i11 = 0; i11 < iArr.length; i11++) {
                this.f93596c[iArr[i11]] = i11;
            }
        }
    }

    int a(int i11);

    int b(int i11);

    int c();

    t d();

    int e();

    t f(int i11, int i12);

    t g(int i11, int i12);

    int getLength();

    default t h(int i11, int i12, int i13) {
        return this;
    }
}
