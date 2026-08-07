package androidx.camera.extensions.internal.sessionprocessor;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements g {
    static m d(int i11, int i12, String str, @NonNull List<g> list, @NonNull Size size, int i13, int i14) {
        return new b(i11, i12, str, list, size, i13, i14);
    }

    static m e(int i11, @NonNull Size size, int i12, int i13) {
        return new b(i11, -1, null, Collections.EMPTY_LIST, size, i12, i13);
    }

    abstract int f();

    abstract int g();

    @NonNull
    abstract Size h();
}
