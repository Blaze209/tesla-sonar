package com.google.android.gms.internal.fido;

import com.google.android.apps.common.proguard.SideEffectFree;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class zzay {
    private final String zza;
    private final Set zzb;
    private final boolean zzc;

    private zzay(String str, Set set, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.zza = "com.google.android.gms.fido";
        this.zzb = set;
        this.zzc = z14;
    }

    @SideEffectFree
    public final zzaq zza(String str, long j11) {
        final Class<Long> cls = Long.class;
        return new zzaq(this.zza, str, Long.valueOf(j11), new zzak(false, false, false, this.zzc, false, this.zzb, new zzax() { // from class: com.google.android.gms.internal.fido.zzav
        }, new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzaw
        }), true);
    }

    @SideEffectFree
    public final zzaq zzb(String str, String str2) {
        final Class<String> cls = String.class;
        return new zzaq(this.zza, str, str2, new zzak(false, false, false, this.zzc, false, this.zzb, new zzax() { // from class: com.google.android.gms.internal.fido.zzat
        }, new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzau
        }), true);
    }

    @SideEffectFree
    public final zzaq zzc(String str, boolean z11) {
        Boolean boolValueOf = Boolean.valueOf(z11);
        final Class<Boolean> cls = Boolean.class;
        return new zzaq(this.zza, str, boolValueOf, new zzak(false, false, false, this.zzc, false, this.zzb, new zzax() { // from class: com.google.android.gms.internal.fido.zzar
        }, new zzax(cls) { // from class: com.google.android.gms.internal.fido.zzas
        }), true);
    }

    public final zzay zzd() {
        return new zzay(this.zza, this.zzb, false, false, false, true, false);
    }

    public final zzay zze(Set set) {
        return new zzay(this.zza, set, false, false, false, this.zzc, false);
    }

    public zzay(String str) {
        this("com.google.android.gms.fido", zzcf.zzk(), false, false, false, false, false);
    }
}
