package nz;

/* JADX INFO: loaded from: classes6.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f95492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f95493b;

    public f(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new IllegalArgumentException("The cipher text must not be null");
        }
        this.f95492a = bArr;
        if (bArr2 == null) {
            throw new IllegalArgumentException("The authentication tag must not be null");
        }
        this.f95493b = bArr2;
    }

    public byte[] a() {
        return this.f95493b;
    }

    public byte[] b() {
        return this.f95492a;
    }
}
