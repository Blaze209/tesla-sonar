package com.android.volley;

import android.annotation.TargetApi;
import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public class g extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<i<?>> f20186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f20187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f20188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final l f20189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f20190e = false;

    public g(BlockingQueue<i<?>> blockingQueue, f fVar, a aVar, l lVar) {
        this.f20186a = blockingQueue;
        this.f20187b = fVar;
        this.f20188c = aVar;
        this.f20189d = lVar;
    }

    @TargetApi(14)
    private void a(i<?> iVar) {
        TrafficStats.setThreadStatsTag(iVar.getTrafficStatsTag());
    }

    private void b(i<?> iVar, VolleyError volleyError) {
        this.f20189d.c(iVar, iVar.parseNetworkError(volleyError));
    }

    private void c() {
        d(this.f20186a.take());
    }

    void d(i<?> iVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        iVar.sendEvent(3);
        try {
            iVar.addMarker("network-queue-take");
            if (iVar.isCanceled()) {
                iVar.finish("network-discard-cancelled");
                iVar.notifyListenerResponseNotUsable();
                return;
            }
            a(iVar);
            h hVarA = this.f20187b.a(iVar);
            iVar.addMarker("network-http-complete");
            if (hVarA.f20195e && iVar.hasHadResponseDelivered()) {
                iVar.finish("not-modified");
                iVar.notifyListenerResponseNotUsable();
                return;
            }
            k<?> networkResponse = iVar.parseNetworkResponse(hVarA);
            iVar.addMarker("network-parse-complete");
            if (iVar.shouldCache() && networkResponse.f20212b != null) {
                this.f20188c.b(iVar.getCacheKey(), networkResponse.f20212b);
                iVar.addMarker("network-cache-written");
            }
            iVar.markDelivered();
            this.f20189d.a(iVar, networkResponse);
            iVar.notifyListenerResponseReceived(networkResponse);
        } catch (VolleyError e11) {
            e11.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
            b(iVar, e11);
            iVar.notifyListenerResponseNotUsable();
        } catch (Exception e12) {
            n.d(e12, "Unhandled exception %s", e12.toString());
            VolleyError volleyError = new VolleyError(e12);
            volleyError.a(SystemClock.elapsedRealtime() - jElapsedRealtime);
            this.f20189d.c(iVar, volleyError);
            iVar.notifyListenerResponseNotUsable();
        } finally {
            iVar.sendEvent(4);
        }
    }

    public void e() {
        this.f20190e = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                c();
            } catch (InterruptedException unused) {
                if (this.f20190e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                n.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
