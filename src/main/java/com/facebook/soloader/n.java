package com.facebook.soloader;

import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: loaded from: classes4.dex */
public final class n implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileOutputStream f23963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileLock f23964b;

    private n(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        this.f23963a = fileOutputStream;
        try {
            FileLock fileLockLock = fileOutputStream.getChannel().lock();
            if (fileLockLock == null) {
                fileOutputStream.close();
            }
            this.f23964b = fileLockLock;
        } catch (Throwable th2) {
            this.f23963a.close();
            throw th2;
        }
    }

    public static n c(File file) {
        return new n(file);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            FileLock fileLock = this.f23964b;
            if (fileLock != null) {
                fileLock.release();
            }
        } finally {
            this.f23963a.close();
        }
    }
}
