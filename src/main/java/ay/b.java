package ay;

import android.content.Context;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.internal.mlkit_vision_face.zzks;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzoq;
import com.google.android.gms.internal.mlkit_vision_face.zzou;
import com.google.android.gms.internal.mlkit_vision_face.zzow;
import com.google.android.gms.internal.mlkit_vision_face.zzoy;
import com.google.android.gms.internal.mlkit_vision_face.zzpa;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f15149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final zx.e f15150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f15151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f15152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final zzoc f15154f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private zzoy f15155g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private zzoy f15156h;

    b(Context context, zx.e eVar, zzoc zzocVar) {
        this.f15149a = context;
        this.f15150b = eVar;
        this.f15154f = zzocVar;
    }

    static boolean b(Context context) {
        return DynamiteModule.getLocalVersion(context, "com.google.mlkit.dynamite.face") > 0;
    }

    private final void d() {
        if (this.f15150b.c() != 2) {
            if (this.f15156h == null) {
                this.f15156h = e(new zzou(this.f15150b.e(), this.f15150b.d(), this.f15150b.b(), 1, this.f15150b.g(), this.f15150b.a()));
                return;
            }
            return;
        }
        if (this.f15155g == null) {
            this.f15155g = e(new zzou(this.f15150b.e(), 1, 1, 2, false, this.f15150b.a()));
        }
        if ((this.f15150b.d() == 2 || this.f15150b.b() == 2 || this.f15150b.e() == 2) && this.f15156h == null) {
            this.f15156h = e(new zzou(this.f15150b.e(), this.f15150b.d(), this.f15150b.b(), 1, this.f15150b.g(), this.f15150b.a()));
        }
    }

    private final zzoy e(zzou zzouVar) {
        return this.f15152d ? c(DynamiteModule.PREFER_LOCAL, "com.google.mlkit.dynamite.face", "com.google.mlkit.vision.face.bundled.internal.ThickFaceDetectorCreator", zzouVar) : c(DynamiteModule.PREFER_REMOTE, "com.google.android.gms.vision.face", "com.google.android.gms.vision.face.mlkit.FaceDetectorCreator", zzouVar);
    }

    private static List f(zzoy zzoyVar, wx.a aVar) throws MlKitException {
        if (aVar.h() == -1) {
            aVar = wx.a.b(xx.c.f().d(aVar, false), aVar.m(), aVar.i(), aVar.l(), 17);
        }
        try {
            List listZzd = zzoyVar.zzd(xx.d.b().a(aVar), new zzoq(aVar.h(), aVar.m(), aVar.i(), xx.b.a(aVar.l()), SystemClock.elapsedRealtime()));
            ArrayList arrayList = new ArrayList();
            Iterator it = listZzd.iterator();
            while (it.hasNext()) {
                arrayList.add(new zx.a((zzow) it.next(), aVar.g()));
            }
            return arrayList;
        } catch (RemoteException e11) {
            throw new MlKitException("Failed to run face detector.", 13, e11);
        }
    }

    @Override // ay.c
    public final Pair a(wx.a aVar) throws MlKitException {
        List listF;
        if (this.f15156h == null && this.f15155g == null) {
            zzd();
        }
        if (!this.f15151c) {
            try {
                zzoy zzoyVar = this.f15156h;
                if (zzoyVar != null) {
                    zzoyVar.zze();
                }
                zzoy zzoyVar2 = this.f15155g;
                if (zzoyVar2 != null) {
                    zzoyVar2.zze();
                }
                this.f15151c = true;
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to init face detector.", 13, e11);
            }
        }
        zzoy zzoyVar3 = this.f15156h;
        List listF2 = null;
        if (zzoyVar3 != null) {
            listF = f(zzoyVar3, aVar);
            if (!this.f15150b.g()) {
                i.m(listF);
            }
        } else {
            listF = null;
        }
        zzoy zzoyVar4 = this.f15155g;
        if (zzoyVar4 != null) {
            listF2 = f(zzoyVar4, aVar);
            i.m(listF2);
        }
        return new Pair(listF, listF2);
    }

    final zzoy c(DynamiteModule.VersionPolicy versionPolicy, String str, String str2, zzou zzouVar) {
        return zzpa.zza(DynamiteModule.load(this.f15149a, versionPolicy, str).instantiate(str2)).zzd(ObjectWrapper.wrap(this.f15149a), zzouVar);
    }

    @Override // ay.c
    public final void zzb() {
        try {
            zzoy zzoyVar = this.f15156h;
            if (zzoyVar != null) {
                zzoyVar.zzf();
                this.f15156h = null;
            }
            zzoy zzoyVar2 = this.f15155g;
            if (zzoyVar2 != null) {
                zzoyVar2.zzf();
                this.f15155g = null;
            }
        } catch (RemoteException e11) {
            Log.e("DecoupledFaceDelegate", "Failed to release face detector.", e11);
        }
        this.f15151c = false;
    }

    @Override // ay.c
    public final boolean zzd() throws MlKitException {
        if (this.f15156h != null || this.f15155g != null) {
            return this.f15152d;
        }
        if (DynamiteModule.getLocalVersion(this.f15149a, "com.google.mlkit.dynamite.face") > 0) {
            this.f15152d = true;
            try {
                d();
            } catch (RemoteException e11) {
                throw new MlKitException("Failed to create thick face detector.", 13, e11);
            } catch (DynamiteModule.LoadingException e12) {
                throw new MlKitException("Failed to load the bundled face module.", 13, e12);
            }
        } else {
            this.f15152d = false;
            try {
                d();
            } catch (RemoteException e13) {
                k.c(this.f15154f, this.f15152d, zzks.OPTIONAL_MODULE_INIT_ERROR);
                throw new MlKitException("Failed to create thin face detector.", 13, e13);
            } catch (DynamiteModule.LoadingException e14) {
                if (!this.f15153e) {
                    com.google.mlkit.common.sdkinternal.m.c(this.f15149a, "face");
                    this.f15153e = true;
                }
                k.c(this.f15154f, this.f15152d, zzks.OPTIONAL_MODULE_NOT_AVAILABLE);
                throw new MlKitException("Waiting for the face module to be downloaded. Please wait.", 14, e14);
            }
        }
        k.c(this.f15154f, this.f15152d, zzks.NO_ERROR);
        return this.f15152d;
    }
}
