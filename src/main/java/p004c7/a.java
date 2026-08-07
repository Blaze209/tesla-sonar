package p004c7;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.x0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<a> f18844g = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f18848d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final x0<b, Long> f18845a = new x0<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<b> f18846b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0381a f18847c = new C0381a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f18849e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f18850f = false;

    /* JADX INFO: renamed from: c7.a$a, reason: collision with other inner class name */
    class C0381a {
        C0381a() {
        }

        void a() {
            a.this.f18849e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f18849e);
            if (a.this.f18846b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    interface b {
        boolean a(long j11);
    }

    static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final C0381a f18852a;

        c(C0381a c0381a) {
            this.f18852a = c0381a;
        }

        abstract void a();
    }

    private static class d extends c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Choreographer f18853b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Choreographer.FrameCallback f18854c;

        /* JADX INFO: renamed from: c7.a$d$a, reason: collision with other inner class name */
        class ChoreographerFrameCallbackC0382a implements Choreographer.FrameCallback {
            ChoreographerFrameCallbackC0382a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j11) {
                d.this.f18852a.a();
            }
        }

        d(C0381a c0381a) {
            super(c0381a);
            this.f18853b = Choreographer.getInstance();
            this.f18854c = new ChoreographerFrameCallbackC0382a();
        }

        @Override // c7.a.c
        void a() {
            this.f18853b.postFrameCallback(this.f18854c);
        }
    }

    a() {
    }

    private void b() {
        if (this.f18850f) {
            for (int size = this.f18846b.size() - 1; size >= 0; size--) {
                if (this.f18846b.get(size) == null) {
                    this.f18846b.remove(size);
                }
            }
            this.f18850f = false;
        }
    }

    public static a d() {
        ThreadLocal<a> threadLocal = f18844g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return threadLocal.get();
    }

    private boolean f(b bVar, long j11) {
        Long l11 = this.f18845a.get(bVar);
        if (l11 == null) {
            return true;
        }
        if (l11.longValue() >= j11) {
            return false;
        }
        this.f18845a.remove(bVar);
        return true;
    }

    public void a(b bVar, long j11) {
        if (this.f18846b.size() == 0) {
            e().a();
        }
        if (!this.f18846b.contains(bVar)) {
            this.f18846b.add(bVar);
        }
        if (j11 > 0) {
            this.f18845a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j11));
        }
    }

    void c(long j11) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i11 = 0; i11 < this.f18846b.size(); i11++) {
            b bVar = this.f18846b.get(i11);
            if (bVar != null && f(bVar, jUptimeMillis)) {
                bVar.a(j11);
            }
        }
        b();
    }

    c e() {
        if (this.f18848d == null) {
            this.f18848d = new d(this.f18847c);
        }
        return this.f18848d;
    }

    public void g(b bVar) {
        this.f18845a.remove(bVar);
        int iIndexOf = this.f18846b.indexOf(bVar);
        if (iIndexOf >= 0) {
            this.f18846b.set(iIndexOf, null);
            this.f18850f = true;
        }
    }
}
