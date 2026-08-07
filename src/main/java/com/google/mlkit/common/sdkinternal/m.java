package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstall;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_common.zzaf;
import com.google.android.gms.internal.mlkit_common.zzah;
import com.google.android.gms.internal.mlkit_common.zzai;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public class m {
    private static final zzai A;
    private static final zzai B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature[] f45053a = new Feature[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45059g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45060h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45061i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45062j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45063k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45064l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45065m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45066n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45067o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45068p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45069q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45070r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45071s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45072t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45073u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45074v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45075w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45076x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45077y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    @KeepForSdk
    public static final Feature f45078z;

    static {
        Feature feature = new Feature("vision.barcode", 1L);
        f45054b = feature;
        Feature feature2 = new Feature("vision.custom.ica", 1L);
        f45055c = feature2;
        Feature feature3 = new Feature("vision.face", 1L);
        f45056d = feature3;
        Feature feature4 = new Feature("vision.ica", 1L);
        f45057e = feature4;
        Feature feature5 = new Feature("vision.ocr", 1L);
        f45058f = feature5;
        f45059g = new Feature("mlkit.ocr.chinese", 1L);
        f45060h = new Feature("mlkit.ocr.common", 1L);
        f45061i = new Feature("mlkit.ocr.devanagari", 1L);
        f45062j = new Feature("mlkit.ocr.japanese", 1L);
        f45063k = new Feature("mlkit.ocr.korean", 1L);
        Feature feature6 = new Feature("mlkit.langid", 1L);
        f45064l = feature6;
        Feature feature7 = new Feature("mlkit.nlclassifier", 1L);
        f45065m = feature7;
        Feature feature8 = new Feature("tflite_dynamite", 1L);
        f45066n = feature8;
        Feature feature9 = new Feature("mlkit.barcode.ui", 1L);
        f45067o = feature9;
        Feature feature10 = new Feature("mlkit.smartreply", 1L);
        f45068p = feature10;
        f45069q = new Feature("mlkit.image.caption", 1L);
        f45070r = new Feature("mlkit.docscan.detect", 1L);
        f45071s = new Feature("mlkit.docscan.crop", 1L);
        f45072t = new Feature("mlkit.docscan.enhance", 1L);
        f45073u = new Feature("mlkit.docscan.ui", 1L);
        f45074v = new Feature("mlkit.docscan.stain", 1L);
        f45075w = new Feature("mlkit.docscan.shadow", 1L);
        f45076x = new Feature("mlkit.quality.aesthetic", 1L);
        f45077y = new Feature("mlkit.quality.technical", 1L);
        f45078z = new Feature("mlkit.segmentation.subject", 1L);
        zzah zzahVar = new zzah();
        zzahVar.zza("barcode", feature);
        zzahVar.zza("custom_ica", feature2);
        zzahVar.zza("face", feature3);
        zzahVar.zza("ica", feature4);
        zzahVar.zza("ocr", feature5);
        zzahVar.zza("langid", feature6);
        zzahVar.zza("nlclassifier", feature7);
        zzahVar.zza("tflite_dynamite", feature8);
        zzahVar.zza("barcode_ui", feature9);
        zzahVar.zza("smart_reply", feature10);
        A = zzahVar.zzb();
        zzah zzahVar2 = new zzah();
        zzahVar2.zza("com.google.android.gms.vision.barcode", feature);
        zzahVar2.zza("com.google.android.gms.vision.custom.ica", feature2);
        zzahVar2.zza("com.google.android.gms.vision.face", feature3);
        zzahVar2.zza("com.google.android.gms.vision.ica", feature4);
        zzahVar2.zza("com.google.android.gms.vision.ocr", feature5);
        zzahVar2.zza("com.google.android.gms.mlkit.langid", feature6);
        zzahVar2.zza("com.google.android.gms.mlkit.nlclassifier", feature7);
        zzahVar2.zza("com.google.android.gms.tflite_dynamite", feature8);
        zzahVar2.zza("com.google.android.gms.mlkit_smartreply", feature10);
        B = zzahVar2.zzb();
    }

    @KeepForSdk
    @Deprecated
    public static boolean a(@NonNull Context context, @NonNull List<String> list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            return b(context, f(B, list));
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, it.next());
            }
            return true;
        } catch (DynamiteModule.LoadingException unused) {
            return false;
        }
    }

    @KeepForSdk
    public static boolean b(@NonNull Context context, @NonNull final Feature[] featureArr) {
        try {
            return ((ModuleAvailabilityResponse) Tasks.await(ModuleInstall.getClient(context).areModulesAvailable(new OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.d0
                @Override // com.google.android.gms.common.api.OptionalModuleApi
                public final Feature[] getOptionalFeatures() {
                    Feature[] featureArr2 = m.f45053a;
                    return featureArr;
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.common.sdkinternal.e0
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
                }
            }))).areModulesAvailable();
        } catch (InterruptedException | ExecutionException e11) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e11);
            return false;
        }
    }

    @KeepForSdk
    @Deprecated
    public static void c(@NonNull Context context, @NonNull String str) {
        d(context, zzaf.zzh(str));
    }

    @KeepForSdk
    @Deprecated
    public static void d(@NonNull Context context, @NonNull List<String> list) {
        if (GoogleApiAvailabilityLight.getInstance().getApkVersion(context) >= 221500000) {
            e(context, f(A, list));
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    @KeepForSdk
    public static void e(@NonNull Context context, @NonNull final Feature[] featureArr) {
        ModuleInstall.getClient(context).installModules(ModuleInstallRequest.newBuilder().addApi(new OptionalModuleApi() { // from class: com.google.mlkit.common.sdkinternal.b0
            @Override // com.google.android.gms.common.api.OptionalModuleApi
            public final Feature[] getOptionalFeatures() {
                Feature[] featureArr2 = m.f45053a;
                return featureArr;
            }
        }).build()).addOnFailureListener(new OnFailureListener() { // from class: com.google.mlkit.common.sdkinternal.c0
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
            }
        });
    }

    private static Feature[] f(Map map, List list) {
        Feature[] featureArr = new Feature[list.size()];
        for (int i11 = 0; i11 < list.size(); i11++) {
            featureArr[i11] = (Feature) Preconditions.checkNotNull((Feature) map.get(list.get(i11)));
        }
        return featureArr;
    }
}
