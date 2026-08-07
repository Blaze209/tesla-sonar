package gj0;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes8.dex */
public class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ReactContext f69009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f69010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f69011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<b.a> f69012d = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.tesla.logging.g f69013e = com.tesla.logging.g.h("ReactNativeNotifs");

    class a implements LifecycleEventListener {
        a() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            g.this.j();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
            g.this.j();
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            g.this.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        if (this.f69010b) {
            this.f69010b = false;
            Iterator<b.a> it = this.f69012d.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void k() {
        if (!this.f69010b) {
            this.f69010b = true;
            Iterator<b.a> it = this.f69012d.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    @Override // gj0.b
    public boolean a() {
        return this.f69011c;
    }

    @Override // gj0.b
    public void b(b.a aVar) {
        this.f69012d.add(aVar);
    }

    @Override // gj0.b
    public ReactContext c() {
        ReactContext reactContext = this.f69009a;
        if (reactContext == null) {
            return null;
        }
        return reactContext;
    }

    @Override // gj0.b
    public void d(b.a aVar) {
        this.f69012d.remove(aVar);
    }

    @Override // gj0.b
    public synchronized boolean e() {
        ReactContext reactContext = this.f69009a;
        if (reactContext == null) {
            return false;
        }
        return reactContext.hasActiveCatalystInstance();
    }

    @Override // gj0.b
    public boolean f() {
        return this.f69010b;
    }

    public void i(ReactContext reactContext) {
        this.f69009a = reactContext;
        reactContext.addLifecycleEventListener(new a());
    }
}
