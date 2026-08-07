package androidx.camera.core.impl;

import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class m extends c3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Size f3220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c0.b0 f3221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Range<Integer> f3222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final x0 f3223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f3224f;

    static final class b extends c3.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Size f3225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c0.b0 f3226b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Range<Integer> f3227c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private x0 f3228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Boolean f3229e;

        @Override // androidx.camera.core.impl.c3.a
        public c3 a() {
            String str = "";
            if (this.f3225a == null) {
                str = " resolution";
            }
            if (this.f3226b == null) {
                str = str + " dynamicRange";
            }
            if (this.f3227c == null) {
                str = str + " expectedFrameRateRange";
            }
            if (this.f3229e == null) {
                str = str + " zslDisabled";
            }
            if (str.isEmpty()) {
                return new m(this.f3225a, this.f3226b, this.f3227c, this.f3228d, this.f3229e.booleanValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // androidx.camera.core.impl.c3.a
        public c3.a b(c0.b0 b0Var) {
            if (b0Var == null) {
                throw new NullPointerException("Null dynamicRange");
            }
            this.f3226b = b0Var;
            return this;
        }

        @Override // androidx.camera.core.impl.c3.a
        public c3.a c(Range<Integer> range) {
            if (range == null) {
                throw new NullPointerException("Null expectedFrameRateRange");
            }
            this.f3227c = range;
            return this;
        }

        @Override // androidx.camera.core.impl.c3.a
        public c3.a d(x0 x0Var) {
            this.f3228d = x0Var;
            return this;
        }

        @Override // androidx.camera.core.impl.c3.a
        public c3.a e(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f3225a = size;
            return this;
        }

        @Override // androidx.camera.core.impl.c3.a
        public c3.a f(boolean z11) {
            this.f3229e = Boolean.valueOf(z11);
            return this;
        }

        b() {
        }

        private b(c3 c3Var) {
            this.f3225a = c3Var.e();
            this.f3226b = c3Var.b();
            this.f3227c = c3Var.c();
            this.f3228d = c3Var.d();
            this.f3229e = Boolean.valueOf(c3Var.f());
        }
    }

    @Override // androidx.camera.core.impl.c3
    @NonNull
    public c0.b0 b() {
        return this.f3221c;
    }

    @Override // androidx.camera.core.impl.c3
    @NonNull
    public Range<Integer> c() {
        return this.f3222d;
    }

    @Override // androidx.camera.core.impl.c3
    public x0 d() {
        return this.f3223e;
    }

    @Override // androidx.camera.core.impl.c3
    @NonNull
    public Size e() {
        return this.f3220b;
    }

    public boolean equals(Object obj) {
        x0 x0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof c3) {
            c3 c3Var = (c3) obj;
            if (this.f3220b.equals(c3Var.e()) && this.f3221c.equals(c3Var.b()) && this.f3222d.equals(c3Var.c()) && ((x0Var = this.f3223e) != null ? x0Var.equals(c3Var.d()) : c3Var.d() == null) && this.f3224f == c3Var.f()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.c3
    public boolean f() {
        return this.f3224f;
    }

    @Override // androidx.camera.core.impl.c3
    public c3.a g() {
        return new b(this);
    }

    public int hashCode() {
        int iHashCode = (((((this.f3220b.hashCode() ^ 1000003) * 1000003) ^ this.f3221c.hashCode()) * 1000003) ^ this.f3222d.hashCode()) * 1000003;
        x0 x0Var = this.f3223e;
        return ((iHashCode ^ (x0Var == null ? 0 : x0Var.hashCode())) * 1000003) ^ (this.f3224f ? 1231 : 1237);
    }

    public String toString() {
        return "StreamSpec{resolution=" + this.f3220b + ", dynamicRange=" + this.f3221c + ", expectedFrameRateRange=" + this.f3222d + ", implementationOptions=" + this.f3223e + ", zslDisabled=" + this.f3224f + "}";
    }

    private m(Size size, c0.b0 b0Var, Range<Integer> range, x0 x0Var, boolean z11) {
        this.f3220b = size;
        this.f3221c = b0Var;
        this.f3222d = range;
        this.f3223e = x0Var;
        this.f3224f = z11;
    }
}
