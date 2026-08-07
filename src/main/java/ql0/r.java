package ql0;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<o, Object> f105678a = new HashMap(3);

    r() {
    }

    @Override // ql0.q
    public <T> T a(@NonNull o<T> oVar) {
        return (T) this.f105678a.get(oVar);
    }

    @Override // ql0.q
    public <T> void b(@NonNull o<T> oVar, T t11) {
        if (t11 == null) {
            this.f105678a.remove(oVar);
        } else {
            this.f105678a.put(oVar, t11);
        }
    }
}
