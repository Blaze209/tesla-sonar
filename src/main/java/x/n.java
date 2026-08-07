package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class n extends m {
    n(int i11, @NonNull Surface surface) {
        this(new OutputConfiguration(i11, surface));
    }

    static n m(@NonNull OutputConfiguration outputConfiguration) {
        return new n(outputConfiguration);
    }

    @Override // x.m, x.l, x.k, x.j.a
    public /* bridge */ /* synthetic */ String a() {
        return super.a();
    }

    @Override // x.l, x.o, x.j.a
    public /* bridge */ /* synthetic */ void b(@NonNull Surface surface) {
        super.b(surface);
    }

    @Override // x.l, x.k, x.j.a
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // x.o, x.j.a
    public void d(long j11) {
        if (j11 == -1) {
            return;
        }
        ((OutputConfiguration) h()).setStreamUseCase(j11);
    }

    @Override // x.m, x.l, x.k, x.j.a
    public void e(long j11) {
        ((OutputConfiguration) h()).setDynamicRangeProfile(j11);
    }

    @Override // x.o
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // x.m, x.l, x.k, x.j.a
    public /* bridge */ /* synthetic */ void f(String str) {
        super.f(str);
    }

    @Override // x.o, x.j.a
    public void g(int i11) {
        ((OutputConfiguration) h()).setMirrorMode(i11);
    }

    @Override // x.k, x.o, x.j.a
    public /* bridge */ /* synthetic */ Surface getSurface() {
        return super.getSurface();
    }

    @Override // x.m, x.l, x.k, x.j.a
    @NonNull
    public Object h() {
        u5.h.a(this.f122466a instanceof OutputConfiguration);
        return this.f122466a;
    }

    @Override // x.o
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    n(@NonNull Object obj) {
        super(obj);
    }
}
