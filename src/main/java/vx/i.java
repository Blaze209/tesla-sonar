package vx;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_barcode.zzwp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxa;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends com.google.mlkit.common.sdkinternal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.i f120084a;

    public i(com.google.mlkit.common.sdkinternal.i iVar) {
        this.f120084a = iVar;
    }

    @Override // com.google.mlkit.common.sdkinternal.e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        sx.b bVar = (sx.b) obj;
        Context contextB = this.f120084a.b();
        zzwp zzwpVarZzb = zzxa.zzb(b.d());
        return new l(this.f120084a, bVar, (o.b(contextB) || GoogleApiAvailabilityLight.getInstance().getApkVersion(contextB) >= 204500000) ? new o(contextB, bVar, zzwpVarZzb) : new q(contextB, bVar, zzwpVarZzb), zzwpVarZzb);
    }
}
