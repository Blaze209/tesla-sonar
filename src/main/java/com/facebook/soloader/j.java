package com.facebook.soloader;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes4.dex */
public class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f23946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZipEntry f23947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ZipFile f23948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f23949d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f23950e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23951f = 0;

    public j(ZipFile zipFile, ZipEntry zipEntry) throws IOException {
        this.f23948c = zipFile;
        this.f23947b = zipEntry;
        this.f23949d = zipEntry.getSize();
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        this.f23946a = inputStream;
        if (inputStream != null) {
            return;
        }
        throw new IOException(zipEntry.getName() + "'s InputStream is null");
    }

    public h c(long j11) throws IOException {
        InputStream inputStream = this.f23946a;
        if (inputStream == null) {
            throw new IOException(this.f23947b.getName() + "'s InputStream is null");
        }
        long j12 = this.f23951f;
        if (j11 == j12) {
            return this;
        }
        long j13 = this.f23949d;
        if (j11 > j13) {
            j11 = j13;
        }
        if (j11 >= j12) {
            inputStream.skip(j11 - j12);
        } else {
            inputStream.close();
            InputStream inputStream2 = this.f23948c.getInputStream(this.f23947b);
            this.f23946a = inputStream2;
            if (inputStream2 == null) {
                throw new IOException(this.f23947b.getName() + "'s InputStream is null");
            }
            inputStream2.skip(j11);
        }
        this.f23951f = j11;
        return this;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f23946a;
        if (inputStream != null) {
            inputStream.close();
            this.f23950e = false;
        }
    }

    @Override // com.facebook.soloader.h
    public int h0(ByteBuffer byteBuffer, long j11) throws IOException {
        if (this.f23946a == null) {
            throw new IOException("InputStream is null");
        }
        int iRemaining = byteBuffer.remaining();
        long j12 = this.f23949d - j11;
        if (j12 <= 0) {
            return -1;
        }
        int i11 = (int) j12;
        if (iRemaining > i11) {
            iRemaining = i11;
        }
        c(j11);
        if (byteBuffer.hasArray()) {
            this.f23946a.read(byteBuffer.array(), 0, iRemaining);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        } else {
            byte[] bArr = new byte[iRemaining];
            this.f23946a.read(bArr, 0, iRemaining);
            byteBuffer.put(bArr, 0, iRemaining);
        }
        this.f23951f += (long) iRemaining;
        return iRemaining;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f23950e;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return h0(byteBuffer, this.f23951f);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        throw new UnsupportedOperationException("ElfZipFileChannel doesn't support write");
    }
}
