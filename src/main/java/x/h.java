package x;

import android.hardware.camera2.params.DynamicRangeProfiles;
import androidx.annotation.NonNull;
import c0.b0;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class h implements f.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final f f122452a = new f(new h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<b0> f122453b = Collections.singleton(b0.f18255d);

    h() {
    }

    @Override // x.f.a
    public DynamicRangeProfiles a() {
        return null;
    }

    @Override // x.f.a
    @NonNull
    public Set<b0> b() {
        return f122453b;
    }

    @Override // x.f.a
    @NonNull
    public Set<b0> c(@NonNull b0 b0Var) {
        u5.h.b(b0.f18255d.equals(b0Var), "DynamicRange is not supported: " + b0Var);
        return f122453b;
    }
}
