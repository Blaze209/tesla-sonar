package ne0;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.concurrent.ConcurrentHashMap;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u000b\"\u0004\b\u0001\u0010\f*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJH\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u000b*\u00020\u0010\"\b\b\u0001\u0010\f*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u0011\u001a\u00028\u0000H\u0082\u0002¢\u0006\u0004\b\u0012\u0010\u0013JT\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\b\b\u0000\u0010\u000b*\u00020\u0010\"\b\b\u0001\u0010\f*\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0082\u0002¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\nR,\u0010 \u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u001e0\r0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001f¨\u0006!"}, d2 = {"Lne0/a;", "Lne0/b;", "<init>", "()V", "", "vin", "Lne0/c;", "command", "Ljn0/h0;", "g", "(Ljava/lang/String;Lne0/c;)V", "K", "V", "Ljava/util/concurrent/ConcurrentHashMap;", "e", "(Ljava/util/concurrent/ConcurrentHashMap;)Ljava/util/concurrent/ConcurrentHashMap;", "", Action.KEY_ATTRIBUTE, DateTokenConverter.CONVERTER_KEY, "(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/Object;)Ljava/util/concurrent/ConcurrentHashMap;", "Lkotlin/Pair;", "pair", "f", "(Ljava/util/concurrent/ConcurrentHashMap;Lkotlin/Pair;)Ljava/util/concurrent/ConcurrentHashMap;", "a", "(Ljava/lang/String;Lne0/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "(Ljava/lang/String;Lne0/c;)Z", "c", "", "Ljava/util/concurrent/ConcurrentHashMap;", "executionTimestamp", "widget_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93899a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, ConcurrentHashMap<c, Long>> executionTimestamp = new ConcurrentHashMap<>();

    private a() {
    }

    private final <K, V> ConcurrentHashMap<K, V> d(ConcurrentHashMap<K, V> concurrentHashMap, K k11) {
        s.k(concurrentHashMap, "<this>");
        concurrentHashMap.remove(k11);
        return concurrentHashMap;
    }

    private final <K, V> ConcurrentHashMap<K, V> e(ConcurrentHashMap<K, V> concurrentHashMap) {
        return concurrentHashMap == null ? new ConcurrentHashMap<>() : concurrentHashMap;
    }

    private final <K, V> ConcurrentHashMap<K, V> f(ConcurrentHashMap<K, V> concurrentHashMap, Pair<? extends K, ? extends V> pair) {
        s.k(concurrentHashMap, "<this>");
        concurrentHashMap.put(pair.e(), pair.f());
        return concurrentHashMap;
    }

    private final void g(String vin, c command) {
        ConcurrentHashMap<String, ConcurrentHashMap<c, Long>> concurrentHashMap = executionTimestamp;
        concurrentHashMap.put(vin, f(e(concurrentHashMap.get(vin)), x.a(command, Long.valueOf(System.currentTimeMillis()))));
    }

    @Override // ne0.b
    public Object a(String str, c cVar, Continuation<? super h0> continuation) {
        if (b(str, cVar)) {
            me0.c.a().a("Command: " + cVar.name() + " for vehicle: " + str + " is still under execution time window, skipped.");
        } else {
            g(str, cVar);
        }
        return h0.f84049a;
    }

    @Override // ne0.b
    public boolean b(String vin, c command) {
        Long l11;
        s.k(vin, "vin");
        s.k(command, "command");
        ConcurrentHashMap<c, Long> concurrentHashMap = executionTimestamp.get(vin);
        return System.currentTimeMillis() - ((concurrentHashMap == null || (l11 = concurrentHashMap.get(command)) == null) ? 0L : l11.longValue()) < 3000;
    }

    @Override // ne0.b
    public void c(String vin, c command) {
        s.k(vin, "vin");
        s.k(command, "command");
        ConcurrentHashMap<String, ConcurrentHashMap<c, Long>> concurrentHashMap = executionTimestamp;
        concurrentHashMap.put(vin, d(e(concurrentHashMap.get(vin)), command));
    }
}
