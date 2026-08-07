package ey;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends com.google.mlkit.common.sdkinternal.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.i f63460a;

    public t(com.google.mlkit.common.sdkinternal.i iVar) {
        this.f63460a = iVar;
    }

    @Override // com.google.mlkit.common.sdkinternal.e
    protected final /* bridge */ /* synthetic */ Object create(Object obj) {
        dy.d dVar = (dy.d) obj;
        zzuc zzucVarZzb = zzun.zzb(dVar.d());
        Context contextB = this.f63460a.b();
        return new d(zzucVarZzb, (GoogleApiAvailabilityLight.getInstance().getApkVersion(contextB) >= 204700000 || dVar.f()) ? new h(contextB, dVar, zzucVarZzb) : new i(contextB), dVar);
    }
}
