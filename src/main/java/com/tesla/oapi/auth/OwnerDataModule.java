package com.tesla.oapi.auth;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.tesla.oapi.RemoteTeslaDataSource;
import jn0.h0;
import nk0.g;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import retrofit2.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/tesla/oapi/auth/OwnerDataModule;", "", "<init>", "()V", "remote", "Lcom/tesla/oapi/RemoteTeslaDataSource;", "getRemoteTeslaDataSource", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getAuthRepository", "Lcom/tesla/oapi/auth/AuthRepository;", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OwnerDataModule {
    public static final OwnerDataModule INSTANCE = new OwnerDataModule();
    private static RemoteTeslaDataSource remote;

    private OwnerDataModule() {
    }

    public static final AuthRepository getAuthRepository() {
        return Auth.INSTANCE.getAuthRepository();
    }

    public static final RemoteTeslaDataSource getRemoteTeslaDataSource(Context context) {
        s.k(context, "context");
        if (remote == null) {
            synchronized (INSTANCE) {
                try {
                    if (remote == null) {
                        z.b bVar = new z.b();
                        TeslaNetworkClient.Companion companion = TeslaNetworkClient.INSTANCE;
                        remote = (RemoteTeslaDataSource) bVar.c(companion.getOwnerapiBaseURL()).g(companion.getInstance(context, getAuthRepository()).getClient()).a(g.a()).b(qr0.a.f()).e().b(RemoteTeslaDataSource.class);
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        RemoteTeslaDataSource remoteTeslaDataSource = remote;
        s.h(remoteTeslaDataSource);
        return remoteTeslaDataSource;
    }
}
