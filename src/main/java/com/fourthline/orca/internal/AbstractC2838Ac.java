package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;

/* JADX INFO: renamed from: com.fourthline.orca.internal.Ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2838Ac {

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ac$b */
    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f24938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f24939b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(wn0.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f24939b = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f24939b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f24938a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f24939b.invoke(InterfaceC3812sc.d.f35291a);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(C3898uc c3898uc, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(c3898uc, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(InterfaceC3812sc.a.f35288a);
        return jn0.h0.f84049a;
    }

    public static final void a(final C3898uc state, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(387534161);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(onEventSent) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(387534161, i12, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.version.DocumentVersionScreen (DocumentVersionScreen.kt:32)");
            }
            float fG = w4.h.g(4);
            String strC = RA.c(state.a(), lVarV, 0);
            z2.a aVarE = z2.c.e(2073211518, true, new a(fG, state, onEventSent), lVarV, 54);
            wn0.q qVarA = C3841t4.f35541a.a();
            lVarV.o(879409084);
            InterfaceC3777rk.b bVar = new InterfaceC3777rk.b(state.r());
            lVarV.o(-919253423);
            int i13 = i12 & 112;
            boolean z11 = i13 == 32;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.a00
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC2838Ac.a(onEventSent, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            C3735qk c3735qk = new C3735qk(bVar, (wn0.l) objI);
            InterfaceC3777rk.a.C0608a c0608a = new InterfaceC3777rk.a.C0608a(null, 1, null);
            lVarV.o(-919245999);
            boolean z12 = i13 == 32;
            Object objI2 = lVarV.I();
            if (z12 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.b00
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return AbstractC2838Ac.b(onEventSent, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI2);
            }
            lVarV.l();
            C3820sk c3820sk = new C3820sk(c3735qk, new C3735qk(c0608a, (wn0.l) objI2), false, 4, null);
            lVarV.l();
            AbstractC3269fp.a("document_version", strC, null, aVarE, qVarA, c3820sk, null, false, null, lVarV, 27654, 452);
            jn0.h0 h0Var = jn0.h0.f84049a;
            lVarV.o(879428696);
            boolean z13 = i13 == 32;
            Object objI3 = lVarV.I();
            if (z13 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new b(onEventSent, null);
                lVarV.B(objI3);
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) objI3, lVarV, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.c00
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return AbstractC2838Ac.a(state, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.Ac$a */
    static final class a implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f24935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C3898uc f24936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.l f24937c;

        a(float f11, C3898uc c3898uc, wn0.l lVar) {
            this.f24935a = f11;
            this.f24936b = c3898uc;
            this.f24937c = lVar;
        }

        public final void a(v1.i OrcaScreen, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(OrcaScreen, "$this$OrcaScreen");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(2073211518, i11, -1, "com.fourthline.orca.kyc.internal.flow.document_selection.screens.version.DocumentVersionScreen.<anonymous> (DocumentVersionScreen.kt:39)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            float f11 = this.f24935a;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(androidx.compose.foundation.layout.t.m(companion, BitmapDescriptorFactory.HUE_RED, f11, BitmapDescriptorFactory.HUE_RED, f11, 5, null), BitmapDescriptorFactory.HUE_RED, 1, null);
            p009i2.v2.b(RA.c(this.f24936b.q(), lVar, 0), dVarH, 0L, 0L, null, null, null, 0L, null, t4.j.h(t4.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, C3825sp.f35377a.b(lVar, 6).getAgreements().getLabel().a(null, lVar, 0, 1), lVar, 48, 0, 65020);
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(4)), lVar, 6);
            List listP = this.f24936b.p();
            final wn0.l lVar2 = this.f24937c;
            int i12 = 0;
            for (Object obj : listP) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    p013kotlin.collections.v.x();
                }
                final C3898uc.a aVar = (C3898uc.a) obj;
                lVar.o(-919281421);
                QA qaA = aVar.a();
                InterfaceC3903uh interfaceC3903uhB = aVar.b();
                boolean zD = aVar.d();
                lVar.o(194223857);
                boolean zN = lVar.n(lVar2) | lVar.K(aVar);
                Object objI = lVar.I();
                if (zN || objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.d00
                        @Override // wn0.a
                        public final Object invoke() {
                            return AbstractC2838Ac.a.a(lVar2, aVar);
                        }
                    };
                    lVar.B(objI);
                }
                lVar.l();
                AbstractC3985wc.a(i12, qaA, interfaceC3903uhB, zD, (wn0.a) objI, lVar, 0, 0);
                lVar.l();
                v1.i0.a(androidx.compose.foundation.layout.x.i(androidx.compose.ui.d.INSTANCE, w4.h.g(24)), lVar, 6);
                i12 = i13;
            }
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v1.i) obj, (p020r2.l) obj2, ((Number) obj3).intValue());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar, C3898uc.a aVar) {
            lVar.invoke(new InterfaceC3812sc.c(aVar.c()));
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(InterfaceC3812sc.b.f35289a);
        return jn0.h0.f84049a;
    }
}
