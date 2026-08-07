package androidx.media3.exoplayer.drm;

import a8.o2;
import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes.dex */
class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<p7.n.b> f9708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f9709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f9710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f9711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f9712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f9713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f9714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<String, String> f9715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final s7.o<h.a> f9716i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f9717j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final o2 f9718k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p f9719l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final UUID f9720m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Looper f9721n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f9722o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f9723p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f9724q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HandlerThread f9725r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f9726s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private y7.b f9727t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private DrmSession.DrmSessionException f9728u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f9729v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f9730w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private m.a f9731x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private m.d f9732y;

    public static final class UnexpectedDrmSessionException extends IOException {
        public UnexpectedDrmSessionException(Throwable th2) {
            super(th2);
        }
    }

    public interface a {
        void a(Exception exc, boolean z11);

        void b();

        void c(DefaultDrmSession defaultDrmSession);
    }

    public interface b {
        void a(DefaultDrmSession defaultDrmSession, int i11);

        void b(DefaultDrmSession defaultDrmSession, int i11);
    }

    @SuppressLint({"HandlerLeak"})
    private class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9733a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            d dVar = (d) message.obj;
            if (!dVar.f9736b) {
                return false;
            }
            int i11 = dVar.f9739e + 1;
            dVar.f9739e = i11;
            if (i11 > DefaultDrmSession.this.f9717j.b(3)) {
                return false;
            }
            long jD = DefaultDrmSession.this.f9717j.d(new androidx.media3.exoplayer.upstream.b.c(new n8.i(dVar.f9735a, mediaDrmCallbackException.f9784a, mediaDrmCallbackException.f9785b, mediaDrmCallbackException.f9786c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f9737c, mediaDrmCallbackException.f9787d), new n8.j(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), dVar.f9739e));
            if (jD == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f9733a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jD);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b(int i11, Object obj, boolean z11) {
            obtainMessage(i11, new d(n8.i.a(), z11, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f9733a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i11 = message.what;
                if (i11 == 1) {
                    objB = DefaultDrmSession.this.f9719l.b(DefaultDrmSession.this.f9720m, (m.d) dVar.f9738d);
                } else {
                    if (i11 != 2) {
                        throw new RuntimeException();
                    }
                    objB = DefaultDrmSession.this.f9719l.a(DefaultDrmSession.this.f9720m, (m.a) dVar.f9738d);
                }
            } catch (MediaDrmCallbackException e11) {
                boolean zA = a(message, e11);
                objB = e11;
                if (zA) {
                    return;
                }
            } catch (Exception e12) {
                t.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e12);
                objB = e12;
            }
            DefaultDrmSession.this.f9717j.a(dVar.f9735a);
            synchronized (this) {
                try {
                    if (!this.f9733a) {
                        DefaultDrmSession.this.f9722o.obtainMessage(message.what, Pair.create(dVar.f9738d, objB)).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f9737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f9738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9739e;

        public d(long j11, boolean z11, long j12, Object obj) {
            this.f9735a = j11;
            this.f9736b = z11;
            this.f9737c = j12;
            this.f9738d = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i11 = message.what;
            if (i11 == 1) {
                DefaultDrmSession.this.D(obj, obj2);
            } else {
                if (i11 != 2) {
                    return;
                }
                DefaultDrmSession.this.x(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, m mVar, a aVar, b bVar, List<p7.n.b> list, int i11, boolean z11, boolean z12, byte[] bArr, HashMap<String, String> map, p pVar, Looper looper, androidx.media3.exoplayer.upstream.b bVar2, o2 o2Var) {
        if (i11 == 1 || i11 == 3) {
            s7.a.f(bArr);
        }
        this.f9720m = uuid;
        this.f9710c = aVar;
        this.f9711d = bVar;
        this.f9709b = mVar;
        this.f9712e = i11;
        this.f9713f = z11;
        this.f9714g = z12;
        if (bArr != null) {
            this.f9730w = bArr;
            this.f9708a = null;
        } else {
            this.f9708a = Collections.unmodifiableList((List) s7.a.f(list));
        }
        this.f9715h = map;
        this.f9719l = pVar;
        this.f9716i = new s7.o<>();
        this.f9717j = bVar2;
        this.f9718k = o2Var;
        this.f9723p = 2;
        this.f9721n = looper;
        this.f9722o = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(Object obj, Object obj2) {
        if (obj == this.f9732y) {
            if (this.f9723p == 2 || v()) {
                this.f9732y = null;
                if (obj2 instanceof Exception) {
                    this.f9710c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f9709b.f((byte[]) obj2);
                    this.f9710c.b();
                } catch (Exception e11) {
                    this.f9710c.a(e11, true);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean E() {
        if (v()) {
            return true;
        }
        try {
            byte[] bArrC = this.f9709b.c();
            this.f9729v = bArrC;
            this.f9709b.l(bArrC, this.f9718k);
            this.f9727t = this.f9709b.h(this.f9729v);
            final int i11 = 3;
            this.f9723p = 3;
            r(new s7.n() { // from class: androidx.media3.exoplayer.drm.b
                @Override // s7.n
                public final void accept(Object obj) {
                    ((h.a) obj).k(i11);
                }
            });
            s7.a.f(this.f9729v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f9710c.c(this);
            return false;
        } catch (Exception e11) {
            e = e11;
            if (j.d(e)) {
                this.f9710c.c(this);
                return false;
            }
            w(e, 1);
            return false;
        } catch (NoSuchMethodError e12) {
            e = e12;
            if (j.d(e)) {
                this.f9710c.c(this);
                return false;
            }
            w(e, 1);
            return false;
        }
    }

    private void F(byte[] bArr, int i11, boolean z11) {
        try {
            this.f9731x = this.f9709b.k(bArr, this.f9708a, i11, this.f9715h);
            ((c) q0.l(this.f9726s)).b(2, s7.a.f(this.f9731x), z11);
        } catch (Exception | NoSuchMethodError e11) {
            y(e11, true);
        }
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    private boolean H() {
        try {
            this.f9709b.d(this.f9729v, this.f9730w);
            return true;
        } catch (Exception | NoSuchMethodError e11) {
            w(e11, 1);
            return false;
        }
    }

    private void I() {
        if (Thread.currentThread() != this.f9721n.getThread()) {
            t.j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f9721n.getThread().getName(), new IllegalStateException());
        }
    }

    private void r(s7.n<h.a> nVar) {
        Iterator<h.a> it = this.f9716i.K2().iterator();
        while (it.hasNext()) {
            nVar.accept(it.next());
        }
    }

    @RequiresNonNull({"sessionId"})
    private void s(boolean z11) {
        if (this.f9714g) {
            return;
        }
        byte[] bArr = (byte[]) q0.l(this.f9729v);
        int i11 = this.f9712e;
        if (i11 != 0 && i11 != 1) {
            if (i11 == 2) {
                if (this.f9730w == null || H()) {
                    F(bArr, 2, z11);
                    return;
                }
                return;
            }
            if (i11 != 3) {
                return;
            }
            s7.a.f(this.f9730w);
            s7.a.f(this.f9729v);
            F(this.f9730w, 3, z11);
            return;
        }
        if (this.f9730w == null) {
            F(bArr, 1, z11);
            return;
        }
        if (this.f9723p == 4 || H()) {
            long jT = t();
            if (this.f9712e != 0 || jT > 60) {
                if (jT <= 0) {
                    w(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.f9723p = 4;
                    r(new s7.n() { // from class: e8.c
                        @Override // s7.n
                        public final void accept(Object obj) {
                            ((androidx.media3.exoplayer.drm.h.a) obj).j();
                        }
                    });
                    return;
                }
            }
            t.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jT);
            F(bArr, 2, z11);
        }
    }

    private long t() {
        if (!p7.h.f101351d.equals(this.f9720m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) s7.a.f(e8.p.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean v() {
        int i11 = this.f9723p;
        return i11 == 3 || i11 == 4;
    }

    private void w(final Throwable th2, int i11) {
        this.f9728u = new DrmSession.DrmSessionException(th2, j.b(th2, i11));
        t.e("DefaultDrmSession", "DRM session error", th2);
        if (th2 instanceof Exception) {
            r(new s7.n() { // from class: androidx.media3.exoplayer.drm.c
                @Override // s7.n
                public final void accept(Object obj) {
                    ((h.a) obj).l((Exception) th2);
                }
            });
        } else {
            if (!(th2 instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th2);
            }
            if (!j.e(th2) && !j.d(th2)) {
                throw ((Error) th2);
            }
        }
        if (this.f9723p != 4) {
            this.f9723p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Object obj, Object obj2) {
        if (obj == this.f9731x && v()) {
            this.f9731x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                y((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f9712e == 3) {
                    this.f9709b.e((byte[]) q0.l(this.f9730w), bArr);
                    r(new s7.n() { // from class: e8.a
                        @Override // s7.n
                        public final void accept(Object obj3) {
                            ((androidx.media3.exoplayer.drm.h.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrE = this.f9709b.e(this.f9729v, bArr);
                int i11 = this.f9712e;
                if ((i11 == 2 || (i11 == 0 && this.f9730w != null)) && bArrE != null && bArrE.length != 0) {
                    this.f9730w = bArrE;
                }
                this.f9723p = 4;
                r(new s7.n() { // from class: e8.b
                    @Override // s7.n
                    public final void accept(Object obj3) {
                        ((androidx.media3.exoplayer.drm.h.a) obj3).h();
                    }
                });
            } catch (Exception e11) {
                e = e11;
                y(e, true);
            } catch (NoSuchMethodError e12) {
                e = e12;
                y(e, true);
            }
        }
    }

    private void y(Throwable th2, boolean z11) {
        if ((th2 instanceof NotProvisionedException) || j.d(th2)) {
            this.f9710c.c(this);
        } else {
            w(th2, z11 ? 1 : 2);
        }
    }

    private void z() {
        if (this.f9712e == 0 && this.f9723p == 4) {
            q0.l(this.f9729v);
            s(false);
        }
    }

    void A(int i11) {
        if (i11 != 2) {
            return;
        }
        z();
    }

    void B() {
        if (E()) {
            s(true);
        }
    }

    void C(Exception exc, boolean z11) {
        w(exc, z11 ? 1 : 3);
    }

    void G() {
        this.f9732y = this.f9709b.b();
        ((c) q0.l(this.f9726s)).b(1, s7.a.f(this.f9732y), true);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final DrmSession.DrmSessionException a() {
        I();
        if (this.f9723p == 1) {
            return this.f9728u;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean b() {
        I();
        return this.f9713f;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final y7.b c() {
        I();
        return this.f9727t;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public Map<String, String> d() {
        I();
        byte[] bArr = this.f9729v;
        if (bArr == null) {
            return null;
        }
        return this.f9709b.a(bArr);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID e() {
        I();
        return this.f9720m;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public boolean f(String str) {
        I();
        return this.f9709b.i((byte[]) s7.a.j(this.f9729v), str);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        I();
        return this.f9723p;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void h(h.a aVar) {
        I();
        int i11 = this.f9724q;
        if (i11 <= 0) {
            t.d("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i12 = i11 - 1;
        this.f9724q = i12;
        if (i12 == 0) {
            this.f9723p = 0;
            ((e) q0.l(this.f9722o)).removeCallbacksAndMessages(null);
            ((c) q0.l(this.f9726s)).c();
            this.f9726s = null;
            ((HandlerThread) q0.l(this.f9725r)).quit();
            this.f9725r = null;
            this.f9727t = null;
            this.f9728u = null;
            this.f9731x = null;
            this.f9732y = null;
            byte[] bArr = this.f9729v;
            if (bArr != null) {
                this.f9709b.j(bArr);
                this.f9729v = null;
            }
        }
        if (aVar != null) {
            this.f9716i.d(aVar);
            if (this.f9716i.b(aVar) == 0) {
                aVar.m();
            }
        }
        this.f9711d.b(this, this.f9724q);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public void i(h.a aVar) {
        I();
        if (this.f9724q < 0) {
            t.d("DefaultDrmSession", "Session reference count less than zero: " + this.f9724q);
            this.f9724q = 0;
        }
        if (aVar != null) {
            this.f9716i.a(aVar);
        }
        int i11 = this.f9724q + 1;
        this.f9724q = i11;
        if (i11 == 1) {
            s7.a.h(this.f9723p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f9725r = handlerThread;
            handlerThread.start();
            this.f9726s = new c(this.f9725r.getLooper());
            if (E()) {
                s(true);
            }
        } else if (aVar != null && v() && this.f9716i.b(aVar) == 1) {
            aVar.k(this.f9723p);
        }
        this.f9711d.a(this, this.f9724q);
    }

    public boolean u(byte[] bArr) {
        I();
        return Arrays.equals(this.f9729v, bArr);
    }
}
