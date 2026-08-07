package gk;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends SuspendLambda implements wn0.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ wn0.l f69168n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ w1 f69169o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(wn0.l lVar, w1 w1Var, Continuation continuation) {
        super(2, continuation);
        this.f69168n = lVar;
        this.f69169o = w1Var;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new z0(this.f69168n, this.f69169o, continuation);
    }

    @Override // wn0.p
    public final Object invoke(Object obj, Object obj2) {
        return new z0(this.f69168n, this.f69169o, (Continuation) obj2).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        this.f69168n.invoke(((p1) this.f69169o).f69108a);
        return jn0.h0.f84049a;
    }
}
