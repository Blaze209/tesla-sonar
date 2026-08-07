package androidx.core.view;

import android.view.WindowInsetsAnimationController;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f7797a;

    private static class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WindowInsetsAnimationController f7798a;

        a(WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f7798a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.f1.b
        void a(boolean z11) {
            this.f7798a.finish(z11);
        }

        @Override // androidx.core.view.f1.b
        public float b() {
            return this.f7798a.getCurrentFraction();
        }

        @Override // androidx.core.view.f1.b
        public k5.e c() {
            return k5.e.f(this.f7798a.getCurrentInsets());
        }

        @Override // androidx.core.view.f1.b
        public k5.e d() {
            return k5.e.f(this.f7798a.getHiddenStateInsets());
        }

        @Override // androidx.core.view.f1.b
        public k5.e e() {
            return k5.e.f(this.f7798a.getShownStateInsets());
        }

        @Override // androidx.core.view.f1.b
        public void f(k5.e eVar, float f11, float f12) {
            this.f7798a.setInsetsAndAlpha(eVar == null ? null : eVar.g(), f11, f12);
        }
    }

    private static class b {
        b() {
        }

        void a(boolean z11) {
            throw null;
        }

        public float b() {
            throw null;
        }

        public k5.e c() {
            throw null;
        }

        public k5.e d() {
            throw null;
        }

        public k5.e e() {
            throw null;
        }

        public void f(k5.e eVar, float f11, float f12) {
            throw null;
        }
    }

    f1(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f7797a = new a(windowInsetsAnimationController);
    }

    public void a(boolean z11) {
        this.f7797a.a(z11);
    }

    public float b() {
        return this.f7797a.b();
    }

    public k5.e c() {
        return this.f7797a.c();
    }

    public k5.e d() {
        return this.f7797a.d();
    }

    public k5.e e() {
        return this.f7797a.e();
    }

    public void f(k5.e eVar, float f11, float f12) {
        this.f7797a.f(eVar, f11, f12);
    }
}
