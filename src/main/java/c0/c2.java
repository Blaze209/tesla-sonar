package c0;

import android.util.Rational;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f18278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private Rational f18279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18281d;

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rational f18283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f18284c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f18282a = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f18285d = 0;

        public a(@NonNull Rational rational, int i11) {
            this.f18283b = rational;
            this.f18284c = i11;
        }

        @NonNull
        public c2 a() {
            u5.h.h(this.f18283b, "The crop aspect ratio must be set.");
            return new c2(this.f18282a, this.f18283b, this.f18284c, this.f18285d);
        }

        @NonNull
        public a b(int i11) {
            this.f18285d = i11;
            return this;
        }

        @NonNull
        public a c(int i11) {
            this.f18282a = i11;
            return this;
        }
    }

    c2(int i11, @NonNull Rational rational, int i12, int i13) {
        this.f18278a = i11;
        this.f18279b = rational;
        this.f18280c = i12;
        this.f18281d = i13;
    }

    @NonNull
    public Rational a() {
        return this.f18279b;
    }

    public int b() {
        return this.f18281d;
    }

    public int c() {
        return this.f18280c;
    }

    public int d() {
        return this.f18278a;
    }
}
