package jk0;

import java.lang.ref.ReferenceQueue;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f83952a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f83953b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ReferenceQueue f83954c = null;

    protected e() {
    }

    public void a() {
        Map map = this.f83953b;
        if (map != null) {
            synchronized (map) {
                this.f83953b.clear();
            }
        }
    }

    public synchronized void b(boolean z11) {
        try {
            this.f83952a = z11;
            if (z11) {
                this.f83953b = new d();
                this.f83954c = new ReferenceQueue();
            } else {
                this.f83953b = null;
                this.f83954c = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
