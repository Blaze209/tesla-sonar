package gk;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class i1 extends ContinuationImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public m1 f69066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f69067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ m1 f69068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f69069q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(m1 m1Var, Continuation continuation) {
        super(continuation);
        this.f69068p = m1Var;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f69067o = obj;
        this.f69069q |= Integer.MIN_VALUE;
        return this.f69068p.b(null, this);
    }
}
