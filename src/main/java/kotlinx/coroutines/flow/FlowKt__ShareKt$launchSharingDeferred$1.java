package kotlinx.coroutines.flow;

import jn0.h0;
import jn0.s;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {0}, l = {337}, m = "invokeSuspend", n = {"state"}, s = {"L$0"})
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ CompletableDeferred<s<StateFlow<T>>> $result;
    final /* synthetic */ Flow<T> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FlowKt__ShareKt$launchSharingDeferred$1(Flow<? extends T> flow, CompletableDeferred<s<StateFlow<T>>> completableDeferred, Continuation<? super FlowKt__ShareKt$launchSharingDeferred$1> continuation) {
        super(2, continuation);
        this.$upstream = flow;
        this.$result = completableDeferred;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, continuation);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 for r6v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r0 = r6.L$0
            kotlin.jvm.internal.n0 r0 = (p013kotlin.jvm.internal.n0) r0
            jn0.t.b(r7)     // Catch: java.lang.Throwable -> L13
            goto L3e
        L13:
            r7 = move-exception
            goto L5f
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            jn0.t.b(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            kotlin.jvm.internal.n0 r1 = new kotlin.jvm.internal.n0     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            kotlinx.coroutines.flow.Flow<T> r3 = r6.$upstream     // Catch: java.lang.Throwable -> L13
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$1 r4 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$1     // Catch: java.lang.Throwable -> L13
            kotlinx.coroutines.CompletableDeferred<jn0.s<kotlinx.coroutines.flow.StateFlow<T>>> r5 = r6.$result     // Catch: java.lang.Throwable -> L13
            r4.<init>()     // Catch: java.lang.Throwable -> L13
            r6.L$0 = r1     // Catch: java.lang.Throwable -> L13
            r6.label = r2     // Catch: java.lang.Throwable -> L13
            java.lang.Object r7 = r3.collect(r4, r6)     // Catch: java.lang.Throwable -> L13
            if (r7 != r0) goto L3d
            return r0
        L3d:
            r0 = r1
        L3e:
            T r7 = r0.f86529a     // Catch: java.lang.Throwable -> L13
            if (r7 != 0) goto L5c
            kotlinx.coroutines.CompletableDeferred<jn0.s<kotlinx.coroutines.flow.StateFlow<T>>> r7 = r6.$result     // Catch: java.lang.Throwable -> L13
            jn0.s$a r0 = jn0.s.INSTANCE     // Catch: java.lang.Throwable -> L13
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "Flow is empty"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = jn0.t.a(r0)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = jn0.s.b(r0)     // Catch: java.lang.Throwable -> L13
            jn0.s r0 = jn0.s.a(r0)     // Catch: java.lang.Throwable -> L13
            r7.complete(r0)     // Catch: java.lang.Throwable -> L13
        L5c:
            jn0.h0 r7 = jn0.h0.f84049a
            return r7
        L5f:
            kotlinx.coroutines.CompletableDeferred<jn0.s<kotlinx.coroutines.flow.StateFlow<T>>> r0 = r6.$result
            r0.completeExceptionally(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
