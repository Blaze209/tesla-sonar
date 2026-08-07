package ff0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p013kotlin.Lazy;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R#\u0010 \u001a\n \u001b*\u0004\u0018\u00010\u001a0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lff0/f;", "", "<init>", "()V", "Ljava/util/LinkedList;", "Lff0/k;", "f", "()Ljava/util/LinkedList;", "", "vin", "Lff0/m;", "g", "(Ljava/lang/String;)Ljava/util/LinkedList;", "event", "Ljn0/h0;", "h", "(Lff0/k;)V", "j", "(Ljava/lang/String;Lff0/m;)V", "b", "Ljava/util/LinkedList;", "serviceEventList", "Ljava/util/concurrent/ConcurrentHashMap;", "c", "Ljava/util/concurrent/ConcurrentHashMap;", "vinToVehicleEventList", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", DateTokenConverter.CONVERTER_KEY, "Lkotlin/Lazy;", "e", "()Ljava/util/concurrent/ExecutorService;", "executor", "tesla-ble_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f65830a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final LinkedList<k> serviceEventList = new LinkedList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final ConcurrentHashMap<String, LinkedList<m>> vinToVehicleEventList = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Lazy executor = jn0.m.b(new wn0.a() { // from class: ff0.c
        @Override // wn0.a
        public final Object invoke() {
            return f.d();
        }
    });

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ExecutorService d() {
        return Executors.newSingleThreadExecutor();
    }

    private final ExecutorService e() {
        return (ExecutorService) executor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(k kVar) {
        LinkedList<k> linkedList = serviceEventList;
        if (linkedList.size() >= 1000) {
            linkedList.removeFirst();
        }
        linkedList.add(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(String str, m mVar) {
        ConcurrentHashMap<String, LinkedList<m>> concurrentHashMap = vinToVehicleEventList;
        concurrentHashMap.putIfAbsent(str, new LinkedList<>());
        LinkedList<m> linkedList = concurrentHashMap.get(str);
        if (linkedList == null) {
            return;
        }
        if (linkedList.size() >= 1000) {
            linkedList.removeFirst();
        }
        linkedList.add(mVar);
    }

    public final LinkedList<k> f() {
        return serviceEventList;
    }

    public final LinkedList<m> g(String vin) {
        s.k(vin, "vin");
        return vinToVehicleEventList.get(vin);
    }

    public final void h(final k event) {
        s.k(event, "event");
        e().submit(new Runnable() { // from class: ff0.d
            @Override // java.lang.Runnable
            public final void run() {
                f.i(event);
            }
        });
    }

    public final void j(final String vin, final m event) {
        s.k(vin, "vin");
        s.k(event, "event");
        e().submit(new Runnable() { // from class: ff0.e
            @Override // java.lang.Runnable
            public final void run() {
                f.k(vin, event);
            }
        });
    }
}
