package ac0;

import android.content.Context;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.features.FeaturesConfig;
import com.tesla.features.FeaturesConfigEnvelope;
import com.tesla.logging.TeslaLog;
import com.tesla.oapi.OwnerApiEndpoint;
import com.tesla.oapi.OwnerApiEndpoints;
import com.tesla.oapi.OwnerApiStatusCode;
import com.tesla.oapi.OwnerResponse;
import com.tesla.oapi.SendOwnerRequest;
import ie0.j0;
import io.reactivex.rxjava3.core.u;
import java.util.Map;
import java.util.concurrent.Callable;
import jn0.h0;
import jn0.x;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u001eB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lac0/h;", "Lcom/tesla/features/c;", "Lcom/tesla/oapi/OwnerApiEndpoints;", "endpoints", "Ltd0/m;", "realmHelper", "Lcom/tesla/oapi/SendOwnerRequest;", "sendOwnerRequest", "Lcom/tesla/features/b;", "repository", "Lac0/c;", "getLoggedInStatus", "Landroid/content/Context;", "appContext", "<init>", "(Lcom/tesla/oapi/OwnerApiEndpoints;Ltd0/m;Lcom/tesla/oapi/SendOwnerRequest;Lcom/tesla/features/b;Lac0/c;Landroid/content/Context;)V", "", "h", "()J", "Ljn0/h0;", "l", "()V", "", "refresh", "Lio/reactivex/rxjava3/core/b;", IntegerTokenConverter.CONVERTER_KEY, "(Z)Lio/reactivex/rxjava3/core/b;", "Lio/reactivex/rxjava3/core/u;", "Lie0/j0;", "Lcom/tesla/features/FeaturesConfig;", "a", "(Z)Lio/reactivex/rxjava3/core/u;", "b", "Lcom/tesla/oapi/OwnerApiEndpoints;", "c", "Ltd0/m;", DateTokenConverter.CONVERTER_KEY, "Lcom/tesla/oapi/SendOwnerRequest;", "e", "Lcom/tesla/features/b;", "f", "Lac0/c;", "g", "Landroid/content/Context;", "features_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h implements com.tesla.features.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final com.tesla.logging.g f962i = com.tesla.logging.g.INSTANCE.a("GetFeatureConfig");

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final OwnerApiEndpoints endpoints;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m realmHelper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SendOwnerRequest sendOwnerRequest;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final com.tesla.features.b repository;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac0.c getLoggedInStatus;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T, R> implements cm0.h {
        b() {
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0<FeaturesConfig> apply(OwnerResponse response) {
            s.k(response, "response");
            try {
                if (!response.isSuccessful()) {
                    com.tesla.logging.g gVar = h.f962i;
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g("failed to fetch config");
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = v0.f(x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                    return j0.INSTANCE.a(new IllegalStateException("failed to fetch config"));
                }
                FeaturesConfigEnvelope featuresConfigEnvelopeFromJson = ac0.b.c().fromJson(String.valueOf(response.getResponse()));
                FeaturesConfig config = featuresConfigEnvelopeFromJson != null ? featuresConfigEnvelopeFromJson.getConfig() : null;
                if (config != null) {
                    h.f962i.j("successfully fetched features config => " + config);
                    h.this.repository.a(config);
                    return j0.INSTANCE.b(config);
                }
                com.tesla.logging.g gVar2 = h.f962i;
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVar2.getTag();
                String strG2 = gVar2.g("failed to deserialize config");
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = v0.f(x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
                return j0.INSTANCE.a(new IllegalStateException("failed to deserialize config"));
            } catch (Exception e11) {
                h.f962i.d("failed to fetch config", e11);
                return j0.INSTANCE.a(e11);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c<T, R> implements cm0.h {
        c() {
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0<FeaturesConfig> apply(j0<FeaturesConfig> result) {
            s.k(result, "result");
            return result.getIsFailure() ? j0.INSTANCE.b(h.this.repository.b()) : result;
        }
    }

    public h(OwnerApiEndpoints endpoints, m realmHelper, SendOwnerRequest sendOwnerRequest, com.tesla.features.b repository, ac0.c getLoggedInStatus, Context appContext) {
        s.k(endpoints, "endpoints");
        s.k(realmHelper, "realmHelper");
        s.k(sendOwnerRequest, "sendOwnerRequest");
        s.k(repository, "repository");
        s.k(getLoggedInStatus, "getLoggedInStatus");
        s.k(appContext, "appContext");
        this.endpoints = endpoints;
        this.realmHelper = realmHelper;
        this.sendOwnerRequest = sendOwnerRequest;
        this.repository = repository;
        this.getLoggedInStatus = getLoggedInStatus;
        this.appContext = appContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 g(Throwable it) {
        s.k(it, "it");
        f962i.d("error getting config", it);
        return j0.INSTANCE.a(it);
    }

    private final long h() {
        try {
            String strH = this.realmHelper.h("FEATURE_CONFIG_LAST_FETCH");
            if (strH != null) {
                return Long.parseLong(strH);
            }
            return 0L;
        } catch (Exception e11) {
            f962i.d("error getting last fetch time", e11);
            return 0L;
        }
    }

    private final io.reactivex.rxjava3.core.b i(boolean refresh) {
        if (!refresh) {
            io.reactivex.rxjava3.core.b bVarD = io.reactivex.rxjava3.core.b.d();
            s.j(bVarD, "complete(...)");
            return bVarD;
        }
        OwnerApiEndpoint endpoint = this.endpoints.getEndpoint("PRODUCT_LIST");
        if (endpoint == null) {
            io.reactivex.rxjava3.core.b bVarF = io.reactivex.rxjava3.core.b.f(new Callable() { // from class: ac0.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return h.j();
                }
            });
            s.j(bVarF, "fromCallable(...)");
            return bVarF;
        }
        io.reactivex.rxjava3.core.b bVarL = SendOwnerRequest.DefaultImpls.execute$default(this.sendOwnerRequest, endpoint.getMethod(), endpoint.getUri(), null, 5, endpoint.getIsAuthenticated(), false, 36, null).q(new cm0.h() { // from class: ac0.g
            @Override // cm0.h
            public final Object apply(Object obj) {
                return h.k((Throwable) obj);
            }
        }).l();
        s.j(bVarL, "ignoreElement(...)");
        return bVarL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j() {
        com.tesla.logging.g gVar = f962i;
        TeslaLog teslaLog = TeslaLog.INSTANCE;
        String tag = gVar.getTag();
        String strG = gVar.g("product list endpoint not found");
        zb0.a aVar = zb0.a.f128044a;
        Map mapF = v0.f(x.a(tag, strG));
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        for (Map.Entry entry : mapF.entrySet()) {
            zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
        }
        firebaseCrashlytics.recordException(new Exception(strG));
        TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
        vr0.a.INSTANCE.a(strG, new Object[0]);
        return h0.f84049a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OwnerResponse k(Throwable it) {
        s.k(it, "it");
        return OwnerResponse.INSTANCE.newInstance(OwnerApiStatusCode.UNKNOWN);
    }

    private final void l() {
        this.realmHelper.u("FEATURE_CONFIG_LAST_FETCH", String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.tesla.features.c
    public u<j0<FeaturesConfig>> a(boolean refresh) {
        if (!this.getLoggedInStatus.a()) {
            u<j0<FeaturesConfig>> uVarM = u.m(j0.INSTANCE.a(new IllegalStateException("not fetching config, not logged in")));
            s.j(uVarM, "just(...)");
            return uVarM;
        }
        if (System.currentTimeMillis() - h() < 60000 && !refresh) {
            u<j0<FeaturesConfig>> uVarM2 = u.m(j0.INSTANCE.b(this.repository.b()));
            s.j(uVarM2, "just(...)");
            return uVarM2;
        }
        OwnerApiEndpoint endpoint = this.endpoints.getEndpoint("FEATURE_CONFIG");
        if (endpoint == null) {
            u<j0<FeaturesConfig>> uVarM3 = u.m(j0.INSTANCE.a(new IllegalStateException("endpoint not found")));
            s.j(uVarM3, "just(...)");
            return uVarM3;
        }
        l();
        u<j0<FeaturesConfig>> uVarV = i(refresh).c(SendOwnerRequest.DefaultImpls.execute$default(this.sendOwnerRequest, endpoint.getMethod(), endpoint.getUri(), null, null, endpoint.getIsAuthenticated(), false, 44, null)).n(new b()).q(new cm0.h() { // from class: ac0.e
            @Override // cm0.h
            public final Object apply(Object obj) {
                return h.g((Throwable) obj);
            }
        }).n(new c()).v(vm0.a.c());
        s.j(uVarV, "subscribeOn(...)");
        return uVarV;
    }
}
