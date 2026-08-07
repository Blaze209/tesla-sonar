package oq;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
final class g extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f98417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f98418b;

    static final class b extends q.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f98419a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f98420b;

        b() {
        }

        @Override // oq.q.a
        public q a() {
            return new g(this.f98419a, this.f98420b);
        }

        @Override // oq.q.a
        public q.a b(byte[] bArr) {
            this.f98419a = bArr;
            return this;
        }

        @Override // oq.q.a
        public q.a c(byte[] bArr) {
            this.f98420b = bArr;
            return this;
        }
    }

    @Override // oq.q
    public byte[] b() {
        return this.f98417a;
    }

    @Override // oq.q
    public byte[] c() {
        return this.f98418b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            boolean z11 = qVar instanceof g;
            if (Arrays.equals(this.f98417a, z11 ? ((g) qVar).f98417a : qVar.b())) {
                if (Arrays.equals(this.f98418b, z11 ? ((g) qVar).f98418b : qVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return ((Arrays.hashCode(this.f98417a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f98418b);
    }

    public String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f98417a) + ", encryptedBlob=" + Arrays.toString(this.f98418b) + "}";
    }

    private g(byte[] bArr, byte[] bArr2) {
        this.f98417a = bArr;
        this.f98418b = bArr2;
    }
}
