package z0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
final class g extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e2 f126134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z0.a f126135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f126136c;

    static final class b extends s.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private e2 f126137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private z0.a f126138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f126139c;

        @Override // z0.s.a
        public s a() {
            String str = "";
            if (this.f126137a == null) {
                str = " videoSpec";
            }
            if (this.f126138b == null) {
                str = str + " audioSpec";
            }
            if (this.f126139c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new g(this.f126137a, this.f126138b, this.f126139c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // z0.s.a
        e2 c() {
            e2 e2Var = this.f126137a;
            if (e2Var != null) {
                return e2Var;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override // z0.s.a
        public s.a d(z0.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null audioSpec");
            }
            this.f126138b = aVar;
            return this;
        }

        @Override // z0.s.a
        public s.a e(int i11) {
            this.f126139c = Integer.valueOf(i11);
            return this;
        }

        @Override // z0.s.a
        public s.a f(e2 e2Var) {
            if (e2Var == null) {
                throw new NullPointerException("Null videoSpec");
            }
            this.f126137a = e2Var;
            return this;
        }

        b() {
        }

        private b(s sVar) {
            this.f126137a = sVar.d();
            this.f126138b = sVar.b();
            this.f126139c = Integer.valueOf(sVar.c());
        }
    }

    @Override // z0.s
    @NonNull
    public z0.a b() {
        return this.f126135b;
    }

    @Override // z0.s
    public int c() {
        return this.f126136c;
    }

    @Override // z0.s
    @NonNull
    public e2 d() {
        return this.f126134a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.f126134a.equals(sVar.d()) && this.f126135b.equals(sVar.b()) && this.f126136c == sVar.c()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f126134a.hashCode() ^ 1000003) * 1000003) ^ this.f126135b.hashCode()) * 1000003) ^ this.f126136c;
    }

    @Override // z0.s
    public s.a i() {
        return new b(this);
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f126134a + ", audioSpec=" + this.f126135b + ", outputFormat=" + this.f126136c + "}";
    }

    private g(e2 e2Var, z0.a aVar, int i11) {
        this.f126134a = e2Var;
        this.f126135b = aVar;
        this.f126136c = i11;
    }
}
