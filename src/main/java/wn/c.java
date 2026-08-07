package wn;

import android.util.SparseArray;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0019B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\u000eJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\nJ\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0014R\"\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00020\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR \u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020)0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010*¨\u0006,"}, d2 = {"Lwn/c;", "", "Lcom/facebook/react/bridge/ReactContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactContext;)V", "", "taskId", "Ljn0/h0;", IntegerTokenConverter.CONVERTER_KEY, "(I)V", "Lwn/d;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "c", "(Lwn/d;)V", "h", "", "f", "()Z", "j", "(I)Z", DateTokenConverter.CONVERTER_KEY, "g", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "a", "Ljava/lang/ref/WeakReference;", "", "b", "Ljava/util/Set;", "headlessJsTaskEventListeners", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "lastTaskId", "activeTasks", "", "Lwn/a;", "e", "Ljava/util/Map;", "activeTaskConfigs", "Landroid/util/SparseArray;", "Ljava/lang/Runnable;", "Landroid/util/SparseArray;", "taskTimeouts", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final WeakHashMap<ReactContext, c> f122094h = new WeakHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final WeakReference<ReactContext> reactContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<d> headlessJsTaskEventListeners;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger lastTaskId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<Integer> activeTasks;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, a> activeTaskConfigs;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final SparseArray<Runnable> taskTimeouts;

    /* JADX INFO: renamed from: wn.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lwn/c$a;", "", "<init>", "()V", "Lcom/facebook/react/bridge/ReactContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lwn/c;", "a", "(Lcom/facebook/react/bridge/ReactContext;)Lwn/c;", "Ljava/util/WeakHashMap;", "INSTANCES", "Ljava/util/WeakHashMap;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(ReactContext context) {
            s.k(context, "context");
            WeakHashMap weakHashMap = c.f122094h;
            Object cVar = weakHashMap.get(context);
            if (cVar == null) {
                cVar = new c(context, null);
                weakHashMap.put(context, cVar);
            }
            return (c) cVar;
        }

        private Companion() {
        }
    }

    public /* synthetic */ c(ReactContext reactContext, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(c cVar, int i11) {
        Iterator<d> it = cVar.headlessJsTaskEventListeners.iterator();
        while (it.hasNext()) {
            it.next().a(i11);
        }
    }

    private final void i(int taskId) {
        Runnable runnable = this.taskTimeouts.get(taskId);
        if (runnable != null) {
            UiThreadUtil.removeOnUiThread(runnable);
            this.taskTimeouts.remove(taskId);
        }
    }

    public final synchronized void c(d listener) {
        s.k(listener, "listener");
        this.headlessJsTaskEventListeners.add(listener);
        Iterator<Integer> it = this.activeTasks.iterator();
        while (it.hasNext()) {
            listener.b(it.next().intValue());
        }
    }

    public final synchronized void d(final int taskId) {
        boolean zRemove = this.activeTasks.remove(Integer.valueOf(taskId));
        this.activeTaskConfigs.remove(Integer.valueOf(taskId));
        i(taskId);
        if (zRemove) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: wn.b
                @Override // java.lang.Runnable
                public final void run() {
                    c.e(this.f122091a, taskId);
                }
            });
        }
    }

    public final boolean f() {
        return !this.activeTasks.isEmpty();
    }

    public final synchronized boolean g(int taskId) {
        return this.activeTasks.contains(Integer.valueOf(taskId));
    }

    public final void h(d listener) {
        s.k(listener, "listener");
        this.headlessJsTaskEventListeners.remove(listener);
    }

    public final synchronized boolean j(int taskId) {
        a aVar = this.activeTaskConfigs.get(Integer.valueOf(taskId));
        if (aVar == null) {
            throw new IllegalStateException(("Tried to retrieve non-existent task config with id " + taskId + ".").toString());
        }
        aVar.a();
        return false;
    }

    private c(ReactContext reactContext) {
        this.reactContext = new WeakReference<>(reactContext);
        this.headlessJsTaskEventListeners = new CopyOnWriteArraySet();
        this.lastTaskId = new AtomicInteger(0);
        this.activeTasks = new CopyOnWriteArraySet();
        this.activeTaskConfigs = new ConcurrentHashMap();
        this.taskTimeouts = new SparseArray<>();
    }
}
