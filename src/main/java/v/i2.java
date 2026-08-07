package v;

import android.content.Context;
import android.media.CamcorderProfile;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i2 implements androidx.camera.core.impl.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, u4> f117030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f117031b;

    class a implements f {
        a() {
        }

        @Override // v.f
        public CamcorderProfile a(int i11, int i12) {
            return CamcorderProfile.get(i11, i12);
        }

        @Override // v.f
        public boolean b(int i11, int i12) {
            return CamcorderProfile.hasProfile(i11, i12);
        }
    }

    public i2(@NonNull Context context, Object obj, @NonNull Set<String> set) {
        this(context, new a(), obj, set);
    }

    private void c(@NonNull Context context, @NonNull w.m0 m0Var, @NonNull Set<String> set) {
        u5.h.g(context);
        for (String str : set) {
            this.f117030a.put(str, new u4(context, str, m0Var, this.f117031b));
        }
    }

    @Override // androidx.camera.core.impl.f0
    public androidx.camera.core.impl.e3 a(int i11, @NonNull String str, int i12, @NonNull Size size) {
        u4 u4Var = this.f117030a.get(str);
        if (u4Var != null) {
            return u4Var.M(i11, i12, size);
        }
        return null;
    }

    @Override // androidx.camera.core.impl.f0
    @NonNull
    public Pair<Map<androidx.camera.core.impl.o3<?>, androidx.camera.core.impl.c3>, Map<androidx.camera.core.impl.a, androidx.camera.core.impl.c3>> b(int i11, @NonNull String str, @NonNull List<androidx.camera.core.impl.a> list, @NonNull Map<androidx.camera.core.impl.o3<?>, List<Size>> map, boolean z11, boolean z12) {
        u5.h.b(!map.isEmpty(), "No new use cases to be bound.");
        u4 u4Var = this.f117030a.get(str);
        if (u4Var != null) {
            return u4Var.A(i11, list, map, z11, z12);
        }
        throw new IllegalArgumentException("No such camera id in supported combination list: " + str);
    }

    i2(@NonNull Context context, @NonNull f fVar, Object obj, @NonNull Set<String> set) {
        this.f117030a = new HashMap();
        u5.h.g(fVar);
        this.f117031b = fVar;
        c(context, obj instanceof w.m0 ? (w.m0) obj : w.m0.a(context), set);
    }
}
