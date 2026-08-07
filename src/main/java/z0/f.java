package z0;

import android.location.Location;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
final class f extends r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f126120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f126121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Location f126122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f126123d;

    static final class b extends r.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Long f126124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Long f126125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Location f126126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private File f126127d;

        b() {
        }

        @Override // z0.r.b.a
        r.b d() {
            String str = "";
            if (this.f126124a == null) {
                str = " fileSizeLimit";
            }
            if (this.f126125b == null) {
                str = str + " durationLimitMillis";
            }
            if (this.f126127d == null) {
                str = str + " file";
            }
            if (str.isEmpty()) {
                return new f(this.f126124a.longValue(), this.f126125b.longValue(), this.f126126c, this.f126127d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // z0.r.b.a
        r.b.a e(File file) {
            if (file == null) {
                throw new NullPointerException("Null file");
            }
            this.f126127d = file;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.u.b.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public r.b.a a(long j11) {
            this.f126125b = Long.valueOf(j11);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.u.b.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public r.b.a b(long j11) {
            this.f126124a = Long.valueOf(j11);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // z0.u.b.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public r.b.a c(Location location) {
            this.f126126c = location;
            return this;
        }
    }

    @Override // z0.u.b
    long a() {
        return this.f126121b;
    }

    @Override // z0.u.b
    long b() {
        return this.f126120a;
    }

    @Override // z0.u.b
    Location c() {
        return this.f126122c;
    }

    @Override // z0.r.b
    @NonNull
    File d() {
        return this.f126123d;
    }

    public boolean equals(Object obj) {
        Location location;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f126120a == bVar.b() && this.f126121b == bVar.a() && ((location = this.f126122c) != null ? location.equals(bVar.c()) : bVar.c() == null) && this.f126123d.equals(bVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j11 = this.f126120a;
        long j12 = this.f126121b;
        int i11 = (((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        Location location = this.f126122c;
        return ((i11 ^ (location == null ? 0 : location.hashCode())) * 1000003) ^ this.f126123d.hashCode();
    }

    public String toString() {
        return "FileOutputOptionsInternal{fileSizeLimit=" + this.f126120a + ", durationLimitMillis=" + this.f126121b + ", location=" + this.f126122c + ", file=" + this.f126123d + "}";
    }

    private f(long j11, long j12, Location location, File file) {
        this.f126120a = j11;
        this.f126121b = j12;
        this.f126122c = location;
        this.f126123d = file;
    }
}
