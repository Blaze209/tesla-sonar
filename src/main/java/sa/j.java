package sa;

import androidx.room.b0;
import com.plaid.internal.EnumC4419g;
import java.util.Arrays;
import jn0.h0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\bH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"R", "Landroidx/room/b0;", "db", "", "inTransaction", "", "", "tableNames", "Lkotlin/Function1;", "Lya/b;", "block", "Lkotlinx/coroutines/flow/Flow;", "a", "(Landroidx/room/b0;Z[Ljava/lang/String;Lwn0/l;)Lkotlinx/coroutines/flow/Flow;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b¸\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "Ljn0/h0;", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a<R> implements Flow<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Flow f110691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f110692b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f110693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ wn0.l f110694d;

        /* JADX INFO: renamed from: sa.j$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Ljn0/h0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        public static final class C2356a<T> implements FlowCollector {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ FlowCollector f110695a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f110696b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f110697c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ wn0.l f110698d;

            /* JADX INFO: renamed from: sa.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1$2", f = "FlowBuilder.kt", i = {}, l = {224, EnumC4419g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE}, m = "emit", n = {}, s = {})
            public static final class C2357a extends ContinuationImpl {

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f110699n;

                /* JADX INFO: renamed from: o, reason: collision with root package name */
                int f110700o;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                Object f110701p;

                public C2357a(Continuation continuation) {
                    super(continuation);
                }

                @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f110699n = obj;
                    this.f110700o |= Integer.MIN_VALUE;
                    return C2356a.this.emit(null, this);
                }
            }

            public C2356a(FlowCollector flowCollector, b0 b0Var, boolean z11, wn0.l lVar) {
                this.f110695a = flowCollector;
                this.f110696b = b0Var;
                this.f110697c = z11;
                this.f110698d = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
            
                if (r8.emit(r9, r0) == r1) goto L22;
             */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, p013kotlin.coroutines.Continuation r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof sa.j.a.C2356a.C2357a
                    if (r0 == 0) goto L13
                    r0 = r9
                    sa.j$a$a$a r0 = (sa.j.a.C2356a.C2357a) r0
                    int r1 = r0.f110700o
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f110700o = r1
                    goto L18
                L13:
                    sa.j$a$a$a r0 = new sa.j$a$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f110699n
                    java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f110700o
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3c
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    jn0.t.b(r9)
                    goto L63
                L2c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L34:
                    java.lang.Object r8 = r0.f110701p
                    kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
                    jn0.t.b(r9)
                    goto L57
                L3c:
                    jn0.t.b(r9)
                    kotlinx.coroutines.flow.FlowCollector r9 = r7.f110695a
                    java.util.Set r8 = (java.util.Set) r8
                    androidx.room.b0 r8 = r7.f110696b
                    boolean r2 = r7.f110697c
                    wn0.l r5 = r7.f110698d
                    r0.f110701p = r9
                    r0.f110700o = r4
                    java.lang.Object r8 = wa.b.f(r8, r4, r2, r5, r0)
                    if (r8 != r1) goto L54
                    goto L62
                L54:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L57:
                    r2 = 0
                    r0.f110701p = r2
                    r0.f110700o = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L63
                L62:
                    return r1
                L63:
                    jn0.h0 r8 = jn0.h0.f84049a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: sa.j.a.C2356a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(Flow flow, b0 b0Var, boolean z11, wn0.l lVar) {
            this.f110691a = flow;
            this.f110692b = b0Var;
            this.f110693c = z11;
            this.f110694d = lVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f110691a.collect(new C2356a(flowCollector, this.f110692b, this.f110693c, this.f110694d), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : h0.f84049a;
        }
    }

    public static final <R> Flow<R> a(b0 db2, boolean z11, String[] tableNames, wn0.l<? super ya.b, ? extends R> block) {
        s.k(db2, "db");
        s.k(tableNames, "tableNames");
        s.k(block, "block");
        return new a(FlowKt.conflate(db2.getInvalidationTracker().j((String[]) Arrays.copyOf(tableNames, tableNames.length), true)), db2, z11, block);
    }
}
