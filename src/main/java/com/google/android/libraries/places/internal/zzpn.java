package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzpn extends zzaey implements zzagh {
    private static final zzpn zzb;

    static {
        zzpn zzpnVar = new zzpn();
        zzb = zzpnVar;
        zzaey.zzI(zzpn.class, zzpnVar);
    }

    private zzpn() {
    }

    @Override // com.google.android.libraries.places.internal.zzaey
    protected final Object zzb(int i11, Object obj, Object obj2) {
        int i12 = i11 - 1;
        if (i12 == 0) {
            return (byte) 1;
        }
        zzpl zzplVar = null;
        if (i12 == 2) {
            return zzaey.zzF(zzb, "\u0001\u0000", null);
        }
        if (i12 == 3) {
            return new zzpn();
        }
        if (i12 == 4) {
            return new zzpm(zzplVar);
        }
        if (i12 != 5) {
            return null;
        }
        return zzb;
    }
}
