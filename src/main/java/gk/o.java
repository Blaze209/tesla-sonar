package gk;

import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends ContinuationImpl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u f69097n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f69098o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f69099p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f69100q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f69101r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f69102s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(u uVar, Continuation continuation) {
        super(continuation);
        this.f69101r = uVar;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f69100q = obj;
        this.f69102s |= Integer.MIN_VALUE;
        return this.f69101r.b(null, null, null, false, this);
    }
}
