package com.google.android.gms.internal.measurement;

import com.adyen.checkout.components.core.Address;

/* JADX INFO: loaded from: classes5.dex */
final class zzbu extends zzca {
    private final String zzc;
    private final int zzd;
    private final int zze;

    /* synthetic */ zzbu(String str, boolean z11, int i11, zzbr zzbrVar, zzbs zzbsVar, int i12, byte[] bArr) {
        this.zzc = str;
        this.zzd = i11;
        this.zze = i12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzca) {
            zzca zzcaVar = (zzca) obj;
            if (this.zzc.equals(zzcaVar.zza())) {
                zzcaVar.zzb();
                int i11 = this.zzd;
                int iZze = zzcaVar.zze();
                if (i11 == 0) {
                    throw null;
                }
                if (i11 == iZze) {
                    zzcaVar.zzc();
                    zzcaVar.zzd();
                    int i12 = this.zze;
                    int iZzf = zzcaVar.zzf();
                    if (i12 == 0) {
                        throw null;
                    }
                    if (iZzf == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzc.hashCode() ^ 1000003;
        int i11 = this.zzd;
        if (i11 == 0) {
            throw null;
        }
        int i12 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i11;
        if (this.zze != 0) {
            return (i12 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        String str;
        int i11 = this.zzd;
        String str2 = Address.ADDRESS_NULL_PLACEHOLDER;
        if (i11 == 1) {
            str = "ALL_CHECKS";
        } else if (i11 == 2) {
            str = "SKIP_COMPLIANCE_CHECK";
        } else if (i11 != 3) {
            str = i11 != 4 ? Address.ADDRESS_NULL_PLACEHOLDER : "NO_CHECKS";
        } else {
            str = "SKIP_SECURITY_CHECK";
        }
        if (this.zze == 1) {
            str2 = "READ_AND_WRITE";
        }
        String str3 = this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 91 + str2.length() + 1);
        sb2.append("FileComplianceOptions{fileOwner=");
        sb2.append(str3);
        sb2.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb2.append(str);
        sb2.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final String zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final boolean zzb() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final zzbr zzc() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final zzbs zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final int zzf() {
        return this.zze;
    }
}
