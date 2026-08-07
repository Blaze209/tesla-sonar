package com.tesla.oapi.auth;

import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import com.google.android.gms.common.internal.ImagesContract;
import com.tesla.logging.g;
import com.tesla.oapi.HttpMethodType;
import com.tesla.oapi.OwnerResponse;
import com.tesla.oapi.SendOwnerRequest;
import io.reactivex.rxjava3.core.u;
import java.util.ArrayDeque;
import java.util.Map;
import jn0.h0;
import jn0.x;
import org.json.JSONException;
import org.json.JSONObject;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.collections.v0;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J=\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J%\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\"\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/tesla/oapi/auth/TeslaRemoteAuthDataSource;", "Lcom/tesla/oapi/auth/RemoteAuthDataSource;", "Lcom/tesla/oapi/SendOwnerRequest;", "sendOwnerRequest", "Ltd0/m;", "realmHelper", "Lcom/tesla/oapi/auth/IntegrityProvider;", "integrityProvider", "<init>", "(Lcom/tesla/oapi/SendOwnerRequest;Ltd0/m;Lcom/tesla/oapi/auth/IntegrityProvider;)V", "", "serializedBody", "", "getIntegrityHeaders", "(Ljava/lang/String;)Ljava/util/Map;", "", "grantTypeRefreshToken", "getAuthClientID", "(Z)Ljava/lang/String;", ImagesContract.URL, "data", "headers", "Lio/reactivex/rxjava3/core/u;", "Lcom/tesla/oapi/OwnerResponse;", "sendTokenRequest", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)Lio/reactivex/rxjava3/core/u;", IssuerListPaymentMethod.ISSUER, "getTokenRequestUrl", "(Ljava/lang/String;)Ljava/lang/String;", "issuerUrl", "authorizationCode", "codeVerifier", "getToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/u;", "refreshToken", "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/u;", "Lcom/tesla/oapi/SendOwnerRequest;", "Ltd0/m;", "Lcom/tesla/oapi/auth/IntegrityProvider;", "Ljava/util/ArrayDeque;", "", "recentRequestTimes", "Ljava/util/ArrayDeque;", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TeslaRemoteAuthDataSource implements RemoteAuthDataSource {
    private static final long RATE_LIMIT_WINDOW_MS = 60000;
    private static final int RATE_LIMIT_WINDOW_SIZE = 3;
    private static final String SCOPE = "openid email offline_access phone";
    private final IntegrityProvider integrityProvider;
    private final m realmHelper;
    private final ArrayDeque<Long> recentRequestTimes;
    private final SendOwnerRequest sendOwnerRequest;
    private static final String TAG = "TeslaRemoteAuthDataSource";
    private static final g logger = g.INSTANCE.a(TAG);

    public TeslaRemoteAuthDataSource(SendOwnerRequest sendOwnerRequest, m realmHelper, IntegrityProvider integrityProvider) {
        s.k(sendOwnerRequest, "sendOwnerRequest");
        s.k(realmHelper, "realmHelper");
        s.k(integrityProvider, "integrityProvider");
        this.sendOwnerRequest = sendOwnerRequest;
        this.realmHelper = realmHelper;
        this.integrityProvider = integrityProvider;
        this.recentRequestTimes = new ArrayDeque<>();
    }

    private final String getAuthClientID(boolean grantTypeRefreshToken) {
        return "ownerapi";
    }

    private final Map<String, String> getIntegrityHeaders(String serializedBody) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.recentRequestTimes) {
            try {
                if (this.recentRequestTimes.size() >= 3) {
                    Long lPeekFirst = this.recentRequestTimes.peekFirst();
                    long jLongValue = jCurrentTimeMillis - (lPeekFirst != null ? lPeekFirst.longValue() : 0L);
                    if (jLongValue < 60000) {
                        logger.n("Play Integrity rate limited: " + this.recentRequestTimes.size() + " requests in " + jLongValue + "ms, skipping");
                        ud0.a.b(v0.m(x.a("event", "mobile-app-play-integrity-telemetry"), x.a("type", "rate-limited"), x.a("requests_in_window", Integer.valueOf(this.recentRequestTimes.size())), x.a("window_ms", Long.valueOf(jLongValue))), true, null, 4, null);
                        return null;
                    }
                    this.recentRequestTimes.pollFirst();
                }
                this.recentRequestTimes.addLast(Long.valueOf(jCurrentTimeMillis));
                h0 h0Var = h0.f84049a;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                IntegrityResult integrityResultRequestIntegrityVerdict = this.integrityProvider.requestIntegrityVerdict(serializedBody);
                long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                if (integrityResultRequestIntegrityVerdict instanceof IntegrityResult.Success) {
                    logger.j("Play Integrity token obtained in " + jCurrentTimeMillis3 + "ms, attaching X-Play-Integrity header");
                    return v0.f(x.a("X-Play-Integrity", ((IntegrityResult.Success) integrityResultRequestIntegrityVerdict).getToken()));
                }
                if (!(integrityResultRequestIntegrityVerdict instanceof IntegrityResult.Failure)) {
                    if (!(integrityResultRequestIntegrityVerdict instanceof IntegrityResult.AttestationDisabled)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    logger.n("Attestation disabled, proceeding without attestation");
                    return null;
                }
                logger.n("Play Integrity failed after (" + jCurrentTimeMillis3 + "ms): " + ((IntegrityResult.Failure) integrityResultRequestIntegrityVerdict).getReason() + ", proceeding without attestation");
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final String getTokenRequestUrl(String issuer) {
        return issuer + "/token";
    }

    private final u<OwnerResponse> sendTokenRequest(String url, String data, Map<String, String> headers) {
        return SendOwnerRequest.DefaultImpls.execute$default(this.sendOwnerRequest, HttpMethodType.POST, url, (Map) null, data, (Map) null, (Map) headers, (Integer) null, false, false, 336, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ u sendTokenRequest$default(TeslaRemoteAuthDataSource teslaRemoteAuthDataSource, String str, String str2, Map map, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            map = null;
        }
        return teslaRemoteAuthDataSource.sendTokenRequest(str, str2, map);
    }

    @Override // com.tesla.oapi.auth.RemoteAuthDataSource
    public u<OwnerResponse> getToken(String issuerUrl, String authorizationCode, String codeVerifier) throws JSONException {
        s.k(issuerUrl, "issuerUrl");
        s.k(authorizationCode, "authorizationCode");
        s.k(codeVerifier, "codeVerifier");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grant_type", "authorization_code");
        jSONObject.put("client_id", getAuthClientID(false));
        jSONObject.put("code", authorizationCode);
        jSONObject.put("code_verifier", codeVerifier);
        jSONObject.put("redirect_uri", "tesla://auth/callback");
        jSONObject.put("scope", SCOPE);
        String string = jSONObject.toString();
        s.j(string, "toString(...)");
        return sendTokenRequest(getTokenRequestUrl(issuerUrl), string, getIntegrityHeaders(string));
    }

    public /* synthetic */ TeslaRemoteAuthDataSource(SendOwnerRequest sendOwnerRequest, m mVar, IntegrityProvider integrityProvider, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(sendOwnerRequest, mVar, (i11 & 4) != 0 ? IntegrityProvider.INSTANCE.getInstance() : integrityProvider);
    }

    @Override // com.tesla.oapi.auth.RemoteAuthDataSource
    public u<OwnerResponse> getToken(String refreshToken, String issuer) throws JSONException {
        s.k(refreshToken, "refreshToken");
        s.k(issuer, "issuer");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("grant_type", "refresh_token");
        jSONObject.put("refresh_token", refreshToken);
        jSONObject.put("client_id", getAuthClientID(true));
        jSONObject.put("scope", SCOPE);
        String string = jSONObject.toString();
        s.j(string, "toString(...)");
        return sendTokenRequest(getTokenRequestUrl(issuer), string, getIntegrityHeaders(string));
    }
}
