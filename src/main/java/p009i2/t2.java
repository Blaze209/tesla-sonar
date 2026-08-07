package p009i2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import k3.p1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.u;
import p015o1.Function1;
import p019p1.f0;
import p019p1.g0;
import p019p1.j;
import p019p1.l1;
import p019p1.m;
import p019p1.m1;
import p019p1.o1;
import p019p1.r1;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import wn0.p;
import wn0.q;
import wn0.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jl\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\u000b2$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017²\u0006\f\u0010\u0013\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Li2/t2;", "", "<init>", "()V", "Li2/f1;", "inputState", "Lk3/p1;", "focusedTextStyleColor", "unfocusedTextStyleColor", "Lkotlin/Function1;", "contentColor", "", "showLabel", "Lkotlin/Function4;", "", "Ljn0/h0;", "content", "a", "(Li2/f1;JJLwn0/q;ZLwn0/t;Lr2/l;I)V", "labelProgress", "placeholderOpacity", "labelTextStyleColor", "labelContentColor", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t2 f75249a = new t2();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f1 f75251d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f75252e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f75253f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<f1, l, Integer, p1> f75254g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f75255h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ t<Float, p1, p1, Float, l, Integer, h0> f75256i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f75257j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(f1 f1Var, long j11, long j12, q<? super f1, ? super l, ? super Integer, p1> qVar, boolean z11, t<? super Float, ? super p1, ? super p1, ? super Float, ? super l, ? super Integer, h0> tVar, int i11) {
            super(2);
            this.f75251d = f1Var;
            this.f75252e = j11;
            this.f75253f = j12;
            this.f75254g = qVar;
            this.f75255h = z11;
            this.f75256i = tVar;
            this.f75257j = i11;
        }

        public final void a(l lVar, int i11) {
            t2.this.a(this.f75251d, this.f75252e, this.f75253f, this.f75254g, this.f75255h, this.f75256i, lVar, k2.a(this.f75257j | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Li2/f1;", "Lp1/g0;", "Lk3/p1;", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class b extends u implements q<l1.b<f1>, l, Integer, g0<p1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f75258c = new b();

        b() {
            super(3);
        }

        public final g0<p1> a(l1.b<f1> bVar, l lVar, int i11) {
            lVar.o(-32667848);
            if (o.J()) {
                o.S(-32667848, i11, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:328)");
            }
            o1 o1VarL = j.l(150, 0, null, 6, null);
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return o1VarL;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ g0<p1> invoke(l1.b<f1> bVar, l lVar, Integer num) {
            return a(bVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Li2/f1;", "Lp1/g0;", "", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class c extends u implements q<l1.b<f1>, l, Integer, g0<Float>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f75259c = new c();

        c() {
            super(3);
        }

        public final g0<Float> a(l1.b<f1> bVar, l lVar, int i11) {
            lVar.o(-611722692);
            if (o.J()) {
                o.S(-611722692, i11, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:280)");
            }
            o1 o1VarL = j.l(150, 0, null, 6, null);
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return o1VarL;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ g0<Float> invoke(l1.b<f1> bVar, l lVar, Integer num) {
            return a(bVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Li2/f1;", "Lp1/g0;", "Lk3/p1;", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class d extends u implements q<l1.b<f1>, l, Integer, g0<p1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f75260c = new d();

        d() {
            super(3);
        }

        public final g0<p1> a(l1.b<f1> bVar, l lVar, int i11) {
            lVar.o(-130058045);
            if (o.J()) {
                o.S(-130058045, i11, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:318)");
            }
            o1 o1VarL = j.l(150, 0, null, 6, null);
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return o1VarL;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ g0<p1> invoke(l1.b<f1> bVar, l lVar, Integer num) {
            return a(bVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Li2/f1;", "Lp1/g0;", "", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 8, 0})
    static final class e extends u implements q<l1.b<f1>, l, Integer, g0<Float>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f75261c = new e();

        e() {
            super(3);
        }

        public final g0<Float> a(l1.b<f1> bVar, l lVar, int i11) {
            g0<Float> g0VarK;
            lVar.o(-1079955085);
            if (o.J()) {
                o.S(-1079955085, i11, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:292)");
            }
            f1 f1Var = f1.Focused;
            f1 f1Var2 = f1.UnfocusedEmpty;
            if (bVar.b(f1Var, f1Var2)) {
                g0VarK = j.l(67, 0, f0.d(), 2, null);
            } else {
                g0VarK = (bVar.b(f1Var2, f1Var) || bVar.b(f1.UnfocusedNotEmpty, f1Var2)) ? j.k(83, 67, f0.d()) : j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
            }
            if (o.J()) {
                o.R();
            }
            lVar.l();
            return g0VarK;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ g0<Float> invoke(l1.b<f1> bVar, l lVar, Integer num) {
            return a(bVar, lVar, num.intValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75262a;

        static {
            int[] iArr = new int[f1.values().length];
            try {
                iArr[f1.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f1.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f1.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75262a = iArr;
        }
    }

    private t2() {
    }

    private static final float b(y3<Float> y3Var) {
        return y3Var.getValue().floatValue();
    }

    private static final float c(y3<Float> y3Var) {
        return y3Var.getValue().floatValue();
    }

    private static final long d(y3<p1> y3Var) {
        return y3Var.getValue().getValue();
    }

    private static final long e(y3<p1> y3Var) {
        return y3Var.getValue().getValue();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01de  */
    public final void a(f1 f1Var, long j11, long j12, q<? super f1, ? super l, ? super Integer, p1> qVar, boolean z11, t<? super Float, ? super p1, ? super p1, ? super Float, ? super l, ? super Integer, h0> tVar, l lVar, int i11) {
        int i12;
        t<? super Float, ? super p1, ? super p1, ? super Float, ? super l, ? super Integer, h0> tVar2;
        float f11;
        int i13;
        float f12;
        float f13;
        l lVar2;
        l lVarV = lVar.v(1988729962);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.n(f1Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.s(j11) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.s(j12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= lVarV.K(qVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= lVarV.p(z11) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i11) == 0) {
            tVar2 = tVar;
            i12 |= lVarV.K(tVar2) ? 131072 : 65536;
        } else {
            tVar2 = tVar;
        }
        if ((74899 & i12) == 74898 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (o.J()) {
                o.S(1988729962, i12, -1, "androidx.compose.material.TextFieldTransitionScope.Transition (TextFieldImpl.kt:272)");
            }
            l1 l1VarG = m1.g(f1Var, "TextFieldInputState", lVarV, (i12 & 14) | 48, 0);
            c cVar = c.f75259c;
            p013kotlin.jvm.internal.l lVar3 = p013kotlin.jvm.internal.l.f86526a;
            p019p1.p1<Float, m> p1VarE = r1.e(lVar3);
            f1 f1Var2 = (f1) l1VarG.i();
            lVarV.o(-1158004136);
            if (o.J()) {
                o.S(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:282)");
            }
            int[] iArr = f.f75262a;
            int i14 = iArr[f1Var2.ordinal()];
            float f14 = BitmapDescriptorFactory.HUE_RED;
            if (i14 == 1) {
                f11 = 1.0f;
            } else if (i14 != 2) {
                if (i14 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (o.J()) {
                o.R();
            }
            lVarV.l();
            Float fValueOf = Float.valueOf(f11);
            f1 f1Var3 = (f1) l1VarG.p();
            lVarV.o(-1158004136);
            if (o.J()) {
                i13 = -1;
                o.S(-1158004136, 0, -1, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:282)");
            } else {
                i13 = -1;
            }
            int i15 = iArr[f1Var3.ordinal()];
            if (i15 == 1) {
                f12 = 1.0f;
            } else if (i15 != 2) {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            if (o.J()) {
                o.R();
            }
            lVarV.l();
            y3 y3VarD = m1.d(l1VarG, fValueOf, Float.valueOf(f12), cVar.invoke(l1VarG.n(), lVarV, 0), p1VarE, "LabelProgress", lVarV, 196608);
            e eVar = e.f75261c;
            p019p1.p1<Float, m> p1VarE2 = r1.e(lVar3);
            f1 f1Var4 = (f1) l1VarG.i();
            lVarV.o(-1376159017);
            if (o.J()) {
                o.S(-1376159017, 0, i13, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:310)");
            }
            int i16 = iArr[f1Var4.ordinal()];
            if (i16 == 1) {
                f13 = 1.0f;
            } else {
                if (i16 != 2) {
                    if (i16 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else if (!z11) {
                    f13 = 1.0f;
                }
                f13 = 0.0f;
            }
            if (o.J()) {
                o.R();
            }
            lVarV.l();
            Float fValueOf2 = Float.valueOf(f13);
            f1 f1Var5 = (f1) l1VarG.p();
            lVarV.o(-1376159017);
            if (o.J()) {
                o.S(-1376159017, 0, i13, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:310)");
            }
            int i17 = iArr[f1Var5.ordinal()];
            if (i17 == 1) {
                f14 = 1.0f;
            } else if (i17 != 2) {
                if (i17 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (!z11) {
                f14 = 1.0f;
            }
            if (o.J()) {
                o.R();
            }
            lVarV.l();
            y3 y3VarD2 = m1.d(l1VarG, fValueOf2, Float.valueOf(f14), eVar.invoke(l1VarG.n(), lVarV, 0), p1VarE2, "PlaceholderOpacity", lVarV, 196608);
            d dVar = d.f75260c;
            f1 f1Var6 = (f1) l1VarG.p();
            lVarV.o(-1490209928);
            if (o.J()) {
                o.S(-1490209928, 0, i13, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:321)");
            }
            long j13 = iArr[f1Var6.ordinal()] == 1 ? j11 : j12;
            if (o.J()) {
                o.R();
            }
            lVarV.l();
            l3.c cVarU = p1.u(j13);
            boolean zN = lVarV.n(cVarU);
            Object objI = lVarV.I();
            if (zN || objI == l.INSTANCE.a()) {
                objI = (p019p1.p1) Function1.a(p1.INSTANCE).invoke(cVarU);
                lVarV.B(objI);
            }
            p019p1.p1 p1Var = (p019p1.p1) objI;
            f1 f1Var7 = (f1) l1VarG.i();
            lVarV.o(-1490209928);
            if (o.J()) {
                o.S(-1490209928, 0, i13, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:321)");
            }
            long j14 = iArr[f1Var7.ordinal()] == 1 ? j11 : j12;
            if (o.J()) {
                o.R();
            }
            lVarV.l();
            p1 p1VarL = p1.l(j14);
            f1 f1Var8 = (f1) l1VarG.p();
            lVarV.o(-1490209928);
            if (o.J()) {
                o.S(-1490209928, 0, i13, "androidx.compose.material.TextFieldTransitionScope.Transition.<anonymous> (TextFieldImpl.kt:321)");
            }
            long j15 = iArr[f1Var8.ordinal()] == 1 ? j11 : j12;
            if (o.J()) {
                o.R();
            }
            lVarV.l();
            y3 y3VarD3 = m1.d(l1VarG, p1VarL, p1.l(j15), dVar.invoke(l1VarG.n(), lVarV, 0), p1Var, "LabelTextStyleColor", lVarV, 196608);
            b bVar = b.f75258c;
            int i18 = (i12 & 7168) | KyberEngine.KyberPolyBytes;
            l3.c cVarU2 = p1.u(qVar.invoke(l1VarG.p(), lVarV, Integer.valueOf((i18 >> 6) & 112)).getValue());
            boolean zN2 = lVarV.n(cVarU2);
            Object objI2 = lVarV.I();
            if (zN2 || objI2 == l.INSTANCE.a()) {
                objI2 = (p019p1.p1) Function1.a(p1.INSTANCE).invoke(cVarU2);
                lVarV.B(objI2);
            }
            int i19 = ((((i18 << 3) & 57344) | 3072) >> 9) & 112;
            tVar2.i(Float.valueOf(b(y3VarD)), p1.l(d(y3VarD3)), p1.l(e(m1.d(l1VarG, qVar.invoke(l1VarG.i(), lVarV, Integer.valueOf(i19)), qVar.invoke(l1VarG.p(), lVarV, Integer.valueOf(i19)), bVar.invoke(l1VarG.n(), lVarV, 0), (p019p1.p1) objI2, "LabelContentColor", lVarV, 196608))), Float.valueOf(c(y3VarD2)), lVarV, Integer.valueOf((i12 >> 3) & 57344));
            lVar2 = lVarV;
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new a(f1Var, j11, j12, qVar, z11, tVar, i11));
        }
    }
}
