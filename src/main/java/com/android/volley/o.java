package com.android.volley;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
class o implements i.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f20225b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f20227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final BlockingQueue<i<?>> f20228e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<i<?>>> f20224a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f20226c = null;

    o(@NonNull b bVar, @NonNull BlockingQueue<i<?>> blockingQueue, l lVar) {
        this.f20225b = lVar;
        this.f20227d = bVar;
        this.f20228e = blockingQueue;
    }

    @Override // com.android.volley.i.b
    public synchronized void a(i<?> iVar) {
        BlockingQueue<i<?>> blockingQueue;
        try {
            String cacheKey = iVar.getCacheKey();
            List<i<?>> listRemove = this.f20224a.remove(cacheKey);
            if (listRemove != null && !listRemove.isEmpty()) {
                if (n.f20216b) {
                    n.e("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(listRemove.size()), cacheKey);
                }
                i<?> iVarRemove = listRemove.remove(0);
                this.f20224a.put(cacheKey, listRemove);
                iVarRemove.setNetworkRequestCompleteListener(this);
                j jVar = this.f20226c;
                if (jVar != null) {
                    jVar.f(iVarRemove);
                } else if (this.f20227d != null && (blockingQueue = this.f20228e) != null) {
                    try {
                        blockingQueue.put(iVarRemove);
                    } catch (InterruptedException e11) {
                        n.c("Couldn't add request to queue. %s", e11.toString());
                        Thread.currentThread().interrupt();
                        this.f20227d.d();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.android.volley.i.b
    public void b(i<?> iVar, k<?> kVar) {
        List<i<?>> listRemove;
        a.C0410a c0410a = kVar.f20212b;
        if (c0410a == null || c0410a.a()) {
            a(iVar);
            return;
        }
        String cacheKey = iVar.getCacheKey();
        synchronized (this) {
            listRemove = this.f20224a.remove(cacheKey);
        }
        if (listRemove != null) {
            if (n.f20216b) {
                n.e("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(listRemove.size()), cacheKey);
            }
            Iterator<i<?>> it = listRemove.iterator();
            while (it.hasNext()) {
                this.f20225b.a(it.next(), kVar);
            }
        }
    }

    synchronized boolean c(i<?> iVar) {
        try {
            String cacheKey = iVar.getCacheKey();
            if (!this.f20224a.containsKey(cacheKey)) {
                this.f20224a.put(cacheKey, null);
                iVar.setNetworkRequestCompleteListener(this);
                if (n.f20216b) {
                    n.b("new request, sending to network %s", cacheKey);
                }
                return false;
            }
            List<i<?>> arrayList = this.f20224a.get(cacheKey);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            iVar.addMarker("waiting-for-response");
            arrayList.add(iVar);
            this.f20224a.put(cacheKey, arrayList);
            if (n.f20216b) {
                n.b("Request for cacheKey=%s is in flight, putting on hold.", cacheKey);
            }
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
