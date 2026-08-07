package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzed {
    zzed() {
    }

    public static final FindAutocompletePredictionsResponse zza(zzec zzecVar) throws ApiException {
        int iZza = zzfb.zza(zzecVar.status);
        if (PlacesStatusCodes.isError(iZza)) {
            throw new ApiException(new Status(iZza, zzfb.zzb(zzecVar.status, zzecVar.errorMessage)));
        }
        ArrayList arrayList = new ArrayList();
        zzdq[] zzdqVarArr = zzecVar.predictions;
        if (zzdqVarArr != null) {
            for (zzdq zzdqVar : zzdqVarArr) {
                if (zzdqVar == null || TextUtils.isEmpty(zzdqVar.zzf())) {
                    throw new ApiException(new Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result"));
                }
                AutocompletePrediction.Builder builder = AutocompletePrediction.builder(zzdqVar.zzf());
                builder.setDistanceMeters(zzdqVar.zzd());
                builder.setPlaceTypes(zzex.zza(zzex.zzb(zzdqVar.zzc())));
                builder.setFullText(zzil.zzb(zzdqVar.zze()));
                builder.zza(zzb(zzdqVar.zzb()));
                zzdq.zza zzaVarZza = zzdqVar.zza();
                if (zzaVarZza != null) {
                    builder.setPrimaryText(zzil.zzb(zzaVarZza.zzc()));
                    builder.zzc(zzb(zzaVarZza.zza()));
                    builder.setSecondaryText(zzil.zzb(zzaVarZza.zzd()));
                    builder.zzd(zzb(zzaVarZza.zzb()));
                }
                arrayList.add(builder.build());
            }
        }
        return FindAutocompletePredictionsResponse.newInstance(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzb(List list) throws ApiException {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        zzjw zzjwVarListIterator = ((zziy) list).listIterator(0);
        while (zzjwVarListIterator.hasNext()) {
            zzdq.zzb zzbVar = (zzdq.zzb) zzjwVarListIterator.next();
            Status status = new Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result");
            if (zzbVar == null) {
                throw new ApiException(status);
            }
            Integer num = zzbVar.offset;
            Integer num2 = zzbVar.length;
            if (num == null || num2 == null) {
                throw new ApiException(status);
            }
            com.google.android.libraries.places.api.model.zzba zzbaVarZzc = com.google.android.libraries.places.api.model.zzbb.zzc();
            zzbaVarZzc.zzb(num.intValue());
            zzbaVarZzc.zza(num2.intValue());
            arrayList.add(zzbaVarZzc.zzc());
        }
        return arrayList;
    }
}
