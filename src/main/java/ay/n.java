package ay;

import android.content.Context;
import android.media.Image;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzf;
import com.google.android.gms.internal.mlkit_vision_face.zzh;
import com.google.android.gms.internal.mlkit_vision_face.zzj;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzl;
import com.google.android.gms.internal.mlkit_vision_face.zzm;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzp;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class n implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f15180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f15181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zx.e f15182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final zzoc f15184e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private zzj f15185f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zzj f15186g;

    n(Context context, zx.e eVar, zzoc zzocVar) {
        this.f15181b = context;
        this.f15182c = eVar;
        this.f15183d = GoogleApiAvailabilityLight.getInstance().getApkVersion(context);
        this.f15184e = zzocVar;
    }

    static int b(int i11) {
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Invalid classification type: " + i11);
    }

    static int c(int i11) {
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Invalid landmark type: " + i11);
    }

    private static int d(int i11) {
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Invalid mode type: " + i11);
    }

    private final List e(zzj zzjVar, wx.a aVar) throws MlKitException {
        zzf[] zzfVarArrZze;
        try {
            zzp zzpVar = new zzp(aVar.m(), aVar.i(), 0, SystemClock.elapsedRealtime(), xx.b.a(aVar.l()));
            if (aVar.h() != 35 || this.f15183d < 201500000) {
                zzfVarArrZze = zzjVar.zze(ObjectWrapper.wrap(xx.c.f().d(aVar, false)), zzpVar);
            } else {
                Image.Plane[] planeArr = (Image.Plane[]) Preconditions.checkNotNull(aVar.k());
                zzfVarArrZze = zzjVar.zzf(ObjectWrapper.wrap(planeArr[0].getBuffer()), ObjectWrapper.wrap(planeArr[1].getBuffer()), ObjectWrapper.wrap(planeArr[2].getBuffer()), planeArr[0].getPixelStride(), planeArr[1].getPixelStride(), planeArr[2].getPixelStride(), planeArr[0].getRowStride(), planeArr[1].getRowStride(), planeArr[2].getRowStride(), zzpVar);
            }
            ArrayList arrayList = new ArrayList();
            for (zzf zzfVar : zzfVarArrZze) {
                arrayList.add(new zx.a(zzfVar, aVar.g()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to detect with legacy face detector", 13, e11);
        }
    }

    @Override // ay.c
    public final Pair a(wx.a aVar) throws MlKitException {
        List listE;
        if (this.f15185f == null && this.f15186g == null) {
            zzd();
        }
        zzj zzjVar = this.f15185f;
        if (zzjVar == null && this.f15186g == null) {
            throw new MlKitException("Waiting for the face detection module to be downloaded. Please wait.", 14);
        }
        List listE2 = null;
        if (zzjVar != null) {
            listE = e(zzjVar, aVar);
            if (!this.f15182c.g()) {
                i.m(listE);
            }
        } else {
            listE = null;
        }
        zzj zzjVar2 = this.f15186g;
        if (zzjVar2 != null) {
            listE2 = e(zzjVar2, aVar);
            i.m(listE2);
        }
        return new Pair(listE, listE2);
    }

    @Override // ay.c
    public final void zzb() {
        zzj zzjVar = this.f15185f;
        if (zzjVar != null) {
            try {
                zzjVar.zzd();
            } catch (RemoteException e11) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e11);
            }
            this.f15185f = null;
        }
        zzj zzjVar2 = this.f15186g;
        if (zzjVar2 != null) {
            try {
                zzjVar2.zzd();
            } catch (RemoteException e12) {
                Log.e("LegacyFaceDelegate", "Failed to release legacy face detector.", e12);
            }
            this.f15186g = null;
        }
    }

    @Override // ay.c
    public final boolean zzd() throws MlKitException {
        if (this.f15185f != null || this.f15186g != null) {
            return false;
        }
        try {
            zzm zzmVarZza = zzl.zza(DynamiteModule.load(this.f15181b, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.dynamite").instantiate("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator"));
            IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(this.f15181b);
            if (this.f15182c.c() == 2) {
                if (this.f15186g == null) {
                    this.f15186g = zzmVarZza.zzd(iObjectWrapperWrap, new zzh(2, 2, 0, true, false, this.f15182c.a()));
                }
                if ((this.f15182c.d() == 2 || this.f15182c.b() == 2 || this.f15182c.e() == 2) && this.f15185f == null) {
                    this.f15185f = zzmVarZza.zzd(iObjectWrapperWrap, new zzh(d(this.f15182c.e()), c(this.f15182c.d()), b(this.f15182c.b()), false, this.f15182c.g(), this.f15182c.a()));
                }
            } else if (this.f15185f == null) {
                this.f15185f = zzmVarZza.zzd(iObjectWrapperWrap, new zzh(d(this.f15182c.e()), c(this.f15182c.d()), b(this.f15182c.b()), false, this.f15182c.g(), this.f15182c.a()));
            }
            if (this.f15185f == null && this.f15186g == null && !this.f15180a) {
                Log.d("LegacyFaceDelegate", "Request face optional module download.");
                com.google.mlkit.common.sdkinternal.m.c(this.f15181b, "barcode");
                this.f15180a = true;
            }
            k.c(this.f15184e, false, zzks.NO_ERROR);
            return false;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to create legacy face detector.", 13, e11);
        } catch (DynamiteModule.LoadingException e12) {
            throw new MlKitException("Failed to load deprecated vision dynamite module.", 13, e12);
        }
    }
}
