package t0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.i0;
import androidx.camera.core.impl.m1;
import h0.s;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class p extends m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f112006b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f112007c;

    p(@NonNull i0 i0Var) {
        super(i0Var);
        this.f112006b = "virtual-" + i0Var.d() + "-" + UUID.randomUUID().toString();
    }

    void A(int i11) {
        this.f112007c = i11;
    }

    @Override // androidx.camera.core.impl.m1, androidx.camera.core.impl.i0
    @NonNull
    public String d() {
        return this.f112006b;
    }

    @Override // androidx.camera.core.impl.m1, c0.n
    public int i(int i11) {
        return s.w(super.i(i11) - this.f112007c);
    }

    @Override // androidx.camera.core.impl.m1, c0.n
    public int m() {
        return i(0);
    }
}
