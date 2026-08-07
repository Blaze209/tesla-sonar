package com.tesla.oapi.auth;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/tesla/oapi/auth/TeslaAuthLocalDataSource;", "Lcom/tesla/oapi/auth/AuthLocalDataSource;", "Ltd0/m;", "realmHelper", "<init>", "(Ltd0/m;)V", "", "getIssuer", "()Ljava/lang/String;", "getToken", "getRefreshToken", "getIdToken", "value", "Ljn0/h0;", "setToken", "(Ljava/lang/String;)V", "setRefreshToken", "setIdToken", "Ltd0/m;", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TeslaAuthLocalDataSource implements AuthLocalDataSource {
    private static final String KEY_REFRESH_TOKEN = "_SSO_AUTH_REFRESH_TOKEN";
    private static final String KEY_TOKEN = "_SSO_AUTH_TOKEN";
    private static final String KEY_TOKEN_ID = "_SSO_AUTH_ID_TOKEN";
    private final m realmHelper;

    public TeslaAuthLocalDataSource(m realmHelper) {
        s.k(realmHelper, "realmHelper");
        this.realmHelper = realmHelper;
    }

    @Override // com.tesla.oapi.auth.AuthLocalDataSource
    public String getIdToken() {
        return this.realmHelper.h(KEY_TOKEN_ID);
    }

    @Override // com.tesla.oapi.auth.AuthLocalDataSource
    public String getIssuer() {
        com.auth0.android.jwt.d dVarCreateOrNull;
        String idToken = getIdToken();
        if (idToken == null || (dVarCreateOrNull = JwtUtils.INSTANCE.createOrNull(idToken)) == null) {
            return null;
        }
        return dVarCreateOrNull.f();
    }

    @Override // com.tesla.oapi.auth.AuthLocalDataSource
    public String getRefreshToken() {
        return this.realmHelper.h(KEY_REFRESH_TOKEN);
    }

    @Override // com.tesla.oapi.auth.AuthLocalDataSource
    public String getToken() {
        return this.realmHelper.h(KEY_TOKEN);
    }

    @Override // com.tesla.oapi.auth.AuthLocalDataSource
    public void setIdToken(String value) {
        this.realmHelper.u(KEY_TOKEN_ID, value);
    }

    @Override // com.tesla.oapi.auth.AuthLocalDataSource
    public void setRefreshToken(String value) {
        this.realmHelper.u(KEY_REFRESH_TOKEN, value);
    }

    @Override // com.tesla.oapi.auth.AuthLocalDataSource
    public void setToken(String value) {
        this.realmHelper.u(KEY_TOKEN, value);
    }
}
