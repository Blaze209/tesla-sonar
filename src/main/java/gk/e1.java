package gk;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends SuspendLambda implements wn0.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ wn0.l f69045n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Throwable f69046o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(wn0.l lVar, Throwable th2, Continuation continuation) {
        super(2, continuation);
        this.f69045n = lVar;
        this.f69046o = th2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new e1(this.f69045n, this.f69046o, continuation);
    }

    @Override // wn0.p
    public final Object invoke(Object obj, Object obj2) {
        return new e1(this.f69045n, this.f69046o, (Continuation) obj2).invokeSuspend(jn0.h0.f84049a);
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        jn0.t.b(obj);
        this.f69045n.invoke(new fk.c(this.f69046o.getMessage(), fk.d.INTERNAL));
        return jn0.h0.f84049a;
    }
}
