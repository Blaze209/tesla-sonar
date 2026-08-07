package oq;

import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.property.Kind;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements sv.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sv.a f98334a = new b();

    private static final class a implements rv.c<oq.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final a f98335a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f98336b = rv.b.d("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f98337c = rv.b.d("model");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f98338d = rv.b.d("hardware");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f98339e = rv.b.d(Kind.DEVICE);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f98340f = rv.b.d("product");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f98341g = rv.b.d("osBuild");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final rv.b f98342h = rv.b.d("manufacturer");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final rv.b f98343i = rv.b.d("fingerprint");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final rv.b f98344j = rv.b.d("locale");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final rv.b f98345k = rv.b.d(PlaceTypes.COUNTRY);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final rv.b f98346l = rv.b.d("mccMnc");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final rv.b f98347m = rv.b.d("applicationBuild");

        private a() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(oq.a aVar, rv.d dVar) {
            dVar.add(f98336b, aVar.m());
            dVar.add(f98337c, aVar.j());
            dVar.add(f98338d, aVar.f());
            dVar.add(f98339e, aVar.d());
            dVar.add(f98340f, aVar.l());
            dVar.add(f98341g, aVar.k());
            dVar.add(f98342h, aVar.h());
            dVar.add(f98343i, aVar.e());
            dVar.add(f98344j, aVar.g());
            dVar.add(f98345k, aVar.c());
            dVar.add(f98346l, aVar.i());
            dVar.add(f98347m, aVar.b());
        }
    }

    /* JADX INFO: renamed from: oq.b$b, reason: collision with other inner class name */
    private static final class C2113b implements rv.c<n> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C2113b f98348a = new C2113b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f98349b = rv.b.d("logRequest");

        private C2113b() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(n nVar, rv.d dVar) {
            dVar.add(f98349b, nVar.c());
        }
    }

    private static final class c implements rv.c<o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f98350a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f98351b = rv.b.d("clientType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f98352c = rv.b.d("androidClientInfo");

        private c() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(o oVar, rv.d dVar) {
            dVar.add(f98351b, oVar.c());
            dVar.add(f98352c, oVar.b());
        }
    }

    private static final class d implements rv.c<p> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f98353a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f98354b = rv.b.d("privacyContext");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f98355c = rv.b.d("productIdOrigin");

        private d() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(p pVar, rv.d dVar) {
            dVar.add(f98354b, pVar.b());
            dVar.add(f98355c, pVar.c());
        }
    }

    private static final class e implements rv.c<q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f98356a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f98357b = rv.b.d("clearBlob");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f98358c = rv.b.d("encryptedBlob");

        private e() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(q qVar, rv.d dVar) {
            dVar.add(f98357b, qVar.b());
            dVar.add(f98358c, qVar.c());
        }
    }

    private static final class f implements rv.c<r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f98359a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f98360b = rv.b.d("originAssociatedProductId");

        private f() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(r rVar, rv.d dVar) {
            dVar.add(f98360b, rVar.b());
        }
    }

    private static final class g implements rv.c<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f98361a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f98362b = rv.b.d("prequest");

        private g() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(s sVar, rv.d dVar) {
            dVar.add(f98362b, sVar.b());
        }
    }

    private static final class h implements rv.c<t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h f98363a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f98364b = rv.b.d("eventTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f98365c = rv.b.d("eventCode");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f98366d = rv.b.d("complianceData");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f98367e = rv.b.d("eventUptimeMs");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f98368f = rv.b.d("sourceExtension");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f98369g = rv.b.d("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final rv.b f98370h = rv.b.d("timezoneOffsetSeconds");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final rv.b f98371i = rv.b.d("networkConnectionInfo");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final rv.b f98372j = rv.b.d("experimentIds");

        private h() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(t tVar, rv.d dVar) {
            dVar.add(f98364b, tVar.d());
            dVar.add(f98365c, tVar.c());
            dVar.add(f98366d, tVar.b());
            dVar.add(f98367e, tVar.e());
            dVar.add(f98368f, tVar.h());
            dVar.add(f98369g, tVar.i());
            dVar.add(f98370h, tVar.j());
            dVar.add(f98371i, tVar.g());
            dVar.add(f98372j, tVar.f());
        }
    }

    private static final class i implements rv.c<u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final i f98373a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f98374b = rv.b.d("requestTimeMs");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f98375c = rv.b.d("requestUptimeMs");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f98376d = rv.b.d("clientInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f98377e = rv.b.d("logSource");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f98378f = rv.b.d("logSourceName");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f98379g = rv.b.d("logEvent");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final rv.b f98380h = rv.b.d("qosTier");

        private i() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(u uVar, rv.d dVar) {
            dVar.add(f98374b, uVar.g());
            dVar.add(f98375c, uVar.h());
            dVar.add(f98376d, uVar.b());
            dVar.add(f98377e, uVar.d());
            dVar.add(f98378f, uVar.e());
            dVar.add(f98379g, uVar.c());
            dVar.add(f98380h, uVar.f());
        }
    }

    private static final class j implements rv.c<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j f98381a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f98382b = rv.b.d("networkType");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f98383c = rv.b.d("mobileSubtype");

        private j() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(w wVar, rv.d dVar) {
            dVar.add(f98382b, wVar.c());
            dVar.add(f98383c, wVar.b());
        }
    }

    private b() {
    }

    @Override // sv.a
    public void configure(sv.b<?> bVar) {
        C2113b c2113b = C2113b.f98348a;
        bVar.registerEncoder(n.class, c2113b);
        bVar.registerEncoder(oq.d.class, c2113b);
        i iVar = i.f98373a;
        bVar.registerEncoder(u.class, iVar);
        bVar.registerEncoder(k.class, iVar);
        c cVar = c.f98350a;
        bVar.registerEncoder(o.class, cVar);
        bVar.registerEncoder(oq.e.class, cVar);
        a aVar = a.f98335a;
        bVar.registerEncoder(oq.a.class, aVar);
        bVar.registerEncoder(oq.c.class, aVar);
        h hVar = h.f98363a;
        bVar.registerEncoder(t.class, hVar);
        bVar.registerEncoder(oq.j.class, hVar);
        d dVar = d.f98353a;
        bVar.registerEncoder(p.class, dVar);
        bVar.registerEncoder(oq.f.class, dVar);
        g gVar = g.f98361a;
        bVar.registerEncoder(s.class, gVar);
        bVar.registerEncoder(oq.i.class, gVar);
        f fVar = f.f98359a;
        bVar.registerEncoder(r.class, fVar);
        bVar.registerEncoder(oq.h.class, fVar);
        j jVar = j.f98381a;
        bVar.registerEncoder(w.class, jVar);
        bVar.registerEncoder(m.class, jVar);
        e eVar = e.f98356a;
        bVar.registerEncoder(q.class, eVar);
        bVar.registerEncoder(oq.g.class, eVar);
    }
}
