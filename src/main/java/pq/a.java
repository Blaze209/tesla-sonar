package pq;

import com.fourthline.analytics.internal.AnalyticsAttribute;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements sv.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sv.a f103542a = new a();

    /* JADX INFO: renamed from: pq.a$a, reason: collision with other inner class name */
    private static final class C2197a implements rv.c<sq.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C2197a f103543a = new C2197a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f103544b = rv.b.a("window").b(uv.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f103545c = rv.b.a("logSourceMetrics").b(uv.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f103546d = rv.b.a("globalMetrics").b(uv.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f103547e = rv.b.a("appNamespace").b(uv.a.b().c(4).a()).a();

        private C2197a() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(sq.a aVar, rv.d dVar) {
            dVar.add(f103544b, aVar.d());
            dVar.add(f103545c, aVar.c());
            dVar.add(f103546d, aVar.b());
            dVar.add(f103547e, aVar.a());
        }
    }

    private static final class b implements rv.c<sq.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f103548a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f103549b = rv.b.a("storageMetrics").b(uv.a.b().c(1).a()).a();

        private b() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(sq.b bVar, rv.d dVar) {
            dVar.add(f103549b, bVar.a());
        }
    }

    private static final class c implements rv.c<sq.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f103550a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f103551b = rv.b.a("eventsDroppedCount").b(uv.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f103552c = rv.b.a(AnalyticsAttribute.Reason).b(uv.a.b().c(3).a()).a();

        private c() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(sq.c cVar, rv.d dVar) {
            dVar.add(f103551b, cVar.a());
            dVar.add(f103552c, cVar.b());
        }
    }

    private static final class d implements rv.c<sq.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f103553a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f103554b = rv.b.a("logSource").b(uv.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f103555c = rv.b.a("logEventDropped").b(uv.a.b().c(2).a()).a();

        private d() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(sq.d dVar, rv.d dVar2) {
            dVar2.add(f103554b, dVar.b());
            dVar2.add(f103555c, dVar.a());
        }
    }

    private static final class e implements rv.c<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f103556a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f103557b = rv.b.d("clientMetrics");

        private e() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(m mVar, rv.d dVar) {
            dVar.add(f103557b, mVar.b());
        }
    }

    private static final class f implements rv.c<sq.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f103558a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f103559b = rv.b.a("currentCacheSizeBytes").b(uv.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f103560c = rv.b.a("maxCacheSizeBytes").b(uv.a.b().c(2).a()).a();

        private f() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(sq.e eVar, rv.d dVar) {
            dVar.add(f103559b, eVar.a());
            dVar.add(f103560c, eVar.b());
        }
    }

    private static final class g implements rv.c<sq.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f103561a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f103562b = rv.b.a("startMs").b(uv.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f103563c = rv.b.a("endMs").b(uv.a.b().c(2).a()).a();

        private g() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(sq.f fVar, rv.d dVar) {
            dVar.add(f103562b, fVar.b());
            dVar.add(f103563c, fVar.a());
        }
    }

    private a() {
    }

    @Override // sv.a
    public void configure(sv.b<?> bVar) {
        bVar.registerEncoder(m.class, e.f103556a);
        bVar.registerEncoder(sq.a.class, C2197a.f103543a);
        bVar.registerEncoder(sq.f.class, g.f103561a);
        bVar.registerEncoder(sq.d.class, d.f103553a);
        bVar.registerEncoder(sq.c.class, c.f103550a);
        bVar.registerEncoder(sq.b.class, b.f103548a);
        bVar.registerEncoder(sq.e.class, f.f103558a);
    }
}
