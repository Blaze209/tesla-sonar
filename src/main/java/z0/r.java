package z0;

import android.location.Location;
import androidx.annotation.NonNull;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class r extends u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f126213b;

    public static final class a extends u.a<r, a> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b.a f126214b;

        public a(@NonNull File file) {
            super(new f.b());
            u5.h.h(file, "File can't be null.");
            b.a aVar = (b.a) this.f126341a;
            this.f126214b = aVar;
            aVar.e(file);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, z0.r$a] */
        @Override // z0.u.a
        @NonNull
        public /* bridge */ /* synthetic */ a a(Location location) {
            return super.a(location);
        }

        @NonNull
        public r b() {
            return new r(this.f126214b.d());
        }
    }

    static abstract class b extends u.b {

        static abstract class a extends u.b.a<a> {
            a() {
            }

            @NonNull
            abstract b d();

            @NonNull
            abstract a e(@NonNull File file);
        }

        b() {
        }

        @NonNull
        abstract File d();
    }

    r(@NonNull b bVar) {
        super(bVar);
        this.f126213b = bVar;
    }

    @NonNull
    public File d() {
        return this.f126213b.d();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f126213b.equals(((r) obj).f126213b);
        }
        return false;
    }

    public int hashCode() {
        return this.f126213b.hashCode();
    }

    @NonNull
    public String toString() {
        return this.f126213b.toString().replaceFirst("FileOutputOptionsInternal", "FileOutputOptions");
    }
}
