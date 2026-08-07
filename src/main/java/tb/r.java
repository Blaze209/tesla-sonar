package tb;

import android.net.NetworkRequest;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ltb/r;", "", "<init>", "()V", "", "capabilities", "transports", "Landroid/net/NetworkRequest;", "a", "([I[I)Landroid/net/NetworkRequest;", "request", "", "capability", "", "c", "(Landroid/net/NetworkRequest;I)Z", "transport", DateTokenConverter.CONVERTER_KEY, "Ltb/u;", "b", "([I[I)Ltb/u;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f113096a = new r();

    private r() {
    }

    public static final NetworkRequest a(int[] capabilities, int[] transports) {
        p013kotlin.jvm.internal.s.k(capabilities, "capabilities");
        p013kotlin.jvm.internal.s.k(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i11 : capabilities) {
            try {
                builder.addCapability(i11);
            } catch (IllegalArgumentException e11) {
                androidx.work.z.e().l(NetworkRequestCompat.INSTANCE.a(), "Ignoring adding capability '" + i11 + CoreConstants.SINGLE_QUOTE_CHAR, e11);
            }
        }
        for (int i12 : v.f113102a) {
            if (!p013kotlin.collections.n.c0(capabilities, i12)) {
                try {
                    builder.removeCapability(i12);
                } catch (IllegalArgumentException e12) {
                    androidx.work.z.e().l(NetworkRequestCompat.INSTANCE.a(), "Ignoring removing default capability '" + i12 + CoreConstants.SINGLE_QUOTE_CHAR, e12);
                }
            }
        }
        for (int i13 : transports) {
            builder.addTransportType(i13);
        }
        NetworkRequest networkRequestBuild = builder.build();
        p013kotlin.jvm.internal.s.j(networkRequestBuild, "build(...)");
        return networkRequestBuild;
    }

    public final NetworkRequestCompat b(int[] capabilities, int[] transports) {
        p013kotlin.jvm.internal.s.k(capabilities, "capabilities");
        p013kotlin.jvm.internal.s.k(transports, "transports");
        return new NetworkRequestCompat(a(capabilities, transports));
    }

    public final boolean c(NetworkRequest request, int capability) {
        p013kotlin.jvm.internal.s.k(request, "request");
        return request.hasCapability(capability);
    }

    public final boolean d(NetworkRequest request, int transport) {
        p013kotlin.jvm.internal.s.k(request, "request");
        return request.hasTransport(transport);
    }
}
