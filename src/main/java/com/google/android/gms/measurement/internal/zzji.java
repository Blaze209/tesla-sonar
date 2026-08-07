package com.google.android.gms.measurement.internal;

import expo.modules.interfaces.permissions.PermissionsResponse;

/* JADX INFO: loaded from: classes5.dex */
public enum zzji {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED(PermissionsResponse.GRANTED_KEY);

    private final String zze;

    zzji(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
