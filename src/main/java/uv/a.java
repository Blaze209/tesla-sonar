package uv;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f116718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d.a f116719b = d.a.DEFAULT;

    /* JADX INFO: renamed from: uv.a$a, reason: collision with other inner class name */
    private static final class C2515a implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f116720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d.a f116721c;

        C2515a(int i11, d.a aVar) {
            this.f116720b = i11;
            this.f116721c = aVar;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f116720b == dVar.tag() && this.f116721c.equals(dVar.intEncoding());
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (14552422 ^ this.f116720b) + (this.f116721c.hashCode() ^ 2041407134);
        }

        @Override // uv.d
        public d.a intEncoding() {
            return this.f116721c;
        }

        @Override // uv.d
        public int tag() {
            return this.f116720b;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf" + CoreConstants.LEFT_PARENTHESIS_CHAR + "tag=" + this.f116720b + "intEncoding=" + this.f116721c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C2515a(this.f116718a, this.f116719b);
    }

    public a c(int i11) {
        this.f116718a = i11;
        return this;
    }
}
