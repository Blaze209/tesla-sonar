package coil3.network;

import nc.NetworkResponse;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcoil3/network/HttpException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "Lnc/p;", "response", "<init>", "(Lnc/p;)V", "a", "Lnc/p;", "getResponse", "()Lnc/p;", "coil-network-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HttpException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final NetworkResponse response;

    public HttpException(NetworkResponse networkResponse) {
        super("HTTP " + networkResponse.getCode());
        this.response = networkResponse;
    }
}
