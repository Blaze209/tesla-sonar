package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.NonNull;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import rj.p;
import rj.q;
import rj.s;

/* JADX INFO: loaded from: classes3.dex */
public class l implements ComponentCallbacks2, rj.l {
    private static final com.bumptech.glide.request.i DECODE_TYPE_BITMAP = com.bumptech.glide.request.i.decodeTypeOf(Bitmap.class).lock();
    private static final com.bumptech.glide.request.i DECODE_TYPE_GIF = com.bumptech.glide.request.i.decodeTypeOf(pj.c.class).lock();
    private static final com.bumptech.glide.request.i DOWNLOAD_ONLY_OPTIONS = com.bumptech.glide.request.i.diskCacheStrategyOf(fj.a.f66014c).priority(h.LOW).skipMemoryCache(true);
    private final Runnable addSelfToLifecycle;
    private boolean clearOnStop;
    private final rj.b connectivityMonitor;
    protected final Context context;
    private final CopyOnWriteArrayList<com.bumptech.glide.request.h<Object>> defaultRequestListeners;
    protected final com.bumptech.glide.c glide;
    final rj.j lifecycle;
    private boolean pauseAllRequestsOnTrimMemoryModerate;
    private com.bumptech.glide.request.i requestOptions;
    private final q requestTracker;
    private final s targetTracker;
    private final p treeNode;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            lVar.lifecycle.a(lVar);
        }
    }

    private class c implements rj.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f20507a;

        c(q qVar) {
            this.f20507a = qVar;
        }

        @Override // rj.b.a
        public void a(boolean z11) {
            if (z11) {
                synchronized (l.this) {
                    this.f20507a.f();
                }
            }
        }
    }

    public l(@NonNull com.bumptech.glide.c cVar, @NonNull rj.j jVar, @NonNull p pVar, @NonNull Context context) {
        this(cVar, jVar, pVar, new q(), cVar.i(), context);
    }

    private synchronized void clearRequests() {
        try {
            Iterator<uj.j<?>> it = this.targetTracker.b().iterator();
            while (it.hasNext()) {
                clear(it.next());
            }
            this.targetTracker.a();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void untrackOrDelegate(@NonNull uj.j<?> jVar) {
        boolean zUntrack = untrack(jVar);
        com.bumptech.glide.request.e request = jVar.getRequest();
        if (zUntrack || this.glide.v(jVar) || request == null) {
            return;
        }
        jVar.setRequest(null);
        request.clear();
    }

    private synchronized void updateRequestOptions(@NonNull com.bumptech.glide.request.i iVar) {
        this.requestOptions = this.requestOptions.apply(iVar);
    }

    public l addDefaultRequestListener(com.bumptech.glide.request.h<Object> hVar) {
        this.defaultRequestListeners.add(hVar);
        return this;
    }

    @NonNull
    public synchronized l applyDefaultRequestOptions(@NonNull com.bumptech.glide.request.i iVar) {
        updateRequestOptions(iVar);
        return this;
    }

    @NonNull
    public <ResourceType> k<ResourceType> as(@NonNull Class<ResourceType> cls) {
        return new k<>(this.glide, this, cls, this.context);
    }

    @NonNull
    public k<Bitmap> asBitmap() {
        return as(Bitmap.class).apply((com.bumptech.glide.request.a<?>) DECODE_TYPE_BITMAP);
    }

    @NonNull
    public k<Drawable> asDrawable() {
        return as(Drawable.class);
    }

    @NonNull
    public k<File> asFile() {
        return as(File.class).apply((com.bumptech.glide.request.a<?>) com.bumptech.glide.request.i.skipMemoryCacheOf(true));
    }

    @NonNull
    public k<pj.c> asGif() {
        return as(pj.c.class).apply((com.bumptech.glide.request.a<?>) DECODE_TYPE_GIF);
    }

    public void clear(@NonNull View view) {
        clear(new b(view));
    }

    @NonNull
    public synchronized l clearOnStop() {
        this.clearOnStop = true;
        return this;
    }

    @NonNull
    public k<File> download(Object obj) {
        return downloadOnly().mo69load(obj);
    }

    @NonNull
    public k<File> downloadOnly() {
        return as(File.class).apply((com.bumptech.glide.request.a<?>) DOWNLOAD_ONLY_OPTIONS);
    }

    List<com.bumptech.glide.request.h<Object>> getDefaultRequestListeners() {
        return this.defaultRequestListeners;
    }

    synchronized com.bumptech.glide.request.i getDefaultRequestOptions() {
        return this.requestOptions;
    }

    @NonNull
    <T> m<?, T> getDefaultTransitionOptions(Class<T> cls) {
        return this.glide.k().e(cls);
    }

    public synchronized boolean isPaused() {
        return this.requestTracker.c();
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // rj.l
    public synchronized void onDestroy() {
        this.targetTracker.onDestroy();
        clearRequests();
        this.requestTracker.b();
        this.lifecycle.b(this);
        this.lifecycle.b(this.connectivityMonitor);
        xj.l.w(this.addSelfToLifecycle);
        this.glide.z(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // rj.l
    public synchronized void onStart() {
        resumeRequests();
        this.targetTracker.onStart();
    }

    @Override // rj.l
    public synchronized void onStop() {
        try {
            this.targetTracker.onStop();
            if (this.clearOnStop) {
                clearRequests();
            } else {
                pauseRequests();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i11) {
        if (i11 == 60 && this.pauseAllRequestsOnTrimMemoryModerate) {
            pauseAllRequestsRecursive();
        }
    }

    public synchronized void pauseAllRequests() {
        this.requestTracker.d();
    }

    public synchronized void pauseAllRequestsRecursive() {
        pauseAllRequests();
        Iterator<l> it = this.treeNode.a().iterator();
        while (it.hasNext()) {
            it.next().pauseAllRequests();
        }
    }

    public synchronized void pauseRequests() {
        this.requestTracker.e();
    }

    public synchronized void pauseRequestsRecursive() {
        pauseRequests();
        Iterator<l> it = this.treeNode.a().iterator();
        while (it.hasNext()) {
            it.next().pauseRequests();
        }
    }

    public synchronized void resumeRequests() {
        this.requestTracker.g();
    }

    public synchronized void resumeRequestsRecursive() {
        xj.l.b();
        resumeRequests();
        Iterator<l> it = this.treeNode.a().iterator();
        while (it.hasNext()) {
            it.next().resumeRequests();
        }
    }

    @NonNull
    public synchronized l setDefaultRequestOptions(@NonNull com.bumptech.glide.request.i iVar) {
        setRequestOptions(iVar);
        return this;
    }

    public void setPauseAllRequestsOnTrimMemoryModerate(boolean z11) {
        this.pauseAllRequestsOnTrimMemoryModerate = z11;
    }

    protected synchronized void setRequestOptions(@NonNull com.bumptech.glide.request.i iVar) {
        this.requestOptions = iVar.mo63clone().autoClone();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.requestTracker + ", treeNode=" + this.treeNode + "}";
    }

    synchronized void track(@NonNull uj.j<?> jVar, @NonNull com.bumptech.glide.request.e eVar) {
        this.targetTracker.c(jVar);
        this.requestTracker.h(eVar);
    }

    synchronized boolean untrack(@NonNull uj.j<?> jVar) {
        com.bumptech.glide.request.e request = jVar.getRequest();
        if (request == null) {
            return true;
        }
        if (!this.requestTracker.a(request)) {
            return false;
        }
        this.targetTracker.d(jVar);
        jVar.setRequest(null);
        return true;
    }

    public void clear(uj.j<?> jVar) {
        if (jVar == null) {
            return;
        }
        untrackOrDelegate(jVar);
    }

    l(com.bumptech.glide.c cVar, rj.j jVar, p pVar, q qVar, rj.c cVar2, Context context) {
        this.targetTracker = new s();
        a aVar = new a();
        this.addSelfToLifecycle = aVar;
        this.glide = cVar;
        this.lifecycle = jVar;
        this.treeNode = pVar;
        this.requestTracker = qVar;
        this.context = context;
        rj.b bVarA = cVar2.a(context.getApplicationContext(), new c(qVar));
        this.connectivityMonitor = bVarA;
        cVar.u(this);
        if (xj.l.r()) {
            xj.l.v(aVar);
        } else {
            jVar.a(this);
        }
        jVar.a(bVarA);
        this.defaultRequestListeners = new CopyOnWriteArrayList<>(cVar.k().c());
        setRequestOptions(cVar.k().d());
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<Drawable> mo73load(Bitmap bitmap) {
        return asDrawable().mo64load(bitmap);
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<Drawable> mo74load(Drawable drawable) {
        return asDrawable().mo65load(drawable);
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<Drawable> mo79load(String str) {
        return asDrawable().mo70load(str);
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<Drawable> mo75load(Uri uri) {
        return asDrawable().mo66load(uri);
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<Drawable> mo76load(File file) {
        return asDrawable().mo67load(file);
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<Drawable> mo77load(Integer num) {
        return asDrawable().mo68load(num);
    }

    @Override // 
    @Deprecated
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<Drawable> mo80load(URL url) {
        return asDrawable().mo71load(url);
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<Drawable> mo81load(byte[] bArr) {
        return asDrawable().mo72load(bArr);
    }

    @Override // 
    @NonNull
    /* JADX INFO: renamed from: load, reason: merged with bridge method [inline-methods] */
    public k<Drawable> mo78load(Object obj) {
        return asDrawable().mo69load(obj);
    }

    private static class b extends uj.d<View, Object> {
        b(@NonNull View view) {
            super(view);
        }

        @Override // uj.d
        protected void d(Drawable drawable) {
        }

        @Override // uj.j
        public void onLoadFailed(Drawable drawable) {
        }

        @Override // uj.j
        public void onResourceReady(@NonNull Object obj, vj.b<? super Object> bVar) {
        }
    }
}
