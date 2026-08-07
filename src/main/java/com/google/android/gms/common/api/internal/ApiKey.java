package com.google.android.gms.common.api.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions;
import com.google.android.gms.common.internal.Objects;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public final class ApiKey<O extends Api.ApiOptions> {
    private final int zaa;
    private final Api zab;
    private final Api.ApiOptions zac;
    private final String zad;

    private ApiKey(Api api, Api.ApiOptions apiOptions, String str) {
        this.zab = api;
        this.zac = apiOptions;
        this.zad = str;
        this.zaa = Objects.hashCode(api, apiOptions, str);
    }

    @NonNull
    @KeepForSdk
    public static <O extends Api.ApiOptions> ApiKey<O> getSharedApiKey(@NonNull Api<O> api, O o11, String str) {
        return new ApiKey<>(api, o11, str);
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ApiKey)) {
            return false;
        }
        ApiKey apiKey = (ApiKey) obj;
        return Objects.equal(this.zab, apiKey.zab) && Objects.equal(this.zac, apiKey.zac) && Objects.equal(this.zad, apiKey.zad);
    }

    public final int hashCode() {
        return this.zaa;
    }

    @NonNull
    public final String zaa() {
        return this.zab.zad();
    }
}
