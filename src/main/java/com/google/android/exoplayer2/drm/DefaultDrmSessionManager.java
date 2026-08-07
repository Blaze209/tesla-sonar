package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.u0;
import com.google.common.collect.b0;
import com.google.common.collect.d1;
import com.google.common.collect.x;
import com.google.common.collect.z0;
import cr.q1;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import ts.p0;
import ts.u;
import ts.y;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class DefaultDrmSessionManager implements j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final UUID f39761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n.c f39762d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q f39763e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, String> f39764f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f39765g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f39766h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f39767i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f f39768j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f39769k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final g f39770l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final long f39771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<DefaultDrmSession> f39772n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set<e> f39773o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Set<DefaultDrmSession> f39774p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f39775q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private n f39776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private DefaultDrmSession f39777s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private DefaultDrmSession f39778t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Looper f39779u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Handler f39780v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f39781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private byte[] f39782x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private q1 f39783y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    volatile d f39784z;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f39788d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f39790f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f39785a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f39786b = br.d.f17905d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n.c f39787c = o.f39843d;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private com.google.android.exoplayer2.upstream.b f39791g = new com.google.android.exoplayer2.upstream.a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f39789e = new int[0];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f39792h = DataPersistorKt.EXPIRATION_TIME;

        public DefaultDrmSessionManager a(q qVar) {
            return new DefaultDrmSessionManager(this.f39786b, this.f39787c, qVar, this.f39785a, this.f39788d, this.f39789e, this.f39790f, this.f39791g, this.f39792h);
        }

        public b b(boolean z11) {
            this.f39788d = z11;
            return this;
        }

        public b c(boolean z11) {
            this.f39790f = z11;
            return this;
        }

        public b d(int... iArr) {
            for (int i11 : iArr) {
                boolean z11 = true;
                if (i11 != 2 && i11 != 1) {
                    z11 = false;
                }
                ts.a.a(z11);
            }
            this.f39789e = (int[]) iArr.clone();
            return this;
        }

        public b e(UUID uuid, n.c cVar) {
            this.f39786b = (UUID) ts.a.e(uuid);
            this.f39787c = (n.c) ts.a.e(cVar);
            return this;
        }
    }

    private class c implements n.b {
        private c() {
        }

        @Override // com.google.android.exoplayer2.drm.n.b
        public void a(n nVar, byte[] bArr, int i11, int i12, byte[] bArr2) {
            ((d) ts.a.e(DefaultDrmSessionManager.this.f39784z)).obtainMessage(i11, bArr).sendToTarget();
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f39772n) {
                if (defaultDrmSession.u(bArr)) {
                    defaultDrmSession.A(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements j.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final i.a f39795b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private DrmSession f39796c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f39797d;

        public e(i.a aVar) {
            this.f39795b = aVar;
        }

        public static /* synthetic */ void b(e eVar, u0 u0Var) {
            if (DefaultDrmSessionManager.this.f39775q == 0 || eVar.f39797d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            eVar.f39796c = defaultDrmSessionManager.t((Looper) ts.a.e(defaultDrmSessionManager.f39779u), eVar.f39795b, u0Var, false);
            DefaultDrmSessionManager.this.f39773o.add(eVar);
        }

        public static /* synthetic */ void c(e eVar) {
            if (eVar.f39797d) {
                return;
            }
            DrmSession drmSession = eVar.f39796c;
            if (drmSession != null) {
                drmSession.g(eVar.f39795b);
            }
            DefaultDrmSessionManager.this.f39773o.remove(eVar);
            eVar.f39797d = true;
        }

        public void d(final u0 u0Var) {
            ((Handler) ts.a.e(DefaultDrmSessionManager.this.f39780v)).post(new Runnable() { // from class: com.google.android.exoplayer2.drm.d
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.b(this.f39811a, u0Var);
                }
            });
        }

        @Override // com.google.android.exoplayer2.drm.j.b
        public void release() {
            p0.J0((Handler) ts.a.e(DefaultDrmSessionManager.this.f39780v), new Runnable() { // from class: com.google.android.exoplayer2.drm.e
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.c(this.f39813a);
                }
            });
        }
    }

    private class f implements DefaultDrmSession.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<DefaultDrmSession> f39799a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private DefaultDrmSession f39800b;

        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void a(Exception exc, boolean z11) {
            this.f39800b = null;
            x xVarN = x.n(this.f39799a);
            this.f39799a.clear();
            d1 it = xVarN.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).C(exc, z11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void b() {
            this.f39800b = null;
            x xVarN = x.n(this.f39799a);
            this.f39799a.clear();
            d1 it = xVarN.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).B();
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public void c(DefaultDrmSession defaultDrmSession) {
            this.f39799a.add(defaultDrmSession);
            if (this.f39800b != null) {
                return;
            }
            this.f39800b = defaultDrmSession;
            defaultDrmSession.G();
        }

        public void d(DefaultDrmSession defaultDrmSession) {
            this.f39799a.remove(defaultDrmSession);
            if (this.f39800b == defaultDrmSession) {
                this.f39800b = null;
                if (this.f39799a.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.f39799a.iterator().next();
                this.f39800b = next;
                next.G();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class g implements DefaultDrmSession.b {
        private g() {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void a(final DefaultDrmSession defaultDrmSession, int i11) {
            if (i11 == 1 && DefaultDrmSessionManager.this.f39775q > 0 && DefaultDrmSessionManager.this.f39771m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f39774p.add(defaultDrmSession);
                ((Handler) ts.a.e(DefaultDrmSessionManager.this.f39780v)).postAtTime(new Runnable() { // from class: com.google.android.exoplayer2.drm.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.g(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f39771m);
            } else if (i11 == 0) {
                DefaultDrmSessionManager.this.f39772n.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f39777s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f39777s = null;
                }
                if (DefaultDrmSessionManager.this.f39778t == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f39778t = null;
                }
                DefaultDrmSessionManager.this.f39768j.d(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f39771m != -9223372036854775807L) {
                    ((Handler) ts.a.e(DefaultDrmSessionManager.this.f39780v)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f39774p.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.C();
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public void b(DefaultDrmSession defaultDrmSession, int i11) {
            if (DefaultDrmSessionManager.this.f39771m != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f39774p.remove(defaultDrmSession);
                ((Handler) ts.a.e(DefaultDrmSessionManager.this.f39780v)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }
    }

    private DrmSession A(int i11, boolean z11) {
        n nVar = (n) ts.a.e(this.f39776r);
        if ((nVar.g() == 2 && gr.l.f69367d) || p0.A0(this.f39766h, i11) == -1 || nVar.g() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f39777s;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionX = x(x.r(), true, null, z11);
            this.f39772n.add(defaultDrmSessionX);
            this.f39777s = defaultDrmSessionX;
        } else {
            defaultDrmSession.i(null);
        }
        return this.f39777s;
    }

    private void B(Looper looper) {
        if (this.f39784z == null) {
            this.f39784z = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f39776r != null && this.f39775q == 0 && this.f39772n.isEmpty() && this.f39773o.isEmpty()) {
            ((n) ts.a.e(this.f39776r)).release();
            this.f39776r = null;
        }
    }

    private void D() {
        d1 it = b0.m(this.f39774p).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).g(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void E() {
        d1 it = b0.m(this.f39773o).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
    }

    private void G(DrmSession drmSession, i.a aVar) {
        drmSession.g(aVar);
        if (this.f39771m != -9223372036854775807L) {
            drmSession.g(null);
        }
    }

    private void H(boolean z11) {
        if (z11 && this.f39779u == null) {
            u.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) ts.a.e(this.f39779u)).getThread()) {
            u.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f39779u.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public DrmSession t(Looper looper, i.a aVar, u0 u0Var, boolean z11) {
        List<h.b> listY;
        B(looper);
        h hVar = u0Var.f40715o;
        if (hVar == null) {
            return A(y.i(u0Var.f40712l), z11);
        }
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (this.f39782x == null) {
            listY = y((h) ts.a.e(hVar), this.f39761c, false);
            if (listY.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f39761c);
                u.d("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new m(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            listY = null;
        }
        if (this.f39765g) {
            for (DefaultDrmSession defaultDrmSession2 : this.f39772n) {
                if (p0.c(defaultDrmSession2.f39728a, listY)) {
                    defaultDrmSession = defaultDrmSession2;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f39778t;
        }
        if (defaultDrmSession != null) {
            defaultDrmSession.i(aVar);
            return defaultDrmSession;
        }
        DefaultDrmSession defaultDrmSessionX = x(listY, false, aVar, z11);
        if (!this.f39765g) {
            this.f39778t = defaultDrmSessionX;
        }
        this.f39772n.add(defaultDrmSessionX);
        return defaultDrmSessionX;
    }

    private static boolean u(DrmSession drmSession) {
        if (drmSession.getState() == 1) {
            return p0.f115040a < 19 || (((DrmSession.DrmSessionException) ts.a.e(drmSession.a())).getCause() instanceof ResourceBusyException);
        }
        return false;
    }

    private boolean v(h hVar) {
        if (this.f39782x != null) {
            return true;
        }
        if (y(hVar, this.f39761c, true).isEmpty()) {
            if (hVar.f39823d != 1 || !hVar.c(0).b(br.d.f17903b)) {
                return false;
            }
            u.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f39761c);
        }
        String str = hVar.f39822c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            return p0.f115040a >= 25;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private DefaultDrmSession w(List<h.b> list, boolean z11, i.a aVar) {
        ts.a.e(this.f39776r);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f39761c, this.f39776r, this.f39768j, this.f39770l, list, this.f39781w, this.f39767i | z11, z11, this.f39782x, this.f39764f, this.f39763e, (Looper) ts.a.e(this.f39779u), this.f39769k, (q1) ts.a.e(this.f39783y));
        defaultDrmSession.i(aVar);
        if (this.f39771m != -9223372036854775807L) {
            defaultDrmSession.i(null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession x(List<h.b> list, boolean z11, i.a aVar, boolean z12) {
        DefaultDrmSession defaultDrmSessionW = w(list, z11, aVar);
        if (u(defaultDrmSessionW) && !this.f39774p.isEmpty()) {
            D();
            G(defaultDrmSessionW, aVar);
            defaultDrmSessionW = w(list, z11, aVar);
        }
        if (!u(defaultDrmSessionW) || !z12 || this.f39773o.isEmpty()) {
            return defaultDrmSessionW;
        }
        E();
        if (!this.f39774p.isEmpty()) {
            D();
        }
        G(defaultDrmSessionW, aVar);
        return w(list, z11, aVar);
    }

    private static List<h.b> y(h hVar, UUID uuid, boolean z11) {
        ArrayList arrayList = new ArrayList(hVar.f39823d);
        for (int i11 = 0; i11 < hVar.f39823d; i11++) {
            h.b bVarC = hVar.c(i11);
            if ((bVarC.b(uuid) || (br.d.f17904c.equals(uuid) && bVarC.b(br.d.f17903b))) && (bVarC.f39828e != null || z11)) {
                arrayList.add(bVarC);
            }
        }
        return arrayList;
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void z(Looper looper) {
        try {
            Looper looper2 = this.f39779u;
            if (looper2 == null) {
                this.f39779u = looper;
                this.f39780v = new Handler(looper);
            } else {
                ts.a.g(looper2 == looper);
                ts.a.e(this.f39780v);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void F(int i11, byte[] bArr) {
        ts.a.g(this.f39772n.isEmpty());
        if (i11 == 1 || i11 == 3) {
            ts.a.e(bArr);
        }
        this.f39781w = i11;
        this.f39782x = bArr;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public DrmSession a(i.a aVar, u0 u0Var) {
        H(false);
        ts.a.g(this.f39775q > 0);
        ts.a.i(this.f39779u);
        return t(this.f39779u, aVar, u0Var, true);
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final void b() {
        H(true);
        int i11 = this.f39775q;
        this.f39775q = i11 + 1;
        if (i11 != 0) {
            return;
        }
        if (this.f39776r == null) {
            n nVarA = this.f39762d.a(this.f39761c);
            this.f39776r = nVarA;
            nVarA.l(new c());
        } else if (this.f39771m != -9223372036854775807L) {
            for (int i12 = 0; i12 < this.f39772n.size(); i12++) {
                this.f39772n.get(i12).i(null);
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.j
    public j.b c(i.a aVar, u0 u0Var) {
        ts.a.g(this.f39775q > 0);
        ts.a.i(this.f39779u);
        e eVar = new e(aVar);
        eVar.d(u0Var);
        return eVar;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public int d(u0 u0Var) {
        H(false);
        int iG = ((n) ts.a.e(this.f39776r)).g();
        h hVar = u0Var.f40715o;
        if (hVar == null) {
            if (p0.A0(this.f39766h, y.i(u0Var.f40712l)) == -1) {
                return 0;
            }
        } else if (!v(hVar)) {
            return 1;
        }
        return iG;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void e(Looper looper, q1 q1Var) {
        z(looper);
        this.f39783y = q1Var;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public final void release() {
        H(true);
        int i11 = this.f39775q - 1;
        this.f39775q = i11;
        if (i11 != 0) {
            return;
        }
        if (this.f39771m != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f39772n);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((DefaultDrmSession) arrayList.get(i12)).g(null);
            }
        }
        E();
        C();
    }

    private DefaultDrmSessionManager(UUID uuid, n.c cVar, q qVar, HashMap<String, String> map, boolean z11, int[] iArr, boolean z12, com.google.android.exoplayer2.upstream.b bVar, long j11) {
        ts.a.e(uuid);
        ts.a.b(!br.d.f17903b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f39761c = uuid;
        this.f39762d = cVar;
        this.f39763e = qVar;
        this.f39764f = map;
        this.f39765g = z11;
        this.f39766h = iArr;
        this.f39767i = z12;
        this.f39769k = bVar;
        this.f39768j = new f();
        this.f39770l = new g();
        this.f39781w = 0;
        this.f39772n = new ArrayList();
        this.f39773o = z0.g();
        this.f39774p = z0.g();
        this.f39771m = j11;
    }
}
