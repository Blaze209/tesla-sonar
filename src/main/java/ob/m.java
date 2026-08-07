package ob;

import android.os.Build;
import androidx.work.z;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.plaid.internal.EnumC4419g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.CombineKt;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p013kotlin.jvm.internal.s;
import sb.m0;
import wn0.q;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lob/m;", "", "", "Lpb/e;", "controllers", "<init>", "(Ljava/util/List;)V", "Lqb/n;", "trackers", "(Lqb/n;)V", "Lsb/m0;", "spec", "Lkotlinx/coroutines/flow/Flow;", "Lob/b;", DateTokenConverter.CONVERTER_KEY, "(Lsb/m0;)Lkotlinx/coroutines/flow/Flow;", "workSpec", "", "b", "(Lsb/m0;)Z", "a", "Ljava/util/List;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<pb.e> controllers;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$$inlined$unsafeFlow$3", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Flow<ob.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow[] f97075a;

        /* JADX INFO: renamed from: ob.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class C2076a implements wn0.a<ob.b[]> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Flow[] f97076a;

            public C2076a(Flow[] flowArr) {
                this.f97076a = flowArr;
            }

            @Override // wn0.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final ob.b[] invoke() {
                return new ob.b[this.f97076a.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "", "it", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/Array;)V", "kotlinx/coroutines/flow/FlowKt__ZipKt$combine$6$2"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "androidx.work.impl.constraints.WorkConstraintsTracker$track$$inlined$combine$1$3", f = "WorkConstraintsTracker.kt", i = {}, l = {EnumC4419g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements q<FlowCollector<? super ob.b>, ob.b[], Continuation<? super h0>, Object> {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f97077n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private /* synthetic */ Object f97078o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            /* synthetic */ Object f97079p;

            public b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ob.b bVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i11 = this.f97077n;
                if (i11 == 0) {
                    t.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.f97078o;
                    ob.b[] bVarArr = (ob.b[]) ((Object[]) this.f97079p);
                    int length = bVarArr.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i12];
                        if (!s.f(bVar, ob.b.a.f97044a)) {
                            break;
                        }
                        i12++;
                    }
                    if (bVar == null) {
                        bVar = ob.b.a.f97044a;
                    }
                    this.f97077n = 1;
                    if (flowCollector.emit(bVar, this) == coroutine_suspended) {
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
            public final Object invoke(FlowCollector<? super ob.b> flowCollector, ob.b[] bVarArr, Continuation<? super h0> continuation) {
                b bVar = new b(continuation);
                bVar.f97078o = flowCollector;
                bVar.f97079p = bVarArr;
                return bVar.invokeSuspend(h0.f84049a);
            }
        }

        public a(Flow[] flowArr) {
            this.f97075a = flowArr;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector<? super ob.b> flowCollector, Continuation continuation) {
            Flow[] flowArr = this.f97075a;
            Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new C2076a(flowArr), new b(null), continuation);
            return objCombineInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCombineInternal : h0.f84049a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(List<? extends pb.e> controllers) {
        s.k(controllers, "controllers");
        this.controllers = controllers;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence c(pb.e it) {
        s.k(it, "it");
        String simpleName = it.getClass().getSimpleName();
        s.j(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final boolean b(m0 workSpec) {
        s.k(workSpec, "workSpec");
        List<pb.e> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((pb.e) obj).a(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            z.e().a(n.f97080a, "Work " + workSpec.id + " constrained by " + v.y0(arrayList, null, null, null, 0, null, new wn0.l() { // from class: ob.l
                @Override // wn0.l
                public final Object invoke(Object obj2) {
                    return m.c((pb.e) obj2);
                }
            }, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final Flow<b> d(m0 spec) {
        s.k(spec, "spec");
        List<pb.e> list = this.controllers;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((pb.e) obj).c(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((pb.e) it.next()).b(spec.org.bouncycastle.crypto.CryptoServicesPermission.CONSTRAINTS java.lang.String));
        }
        return FlowKt.distinctUntilChanged(new a((Flow[]) v.m1(arrayList2).toArray(new Flow[0])));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(qb.n trackers) {
        this((List<? extends pb.e>) v.r(new pb.c(trackers.a()), new pb.d(trackers.getBatteryNotLowTracker()), new pb.j(trackers.e()), new pb.f(trackers.d()), new pb.i(trackers.d()), new pb.h(trackers.d()), new pb.g(trackers.d()), Build.VERSION.SDK_INT >= 28 ? n.a(trackers.getCh.qos.logback.core.CoreConstants.CONTEXT_SCOPE_VALUE java.lang.String()) : null));
        s.k(trackers, "trackers");
    }
}
