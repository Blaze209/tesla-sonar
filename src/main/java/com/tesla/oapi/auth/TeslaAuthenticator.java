package com.tesla.oapi.auth;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.oapi.OwnerApiStatusCode;
import java.util.Map;
import jn0.x;
import okhttp3.Authenticator;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tesla/oapi/auth/TeslaAuthenticator;", "Lokhttp3/Authenticator;", "repository", "Lcom/tesla/oapi/auth/AuthRepository;", "<init>", "(Lcom/tesla/oapi/auth/AuthRepository;)V", "authenticate", "Lokhttp3/Request;", PlaceTypes.ROUTE, "Lokhttp3/Route;", "response", "Lokhttp3/Response;", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TeslaAuthenticator implements Authenticator {
    private static final String HEADER_AUTH_RETRY_SENTINEL = "TeslaAuthenticator:Retry";
    private final AuthRepository repository;
    private static final String TAG = "TeslaAuthenticator";
    private static final g logger = g.INSTANCE.a(TAG);

    public TeslaAuthenticator(AuthRepository repository) {
        s.k(repository, "repository");
        this.repository = repository;
    }

    private static final Request authenticate$lambda$0$resetAuthHeader(String str, HttpUrl httpUrl, Request.Builder builder, String str2) {
        logger.j("token expired, fetched new token, re-authing <" + str + " - " + httpUrl + ">");
        return AuthUtils.INSTANCE.setAuthorizationHeader(builder, str2);
    }

    @Override // okhttp3.Authenticator
    public Request authenticate(Route route, Response response) {
        Request requestAuthenticate$lambda$0$resetAuthHeader;
        s.k(response, "response");
        Request request = response.request();
        HttpUrl httpUrlUrl = request.url();
        String strHeader = request.header("X-TXID");
        AuthUtils authUtils = AuthUtils.INSTANCE;
        String bearerTokenOrNull = authUtils.parseBearerTokenOrNull(request);
        if (bearerTokenOrNull == null) {
            return null;
        }
        g gVar = logger;
        gVar.j("queued request for re-auth <" + strHeader + " - " + httpUrlUrl + ">");
        synchronized (this) {
            try {
                String token = this.repository.getToken();
                Request.Builder builderNewBuilder = request.newBuilder();
                if (token == null) {
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g("null auth token");
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = v0.f(x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                    com.tesla.logging.a.d(com.tesla.logging.a.EnumC1131a.AUTH_FAILURE, null, 2, null);
                    return null;
                }
                if (!s.f(token, bearerTokenOrNull)) {
                    gVar.j("token was already fetched, re-authing <" + strHeader + " - " + httpUrlUrl + ">");
                    return authUtils.setAuthorizationHeader(builderNewBuilder, token);
                }
                if (request.header(HEADER_AUTH_RETRY_SENTINEL) != null) {
                    return null;
                }
                builderNewBuilder.header(HEADER_AUTH_RETRY_SENTINEL, "");
                TokenResult tokenResultExecute = new RefreshAuthToken(this.repository).execute();
                if (tokenResultExecute instanceof TokenResult.RemoteSuccess) {
                    gVar.j("successfully refreshed token, resetting header... <" + strHeader + " - " + httpUrlUrl + ">");
                    requestAuthenticate$lambda$0$resetAuthHeader = authenticate$lambda$0$resetAuthHeader(strHeader, httpUrlUrl, builderNewBuilder, ((TokenResult.RemoteSuccess) tokenResultExecute).getToken());
                } else {
                    if (!(tokenResultExecute instanceof TokenResult.LocalSuccess)) {
                        if (!(tokenResultExecute instanceof TokenResult.RemoteFailure)) {
                            if (!(tokenResultExecute instanceof TokenResult.LocalFailure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            gVar.j("local failure of refresh token, nothing more to be done.");
                            return null;
                        }
                        int statusCode = ((TokenResult.RemoteFailure) tokenResultExecute).getStatusCode();
                        if (statusCode == OwnerApiStatusCode.UNAUTHORIZED.getCode()) {
                            com.tesla.logging.a.d(com.tesla.logging.a.EnumC1131a.AUTH_FAILURE, null, 2, null);
                        } else {
                            String str = "remote failure of refresh token, code: " + statusCode + " <" + strHeader + " - " + httpUrlUrl + ">";
                            TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                            String tag2 = gVar.getTag();
                            String strG2 = gVar.g(str);
                            zb0.a aVar2 = zb0.a.f128044a;
                            Map mapF2 = v0.f(x.a(tag2, strG2));
                            FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                            for (Map.Entry entry2 : mapF2.entrySet()) {
                                zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                            }
                            firebaseCrashlytics2.recordException(new Exception(strG2));
                            TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                            vr0.a.INSTANCE.a(strG2, new Object[0]);
                        }
                        return null;
                    }
                    TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                    String tag3 = gVar.getTag();
                    String strG3 = gVar.g("successfully get new refresh token locally... <" + strHeader + " - " + httpUrlUrl + ">");
                    zb0.a aVar3 = zb0.a.f128044a;
                    Map mapF3 = v0.f(x.a(tag3, strG3));
                    FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry3 : mapF3.entrySet()) {
                        zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
                    }
                    firebaseCrashlytics3.recordException(new Exception(strG3));
                    TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                    vr0.a.INSTANCE.a(strG3, new Object[0]);
                    requestAuthenticate$lambda$0$resetAuthHeader = authenticate$lambda$0$resetAuthHeader(strHeader, httpUrlUrl, builderNewBuilder, ((TokenResult.LocalSuccess) tokenResultExecute).getToken());
                }
                return requestAuthenticate$lambda$0$resetAuthHeader;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
