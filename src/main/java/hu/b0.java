package hu;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes5.dex */
final class b0 implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f73625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f73626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f73627c;

    public b0(FileChannel fileChannel, long j11, long j12) {
        this.f73625a = fileChannel;
        this.f73626b = j11;
        this.f73627c = j12;
    }

    @Override // hu.s
    public final void a(MessageDigest[] messageDigestArr, long j11, int i11) throws IOException {
        MappedByteBuffer map = this.f73625a.map(FileChannel.MapMode.READ_ONLY, this.f73626b + j11, i11);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override // hu.s
    public final long zza() {
        return this.f73627c;
    }
}
