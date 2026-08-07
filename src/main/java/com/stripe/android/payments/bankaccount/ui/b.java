package com.stripe.android.payments.bankaccount.ui;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.s0;
import androidx.p003lifecycle.v0;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponseInternal;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u0000 F2\u00020\u0001:\u0002GHBG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J%\u0010%\u001a\u00020\u00132\u0014\u0010$\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020#0!H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b'\u0010\u001dJ\u0018\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020/¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00102R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00103R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00109R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050<8\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b6\u0010?R$\u0010E\u001a\u00020A2\u0006\u0010B\u001a\u00020A8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b4\u0010C\"\u0004\b:\u0010D¨\u0006I"}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/b;", "Landroidx/lifecycle/c1;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "args", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/payments/bankaccount/ui/a;", "_viewEffect", "Ld70/b;", "createFinancialConnectionsSession", "Ld70/a;", "attachFinancialConnectionsSession", "Ld70/c;", "retrieveStripeIntent", "Landroidx/lifecycle/s0;", "savedStateHandle", "Lo30/d;", "logger", "<init>", "(Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;Lkotlinx/coroutines/flow/MutableSharedFlow;Ld70/b;Ld70/a;Ld70/c;Landroidx/lifecycle/s0;Lo30/d;)V", "Ljn0/h0;", "o", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/payments/bankaccount/navigation/e;", "result", "s", "(Lcom/stripe/android/payments/bankaccount/navigation/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "financialConnectionsSession", "t", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V", "Lcom/stripe/android/financialconnections/launcher/f$b;", "q", "(Lcom/stripe/android/financialconnections/launcher/f$b;)V", "Lkotlin/Function1;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/c;", "action", "r", "(Lwn0/l;)V", "n", "", "throwable", "p", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Li40/e;", "w", "(Li40/e;)V", "Lcom/stripe/android/financialconnections/launcher/f;", "x", "(Lcom/stripe/android/financialconnections/launcher/f;)V", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "u", "Ld70/b;", "v", "Ld70/a;", "Ld70/c;", "Landroidx/lifecycle/s0;", "y", "Lo30/d;", "Lkotlinx/coroutines/flow/SharedFlow;", "z", "Lkotlinx/coroutines/flow/SharedFlow;", "()Lkotlinx/coroutines/flow/SharedFlow;", "viewEffect", "", "value", "()Z", "(Z)V", "hasLaunched", "A", "b", "c", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class b extends c1 {
    public static final int B = 8;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final CollectBankAccountContract.a args;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final MutableSharedFlow<com.stripe.android.payments.bankaccount.ui.a> _viewEffect;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final d70.b createFinancialConnectionsSession;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final d70.a attachFinancialConnectionsSession;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final d70.c retrieveStripeIntent;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final s0 savedStateHandle;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final o30.d logger;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final SharedFlow<com.stripe.android.payments.bankaccount.ui.a> viewEffect;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$1", f = "CollectBankAccountViewModel.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52046n;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52046n;
            if (i11 == 0) {
                t.b(obj);
                b bVar = b.this;
                this.f52046n = 1;
                if (bVar.o(this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/b$c;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lkotlin/Function0;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "argsSupplier", "<init>", "(Lwn0/a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Lwn0/a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final wn0.a<CollectBankAccountContract.a> argsSupplier;

        /* JADX WARN: Multi-variable type inference failed */
        public c(wn0.a<? extends CollectBankAccountContract.a> argsSupplier) {
            s.k(argsSupplier, "argsSupplier");
            this.argsSupplier = argsSupplier;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
            s.k(modelClass, "modelClass");
            s.k(extras, "extras");
            b bVarA = c70.g.a().b(v0.a(extras)).a(z30.b.a(extras)).d(SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null)).c(this.argsSupplier.invoke()).build().a();
            s.i(bVarA, "null cannot be cast to non-null type T of com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel.Factory.create");
            return bVarA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$attachSessionToIntent$1", f = "CollectBankAccountViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_SUBTRACT_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52049n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f52050o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSession f52052q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FinancialConnectionsSession financialConnectionsSession, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f52052q = financialConnectionsSession;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new d(this.f52052q, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:43:0x0116  */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x011e, code lost:
        
            if (r13.p(r3, r12) == r1) goto L45;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 307
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel", f = "CollectBankAccountViewModel.kt", i = {0, 1, 2, 3, 4}, l = {66, 78, 90, 99, 113, 122}, m = "createFinancialConnectionsSession", n = {"this", "this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52053n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f52054o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f52055p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f52057r;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f52055p = obj;
            this.f52057r |= Integer.MIN_VALUE;
            return b.this.o(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/payments/bankaccount/navigation/c;", "a", "(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/payments/bankaccount/navigation/c;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements l<StripeIntent, CollectBankAccountResponseInternal> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.financialconnections.launcher.f.Completed f52058c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.stripe.android.financialconnections.launcher.f.Completed completed) {
            super(1);
            this.f52058c = completed;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CollectBankAccountResponseInternal invoke(StripeIntent stripeIntent) {
            return new CollectBankAccountResponseInternal(stripeIntent, null, new CollectBankAccountResponseInternal.InstantDebitsData(this.f52058c.getPaymentMethodId(), this.f52058c.getLast4(), this.f52058c.getBankName()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$finishWithRefreshedIntent$1", f = "CollectBankAccountViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, EnumC4419g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC4419g.SDK_ASSET_ICON_INCOMPLETE_VALUE}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f52059n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f52060o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ l<StripeIntent, CollectBankAccountResponseInternal> f52062q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(l<? super StripeIntent, CollectBankAccountResponseInternal> lVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f52062q = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return b.this.new g(this.f52062q, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x007a  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0090, code lost:
        
            if (r3.s(r4, r6) == r0) goto L28;
         */
        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r6.f52060o
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                jn0.t.b(r7)
                goto L93
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r1 = r6.f52059n
                jn0.t.b(r7)
                goto L70
            L24:
                jn0.t.b(r7)
                jn0.s r7 = (jn0.s) r7
                java.lang.Object r7 = r7.getValue()
            L2d:
                r1 = r7
                goto L5d
            L2f:
                jn0.t.b(r7)
                com.stripe.android.payments.bankaccount.ui.b r7 = com.stripe.android.payments.bankaccount.ui.b.this
                com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a r7 = com.stripe.android.payments.bankaccount.ui.b.j(r7)
                java.lang.String r7 = r7.getClientSecret()
                if (r7 != 0) goto L44
                r7 = 0
                java.lang.Object r7 = jn0.s.b(r7)
                goto L2d
            L44:
                com.stripe.android.payments.bankaccount.ui.b r1 = com.stripe.android.payments.bankaccount.ui.b.this
                d70.c r1 = com.stripe.android.payments.bankaccount.ui.b.m(r1)
                com.stripe.android.payments.bankaccount.ui.b r5 = com.stripe.android.payments.bankaccount.ui.b.this
                com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a r5 = com.stripe.android.payments.bankaccount.ui.b.j(r5)
                java.lang.String r5 = r5.getPublishableKey()
                r6.f52060o = r4
                java.lang.Object r7 = r1.a(r5, r7, r6)
                if (r7 != r0) goto L2d
                goto L92
            L5d:
                com.stripe.android.payments.bankaccount.ui.b r7 = com.stripe.android.payments.bankaccount.ui.b.this
                java.lang.Throwable r4 = jn0.s.e(r1)
                if (r4 == 0) goto L70
                r6.f52059n = r1
                r6.f52060o = r3
                java.lang.Object r7 = com.stripe.android.payments.bankaccount.ui.b.f(r7, r4, r6)
                if (r7 != r0) goto L70
                goto L92
            L70:
                wn0.l<com.stripe.android.model.StripeIntent, com.stripe.android.payments.bankaccount.navigation.c> r7 = r6.f52062q
                com.stripe.android.payments.bankaccount.ui.b r3 = com.stripe.android.payments.bankaccount.ui.b.this
                boolean r4 = jn0.s.h(r1)
                if (r4 == 0) goto L93
                r4 = r1
                com.stripe.android.model.StripeIntent r4 = (com.stripe.android.model.StripeIntent) r4
                java.lang.Object r7 = r7.invoke(r4)
                com.stripe.android.payments.bankaccount.navigation.c r7 = (com.stripe.android.payments.bankaccount.navigation.CollectBankAccountResponseInternal) r7
                com.stripe.android.payments.bankaccount.navigation.e$b r4 = new com.stripe.android.payments.bankaccount.navigation.e$b
                r4.<init>(r7)
                r6.f52059n = r1
                r6.f52060o = r2
                java.lang.Object r7 = com.stripe.android.payments.bankaccount.ui.b.h(r3, r4, r6)
                if (r7 != r0) goto L93
            L92:
                return r0
            L93:
                jn0.h0 r7 = jn0.h0.f84049a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/model/StripeIntent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/payments/bankaccount/navigation/c;", "a", "(Lcom/stripe/android/model/StripeIntent;)Lcom/stripe/android/payments/bankaccount/navigation/c;"}, k = 3, mv = {1, 9, 0})
    static final class h extends u implements l<StripeIntent, CollectBankAccountResponseInternal> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FinancialConnectionsSession f52063c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(FinancialConnectionsSession financialConnectionsSession) {
            super(1);
            this.f52063c = financialConnectionsSession;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CollectBankAccountResponseInternal invoke(StripeIntent stripeIntent) {
            return new CollectBankAccountResponseInternal(stripeIntent, new CollectBankAccountResponseInternal.USBankAccountData(this.f52063c), null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsForACHResult$1", f = "CollectBankAccountViewModel.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 131}, m = "invokeSuspend", n = {}, s = {})
    static final class i extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52064n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ i40.e f52065o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b f52066p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(i40.e eVar, b bVar, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f52065o = eVar;
            this.f52066p = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new i(this.f52065o, this.f52066p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (r5.s(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            if (r1.p(r5, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            return r0;
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
                int r1 = r4.f52064n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                jn0.t.b(r5)
                goto L71
            L1b:
                jn0.t.b(r5)
                i40.e r5 = r4.f52065o
                boolean r1 = r5 instanceof i40.e.a
                if (r1 == 0) goto L31
                com.stripe.android.payments.bankaccount.ui.b r5 = r4.f52066p
                com.stripe.android.payments.bankaccount.navigation.e$a r1 = com.stripe.android.payments.bankaccount.navigation.e.a.f52016b
                r4.f52064n = r3
                java.lang.Object r5 = com.stripe.android.payments.bankaccount.ui.b.h(r5, r1, r4)
                if (r5 != r0) goto L71
                goto L45
            L31:
                boolean r1 = r5 instanceof i40.e.Failed
                if (r1 == 0) goto L46
                com.stripe.android.payments.bankaccount.ui.b r1 = r4.f52066p
                i40.e$c r5 = (i40.e.Failed) r5
                java.lang.Throwable r5 = r5.getError()
                r4.f52064n = r2
                java.lang.Object r5 = com.stripe.android.payments.bankaccount.ui.b.f(r1, r5, r4)
                if (r5 != r0) goto L71
            L45:
                return r0
            L46:
                boolean r5 = r5 instanceof i40.e.Completed
                if (r5 == 0) goto L71
                com.stripe.android.payments.bankaccount.ui.b r5 = r4.f52066p
                com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract$a r5 = com.stripe.android.payments.bankaccount.ui.b.j(r5)
                boolean r5 = r5.getAttachToIntent()
                if (r5 == 0) goto L64
                com.stripe.android.payments.bankaccount.ui.b r5 = r4.f52066p
                i40.e r0 = r4.f52065o
                i40.e$b r0 = (i40.e.Completed) r0
                com.stripe.android.financialconnections.model.FinancialConnectionsSession r0 = r0.getFinancialConnectionsSession()
                com.stripe.android.payments.bankaccount.ui.b.a(r5, r0)
                goto L71
            L64:
                com.stripe.android.payments.bankaccount.ui.b r5 = r4.f52066p
                i40.e r0 = r4.f52065o
                i40.e$b r0 = (i40.e.Completed) r0
                com.stripe.android.financialconnections.model.FinancialConnectionsSession r0 = r0.getFinancialConnectionsSession()
                com.stripe.android.payments.bankaccount.ui.b.i(r5, r0)
            L71:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((i) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewModel$onConnectionsForInstantDebitsResult$1", f = "CollectBankAccountViewModel.kt", i = {}, l = {146, 149}, m = "invokeSuspend", n = {}, s = {})
    static final class j extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52067n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.financialconnections.launcher.f f52068o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ b f52069p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(com.stripe.android.financialconnections.launcher.f fVar, b bVar, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f52068o = fVar;
            this.f52069p = bVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new j(this.f52068o, this.f52069p, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
        
            if (r5.s(r1, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        
            if (r1.p(r5, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
        
            return r0;
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
                int r1 = r4.f52067n
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                jn0.t.b(r5)
                goto L51
            L1b:
                jn0.t.b(r5)
                com.stripe.android.financialconnections.launcher.f r5 = r4.f52068o
                boolean r1 = r5 instanceof com.stripe.android.financialconnections.launcher.f.a
                if (r1 == 0) goto L31
                com.stripe.android.payments.bankaccount.ui.b r5 = r4.f52069p
                com.stripe.android.payments.bankaccount.navigation.e$a r1 = com.stripe.android.payments.bankaccount.navigation.e.a.f52016b
                r4.f52067n = r3
                java.lang.Object r5 = com.stripe.android.payments.bankaccount.ui.b.h(r5, r1, r4)
                if (r5 != r0) goto L51
                goto L45
            L31:
                boolean r1 = r5 instanceof com.stripe.android.financialconnections.launcher.f.Failed
                if (r1 == 0) goto L46
                com.stripe.android.payments.bankaccount.ui.b r1 = r4.f52069p
                com.stripe.android.financialconnections.launcher.f$c r5 = (com.stripe.android.financialconnections.launcher.f.Failed) r5
                java.lang.Throwable r5 = r5.getError()
                r4.f52067n = r2
                java.lang.Object r5 = com.stripe.android.payments.bankaccount.ui.b.f(r1, r5, r4)
                if (r5 != r0) goto L51
            L45:
                return r0
            L46:
                boolean r0 = r5 instanceof com.stripe.android.financialconnections.launcher.f.Completed
                if (r0 == 0) goto L51
                com.stripe.android.payments.bankaccount.ui.b r0 = r4.f52069p
                com.stripe.android.financialconnections.launcher.f$b r5 = (com.stripe.android.financialconnections.launcher.f.Completed) r5
                com.stripe.android.payments.bankaccount.ui.b.g(r0, r5)
            L51:
                jn0.h0 r5 = jn0.h0.f84049a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public b(CollectBankAccountContract.a args, MutableSharedFlow<com.stripe.android.payments.bankaccount.ui.a> _viewEffect, d70.b createFinancialConnectionsSession, d70.a attachFinancialConnectionsSession, d70.c retrieveStripeIntent, s0 savedStateHandle, o30.d logger) {
        s.k(args, "args");
        s.k(_viewEffect, "_viewEffect");
        s.k(createFinancialConnectionsSession, "createFinancialConnectionsSession");
        s.k(attachFinancialConnectionsSession, "attachFinancialConnectionsSession");
        s.k(retrieveStripeIntent, "retrieveStripeIntent");
        s.k(savedStateHandle, "savedStateHandle");
        s.k(logger, "logger");
        this.args = args;
        this._viewEffect = _viewEffect;
        this.createFinancialConnectionsSession = createFinancialConnectionsSession;
        this.attachFinancialConnectionsSession = attachFinancialConnectionsSession;
        this.retrieveStripeIntent = retrieveStripeIntent;
        this.savedStateHandle = savedStateHandle;
        this.logger = logger;
        this.viewEffect = _viewEffect;
        if (u()) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(FinancialConnectionsSession financialConnectionsSession) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new d(financialConnectionsSession, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009a, code lost:
    
        if (r14 == r11) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:
    
        r7 = r7;
        r7 = r7;
        r0 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00de, code lost:
    
        if (r14 == r11) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        if (r14 == r11) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0140, code lost:
    
        if (r14 == r11) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01d4, code lost:
    
        if (r1.p(r14, r7) == r11) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(p013kotlin.coroutines.Continuation<? super jn0.h0> r14) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.payments.bankaccount.ui.b.o(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object p(Throwable th2, Continuation<? super h0> continuation) {
        this.logger.error("Error", new Exception(th2));
        Object objS = s(new com.stripe.android.payments.bankaccount.navigation.e.Failed(th2), continuation);
        return objS == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objS : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(com.stripe.android.financialconnections.launcher.f.Completed result) {
        r(new f(result));
    }

    private final void r(l<? super StripeIntent, CollectBankAccountResponseInternal> action) {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new g(action, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(com.stripe.android.payments.bankaccount.navigation.e eVar, Continuation<? super h0> continuation) {
        Object objEmit = this._viewEffect.emit(new com.stripe.android.payments.bankaccount.ui.a.FinishWithResult(eVar), continuation);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(FinancialConnectionsSession financialConnectionsSession) {
        r(new h(financialConnectionsSession));
    }

    private final boolean u() {
        return s.f(this.savedStateHandle.f("key_has_launched"), Boolean.TRUE);
    }

    private final void y(boolean z11) {
        this.savedStateHandle.n("key_has_launched", Boolean.valueOf(z11));
    }

    public final SharedFlow<com.stripe.android.payments.bankaccount.ui.a> v() {
        return this.viewEffect;
    }

    public final void w(i40.e result) {
        s.k(result, "result");
        y(false);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new i(result, this, null), 3, null);
    }

    public final void x(com.stripe.android.financialconnections.launcher.f result) {
        s.k(result, "result");
        y(false);
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new j(result, this, null), 3, null);
    }
}
