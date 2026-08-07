package com.bumptech.glide.request;

import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public class g<R> implements d<R>, h<R> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f20866k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f20867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f20868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f20869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f20870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private R f20871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f20872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f20875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private GlideException f20876j;

    static class a {
        a() {
        }

        void a(Object obj) {
            obj.notifyAll();
        }

        void b(Object obj, long j11) throws InterruptedException {
            obj.wait(j11);
        }
    }

    public g(int i11, int i12) {
        this(i11, i12, true, f20866k);
    }

    private synchronized R a(Long l11) {
        try {
            if (this.f20869c && !isDone()) {
                xj.l.a();
            }
            if (this.f20873g) {
                throw new CancellationException();
            }
            if (this.f20875i) {
                throw new ExecutionException(this.f20876j);
            }
            if (this.f20874h) {
                return this.f20871e;
            }
            if (l11 == null) {
                this.f20870d.b(this, 0L);
            } else if (l11.longValue() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jLongValue = l11.longValue() + jCurrentTimeMillis;
                while (!isDone() && jCurrentTimeMillis < jLongValue) {
                    this.f20870d.b(this, jLongValue - jCurrentTimeMillis);
                    jCurrentTimeMillis = System.currentTimeMillis();
                }
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            if (this.f20875i) {
                throw new ExecutionException(this.f20876j);
            }
            if (this.f20873g) {
                throw new CancellationException();
            }
            if (!this.f20874h) {
                throw new TimeoutException();
            }
            return this.f20871e;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z11) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.f20873g = true;
                this.f20870d.a(this);
                e eVar = null;
                if (z11) {
                    e eVar2 = this.f20872f;
                    this.f20872f = null;
                    eVar = eVar2;
                }
                if (eVar != null) {
                    eVar.clear();
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public R get() {
        try {
            return a(null);
        } catch (TimeoutException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // uj.j
    public synchronized e getRequest() {
        return this.f20872f;
    }

    @Override // uj.j
    public void getSize(@NonNull uj.i iVar) {
        iVar.e(this.f20867a, this.f20868b);
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isCancelled() {
        return this.f20873g;
    }

    @Override // java.util.concurrent.Future
    public synchronized boolean isDone() {
        return this.f20873g || this.f20874h || this.f20875i;
    }

    @Override // rj.l
    public void onDestroy() {
    }

    @Override // uj.j
    public void onLoadCleared(Drawable drawable) {
    }

    @Override // uj.j
    public synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // uj.j
    public void onLoadStarted(Drawable drawable) {
    }

    @Override // uj.j
    public synchronized void onResourceReady(@NonNull R r11, vj.b<? super R> bVar) {
    }

    @Override // rj.l
    public void onStart() {
    }

    @Override // rj.l
    public void onStop() {
    }

    @Override // uj.j
    public synchronized void setRequest(e eVar) {
        this.f20872f = eVar;
    }

    public String toString() {
        e eVar;
        String str;
        String str2 = super.toString() + "[status=";
        synchronized (this) {
            try {
                eVar = null;
                if (this.f20873g) {
                    str = "CANCELLED";
                } else if (this.f20875i) {
                    str = "FAILURE";
                } else if (this.f20874h) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    eVar = this.f20872f;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (eVar == null) {
            return str2 + str + "]";
        }
        return str2 + str + ", request=[" + eVar + "]]";
    }

    g(int i11, int i12, boolean z11, a aVar) {
        this.f20867a = i11;
        this.f20868b = i12;
        this.f20869c = z11;
        this.f20870d = aVar;
    }

    @Override // com.bumptech.glide.request.h
    public synchronized boolean onLoadFailed(GlideException glideException, Object obj, @NonNull uj.j<R> jVar, boolean z11) {
        this.f20875i = true;
        this.f20876j = glideException;
        this.f20870d.a(this);
        return false;
    }

    @Override // com.bumptech.glide.request.h
    public synchronized boolean onResourceReady(@NonNull R r11, @NonNull Object obj, uj.j<R> jVar, @NonNull dj.a aVar, boolean z11) {
        this.f20874h = true;
        this.f20871e = r11;
        this.f20870d.a(this);
        return false;
    }

    @Override // java.util.concurrent.Future
    public R get(long j11, @NonNull TimeUnit timeUnit) {
        return a(Long.valueOf(timeUnit.toMillis(j11)));
    }

    @Override // uj.j
    public void removeCallback(@NonNull uj.i iVar) {
    }
}
