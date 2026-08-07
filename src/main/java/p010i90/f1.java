package p010i90;

import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.internal.CombineKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import r90.e;
import r90.g;
import wn0.q;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0013"}, d2 = {"Li90/f1;", "Li90/r;", "", AnnotatedPrivateKey.LABEL, "", "Li90/l1;", "sectionFieldErrorControllers", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "a", "Ljava/lang/Integer;", "u", "()Ljava/lang/Integer;", "Lkotlinx/coroutines/flow/StateFlow;", "Li90/c0;", "b", "Lkotlinx/coroutines/flow/StateFlow;", "()Lkotlinx/coroutines/flow/StateFlow;", AnalyticsAttribute.Error, "stripe-ui-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class f1 implements r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f76526c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Integer label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final StateFlow<c0> error;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Flow<c0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f76529a;

        /* JADX INFO: renamed from: i90.f1$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        static final class C1617a extends u implements wn0.a<c0[]> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Flow[] f76530c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1617a(Flow[] flowArr) {
                super(0);
                this.f76530c = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c0[] invoke() {
                return new c0[this.f76530c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.stripe.android.uicore.elements.SectionController$special$$inlined$combineAsStateFlow$1$3", f = "SectionController.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements q<FlowCollector<? super c0>, c0[], Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f76531n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f76532o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f76533p;

            public b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                c0 c0Var;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f76531n;
                if (i11 == 0) {
                    t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f76532o;
                    Iterator it = n.w1((Object[]) this.f76533p).iterator();
                    do {
                        if (!it.hasNext()) {
                            c0Var = null;
                            break;
                        }
                        c0Var = (c0) it.next();
                    } while (c0Var == null);
                    this.f76531n = 1;
                    if (flowCollector.emit(c0Var, this) == coroutine_suspended) {
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

            @Override // wn0.q
            public final Object invoke(FlowCollector<? super c0> flowCollector, c0[] c0VarArr, Continuation<? super h0> continuation) {
                b bVar = new b(continuation);
                bVar.f76532o = flowCollector;
                bVar.f76533p = c0VarArr;
                return bVar.invokeSuspend(h0.f84049a);
            }
        }

        public a(Flow[] flowArr) {
            this.f76529a = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super c0> flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f76529a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C1617a(flowArr), new b(null), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
        }
    }

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0004\u001a\u00028\u0001\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"T", "R", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends u implements wn0.a<c0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f76534c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List list) {
            super(0);
            this.f76534c = list;
        }

        @Override // wn0.a
        public final c0 invoke() {
            List list = this.f76534c;
            ArrayList<c0> arrayList = new ArrayList(v.y(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((StateFlow) it.next()).getValue());
            }
            for (c0 c0Var : arrayList) {
                if (c0Var != null) {
                    return c0Var;
                }
            }
            return null;
        }
    }

    public f1(Integer num, List<? extends l1> sectionFieldErrorControllers) {
        Flow aVar;
        c0 c0Var;
        s.k(sectionFieldErrorControllers, "sectionFieldErrorControllers");
        this.label = num;
        List<? extends l1> list = sectionFieldErrorControllers;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((l1) it.next()).a());
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = v.m().iterator();
            do {
                if (!it2.hasNext()) {
                    c0Var = null;
                    break;
                }
                c0Var = (c0) it2.next();
            } while (c0Var == null);
            aVar = g.n(c0Var);
        } else {
            aVar = new a((Flow[]) v.m1(arrayList).toArray(new Flow[0]));
        }
        this.error = new e(aVar, new b(arrayList));
    }

    public final StateFlow<c0> a() {
        return this.error;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final Integer getLabel() {
        return this.label;
    }
}
