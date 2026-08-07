package com.google.android.gms.internal.fido;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class zzbi {
    private final String zza;
    private final zzbg zzb;
    private zzbg zzc;

    /* synthetic */ zzbi(String str, zzbh zzbhVar) {
        zzbg zzbgVar = new zzbg();
        this.zzb = zzbgVar;
        this.zzc = zzbgVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(32);
        sb2.append(this.zza);
        sb2.append(CoreConstants.CURLY_LEFT);
        zzbg zzbgVar = this.zzb.zzc;
        String str = "";
        while (zzbgVar != null) {
            Object obj = zzbgVar.zzb;
            sb2.append(str);
            String str2 = zzbgVar.zza;
            if (str2 != null) {
                sb2.append(str2);
                sb2.append('=');
            }
            if (obj == null || !obj.getClass().isArray()) {
                sb2.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb2.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            zzbgVar = zzbgVar.zzc;
            str = ", ";
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    public final zzbi zza(String str, int i11) {
        String strValueOf = String.valueOf(i11);
        zzbf zzbfVar = new zzbf(null);
        this.zzc.zzc = zzbfVar;
        this.zzc = zzbfVar;
        zzbfVar.zzb = strValueOf;
        zzbfVar.zza = "errorCode";
        return this;
    }

    public final zzbi zzb(String str, Object obj) {
        zzbg zzbgVar = new zzbg();
        this.zzc.zzc = zzbgVar;
        this.zzc = zzbgVar;
        zzbgVar.zzb = obj;
        zzbgVar.zza = str;
        return this;
    }
}
