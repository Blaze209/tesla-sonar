package androidx.room;

import java.util.Set;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p013kotlin.KotlinNothingValueException;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/room/s;", "", "", "size", "<init>", "(I)V", "", "tableIds", "Ljn0/h0;", "b", "(Ljava/util/Set;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "", "collector", "", "a", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "versions", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MutableStateFlow<int[]> versions;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.ObservedTableVersions", f = "InvalidationTracker.kt", i = {}, l = {602}, m = "collect", n = {}, s = {})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f13803n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f13805p;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f13803n = obj;
            this.f13805p |= Integer.MIN_VALUE;
            return s.this.a(null, this);
        }
    }

    public s(int i11) {
        this.versions = StateFlowKt.MutableStateFlow(new int[i11]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(FlowCollector<? super int[]> flowCollector, Continuation<?> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f13805p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f13805p = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f13803n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = aVar.f13805p;
        if (i12 == 0) {
            jn0.t.b(obj);
            MutableStateFlow<int[]> mutableStateFlow = this.versions;
            aVar.f13805p = 1;
            if (mutableStateFlow.collect(flowCollector, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        throw new KotlinNothingValueException();
    }

    public final void b(Set<Integer> tableIds) {
        int[] value;
        int[] iArr;
        p013kotlin.jvm.internal.s.k(tableIds, "tableIds");
        if (tableIds.isEmpty()) {
            return;
        }
        MutableStateFlow<int[]> mutableStateFlow = this.versions;
        do {
            value = mutableStateFlow.getValue();
            int[] iArr2 = value;
            int length = iArr2.length;
            iArr = new int[length];
            for (int i11 = 0; i11 < length; i11++) {
                iArr[i11] = tableIds.contains(Integer.valueOf(i11)) ? iArr2[i11] + 1 : iArr2[i11];
            }
        } while (!mutableStateFlow.compareAndSet(value, iArr));
    }
}
