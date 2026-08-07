package androidx.media3.exoplayer.upstream;

import java.io.IOException;
import n8.i;
import n8.j;

/* JADX INFO: loaded from: classes3.dex */
public interface b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11159d;

        public a(int i11, int i12, int i13, int i14) {
            this.f11156a = i11;
            this.f11157b = i12;
            this.f11158c = i13;
            this.f11159d = i14;
        }

        public boolean a(int i11) {
            if (i11 == 1) {
                return this.f11156a - this.f11157b > 1;
            }
            return this.f11158c - this.f11159d > 1;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.upstream.b$b, reason: collision with other inner class name */
    public static final class C0205b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f11161b;

        public C0205b(int i11, long j11) {
            s7.a.a(j11 >= 0);
            this.f11160a = i11;
            this.f11161b = j11;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f11162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f11163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final IOException f11164c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f11165d;

        public c(i iVar, j jVar, IOException iOException, int i11) {
            this.f11162a = iVar;
            this.f11163b = jVar;
            this.f11164c = iOException;
            this.f11165d = i11;
        }
    }

    default void a(long j11) {
    }

    int b(int i11);

    C0205b c(a aVar, c cVar);

    long d(c cVar);
}
