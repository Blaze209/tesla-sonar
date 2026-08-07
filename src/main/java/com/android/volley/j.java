package com.android.volley;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicInteger f20200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<i<?>> f20201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PriorityBlockingQueue<i<?>> f20202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityBlockingQueue<i<?>> f20203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.android.volley.a f20204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f20205f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l f20206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final g[] f20207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.android.volley.b f20208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<b> f20209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<a> f20210k;

    public interface a {
        void a(i<?> iVar, int i11);
    }

    @Deprecated
    public interface b<T> {
        void a(i<T> iVar);
    }

    public j(com.android.volley.a aVar, f fVar, int i11, l lVar) {
        this.f20200a = new AtomicInteger();
        this.f20201b = new HashSet();
        this.f20202c = new PriorityBlockingQueue<>();
        this.f20203d = new PriorityBlockingQueue<>();
        this.f20209j = new ArrayList();
        this.f20210k = new ArrayList();
        this.f20204e = aVar;
        this.f20205f = fVar;
        this.f20207h = new g[i11];
        this.f20206g = lVar;
    }

    public <T> i<T> a(i<T> iVar) {
        iVar.setRequestQueue(this);
        synchronized (this.f20201b) {
            this.f20201b.add(iVar);
        }
        iVar.setSequence(d());
        iVar.addMarker("add-to-queue");
        e(iVar, 0);
        b(iVar);
        return iVar;
    }

    <T> void b(i<T> iVar) {
        if (iVar.shouldCache()) {
            this.f20202c.add(iVar);
        } else {
            f(iVar);
        }
    }

    <T> void c(i<T> iVar) {
        synchronized (this.f20201b) {
            this.f20201b.remove(iVar);
        }
        synchronized (this.f20209j) {
            try {
                Iterator<b> it = this.f20209j.iterator();
                while (it.hasNext()) {
                    it.next().a(iVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        e(iVar, 5);
    }

    public int d() {
        return this.f20200a.incrementAndGet();
    }

    void e(i<?> iVar, int i11) {
        synchronized (this.f20210k) {
            try {
                Iterator<a> it = this.f20210k.iterator();
                while (it.hasNext()) {
                    it.next().a(iVar, i11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    <T> void f(i<T> iVar) {
        this.f20203d.add(iVar);
    }

    public void g() {
        h();
        com.android.volley.b bVar = new com.android.volley.b(this.f20202c, this.f20203d, this.f20204e, this.f20206g);
        this.f20208i = bVar;
        bVar.start();
        for (int i11 = 0; i11 < this.f20207h.length; i11++) {
            g gVar = new g(this.f20203d, this.f20205f, this.f20204e, this.f20206g);
            this.f20207h[i11] = gVar;
            gVar.start();
        }
    }

    public void h() {
        com.android.volley.b bVar = this.f20208i;
        if (bVar != null) {
            bVar.d();
        }
        for (g gVar : this.f20207h) {
            if (gVar != null) {
                gVar.e();
            }
        }
    }

    public j(com.android.volley.a aVar, f fVar, int i11) {
        this(aVar, fVar, i11, new d(new Handler(Looper.getMainLooper())));
    }

    public j(com.android.volley.a aVar, f fVar) {
        this(aVar, fVar, 4);
    }
}
