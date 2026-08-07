package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zbo extends com.google.android.gms.internal.p000authapi.zbb implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    protected final boolean zba(int i11, Parcel parcel, Parcel parcel2, int i12) {
        if (i11 == 1) {
            zbc();
        } else {
            if (i11 != 2) {
                return false;
            }
            zbb();
        }
        return true;
    }
}
