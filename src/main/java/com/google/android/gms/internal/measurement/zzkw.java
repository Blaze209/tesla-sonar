package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes5.dex */
final class zzkw {
    public int zza;
    public long zzb;
    public Object zzc;
    public final zzlr zzd;
    public int zze;

    zzkw() {
        int i11 = zzlr.zzb;
        int i12 = zznu.zza;
        this.zzd = zzlr.zza;
    }

    static /* synthetic */ String zza(int i11, int i12, byte b11, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + b11 + String.valueOf(i11).length());
        sb2.append(str);
        sb2.append(i12);
        sb2.append(str2);
        sb2.append(i11);
        return sb2.toString();
    }

    zzkw(zzlr zzlrVar) {
        zzlrVar.getClass();
        this.zzd = zzlrVar;
    }
}
