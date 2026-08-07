package f1;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.j1;

/* JADX INFO: loaded from: classes.dex */
final class h extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j1.a f63768c;

    static final class b extends e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f63769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Integer f63770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private j1.a f63771c;

        b() {
        }

        @Override // f1.e.a
        public e b() {
            String str = "";
            if (this.f63769a == null) {
                str = " mimeType";
            }
            if (this.f63770b == null) {
                str = str + " profile";
            }
            if (str.isEmpty()) {
                return new h(this.f63769a, this.f63770b.intValue(), this.f63771c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // f1.e.a
        public e.a c(j1.a aVar) {
            this.f63771c = aVar;
            return this;
        }

        protected e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null mimeType");
            }
            this.f63769a = str;
            return this;
        }

        @Override // f1.j.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public e.a a(int i11) {
            this.f63770b = Integer.valueOf(i11);
            return this;
        }
    }

    @Override // f1.j
    @NonNull
    public String a() {
        return this.f63766a;
    }

    @Override // f1.j
    public int b() {
        return this.f63767b;
    }

    @Override // f1.e
    public j1.a d() {
        return this.f63768c;
    }

    public boolean equals(Object obj) {
        j1.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f63766a.equals(eVar.a()) && this.f63767b == eVar.b() && ((aVar = this.f63768c) != null ? aVar.equals(eVar.d()) : eVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((this.f63766a.hashCode() ^ 1000003) * 1000003) ^ this.f63767b) * 1000003;
        j1.a aVar = this.f63768c;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "AudioMimeInfo{mimeType=" + this.f63766a + ", profile=" + this.f63767b + ", compatibleAudioProfile=" + this.f63768c + "}";
    }

    private h(String str, int i11, j1.a aVar) {
        this.f63766a = str;
        this.f63767b = i11;
        this.f63768c = aVar;
    }
}
