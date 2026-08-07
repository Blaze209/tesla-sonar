package com.google.mlkit.vision.documentscanner.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzd;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmz;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznt;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznu;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznv;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzpc;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zztp;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zztr;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzts;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zztz;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzu;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.sdkinternal.m;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements yx.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f45115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f45116g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yx.b f45117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Feature[] f45118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zzmz f45119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zztp f45120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zztr f45121e;

    public b(yx.b bVar) {
        zztp zztpVarZza = zztz.zza("play-services-mlkit-document-scanner");
        zztr zztrVarZza = zztr.zza(com.google.mlkit.common.sdkinternal.i.c().b());
        this.f45117a = bVar;
        this.f45119c = f.a(bVar);
        this.f45121e = zztrVarZza;
        this.f45120d = zztpVarZza;
        zzu zzuVar = new zzu();
        zzuVar.zza(m.f45073u);
        if (bVar.g()) {
            zzuVar.zza(m.f45075w);
        }
        if (bVar.h()) {
            zzuVar.zza(m.f45074v);
        }
        this.f45118b = (Feature[]) zzuVar.zzb().toArray(new Feature[0]);
    }

    private final void a(zznt zzntVar, long j11, long j12) throws Throwable {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zznv zznvVar = new zznv();
        zzpc zzpcVar = new zzpc();
        zzpcVar.zza(Long.valueOf(jElapsedRealtime - j11));
        zzpcVar.zzb(zzntVar);
        zzpcVar.zzc(this.f45119c);
        zznvVar.zzd(zzpcVar.zze());
        this.f45120d.zza(zzts.zze(zznvVar), zznu.ON_DEVICE_DOCUMENT_SCANNER_UI_FINISH);
        this.f45121e.zzb(24335, zzntVar.zza(), j12, jCurrentTimeMillis);
    }

    private static void b(String str) {
        if (Log.isLoggable("GmsDocumentScannerImpl", 3)) {
            Log.d("GmsDocumentScannerImpl", str);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:14:0x00de  */
    /* JADX WARN: Code duplicated, block: B:16:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:17:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:20:0x011a  */
    /* JADX WARN: Code duplicated, block: B:21:0x011c  */
    /* JADX WARN: Code duplicated, block: B:8:0x00a7  */
    @Override // yx.a
    public final Task<IntentSender> c(Activity activity) throws Throwable {
        int apkVersion;
        Task<IntentSender> taskForException;
        boolean z11;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context applicationContext = activity.getApplicationContext();
        zznv zznvVar = new zznv();
        zzpc zzpcVar = new zzpc();
        zzpcVar.zzc(this.f45119c);
        zznvVar.zze(zzpcVar.zze());
        this.f45120d.zza(zzts.zze(zznvVar), zznu.ON_DEVICE_DOCUMENT_SCANNER_UI_CREATE);
        ActivityManager activityManager = (ActivityManager) applicationContext.getSystemService("activity");
        if (activityManager == null) {
            if (!f45115f) {
                m.e(applicationContext, this.f45118b);
                f45115f = true;
            }
            apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(applicationContext);
            StringBuilder sb2 = new StringBuilder(String.valueOf(apkVersion).length() + 11);
            sb2.append("gmsVersion=");
            sb2.append(apkVersion);
            b(sb2.toString());
            if (apkVersion < 233900000) {
                a(zznt.GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, jElapsedRealtime, jCurrentTimeMillis);
                taskForException = Tasks.forException(new MlKitException("Feature not available in the current version of the Google Play services", 14));
            } else {
                if (new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_DOCUMENT").resolveActivity(applicationContext.getPackageManager()) != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                StringBuilder sb3 = new StringBuilder(String.valueOf(z11).length() + 27);
                sb3.append("isDocScanActivityAvailable=");
                sb3.append(z11);
                b(sb3.toString());
                if (z11) {
                    taskForException = null;
                } else {
                    a(zznt.GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, jElapsedRealtime, jCurrentTimeMillis);
                    taskForException = Tasks.forException(new MlKitException("Feature not available in the current version of the Google Play services", 14));
                }
            }
        } else {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            float f11 = ((memoryInfo.totalMem / 1024.0f) / 1024.0f) / 1024.0f;
            StringBuilder sb4 = new StringBuilder(String.valueOf(f11).length() + 17);
            sb4.append("total RAM (GB) = ");
            sb4.append(f11);
            b(sb4.toString());
            if (f11 < 1.7f) {
                a(zznt.LOW_MEMORY, jElapsedRealtime, jCurrentTimeMillis);
                StringBuilder sb5 = new StringBuilder(String.valueOf(1.7f).length() + 65);
                sb5.append("Device RAM is below the minimal requirement for this feature: ");
                sb5.append(1.7f);
                sb5.append(" GB");
                taskForException = Tasks.forException(new MlKitException(sb5.toString(), 18));
            } else {
                if (!f45115f) {
                    m.e(applicationContext, this.f45118b);
                    f45115f = true;
                }
                apkVersion = GoogleApiAvailabilityLight.getInstance().getApkVersion(applicationContext);
                StringBuilder sb6 = new StringBuilder(String.valueOf(apkVersion).length() + 11);
                sb6.append("gmsVersion=");
                sb6.append(apkVersion);
                b(sb6.toString());
                if (apkVersion < 233900000) {
                    a(zznt.GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, jElapsedRealtime, jCurrentTimeMillis);
                    taskForException = Tasks.forException(new MlKitException("Feature not available in the current version of the Google Play services", 14));
                } else {
                    if (new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_DOCUMENT").resolveActivity(applicationContext.getPackageManager()) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    StringBuilder sb7 = new StringBuilder(String.valueOf(z11).length() + 27);
                    sb7.append("isDocScanActivityAvailable=");
                    sb7.append(z11);
                    b(sb7.toString());
                    if (z11) {
                        taskForException = null;
                    } else {
                        a(zznt.GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, jElapsedRealtime, jCurrentTimeMillis);
                        taskForException = Tasks.forException(new MlKitException("Feature not available in the current version of the Google Play services", 14));
                    }
                }
            }
        }
        if (taskForException != null) {
            return taskForException;
        }
        a aVar = new a(this);
        Bundle bundle = new Bundle();
        bundle.putBinder("bundle_binder_extra_callbacks", aVar);
        Intent intentPutExtra = new Intent(activity, (Class<?>) GmsDocumentScanningDelegateActivity.class).putExtra("boolean_extra_request_uris_in_result_intent", true);
        yx.b bVar = this.f45117a;
        Intent intentPutExtra2 = intentPutExtra.putExtras(new Intent().putParcelableArrayListExtra("uri_array_extra_initial_image_uris", null).putExtra("int_extra_default_capture_mode", 1).putExtra("boolean_extra_flash_mode_change_allowed", true).putExtra("boolean_extra_gallery_import_allowed", bVar.a()).putExtra("boolean_extra_enable_gallery_import_auto_transform", true).putExtra("int_extra_page_limit_max", bVar.b()).putExtra("boolean_extra_page_edit_listener_enabled", false).putExtra("int_array_extra_result_formats", bVar.c()).putExtra("boolean_extra_enable_all_new_features_by_default", bVar.e()).putExtra("boolean_extra_filter_allowed", bVar.f()).putExtra("boolean_extra_shadow_removal_allowed", bVar.g()).putExtra("boolean_extra_stain_removal_allowed", bVar.h()).putExtra("boolean_extra_enable_compute_hash_for_gallery_image", false).putExtra("boolean_extra_enable_auto_enhancements", bVar.i()).putExtra("string_extra_camera_id", bVar.d())).setFlags(1).putExtra("bundle_binder_extra_callbacks", bundle);
        if (applicationContext.getPackageName().equals("com.google.android.gms")) {
            intentPutExtra2 = GmsDocumentScanningDelegateActivity.i(applicationContext, intentPutExtra2).setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.mlkit.docscan.ui.DocumentScanningActivity"));
        }
        int i11 = f45116g;
        f45116g = i11 + 1;
        PendingIntent pendingIntentZza = zzd.zza(activity, i11, intentPutExtra2, 67108864);
        if (pendingIntentZza != null) {
            return Tasks.forResult(pendingIntentZza.getIntentSender());
        }
        a(zznt.UNKNOWN_ERROR, jElapsedRealtime, jCurrentTimeMillis);
        return Tasks.forException(new MlKitException("Failed to create IntentSender", 13));
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return this.f45118b;
    }
}
