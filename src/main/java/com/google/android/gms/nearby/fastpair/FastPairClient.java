package com.google.android.gms.nearby.fastpair;

import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes5.dex */
public interface FastPairClient extends HasApiKey<Api.ApiOptions.NoOptions> {
    @NonNull
    Task<Boolean> isSassDeviceAvailable(@AudioUsage int i11);

    @NonNull
    Task<Boolean> triggerSassForUsage(@AudioUsage int i11);
}
