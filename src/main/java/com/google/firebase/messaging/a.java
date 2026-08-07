package com.google.firebase.messaging;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements sv.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sv.a f44213a = new a();

    /* JADX INFO: renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    private static final class C0694a implements rv.c<fw.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C0694a f44214a = new C0694a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f44215b = rv.b.a("projectNumber").b(uv.a.b().c(1).a()).a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f44216c = rv.b.a("messageId").b(uv.a.b().c(2).a()).a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f44217d = rv.b.a("instanceId").b(uv.a.b().c(3).a()).a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f44218e = rv.b.a("messageType").b(uv.a.b().c(4).a()).a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f44219f = rv.b.a("sdkPlatform").b(uv.a.b().c(5).a()).a();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f44220g = rv.b.a("packageName").b(uv.a.b().c(6).a()).a();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final rv.b f44221h = rv.b.a("collapseKey").b(uv.a.b().c(7).a()).a();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final rv.b f44222i = rv.b.a("priority").b(uv.a.b().c(8).a()).a();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final rv.b f44223j = rv.b.a("ttl").b(uv.a.b().c(9).a()).a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final rv.b f44224k = rv.b.a("topic").b(uv.a.b().c(10).a()).a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final rv.b f44225l = rv.b.a("bulkId").b(uv.a.b().c(11).a()).a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final rv.b f44226m = rv.b.a("event").b(uv.a.b().c(12).a()).a();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final rv.b f44227n = rv.b.a("analyticsLabel").b(uv.a.b().c(13).a()).a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final rv.b f44228o = rv.b.a("campaignId").b(uv.a.b().c(14).a()).a();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final rv.b f44229p = rv.b.a("composerLabel").b(uv.a.b().c(15).a()).a();

        private C0694a() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(fw.a aVar, rv.d dVar) {
            dVar.add(f44215b, aVar.l());
            dVar.add(f44216c, aVar.h());
            dVar.add(f44217d, aVar.g());
            dVar.add(f44218e, aVar.i());
            dVar.add(f44219f, aVar.m());
            dVar.add(f44220g, aVar.j());
            dVar.add(f44221h, aVar.d());
            dVar.add(f44222i, aVar.k());
            dVar.add(f44223j, aVar.o());
            dVar.add(f44224k, aVar.n());
            dVar.add(f44225l, aVar.b());
            dVar.add(f44226m, aVar.f());
            dVar.add(f44227n, aVar.a());
            dVar.add(f44228o, aVar.c());
            dVar.add(f44229p, aVar.e());
        }
    }

    private static final class b implements rv.c<fw.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f44230a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f44231b = rv.b.a("messagingClientEvent").b(uv.a.b().c(1).a()).a();

        private b() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(fw.b bVar, rv.d dVar) {
            dVar.add(f44231b, bVar.a());
        }
    }

    private static final class c implements rv.c<m0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f44232a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f44233b = rv.b.d("messagingClientEventExtension");

        private c() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(m0 m0Var, rv.d dVar) {
            dVar.add(f44233b, m0Var.b());
        }
    }

    private a() {
    }

    @Override // sv.a
    public void configure(sv.b<?> bVar) {
        bVar.registerEncoder(m0.class, c.f44232a);
        bVar.registerEncoder(fw.b.class, b.f44230a);
        bVar.registerEncoder(fw.a.class, C0694a.f44214a);
    }
}
