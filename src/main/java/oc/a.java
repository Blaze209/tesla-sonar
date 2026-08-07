package oc;

import nc.NetworkRequest;
import nc.NetworkResponse;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import rc.Options;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ2\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Loc/a;", "Lnc/b;", "<init>", "()V", "Lnc/p;", "cacheResponse", "Lnc/n;", "networkRequest", "Lrc/n;", "options", "Lnc/b$b;", "a", "(Lnc/p;Lnc/n;Lrc/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkResponse", "Lnc/b$c;", "b", "(Lnc/p;Lnc/n;Lnc/p;Lrc/n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements nc.b {
    @Override // nc.b
    public Object a(NetworkResponse networkResponse, NetworkRequest networkRequest, Options options, Continuation<? super nc.b.ReadResult> continuation) {
        return new nc.b.ReadResult(networkResponse);
    }

    @Override // nc.b
    public Object b(NetworkResponse networkResponse, NetworkRequest networkRequest, NetworkResponse networkResponse2, Options options, Continuation<? super nc.b.WriteResult> continuation) {
        return (networkResponse2.getCode() != 304 || networkResponse == null) ? new nc.b.WriteResult(networkResponse2) : new nc.b.WriteResult(NetworkResponse.b(networkResponse2, 0, 0L, 0L, e.d(networkResponse.getHeaders(), networkResponse2.getHeaders()), null, null, 39, null));
    }
}
