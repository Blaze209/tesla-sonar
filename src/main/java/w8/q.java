package w8;

/* JADX INFO: loaded from: classes3.dex */
public interface q extends p7.j {
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

    boolean m(int i11, boolean z11);

    @Override // p7.j
    int read(byte[] bArr, int i11, int i12);

    void readFully(byte[] bArr, int i11, int i12);
}
