package com.stripe.android.view;

import android.app.Application;
import android.util.AttributeSet;
import androidx.p003lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.model.PaymentMethodCreateParams;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\u0017B'\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/stripe/android/view/e;", "Lcom/stripe/android/view/i;", "Landroidx/fragment/app/u;", "activity", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroidx/fragment/app/u;Landroid/util/AttributeSet;I)V", "Lcom/stripe/android/model/e;", "fpxBankStatuses", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/stripe/android/model/e;)V", "e", "position", "Lcom/stripe/android/view/o1;", "c", "(I)Lcom/stripe/android/view/o1;", "a", "Lcom/stripe/android/model/e;", "Lcom/stripe/android/view/g;", "b", "Lcom/stripe/android/view/g;", "fpxAdapter", "Lcom/stripe/android/view/p1;", "Lkotlin/Lazy;", "getViewModel", "()Lcom/stripe/android/view/p1;", "viewModel", "Lcom/stripe/android/model/w0;", "getCreateParams", "()Lcom/stripe/android/model/w0;", "createParams", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f54855e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private BankStatuses fpxBankStatuses;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g fpxAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy viewModel;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.view.AddPaymentMethodFpxView$1", f = "AddPaymentMethodFpxView.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f54859n;

        /* JADX INFO: renamed from: com.stripe.android.view.e$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* synthetic */ class C1103a implements FlowCollector, p013kotlin.jvm.internal.m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e f54861a;

            C1103a(e eVar) {
                this.f54861a = eVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(BankStatuses bankStatuses, Continuation<? super jn0.h0> continuation) {
                Object objB = a.b(this.f54861a, bankStatuses, continuation);
                return objB == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objB : jn0.h0.f84049a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof p013kotlin.jvm.internal.m)) {
                    return p013kotlin.jvm.internal.s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // p013kotlin.jvm.internal.m
            public final jn0.i<?> getFunctionDelegate() {
                return new p013kotlin.jvm.internal.a(2, this.f54861a, e.class, "onFpxBankStatusesUpdated", "onFpxBankStatusesUpdated(Lcom/stripe/android/model/BankStatuses;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object b(e eVar, BankStatuses bankStatuses, Continuation continuation) {
            eVar.d(bankStatuses);
            return jn0.h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
            return e.this.new a(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f54859n;
            if (i11 == 0) {
                jn0.t.b(obj);
                StateFlow<BankStatuses> stateFlowJ = e.this.getViewModel().j();
                C1103a c1103a = new C1103a(e.this);
                this.f54859n = 1;
                if (stateFlowJ.collect(c1103a, this) == coroutine_suspended) {
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(jn0.h0.f84049a);
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.view.e$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/e$b;", "", "<init>", "()V", "Landroidx/fragment/app/u;", "activity", "Lcom/stripe/android/view/e;", "a", "(Landroidx/fragment/app/u;)Lcom/stripe/android/view/e;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ e a(androidx.fragment.app.u activity) {
            p013kotlin.jvm.internal.s.k(activity, "activity");
            return new e(activity, null, 0, 6, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ljn0/h0;", "a", "(I)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends p013kotlin.jvm.internal.u implements wn0.l<Integer, jn0.h0> {
        c() {
            super(1);
        }

        public final void a(int i11) {
            e.this.getViewModel().l(Integer.valueOf(i11));
        }

        @Override // wn0.l
        public /* bridge */ /* synthetic */ jn0.h0 invoke(Integer num) {
            a(num.intValue());
            return jn0.h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/stripe/android/view/p1;", "b", "()Lcom/stripe/android/view/p1;"}, k = 3, mv = {1, 9, 0})
    static final class d extends p013kotlin.jvm.internal.u implements wn0.a<p1> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.fragment.app.u f54863c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.fragment.app.u uVar) {
            super(0);
            this.f54863c = uVar;
        }

        @Override // wn0.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p1 invoke() {
            androidx.fragment.app.u uVar = this.f54863c;
            Application application = this.f54863c.getApplication();
            p013kotlin.jvm.internal.s.j(application, "getApplication(...)");
            return (p1) new ViewModelProvider(uVar, new p1.b(application)).b(p1.class);
        }
    }

    public /* synthetic */ e(androidx.fragment.app.u uVar, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(uVar, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final o1 c(int position) {
        return o1.getEntries().get(position);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(BankStatuses fpxBankStatuses) {
        if (fpxBankStatuses != null) {
            e(fpxBankStatuses);
        }
    }

    private final void e(BankStatuses fpxBankStatuses) {
        this.fpxBankStatuses = fpxBankStatuses;
        this.fpxAdapter.e(fpxBankStatuses);
        bo0.j jVarN = p013kotlin.collections.v.n(o1.getEntries());
        ArrayList arrayList = new ArrayList();
        for (Integer num : jVarN) {
            if (!fpxBankStatuses.a(c(num.intValue()))) {
                arrayList.add(num);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.fpxAdapter.c(((Number) it.next()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p1 getViewModel() {
        return (p1) this.viewModel.getValue();
    }

    @Override // com.stripe.android.view.i
    public PaymentMethodCreateParams getCreateParams() {
        Integer numValueOf = Integer.valueOf(this.fpxAdapter.getSelectedPosition());
        if (numValueOf.intValue() == -1) {
            numValueOf = null;
        }
        if (numValueOf == null) {
            return null;
        }
        return PaymentMethodCreateParams.Companion.k(PaymentMethodCreateParams.INSTANCE, new PaymentMethodCreateParams.Fpx(o1.getEntries().get(numValueOf.intValue()).getCode()), null, null, null, 14, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.fragment.app.u activity, AttributeSet attributeSet, int i11) {
        super(activity, attributeSet, i11);
        p013kotlin.jvm.internal.s.k(activity, "activity");
        this.fpxBankStatuses = new BankStatuses(null, 1, null);
        g gVar = new g(new x2(activity), o1.getEntries(), new c());
        this.fpxAdapter = gVar;
        this.viewModel = jn0.m.b(new d(activity));
        h40.h hVarC = h40.h.c(activity.getLayoutInflater(), this, true);
        p013kotlin.jvm.internal.s.j(hVarC, "inflate(...)");
        setId(f30.z.f64282s0);
        BuildersKt__Builders_commonKt.launch$default(androidx.p003lifecycle.x.a(activity), null, null, new a(null), 3, null);
        RecyclerView recyclerView = hVarC.f70692b;
        recyclerView.setAdapter(gVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new androidx.recyclerview.widget.g());
        Integer numK = getViewModel().getSelectedPosition();
        if (numK != null) {
            gVar.g(numK.intValue());
        }
    }
}
