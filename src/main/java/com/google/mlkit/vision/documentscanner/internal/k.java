package com.google.mlkit.vision.documentscanner.internal;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends GoogleApi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Api.ClientKey f45132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Api.AbstractClientBuilder f45133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Api f45134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f45135d = 0;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f45132a = clientKey;
        i iVar = new i();
        f45133b = iVar;
        f45134c = new Api("MlKitDocScanUI.API", iVar, clientKey);
    }

    public k(Context context) {
        super(context, (Api<Api.ApiOptions.NoOptions>) f45134c, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
