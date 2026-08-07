package z7;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a0 f127045i = new b().h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.common.collect.b0<Integer> f127046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f127047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Double f127048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f127049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public final boolean f127050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f127051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f127052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f127053h;

    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Double f127055b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Double f127056c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.common.collect.b0<Integer> f127054a = com.google.common.collect.b0.s(1, 5);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f127057d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f127058e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f127059f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f127060g = true;

        public a0 h() {
            return new a0(this);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f127046a.equals(a0Var.f127046a) && this.f127051f == a0Var.f127051f && Objects.equals(this.f127047b, a0Var.f127047b) && Objects.equals(this.f127048c, a0Var.f127048c) && this.f127049d == a0Var.f127049d && this.f127052g == a0Var.f127052g && this.f127053h == a0Var.f127053h;
    }

    public int hashCode() {
        return Objects.hash(this.f127046a, this.f127047b, this.f127048c, Boolean.valueOf(this.f127049d), Boolean.valueOf(this.f127051f), Boolean.valueOf(this.f127052g), Boolean.valueOf(this.f127053h));
    }

    private a0(b bVar) {
        this.f127046a = bVar.f127054a;
        this.f127047b = bVar.f127055b;
        this.f127048c = bVar.f127056c;
        this.f127049d = bVar.f127057d;
        this.f127050e = !bVar.f127058e;
        this.f127051f = bVar.f127058e;
        this.f127052g = bVar.f127059f;
        this.f127053h = bVar.f127060g;
    }
}
