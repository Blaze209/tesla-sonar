package hr;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface l extends ss.g {
    int a(int i11);

    boolean c(byte[] bArr, int i11, int i12, boolean z11);

    int d(byte[] bArr, int i11, int i12);

    void e(byte[] bArr, int i11, int i12);

    boolean f(byte[] bArr, int i11, int i12, boolean z11);

    void g();

    long getLength();

    long getPosition();

    long h();

    void i(int i11);

    void k(int i11);

    boolean l(int i11, boolean z11);

    @Override // ss.g
    int read(byte[] bArr, int i11, int i12);

    void readFully(byte[] bArr, int i11, int i12);
}
