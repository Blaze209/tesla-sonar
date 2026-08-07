package i20;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\t\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R&\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00140\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018¨\u0006\u001a"}, d2 = {"Li20/b;", "", "<init>", "()V", "", "notificationType", "Li20/b$a;", "observer", "Ljn0/h0;", "a", "(Ljava/lang/String;Li20/b$a;)V", "", "c", "(Li20/b$a;)Z", "", "data", "b", "(Ljava/lang/String;Ljava/util/Map;)Z", "", "", "Li20/b$b;", "Ljava/util/Map;", "notificationMap", "Ljava/util/WeakHashMap;", "Ljava/util/WeakHashMap;", "observerMap", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f75567a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<String, List<C1574b>> notificationMap = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final WeakHashMap<a, C1574b> observerMap = new WeakHashMap<>();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li20/b$a;", "", "<init>", "()V", "", "", "data", "Ljn0/h0;", "a", "(Ljava/util/Map;)V", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class a {
        public abstract void a(Map<String, ? extends Object> data);
    }

    /* JADX INFO: renamed from: i20.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"Li20/b$b;", "Ljava/lang/ref/WeakReference;", "Li20/b$a;", "referent", "<init>", "(Li20/b$a;)V", "", "b", "()Z", "Ljn0/h0;", "a", "()V", "Z", "valid", "snowplow-android-tracker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class C1574b extends WeakReference<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean valid;

        public C1574b(a aVar) {
            super(aVar);
            this.valid = true;
        }

        public final synchronized void a() {
            this.valid = false;
            clear();
        }

        public final synchronized boolean b() {
            return this.valid && get() != null;
        }
    }

    private b() {
    }

    public static final synchronized void a(String notificationType, a observer) {
        try {
            s.k(notificationType, "notificationType");
            s.k(observer, "observer");
            C1574b c1574b = new C1574b(observer);
            C1574b c1574bPut = observerMap.put(observer, c1574b);
            if (c1574bPut != null) {
                c1574bPut.a();
            }
            Map<String, List<C1574b>> map = notificationMap;
            List<C1574b> linkedList = map.get(notificationType);
            if (linkedList == null) {
                linkedList = new LinkedList<>();
                map.put(notificationType, linkedList);
            }
            linkedList.add(c1574b);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static final synchronized boolean b(String notificationType, Map<String, ? extends Object> data) {
        try {
            s.k(notificationType, "notificationType");
            s.k(data, "data");
            List<C1574b> list = notificationMap.get(notificationType);
            if (list != null && !list.isEmpty()) {
                Iterator<C1574b> it = list.iterator();
                while (it.hasNext()) {
                    C1574b next = it.next();
                    if (next.b()) {
                        HashMap map = new HashMap(data);
                        a aVar = next.get();
                        if (aVar != null) {
                            aVar.a(map);
                        }
                    } else {
                        synchronized (b.class) {
                            it.remove();
                            h0 h0Var = h0.f84049a;
                        }
                    }
                }
                return !list.isEmpty();
            }
            return false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static final synchronized boolean c(a observer) {
        s.k(observer, "observer");
        C1574b c1574bRemove = observerMap.remove(observer);
        if (c1574bRemove == null) {
            return false;
        }
        c1574bRemove.a();
        return true;
    }
}
