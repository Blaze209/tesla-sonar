package vx;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_barcode.zzah;
import com.google.android.gms.internal.mlkit_vision_barcode.zzaj;
import com.google.android.gms.internal.mlkit_vision_barcode.zzal;
import com.google.android.gms.internal.mlkit_vision_barcode.zzan;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class q implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f120110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f120111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zzah f120112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zzwp f120113d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private zzaj f120114e;

    q(Context context, sx.b bVar, zzwp zzwpVar) {
        zzah zzahVar = new zzah();
        this.f120112c = zzahVar;
        this.f120111b = context;
        zzahVar.zza = bVar.a();
        this.f120113d = zzwpVar;
    }

    @Override // vx.m
    public final List a(wx.a aVar) throws MlKitException {
        zzu[] zzuVarArrZzf;
        if (this.f120114e == null) {
            zzc();
        }
        zzaj zzajVar = this.f120114e;
        if (zzajVar == null) {
            throw new MlKitException("Error initializing the legacy barcode scanner.", 14);
        }
        zzaj zzajVar2 = (zzaj) Preconditions.checkNotNull(zzajVar);
        zzan zzanVar = new zzan(aVar.m(), aVar.i(), 0, 0L, xx.b.a(aVar.l()));
        try {
            int iH = aVar.h();
            if (iH == -1) {
                zzuVarArrZzf = zzajVar2.zzf(ObjectWrapper.wrap(aVar.e()), zzanVar);
            } else if (iH == 17) {
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(aVar.f()), zzanVar);
            } else if (iH == 35) {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(aVar.k());
                zzanVar.zza = planeArr[0].getRowStride();
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(planeArr[0].getBuffer()), zzanVar);
            } else {
                if (iH != 842094169) {
                    throw new MlKitException("Unsupported image format: " + aVar.h(), 3);
                }
                zzuVarArrZzf = zzajVar2.zze(ObjectWrapper.wrap(xx.c.f().d(aVar, false)), zzanVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzu zzuVar : zzuVarArrZzf) {
                arrayList.add(new tx.a(new p(zzuVar), aVar.g()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to detect with legacy barcode detector", 13, e11);
        }
    }

    @Override // vx.m
    public final void zzb() {
        zzaj zzajVar = this.f120114e;
        if (zzajVar != null) {
            try {
                zzajVar.zzd();
            } catch (RemoteException e11) {
                Log.e("LegacyBarcodeScanner", "Failed to release legacy barcode detector.", e11);
            }
            this.f120114e = null;
        }
    }

    @Override // vx.m
    public final boolean zzc() throws MlKitException {
        if (this.f120114e != null) {
            return false;
        }
        try {
            zzaj zzajVarZzd = zzal.zza(DynamiteModule.load(this.f120111b, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator")).zzd(ObjectWrapper.wrap(this.f120111b), this.f120112c);
            this.f120114e = zzajVarZzd;
            if (zzajVarZzd == null && !this.f120110a) {
                Log.d("LegacyBarcodeScanner", "Request optional module download.");
                com.google.mlkit.common.sdkinternal.m.c(this.f120111b, "barcode");
                this.f120110a = true;
                b.e(this.f120113d, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            b.e(this.f120113d, zzrb.NO_ERROR);
            return false;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to create legacy barcode detector.", 13, e11);
        } catch (DynamiteModule.LoadingException e12) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e12);
        }
    }
}
