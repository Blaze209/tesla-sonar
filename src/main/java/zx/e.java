package zx;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.mlkit_vision_face.zzv;
import com.google.android.gms.internal.mlkit_vision_face.zzw;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f129170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f129171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f129172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f129173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f129174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f129175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f129176g;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f129177a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f129178b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f129179c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f129180d = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f129181e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f129182f = 0.1f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Executor f129183g;

        @NonNull
        public e a() {
            return new e(this.f129177a, this.f129178b, this.f129179c, this.f129180d, this.f129181e, this.f129182f, this.f129183g, null);
        }

        @NonNull
        public a b(int i11) {
            this.f129179c = i11;
            return this;
        }

        @NonNull
        public a c(int i11) {
            this.f129178b = i11;
            return this;
        }

        @NonNull
        public a d(int i11) {
            this.f129177a = i11;
            return this;
        }

        @NonNull
        public a e(float f11) {
            this.f129182f = f11;
            return this;
        }

        @NonNull
        public a f(int i11) {
            this.f129180d = i11;
            return this;
        }
    }

    /* synthetic */ e(int i11, int i12, int i13, int i14, boolean z11, float f11, Executor executor, g gVar) {
        this.f129170a = i11;
        this.f129171b = i12;
        this.f129172c = i13;
        this.f129173d = i14;
        this.f129174e = z11;
        this.f129175f = f11;
        this.f129176g = executor;
    }

    public final float a() {
        return this.f129175f;
    }

    public final int b() {
        return this.f129172c;
    }

    public final int c() {
        return this.f129171b;
    }

    public final int d() {
        return this.f129170a;
    }

    public final int e() {
        return this.f129173d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.floatToIntBits(this.f129175f) == Float.floatToIntBits(eVar.f129175f) && Objects.equal(Integer.valueOf(this.f129170a), Integer.valueOf(eVar.f129170a)) && Objects.equal(Integer.valueOf(this.f129171b), Integer.valueOf(eVar.f129171b)) && Objects.equal(Integer.valueOf(this.f129173d), Integer.valueOf(eVar.f129173d)) && Objects.equal(Boolean.valueOf(this.f129174e), Boolean.valueOf(eVar.f129174e)) && Objects.equal(Integer.valueOf(this.f129172c), Integer.valueOf(eVar.f129172c)) && Objects.equal(this.f129176g, eVar.f129176g);
    }

    public final Executor f() {
        return this.f129176g;
    }

    public final boolean g() {
        return this.f129174e;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Float.floatToIntBits(this.f129175f)), Integer.valueOf(this.f129170a), Integer.valueOf(this.f129171b), Integer.valueOf(this.f129173d), Boolean.valueOf(this.f129174e), Integer.valueOf(this.f129172c), this.f129176g);
    }

    @NonNull
    public String toString() {
        zzv zzvVarZza = zzw.zza("FaceDetectorOptions");
        zzvVarZza.zzb("landmarkMode", this.f129170a);
        zzvVarZza.zzb("contourMode", this.f129171b);
        zzvVarZza.zzb("classificationMode", this.f129172c);
        zzvVarZza.zzb("performanceMode", this.f129173d);
        zzvVarZza.zzd("trackingEnabled", this.f129174e);
        zzvVarZza.zza("minFaceSize", this.f129175f);
        return zzvVarZza.toString();
    }
}
