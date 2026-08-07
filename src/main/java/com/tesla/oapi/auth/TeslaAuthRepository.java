package com.tesla.oapi.auth;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import cm0.h;
import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.tesla.logging.TeslaLog;
import com.tesla.logging.g;
import com.tesla.oapi.OwnerAPIError;
import com.tesla.oapi.OwnerApiStatusCode;
import com.tesla.oapi.OwnerResponse;
import ie0.j0;
import io.reactivex.rxjava3.core.u;
import io.reactivex.rxjava3.core.v;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import jn0.x;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 32\u00020\u0001:\u00013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000b*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J?\u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\u001a0\u00190\u00182\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0017¢\u0006\u0004\b\u001b\u0010 J\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u001b\u0010!J\u0011\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\"\u0010!J\u0011\u0010#\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b#\u0010!J\u0011\u0010$\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b$\u0010!J\u000f\u0010%\u001a\u00020\u000eH\u0016¢\u0006\u0004\b%\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\"\u0010(\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/tesla/oapi/auth/TeslaAuthRepository;", "Lcom/tesla/oapi/auth/AuthRepository;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/tesla/oapi/auth/AuthLocalDataSource;", ImagesContract.LOCAL, "<init>", "(Landroid/content/Context;Lcom/tesla/oapi/auth/AuthLocalDataSource;)V", "Lcom/tesla/oapi/OwnerResponse;", "ownerResponse", "Lie0/j0;", "", "processTokenResponse", "(Lcom/tesla/oapi/OwnerResponse;)Lie0/j0;", "Ljn0/h0;", "resetTokens", "()V", "Lorg/json/JSONObject;", Action.KEY_ATTRIBUTE, "getStringOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "authorizationCode", "codeVerifier", IssuerListPaymentMethod.ISSUER, "Lio/reactivex/rxjava3/core/u;", "Lkotlin/Pair;", "", "getToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/u;", "", "forceRefresh", "Lcom/tesla/oapi/auth/TokenResult;", "(Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/u;", "()Ljava/lang/String;", "getRefreshToken", "getIdToken", "getIssuer", "deleteAccountAuthInformation", "Lcom/tesla/oapi/auth/AuthLocalDataSource;", "Lcom/tesla/oapi/auth/RemoteAuthDataSource;", "remote", "Lcom/tesla/oapi/auth/RemoteAuthDataSource;", "getRemote", "()Lcom/tesla/oapi/auth/RemoteAuthDataSource;", "setRemote", "(Lcom/tesla/oapi/auth/RemoteAuthDataSource;)V", "appContext", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "tokenLock", "Ljava/util/concurrent/locks/ReentrantLock;", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TeslaAuthRepository implements AuthRepository {
    private static final String KEY_ACCESS_TOKEN = "access_token";
    private static final String KEY_CLAIM_EMAIL = "email";
    private static final String KEY_CLAIM_PHONE = "phone_number";
    private static final String KEY_ID_TOKEN = "id_token";
    private static final String KEY_REFRESH_TOKEN = "refresh_token";
    private static final long SAFE_TOKEN_PADDING_MILLISECONDS = 30000;
    private final Context appContext;
    private final AuthLocalDataSource local;
    public RemoteAuthDataSource remote;
    private final ReentrantLock tokenLock;
    private static final String TAG = "TeslaAuthRepository";
    private static final g log = g.INSTANCE.a(TAG);

    public TeslaAuthRepository(Context context, AuthLocalDataSource local) {
        s.k(context, "context");
        s.k(local, "local");
        this.local = local;
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        this.appContext = applicationContext;
        this.tokenLock = new ReentrantLock();
    }

    private final String getStringOrNull(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$2(TeslaAuthRepository teslaAuthRepository, com.auth0.android.jwt.d dVar, String str, v emitter) {
        s.k(emitter, "emitter");
        teslaAuthRepository.tokenLock.lock();
        String token = teslaAuthRepository.local.getToken();
        com.auth0.android.jwt.d dVarCreateOrNull = token != null ? JwtUtils.INSTANCE.createOrNull(token) : null;
        if ((dVarCreateOrNull != null ? dVarCreateOrNull.toString() : null) != null) {
            if (!s.f(dVarCreateOrNull.toString(), dVar != null ? dVar.toString() : null)) {
                teslaAuthRepository.tokenLock.unlock();
                log.j("Token has been updated, return with the latest value");
                String string = dVarCreateOrNull.toString();
                s.j(string, "toString(...)");
                emitter.onSuccess(new TokenResult.LocalSuccess(string));
                return;
            }
        }
        try {
            String refreshToken = teslaAuthRepository.getRefreshToken();
            if (refreshToken == null) {
                if (teslaAuthRepository.local.getToken() != null || teslaAuthRepository.local.getIdToken() != null) {
                    g gVar = log;
                    TeslaLog teslaLog = TeslaLog.INSTANCE;
                    String tag = gVar.getTag();
                    String strG = gVar.g("missing refresh token");
                    zb0.a aVar = zb0.a.f128044a;
                    Map mapF = v0.f(x.a(tag, strG));
                    FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry : mapF.entrySet()) {
                        zb0.a.f128044a.a((String) entry.getKey(), (String) entry.getValue());
                    }
                    firebaseCrashlytics.recordException(new Exception(strG));
                    TeslaLog.setTag$default(teslaLog, tag, false, 2, null);
                    vr0.a.INSTANCE.a(strG, new Object[0]);
                }
                emitter.onSuccess(new TokenResult.LocalFailure(new IllegalStateException("Missing refresh token!")));
                return;
            }
            if (str == null) {
                str = teslaAuthRepository.getIssuer();
            }
            if (str == null) {
                g gVar2 = log;
                TeslaLog teslaLog2 = TeslaLog.INSTANCE;
                String tag2 = gVar2.getTag();
                String strG2 = gVar2.g("missing issuer");
                zb0.a aVar2 = zb0.a.f128044a;
                Map mapF2 = v0.f(x.a(tag2, strG2));
                FirebaseCrashlytics firebaseCrashlytics2 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry2 : mapF2.entrySet()) {
                    zb0.a.f128044a.a((String) entry2.getKey(), (String) entry2.getValue());
                }
                firebaseCrashlytics2.recordException(new Exception(strG2));
                TeslaLog.setTag$default(teslaLog2, tag2, false, 2, null);
                vr0.a.INSTANCE.a(strG2, new Object[0]);
                emitter.onSuccess(new TokenResult.LocalFailure(new IllegalStateException("Missing issuer!")));
                return;
            }
            OwnerResponse ownerResponseB = teslaAuthRepository.getRemote().getToken(refreshToken, str).b();
            s.j(ownerResponseB, "blockingGet(...)");
            OwnerResponse ownerResponse = ownerResponseB;
            j0<String> j0VarProcessTokenResponse = teslaAuthRepository.processTokenResponse(ownerResponse);
            int code = ownerResponse.getCode();
            if (j0VarProcessTokenResponse.getIsFailure()) {
                g gVar3 = log;
                TeslaLog teslaLog3 = TeslaLog.INSTANCE;
                String tag3 = gVar3.getTag();
                String strG3 = gVar3.g("failed to get new token");
                zb0.a aVar3 = zb0.a.f128044a;
                Map mapF3 = v0.f(x.a(tag3, strG3));
                FirebaseCrashlytics firebaseCrashlytics3 = FirebaseCrashlytics.getInstance();
                for (Map.Entry entry3 : mapF3.entrySet()) {
                    zb0.a.f128044a.a((String) entry3.getKey(), (String) entry3.getValue());
                }
                firebaseCrashlytics3.recordException(new Exception(strG3));
                TeslaLog.setTag$default(teslaLog3, tag3, false, 2, null);
                vr0.a.INSTANCE.a(strG3, new Object[0]);
                if (code == OwnerApiStatusCode.UNAUTHORIZED.getCode()) {
                    g gVar4 = log;
                    TeslaLog teslaLog4 = TeslaLog.INSTANCE;
                    String tag4 = gVar4.getTag();
                    String strG4 = gVar4.g("token response code is 401");
                    zb0.a aVar4 = zb0.a.f128044a;
                    Map mapF4 = v0.f(x.a(tag4, strG4));
                    FirebaseCrashlytics firebaseCrashlytics4 = FirebaseCrashlytics.getInstance();
                    for (Map.Entry entry4 : mapF4.entrySet()) {
                        zb0.a.f128044a.a((String) entry4.getKey(), (String) entry4.getValue());
                    }
                    firebaseCrashlytics4.recordException(new Exception(strG4));
                    TeslaLog.setTag$default(teslaLog4, tag4, false, 2, null);
                    vr0.a.INSTANCE.a(strG4, new Object[0]);
                    com.tesla.logging.a.d(com.tesla.logging.a.EnumC1131a.AUTH_FAILURE, null, 2, null);
                    teslaAuthRepository.resetTokens();
                }
                emitter.onSuccess(new TokenResult.RemoteFailure(j0VarProcessTokenResponse.getException(), code));
            } else {
                log.j("token is refreshed");
                emitter.onSuccess(new TokenResult.RemoteSuccess(j0VarProcessTokenResponse.b()));
            }
        } catch (Exception e11) {
            log.d("error occurs when requesting token", e11);
            emitter.onSuccess(new TokenResult.LocalFailure(e11));
        } finally {
            teslaAuthRepository.tokenLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j0<String> processTokenResponse(OwnerResponse ownerResponse) {
        if (OwnerAPIError.isUnauthorized(ownerResponse.getCode())) {
            return j0.INSTANCE.a(new IllegalStateException(OwnerAPIError.OWNERAPI_ERROR_UNAUTHORIZED.getErrorString()));
        }
        if (ownerResponse.getResponse() == null) {
            if (ownerResponse.getError() != null) {
                j0.Companion companion = j0.INSTANCE;
                OwnerAPIError error = ownerResponse.getError();
                s.h(error);
                return companion.a(new IllegalStateException(error.getErrorString()));
            }
            return j0.INSTANCE.a(new IllegalStateException("Unhandled token response error: status code => " + ownerResponse.getStatusCode()));
        }
        JSONObject response = ownerResponse.getResponse();
        s.h(response);
        String stringOrNull = getStringOrNull(response, KEY_ACCESS_TOKEN);
        String stringOrNull2 = getStringOrNull(response, KEY_REFRESH_TOKEN);
        String stringOrNull3 = getStringOrNull(response, KEY_ID_TOKEN);
        if (stringOrNull != null) {
            this.local.setToken(stringOrNull);
        }
        if (stringOrNull2 != null) {
            this.local.setRefreshToken(stringOrNull2);
        }
        if (stringOrNull3 != null) {
            com.auth0.android.jwt.d dVarCreateOrNull = JwtUtils.INSTANCE.createOrNull(stringOrNull3);
            if (dVarCreateOrNull != null) {
                qb0.a.Companion companion2 = qb0.a.INSTANCE;
                companion2.b().J(dVarCreateOrNull.c("email").asString());
                companion2.b().N(dVarCreateOrNull.c(KEY_CLAIM_PHONE).asString());
            }
            this.local.setIdToken(stringOrNull3);
        }
        return stringOrNull == null ? j0.INSTANCE.a(new IllegalStateException("access token was null on refresh!")) : j0.INSTANCE.b(stringOrNull.toString());
    }

    private final void resetTokens() {
        AuthLocalDataSource authLocalDataSource = this.local;
        authLocalDataSource.setToken(null);
        authLocalDataSource.setRefreshToken(null);
        authLocalDataSource.setIdToken(null);
    }

    @Override // com.tesla.oapi.auth.AuthRepository
    public void deleteAccountAuthInformation() {
        resetTokens();
        qb0.a.Companion companion = qb0.a.INSTANCE;
        companion.b().J(null);
        companion.b().N(null);
    }

    @Override // com.tesla.oapi.auth.AuthRepository
    public String getIdToken() {
        return this.local.getIdToken();
    }

    @Override // com.tesla.oapi.auth.AuthRepository
    public String getIssuer() {
        return this.local.getIssuer();
    }

    @Override // com.tesla.oapi.auth.AuthRepository
    public String getRefreshToken() {
        return this.local.getRefreshToken();
    }

    public final RemoteAuthDataSource getRemote() {
        RemoteAuthDataSource remoteAuthDataSource = this.remote;
        if (remoteAuthDataSource != null) {
            return remoteAuthDataSource;
        }
        s.B("remote");
        return null;
    }

    @Override // com.tesla.oapi.auth.AuthRepository
    public u<Pair<j0<String>, Integer>> getToken(String authorizationCode, String codeVerifier, String issuer) {
        s.k(authorizationCode, "authorizationCode");
        s.k(codeVerifier, "codeVerifier");
        s.k(issuer, "issuer");
        u uVarN = getRemote().getToken(issuer, authorizationCode, codeVerifier).n(new h() { // from class: com.tesla.oapi.auth.TeslaAuthRepository.getToken.1
            @Override // cm0.h
            public final Pair<j0<String>, Integer> apply(OwnerResponse response) {
                s.k(response, "response");
                return x.a(TeslaAuthRepository.this.processTokenResponse(response), Integer.valueOf(response.getCode()));
            }
        });
        s.j(uVarN, "map(...)");
        return uVarN;
    }

    public final void setRemote(RemoteAuthDataSource remoteAuthDataSource) {
        s.k(remoteAuthDataSource, "<set-?>");
        this.remote = remoteAuthDataSource;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    @Override // com.tesla.oapi.auth.AuthRepository
    @SuppressLint({"CheckResult"})
    public u<TokenResult> getToken(final String issuer, boolean forceRefresh) {
        u uVarD;
        String token = this.local.getToken();
        final com.auth0.android.jwt.d dVarCreateOrNull = token != null ? JwtUtils.INSTANCE.createOrNull(token) : null;
        if (!forceRefresh && dVarCreateOrNull != null && dVarCreateOrNull.d() != null) {
            Date date = new Date();
            Date dateD = dVarCreateOrNull.d();
            s.h(dateD);
            if (!date.after(new Date(dateD.getTime() - SAFE_TOKEN_PADDING_MILLISECONDS))) {
                String string = dVarCreateOrNull.toString();
                s.j(string, "toString(...)");
                uVarD = u.m(new TokenResult.LocalSuccess(string));
                s.h(uVarD);
            } else {
                uVarD = u.d(new io.reactivex.rxjava3.core.x() { // from class: com.tesla.oapi.auth.c
                    @Override // io.reactivex.rxjava3.core.x
                    public final void a(v vVar) {
                        TeslaAuthRepository.getToken$lambda$2(this.f56493a, dVarCreateOrNull, issuer, vVar);
                    }
                });
                s.h(uVarD);
            }
        } else {
            uVarD = u.d(new io.reactivex.rxjava3.core.x() { // from class: com.tesla.oapi.auth.c
                @Override // io.reactivex.rxjava3.core.x
                public final void a(v vVar) {
                    TeslaAuthRepository.getToken$lambda$2(this.f56493a, dVarCreateOrNull, issuer, vVar);
                }
            });
            s.h(uVarD);
        }
        u<TokenResult> uVarV = uVarD.v(vm0.a.c());
        s.j(uVarV, "subscribeOn(...)");
        return uVarV;
    }

    @Override // com.tesla.oapi.auth.AuthRepository
    public String getToken() {
        return this.local.getToken();
    }
}
