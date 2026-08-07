package s0;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final s0.a f109287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f109288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f109289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f109290d;

    c(@NonNull s0.a aVar, d dVar, b bVar, int i11) {
        this.f109287a = aVar;
        this.f109288b = dVar;
        this.f109289c = bVar;
        this.f109290d = i11;
    }

    public int a() {
        return this.f109290d;
    }

    @NonNull
    public s0.a b() {
        return this.f109287a;
    }

    public b c() {
        return this.f109289c;
    }

    public d d() {
        return this.f109288b;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s0.a f109291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f109292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f109293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f109294d;

        public a() {
            this.f109291a = s0.a.f109283c;
            this.f109292b = null;
            this.f109293c = null;
            this.f109294d = 0;
        }

        @NonNull
        public static a b(@NonNull c cVar) {
            return new a(cVar);
        }

        @NonNull
        public c a() {
            return new c(this.f109291a, this.f109292b, this.f109293c, this.f109294d);
        }

        @NonNull
        public a c(int i11) {
            this.f109294d = i11;
            return this;
        }

        @NonNull
        public a d(@NonNull s0.a aVar) {
            this.f109291a = aVar;
            return this;
        }

        @NonNull
        public a e(@NonNull b bVar) {
            this.f109293c = bVar;
            return this;
        }

        @NonNull
        public a f(@NonNull d dVar) {
            this.f109292b = dVar;
            return this;
        }

        private a(@NonNull c cVar) {
            this.f109291a = s0.a.f109283c;
            this.f109292b = null;
            this.f109293c = null;
            this.f109294d = 0;
            this.f109291a = cVar.b();
            this.f109292b = cVar.d();
            this.f109293c = cVar.c();
            this.f109294d = cVar.a();
        }
    }
}
