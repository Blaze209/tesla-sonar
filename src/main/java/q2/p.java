package q2;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import i4.TextStyle;
import p013kotlin.Metadata;
import p014n4.j0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0017\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u0017\u0010\u0019\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b \u0010\bR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b\"\u0010\b¨\u0006&"}, d2 = {"Lq2/p;", "", "<init>", "()V", "Li4/r0;", "b", "Li4/r0;", "a", "()Li4/r0;", "BodyLarge", "c", "BodyMedium", DateTokenConverter.CONVERTER_KEY, "BodySmall", "e", "DisplayLarge", "f", "DisplayMedium", "g", "DisplaySmall", "h", "HeadlineLarge", IntegerTokenConverter.CONVERTER_KEY, "HeadlineMedium", "j", "HeadlineSmall", "k", "LabelLarge", "l", "LabelMedium", "m", "LabelSmall", "n", "TitleLarge", "o", "TitleMedium", "p", "TitleSmall", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f104647a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle BodyLarge;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle BodyMedium;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle BodySmall;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle DisplayLarge;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle DisplayMedium;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle DisplaySmall;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle HeadlineLarge;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle HeadlineMedium;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle HeadlineSmall;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle LabelLarge;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle LabelMedium;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle LabelSmall;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle TitleLarge;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle TitleMedium;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final TextStyle TitleSmall;

    static {
        TextStyle textStyleA = q.a();
        m mVar = m.f104591a;
        j0 j0VarA = mVar.a();
        BodyLarge = TextStyle.c(textStyleA, 0L, mVar.c(), mVar.e(), null, null, j0VarA, null, mVar.d(), null, null, null, 0L, null, null, null, 0, 0, mVar.b(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA2 = q.a();
        j0 j0VarF = mVar.f();
        BodyMedium = TextStyle.c(textStyleA2, 0L, mVar.h(), mVar.j(), null, null, j0VarF, null, mVar.i(), null, null, null, 0L, null, null, null, 0, 0, mVar.g(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA3 = q.a();
        j0 j0VarK = mVar.k();
        BodySmall = TextStyle.c(textStyleA3, 0L, mVar.m(), mVar.o(), null, null, j0VarK, null, mVar.n(), null, null, null, 0L, null, null, null, 0, 0, mVar.l(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA4 = q.a();
        j0 j0VarP = mVar.p();
        DisplayLarge = TextStyle.c(textStyleA4, 0L, mVar.r(), mVar.t(), null, null, j0VarP, null, mVar.s(), null, null, null, 0L, null, null, null, 0, 0, mVar.q(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA5 = q.a();
        j0 j0VarU = mVar.u();
        DisplayMedium = TextStyle.c(textStyleA5, 0L, mVar.w(), mVar.y(), null, null, j0VarU, null, mVar.x(), null, null, null, 0L, null, null, null, 0, 0, mVar.v(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA6 = q.a();
        j0 j0VarZ = mVar.z();
        DisplaySmall = TextStyle.c(textStyleA6, 0L, mVar.B(), mVar.D(), null, null, j0VarZ, null, mVar.C(), null, null, null, 0L, null, null, null, 0, 0, mVar.A(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA7 = q.a();
        j0 j0VarE = mVar.E();
        HeadlineLarge = TextStyle.c(textStyleA7, 0L, mVar.G(), mVar.I(), null, null, j0VarE, null, mVar.H(), null, null, null, 0L, null, null, null, 0, 0, mVar.F(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA8 = q.a();
        j0 j0VarJ = mVar.J();
        HeadlineMedium = TextStyle.c(textStyleA8, 0L, mVar.L(), mVar.N(), null, null, j0VarJ, null, mVar.M(), null, null, null, 0L, null, null, null, 0, 0, mVar.K(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA9 = q.a();
        j0 j0VarO = mVar.O();
        HeadlineSmall = TextStyle.c(textStyleA9, 0L, mVar.Q(), mVar.S(), null, null, j0VarO, null, mVar.R(), null, null, null, 0L, null, null, null, 0, 0, mVar.P(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA10 = q.a();
        j0 j0VarT = mVar.T();
        LabelLarge = TextStyle.c(textStyleA10, 0L, mVar.V(), mVar.X(), null, null, j0VarT, null, mVar.W(), null, null, null, 0L, null, null, null, 0, 0, mVar.U(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA11 = q.a();
        j0 j0VarY = mVar.Y();
        LabelMedium = TextStyle.c(textStyleA11, 0L, mVar.a0(), mVar.c0(), null, null, j0VarY, null, mVar.b0(), null, null, null, 0L, null, null, null, 0, 0, mVar.Z(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA12 = q.a();
        j0 j0VarD0 = mVar.d0();
        LabelSmall = TextStyle.c(textStyleA12, 0L, mVar.f0(), mVar.h0(), null, null, j0VarD0, null, mVar.g0(), null, null, null, 0L, null, null, null, 0, 0, mVar.e0(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA13 = q.a();
        j0 j0VarI0 = mVar.i0();
        TitleLarge = TextStyle.c(textStyleA13, 0L, mVar.k0(), mVar.m0(), null, null, j0VarI0, null, mVar.l0(), null, null, null, 0L, null, null, null, 0, 0, mVar.j0(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA14 = q.a();
        j0 j0VarN0 = mVar.n0();
        TitleMedium = TextStyle.c(textStyleA14, 0L, mVar.p0(), mVar.r0(), null, null, j0VarN0, null, mVar.q0(), null, null, null, 0L, null, null, null, 0, 0, mVar.o0(), null, null, null, 0, 0, null, 16645977, null);
        TextStyle textStyleA15 = q.a();
        j0 j0VarS0 = mVar.s0();
        TitleSmall = TextStyle.c(textStyleA15, 0L, mVar.u0(), mVar.w0(), null, null, j0VarS0, null, mVar.v0(), null, null, null, 0L, null, null, null, 0, 0, mVar.t0(), null, null, null, 0, 0, null, 16645977, null);
    }

    private p() {
    }

    public final TextStyle a() {
        return BodyLarge;
    }

    public final TextStyle b() {
        return BodyMedium;
    }

    public final TextStyle c() {
        return BodySmall;
    }

    public final TextStyle d() {
        return DisplayLarge;
    }

    public final TextStyle e() {
        return DisplayMedium;
    }

    public final TextStyle f() {
        return DisplaySmall;
    }

    public final TextStyle g() {
        return HeadlineLarge;
    }

    public final TextStyle h() {
        return HeadlineMedium;
    }

    public final TextStyle i() {
        return HeadlineSmall;
    }

    public final TextStyle j() {
        return LabelLarge;
    }

    public final TextStyle k() {
        return LabelMedium;
    }

    public final TextStyle l() {
        return LabelSmall;
    }

    public final TextStyle m() {
        return TitleLarge;
    }

    public final TextStyle n() {
        return TitleMedium;
    }

    public final TextStyle o() {
        return TitleSmall;
    }
}
