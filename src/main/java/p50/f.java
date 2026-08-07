package p50;

import jn0.h0;
import jn0.t;
import ka.j;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p009i2.q1;
import p011ja.k;
import p011ja.r;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k2;
import p020r2.n3;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import v1.i;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aU\u0010\u000b\u001a\u00020\b*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u0007H\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f²\u0006\u0018\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00078\nX\u008a\u0084\u0002²\u0006\u0018\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\b0\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lv1/i;", "Lja/k;", "backStackEntry", "Li2/q1;", "sheetState", "La3/d;", "saveableStateHolder", "Lkotlin/Function1;", "Ljn0/h0;", "onSheetShown", "onSheetDismissed", "a", "(Lv1/i;Lja/k;Li2/q1;La3/d;Lwn0/l;Lwn0/l;Lr2/l;I)V", "currentOnSheetShown", "currentOnSheetDismissed", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.financialconnections.navigation.bottomsheet.SheetContentHostKt$SheetContentHost$1", f = "SheetContentHost.kt", i = {}, l = {63}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f101144n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ q1 f101145o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ k f101146p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ y3<l<k, h0>> f101147q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ y3<l<k, h0>> f101148r;

        /* JADX INFO: renamed from: p50.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class C2147a extends u implements wn0.a<Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ q1 f101149c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2147a(q1 q1Var) {
                super(0);
                this.f101149c = q1Var;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(this.f101149c.k());
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "visible", "Ljn0/h0;", "a", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class b<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ k f101150a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y3<l<k, h0>> f101151b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ y3<l<k, h0>> f101152c;

            /* JADX WARN: Multi-variable type inference failed */
            b(k kVar, y3<? extends l<? super k, h0>> y3Var, y3<? extends l<? super k, h0>> y3Var2) {
                this.f101150a = kVar;
                this.f101151b = y3Var;
                this.f101152c = y3Var2;
            }

            public final Object a(boolean z11, Continuation<? super h0> continuation) {
                if (z11) {
                    f.b(this.f101151b).invoke(this.f101150a);
                } else {
                    f.c(this.f101152c).invoke(this.f101150a);
                }
                return h0.f84049a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return a(((Boolean) obj).booleanValue(), continuation);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(q1 q1Var, k kVar, y3<? extends l<? super k, h0>> y3Var, y3<? extends l<? super k, h0>> y3Var2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f101145o = q1Var;
            this.f101146p = kVar;
            this.f101147q = y3Var;
            this.f101148r = y3Var2;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f101145o, this.f101146p, this.f101147q, this.f101148r, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f101144n;
            if (i11 == 0) {
                t.b(obj);
                Flow flowDrop = FlowKt.drop(FlowKt.distinctUntilChanged(n3.p(new C2147a(this.f101145o))), 1);
                b bVar = new b(this.f101146p, this.f101147q, this.f101148r);
                this.f101144n = 1;
                if (flowDrop.collect(bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljn0/h0;", "a", "(Lr2/l;I)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f101153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ i f101154d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(k kVar, i iVar) {
            super(2);
            this.f101153c = kVar;
            this.f101154d = iVar;
        }

        public final void a(p020r2.l lVar, int i11) {
            if ((i11 & 11) == 2 && lVar.b()) {
                lVar.j();
                return;
            }
            if (o.J()) {
                o.S(1012492116, i11, -1, "com.stripe.android.financialconnections.navigation.bottomsheet.SheetContentHost.<anonymous> (SheetContentHost.kt:71)");
            }
            r destination = this.f101153c.getDestination();
            s.i(destination, "null cannot be cast to non-null type com.stripe.android.financialconnections.navigation.bottomsheet.BottomSheetNavigator.Destination");
            ((p50.b.a) destination).A().invoke(this.f101154d, this.f101153c, lVar, 64);
            if (o.J()) {
                o.R();
            }
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements p<p020r2.l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ i f101155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k f101156d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q1 f101157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ a3.d f101158f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ l<k, h0> f101159g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l<k, h0> f101160h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f101161i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(i iVar, k kVar, q1 q1Var, a3.d dVar, l<? super k, h0> lVar, l<? super k, h0> lVar2, int i11) {
            super(2);
            this.f101155c = iVar;
            this.f101156d = kVar;
            this.f101157e = q1Var;
            this.f101158f = dVar;
            this.f101159g = lVar;
            this.f101160h = lVar2;
            this.f101161i = i11;
        }

        public final void a(p020r2.l lVar, int i11) {
            f.a(this.f101155c, this.f101156d, this.f101157e, this.f101158f, this.f101159g, this.f101160h, lVar, k2.a(this.f101161i | 1));
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(p020r2.l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(i iVar, k kVar, q1 sheetState, a3.d saveableStateHolder, l<? super k, h0> onSheetShown, l<? super k, h0> onSheetDismissed, p020r2.l lVar, int i11) {
        s.k(iVar, "<this>");
        s.k(sheetState, "sheetState");
        s.k(saveableStateHolder, "saveableStateHolder");
        s.k(onSheetShown, "onSheetShown");
        s.k(onSheetDismissed, "onSheetDismissed");
        p020r2.l lVarV = lVar.v(1038184713);
        if (o.J()) {
            o.S(1038184713, i11, -1, "com.stripe.android.financialconnections.navigation.bottomsheet.SheetContentHost (SheetContentHost.kt:52)");
        }
        if (kVar != null) {
            Function0.f(sheetState, kVar, new a(sheetState, kVar, n3.o(onSheetShown, lVarV, (i11 >> 12) & 14), n3.o(onSheetDismissed, lVarV, (i11 >> 15) & 14), null), lVarV, q1.f74975e | 576 | ((i11 >> 6) & 14));
            j.a(kVar, saveableStateHolder, z2.c.b(lVarV, 1012492116, true, new b(kVar, iVar)), lVarV, 456);
        }
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(iVar, kVar, sheetState, saveableStateHolder, onSheetShown, onSheetDismissed, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l<k, h0> b(y3<? extends l<? super k, h0>> y3Var) {
        return (l) y3Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l<k, h0> c(y3<? extends l<? super k, h0>> y3Var) {
        return (l) y3Var.getValue();
    }
}
