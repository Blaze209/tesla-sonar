package com.stripe.android.view;

import android.app.Application;
import androidx.p003lifecycle.ViewModelProvider;
import com.stripe.android.model.BankStatuses;
import ezvcard.property.Kind;
import f30.PaymentConfiguration;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001!B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001f\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/stripe/android/view/p1;", "Landroidx/lifecycle/b;", "Landroid/app/Application;", Kind.APPLICATION, "", "publishableKey", "Lz60/g;", "stripeRepository", "<init>", "(Landroid/app/Application;Ljava/lang/String;Lz60/g;)V", "t", "Ljava/lang/String;", "u", "Lz60/g;", "", "v", "Ljava/lang/Integer;", "k", "()Ljava/lang/Integer;", "l", "(Ljava/lang/Integer;)V", "selectedPosition", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/stripe/android/model/e;", "w", "Lkotlinx/coroutines/flow/MutableStateFlow;", "_fpxBankStatues", "Lkotlinx/coroutines/flow/StateFlow;", "x", "Lkotlinx/coroutines/flow/StateFlow;", "j", "()Lkotlinx/coroutines/flow/StateFlow;", "fpxBankStatues", "b", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class p1 extends androidx.p003lifecycle.b {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String publishableKey;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final z60.g stripeRepository;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Integer selectedPosition;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<BankStatuses> _fpxBankStatues;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<BankStatuses> fpxBankStatues;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.view.FpxViewModel$1", f = "FpxViewModel.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f55113n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f55114o;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return p1.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            Object bankStatuses;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f55114o;
            if (i11 == 0) {
                jn0.t.b(obj);
                MutableStateFlow mutableStateFlow2 = p1.this._fpxBankStatues;
                z60.g gVar = p1.this.stripeRepository;
                w30.l.Options options = new w30.l.Options(p1.this.publishableKey, null, null, 6, null);
                this.f55113n = mutableStateFlow2;
                this.f55114o = 1;
                Object objH = gVar.h(options, this);
                if (objH == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableStateFlow = mutableStateFlow2;
                bankStatuses = objH;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableStateFlow = (MutableStateFlow) this.f55113n;
                jn0.t.b(obj);
                bankStatuses = ((jn0.s) obj).getValue();
            }
            if (jn0.s.e(bankStatuses) != null) {
                bankStatuses = new BankStatuses(null, 1, null);
            }
            mutableStateFlow.setValue(bankStatuses);
            return jn0.h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/p1$b;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroid/app/Application;", Kind.APPLICATION, "<init>", "(Landroid/app/Application;)V", "Landroidx/lifecycle/c1;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/c1;", "a", "Landroid/app/Application;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements ViewModelProvider.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Application application;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/c1;", "T", "", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 9, 0})
        static final class a extends p013kotlin.jvm.internal.u implements wn0.a<String> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f55117c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str) {
                super(0);
                this.f55117c = str;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return this.f55117c;
            }
        }

        public b(Application application) {
            p013kotlin.jvm.internal.s.k(application, "application");
            this.application = application;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.p003lifecycle.c1> T create(Class<T> modelClass) {
            p013kotlin.jvm.internal.s.k(modelClass, "modelClass");
            String publishableKey = PaymentConfiguration.INSTANCE.a(this.application).getPublishableKey();
            return new p1(this.application, publishableKey, new com.stripe.android.networking.a(this.application, new a(publishableKey), null, null, null, null, null, null, null, null, null, null, null, null, null, 32764, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(Application application, String publishableKey, z60.g stripeRepository) {
        super(application);
        p013kotlin.jvm.internal.s.k(application, "application");
        p013kotlin.jvm.internal.s.k(publishableKey, "publishableKey");
        p013kotlin.jvm.internal.s.k(stripeRepository, "stripeRepository");
        this.publishableKey = publishableKey;
        this.stripeRepository = stripeRepository;
        MutableStateFlow<BankStatuses> MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this._fpxBankStatues = MutableStateFlow;
        this.fpxBankStatues = FlowKt.asStateFlow(MutableStateFlow);
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.d1.a(this), null, null, new a(null), 3, null);
    }

    public final StateFlow<BankStatuses> j() {
        return this.fpxBankStatues;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final Integer getSelectedPosition() {
        return this.selectedPosition;
    }

    public final void l(Integer num) {
        this.selectedPosition = num;
    }
}
