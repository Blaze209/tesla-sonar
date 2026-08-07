package u1;

import java.util.ArrayList;
import java.util.List;
import jn0.h0;
import jn0.t;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import p020r2.Function0;
import p020r2.p1;
import p020r2.s3;
import p020r2.y3;
import wn0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lu1/j;", "Lr2/y3;", "", "a", "(Lu1/j;Lr2/l;I)Lr2/y3;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1", f = "FocusInteraction.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    static final class a extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f115276n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ j f115277o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ p1<Boolean> f115278p;

        /* JADX INFO: renamed from: u1.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lu1/i;", "interaction", "Ljn0/h0;", "a", "(Lu1/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
        static final class C2465a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List<d> f115279a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p1<Boolean> f115280b;

            C2465a(List<d> list, p1<Boolean> p1Var) {
                this.f115279a = list;
                this.f115280b = p1Var;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(i iVar, Continuation<? super h0> continuation) {
                if (iVar instanceof d) {
                    this.f115279a.add(iVar);
                } else if (iVar instanceof e) {
                    this.f115279a.remove(((e) iVar).getFocus());
                }
                this.f115280b.setValue(Boxing.boxBoolean(!this.f115279a.isEmpty()));
                return h0.f84049a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(j jVar, p1<Boolean> p1Var, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f115277o = jVar;
            this.f115278p = p1Var;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return new a(this.f115277o, this.f115278p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f115276n;
            if (i11 == 0) {
                t.b(obj);
                ArrayList arrayList = new ArrayList();
                Flow<i> flowC = this.f115277o.c();
                C2465a c2465a = new C2465a(arrayList, this.f115278p);
                this.f115276n = 1;
                if (flowC.collect(c2465a, this) == coroutine_suspended) {
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

    public static final y3<Boolean> a(j jVar, p020r2.l lVar, int i11) {
        if (p020r2.o.J()) {
            p020r2.o.S(-1805515472, i11, -1, "androidx.compose.foundation.interaction.collectIsFocusedAsState (FocusInteraction.kt:64)");
        }
        Object objI = lVar.I();
        p020r2.l.Companion companion = p020r2.l.INSTANCE;
        if (objI == companion.a()) {
            objI = s3.d(Boolean.FALSE, null, 2, null);
            lVar.B(objI);
        }
        p1 p1Var = (p1) objI;
        int i12 = i11 & 14;
        boolean z11 = ((i12 ^ 6) > 4 && lVar.n(jVar)) || (i11 & 6) == 4;
        Object objI2 = lVar.I();
        if (z11 || objI2 == companion.a()) {
            objI2 = new a(jVar, p1Var, null);
            lVar.B(objI2);
        }
        Function0.g(jVar, (p) objI2, lVar, i12);
        if (p020r2.o.J()) {
            p020r2.o.R();
        }
        return p1Var;
    }
}
