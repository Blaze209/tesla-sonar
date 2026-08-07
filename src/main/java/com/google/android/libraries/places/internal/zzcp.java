package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.TypeFilter;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public final class zzcp implements zzfr {
    private final zzfz zza;
    private final zzgd zzb;
    private final zzfs zzc;

    zzcp(zzgd zzgdVar, zzfz zzfzVar, zzfs zzfsVar, byte[] bArr) {
        this.zzb = zzgdVar;
        this.zza = zzfzVar;
        this.zzc = zzfsVar;
    }

    static final int zzi(Task task) {
        if (task.isSuccessful()) {
            return 2;
        }
        Exception exception = task.getException();
        exception.getClass();
        int statusCode = (exception instanceof ApiException ? (ApiException) exception : new ApiException(new Status(13, exception.getMessage()))).getStatusCode();
        if (statusCode != 7) {
            return statusCode != 15 ? 1 : 3;
        }
        return 4;
    }

    private final zzaay zzj() {
        Locale localeZzb = this.zzc.zzb();
        Locale locale = Locale.getDefault();
        zzaay zzaayVarZza = zzaba.zza();
        zzaayVarZza.zzd(localeZzb.toString());
        if (!localeZzb.equals(locale)) {
            zzaayVarZza.zzb(locale.toString());
        }
        return zzaayVarZza;
    }

    private final void zzk(zzyh zzyhVar) {
        zzzj zzzjVarZzb = zzge.zzb(this.zza);
        zzzjVarZzb.zzl(16);
        zzzjVarZzb.zze(zzyhVar);
        zzzjVarZzb.zza(this.zzc.zza());
        zzl((zzzo) zzzjVarZzb.zzq());
    }

    private final void zzl(zzzo zzzoVar) {
        this.zzb.zza(zzge.zza(zzzoVar));
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zza(FetchPhotoRequest fetchPhotoRequest) {
        zzaaq zzaaqVarZza = zzaas.zza();
        zzaaqVarZza.zza(2);
        zzaas zzaasVar = (zzaas) zzaaqVarZza.zzq();
        zzzj zzzjVarZzb = zzge.zzb(this.zza);
        zzzjVarZzb.zzl(5);
        zzzjVarZzb.zzg(zzaasVar);
        zzzjVarZzb.zza(this.zzc.zza());
        zzl((zzzo) zzzjVarZzb.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zzb(Task task, long j11, long j12) {
        zzyc zzycVarZza = zzyh.zza();
        zzycVarZza.zzf(15);
        zzycVarZza.zze(zzi(task));
        zzycVarZza.zzd((int) (j12 - j11));
        zzk((zzyh) zzycVarZza.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zzc(FetchPlaceRequest fetchPlaceRequest) {
        zzzu zzzuVarZza = zzzv.zza();
        zzzuVarZza.zza(1);
        zzaat zzaatVarZza = zzaau.zza();
        zzaatVarZza.zza(zzfd.zzb(fetchPlaceRequest.getPlaceFields()));
        zzzuVarZza.zzb((zzaau) zzaatVarZza.zzq());
        zzzv zzzvVar = (zzzv) zzzuVarZza.zzq();
        zzaay zzaayVarZzj = zzj();
        zzaayVarZzj.zze(5);
        zzaayVarZzj.zzc(zzzvVar);
        zzaba zzabaVar = (zzaba) zzaayVarZzj.zzq();
        zzzj zzzjVarZzb = zzge.zzb(this.zza);
        zzzjVarZzb.zzl(1);
        zzzjVarZzb.zzh(zzabaVar);
        zzzjVarZzb.zza(this.zzc.zza());
        AutocompleteSessionToken sessionToken = fetchPlaceRequest.getSessionToken();
        if (sessionToken != null) {
            zzzjVarZzb.zzj(sessionToken.toString());
        }
        zzl((zzzo) zzzjVarZzb.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zzd(Task task, long j11, long j12) {
        boolean zIsSuccessful = task.isSuccessful();
        zzxu zzxuVarZza = zzxv.zza();
        zzxuVarZza.zza(1);
        zzxuVarZza.zzb(zIsSuccessful ? 1 : 0);
        zzxv zzxvVar = (zzxv) zzxuVarZza.zzq();
        zzyc zzycVarZza = zzyh.zza();
        zzycVarZza.zzf(8);
        zzycVarZza.zzc(zzxvVar);
        zzycVarZza.zze(zzi(task));
        zzycVarZza.zzd((int) (j12 - j11));
        zzk((zzyh) zzycVarZza.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zze(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        zzyl zzylVarZza = zzym.zza();
        TypeFilter typeFilter = findAutocompletePredictionsRequest.getTypeFilter();
        if (typeFilter != null) {
            zzylVarZza.zza(zzfe.zza(typeFilter));
        }
        zzym zzymVar = (zzym) zzylVarZza.zzq();
        zzyx zzyxVarZza = zzyy.zza();
        if (zzymVar != null) {
            zzyxVarZza.zza(zzymVar);
        }
        zzyy zzyyVar = (zzyy) zzyxVarZza.zzq();
        zzaay zzaayVarZzj = zzj();
        zzaayVarZzj.zze(6);
        zzaayVarZzj.zza(zzyyVar);
        zzaba zzabaVar = (zzaba) zzaayVarZzj.zzq();
        zzzj zzzjVarZzb = zzge.zzb(this.zza);
        zzzjVarZzb.zzl(1);
        zzzjVarZzb.zzh(zzabaVar);
        zzzjVarZzb.zza(this.zzc.zza());
        AutocompleteSessionToken sessionToken = findAutocompletePredictionsRequest.getSessionToken();
        if (sessionToken != null) {
            zzzjVarZzb.zzj(sessionToken.toString());
        }
        zzl((zzzo) zzzjVarZzb.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zzf(Task task, long j11, long j12) {
        int size = task.isSuccessful() ? ((FindAutocompletePredictionsResponse) task.getResult()).getAutocompletePredictions().size() : 0;
        zzxp zzxpVarZza = zzxq.zza();
        zzxpVarZza.zza(size);
        zzxq zzxqVar = (zzxq) zzxpVarZza.zzq();
        zzyc zzycVarZza = zzyh.zza();
        zzycVarZza.zzf(6);
        zzycVarZza.zzb(zzxqVar);
        zzycVarZza.zze(zzi(task));
        zzycVarZza.zzd((int) (j12 - j11));
        zzk((zzyh) zzycVarZza.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zzg(FindCurrentPlaceRequest findCurrentPlaceRequest, Task task, long j11, long j12) {
        int i11 = true == task.isSuccessful() ? 2 : 1;
        zzaaa zzaaaVarZza = zzaac.zza();
        zzaat zzaatVarZza = zzaau.zza();
        zzaatVarZza.zza(zzfd.zzb(findCurrentPlaceRequest.getPlaceFields()));
        zzaaaVarZza.zzb((zzaau) zzaatVarZza.zzq());
        zzaaaVarZza.zza((int) (j12 - j11));
        zzaaaVarZza.zzc(i11);
        zzaac zzaacVar = (zzaac) zzaaaVarZza.zzq();
        zzzj zzzjVarZzb = zzge.zzb(this.zza);
        zzzjVarZzb.zzl(6);
        zzzjVarZzb.zzd(zzaacVar);
        zzzjVarZzb.zza(this.zzc.zza());
        zzl((zzzo) zzzjVarZzb.zzq());
    }

    @Override // com.google.android.libraries.places.internal.zzfr
    public final void zzh(Task task, long j11, long j12) {
        int size = task.isSuccessful() ? ((FindCurrentPlaceResponse) task.getResult()).getPlaceLikelihoods().size() : 0;
        zzxi zzxiVarZza = zzxj.zza();
        zzxiVarZza.zza(size);
        zzxj zzxjVar = (zzxj) zzxiVarZza.zzq();
        zzyc zzycVarZza = zzyh.zza();
        zzycVarZza.zzf(4);
        zzycVarZza.zza(zzxjVar);
        zzycVarZza.zze(zzi(task));
        zzycVarZza.zzd((int) (j12 - j11));
        zzk((zzyh) zzycVarZza.zzq());
    }
}
