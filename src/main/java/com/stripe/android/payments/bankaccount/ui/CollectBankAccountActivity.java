package com.stripe.android.payments.bankaccount.ui;

import android.content.Intent;
import android.os.Bundle;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.ViewModelStore;
import androidx.p003lifecycle.e1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import androidx.p003lifecycle.x;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import jn0.h0;
import jn0.m;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.o0;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\u0006*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0015\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/CollectBankAccountActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Lb70/a;", "configuration", "Ljn0/h0;", "t", "(Lb70/a;)V", "Lcom/stripe/android/payments/bankaccount/ui/a$b;", "v", "(Lcom/stripe/android/payments/bankaccount/ui/a$b;)V", "Lcom/stripe/android/payments/bankaccount/ui/a$a;", "u", "(Lcom/stripe/android/payments/bankaccount/ui/a$a;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "f", "Lkotlin/Lazy;", "r", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "starterArgs", "Ll70/c;", "g", "Ll70/c;", "financialConnectionsPaymentsProxy", "Lcom/stripe/android/payments/bankaccount/ui/b;", "h", "s", "()Lcom/stripe/android/payments/bankaccount/ui/b;", "viewModel", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CollectBankAccountActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private l70.c financialConnectionsPaymentsProxy;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Lazy starterArgs = m.b(new f());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel = new e1(o0.b(com.stripe.android.payments.bankaccount.ui.b.class), new d(this), new g(), new e(null, this));

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a extends p implements l<com.stripe.android.financialconnections.launcher.f, h0> {
        a(Object obj) {
            super(1, obj, com.stripe.android.payments.bankaccount.ui.b.class, "onConnectionsForInstantDebitsResult", "onConnectionsForInstantDebitsResult(Lcom/stripe/android/financialconnections/launcher/FinancialConnectionsSheetInstantDebitsResult;)V", 0);
        }

        public final void a(com.stripe.android.financialconnections.launcher.f p11) {
            s.k(p11, "p0");
            ((com.stripe.android.payments.bankaccount.ui.b) this.receiver).x(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(com.stripe.android.financialconnections.launcher.f fVar) {
            a(fVar);
            return h0.f84049a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class b extends p implements l<i40.e, h0> {
        b(Object obj) {
            super(1, obj, com.stripe.android.payments.bankaccount.ui.b.class, "onConnectionsForACHResult", "onConnectionsForACHResult(Lcom/stripe/android/financialconnections/FinancialConnectionsSheetResult;)V", 0);
        }

        public final void a(i40.e p11) {
            s.k(p11, "p0");
            ((com.stripe.android.payments.bankaccount.ui.b) this.receiver).w(p11);
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ h0 invoke(i40.e eVar) {
            a(eVar);
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$onCreate$1", f = "CollectBankAccountActivity.kt", i = {}, l = {43}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f52023n;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/stripe/android/payments/bankaccount/ui/a;", "viewEffect", "Ljn0/h0;", "a", "(Lcom/stripe/android/payments/bankaccount/ui/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CollectBankAccountActivity f52025a;

            a(CollectBankAccountActivity collectBankAccountActivity) {
                this.f52025a = collectBankAccountActivity;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(com.stripe.android.payments.bankaccount.ui.a aVar, Continuation<? super h0> continuation) {
                if (aVar instanceof com.stripe.android.payments.bankaccount.ui.a.OpenConnectionsFlow) {
                    this.f52025a.v((com.stripe.android.payments.bankaccount.ui.a.OpenConnectionsFlow) aVar);
                } else if (aVar instanceof com.stripe.android.payments.bankaccount.ui.a.FinishWithResult) {
                    this.f52025a.u((com.stripe.android.payments.bankaccount.ui.a.FinishWithResult) aVar);
                }
                return h0.f84049a;
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return CollectBankAccountActivity.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f52023n;
            if (i11 == 0) {
                t.b(obj);
                SharedFlow<com.stripe.android.payments.bankaccount.ui.a> sharedFlowV = CollectBankAccountActivity.this.s().v();
                a aVar = new a(CollectBankAccountActivity.this);
                this.f52023n = 1;
                if (sharedFlowV.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t.b(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/ViewModelStore;", "b", "()Landroidx/lifecycle/ViewModelStore;"}, k = 3, mv = {1, 9, 0})
    public static final class d extends u implements wn0.a<ViewModelStore> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f52026c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f52026c = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelStore invoke() {
            return this.f52026c.getCom.google.android.libraries.places.api.model.PlaceTypes.STORE java.lang.String();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "b", "()Landroidx/lifecycle/viewmodel/CreationExtras;"}, k = 3, mv = {1, 9, 0})
    public static final class e extends u implements wn0.a<CreationExtras> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a f52027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f52028d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(wn0.a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f52027c = aVar;
            this.f52028d = componentActivity;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            wn0.a aVar = this.f52027c;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f52028d.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "b", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;"}, k = 3, mv = {1, 9, 0})
    static final class f extends u implements wn0.a<CollectBankAccountContract.a> {
        f() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CollectBankAccountContract.a invoke() {
            CollectBankAccountContract.a.Companion companion = CollectBankAccountContract.a.INSTANCE;
            Intent intent = CollectBankAccountActivity.this.getIntent();
            s.j(intent, "getIntent(...)");
            return companion.a(intent);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "b", "()Landroidx/lifecycle/ViewModelProvider$Factory;"}, k = 3, mv = {1, 9, 0})
    static final class g extends u implements wn0.a<ViewModelProvider.Factory> {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;", "b", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountContract$a;"}, k = 3, mv = {1, 9, 0})
        static final class a extends u implements wn0.a<CollectBankAccountContract.a> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ CollectBankAccountActivity f52031c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(CollectBankAccountActivity collectBankAccountActivity) {
                super(0);
                this.f52031c = collectBankAccountActivity;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CollectBankAccountContract.a invoke() {
                CollectBankAccountContract.a aVarR = this.f52031c.r();
                if (aVarR != null) {
                    return aVarR;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }

        g() {
            super(0);
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ViewModelProvider.Factory invoke() {
            return new com.stripe.android.payments.bankaccount.ui.b.c(new a(CollectBankAccountActivity.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CollectBankAccountContract.a r() {
        return (CollectBankAccountContract.a) this.starterArgs.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.stripe.android.payments.bankaccount.ui.b s() {
        return (com.stripe.android.payments.bankaccount.ui.b) this.viewModel.getValue();
    }

    private final void t(b70.a configuration) {
        CollectBankAccountActivity collectBankAccountActivity;
        l70.c cVarB;
        if (configuration instanceof b70.a.InstantDebits) {
            cVarB = l70.c.Companion.d(l70.c.INSTANCE, this, new a(s()), null, null, 12, null);
            collectBankAccountActivity = this;
        } else {
            if (!(configuration instanceof b70.a.USBankAccount)) {
                throw new NoWhenBranchMatchedException();
            }
            collectBankAccountActivity = this;
            cVarB = l70.c.Companion.b(l70.c.INSTANCE, collectBankAccountActivity, new b(s()), null, null, 12, null);
        }
        collectBankAccountActivity.financialConnectionsPaymentsProxy = cVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(com.stripe.android.payments.bankaccount.ui.a.FinishWithResult finishWithResult) {
        setResult(-1, new Intent().putExtras(new CollectBankAccountContract.Result(finishWithResult.getResult()).b()));
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(com.stripe.android.payments.bankaccount.ui.a.OpenConnectionsFlow openConnectionsFlow) {
        l70.c cVar = this.financialConnectionsPaymentsProxy;
        if (cVar == null) {
            s.B("financialConnectionsPaymentsProxy");
            cVar = null;
        }
        cVar.a(openConnectionsFlow.getFinancialConnectionsSessionSecret(), openConnectionsFlow.getPublishableKey(), openConnectionsFlow.getStripeAccountId(), openConnectionsFlow.getElementsSessionContext());
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CollectBankAccountContract.a aVarR = r();
        if ((aVarR != null ? aVarR.getConfiguration() : null) == null) {
            u(new com.stripe.android.payments.bankaccount.ui.a.FinishWithResult(new com.stripe.android.payments.bankaccount.navigation.e.Failed(new IllegalStateException("Configuration not provided"))));
            return;
        }
        CollectBankAccountContract.a aVarR2 = r();
        if (aVarR2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        t(aVarR2.getConfiguration());
        x.a(this).e(new c(null));
    }
}
