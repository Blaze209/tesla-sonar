package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import androidx.p003lifecycle.ViewModelProvider;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.d1;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import b80.BacsMandateConfirmationViewState;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.common.Scopes;
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
import n70.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import wn0.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002*+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020 0$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/e;", "Landroidx/lifecycle/c1;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/e$a;", "args", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/e$a;)V", "Ljn0/h0;", "m", "()V", "n", "l", "Lx30/c;", "h", "()Lx30/c;", "f", "g", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/d;", "action", "k", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/d;)V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/c;", "s", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "_result", "Lkotlinx/coroutines/flow/SharedFlow;", "t", "Lkotlinx/coroutines/flow/SharedFlow;", IntegerTokenConverter.CONVERTER_KEY, "()Lkotlinx/coroutines/flow/SharedFlow;", "result", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lb80/d;", "u", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_viewState", "Lkotlinx/coroutines/flow/StateFlow;", "v", "Lkotlinx/coroutines/flow/StateFlow;", "j", "()Lkotlinx/coroutines/flow/StateFlow;", "viewState", "a", "b", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e extends c1 {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final MutableSharedFlow<com.stripe.android.paymentsheet.paymentdatacollection.bacs.c> _result;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final SharedFlow<com.stripe.android.paymentsheet.paymentdatacollection.bacs.c> result;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<BacsMandateConfirmationViewState> _viewState;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<BacsMandateConfirmationViewState> viewState;

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/e$a;", "", "", Scopes.EMAIL, "nameOnAccount", "sortCode", "accountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", DateTokenConverter.CONVERTER_KEY, "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String nameOnAccount;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sortCode;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String accountNumber;

        public Args(String email, String nameOnAccount, String sortCode, String accountNumber) {
            s.k(email, "email");
            s.k(nameOnAccount, "nameOnAccount");
            s.k(sortCode, "sortCode");
            s.k(accountNumber, "accountNumber");
            this.email = email;
            this.nameOnAccount = nameOnAccount;
            this.sortCode = sortCode;
            this.accountNumber = accountNumber;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getNameOnAccount() {
            return this.nameOnAccount;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getSortCode() {
            return this.sortCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return s.f(this.email, args.email) && s.f(this.nameOnAccount, args.nameOnAccount) && s.f(this.sortCode, args.sortCode) && s.f(this.accountNumber, args.accountNumber);
        }

        public int hashCode() {
            return (((((this.email.hashCode() * 31) + this.nameOnAccount.hashCode()) * 31) + this.sortCode.hashCode()) * 31) + this.accountNumber.hashCode();
        }

        public String toString() {
            return "Args(email=" + this.email + ", nameOnAccount=" + this.nameOnAccount + ", sortCode=" + this.sortCode + ", accountNumber=" + this.accountNumber + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/e$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$a;", "args", "<init>", "(Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$a;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/viewmodel/CreationExtras;", "extras", "create", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/c1;", "a", "Lcom/stripe/android/paymentsheet/paymentdatacollection/bacs/BacsMandateConfirmationContract$a;", "paymentsheet_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final BacsMandateConfirmationContract.Args args;

        public b(BacsMandateConfirmationContract.Args args) {
            s.k(args, "args");
            this.args = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends c1> T create(Class<T> modelClass, CreationExtras extras) {
            s.k(modelClass, "modelClass");
            s.k(extras, "extras");
            return new e(new Args(this.args.getEmail(), this.args.getNameOnAccount(), this.args.getSortCode(), this.args.getAccountNumber()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationViewModel$onBackPress$1", f = "BacsMandateConfirmationViewModel.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53321n;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new c(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53321n;
            if (i11 == 0) {
                t.b(obj);
                MutableSharedFlow mutableSharedFlow = e.this._result;
                com.stripe.android.paymentsheet.paymentdatacollection.bacs.c.a aVar = com.stripe.android.paymentsheet.paymentdatacollection.bacs.c.a.f53305a;
                this.f53321n = 1;
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
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationViewModel$onConfirmPress$1", f = "BacsMandateConfirmationViewModel.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53323n;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53323n;
            if (i11 == 0) {
                t.b(obj);
                MutableSharedFlow mutableSharedFlow = e.this._result;
                com.stripe.android.paymentsheet.paymentdatacollection.bacs.c.C1026c c1026c = com.stripe.android.paymentsheet.paymentdatacollection.bacs.c.C1026c.f53307a;
                this.f53323n = 1;
                if (mutableSharedFlow.emit(c1026c, this) == coroutine_suspended) {
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
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationViewModel$onModifyDetailsPressed$1", f = "BacsMandateConfirmationViewModel.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    static final class C1027e extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f53325n;

        C1027e(Continuation<? super C1027e> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new C1027e(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f53325n;
            if (i11 == 0) {
                t.b(obj);
                MutableSharedFlow mutableSharedFlow = e.this._result;
                com.stripe.android.paymentsheet.paymentdatacollection.bacs.c.d dVar = com.stripe.android.paymentsheet.paymentdatacollection.bacs.c.d.f53308a;
                this.f53325n = 1;
                if (mutableSharedFlow.emit(dVar, this) == coroutine_suspended) {
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
            return ((C1027e) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    public e(Args args) {
        s.k(args, "args");
        MutableSharedFlow<com.stripe.android.paymentsheet.paymentdatacollection.bacs.c> mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this._result = mutableSharedFlowMutableSharedFlow$default;
        this.result = FlowKt.asSharedFlow(mutableSharedFlowMutableSharedFlow$default);
        MutableStateFlow<BacsMandateConfirmationViewState> MutableStateFlow = StateFlowKt.MutableStateFlow(new BacsMandateConfirmationViewState(args.getEmail(), args.getNameOnAccount(), v.y0(p013kotlin.text.t.L1(args.getSortCode(), 2), "-", null, null, 0, null, null, 62, null), args.getAccountNumber(), h(), f(), g()));
        this._viewState = MutableStateFlow;
        this.viewState = FlowKt.asStateFlow(MutableStateFlow);
    }

    private final x30.c f() {
        return x30.d.g(x.f93544z, new Object[]{x30.d.a(x.A), x30.d.a(x.B), x30.d.a(x.C), x30.d.a(x.C)}, null, 4, null);
    }

    private final x30.c g() {
        return x30.d.g(x.f93537s, new Object[]{x30.d.a(x.f93538t), x30.d.a(x.f93536r)}, null, 4, null);
    }

    private final x30.c h() {
        return x30.d.a(x.f93541w);
    }

    private final void l() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new c(null), 3, null);
    }

    private final void m() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new d(null), 3, null);
    }

    private final void n() {
        BuildersKt__Builders_commonKt.launch$default(d1.a(this), null, null, new C1027e(null), 3, null);
    }

    public final SharedFlow<com.stripe.android.paymentsheet.paymentdatacollection.bacs.c> i() {
        return this.result;
    }

    public final StateFlow<BacsMandateConfirmationViewState> j() {
        return this.viewState;
    }

    public final void k(com.stripe.android.paymentsheet.paymentdatacollection.bacs.d action) {
        s.k(action, "action");
        if (action instanceof com.stripe.android.paymentsheet.paymentdatacollection.bacs.d.b) {
            m();
        } else if (action instanceof com.stripe.android.paymentsheet.paymentdatacollection.bacs.d.c) {
            n();
        } else if (action instanceof com.stripe.android.paymentsheet.paymentdatacollection.bacs.d.a) {
            l();
        }
    }
}
