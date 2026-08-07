package fb0;

import android.util.LruCache;
import ce0.TeslaCommandRequest;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.tesla.messagedecoding.CommandMessageDecoder;
import java.util.concurrent.ConcurrentHashMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR \u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\"¨\u0006$"}, d2 = {"Lfb0/n;", "", "<init>", "()V", "", "requestId", "Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;", "result", "a", "(Ljava/lang/String;Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;)Ljava/lang/String;", "Lce0/j;", "request", "Lam0/b;", "disposable", "Ljn0/h0;", "e", "(Lce0/j;Lam0/b;)V", "", "g", "(Lce0/j;)Ljava/lang/Boolean;", "enabled", DateTokenConverter.CONVERTER_KEY, "(Lce0/j;Z)V", "f", "(Lce0/j;)V", "c", "(Ljava/lang/String;Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;)V", "b", "(Ljava/lang/String;Lcom/tesla/messagedecoding/CommandMessageDecoder$Result;)Z", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "vehicleHasResponseCachingFeature", "repeatingRequests", "Landroid/util/LruCache;", "Landroid/util/LruCache;", "responseReceived", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f64834a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, Boolean> vehicleHasResponseCachingFeature = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, am0.b> repeatingRequests = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final LruCache<String, Boolean> responseReceived = new LruCache<>(50);

    private n() {
    }

    private final String a(String requestId, CommandMessageDecoder.Result result) {
        return requestId + " " + result;
    }

    public final boolean b(String requestId, CommandMessageDecoder.Result result) {
        s.k(requestId, "requestId");
        s.k(result, "result");
        return s.f(responseReceived.get(a(requestId, result)), Boolean.TRUE);
    }

    public final void c(String requestId, CommandMessageDecoder.Result result) {
        s.k(requestId, "requestId");
        s.k(result, "result");
        responseReceived.put(a(requestId, result), Boolean.TRUE);
    }

    public final void d(TeslaCommandRequest request, boolean enabled) {
        s.k(request, "request");
        vehicleHasResponseCachingFeature.put(request.getVin(), Boolean.valueOf(enabled));
    }

    public final void e(TeslaCommandRequest request, am0.b disposable) {
        s.k(request, "request");
        s.k(disposable, "disposable");
        f(request);
        repeatingRequests.put(request.q(), disposable);
    }

    public final void f(TeslaCommandRequest request) {
        s.k(request, "request");
        am0.b bVarRemove = repeatingRequests.remove(request.q());
        if (bVarRemove != null) {
            bVarRemove.dispose();
        }
    }

    public final Boolean g(TeslaCommandRequest request) {
        s.k(request, "request");
        return vehicleHasResponseCachingFeature.get(request.getVin());
    }
}
