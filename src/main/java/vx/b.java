package vx;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzra;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrc;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzro;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzvz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwe;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzws;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final SparseArray f120067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SparseArray f120068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final AtomicReference f120069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"UseSparseArrays"})
    private static final Map f120070d;

    static {
        SparseArray sparseArray = new SparseArray();
        f120067a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f120068b = sparseArray2;
        f120069c = new AtomicReference();
        sparseArray.put(-1, zzrn.FORMAT_UNKNOWN);
        sparseArray.put(1, zzrn.FORMAT_CODE_128);
        sparseArray.put(2, zzrn.FORMAT_CODE_39);
        sparseArray.put(4, zzrn.FORMAT_CODE_93);
        sparseArray.put(8, zzrn.FORMAT_CODABAR);
        sparseArray.put(16, zzrn.FORMAT_DATA_MATRIX);
        sparseArray.put(32, zzrn.FORMAT_EAN_13);
        sparseArray.put(64, zzrn.FORMAT_EAN_8);
        sparseArray.put(128, zzrn.FORMAT_ITF);
        sparseArray.put(256, zzrn.FORMAT_QR_CODE);
        sparseArray.put(512, zzrn.FORMAT_UPC_A);
        sparseArray.put(1024, zzrn.FORMAT_UPC_E);
        sparseArray.put(2048, zzrn.FORMAT_PDF417);
        sparseArray.put(4096, zzrn.FORMAT_AZTEC);
        sparseArray2.put(0, zzro.TYPE_UNKNOWN);
        sparseArray2.put(1, zzro.TYPE_CONTACT_INFO);
        sparseArray2.put(2, zzro.TYPE_EMAIL);
        sparseArray2.put(3, zzro.TYPE_ISBN);
        sparseArray2.put(4, zzro.TYPE_PHONE);
        sparseArray2.put(5, zzro.TYPE_PRODUCT);
        sparseArray2.put(6, zzro.TYPE_SMS);
        sparseArray2.put(7, zzro.TYPE_TEXT);
        sparseArray2.put(8, zzro.TYPE_URL);
        sparseArray2.put(9, zzro.TYPE_WIFI);
        sparseArray2.put(10, zzro.TYPE_GEO);
        sparseArray2.put(11, zzro.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, zzro.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        f120070d = map;
        map.put(1, zzvw.CODE_128);
        map.put(2, zzvw.CODE_39);
        map.put(4, zzvw.CODE_93);
        map.put(8, zzvw.CODABAR);
        map.put(16, zzvw.DATA_MATRIX);
        map.put(32, zzvw.EAN_13);
        map.put(64, zzvw.EAN_8);
        map.put(128, zzvw.ITF);
        map.put(256, zzvw.QR_CODE);
        map.put(512, zzvw.UPC_A);
        map.put(1024, zzvw.UPC_E);
        map.put(2048, zzvw.PDF417);
        map.put(4096, zzvw.AZTEC);
    }

    public static zzrn a(int i11) {
        zzrn zzrnVar = (zzrn) f120067a.get(i11);
        return zzrnVar == null ? zzrn.FORMAT_UNKNOWN : zzrnVar;
    }

    public static zzro b(int i11) {
        zzro zzroVar = (zzro) f120068b.get(i11);
        return zzroVar == null ? zzro.TYPE_UNKNOWN : zzroVar;
    }

    public static zzvz c(sx.b bVar) {
        int iA = bVar.a();
        zzcp zzcpVar = new zzcp();
        if (iA == 0) {
            zzcpVar.zze(f120070d.values());
        } else {
            for (Map.Entry entry : f120070d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & iA) != 0) {
                    zzcpVar.zzd((zzvw) entry.getValue());
                }
            }
        }
        zzvx zzvxVar = new zzvx();
        zzvxVar.zzb(zzcpVar.zzf());
        return zzvxVar.zzc();
    }

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    static void e(zzwp zzwpVar, final zzrb zzrbVar) {
        zzwpVar.zzf(new zzwo() { // from class: vx.a
            @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwo
            public final zzwe zza() {
                zzrd zzrdVar = new zzrd();
                zzra zzraVar = b.f() ? zzra.TYPE_THICK : zzra.TYPE_THIN;
                zzrb zzrbVar2 = zzrbVar;
                zzrdVar.zze(zzraVar);
                zzrs zzrsVar = new zzrs();
                zzrsVar.zzb(zzrbVar2);
                zzrdVar.zzh(zzrsVar.zzc());
                return zzws.zzf(zzrdVar);
            }
        }, zzrc.ON_DEVICE_BARCODE_LOAD);
    }

    static boolean f() {
        AtomicReference atomicReference = f120069c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zB = o.b(com.google.mlkit.common.sdkinternal.i.c().b());
        atomicReference.set(Boolean.valueOf(zB));
        return zB;
    }
}
