package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes4.dex */
public class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f23943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private FileInputStream f23944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private FileChannel f23945c;

    public i(File file) {
        this.f23943a = file;
        c();
    }

    public void c() {
        FileInputStream fileInputStream = new FileInputStream(this.f23943a);
        this.f23944b = fileInputStream;
        this.f23945c = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f23944b.close();
    }

    @Override // com.facebook.soloader.h
    public int h0(ByteBuffer byteBuffer, long j11) {
        return this.f23945c.read(byteBuffer, j11);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f23945c.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f23945c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f23945c.write(byteBuffer);
    }
}
