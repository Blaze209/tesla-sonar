package com.google.mlkit.vision.documentscanner.internal;

import android.content.Intent;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmw;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmx;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmy;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzmz;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzu;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class f {
    static zzmz a(yx.b bVar) {
        zzmw zzmwVar = new zzmw();
        zzmwVar.zzb(c(1));
        Boolean bool = Boolean.TRUE;
        zzmwVar.zzc(bool);
        zzmwVar.zzd(Boolean.valueOf(bVar.a()));
        zzmwVar.zzl(Integer.valueOf(bVar.b()));
        zzmwVar.zzk(Boolean.valueOf(bVar.e()));
        zzmwVar.zzm(bool);
        zzmwVar.zzf(Boolean.valueOf(bVar.f()));
        zzmwVar.zzi(Boolean.valueOf(bVar.g()));
        zzmwVar.zzj(Boolean.valueOf(bVar.h()));
        zzmwVar.zzn(Boolean.FALSE);
        zzmwVar.zzo(Boolean.valueOf(bVar.i()));
        zzu zzuVar = new zzu();
        for (int i11 : bVar.c()) {
            zzuVar.zza(d(i11));
        }
        zzmwVar.zzg(zzuVar.zzb());
        zzmwVar.zzh(Boolean.FALSE);
        return zzmwVar.zzp();
    }

    static zzmz b(Intent intent) {
        zzmw zzmwVar = new zzmw();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("uri_array_extra_initial_image_uris");
        if (parcelableArrayListExtra != null) {
            zzmwVar.zza(Integer.valueOf(parcelableArrayListExtra.size()));
        }
        zzmwVar.zzb(c(intent.getIntExtra("int_extra_default_capture_mode", -1)));
        zzmwVar.zzc(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_flash_mode_change_allowed", false)));
        zzmwVar.zzd(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_gallery_import_allowed", false)));
        zzmwVar.zzm(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_enable_gallery_import_auto_transform", false)));
        zzmwVar.zze(Boolean.valueOf(intent.getIntExtra("int_extra_page_limit_max", -1) != 1));
        zzmwVar.zzl(Integer.valueOf(intent.getIntExtra("int_extra_page_limit_max", -1)));
        zzmwVar.zzk(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_enable_all_new_features_by_default", false)));
        zzmwVar.zzf(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_filter_allowed", false)));
        zzmwVar.zzi(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_shadow_removal_allowed", false)));
        zzmwVar.zzj(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_stain_removal_allowed", false)));
        zzmwVar.zzn(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_enable_compute_hash_for_gallery_image", false)));
        zzmwVar.zzo(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_enable_auto_enhancements", false)));
        zzu zzuVar = new zzu();
        int[] intArrayExtra = intent.getIntArrayExtra("int_array_extra_result_formats");
        if (intArrayExtra != null) {
            for (int i11 : intArrayExtra) {
                zzuVar.zza(d(i11));
            }
        }
        zzmwVar.zzg(zzuVar.zzb());
        zzmwVar.zzh(Boolean.valueOf(intent.getBooleanExtra("boolean_extra_page_edit_listener_enabled", false)));
        return zzmwVar.zzp();
    }

    private static zzmx c(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? zzmx.MODE_UNKNOWN : zzmx.MODE_MANUAL;
        }
        return zzmx.MODE_AUTO;
    }

    private static zzmy d(int i11) {
        if (i11 != 101) {
            return i11 != 102 ? zzmy.FORMAT_UNKNOWN : zzmy.FORMAT_PDF;
        }
        return zzmy.FORMAT_JPEG;
    }
}
