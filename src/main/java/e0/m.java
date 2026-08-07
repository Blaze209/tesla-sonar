package e0;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<androidx.camera.core.impl.v0> f61345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0 f61346b;

    public m(@NonNull List<androidx.camera.core.impl.v0> list, @NonNull z0 z0Var) {
        this.f61345a = list;
        this.f61346b = z0Var;
    }

    @NonNull
    List<androidx.camera.core.impl.v0> a() {
        return this.f61345a;
    }

    boolean b() {
        return this.f61346b.isAborted();
    }
}
