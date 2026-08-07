package com.facebook.react.uimanager.events;

import android.util.LongSparseArray;
import android.view.Choreographer;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
public class e implements EventDispatcher, LifecycleEventListener {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Comparator<com.facebook.react.uimanager.events.d> f23140q = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReactApplicationContext f23143c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f23146f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final d f23150j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile ReactEventEmitter f23154n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f23141a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f23142b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LongSparseArray<Integer> f23144d = new LongSparseArray<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Short> f23145e = jn.c.b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<com.facebook.react.uimanager.events.d> f23147g = new ArrayList<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final CopyOnWriteArrayList<g> f23148h = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final CopyOnWriteArrayList<com.facebook.react.uimanager.events.a> f23149i = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f23151k = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private com.facebook.react.uimanager.events.d[] f23152l = new com.facebook.react.uimanager.events.d[16];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f23153m = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private short f23155o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private volatile boolean f23156p = false;

    class a implements Comparator<com.facebook.react.uimanager.events.d> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.facebook.react.uimanager.events.d dVar, com.facebook.react.uimanager.events.d dVar2) {
            if (dVar == null && dVar2 == null) {
                return 0;
            }
            if (dVar == null) {
                return -1;
            }
            if (dVar2 == null) {
                return 1;
            }
            long timestampMs = dVar.getTimestampMs() - dVar2.getTimestampMs();
            if (timestampMs == 0) {
                return 0;
            }
            return timestampMs < 0 ? -1 : 1;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.G();
        }
    }

    private class c implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            ep.a.c(0L, "DispatchEventsRunnable");
            try {
                ep.a.f(0L, "ScheduleDispatchFrameCallback", e.this.f23151k.getAndIncrement());
                e.this.f23156p = false;
                gn.a.c(e.this.f23154n);
                synchronized (e.this.f23142b) {
                    try {
                        if (e.this.f23153m > 0) {
                            if (e.this.f23153m > 1) {
                                Arrays.sort(e.this.f23152l, 0, e.this.f23153m, e.f23140q);
                            }
                            for (int i11 = 0; i11 < e.this.f23153m; i11++) {
                                com.facebook.react.uimanager.events.d dVar = e.this.f23152l[i11];
                                if (dVar != null) {
                                    ep.a.f(0L, dVar.getEventName(), dVar.getUniqueID());
                                    dVar.dispatchModern(e.this.f23154n);
                                    dVar.dispose();
                                }
                            }
                            e.this.B();
                            e.this.f23144d.clear();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                Iterator it = e.this.f23149i.iterator();
                while (it.hasNext()) {
                    ((com.facebook.react.uimanager.events.a) it.next()).onBatchEventDispatched();
                }
                ep.a.i(0L);
            } catch (Throwable th3) {
                ep.a.i(0L);
                throw th3;
            }
        }

        private c() {
        }
    }

    private class d implements Choreographer.FrameCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile boolean f23159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f23160b;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.a();
            }
        }

        private void c() {
            com.facebook.react.modules.core.b.h().k(com.facebook.react.modules.core.b.a.TIMERS_EVENTS, e.this.f23150j);
        }

        public void a() {
            if (this.f23159a) {
                return;
            }
            this.f23159a = true;
            c();
        }

        public void b() {
            if (this.f23159a) {
                return;
            }
            if (e.this.f23143c.isOnUiQueueThread()) {
                a();
            } else {
                e.this.f23143c.runOnUiQueueThread(new a());
            }
        }

        public void d() {
            this.f23160b = true;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j11) {
            UiThreadUtil.assertOnUiThread();
            if (this.f23160b) {
                this.f23159a = false;
            } else {
                c();
            }
            ep.a.c(0L, "ScheduleDispatchFrameCallback");
            try {
                e.this.F();
                if (!e.this.f23156p) {
                    e.this.f23156p = true;
                    ep.a.l(0L, "ScheduleDispatchFrameCallback", e.this.f23151k.get());
                    e.this.f23143c.runOnJSQueueThread(e.this.f23146f);
                }
            } finally {
                ep.a.i(0L);
            }
        }

        private d() {
            this.f23159a = false;
            this.f23160b = false;
        }
    }

    public e(ReactApplicationContext reactApplicationContext) {
        this.f23146f = new c();
        this.f23150j = new d();
        this.f23143c = reactApplicationContext;
        reactApplicationContext.addLifecycleEventListener(this);
        this.f23154n = new ReactEventEmitter(reactApplicationContext);
    }

    private void A(com.facebook.react.uimanager.events.d dVar) {
        int i11 = this.f23153m;
        com.facebook.react.uimanager.events.d[] dVarArr = this.f23152l;
        if (i11 == dVarArr.length) {
            this.f23152l = (com.facebook.react.uimanager.events.d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
        }
        com.facebook.react.uimanager.events.d[] dVarArr2 = this.f23152l;
        int i12 = this.f23153m;
        this.f23153m = i12 + 1;
        dVarArr2[i12] = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        Arrays.fill(this.f23152l, 0, this.f23153m, (Object) null);
        this.f23153m = 0;
    }

    private long C(int i11, String str, short s11) {
        short sShortValue;
        Short sh2 = this.f23145e.get(str);
        if (sh2 != null) {
            sShortValue = sh2.shortValue();
        } else {
            short s12 = this.f23155o;
            this.f23155o = (short) (s12 + 1);
            this.f23145e.put(str, Short.valueOf(s12));
            sShortValue = s12;
        }
        return D(i11, sShortValue, s11);
    }

    private static long D(int i11, short s11, short s12) {
        return ((((long) s11) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ((long) i11) | ((((long) s12) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48);
    }

    private void E() {
        if (this.f23154n != null) {
            this.f23150j.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F() {
        synchronized (this.f23141a) {
            synchronized (this.f23142b) {
                for (int i11 = 0; i11 < this.f23147g.size(); i11++) {
                    try {
                        com.facebook.react.uimanager.events.d dVar = this.f23147g.get(i11);
                        if (dVar.canCoalesce()) {
                            long jC = C(dVar.getViewTag(), dVar.getEventName(), dVar.getCoalescingKey());
                            Integer num = this.f23144d.get(jC);
                            com.facebook.react.uimanager.events.d dVar2 = null;
                            if (num == null) {
                                this.f23144d.put(jC, Integer.valueOf(this.f23153m));
                            } else {
                                com.facebook.react.uimanager.events.d dVar3 = this.f23152l[num.intValue()];
                                com.facebook.react.uimanager.events.d dVarCoalesce = dVar.coalesce(dVar3);
                                if (dVarCoalesce != dVar3) {
                                    this.f23144d.put(jC, Integer.valueOf(this.f23153m));
                                    this.f23152l[num.intValue()] = null;
                                    dVar2 = dVar3;
                                    dVar = dVarCoalesce;
                                } else {
                                    dVar2 = dVar;
                                    dVar = null;
                                }
                            }
                            if (dVar != null) {
                                A(dVar);
                            }
                            if (dVar2 != null) {
                                dVar2.dispose();
                            }
                        } else {
                            A(dVar);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            this.f23147g.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        UiThreadUtil.assertOnUiThread();
        this.f23150j.d();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void a(int i11, RCTEventEmitter rCTEventEmitter) {
        this.f23154n.register(i11, rCTEventEmitter);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b() {
        UiThreadUtil.runOnUiThread(new b());
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(g gVar) {
        this.f23148h.remove(gVar);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d() {
        E();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void e(com.facebook.react.uimanager.events.a aVar) {
        this.f23149i.add(aVar);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void f(int i11) {
        this.f23154n.unregister(i11);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void g(g gVar) {
        this.f23148h.add(gVar);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void h(com.facebook.react.uimanager.events.d dVar) {
        gn.a.b(dVar.isInitialized(), "Dispatched event hasn't been initialized");
        Iterator<g> it = this.f23148h.iterator();
        while (it.hasNext()) {
            it.next().onEventDispatch(dVar);
        }
        synchronized (this.f23141a) {
            this.f23147g.add(dVar);
            ep.a.l(0L, dVar.getEventName(), dVar.getUniqueID());
        }
        E();
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void i(com.facebook.react.uimanager.events.a aVar) {
        this.f23149i.remove(aVar);
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void j(int i11, RCTModernEventEmitter rCTModernEventEmitter) {
        this.f23154n.register(i11, rCTModernEventEmitter);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        G();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        G();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        E();
    }
}
