package vx;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.internal.mlkit_vision_barcode.zzcs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzrb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyd;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyl;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyn;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyo;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyu;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class o implements m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final zzcs f120101h = zzcs.zzh("com.google.android.gms.vision.barcode", "com.google.android.gms.tflite_dynamite");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f120102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f120103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f120104c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f120105d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final sx.b f120106e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zzwp f120107f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zzyl f120108g;

    o(Context context, sx.b bVar, zzwp zzwpVar) {
        this.f120105d = context;
        this.f120106e = bVar;
        this.f120107f = zzwpVar;
    }

    static boolean b(Context context) {
        return DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) > 0;
    }

    @Override // vx.m
    public final List a(wx.a aVar) throws MlKitException {
        if (this.f120108g == null) {
            zzc();
        }
        zzyl zzylVar = (zzyl) Preconditions.checkNotNull(this.f120108g);
        if (!this.f120102a) {
            try {
                zzylVar.zze();
                this.f120102a = true;
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to init barcode scanner.", 13, e11);
            }
        }
        int iM = aVar.m();
        if (aVar.h() == 35) {
            iM = ((Image.Plane[]) Preconditions.checkNotNull(aVar.k()))[0].getRowStride();
        }
        try {
            List listZzd = zzylVar.zzd(xx.d.b().a(aVar), new zzyu(aVar.h(), iM, aVar.i(), xx.b.a(aVar.l()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new tx.a(new n((zzyb) it.next()), aVar.g()));
            }
            return arrayList;
        } catch (RemoteException e12) {
            throw new MlKitException("Failed to run barcode scanner.", 13, e12);
        }
    }

    final zzyl c(DynamiteModule.VersionPolicy versionPolicy, String str, String str2) {
        boolean z11;
        zzyo zzyoVarZza = zzyn.zza(DynamiteModule.load(this.f120105d, versionPolicy, str).instantiate(str2));
        sx.b bVar = this.f120106e;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(this.f120105d);
        int iA = bVar.a();
        if (bVar.d()) {
            z11 = true;
        } else {
            this.f120106e.b();
            z11 = false;
        }
        return zzyoVarZza.zzd(iObjectWrapperWrap, new zzyd(iA, z11));
    }

    @Override // vx.m
    public final void zzb() {
        zzyl zzylVar = this.f120108g;
        if (zzylVar != null) {
            try {
                zzylVar.zzf();
            } catch (RemoteException e11) {
                Log.e("DecoupledBarcodeScanner", "Failed to release barcode scanner.", e11);
            }
            this.f120108g = null;
            this.f120102a = false;
        }
    }

    @Override // vx.m
    public final boolean zzc() throws MlKitException {
        if (this.f120108g != null) {
            return this.f120103b;
        }
        if (b(this.f120105d)) {
            this.f120103b = true;
            try {
                this.f120108g = c(DynamiteModule.PREFER_LOCAL, ModuleDescriptor.MODULE_ID, "com.google.mlkit.vision.barcode.bundled.internal.ThickBarcodeScannerCreator");
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to create thick barcode scanner.", 13, e11);
            } catch (DynamiteModule.LoadingException e12) {
                throw new MlKitException("Failed to load the bundled barcode module.", 13, e12);
            }
        } else {
            this.f120103b = false;
            if (!com.google.mlkit.common.sdkinternal.m.a(this.f120105d, f120101h)) {
                if (!this.f120104c) {
                    com.google.mlkit.common.sdkinternal.m.d(this.f120105d, zzcs.zzh("barcode", "tflite_dynamite"));
                    this.f120104c = true;
                }
                b.e(this.f120107f, zzrb.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the barcode module to be downloaded. Please wait.", 14);
            }
            try {
                this.f120108g = c(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.barcode", "com.google.android.gms.vision.barcode.mlkit.BarcodeScannerCreator");
            } catch (RemoteException | DynamiteModule.LoadingException e13) {
                b.e(this.f120107f, zzrb.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin barcode scanner.", 13, e13);
            }
        }
        b.e(this.f120107f, zzrb.NO_ERROR);
        return this.f120103b;
    }
}
