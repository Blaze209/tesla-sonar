package com.bumptech.glide.load.data;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final OutputStream f20526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte[] f20527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private gj.b f20528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20529d;

    public c(@NonNull OutputStream outputStream, @NonNull gj.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void c() throws IOException {
        int i11 = this.f20529d;
        if (i11 > 0) {
            this.f20526a.write(this.f20527b, 0, i11);
            this.f20529d = 0;
        }
    }

    private void n() throws IOException {
        if (this.f20529d == this.f20527b.length) {
            c();
        }
    }

    private void release() {
        byte[] bArr = this.f20527b;
        if (bArr != null) {
            this.f20528c.put(bArr);
            this.f20527b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f20526a.close();
            release();
        } catch (Throwable th2) {
            this.f20526a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        c();
        this.f20526a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i11) throws IOException {
        byte[] bArr = this.f20527b;
        int i12 = this.f20529d;
        this.f20529d = i12 + 1;
        bArr[i12] = (byte) i11;
        n();
    }

    c(@NonNull OutputStream outputStream, gj.b bVar, int i11) {
        this.f20526a = outputStream;
        this.f20528c = bVar;
        this.f20527b = (byte[]) bVar.c(i11, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i11, int i12) throws IOException {
        int i13 = 0;
        do {
            int i14 = i12 - i13;
            int i15 = i11 + i13;
            int i16 = this.f20529d;
            if (i16 == 0 && i14 >= this.f20527b.length) {
                this.f20526a.write(bArr, i15, i14);
                return;
            }
            int iMin = Math.min(i14, this.f20527b.length - i16);
            System.arraycopy(bArr, i15, this.f20527b, this.f20529d, iMin);
            this.f20529d += iMin;
            i13 += iMin;
            n();
        } while (i13 < i12);
    }
}
