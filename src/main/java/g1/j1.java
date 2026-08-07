package g1;

import android.util.Range;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public class j1 implements o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o1 f66967a;

    public j1(@NonNull o1 o1Var) {
        u5.h.a(o1Var.g());
        this.f66967a = o1Var;
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> a(int i11) {
        return this.f66967a.d(i11);
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> c() {
        return this.f66967a.c();
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> d(int i11) {
        return this.f66967a.a(i11);
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> e() {
        return this.f66967a.f();
    }

    @Override // g1.o1
    @NonNull
    public Range<Integer> f() {
        return this.f66967a.e();
    }

    @Override // g1.o1
    public boolean g() {
        return this.f66967a.g();
    }

    @Override // g1.o1
    public int h() {
        return this.f66967a.j();
    }

    @Override // g1.o1
    public boolean i(int i11, int i12) {
        return this.f66967a.i(i12, i11);
    }

    @Override // g1.o1
    public int j() {
        return this.f66967a.h();
    }
}
