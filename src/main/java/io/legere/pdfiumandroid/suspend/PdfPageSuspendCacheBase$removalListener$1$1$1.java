package io.legere.pdfiumandroid.suspend;

import jn0.h0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;
import wn0.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 2, 0})
@DebugMetadata(c = "io.legere.pdfiumandroid.suspend.PdfPageSuspendCacheBase$removalListener$1$1$1", f = "PdfPageSuspendCacheBase.kt", i = {0, 0, 0}, l = {32}, m = "invokeSuspend", n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-PdfPageSuspendCacheBase$removalListener$1$1$1$1"}, s = {"L$0", "L$1", "I$0"}, v = 1)
final class PdfPageSuspendCacheBase$removalListener$1$1$1 extends SuspendLambda implements p<CoroutineScope, Continuation<? super h0>, Object> {
    final /* synthetic */ Deferred<H> $deferred;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PdfPageSuspendCacheBase$removalListener$1$1$1(Deferred<? extends H> deferred, Continuation<? super PdfPageSuspendCacheBase$removalListener$1$1$1> continuation) {
        super(2, continuation);
        this.$deferred = deferred;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
        PdfPageSuspendCacheBase$removalListener$1$1$1 pdfPageSuspendCacheBase$removalListener$1$1$1 = new PdfPageSuspendCacheBase$removalListener$1$1$1(this.$deferred, continuation);
        pdfPageSuspendCacheBase$removalListener$1$1$1.L$0 = obj;
        return pdfPageSuspendCacheBase$removalListener$1$1$1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to io.legere.pdfiumandroid.suspend.PdfPageSuspendCacheBase$removalListener$1$1$1 for r4v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r4.label
            r3 = 1
            if (r2 == 0) goto L21
            if (r2 != r3) goto L19
            java.lang.Object r0 = r4.L$1
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            jn0.t.b(r5)     // Catch: java.lang.Throwable -> L17
            goto L40
        L17:
            r5 = move-exception
            goto L4b
        L19:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L21:
            jn0.t.b(r5)
            kotlinx.coroutines.Deferred<H> r5 = r4.$deferred
            jn0.s$a r2 = jn0.s.INSTANCE     // Catch: java.lang.Throwable -> L17
            java.lang.Object r2 = p013kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.lang.Throwable -> L17
            r4.L$0 = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = p013kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)     // Catch: java.lang.Throwable -> L17
            r4.L$1 = r0     // Catch: java.lang.Throwable -> L17
            r0 = 0
            r4.I$0 = r0     // Catch: java.lang.Throwable -> L17
            r4.label = r3     // Catch: java.lang.Throwable -> L17
            java.lang.Object r5 = r5.await(r4)     // Catch: java.lang.Throwable -> L17
            if (r5 != r1) goto L40
            return r1
        L40:
            java.lang.AutoCloseable r5 = (java.lang.AutoCloseable) r5     // Catch: java.lang.Throwable -> L17
            z6.b.a(r5)     // Catch: java.lang.Throwable -> L17
            jn0.h0 r5 = jn0.h0.f84049a     // Catch: java.lang.Throwable -> L17
            jn0.s.b(r5)     // Catch: java.lang.Throwable -> L17
            goto L54
        L4b:
            jn0.s$a r0 = jn0.s.INSTANCE
            java.lang.Object r5 = jn0.t.a(r5)
            jn0.s.b(r5)
        L54:
            jn0.h0 r5 = jn0.h0.f84049a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.legere.pdfiumandroid.suspend.PdfPageSuspendCacheBase$removalListener$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
        return ((PdfPageSuspendCacheBase$removalListener$1$1$1) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
    }
}
