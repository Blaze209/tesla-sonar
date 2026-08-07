package gv;

import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class g extends f0.d.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f69804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f69805b;

    static final class b extends f0.d.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f69806a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f69807b;

        b() {
        }

        @Override // gv.f0.d.b.a
        public f0.d.b a() {
            byte[] bArr;
            String str = this.f69806a;
            if (str != null && (bArr = this.f69807b) != null) {
                return new g(str, bArr);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f69806a == null) {
                sb2.append(" filename");
            }
            if (this.f69807b == null) {
                sb2.append(" contents");
            }
            throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
        }

        @Override // gv.f0.d.b.a
        public f0.d.b.a b(byte[] bArr) {
            if (bArr == null) {
                throw new NullPointerException("Null contents");
            }
            this.f69807b = bArr;
            return this;
        }

        @Override // gv.f0.d.b.a
        public f0.d.b.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null filename");
            }
            this.f69806a = str;
            return this;
        }
    }

    @Override // gv.f0.d.b
    @NonNull
    public byte[] b() {
        return this.f69805b;
    }

    @Override // gv.f0.d.b
    @NonNull
    public String c() {
        return this.f69804a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0.d.b) {
            f0.d.b bVar = (f0.d.b) obj;
            if (this.f69804a.equals(bVar.c())) {
                if (Arrays.equals(this.f69805b, bVar instanceof g ? ((g) bVar).f69805b : bVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f69804a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f69805b);
    }

    public String toString() {
        return "File{filename=" + this.f69804a + ", contents=" + Arrays.toString(this.f69805b) + "}";
    }

    private g(String str, byte[] bArr) {
        this.f69804a = str;
        this.f69805b = bArr;
    }
}
