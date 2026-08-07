package p019p1;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0002\u000e\u0010B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015¨\u0006\u0018"}, d2 = {"Lp1/u;", "", "", "arcModes", "", "timePoints", "", "y", "<init>", "([I[F[[F)V", "", "time", "v", "Ljn0/h0;", "a", "(F[F)V", "b", "Lp1/u$a;", "[[Lp1/u$a;", "arcs", "", "Z", "isExtrapolate", "c", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f100620d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a[][] arcs;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean isExtrapolate = true;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u0000 82\u00020\u0001:\u0001\u001fBA\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0017J\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u000fJ\u0015\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u000fJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0017J\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 R\u0016\u0010$\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0014\u0010+\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010.\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010 R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010 R\u0014\u00100\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010 R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u00107\u001a\u0002018\u0006¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b-\u00106¨\u00069"}, d2 = {"Lp1/u$a;", "", "", "mode", "", "time1", "time2", "x1", "y1", "x2", "y2", "<init>", "(IFFFFFF)V", "v", "o", "(F)F", "Ljn0/h0;", "c", "(FFFF)V", "time", "p", "(F)V", "f", "()F", "g", DateTokenConverter.CONVERTER_KEY, "e", "j", "k", "h", IntegerTokenConverter.CONVERTER_KEY, "a", Gender.FEMALE, "l", "b", "m", "arcDistance", "tmpSinAngle", "tmpCosAngle", "", "[F", "lut", "oneOverDeltaTime", "ellipseA", "ellipseB", "n", "ellipseCenterX", "ellipseCenterY", "arcVelocity", "", "q", "Z", "isVertical", "r", "()Z", "isLinear", "s", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final int f100624t = 8;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private static float[] f100625u;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float time1;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final float time2;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float x1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final float y1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final float x2;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final float y2;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private float arcDistance;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private float tmpSinAngle;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private float tmpCosAngle;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final float[] lut;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final float oneOverDeltaTime;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final float ellipseA;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private final float ellipseB;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final float ellipseCenterX;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final float ellipseCenterY;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final float arcVelocity;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final boolean isVertical;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final boolean isLinear;

        /* JADX INFO: renamed from: p1.u$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lp1/u$a$a;", "", "<init>", "()V", "", "b", "()[F", "ourPercent", "", "Epsilon", Gender.FEMALE, "_ourPercent", "[F", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final float[] b() {
                if (a.f100625u != null) {
                    float[] fArr = a.f100625u;
                    s.h(fArr);
                    return fArr;
                }
                a.f100625u = new float[91];
                float[] fArr2 = a.f100625u;
                s.h(fArr2);
                return fArr2;
            }

            private Companion() {
            }
        }

        public a(int i11, float f11, float f12, float f13, float f14, float f15, float f16) {
            this.time1 = f11;
            this.time2 = f12;
            this.x1 = f13;
            this.y1 = f14;
            this.x2 = f15;
            this.y2 = f16;
            float f17 = f15 - f13;
            float f18 = f16 - f14;
            boolean z11 = true;
            boolean z12 = i11 == 1 || (i11 == 4 ? f18 > BitmapDescriptorFactory.HUE_RED : !(i11 != 5 || f18 >= BitmapDescriptorFactory.HUE_RED));
            this.isVertical = z12;
            float f19 = 1 / (f12 - f11);
            this.oneOverDeltaTime = f19;
            boolean z13 = 3 == i11;
            if (z13 || Math.abs(f17) < 0.001f || Math.abs(f18) < 0.001f) {
                float fHypot = (float) Math.hypot(f18, f17);
                this.arcDistance = fHypot;
                this.arcVelocity = fHypot * f19;
                this.ellipseCenterX = f17 / (f12 - f11);
                this.ellipseCenterY = f18 / (f12 - f11);
                this.lut = new float[101];
                this.ellipseA = Float.NaN;
                this.ellipseB = Float.NaN;
            } else {
                this.lut = new float[101];
                this.ellipseA = f17 * (z12 ? -1 : 1);
                this.ellipseB = f18 * (z12 ? 1 : -1);
                this.ellipseCenterX = z12 ? f15 : f13;
                this.ellipseCenterY = z12 ? f14 : f16;
                c(f13, f14, f15, f16);
                this.arcVelocity = this.arcDistance * f19;
                z11 = z13;
            }
            this.isLinear = z11;
        }

        private final void c(float x11, float y11, float x12, float y12) {
            float f11 = x12 - x11;
            float f12 = y11 - y12;
            int length = INSTANCE.b().length;
            float fHypot = 0.0f;
            float f13 = 0.0f;
            float f14 = 0.0f;
            int i11 = 0;
            while (i11 < length) {
                Companion companion = INSTANCE;
                double radians = (float) Math.toRadians((((double) i11) * 90.0d) / ((double) (companion.b().length - 1)));
                float fSin = ((float) Math.sin(radians)) * f11;
                float fCos = ((float) Math.cos(radians)) * f12;
                if (i11 > 0) {
                    fHypot += (float) Math.hypot(fSin - f13, fCos - f14);
                    companion.b()[i11] = fHypot;
                }
                i11++;
                f14 = fCos;
                f13 = fSin;
            }
            this.arcDistance = fHypot;
            int length2 = INSTANCE.b().length;
            for (int i12 = 0; i12 < length2; i12++) {
                float[] fArrB = INSTANCE.b();
                fArrB[i12] = fArrB[i12] / fHypot;
            }
            int length3 = this.lut.length;
            for (int i13 = 0; i13 < length3; i13++) {
                float length4 = i13 / (this.lut.length - 1);
                Companion companion2 = INSTANCE;
                int iJ = n.j(companion2.b(), length4, 0, 0, 6, null);
                if (iJ >= 0) {
                    this.lut[i13] = iJ / (companion2.b().length - 1);
                } else if (iJ == -1) {
                    this.lut[i13] = 0.0f;
                } else {
                    int i14 = -iJ;
                    int i15 = i14 - 2;
                    this.lut[i13] = (i15 + ((length4 - companion2.b()[i15]) / (companion2.b()[i14 - 1] - companion2.b()[i15]))) / (companion2.b().length - 1);
                }
            }
        }

        private final float o(float v11) {
            if (v11 <= BitmapDescriptorFactory.HUE_RED) {
                return BitmapDescriptorFactory.HUE_RED;
            }
            if (v11 >= 1.0f) {
                return 1.0f;
            }
            float[] fArr = this.lut;
            float length = v11 * (fArr.length - 1);
            int i11 = (int) length;
            float f11 = length - i11;
            float f12 = fArr[i11];
            return f12 + (f11 * (fArr[i11 + 1] - f12));
        }

        public final float d() {
            float f11 = this.ellipseA * this.tmpCosAngle;
            float fHypot = this.arcVelocity / ((float) Math.hypot(f11, (-this.ellipseB) * this.tmpSinAngle));
            return this.isVertical ? (-f11) * fHypot : f11 * fHypot;
        }

        public final float e() {
            float f11 = this.ellipseA * this.tmpCosAngle;
            float f12 = (-this.ellipseB) * this.tmpSinAngle;
            float fHypot = this.arcVelocity / ((float) Math.hypot(f11, f12));
            return this.isVertical ? (-f12) * fHypot : f12 * fHypot;
        }

        public final float f() {
            return this.ellipseCenterX + (this.ellipseA * this.tmpSinAngle);
        }

        public final float g() {
            return this.ellipseCenterY + (this.ellipseB * this.tmpCosAngle);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final float getEllipseCenterX() {
            return this.ellipseCenterX;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final float getEllipseCenterY() {
            return this.ellipseCenterY;
        }

        public final float j(float time) {
            float f11 = (time - this.time1) * this.oneOverDeltaTime;
            float f12 = this.x1;
            return f12 + (f11 * (this.x2 - f12));
        }

        public final float k(float time) {
            float f11 = (time - this.time1) * this.oneOverDeltaTime;
            float f12 = this.y1;
            return f12 + (f11 * (this.y2 - f12));
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final float getTime1() {
            return this.time1;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final float getTime2() {
            return this.time2;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final boolean getIsLinear() {
            return this.isLinear;
        }

        public final void p(float time) {
            double dO = o((this.isVertical ? this.time2 - time : time - this.time1) * this.oneOverDeltaTime) * 1.5707964f;
            this.tmpSinAngle = (float) Math.sin(dO);
            this.tmpCosAngle = (float) Math.cos(dO);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[PHI: r10
      0x0028: PHI (r10v1 int) = (r10v0 int), (r10v5 int), (r10v6 int) binds: [B:5:0x0018, B:10:0x0021, B:12:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0031  */
    public u(int[] iArr, float[] fArr, float[][] fArr2) {
        int i11;
        int length = fArr.length - 1;
        a[][] aVarArr = new a[length][];
        int i12 = 1;
        int i13 = 1;
        int i14 = 0;
        while (i14 < length) {
            int i15 = iArr[i14];
            int i16 = 3;
            if (i15 == 0) {
                i11 = i16;
            } else if (i15 == 1) {
                i12 = 1;
                i11 = i12;
            } else {
                if (i15 != 2) {
                    if (i15 != 3) {
                        i16 = 4;
                        if (i15 != 4) {
                            i16 = 5;
                            if (i15 != 5) {
                                i11 = i13;
                            } else {
                                i11 = i16;
                            }
                        } else {
                            i11 = i16;
                        }
                    } else {
                        if (i12 != 1) {
                            i12 = 1;
                        }
                        i11 = i12;
                    }
                }
                i12 = 2;
                i11 = i12;
            }
            float[] fArr3 = fArr2[i14];
            int length2 = (fArr3.length / 2) + (fArr3.length % 2);
            a[] aVarArr2 = new a[length2];
            for (int i17 = 0; i17 < length2; i17++) {
                int i18 = i17 * 2;
                float f11 = fArr[i14];
                int i19 = i14 + 1;
                float f12 = fArr[i19];
                float[] fArr4 = fArr2[i14];
                float f13 = fArr4[i18];
                int i21 = i18 + 1;
                float f14 = fArr4[i21];
                float[] fArr5 = fArr2[i19];
                aVarArr2[i17] = new a(i11, f11, f12, f13, f14, fArr5[i18], fArr5[i21]);
            }
            aVarArr[i14] = aVarArr2;
            i14++;
            i13 = i11;
        }
        this.arcs = aVarArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0022, code lost:
    
        if (r9 > r0[r0.length - 1][0].getTime2()) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(float r9, float[] r10) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p019p1.u.a(float, float[]):void");
    }

    public final void b(float time, float[] v11) {
        if (time < this.arcs[0][0].getTime1()) {
            time = this.arcs[0][0].getTime1();
        } else {
            a[][] aVarArr = this.arcs;
            if (time > aVarArr[aVarArr.length - 1][0].getTime2()) {
                a[][] aVarArr2 = this.arcs;
                time = aVarArr2[aVarArr2.length - 1][0].getTime2();
            }
        }
        int length = this.arcs.length;
        boolean z11 = false;
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = 0;
            int i13 = 0;
            while (i12 < v11.length) {
                if (time <= this.arcs[i11][i13].getTime2()) {
                    if (this.arcs[i11][i13].getIsLinear()) {
                        v11[i12] = this.arcs[i11][i13].getEllipseCenterX();
                        v11[i12 + 1] = this.arcs[i11][i13].getEllipseCenterY();
                    } else {
                        this.arcs[i11][i13].p(time);
                        v11[i12] = this.arcs[i11][i13].d();
                        v11[i12 + 1] = this.arcs[i11][i13].e();
                    }
                    z11 = true;
                }
                i12 += 2;
                i13++;
            }
            if (z11) {
                return;
            }
        }
    }
}
