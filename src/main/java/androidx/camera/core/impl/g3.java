package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Pair;
import androidx.annotation.NonNull;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class g3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final g3 f3184b = new g3(new ArrayMap());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Map<String, Object> f3185a;

    protected g3(@NonNull Map<String, Object> map) {
        this.f3185a = map;
    }

    @NonNull
    public static g3 a(@NonNull Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new g3(arrayMap);
    }

    @NonNull
    public static g3 b() {
        return f3184b;
    }

    @NonNull
    public static g3 c(@NonNull g3 g3Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : g3Var.e()) {
            arrayMap.put(str, g3Var.d(str));
        }
        return new g3(arrayMap);
    }

    public Object d(@NonNull String str) {
        return this.f3185a.get(str);
    }

    @NonNull
    public Set<String> e() {
        return this.f3185a.keySet();
    }

    @NonNull
    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
