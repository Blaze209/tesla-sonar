package jb0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
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
import java.util.Map;
import java.util.concurrent.Callable;
import jn0.x;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import tb0.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0017B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Ljb0/b;", "", "Lcom/tesla/oapi/SendOwnerRequest;", "sendOwnerRequest", "Ltb0/e;", ImagesContract.LOCAL, "Lcom/tesla/oapi/OwnerApiEndpoints;", "endpoints", "<init>", "(Lcom/tesla/oapi/SendOwnerRequest;Ltb0/e;Lcom/tesla/oapi/OwnerApiEndpoints;)V", "", Scopes.EMAIL, "f", "(Ljava/lang/String;)Ljava/lang/String;", "Ljn0/h0;", "g", "(Ljava/lang/String;)V", "connectionId", "Lio/reactivex/rxjava3/core/u;", "Lie0/j0;", "Lcom/auth0/android/jwt/d;", "h", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/u;", "a", "Lcom/tesla/oapi/SendOwnerRequest;", "b", "Ltb0/e;", "Lcom/tesla/oapi/OwnerApiEndpoint;", "c", "Lcom/tesla/oapi/OwnerApiEndpoint;", "endpoint", DateTokenConverter.CONVERTER_KEY, "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final g f83485e = g.INSTANCE.a("HermesToken");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SendOwnerRequest sendOwnerRequest;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e local;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final OwnerApiEndpoint endpoint;

    /* JADX INFO: renamed from: jb0.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Ljb0/b$a;", "", "<init>", "()V", "Lcom/tesla/oapi/SendOwnerRequest;", "sendOwnerRequest", "Ltb0/e;", ImagesContract.LOCAL, "Lcom/tesla/oapi/OwnerApiEndpoints;", "endpoints", "Ljb0/b;", "a", "(Lcom/tesla/oapi/SendOwnerRequest;Ltb0/e;Lcom/tesla/oapi/OwnerApiEndpoints;)Ljb0/b;", "", "TAG", "Ljava/lang/String;", "KEY_HERMES_TOKEN", "ENDPOINT", "Lcom/tesla/logging/g;", "logger", "Lcom/tesla/logging/g;", "command_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(SendOwnerRequest sendOwnerRequest, e local, OwnerApiEndpoints endpoints) {
            s.k(sendOwnerRequest, "sendOwnerRequest");
            s.k(local, "local");
            s.k(endpoints, "endpoints");
            return new b(sendOwnerRequest, local, endpoints, null);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: jb0.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class C1758b<T, R> implements h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f83490b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f83491c;

        /* JADX INFO: renamed from: jb0.b$b$a */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a<T, R> implements h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b f83492a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f83493b;

            a(b bVar, String str) {
                this.f83492a = bVar;
                this.f83493b = str;
            }

            @Override // cm0.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j0<com.auth0.android.jwt.d> apply(OwnerResponse response) {
                s.k(response, "response");
                if (!response.isSuccessful()) {
                    b.f83485e.j("Failed to fetch remote hermes user token");
                    return j0.INSTANCE.a(new SignedCommandsException(null, null, null, null, "Failed to fetch remote hermes user token", null, 47, null));
                }
                try {
                    JSONObject response2 = response.getResponse();
                    s.h(response2);
                    com.auth0.android.jwt.d dVar = new com.auth0.android.jwt.d(response2.getString("token"));
                    e eVar = this.f83492a.local;
                    String str = this.f83493b;
                    String string = dVar.toString();
                    s.j(string, "toString(...)");
                    eVar.a(str, string);
                    return j0.INSTANCE.b(dVar);
                } catch (Exception e11) {
                    b.f83485e.d("Failed to parse token", e11);
                    return j0.INSTANCE.a(e11);
                }
            }
        }

        C1758b(String str, String str2) {
            this.f83490b = str;
            this.f83491c = str2;
        }

        @Override // cm0.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y<? extends j0<com.auth0.android.jwt.d>> apply(j0<? extends com.auth0.android.jwt.d> j0Var) {
            if (!j0Var.getIsFailure() && !j0Var.b().g(0L)) {
                u uVarM = u.m(j0Var);
                s.h(uVarM);
                return uVarM;
            }
            OwnerApiEndpoint ownerApiEndpoint = b.this.endpoint;
            u<R> uVarN = SendOwnerRequest.DefaultImpls.execute$default(b.this.sendOwnerRequest, ownerApiEndpoint.getMethod(), ownerApiEndpoint.getUri(), (Map) null, v0.f(x.a("uuid", this.f83490b)), (Map) null, (Map) null, (Integer) null, ownerApiEndpoint.getIsAuthenticated(), false, 372, (Object) null).n(new a(b.this, this.f83491c));
            s.h(uVarN);
            return uVarN;
        }
    }

    public /* synthetic */ b(SendOwnerRequest sendOwnerRequest, e eVar, OwnerApiEndpoints ownerApiEndpoints, DefaultConstructorMarker defaultConstructorMarker) {
        this(sendOwnerRequest, eVar, ownerApiEndpoints);
    }

    private final String f(String email) {
        return "HermesToken-" + email;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final j0 i(b bVar, String str) {
        String string = bVar.local.getString(str);
        return string == null ? j0.INSTANCE.a(new RuntimeException("Local hermes token missing")) : j0.INSTANCE.b(new com.auth0.android.jwt.d(string));
    }

    public final void g(String email) {
        s.k(email, "email");
        this.local.b(f(email));
    }

    public final u<j0<com.auth0.android.jwt.d>> h(String email, String connectionId) {
        s.k(email, "email");
        s.k(connectionId, "connectionId");
        final String strF = f(email);
        u<j0<com.auth0.android.jwt.d>> uVarJ = u.k(new Callable() { // from class: jb0.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return b.i(this.f83482a, strF);
            }
        }).v(vm0.a.c()).j(new C1758b(connectionId, strF));
        s.j(uVarJ, "flatMap(...)");
        return uVarJ;
    }

    private b(SendOwnerRequest sendOwnerRequest, e eVar, OwnerApiEndpoints ownerApiEndpoints) {
        this.sendOwnerRequest = sendOwnerRequest;
        this.local = eVar;
        OwnerApiEndpoint endpoint = ownerApiEndpoints.getEndpoint("HERMES_AUTHORIZATION");
        if (endpoint == null) {
            throw new IllegalStateException("HERMES_AUTHORIZATION not found in endpoints");
        }
        this.endpoint = endpoint;
    }
}
