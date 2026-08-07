package p8;

import java.util.Arrays;
import p7.u;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f101917j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f101918k;

    public k(androidx.media3.datasource.a aVar, v7.j jVar, int i11, u uVar, int i12, Object obj, byte[] bArr) {
        super(aVar, jVar, i11, uVar, i12, obj, -9223372036854775807L, -9223372036854775807L);
        this.f101917j = bArr == null ? q0.f110459f : bArr;
    }

    private void i(int i11) {
        byte[] bArr = this.f101917j;
        if (bArr.length < i11 + 16384) {
            this.f101917j = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void a() {
        try {
            this.f101878i.j(this.f101871b);
            int i11 = 0;
            int i12 = 0;
            while (i11 != -1 && !this.f101918k) {
                i(i12);
                i11 = this.f101878i.read(this.f101917j, i12, 16384);
                if (i11 != -1) {
                    i12 += i11;
                }
            }
            if (!this.f101918k) {
                g(this.f101917j, i12);
            }
        } finally {
            v7.i.a(this.f101878i);
        }
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.e
    public final void b() {
        this.f101918k = true;
    }

    protected abstract void g(byte[] bArr, int i11);

    public byte[] h() {
        return this.f101917j;
    }
}
