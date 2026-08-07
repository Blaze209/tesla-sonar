package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f2 extends g3 {
    private f2(Map<String, Object> map) {
        super(map);
    }

    @NonNull
    public static f2 g() {
        return new f2(new ArrayMap());
    }

    @NonNull
    public static f2 h(@NonNull g3 g3Var) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : g3Var.e()) {
            arrayMap.put(str, g3Var.d(str));
        }
        return new f2(arrayMap);
    }

    public void f(@NonNull g3 g3Var) {
        Map<String, Object> map;
        Map<String, Object> map2 = this.f3185a;
        if (map2 == null || (map = g3Var.f3185a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void i(@NonNull String str, @NonNull Object obj) {
        this.f3185a.put(str, obj);
    }
}
