package s50;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p002activity.ComponentActivity;
import co0.o;
import com.plaid.internal.EnumC4419g;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;
import p020r2.l;
import p020r2.n3;
import p020r2.y3;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001aI\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00020\t\"\u000e\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0001\u0010\u0005\"\u0004\b\u0002\u0010\u0006*\u00028\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;", "b", "(Lr2/l;I)Lcom/stripe/android/financialconnections/ui/FinancialConnectionsSheetNativeActivity;", "Ls50/i;", "VM", "S", "A", "Lco0/o;", "prop1", "Lr2/y3;", "a", "(Ls50/i;Lco0/o;Lr2/l;I)Lr2/y3;", "financial-connections_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class b {

    /* JADX INFO: Add missing generic type declarations: [A] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a<A> implements Flow<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f110199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f110200b;

        /* JADX INFO: renamed from: s50.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class C2340a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f110201a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f110202b;

            /* JADX INFO: renamed from: s50.b$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.stripe.android.financialconnections.presentation.ComposeExtensionsKt$collectAsState$lambda$1$$inlined$map$1$2", f = "ComposeExtensions.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
            public static final class C2341a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f110203n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f110204o;

                public C2341a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f110203n = obj;
                    this.f110204o |= Integer.MIN_VALUE;
                    return C2340a.this.emit(null, this);
                }
            }

            public C2340a(FlowCollector flowCollector, o oVar) {
                this.f110201a = flowCollector;
                this.f110202b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                C2341a c2341a;
                if (continuation instanceof C2341a) {
                    c2341a = (C2341a) continuation;
                    int i11 = c2341a.f110204o;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        c2341a.f110204o = i11 - Integer.MIN_VALUE;
                    } else {
                        c2341a = new C2341a(continuation);
                    }
                } else {
                    c2341a = new C2341a(continuation);
                }
                Object obj2 = c2341a.f110203n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = c2341a.f110204o;
                if (i12 == 0) {
                    t.b(obj2);
                    FlowCollector flowCollector = this.f110201a;
                    Object obj3 = this.f110202b.get(obj);
                    c2341a.f110204o = 1;
                    if (flowCollector.emit(obj3, c2341a) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t.b(obj2);
                }
                return h0.f84049a;
            }
        }

        public a(Flow flow, o oVar) {
            this.f110199a = flow;
            this.f110200b = oVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f110199a.collect(new C2340a(flowCollector, this.f110200b), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <VM extends i<S>, S, A> y3<A> a(VM vm2, o<S, ? extends A> prop1, l lVar, int i11) {
        s.k(vm2, "<this>");
        s.k(prop1, "prop1");
        lVar.H(-1826310263);
        if (p020r2.o.J()) {
            p020r2.o.S(-1826310263, i11, -1, "com.stripe.android.financialconnections.presentation.collectAsState (ComposeExtensions.kt:44)");
        }
        lVar.H(1748820228);
        boolean zN = lVar.n(prop1);
        Object objI = lVar.I();
        if (zN || objI == l.INSTANCE.a()) {
            objI = FlowKt.distinctUntilChanged(new a(vm2.h(), prop1));
            lVar.B(objI);
        }
        Flow flow = (Flow) objI;
        lVar.T();
        lVar.H(1748823318);
        Object objI2 = lVar.I();
        if (objI2 == l.INSTANCE.a()) {
            objI2 = vm2.h().getValue();
            lVar.B(objI2);
        }
        lVar.T();
        y3<A> y3VarA = n3.a(flow, prop1.get(objI2), null, lVar, 8, 2);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.T();
        return y3VarA;
    }

    public static final FinancialConnectionsSheetNativeActivity b(l lVar, int i11) {
        lVar.H(-168296965);
        if (p020r2.o.J()) {
            p020r2.o.S(-168296965, i11, -1, "com.stripe.android.financialconnections.presentation.parentActivity (ComposeExtensions.kt:31)");
        }
        ComponentActivity componentActivityA = r90.a.a((Context) lVar.U(AndroidCompositionLocals_androidKt.g()));
        s.i(componentActivityA, "null cannot be cast to non-null type com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity");
        FinancialConnectionsSheetNativeActivity financialConnectionsSheetNativeActivity = (FinancialConnectionsSheetNativeActivity) componentActivityA;
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        lVar.T();
        return financialConnectionsSheetNativeActivity;
    }
}
