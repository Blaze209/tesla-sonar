package com.android.volley;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public class b extends Thread {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final boolean f20165g = n.f20216b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<i<?>> f20166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BlockingQueue<i<?>> f20167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.android.volley.a f20168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f20169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f20170e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f20171f;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f20172a;

        a(i iVar) {
            this.f20172a = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                b.this.f20167b.put(this.f20172a);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public b(BlockingQueue<i<?>> blockingQueue, BlockingQueue<i<?>> blockingQueue2, com.android.volley.a aVar, l lVar) {
        this.f20166a = blockingQueue;
        this.f20167b = blockingQueue2;
        this.f20168c = aVar;
        this.f20169d = lVar;
        this.f20171f = new o(this, blockingQueue2, lVar);
    }

    private void b() {
        c(this.f20166a.take());
    }

    void c(i<?> iVar) {
        iVar.addMarker("cache-queue-take");
        iVar.sendEvent(1);
        try {
            if (iVar.isCanceled()) {
                iVar.finish("cache-discard-canceled");
                return;
            }
            com.android.volley.a.C0410a c0410a = this.f20168c.get(iVar.getCacheKey());
            if (c0410a == null) {
                iVar.addMarker("cache-miss");
                if (!this.f20171f.c(iVar)) {
                    this.f20167b.put(iVar);
                }
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c0410a.b(jCurrentTimeMillis)) {
                iVar.addMarker("cache-hit-expired");
                iVar.setCacheEntry(c0410a);
                if (!this.f20171f.c(iVar)) {
                    this.f20167b.put(iVar);
                }
                return;
            }
            iVar.addMarker("cache-hit");
            k<?> networkResponse = iVar.parseNetworkResponse(new h(c0410a.f20157a, c0410a.f20163g));
            iVar.addMarker("cache-hit-parsed");
            if (!networkResponse.b()) {
                iVar.addMarker("cache-parsing-failed");
                this.f20168c.a(iVar.getCacheKey(), true);
                iVar.setCacheEntry(null);
                if (!this.f20171f.c(iVar)) {
                    this.f20167b.put(iVar);
                }
                return;
            }
            if (c0410a.c(jCurrentTimeMillis)) {
                iVar.addMarker("cache-hit-refresh-needed");
                iVar.setCacheEntry(c0410a);
                networkResponse.f20214d = true;
                if (this.f20171f.c(iVar)) {
                    this.f20169d.a(iVar, networkResponse);
                } else {
                    this.f20169d.b(iVar, networkResponse, new a(iVar));
                }
            } else {
                this.f20169d.a(iVar, networkResponse);
            }
        } finally {
            iVar.sendEvent(2);
        }
    }

    public void d() {
        this.f20170e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        if (f20165g) {
            n.e("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f20168c.initialize();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f20170e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                n.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
