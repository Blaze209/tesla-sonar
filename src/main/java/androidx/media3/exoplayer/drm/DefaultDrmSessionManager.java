package androidx.media3.exoplayer.drm;

import a8.o2;
import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.common.collect.b0;
import com.google.common.collect.d1;
import com.google.common.collect.x;
import com.google.common.collect.z0;
import expo.modules.kotlin.activityresult.DataPersistorKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p7.g0;
import p7.u;
import s7.q0;
import s7.t;

/* JADX INFO: loaded from: classes.dex */
public class DefaultDrmSessionManager implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f9741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m.c f9742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p f9743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f9744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f9745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f9746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f9747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final f f9748i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f9749j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final g f9750k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f9751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<DefaultDrmSession> f9752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set<e> f9753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set<DefaultDrmSession> f9754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f9755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private m f9756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DefaultDrmSession f9757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private DefaultDrmSession f9758s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Looper f9759t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Handler f9760u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f9761v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f9762w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private o2 f9763x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    volatile d f9764y;

    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f9768d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f9765a = new HashMap<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f9766b = p7.h.f101351d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private m.c f9767c = n.f9814d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f9769e = new int[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f9770f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private androidx.media3.exoplayer.upstream.b f9771g = new androidx.media3.exoplayer.upstream.a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f9772h = DataPersistorKt.EXPIRATION_TIME;

        public DefaultDrmSessionManager a(p pVar) {
            return new DefaultDrmSessionManager(this.f9766b, this.f9767c, pVar, this.f9765a, this.f9768d, this.f9769e, this.f9770f, this.f9771g, this.f9772h);
        }

        public b b(Map<String, String> map) {
            this.f9765a.clear();
            if (map != null) {
                this.f9765a.putAll(map);
            }
            return this;
        }

        public b c(androidx.media3.exoplayer.upstream.b bVar) {
            this.f9771g = (androidx.media3.exoplayer.upstream.b) s7.a.f(bVar);
            return this;
        }

        public b d(boolean z11) {
            this.f9768d = z11;
            return this;
        }

        public b e(boolean z11) {
            this.f9770f = z11;
            return this;
        }

        public b f(int... iArr) {
            for (int i11 : iArr) {
                boolean z11 = true;
                if (i11 != 2 && i11 != 1) {
                    z11 = false;
                }
                s7.a.a(z11);
            }
            this.f9769e = (int[]) iArr.clone();
            return this;
        }

        public b g(UUID uuid, m.c cVar) {
            this.f9766b = (UUID) s7.a.f(uuid);
            this.f9767c = (m.c) s7.a.f(cVar);
            return this;
        }
    }

    private class c implements m.b {
        private c() {
        }

        @Override // androidx.media3.exoplayer.drm.m.b
        public void a(m mVar, byte[] bArr, int i11, int i12, byte[] bArr2) {
            ((d) s7.a.f(DefaultDrmSessionManager.this.f9764y)).obtainMessage(i11, bArr).sendToTarget();
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
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.f9752m) {
                if (defaultDrmSession.u(bArr)) {
                    defaultDrmSession.A(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements i.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h.a f9775b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private DrmSession f9776c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f9777d;

        public e(h.a aVar) {
            this.f9775b = aVar;
        }

        public static /* synthetic */ void b(e eVar, u uVar) {
            if (DefaultDrmSessionManager.this.f9755p == 0 || eVar.f9777d) {
                return;
            }
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            eVar.f9776c = defaultDrmSessionManager.t((Looper) s7.a.f(defaultDrmSessionManager.f9759t), eVar.f9775b, uVar, false);
            DefaultDrmSessionManager.this.f9753n.add(eVar);
        }

        public static /* synthetic */ void c(e eVar) {
            if (eVar.f9777d) {
                return;
            }
            DrmSession drmSession = eVar.f9776c;
            if (drmSession != null) {
                drmSession.h(eVar.f9775b);
            }
            DefaultDrmSessionManager.this.f9753n.remove(eVar);
            eVar.f9777d = true;
        }

        public void d(final u uVar) {
            ((Handler) s7.a.f(DefaultDrmSessionManager.this.f9760u)).post(new Runnable() { // from class: androidx.media3.exoplayer.drm.d
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.b(this.f9791a, uVar);
                }
            });
        }

        @Override // androidx.media3.exoplayer.drm.i.b
        public void release() {
            q0.m1((Handler) s7.a.f(DefaultDrmSessionManager.this.f9760u), new Runnable() { // from class: androidx.media3.exoplayer.drm.e
                @Override // java.lang.Runnable
                public final void run() {
                    DefaultDrmSessionManager.e.c(this.f9793a);
                }
            });
        }
    }

    private class f implements DefaultDrmSession.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<DefaultDrmSession> f9779a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private DefaultDrmSession f9780b;

        public f() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void a(Exception exc, boolean z11) {
            this.f9780b = null;
            x xVarN = x.n(this.f9779a);
            this.f9779a.clear();
            d1 it = xVarN.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).C(exc, z11);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void b() {
            this.f9780b = null;
            x xVarN = x.n(this.f9779a);
            this.f9779a.clear();
            d1 it = xVarN.iterator();
            while (it.hasNext()) {
                ((DefaultDrmSession) it.next()).B();
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public void c(DefaultDrmSession defaultDrmSession) {
            this.f9779a.add(defaultDrmSession);
            if (this.f9780b != null) {
                return;
            }
            this.f9780b = defaultDrmSession;
            defaultDrmSession.G();
        }

        public void d(DefaultDrmSession defaultDrmSession) {
            this.f9779a.remove(defaultDrmSession);
            if (this.f9780b == defaultDrmSession) {
                this.f9780b = null;
                if (this.f9779a.isEmpty()) {
                    return;
                }
                DefaultDrmSession next = this.f9779a.iterator().next();
                this.f9780b = next;
                next.G();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class g implements DefaultDrmSession.b {
        private g() {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.b
        public void a(DefaultDrmSession defaultDrmSession, int i11) {
            if (DefaultDrmSessionManager.this.f9751l != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f9754o.remove(defaultDrmSession);
                ((Handler) s7.a.f(DefaultDrmSessionManager.this.f9760u)).removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.b
        public void b(final DefaultDrmSession defaultDrmSession, int i11) {
            if (i11 == 1 && DefaultDrmSessionManager.this.f9755p > 0 && DefaultDrmSessionManager.this.f9751l != -9223372036854775807L) {
                DefaultDrmSessionManager.this.f9754o.add(defaultDrmSession);
                ((Handler) s7.a.f(DefaultDrmSessionManager.this.f9760u)).postAtTime(new Runnable() { // from class: androidx.media3.exoplayer.drm.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        defaultDrmSession.h(null);
                    }
                }, defaultDrmSession, SystemClock.uptimeMillis() + DefaultDrmSessionManager.this.f9751l);
            } else if (i11 == 0) {
                DefaultDrmSessionManager.this.f9752m.remove(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f9757r == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f9757r = null;
                }
                if (DefaultDrmSessionManager.this.f9758s == defaultDrmSession) {
                    DefaultDrmSessionManager.this.f9758s = null;
                }
                DefaultDrmSessionManager.this.f9748i.d(defaultDrmSession);
                if (DefaultDrmSessionManager.this.f9751l != -9223372036854775807L) {
                    ((Handler) s7.a.f(DefaultDrmSessionManager.this.f9760u)).removeCallbacksAndMessages(defaultDrmSession);
                    DefaultDrmSessionManager.this.f9754o.remove(defaultDrmSession);
                }
            }
            DefaultDrmSessionManager.this.C();
        }
    }

    private DrmSession A(int i11, boolean z11) {
        m mVar = (m) s7.a.f(this.f9756q);
        if ((mVar.g() == 2 && e8.l.f62229d) || q0.X0(this.f9746g, i11) == -1 || mVar.g() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession = this.f9757r;
        if (defaultDrmSession == null) {
            DefaultDrmSession defaultDrmSessionX = x(x.r(), true, null, z11);
            this.f9752m.add(defaultDrmSessionX);
            this.f9757r = defaultDrmSessionX;
        } else {
            defaultDrmSession.i(null);
        }
        return this.f9757r;
    }

    private void B(Looper looper) {
        if (this.f9764y == null) {
            this.f9764y = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f9756q != null && this.f9755p == 0 && this.f9752m.isEmpty() && this.f9753n.isEmpty()) {
            ((m) s7.a.f(this.f9756q)).release();
            this.f9756q = null;
        }
    }

    private void D() {
        d1 it = b0.m(this.f9754o).iterator();
        while (it.hasNext()) {
            ((DrmSession) it.next()).h(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void E() {
        d1 it = b0.m(this.f9753n).iterator();
        while (it.hasNext()) {
            ((e) it.next()).release();
        }
    }

    private void G(DrmSession drmSession, h.a aVar) {
        drmSession.h(aVar);
        if (this.f9751l != -9223372036854775807L) {
            drmSession.h(null);
        }
    }

    private void H(boolean z11) {
        if (z11 && this.f9759t == null) {
            t.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) s7.a.f(this.f9759t)).getThread()) {
            t.j("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f9759t.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public DrmSession t(Looper looper, h.a aVar, u uVar, boolean z11) {
        List<p7.n.b> listY;
        B(looper);
        p7.n nVar = uVar.f101548s;
        if (nVar == null) {
            return A(g0.k(uVar.f101544o), z11);
        }
        DefaultDrmSession defaultDrmSession = null;
        Object[] objArr = 0;
        if (this.f9762w == null) {
            listY = y((p7.n) s7.a.f(nVar), this.f9741b, false);
            if (listY.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f9741b);
                t.e("DefaultDrmSessionMgr", "DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.l(missingSchemeDataException);
                }
                return new l(new DrmSession.DrmSessionException(missingSchemeDataException, 6003));
            }
        } else {
            listY = null;
        }
        if (this.f9745f) {
            for (DefaultDrmSession defaultDrmSession2 : this.f9752m) {
                if (Objects.equals(defaultDrmSession2.f9708a, listY)) {
                    defaultDrmSession = defaultDrmSession2;
                    break;
                }
            }
        } else {
            defaultDrmSession = this.f9758s;
        }
        if (defaultDrmSession != null) {
            defaultDrmSession.i(aVar);
            return defaultDrmSession;
        }
        DefaultDrmSession defaultDrmSessionX = x(listY, false, aVar, z11);
        if (!this.f9745f) {
            this.f9758s = defaultDrmSessionX;
        }
        this.f9752m.add(defaultDrmSessionX);
        return defaultDrmSessionX;
    }

    private static boolean u(DrmSession drmSession) {
        if (drmSession.getState() != 1) {
            return false;
        }
        Throwable cause = ((DrmSession.DrmSessionException) s7.a.f(drmSession.a())).getCause();
        return (cause instanceof ResourceBusyException) || j.e(cause);
    }

    private boolean v(p7.n nVar) {
        if (this.f9762w != null) {
            return true;
        }
        if (y(nVar, this.f9741b, true).isEmpty()) {
            if (nVar.f101433d != 1 || !nVar.h(0).d(p7.h.f101349b)) {
                return false;
            }
            t.i("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f9741b);
        }
        String str = nVar.f101432c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            return Build.VERSION.SDK_INT >= 25;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private DefaultDrmSession w(List<p7.n.b> list, boolean z11, h.a aVar) {
        s7.a.f(this.f9756q);
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f9741b, this.f9756q, this.f9748i, this.f9750k, list, this.f9761v, this.f9747h | z11, z11, this.f9762w, this.f9744e, this.f9743d, (Looper) s7.a.f(this.f9759t), this.f9749j, (o2) s7.a.f(this.f9763x));
        defaultDrmSession.i(aVar);
        if (this.f9751l != -9223372036854775807L) {
            defaultDrmSession.i(null);
        }
        return defaultDrmSession;
    }

    private DefaultDrmSession x(List<p7.n.b> list, boolean z11, h.a aVar, boolean z12) {
        DefaultDrmSession defaultDrmSessionW = w(list, z11, aVar);
        if (u(defaultDrmSessionW) && !this.f9754o.isEmpty()) {
            D();
            G(defaultDrmSessionW, aVar);
            defaultDrmSessionW = w(list, z11, aVar);
        }
        if (!u(defaultDrmSessionW) || !z12 || this.f9753n.isEmpty()) {
            return defaultDrmSessionW;
        }
        E();
        if (!this.f9754o.isEmpty()) {
            D();
        }
        G(defaultDrmSessionW, aVar);
        return w(list, z11, aVar);
    }

    private static List<p7.n.b> y(p7.n nVar, UUID uuid, boolean z11) {
        ArrayList arrayList = new ArrayList(nVar.f101433d);
        for (int i11 = 0; i11 < nVar.f101433d; i11++) {
            p7.n.b bVarH = nVar.h(i11);
            if ((bVarH.d(uuid) || (p7.h.f101350c.equals(uuid) && bVarH.d(p7.h.f101349b))) && (bVarH.f101438e != null || z11)) {
                arrayList.add(bVarH);
            }
        }
        return arrayList;
    }

    @EnsuresNonNull({"this.playbackLooper", "this.playbackHandler"})
    private synchronized void z(Looper looper) {
        try {
            Looper looper2 = this.f9759t;
            if (looper2 == null) {
                this.f9759t = looper;
                this.f9760u = new Handler(looper);
            } else {
                s7.a.h(looper2 == looper);
                s7.a.f(this.f9760u);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void F(int i11, byte[] bArr) {
        s7.a.h(this.f9752m.isEmpty());
        if (i11 == 1 || i11 == 3) {
            s7.a.f(bArr);
        }
        this.f9761v = i11;
        this.f9762w = bArr;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public final void b() {
        H(true);
        int i11 = this.f9755p;
        this.f9755p = i11 + 1;
        if (i11 != 0) {
            return;
        }
        if (this.f9756q == null) {
            m mVarA = this.f9742c.a(this.f9741b);
            this.f9756q = mVarA;
            mVarA.m(new c());
        } else if (this.f9751l != -9223372036854775807L) {
            for (int i12 = 0; i12 < this.f9752m.size(); i12++) {
                this.f9752m.get(i12).i(null);
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.i
    public i.b c(h.a aVar, u uVar) {
        s7.a.h(this.f9755p > 0);
        s7.a.j(this.f9759t);
        e eVar = new e(aVar);
        eVar.d(uVar);
        return eVar;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public DrmSession d(h.a aVar, u uVar) {
        H(false);
        s7.a.h(this.f9755p > 0);
        s7.a.j(this.f9759t);
        return t(this.f9759t, aVar, uVar, true);
    }

    @Override // androidx.media3.exoplayer.drm.i
    public int e(u uVar) {
        H(false);
        int iG = ((m) s7.a.f(this.f9756q)).g();
        p7.n nVar = uVar.f101548s;
        if (nVar == null) {
            if (q0.X0(this.f9746g, g0.k(uVar.f101544o)) == -1) {
                return 0;
            }
        } else if (!v(nVar)) {
            return 1;
        }
        return iG;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public void f(Looper looper, o2 o2Var) {
        z(looper);
        this.f9763x = o2Var;
    }

    @Override // androidx.media3.exoplayer.drm.i
    public final void release() {
        H(true);
        int i11 = this.f9755p - 1;
        this.f9755p = i11;
        if (i11 != 0) {
            return;
        }
        if (this.f9751l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f9752m);
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                ((DefaultDrmSession) arrayList.get(i12)).h(null);
            }
        }
        E();
        C();
    }

    private DefaultDrmSessionManager(UUID uuid, m.c cVar, p pVar, HashMap<String, String> map, boolean z11, int[] iArr, boolean z12, androidx.media3.exoplayer.upstream.b bVar, long j11) {
        s7.a.f(uuid);
        s7.a.b(!p7.h.f101349b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f9741b = uuid;
        this.f9742c = cVar;
        this.f9743d = pVar;
        this.f9744e = map;
        this.f9745f = z11;
        this.f9746g = iArr;
        this.f9747h = z12;
        this.f9749j = bVar;
        this.f9748i = new f();
        this.f9750k = new g();
        this.f9761v = 0;
        this.f9752m = new ArrayList();
        this.f9753n = z0.g();
        this.f9754o = z0.g();
        this.f9751l = j11;
    }
}
