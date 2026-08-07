package f1;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.j1;

/* JADX INFO: loaded from: classes.dex */
final class i extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j1.c f63774c;

    static final class b extends n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f63775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f63776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private j1.c f63777c;

        b() {
        }

        @Override // f1.n.a
        public n b() {
            String str = "";
            if (this.f63775a == null) {
                str = " mimeType";
            }
            if (this.f63776b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new i(this.f63775a, this.f63776b.intValue(), this.f63777c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.n.a
        public n.a c(j1.c cVar) {
            this.f63777c = cVar;
            return this;
        }

        protected n.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f63775a = str;
            return this;
        }

        @Override // f1.j.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public n.a a(int i11) {
            this.f63776b = Integer.valueOf(i11);
            return this;
        }
    }

    @Override // f1.j
    @NonNull
    public String a() {
        return this.f63772a;
    }

    @Override // f1.j
    public int b() {
        return this.f63773b;
    }

    @Override // f1.n
    public j1.c d() {
        return this.f63774c;
    }

    public boolean equals(Object obj) {
        j1.c cVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f63772a.equals(nVar.a()) && this.f63773b == nVar.b() && ((cVar = this.f63774c) != null ? cVar.equals(nVar.d()) : nVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f63772a.hashCode() ^ 1000003) * 1000003) ^ this.f63773b) * 1000003;
        j1.c cVar = this.f63774c;
        return iHashCode ^ (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        return "VideoMimeInfo{mimeType=" + this.f63772a + ", profile=" + this.f63773b + ", compatibleVideoProfile=" + this.f63774c + "}";
    }

    private i(String str, int i11, j1.c cVar) {
        this.f63772a = str;
        this.f63773b = i11;
        this.f63774c = cVar;
    }
}
