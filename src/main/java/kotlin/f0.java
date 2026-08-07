package kotlin;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.plaid.internal.EnumC4419g;
import t3.f;

/* JADX INFO: loaded from: classes.dex */
@p013kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b4\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\u000e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\r\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0014\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u001a\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\bR\u001d\u0010\u001c\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\u001e\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u001d\u0010 \u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u001d\u0010\"\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u001d\u0010#\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010&\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\bR\u001d\u0010)\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001d\u0010+\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b*\u0010\bR\u001d\u0010,\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b'\u0010\bR\u001d\u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b$\u0010\bR\u001d\u0010/\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b!\u0010\bR\u001d\u00101\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u00102\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0015\u0010\bR\u001d\u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b.\u0010\bR\u001d\u00104\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u00105\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u000f\u0010\bR\u001d\u00107\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b0\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, d2 = {"Lb2/f0;", "", "<init>", "()V", "Lt3/a;", "b", "J", "a", "()J", "A", "c", DateTokenConverter.CONVERTER_KEY, "C", "m", "H", "e", "u", "V", "f", "w", "Y", "g", "v", "X", "h", "x", "Z", IntegerTokenConverter.CONVERTER_KEY, "Backslash", "j", "DirectionLeft", "k", "DirectionRight", "l", "DirectionUp", "DirectionDown", "n", "r", "PageUp", "o", "q", "PageDown", "p", "MoveHome", "MoveEnd", "Insert", "s", "Enter", "t", "Backspace", "Delete", "Paste", "Cut", "Copy", "y", "Tab", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f15533a = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long A = f.a(29);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long C = f.a(31);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long H = f.a(36);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final long V = f.a(50);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final long Y = f.a(53);

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final long X = f.a(52);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final long Z = f.a(54);

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final long Backslash = f.a(73);

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final long DirectionLeft = f.a(21);

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final long DirectionRight = f.a(22);

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final long DirectionUp = f.a(19);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final long DirectionDown = f.a(20);

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final long PageUp = f.a(92);

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final long PageDown = f.a(93);

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final long MoveHome = f.a(122);

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final long MoveEnd = f.a(123);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final long Insert = f.a(124);

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final long Enter = f.a(66);

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final long Backspace = f.a(67);

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final long Delete = f.a(112);

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final long Paste = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final long Cut = f.a(EnumC4419g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE);

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final long Copy = f.a(EnumC4419g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE);

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final long Tab = f.a(61);

    private f0() {
    }

    public final long a() {
        return A;
    }

    public final long b() {
        return Backslash;
    }

    public final long c() {
        return Backspace;
    }

    public final long d() {
        return C;
    }

    public final long e() {
        return Copy;
    }

    public final long f() {
        return Cut;
    }

    public final long g() {
        return Delete;
    }

    public final long h() {
        return DirectionDown;
    }

    public final long i() {
        return DirectionLeft;
    }

    public final long j() {
        return DirectionRight;
    }

    public final long k() {
        return DirectionUp;
    }

    public final long l() {
        return Enter;
    }

    public final long m() {
        return H;
    }

    public final long n() {
        return Insert;
    }

    public final long o() {
        return MoveEnd;
    }

    public final long p() {
        return MoveHome;
    }

    public final long q() {
        return PageDown;
    }

    public final long r() {
        return PageUp;
    }

    public final long s() {
        return Paste;
    }

    public final long t() {
        return Tab;
    }

    public final long u() {
        return V;
    }

    public final long v() {
        return X;
    }

    public final long w() {
        return Y;
    }

    public final long x() {
        return Z;
    }
}
