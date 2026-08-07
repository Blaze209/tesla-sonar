package pj;

import android.util.Log;
import androidx.annotation.NonNull;
import dj.k;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class d implements k<c> {
    @Override // dj.k
    @NonNull
    public dj.c a(@NonNull dj.h hVar) {
        return dj.c.SOURCE;
    }

    @Override // dj.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull fj.c<c> cVar, @NonNull File file, @NonNull dj.h hVar) throws Throwable {
        try {
            xj.a.f(cVar.get().c(), file);
            return true;
        } catch (IOException e11) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e11);
            return false;
        }
    }
}
