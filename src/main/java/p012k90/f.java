package p012k90;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import jn0.h0;
import k3.p1;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jl\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t2\u0006\u0010\f\u001a\u00020\u000b2$\u0010\u0010\u001a \u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017²\u0006\f\u0010\u0013\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0014\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0016\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lk90/f;", "", "<init>", "()V", "Lk90/c;", "inputState", "Lk3/p1;", "focusedTextStyleColor", "unfocusedTextStyleColor", "Lkotlin/Function1;", "contentColor", "", "showLabel", "Lkotlin/Function4;", "", "Ljn0/h0;", "content", "a", "(Lk90/c;JJLwn0/q;ZLwn0/t;Lr2/l;I)V", "labelProgress", "placeholderOpacity", "labelTextStyleColor", "labelContentColor", "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f85570a = new f();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p012k90.c f85572d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f85573e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f85574f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ q<p012k90.c, l, Integer, p1> f85575g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f85576h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ t<Float, p1, p1, Float, l, Integer, h0> f85577i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f85578j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p012k90.c cVar, long j11, long j12, q<? super p012k90.c, ? super l, ? super Integer, p1> qVar, boolean z11, t<? super Float, ? super p1, ? super p1, ? super Float, ? super l, ? super Integer, h0> tVar, int i11) {
            super(2);
            this.f85572d = cVar;
            this.f85573e = j11;
            this.f85574f = j12;
            this.f85575g = qVar;
            this.f85576h = z11;
            this.f85577i = tVar;
            this.f85578j = i11;
        }

        public final void a(l lVar, int i11) {
            f.this.a(this.f85572d, this.f85573e, this.f85574f, this.f85575g, this.f85576h, this.f85577i, lVar, k2.a(this.f85578j | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lk90/c;", "Lp1/g0;", "Lk3/p1;", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements q<l1.b<p012k90.c>, l, Integer, g0<p1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f85579c = new b();

        b() {
            super(3);
        }

        public final g0<p1> a(l1.b<p012k90.c> animateColor, l lVar, int i11) {
            s.k(animateColor, "$this$animateColor");
            lVar.H(1796476355);
            if (o.J()) {
                o.S(1796476355, i11, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:434)");
            }
            o1 o1VarL = j.l(150, 0, null, 6, null);
            if (o.J()) {
                o.R();
            }
            lVar.T();
            return o1VarL;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ g0<p1> invoke(l1.b<p012k90.c> bVar, l lVar, Integer num) {
            return a(bVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lk90/c;", "Lp1/g0;", "", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 9, 0})
    static final class c extends u implements q<l1.b<p012k90.c>, l, Integer, g0<Float>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f85580c = new c();

        c() {
            super(3);
        }

        public final g0<Float> a(l1.b<p012k90.c> animateFloat, l lVar, int i11) {
            s.k(animateFloat, "$this$animateFloat");
            lVar.H(-706009145);
            if (o.J()) {
                o.S(-706009145, i11, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:386)");
            }
            o1 o1VarL = j.l(150, 0, null, 6, null);
            if (o.J()) {
                o.R();
            }
            lVar.T();
            return o1VarL;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ g0<Float> invoke(l1.b<p012k90.c> bVar, l lVar, Integer num) {
            return a(bVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lk90/c;", "Lp1/g0;", "Lk3/p1;", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements q<l1.b<p012k90.c>, l, Integer, g0<p1>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f85581c = new d();

        d() {
            super(3);
        }

        public final g0<p1> a(l1.b<p012k90.c> animateColor, l lVar, int i11) {
            s.k(animateColor, "$this$animateColor");
            lVar.H(-1399926130);
            if (o.J()) {
                o.S(-1399926130, i11, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:424)");
            }
            o1 o1VarL = j.l(150, 0, null, 6, null);
            if (o.J()) {
                o.R();
            }
            lVar.T();
            return o1VarL;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ g0<p1> invoke(l1.b<p012k90.c> bVar, l lVar, Integer num) {
            return a(bVar, lVar, num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lp1/l1$b;", "Lk90/c;", "Lp1/g0;", "", "a", "(Lp1/l1$b;Lr2/l;I)Lp1/g0;"}, k = 3, mv = {1, 9, 0})
    static final class e extends u implements q<l1.b<p012k90.c>, l, Integer, g0<Float>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f85582c = new e();

        e() {
            super(3);
        }

        public final g0<Float> a(l1.b<p012k90.c> animateFloat, l lVar, int i11) {
            g0<Float> g0VarK;
            s.k(animateFloat, "$this$animateFloat");
            lVar.H(-1726628034);
            if (o.J()) {
                o.S(-1726628034, i11, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:398)");
            }
            p012k90.c cVar = p012k90.c.Focused;
            p012k90.c cVar2 = p012k90.c.UnfocusedEmpty;
            if (animateFloat.b(cVar, cVar2)) {
                g0VarK = j.l(67, 0, f0.d(), 2, null);
            } else {
                g0VarK = (animateFloat.b(cVar2, cVar) || animateFloat.b(p012k90.c.UnfocusedNotEmpty, cVar2)) ? j.k(83, 67, f0.d()) : j.j(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, 7, null);
            }
            if (o.J()) {
                o.R();
            }
            lVar.T();
            return g0VarK;
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ g0<Float> invoke(l1.b<p012k90.c> bVar, l lVar, Integer num) {
            return a(bVar, lVar, num.intValue());
        }
    }

    /* JADX INFO: renamed from: k90.f$f, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class C1823f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85583a;

        static {
            int[] iArr = new int[p012k90.c.values().length];
            try {
                iArr[p012k90.c.Focused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p012k90.c.UnfocusedEmpty.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p012k90.c.UnfocusedNotEmpty.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f85583a = iArr;
        }
    }

    private f() {
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

    /* JADX WARN: Code duplicated, block: B:103:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:121:0x020f  */
    public final void a(p012k90.c inputState, long j11, long j12, q<? super p012k90.c, ? super l, ? super Integer, p1> contentColor, boolean z11, t<? super Float, ? super p1, ? super p1, ? super Float, ? super l, ? super Integer, h0> content, l lVar, int i11) {
        int i12;
        float f11;
        int i13;
        float f12;
        float f13;
        s.k(inputState, "inputState");
        s.k(contentColor, "contentColor");
        s.k(content, "content");
        l lVarV = lVar.v(1641806453);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(inputState) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.s(j11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.s(j12) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= lVarV.K(contentColor) ? 2048 : 1024;
        }
        if ((i11 & 57344) == 0) {
            i12 |= lVarV.p(z11) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((458752 & i11) == 0) {
            i12 |= lVarV.K(content) ? 131072 : 65536;
        }
        if ((374491 & i12) == 74898 && lVarV.b()) {
            lVarV.j();
        } else {
            if (o.J()) {
                o.S(1641806453, i12, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition (CompatTextField.kt:378)");
            }
            l1 l1VarG = m1.g(inputState, "TextFieldInputState", lVarV, (i12 & 14) | 48, 0);
            c cVar = c.f85580c;
            lVarV.H(-1338768149);
            p013kotlin.jvm.internal.l lVar2 = p013kotlin.jvm.internal.l.f86526a;
            p019p1.p1<Float, m> p1VarE = r1.e(lVar2);
            lVarV.H(-142660079);
            p012k90.c cVar2 = (p012k90.c) l1VarG.i();
            lVarV.H(1874084067);
            if (o.J()) {
                o.S(1874084067, 0, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:388)");
            }
            int[] iArr = C1823f.f85583a;
            int i14 = iArr[cVar2.ordinal()];
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
            lVarV.T();
            Float fValueOf = Float.valueOf(f11);
            p012k90.c cVar3 = (p012k90.c) l1VarG.p();
            lVarV.H(1874084067);
            if (o.J()) {
                i13 = -1;
                o.S(1874084067, 0, -1, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:388)");
            } else {
                i13 = -1;
            }
            int i15 = iArr[cVar3.ordinal()];
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
            lVarV.T();
            y3 y3VarD = m1.d(l1VarG, fValueOf, Float.valueOf(f12), cVar.invoke(l1VarG.n(), lVarV, 0), p1VarE, "LabelProgress", lVarV, 196608);
            lVarV.T();
            lVarV.T();
            e eVar = e.f85582c;
            lVarV.H(-1338768149);
            p019p1.p1<Float, m> p1VarE2 = r1.e(lVar2);
            lVarV.H(-142660079);
            p012k90.c cVar4 = (p012k90.c) l1VarG.i();
            lVarV.H(-1914964062);
            if (o.J()) {
                o.S(-1914964062, 0, i13, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:416)");
            }
            int i16 = iArr[cVar4.ordinal()];
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
            lVarV.T();
            Float fValueOf2 = Float.valueOf(f13);
            p012k90.c cVar5 = (p012k90.c) l1VarG.p();
            lVarV.H(-1914964062);
            if (o.J()) {
                o.S(-1914964062, 0, i13, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:416)");
            }
            int i17 = iArr[cVar5.ordinal()];
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
            lVarV.T();
            y3 y3VarD2 = m1.d(l1VarG, fValueOf2, Float.valueOf(f14), eVar.invoke(l1VarG.n(), lVarV, 0), p1VarE2, "PlaceholderOpacity", lVarV, 196608);
            lVarV.T();
            lVarV.T();
            d dVar = d.f85581c;
            lVarV.H(-1939694975);
            p012k90.c cVar6 = (p012k90.c) l1VarG.p();
            lVarV.H(-1900467709);
            if (o.J()) {
                o.S(-1900467709, 0, i13, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:427)");
            }
            long j13 = iArr[cVar6.ordinal()] == 1 ? j11 : j12;
            if (o.J()) {
                o.R();
            }
            lVarV.T();
            l3.c cVarU = p1.u(j13);
            lVarV.H(1157296644);
            boolean zN = lVarV.n(cVarU);
            Object objI = lVarV.I();
            if (zN || objI == l.INSTANCE.a()) {
                objI = (p019p1.p1) Function1.a(p1.INSTANCE).invoke(cVarU);
                lVarV.B(objI);
            }
            lVarV.T();
            p019p1.p1 p1Var = (p019p1.p1) objI;
            lVarV.H(-142660079);
            p012k90.c cVar7 = (p012k90.c) l1VarG.i();
            lVarV.H(-1900467709);
            if (o.J()) {
                o.S(-1900467709, 0, i13, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:427)");
            }
            long j14 = iArr[cVar7.ordinal()] == 1 ? j11 : j12;
            if (o.J()) {
                o.R();
            }
            lVarV.T();
            p1 p1VarL = p1.l(j14);
            p012k90.c cVar8 = (p012k90.c) l1VarG.p();
            lVarV.H(-1900467709);
            if (o.J()) {
                o.S(-1900467709, 0, i13, "com.stripe.android.uicore.elements.compat.TextFieldTransitionScope.Transition.<anonymous> (CompatTextField.kt:427)");
            }
            long j15 = iArr[cVar8.ordinal()] == 1 ? j11 : j12;
            if (o.J()) {
                o.R();
            }
            lVarV.T();
            y3 y3VarD3 = m1.d(l1VarG, p1VarL, p1.l(j15), dVar.invoke(l1VarG.n(), lVarV, 0), p1Var, "LabelTextStyleColor", lVarV, 229376);
            lVarV.T();
            lVarV.T();
            b bVar = b.f85579c;
            int i18 = (i12 & 7168) | KyberEngine.KyberPolyBytes;
            lVarV.H(-1939694975);
            l3.c cVarU2 = p1.u(contentColor.invoke(l1VarG.p(), lVarV, Integer.valueOf((i18 >> 6) & 112)).getValue());
            lVarV.H(1157296644);
            boolean zN2 = lVarV.n(cVarU2);
            Object objI2 = lVarV.I();
            if (zN2 || objI2 == l.INSTANCE.a()) {
                objI2 = (p019p1.p1) Function1.a(p1.INSTANCE).invoke(cVarU2);
                lVarV.B(objI2);
            }
            lVarV.T();
            lVarV.H(-142660079);
            int i19 = ((((i18 << 3) & 57344) | 3136) >> 9) & 112;
            y3 y3VarD4 = m1.d(l1VarG, contentColor.invoke(l1VarG.i(), lVarV, Integer.valueOf(i19)), contentColor.invoke(l1VarG.p(), lVarV, Integer.valueOf(i19)), bVar.invoke(l1VarG.n(), lVarV, 0), (p019p1.p1) objI2, "LabelContentColor", lVarV, 229376);
            lVarV = lVarV;
            lVarV.T();
            lVarV.T();
            content.i(Float.valueOf(b(y3VarD)), p1.l(d(y3VarD3)), p1.l(e(y3VarD4)), Float.valueOf(c(y3VarD2)), lVarV, Integer.valueOf((i12 >> 3) & 57344));
            if (o.J()) {
                o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(inputState, j11, j12, contentColor, z11, content, i11));
        }
    }
}
