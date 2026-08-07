package sx;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.common.sdkinternal.i;
import vx.g;

/* JADX INFO: loaded from: classes5.dex */
public class c {
    @NonNull
    public static a a() {
        return ((g) i.c().a(g.class)).a();
    }

    @NonNull
    public static a b(@NonNull b bVar) {
        Preconditions.checkNotNull(bVar, "You must provide a valid BarcodeScannerOptions.");
        return ((g) i.c().a(g.class)).b(bVar);
    }
}
