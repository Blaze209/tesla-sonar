package com.google.android.gms.internal.mlkit_vision_face;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import java.util.HashMap;
import java.util.Map;
import rv.c;
import rv.e;
import sv.b;

/* JADX INFO: loaded from: classes5.dex */
public final class zzcy implements b {
    public static final /* synthetic */ int zza = 0;
    private static final c zzb = new c() { // from class: com.google.android.gms.internal.mlkit_vision_face.zzcx
        @Override // rv.c
        public final void encode(Object obj, Object obj2) {
            int i11 = zzcy.zza;
            throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    };
    private final Map zzc = new HashMap();
    private final Map zzd = new HashMap();
    private final c zze = zzb;

    @Override // sv.b
    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull c cVar) {
        this.zzc.put(cls, cVar);
        this.zzd.remove(cls);
        return this;
    }

    public final zzcz zza() {
        return new zzcz(new HashMap(this.zzc), new HashMap(this.zzd), this.zze);
    }

    @NonNull
    public final /* bridge */ /* synthetic */ b registerEncoder(@NonNull Class cls, @NonNull e eVar) {
        this.zzd.put(cls, eVar);
        this.zzc.remove(cls);
        return this;
    }
}
