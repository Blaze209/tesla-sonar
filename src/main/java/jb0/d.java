package jb0;

import cc0.f;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import cm0.h;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.common.internal.ImagesContract;
import com.tesla.logging.g;
import com.tesla.oapi.OwnerApiEndpoint;
import com.tesla.oapi.OwnerApiEndpoints;
import com.tesla.oapi.OwnerResponse;
import com.tesla.oapi.SendOwnerRequest;
import fd0.SignedCommandsException;
import ie0.j0;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.y;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import jn0.x;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import tb0.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001\u001aB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Ljb0/d;", "", "Lcom/tesla/oapi/SendOwnerRequest;", "sendOwnerRequest", "Lpa0/d;", "analyticsService", "Ltb0/e;", ImagesContract.LOCAL, "Lcom/tesla/oapi/OwnerApiEndpoints;", "endpoints", "<init>", "(Lcom/tesla/oapi/SendOwnerRequest;Lpa0/d;Ltb0/e;Lcom/tesla/oapi/OwnerApiEndpoints;)V", "", Scopes.EMAIL, "vin", "g", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Ljn0/h0;", "h", "(Ljava/lang/String;Ljava/lang/String;)V", "connectionId", "Lio/reactivex/rxjava3/core/u;", "Lie0/j0;", "Lcom/auth0/android/jwt/d;", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/u;", "a", "Lcom/tesla/oapi/SendOwnerRequest;", "b", "Lpa0/d;", "c", "Ltb0/e;", "Lcom/tesla/oapi/OwnerApiEndpoint;", DateTokenConverter.CONVERTER_KEY, "Lcom/tesla/oapi/OwnerApiEndpoint;", "endpoint", "e", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final g f83497f = g.INSTANCE.a("HermesVehicleToken");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SendOwnerRequest sendOwnerRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pa0.d analyticsService;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e local;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final OwnerApiEndpoint endpoint;

    /* JADX INFO: renamed from: jb0.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Ljb0/d$a;", "", "<init>", "()V", "Lcom/tesla/oapi/SendOwnerRequest;", "sendOwnerRequest", "Lpa0/d;", "analyticsService", "Ltb0/e;", ImagesContract.LOCAL, "Lcom/tesla/oapi/OwnerApiEndpoints;", "endpoints", "Ljb0/d;", "a", "(Lcom/tesla/oapi/SendOwnerRequest;Lpa0/d;Ltb0/e;Lcom/tesla/oapi/OwnerApiEndpoints;)Ljb0/d;", "", "TAG", "Ljava/lang/String;", "KEY_HERMES_VEHICLE_TOKEN", "ENDPOINT", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(SendOwnerRequest sendOwnerRequest, pa0.d analyticsService, e local, OwnerApiEndpoints endpoints) {
            s.k(sendOwnerRequest, "sendOwnerRequest");
            s.k(analyticsService, "analyticsService");
            s.k(local, "local");
            s.k(endpoints, "endpoints");
            return new d(sendOwnerRequest, analyticsService, local, endpoints, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b<T, R> implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f83503b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83504c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f83505d;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T, R> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d f83506a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f83507b;

            a(d dVar, String str) {
                this.f83506a = dVar;
                this.f83507b = str;
            }

            @Override // cm0.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j0<com.auth0.android.jwt.d> apply(OwnerResponse response) {
                s.k(response, "response");
                if (!response.isSuccessful()) {
                    b.c(this.f83506a, v.p(qa0.a.b(), qa0.a.d(response.getCode())));
                    d.f83497f.j("Failed to fetch remote hermes vehicle token");
                    return j0.INSTANCE.a(new SignedCommandsException(null, null, null, null, "Failed to fetch remote hermes vehicle token", null, 47, null));
                }
                try {
                    JSONObject response2 = response.getResponse();
                    s.h(response2);
                    com.auth0.android.jwt.d dVar = new com.auth0.android.jwt.d(response2.getString("token"));
                    e eVar = this.f83506a.local;
                    String str = this.f83507b;
                    String string = dVar.toString();
                    s.j(string, "toString(...)");
                    eVar.a(str, string);
                    b.c(this.f83506a, v.e(qa0.a.g()));
                    return j0.INSTANCE.b(dVar);
                } catch (Exception e11) {
                    b.c(this.f83506a, v.p(qa0.a.b(), qa0.a.a("exception")));
                    d.f83497f.d("Failed to parse token", e11);
                    return j0.INSTANCE.a(e11);
                }
            }
        }

        b(String str, String str2, String str3) {
            this.f83503b = str;
            this.f83504c = str2;
            this.f83505d = str3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(d dVar, List<f> list) {
            dVar.analyticsService.b(cc0.d.FETCH_VEHICLE_TOKEN, list);
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final y<? extends j0<com.auth0.android.jwt.d>> apply(j0<? extends com.auth0.android.jwt.d> j0Var) {
            if (!j0Var.getIsFailure() && !j0Var.b().g(0L)) {
                u uVarM = u.m(j0Var);
                s.h(uVarM);
                return uVarM;
            }
            d.this.analyticsService.a(cc0.d.FETCH_VEHICLE_TOKEN_ATTEMPT);
            OwnerApiEndpoint ownerApiEndpoint = d.this.endpoint;
            u<R> uVarN = SendOwnerRequest.DefaultImpls.execute$default(d.this.sendOwnerRequest, ownerApiEndpoint.getMethod(), ownerApiEndpoint.getUri(), v0.f(x.a("vin", this.f83503b)), v0.f(x.a("uuid", this.f83504c)), (Map) null, (Map) null, (Integer) null, ownerApiEndpoint.getIsAuthenticated(), false, 368, (Object) null).n(new a(d.this, this.f83505d));
            s.h(uVarN);
            return uVarN;
        }
    }

    public /* synthetic */ d(SendOwnerRequest sendOwnerRequest, pa0.d dVar, e eVar, OwnerApiEndpoints ownerApiEndpoints, DefaultConstructorMarker defaultConstructorMarker) {
        this(sendOwnerRequest, dVar, eVar, ownerApiEndpoints);
    }

    private final String g(String email, String vin) {
        return "HermesVehicleToken-" + email + "-" + vin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 j(d dVar, String str) {
        String string = dVar.local.getString(str);
        return string == null ? j0.INSTANCE.a(new RuntimeException("Local hermes token missing")) : j0.INSTANCE.b(new com.auth0.android.jwt.d(string));
    }

    public final void h(String email, String vin) {
        s.k(email, "email");
        s.k(vin, "vin");
        this.local.b(g(email, vin));
    }

    public final u<j0<com.auth0.android.jwt.d>> i(String email, String connectionId, String vin) {
        s.k(email, "email");
        s.k(connectionId, "connectionId");
        s.k(vin, "vin");
        final String strG = g(email, vin);
        u<j0<com.auth0.android.jwt.d>> uVarV = u.k(new Callable() { // from class: jb0.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return d.j(this.f83494a, strG);
            }
        }).v(vm0.a.c()).j(new b(vin, connectionId, strG)).v(vm0.a.c());
        s.j(uVarV, "subscribeOn(...)");
        return uVarV;
    }

    private d(SendOwnerRequest sendOwnerRequest, pa0.d dVar, e eVar, OwnerApiEndpoints ownerApiEndpoints) {
        this.sendOwnerRequest = sendOwnerRequest;
        this.analyticsService = dVar;
        this.local = eVar;
        OwnerApiEndpoint endpoint = ownerApiEndpoints.getEndpoint("HERMES_VEHICLE_AUTHORIZATION");
        if (endpoint == null) {
            throw new IllegalStateException("HERMES_VEHICLE_AUTHORIZATION not found in endpoints");
        }
        this.endpoint = endpoint;
    }
}
