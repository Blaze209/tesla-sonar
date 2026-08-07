package ql;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import ql.a;

/* JADX INFO: loaded from: classes3.dex */
public class c<T extends ql.a> extends ql.b<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final wk.b f105630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f105631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f105632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f105633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f105634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f105635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private b f105636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f105637m;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                try {
                    c.this.f105632h = false;
                    if (!c.this.t()) {
                        c.this.u();
                    } else if (c.this.f105636l != null) {
                        c.this.f105636l.n();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public interface b {
        void n();
    }

    private c(T t11, b bVar, wk.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        super(t11);
        this.f105632h = false;
        this.f105634j = 2000L;
        this.f105635k = 1000L;
        this.f105637m = new a();
        this.f105636l = bVar;
        this.f105630f = bVar2;
        this.f105631g = scheduledExecutorService;
    }

    public static <T extends ql.a> ql.b<T> r(T t11, b bVar, wk.b bVar2, ScheduledExecutorService scheduledExecutorService) {
        return new c(t11, bVar, bVar2, scheduledExecutorService);
    }

    public static <T extends ql.a & b> ql.b<T> s(T t11, wk.b bVar, ScheduledExecutorService scheduledExecutorService) {
        return r(t11, (b) t11, bVar, scheduledExecutorService);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean t() {
        return this.f105630f.now() - this.f105633i > this.f105634j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u() {
        if (!this.f105632h) {
            this.f105632h = true;
            this.f105631g.schedule(this.f105637m, this.f105635k, TimeUnit.MILLISECONDS);
        }
    }

    @Override // ql.b, ql.a
    public boolean m(Drawable drawable, Canvas canvas, int i11) {
        this.f105633i = this.f105630f.now();
        boolean zM = super.m(drawable, canvas, i11);
        u();
        return zM;
    }
}
