package com.google.android.gms.internal.nearby;

import com.adyen.checkout.components.core.Address;

/* JADX INFO: loaded from: classes5.dex */
final class zzh extends zzj {
    private final String zzb;
    private final int zzc;

    /* synthetic */ zzh(String str, boolean z11, boolean z12, zzd zzdVar, zze zzeVar, int i11, zzg zzgVar) {
        this.zzb = str;
        this.zzc = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzj) {
            zzj zzjVar = (zzj) obj;
            if (this.zzb.equals(zzjVar.zzc())) {
                zzjVar.zzd();
                zzjVar.zze();
                zzjVar.zza();
                zzjVar.zzb();
                int i11 = this.zzc;
                int iZzf = zzjVar.zzf();
                if (i11 == 0) {
                    throw null;
                }
                if (iZzf == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzb.hashCode() ^ 1000003;
        if (this.zzc != 0) {
            return (((((iHashCode * 1000003) ^ 1237) * 1000003) ^ 1237) * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str = this.zzc != 1 ? Address.ADDRESS_NULL_PLACEHOLDER : "READ_AND_WRITE";
        return "FileComplianceOptions{fileOwner=" + this.zzb + ", hasDifferentDmaOwner=false, skipChecks=false, dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str + "}";
    }

    @Override // com.google.android.gms.internal.nearby.zzj
    public final zzd zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.nearby.zzj
    public final zze zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.nearby.zzj
    public final String zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.nearby.zzj
    public final boolean zzd() {
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zzj
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.nearby.zzj
    public final int zzf() {
        return this.zzc;
    }
}
