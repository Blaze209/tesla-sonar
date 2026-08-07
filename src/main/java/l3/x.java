package l3;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Gender;
import java.util.Arrays;
import k3.r1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u0000 c2\u00020\u0001:\u0001.B]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014B1\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0016BA\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0019B!\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0000\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b'\u0010(J'\u0010)\u001a\u00020\f2\u0006\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\f2\u0006\u0010%\u001a\u00020\fH\u0010¢\u0006\u0004\b)\u0010*J=\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020\f2\u0006\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u0004H\u0016¢\u0006\u0004\b2\u0010\"J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u000103H\u0096\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010=R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010D\u001a\u0004\bG\u0010FR\u001a\u0010J\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010D\u001a\u0004\bI\u0010FR\u001a\u0010N\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010K\u001a\u0004\bL\u0010MR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170O8\u0006¢\u0006\f\n\u0004\b)\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010K\u001a\u0004\bS\u0010MR\u001a\u0010W\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bU\u0010K\u001a\u0004\bV\u0010MR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170O8\u0006¢\u0006\f\n\u0004\bX\u0010P\u001a\u0004\bY\u0010RR\u001a\u0010\\\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\b[\u0010MR\u001a\u0010_\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010b\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\ba\u0010^\u001a\u0004\bC\u0010`\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006d"}, d2 = {"Ll3/x;", "Ll3/c;", "", "name", "", "primaries", "Ll3/z;", "whitePoint", "transform", "Ll3/j;", "oetf", "eotf", "", "min", "max", "Ll3/y;", "transferParameters", "", "id", "<init>", "(Ljava/lang/String;[FLl3/z;[FLl3/j;Ll3/j;FFLl3/y;I)V", "function", "(Ljava/lang/String;[FLl3/z;Ll3/y;I)V", "", "gamma", "(Ljava/lang/String;[FLl3/z;DFFI)V", "colorSpace", "(Ll3/x;[FLl3/z;)V", "component", "f", "(I)F", "e", "v", "l", "([F)[F", "v0", "v1", "v2", "", "j", "(FFF)J", "m", "(FFF)F", "x", "y", "z", "a", "Lk3/p1;", "n", "(FFFFLl3/c;)J", "b", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ll3/z;", "R", "()Ll3/z;", Gender.FEMALE, "g", "h", "Ll3/y;", "P", "()Ll3/y;", IntegerTokenConverter.CONVERTER_KEY, "[F", Gender.OTHER, "()[F", "Q", "k", "K", "inverseTransform", "Ll3/j;", Gender.NONE, "()Ll3/j;", "oetfOrig", "Lkotlin/Function1;", "Lwn0/l;", "L", "()Lwn0/l;", Gender.MALE, "oetfFunc", "o", "J", "eotfOrig", "p", "H", "q", "I", "eotfFunc", "r", "Z", "isWideGamut", "()Z", "s", "isSrgb", "t", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class x extends l3.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final j f89576u = new j() { // from class: l3.q
        @Override // l3.j
        public final double a(double d11) {
            return x.x(d11);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final WhitePoint whitePoint;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float min;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float max;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final TransferParameters transferParameters;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final float[] primaries;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final float[] transform;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final float[] inverseTransform;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final j oetfOrig;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Double, Double> oetf;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final j oetfFunc;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final j eotfOrig;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Double, Double> eotf;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final j eotfFunc;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean isWideGamut;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final boolean isSrgb;

    /* JADX INFO: renamed from: l3.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u001a\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ/\u0010!\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010%\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Ll3/x$a;", "", "<init>", "()V", "", "primaries", "Ll3/z;", "whitePoint", "Ll3/j;", "OETF", "EOTF", "", "min", "max", "", "id", "", "j", "([FLl3/z;Ll3/j;Ll3/j;FFI)Z", "", "point", "a", "b", "f", "(DLl3/j;Ll3/j;)Z", "k", "([FFF)Z", "e", "([F)F", "ax", "ay", "bx", "by", IntegerTokenConverter.CONVERTER_KEY, "(FFFF)F", "p1", "p2", "h", "([F[F)Z", "l", "([F)[F", "g", "([FLl3/z;)[F", "DoubleIdentity", "Ll3/j;", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final float e(float[] primaries) {
            float f11 = primaries[0];
            float f12 = primaries[1];
            float f13 = primaries[2];
            float f14 = primaries[3];
            float f15 = primaries[4];
            float f16 = primaries[5];
            float f17 = ((((((f11 * f14) + (f12 * f15)) + (f13 * f16)) - (f14 * f15)) - (f12 * f13)) - (f11 * f16)) * 0.5f;
            return f17 < BitmapDescriptorFactory.HUE_RED ? -f17 : f17;
        }

        private final boolean f(double point, j a11, j b11) {
            return Math.abs(a11.a(point) - b11.a(point)) <= 0.001d;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] g(float[] primaries, WhitePoint whitePoint) {
            float f11 = primaries[0];
            float f12 = primaries[1];
            float f13 = primaries[2];
            float f14 = primaries[3];
            float f15 = primaries[4];
            float f16 = primaries[5];
            float x11 = whitePoint.getX();
            float y11 = whitePoint.getY();
            float f17 = 1;
            float f18 = (f17 - f11) / f12;
            float f19 = (f17 - f13) / f14;
            float f21 = (f17 - f15) / f16;
            float f22 = (f17 - x11) / y11;
            float f23 = f11 / f12;
            float f24 = (f13 / f14) - f23;
            float f25 = (x11 / y11) - f23;
            float f26 = f19 - f18;
            float f27 = (f15 / f16) - f23;
            float f28 = (((f22 - f18) * f24) - (f25 * f26)) / (((f21 - f18) * f24) - (f26 * f27));
            float f29 = (f25 - (f27 * f28)) / f24;
            float f31 = (1.0f - f29) - f28;
            float f32 = f31 / f12;
            float f33 = f29 / f14;
            float f34 = f28 / f16;
            return new float[]{f32 * f11, f31, f32 * ((1.0f - f11) - f12), f33 * f13, f29, f33 * ((1.0f - f13) - f14), f34 * f15, f28, f34 * ((1.0f - f15) - f16)};
        }

        private final boolean h(float[] p11, float[] p12) {
            float f11 = p11[0];
            float f12 = p12[0];
            float f13 = p11[1];
            float f14 = p12[1];
            float f15 = p11[2] - p12[2];
            float f16 = p11[3] - p12[3];
            float f17 = p11[4];
            float f18 = p12[4];
            float f19 = p11[5];
            float f21 = p12[5];
            float[] fArr = {f11 - f12, f13 - f14, f15, f16, f17 - f18, f19 - f21};
            return i(fArr[0], fArr[1], f12 - f18, f14 - f21) >= BitmapDescriptorFactory.HUE_RED && i(p12[0] - p12[2], p12[1] - p12[3], fArr[0], fArr[1]) >= BitmapDescriptorFactory.HUE_RED && i(fArr[2], fArr[3], p12[2] - p12[0], p12[3] - p12[1]) >= BitmapDescriptorFactory.HUE_RED && i(p12[2] - p12[4], p12[3] - p12[5], fArr[2], fArr[3]) >= BitmapDescriptorFactory.HUE_RED && i(fArr[4], fArr[5], p12[4] - p12[2], p12[5] - p12[3]) >= BitmapDescriptorFactory.HUE_RED && i(p12[4] - p12[0], p12[5] - p12[1], fArr[4], fArr[5]) >= BitmapDescriptorFactory.HUE_RED;
        }

        private final float i(float ax2, float ay2, float bx2, float by) {
            return (ax2 * by) - (ay2 * bx2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(float[] primaries, WhitePoint whitePoint, j OETF, j EOTF, float min, float max, int id2) {
            if (id2 == 0) {
                return true;
            }
            g gVar = g.f89510a;
            if (!d.g(primaries, gVar.x()) || !d.f(whitePoint, k.f89545a.e()) || min != BitmapDescriptorFactory.HUE_RED || max != 1.0f) {
                return false;
            }
            x xVarW = gVar.w();
            for (double d11 = 0.0d; d11 <= 1.0d; d11 += 0.00392156862745098d) {
                if (!f(d11, OETF, xVarW.getOetfOrig()) || !f(d11, EOTF, xVarW.getEotfOrig())) {
                    return false;
                }
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(float[] primaries, float min, float max) {
            float fE = e(primaries);
            g gVar = g.f89510a;
            if (fE / e(gVar.s()) <= 0.9f || !h(primaries, gVar.x())) {
                return min < BitmapDescriptorFactory.HUE_RED && max > 1.0f;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float[] l(float[] primaries) {
            float[] fArr = new float[6];
            if (primaries.length != 9) {
                p013kotlin.collections.n.r(primaries, fArr, 0, 0, 6, 6, null);
                return fArr;
            }
            float f11 = primaries[0];
            float f12 = primaries[1];
            float f13 = f11 + f12 + primaries[2];
            fArr[0] = f11 / f13;
            fArr[1] = f12 / f13;
            float f14 = primaries[3];
            float f15 = primaries[4];
            float f16 = f14 + f15 + primaries[5];
            fArr[2] = f14 / f16;
            fArr[3] = f15 / f16;
            float f17 = primaries[6];
            float f18 = primaries[7];
            float f19 = f17 + f18 + primaries[8];
            fArr[4] = f17 / f19;
            fArr[5] = f18 / f19;
            return fArr;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0})
    static final class b extends p013kotlin.jvm.internal.u implements wn0.l<Double, Double> {
        b() {
            super(1);
        }

        public final Double a(double d11) {
            return Double.valueOf(x.this.getEotfOrig().a(bo0.n.l(d11, x.this.min, x.this.max)));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0006\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "x", "a", "(D)Ljava/lang/Double;"}, k = 3, mv = {1, 8, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<Double, Double> {
        c() {
            super(1);
        }

        public final Double a(double d11) {
            return Double.valueOf(bo0.n.l(x.this.getOetfOrig().a(d11), x.this.min, x.this.max));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ Double invoke(Double d11) {
            return a(d11.doubleValue());
        }
    }

    public x(String str, float[] fArr, WhitePoint whitePoint, float[] fArr2, j jVar, j jVar2, float f11, float f12, TransferParameters transferParameters, int i11) {
        super(str, l3.b.INSTANCE.b(), i11, null);
        this.whitePoint = whitePoint;
        this.min = f11;
        this.max = f12;
        this.transferParameters = transferParameters;
        this.oetfOrig = jVar;
        this.oetf = new c();
        this.oetfFunc = new j() { // from class: l3.o
            @Override // l3.j
            public final double a(double d11) {
                return x.S(this.f89567a, d11);
            }
        };
        this.eotfOrig = jVar2;
        this.eotf = new b();
        this.eotfFunc = new j() { // from class: l3.p
            @Override // l3.j
            public final double a(double d11) {
                return x.G(this.f89568a, d11);
            }
        };
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        }
        if (f11 >= f12) {
            throw new IllegalArgumentException("Invalid range: min=" + f11 + ", max=" + f12 + "; min must be strictly < max");
        }
        Companion companion = INSTANCE;
        float[] fArrL = companion.l(fArr);
        this.primaries = fArrL;
        if (fArr2 == null) {
            this.transform = companion.g(fArrL, whitePoint);
        } else {
            if (fArr2.length != 9) {
                throw new IllegalArgumentException("Transform must have 9 entries! Has " + fArr2.length);
            }
            this.transform = fArr2;
        }
        this.inverseTransform = d.k(this.transform);
        this.isWideGamut = companion.k(fArrL, f11, f12);
        this.isSrgb = companion.j(fArrL, whitePoint, jVar, jVar2, f11, f12, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double A(TransferParameters transferParameters, double d11) {
        return d.o(d11, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double B(TransferParameters transferParameters, double d11) {
        return d.p(d11, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double C(TransferParameters transferParameters, double d11) {
        return d.q(d11, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double D(TransferParameters transferParameters, double d11) {
        return d.r(d11, transferParameters.getA(), transferParameters.getB(), transferParameters.getC(), transferParameters.getD(), transferParameters.getE(), transferParameters.getF(), transferParameters.getGamma());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double G(x xVar, double d11) {
        return xVar.eotfOrig.a(bo0.n.l(d11, xVar.min, xVar.max));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double S(x xVar, double d11) {
        return bo0.n.l(xVar.oetfOrig.a(d11), xVar.min, xVar.max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double y(double d11, double d12) {
        if (d12 < 0.0d) {
            d12 = 0.0d;
        }
        return Math.pow(d12, 1.0d / d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double z(double d11, double d12) {
        if (d12 < 0.0d) {
            d12 = 0.0d;
        }
        return Math.pow(d12, d11);
    }

    public final wn0.l<Double, Double> H() {
        return this.eotf;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final j getEotfFunc() {
        return this.eotfFunc;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final j getEotfOrig() {
        return this.eotfOrig;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final float[] getInverseTransform() {
        return this.inverseTransform;
    }

    public final wn0.l<Double, Double> L() {
        return this.oetf;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final j getOetfFunc() {
        return this.oetfFunc;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final j getOetfOrig() {
        return this.oetfOrig;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final float[] getPrimaries() {
        return this.primaries;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final TransferParameters getTransferParameters() {
        return this.transferParameters;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final float[] getTransform() {
        return this.transform;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final WhitePoint getWhitePoint() {
        return this.whitePoint;
    }

    @Override // l3.c
    public float[] b(float[] v11) {
        d.n(this.inverseTransform, v11);
        v11[0] = (float) this.oetfFunc.a(v11[0]);
        v11[1] = (float) this.oetfFunc.a(v11[1]);
        v11[2] = (float) this.oetfFunc.a(v11[2]);
        return v11;
    }

    @Override // l3.c
    public float e(int component) {
        return this.max;
    }

    @Override // l3.c
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || x.class != other.getClass() || !super.equals(other)) {
            return false;
        }
        x xVar = (x) other;
        if (Float.compare(xVar.min, this.min) != 0 || Float.compare(xVar.max, this.max) != 0 || !p013kotlin.jvm.internal.s.f(this.whitePoint, xVar.whitePoint) || !Arrays.equals(this.primaries, xVar.primaries)) {
            return false;
        }
        TransferParameters transferParameters = this.transferParameters;
        if (transferParameters != null) {
            return p013kotlin.jvm.internal.s.f(transferParameters, xVar.transferParameters);
        }
        if (xVar.transferParameters == null) {
            return true;
        }
        if (p013kotlin.jvm.internal.s.f(this.oetfOrig, xVar.oetfOrig)) {
            return p013kotlin.jvm.internal.s.f(this.eotfOrig, xVar.eotfOrig);
        }
        return false;
    }

    @Override // l3.c
    public float f(int component) {
        return this.min;
    }

    @Override // l3.c
    public int hashCode() {
        int iHashCode = ((((super.hashCode() * 31) + this.whitePoint.hashCode()) * 31) + Arrays.hashCode(this.primaries)) * 31;
        float f11 = this.min;
        int iFloatToIntBits = (iHashCode + (f11 == BitmapDescriptorFactory.HUE_RED ? 0 : Float.floatToIntBits(f11))) * 31;
        float f12 = this.max;
        int iFloatToIntBits2 = (iFloatToIntBits + (f12 == BitmapDescriptorFactory.HUE_RED ? 0 : Float.floatToIntBits(f12))) * 31;
        TransferParameters transferParameters = this.transferParameters;
        int iHashCode2 = iFloatToIntBits2 + (transferParameters != null ? transferParameters.hashCode() : 0);
        return this.transferParameters == null ? (((iHashCode2 * 31) + this.oetfOrig.hashCode()) * 31) + this.eotfOrig.hashCode() : iHashCode2;
    }

    @Override // l3.c
    /* JADX INFO: renamed from: i, reason: from getter */
    public boolean getIsSrgb() {
        return this.isSrgb;
    }

    @Override // l3.c
    public long j(float v11, float v12, float v13) {
        float fA = (float) this.eotfFunc.a(v11);
        float fA2 = (float) this.eotfFunc.a(v12);
        float fA3 = (float) this.eotfFunc.a(v13);
        float[] fArr = this.transform;
        return (((long) Float.floatToRawIntBits(((fArr[0] * fA) + (fArr[3] * fA2)) + (fArr[6] * fA3))) << 32) | (((long) Float.floatToRawIntBits((fArr[1] * fA) + (fArr[4] * fA2) + (fArr[7] * fA3))) & 4294967295L);
    }

    @Override // l3.c
    public float[] l(float[] v11) {
        v11[0] = (float) this.eotfFunc.a(v11[0]);
        v11[1] = (float) this.eotfFunc.a(v11[1]);
        v11[2] = (float) this.eotfFunc.a(v11[2]);
        return d.n(this.transform, v11);
    }

    @Override // l3.c
    public float m(float v11, float v12, float v13) {
        float fA = (float) this.eotfFunc.a(v11);
        float fA2 = (float) this.eotfFunc.a(v12);
        float fA3 = (float) this.eotfFunc.a(v13);
        float[] fArr = this.transform;
        return (fArr[2] * fA) + (fArr[5] * fA2) + (fArr[8] * fA3);
    }

    @Override // l3.c
    public long n(float x11, float y11, float z11, float a11, l3.c colorSpace) {
        float[] fArr = this.inverseTransform;
        return r1.a((float) this.oetfFunc.a((fArr[0] * x11) + (fArr[3] * y11) + (fArr[6] * z11)), (float) this.oetfFunc.a((fArr[1] * x11) + (fArr[4] * y11) + (fArr[7] * z11)), (float) this.oetfFunc.a((fArr[2] * x11) + (fArr[5] * y11) + (fArr[8] * z11)), a11, colorSpace);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double x(double d11) {
        return d11;
    }

    public x(String str, float[] fArr, WhitePoint whitePoint, final TransferParameters transferParameters, int i11) {
        this(str, fArr, whitePoint, null, (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new j() { // from class: l3.t
            @Override // l3.j
            public final double a(double d11) {
                return x.A(transferParameters, d11);
            }
        } : new j() { // from class: l3.u
            @Override // l3.j
            public final double a(double d11) {
                return x.B(transferParameters, d11);
            }
        }, (transferParameters.getE() == 0.0d && transferParameters.getF() == 0.0d) ? new j() { // from class: l3.v
            @Override // l3.j
            public final double a(double d11) {
                return x.C(transferParameters, d11);
            }
        } : new j() { // from class: l3.w
            @Override // l3.j
            public final double a(double d11) {
                return x.D(transferParameters, d11);
            }
        }, BitmapDescriptorFactory.HUE_RED, 1.0f, transferParameters, i11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(String str, float[] fArr, WhitePoint whitePoint, final double d11, float f11, float f12, int i11) {
        j jVar;
        j jVar2;
        if (d11 == 1.0d) {
            jVar = f89576u;
        } else {
            jVar = new j() { // from class: l3.r
                @Override // l3.j
                public final double a(double d12) {
                    return x.y(d11, d12);
                }
            };
        }
        j jVar3 = jVar;
        if (d11 == 1.0d) {
            jVar2 = f89576u;
        } else {
            jVar2 = new j() { // from class: l3.s
                @Override // l3.j
                public final double a(double d12) {
                    return x.z(d11, d12);
                }
            };
        }
        this(str, fArr, whitePoint, null, jVar3, jVar2, f11, f12, new TransferParameters(d11, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 96, null), i11);
    }

    public x(x xVar, float[] fArr, WhitePoint whitePoint) {
        this(xVar.getName(), xVar.primaries, whitePoint, fArr, xVar.oetfOrig, xVar.eotfOrig, xVar.min, xVar.max, xVar.transferParameters, -1);
    }
}
