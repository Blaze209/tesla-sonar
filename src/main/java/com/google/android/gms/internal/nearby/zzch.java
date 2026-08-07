package com.google.android.gms.internal.nearby;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.collection.b;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.connection.AdvertisingOptions;
import com.google.android.gms.nearby.connection.ConnectionOptions;
import com.google.android.gms.nearby.connection.ConnectionsOptions;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import com.google.android.gms.nearby.connection.DiscoveryOptions;
import com.google.android.gms.nearby.connection.Payload;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class zzch extends GmsClient {
    public static final /* synthetic */ int zze = 0;
    private long zzf;
    private final Set zzg;
    private final Set zzh;
    private final Set zzi;
    private final Set zzj;
    private final Set zzk;
    private final Set zzl;
    private zzhc zzm;

    protected zzch(Context context, Looper looper, ClientSettings clientSettings, ConnectionsOptions connectionsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 54, clientSettings, (ConnectionCallbacks) connectionCallbacks, (OnConnectionFailedListener) onConnectionFailedListener);
        this.zzg = new b();
        this.zzh = new b();
        this.zzi = new b();
        this.zzj = new b();
        this.zzk = new b();
        this.zzl = new b();
        zzhm.zzc(context.getCacheDir());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Status zzG(int i11) {
        return new Status(i11, ConnectionsStatusCodes.getStatusCodeString(i11));
    }

    private final void zzH() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            ((zzbp) it.next()).zze();
        }
        Iterator it2 = this.zzh.iterator();
        while (it2.hasNext()) {
            ((zzbk) it2.next()).zza();
        }
        Iterator it3 = this.zzi.iterator();
        while (it3.hasNext()) {
            ((zzbt) it3.next()).zzf();
        }
        Iterator it4 = this.zzj.iterator();
        while (it4.hasNext()) {
            ((zzbt) it4.next()).zzf();
        }
        Iterator it5 = this.zzk.iterator();
        while (it5.hasNext()) {
            ((zzbt) it5.next()).zzf();
        }
        Iterator it6 = this.zzl.iterator();
        while (it6.hasNext()) {
            ((zzbt) it6.next()).zzf();
        }
        this.zzg.clear();
        this.zzh.clear();
        this.zzi.clear();
        this.zzj.clear();
        this.zzk.clear();
        this.zzl.clear();
        zzhc zzhcVar = this.zzm;
        if (zzhcVar != null) {
            zzhcVar.zzd();
            this.zzm = null;
        }
    }

    public static zzch zzq(Context context, Looper looper, ClientSettings clientSettings, ConnectionsOptions connectionsOptions, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        zzch zzchVar = new zzch(context, looper, clientSettings, connectionsOptions, connectionCallbacks, onConnectionFailedListener);
        zzchVar.zzf = zzchVar.hashCode();
        return zzchVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        return iInterfaceQueryLocalInterface instanceof zzfm ? (zzfm) iInterfaceQueryLocalInterface : new zzfm(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final void disconnect() {
        if (isConnected()) {
            try {
                ((zzfm) getService()).zzf(new zzax());
            } catch (RemoteException e11) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e11);
            }
        }
        zzH();
        super.disconnect();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return new Feature[]{com.google.android.gms.nearby.zza.zzf, com.google.android.gms.nearby.zza.zzx, com.google.android.gms.nearby.zza.zzB, com.google.android.gms.nearby.zza.zzz, com.google.android.gms.nearby.zza.zzC, com.google.android.gms.nearby.zza.zzy, com.google.android.gms.nearby.zza.zzg, com.google.android.gms.nearby.zza.zzA, com.google.android.gms.nearby.zza.zzh, com.google.android.gms.nearby.zza.zzD};
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.zzf);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getServiceDescriptor() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final String getStartServiceAction() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    protected final /* bridge */ /* synthetic */ void onConnectedLocked(@NonNull IInterface iInterface) {
        super.onConnectedLocked((zzfm) iInterface);
        this.zzm = new zzhc();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final void onConnectionSuspended(int i11) {
        if (i11 == 1) {
            zzH();
            i11 = 1;
        }
        super.onConnectionSuspended(i11);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresGooglePlayServices() {
        return Nearby.zza(getContext());
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzA(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) {
        zzbf zzbfVar = new zzbf(listenerHolder);
        this.zzk.add(zzbfVar);
        zzfm zzfmVar = (zzfm) getService();
        zzhz zzhzVar = new zzhz();
        zzhzVar.zzg(new zzcg(resultHolder));
        zzhzVar.zze(str);
        zzhzVar.zzh(str2);
        zzhzVar.zzf(advertisingOptions);
        zzhzVar.zzb(zzbfVar);
        zzfmVar.zzk(zzhzVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzB(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) {
        zzbf zzbfVar = new zzbf(listenerHolder);
        this.zzk.add(zzbfVar);
        zzfm zzfmVar = (zzfm) getService();
        zzhz zzhzVar = new zzhz();
        zzhzVar.zzg(new zzcg(resultHolder));
        zzhzVar.zzd(bArr);
        zzhzVar.zzh(str);
        zzhzVar.zzf(advertisingOptions);
        zzhzVar.zzb(zzbfVar);
        zzfmVar.zzk(zzhzVar.zzi());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzC(BaseImplementation.ResultHolder resultHolder, String str, ListenerHolder listenerHolder, DiscoveryOptions discoveryOptions) {
        zzbp zzbpVar = new zzbp(listenerHolder);
        this.zzg.add(zzbpVar);
        zzfm zzfmVar = (zzfm) getService();
        zzid zzidVar = new zzid();
        zzidVar.zzd(new zzce(resultHolder));
        zzidVar.zze(str);
        zzidVar.zzc(discoveryOptions);
        zzidVar.zza(zzbpVar);
        zzfmVar.zzl(zzidVar.zzf());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzD() {
        ((zzfm) getService()).zzm(new zzih());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzE() {
        ((zzfm) getService()).zzn(new zzij());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzF() {
        ((zzfm) getService()).zzo(new zzil());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzr(BaseImplementation.ResultHolder resultHolder, String str, ListenerHolder listenerHolder) {
        zzcd zzcdVar = new zzcd(getContext(), listenerHolder, this.zzm);
        this.zzi.add(zzcdVar);
        zzfm zzfmVar = (zzfm) getService();
        zzap zzapVar = new zzap();
        zzapVar.zze(new zzce(resultHolder));
        zzapVar.zzd(str);
        zzapVar.zzc(zzcdVar);
        zzfmVar.zzd(zzapVar.zzf());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzs(BaseImplementation.ResultHolder resultHolder, long j11) {
        zzfm zzfmVar = (zzfm) getService();
        zzat zzatVar = new zzat();
        zzatVar.zzb(new zzce(resultHolder));
        zzatVar.zza(j11);
        zzfmVar.zze(zzatVar.zzc());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzt(String str) {
        zzfm zzfmVar = (zzfm) getService();
        zzes zzesVar = new zzes();
        zzesVar.zza(str);
        zzfmVar.zzg(zzesVar.zzb());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzu(BaseImplementation.ResultHolder resultHolder, String str) {
        zzfm zzfmVar = (zzfm) getService();
        zzhn zzhnVar = new zzhn();
        zzhnVar.zzb(new zzce(resultHolder));
        zzhnVar.zza(str);
        zzfmVar.zzh(zzhnVar.zzc());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzv(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder) {
        zzbf zzbfVar = new zzbf(listenerHolder);
        this.zzk.add(zzbfVar);
        zzfm zzfmVar = (zzfm) getService();
        zzhr zzhrVar = new zzhr();
        zzhrVar.zzi(new zzce(resultHolder));
        zzhrVar.zzf(str);
        zzhrVar.zzh(str2);
        zzhrVar.zzb(zzbfVar);
        zzfmVar.zzi(zzhrVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzw(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder) {
        zzbf zzbfVar = new zzbf(listenerHolder);
        this.zzk.add(zzbfVar);
        zzfm zzfmVar = (zzfm) getService();
        zzhr zzhrVar = new zzhr();
        zzhrVar.zzi(new zzce(resultHolder));
        zzhrVar.zzd(bArr);
        zzhrVar.zzh(str);
        zzhrVar.zzb(zzbfVar);
        zzfmVar.zzi(zzhrVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzx(BaseImplementation.ResultHolder resultHolder, String str, String str2, ListenerHolder listenerHolder, ConnectionOptions connectionOptions) {
        zzbf zzbfVar = new zzbf(listenerHolder);
        this.zzk.add(zzbfVar);
        zzfm zzfmVar = (zzfm) getService();
        zzhr zzhrVar = new zzhr();
        zzhrVar.zzi(new zzce(resultHolder));
        zzhrVar.zzf(str);
        zzhrVar.zzh(str2);
        zzhrVar.zzb(zzbfVar);
        zzhrVar.zzg(connectionOptions);
        zzfmVar.zzi(zzhrVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzy(BaseImplementation.ResultHolder resultHolder, byte[] bArr, String str, ListenerHolder listenerHolder, ConnectionOptions connectionOptions) {
        zzbf zzbfVar = new zzbf(listenerHolder);
        this.zzk.add(zzbfVar);
        zzfm zzfmVar = (zzfm) getService();
        zzhr zzhrVar = new zzhr();
        zzhrVar.zzi(new zzce(resultHolder));
        zzhrVar.zzd(bArr);
        zzhrVar.zzh(str);
        zzhrVar.zzb(zzbfVar);
        zzhrVar.zzg(connectionOptions);
        zzfmVar.zzi(zzhrVar.zzj());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zzz(BaseImplementation.ResultHolder resultHolder, String[] strArr, Payload payload, boolean z11) throws Throwable {
        Pair pairCreate;
        try {
            int type = payload.getType();
            if (type == 1) {
                zzhi zzhiVar = new zzhi();
                zzhiVar.zzd(payload.getId());
                zzhiVar.zzm(payload.getType());
                byte[] bArrAsBytes = payload.asBytes();
                if (bArrAsBytes == null || bArrAsBytes.length <= 32768) {
                    zzhiVar.zza(bArrAsBytes);
                } else {
                    zzhe zzheVar = new zzhe();
                    zzheVar.zza(bArrAsBytes);
                    zzhiVar.zzk(zzheVar.zzb());
                    zzhiVar.zza(Arrays.copyOf(bArrAsBytes, 32768));
                }
                pairCreate = Pair.create(zzhiVar.zzo(), zzpl.zzc());
            } else if (type == 2) {
                Payload.File fileAsFile = payload.asFile();
                zzpm.zzc(fileAsFile, "File cannot be null for Payload.Type.FILE");
                File fileAsJavaFile = fileAsFile.asJavaFile();
                String absolutePath = fileAsJavaFile == null ? null : fileAsJavaFile.getAbsolutePath();
                Uri uriAsUri = fileAsFile.asUri();
                zzhi zzhiVar2 = new zzhi();
                zzhiVar2.zzd(payload.getId());
                zzhiVar2.zzm(payload.getType());
                zzhiVar2.zzb(fileAsFile.zza());
                zzhiVar2.zzn(uriAsUri);
                zzhiVar2.zzf(absolutePath);
                zzhiVar2.zzg(fileAsFile.getSize());
                zzhiVar2.zzh(payload.getOffset());
                zzhiVar2.zze(payload.zzh());
                zzhiVar2.zzj(payload.zza());
                zzhiVar2.zzc(payload.zzf());
                zzhiVar2.zzi(payload.zzg());
                pairCreate = Pair.create(zzhiVar2.zzo(), zzpl.zzc());
            } else {
                if (type != 3) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(String.format("Outgoing Payload %d has unknown type %d", Long.valueOf(payload.getId()), Integer.valueOf(payload.getType())));
                    Log.wtf("NearbyConnections", "Unknown payload type!", illegalArgumentException);
                    throw illegalArgumentException;
                }
                try {
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                    ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe2 = ParcelFileDescriptor.createPipe();
                    zzhi zzhiVar3 = new zzhi();
                    zzhiVar3.zzd(payload.getId());
                    zzhiVar3.zzm(payload.getType());
                    zzhiVar3.zzb(parcelFileDescriptorArrCreatePipe[0]);
                    zzhiVar3.zzl(parcelFileDescriptorArrCreatePipe2[0]);
                    zzhiVar3.zzh(payload.getOffset());
                    zzhiVar3.zzj(payload.zza());
                    pairCreate = Pair.create(zzhiVar3.zzo(), zzpl.zzd(Pair.create(parcelFileDescriptorArrCreatePipe[1], parcelFileDescriptorArrCreatePipe2[1])));
                } catch (IOException e11) {
                    Log.e("NearbyConnections", String.format("Unable to create PFD pipe for streaming payload %d from client to service.", Long.valueOf(payload.getId())), e11);
                    throw e11;
                }
            }
            zzfm zzfmVar = (zzfm) getService();
            zzhv zzhvVar = new zzhv();
            zzhvVar.zzc(new zzce(resultHolder));
            zzhvVar.zzb(strArr);
            zzhvVar.zza((zzhk) pairCreate.first);
            zzfmVar.zzj(zzhvVar.zzd());
            if (((zzpl) pairCreate.second).zzb()) {
                Object objZza = ((zzpl) pairCreate.second).zza();
                zzhc zzhcVar = this.zzm;
                if (zzhcVar != null) {
                    Pair pair = (Pair) objZza;
                    zzhcVar.zzc(((Payload.Stream) Preconditions.checkNotNull(payload.asStream())).asInputStream(), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.first), new ParcelFileDescriptor.AutoCloseOutputStream((ParcelFileDescriptor) pair.second), (zzhk) pairCreate.first, payload.getId());
                }
            }
        } catch (IOException e12) {
            Log.w("NearbyConnectionsClient", "Failed to create a Parcelable Payload.", e12);
            resultHolder.setResult(zzG(ConnectionsStatusCodes.STATUS_PAYLOAD_IO_ERROR));
        }
    }
}
