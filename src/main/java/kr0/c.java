package kr0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.WritableByteChannel;
import java.util.Arrays;
import mr0.e;
import mr0.f;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f89366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f89367f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f89368g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f89369h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f89370i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f89371j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f89372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long[] f89373l;

    public c() {
        super("avc1");
        this.f89368g = 72.0d;
        this.f89369h = 72.0d;
        this.f89370i = 1;
        this.f89371j = "";
        this.f89372k = 24;
        this.f89373l = new long[3];
    }

    public String H() {
        return this.f89371j;
    }

    public int I() {
        return this.f89372k;
    }

    public int J() {
        return this.f89370i;
    }

    public double T() {
        return this.f89368g;
    }

    public double b0() {
        return this.f89369h;
    }

    @Override // lr0.b, fr0.b
    public void c(WritableByteChannel writableByteChannel) throws IOException {
        writableByteChannel.write(B());
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(78);
        byteBufferAllocate.position(6);
        e.e(byteBufferAllocate, this.f89351d);
        e.e(byteBufferAllocate, 0);
        e.e(byteBufferAllocate, 0);
        e.g(byteBufferAllocate, this.f89373l[0]);
        e.g(byteBufferAllocate, this.f89373l[1]);
        e.g(byteBufferAllocate, this.f89373l[2]);
        e.e(byteBufferAllocate, getWidth());
        e.e(byteBufferAllocate, getHeight());
        e.b(byteBufferAllocate, T());
        e.b(byteBufferAllocate, b0());
        e.g(byteBufferAllocate, 0L);
        e.e(byteBufferAllocate, J());
        e.i(byteBufferAllocate, f.c(H()));
        byteBufferAllocate.put(f.b(H()));
        int iC = f.c(H());
        while (iC < 31) {
            iC++;
            byteBufferAllocate.put((byte) 0);
        }
        e.e(byteBufferAllocate, I());
        e.e(byteBufferAllocate, 65535);
        writableByteChannel.write((ByteBuffer) byteBufferAllocate.rewind());
        t(writableByteChannel);
    }

    public void c0(String str) {
        this.f89371j = str;
    }

    public void e0(int i11) {
        this.f89372k = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            c(Channels.newChannel(byteArrayOutputStream));
            try {
                cVar.c(Channels.newChannel(byteArrayOutputStream2));
                return Arrays.equals(byteArrayOutputStream.toByteArray(), byteArrayOutputStream2.toByteArray());
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }

    public int getHeight() {
        return this.f89367f;
    }

    @Override // lr0.b, fr0.b
    public long getSize() {
        long jP = p();
        return 78 + jP + ((long) ((this.f90677c || jP + 86 >= 4294967296L) ? 16 : 8));
    }

    public int getWidth() {
        return this.f89366e;
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

    public void k0(int i11) {
        this.f89370i = i11;
    }

    public void n0(int i11) {
        this.f89367f = i11;
    }

    public void r0(double d11) {
        this.f89368g = d11;
    }

    public void s0(double d11) {
        this.f89369h = d11;
    }

    public void t0(int i11) {
        this.f89366e = i11;
    }

    public c(String str) {
        super(str);
        this.f89368g = 72.0d;
        this.f89369h = 72.0d;
        this.f89370i = 1;
        this.f89371j = "";
        this.f89372k = 24;
        this.f89373l = new long[3];
    }
}
