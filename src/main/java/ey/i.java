package ey;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzd;
import com.google.android.gms.internal.mlkit_vision_text_common.zzh;
import com.google.android.gms.internal.mlkit_vision_text_common.zzj;
import com.google.android.gms.internal.mlkit_vision_text_common.zzp;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes5.dex */
final class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zzp f63448b = new zzp(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private zzh f63450d;

    i(Context context) {
        this.f63447a = context;
    }

    @Override // ey.q
    public final dy.a a(wx.a aVar) throws MlKitException {
        Bitmap bitmapE;
        int iA;
        if (this.f63450d == null) {
            zzb();
        }
        if (this.f63450d == null) {
            throw new MlKitException("Waiting for the text recognition module to be downloaded. Please wait.", 14);
        }
        if (aVar.h() == -1) {
            bitmapE = aVar.e();
            iA = xx.b.a(aVar.l());
        } else {
            bitmapE = xx.c.f().e(aVar);
            iA = 0;
        }
        int i11 = iA;
        try {
            return o.a(((zzh) Preconditions.checkNotNull(this.f63450d)).zze(ObjectWrapper.wrap(bitmapE), new zzd(aVar.m(), aVar.i(), 0, 0L, i11)), aVar.g());
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to run legacy text recognizer.", 13, e11);
        }
    }

    @Override // ey.q
    public final void zzb() throws MlKitException {
        if (this.f63450d != null) {
            return;
        }
        try {
            zzh zzhVarZzd = zzj.zza(DynamiteModule.load(this.f63447a, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.text.ChimeraNativeTextRecognizerCreator")).zzd(ObjectWrapper.wrap(this.f63447a), this.f63448b);
            this.f63450d = zzhVarZzd;
            if (zzhVarZzd != null || this.f63449c) {
                return;
            }
            Log.d("LegacyTextDelegate", "Request OCR optional module download.");
            com.google.mlkit.common.sdkinternal.m.c(this.f63447a, "ocr");
            this.f63449c = true;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to create legacy text recognizer.", 13, e11);
        } catch (DynamiteModule.LoadingException e12) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e12);
        }
    }

    @Override // ey.q
    public final void zzc() {
        zzh zzhVar = this.f63450d;
        if (zzhVar != null) {
            try {
                zzhVar.zzd();
            } catch (RemoteException e11) {
                Log.e("LegacyTextDelegate", "Failed to release legacy text recognizer.", e11);
            }
            this.f63450d = null;
        }
    }
}
