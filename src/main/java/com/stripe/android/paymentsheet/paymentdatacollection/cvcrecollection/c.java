package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import androidx.compose.foundation.layout.n;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.focus.o;
import androidx.compose.ui.platform.s2;
import c80.CvcRecollectionViewState;
import c80.CvcState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e3.m;
import java.util.List;
import jn0.h0;
import jn0.t;
import k3.p1;
import kotlin.KeyboardOptions;
import kotlinx.coroutines.CoroutineScope;
import o4.y;
import p008h80.f0;
import p009i2.C4670d1;
import p009i2.j1;
import p009i2.r2;
import p009i2.v2;
import p010i90.Function1;
import p010i90.o1;
import p010i90.w0;
import p010i90.w1;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.d4;
import p020r2.k2;
import p020r2.w2;
import p020r2.y2;
import p020r2.y3;
import q1.b0;
import v1.e0;
import v1.g0;
import v1.w;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;
import z80.g1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\b0\u0006H\u0001¢\u0006\u0004\b\u0012\u0010\u000b\u001a%\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\bH\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a%\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0013H\u0003¢\u0006\u0004\b\u001b\u0010\u0016¨\u0006\u001e²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, d2 = {"", "lastFour", "", "isTestMode", "Lc80/h;", "cvcState", "Lkotlin/Function1;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/d;", "Ljn0/h0;", "viewActionHandler", "e", "(Ljava/lang/String;ZLc80/h;Lwn0/l;Lr2/l;I)V", "Lc80/e;", "interactor", "c", "(Lc80/e;Lr2/l;I)V", "enabled", "onValueChanged", "b", "Lkotlin/Function0;", "onClosePressed", "g", "(ZLwn0/a;Lr2/l;I)V", "f", "(Lr2/l;I)V", "isComplete", "onConfirmPressed", "a", "Lc80/g;", "state", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f53358c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(wn0.a<h0> aVar) {
            super(0);
            this.f53358c = aVar;
        }

        public final void b() {
            this.f53358c.invoke();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f53359c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f53360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f53361e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z11, wn0.a<h0> aVar, int i11) {
            super(2);
            this.f53359c = z11;
            this.f53360d = aVar;
            this.f53361e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.a(this.f53359c, this.f53360d, lVar, k2.a(this.f53361e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionScreenKt$CvcRecollectionField$1$1", f = "CvcRecollectionScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1035c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53362n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ o f53363o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1035c(o oVar, Continuation<? super C1035c> continuation) {
            super(2, continuation);
            this.f53363o = oVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C1035c(this.f53363o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f53362n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            this.f53363o.f();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C1035c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ long f53364c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, h0> f53365d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ o f53366e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ CvcState f53367f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f53368g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f53369h;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.l<String, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.l<String, h0> f53370c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(wn0.l<? super String, h0> lVar) {
                super(1);
                this.f53370c = lVar;
            }

            public final void a(String it) {
                s.k(it, "it");
                this.f53370c.invoke(it);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                a(str);
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CvcState f53371c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(CvcState cvcState) {
                super(2);
                this.f53371c = cvcState;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-173061439, i11, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (CvcRecollectionScreen.kt:199)");
                }
                w0.a(e4.i.c(this.f53371c.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String(), lVar, 0), s2.a(androidx.compose.ui.d.INSTANCE, "TEST_TAG_CVC_LABEL"), false, lVar, 48, 4);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c$d$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
        static final class C1036c extends u implements p<p020r2.l, Integer, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CvcState f53372c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1036c(CvcState cvcState) {
                super(2);
                this.f53372c = cvcState;
            }

            public final void a(p020r2.l lVar, int i11) {
                if ((i11 & 11) == 2 && lVar.b()) {
                    lVar.j();
                    return;
                }
                if (p020r2.o.J()) {
                    p020r2.o.S(-1996484604, i11, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField.<anonymous>.<anonymous>.<anonymous> (CvcRecollectionScreen.kt:205)");
                }
                Function1.w(this.f53372c.getCvcIcon(), false, null, lVar, w1.Trailing.f77060e | 48, 4);
                if (p020r2.o.J()) {
                    p020r2.o.R();
                }
            }

            @Override // wn0.p
            public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
                a(lVar, num.intValue());
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(long j11, wn0.l<? super String, h0> lVar, o oVar, CvcState cvcState, boolean z11, String str) {
            super(2);
            this.f53364c = j11;
            this.f53365d = lVar;
            this.f53366e = oVar;
            this.f53367f = cvcState;
            this.f53368g = z11;
            this.f53369h = str;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(-404027903, i11, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField.<anonymous> (CvcRecollectionScreen.kt:139)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            androidx.compose.ui.d dVarA = n.a(x.h(companion, BitmapDescriptorFactory.HUE_RED, 1, null), w.Min);
            long j11 = this.f53364c;
            wn0.l<String, h0> lVar2 = this.f53365d;
            o oVar = this.f53366e;
            CvcState cvcState = this.f53367f;
            boolean z11 = this.f53368g;
            String str = this.f53369h;
            lVar.H(693286680);
            v1.b bVar = v1.b.f117444a;
            v1.b.e eVarF = bVar.f();
            d3.c.Companion companion2 = d3.c.INSTANCE;
            i0 i0VarB = e0.b(eVarF, companion2.l(), lVar, 0);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            b4.g.Companion companion3 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion3.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarA);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarB, companion3.c());
            d4.b(lVarA, xVarC, companion3.e());
            p<b4.g, Integer, h0> pVarB = companion3.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            androidx.compose.ui.d dVarD = androidx.compose.foundation.b.d(x.f(h0Var.a(companion, 0.5f, true), BitmapDescriptorFactory.HUE_RED, 1, null), j11, null, 2, null);
            lVar.H(733328855);
            i0 i0VarJ = androidx.compose.foundation.layout.g.j(companion2.o(), false, lVar, 0);
            lVar.H(-1323940314);
            int iA2 = p020r2.j.a(lVar, 0);
            p020r2.x xVarC2 = lVar.c();
            wn0.a<b4.g> aVarA2 = companion3.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA2 = a0.a(dVarD);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA2);
            } else {
                lVar.d();
            }
            p020r2.l lVarA2 = d4.a(lVar);
            d4.b(lVarA2, i0VarJ, companion3.c());
            d4.b(lVarA2, xVarC2, companion3.e());
            p<b4.g, Integer, h0> pVarB2 = companion3.b();
            if (lVarA2.getInserting() || !s.f(lVarA2.I(), Integer.valueOf(iA2))) {
                lVarA2.B(Integer.valueOf(iA2));
                lVarA2.f(Integer.valueOf(iA2), pVarB2);
            }
            qVarA2.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            androidx.compose.ui.d dVarI = androidx.compose.foundation.layout.t.i(androidx.compose.foundation.layout.i.f4585a.a(companion, companion2.h()), w4.h.g(12));
            v1.b.f fVarN = bVar.n(w4.h.g(6));
            d3.c.InterfaceC1212c interfaceC1212cI = companion2.i();
            lVar.H(693286680);
            i0 i0VarB2 = e0.b(fVarN, interfaceC1212cI, lVar, 54);
            lVar.H(-1323940314);
            int iA3 = p020r2.j.a(lVar, 0);
            p020r2.x xVarC3 = lVar.c();
            wn0.a<b4.g> aVarA3 = companion3.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA3 = a0.a(dVarI);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA3);
            } else {
                lVar.d();
            }
            p020r2.l lVarA3 = d4.a(lVar);
            d4.b(lVarA3, i0VarB2, companion3.c());
            d4.b(lVarA3, xVarC3, companion3.e());
            p<b4.g, Integer, h0> pVarB3 = companion3.b();
            if (lVarA3.getInserting() || !s.f(lVarA3.I(), Integer.valueOf(iA3))) {
                lVarA3.B(Integer.valueOf(iA3));
                lVarA3.f(Integer.valueOf(iA3), pVarB3);
            }
            qVarA3.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            b0.a(e4.e.c(cvcState.getCardBrand().getIcon(), lVar, 0), "", null, null, null, BitmapDescriptorFactory.HUE_RED, null, lVar, 56, 124);
            String strD = e4.i.d(n70.x.W, new Object[]{" " + str}, lVar, 64);
            j1 j1Var = j1.f74525a;
            int i12 = j1.f74526b;
            v2.b(strD, s2.a(companion, "TEST_TAG_CVC_LAST_FOUR"), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, j1Var.c(lVar, i12).getBody1(), lVar, 48, 0, 65532);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            p009i2.i0.a(x.d(x.v(companion, w4.h.g(1)), BitmapDescriptorFactory.HUE_RED, 1, null), f90.n.n(j1Var, lVar, i12).getComponentBorder(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, lVar, 6, 12);
            List listE = v.e(m.CreditCardSecurityCode);
            lVar.H(1517719920);
            boolean zN = lVar.n(lVar2);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(lVar2);
                lVar.B(objI);
            }
            lVar.T();
            androidx.compose.ui.d dVarA2 = s2.a(androidx.compose.ui.focus.p.a(h0Var.a(x.h(q90.a.a(companion, listE, (wn0.l) objI, lVar, 54), BitmapDescriptorFactory.HUE_RED, 1, null), 0.5f, true), oVar), "TEST_TAG_CVC_FIELD");
            r2.a(cvcState.getCvc(), lVar2, dVarA2, z11, false, null, z2.c.b(lVar, -173061439, true, new b(cvcState)), null, null, z2.c.b(lVar, -1996484604, true, new C1036c(cvcState)), false, null, new KeyboardOptions(0, false, y.INSTANCE.e(), 0, 11, null), null, true, 0, 0, null, j1Var.b(lVar, i12).getLarge(), Function1.d(false, lVar, 0, 1), lVar, 806879232, 24960, 241072);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class e extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f53373c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f53374d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ CvcState f53375e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<String, h0> f53376f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f53377g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(String str, boolean z11, CvcState cvcState, wn0.l<? super String, h0> lVar, int i11) {
            super(2);
            this.f53373c = str;
            this.f53374d = z11;
            this.f53375e = cvcState;
            this.f53376f = lVar;
            this.f53377g = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.b(this.f53373c, this.f53374d, this.f53375e, this.f53376f, lVar, k2.a(this.f53377g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c80.e f53378c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ y3<CvcRecollectionViewState> f53379d;

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class a extends p013kotlin.jvm.internal.p implements wn0.l<String, h0> {
            a(Object obj) {
                super(1, obj, c80.e.class, "onCvcChanged", "onCvcChanged(Ljava/lang/String;)V", 0);
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                o(str);
                return h0.f84049a;
            }

            public final void o(String p11) {
                s.k(p11, "p0");
                ((c80.e) this.receiver).b(p11);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(c80.e eVar, y3<CvcRecollectionViewState> y3Var) {
            super(2);
            this.f53378c = eVar;
            this.f53379d = y3Var;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(66292912, i11, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionPaymentSheetScreen.<anonymous> (CvcRecollectionScreen.kt:97)");
            }
            androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.t.k(androidx.compose.foundation.b.d(androidx.compose.ui.d.INSTANCE, f90.n.n(j1.f74525a, lVar, j1.f74526b).getMaterialColors().n(), null, 2, null), w4.h.g(20), BitmapDescriptorFactory.HUE_RED, 2, null);
            c80.e eVar = this.f53378c;
            y3<CvcRecollectionViewState> y3Var = this.f53379d;
            lVar.H(-483455358);
            i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVar, 0);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarK);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarA, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            c.f(lVar, 0);
            c.b(c.d(y3Var).getLastFour(), c.d(y3Var).getIsEnabled(), c.d(y3Var).getCvcState(), new a(eVar), lVar, 0);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class g extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c80.e f53380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f53381d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(c80.e eVar, int i11) {
            super(2);
            this.f53380c = eVar;
            this.f53381d = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.c(this.f53380c, lVar, k2.a(this.f53381d | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f53382c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d, h0> f53383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f53384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ CvcState f53385f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.l<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d, h0> f53386c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(wn0.l<? super com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d, h0> lVar) {
                super(0);
                this.f53386c = lVar;
            }

            public final void b() {
                this.f53386c.invoke(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d.a.f53399a);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
        static final class b extends u implements wn0.l<String, h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.l<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d, h0> f53387c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(wn0.l<? super com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d, h0> lVar) {
                super(1);
                this.f53387c = lVar;
            }

            public final void a(String it) {
                s.k(it, "it");
                this.f53387c.invoke(new com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d.OnCvcChanged(it));
            }

            @Override // wn0.l
            public /* bridge */ /* synthetic */ h0 invoke(String str) {
                a(str);
                return h0.f84049a;
            }
        }

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.c$h$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
        static final class C1037c extends u implements wn0.a<h0> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ wn0.l<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d, h0> f53388c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1037c(wn0.l<? super com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d, h0> lVar) {
                super(0);
                this.f53388c = lVar;
            }

            public final void b() {
                this.f53388c.invoke(com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d.b.f53400a);
            }

            @Override // wn0.a
            public /* bridge */ /* synthetic */ h0 invoke() {
                b();
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(boolean z11, wn0.l<? super com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d, h0> lVar, String str, CvcState cvcState) {
            super(2);
            this.f53382c = z11;
            this.f53383d = lVar;
            this.f53384e = str;
            this.f53385f = cvcState;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (p020r2.o.J()) {
                p020r2.o.S(891453526, i11, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionScreen.<anonymous> (CvcRecollectionScreen.kt:66)");
            }
            androidx.compose.ui.d dVarK = androidx.compose.foundation.layout.t.k(androidx.compose.foundation.b.d(androidx.compose.ui.d.INSTANCE, f90.n.n(j1.f74525a, lVar, j1.f74526b).getMaterialColors().n(), null, 2, null), w4.h.g(20), BitmapDescriptorFactory.HUE_RED, 2, null);
            boolean z11 = this.f53382c;
            wn0.l<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d, h0> lVar2 = this.f53383d;
            String str = this.f53384e;
            CvcState cvcState = this.f53385f;
            lVar.H(-483455358);
            i0 i0VarA = v1.g.a(v1.b.f117444a.g(), d3.c.INSTANCE.k(), lVar, 0);
            lVar.H(-1323940314);
            int iA = p020r2.j.a(lVar, 0);
            p020r2.x xVarC = lVar.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarK);
            if (lVar.w() == null) {
                p020r2.j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            p020r2.l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarA, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            v1.j jVar = v1.j.f117505a;
            lVar.H(161246301);
            boolean zN = lVar.n(lVar2);
            Object objI = lVar.I();
            if (zN || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(lVar2);
                lVar.B(objI);
            }
            lVar.T();
            c.g(z11, (wn0.a) objI, lVar, 0);
            c.f(lVar, 0);
            lVar.H(161256097);
            boolean zN2 = lVar.n(lVar2);
            Object objI2 = lVar.I();
            if (zN2 || objI2 == p020r2.l.INSTANCE.a()) {
                objI2 = new b(lVar2);
                lVar.B(objI2);
            }
            lVar.T();
            c.b(str, true, cvcState, (wn0.l) objI2, lVar, 48);
            boolean isValid = cvcState.getIsValid();
            lVar.H(161261472);
            boolean zN3 = lVar.n(lVar2);
            Object objI3 = lVar.I();
            if (zN3 || objI3 == p020r2.l.INSTANCE.a()) {
                objI3 = new C1037c(lVar2);
                lVar.B(objI3);
            }
            lVar.T();
            c.a(isValid, (wn0.a) objI3, lVar, 0);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class i extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f53389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f53390d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ CvcState f53391e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d, h0> f53392f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f53393g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        i(String str, boolean z11, CvcState cvcState, wn0.l<? super com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d, h0> lVar, int i11) {
            super(2);
            this.f53389c = str;
            this.f53390d = z11;
            this.f53391e = cvcState;
            this.f53392f = lVar;
            this.f53393g = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.e(this.f53389c, this.f53390d, this.f53391e, this.f53392f, lVar, k2.a(this.f53393g | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class j extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f53394c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(int i11) {
            super(2);
            this.f53394c = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.f(lVar, k2.a(this.f53394c | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "b", "()V"}, k = 3, mv = {1, 9, 0})
    static final class k extends u implements wn0.a<h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f53395c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(wn0.a<h0> aVar) {
            super(0);
            this.f53395c = aVar;
        }

        public final void b() {
            this.f53395c.invoke();
        }

        @Override // wn0.a
        public /* bridge */ /* synthetic */ h0 invoke() {
            b();
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class l extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f53396c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f53397d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f53398e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(boolean z11, wn0.a<h0> aVar, int i11) {
            super(2);
            this.f53396c = z11;
            this.f53397d = aVar;
            this.f53398e = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            c.g(this.f53396c, this.f53397d, lVar, k2.a(this.f53398e | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(boolean z11, wn0.a<h0> aVar, p020r2.l lVar, int i11) {
        int i12;
        boolean z12;
        p020r2.l lVarV = lVar.v(-1690775401);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.K(aVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarV.b()) {
            lVarV.j();
            z12 = z11;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1690775401, i12, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionButton (CvcRecollectionScreen.kt:252)");
            }
            float f11 = 0;
            androidx.compose.ui.d dVarA = s2.a(androidx.compose.foundation.layout.t.l(x.g(androidx.compose.ui.d.INSTANCE, 1.0f), w4.h.g(f11), w4.h.g(32), w4.h.g(f11), w4.h.g(20)), "CVC_CONFIRM");
            d3.c cVarE = d3.c.INSTANCE.e();
            lVarV.H(733328855);
            i0 i0VarJ = androidx.compose.foundation.layout.g.j(cVarE, false, lVarV, 6);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarA);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarJ, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            String strC = e4.i.c(n70.x.G, lVarV, 0);
            lVarV.H(78261620);
            boolean z13 = (i12 & 112) == 32;
            Object objI = lVarV.I();
            if (z13 || objI == p020r2.l.INSTANCE.a()) {
                objI = new a(aVar);
                lVarV.B(objI);
            }
            lVarV.T();
            z12 = z11;
            com.stripe.android.paymentsheet.ui.c.i(strC, false, z12, null, null, (wn0.a) objI, lVarV, ((i12 << 6) & 896) | 48, 24);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new b(z12, aVar, i11));
        }
    }

    public static final void b(String lastFour, boolean z11, CvcState cvcState, wn0.l<? super String, h0> onValueChanged, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVar2;
        s.k(lastFour, "lastFour");
        s.k(cvcState, "cvcState");
        s.k(onValueChanged, "onValueChanged");
        p020r2.l lVarV = lVar.v(715675132);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(lastFour) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.p(z11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.n(cvcState) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= lVarV.K(onValueChanged) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && lVarV.b()) {
            lVarV.j();
            lVar2 = lVarV;
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(715675132, i12, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionField (CvcRecollectionScreen.kt:121)");
            }
            long jP = q1.m.a(lVarV, 0) ? p1.p(p1.INSTANCE.k(), 0.075f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : p1.p(p1.INSTANCE.a(), 0.075f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null);
            lVarV.H(331793905);
            Object objI = lVarV.I();
            p020r2.l.Companion companion = p020r2.l.INSTANCE;
            if (objI == companion.a()) {
                objI = new o();
                lVarV.B(objI);
            }
            o oVar = (o) objI;
            lVarV.T();
            lVarV.H(331795492);
            if (!((Boolean) lVarV.U(androidx.compose.ui.platform.p1.a())).booleanValue()) {
                h0 h0Var = h0.f84049a;
                lVarV.H(331797501);
                Object objI2 = lVarV.I();
                if (objI2 == companion.a()) {
                    objI2 = new C1035c(oVar, null);
                    lVarV.B(objI2);
                }
                lVarV.T();
                Function0.g(h0Var, (p) objI2, lVarV, 70);
            }
            lVarV.T();
            lVar2 = lVarV;
            o1.b(null, null, false, 0L, null, z2.c.b(lVarV, -404027903, true, new d(jP, onValueChanged, oVar, cvcState, z11, lastFour)), lVar2, 196608, 31);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVar2.x();
        if (w2VarX != null) {
            w2VarX.a(new e(lastFour, z11, cvcState, onValueChanged, i11));
        }
    }

    public static final void c(c80.e interactor, p020r2.l lVar, int i11) {
        int i12;
        s.k(interactor, "interactor");
        p020r2.l lVarV = lVar.v(-1132926818);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(interactor) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 11) == 2 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1132926818, i12, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionPaymentSheetScreen (CvcRecollectionScreen.kt:93)");
            }
            f90.n.a(null, null, null, z2.c.b(lVarV, 66292912, true, new f(interactor, r90.f.a(interactor.a(), lVarV, 8))), lVarV, 3072, 7);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new g(interactor, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CvcRecollectionViewState d(y3<CvcRecollectionViewState> y3Var) {
        return y3Var.getValue();
    }

    public static final void e(String lastFour, boolean z11, CvcState cvcState, wn0.l<? super com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.d, h0> viewActionHandler, p020r2.l lVar, int i11) {
        int i12;
        s.k(lastFour, "lastFour");
        s.k(cvcState, "cvcState");
        s.k(viewActionHandler, "viewActionHandler");
        p020r2.l lVarV = lVar.v(-694222012);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.n(lastFour) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.p(z11) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= lVarV.n(cvcState) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= lVarV.K(viewActionHandler) ? 2048 : 1024;
        }
        if ((i12 & 5851) == 1170 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-694222012, i12, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionScreen (CvcRecollectionScreen.kt:64)");
            }
            f90.n.a(null, null, null, z2.c.b(lVarV, 891453526, true, new h(z11, viewActionHandler, lastFour, cvcState)), lVarV, 3072, 7);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new i(lastFour, z11, cvcState, viewActionHandler, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(p020r2.l lVar, int i11) {
        p020r2.l lVarV = lVar.v(802797669);
        if (i11 == 0 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(802797669, i11, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionTitle (CvcRecollectionScreen.kt:239)");
            }
            float f11 = 0;
            g1.a(e4.i.c(n70.x.H, lVarV, 0), s2.a(androidx.compose.foundation.layout.t.l(androidx.compose.ui.d.INSTANCE, w4.h.g(f11), w4.h.g(f11), w4.h.g(f11), w4.h.g(16)), "TEST_TAG_CONFIRM_CVC"), lVarV, 48, 0);
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new j(i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(boolean z11, wn0.a<h0> aVar, p020r2.l lVar, int i11) {
        int i12;
        p020r2.l lVarV = lVar.v(-1018538037);
        if ((i11 & 14) == 0) {
            i12 = (lVarV.p(z11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= lVarV.K(aVar) ? 32 : 16;
        }
        if ((i12 & 91) == 18 && lVarV.b()) {
            lVarV.j();
        } else {
            if (p020r2.o.J()) {
                p020r2.o.S(-1018538037, i12, -1, "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionTopBar (CvcRecollectionScreen.kt:219)");
            }
            androidx.compose.ui.d.Companion companion = androidx.compose.ui.d.INSTANCE;
            float f11 = 0;
            float f12 = 16;
            androidx.compose.ui.d dVarI = x.i(androidx.compose.foundation.layout.t.l(companion, w4.h.g(f11), w4.h.g(f12), w4.h.g(f11), w4.h.g(f11)), w4.h.g(32));
            lVarV.H(693286680);
            i0 i0VarB = e0.b(v1.b.f117444a.f(), d3.c.INSTANCE.l(), lVarV, 0);
            lVarV.H(-1323940314);
            int iA = p020r2.j.a(lVarV, 0);
            p020r2.x xVarC = lVarV.c();
            b4.g.Companion companion2 = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion2.a();
            q<y2<b4.g>, p020r2.l, Integer, h0> qVarA = a0.a(dVarI);
            if (lVarV.w() == null) {
                p020r2.j.c();
            }
            lVarV.h();
            if (lVarV.getInserting()) {
                lVarV.z(aVarA);
            } else {
                lVarV.d();
            }
            p020r2.l lVarA = d4.a(lVarV);
            d4.b(lVarA, i0VarB, companion2.c());
            d4.b(lVarA, xVarC, companion2.e());
            p<b4.g, Integer, h0> pVarB = companion2.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVarV)), lVarV, 0);
            lVarV.H(2058660585);
            v1.h0 h0Var = v1.h0.f117504a;
            lVarV.H(-1173681114);
            if (z11) {
                f0.d(lVarV, 0);
            }
            lVarV.T();
            v1.i0.a(g0.c(h0Var, companion, 1.0f, false, 2, null), lVarV, 0);
            lVarV.H(-1173676502);
            boolean z12 = (i12 & 112) == 32;
            Object objI = lVarV.I();
            if (z12 || objI == p020r2.l.INSTANCE.a()) {
                objI = new k(aVar);
                lVarV.B(objI);
            }
            lVarV.T();
            C4670d1.a((wn0.a) objI, androidx.compose.foundation.layout.q.b(companion, w4.h.g(f12), w4.h.g(-w4.h.g(8))), false, null, c80.b.f18926a.a(), lVarV, 24576, 12);
            lVarV.T();
            lVarV.g();
            lVarV.T();
            lVarV.T();
            if (p020r2.o.J()) {
                p020r2.o.R();
            }
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new l(z11, aVar, i11));
        }
    }
}
