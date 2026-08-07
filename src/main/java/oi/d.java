package oi;

import ii.f;
import ii.g;
import ii.v;
import ii.z;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ;\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f\"\b\b\u0000\u0010\n*\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Loi/d;", "Loi/a;", "Lri/a;", "networkTransport", "subscriptionNetworkTransport", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lri/a;Lri/a;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lii/v$a;", "D", "Lii/f;", "request", "Loi/b;", "chain", "Lkotlinx/coroutines/flow/Flow;", "Lii/g;", "a", "(Lii/f;Loi/b;)Lkotlinx/coroutines/flow/Flow;", "Lri/a;", "b", "c", "Lkotlinx/coroutines/CoroutineDispatcher;", "apollo-runtime"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ri.a networkTransport;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ri.a subscriptionNetworkTransport;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CoroutineDispatcher dispatcher;

    public d(ri.a networkTransport, ri.a subscriptionNetworkTransport, CoroutineDispatcher dispatcher) {
        s.k(networkTransport, "networkTransport");
        s.k(subscriptionNetworkTransport, "subscriptionNetworkTransport");
        s.k(dispatcher, "dispatcher");
        this.networkTransport = networkTransport;
        this.subscriptionNetworkTransport = subscriptionNetworkTransport;
        this.dispatcher = dispatcher;
    }

    @Override // oi.a
    public <D extends v.a> Flow<g<D>> a(f<D> request, b chain) {
        s.k(request, "request");
        s.k(chain, "chain");
        if (request.f() instanceof z) {
            return FlowKt.flowOn(this.networkTransport.a(request), this.dispatcher);
        }
        throw new IllegalStateException("");
    }
}
