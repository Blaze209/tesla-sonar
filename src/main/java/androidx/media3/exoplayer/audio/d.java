package androidx.media3.exoplayer.audio;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f9468d = new b().d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f9471c;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f9472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f9473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f9474c;

        public d d() {
            if (this.f9472a || !(this.f9473b || this.f9474c)) {
                return new d(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z11) {
            this.f9472a = z11;
            return this;
        }

        public b f(boolean z11) {
            this.f9473b = z11;
            return this;
        }

        public b g(boolean z11) {
            this.f9474c = z11;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f9469a == dVar.f9469a && this.f9470b == dVar.f9470b && this.f9471c == dVar.f9471c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9469a ? 1 : 0) << 2) + ((this.f9470b ? 1 : 0) << 1) + (this.f9471c ? 1 : 0);
    }

    private d(b bVar) {
        this.f9469a = bVar.f9472a;
        this.f9470b = bVar.f9473b;
        this.f9471c = bVar.f9474c;
    }
}
