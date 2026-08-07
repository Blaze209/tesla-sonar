package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import cr.q1;
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
import ts.p0;
import ts.u;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
class DefaultDrmSession implements DrmSession {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<h.b> f39728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f39729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f39730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f39731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f39732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f39733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f39734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap<String, String> f39735h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ts.i<i.a> f39736i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f39737j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final q1 f39738k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final q f39739l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final UUID f39740m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Looper f39741n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f39742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f39743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f39744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HandlerThread f39745r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f39746s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private fr.b f39747t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private DrmSession.DrmSessionException f39748u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f39749v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f39750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private n.a f39751x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private n.d f39752y;

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
        private boolean f39753a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, MediaDrmCallbackException mediaDrmCallbackException) {
            d dVar = (d) message.obj;
            if (!dVar.f39756b) {
                return false;
            }
            int i11 = dVar.f39759e + 1;
            dVar.f39759e = i11;
            if (i11 > DefaultDrmSession.this.f39737j.b(3)) {
                return false;
            }
            long jC = DefaultDrmSession.this.f39737j.c(new com.google.android.exoplayer2.upstream.b.a(new es.h(dVar.f39755a, mediaDrmCallbackException.f39804a, mediaDrmCallbackException.f39805b, mediaDrmCallbackException.f39806c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f39757c, mediaDrmCallbackException.f39807d), new es.i(3), mediaDrmCallbackException.getCause() instanceof IOException ? (IOException) mediaDrmCallbackException.getCause() : new UnexpectedDrmSessionException(mediaDrmCallbackException.getCause()), dVar.f39759e));
            if (jC == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f39753a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jC);
                    return true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void b(int i11, Object obj, boolean z11) {
            obtainMessage(i11, new d(es.h.a(), z11, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f39753a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i11 = message.what;
                if (i11 == 0) {
                    objB = DefaultDrmSession.this.f39739l.b(DefaultDrmSession.this.f39740m, (n.d) dVar.f39758d);
                } else {
                    if (i11 != 1) {
                        throw new RuntimeException();
                    }
                    objB = DefaultDrmSession.this.f39739l.a(DefaultDrmSession.this.f39740m, (n.a) dVar.f39758d);
                }
            } catch (MediaDrmCallbackException e11) {
                boolean zA = a(message, e11);
                objB = e11;
                if (zA) {
                    return;
                }
            } catch (Exception e12) {
                u.j("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e12);
                objB = e12;
            }
            DefaultDrmSession.this.f39737j.a(dVar.f39755a);
            synchronized (this) {
                try {
                    if (!this.f39753a) {
                        DefaultDrmSession.this.f39742o.obtainMessage(message.what, Pair.create(dVar.f39758d, objB)).sendToTarget();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f39755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f39756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f39757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f39758d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f39759e;

        public d(long j11, boolean z11, long j12, Object obj) {
            this.f39755a = j11;
            this.f39756b = z11;
            this.f39757c = j12;
            this.f39758d = obj;
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
            if (i11 == 0) {
                DefaultDrmSession.this.D(obj, obj2);
            } else {
                if (i11 != 1) {
                    return;
                }
                DefaultDrmSession.this.x(obj, obj2);
            }
        }
    }

    public DefaultDrmSession(UUID uuid, n nVar, a aVar, b bVar, List<h.b> list, int i11, boolean z11, boolean z12, byte[] bArr, HashMap<String, String> map, q qVar, Looper looper, com.google.android.exoplayer2.upstream.b bVar2, q1 q1Var) {
        if (i11 == 1 || i11 == 3) {
            ts.a.e(bArr);
        }
        this.f39740m = uuid;
        this.f39730c = aVar;
        this.f39731d = bVar;
        this.f39729b = nVar;
        this.f39732e = i11;
        this.f39733f = z11;
        this.f39734g = z12;
        if (bArr != null) {
            this.f39750w = bArr;
            this.f39728a = null;
        } else {
            this.f39728a = Collections.unmodifiableList((List) ts.a.e(list));
        }
        this.f39735h = map;
        this.f39739l = qVar;
        this.f39736i = new ts.i<>();
        this.f39737j = bVar2;
        this.f39738k = q1Var;
        this.f39743p = 2;
        this.f39741n = looper;
        this.f39742o = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(Object obj, Object obj2) {
        if (obj == this.f39752y) {
            if (this.f39743p == 2 || v()) {
                this.f39752y = null;
                if (obj2 instanceof Exception) {
                    this.f39730c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f39729b.f((byte[]) obj2);
                    this.f39730c.b();
                } catch (Exception e11) {
                    this.f39730c.a(e11, true);
                }
            }
        }
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean E() {
        if (v()) {
            return true;
        }
        try {
            byte[] bArrC = this.f39729b.c();
            this.f39749v = bArrC;
            this.f39729b.m(bArrC, this.f39738k);
            this.f39747t = this.f39729b.h(this.f39749v);
            final int i11 = 3;
            this.f39743p = 3;
            r(new ts.h() { // from class: com.google.android.exoplayer2.drm.b
                @Override // ts.h
                public final void accept(Object obj) {
                    ((i.a) obj).k(i11);
                }
            });
            ts.a.e(this.f39749v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f39730c.c(this);
            return false;
        } catch (Exception e11) {
            w(e11, 1);
            return false;
        }
    }

    private void F(byte[] bArr, int i11, boolean z11) {
        try {
            this.f39751x = this.f39729b.k(bArr, this.f39728a, i11, this.f39735h);
            ((c) p0.j(this.f39746s)).b(1, ts.a.e(this.f39751x), z11);
        } catch (Exception e11) {
            y(e11, true);
        }
    }

    @RequiresNonNull({"sessionId", "offlineLicenseKeySetId"})
    private boolean H() {
        try {
            this.f39729b.d(this.f39749v, this.f39750w);
            return true;
        } catch (Exception e11) {
            w(e11, 1);
            return false;
        }
    }

    private void I() {
        if (Thread.currentThread() != this.f39741n.getThread()) {
            u.j("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f39741n.getThread().getName(), new IllegalStateException());
        }
    }

    private void r(ts.h<i.a> hVar) {
        Iterator<i.a> it = this.f39736i.K2().iterator();
        while (it.hasNext()) {
            hVar.accept(it.next());
        }
    }

    @RequiresNonNull({"sessionId"})
    private void s(boolean z11) {
        if (this.f39734g) {
            return;
        }
        byte[] bArr = (byte[]) p0.j(this.f39749v);
        int i11 = this.f39732e;
        if (i11 != 0 && i11 != 1) {
            if (i11 == 2) {
                if (this.f39750w == null || H()) {
                    F(bArr, 2, z11);
                    return;
                }
                return;
            }
            if (i11 != 3) {
                return;
            }
            ts.a.e(this.f39750w);
            ts.a.e(this.f39749v);
            F(this.f39750w, 3, z11);
            return;
        }
        if (this.f39750w == null) {
            F(bArr, 1, z11);
            return;
        }
        if (this.f39743p == 4 || H()) {
            long jT = t();
            if (this.f39732e != 0 || jT > 60) {
                if (jT <= 0) {
                    w(new KeysExpiredException(), 2);
                    return;
                } else {
                    this.f39743p = 4;
                    r(new ts.h() { // from class: gr.a
                        @Override // ts.h
                        public final void accept(Object obj) {
                            ((com.google.android.exoplayer2.drm.i.a) obj).j();
                        }
                    });
                    return;
                }
            }
            u.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jT);
            F(bArr, 2, z11);
        }
    }

    private long t() {
        if (!br.d.f17905d.equals(this.f39740m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) ts.a.e(gr.o.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    @EnsuresNonNullIf(expression = {"sessionId"}, result = true)
    private boolean v() {
        int i11 = this.f39743p;
        return i11 == 3 || i11 == 4;
    }

    private void w(final Exception exc, int i11) {
        this.f39748u = new DrmSession.DrmSessionException(exc, k.a(exc, i11));
        u.d("DefaultDrmSession", "DRM session error", exc);
        r(new ts.h() { // from class: com.google.android.exoplayer2.drm.c
            @Override // ts.h
            public final void accept(Object obj) {
                ((i.a) obj).l(exc);
            }
        });
        if (this.f39743p != 4) {
            this.f39743p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Object obj, Object obj2) {
        if (obj == this.f39751x && v()) {
            this.f39751x = null;
            if (obj2 instanceof Exception) {
                y((Exception) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f39732e == 3) {
                    this.f39729b.e((byte[]) p0.j(this.f39750w), bArr);
                    r(new ts.h() { // from class: gr.b
                        @Override // ts.h
                        public final void accept(Object obj3) {
                            ((com.google.android.exoplayer2.drm.i.a) obj3).i();
                        }
                    });
                    return;
                }
                byte[] bArrE = this.f39729b.e(this.f39749v, bArr);
                int i11 = this.f39732e;
                if ((i11 == 2 || (i11 == 0 && this.f39750w != null)) && bArrE != null && bArrE.length != 0) {
                    this.f39750w = bArrE;
                }
                this.f39743p = 4;
                r(new ts.h() { // from class: gr.c
                    @Override // ts.h
                    public final void accept(Object obj3) {
                        ((com.google.android.exoplayer2.drm.i.a) obj3).h();
                    }
                });
            } catch (Exception e11) {
                y(e11, true);
            }
        }
    }

    private void y(Exception exc, boolean z11) {
        if (exc instanceof NotProvisionedException) {
            this.f39730c.c(this);
        } else {
            w(exc, z11 ? 1 : 2);
        }
    }

    private void z() {
        if (this.f39732e == 0 && this.f39743p == 4) {
            p0.j(this.f39749v);
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
        this.f39752y = this.f39729b.b();
        ((c) p0.j(this.f39746s)).b(0, ts.a.e(this.f39752y), true);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException a() {
        I();
        if (this.f39743p == 1) {
            return this.f39748u;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean b() {
        I();
        return this.f39733f;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final fr.b c() {
        I();
        return this.f39747t;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map<String, String> d() {
        I();
        byte[] bArr = this.f39749v;
        if (bArr == null) {
            return null;
        }
        return this.f39729b.a(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID e() {
        I();
        return this.f39740m;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean f(String str) {
        I();
        return this.f39729b.i((byte[]) ts.a.i(this.f39749v), str);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void g(i.a aVar) {
        I();
        int i11 = this.f39744q;
        if (i11 <= 0) {
            u.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i12 = i11 - 1;
        this.f39744q = i12;
        if (i12 == 0) {
            this.f39743p = 0;
            ((e) p0.j(this.f39742o)).removeCallbacksAndMessages(null);
            ((c) p0.j(this.f39746s)).c();
            this.f39746s = null;
            ((HandlerThread) p0.j(this.f39745r)).quit();
            this.f39745r = null;
            this.f39747t = null;
            this.f39748u = null;
            this.f39751x = null;
            this.f39752y = null;
            byte[] bArr = this.f39749v;
            if (bArr != null) {
                this.f39729b.j(bArr);
                this.f39749v = null;
            }
        }
        if (aVar != null) {
            this.f39736i.d(aVar);
            if (this.f39736i.b(aVar) == 0) {
                aVar.m();
            }
        }
        this.f39731d.a(this, this.f39744q);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        I();
        return this.f39743p;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void i(i.a aVar) {
        I();
        if (this.f39744q < 0) {
            u.c("DefaultDrmSession", "Session reference count less than zero: " + this.f39744q);
            this.f39744q = 0;
        }
        if (aVar != null) {
            this.f39736i.a(aVar);
        }
        int i11 = this.f39744q + 1;
        this.f39744q = i11;
        if (i11 == 1) {
            ts.a.g(this.f39743p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f39745r = handlerThread;
            handlerThread.start();
            this.f39746s = new c(this.f39745r.getLooper());
            if (E()) {
                s(true);
            }
        } else if (aVar != null && v() && this.f39736i.b(aVar) == 1) {
            aVar.k(this.f39743p);
        }
        this.f39731d.b(this, this.f39744q);
    }

    public boolean u(byte[] bArr) {
        I();
        return Arrays.equals(this.f39749v, bArr);
    }
}
