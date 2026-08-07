package zx;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.i;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    @NonNull
    public static d a(@NonNull e eVar) {
        Preconditions.checkNotNull(eVar, "You must provide a valid FaceDetectorOptions.");
        return ((ay.d) i.c().a(ay.d.class)).a(eVar);
    }
}
