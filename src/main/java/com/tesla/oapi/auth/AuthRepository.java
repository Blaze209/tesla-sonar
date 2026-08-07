package com.tesla.oapi.auth;

import com.adyen.checkout.components.core.paymentmethod.IssuerListPaymentMethod;
import ie0.j0;
import io.reactivex.rxjava3.core.u;
import p013kotlin.Metadata;
import p013kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0012\u0004\u0012\u00020\t0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\n\u0010\u000fJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\n\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0011\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0012\u0010\u0010J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0013\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/tesla/oapi/auth/AuthRepository;", "", "", "authorizationCode", "codeVerifier", IssuerListPaymentMethod.ISSUER, "Lio/reactivex/rxjava3/core/u;", "Lkotlin/Pair;", "Lie0/j0;", "", "getToken", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/u;", "", "forceRefresh", "Lcom/tesla/oapi/auth/TokenResult;", "(Ljava/lang/String;Z)Lio/reactivex/rxjava3/core/u;", "()Ljava/lang/String;", "getRefreshToken", "getIdToken", "getIssuer", "Ljn0/h0;", "deleteAccountAuthInformation", "()V", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface AuthRepository {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ u getToken$default(AuthRepository authRepository, String str, boolean z11, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getToken");
            }
            if ((i11 & 1) != 0) {
                str = null;
            }
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return authRepository.getToken(str, z11);
        }
    }

    void deleteAccountAuthInformation();

    String getIdToken();

    String getIssuer();

    String getRefreshToken();

    u<Pair<j0<String>, Integer>> getToken(String authorizationCode, String codeVerifier, String issuer);

    u<TokenResult> getToken(String issuer, boolean forceRefresh);

    String getToken();
}
