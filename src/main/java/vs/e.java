package vs;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f119787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f119788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f119789c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f119790d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b[] f119791a;

        public a(b... bVarArr) {
            this.f119791a = bVarArr;
        }

        public b a(int i11) {
            return this.f119791a[i11];
        }

        public int b() {
            return this.f119791a.length;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f119792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f119793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float[] f119794c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f119795d;

        public b(int i11, float[] fArr, float[] fArr2, int i12) {
            this.f119792a = i11;
            ts.a.a(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f119794c = fArr;
            this.f119795d = fArr2;
            this.f119793b = i12;
        }

        public int a() {
            return this.f119794c.length / 3;
        }
    }

    public e(a aVar, int i11) {
        this(aVar, aVar, i11);
    }

    public static e a(float f11, int i11, int i12, float f12, float f13, int i13) {
        int i14;
        int i15 = i11;
        ts.a.a(f11 > BitmapDescriptorFactory.HUE_RED);
        ts.a.a(i15 >= 1);
        ts.a.a(i12 >= 1);
        ts.a.a(f12 > BitmapDescriptorFactory.HUE_RED && f12 <= 180.0f);
        ts.a.a(f13 > BitmapDescriptorFactory.HUE_RED && f13 <= 360.0f);
        float radians = (float) Math.toRadians(f12);
        float radians2 = (float) Math.toRadians(f13);
        float f14 = radians / i15;
        float f15 = radians2 / i12;
        int i16 = i12 + 1;
        int i17 = ((i16 * 2) + 2) * i15;
        float[] fArr = new float[i17 * 3];
        float[] fArr2 = new float[i17 * 2];
        int i18 = 0;
        int i19 = 0;
        int i21 = 0;
        while (i18 < i15) {
            float f16 = radians / 2.0f;
            float f17 = (i18 * f14) - f16;
            int i22 = i18 + 1;
            float f18 = (i22 * f14) - f16;
            int i23 = 0;
            while (i23 < i16) {
                float f19 = radians;
                float f21 = radians2;
                int i24 = 0;
                int i25 = 2;
                while (i24 < i25) {
                    float f22 = f14;
                    float f23 = i23 * f15;
                    float f24 = f15;
                    float f25 = f17;
                    double d11 = f11;
                    double d12 = (f23 + 3.1415927f) - (f21 / 2.0f);
                    double d13 = i24 == 0 ? f17 : f18;
                    fArr[i19] = -((float) (Math.cos(d13) * Math.sin(d12) * d11));
                    fArr[i19 + 1] = (float) (d11 * Math.sin(d13));
                    int i26 = i19 + 3;
                    fArr[i19 + 2] = (float) (d11 * Math.cos(d12) * Math.cos(d13));
                    fArr2[i21] = f23 / f21;
                    int i27 = i21 + 2;
                    fArr2[i21 + 1] = ((i18 + i24) * f22) / f19;
                    if ((i23 == 0 && i24 == 0) || (i23 == i12 && i24 == 1)) {
                        System.arraycopy(fArr, i19, fArr, i26, 3);
                        i19 += 6;
                        i14 = 2;
                        System.arraycopy(fArr2, i21, fArr2, i27, 2);
                        i21 += 4;
                    } else {
                        i14 = 2;
                        i19 = i26;
                        i21 = i27;
                    }
                    i24++;
                    i25 = i14;
                    f14 = f22;
                    f15 = f24;
                    f17 = f25;
                }
                i23++;
                radians2 = f21;
                radians = f19;
                f14 = f14;
            }
            i15 = i11;
            i18 = i22;
        }
        return new e(new a(new b(0, fArr, fArr2, 1)), i13);
    }

    public static e b(int i11) {
        return a(50.0f, 36, 72, 180.0f, 360.0f, i11);
    }

    public e(a aVar, a aVar2, int i11) {
        this.f119787a = aVar;
        this.f119788b = aVar2;
        this.f119789c = i11;
        this.f119790d = aVar == aVar2;
    }
}
