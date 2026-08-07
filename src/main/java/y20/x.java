package y20;

import ch.qos.logback.core.joran.action.Action;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\f0\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"T", "PropsT", "StateT", "OutputT", "Ly20/a;", "Ly20/o;", "worker", "Lco0/q;", "workerType", "", Action.KEY_ATTRIBUTE, "Lkotlin/Function1;", "Ly20/r;", "handler", "Ljn0/h0;", "a", "(Ly20/a;Ly20/o;Lco0/q;Ljava/lang/String;Lwn0/l;)V", "wf1-workflow-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "com/squareup/workflow1/Workflows")
final /* synthetic */ class x {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, PropsT, StateT, OutputT> void a(a<? extends PropsT, StateT, ? super OutputT> aVar, o<? extends T> worker, co0.q workerType, String key, wn0.l<? super T, ? extends r<? super PropsT, StateT, ? extends OutputT>> handler) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        p013kotlin.jvm.internal.s.k(worker, "worker");
        p013kotlin.jvm.internal.s.k(workerType, "workerType");
        p013kotlin.jvm.internal.s.k(key, "key");
        p013kotlin.jvm.internal.s.k(handler, "handler");
        aVar.d(new p(workerType, key), worker, key, handler);
    }
}
