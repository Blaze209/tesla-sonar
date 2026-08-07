package ql0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final rl0.c f105643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ul0.a f105644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final wl0.a f105645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f105646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vl0.a f105647e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ul0.d f105648f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f105649g;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private rl0.c f105650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ul0.a f105651b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private wl0.a f105652c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f105653d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private vl0.a f105654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ul0.d f105655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j f105656g;

        b() {
        }

        @NonNull
        public g h(@NonNull rl0.c cVar, @NonNull j jVar) {
            this.f105650a = cVar;
            this.f105656g = jVar;
            if (this.f105651b == null) {
                this.f105651b = ul0.a.a();
            }
            if (this.f105652c == null) {
                this.f105652c = new wl0.b();
            }
            if (this.f105653d == null) {
                this.f105653d = new d();
            }
            if (this.f105654e == null) {
                this.f105654e = vl0.a.a();
            }
            if (this.f105655f == null) {
                this.f105655f = new ul0.e();
            }
            return new g(this);
        }
    }

    @NonNull
    public vl0.a a() {
        return this.f105647e;
    }

    @NonNull
    public c b() {
        return this.f105646d;
    }

    @NonNull
    public j c() {
        return this.f105649g;
    }

    @NonNull
    public wl0.a d() {
        return this.f105645c;
    }

    @NonNull
    public rl0.c e() {
        return this.f105643a;
    }

    private g(@NonNull b bVar) {
        this.f105643a = bVar.f105650a;
        this.f105644b = bVar.f105651b;
        this.f105645c = bVar.f105652c;
        this.f105646d = bVar.f105653d;
        this.f105647e = bVar.f105654e;
        this.f105648f = bVar.f105655f;
        this.f105649g = bVar.f105656g;
    }
}
