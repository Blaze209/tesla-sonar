package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.zzca;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: loaded from: classes5.dex */
public final class MapsInitializer {
    private static final String zza = "MapsInitializer";
    private static boolean zzb = false;
    private static Renderer zzc = Renderer.LEGACY;

    public enum Renderer {
        LEGACY,
        LATEST
    }

    private MapsInitializer() {
    }

    public static synchronized int initialize(@NonNull Context context) {
        return initialize(context, null, null);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0048  */
    public static synchronized int initialize(@NonNull Context context, Renderer renderer, OnMapsSdkInitializedCallback onMapsSdkInitializedCallback) {
        Preconditions.checkNotNull(context, "Context is null");
        Log.d(zza, "preferredRenderer: ".concat(String.valueOf(renderer)));
        if (zzb) {
            if (onMapsSdkInitializedCallback != null) {
                onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
            }
            return 0;
        }
        try {
            com.google.android.gms.maps.internal.zzf zzfVarZza = zzca.zza(context, renderer);
            try {
                CameraUpdateFactory.zza(zzfVarZza.zze());
                BitmapDescriptorFactory.zza(zzfVarZza.zzj());
                int i11 = 1;
                zzb = true;
                if (renderer == null) {
                    i11 = 0;
                } else {
                    int iOrdinal = renderer.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            i11 = 0;
                        } else {
                            i11 = 2;
                        }
                    }
                }
                try {
                    if (zzfVarZza.zzd() == 2) {
                        zzc = Renderer.LATEST;
                    }
                    zzfVarZza.zzl(ObjectWrapper.wrap(context), i11);
                } catch (RemoteException e11) {
                    Log.e(zza, "Failed to retrieve renderer type or log initialization.", e11);
                }
                Log.d(zza, "loadedRenderer: ".concat(String.valueOf(zzc)));
                if (onMapsSdkInitializedCallback != null) {
                    onMapsSdkInitializedCallback.onMapsSdkInitialized(zzc);
                }
                return 0;
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        } catch (GooglePlayServicesNotAvailableException e13) {
            return e13.errorCode;
        }
    }
}
