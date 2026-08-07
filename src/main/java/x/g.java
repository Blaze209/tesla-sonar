package x;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import c0.b0;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class g implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DynamicRangeProfiles f122451a;

    g(@NonNull Object obj) {
        this.f122451a = (DynamicRangeProfiles) obj;
    }

    private Long d(@NonNull b0 b0Var) {
        return c.a(b0Var, this.f122451a);
    }

    @NonNull
    private static Set<b0> e(@NonNull Set<Long> set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator<Long> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(f(it.next().longValue()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @NonNull
    private static b0 f(long j11) {
        return (b0) u5.h.h(c.b(j11), "Dynamic range profile cannot be converted to a DynamicRange object: " + j11);
    }

    @Override // x.f.a
    public DynamicRangeProfiles a() {
        return this.f122451a;
    }

    @Override // x.f.a
    @NonNull
    public Set<b0> b() {
        return e(this.f122451a.getSupportedProfiles());
    }

    @Override // x.f.a
    @NonNull
    public Set<b0> c(@NonNull b0 b0Var) {
        Long lD = d(b0Var);
        u5.h.b(lD != null, "DynamicRange is not supported: " + b0Var);
        return e(this.f122451a.getProfileCaptureRequestConstraints(lD.longValue()));
    }
}
