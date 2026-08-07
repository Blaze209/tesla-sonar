package androidx.camera.extensions.internal.sessionprocessor;

import android.view.Surface;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class x implements g {
    static x d(int i11, int i12, String str, @NonNull List<g> list, @NonNull Surface surface) {
        return new d(i11, i12, str, list, surface);
    }

    static x e(int i11, @NonNull Surface surface) {
        return d(i11, -1, null, Collections.EMPTY_LIST, surface);
    }

    @NonNull
    abstract Surface f();
}
