package com.google.android.gms.internal.nearby;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import androidx.core.content.b;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes5.dex */
@TargetApi(19)
public final class zzfy {
    private static final WeakHashMap zza = new WeakHashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final NfcAdapter zzd;
    private boolean zze = true;
    private boolean zzf;
    private boolean zzg;

    private zzfy(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        this.zzb = applicationContext;
        WeakReference weakReference = new WeakReference(activity);
        this.zzc = weakReference;
        this.zzd = NfcAdapter.getDefaultAdapter(applicationContext);
        activity.getApplication().registerActivityLifecycleCallbacks(new zzfx(this, weakReference));
        Log.d("NearbyConnections", "NfcDispatcher created.");
    }

    public static synchronized zzfy zza(Activity activity) {
        WeakHashMap weakHashMap;
        try {
            weakHashMap = zza;
            if (!weakHashMap.containsKey(activity)) {
                weakHashMap.put(activity, new zzfy(activity));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (zzfy) weakHashMap.get(activity);
    }

    public static /* synthetic */ void zzb(zzfy zzfyVar, Tag tag) {
        Intent intent = new Intent("android.nfc.action.TAG_DISCOVERED");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("android.nfc.extra.TAG", tag);
        zzfyVar.zzb.sendBroadcast(intent);
        Log.d("NearbyConnections", "Dispatching discovered NFC tag");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzg() {
        NfcAdapter nfcAdapter;
        Log.d("NearbyConnections", "Invalidating dispatch state.");
        if (!this.zze || !this.zzf) {
            Log.d("NearbyConnections", "Stopping NFC dispatching.");
            if (!this.zzg) {
                Log.d("NearbyConnections", "Can't stop NFC dispatching. Not dispatching.");
                return;
            }
            Activity activity = (Activity) this.zzc.get();
            if (activity != null) {
                this.zzd.disableReaderMode(activity);
            }
            this.zzg = false;
            Log.d("NearbyConnections", "No longer dispatching NFC events");
            return;
        }
        Log.d("NearbyConnections", "Starting NFC dispatching.");
        if (this.zzg) {
            Log.d("NearbyConnections", "Can't start NFC dispatching. Already dispatching.");
            return;
        }
        if (!this.zzb.getPackageManager().hasSystemFeature("android.hardware.nfc") || b.checkSelfPermission(this.zzb, "android.permission.NFC") != 0 || (nfcAdapter = this.zzd) == null || !nfcAdapter.isEnabled()) {
            Log.d("NearbyConnections", "Cannot dispatch NFC events. NFC is not supported.");
            return;
        }
        Activity activity2 = (Activity) this.zzc.get();
        if (activity2 == null) {
            Log.d("NearbyConnections", "Cannot dispatch NFC events. Activity is gone.");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("presence", 100);
        this.zzd.enableReaderMode(activity2, new NfcAdapter.ReaderCallback() { // from class: com.google.android.gms.internal.nearby.zzfw
            @Override // android.nfc.NfcAdapter.ReaderCallback
            public final void onTagDiscovered(Tag tag) {
                zzfy.zzb(this.zza, tag);
            }
        }, 385, bundle);
        this.zzg = true;
        Log.d("NearbyConnections", "Dispatching NFC events");
    }

    public final void zze() {
        this.zzf = true;
        Log.d("NearbyConnections", "NFC discovery started.");
        zzg();
    }

    public final void zzf() {
        this.zzf = false;
        Log.d("NearbyConnections", "NFC discovery stopped.");
        zzg();
    }
}
