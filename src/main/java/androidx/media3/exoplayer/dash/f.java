package androidx.media3.exoplayer.dash;

import android.os.Handler;
import android.os.Message;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.source.f0;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import p7.j;
import s7.c0;
import s7.q0;
import w8.o0;
import z7.u;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s8.b f9691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f9692b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d8.c f9696f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f9697g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9698h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f9699i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9700j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TreeMap<Long, Long> f9695e = new TreeMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f9694d = q0.D(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h9.b f9693c = new h9.b();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f9702b;

        public a(long j11, long j12) {
            this.f9701a = j11;
            this.f9702b = j12;
        }
    }

    public interface b {
        void a(long j11);

        void b();
    }

    public final class c implements o0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f0 f9703a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f9704b = new u();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f9.b f9705c = new f9.b();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f9706d = -9223372036854775807L;

        c(s8.b bVar) {
            this.f9703a = f0.m(bVar);
        }

        private f9.b h() {
            this.f9705c.f();
            if (this.f9703a.U(this.f9704b, this.f9705c, 0, false) != -4) {
                return null;
            }
            this.f9705c.q();
            return this.f9705c;
        }

        private void l(long j11, long j12) {
            f.this.f9694d.sendMessage(f.this.f9694d.obtainMessage(1, new a(j11, j12)));
        }

        private void m() {
            while (this.f9703a.N(false)) {
                f9.b bVarH = h();
                if (bVarH != null) {
                    long j11 = bVarH.f9288f;
                    p7.f0 f0VarA = f.this.f9693c.a(bVarH);
                    if (f0VarA != null) {
                        h9.a aVar = (h9.a) f0VarA.d(0);
                        if (f.h(aVar.f71714a, aVar.f71715b)) {
                            n(j11, aVar);
                        }
                    }
                }
            }
            this.f9703a.t();
        }

        private void n(long j11, h9.a aVar) {
            long jF = f.f(aVar);
            if (jF == -9223372036854775807L) {
                return;
            }
            l(j11, jF);
        }

        @Override // w8.o0
        public void a(c0 c0Var, int i11, int i12) {
            this.f9703a.f(c0Var, i11);
        }

        @Override // w8.o0
        public void b(long j11, int i11, int i12, int i13, o0.a aVar) {
            this.f9703a.b(j11, i11, i12, i13, aVar);
            m();
        }

        @Override // w8.o0
        public int c(j jVar, int i11, boolean z11, int i12) {
            return this.f9703a.e(jVar, i11, z11);
        }

        @Override // w8.o0
        public void g(p7.u uVar) {
            this.f9703a.g(uVar);
        }

        public boolean i(long j11) {
            return f.this.j(j11);
        }

        public void j(p8.e eVar) {
            long j11 = this.f9706d;
            if (j11 == -9223372036854775807L || eVar.f101877h > j11) {
                this.f9706d = eVar.f101877h;
            }
            f.this.m(eVar);
        }

        public boolean k(p8.e eVar) {
            long j11 = this.f9706d;
            return f.this.n(j11 != -9223372036854775807L && j11 < eVar.f101876g);
        }

        public void o() {
            this.f9703a.V();
        }
    }

    public f(d8.c cVar, b bVar, s8.b bVar2) {
        this.f9696f = cVar;
        this.f9692b = bVar;
        this.f9691a = bVar2;
    }

    private Map.Entry<Long, Long> e(long j11) {
        return this.f9695e.ceilingEntry(Long.valueOf(j11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long f(h9.a aVar) {
        try {
            return q0.j1(q0.K(aVar.f71718e));
        } catch (ParserException unused) {
            return -9223372036854775807L;
        }
    }

    private void g(long j11, long j12) {
        Long l11 = this.f9695e.get(Long.valueOf(j12));
        if (l11 == null) {
            this.f9695e.put(Long.valueOf(j12), Long.valueOf(j11));
        } else if (l11.longValue() > j11) {
            this.f9695e.put(Long.valueOf(j12), Long.valueOf(j11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean h(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return "1".equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    private void i() {
        if (this.f9698h) {
            this.f9699i = true;
            this.f9698h = false;
            this.f9692b.b();
        }
    }

    private void l() {
        this.f9692b.a(this.f9697g);
    }

    private void p() {
        Iterator<Map.Entry<Long, Long>> it = this.f9695e.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.f9696f.f59785h) {
                it.remove();
            }
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.f9700j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        a aVar = (a) message.obj;
        g(aVar.f9701a, aVar.f9702b);
        return true;
    }

    boolean j(long j11) {
        d8.c cVar = this.f9696f;
        boolean z11 = false;
        if (!cVar.f59781d) {
            return false;
        }
        if (this.f9699i) {
            return true;
        }
        Map.Entry<Long, Long> entryE = e(cVar.f59785h);
        if (entryE != null && entryE.getValue().longValue() < j11) {
            this.f9697g = entryE.getKey().longValue();
            l();
            z11 = true;
        }
        if (z11) {
            i();
        }
        return z11;
    }

    public c k() {
        return new c(this.f9691a);
    }

    void m(p8.e eVar) {
        this.f9698h = true;
    }

    boolean n(boolean z11) {
        if (!this.f9696f.f59781d) {
            return false;
        }
        if (this.f9699i) {
            return true;
        }
        if (!z11) {
            return false;
        }
        i();
        return true;
    }

    public void o() {
        this.f9700j = true;
        this.f9694d.removeCallbacksAndMessages(null);
    }

    public void q(d8.c cVar) {
        this.f9699i = false;
        this.f9697g = -9223372036854775807L;
        this.f9696f = cVar;
        p();
    }
}
