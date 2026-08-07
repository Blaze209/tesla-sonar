package ey;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_text_common.zzou;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuq;
import com.google.android.gms.internal.mlkit_vision_text_common.zzut;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuv;
import com.google.android.gms.internal.mlkit_vision_text_common.zzux;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuy;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvh;
import com.google.mlkit.common.MlKitException;

/* JADX INFO: loaded from: classes5.dex */
final class h implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final dy.d f63442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f63443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f63444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zzuc f63445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zzuv f63446f;

    h(Context context, dy.d dVar, zzuc zzucVar) {
        this.f63441a = context;
        this.f63442b = dVar;
        this.f63445e = zzucVar;
    }

    private static zzvh b(dy.d dVar, String str) {
        int i11 = 1;
        boolean z11 = (dVar instanceof g) && ((g) dVar).zza();
        String strE = dVar.e();
        String strI = dVar.i();
        switch (dVar.h()) {
            case 1:
                i11 = 2;
                break;
            case 2:
                i11 = 3;
                break;
            case 3:
                i11 = 4;
                break;
            case 4:
                i11 = 5;
                break;
            case 5:
                i11 = 6;
                break;
            case 6:
                i11 = 7;
                break;
            case 7:
                i11 = 8;
                break;
            case 8:
                i11 = 9;
                break;
        }
        return new zzvh(strE, strI, str, true, i11 - 1, dVar.g(), z11);
    }

    @Override // ey.q
    public final dy.a a(wx.a aVar) throws MlKitException {
        if (this.f63446f == null) {
            zzb();
        }
        zzuv zzuvVar = (zzuv) Preconditions.checkNotNull(this.f63446f);
        if (!this.f63443c) {
            try {
                zzuvVar.zze();
                this.f63443c = true;
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to init text recognizer ".concat(String.valueOf(this.f63442b.d())), 13, e11);
            }
        }
        try {
            return new dy.a(zzuvVar.zzd(xx.d.b().a(aVar), new zzuq(aVar.h(), aVar.m(), aVar.i(), xx.b.a(aVar.l()), SystemClock.elapsedRealtime())), aVar.g());
        } catch (RemoteException e12) {
            throw new MlKitException("Failed to run text recognizer ".concat(String.valueOf(this.f63442b.d())), 13, e12);
        }
    }

    @Override // ey.q
    public final void zzb() throws MlKitException {
        zzuv zzuvVarZzd;
        if (this.f63446f != null) {
            return;
        }
        try {
            dy.d dVar = this.f63442b;
            boolean z11 = dVar instanceof f;
            String strZza = z11 ? ((f) dVar).zza() : null;
            if (this.f63442b.f()) {
                Log.d("DecoupledTextDelegate", "Start loading thick OCR module.");
                zzuvVarZzd = zzux.zza(DynamiteModule.load(this.f63441a, DynamiteModule.PREFER_LOCAL, this.f63442b.k()).instantiate("com.google.mlkit.vision.text.bundled.common.BundledTextRecognizerCreator")).zze(ObjectWrapper.wrap(this.f63441a), b(this.f63442b, strZza));
            } else if (z11) {
                Log.d("DecoupledTextDelegate", "Start loading custom OCR module.");
                zzuvVarZzd = zzut.zza(DynamiteModule.load(this.f63441a, DynamiteModule.PREFER_REMOTE, this.f63442b.k()).instantiate("com.google.android.gms.vision.text.mlkit.CommonTextRecognizerCreator")).zzd(ObjectWrapper.wrap(this.f63441a), null, b(this.f63442b, strZza));
            } else {
                Log.d("DecoupledTextDelegate", "Start loading thin OCR module.");
                zzuy zzuyVarZza = zzux.zza(DynamiteModule.load(this.f63441a, DynamiteModule.PREFER_REMOTE, this.f63442b.k()).instantiate("com.google.android.gms.vision.text.mlkit.TextRecognizerCreator"));
                zzuvVarZzd = this.f63442b.h() == 1 ? zzuyVarZza.zzd(ObjectWrapper.wrap(this.f63441a)) : zzuyVarZza.zze(ObjectWrapper.wrap(this.f63441a), b(this.f63442b, strZza));
            }
            this.f63446f = zzuvVarZzd;
            a.b(this.f63445e, this.f63442b.f(), zzou.NO_ERROR);
        } catch (RemoteException e11) {
            a.b(this.f63445e, this.f63442b.f(), zzou.OPTIONAL_MODULE_INIT_ERROR);
            throw new MlKitException("Failed to create text recognizer ".concat(String.valueOf(this.f63442b.d())), 13, e11);
        } catch (DynamiteModule.LoadingException e12) {
            a.b(this.f63445e, this.f63442b.f(), zzou.OPTIONAL_MODULE_NOT_AVAILABLE);
            if (this.f63442b.f()) {
                throw new MlKitException(String.format("Failed to load text module %s. %s", this.f63442b.d(), e12.getMessage()), 13, e12);
            }
            if (!this.f63444d) {
                com.google.mlkit.common.sdkinternal.m.e(this.f63441a, b.a(this.f63442b));
                this.f63444d = true;
            }
            throw new MlKitException("Waiting for the text optional module to be downloaded. Please wait.", 14);
        }
    }

    @Override // ey.q
    public final void zzc() {
        zzuv zzuvVar = this.f63446f;
        if (zzuvVar != null) {
            try {
                zzuvVar.zzf();
            } catch (RemoteException e11) {
                Log.e("DecoupledTextDelegate", "Failed to release text recognizer ".concat(String.valueOf(this.f63442b.d())), e11);
            }
            this.f63446f = null;
        }
        this.f63443c = false;
    }
}
