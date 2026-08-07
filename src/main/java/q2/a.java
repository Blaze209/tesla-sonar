package q2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bp\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000f\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\u0011\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001d\u0010\u0015\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001d\u0010\u0017\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001d\u0010\u001b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001d\u0010\u001d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001d\u0010 \u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\bR\u001d\u0010#\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001d\u0010%\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001d\u0010'\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001d\u0010*\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b)\u0010\bR\u001d\u0010-\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001d\u0010/\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b!\u0010\bR\u001d\u00101\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b0\u0010\u0006\u001a\u0004\b$\u0010\bR\u001d\u00103\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b2\u0010\u0006\u001a\u0004\b&\u0010\bR\u001d\u00105\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b(\u0010\bR\u001d\u00108\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b7\u0010\bR\u001d\u0010;\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u001d\u0010=\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b+\u0010\bR\u001d\u0010?\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b>\u0010\u0006\u001a\u0004\b.\u0010\bR\u001d\u0010A\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b0\u0010\bR\u001d\u0010C\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010\u0006\u001a\u0004\b2\u0010\bR\u001d\u0010F\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\bE\u0010\bR\u001d\u0010I\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bG\u0010\u0006\u001a\u0004\bH\u0010\bR\u001d\u0010K\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\b4\u0010\bR\u001d\u0010M\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bL\u0010\u0006\u001a\u0004\b6\u0010\bR\u001d\u0010O\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bN\u0010\u0006\u001a\u0004\b9\u0010\bR\u001d\u0010R\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bP\u0010\u0006\u001a\u0004\bQ\u0010\bR\u001d\u0010U\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bS\u0010\u0006\u001a\u0004\bT\u0010\bR\u001d\u0010V\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0006\u0010\u0006\u001a\u0004\b<\u0010\bR\u001d\u0010X\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\b>\u0010\bR\u001d\u0010Z\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\b@\u0010\bR\u001d\u0010\\\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b[\u0010\u0006\u001a\u0004\bB\u0010\bR\u001d\u0010^\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b]\u0010\u0006\u001a\u0004\bD\u0010\bR\u001d\u0010`\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\bG\u0010\bR\u001d\u0010b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\ba\u0010\u0006\u001a\u0004\bJ\u0010\bR\u001d\u0010d\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bc\u0010\u0006\u001a\u0004\bL\u0010\bR\u001d\u0010g\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\be\u0010\u0006\u001a\u0004\bf\u0010\bR\u001d\u0010i\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bh\u0010\u0006\u001a\u0004\bN\u0010\bR\u001d\u0010k\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bj\u0010\u0006\u001a\u0004\bP\u0010\bR\u001d\u0010m\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bl\u0010\u0006\u001a\u0004\bS\u0010\bR\u001d\u0010p\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bn\u0010\u0006\u001a\u0004\bo\u0010\bR\u001d\u0010s\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bq\u0010\u0006\u001a\u0004\br\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006t"}, d2 = {"Lq2/a;", "", "<init>", "()V", "Lk3/p1;", "b", "J", "a", "()J", "Background", "c", "Error", DateTokenConverter.CONVERTER_KEY, "ErrorContainer", "e", "InverseOnSurface", "f", "InversePrimary", "g", "InverseSurface", "h", "OnBackground", IntegerTokenConverter.CONVERTER_KEY, "OnError", "j", "OnErrorContainer", "k", "OnPrimary", "l", "OnPrimaryContainer", "m", "getOnPrimaryFixed-0d7_KjU", "OnPrimaryFixed", "n", "getOnPrimaryFixedVariant-0d7_KjU", "OnPrimaryFixedVariant", "o", "OnSecondary", "p", "OnSecondaryContainer", "q", "getOnSecondaryFixed-0d7_KjU", "OnSecondaryFixed", "r", "getOnSecondaryFixedVariant-0d7_KjU", "OnSecondaryFixedVariant", "s", "OnSurface", "t", "OnSurfaceVariant", "u", "OnTertiary", "v", "OnTertiaryContainer", "w", "getOnTertiaryFixed-0d7_KjU", "OnTertiaryFixed", "x", "getOnTertiaryFixedVariant-0d7_KjU", "OnTertiaryFixedVariant", "y", "Outline", "z", "OutlineVariant", "A", "Primary", "B", "PrimaryContainer", "C", "getPrimaryFixed-0d7_KjU", "PrimaryFixed", "D", "getPrimaryFixedDim-0d7_KjU", "PrimaryFixedDim", "E", "Scrim", Gender.FEMALE, "Secondary", "G", "SecondaryContainer", "H", "getSecondaryFixed-0d7_KjU", "SecondaryFixed", "I", "getSecondaryFixedDim-0d7_KjU", "SecondaryFixedDim", "Surface", "K", "SurfaceBright", "L", "SurfaceContainer", Gender.MALE, "SurfaceContainerHigh", Gender.NONE, "SurfaceContainerHighest", Gender.OTHER, "SurfaceContainerLow", "P", "SurfaceContainerLowest", "Q", "SurfaceDim", "R", "getSurfaceTint-0d7_KjU", "SurfaceTint", "S", "SurfaceVariant", "T", "Tertiary", Gender.UNKNOWN, "TertiaryContainer", "V", "getTertiaryFixed-0d7_KjU", "TertiaryFixed", "W", "getTertiaryFixedDim-0d7_KjU", "TertiaryFixedDim", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final long Primary;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final long PrimaryContainer;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final long PrimaryFixed;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final long PrimaryFixedDim;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final long Scrim;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final long Secondary;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final long SecondaryContainer;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final long SecondaryFixed;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final long SecondaryFixedDim;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final long Surface;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final long SurfaceBright;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final long SurfaceContainer;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final long SurfaceContainerHigh;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final long SurfaceContainerHighest;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final long SurfaceContainerLow;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final long SurfaceContainerLowest;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final long SurfaceDim;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final long SurfaceTint;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final long SurfaceVariant;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final long Tertiary;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private static final long TertiaryContainer;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private static final long TertiaryFixed;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private static final long TertiaryFixedDim;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f104379a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final long Background;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final long Error;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final long ErrorContainer;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final long InverseOnSurface;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final long InversePrimary;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final long InverseSurface;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final long OnBackground;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final long OnError;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final long OnErrorContainer;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final long OnPrimary;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final long OnPrimaryContainer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final long OnPrimaryFixed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final long OnPrimaryFixedVariant;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final long OnSecondary;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final long OnSecondaryContainer;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final long OnSecondaryFixed;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final long OnSecondaryFixedVariant;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final long OnSurface;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final long OnSurfaceVariant;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final long OnTertiary;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final long OnTertiaryContainer;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final long OnTertiaryFixed;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final long OnTertiaryFixedVariant;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final long Outline;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final long OutlineVariant;

    static {
        h hVar = h.f104494a;
        Background = hVar.o();
        Error = hVar.c();
        ErrorContainer = hVar.d();
        InverseOnSurface = hVar.m();
        InversePrimary = hVar.x();
        InverseSurface = hVar.h();
        OnBackground = hVar.f();
        OnError = hVar.b();
        OnErrorContainer = hVar.a();
        OnPrimary = hVar.u();
        OnPrimaryContainer = hVar.t();
        OnPrimaryFixed = hVar.t();
        OnPrimaryFixedVariant = hVar.v();
        OnSecondary = hVar.A();
        OnSecondaryContainer = hVar.z();
        OnSecondaryFixed = hVar.z();
        OnSecondaryFixedVariant = hVar.B();
        OnSurface = hVar.f();
        OnSurfaceVariant = hVar.p();
        OnTertiary = hVar.G();
        OnTertiaryContainer = hVar.F();
        OnTertiaryFixed = hVar.F();
        OnTertiaryFixedVariant = hVar.H();
        Outline = hVar.q();
        OutlineVariant = hVar.r();
        long jW = hVar.w();
        Primary = jW;
        PrimaryContainer = hVar.y();
        PrimaryFixed = hVar.y();
        PrimaryFixedDim = hVar.x();
        Scrim = hVar.e();
        Secondary = hVar.C();
        SecondaryContainer = hVar.E();
        SecondaryFixed = hVar.E();
        SecondaryFixedDim = hVar.D();
        Surface = hVar.o();
        SurfaceBright = hVar.o();
        SurfaceContainer = hVar.l();
        SurfaceContainerHigh = hVar.k();
        SurfaceContainerHighest = hVar.j();
        SurfaceContainerLow = hVar.n();
        SurfaceContainerLowest = hVar.g();
        SurfaceDim = hVar.i();
        SurfaceTint = jW;
        SurfaceVariant = hVar.s();
        Tertiary = hVar.I();
        TertiaryContainer = hVar.K();
        TertiaryFixed = hVar.K();
        TertiaryFixedDim = hVar.J();
    }

    private a() {
    }

    public final long A() {
        return SurfaceContainer;
    }

    public final long B() {
        return SurfaceContainerHigh;
    }

    public final long C() {
        return SurfaceContainerHighest;
    }

    public final long D() {
        return SurfaceContainerLow;
    }

    public final long E() {
        return SurfaceContainerLowest;
    }

    public final long F() {
        return SurfaceDim;
    }

    public final long G() {
        return SurfaceVariant;
    }

    public final long H() {
        return Tertiary;
    }

    public final long I() {
        return TertiaryContainer;
    }

    public final long a() {
        return Background;
    }

    public final long b() {
        return Error;
    }

    public final long c() {
        return ErrorContainer;
    }

    public final long d() {
        return InverseOnSurface;
    }

    public final long e() {
        return InversePrimary;
    }

    public final long f() {
        return InverseSurface;
    }

    public final long g() {
        return OnBackground;
    }

    public final long h() {
        return OnError;
    }

    public final long i() {
        return OnErrorContainer;
    }

    public final long j() {
        return OnPrimary;
    }

    public final long k() {
        return OnPrimaryContainer;
    }

    public final long l() {
        return OnSecondary;
    }

    public final long m() {
        return OnSecondaryContainer;
    }

    public final long n() {
        return OnSurface;
    }

    public final long o() {
        return OnSurfaceVariant;
    }

    public final long p() {
        return OnTertiary;
    }

    public final long q() {
        return OnTertiaryContainer;
    }

    public final long r() {
        return Outline;
    }

    public final long s() {
        return OutlineVariant;
    }

    public final long t() {
        return Primary;
    }

    public final long u() {
        return PrimaryContainer;
    }

    public final long v() {
        return Scrim;
    }

    public final long w() {
        return Secondary;
    }

    public final long x() {
        return SecondaryContainer;
    }

    public final long y() {
        return Surface;
    }

    public final long z() {
        return SurfaceBright;
    }
}
