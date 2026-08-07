package kr0;

import ch.qos.logback.core.CoreConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import mr0.e;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Logger f89352r = LoggerFactory.getLogger((Class<?>) b.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f89353e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f89354f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f89355g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f89356h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f89357i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f89358j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f89359k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f89360l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f89361m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f89362n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f89363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f89364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private byte[] f89365q;

    public b(String str) {
        super(str);
    }

    public int H() {
        return this.f89353e;
    }

    public long I() {
        return this.f89355g;
    }

    public void J(int i11) {
        this.f89353e = i11;
    }

    public void T(long j11) {
        this.f89355g = j11;
    }

    public void b0(int i11) {
        this.f89354f = i11;
    }

    @Override // lr0.b, fr0.b
    public void c(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        int i11 = this.f89356h;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((i11 == 1 ? 16 : 0) + 28 + (i11 == 2 ? 36 : 0));
        byteBufferAllocate.position(6);
        e.e(byteBufferAllocate, this.f89351d);
        e.e(byteBufferAllocate, this.f89356h);
        e.e(byteBufferAllocate, this.f89363o);
        e.g(byteBufferAllocate, this.f89364p);
        e.e(byteBufferAllocate, this.f89353e);
        e.e(byteBufferAllocate, this.f89354f);
        e.e(byteBufferAllocate, this.f89357i);
        e.e(byteBufferAllocate, this.f89358j);
        if (this.f90676b.equals("mlpa")) {
            e.g(byteBufferAllocate, I());
        } else {
            e.g(byteBufferAllocate, I() << 16);
        }
        if (this.f89356h == 1) {
            e.g(byteBufferAllocate, this.f89359k);
            e.g(byteBufferAllocate, this.f89360l);
            e.g(byteBufferAllocate, this.f89361m);
            e.g(byteBufferAllocate, this.f89362n);
        }
        if (this.f89356h == 2) {
            e.g(byteBufferAllocate, this.f89359k);
            e.g(byteBufferAllocate, this.f89360l);
            e.g(byteBufferAllocate, this.f89361m);
            e.g(byteBufferAllocate, this.f89362n);
            byteBufferAllocate.put(this.f89365q);
        }
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        t(writableByteChannel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            c(Channels.newChannel(byteArrayOutputStream));
            try {
                bVar.c(Channels.newChannel(byteArrayOutputStream2));
                return Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray());
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // lr0.b, fr0.b
    public long getSize() {
        int i11 = this.f89356h;
        int i12 = 16;
        long jP = ((long) ((i11 == 1 ? 16 : 0) + 28 + (i11 == 2 ? 36 : 0))) + p();
        if (!this.f90677c && 8 + jP < 4294967296L) {
            i12 = 8;
        }
        return jP + ((long) i12);
    }

    public int hashCode() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c(Channels.newChannel(byteArrayOutputStream));
            return Arrays.hashCode(byteArrayOutputStream.toByteArray());
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    @Override // fr0.a
    public String toString() {
        return "AudioSampleEntry{bytesPerSample=" + this.f89362n + ", bytesPerFrame=" + this.f89361m + ", bytesPerPacket=" + this.f89360l + ", samplesPerPacket=" + this.f89359k + ", packetSize=" + this.f89358j + ", compressionId=" + this.f89357i + ", soundVersion=" + this.f89356h + ", sampleRate=" + this.f89355g + ", sampleSize=" + this.f89354f + ", channelCount=" + this.f89353e + ", boxes=" + o() + CoreConstants.CURLY_RIGHT;
    }
}
