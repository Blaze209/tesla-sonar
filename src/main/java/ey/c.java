package ey;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
@KeepForSdk
public final class c {
    @KeepForSdk
    public static boolean a(@NonNull AtomicReference<Boolean> atomicReference, @NonNull String str) {
        if (atomicReference.get() != null) {
            return atomicReference.get().booleanValue();
        }
        boolean z11 = DynamiteModule.getLocalVersion(com.google.mlkit.common.sdkinternal.i.c().b(), str) > 0;
        atomicReference.set(Boolean.valueOf(z11));
        return z11;
    }
}
