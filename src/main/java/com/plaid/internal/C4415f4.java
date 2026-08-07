package com.plaid.internal;

import android.net.NetworkCapabilities;
import android.os.Build;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: com.plaid.internal.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4415f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC4451j4 f47656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC4589z f47657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC4589z f47658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EnumC4589z f47659d;

    public C4415f4(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities.hasTransport(0)) {
            this.f47656a = EnumC4451j4.CELLULAR;
        } else if (networkCapabilities.hasTransport(1)) {
            this.f47656a = EnumC4451j4.WIFI;
        } else if (networkCapabilities.hasTransport(3)) {
            this.f47656a = EnumC4451j4.WIRED;
        } else {
            this.f47656a = EnumC4451j4.OTHER;
        }
        this.f47658c = networkCapabilities.hasCapability(12) ? EnumC4589z.YES : EnumC4589z.NO;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f47657b = networkCapabilities.hasCapability(19) ? EnumC4589z.YES : EnumC4589z.NO;
        } else {
            this.f47657b = EnumC4589z.UNKNOWN;
        }
        this.f47659d = networkCapabilities.hasCapability(16) ? EnumC4589z.YES : EnumC4589z.NO;
    }

    @NonNull
    public final String toString() {
        return "type=" + this.f47656a.name() + ", foreground=" + this.f47657b + ", internet capable=" + this.f47658c + ", validated=" + this.f47659d;
    }
}
