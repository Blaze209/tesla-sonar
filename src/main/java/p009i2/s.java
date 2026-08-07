package p009i2;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import k3.p1;
import k3.r1;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.u;
import p020r2.g2;
import p020r2.l;
import p020r2.o;
import p020r2.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0088\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0088\u0001\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000f\u001a\u001c\u0010\u0012\u001a\u00020\u0000*\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001a\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\r2\u0006\u0010\u0016\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0018\u0010\u0019\" \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0015\u0010!\u001a\u00020\u0000*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Lk3/p1;", "primary", "primaryVariant", "secondary", "secondaryVariant", AppStateModule.APP_STATE_BACKGROUND, "surface", AnalyticsAttribute.Error, "onPrimary", "onSecondary", "onBackground", "onSurface", "onError", "Li2/r;", "g", "(JJJJJJJJJJJJ)Li2/r;", "c", "backgroundColor", "a", "(Li2/r;J)J", "b", "(JLr2/l;I)J", "other", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(Li2/r;Li2/r;)V", "Lr2/g2;", "Lr2/g2;", "e", "()Lr2/g2;", "LocalColors", "f", "(Li2/r;)J", "primarySurface", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g2<Colors> f75162a = w.f(a.f75163c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Li2/r;", "b", "()Li2/r;"}, k = 3, mv = {1, 8, 0})
    static final class a extends u implements wn0.a<Colors> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f75163c = new a();

        a() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Colors invoke() {
            return s.h(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    }

    public static final long a(Colors rVar, long j11) {
        if (p1.r(j11, rVar.j())) {
            return rVar.g();
        }
        if (p1.r(j11, rVar.k())) {
            return rVar.g();
        }
        if (p1.r(j11, rVar.l())) {
            return rVar.h();
        }
        if (p1.r(j11, rVar.m())) {
            return rVar.h();
        }
        if (p1.r(j11, rVar.c())) {
            return rVar.e();
        }
        if (p1.r(j11, rVar.n())) {
            return rVar.i();
        }
        return p1.r(j11, rVar.d()) ? rVar.f() : p1.INSTANCE.j();
    }

    public static final long b(long j11, l lVar, int i11) {
        if (o.J()) {
            o.S(441849991, i11, -1, "androidx.compose.material.contentColorFor (Colors.kt:296)");
        }
        lVar.o(-702395103);
        long jA = a(j1.f74525a.a(lVar, 6), j11);
        if (jA == 16) {
            jA = ((p1) lVar.U(z.a())).getValue();
        }
        lVar.l();
        if (o.J()) {
            o.R();
        }
        return jA;
    }

    public static final Colors c(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23) {
        return new Colors(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, false, null);
    }

    public static /* synthetic */ Colors d(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, int i11, Object obj) {
        long jD = (i11 & 1) != 0 ? r1.d(4290479868L) : j11;
        long jD2 = (i11 & 2) != 0 ? r1.d(4281794739L) : j12;
        long jD3 = (i11 & 4) != 0 ? r1.d(4278442694L) : j13;
        long j24 = (i11 & 8) != 0 ? jD3 : j14;
        long jD4 = (i11 & 16) != 0 ? r1.d(4279374354L) : j15;
        long jD5 = (i11 & 32) != 0 ? r1.d(4279374354L) : j16;
        long jD6 = (i11 & 64) != 0 ? r1.d(4291782265L) : j17;
        long jA = (i11 & 128) != 0 ? p1.INSTANCE.a() : j18;
        long jA2 = (i11 & 256) != 0 ? p1.INSTANCE.a() : j19;
        long jK = (i11 & 512) != 0 ? p1.INSTANCE.k() : j21;
        long jK2 = (i11 & 1024) != 0 ? p1.INSTANCE.k() : j22;
        if ((i11 & 2048) != 0) {
            j23 = p1.INSTANCE.a();
        }
        return c(jD, jD2, jD3, j24, jD4, jD5, jD6, jA, jA2, jK, jK2, j23);
    }

    public static final g2<Colors> e() {
        return f75162a;
    }

    public static final long f(Colors rVar) {
        return rVar.o() ? rVar.j() : rVar.n();
    }

    public static final Colors g(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23) {
        return new Colors(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, true, null);
    }

    public static /* synthetic */ Colors h(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, int i11, Object obj) {
        long jD = (i11 & 1) != 0 ? r1.d(4284612846L) : j11;
        long jD2 = (i11 & 2) != 0 ? r1.d(4281794739L) : j12;
        long jD3 = (i11 & 4) != 0 ? r1.d(4278442694L) : j13;
        long jD4 = (i11 & 8) != 0 ? r1.d(4278290310L) : j14;
        long jK = (i11 & 16) != 0 ? p1.INSTANCE.k() : j15;
        long jK2 = (i11 & 32) != 0 ? p1.INSTANCE.k() : j16;
        long jD5 = (i11 & 64) != 0 ? r1.d(4289724448L) : j17;
        long jK3 = (i11 & 128) != 0 ? p1.INSTANCE.k() : j18;
        long j24 = jD;
        long jA = (i11 & 256) != 0 ? p1.INSTANCE.a() : j19;
        long jA2 = (i11 & 512) != 0 ? p1.INSTANCE.a() : j21;
        long jA3 = (i11 & 1024) != 0 ? p1.INSTANCE.a() : j22;
        if ((i11 & 2048) != 0) {
            j23 = p1.INSTANCE.k();
        }
        return g(j24, jD2, jD3, jD4, jK, jK2, jD5, jK3, jA, jA2, jA3, j23);
    }

    public static final void i(Colors rVar, Colors rVar2) {
        rVar.x(rVar2.j());
        rVar.y(rVar2.k());
        rVar.z(rVar2.l());
        rVar.A(rVar2.m());
        rVar.p(rVar2.c());
        rVar.B(rVar2.n());
        rVar.q(rVar2.d());
        rVar.u(rVar2.g());
        rVar.v(rVar2.h());
        rVar.s(rVar2.e());
        rVar.w(rVar2.i());
        rVar.t(rVar2.f());
        rVar.r(rVar2.o());
    }
}
