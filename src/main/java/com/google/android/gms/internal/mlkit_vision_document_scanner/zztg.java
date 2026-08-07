package com.google.android.gms.internal.mlkit_vision_document_scanner;

/* JADX INFO: loaded from: classes5.dex */
final class zztg extends zztk {
    private final String zza;
    private final boolean zzb;
    private final int zzc;

    /* synthetic */ zztg(String str, boolean z11, int i11, byte[] bArr) {
        this.zza = str;
        this.zzb = z11;
        this.zzc = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zztk) {
            zztk zztkVar = (zztk) obj;
            if (this.zza.equals(zztkVar.zza()) && this.zzb == zztkVar.zzb() && this.zzc == zztkVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        boolean z11 = this.zzb;
        int length = String.valueOf(z11).length();
        int i11 = this.zzc;
        int length2 = String.valueOf(i11).length();
        String str = this.zza;
        StringBuilder sb2 = new StringBuilder(str.length() + 48 + length + 19 + length2 + 1);
        sb2.append("MLKitLoggingOptions{libraryName=");
        sb2.append(str);
        sb2.append(", enableFirelog=");
        sb2.append(z11);
        sb2.append(", firelogEventType=");
        sb2.append(i11);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zztk
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zztk
    public final boolean zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_document_scanner.zztk
    public final int zzc() {
        return this.zzc;
    }
}
