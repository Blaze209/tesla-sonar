package lr0;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes10.dex */
public class b extends fr0.a implements fr0.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f90676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f90677c;

    public b(String str) {
        this.f90676b = str;
    }

    protected ByteBuffer B() {
        ByteBuffer byteBufferWrap;
        if (this.f90677c || getSize() >= 4294967296L) {
            byte[] bArr = new byte[16];
            bArr[3] = 1;
            bArr[4] = this.f90676b.getBytes()[0];
            bArr[5] = this.f90676b.getBytes()[1];
            bArr[6] = this.f90676b.getBytes()[2];
            bArr[7] = this.f90676b.getBytes()[3];
            byteBufferWrap = ByteBuffer.wrap(bArr);
            byteBufferWrap.position(8);
            mr0.e.h(byteBufferWrap, getSize());
        } else {
            byteBufferWrap = ByteBuffer.wrap(new byte[]{0, 0, 0, 0, this.f90676b.getBytes()[0], this.f90676b.getBytes()[1], this.f90676b.getBytes()[2], this.f90676b.getBytes()[3]});
            mr0.e.g(byteBufferWrap, getSize());
        }
        byteBufferWrap.rewind();
        return byteBufferWrap;
    }

    public void c(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        t(writableByteChannel);
    }

    public long getSize() {
        long jP = p();
        return jP + ((long) ((this.f90677c || 8 + jP >= 4294967296L) ? 16 : 8));
    }
}
