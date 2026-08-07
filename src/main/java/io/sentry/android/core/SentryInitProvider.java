package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import io.sentry.b7;
import io.sentry.f5;
import io.sentry.z6;

/* JADX INFO: loaded from: classes9.dex */
public final class SentryInitProvider extends p1 {
    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        z zVar = new z();
        Context context = getContext();
        if (context == null) {
            zVar.c(b7.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            return false;
        }
        if (!d2.c(context, zVar) || g1.f(context)) {
            return true;
        }
        m2.e(context, zVar);
        z6.d().a("AutoInit");
        return true;
    }

    @Override // android.content.ContentProvider
    public void shutdown() {
        f5.k();
    }
}
