package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.KeyboardOptions;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p020r2.Function0;
import p4.LocaleList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class H {

    static final class a extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f26040b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f26040b = lVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f26040b, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f26039a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            this.f26040b.invoke(C.i.f25167a);
            return jn0.h0.f84049a;
        }
    }

    static final class b extends SuspendLambda implements wn0.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f26041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f26042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.r2 f26043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i3.f f26044d;

        static final class a extends SuspendLambda implements wn0.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f26045a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f26046b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.platform.r2 f26047c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ i3.f f26048d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(androidx.compose.ui.platform.r2 r2Var, i3.f fVar, Continuation continuation) {
                super(2, continuation);
                this.f26047c = r2Var;
                this.f26048d = fVar;
            }

            @Override // wn0.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(B b11, Continuation continuation) {
                return ((a) create(b11, continuation)).invokeSuspend(jn0.h0.f84049a);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(this.f26047c, this.f26048d, continuation);
                aVar.f26046b = obj;
                return aVar;
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f26045a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
                B b11 = (B) this.f26046b;
                if (b11 instanceof B.b) {
                    androidx.compose.ui.platform.r2 r2Var = this.f26047c;
                    if (r2Var != null) {
                        r2Var.hide();
                    }
                } else if (b11 instanceof B.d) {
                    androidx.compose.ui.platform.r2 r2Var2 = this.f26047c;
                    if (r2Var2 != null) {
                        r2Var2.show();
                    }
                } else if (b11 instanceof B.a) {
                    Vh.a(this.f26048d);
                }
                return jn0.h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Flow flow, androidx.compose.ui.platform.r2 r2Var, i3.f fVar, Continuation continuation) {
            super(2, continuation);
            this.f26042b = flow;
            this.f26043c = r2Var;
            this.f26044d = fVar;
        }

        @Override // wn0.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f26042b, this.f26043c, this.f26044d, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f26041a;
            if (i11 == 0) {
                jn0.t.b(obj);
                Flow flow = this.f26042b;
                if (flow != null) {
                    a aVar = new a(this.f26043c, this.f26044d, null);
                    this.f26041a = 1;
                    if (AbstractC3989wg.a(flow, aVar, this) == coroutine_suspended) {
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

    static final class c implements wn0.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ E f26049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ wn0.l f26050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i3.f f26051c;

        c(E e11, wn0.l lVar, i3.f fVar) {
            this.f26049a = e11;
            this.f26050b = lVar;
            this.f26051c = fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(wn0.l lVar, String value) {
            p013kotlin.jvm.internal.s.k(value, "value");
            lVar.invoke(new C.d(value));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 c(wn0.l lVar, boolean z11) {
            lVar.invoke(new C.c(A.HOUSE_NUMBER, z11));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 d(wn0.l lVar, boolean z11) {
            lVar.invoke(new C.c(A.HOUSE_NUMBER_SUFFIX, z11));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 e(wn0.l lVar, boolean z11) {
            lVar.invoke(new C.c(A.STREET, z11));
            return jn0.h0.f84049a;
        }

        public final void a(v1.i OrcaScreen, p020r2.l lVar, int i11) {
            p013kotlin.jvm.internal.s.k(OrcaScreen, "$this$OrcaScreen");
            if ((i11 & 17) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(408582779, i11, -1, "com.fourthline.orca.kyc.internal.flow.address.details.AddressDetailsScreen.<anonymous> (AddressDetailsScreen.kt:86)");
            }
            K0 k0T = this.f26049a.t();
            lVar.o(903676899);
            boolean zN = lVar.n(this.f26050b);
            final wn0.l lVar2 = this.f26050b;
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new wn0.l() { // from class: com.fourthline.orca.internal.ob0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.a(lVar2, ((Boolean) obj).booleanValue());
                    }
                };
                lVar.B(objI);
            }
            wn0.l lVar3 = (wn0.l) objI;
            lVar.l();
            lVar.o(903685108);
            boolean zN2 = lVar.n(this.f26050b);
            final wn0.l lVar4 = this.f26050b;
            Object objI2 = lVar.I();
            if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new wn0.l() { // from class: com.fourthline.orca.internal.pb0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.b(lVar4, (String) obj);
                    }
                };
                lVar.B(objI2);
            }
            wn0.l lVar5 = (wn0.l) objI2;
            lVar.l();
            lVar.o(903688818);
            boolean zN3 = lVar.n(this.f26050b);
            final wn0.l lVar6 = this.f26050b;
            Object objI3 = lVar.I();
            if (zN3 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new wn0.l() { // from class: com.fourthline.orca.internal.qb0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.a(lVar6, (InterfaceC3447jx) obj);
                    }
                };
                lVar.B(objI3);
            }
            wn0.l lVar7 = (wn0.l) objI3;
            lVar.l();
            lVar.o(903692731);
            boolean zN4 = lVar.n(this.f26050b) | lVar.K(this.f26051c);
            final wn0.l lVar8 = this.f26050b;
            final i3.f fVar = this.f26051c;
            Object objI4 = lVar.I();
            if (zN4 || objI4 == p020r2.l.INSTANCE.a()) {
                objI4 = new wn0.a() { // from class: com.fourthline.orca.internal.rb0
                    @Override // wn0.a
                    public final Object invoke() {
                        return H.c.a(lVar8, fVar);
                    }
                };
                lVar.B(objI4);
            }
            lVar.l();
            H0.a(k0T, null, lVar3, lVar5, lVar7, (wn0.a) objI4, lVar, 0, 2);
            lVar.o(903698627);
            Nh nhS = this.f26049a.s();
            final i3.f fVar2 = this.f26051c;
            final wn0.l lVar9 = this.f26050b;
            String strA = Oh.a(nhS, lVar, 0);
            String strB = Oh.b(nhS, lVar, 0);
            Mh mhE = nhS.e();
            Gh state = nhS.getState();
            String strC = nhS.c();
            String strC2 = RA.c(nhS.a(), lVar, 0);
            String strC3 = RA.c(nhS.h(), lVar, 0);
            String strC4 = RA.c(nhS.d(), lVar, 0);
            InterfaceC3903uh interfaceC3903uhI = nhS.i();
            lVar.o(969074829);
            boolean zK = lVar.K(fVar2);
            Object objI5 = lVar.I();
            if (zK || objI5 == p020r2.l.INSTANCE.a()) {
                objI5 = new wn0.l() { // from class: com.fourthline.orca.internal.sb0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.a(fVar2, (kotlin.y) obj);
                    }
                };
                lVar.B(objI5);
            }
            lVar.l();
            kotlin.z zVar = new kotlin.z((wn0.l) objI5, null, null, null, null, null, 62, null);
            Lh lh2 = Lh.AlphaNumericWithSpace;
            lVar.o(969063864);
            boolean zN5 = lVar.n(lVar9);
            Object objI6 = lVar.I();
            if (zN5 || objI6 == p020r2.l.INSTANCE.a()) {
                objI6 = new wn0.l() { // from class: com.fourthline.orca.internal.tb0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.b(lVar9, ((Boolean) obj).booleanValue());
                    }
                };
                lVar.B(objI6);
            }
            wn0.l lVar10 = (wn0.l) objI6;
            lVar.l();
            lVar.o(969068952);
            boolean zN6 = lVar.n(lVar9);
            Object objI7 = lVar.I();
            if (zN6 || objI7 == p020r2.l.INSTANCE.a()) {
                objI7 = new wn0.l() { // from class: com.fourthline.orca.internal.ub0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.a(lVar9, (String) obj);
                    }
                };
                lVar.B(objI7);
            }
            lVar.l();
            Vh.a(null, "postalCode", mhE, state, strC, strC2, null, strC3, false, lVar10, 0, strC4, interfaceC3903uhI, (wn0.l) objI7, false, null, zVar, lh2, null, strA, strB, null, lVar, 48, 12582912, 0, 2409793);
            jn0.h0 h0Var = jn0.h0.f84049a;
            lVar.l();
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarH = androidx.compose.foundation.layout.x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null);
            float f11 = 16;
            v1.b.f fVarN = v1.b.f117444a.n(w4.h.g(f11));
            E e11 = this.f26049a;
            final i3.f fVar3 = this.f26051c;
            final wn0.l lVar11 = this.f26050b;
            d3.c.Companion companion2 = d3.c.INSTANCE;
            z3.i0 i0VarB = v1.e0.b(fVarN, companion2.l(), lVar, 6);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            androidx.compose.ui.d dVarE = androidx.compose.ui.c.e(lVar, dVarH);
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
            v1.h0 h0Var2 = v1.h0.f117504a;
            androidx.compose.ui.d dVarG = androidx.compose.foundation.layout.x.g(companion, 0.5f);
            z3.i0 i0VarH = androidx.compose.foundation.layout.g.h(companion2.o(), false);
            int iA2 = p020r2.j.a(lVar, 0);
            p020r2.x xVarC2 = lVar.c();
            androidx.compose.ui.d dVarE2 = androidx.compose.ui.c.e(lVar, dVarG);
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
            p020r2.d4.b(lVarA2, i0VarH, companion3.c());
            p020r2.d4.b(lVarA2, xVarC2, companion3.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB2 = companion3.b();
            if (lVarA2.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            p020r2.d4.b(lVarA2, dVarE2, companion3.d());
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            lVar.o(700741938);
            Nh nhV = e11.v();
            String strA2 = Oh.a(nhV, lVar, 0);
            String strB2 = Oh.b(nhV, lVar, 0);
            Mh mhE2 = nhV.e();
            Gh state2 = nhV.getState();
            String strC5 = nhV.c();
            String strC6 = RA.c(nhV.a(), lVar, 0);
            String strC7 = RA.c(nhV.h(), lVar, 0);
            String strC8 = RA.c(nhV.d(), lVar, 0);
            InterfaceC3903uh interfaceC3903uhI2 = nhV.i();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, o4.y.INSTANCE.d(), 0, (o4.i0) null, (Boolean) null, (LocaleList) null, 123, (DefaultConstructorMarker) null);
            lVar.o(702046619);
            boolean zK2 = lVar.K(fVar3);
            Object objI8 = lVar.I();
            if (zK2 || objI8 == p020r2.l.INSTANCE.a()) {
                objI8 = new wn0.l() { // from class: com.fourthline.orca.internal.vb0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.b(fVar3, (kotlin.y) obj);
                    }
                };
                lVar.B(objI8);
            }
            lVar.l();
            kotlin.z zVar2 = new kotlin.z((wn0.l) objI8, null, null, null, null, null, 62, null);
            Lh lh3 = Lh.Numeric;
            lVar.o(702034055);
            boolean zN7 = lVar.n(lVar11);
            Object objI9 = lVar.I();
            if (zN7 || objI9 == p020r2.l.INSTANCE.a()) {
                objI9 = new wn0.l() { // from class: com.fourthline.orca.internal.wb0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.c(lVar11, ((Boolean) obj).booleanValue());
                    }
                };
                lVar.B(objI9);
            }
            wn0.l lVar12 = (wn0.l) objI9;
            lVar.l();
            lVar.o(702039943);
            boolean zN8 = lVar.n(lVar11);
            Object objI10 = lVar.I();
            if (zN8 || objI10 == p020r2.l.INSTANCE.a()) {
                objI10 = new wn0.l() { // from class: com.fourthline.orca.internal.xb0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.c(lVar11, (String) obj);
                    }
                };
                lVar.B(objI10);
            }
            lVar.l();
            Vh.a(null, "houseNumber", mhE2, state2, strC5, strC6, null, strC7, false, lVar12, 0, strC8, interfaceC3903uhI2, (wn0.l) objI10, false, keyboardOptions, zVar2, lh3, null, strA2, strB2, null, lVar, 48, 12779520, 0, 2377025);
            lVar.l();
            lVar.g();
            androidx.compose.ui.d dVarG2 = androidx.compose.foundation.layout.x.g(companion, 1.0f);
            z3.i0 i0VarH2 = androidx.compose.foundation.layout.g.h(companion2.o(), false);
            int iA3 = p020r2.j.a(lVar, 0);
            p020r2.x xVarC3 = lVar.c();
            androidx.compose.ui.d dVarE3 = androidx.compose.ui.c.e(lVar, dVarG2);
            wn0.a<b4.g> aVarA3 = companion3.a();
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA3);
            } else {
                lVar.d();
            }
            p020r2.l lVarA3 = p020r2.d4.a(lVar);
            p020r2.d4.b(lVarA3, i0VarH2, companion3.c());
            p020r2.d4.b(lVarA3, xVarC3, companion3.e());
            wn0.p<b4.g, Integer, jn0.h0> pVarB3 = companion3.b();
            if (lVarA3.getInserting() || !p013kotlin.jvm.internal.s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            p020r2.d4.b(lVarA3, dVarE3, companion3.d());
            lVar.o(700793711);
            Nh nhW = e11.w();
            String strA3 = Oh.a(nhW, lVar, 0);
            String strB3 = Oh.b(nhW, lVar, 0);
            Mh mhE3 = nhW.e();
            Gh state3 = nhW.getState();
            String strC9 = nhW.c();
            String strC10 = RA.c(nhW.a(), lVar, 0);
            String strC11 = RA.c(nhW.h(), lVar, 0);
            String strC12 = RA.c(nhW.d(), lVar, 0);
            InterfaceC3903uh interfaceC3903uhI3 = nhW.i();
            lVar.o(702094171);
            boolean zK3 = lVar.K(fVar3);
            Object objI11 = lVar.I();
            if (zK3 || objI11 == p020r2.l.INSTANCE.a()) {
                objI11 = new wn0.l() { // from class: com.fourthline.orca.internal.yb0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.c(fVar3, (kotlin.y) obj);
                    }
                };
                lVar.B(objI11);
            }
            lVar.l();
            kotlin.z zVar3 = new kotlin.z((wn0.l) objI11, null, null, null, null, null, 62, null);
            Lh lh4 = Lh.AlphaNumeric;
            lVar.o(702081166);
            boolean zN9 = lVar.n(lVar11);
            Object objI12 = lVar.I();
            if (zN9 || objI12 == p020r2.l.INSTANCE.a()) {
                objI12 = new wn0.l() { // from class: com.fourthline.orca.internal.zb0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.d(lVar11, ((Boolean) obj).booleanValue());
                    }
                };
                lVar.B(objI12);
            }
            wn0.l lVar13 = (wn0.l) objI12;
            lVar.l();
            lVar.o(702087278);
            boolean zN10 = lVar.n(lVar11);
            Object objI13 = lVar.I();
            if (zN10 || objI13 == p020r2.l.INSTANCE.a()) {
                objI13 = new wn0.l() { // from class: com.fourthline.orca.internal.ac0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.d(lVar11, (String) obj);
                    }
                };
                lVar.B(objI13);
            }
            lVar.l();
            Vh.a(null, "suffix", mhE3, state3, strC9, strC10, null, strC11, false, lVar13, 0, strC12, interfaceC3903uhI3, (wn0.l) objI13, false, null, zVar3, lh4, null, strA3, strB3, null, lVar, 48, 12582912, 0, 2409793);
            lVar.l();
            lVar.g();
            lVar.g();
            lVar.o(903842772);
            Nh nhU = this.f26049a.u();
            final i3.f fVar4 = this.f26051c;
            final wn0.l lVar14 = this.f26050b;
            String strA4 = Oh.a(nhU, lVar, 0);
            String strB4 = Oh.b(nhU, lVar, 0);
            Mh mhE4 = nhU.e();
            Gh state4 = nhU.getState();
            String strC13 = nhU.c();
            String strC14 = RA.c(nhU.a(), lVar, 0);
            String strC15 = RA.c(nhU.h(), lVar, 0);
            String strC16 = RA.c(nhU.d(), lVar, 0);
            InterfaceC3903uh interfaceC3903uhI4 = nhU.i();
            lVar.o(969218413);
            boolean zK4 = lVar.K(fVar4);
            Object objI14 = lVar.I();
            if (zK4 || objI14 == p020r2.l.INSTANCE.a()) {
                objI14 = new wn0.l() { // from class: com.fourthline.orca.internal.bc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.d(fVar4, (kotlin.y) obj);
                    }
                };
                lVar.B(objI14);
            }
            lVar.l();
            kotlin.z zVar4 = new kotlin.z((wn0.l) objI14, null, null, null, null, null, 62, null);
            Lh lh5 = Lh.AlphaWithDiacriticsExtra;
            lVar.o(969207763);
            boolean zN11 = lVar.n(lVar14);
            Object objI15 = lVar.I();
            if (zN11 || objI15 == p020r2.l.INSTANCE.a()) {
                objI15 = new wn0.l() { // from class: com.fourthline.orca.internal.cc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.e(lVar14, ((Boolean) obj).booleanValue());
                    }
                };
                lVar.B(objI15);
            }
            wn0.l lVar15 = (wn0.l) objI15;
            lVar.l();
            lVar.o(969212691);
            boolean zN12 = lVar.n(lVar14);
            Object objI16 = lVar.I();
            if (zN12 || objI16 == p020r2.l.INSTANCE.a()) {
                objI16 = new wn0.l() { // from class: com.fourthline.orca.internal.dc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.e(lVar14, (String) obj);
                    }
                };
                lVar.B(objI16);
            }
            lVar.l();
            Vh.a(null, "street", mhE4, state4, strC13, strC14, null, strC15, false, lVar15, 0, strC16, interfaceC3903uhI4, (wn0.l) objI16, false, null, zVar4, lh5, null, strA4, strB4, null, lVar, 48, 12582912, 0, 2409793);
            lVar.l();
            lVar.o(903880652);
            Nh nhQ = this.f26049a.q();
            final i3.f fVar5 = this.f26051c;
            final wn0.l lVar16 = this.f26050b;
            String strA5 = Oh.a(nhQ, lVar, 0);
            String strB5 = Oh.b(nhQ, lVar, 0);
            Mh mhE5 = nhQ.e();
            Gh state5 = nhQ.getState();
            String strC17 = nhQ.c();
            String strC18 = RA.c(nhQ.a(), lVar, 0);
            String strC19 = RA.c(nhQ.h(), lVar, 0);
            String strC20 = RA.c(nhQ.d(), lVar, 0);
            InterfaceC3903uh interfaceC3903uhI5 = nhQ.i();
            lVar.o(969256045);
            boolean zK5 = lVar.K(fVar5);
            Object objI17 = lVar.I();
            if (zK5 || objI17 == p020r2.l.INSTANCE.a()) {
                objI17 = new wn0.l() { // from class: com.fourthline.orca.internal.ec0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.e(fVar5, (kotlin.y) obj);
                    }
                };
                lVar.B(objI17);
            }
            lVar.l();
            kotlin.z zVar5 = new kotlin.z((wn0.l) objI17, null, null, null, null, null, 62, null);
            lVar.o(969245521);
            boolean zN13 = lVar.n(lVar16);
            Object objI18 = lVar.I();
            if (zN13 || objI18 == p020r2.l.INSTANCE.a()) {
                objI18 = new wn0.l() { // from class: com.fourthline.orca.internal.fc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.f(lVar16, ((Boolean) obj).booleanValue());
                    }
                };
                lVar.B(objI18);
            }
            wn0.l lVar17 = (wn0.l) objI18;
            lVar.l();
            lVar.o(969250385);
            boolean zN14 = lVar.n(lVar16);
            Object objI19 = lVar.I();
            if (zN14 || objI19 == p020r2.l.INSTANCE.a()) {
                objI19 = new wn0.l() { // from class: com.fourthline.orca.internal.gc0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.c.f(lVar16, (String) obj);
                    }
                };
                lVar.B(objI19);
            }
            lVar.l();
            Vh.a(null, "city", mhE5, state5, strC17, strC18, null, strC19, false, lVar17, 0, strC20, interfaceC3903uhI5, (wn0.l) objI19, false, null, zVar5, lh5, null, strA5, strB5, null, lVar, 48, 12582912, 0, 2409793);
            lVar.l();
            v1.i0.a(androidx.compose.foundation.layout.x.i(companion, w4.h.g(f11)), lVar, 6);
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
        public static final jn0.h0 f(wn0.l lVar, boolean z11) {
            lVar.invoke(new C.c(A.CITY, z11));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(wn0.l lVar, boolean z11) {
            lVar.invoke(new C.c(A.POSTAL_CODE, z11));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 c(wn0.l lVar, String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            lVar.invoke(new C.j(A.HOUSE_NUMBER, it));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 d(wn0.l lVar, String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            lVar.invoke(new C.j(A.HOUSE_NUMBER_SUFFIX, it));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 e(wn0.l lVar, String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            lVar.invoke(new C.j(A.STREET, it));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 f(wn0.l lVar, String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            lVar.invoke(new C.j(A.CITY, it));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 b(i3.f fVar, kotlin.y KeyboardActions) {
            p013kotlin.jvm.internal.s.k(KeyboardActions, "$this$KeyboardActions");
            fVar.r(true);
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 c(i3.f fVar, kotlin.y KeyboardActions) {
            p013kotlin.jvm.internal.s.k(KeyboardActions, "$this$KeyboardActions");
            fVar.r(true);
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 d(i3.f fVar, kotlin.y KeyboardActions) {
            p013kotlin.jvm.internal.s.k(KeyboardActions, "$this$KeyboardActions");
            fVar.r(true);
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 e(i3.f fVar, kotlin.y KeyboardActions) {
            p013kotlin.jvm.internal.s.k(KeyboardActions, "$this$KeyboardActions");
            fVar.r(true);
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar, boolean z11) {
            if (z11) {
                lVar.invoke(C.e.f25163a);
            } else {
                lVar.invoke(C.f.f25164a);
            }
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar, InterfaceC3447jx item) {
            p013kotlin.jvm.internal.s.k(item, "item");
            lVar.invoke(new C.g(item));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar, i3.f fVar) {
            lVar.invoke(C.b.f25159a);
            fVar.r(true);
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(wn0.l lVar, String it) {
            p013kotlin.jvm.internal.s.k(it, "it");
            lVar.invoke(new C.j(A.POSTAL_CODE, it));
            return jn0.h0.f84049a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jn0.h0 a(i3.f fVar, kotlin.y KeyboardActions) {
            p013kotlin.jvm.internal.s.k(KeyboardActions, "$this$KeyboardActions");
            fVar.r(true);
            return jn0.h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(E e11, Flow flow, wn0.l lVar, int i11, p020r2.l lVar2, int i12) {
        a(e11, flow, lVar, lVar2, p020r2.k2.a(i11 | 1));
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 b(wn0.l lVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(C.a.f25158a);
        return jn0.h0.f84049a;
    }

    public static final void a(final E state, final Flow flow, final wn0.l onEventSent, p020r2.l lVar, final int i11) {
        int i12;
        p013kotlin.jvm.internal.s.k(state, "state");
        p013kotlin.jvm.internal.s.k(onEventSent, "onEventSent");
        p020r2.l lVarV = lVar.v(354360142);
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
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(354360142, i12, -1, "com.fourthline.orca.kyc.internal.flow.address.details.AddressDetailsScreen (AddressDetailsScreen.kt:61)");
            }
            androidx.compose.ui.platform.r2 r2Var = (androidx.compose.ui.platform.r2) lVarV.U(androidx.compose.ui.platform.z0.q());
            i3.f fVar = (i3.f) lVarV.U(androidx.compose.ui.platform.z0.h());
            jn0.h0 h0Var = jn0.h0.f84049a;
            lVarV.o(125701484);
            int i13 = i12 & 896;
            boolean z11 = i13 == 256;
            Object objI = lVarV.I();
            if (z11 || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(onEventSent, null);
                lVarV.B(objI);
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) objI, lVarV, 6);
            lVarV.o(125703992);
            boolean zK = lVarV.K(flow) | lVarV.n(r2Var) | lVarV.K(fVar);
            Object objI2 = lVarV.I();
            if (zK || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new b(flow, r2Var, fVar, null);
                lVarV.B(objI2);
            }
            lVarV.l();
            Function0.g(h0Var, (wn0.p) objI2, lVarV, 6);
            lVarV.o(125715206);
            boolean z12 = i13 == 256;
            Object objI3 = lVarV.I();
            if (z12 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new wn0.a() { // from class: com.fourthline.orca.internal.kb0
                    @Override // wn0.a
                    public final Object invoke() {
                        return H.a(onEventSent);
                    }
                };
                lVarV.B(objI3);
            }
            lVarV.l();
            f.d.a(false, (wn0.a) objI3, lVarV, 0, 1);
            String strC = RA.c(state.a(), lVarV, 0);
            z2.a aVarE = z2.c.e(408582779, true, new c(state, onEventSent, fVar), lVarV, 54);
            InterfaceC3777rk.b bVarR = state.r();
            lVarV.o(125971820);
            boolean z13 = i13 == 256;
            Object objI4 = lVarV.I();
            if (z13 || objI4 == p020r2.l.INSTANCE.a()) {
                objI4 = new wn0.l() { // from class: com.fourthline.orca.internal.lb0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.a(onEventSent, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI4);
            }
            lVarV.l();
            C3735qk c3735qk = new C3735qk(bVarR, (wn0.l) objI4);
            InterfaceC3777rk.a aVarP = state.p();
            lVarV.o(125977932);
            boolean z14 = i13 == 256;
            Object objI5 = lVarV.I();
            if (z14 || objI5 == p020r2.l.INSTANCE.a()) {
                objI5 = new wn0.l() { // from class: com.fourthline.orca.internal.mb0
                    @Override // wn0.l
                    public final Object invoke(Object obj) {
                        return H.b(onEventSent, (InterfaceC3807sD) obj);
                    }
                };
                lVarV.B(objI5);
            }
            lVarV.l();
            AbstractC3269fp.a(PlaceTypes.ADDRESS, strC, null, aVarE, null, new C3820sk(c3735qk, new C3735qk(aVarP, (wn0.l) objI5), false, 4, null), null, false, null, lVarV, 3078, 468);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        p020r2.w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new wn0.p() { // from class: com.fourthline.orca.internal.nb0
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return H.a(state, flow, onEventSent, i11, (p020r2.l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar) {
        lVar.invoke(C.a.f25158a);
        return jn0.h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jn0.h0 a(wn0.l lVar, InterfaceC3807sD it) {
        p013kotlin.jvm.internal.s.k(it, "it");
        lVar.invoke(C.h.f25166a);
        return jn0.h0.f84049a;
    }
}
