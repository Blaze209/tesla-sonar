package com.google.mlkit.vision.documentscanner.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.p002activity.ComponentActivity;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.contract.ActivityResultContracts$StartActivityForResult;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmz;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznt;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznu;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zznv;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzpc;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zztp;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zztr;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzts;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zztz;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class GmsDocumentScanningDelegateActivity extends ComponentActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zztp f45110f = zztz.zza("play-services-mlkit-document-scanner");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zztr f45111g = zztr.zza(com.google.mlkit.common.sdkinternal.i.c().b());

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private zzmz f45112h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f45113i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f45114j;

    static Intent i(Context context, Intent intent) {
        Intent action = new Intent().setPackage("com.google.android.gms").setAction("com.google.android.gms.mlkit.ACTION_SCAN_DOCUMENT");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i11 = applicationInfo.labelRes;
        return action.putExtra("string_extra_calling_app_name", i11 != 0 ? context.getString(i11) : context.getPackageManager().getApplicationLabel(applicationInfo).toString()).putExtras(intent).setFlags(1);
    }

    private final void l() throws Throwable {
        setResult(0);
        m(zznt.CANCELLED, 0);
        finish();
    }

    private final void m(zznt zzntVar, int i11) throws Throwable {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        zznv zznvVar = new zznv();
        zzpc zzpcVar = new zzpc();
        zzpcVar.zza(Long.valueOf(jElapsedRealtime - this.f45113i));
        zzpcVar.zzb(zzntVar);
        zzpcVar.zzc(this.f45112h);
        zzpcVar.zzd(Integer.valueOf(i11));
        zznvVar.zzd(zzpcVar.zze());
        this.f45110f.zza(zzts.zze(zznvVar), zznu.ON_DEVICE_DOCUMENT_SCANNER_UI_FINISH);
        this.f45111g.zzb(24335, zzntVar.zza(), this.f45114j, jCurrentTimeMillis);
    }

    final /* synthetic */ void j(yx.d dVar) throws Throwable {
        int iA;
        if (dVar == null) {
            l();
            return;
        }
        Intent intent = new Intent();
        intent.putExtra("extra_scanning_result", dVar);
        setResult(-1, intent);
        List<yx.d.a> listB = dVar.b();
        yx.d.b bVarC = dVar.c();
        if (listB != null) {
            iA = listB.size();
        } else {
            iA = bVarC != null ? bVarC.a() : 0;
        }
        m(zznt.NO_ERROR, iA);
        finish();
    }

    final /* synthetic */ void k(Exception exc) throws Throwable {
        if (Log.isLoggable("GmsDocScanDelAct", 6)) {
            Log.e("GmsDocScanDelAct", "Failed to handle scanning result", exc);
        }
        l();
    }

    @Override // androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        this.f45112h = f.b(getIntent());
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.google.mlkit.vision.documentscanner.internal.e
            @Override // androidx.p002activity.result.ActivityResultCallback
            public final /* synthetic */ void onActivityResult(Object obj) {
                h.a aVar = (h.a) obj;
                final GmsDocumentScanningDelegateActivity gmsDocumentScanningDelegateActivity = this.f45124a;
                h.a(gmsDocumentScanningDelegateActivity.getApplicationContext()).b(aVar.getCom.adyen.checkout.components.core.internal.data.model.StatusResponse.RESULT_CODE java.lang.String(), aVar.getData()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.mlkit.vision.documentscanner.internal.c
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final /* synthetic */ void onSuccess(Object obj2) throws Throwable {
                        gmsDocumentScanningDelegateActivity.j((yx.d) obj2);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.vision.documentscanner.internal.d
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final /* synthetic */ void onFailure(Exception exc) throws Throwable {
                        gmsDocumentScanningDelegateActivity.k(exc);
                    }
                });
            }
        });
        if (bundle != null) {
            this.f45113i = bundle.getLong("elapsedStartTimeMsKey");
            this.f45114j = bundle.getLong("epochStartTimeMsKey");
            return;
        }
        this.f45113i = SystemClock.elapsedRealtime();
        this.f45114j = System.currentTimeMillis();
        zztp zztpVar = this.f45110f;
        zznv zznvVar = new zznv();
        zzpc zzpcVar = new zzpc();
        zzpcVar.zzc(this.f45112h);
        zznvVar.zzc(zzpcVar.zze());
        zztpVar.zza(zzts.zze(zznvVar), zznu.ON_DEVICE_DOCUMENT_SCANNER_UI_START);
        activityResultLauncherRegisterForActivityResult.b(i(this, getIntent()));
    }

    @Override // androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("elapsedStartTimeMsKey", this.f45113i);
        bundle.putLong("epochStartTimeMsKey", this.f45114j);
    }
}
