package com.tesla.oapi.auth;

import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import com.tesla.oapi.OwnerResponse;
import io.reactivex.rxjava3.core.u;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J-\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ%\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/tesla/oapi/auth/RemoteAuthDataSource;", "", "", "issuerUrl", "authorizationCode", "codeVerifier", "Lio/reactivex/rxjava3/core/u;", "Lcom/tesla/oapi/OwnerResponse;", "getToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/u;", "refreshToken", IssuerListPaymentMethod.ISSUER, "(Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/u;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface RemoteAuthDataSource {
    u<OwnerResponse> getToken(String refreshToken, String issuer);

    u<OwnerResponse> getToken(String issuerUrl, String authorizationCode, String codeVerifier);
}
