package ef0;

import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lef0/p;", "", "<init>", "()V", "Ljn0/h0;", "a", "Lcom/tesla/logging/g;", "b", "Lcom/tesla/logging/g;", "getLogger", "()Lcom/tesla/logging/g;", "logger", "Ljava/util/concurrent/ConcurrentHashMap;", "", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "getCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "cache", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f62921a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final com.tesla.logging.g logger = com.tesla.logging.g.INSTANCE.a("VinMappingUtils");

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, String> cache = new ConcurrentHashMap<>();

    private p() {
    }

    public static final void a() {
        td0.m.j().s(v.m(), v.p("_KEY_CARD_VIN_", "_KEY_CARD_SALTED_VIN_"));
        cache.clear();
    }
}
