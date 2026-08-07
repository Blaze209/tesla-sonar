package tb;

import android.net.NetworkRequest;
import android.net.NetworkSpecifier;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ltb/s;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "request", "Landroid/net/NetworkSpecifier;", "a", "(Landroid/net/NetworkRequest;)Landroid/net/NetworkSpecifier;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f113097a = new s();

    private s() {
    }

    public final NetworkSpecifier a(NetworkRequest request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        return request.getNetworkSpecifier();
    }
}
