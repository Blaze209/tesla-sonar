package gk;

import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class t0 extends SuspendLambda implements wn0.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f69136n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ y0 f69137o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ String f69138p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(y0 y0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.f69137o = y0Var;
        this.f69138p = str;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t0(this.f69137o, this.f69138p, continuation);
    }

    @Override // wn0.p
    public final Object invoke(Object obj, Object obj2) {
        return new t0(this.f69137o, this.f69138p, (Continuation) obj2).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.f69136n;
        if (i11 == 0) {
            jn0.t.b(obj);
            y0 y0Var = this.f69137o;
            y0Var.f69164c.c(p013kotlin.collections.v.p(new Pair("x-version", "1.1.0"), new Pair("x-fields-api-key", y0Var.f69163b.f69070a)));
            y0 y0Var2 = this.f69137o;
            u uVar = y0Var2.f69164c;
            j jVar = y0Var2.f69163b;
            p013kotlin.jvm.internal.s.k(jVar, "<this>");
            String str = jVar.f69072c ? "https://sandbox.dlocal.com/mobile/tracing/event" : "https://api.dlocal.com/mobile/tracing/event";
            String str2 = this.f69138p;
            this.f69136n = 1;
            uVar.getClass();
            if (uVar.b(str, k.f69076a, str2, false, this) == coroutine_suspended) {
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
