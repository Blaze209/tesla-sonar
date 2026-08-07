package com.tesla.oapi.auth;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import cm0.f;
import com.tesla.logging.TeslaLog;
import com.tesla.oapi.RemoteTeslaDataSource;
import com.tesla.oapi.SendOwnerRequest;
import jn0.h0;
import nk0.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import retrofit2.z;
import td0.m;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/tesla/oapi/auth/Auth;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ljn0/h0;", "initialize", "(Landroid/content/Context;)V", "", "TAG", "Ljava/lang/String;", "Lcom/tesla/oapi/auth/AuthRepository;", "authRepository", "Lcom/tesla/oapi/auth/AuthRepository;", "getAuthRepository", "()Lcom/tesla/oapi/auth/AuthRepository;", "setAuthRepository", "(Lcom/tesla/oapi/auth/AuthRepository;)V", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Auth {
    public static final Auth INSTANCE = new Auth();
    private static final String TAG = "Auth";
    public static AuthRepository authRepository;

    private Auth() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 initialize$lambda$0(TeslaAuthRepository teslaAuthRepository) {
        AuthRepository.DefaultImpls.getToken$default(teslaAuthRepository, null, true, 1, null).t(new f() { // from class: com.tesla.oapi.auth.Auth$initialize$1$1
            @Override // cm0.f
            public final void accept(TokenResult it) {
                s.k(it, "it");
            }
        }, new f() { // from class: com.tesla.oapi.auth.Auth$initialize$1$2
            @Override // cm0.f
            public final void accept(Throwable it) {
                s.k(it, "it");
                TeslaLog.INSTANCE.e("Auth", "Failed to refresh token after attestation enabled", it);
            }
        });
        return h0.f84049a;
    }

    public final AuthRepository getAuthRepository() {
        AuthRepository authRepository2 = authRepository;
        if (authRepository2 != null) {
            return authRepository2;
        }
        s.B("authRepository");
        return null;
    }

    public final void initialize(Context context) {
        s.k(context, "context");
        Context applicationContext = context.getApplicationContext();
        s.j(applicationContext, "getApplicationContext(...)");
        m mVarJ = m.j();
        s.j(mVarJ, "getDB(...)");
        final TeslaAuthRepository teslaAuthRepository = new TeslaAuthRepository(applicationContext, new TeslaAuthLocalDataSource(mVarJ));
        setAuthRepository(teslaAuthRepository);
        z.b bVar = new z.b();
        TeslaNetworkClient.Companion companion = TeslaNetworkClient.INSTANCE;
        Object objB = bVar.c(companion.getOwnerapiBaseURL()).g(companion.getInstance(applicationContext, teslaAuthRepository).getClient()).a(g.a()).b(qr0.a.f()).e().b(RemoteTeslaDataSource.class);
        s.j(objB, "create(...)");
        SendOwnerRequest sendOwnerRequestNewInstance = SendOwnerRequest.INSTANCE.newInstance(applicationContext, (RemoteTeslaDataSource) objB, teslaAuthRepository);
        m mVarJ2 = m.j();
        s.j(mVarJ2, "getDB(...)");
        teslaAuthRepository.setRemote(new TeslaRemoteAuthDataSource(sendOwnerRequestNewInstance, mVarJ2, null, 4, null));
        IntegrityProvider.INSTANCE.getInstance().initialize(applicationContext, new wn0.a() { // from class: com.tesla.oapi.auth.a
            @Override // wn0.a
            public final Object invoke() {
                return Auth.initialize$lambda$0(teslaAuthRepository);
            }
        });
    }

    public final void setAuthRepository(AuthRepository authRepository2) {
        s.k(authRepository2, "<set-?>");
        authRepository = authRepository2;
    }
}
