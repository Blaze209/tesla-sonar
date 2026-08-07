package com.google.android.gms.wallet.button;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

/* JADX INFO: loaded from: classes5.dex */
public final class zzf {
    public static final View zza(Context context, ButtonOptions buttonOptions) {
        zze zzeVar;
        DynamiteModule dynamiteModuleZzb = zzb(context);
        try {
            IBinder iBinderInstantiate = dynamiteModuleZzb.instantiate("com.google.android.gms.wallet.dynamite.PayButtonCreatorChimeraImpl");
            if (iBinderInstantiate == null) {
                zzeVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.wallet.button.IPayButtonCreator");
                zzeVar = iInterfaceQueryLocalInterface instanceof zze ? (zze) iInterfaceQueryLocalInterface : new zze(iBinderInstantiate);
            }
            if (zzeVar != null) {
                return (View) ObjectWrapper.unwrap(zzeVar.zzd(ObjectWrapper.wrap(new Context[]{dynamiteModuleZzb.getModuleContext(), context}), buttonOptions));
            }
            Log.e("PayButtonProxy", "Failed to get the actual PayButtonCreatorChimeraImpl.");
            return null;
        } catch (RemoteException e11) {
            e = e11;
            Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
        } catch (DynamiteModule.LoadingException e12) {
            e = e12;
            Log.e("PayButtonProxy", "Failed to create PayButton using dynamite package", e);
        }
    }

    private static final DynamiteModule zzb(Context context) {
        try {
            return DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.wallet_dynamite");
        } catch (DynamiteModule.LoadingException e11) {
            throw new IllegalStateException(e11);
        }
    }
}
