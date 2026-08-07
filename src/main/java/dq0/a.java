package dq0;

import java.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
public class a {

    private static class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f60831a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f60832b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f60833c;

        protected b(c cVar, c cVar2, c cVar3) {
            this.f60831a = cVar;
            this.f60832b = cVar2;
            this.f60833c = cVar3;
        }

        @Override // dq0.a.f
        public c a() {
            return this.f60833c;
        }

        @Override // dq0.a.f
        public c b() {
            return this.f60831a;
        }

        @Override // dq0.a.f
        public c c() {
            return this.f60832b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Objects.equals(this.f60831a, bVar.f60831a) && Objects.equals(this.f60832b, bVar.f60832b) && Objects.equals(this.f60833c, bVar.f60833c);
        }

        public int hashCode() {
            return Objects.hash(this.f60831a, this.f60832b, this.f60833c);
        }

        public String toString() {
            return String.format("%,d files, %,d directories, %,d bytes", Long.valueOf(this.f60833c.get()), Long.valueOf(this.f60832b.get()), Long.valueOf(this.f60831a.get()));
        }
    }

    public interface c {
        void a();

        void add(long j11);

        long get();
    }

    private static class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f60834a;

        private d() {
        }

        @Override // dq0.a.c
        public void a() {
            this.f60834a++;
        }

        @Override // dq0.a.c
        public void add(long j11) {
            this.f60834a += j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f60834a == ((c) obj).get();
        }

        @Override // dq0.a.c
        public long get() {
            return this.f60834a;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f60834a));
        }

        public String toString() {
            return Long.toString(this.f60834a);
        }
    }

    private static class e extends b {
        protected e() {
            super(a.a(), a.a(), a.a());
        }
    }

    public interface f {
        c a();

        c b();

        c c();
    }

    public static c a() {
        return new d();
    }

    public static f b() {
        return new e();
    }
}
