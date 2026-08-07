package gk;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends SuspendLambda implements wn0.p {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b1 f69017n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public wn0.l f69018o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public f1 f69019p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public wn0.l f69020q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public wn0.l f69021r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f69022s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ f1 f69023t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ wn0.l f69024u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ fk.a f69025v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ wn0.l f69026w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(f1 f1Var, wn0.l lVar, fk.a aVar, wn0.l lVar2, Continuation continuation) {
        super(2, continuation);
        this.f69023t = f1Var;
        this.f69024u = lVar;
        this.f69025v = aVar;
        this.f69026w = lVar2;
    }

    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c1(this.f69023t, this.f69024u, this.f69025v, this.f69026w, continuation);
    }

    @Override // wn0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(jn0.h0.f84049a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r4, r5, r11) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e2, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r3, r4, r11) == r0) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v3, types: [gk.b1] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [gk.b1, gk.f1] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [gk.f1] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [gk.b1] */
    /* JADX WARN: Type inference failed for: r9v4 */
    @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
