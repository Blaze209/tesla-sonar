package p026y50;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import k3.r1;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b,\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0014\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u001a\u0010\u0017\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0004\"\u001a\u0010\u001a\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0002\u001a\u0004\b\u0019\u0010\u0004\"\u001a\u0010\u001d\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0004\"\u001a\u0010\u001f\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\t\u0010\u0004\"\u001a\u0010!\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0002\u001a\u0004\b \u0010\u0004\"\u001a\u0010\"\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u001a\u0010#\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\u000f\u0010\u0004\"\u001a\u0010$\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\"\u001a\u0010%\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010&\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0001\u0010\u0004\"\u001a\u0010'\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0002\u001a\u0004\b\u0018\u0010\u0004\"\u001a\u0010(\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u0015\u0010\u0004\"\u001a\u0010)\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001b\u0010\u0004\"\u001a\u0010+\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010\u0002\u001a\u0004\b\u001e\u0010\u0004¨\u0006,"}, d2 = {"Lk3/p1;", "a", "J", "k", "()J", "Neutral0", "b", "m", "Neutral25", "c", "o", "Neutral50", DateTokenConverter.CONVERTER_KEY, "l", "Neutral100", "e", "n", "Neutral300", "f", "p", "Neutral600", "g", "q", "Neutral700", "h", "r", "Neutral800", IntegerTokenConverter.CONVERTER_KEY, "s", "Neutral900", "j", "Brand50", "getBrand400", "Brand400", "Brand500", "Brand600", "Critical500", "Attention50", "Attention300", "LinkGreen50", "LinkGreen200", "LinkGreen500", "t", "LinkGreen900", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f125022a = r1.d(4294967295L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f125023b = r1.d(4294309624L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f125024c = r1.d(4294375674L);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f125025d = r1.d(4292402916L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f125026e = r1.d(4288916666L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f125027f = r1.d(4284047729L);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f125028g = r1.d(4282863194L);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f125029h = r1.d(4281678404L);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f125030i = r1.d(4280362284L);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long f125031j = r1.d(4294440445L);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f125032k = r1.d(4287463418L);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f125033l = r1.d(4284964351L);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final long f125034m = r1.d(4283644669L);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f125035n = r1.d(4292811585L);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final long f125036o = r1.d(4294900186L);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final long f125037p = r1.d(4294412047L);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f125038q = r1.d(4293328877L);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final long f125039r = r1.d(4278244975L);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final long f125040s = r1.d(4278224197L);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f125041t = r1.d(4278263311L);

    public static final long a() {
        return f125037p;
    }

    public static final long b() {
        return f125036o;
    }

    public static final long c() {
        return f125031j;
    }

    public static final long d() {
        return f125033l;
    }

    public static final long e() {
        return f125034m;
    }

    public static final long f() {
        return f125035n;
    }

    public static final long g() {
        return f125039r;
    }

    public static final long h() {
        return f125038q;
    }

    public static final long i() {
        return f125040s;
    }

    public static final long j() {
        return f125041t;
    }

    public static final long k() {
        return f125022a;
    }

    public static final long l() {
        return f125025d;
    }

    public static final long m() {
        return f125023b;
    }

    public static final long n() {
        return f125026e;
    }

    public static final long o() {
        return f125024c;
    }

    public static final long p() {
        return f125027f;
    }

    public static final long q() {
        return f125028g;
    }

    public static final long r() {
        return f125029h;
    }

    public static final long s() {
        return f125030i;
    }
}
