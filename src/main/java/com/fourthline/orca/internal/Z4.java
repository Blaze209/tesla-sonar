package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i4.TextStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KeyboardOptions;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.spongycastle.crypto.tls.CipherSuite;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.Function0;
import p4.LocaleList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Z4 {

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f29971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f29972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.r2 f29973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i3.f f29974e;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.Z4$a$a, reason: collision with other inner class name */
        static final class C0536a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f29975a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f29976b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.r2 f29977c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i3.f f29978d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0536a(androidx.compose.ui.platform.r2 r2Var, i3.f fVar, Continuation continuation) {
                super(2, continuation);
                this.f29977c = r2Var;
                this.f29978d = fVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(K4 k11, Continuation continuation) {
                return ((C0536a) create(k11, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0536a c0536a = new C0536a(this.f29977c, this.f29978d, continuation);
                c0536a.f29976b = obj;
                return c0536a;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f29975a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                K4 k11 = (K4) this.f29976b;
                if (k11 instanceof K4.b) {
                    androidx.compose.ui.platform.r2 r2Var = this.f29977c;
                    if (r2Var != null) {
                        r2Var.hide();
                    }
                } else if (k11 instanceof K4.a) {
                    Vh.a(this.f29978d);
                } else if (!(k11 instanceof K4.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.l lVar, Flow flow, androidx.compose.ui.platform.r2 r2Var, i3.f fVar, Continuation continuation) {
            super(2, continuation);
            this.f29971b = lVar;
            this.f29972c = flow;
            this.f29973d = r2Var;
            this.f29974e = fVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f29971b, this.f29972c, this.f29973d, this.f29974e, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f29970a;
            if (i11 == 0) {
                jn0.t.b(obj);
                this.f29971b.invoke(T4.d.f27834a);
                Flow flow = this.f29972c;
                if (flow != null) {
                    C0536a c0536a = new C0536a(this.f29973d, this.f29974e, null);
                    this.f29970a = 1;
                    if (AbstractC3989wg.a(flow, c0536a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return jn0.h0.f84049a;
        }
    }

    static final class d implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v1.g0 f29985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f29986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextStyle f29987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29988d;

        d(v1.g0 g0Var, String str, TextStyle textStyle, String str2) {
            this.f29985a = g0Var;
            this.f29986b = str;
            this.f29987c = textStyle;
            this.f29988d = str2;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1258828961, i11, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.CustomSuggestionItem.<anonymous>.<anonymous> (ContactsDetailsScreen.kt:231)");
            }
            v1.g0 g0Var = this.f29985a;
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            float f11 = 16;
            androidx.compose.ui.d dVarC = v1.g0.c(g0Var, androidx.compose.foundation.layout.t.m(companion, w4.h.g(f11), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), 1.0f, false, 2, null);
            t4.t.Companion companion2 = t4.t.INSTANCE;
            p009i2.v2.b(this.f29986b, dVarC, 0L, 0L, null, null, null, 0L, null, null, 0L, companion2.b(), false, 1, 0, null, this.f29987c, lVar, 0, 3120, 55292);
            androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.t.k(companion, w4.h.g(f11), BitmapDescriptorFactory.HUE_RED, 2, null);
            String str = this.f29988d;
            if (str == null) {
                str = "";
            }
            p009i2.v2.b(str, dVarK, 0L, 0L, null, null, null, 0L, null, null, 0L, companion2.b(), false, 1, 0, null, this.f29987c, lVar, 48, 3120, 55292);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Y4 y11, Flow flow, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(y11, flow, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Y4.a aVar, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(aVar, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(androidx.compose.ui.d dVar, String str, String str2, wn0.a aVar, int i11, int i12, p020r2.l lVar, int i13) {
        a(dVar, str, str2, aVar, lVar, p020r2.k2.a(i11 | 1), i12);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(Y4.c cVar, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(cVar, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(T4.a.f27831a);
        return jn0.h0.f84049a;
    }

    public static final void a(final Y4 state, final Flow flow, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        p020r2.l lVar2;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(-1616982949);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(flow) ? 32 : 16;
        }
        if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i12 |= lVarV.K(onEventSent) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1616982949, i12, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.ContactsDetailsScreen (ContactsDetailsScreen.kt:77)");
            }
            lVarV.o(2084672224);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.tw0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Z4.a(onEventSent);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI, lVarV, 0, 1);
            i3.f fVar = (i3.f) lVarV.U(androidx.compose.ui.platform.z0.h());
            androidx.compose.ui.platform.r2 r2Var = (androidx.compose.ui.platform.r2) lVarV.U(androidx.compose.ui.platform.z0.q());
            jn0.h0 h0Var = jn0.h0.f84049a;
            lVarV.o(2084678505);
            boolean zK = (i13 == 256) | lVarV.K(flow) | lVarV.n(r2Var) | lVarV.K(fVar);
            Object objI2 = lVarV.I();
            if (zK || objI2 == p020r2.l.INSTANCE.a()) {
                a aVar = new a(onEventSent, flow, r2Var, fVar, null);
                lVarV.B(aVar);
                objI2 = aVar;
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) objI2, lVarV, 6);
            String strC = RA.c(state.a(), lVarV, 0);
            z2.a aVarE = z2.c.e(-1178107378, true, new b(state, onEventSent), lVarV, 54);
            InterfaceC3777rk.b bVarT = state.t();
            lVarV.o(2084757248);
            boolean z12 = i13 == 256;
            Object objI3 = lVarV.I();
            if (z12 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.uw0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Z4.a(onEventSent, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            C3735qk c3735qk = new C3735qk(bVarT, (wn0.l) objI3);
            InterfaceC3777rk.a aVarU = state.u();
            lVarV.o(2084763520);
            boolean z13 = i13 == 256;
            Object objI4 = lVarV.I();
            if (z13 || objI4 == p020r2.l.INSTANCE.a()) {
                objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.vw0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Z4.b(onEventSent, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI4);
            }
            lVarV.l();
            lVar2 = lVarV;
            AbstractC3269fp.a("contact_details", strC, null, aVarE, null, new C3820sk(c3735qk, new C3735qk(aVarU, (wn0.l) objI4), false, 4, null), null, false, null, lVar2, 3078, 468);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ww0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Z4.a(state, flow, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar, boolean z11) {
        if (z11) {
            lVar.invoke(V4.f28958a);
        } else {
            lVar.invoke(W4.f29401a);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar, String it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(new U4(it));
        return jn0.h0.f84049a;
    }

    static final class c implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y4.a f29981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f29982b;

        c(Y4.a aVar, wn0.l lVar) {
            this.f29981a = aVar;
            this.f29982b = lVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(1306740667, i11, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.CountrySearch.<anonymous>.<anonymous> (ContactsDetailsScreen.kt:176)");
            }
            lVar.o(-225002321);
            boolean zK = lVar.K(this.f29981a) | lVar.n(this.f29982b);
            final Y4.a aVar = this.f29981a;
            final wn0.l lVar2 = this.f29982b;
            Object objI = lVar.I();
            if (zK || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.fx0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Z4.c.a(aVar, lVar2);
                    }
                };
                lVar.B(objI);
            }
            lVar.l();
            H0.a((wn0.a) objI, lVar, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List a(Y4.a aVar, wn0.l lVar) {
            List listH = aVar.h();
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listH, 10));
            Iterator it = listH.iterator();
            while (it.hasNext()) {
                arrayList.add(z2.c.c(1698047935, true, new a((G5) it.next(), lVar)));
            }
            return arrayList;
        }

        static final class a implements wn0.q {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ G5 f29983a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ wn0.l f29984b;

            a(G5 g11, wn0.l lVar) {
                this.f29983a = g11;
                this.f29984b = lVar;
            }

            public final void a(int i11, p020r2.l lVar, int i12) {
                if ((i12 & 6) == 0) {
                    i12 |= lVar.r(i11) ? 4 : 2;
                }
                if ((i12 & 19) == 18 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(1698047935, i12, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.CountrySearch.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsDetailsScreen.kt:180)");
                }
                androidx.compose.ui.d dVarA = AbstractC3307gk.a(androidx.compose.ui.d.INSTANCE, "listItem" + i11, (String) null, 2, (Object) null);
                String str = this.f29983a.e() + RA.c(this.f29983a.getName(), lVar, 0);
                String strG = this.f29983a.g();
                lVar.o(1861889652);
                boolean zN = lVar.n(this.f29984b) | lVar.K(this.f29983a);
                final wn0.l lVar2 = this.f29984b;
                final G5 g11 = this.f29983a;
                Object objI = lVar.I();
                if (zN || objI == p020r2.l.INSTANCE.a()) {
                    objI = new wn0.a() { // from class: com.fourthline.orca.internal.gx0
                        @Override // wn0.a
                        public final Object invoke() {
                            return Z4.c.a.a(lVar2, g11);
                        }
                    };
                    lVar.B(objI);
                }
                lVar.l();
                Z4.a(dVarA, str, strG, (wn0.a) objI, lVar, 0, 0);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a(((Number) obj).intValue(), (p020r2.l) obj2, ((Number) obj3).intValue());
                return jn0.h0.f84049a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jn0.h0 a(wn0.l lVar, G5 g11) {
                lVar.invoke(new O4(g11));
                return jn0.h0.f84049a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar, kotlin.y KeyboardActions) {
        p013kotlin.jvm.internal.s.k(KeyboardActions, "$this$KeyboardActions");
        lVar.invoke(T4.b.f27832a);
        return jn0.h0.f84049a;
    }

    static final class b implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y4 f29979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f29980b;

        b(Y4 y11, wn0.l lVar) {
            this.f29979a = y11;
            this.f29980b = lVar;
        }

        public final void a(v1.i OrcaScreen, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(OrcaScreen, "$this$OrcaScreen");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-1178107378, i11, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.ContactsDetailsScreen.<anonymous> (ContactsDetailsScreen.kt:100)");
            }
            lVar.o(-787532511);
            Nh nhQ = this.f29979a.q();
            Y4 y11 = this.f29979a;
            final wn0.l lVar2 = this.f29980b;
            String strA = Oh.a(nhQ, lVar, 0);
            String strB = Oh.b(nhQ, lVar, 0);
            Mh mhE = nhQ.e();
            Gh state = y11.q().getState();
            String strC = nhQ.c();
            String strC2 = RA.c(nhQ.a(), lVar, 0);
            String strC3 = RA.c(nhQ.d(), lVar, 0);
            InterfaceC3903uh interfaceC3903uhI = nhQ.i();
            String strC4 = RA.c(nhQ.h(), lVar, 0);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, o4.y.INSTANCE.c(), o4.r.INSTANCE.b(), (o4.i0) null, (Boolean) null, (LocaleList) null, 113, (DefaultConstructorMarker) null);
            lVar.o(-1333751862);
            boolean zN = lVar.n(lVar2);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.cx0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Z4.b.a(lVar2, (kotlin.y) obj);
                    }
                };
                lVar.B(objI);
            }
            lVar.l();
            kotlin.z zVar = new kotlin.z((wn0.l) objI, null, null, null, null, null, 62, null);
            Lh lh2 = Lh.Email;
            lVar.o(-1333773700);
            boolean zN2 = lVar.n(lVar2);
            Object objI2 = lVar.I();
            if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.dx0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Z4.b.a(lVar2, ((Boolean) obj).booleanValue());
                    }
                };
                lVar.B(objI2);
            }
            wn0.l lVar3 = (wn0.l) objI2;
            lVar.l();
            lVar.o(-1333764182);
            boolean zN3 = lVar.n(lVar2);
            Object objI3 = lVar.I();
            if (zN3 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.ex0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Z4.b.a(lVar2, (String) obj);
                    }
                };
                lVar.B(objI3);
            }
            lVar.l();
            Vh.a(null, "emailAddress", mhE, state, strC, strC2, null, strC4, false, lVar3, 0, strC3, interfaceC3903uhI, (wn0.l) objI3, false, keyboardOptions, zVar, lh2, null, strA, strB, null, lVar, 48, 12582912, 0, 2377025);
            lVar.l();
            if (this.f29979a.r() == Y4.b.NUMBER) {
                lVar.o(1357804676);
                Z4.a(this.f29979a.s(), this.f29980b, lVar, 0);
                lVar.l();
            } else {
                lVar.o(1357883199);
                Z4.a(this.f29979a.p(), this.f29980b, lVar, 0);
                lVar.l();
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
        public static final jn0.h0 a(wn0.l lVar, boolean z11) {
            if (z11) {
                lVar.invoke(R4.f27593a);
            } else {
                lVar.invoke(S4.f27715a);
            }
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar, String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            lVar.invoke(new Q4(it));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar, kotlin.y KeyboardActions) {
            p013kotlin.jvm.internal.s.k(KeyboardActions, "$this$KeyboardActions");
            lVar.invoke(T4.b.f27832a);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar) {
        lVar.invoke(T4.a.f27831a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(T4.c.f27833a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Y4.a aVar, final wn0.l lVar, p020r2.l lVar2, final int i11) {
        int i12;
        p020r2.l lVar3;
        p020r2.l lVarV = lVar2.v(-2105524886);
        if ((i11 & 6) == 0) {
            i12 = (lVarV.K(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(lVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
            lVar3 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-2105524886, i12, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.CountrySearch (ContactsDetailsScreen.kt:156)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(d3.c.INSTANCE.o(), false);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, companion);
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarH, companion2.c());
            p020r2.d4.b(lVarA, xVarC, companion2.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion2.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            int i13 = i12 & 14;
            String strA = Oh.a(aVar, lVarV, i13);
            String strB = Oh.b(aVar, lVarV, i13);
            Mh mhE = aVar.e();
            Gh state = aVar.getState();
            String strC = aVar.c();
            String strC2 = RA.c(aVar.a(), lVarV, 0);
            InterfaceC3903uh interfaceC3903uhG = aVar.g();
            lVarV.o(1279537072);
            z2.a aVarE = !aVar.h().isEmpty() ? z2.c.e(1306740667, true, new c(aVar, lVar), lVarV, 54) : null;
            lVarV.l();
            String strC3 = RA.c(aVar.f(), lVarV, 0);
            boolean zY0 = p013kotlin.text.t.y0(aVar.c());
            KeyboardOptions keyboardOptions = new KeyboardOptions(o4.x.INSTANCE.e(), false, o4.y.INSTANCE.h(), o4.r.INSTANCE.b(), (o4.i0) null, (Boolean) null, (LocaleList) null, 112, (DefaultConstructorMarker) null);
            lVarV.o(1279585566);
            int i14 = i12 & 112;
            boolean z11 = i14 == 32;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.bx0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Z4.a(lVar, (kotlin.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            kotlin.z zVar = new kotlin.z((wn0.l) objI, null, null, null, null, null, 62, null);
            lVarV.o(1279524052);
            boolean z12 = i14 == 32;
            Object objI2 = lVarV.I();
            if (z12 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.qw0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Z4.a(lVar, ((Boolean) obj).booleanValue());
                    }
                };
                lVarV.B(objI2);
            }
            wn0.l lVar4 = (wn0.l) objI2;
            lVarV.l();
            lVarV.o(1279573248);
            boolean z13 = i14 == 32;
            Object objI3 = lVarV.I();
            if (z13 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.rw0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Z4.a(lVar, (String) obj);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            lVar3 = lVarV;
            Vh.a(null, "countryCode", mhE, state, strC, strC2, strC3, lVar4, null, null, interfaceC3903uhG, (wn0.l) objI3, aVarE, zY0, keyboardOptions, zVar, strA, strB, lVar3, 48, 0, 769);
            lVar3.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVar3.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.sw0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Z4.a(aVar, lVar, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    static final class e implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y4.c f29989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f29990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Nh f29991c;

        static final class a implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Y4.c f29992a;

            a(Y4.c cVar) {
                this.f29992a = cVar;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 3) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-458225481, i11, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.PhoneEnter.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ContactsDetailsScreen.kt:317)");
                }
                p009i2.v2.b(this.f29992a.e(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C3825sp.f35377a.b(lVar, 6).getInput().getDefault().getValue().a(false, w4.v.b(C3825sp.a.f35378a.a()), lVar, 48, 1), lVar, 0, 0, 65534);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((p020r2.l) obj, ((Number) obj2).intValue());
                return jn0.h0.f84049a;
            }
        }

        e(Y4.c cVar, wn0.l lVar, Nh nh2) {
            this.f29989a = cVar;
            this.f29990b = lVar;
            this.f29991c = nh2;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 3) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(736306585, i11, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.PhoneEnter.<anonymous>.<anonymous> (ContactsDetailsScreen.kt:269)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarA = AbstractC3307gk.a((androidx.compose.ui.d) companion, RA.c(this.f29989a.c(), lVar, 0), false, 2, (Object) null);
            lVar.o(-1606584283);
            boolean zN = lVar.n(this.f29990b);
            final wn0.l lVar2 = this.f29990b;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.a() { // from class: com.fourthline.orca.internal.hx0
                    @Override // wn0.a
                    public final Object invoke() {
                        return Z4.e.a(lVar2);
                    }
                };
                lVar.B(objI);
            }
            lVar.l();
            androidx.compose.ui.d dVarA2 = AbstractC3307gk.a(dVarA, false, (String) null, (g4.i) null, (wn0.a) objI, 7, (Object) null);
            Ko ko2 = Ko.f26627a;
            androidx.compose.ui.d dVarB = androidx.compose.foundation.layout.x.b(dVarA2, BitmapDescriptorFactory.HUE_RED, ko2.a(), 1, null);
            d3.c.Companion companion2 = d3.c.INSTANCE;
            d3.c.InterfaceC1212c interfaceC1212cI = companion2.i();
            v1.b bVar = v1.b.f117444a;
            v1.b.e eVarC = bVar.c();
            Y4.c cVar = this.f29989a;
            Nh nh2 = this.f29991c;
            z3.i0 i0VarB = v1.e0.b(eVarC, interfaceC1212cI, lVar, 54);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarB);
            b4.g.Companion companion3 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion3.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVar);
            p020r2.d4.b(lVarA, i0VarB, companion3.c());
            p020r2.d4.b(lVarA, xVarC, companion3.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion3.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion3.d());
            v1.h0 h0Var = v1.h0.f117504a;
            float f11 = 1;
            float fG = w4.h.g(f11);
            float fG2 = w4.h.g(2);
            androidx.compose.ui.d dVarV = androidx.compose.foundation.layout.x.v(companion, w4.h.g(85));
            z3.i0 i0VarB2 = v1.e0.b(bVar.c(), companion2.i(), lVar, 54);
            int iA2 = p020r2.j.a(lVar, 0);
            p020r2.x xVarC2 = lVar.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVar, dVarV);
            wn0.a<b4.g> aVarA2 = companion3.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA2);
            } else {
                lVar.d();
            }
            p020r2.l lVarA2 = p020r2.d4.a(lVar);
            p020r2.d4.b(lVarA2, i0VarB2, companion3.c());
            p020r2.d4.b(lVarA2, xVarC2, companion3.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB2 = companion3.b();
            if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE2, companion3.d());
            float f12 = 4;
            p009i2.v2.b(cVar.a(), androidx.compose.foundation.layout.t.m(companion, BitmapDescriptorFactory.HUE_RED, w4.h.g(f12), w4.h.g(8), BitmapDescriptorFactory.HUE_RED, 9, null), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, lVar, 0, 0, 131068);
            androidx.compose.ui.d dVarM = androidx.compose.foundation.layout.t.m(companion, BitmapDescriptorFactory.HUE_RED, w4.h.g(f12), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 13, null);
            androidx.compose.ui.graphics.painter.b bVarA = AbstractC3946vh.a(cVar.d(), lVar, 0);
            lVar.o(821316184);
            long jK = q1.m.a(lVar, 0) ? k3.p1.INSTANCE.k() : k3.p1.p(((k3.p1) lVar.U(p009i2.z.a())).getValue(), ((Number) lVar.U(p009i2.y.a())).floatValue(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            lVar.l();
            p009i2.e1.a(bVarA, null, dVarM, jK, lVar, 432, 0);
            v1.i0.a(androidx.compose.foundation.layout.x.v(companion, w4.h.g(16)), lVar, 6);
            if (nh2.getState() != Gh.UNFOCUSED) {
                fG = fG2;
            }
            p009i2.i0.a(androidx.compose.foundation.layout.x.i(androidx.compose.foundation.layout.x.v(companion, w4.h.g(f11)), w4.h.g(ko2.a() - fG)), C3825sp.f35377a.b(lVar, 6).getInput().getDefault().getBorder().getColor().a(lVar, 0), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVar, 0, 12);
            v1.i0.a(androidx.compose.foundation.layout.x.v(companion, w4.h.g(12)), lVar, 6);
            lVar.g();
            Ls.a(false, z2.c.e(-458225481, true, new a(cVar), lVar, 54), lVar, 48, 1);
            lVar.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p020r2.l) obj, ((Number) obj2).intValue());
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar) {
            lVar.invoke(M4.f26892a);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, boolean z11) {
        if (z11) {
            lVar.invoke(N4.f27013a);
        } else {
            lVar.invoke(P4.f27276a);
        }
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, String it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(new L4(it));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, kotlin.y KeyboardActions) {
        p013kotlin.jvm.internal.s.k(KeyboardActions, "$this$KeyboardActions");
        lVar.invoke(T4.b.f27832a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(androidx.compose.ui.d dVar, final String str, final String str2, final wn0.a aVar, p020r2.l lVar, final int i11, final int i12) {
        androidx.compose.ui.d dVar2;
        int i13;
        wn0.a aVar2;
        final androidx.compose.ui.d dVar3;
        p020r2.l lVarV = lVar.v(-71753729);
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
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= lVarV.n(str) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & KyberEngine.KyberPolyBytes) == 0) {
            i13 |= lVarV.n(str2) ? 256 : 128;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            if ((i11 & 3072) == 0) {
                i13 |= lVarV.K(aVar2) ? 2048 : 1024;
            }
        }
        if ((i13 & 1171) == 1170 && lVarV.b()) {
            lVarV.j();
            dVar3 = dVar2;
        } else {
            dVar3 = i14 != 0 ? androidx.compose.ui.d.INSTANCE : dVar2;
            if (p020r2.o.J()) {
                p020r2.o.S(-71753729, i13, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.CustomSuggestionItem (ContactsDetailsScreen.kt:221)");
            }
            androidx.compose.ui.d dVarB = androidx.compose.foundation.layout.x.b(AbstractC3307gk.a(androidx.compose.foundation.layout.x.h(dVar3, BitmapDescriptorFactory.HUE_RED, 1, null), false, (String) null, (g4.i) null, aVar2, 7, (Object) null), BitmapDescriptorFactory.HUE_RED, Ko.f26627a.a(), 1, null);
            z3.i0 i0VarB = v1.e0.b(v1.b.f117444a.f(), d3.c.INSTANCE.i(), lVarV, 48);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVarV, dVarB);
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = p020r2.d4.a(lVarV);
            p020r2.d4.b(lVarA, i0VarB, companion.c());
            p020r2.d4.b(lVarA, xVarC, companion.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB = companion.b();
            if (lVarA.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            p020r2.d4.b(lVarA, dVarE, companion.d());
            Ls.a(false, z2.c.e(1258828961, true, new d(v1.h0.f117504a, str, C3825sp.f35377a.b(lVarV, 6).getInput().getDefault().getValue().a(false, w4.v.b(C3825sp.a.f35378a.a()), lVarV, 48, 1), str2), lVarV, 54), lVarV, 48, 1);
            lVarV.g();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.pw0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Z4.a(dVar3, str, str2, aVar, i11, i12, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(final Y4.c cVar, final wn0.l lVar, p020r2.l lVar2, final int i11) {
        int i12;
        p020r2.l lVar3;
        p020r2.l lVarV = lVar2.v(-1493194422);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? lVarV.n(cVar) : lVarV.K(cVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= lVarV.K(lVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && lVarV.b()) {
            lVarV.j();
            lVar3 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1493194422, i12, -1, "com.fourthline.orca.kyc.internal.flow.contacts.details.PhoneEnter (ContactsDetailsScreen.kt:258)");
            }
            Nh nhB = cVar.b();
            Mh mhE = nhB.e();
            Gh state = nhB.getState();
            String strC = nhB.c();
            String strC2 = RA.c(nhB.a(), lVarV, 0);
            String strC3 = RA.c(nhB.d(), lVarV, 0);
            InterfaceC3903uh interfaceC3903uhI = nhB.i();
            String strC4 = RA.c(nhB.h(), lVarV, 0);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, o4.y.INSTANCE.d(), o4.r.INSTANCE.b(), (o4.i0) null, (Boolean) null, (LocaleList) null, 115, (DefaultConstructorMarker) null);
            lVarV.o(1655239308);
            int i13 = i12 & 112;
            boolean z11 = i13 == 32;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.xw0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Z4.b(lVar, (kotlin.y) obj);
                    }
                };
                lVarV.B(objI);
            }
            lVarV.l();
            kotlin.z zVar = new kotlin.z((wn0.l) objI, null, null, null, null, null, 62, null);
            z2.a aVarE = z2.c.e(736306585, true, new e(cVar, lVar, nhB), lVarV, 54);
            lVarV.o(1655224206);
            boolean z12 = i13 == 32;
            Object objI2 = lVarV.I();
            if (z12 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.yw0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Z4.b(lVar, ((Boolean) obj).booleanValue());
                    }
                };
                lVarV.B(objI2);
            }
            wn0.l lVar4 = (wn0.l) objI2;
            lVarV.l();
            lVarV.o(1655231084);
            boolean z13 = i13 == 32;
            Object objI3 = lVarV.I();
            if (z13 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.zw0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return Z4.b(lVar, (String) obj);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            Vh.a((androidx.compose.ui.d) null, "phoneNumber", mhE, state, strC, strC2, strC4, aVarE, lVar4, strC3, interfaceC3903uhI, (wn0.l) objI3, keyboardOptions, zVar, (String) null, (String) null, lVarV, 12582960, 0, CipherSuite.TLS_ECDH_ECDSA_WITH_NULL_SHA);
            lVar3 = lVarV;
            v1.i0.a(androidx.compose.foundation.layout.x.i(androidx.compose.ui.d.INSTANCE, w4.h.g(8)), lVar3, 6);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVar3.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.ax0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return Z4.a(cVar, lVar, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
