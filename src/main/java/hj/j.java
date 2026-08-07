package hj;

import androidx.annotation.NonNull;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import xj.k;
import xj.l;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xj.h<dj.e, String> f72938a = new xj.h<>(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u5.f<b> f72939b = yj.a.d(10, new a());

    class a implements yj.a.d<b> {
        a() {
        }

        @Override // yj.a.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b create() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    private static final class b implements yj.a.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final MessageDigest f72941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final yj.c f72942b = yj.c.a();

        b(MessageDigest messageDigest) {
            this.f72941a = messageDigest;
        }

        @Override // yj.a.f
        @NonNull
        public yj.c e() {
            return this.f72942b;
        }
    }

    private String a(dj.e eVar) {
        b bVar = (b) k.d(this.f72939b.b());
        try {
            eVar.b(bVar.f72941a);
            return l.x(bVar.f72941a.digest());
        } finally {
            this.f72939b.a(bVar);
        }
    }

    public String b(dj.e eVar) {
        String strG;
        synchronized (this.f72938a) {
            strG = this.f72938a.g(eVar);
        }
        if (strG == null) {
            strG = a(eVar);
        }
        synchronized (this.f72938a) {
            this.f72938a.k(eVar, strG);
        }
        return strG;
    }
}
