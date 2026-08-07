package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: renamed from: com.plaid.internal.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$storeCrashes$2", f = "CrashStorage.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
public final class C4420g0 extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super jn0.h0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f47674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4429h0 f47675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Crash[] f47676c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4420g0(C4429h0 c4429h0, Crash[] crashArr, Continuation<? super C4420g0> continuation) {
        super(2, continuation);
        this.f47675b = c4429h0;
        this.f47676c = crashArr;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<jn0.h0> create(Object obj, Continuation<?> continuation) {
        return new C4420g0(this.f47675b, this.f47676c, continuation);
    }

    @Override // wn0.p
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super jn0.h0> continuation) {
        return new C4420g0(this.f47675b, this.f47676c, continuation).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f47674a;
        if (i11 == 0) {
            jn0.t.b(obj);
            C4443i5 c4443i5 = this.f47675b.f47698a;
            String strA = C4429h0.a();
            String strS = this.f47675b.f47700c.s(p013kotlin.collections.n.h(this.f47676c));
            p013kotlin.jvm.internal.s.j(strS, "toJson(...)");
            this.f47674a = 1;
            Object objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new C4434h5(c4443i5, strA, strS, null), this);
            if (objWithContext != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objWithContext = jn0.h0.f84049a;
            }
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
        }
        return jn0.h0.f84049a;
    }
}
