package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$getCrashes$2", f = "CrashStorage.kt", i = {1}, l = {36, 38}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$1"})
public final class C4402e0 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super List<? extends Crash>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4429h0 f47626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f47627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Iterator f47628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f47629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4429h0 f47630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4402e0(C4429h0 c4429h0, Continuation<? super C4402e0> continuation) {
        super(2, continuation);
        this.f47630e = c4429h0;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4402e0(this.f47630e, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Crash>> continuation) {
        return new C4402e0(this.f47630e, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005f, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:24:0x0062). Please report as a decompilation issue!!! */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.f47629d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L26
            if (r1 == r3) goto L22
            if (r1 != r2) goto L1a
            java.util.Iterator r1 = r6.f47628c
            java.util.Collection r3 = r6.f47627b
            com.plaid.internal.h0 r4 = r6.f47626a
            jn0.t.b(r7)     // Catch: java.lang.Throwable -> L18
            goto L62
        L18:
            r7 = move-exception
            goto L65
        L1a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L22:
            jn0.t.b(r7)
            goto L36
        L26:
            jn0.t.b(r7)
            com.plaid.internal.h0 r7 = r6.f47630e
            r6.f47629d = r3
            com.plaid.internal.i5 r7 = r7.f47698a
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L36
            goto L61
        L36:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            com.plaid.internal.h0 r1 = r6.f47630e
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r7 = r7.iterator()
            r4 = r1
            r1 = r7
        L45:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L78
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Type r5 = r4.f47701d     // Catch: java.lang.Throwable -> L18
            r6.f47626a = r4     // Catch: java.lang.Throwable -> L18
            r6.f47627b = r3     // Catch: java.lang.Throwable -> L18
            r6.f47628c = r1     // Catch: java.lang.Throwable -> L18
            r6.f47629d = r2     // Catch: java.lang.Throwable -> L18
            java.lang.Object r7 = com.plaid.internal.C4429h0.a(r4, r7, r5, r6)     // Catch: java.lang.Throwable -> L18
            if (r7 != r0) goto L62
        L61:
            return r0
        L62:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L18
            goto L74
        L65:
            com.plaid.internal.X5$a r5 = com.plaid.internal.X5.f46812a
            com.plaid.internal.X5.a.a(r5, r7)
            com.plaid.internal.b0 r5 = r4.f47699b
            com.plaid.internal.core.crashreporting.internal.models.Crash r7 = r5.a(r7)
            java.util.List r7 = p013kotlin.collections.v.e(r7)
        L74:
            p013kotlin.collections.v.E(r3, r7)
            goto L45
        L78:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4402e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
