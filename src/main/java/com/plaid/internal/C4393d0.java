package com.plaid.internal;

import java.util.Iterator;
import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$clear$2", f = "CrashStorage.kt", i = {}, l = {47, 47}, m = "invokeSuspend", n = {}, s = {})
public final class C4393d0 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C4429h0 f47610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f47611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4429h0 f47613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4393d0(C4429h0 c4429h0, Continuation<? super C4393d0> continuation) {
        super(2, continuation);
        this.f47613d = c4429h0;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4393d0(this.f47613d, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new C4393d0(this.f47613d, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:21:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:? A[LOOP:0: B:14:0x003a->B:24:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002f, code lost:
    
        if (r6 == r0) goto L18;
     */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = p013kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.f47612c
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r5.f47611b
            com.plaid.internal.h0 r3 = r5.f47610a
            jn0.t.b(r6)
            goto L3a
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            jn0.t.b(r6)
            goto L32
        L22:
            jn0.t.b(r6)
            com.plaid.internal.h0 r6 = r5.f47613d
            r5.f47612c = r3
            com.plaid.internal.i5 r6 = r6.f47698a
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L32
            goto L54
        L32:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            com.plaid.internal.h0 r3 = r5.f47613d
            java.util.Iterator r1 = r6.iterator()
        L3a:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L55
            java.lang.Object r6 = r1.next()
            java.lang.String r6 = (java.lang.String) r6
            com.plaid.internal.i5 r4 = r3.f47698a
            r5.f47610a = r3
            r5.f47611b = r1
            r5.f47612c = r2
            java.lang.Object r6 = r4.a(r6, r5)
            if (r6 != r0) goto L3a
        L54:
            return r0
        L55:
            jn0.h0 r6 = jn0.h0.f84049a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.plaid.internal.C4393d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
