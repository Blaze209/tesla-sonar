package com.google.android.gms.auth.api;

import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class zbc {
    protected Boolean zba;
    protected String zbb;

    public zbc() {
        this.zba = Boolean.FALSE;
    }

    @ShowFirstParty
    public final zbc zba(String str) {
        this.zbb = str;
        return this;
    }

    @ShowFirstParty
    public zbc(zbd zbdVar) {
        this.zba = Boolean.FALSE;
        zbd.zbb(zbdVar);
        this.zba = Boolean.valueOf(zbdVar.zbc);
        this.zbb = zbdVar.zbd;
    }
}
