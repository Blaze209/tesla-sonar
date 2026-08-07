package com.tesla.oapi.auth;

import android.os.Looper;
import com.tesla.logging.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/tesla/oapi/auth/RefreshAuthToken;", "", "repository", "Lcom/tesla/oapi/auth/AuthRepository;", "<init>", "(Lcom/tesla/oapi/auth/AuthRepository;)V", "execute", "Lcom/tesla/oapi/auth/TokenResult;", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RefreshAuthToken {
    private static final String TAG = "RefreshAuthToken";
    private static final g logger = g.INSTANCE.a(TAG);
    private final AuthRepository repository;

    public RefreshAuthToken(AuthRepository repository) {
        s.k(repository, "repository");
        this.repository = repository;
    }

    public final TokenResult execute() {
        if (s.f(Looper.getMainLooper(), Looper.myLooper())) {
            throw new IllegalStateException("Cannot refresh token on UI thread!");
        }
        if (this.repository.getRefreshToken() == null) {
            com.tesla.logging.a.d(com.tesla.logging.a.EnumC1131a.AUTH_FAILURE, null, 2, null);
            return new TokenResult.LocalFailure(new IllegalStateException("cannot fetch new token with null refresh token"));
        }
        String issuer = this.repository.getIssuer();
        if (issuer == null) {
            com.tesla.logging.a.d(com.tesla.logging.a.EnumC1131a.AUTH_FAILURE, null, 2, null);
            return new TokenResult.LocalFailure(new IllegalStateException("cannot fetch new token with null issuer"));
        }
        try {
            return this.repository.getToken(issuer, true).b();
        } catch (Exception e11) {
            logger.d("Exception thrown refreshing token!", e11);
            return new TokenResult.LocalFailure(e11);
        }
    }
}
