package tb;

import android.net.NetworkRequest;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Ltb/t;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", "request", "", "a", "(Landroid/net/NetworkRequest;)[I", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f113098a = new t();

    private t() {
    }

    public final int[] a(NetworkRequest request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        int[] capabilities = request.getCapabilities();
        p013kotlin.jvm.internal.s.j(capabilities, "getCapabilities(...)");
        return capabilities;
    }

    public final int[] b(NetworkRequest request) {
        p013kotlin.jvm.internal.s.k(request, "request");
        int[] transportTypes = request.getTransportTypes();
        p013kotlin.jvm.internal.s.j(transportTypes, "getTransportTypes(...)");
        return transportTypes;
    }
}
