package ay;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_face.zzkr;
import com.google.android.gms.internal.mlkit_vision_face.zzkt;
import com.google.android.gms.internal.mlkit_vision_face.zzku;
import com.google.android.gms.internal.mlkit_vision_face.zzlj;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzof;
import com.google.android.gms.internal.mlkit_vision_face.zzon;
import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class a extends xx.e<List<zx.a>> implements zx.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final zx.e f15147i = new zx.e.a().a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f15148h;

    /* JADX WARN: Illegal instructions before constructor call */
    /* synthetic */ a(i iVar, com.google.mlkit.common.sdkinternal.d dVar, zx.e eVar, e eVar2) {
        Executor executorA = dVar.a(eVar.f());
        zzoc zzocVarZzb = zzon.zzb(k.b());
        super(iVar, executorA);
        boolean zD = k.d();
        this.f15148h = zD;
        zzku zzkuVar = new zzku();
        zzkuVar.zze(zD ? zzkr.TYPE_THICK : zzkr.TYPE_THIN);
        zzlj zzljVar = new zzlj();
        zzljVar.zze(k.a(eVar));
        zzkuVar.zzg(zzljVar.zzi());
        zzocVarZzb.zzd(zzof.zzg(zzkuVar, 1), zzkt.ON_DEVICE_FACE_CREATE);
    }

    @Override // cy.a
    public final int getDetectorType() {
        return 2;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    @NonNull
    public final Feature[] getOptionalFeatures() {
        return this.f15148h ? com.google.mlkit.common.sdkinternal.m.f45053a : new Feature[]{com.google.mlkit.common.sdkinternal.m.f45056d};
    }

    @Override // zx.d
    @NonNull
    public final Task<List<zx.a>> process(@NonNull wx.a aVar) {
        return super.n(aVar);
    }
}
