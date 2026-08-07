package androidx.camera.core.impl;

import android.content.Context;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public interface f0 {

    public interface a {
        @NonNull
        f0 a(@NonNull Context context, Object obj, @NonNull Set<String> set);
    }

    e3 a(int i11, @NonNull String str, int i12, @NonNull Size size);

    @NonNull
    Pair<Map<o3<?>, c3>, Map<androidx.camera.core.impl.a, c3>> b(int i11, @NonNull String str, @NonNull List<androidx.camera.core.impl.a> list, @NonNull Map<o3<?>, List<Size>> map, boolean z11, boolean z12);
}
