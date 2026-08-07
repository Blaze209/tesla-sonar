package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class k extends x2.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DeferrableSurface f3200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<DeferrableSurface> f3201b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f3202c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3203d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3204e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0.b0 f3205f;

    static final class b extends x2.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private DeferrableSurface f3206a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<DeferrableSurface> f3207b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f3208c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f3209d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f3210e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c0.b0 f3211f;

        b() {
        }

        @Override // androidx.camera.core.impl.x2.f.a
        public x2.f a() {
            String str = "";
            if (this.f3206a == null) {
                str = " surface";
            }
            if (this.f3207b == null) {
                str = str + " sharedSurfaces";
            }
            if (this.f3209d == null) {
                str = str + " mirrorMode";
            }
            if (this.f3210e == null) {
                str = str + " surfaceGroupId";
            }
            if (this.f3211f == null) {
                str = str + " dynamicRange";
            }
            if (str.isEmpty()) {
                return new k(this.f3206a, this.f3207b, this.f3208c, this.f3209d.intValue(), this.f3210e.intValue(), this.f3211f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.x2.f.a
        public x2.f.a b(c0.b0 b0Var) {
            if (b0Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f3211f = b0Var;
            return this;
        }

        @Override // androidx.camera.core.impl.x2.f.a
        public x2.f.a c(int i11) {
            this.f3209d = Integer.valueOf(i11);
            return this;
        }

        @Override // androidx.camera.core.impl.x2.f.a
        public x2.f.a d(String str) {
            this.f3208c = str;
            return this;
        }

        @Override // androidx.camera.core.impl.x2.f.a
        public x2.f.a e(List<DeferrableSurface> list) {
            if (list == null) {
                throw new NullPointerException("Null sharedSurfaces");
            }
            this.f3207b = list;
            return this;
        }

        @Override // androidx.camera.core.impl.x2.f.a
        public x2.f.a f(int i11) {
            this.f3210e = Integer.valueOf(i11);
            return this;
        }

        public x2.f.a g(DeferrableSurface deferrableSurface) {
            if (deferrableSurface == null) {
                throw new NullPointerException("Null surface");
            }
            this.f3206a = deferrableSurface;
            return this;
        }
    }

    @Override // androidx.camera.core.impl.x2.f
    @NonNull
    public c0.b0 b() {
        return this.f3205f;
    }

    @Override // androidx.camera.core.impl.x2.f
    public int c() {
        return this.f3203d;
    }

    @Override // androidx.camera.core.impl.x2.f
    public String d() {
        return this.f3202c;
    }

    @Override // androidx.camera.core.impl.x2.f
    @NonNull
    public List<DeferrableSurface> e() {
        return this.f3201b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof x2.f) {
            x2.f fVar = (x2.f) obj;
            if (this.f3200a.equals(fVar.f()) && this.f3201b.equals(fVar.e()) && ((str = this.f3202c) != null ? str.equals(fVar.d()) : fVar.d() == null) && this.f3203d == fVar.c() && this.f3204e == fVar.g() && this.f3205f.equals(fVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.x2.f
    @NonNull
    public DeferrableSurface f() {
        return this.f3200a;
    }

    @Override // androidx.camera.core.impl.x2.f
    public int g() {
        return this.f3204e;
    }

    public int hashCode() {
        int iHashCode = (((this.f3200a.hashCode() ^ 1000003) * 1000003) ^ this.f3201b.hashCode()) * 1000003;
        String str = this.f3202c;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f3203d) * 1000003) ^ this.f3204e) * 1000003) ^ this.f3205f.hashCode();
    }

    public String toString() {
        return "OutputConfig{surface=" + this.f3200a + ", sharedSurfaces=" + this.f3201b + ", physicalCameraId=" + this.f3202c + ", mirrorMode=" + this.f3203d + ", surfaceGroupId=" + this.f3204e + ", dynamicRange=" + this.f3205f + "}";
    }

    private k(DeferrableSurface deferrableSurface, List<DeferrableSurface> list, String str, int i11, int i12, c0.b0 b0Var) {
        this.f3200a = deferrableSurface;
        this.f3201b = list;
        this.f3202c = str;
        this.f3203d = i11;
        this.f3204e = i12;
        this.f3205f = b0Var;
    }
}
