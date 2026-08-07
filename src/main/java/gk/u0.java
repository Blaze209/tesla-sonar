package gk;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 extends SuspendLambda implements wn0.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ wn0.l f69144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w1 f69145o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(wn0.l lVar, w1 w1Var, Continuation continuation) {
        super(2, continuation);
        this.f69144n = lVar;
        this.f69145o = w1Var;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u0(this.f69144n, this.f69145o, continuation);
    }

    @Override // wn0.p
    public final Object invoke(Object obj, Object obj2) {
        return new u0(this.f69144n, this.f69145o, (Continuation) obj2).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        this.f69144n.invoke(((t1) this.f69145o).f69139a);
        return jn0.h0.f84049a;
    }
}
