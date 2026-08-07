package xm;

import com.facebook.imagepipeline.memory.BasePool;

/* JADX INFO: loaded from: classes3.dex */
public class u implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static u f123752a;

    private u() {
    }

    public static synchronized u h() {
        try {
            if (f123752a == null) {
                f123752a = new u();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f123752a;
    }

    @Override // xm.a0
    public void c() {
    }

    @Override // xm.a0
    public void d() {
    }

    @Override // xm.a0
    public void a(int i11) {
    }

    @Override // xm.a0
    public void b(int i11) {
    }

    @Override // xm.a0
    public void e(int i11) {
    }

    @Override // xm.a0
    public void f(int i11) {
    }

    @Override // xm.a0
    public void g(BasePool basePool) {
    }
}
