package iw;

import com.google.firebase.f;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import hw.e;
import jw.d;
import jw.g;
import nq.j;
import qj0.h;
import qj0.i;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private jw.a f81929a;

        public iw.b a() {
            h.a(this.f81929a, jw.a.class);
            return new c(this.f81929a);
        }

        public b b(jw.a aVar) {
            this.f81929a = (jw.a) h.b(aVar);
            return this;
        }

        private b() {
        }
    }

    private static final class c implements iw.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f81930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i<f> f81931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private i<yv.b<com.google.firebase.remoteconfig.c>> f81932c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private i<zv.f> f81933d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private i<yv.b<j>> f81934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private i<RemoteConfigManager> f81935f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private i<com.google.firebase.perf.config.a> f81936g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private i<SessionManager> f81937h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private i<e> f81938i;

        private void b(jw.a aVar) {
            this.f81931b = jw.c.a(aVar);
            this.f81932c = jw.e.a(aVar);
            this.f81933d = d.a(aVar);
            this.f81934e = jw.h.a(aVar);
            this.f81935f = jw.f.a(aVar);
            this.f81936g = jw.b.a(aVar);
            g gVarA = g.a(aVar);
            this.f81937h = gVarA;
            this.f81938i = qj0.d.e(hw.g.a(this.f81931b, this.f81932c, this.f81933d, this.f81934e, this.f81935f, this.f81936g, gVarA));
        }

        @Override // iw.b
        public e a() {
            return this.f81938i.get();
        }

        private c(jw.a aVar) {
            this.f81930a = this;
            b(aVar);
        }
    }

    public static b a() {
        return new b();
    }
}
