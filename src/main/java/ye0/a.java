package ye0;

import ce0.TeslaCommandRequest;
import ch.qos.logback.core.joran.action.Action;
import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010¨\u0006\u0012"}, d2 = {"Lye0/a;", "", "<init>", "()V", "", Action.KEY_ATTRIBUTE, "Lce0/j;", "request", "Ljn0/h0;", "c", "(Ljava/lang/String;Lce0/j;)V", "b", "(Ljava/lang/String;)Lce0/j;", "a", "(Ljava/lang/String;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "requests", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.tesla.logging.g f125395c = com.tesla.logging.g.INSTANCE.a("InFlightRequests");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ConcurrentHashMap<String, TeslaCommandRequest> requests = new ConcurrentHashMap<>();

    public final void a(String key) {
        s.k(key, "key");
        TeslaCommandRequest teslaCommandRequestRemove = this.requests.remove(key);
        if (teslaCommandRequestRemove != null) {
            de0.a.f(teslaCommandRequestRemove, "is no longer the in-flight request for key: " + key + ".", f125395c, null, false, 4, null);
        }
    }

    public final TeslaCommandRequest b(String key) {
        s.k(key, "key");
        return this.requests.get(key);
    }

    public final void c(String key, TeslaCommandRequest request) {
        s.k(key, "key");
        s.k(request, "request");
        TeslaCommandRequest teslaCommandRequestPut = this.requests.put(key, request);
        if (teslaCommandRequestPut != null) {
            de0.a.f(teslaCommandRequestPut, "is being replaced as the in-flight request by " + de0.a.j(request, "", false, 2, null) + ".", f125395c, null, false, 4, null);
        }
        de0.a.f(request, "set as in-flight request for key: " + key + ".", f125395c, null, false, 4, null);
    }
}
