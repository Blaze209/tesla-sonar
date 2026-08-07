package j90;

import androidx.compose.ui.platform.s2;
import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import p009i2.p1;
import p009i2.q1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.d4;
import p020r2.j;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.x;
import p020r2.y2;
import v1.i;
import v1.q0;
import wn0.p;
import wn0.q;
import z3.a0;
import z3.i0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aE\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lj90/g;", "state", "Lj90/d;", "layoutInfo", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "Ljn0/h0;", "onDismissed", "sheetContent", "a", "(Lj90/g;Lj90/d;Landroidx/compose/ui/d;Lwn0/a;Lwn0/p;Lr2/l;II)V", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayoutKt$StripeBottomSheetLayout$1", f = "StripeBottomSheetLayout.kt", i = {}, l = {40, 42}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f83141n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ g f83142o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f83143p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(g gVar, wn0.a<h0> aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f83142o = gVar;
            this.f83143p = aVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f83142o, this.f83143p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.f83141n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                jn0.t.b(r5)
                goto L37
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                jn0.t.b(r5)
                goto L2c
            L1e:
                jn0.t.b(r5)
                j90.g r5 = r4.f83142o
                r4.f83141n = r3
                java.lang.Object r5 = r5.e(r4)
                if (r5 != r0) goto L2c
                goto L36
            L2c:
                j90.g r5 = r4.f83142o
                r4.f83141n = r2
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L37
            L36:
                return r0
            L37:
                j90.g$a r5 = (j90.g.a) r5
                j90.g$a r0 = j90.g.a.SwipedDownByUser
                if (r5 != r0) goto L42
                wn0.a<jn0.h0> r5 = r4.f83143p
                r5.invoke()
            L42:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: j90.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lv1/i;", "Ljn0/h0;", "a", "(Lv1/i;Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements q<i, l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f83144c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super l, ? super Integer, h0> pVar) {
            super(3);
            this.f83144c = pVar;
        }

        public final void a(i ModalBottomSheetLayout, l lVar, int i11) {
            s.k(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i11 & 81) == 16 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1959122039, i11, -1, "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayout.<anonymous> (StripeBottomSheetLayout.kt:58)");
            }
            androidx.compose.ui.d dVarA = s2.a(androidx.compose.ui.d.INSTANCE, "BottomSheetContentTestTag");
            p<l, Integer, h0> pVar = this.f83144c;
            lVar.H(733328855);
            i0 i0VarJ = androidx.compose.foundation.layout.g.j(d3.c.INSTANCE.o(), false, lVar, 0);
            lVar.H(-1323940314);
            int iA = j.a(lVar, 0);
            x xVarC = lVar.c();
            b4.g.Companion companion = b4.g.INSTANCE;
            wn0.a<b4.g> aVarA = companion.a();
            q<y2<b4.g>, l, Integer, h0> qVarA = a0.a(dVarA);
            if (lVar.w() == null) {
                j.c();
            }
            lVar.h();
            if (lVar.getInserting()) {
                lVar.z(aVarA);
            } else {
                lVar.d();
            }
            l lVarA = d4.a(lVar);
            d4.b(lVarA, i0VarJ, companion.c());
            d4.b(lVarA, xVarC, companion.e());
            p<b4.g, Integer, h0> pVarB = companion.b();
            if (lVarA.getInserting() || !s.f(lVarA.I(), Integer.valueOf(iA))) {
                lVarA.B(Integer.valueOf(iA));
                lVarA.f(Integer.valueOf(iA), pVarB);
            }
            qVarA.invoke(y2.a(y2.b(lVar)), lVar, 0);
            lVar.H(2058660585);
            androidx.compose.foundation.layout.i iVar = androidx.compose.foundation.layout.i.f4585a;
            pVar.invoke(lVar, 0);
            lVar.T();
            lVar.g();
            lVar.T();
            lVar.T();
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.q
        public /* bridge */ /* synthetic */ h0 invoke(i iVar, l lVar, Integer num) {
            a(iVar, lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f83145c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ StripeBottomSheetLayoutInfo f83146d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f83147e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f83148f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f83149g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f83150h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f83151i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(g gVar, StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo, androidx.compose.ui.d dVar, wn0.a<h0> aVar, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f83145c = gVar;
            this.f83146d = stripeBottomSheetLayoutInfo;
            this.f83147e = dVar;
            this.f83148f = aVar;
            this.f83149g = pVar;
            this.f83150h = i11;
            this.f83151i = i12;
        }

        public final void a(l lVar, int i11) {
            f.a(this.f83145c, this.f83146d, this.f83147e, this.f83148f, this.f83149g, lVar, k2.a(this.f83150h | 1), this.f83151i);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(g state, StripeBottomSheetLayoutInfo layoutInfo, androidx.compose.ui.d dVar, wn0.a<h0> onDismissed, p<? super l, ? super Integer, h0> sheetContent, l lVar, int i11, int i12) {
        s.k(state, "state");
        s.k(layoutInfo, "layoutInfo");
        s.k(onDismissed, "onDismissed");
        s.k(sheetContent, "sheetContent");
        l lVarV = lVar.v(217685577);
        androidx.compose.ui.d dVar2 = (i12 & 4) != 0 ? androidx.compose.ui.d.INSTANCE : dVar;
        if (o.J()) {
            o.S(217685577, i11, -1, "com.stripe.android.uicore.elements.bottomsheet.StripeBottomSheetLayout (StripeBottomSheetLayout.kt:37)");
        }
        Function0.g(h0.f84049a, new a(state, onDismissed, null), lVarV, 70);
        androidx.compose.ui.d dVarA = q0.a(q0.c(dVar2));
        long scrimColor = layoutInfo.getScrimColor();
        long sheetBackgroundColor = layoutInfo.getSheetBackgroundColor();
        p1.b(z2.c.b(lVarV, 1959122039, true, new b(sheetContent)), dVarA, state.getModalBottomSheetState(), false, layoutInfo.getSheetShape(), w4.h.g(0), sheetBackgroundColor, 0L, scrimColor, j90.a.f83128a.a(), lVarV, (q1.f74975e << 6) | 805506054, 128);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(state, layoutInfo, dVar2, onDismissed, sheetContent, i11, i12));
        }
    }
}
