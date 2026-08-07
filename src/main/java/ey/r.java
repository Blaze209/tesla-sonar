package ey;

import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.internal.mlkit_vision_text_common.zzot;
import com.google.android.gms.internal.mlkit_vision_text_common.zzov;
import com.google.android.gms.internal.mlkit_vision_text_common.zzow;
import com.google.android.gms.internal.mlkit_vision_text_common.zzrx;
import com.google.android.gms.internal.mlkit_vision_text_common.zzsa;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuc;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuf;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public final class r extends xx.e implements dy.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final dy.d f63457h;

    r(@NonNull d dVar, @NonNull Executor executor, @NonNull zzuc zzucVar, @NonNull dy.d dVar2) {
        super(dVar, executor);
        this.f63457h = dVar2;
        zzow zzowVar = new zzow();
        zzowVar.zze(dVar2.f() ? zzot.TYPE_THICK : zzot.TYPE_THIN);
        zzrx zzrxVar = new zzrx();
        zzsa zzsaVar = new zzsa();
        zzsaVar.zza(a.a(dVar2.h()));
        zzrxVar.zze(zzsaVar.zzc());
        zzowVar.zzh(zzrxVar.zzf());
        zzucVar.zzd(zzuf.zzg(zzowVar, 1), zzov.ON_DEVICE_TEXT_CREATE);
    }

    @Override // cy.a
    public final int getDetectorType() {
        return 4;
    }

    @Override // com.google.android.gms.common.api.OptionalModuleApi
    public final Feature[] getOptionalFeatures() {
        return b.a(this.f63457h);
    }

    @Override // dy.c
    @NonNull
    public final Task<dy.a> process(@NonNull wx.a aVar) {
        return super.n(aVar);
    }
}
