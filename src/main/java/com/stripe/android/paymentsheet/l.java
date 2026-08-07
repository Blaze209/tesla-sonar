package com.stripe.android.paymentsheet;

import androidx.p003lifecycle.d1;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.SetupIntent;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import u60.PaymentMethodMetadata;
import w70.MandateText;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 #2\u00020\u0001:\u0001\u0017B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u001f\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\u001b\u0010\"¨\u0006$"}, d2 = {"Lcom/stripe/android/paymentsheet/l;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Lkotlinx/coroutines/flow/StateFlow;", "Lw70/j;", "selection", "", "merchantDisplayName", "", "isVerticalMode", "Lkotlin/Function0;", "isSetupFlowProvider", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/StateFlow;Ljava/lang/String;ZLwn0/a;)V", "Lx30/c;", "mandateText", "showAbove", "Ljn0/h0;", "e", "(Lx30/c;Z)V", "a", "Lkotlinx/coroutines/flow/StateFlow;", "b", "Ljava/lang/String;", "c", "Z", DateTokenConverter.CONVERTER_KEY, "Lwn0/a;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lw70/e;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_mandateText", "f", "()Lkotlinx/coroutines/flow/StateFlow;", "g", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f53190h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<w70.j> selection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String merchantDisplayName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isVerticalMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final wn0.a<Boolean> isSetupFlowProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<MandateText> _mandateText;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<MandateText> mandateText;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.MandateHandler$1", f = "MandateHandler.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53197n;

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.l$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lw70/j;", "selection", "Ljn0/h0;", "a", "(Lw70/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C1012a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ l f53199a;

            C1012a(l lVar) {
                this.f53199a = lVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(w70.j jVar, Continuation<? super h0> continuation) {
                x30.c cVarC = jVar != null ? jVar.c(this.f53199a.merchantDisplayName, ((Boolean) this.f53199a.isSetupFlowProvider.invoke()).booleanValue()) : null;
                w70.j.Saved saved = jVar instanceof w70.j.Saved ? (w70.j.Saved) jVar : null;
                boolean z11 = false;
                if (saved != null && saved.h()) {
                    z11 = true;
                }
                this.f53199a.e(cVarC, z11);
                return h0.f84049a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return l.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53197n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow stateFlow = l.this.selection;
                C1012a c1012a = new C1012a(l.this);
                this.f53197n = 1;
                if (stateFlow.collect(c1012a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.l$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/paymentsheet/l$b;", "", "<init>", "()V", "Lk80/a;", "viewModel", "Lcom/stripe/android/paymentsheet/l;", "a", "(Lk80/a;)Lcom/stripe/android/paymentsheet/l;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.stripe.android.paymentsheet.l$b$a */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<Boolean> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ k80.a f53200c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k80.a aVar) {
                super(0);
                this.f53200c = aVar;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                PaymentMethodMetadata value = this.f53200c.x().getValue();
                return Boolean.valueOf((value != null ? value.getStripeIntent() : null) instanceof SetupIntent);
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final l a(k80.a viewModel) {
            p013kotlin.jvm.internal.s.k(viewModel, "viewModel");
            return new l(d1.a(viewModel), viewModel.C(), viewModel.getConfig().getMerchantDisplayName(), viewModel.getConfig().getPaymentMethodLayout() != y.o.Horizontal, new a(viewModel));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(CoroutineScope coroutineScope, StateFlow<? extends w70.j> selection, String merchantDisplayName, boolean z11, wn0.a<Boolean> isSetupFlowProvider) {
        p013kotlin.jvm.internal.s.k(coroutineScope, "coroutineScope");
        p013kotlin.jvm.internal.s.k(selection, "selection");
        p013kotlin.jvm.internal.s.k(merchantDisplayName, "merchantDisplayName");
        p013kotlin.jvm.internal.s.k(isSetupFlowProvider, "isSetupFlowProvider");
        this.selection = selection;
        this.merchantDisplayName = merchantDisplayName;
        this.isVerticalMode = z11;
        this.isSetupFlowProvider = isSetupFlowProvider;
        MutableStateFlow<MandateText> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._mandateText = MutableStateFlow;
        this.mandateText = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(null), 3, null);
    }

    public final StateFlow<MandateText> d() {
        return this.mandateText;
    }

    public final void e(x30.c mandateText, boolean showAbove) {
        MandateText mandateText2;
        MutableStateFlow<MandateText> mutableStateFlow = this._mandateText;
        if (mandateText != null) {
            mandateText2 = new MandateText(mandateText, showAbove || this.isVerticalMode);
        } else {
            mandateText2 = null;
        }
        mutableStateFlow.setValue(mandateText2);
    }
}
