package com.fourthline.orca.internal;

import com.fourthline.sdk.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: renamed from: com.fourthline.orca.internal.ui, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3904ui {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f35913a = w4.h.g(8);

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ui$a */
    static final class a implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f35914a;

        a(androidx.compose.ui.d dVar) {
            this.f35914a = dVar;
        }

        public final void a(v1.i OrcaScaffold, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(OrcaScaffold, "$this$OrcaScaffold");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(746205251, i11, -1, "com.fourthline.orca.core.internal.composable.IntroSkeletonScreen.<anonymous> (IntroSkeletonScreen.kt:82)");
            }
            v1.i0.a(androidx.compose.foundation.layout.x.i(androidx.compose.ui.d.INSTANCE, w4.h.g(24)), lVar, 6);
            AbstractC3904ui.a(this.f35914a, lVar, 6, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.i) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ui$b */
    static final class b implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f35915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f35916b;

        b(androidx.compose.ui.d dVar, androidx.compose.ui.d dVar2) {
            this.f35915a = dVar;
            this.f35916b = dVar2;
        }

        public final void a(v1.i OrcaScaffold, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(OrcaScaffold, "$this$OrcaScaffold");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1693372194, i11, -1, "com.fourthline.orca.core.internal.composable.IntroSkeletonScreen.<anonymous> (IntroSkeletonScreen.kt:89)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            androidx.compose.ui.d dVar = this.f35915a;
            androidx.compose.ui.d dVar2 = this.f35916b;
            v1.b bVar = v1.b.f117444a;
            v1.b.m mVarG = bVar.g();
            d3.c.Companion companion2 = d3.c.INSTANCE;
            z3.i0 i0VarA = v1.g.a(mVarG, companion2.k(), lVar, 0);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarH);
            b4.g.Companion companion3 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion3.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.u()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVar);
            p020r2.d4.b(lVarA, i0VarA, companion3.c());
            p020r2.d4.b(lVarA, xVarC, companion3.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion3.b();
            if (lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion3.d());
            v1.j jVar = v1.j.f117505a;
            androidx.compose.ui.d dVarB = v1.i.b(jVar, companion, 1.0f, false, 2, null);
            z3.i0 i0VarA2 = v1.g.a(bVar.g(), companion2.k(), lVar, 0);
            int iA2 = p020r2.j.a(lVar, 0);
            p020r2.x xVarC2 = lVar.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVar, dVarB);
            wn0.a<b4.g> aVarA2 = companion3.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.u()) {
                lVar.z(aVarA2);
            } else {
                lVar.d();
            }
            p020r2.l lVarA2 = p020r2.d4.a(lVar);
            p020r2.d4.b(lVarA2, i0VarA2, companion3.c());
            p020r2.d4.b(lVarA2, xVarC2, companion3.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB2 = companion3.b();
            if (lVarA2.u() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE2, companion3.d());
            float f11 = 16;
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(f11)), lVar, 6);
            androidx.compose.ui.d dVarA = jVar.a(AbstractC3307gk.a(companion, "illustrationView", (String) null, 2, (Object) null), 1.0f, false);
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(companion2.o(), false);
            int iA3 = p020r2.j.a(lVar, 0);
            p020r2.x xVarC3 = lVar.c();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVar, dVarA);
            wn0.a<b4.g> aVarA3 = companion3.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.u()) {
                lVar.z(aVarA3);
            } else {
                lVar.d();
            }
            p020r2.l lVarA3 = p020r2.d4.a(lVar);
            p020r2.d4.b(lVarA3, i0VarH, companion3.c());
            p020r2.d4.b(lVarA3, xVarC3, companion3.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB3 = companion3.b();
            if (lVarA3.u() || !p013kotlin.jvm.internal.s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            p020r2.d4.b(lVarA3, dVarE3, companion3.d());
            AbstractC3904ui.a(androidx.compose.foundation.layout.d.b(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.i.f4585a.a(companion, companion2.e()), BitmapDescriptorFactory.HUE_RED, 1, null), 1.0f, false, 2, null), lVar, 0, 0);
            lVar.g();
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(f11)), lVar, 6);
            AbstractC3904ui.a(AbstractC3307gk.a(dVar, "titleView", (String) null, 2, (Object) null), lVar, 0, 0);
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(f11)), lVar, 6);
            AbstractC3904ui.a(AbstractC3307gk.a(dVar2, "messageView", (String) null, 2, (Object) null), lVar, 0, 0);
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(8)), lVar, 6);
            AbstractC3904ui.a(AbstractC3307gk.a(dVar2, "messageView", (String) null, 2, (Object) null), lVar, 0, 0);
            lVar.g();
            Ko ko2 = Ko.f26627a;
            AbstractC3904ui.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.x.i(companion, ko2.a()), BitmapDescriptorFactory.HUE_RED, 1, null), lVar, 6, 0);
            androidx.compose.foundation.layout.g.a(androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.x.i(companion, ko2.a()), BitmapDescriptorFactory.HUE_RED, 1, null), lVar, 6);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.i) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.ui$c */
    static final class c extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f35917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.a f35918b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(wn0.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f35918b = aVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f35918b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f35917a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f35918b.invoke();
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(String str, wn0.a aVar, wn0.a aVar2, int i11, int i12, p020r2.l lVar, int i13) {
        a(str, aVar, aVar2, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a() {
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b() {
        return jn0.h0.f84049a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0051  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:63:0x00df  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:71:0x0110  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:76:0x0187  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x0205  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, wn0.a aVar, wn0.a aVar2, p020r2.l lVar, final int i11, final int i12) {
        String str2;
        int i13;
        wn0.a aVar3;
        int i14;
        wn0.a aVar4;
        int i15;
        int i16;
        final String str3;
        wn0.a aVar5;
        final wn0.a aVar6;
        boolean z11;
        Object objI;
        Object objI2;
        p020r2.l.Companion companion;
        final String strC;
        boolean zN;
        Object objI3;
        boolean z12;
        Object objI4;
        final wn0.a aVar7;
        final wn0.a aVar8;
        Object objI5;
        Object objI6;
        p020r2.w2 w2VarX;
        p020r2.l lVarV = lVar.v(2119015642);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            str2 = str;
        } else if ((i11 & 6) == 0) {
            str2 = str;
            i13 = (lVarV.n(str2) ? 4 : 2) | i11;
        } else {
            str2 = str;
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 == 0) {
            if ((i11 & 48) == 0) {
                aVar3 = aVar;
                i13 |= lVarV.K(aVar3) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                    aVar4 = aVar2;
                    if (lVarV.K(aVar4)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i13;
                if ((i16 & 147) != 146 && lVarV.b()) {
                    lVarV.j();
                    str3 = str2;
                    aVar7 = aVar3;
                    aVar8 = aVar4;
                } else {
                    if (i17 != 0) {
                        str3 = "loading_skeleton";
                    } else {
                        str3 = str2;
                    }
                    if (i18 != 0) {
                        lVarV.o(-1827121918);
                        objI6 = lVarV.I();
                        if (objI6 == p020r2.l.INSTANCE.a()) {
                            objI6 = new wn0.a() { // from class: com.fourthline.orca.internal.df1
                                @Override // wn0.a
                                public final Object invoke() {
                                    return AbstractC3904ui.a();
                                }
                            };
                            lVarV.B(objI6);
                        }
                        aVar5 = (wn0.a) objI6;
                        lVarV.l();
                    } else {
                        aVar5 = aVar3;
                    }
                    if (i14 != 0) {
                        lVarV.o(-1827120574);
                        objI5 = lVarV.I();
                        if (objI5 == p020r2.l.INSTANCE.a()) {
                            objI5 = new wn0.a() { // from class: com.fourthline.orca.internal.ef1
                                @Override // wn0.a
                                public final Object invoke() {
                                    return AbstractC3904ui.b();
                                }
                            };
                            lVarV.B(objI5);
                        }
                        lVarV.l();
                        aVar6 = (wn0.a) objI5;
                    } else {
                        aVar6 = aVar4;
                    }
                    if (p020r2.o.J()) {
                        p020r2.o.S(2119015642, i16, -1, "com.fourthline.orca.core.internal.composable.IntroSkeletonScreen (IntroSkeletonScreen.kt:51)");
                    }
                    lVarV.o(-1827119771);
                    if ((i16 & 896) == 256) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI = lVarV.I();
                    if (!z11 || objI == p020r2.l.INSTANCE.a()) {
                        objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                            @Override // wn0.a
                            public final Object invoke() {
                                return AbstractC3904ui.a(aVar6);
                            }
                        };
                        lVarV.B(objI);
                    }
                    lVarV.l();
                    f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
                    lVarV.o(-1827117632);
                    objI2 = lVarV.I();
                    companion = p020r2.l.INSTANCE;
                    if (objI2 == companion.a()) {
                        objI2 = new p016o2.j0();
                        lVarV.B(objI2);
                    }
                    p016o2.j0 j0Var = (p016o2.j0) objI2;
                    lVarV.l();
                    androidx.compose.ui.d.Companion companion2 = androidx.compose.ui.d.INSTANCE;
                    androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(companion2, BitmapDescriptorFactory.HUE_RED, 1, null);
                    androidx.compose.ui.d dVarH2 = androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(companion2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.h.g(96), BitmapDescriptorFactory.HUE_RED, 11, null), BitmapDescriptorFactory.HUE_RED, 1, null);
                    Ko ko2 = Ko.f26627a;
                    float f11 = 2;
                    androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.x.i(dVarH2, w4.h.g(ko2.a() / f11));
                    androidx.compose.ui.d dVarI2 = androidx.compose.foundation.layout.x.i(dVarH, w4.h.g(ko2.a() / f11));
                    strC = RA.c(QA.a.a(QA.f27433a, R.string.shared_loading_intro_skeleton_accessibility, 0, 2, null), lVarV, 0);
                    androidx.compose.ui.d dVarB = AbstractC3307gk.b(companion2, str3);
                    lVarV.o(-1827095875);
                    zN = lVarV.n(strC);
                    objI3 = lVarV.I();
                    if (!zN || objI3 == companion.a()) {
                        objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                            @Override // wn0.l
                            public final Object invoke(Object obj) {
                                return AbstractC3904ui.a(strC, (g4.y) obj);
                            }
                        };
                        lVarV.B(objI3);
                    }
                    lVarV.l();
                    z12 = true;
                    Wo.a(androidx.compose.foundation.layout.x.f(g4.o.d(dVarB, false, (wn0.l) objI3, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), false, j0Var, z2.c.e(746205251, true, new a(dVarI), lVarV, 54), z2.c.e(1693372194, true, new b(dVarI, dVarI2), lVarV, 54), lVarV, 28032, 2);
                    jn0.h0 h0Var = jn0.h0.f84049a;
                    lVarV.o(-1827019809);
                    if ((i16 & 112) != 32) {
                        z12 = false;
                    }
                    objI4 = lVarV.I();
                    if (!z12 || objI4 == companion.a()) {
                        objI4 = new c(aVar5, null);
                        lVarV.B(objI4);
                    }
                    lVarV.l();
                    Function0.g(h0Var, (wn0.p) objI4, lVarV, 6);
                    if (p020r2.o.J()) {
                        p020r2.o.R();
                    }
                    aVar7 = aVar5;
                    aVar8 = aVar6;
                }
                w2VarX = lVarV.x();
                if (w2VarX != null) {
                    w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.hf1
                        @Override // wn0.p
                        public final Object invoke(Object obj, Object obj2) {
                            return AbstractC3904ui.a(str3, aVar7, aVar8, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= KyberEngine.KyberPolyBytes;
            aVar4 = aVar2;
            i16 = i13;
            if ((i16 & 147) != 146) {
                if (i17 != 0) {
                    str3 = "loading_skeleton";
                } else {
                    str3 = str2;
                }
                if (i18 != 0) {
                    lVarV.o(-1827121918);
                    objI6 = lVarV.I();
                    if (objI6 == p020r2.l.INSTANCE.a()) {
                        objI6 = new wn0.a() { // from class: com.fourthline.orca.internal.df1
                            @Override // wn0.a
                            public final Object invoke() {
                                return AbstractC3904ui.a();
                            }
                        };
                        lVarV.B(objI6);
                    }
                    aVar5 = (wn0.a) objI6;
                    lVarV.l();
                } else {
                    aVar5 = aVar3;
                }
                if (i14 != 0) {
                    lVarV.o(-1827120574);
                    objI5 = lVarV.I();
                    if (objI5 == p020r2.l.INSTANCE.a()) {
                        objI5 = new wn0.a() { // from class: com.fourthline.orca.internal.ef1
                            @Override // wn0.a
                            public final Object invoke() {
                                return AbstractC3904ui.b();
                            }
                        };
                        lVarV.B(objI5);
                    }
                    lVarV.l();
                    aVar6 = (wn0.a) objI5;
                } else {
                    aVar6 = aVar4;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(2119015642, i16, -1, "com.fourthline.orca.core.internal.composable.IntroSkeletonScreen (IntroSkeletonScreen.kt:51)");
                }
                lVarV.o(-1827119771);
                if ((i16 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (!z11) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3904ui.a(aVar6);
                        }
                    };
                    lVarV.B(objI);
                } else {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3904ui.a(aVar6);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
                lVarV.o(-1827117632);
                objI2 = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI2 == companion.a()) {
                    objI2 = new p016o2.j0();
                    lVarV.B(objI2);
                }
                p016o2.j0 j0Var2 = (p016o2.j0) objI2;
                lVarV.l();
                androidx.compose.ui.d.Companion companion3 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarH3 = androidx.compose.foundation.layout.x.h(companion3, BitmapDescriptorFactory.HUE_RED, 1, null);
                androidx.compose.ui.d dVarH4 = androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(companion3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.h.g(96), BitmapDescriptorFactory.HUE_RED, 11, null), BitmapDescriptorFactory.HUE_RED, 1, null);
                Ko ko3 = Ko.f26627a;
                float f12 = 2;
                androidx.compose.ui.d dVarI3 = androidx.compose.foundation.layout.x.i(dVarH4, w4.h.g(ko3.a() / f12));
                androidx.compose.ui.d dVarI4 = androidx.compose.foundation.layout.x.i(dVarH3, w4.h.g(ko3.a() / f12));
                strC = RA.c(QA.a.a(QA.f27433a, R.string.shared_loading_intro_skeleton_accessibility, 0, 2, null), lVarV, 0);
                androidx.compose.ui.d dVarB2 = AbstractC3307gk.b(companion3, str3);
                lVarV.o(-1827095875);
                zN = lVarV.n(strC);
                objI3 = lVarV.I();
                if (!zN) {
                    objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3904ui.a(strC, (g4.y) obj);
                        }
                    };
                    lVarV.B(objI3);
                } else {
                    objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3904ui.a(strC, (g4.y) obj);
                        }
                    };
                    lVarV.B(objI3);
                }
                lVarV.l();
                z12 = true;
                Wo.a(androidx.compose.foundation.layout.x.f(g4.o.d(dVarB2, false, (wn0.l) objI3, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), false, j0Var2, z2.c.e(746205251, true, new a(dVarI3), lVarV, 54), z2.c.e(1693372194, true, new b(dVarI3, dVarI4), lVarV, 54), lVarV, 28032, 2);
                jn0.h0 h0Var2 = jn0.h0.f84049a;
                lVarV.o(-1827019809);
                if ((i16 & 112) != 32) {
                    z12 = false;
                }
                objI4 = lVarV.I();
                if (!z12) {
                    objI4 = new c(aVar5, null);
                    lVarV.B(objI4);
                } else {
                    objI4 = new c(aVar5, null);
                    lVarV.B(objI4);
                }
                lVarV.l();
                Function0.g(h0Var2, (wn0.p) objI4, lVarV, 6);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                aVar7 = aVar5;
                aVar8 = aVar6;
            } else {
                if (i17 != 0) {
                    str3 = "loading_skeleton";
                } else {
                    str3 = str2;
                }
                if (i18 != 0) {
                    lVarV.o(-1827121918);
                    objI6 = lVarV.I();
                    if (objI6 == p020r2.l.INSTANCE.a()) {
                        objI6 = new wn0.a() { // from class: com.fourthline.orca.internal.df1
                            @Override // wn0.a
                            public final Object invoke() {
                                return AbstractC3904ui.a();
                            }
                        };
                        lVarV.B(objI6);
                    }
                    aVar5 = (wn0.a) objI6;
                    lVarV.l();
                } else {
                    aVar5 = aVar3;
                }
                if (i14 != 0) {
                    lVarV.o(-1827120574);
                    objI5 = lVarV.I();
                    if (objI5 == p020r2.l.INSTANCE.a()) {
                        objI5 = new wn0.a() { // from class: com.fourthline.orca.internal.ef1
                            @Override // wn0.a
                            public final Object invoke() {
                                return AbstractC3904ui.b();
                            }
                        };
                        lVarV.B(objI5);
                    }
                    lVarV.l();
                    aVar6 = (wn0.a) objI5;
                } else {
                    aVar6 = aVar4;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(2119015642, i16, -1, "com.fourthline.orca.core.internal.composable.IntroSkeletonScreen (IntroSkeletonScreen.kt:51)");
                }
                lVarV.o(-1827119771);
                if ((i16 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (!z11) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3904ui.a(aVar6);
                        }
                    };
                    lVarV.B(objI);
                } else {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3904ui.a(aVar6);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
                lVarV.o(-1827117632);
                objI2 = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI2 == companion.a()) {
                    objI2 = new p016o2.j0();
                    lVarV.B(objI2);
                }
                p016o2.j0 j0Var3 = (p016o2.j0) objI2;
                lVarV.l();
                androidx.compose.ui.d.Companion companion4 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarH5 = androidx.compose.foundation.layout.x.h(companion4, BitmapDescriptorFactory.HUE_RED, 1, null);
                androidx.compose.ui.d dVarH6 = androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(companion4, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.h.g(96), BitmapDescriptorFactory.HUE_RED, 11, null), BitmapDescriptorFactory.HUE_RED, 1, null);
                Ko ko4 = Ko.f26627a;
                float f13 = 2;
                androidx.compose.ui.d dVarI5 = androidx.compose.foundation.layout.x.i(dVarH6, w4.h.g(ko4.a() / f13));
                androidx.compose.ui.d dVarI6 = androidx.compose.foundation.layout.x.i(dVarH5, w4.h.g(ko4.a() / f13));
                strC = RA.c(QA.a.a(QA.f27433a, R.string.shared_loading_intro_skeleton_accessibility, 0, 2, null), lVarV, 0);
                androidx.compose.ui.d dVarB3 = AbstractC3307gk.b(companion4, str3);
                lVarV.o(-1827095875);
                zN = lVarV.n(strC);
                objI3 = lVarV.I();
                if (!zN) {
                    objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3904ui.a(strC, (g4.y) obj);
                        }
                    };
                    lVarV.B(objI3);
                } else {
                    objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3904ui.a(strC, (g4.y) obj);
                        }
                    };
                    lVarV.B(objI3);
                }
                lVarV.l();
                z12 = true;
                Wo.a(androidx.compose.foundation.layout.x.f(g4.o.d(dVarB3, false, (wn0.l) objI3, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), false, j0Var3, z2.c.e(746205251, true, new a(dVarI5), lVarV, 54), z2.c.e(1693372194, true, new b(dVarI5, dVarI6), lVarV, 54), lVarV, 28032, 2);
                jn0.h0 h0Var3 = jn0.h0.f84049a;
                lVarV.o(-1827019809);
                if ((i16 & 112) != 32) {
                    z12 = false;
                }
                objI4 = lVarV.I();
                if (!z12) {
                    objI4 = new c(aVar5, null);
                    lVarV.B(objI4);
                } else {
                    objI4 = new c(aVar5, null);
                    lVarV.B(objI4);
                }
                lVarV.l();
                Function0.g(h0Var3, (wn0.p) objI4, lVarV, 6);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                aVar7 = aVar5;
                aVar8 = aVar6;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.hf1
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3904ui.a(str3, aVar7, aVar8, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        aVar3 = aVar;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
                aVar4 = aVar2;
                if (lVarV.K(aVar4)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i13;
            if ((i16 & 147) != 146) {
                if (i17 != 0) {
                    str3 = "loading_skeleton";
                } else {
                    str3 = str2;
                }
                if (i18 != 0) {
                    lVarV.o(-1827121918);
                    objI6 = lVarV.I();
                    if (objI6 == p020r2.l.INSTANCE.a()) {
                        objI6 = new wn0.a() { // from class: com.fourthline.orca.internal.df1
                            @Override // wn0.a
                            public final Object invoke() {
                                return AbstractC3904ui.a();
                            }
                        };
                        lVarV.B(objI6);
                    }
                    aVar5 = (wn0.a) objI6;
                    lVarV.l();
                } else {
                    aVar5 = aVar3;
                }
                if (i14 != 0) {
                    lVarV.o(-1827120574);
                    objI5 = lVarV.I();
                    if (objI5 == p020r2.l.INSTANCE.a()) {
                        objI5 = new wn0.a() { // from class: com.fourthline.orca.internal.ef1
                            @Override // wn0.a
                            public final Object invoke() {
                                return AbstractC3904ui.b();
                            }
                        };
                        lVarV.B(objI5);
                    }
                    lVarV.l();
                    aVar6 = (wn0.a) objI5;
                } else {
                    aVar6 = aVar4;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(2119015642, i16, -1, "com.fourthline.orca.core.internal.composable.IntroSkeletonScreen (IntroSkeletonScreen.kt:51)");
                }
                lVarV.o(-1827119771);
                if ((i16 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (!z11) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3904ui.a(aVar6);
                        }
                    };
                    lVarV.B(objI);
                } else {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3904ui.a(aVar6);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
                lVarV.o(-1827117632);
                objI2 = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI2 == companion.a()) {
                    objI2 = new p016o2.j0();
                    lVarV.B(objI2);
                }
                p016o2.j0 j0Var4 = (p016o2.j0) objI2;
                lVarV.l();
                androidx.compose.ui.d.Companion companion5 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarH7 = androidx.compose.foundation.layout.x.h(companion5, BitmapDescriptorFactory.HUE_RED, 1, null);
                androidx.compose.ui.d dVarH8 = androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(companion5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.h.g(96), BitmapDescriptorFactory.HUE_RED, 11, null), BitmapDescriptorFactory.HUE_RED, 1, null);
                Ko ko5 = Ko.f26627a;
                float f14 = 2;
                androidx.compose.ui.d dVarI7 = androidx.compose.foundation.layout.x.i(dVarH8, w4.h.g(ko5.a() / f14));
                androidx.compose.ui.d dVarI8 = androidx.compose.foundation.layout.x.i(dVarH7, w4.h.g(ko5.a() / f14));
                strC = RA.c(QA.a.a(QA.f27433a, R.string.shared_loading_intro_skeleton_accessibility, 0, 2, null), lVarV, 0);
                androidx.compose.ui.d dVarB4 = AbstractC3307gk.b(companion5, str3);
                lVarV.o(-1827095875);
                zN = lVarV.n(strC);
                objI3 = lVarV.I();
                if (!zN) {
                    objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3904ui.a(strC, (g4.y) obj);
                        }
                    };
                    lVarV.B(objI3);
                } else {
                    objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3904ui.a(strC, (g4.y) obj);
                        }
                    };
                    lVarV.B(objI3);
                }
                lVarV.l();
                z12 = true;
                Wo.a(androidx.compose.foundation.layout.x.f(g4.o.d(dVarB4, false, (wn0.l) objI3, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), false, j0Var4, z2.c.e(746205251, true, new a(dVarI7), lVarV, 54), z2.c.e(1693372194, true, new b(dVarI7, dVarI8), lVarV, 54), lVarV, 28032, 2);
                jn0.h0 h0Var4 = jn0.h0.f84049a;
                lVarV.o(-1827019809);
                if ((i16 & 112) != 32) {
                    z12 = false;
                }
                objI4 = lVarV.I();
                if (!z12) {
                    objI4 = new c(aVar5, null);
                    lVarV.B(objI4);
                } else {
                    objI4 = new c(aVar5, null);
                    lVarV.B(objI4);
                }
                lVarV.l();
                Function0.g(h0Var4, (wn0.p) objI4, lVarV, 6);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                aVar7 = aVar5;
                aVar8 = aVar6;
            } else {
                if (i17 != 0) {
                    str3 = "loading_skeleton";
                } else {
                    str3 = str2;
                }
                if (i18 != 0) {
                    lVarV.o(-1827121918);
                    objI6 = lVarV.I();
                    if (objI6 == p020r2.l.INSTANCE.a()) {
                        objI6 = new wn0.a() { // from class: com.fourthline.orca.internal.df1
                            @Override // wn0.a
                            public final Object invoke() {
                                return AbstractC3904ui.a();
                            }
                        };
                        lVarV.B(objI6);
                    }
                    aVar5 = (wn0.a) objI6;
                    lVarV.l();
                } else {
                    aVar5 = aVar3;
                }
                if (i14 != 0) {
                    lVarV.o(-1827120574);
                    objI5 = lVarV.I();
                    if (objI5 == p020r2.l.INSTANCE.a()) {
                        objI5 = new wn0.a() { // from class: com.fourthline.orca.internal.ef1
                            @Override // wn0.a
                            public final Object invoke() {
                                return AbstractC3904ui.b();
                            }
                        };
                        lVarV.B(objI5);
                    }
                    lVarV.l();
                    aVar6 = (wn0.a) objI5;
                } else {
                    aVar6 = aVar4;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(2119015642, i16, -1, "com.fourthline.orca.core.internal.composable.IntroSkeletonScreen (IntroSkeletonScreen.kt:51)");
                }
                lVarV.o(-1827119771);
                if ((i16 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI = lVarV.I();
                if (!z11) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3904ui.a(aVar6);
                        }
                    };
                    lVarV.B(objI);
                } else {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3904ui.a(aVar6);
                        }
                    };
                    lVarV.B(objI);
                }
                lVarV.l();
                f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
                lVarV.o(-1827117632);
                objI2 = lVarV.I();
                companion = p020r2.l.INSTANCE;
                if (objI2 == companion.a()) {
                    objI2 = new p016o2.j0();
                    lVarV.B(objI2);
                }
                p016o2.j0 j0Var5 = (p016o2.j0) objI2;
                lVarV.l();
                androidx.compose.ui.d.Companion companion6 = androidx.compose.ui.d.INSTANCE;
                androidx.compose.ui.d dVarH9 = androidx.compose.foundation.layout.x.h(companion6, BitmapDescriptorFactory.HUE_RED, 1, null);
                androidx.compose.ui.d dVarH10 = androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(companion6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.h.g(96), BitmapDescriptorFactory.HUE_RED, 11, null), BitmapDescriptorFactory.HUE_RED, 1, null);
                Ko ko6 = Ko.f26627a;
                float f15 = 2;
                androidx.compose.ui.d dVarI9 = androidx.compose.foundation.layout.x.i(dVarH10, w4.h.g(ko6.a() / f15));
                androidx.compose.ui.d dVarI10 = androidx.compose.foundation.layout.x.i(dVarH9, w4.h.g(ko6.a() / f15));
                strC = RA.c(QA.a.a(QA.f27433a, R.string.shared_loading_intro_skeleton_accessibility, 0, 2, null), lVarV, 0);
                androidx.compose.ui.d dVarB5 = AbstractC3307gk.b(companion6, str3);
                lVarV.o(-1827095875);
                zN = lVarV.n(strC);
                objI3 = lVarV.I();
                if (!zN) {
                    objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3904ui.a(strC, (g4.y) obj);
                        }
                    };
                    lVarV.B(objI3);
                } else {
                    objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                        @Override // wn0.l
                        public final Object invoke(Object obj) {
                            return AbstractC3904ui.a(strC, (g4.y) obj);
                        }
                    };
                    lVarV.B(objI3);
                }
                lVarV.l();
                z12 = true;
                Wo.a(androidx.compose.foundation.layout.x.f(g4.o.d(dVarB5, false, (wn0.l) objI3, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), false, j0Var5, z2.c.e(746205251, true, new a(dVarI9), lVarV, 54), z2.c.e(1693372194, true, new b(dVarI9, dVarI10), lVarV, 54), lVarV, 28032, 2);
                jn0.h0 h0Var5 = jn0.h0.f84049a;
                lVarV.o(-1827019809);
                if ((i16 & 112) != 32) {
                    z12 = false;
                }
                objI4 = lVarV.I();
                if (!z12) {
                    objI4 = new c(aVar5, null);
                    lVarV.B(objI4);
                } else {
                    objI4 = new c(aVar5, null);
                    lVarV.B(objI4);
                }
                lVarV.l();
                Function0.g(h0Var5, (wn0.p) objI4, lVarV, 6);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
                aVar7 = aVar5;
                aVar8 = aVar6;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.hf1
                    @Override // wn0.p
                    public final Object invoke(Object obj, Object obj2) {
                        return AbstractC3904ui.a(str3, aVar7, aVar8, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= KyberEngine.KyberPolyBytes;
        aVar4 = aVar2;
        i16 = i13;
        if ((i16 & 147) != 146) {
            if (i17 != 0) {
                str3 = "loading_skeleton";
            } else {
                str3 = str2;
            }
            if (i18 != 0) {
                lVarV.o(-1827121918);
                objI6 = lVarV.I();
                if (objI6 == p020r2.l.INSTANCE.a()) {
                    objI6 = new wn0.a() { // from class: com.fourthline.orca.internal.df1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3904ui.a();
                        }
                    };
                    lVarV.B(objI6);
                }
                aVar5 = (wn0.a) objI6;
                lVarV.l();
            } else {
                aVar5 = aVar3;
            }
            if (i14 != 0) {
                lVarV.o(-1827120574);
                objI5 = lVarV.I();
                if (objI5 == p020r2.l.INSTANCE.a()) {
                    objI5 = new wn0.a() { // from class: com.fourthline.orca.internal.ef1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3904ui.b();
                        }
                    };
                    lVarV.B(objI5);
                }
                lVarV.l();
                aVar6 = (wn0.a) objI5;
            } else {
                aVar6 = aVar4;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(2119015642, i16, -1, "com.fourthline.orca.core.internal.composable.IntroSkeletonScreen (IntroSkeletonScreen.kt:51)");
            }
            lVarV.o(-1827119771);
            if ((i16 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI = lVarV.I();
            if (!z11) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3904ui.a(aVar6);
                    }
                };
                lVarV.B(objI);
            } else {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3904ui.a(aVar6);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
            lVarV.o(-1827117632);
            objI2 = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI2 == companion.a()) {
                objI2 = new p016o2.j0();
                lVarV.B(objI2);
            }
            p016o2.j0 j0Var6 = (p016o2.j0) objI2;
            lVarV.l();
            androidx.compose.ui.d.Companion companion7 = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarH11 = androidx.compose.foundation.layout.x.h(companion7, BitmapDescriptorFactory.HUE_RED, 1, null);
            androidx.compose.ui.d dVarH12 = androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(companion7, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.h.g(96), BitmapDescriptorFactory.HUE_RED, 11, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            Ko ko7 = Ko.f26627a;
            float f16 = 2;
            androidx.compose.ui.d dVarI11 = androidx.compose.foundation.layout.x.i(dVarH12, w4.h.g(ko7.a() / f16));
            androidx.compose.ui.d dVarI12 = androidx.compose.foundation.layout.x.i(dVarH11, w4.h.g(ko7.a() / f16));
            strC = RA.c(QA.a.a(QA.f27433a, R.string.shared_loading_intro_skeleton_accessibility, 0, 2, null), lVarV, 0);
            androidx.compose.ui.d dVarB6 = AbstractC3307gk.b(companion7, str3);
            lVarV.o(-1827095875);
            zN = lVarV.n(strC);
            objI3 = lVarV.I();
            if (!zN) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3904ui.a(strC, (g4.y) obj);
                    }
                };
                lVarV.B(objI3);
            } else {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3904ui.a(strC, (g4.y) obj);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            z12 = true;
            Wo.a(androidx.compose.foundation.layout.x.f(g4.o.d(dVarB6, false, (wn0.l) objI3, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), false, j0Var6, z2.c.e(746205251, true, new a(dVarI11), lVarV, 54), z2.c.e(1693372194, true, new b(dVarI11, dVarI12), lVarV, 54), lVarV, 28032, 2);
            jn0.h0 h0Var6 = jn0.h0.f84049a;
            lVarV.o(-1827019809);
            if ((i16 & 112) != 32) {
                z12 = false;
            }
            objI4 = lVarV.I();
            if (!z12) {
                objI4 = new c(aVar5, null);
                lVarV.B(objI4);
            } else {
                objI4 = new c(aVar5, null);
                lVarV.B(objI4);
            }
            lVarV.l();
            Function0.g(h0Var6, (wn0.p) objI4, lVarV, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            aVar7 = aVar5;
            aVar8 = aVar6;
        } else {
            if (i17 != 0) {
                str3 = "loading_skeleton";
            } else {
                str3 = str2;
            }
            if (i18 != 0) {
                lVarV.o(-1827121918);
                objI6 = lVarV.I();
                if (objI6 == p020r2.l.INSTANCE.a()) {
                    objI6 = new wn0.a() { // from class: com.fourthline.orca.internal.df1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3904ui.a();
                        }
                    };
                    lVarV.B(objI6);
                }
                aVar5 = (wn0.a) objI6;
                lVarV.l();
            } else {
                aVar5 = aVar3;
            }
            if (i14 != 0) {
                lVarV.o(-1827120574);
                objI5 = lVarV.I();
                if (objI5 == p020r2.l.INSTANCE.a()) {
                    objI5 = new wn0.a() { // from class: com.fourthline.orca.internal.ef1
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC3904ui.b();
                        }
                    };
                    lVarV.B(objI5);
                }
                lVarV.l();
                aVar6 = (wn0.a) objI5;
            } else {
                aVar6 = aVar4;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(2119015642, i16, -1, "com.fourthline.orca.core.internal.composable.IntroSkeletonScreen (IntroSkeletonScreen.kt:51)");
            }
            lVarV.o(-1827119771);
            if ((i16 & 896) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI = lVarV.I();
            if (!z11) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3904ui.a(aVar6);
                    }
                };
                lVarV.B(objI);
            } else {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.ff1
                    @Override // wn0.a
                    public final Object invoke() {
                        return AbstractC3904ui.a(aVar6);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
            lVarV.o(-1827117632);
            objI2 = lVarV.I();
            companion = p020r2.l.INSTANCE;
            if (objI2 == companion.a()) {
                objI2 = new p016o2.j0();
                lVarV.B(objI2);
            }
            p016o2.j0 j0Var7 = (p016o2.j0) objI2;
            lVarV.l();
            androidx.compose.ui.d.Companion companion8 = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarH13 = androidx.compose.foundation.layout.x.h(companion8, BitmapDescriptorFactory.HUE_RED, 1, null);
            androidx.compose.ui.d dVarH14 = androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(companion8, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, w4.h.g(96), BitmapDescriptorFactory.HUE_RED, 11, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            Ko ko8 = Ko.f26627a;
            float f17 = 2;
            androidx.compose.ui.d dVarI13 = androidx.compose.foundation.layout.x.i(dVarH14, w4.h.g(ko8.a() / f17));
            androidx.compose.ui.d dVarI14 = androidx.compose.foundation.layout.x.i(dVarH13, w4.h.g(ko8.a() / f17));
            strC = RA.c(QA.a.a(QA.f27433a, R.string.shared_loading_intro_skeleton_accessibility, 0, 2, null), lVarV, 0);
            androidx.compose.ui.d dVarB7 = AbstractC3307gk.b(companion8, str3);
            lVarV.o(-1827095875);
            zN = lVarV.n(strC);
            objI3 = lVarV.I();
            if (!zN) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3904ui.a(strC, (g4.y) obj);
                    }
                };
                lVarV.B(objI3);
            } else {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.gf1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3904ui.a(strC, (g4.y) obj);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            z12 = true;
            Wo.a(androidx.compose.foundation.layout.x.f(g4.o.d(dVarB7, false, (wn0.l) objI3, 1, null), BitmapDescriptorFactory.HUE_RED, 1, null), false, j0Var7, z2.c.e(746205251, true, new a(dVarI13), lVarV, 54), z2.c.e(1693372194, true, new b(dVarI13, dVarI14), lVarV, 54), lVarV, 28032, 2);
            jn0.h0 h0Var7 = jn0.h0.f84049a;
            lVarV.o(-1827019809);
            if ((i16 & 112) != 32) {
                z12 = false;
            }
            objI4 = lVarV.I();
            if (!z12) {
                objI4 = new c(aVar5, null);
                lVarV.B(objI4);
            } else {
                objI4 = new c(aVar5, null);
                lVarV.B(objI4);
            }
            lVarV.l();
            Function0.g(h0Var7, (wn0.p) objI4, lVarV, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            aVar7 = aVar5;
            aVar8 = aVar6;
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.hf1
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3904ui.a(str3, aVar7, aVar8, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.a aVar) {
        aVar.invoke();
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(String str, g4.y semantics) {
        p013kotlin.jvm.internal.s.k(semantics, "$this$semantics");
        g4.v.i0(semantics, str);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(androidx.compose.ui.d dVar, p020r2.l lVar, final int i11, final int i12) {
        final androidx.compose.ui.d dVar2;
        int i13;
        p020r2.l lVarV = lVar.v(339149528);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            dVar2 = dVar;
        } else if ((i11 & 6) == 0) {
            dVar2 = dVar;
            i13 = (lVarV.n(dVar2) ? 4 : 2) | i11;
        } else {
            dVar2 = dVar;
            i13 = i11;
        }
        if ((i13 & 3) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            androidx.compose.ui.d dVar3 = i14 != 0 ? androidx.compose.ui.d.INSTANCE : dVar2;
            if (p020r2.o.J()) {
                p020r2.o.S(339149528, i13, -1, "com.fourthline.orca.core.internal.composable.ShimmerEffectBox (IntroSkeletonScreen.kt:161)");
            }
            k3.p1.Companion companion = k3.p1.INSTANCE;
            List listP = p013kotlin.collections.v.p(k3.p1.l(k3.p1.p(companion.f(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null)), k3.p1.l(k3.p1.p(companion.f(), 0.2f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null)), k3.p1.l(k3.p1.p(companion.f(), 0.6f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null)));
            p020r2.y3<Float> y3VarA = p019p1.o0.a(p019p1.o0.c("", lVarV, 6, 0), BitmapDescriptorFactory.HUE_RED, 5000.0f, p019p1.j.e(p019p1.j.l(1700, 200, null, 4, null), p019p1.y0.Restart, 0L, 4, null), "", lVarV, p019p1.n0.f100525f | 25008 | (p019p1.m0.f100493d << 9), 0);
            androidx.compose.ui.d dVarB = androidx.compose.foundation.b.b(h3.e.a(dVar3, a2.g.c(f35913a)), k3.h1.Companion.d(k3.h1.INSTANCE, listP, j3.g.INSTANCE.c(), j3.h.a(a(y3VarA), a(y3VarA)), 0, 8, null), null, BitmapDescriptorFactory.HUE_RED, 6, null);
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarB);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.u()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarH, companion2.c());
            p020r2.d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
            if (lVarA.u() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion2.d());
            androidx.compose.ui.d dVarE2 = androidx.compose.foundation.layout.i.f4585a.e(androidx.compose.ui.d.INSTANCE);
            lVarV.o(-1619427413);
            Object objI = lVarV.I();
            if (objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.if1
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC3904ui.a((androidx.compose.ui.graphics.c) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            androidx.compose.foundation.layout.g.a(androidx.compose.ui.graphics.b.a(dVarE2, (wn0.l) objI), lVarV, 0);
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
            dVar2 = dVar3;
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.jf1
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC3904ui.a(dVar2, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.graphics.c graphicsLayer) {
        p013kotlin.jvm.internal.s.k(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.a(1.0f);
        return jn0.h0.f84049a;
    }

    private static final float a(p020r2.y3 y3Var) {
        return ((Number) y3Var.getValue()).floatValue();
    }
}
