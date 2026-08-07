package c0;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f18473d = new b().b(1.0f).c(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED).d(1.0f, 1.0f).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f18474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u5.d<Float, Float> f18475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final u5.d<Float, Float> f18476c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f18477a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private u5.d<Float, Float> f18478b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u5.d<Float, Float> f18479c;

        public b() {
            Float fValueOf = Float.valueOf(1.0f);
            this.f18477a = 1.0f;
            Float fValueOf2 = Float.valueOf(BitmapDescriptorFactory.HUE_RED);
            this.f18478b = u5.d.a(fValueOf2, fValueOf2);
            this.f18479c = u5.d.a(fValueOf, fValueOf);
        }

        @NonNull
        public z a() {
            return new z(this.f18477a, this.f18478b, this.f18479c);
        }

        @NonNull
        public b b(float f11) {
            this.f18477a = f11;
            return this;
        }

        @NonNull
        public b c(float f11, float f12) {
            this.f18478b = u5.d.a(Float.valueOf(f11), Float.valueOf(f12));
            return this;
        }

        @NonNull
        public b d(float f11, float f12) {
            this.f18479c = u5.d.a(Float.valueOf(f11), Float.valueOf(f12));
            return this;
        }
    }

    public float a() {
        return this.f18474a;
    }

    @NonNull
    public u5.d<Float, Float> b() {
        return this.f18475b;
    }

    @NonNull
    public u5.d<Float, Float> c() {
        return this.f18476c;
    }

    private z(float f11, u5.d<Float, Float> dVar, u5.d<Float, Float> dVar2) {
        this.f18474a = f11;
        this.f18475b = dVar;
        this.f18476c = dVar2;
    }
}
