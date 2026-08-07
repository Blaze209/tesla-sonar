package yh0;

import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002H\u0086@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "maxAttempts", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "block", "Ljn0/h0;", "a", "(ILwn0/p;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class u {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.withpersona.sdk2.inquiry.shared.RetryKt", f = "Retry.kt", i = {0, 0, 0}, l = {13}, m = "retry", n = {"block", "maxAttempts", "attempts"}, s = {"L$0", "I$0", "I$1"})
    static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f125584n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f125585o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f125586p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f125587q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f125588r;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f125587q = obj;
            this.f125588r |= Integer.MIN_VALUE;
            return u.a(0, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:18:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0056 -> B:20:0x0059). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(int r5, wn0.p<? super java.lang.Integer, ? super p013kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r6, p013kotlin.coroutines.Continuation<? super jn0.h0> r7) {
        /*
            boolean r0 = r7 instanceof yh0.u.a
            if (r0 == 0) goto L13
            r0 = r7
            yh0.u$a r0 = (yh0.u.a) r0
            int r1 = r0.f125588r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f125588r = r1
            goto L18
        L13:
            yh0.u$a r0 = new yh0.u$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f125587q
            java.lang.Object r1 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f125588r
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r5 = r0.f125585o
            int r6 = r0.f125584n
            java.lang.Object r2 = r0.f125586p
            wn0.p r2 = (wn0.p) r2
            jn0.t.b(r7)
            goto L59
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            jn0.t.b(r7)
            r7 = 0
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L41:
            if (r5 >= r6) goto L65
            java.lang.Integer r2 = p013kotlin.coroutines.jvm.internal.Boxing.boxInt(r5)
            r0.f125586p = r7
            r0.f125584n = r6
            r0.f125585o = r5
            r0.f125588r = r3
            java.lang.Object r2 = r7.invoke(r2, r0)
            if (r2 != r1) goto L56
            return r1
        L56:
            r4 = r2
            r2 = r7
            r7 = r4
        L59:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L62
            goto L65
        L62:
            int r5 = r5 + r3
            r7 = r2
            goto L41
        L65:
            jn0.h0 r5 = jn0.h0.f84049a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yh0.u.a(int, wn0.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
