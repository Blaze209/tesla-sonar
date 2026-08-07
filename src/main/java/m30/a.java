package m30;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import j90.StripeBottomSheetLayoutInfo;
import j90.e;
import j90.f;
import j90.g;
import jn0.h0;
import jn0.t;
import k3.p1;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import p009i2.r1;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p019p1.j;
import p020r2.Function0;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a=\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\"\u0014\u0010\r\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010²\u0006\f\u0010\u000f\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lj90/g;", "state", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "Ljn0/h0;", "onDismissed", "content", "a", "(Lj90/g;Landroidx/compose/ui/d;Lwn0/a;Lwn0/p;Lr2/l;II)V", "", "e", "()Z", "skipHideAnimation", "", "statusBarColorAlpha", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: m30.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.common.ui.ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$1", f = "ElementsBottomSheetLayout.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class C1935a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f90975n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ g f90976o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1935a(g gVar, Continuation<? super C1935a> continuation) {
            super(2, continuation);
            this.f90976o = gVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new C1935a(this.f90976o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f90975n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            this.f90976o.d(a.e());
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((C1935a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.common.ui.ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$2", f = "ElementsBottomSheetLayout.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f90977n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ lq.b f90978o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ StripeBottomSheetLayoutInfo f90979p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ y3<Float> f90980q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(lq.b bVar, StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfo, y3<Float> y3Var, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f90978o = bVar;
            this.f90979p = stripeBottomSheetLayoutInfo;
            this.f90980q = y3Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f90978o, this.f90979p, this.f90980q, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f90977n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            lq.b.g(this.f90978o, p1.p(this.f90979p.getScrimColor(), a.b(this.f90980q), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), false, null, 4, null);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.common.ui.ElementsBottomSheetLayoutKt$ElementsBottomSheetLayout$3$1", f = "ElementsBottomSheetLayout.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f90981n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ lq.b f90982o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(lq.b bVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f90982o = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new c(this.f90982o, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f90981n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            lq.b.c(this.f90982o, p1.INSTANCE.i(), false, false, null, 12, null);
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class d extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f90983c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.d f90984d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.a<h0> f90985e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p<l, Integer, h0> f90986f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f90987g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f90988h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(g gVar, androidx.compose.ui.d dVar, wn0.a<h0> aVar, p<? super l, ? super Integer, h0> pVar, int i11, int i12) {
            super(2);
            this.f90983c = gVar;
            this.f90984d = dVar;
            this.f90985e = aVar;
            this.f90986f = pVar;
            this.f90987g = i11;
            this.f90988h = i12;
        }

        public final void a(l lVar, int i11) {
            a.a(this.f90983c, this.f90984d, this.f90985e, this.f90986f, lVar, k2.a(this.f90987g | 1), this.f90988h);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0070  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0113  */
    /* JADX WARN: Code duplicated, block: B:64:0x011b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0153  */
    /* JADX WARN: Code duplicated, block: B:70:0x015c  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void a(g state, androidx.compose.ui.d dVar, wn0.a<h0> onDismissed, p<? super l, ? super Integer, h0> content, l lVar, int i11, int i12) {
        int i13;
        androidx.compose.ui.d dVar2;
        int i14;
        int i15;
        androidx.compose.ui.d dVar3;
        lq.b bVarE;
        StripeBottomSheetLayoutInfo stripeBottomSheetLayoutInfoA;
        float fS;
        boolean zN;
        Object objI;
        androidx.compose.ui.d dVar4;
        w2 w2VarX;
        s.k(state, "state");
        s.k(onDismissed, "onDismissed");
        s.k(content, "content");
        l lVarV = lVar.v(199491931);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (lVarV.n(state) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i16 = i12 & 2;
        if (i16 == 0) {
            if ((i11 & 112) == 0) {
                dVar2 = dVar;
                i13 |= lVarV.n(dVar2) ? 32 : 16;
            }
            if ((i12 & 4) != 0) {
                i13 |= KyberEngine.KyberPolyBytes;
            } else if ((i11 & 896) == 0) {
                if (lVarV.K(onDismissed)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i12 & 8) != 0) {
                i13 |= 3072;
            } else if ((i11 & 7168) == 0) {
                if (lVarV.K(content)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i13 & 5851) == 1170 || !lVarV.b()) {
                if (i16 != 0) {
                    dVar3 = androidx.compose.ui.d.INSTANCE;
                } else {
                    dVar3 = dVar2;
                }
                if (o.J()) {
                    o.S(199491931, i13, -1, "com.stripe.android.common.ui.ElementsBottomSheetLayout (ElementsBottomSheetLayout.kt:25)");
                }
                bVarE = lq.c.e(null, lVarV, 0, 1);
                stripeBottomSheetLayoutInfoA = e.a(BitmapDescriptorFactory.HUE_RED, 0L, 0L, lVarV, 0, 7);
                Function0.g(h0.f84049a, new C1935a(state, null), lVarV, 70);
                if (state.getModalBottomSheetState().g() == r1.Expanded) {
                    fS = p1.s(stripeBottomSheetLayoutInfoA.getScrimColor());
                } else {
                    fS = BitmapDescriptorFactory.HUE_RED;
                }
                y3<Float> y3VarD = p019p1.c.d(fS, j.l(0, 0, null, 7, null), BitmapDescriptorFactory.HUE_RED, "StatusBarColorAlpha", null, lVarV, 3120, 20);
                Function0.f(bVarE, Float.valueOf(b(y3VarD)), new b(bVarE, stripeBottomSheetLayoutInfoA, y3VarD, null), lVarV, 512);
                lVarV.H(-1310510618);
                zN = lVarV.n(bVarE);
                objI = lVarV.I();
                if (zN || objI == l.INSTANCE.a()) {
                    objI = new c(bVarE, null);
                    lVarV.B(objI);
                }
                lVarV.T();
                Function0.g(bVarE, (p) objI, lVarV, 64);
                int i17 = g.f83152e | (i13 & 14) | (StripeBottomSheetLayoutInfo.f83137d << 3);
                int i18 = i13 << 3;
                int i19 = i17 | (i18 & 896) | (i18 & 7168) | (i18 & 57344);
                dVar4 = dVar3;
                f.a(state, stripeBottomSheetLayoutInfoA, dVar4, onDismissed, content, lVarV, i19, 0);
                if (o.J()) {
                    o.R();
                }
            } else {
                lVarV.j();
                dVar4 = dVar2;
            }
            w2VarX = lVarV.x();
            if (w2VarX != null) {
                w2VarX.a(new d(state, dVar4, onDismissed, content, i11, i12));
            }
        }
        i13 |= 48;
        dVar2 = dVar;
        if ((i12 & 4) != 0) {
            i13 |= KyberEngine.KyberPolyBytes;
        } else if ((i11 & 896) == 0) {
            if (lVarV.K(onDismissed)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (lVarV.K(content)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i13 |= i15;
        }
        if ((i13 & 5851) == 1170) {
            if (i16 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(199491931, i13, -1, "com.stripe.android.common.ui.ElementsBottomSheetLayout (ElementsBottomSheetLayout.kt:25)");
            }
            bVarE = lq.c.e(null, lVarV, 0, 1);
            stripeBottomSheetLayoutInfoA = e.a(BitmapDescriptorFactory.HUE_RED, 0L, 0L, lVarV, 0, 7);
            Function0.g(h0.f84049a, new C1935a(state, null), lVarV, 70);
            if (state.getModalBottomSheetState().g() == r1.Expanded) {
                fS = p1.s(stripeBottomSheetLayoutInfoA.getScrimColor());
            } else {
                fS = BitmapDescriptorFactory.HUE_RED;
            }
            y3<Float> y3VarD2 = p019p1.c.d(fS, j.l(0, 0, null, 7, null), BitmapDescriptorFactory.HUE_RED, "StatusBarColorAlpha", null, lVarV, 3120, 20);
            Function0.f(bVarE, Float.valueOf(b(y3VarD2)), new b(bVarE, stripeBottomSheetLayoutInfoA, y3VarD2, null), lVarV, 512);
            lVarV.H(-1310510618);
            zN = lVarV.n(bVarE);
            objI = lVarV.I();
            if (zN) {
                objI = new c(bVarE, null);
                lVarV.B(objI);
            } else {
                objI = new c(bVarE, null);
                lVarV.B(objI);
            }
            lVarV.T();
            Function0.g(bVarE, (p) objI, lVarV, 64);
            int i110 = g.f83152e | (i13 & 14) | (StripeBottomSheetLayoutInfo.f83137d << 3);
            int i111 = i13 << 3;
            int i112 = i110 | (i111 & 896) | (i111 & 7168) | (i111 & 57344);
            dVar4 = dVar3;
            f.a(state, stripeBottomSheetLayoutInfoA, dVar4, onDismissed, content, lVarV, i112, 0);
            if (o.J()) {
                o.R();
            }
        } else {
            if (i16 != 0) {
                dVar3 = androidx.compose.ui.d.INSTANCE;
            } else {
                dVar3 = dVar2;
            }
            if (o.J()) {
                o.S(199491931, i13, -1, "com.stripe.android.common.ui.ElementsBottomSheetLayout (ElementsBottomSheetLayout.kt:25)");
            }
            bVarE = lq.c.e(null, lVarV, 0, 1);
            stripeBottomSheetLayoutInfoA = e.a(BitmapDescriptorFactory.HUE_RED, 0L, 0L, lVarV, 0, 7);
            Function0.g(h0.f84049a, new C1935a(state, null), lVarV, 70);
            if (state.getModalBottomSheetState().g() == r1.Expanded) {
                fS = p1.s(stripeBottomSheetLayoutInfoA.getScrimColor());
            } else {
                fS = BitmapDescriptorFactory.HUE_RED;
            }
            y3<Float> y3VarD3 = p019p1.c.d(fS, j.l(0, 0, null, 7, null), BitmapDescriptorFactory.HUE_RED, "StatusBarColorAlpha", null, lVarV, 3120, 20);
            Function0.f(bVarE, Float.valueOf(b(y3VarD3)), new b(bVarE, stripeBottomSheetLayoutInfoA, y3VarD3, null), lVarV, 512);
            lVarV.H(-1310510618);
            zN = lVarV.n(bVarE);
            objI = lVarV.I();
            if (zN) {
                objI = new c(bVarE, null);
                lVarV.B(objI);
            } else {
                objI = new c(bVarE, null);
                lVarV.B(objI);
            }
            lVarV.T();
            Function0.g(bVarE, (p) objI, lVarV, 64);
            int i113 = g.f83152e | (i13 & 14) | (StripeBottomSheetLayoutInfo.f83137d << 3);
            int i114 = i13 << 3;
            int i115 = i113 | (i114 & 896) | (i114 & 7168) | (i114 & 57344);
            dVar4 = dVar3;
            f.a(state, stripeBottomSheetLayoutInfoA, dVar4, onDismissed, content, lVarV, i115, 0);
            if (o.J()) {
                o.R();
            }
        }
        w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new d(state, dVar4, onDismissed, content, i11, i12));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(y3<Float> y3Var) {
        return y3Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e() {
        return false;
    }
}
