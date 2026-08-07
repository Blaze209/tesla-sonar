package com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import c80.Args;
import c80.CvcRecollectionViewState;
import c80.CvcState;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;
import z80.q0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\nJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001e0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00190(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/e;", "Landroidx/lifecycle/c1;", "Lc80/a;", "args", "<init>", "(Lc80/a;)V", "", "cvc", "Ljn0/h0;", "j", "(Ljava/lang/String;)V", IntegerTokenConverter.CONVERTER_KEY, "()V", "k", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/d;", "action", "h", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/d;)V", "Lz80/q0;", "s", "Lz80/q0;", "getController", "()Lz80/q0;", "controller", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lc80/g;", "t", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_viewState", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/b;", "u", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_result", "Lkotlinx/coroutines/flow/SharedFlow;", "v", "Lkotlinx/coroutines/flow/SharedFlow;", "f", "()Lkotlinx/coroutines/flow/SharedFlow;", "result", "Lkotlinx/coroutines/flow/StateFlow;", "g", "()Lkotlinx/coroutines/flow/StateFlow;", "viewState", "a", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e extends c1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final q0 controller;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<CvcRecollectionViewState> _viewState;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final MutableSharedFlow<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b> _result;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final SharedFlow<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b> result;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/e$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract$a;", "args", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract$a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Lcom/stripe/android/paymentsheet/paymentdatacollection/cvcrecollection/CvcRecollectionContract$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final CvcRecollectionContract.Args args;

        public a(CvcRecollectionContract.Args args) {
            s.k(args, "args");
            this.args = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
            s.k(modelClass, "modelClass");
            s.k(extras, "extras");
            return new e(new Args(this.args.getLastFour(), this.args.getCardBrand(), "", this.args.getIsTestMode()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionViewModel$onBackPress$1", f = "CvcRecollectionViewModel.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53407n;

        b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new b(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53407n;
            if (i11 == 0) {
                t.b(obj);
                MutableSharedFlow mutableSharedFlow = e.this._result;
                com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.a aVar = com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.a.f53355a;
                this.f53407n = 1;
                if (mutableSharedFlow.emit(aVar, this) == coroutine_suspended) {
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
            return ((b) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.CvcRecollectionViewModel$onConfirmPress$1", f = "CvcRecollectionViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53409n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f53411p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f53411p = str;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new c(this.f53411p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53409n;
            if (i11 == 0) {
                t.b(obj);
                MutableSharedFlow mutableSharedFlow = e.this._result;
                com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.Confirmed confirmed = new com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b.Confirmed(this.f53411p);
                this.f53409n = 1;
                if (mutableSharedFlow.emit(confirmed, this) == coroutine_suspended) {
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
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public e(Args args) {
        s.k(args, "args");
        this.controller = new q0(null, r90.g.n(args.getCardBrand()), null, false, 13, null);
        this._viewState = StateFlowKt.MutableStateFlow(new CvcRecollectionViewState(args.getLastFour(), args.getIsTestMode(), new CvcState(args.getCvc(), args.getCardBrand()), true));
        MutableSharedFlow<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._result = mutableSharedFlowMutableSharedFlow$default;
        this.result = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
    }

    private final void i() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new b(null), 3, null);
    }

    private final void j(String cvc) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new c(cvc, null), 3, null);
    }

    private final void k(String cvc) {
        CvcRecollectionViewState value;
        CvcRecollectionViewState cvcRecollectionViewState;
        MutableStateFlow<CvcRecollectionViewState> mutableStateFlow = this._viewState;
        do {
            value = mutableStateFlow.getValue();
            cvcRecollectionViewState = value;
        } while (!mutableStateFlow.compareAndSet(value, CvcRecollectionViewState.b(cvcRecollectionViewState, null, false, cvcRecollectionViewState.getCvcState().f(cvc), false, 11, null)));
    }

    public final SharedFlow<com.stripe.android.paymentsheet.paymentdatacollection.cvcrecollection.b> f() {
        return this.result;
    }

    public final StateFlow<CvcRecollectionViewState> g() {
        return this._viewState;
    }

    public final void h(d action) {
        s.k(action, "action");
        if (action instanceof d.b) {
            j(g().getValue().getCvcState().getCvc());
        } else if (action instanceof d.a) {
            i();
        } else if (action instanceof d.OnCvcChanged) {
            k(((d.OnCvcChanged) action).getCvc());
        }
    }
}
