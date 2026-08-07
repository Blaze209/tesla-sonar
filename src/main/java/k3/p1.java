package k3;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import okhttp3.internal.ws.WebSocketProtocol;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087@\u0018\u0000 ,2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ=\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\nH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0007\u001a\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u001a\u0010\f\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\r\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b'\u0010\"\u001a\u0004\b&\u0010$R\u001a\u0010\u000e\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b)\u0010\"\u001a\u0004\b(\u0010$R\u001a\u0010\u000b\u001a\u00020\n8FX\u0087\u0004¢\u0006\f\u0012\u0004\b+\u0010\"\u001a\u0004\b*\u0010$\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lk3/p1;", "", "Ljn0/c0;", "value", "m", "(J)J", "Ll3/c;", "colorSpace", "n", "(JLl3/c;)J", "", "alpha", "red", "green", "blue", "o", "(JFFFF)J", "", "y", "(J)Ljava/lang/String;", "", "x", "(J)I", "other", "", "q", "(JLjava/lang/Object;)Z", "a", "J", "getValue-s-VKNKU", "()J", "u", "(J)Ll3/c;", "getColorSpace$annotations", "()V", "w", "(J)F", "getRed$annotations", "v", "getGreen$annotations", "t", "getBlue$annotations", "s", "getAlpha$annotations", "b", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@vn0.b
public final class p1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f84847c = r1.d(4278190080L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f84848d = r1.d(4282664004L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f84849e = r1.d(4287137928L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f84850f = r1.d(4291611852L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f84851g = r1.d(4294967295L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f84852h = r1.d(4294901760L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f84853i = r1.d(4278255360L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f84854j = r1.d(4278190335L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f84855k = r1.d(4294967040L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f84856l = r1.d(4278255615L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f84857m = r1.d(4294902015L);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f84858n = r1.b(0);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f84859o = r1.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, l3.g.f89510a.y());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long value;

    /* JADX INFO: renamed from: k3.p1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR&\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR&\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR&\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR&\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR&\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR&\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR&\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\bR&\u0010%\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b%\u0010\u0006\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Lk3/p1$a;", "", "<init>", "()V", "Lk3/p1;", "Black", "J", "a", "()J", "getBlack-0d7_KjU$annotations", "DarkGray", "c", "getDarkGray-0d7_KjU$annotations", "Gray", DateTokenConverter.CONVERTER_KEY, "getGray-0d7_KjU$annotations", "LightGray", "f", "getLightGray-0d7_KjU$annotations", "White", "k", "getWhite-0d7_KjU$annotations", "Red", "h", "getRed-0d7_KjU$annotations", "Green", "e", "getGreen-0d7_KjU$annotations", "Blue", "b", "getBlue-0d7_KjU$annotations", "Magenta", "g", "getMagenta-0d7_KjU$annotations", "Transparent", IntegerTokenConverter.CONVERTER_KEY, "getTransparent-0d7_KjU$annotations", "Unspecified", "j", "getUnspecified-0d7_KjU$annotations", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final long a() {
            return p1.f84847c;
        }

        public final long b() {
            return p1.f84854j;
        }

        public final long c() {
            return p1.f84848d;
        }

        public final long d() {
            return p1.f84849e;
        }

        public final long e() {
            return p1.f84853i;
        }

        public final long f() {
            return p1.f84850f;
        }

        public final long g() {
            return p1.f84857m;
        }

        public final long h() {
            return p1.f84852h;
        }

        public final long i() {
            return p1.f84858n;
        }

        public final long j() {
            return p1.f84859o;
        }

        public final long k() {
            return p1.f84851g;
        }

        private Companion() {
        }
    }

    private /* synthetic */ p1(long j11) {
        this.value = j11;
    }

    public static final /* synthetic */ p1 l(long j11) {
        return new p1(j11);
    }

    public static final long n(long j11, l3.c cVar) {
        return l3.d.i(u(j11), cVar, 0, 2, null).a(j11);
    }

    public static final long o(long j11, float f11, float f12, float f13, float f14) {
        return r1.a(f12, f13, f14, f11, u(j11));
    }

    public static /* synthetic */ long p(long j11, float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = s(j11);
        }
        float f15 = f11;
        if ((i11 & 2) != 0) {
            f12 = w(j11);
        }
        float f16 = f12;
        if ((i11 & 4) != 0) {
            f13 = v(j11);
        }
        float f17 = f13;
        if ((i11 & 8) != 0) {
            f14 = t(j11);
        }
        return o(j11, f15, f16, f17, f14);
    }

    public static boolean q(long j11, Object obj) {
        return (obj instanceof p1) && j11 == ((p1) obj).getValue();
    }

    public static final boolean r(long j11, long j12) {
        return jn0.c0.d(j11, j12);
    }

    public static final float s(long j11) {
        float fE;
        float f11;
        if (jn0.c0.b(63 & j11) == 0) {
            fE = (float) jn0.j0.e(jn0.c0.b(jn0.c0.b(j11 >>> 56) & 255));
            f11 = 255.0f;
        } else {
            fE = (float) jn0.j0.e(jn0.c0.b(jn0.c0.b(j11 >>> 6) & 1023));
            f11 = 1023.0f;
        }
        return fE / f11;
    }

    public static final float t(long j11) {
        int i11;
        int i12;
        int i13;
        if (jn0.c0.b(63 & j11) == 0) {
            return ((float) jn0.j0.e(jn0.c0.b(jn0.c0.b(j11 >>> 32) & 255))) / 255.0f;
        }
        short sB = (short) jn0.c0.b(jn0.c0.b(j11 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i14 = Short.MIN_VALUE & sB;
        int i15 = ((65535 & sB) >>> 10) & 31;
        int i16 = sB & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - f3.f84782c;
                return i14 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    public static final l3.c u(long j11) {
        l3.g gVar = l3.g.f89510a;
        return gVar.l()[(int) jn0.c0.b(j11 & 63)];
    }

    public static final float v(long j11) {
        int i11;
        int i12;
        int i13;
        if (jn0.c0.b(63 & j11) == 0) {
            return ((float) jn0.j0.e(jn0.c0.b(jn0.c0.b(j11 >>> 40) & 255))) / 255.0f;
        }
        short sB = (short) jn0.c0.b(jn0.c0.b(j11 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i14 = Short.MIN_VALUE & sB;
        int i15 = ((65535 & sB) >>> 10) & 31;
        int i16 = sB & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - f3.f84782c;
                return i14 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    public static final float w(long j11) {
        int i11;
        int i12;
        int i13;
        if (jn0.c0.b(63 & j11) == 0) {
            return ((float) jn0.j0.e(jn0.c0.b(jn0.c0.b(j11 >>> 48) & 255))) / 255.0f;
        }
        short sB = (short) jn0.c0.b(jn0.c0.b(j11 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
        int i14 = Short.MIN_VALUE & sB;
        int i15 = ((65535 & sB) >>> 10) & 31;
        int i16 = sB & 1023;
        if (i15 != 0) {
            int i17 = i16 << 13;
            if (i15 == 31) {
                i11 = 255;
                if (i17 != 0) {
                    i17 |= 4194304;
                }
            } else {
                i11 = i15 + 112;
            }
            int i18 = i11;
            i12 = i17;
            i13 = i18;
        } else {
            if (i16 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - f3.f84782c;
                return i14 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i13 = 0;
            i12 = 0;
        }
        return Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
    }

    public static int x(long j11) {
        return jn0.c0.e(j11);
    }

    public static String y(long j11) {
        return "Color(" + w(j11) + ", " + v(j11) + ", " + t(j11) + ", " + s(j11) + ", " + u(j11).getName() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public boolean equals(Object obj) {
        return q(this.value, obj);
    }

    public int hashCode() {
        return x(this.value);
    }

    public String toString() {
        return y(this.value);
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    public static long m(long j11) {
        return j11;
    }
}
