package ft;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public interface d extends ft.c.a {

    public static class b implements TypeEvaluator<e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final TypeEvaluator<e> f66567b = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f66568a = new e();

        @Override // android.animation.TypeEvaluator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f11, @NonNull e eVar, @NonNull e eVar2) {
            this.f66568a.b(mt.a.d(eVar.f66571a, eVar2.f66571a, f11), mt.a.d(eVar.f66572b, eVar2.f66572b, f11), mt.a.d(eVar.f66573c, eVar2.f66573c, f11));
            return this.f66568a;
        }
    }

    public static class c extends Property<d, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<d, e> f66569a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(@NonNull d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* JADX INFO: renamed from: ft.d$d, reason: collision with other inner class name */
    public static class C1354d extends Property<d, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<d, Integer> f66570a = new C1354d("circularRevealScrimColor");

        private C1354d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(@NonNull d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(@NonNull d dVar, @NonNull Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f66571a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f66572b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f66573c;

        public boolean a() {
            return this.f66573c == Float.MAX_VALUE;
        }

        public void b(float f11, float f12, float f13) {
            this.f66571a = f11;
            this.f66572b = f12;
            this.f66573c = f13;
        }

        public void c(@NonNull e eVar) {
            b(eVar.f66571a, eVar.f66572b, eVar.f66573c);
        }

        private e() {
        }

        public e(float f11, float f12, float f13) {
            this.f66571a = f11;
            this.f66572b = f12;
            this.f66573c = f13;
        }

        public e(@NonNull e eVar) {
            this(eVar.f66571a, eVar.f66572b, eVar.f66573c);
        }
    }

    void a();

    void d();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i11);

    void setRevealInfo(e eVar);
}
