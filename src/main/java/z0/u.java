package z0;

import android.location.Location;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f126340a;

    static abstract class a<T extends u, B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final b.a<?> f126341a;

        a(@NonNull b.a<?> aVar) {
            this.f126341a = aVar;
            aVar.b(0L);
            aVar.a(0L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public B a(Location location) {
            if (location != null) {
                boolean z11 = false;
                u5.h.b(location.getLatitude() >= -90.0d && location.getLatitude() <= 90.0d, "Latitude must be in the range [-90, 90]");
                if (location.getLongitude() >= -180.0d && location.getLongitude() <= 180.0d) {
                    z11 = true;
                }
                u5.h.b(z11, "Longitude must be in the range [-180, 180]");
            }
            this.f126341a.c(location);
            return this;
        }
    }

    static abstract class b {

        static abstract class a<B> {
            a() {
            }

            @NonNull
            abstract B a(long j11);

            @NonNull
            abstract B b(long j11);

            @NonNull
            abstract B c(Location location);
        }

        b() {
        }

        abstract long a();

        abstract long b();

        abstract Location c();
    }

    u(@NonNull b bVar) {
        this.f126340a = bVar;
    }

    public long a() {
        return this.f126340a.a();
    }

    public long b() {
        return this.f126340a.b();
    }

    public Location c() {
        return this.f126340a.c();
    }
}
