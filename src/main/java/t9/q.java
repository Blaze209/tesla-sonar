package t9;

import com.google.common.collect.x;
import java.util.Objects;
import p7.u;

/* JADX INFO: loaded from: classes3.dex */
public interface q {

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f112982a = new C2411a();

        /* JADX INFO: renamed from: t9.q$a$a, reason: collision with other inner class name */
        class C2411a implements a {
            C2411a() {
            }

            @Override // t9.q.a
            public int a(u uVar) {
                return 1;
            }

            @Override // t9.q.a
            public boolean b(u uVar) {
                return false;
            }

            @Override // t9.q.a
            public q c(u uVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        int a(u uVar);

        boolean b(u uVar);

        q c(u uVar);
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f112983c = new b(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f112984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f112985b;

        private b(long j11, boolean z11) {
            this.f112984a = j11;
            this.f112985b = z11;
        }

        public static b b() {
            return f112983c;
        }

        public static b c(long j11) {
            return new b(j11, true);
        }
    }

    void a(byte[] bArr, int i11, int i12, b bVar, s7.n<d> nVar);

    int b();

    default j c(byte[] bArr, int i11, int i12) {
        final x.a aVarK = x.k();
        b bVar = b.f112983c;
        Objects.requireNonNull(aVarK);
        a(bArr, i11, i12, bVar, new s7.n() { // from class: t9.p
            @Override // s7.n
            public final void accept(Object obj) {
                aVarK.a((d) obj);
            }
        });
        return new f(aVarK.k());
    }

    default void reset() {
    }
}
