package com.google.android.gms.internal.nearby;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.nearby.uwb.RangingCapabilities;
import com.google.android.gms.nearby.uwb.RangingControleeParameters;
import com.google.android.gms.nearby.uwb.RangingParameters;
import com.google.android.gms.nearby.uwb.RangingSessionCallback;
import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.nearby.uwb.UwbAvailabilityObserver;
import com.google.android.gms.nearby.uwb.UwbClient;
import com.google.android.gms.nearby.uwb.UwbComplexChannel;
import com.google.android.gms.nearby.uwb.UwbDevice;
import com.google.android.gms.nearby.uwb.UwbRangeDataNtfConfig;
import com.google.android.gms.nearby.uwb.UwbStatusCodes;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class zzou extends GoogleApi implements UwbClient {
    public static final /* synthetic */ int zza = 0;
    private static final Api zzb = new Api("Nearby.UWB_API", new zzog(), new Api.ClientKey());
    private UwbAddress zzc;
    private final HashMap zzd;
    private zzom zze;
    private UwbComplexChannel zzf;

    public zzou(@NonNull Context context, com.google.android.gms.nearby.uwb.zze zzeVar) {
        super(context, (Api<com.google.android.gms.nearby.uwb.zze>) zzb, zzeVar, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.zzd = new HashMap();
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> addControlee(final UwbAddress uwbAddress) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzny
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzkr zzkrVar = (zzkr) ((zzno) obj).getService();
                zzjq zzjqVar = new zzjq();
                zzng zzngVar = new zzng();
                zzngVar.zza(uwbAddress.getAddress());
                zzjqVar.zza(zzngVar.zzb());
                zzjqVar.zzb(new zzol(this.zza, (TaskCompletionSource) obj2));
                zzkrVar.zzd(zzjqVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzI).setMethodKey(1316).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> addControleeWithSessionParams(final RangingControleeParameters rangingControleeParameters) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzoc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzkr zzkrVar = (zzkr) ((zzno) obj).getService();
                zzju zzjuVar = new zzju();
                zzma zzmaVar = new zzma();
                zzng zzngVar = new zzng();
                RangingControleeParameters rangingControleeParameters2 = rangingControleeParameters;
                zzngVar.zza(rangingControleeParameters2.getAddress().getAddress());
                zzmaVar.zza(zzngVar.zzb());
                zzmaVar.zzb(rangingControleeParameters2.getSubSessionId());
                zzmaVar.zzc(rangingControleeParameters2.getSubSessionKey());
                zzjuVar.zza(zzmaVar.zzd());
                zzjuVar.zzb(new zzol(this.zza, (TaskCompletionSource) obj2));
                zzkrVar.zze(zzjuVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzM).setMethodKey(1316).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<UwbComplexChannel> getComplexChannel() {
        if (((com.google.android.gms.nearby.uwb.zze) getApiOptions()).zza() == 2) {
            return Tasks.forException(new ApiException(new Status(UwbStatusCodes.INVALID_API_CALL)));
        }
        UwbComplexChannel uwbComplexChannel = this.zzf;
        return uwbComplexChannel != null ? Tasks.forResult(uwbComplexChannel) : doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzob
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzkr zzkrVar = (zzkr) ((zzno) obj).getService();
                zzkc zzkcVar = new zzkc();
                zzkcVar.zza(new zzok(this.zza, (TaskCompletionSource) obj2));
                zzkrVar.zzg(zzkcVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzH).setMethodKey(1303).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<UwbAddress> getLocalAddress() {
        UwbAddress uwbAddress = this.zzc;
        return uwbAddress != null ? Tasks.forResult(uwbAddress) : doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zznw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzkr zzkrVar = (zzkr) ((zzno) obj).getService();
                zzkg zzkgVar = new zzkg();
                zzkgVar.zza(new zzoj(this.zza, (TaskCompletionSource) obj2));
                zzkrVar.zzh(zzkgVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzH).setMethodKey(1302).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<RangingCapabilities> getRangingCapabilities() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzoa
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzkr zzkrVar = (zzkr) ((zzno) obj).getService();
                zzkk zzkkVar = new zzkk();
                zzkkVar.zza(new zzoi(this.zza, (TaskCompletionSource) obj2));
                zzkrVar.zzi(zzkkVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzH).setMethodKey(1301).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Boolean> isAvailable() {
        return doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zznt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzkr zzkrVar = (zzkr) ((zzno) obj).getService();
                zzlk zzlkVar = new zzlk();
                zzlkVar.zza(new zzoh(this.zza, (TaskCompletionSource) obj2));
                zzkrVar.zzj(zzlkVar.zzb());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzH).setMethodKey(1300).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> reconfigureRangeDataNtf(@UwbRangeDataNtfConfig.RangeDataNtfConfig final int i11, final int i12, final int i13) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zznv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzkr zzkrVar = (zzkr) ((zzno) obj).getService();
                zzmm zzmmVar = new zzmm();
                zzlu zzluVar = new zzlu();
                zzluVar.zzc(i11);
                zzluVar.zzb(i12);
                zzluVar.zza(i13);
                zzmmVar.zza(zzluVar.zzd());
                zzmmVar.zzb(new zzol(this.zza, (TaskCompletionSource) obj2));
                zzkrVar.zzk(zzmmVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzN).setMethodKey(1380).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> reconfigureRangingInterval(final int i11) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zznz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzkr zzkrVar = (zzkr) ((zzno) obj).getService();
                zzmq zzmqVar = new zzmq();
                zzmqVar.zza(i11);
                zzmqVar.zzb(new zzol(this.zza, (TaskCompletionSource) obj2));
                zzkrVar.zzl(zzmqVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzO).setMethodKey(1381).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> removeControlee(final UwbAddress uwbAddress) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzof
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                zzkr zzkrVar = (zzkr) ((zzno) obj).getService();
                zzmu zzmuVar = new zzmu();
                zzng zzngVar = new zzng();
                zzngVar.zza(uwbAddress.getAddress());
                zzmuVar.zza(zzngVar.zzb());
                zzmuVar.zzb(new zzol(this.zza, (TaskCompletionSource) obj2));
                zzkrVar.zzm(zzmuVar.zzc());
            }
        }).setFeatures(com.google.android.gms.nearby.zza.zzJ).setMethodKey(1317).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> startRanging(final RangingParameters rangingParameters, RangingSessionCallback rangingSessionCallback) {
        final UwbAddress uwbAddress = this.zzc;
        UwbComplexChannel uwbComplexChannel = this.zzf;
        if (uwbAddress == null) {
            return Tasks.forException(new ApiException(new Status(UwbStatusCodes.INVALID_API_CALL)));
        }
        if (uwbComplexChannel == null && rangingParameters.getComplexChannel() == null) {
            return Tasks.forException(new ApiException(new Status(UwbStatusCodes.INVALID_API_CALL)));
        }
        final zzot zzotVar = new zzot(this, rangingSessionCallback);
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zznu
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                this.zza.zze(uwbAddress, rangingParameters, zzotVar, (zzno) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(1304).setFeatures(com.google.android.gms.nearby.zza.zzH).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> stopRanging(final RangingSessionCallback rangingSessionCallback) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zzod
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                this.zza.zzf(rangingSessionCallback, (zzno) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(1305).setFeatures(com.google.android.gms.nearby.zza.zzH).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> subscribeToUwbAvailability(UwbAvailabilityObserver uwbAvailabilityObserver) {
        zzom zzomVar = this.zze;
        if (zzomVar != null) {
            UwbAvailabilityObserver uwbAvailabilityObserver2 = zzomVar.zza;
            Objects.requireNonNull(uwbAvailabilityObserver2);
            doUnregisterEventListener(ListenerHolders.createListenerKey(uwbAvailabilityObserver2, UwbAvailabilityObserver.class.getName()), 1391);
            zzom zzomVar2 = this.zze;
            Objects.requireNonNull(zzomVar2);
            this.zze = null;
            doWrite(TaskApiCall.builder().run(new zzoe(zzomVar2)).setMethodKey(1391).setFeatures(com.google.android.gms.nearby.zza.zzH).build());
        }
        this.zze = new zzom(this, uwbAvailabilityObserver);
        return doWrite(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.internal.nearby.zznx
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                this.zza.zzg((zzno) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(1390).setFeatures(com.google.android.gms.nearby.zza.zzH).build());
    }

    @Override // com.google.android.gms.nearby.uwb.UwbClient
    public final Task<Void> unsubscribeFromUwbAvailability() {
        zzom zzomVar = this.zze;
        if (zzomVar == null) {
            return Tasks.forCanceled();
        }
        UwbAvailabilityObserver uwbAvailabilityObserver = zzomVar.zza;
        Objects.requireNonNull(uwbAvailabilityObserver);
        doUnregisterEventListener(ListenerHolders.createListenerKey(uwbAvailabilityObserver, UwbAvailabilityObserver.class.getName()), 1391);
        zzom zzomVar2 = this.zze;
        Objects.requireNonNull(zzomVar2);
        this.zze = null;
        return doWrite(TaskApiCall.builder().run(new zzoe(zzomVar2)).setMethodKey(1391).setFeatures(com.google.android.gms.nearby.zza.zzH).build());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zze(UwbAddress uwbAddress, RangingParameters rangingParameters, zzot zzotVar, zzno zznoVar, TaskCompletionSource taskCompletionSource) {
        zzox[] zzoxVarArr;
        zzkr zzkrVar = (zzkr) zznoVar.getService();
        zzmy zzmyVar = new zzmy();
        UwbComplexChannel uwbComplexChannel = this.zzf;
        zzmg zzmgVar = new zzmg();
        zzmgVar.zzg(rangingParameters.getSessionId());
        zzmgVar.zzl(rangingParameters.getUwbConfigId());
        zzmgVar.zzf(rangingParameters.getRangingUpdateRate());
        int i11 = 0;
        if (rangingParameters.getPeerDevices().isEmpty()) {
            zzoxVarArr = new zzox[0];
        } else {
            zzoxVarArr = new zzox[rangingParameters.getPeerDevices().size()];
            for (UwbDevice uwbDevice : rangingParameters.getPeerDevices()) {
                zzov zzovVar = new zzov();
                zzng zzngVar = new zzng();
                zzngVar.zza(uwbDevice.getAddress().getAddress());
                zzovVar.zza(zzngVar.zzb());
                zzoxVarArr[i11] = zzovVar.zzb();
                i11++;
            }
        }
        zzmgVar.zzd(zzoxVarArr);
        zzov zzovVar2 = new zzov();
        zzng zzngVar2 = new zzng();
        zzngVar2.zza(uwbAddress.getAddress());
        zzovVar2.zza(zzngVar2.zzb());
        zzmgVar.zzc(zzovVar2.zzb());
        zzmgVar.zzi(rangingParameters.getSlotDuration());
        zzmgVar.zzb(rangingParameters.isAoaDisabled());
        byte[] sessionKeyInfo = rangingParameters.getSessionKeyInfo();
        if (sessionKeyInfo != null) {
            zzmgVar.zzh(sessionKeyInfo);
        }
        UwbComplexChannel complexChannel = rangingParameters.getComplexChannel();
        if (complexChannel != null) {
            uwbComplexChannel = complexChannel;
        }
        if (uwbComplexChannel != null) {
            zznp zznpVar = new zznp();
            zznpVar.zza(uwbComplexChannel.getChannel());
            zznpVar.zzb(uwbComplexChannel.getPreambleIndex());
            zzmgVar.zza(zznpVar.zzc());
        }
        UwbRangeDataNtfConfig uwbRangeDataNtfConfig = rangingParameters.getUwbRangeDataNtfConfig();
        if (uwbRangeDataNtfConfig == null) {
            uwbRangeDataNtfConfig = new UwbRangeDataNtfConfig.Builder().build();
        }
        zzlu zzluVar = new zzlu();
        zzluVar.zzc(uwbRangeDataNtfConfig.getRangeDataNtfConfigType());
        zzluVar.zzb(uwbRangeDataNtfConfig.getNtfProximityNear());
        zzluVar.zza(uwbRangeDataNtfConfig.getNtfProximityFar());
        zzmgVar.zze(zzluVar.zzd());
        byte[] subSessionKeyInfo = rangingParameters.getSubSessionKeyInfo();
        if (subSessionKeyInfo != null) {
            zzmgVar.zzj(rangingParameters.getSubSessionId());
            zzmgVar.zzk(subSessionKeyInfo);
        }
        zzmyVar.zzb(zzmgVar.zzm());
        zzmyVar.zza(zzotVar);
        zzmyVar.zzc(new zzol(this, taskCompletionSource));
        zzkrVar.zzn(zzmyVar.zzd());
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zzf(RangingSessionCallback rangingSessionCallback, zzno zznoVar, TaskCompletionSource taskCompletionSource) {
        zzkr zzkrVar = (zzkr) zznoVar.getService();
        zznc zzncVar = new zznc();
        zzncVar.zza(new zzol(this, taskCompletionSource));
        zzkrVar.zzo(zzncVar.zzb());
        doUnregisterEventListener(ListenerHolders.createListenerKey(rangingSessionCallback, RangingSessionCallback.class.getName()), 1305);
        this.zzc = null;
        this.zzf = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void zzg(zzno zznoVar, TaskCompletionSource taskCompletionSource) {
        zzkr zzkrVar = (zzkr) zznoVar.getService();
        zznk zznkVar = new zznk();
        zzom zzomVar = this.zze;
        Objects.requireNonNull(zzomVar);
        zznkVar.zza(zzomVar);
        zzkrVar.zzp(zznkVar.zzb());
        taskCompletionSource.setResult(null);
    }
}
