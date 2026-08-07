package com.facebook.react.uimanager.events;

import android.os.Handler;
import android.view.Choreographer;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.b1;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0002\u001d\"B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001b\u0010\u000f\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\rJ\u001f\u0010\"\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0017¢\u0006\u0004\b\"\u0010#J\u001f\u0010%\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010*R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010,R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00110-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00160-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010.R\u0018\u00103\u001a\u000601R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u00105R\u0014\u00109\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u00108¨\u0006:"}, d2 = {"Lcom/facebook/react/uimanager/events/k;", "Lcom/facebook/react/uimanager/events/EventDispatcher;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/uimanager/events/d;", "event", "Ljn0/h0;", "r", "(Lcom/facebook/react/uimanager/events/d;)V", "t", "()V", "p", "h", DateTokenConverter.CONVERTER_KEY, "Lcom/facebook/react/uimanager/events/g;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "g", "(Lcom/facebook/react/uimanager/events/g;)V", "c", "Lcom/facebook/react/uimanager/events/a;", "e", "(Lcom/facebook/react/uimanager/events/a;)V", IntegerTokenConverter.CONVERTER_KEY, "onHostResume", "onHostPause", "onHostDestroy", "b", "", "uiManagerType", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "eventEmitter", "a", "(ILcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "j", "(ILcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V", "f", "(I)V", "Lcom/facebook/react/uimanager/events/ReactEventEmitter;", "Lcom/facebook/react/uimanager/events/ReactEventEmitter;", "reactEventEmitter", "Lcom/facebook/react/bridge/ReactApplicationContext;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "postEventDispatchListeners", "Lcom/facebook/react/uimanager/events/k$b;", "Lcom/facebook/react/uimanager/events/k$b;", "currentFrameCallback", "", "Z", "isDispatchScheduled", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "dispatchEventsRunnable", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class k implements EventDispatcher, LifecycleEventListener {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f23165h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Handler f23166i;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactEventEmitter reactEventEmitter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReactApplicationContext reactContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<g> listeners;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<com.facebook.react.uimanager.events.a> postEventDispatchListeners;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b currentFrameCallback;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isDispatchScheduled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Runnable dispatchEventsRunnable;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/uimanager/events/k$a;", "", "<init>", "()V", "Landroid/os/Handler;", "uiThreadHandler", "Landroid/os/Handler;", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0006J\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0006J\r\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0006J\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/facebook/react/uimanager/events/k$b;", "Landroid/view/Choreographer$FrameCallback;", "<init>", "(Lcom/facebook/react/uimanager/events/k;)V", "Ljn0/h0;", "b", "()V", "", "frameTimeNanos", "doFrame", "(J)V", "g", "f", "c", DateTokenConverter.CONVERTER_KEY, "", "a", "Z", "isFrameCallbackDispatchScheduled", "shouldStop", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class b implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private volatile boolean isFrameCallbackDispatchScheduled;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean shouldStop;

        public b() {
        }

        private final void b() {
            com.facebook.react.modules.core.b.INSTANCE.a().k(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, k.this.currentFrameCallback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(b bVar) {
            bVar.c();
        }

        public final void c() {
            if (this.isFrameCallbackDispatchScheduled) {
                return;
            }
            this.isFrameCallbackDispatchScheduled = true;
            b();
        }

        public final void d() {
            if (this.isFrameCallbackDispatchScheduled) {
                return;
            }
            if (k.this.reactContext.isOnUiQueueThread()) {
                c();
            } else {
                k.this.reactContext.runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.uimanager.events.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.b.e(this.f23177a);
                    }
                });
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long frameTimeNanos) {
            UiThreadUtil.assertOnUiThread();
            if (this.shouldStop) {
                this.isFrameCallbackDispatchScheduled = false;
            } else {
                b();
            }
            ep.a.c(0L, "BatchEventDispatchedListeners");
            try {
                Iterator it = k.this.postEventDispatchListeners.iterator();
                p013kotlin.jvm.internal.s.j(it, "iterator(...)");
                while (it.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it.next()).onBatchEventDispatched();
                }
                ep.a.i(0L);
            } catch (Throwable th2) {
                ep.a.i(0L);
                throw th2;
            }
        }

        public final void f() {
            this.shouldStop = false;
        }

        public final void g() {
            this.shouldStop = true;
        }
    }

    static {
        Handler uiThreadHandler = UiThreadUtil.getUiThreadHandler();
        p013kotlin.jvm.internal.s.j(uiThreadHandler, "getUiThreadHandler(...)");
        f23166i = uiThreadHandler;
    }

    public k(ReactApplicationContext reactContext) {
        p013kotlin.jvm.internal.s.k(reactContext, "reactContext");
        this.reactContext = reactContext;
        this.listeners = new CopyOnWriteArrayList<>();
        this.postEventDispatchListeners = new CopyOnWriteArrayList<>();
        this.currentFrameCallback = new b();
        this.dispatchEventsRunnable = new Runnable() { // from class: com.facebook.react.uimanager.events.j
            @Override // java.lang.Runnable
            public final void run() {
                k.q(this.f23164a);
            }
        };
        reactContext.addLifecycleEventListener(this);
        this.reactEventEmitter = new ReactEventEmitter(reactContext);
    }

    private final void p() {
        UiThreadUtil.assertOnUiThread();
        if (!tn.b.p()) {
            this.currentFrameCallback.g();
        } else {
            this.isDispatchScheduled = false;
            f23166i.removeCallbacks(this.dispatchEventsRunnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(k kVar) {
        kVar.isDispatchScheduled = false;
        ep.a.c(0L, "BatchEventDispatchedListeners");
        try {
            Iterator<com.facebook.react.uimanager.events.a> it = kVar.postEventDispatchListeners.iterator();
            p013kotlin.jvm.internal.s.j(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().onBatchEventDispatched();
            }
            ep.a.i(0L);
        } catch (Throwable th2) {
            ep.a.i(0L);
            throw th2;
        }
    }

    private final void r(d<?> event) {
        ep.a.c(0L, "FabricEventDispatcher.dispatchSynchronous('" + event.getEventName() + "')");
        try {
            UIManager uIManagerG = b1.g(this.reactContext, 2);
            if (uIManagerG instanceof p) {
                int surfaceId = event.getSurfaceId();
                int viewTag = event.getViewTag();
                String eventName = event.getEventName();
                p013kotlin.jvm.internal.s.j(eventName, "getEventName(...)");
                ((p) uIManagerG).receiveEvent(surfaceId, viewTag, eventName, event.canCoalesce(), event.getExtraData(), event.getEventCategory(), true);
            } else {
                ReactSoftExceptionLogger.logSoftException("FabricEventDispatcher", new IllegalStateException("Fabric UIManager expected to implement SynchronousEventReceiver."));
            }
        } finally {
            ep.a.i(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(k kVar) {
        kVar.p();
    }

    private final void t() {
        if (!tn.b.p()) {
            this.currentFrameCallback.d();
        } else {
            if (this.isDispatchScheduled) {
                return;
            }
            this.isDispatchScheduled = true;
            f23166i.postAtFrontOfQueue(this.dispatchEventsRunnable);
        }
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    @jn0.e
    public void a(int uiManagerType, RCTEventEmitter eventEmitter) {
        p013kotlin.jvm.internal.s.k(eventEmitter, "eventEmitter");
        this.reactEventEmitter.register(uiManagerType, eventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b() {
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.uimanager.events.i
            @Override // java.lang.Runnable
            public final void run() {
                k.s(this.f23163a);
            }
        });
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(g listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.listeners.remove(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d() {
        t();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void e(com.facebook.react.uimanager.events.a listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.postEventDispatchListeners.add(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void f(int uiManagerType) {
        this.reactEventEmitter.unregister(uiManagerType);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void g(g listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.listeners.add(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void h(d<?> event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        Iterator<g> it = this.listeners.iterator();
        p013kotlin.jvm.internal.s.j(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().onEventDispatch(event);
        }
        if (event.experimental_isSynchronous()) {
            r(event);
        } else {
            event.dispatchModern(this.reactEventEmitter);
        }
        event.dispose();
        t();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void i(com.facebook.react.uimanager.events.a listener) {
        p013kotlin.jvm.internal.s.k(listener, "listener");
        this.postEventDispatchListeners.remove(listener);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void j(int uiManagerType, RCTModernEventEmitter eventEmitter) {
        p013kotlin.jvm.internal.s.k(eventEmitter, "eventEmitter");
        this.reactEventEmitter.register(uiManagerType, eventEmitter);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        p();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        p();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        t();
        if (tn.b.p()) {
            return;
        }
        this.currentFrameCallback.f();
    }
}
