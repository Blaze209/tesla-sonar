package com.google.android.gms.internal.fido;

import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes5.dex */
public final class zzhg extends zzhp {
    private final zzcc zza;
    private final int zzb;

    zzhg(zzcc zzccVar) throws zzhf {
        zzccVar.getClass();
        this.zza = zzccVar;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            zzcc zzccVar2 = this.zza;
            if (i11 >= zzccVar2.size()) {
                break;
            }
            int iZzb = ((zzhp) zzccVar2.get(i11)).zzb();
            if (i12 < iZzb) {
                i12 = iZzb;
            }
            i11++;
        }
        int i13 = i12 + 1;
        this.zzb = i13;
        if (i13 > 8) {
            throw new zzhf("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        if (zzhp.zzd((byte) -128) != zzhpVar.zza()) {
            return zzhp.zzd((byte) -128) - zzhpVar.zza();
        }
        zzhg zzhgVar = (zzhg) zzhpVar;
        zzcc zzccVar = this.zza;
        int size = zzccVar.size();
        zzcc zzccVar2 = zzhgVar.zza;
        if (size != zzccVar2.size()) {
            return zzccVar.size() - zzccVar2.size();
        }
        int i11 = 0;
        while (true) {
            zzcc zzccVar3 = this.zza;
            if (i11 >= zzccVar3.size()) {
                return 0;
            }
            int iCompareTo = ((zzhp) zzccVar3.get(i11)).compareTo((zzhp) zzhgVar.zza.get(i11));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhg.class == obj.getClass()) {
            return this.zza.equals(((zzhg) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd((byte) -128)), this.zza});
    }

    public final String toString() {
        if (this.zza.isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        ArrayList arrayList = new ArrayList();
        zzcc zzccVar = this.zza;
        int size = zzccVar.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((zzhp) zzccVar.get(i11)).toString().replace("\n", "\n  "));
        }
        zzbd zzbdVarZza = zzbd.zza(",\n  ");
        StringBuilder sb2 = new StringBuilder("[\n  ");
        zzbdVarZza.zzc(sb2, arrayList.iterator());
        sb2.append("\n]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zza() {
        return zzhp.zzd((byte) -128);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    protected final int zzb() {
        return this.zzb;
    }
}
