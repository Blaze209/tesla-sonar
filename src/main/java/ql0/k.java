package ql0;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
class k implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends sq0.r>, s> f105663a;

    static class a implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Class<? extends sq0.r>, s> f105664a = new HashMap(3);

        a() {
        }

        @Override // ql0.j.a
        @NonNull
        public <N extends sq0.r> j.a a(@NonNull Class<N> cls, s sVar) {
            if (sVar == null) {
                this.f105664a.remove(cls);
                return this;
            }
            this.f105664a.put(cls, sVar);
            return this;
        }

        @Override // ql0.j.a
        @NonNull
        public j build() {
            return new k(Collections.unmodifiableMap(this.f105664a));
        }
    }

    k(@NonNull Map<Class<? extends sq0.r>, s> map) {
        this.f105663a = map;
    }

    @Override // ql0.j
    public <N extends sq0.r> s a(@NonNull Class<N> cls) {
        return this.f105663a.get(cls);
    }
}
