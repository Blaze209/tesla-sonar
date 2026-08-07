package qx;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f106193a = new HashMap();

    @KeepForSdk
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f106194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final yv.b f106195b;

        @KeepForSdk
        public <RemoteT extends b> a(@NonNull Class<RemoteT> cls, @NonNull yv.b<Object> bVar) {
            this.f106194a = cls;
            this.f106195b = bVar;
        }

        final yv.b a() {
            return this.f106195b;
        }

        final Class b() {
            return this.f106194a;
        }
    }

    @KeepForSdk
    public c(@NonNull Set<a> set) {
        for (a aVar : set) {
            this.f106193a.put(aVar.b(), aVar.a());
        }
    }
}
