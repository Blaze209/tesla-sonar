package p008h80;

import androidx.compose.ui.d;
import androidx.p003lifecycle.c1;
import androidx.p003lifecycle.f1;
import androidx.p003lifecycle.n;
import androidx.p003lifecycle.viewmodel.CreationExtras;
import java.util.List;
import java.util.Set;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p010i90.IdentifierSpec;
import p010i90.d0;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import p020r2.Function0;
import p020r2.k2;
import p020r2.l;
import p020r2.o;
import p020r2.w2;
import p020r2.y3;
import r90.f;
import u70.FormFieldValues;
import w80.i;
import wn0.p;
import y70.FormArguments;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aU\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001ay\u0010\u001a\u001a\u00020\b2\n\u0010\u0012\u001a\u00060\u0000j\u0002`\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\b0\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0001¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c²\u0006\u0012\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0019\u001a\u0004\u0018\u00010\u00168\nX\u008a\u0084\u0002"}, d2 = {"", "uuid", "Ly70/a;", "args", "", "enabled", "Lkotlin/Function1;", "Lu70/c;", "Ljn0/h0;", "onFormFieldValuesChanged", "", "Li90/d0;", "formElements", "Landroidx/compose/ui/d;", "modifier", "a", "(Ljava/lang/String;Ly70/a;ZLwn0/l;Ljava/util/List;Landroidx/compose/ui/d;Lr2/l;II)V", "Lcom/stripe/android/model/PaymentMethodCode;", "paymentMethodCode", "Lkotlinx/coroutines/flow/Flow;", "completeFormValues", "", "Li90/g0;", "hiddenIdentifiers", "elements", "lastTextFieldIdentifier", "b", "(Ljava/lang/String;ZLwn0/l;Lkotlinx/coroutines/flow/Flow;Ljava/util/Set;Ljava/util/List;Li90/g0;Landroidx/compose/ui/d;Lr2/l;II)V", "paymentsheet_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class x {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class a extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f71663c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FormArguments f71664d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f71665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ wn0.l<FormFieldValues, h0> f71666f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<d0> f71667g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ d f71668h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f71669i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f71670j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(String str, FormArguments formArguments, boolean z11, wn0.l<? super FormFieldValues, h0> lVar, List<? extends d0> list, d dVar, int i11, int i12) {
            super(2);
            this.f71663c = str;
            this.f71664d = formArguments;
            this.f71665e = z11;
            this.f71666f = lVar;
            this.f71667g = list;
            this.f71668h = dVar;
            this.f71669i = i11;
            this.f71670j = i12;
        }

        public final void a(l lVar, int i11) {
            x.a(this.f71663c, this.f71664d, this.f71665e, this.f71666f, this.f71667g, this.f71668h, lVar, k2.a(this.f71669i | 1), this.f71670j);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.stripe.android.paymentsheet.ui.PaymentMethodFormKt$PaymentMethodForm$2", f = "PaymentMethodForm.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71671n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Flow<FormFieldValues> f71672o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ wn0.l<FormFieldValues, h0> f71673p;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu70/c;", "it", "Ljn0/h0;", "a", "(Lu70/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ wn0.l<FormFieldValues, h0> f71674a;

            /* JADX WARN: Multi-variable type inference failed */
            a(wn0.l<? super FormFieldValues, h0> lVar) {
                this.f71674a = lVar;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(FormFieldValues formFieldValues, Continuation<? super h0> continuation) {
                this.f71674a.invoke(formFieldValues);
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Flow<FormFieldValues> flow, wn0.l<? super FormFieldValues, h0> lVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f71672o = flow;
            this.f71673p = lVar;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new b(this.f71672o, this.f71673p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f71671n;
            if (i11 == 0) {
                t.b(obj);
                Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(this.f71672o);
                a aVar = new a(this.f71673p);
                this.f71671n = 1;
                if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class c extends u implements p<l, Integer, h0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f71675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f71676d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ wn0.l<FormFieldValues, h0> f71677e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Flow<FormFieldValues> f71678f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Set<IdentifierSpec> f71679g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<d0> f71680h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ IdentifierSpec f71681i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ d f71682j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f71683k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f71684l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(String str, boolean z11, wn0.l<? super FormFieldValues, h0> lVar, Flow<FormFieldValues> flow, Set<IdentifierSpec> set, List<? extends d0> list, IdentifierSpec identifierSpec, d dVar, int i11, int i12) {
            super(2);
            this.f71675c = str;
            this.f71676d = z11;
            this.f71677e = lVar;
            this.f71678f = flow;
            this.f71679g = set;
            this.f71680h = list;
            this.f71681i = identifierSpec;
            this.f71682j = dVar;
            this.f71683k = i11;
            this.f71684l = i12;
        }

        public final void a(l lVar, int i11) {
            x.b(this.f71675c, this.f71676d, this.f71677e, this.f71678f, this.f71679g, this.f71680h, this.f71681i, this.f71682j, lVar, k2.a(this.f71683k | 1), this.f71684l);
        }

        @Override // wn0.p
        public /* bridge */ /* synthetic */ h0 invoke(l lVar, Integer num) {
            a(lVar, num.intValue());
            return h0.f84049a;
        }
    }

    public static final void a(String uuid, FormArguments args, boolean z11, wn0.l<? super FormFieldValues, h0> onFormFieldValuesChanged, List<? extends d0> formElements, d dVar, l lVar, int i11, int i12) {
        s.k(uuid, "uuid");
        s.k(args, "args");
        s.k(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        s.k(formElements, "formElements");
        l lVarV = lVar.v(-254814677);
        d dVar2 = (i12 & 32) != 0 ? d.INSTANCE : dVar;
        if (o.J()) {
            o.S(-254814677, i11, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodForm (PaymentMethodForm.kt:26)");
        }
        String str = args.getPaymentMethodCode() + "_" + uuid;
        u70.d.b bVar = new u70.d.b(formElements, args);
        lVarV.H(1729797275);
        f1 f1VarA = n7.a.f93383a.a(lVarV, 6);
        if (f1VarA == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        c1 c1VarC = n7.c.c(u70.d.class, f1VarA, str, bVar, f1VarA instanceof n ? ((n) f1VarA).getDefaultViewModelCreationExtras() : CreationExtras.a.f8924b, lVarV, 36936, 0);
        lVarV.T();
        u70.d dVar3 = (u70.d) c1VarC;
        List<d0> listI = dVar3.i();
        y3 y3VarA = f.a(dVar3.j(), lVarV, 8);
        y3 y3VarA2 = f.a(dVar3.k(), lVarV, 8);
        int i13 = i11 >> 3;
        d dVar4 = dVar2;
        b(args.getPaymentMethodCode(), z11, onFormFieldValuesChanged, dVar3.g(), c(y3VarA), listI, d(y3VarA2), dVar4, lVarV, (i13 & 896) | (i13 & 112) | 299008 | (IdentifierSpec.f76539d << 18) | ((i11 << 6) & 29360128), 0);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new a(uuid, args, z11, onFormFieldValuesChanged, formElements, dVar4, i11, i12));
        }
    }

    public static final void b(String paymentMethodCode, boolean z11, wn0.l<? super FormFieldValues, h0> onFormFieldValuesChanged, Flow<FormFieldValues> completeFormValues, Set<IdentifierSpec> hiddenIdentifiers, List<? extends d0> elements, IdentifierSpec identifierSpec, d dVar, l lVar, int i11, int i12) {
        s.k(paymentMethodCode, "paymentMethodCode");
        s.k(onFormFieldValuesChanged, "onFormFieldValuesChanged");
        s.k(completeFormValues, "completeFormValues");
        s.k(hiddenIdentifiers, "hiddenIdentifiers");
        s.k(elements, "elements");
        l lVarV = lVar.v(958947257);
        d dVar2 = (i12 & 128) != 0 ? d.INSTANCE : dVar;
        if (o.J()) {
            o.S(958947257, i11, -1, "com.stripe.android.paymentsheet.ui.PaymentMethodForm (PaymentMethodForm.kt:61)");
        }
        Function0.g(paymentMethodCode, new b(completeFormValues, onFormFieldValuesChanged, null), lVarV, (i11 & 14) | 64);
        int i13 = i11 >> 9;
        i.a(hiddenIdentifiers, z11, elements, identifierSpec, dVar2, lVarV, (i11 & 112) | 520 | (IdentifierSpec.f76539d << 9) | (i13 & 7168) | (i13 & 57344), 0);
        if (o.J()) {
            o.R();
        }
        w2 w2VarX = lVarV.x();
        if (w2VarX != null) {
            w2VarX.a(new c(paymentMethodCode, z11, onFormFieldValuesChanged, completeFormValues, hiddenIdentifiers, elements, identifierSpec, dVar2, i11, i12));
        }
    }

    private static final Set<IdentifierSpec> c(y3<? extends Set<IdentifierSpec>> y3Var) {
        return y3Var.getValue();
    }

    private static final IdentifierSpec d(y3<IdentifierSpec> y3Var) {
        return y3Var.getValue();
    }
}
