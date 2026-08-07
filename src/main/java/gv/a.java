package gv;

import ch.qos.logback.core.joran.action.Action;
import com.facebook.react.modules.appstate.AppStateModule;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.libraries.places.api.model.PlaceTypes;
import ezvcard.property.Kind;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements sv.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sv.a f69575a = new a();

    /* JADX INFO: renamed from: gv.a$a, reason: collision with other inner class name */
    private static final class C1422a implements rv.c<f0.a.AbstractC1424a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final C1422a f69576a = new C1422a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69577b = rv.b.d("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69578c = rv.b.d("libraryName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69579d = rv.b.d("buildId");

        private C1422a() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.a.AbstractC1424a abstractC1424a, rv.d dVar) {
            dVar.add(f69577b, abstractC1424a.b());
            dVar.add(f69578c, abstractC1424a.d());
            dVar.add(f69579d, abstractC1424a.c());
        }
    }

    private static final class b implements rv.c<f0.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f69580a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69581b = rv.b.d("pid");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69582c = rv.b.d("processName");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69583d = rv.b.d("reasonCode");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69584e = rv.b.d("importance");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f69585f = rv.b.d("pss");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f69586g = rv.b.d("rss");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final rv.b f69587h = rv.b.d("timestamp");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final rv.b f69588i = rv.b.d("traceFile");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final rv.b f69589j = rv.b.d("buildIdMappingForArch");

        private b() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.a aVar, rv.d dVar) {
            dVar.add(f69581b, aVar.d());
            dVar.add(f69582c, aVar.e());
            dVar.add(f69583d, aVar.g());
            dVar.add(f69584e, aVar.c());
            dVar.add(f69585f, aVar.f());
            dVar.add(f69586g, aVar.h());
            dVar.add(f69587h, aVar.i());
            dVar.add(f69588i, aVar.j());
            dVar.add(f69589j, aVar.b());
        }
    }

    private static final class c implements rv.c<f0.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f69590a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69591b = rv.b.d(Action.KEY_ATTRIBUTE);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69592c = rv.b.d("value");

        private c() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.c cVar, rv.d dVar) {
            dVar.add(f69591b, cVar.b());
            dVar.add(f69592c, cVar.c());
        }
    }

    private static final class d implements rv.c<f0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f69593a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69594b = rv.b.d("sdkVersion");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69595c = rv.b.d("gmpAppId");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69596d = rv.b.d("platform");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69597e = rv.b.d("installationUuid");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f69598f = rv.b.d("firebaseInstallationId");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f69599g = rv.b.d("firebaseAuthenticationToken");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final rv.b f69600h = rv.b.d("appQualitySessionId");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final rv.b f69601i = rv.b.d("buildVersion");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final rv.b f69602j = rv.b.d("displayVersion");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final rv.b f69603k = rv.b.d("session");

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final rv.b f69604l = rv.b.d("ndkPayload");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final rv.b f69605m = rv.b.d("appExitInfo");

        private d() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0 f0Var, rv.d dVar) {
            dVar.add(f69594b, f0Var.m());
            dVar.add(f69595c, f0Var.i());
            dVar.add(f69596d, f0Var.l());
            dVar.add(f69597e, f0Var.j());
            dVar.add(f69598f, f0Var.h());
            dVar.add(f69599g, f0Var.g());
            dVar.add(f69600h, f0Var.d());
            dVar.add(f69601i, f0Var.e());
            dVar.add(f69602j, f0Var.f());
            dVar.add(f69603k, f0Var.n());
            dVar.add(f69604l, f0Var.k());
            dVar.add(f69605m, f0Var.c());
        }
    }

    private static final class e implements rv.c<f0.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e f69606a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69607b = rv.b.d("files");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69608c = rv.b.d("orgId");

        private e() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.d dVar, rv.d dVar2) {
            dVar2.add(f69607b, dVar.b());
            dVar2.add(f69608c, dVar.c());
        }
    }

    private static final class f implements rv.c<f0.d.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f f69609a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69610b = rv.b.d("filename");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69611c = rv.b.d("contents");

        private f() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.d.b bVar, rv.d dVar) {
            dVar.add(f69610b, bVar.c());
            dVar.add(f69611c, bVar.b());
        }
    }

    private static final class g implements rv.c<f0.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final g f69612a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69613b = rv.b.d("identifier");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69614c = rv.b.d("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69615d = rv.b.d("displayVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69616e = rv.b.d("organization");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f69617f = rv.b.d("installationUuid");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f69618g = rv.b.d("developmentPlatform");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final rv.b f69619h = rv.b.d("developmentPlatformVersion");

        private g() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.a aVar, rv.d dVar) {
            dVar.add(f69613b, aVar.e());
            dVar.add(f69614c, aVar.h());
            dVar.add(f69615d, aVar.d());
            dVar.add(f69616e, aVar.g());
            dVar.add(f69617f, aVar.f());
            dVar.add(f69618g, aVar.b());
            dVar.add(f69619h, aVar.c());
        }
    }

    private static final class h implements rv.c<f0.e.a.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h f69620a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69621b = rv.b.d("clsId");

        private h() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.a.b bVar, rv.d dVar) {
            dVar.add(f69621b, bVar.a());
        }
    }

    private static final class i implements rv.c<f0.e.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final i f69622a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69623b = rv.b.d("arch");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69624c = rv.b.d("model");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69625d = rv.b.d("cores");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69626e = rv.b.d("ram");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f69627f = rv.b.d("diskSpace");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f69628g = rv.b.d("simulator");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final rv.b f69629h = rv.b.d("state");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final rv.b f69630i = rv.b.d("manufacturer");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final rv.b f69631j = rv.b.d("modelClass");

        private i() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.c cVar, rv.d dVar) {
            dVar.add(f69623b, cVar.b());
            dVar.add(f69624c, cVar.f());
            dVar.add(f69625d, cVar.c());
            dVar.add(f69626e, cVar.h());
            dVar.add(f69627f, cVar.d());
            dVar.add(f69628g, cVar.j());
            dVar.add(f69629h, cVar.i());
            dVar.add(f69630i, cVar.e());
            dVar.add(f69631j, cVar.g());
        }
    }

    private static final class j implements rv.c<f0.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j f69632a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69633b = rv.b.d("generator");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69634c = rv.b.d("identifier");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69635d = rv.b.d("appQualitySessionId");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69636e = rv.b.d("startedAt");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f69637f = rv.b.d("endedAt");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f69638g = rv.b.d("crashed");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final rv.b f69639h = rv.b.d("app");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final rv.b f69640i = rv.b.d("user");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final rv.b f69641j = rv.b.d("os");

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final rv.b f69642k = rv.b.d(Kind.DEVICE);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final rv.b f69643l = rv.b.d("events");

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final rv.b f69644m = rv.b.d("generatorType");

        private j() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e eVar, rv.d dVar) {
            dVar.add(f69633b, eVar.g());
            dVar.add(f69634c, eVar.j());
            dVar.add(f69635d, eVar.c());
            dVar.add(f69636e, eVar.l());
            dVar.add(f69637f, eVar.e());
            dVar.add(f69638g, eVar.n());
            dVar.add(f69639h, eVar.b());
            dVar.add(f69640i, eVar.m());
            dVar.add(f69641j, eVar.k());
            dVar.add(f69642k, eVar.d());
            dVar.add(f69643l, eVar.f());
            dVar.add(f69644m, eVar.h());
        }
    }

    private static final class k implements rv.c<f0.e.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k f69645a = new k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69646b = rv.b.d("execution");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69647c = rv.b.d("customAttributes");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69648d = rv.b.d("internalKeys");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69649e = rv.b.d(AppStateModule.APP_STATE_BACKGROUND);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f69650f = rv.b.d("currentProcessDetails");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f69651g = rv.b.d("appProcessDetails");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final rv.b f69652h = rv.b.d("uiOrientation");

        private k() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a aVar, rv.d dVar) {
            dVar.add(f69646b, aVar.f());
            dVar.add(f69647c, aVar.e());
            dVar.add(f69648d, aVar.g());
            dVar.add(f69649e, aVar.c());
            dVar.add(f69650f, aVar.d());
            dVar.add(f69651g, aVar.b());
            dVar.add(f69652h, aVar.h());
        }
    }

    private static final class l implements rv.c<f0.e.d.a.b.AbstractC1428a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final l f69653a = new l();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69654b = rv.b.d("baseAddress");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69655c = rv.b.d("size");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69656d = rv.b.d("name");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69657e = rv.b.d("uuid");

        private l() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.b.AbstractC1428a abstractC1428a, rv.d dVar) {
            dVar.add(f69654b, abstractC1428a.b());
            dVar.add(f69655c, abstractC1428a.d());
            dVar.add(f69656d, abstractC1428a.c());
            dVar.add(f69657e, abstractC1428a.f());
        }
    }

    private static final class m implements rv.c<f0.e.d.a.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final m f69658a = new m();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69659b = rv.b.d("threads");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69660c = rv.b.d("exception");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69661d = rv.b.d("appExitInfo");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69662e = rv.b.d("signal");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f69663f = rv.b.d("binaries");

        private m() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.b bVar, rv.d dVar) {
            dVar.add(f69659b, bVar.f());
            dVar.add(f69660c, bVar.d());
            dVar.add(f69661d, bVar.b());
            dVar.add(f69662e, bVar.e());
            dVar.add(f69663f, bVar.c());
        }
    }

    private static final class n implements rv.c<f0.e.d.a.b.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final n f69664a = new n();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69665b = rv.b.d("type");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69666c = rv.b.d(AnalyticsAttribute.Reason);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69667d = rv.b.d("frames");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69668e = rv.b.d("causedBy");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f69669f = rv.b.d("overflowCount");

        private n() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.b.c cVar, rv.d dVar) {
            dVar.add(f69665b, cVar.f());
            dVar.add(f69666c, cVar.e());
            dVar.add(f69667d, cVar.c());
            dVar.add(f69668e, cVar.b());
            dVar.add(f69669f, cVar.d());
        }
    }

    private static final class o implements rv.c<f0.e.d.a.b.AbstractC1432d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final o f69670a = new o();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69671b = rv.b.d("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69672c = rv.b.d("code");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69673d = rv.b.d(PlaceTypes.ADDRESS);

        private o() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.b.AbstractC1432d abstractC1432d, rv.d dVar) {
            dVar.add(f69671b, abstractC1432d.d());
            dVar.add(f69672c, abstractC1432d.c());
            dVar.add(f69673d, abstractC1432d.b());
        }
    }

    private static final class p implements rv.c<f0.e.d.a.b.AbstractC1434e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final p f69674a = new p();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69675b = rv.b.d("name");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69676c = rv.b.d("importance");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69677d = rv.b.d("frames");

        private p() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.b.AbstractC1434e abstractC1434e, rv.d dVar) {
            dVar.add(f69675b, abstractC1434e.d());
            dVar.add(f69676c, abstractC1434e.c());
            dVar.add(f69677d, abstractC1434e.b());
        }
    }

    private static final class q implements rv.c<f0.e.d.a.b.AbstractC1434e.AbstractC1436b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final q f69678a = new q();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69679b = rv.b.d("pc");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69680c = rv.b.d("symbol");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69681d = rv.b.d(Action.FILE_ATTRIBUTE);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69682e = rv.b.d("offset");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f69683f = rv.b.d("importance");

        private q() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.b.AbstractC1434e.AbstractC1436b abstractC1436b, rv.d dVar) {
            dVar.add(f69679b, abstractC1436b.e());
            dVar.add(f69680c, abstractC1436b.f());
            dVar.add(f69681d, abstractC1436b.b());
            dVar.add(f69682e, abstractC1436b.d());
            dVar.add(f69683f, abstractC1436b.c());
        }
    }

    private static final class r implements rv.c<f0.e.d.a.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final r f69684a = new r();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69685b = rv.b.d("processName");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69686c = rv.b.d("pid");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69687d = rv.b.d("importance");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69688e = rv.b.d("defaultProcess");

        private r() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.a.c cVar, rv.d dVar) {
            dVar.add(f69685b, cVar.d());
            dVar.add(f69686c, cVar.c());
            dVar.add(f69687d, cVar.b());
            dVar.add(f69688e, cVar.e());
        }
    }

    private static final class s implements rv.c<f0.e.d.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final s f69689a = new s();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69690b = rv.b.d("batteryLevel");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69691c = rv.b.d("batteryVelocity");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69692d = rv.b.d("proximityOn");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69693e = rv.b.d("orientation");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f69694f = rv.b.d("ramUsed");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f69695g = rv.b.d("diskUsed");

        private s() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.c cVar, rv.d dVar) {
            dVar.add(f69690b, cVar.b());
            dVar.add(f69691c, cVar.c());
            dVar.add(f69692d, cVar.g());
            dVar.add(f69693e, cVar.e());
            dVar.add(f69694f, cVar.f());
            dVar.add(f69695g, cVar.d());
        }
    }

    private static final class t implements rv.c<f0.e.d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final t f69696a = new t();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69697b = rv.b.d("timestamp");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69698c = rv.b.d("type");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69699d = rv.b.d("app");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69700e = rv.b.d(Kind.DEVICE);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final rv.b f69701f = rv.b.d("log");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final rv.b f69702g = rv.b.d("rollouts");

        private t() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d dVar, rv.d dVar2) {
            dVar2.add(f69697b, dVar.f());
            dVar2.add(f69698c, dVar.g());
            dVar2.add(f69699d, dVar.b());
            dVar2.add(f69700e, dVar.c());
            dVar2.add(f69701f, dVar.d());
            dVar2.add(f69702g, dVar.e());
        }
    }

    private static final class u implements rv.c<f0.e.d.AbstractC1439d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final u f69703a = new u();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69704b = rv.b.d("content");

        private u() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.AbstractC1439d abstractC1439d, rv.d dVar) {
            dVar.add(f69704b, abstractC1439d.b());
        }
    }

    private static final class v implements rv.c<f0.e.d.AbstractC1440e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final v f69705a = new v();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69706b = rv.b.d("rolloutVariant");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69707c = rv.b.d("parameterKey");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69708d = rv.b.d("parameterValue");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69709e = rv.b.d("templateVersion");

        private v() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.AbstractC1440e abstractC1440e, rv.d dVar) {
            dVar.add(f69706b, abstractC1440e.d());
            dVar.add(f69707c, abstractC1440e.b());
            dVar.add(f69708d, abstractC1440e.c());
            dVar.add(f69709e, abstractC1440e.e());
        }
    }

    private static final class w implements rv.c<f0.e.d.AbstractC1440e.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final w f69710a = new w();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69711b = rv.b.d("rolloutId");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69712c = rv.b.d("variantId");

        private w() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.AbstractC1440e.b bVar, rv.d dVar) {
            dVar.add(f69711b, bVar.b());
            dVar.add(f69712c, bVar.c());
        }
    }

    private static final class x implements rv.c<f0.e.d.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final x f69713a = new x();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69714b = rv.b.d("assignments");

        private x() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.d.f fVar, rv.d dVar) {
            dVar.add(f69714b, fVar.b());
        }
    }

    private static final class y implements rv.c<f0.e.AbstractC1441e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final y f69715a = new y();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69716b = rv.b.d("platform");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final rv.b f69717c = rv.b.d("version");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final rv.b f69718d = rv.b.d("buildVersion");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final rv.b f69719e = rv.b.d("jailbroken");

        private y() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.AbstractC1441e abstractC1441e, rv.d dVar) {
            dVar.add(f69716b, abstractC1441e.c());
            dVar.add(f69717c, abstractC1441e.d());
            dVar.add(f69718d, abstractC1441e.b());
            dVar.add(f69719e, abstractC1441e.e());
        }
    }

    private static final class z implements rv.c<f0.e.f> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final z f69720a = new z();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final rv.b f69721b = rv.b.d("identifier");

        private z() {
        }

        @Override // rv.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void encode(f0.e.f fVar, rv.d dVar) {
            dVar.add(f69721b, fVar.b());
        }
    }

    private a() {
    }

    @Override // sv.a
    public void configure(sv.b<?> bVar) {
        d dVar = d.f69593a;
        bVar.registerEncoder(f0.class, dVar);
        bVar.registerEncoder(gv.b.class, dVar);
        j jVar = j.f69632a;
        bVar.registerEncoder(f0.e.class, jVar);
        bVar.registerEncoder(gv.h.class, jVar);
        g gVar = g.f69612a;
        bVar.registerEncoder(f0.e.a.class, gVar);
        bVar.registerEncoder(gv.i.class, gVar);
        h hVar = h.f69620a;
        bVar.registerEncoder(f0.e.a.b.class, hVar);
        bVar.registerEncoder(gv.j.class, hVar);
        z zVar = z.f69720a;
        bVar.registerEncoder(f0.e.f.class, zVar);
        bVar.registerEncoder(a0.class, zVar);
        y yVar = y.f69715a;
        bVar.registerEncoder(f0.e.AbstractC1441e.class, yVar);
        bVar.registerEncoder(gv.z.class, yVar);
        i iVar = i.f69622a;
        bVar.registerEncoder(f0.e.c.class, iVar);
        bVar.registerEncoder(gv.k.class, iVar);
        t tVar = t.f69696a;
        bVar.registerEncoder(f0.e.d.class, tVar);
        bVar.registerEncoder(gv.l.class, tVar);
        k kVar = k.f69645a;
        bVar.registerEncoder(f0.e.d.a.class, kVar);
        bVar.registerEncoder(gv.m.class, kVar);
        m mVar = m.f69658a;
        bVar.registerEncoder(f0.e.d.a.b.class, mVar);
        bVar.registerEncoder(gv.n.class, mVar);
        p pVar = p.f69674a;
        bVar.registerEncoder(f0.e.d.a.b.AbstractC1434e.class, pVar);
        bVar.registerEncoder(gv.r.class, pVar);
        q qVar = q.f69678a;
        bVar.registerEncoder(f0.e.d.a.b.AbstractC1434e.AbstractC1436b.class, qVar);
        bVar.registerEncoder(gv.s.class, qVar);
        n nVar = n.f69664a;
        bVar.registerEncoder(f0.e.d.a.b.c.class, nVar);
        bVar.registerEncoder(gv.p.class, nVar);
        b bVar2 = b.f69580a;
        bVar.registerEncoder(f0.a.class, bVar2);
        bVar.registerEncoder(gv.c.class, bVar2);
        C1422a c1422a = C1422a.f69576a;
        bVar.registerEncoder(f0.a.AbstractC1424a.class, c1422a);
        bVar.registerEncoder(gv.d.class, c1422a);
        o oVar = o.f69670a;
        bVar.registerEncoder(f0.e.d.a.b.AbstractC1432d.class, oVar);
        bVar.registerEncoder(gv.q.class, oVar);
        l lVar = l.f69653a;
        bVar.registerEncoder(f0.e.d.a.b.AbstractC1428a.class, lVar);
        bVar.registerEncoder(gv.o.class, lVar);
        c cVar = c.f69590a;
        bVar.registerEncoder(f0.c.class, cVar);
        bVar.registerEncoder(gv.e.class, cVar);
        r rVar = r.f69684a;
        bVar.registerEncoder(f0.e.d.a.c.class, rVar);
        bVar.registerEncoder(gv.t.class, rVar);
        s sVar = s.f69689a;
        bVar.registerEncoder(f0.e.d.c.class, sVar);
        bVar.registerEncoder(gv.u.class, sVar);
        u uVar = u.f69703a;
        bVar.registerEncoder(f0.e.d.AbstractC1439d.class, uVar);
        bVar.registerEncoder(gv.v.class, uVar);
        x xVar = x.f69713a;
        bVar.registerEncoder(f0.e.d.f.class, xVar);
        bVar.registerEncoder(gv.y.class, xVar);
        v vVar = v.f69705a;
        bVar.registerEncoder(f0.e.d.AbstractC1440e.class, vVar);
        bVar.registerEncoder(gv.w.class, vVar);
        w wVar = w.f69710a;
        bVar.registerEncoder(f0.e.d.AbstractC1440e.b.class, wVar);
        bVar.registerEncoder(gv.x.class, wVar);
        e eVar = e.f69606a;
        bVar.registerEncoder(f0.d.class, eVar);
        bVar.registerEncoder(gv.f.class, eVar);
        f fVar = f.f69609a;
        bVar.registerEncoder(f0.d.b.class, fVar);
        bVar.registerEncoder(gv.g.class, fVar);
    }
}
