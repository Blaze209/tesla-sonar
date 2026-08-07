package fw;

import com.google.firebase.messaging.m0;
import uv.d;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f66709b = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fw.a f66710a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private fw.a f66711a = null;

        a() {
        }

        public b a() {
            return new b(this.f66711a);
        }

        public a b(fw.a aVar) {
            this.f66711a = aVar;
            return this;
        }
    }

    b(fw.a aVar) {
        this.f66710a = aVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public fw.a a() {
        return this.f66710a;
    }

    public byte[] c() {
        return m0.a(this);
    }
}
