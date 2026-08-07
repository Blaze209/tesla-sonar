package y20;

import kotlinx.coroutines.CoroutineScope;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ly20/e;", "Ly20/t;", "<init>", "()V", "wf1-workflow-runtime"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class e implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f124678a = new e();

    private e() {
    }

    @Override // y20.t
    public <P, S> S a(P p11, Snapshot snapshot, wn0.p<? super P, ? super Snapshot, ? extends S> pVar, t.c cVar) {
        return (S) t.a.a(this, p11, snapshot, pVar, cVar);
    }

    @Override // y20.t
    public <S> Snapshot b(S s11, wn0.l<? super S, Snapshot> lVar, t.c cVar) {
        return t.a.e(this, s11, lVar, cVar);
    }

    @Override // y20.t
    public void c(CoroutineScope coroutineScope, t.c cVar) {
        t.a.d(this, coroutineScope, cVar);
    }

    @Override // y20.t
    public <P, S, O, R> R d(P p11, S s11, a<? extends P, S, ? super O> aVar, wn0.q<? super P, ? super S, ? super t.b<P, S, O>, ? extends R> qVar, t.c cVar) {
        return (R) t.a.c(this, p11, s11, aVar, qVar, cVar);
    }

    @Override // y20.t
    public <P, S> S e(P p11, P p12, S s11, wn0.q<? super P, ? super P, ? super S, ? extends S> qVar, t.c cVar) {
        return (S) t.a.b(this, p11, p12, s11, qVar, cVar);
    }
}
