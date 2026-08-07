package ay;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_face.zzoc;
import com.google.android.gms.internal.mlkit_vision_face.zzon;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends com.google.mlkit.common.sdkinternal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.i f15159a;

    public f(com.google.mlkit.common.sdkinternal.i iVar) {
        this.f15159a = iVar;
    }

    @Override // com.google.mlkit.common.sdkinternal.e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        zx.e eVar = (zx.e) obj;
        Context contextB = this.f15159a.b();
        zzoc zzocVarZzb = zzon.zzb(k.b());
        return new i(zzon.zzb(k.b()), eVar, (b.b(contextB) || GoogleApiAvailabilityLight.getInstance().getApkVersion(contextB) >= 204500000) ? new b(contextB, eVar, zzocVarZzb) : new n(contextB, eVar, zzocVarZzb));
    }
}
