package hu;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes5.dex */
final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f73624a;

    public a(ByteBuffer byteBuffer) {
        this.f73624a = byteBuffer.slice();
    }

    @Override // hu.s
    public final void a(MessageDigest[] messageDigestArr, long j11, int i11) {
        ByteBuffer byteBufferSlice;
        synchronized (this.f73624a) {
            int i12 = (int) j11;
            this.f73624a.position(i12);
            this.f73624a.limit(i12 + i11);
            byteBufferSlice = this.f73624a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override // hu.s
    public final long zza() {
        return this.f73624a.capacity();
    }
}
