package ey;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.mlkit_vision_text_common.zzun;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t f63458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.mlkit.common.sdkinternal.d f63459b;

    s(@NonNull t tVar, @NonNull com.google.mlkit.common.sdkinternal.d dVar) {
        this.f63458a = tVar;
        this.f63459b = dVar;
    }

    @NonNull
    public final dy.c a(@NonNull dy.d dVar) {
        return new r((d) this.f63458a.get(dVar), this.f63459b.a(dVar.c()), zzun.zzb(dVar.d()), dVar);
    }
}
