package hr0;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes10.dex */
public class e extends lr0.b implements fr0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f73411e;

    public e() {
        super("dref");
    }

    @Override // lr0.b, fr0.b
    public void c(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        mr0.e.i(byteBufferAllocate, this.f73410d);
        mr0.e.f(byteBufferAllocate, this.f73411e);
        mr0.e.g(byteBufferAllocate, o().size());
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        t(writableByteChannel);
    }

    @Override // lr0.b, fr0.b
    public long getSize() {
        long jP = p();
        return 8 + jP + ((long) ((this.f90677c || jP + 16 >= 4294967296L) ? 16 : 8));
    }
}
