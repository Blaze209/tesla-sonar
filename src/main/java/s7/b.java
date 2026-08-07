package s7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f110386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f110387b;

    private static final class a extends OutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileOutputStream f110388a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f110389b = false;

        public a(File file) {
            this.f110388a = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f110389b) {
                return;
            }
            this.f110389b = true;
            flush();
            try {
                this.f110388a.getFD().sync();
            } catch (IOException e11) {
                t.j("AtomicFile", "Failed to sync file descriptor:", e11);
            }
            this.f110388a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f110388a.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i11) throws IOException {
            this.f110388a.write(i11);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f110388a.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i11, int i12) throws IOException {
            this.f110388a.write(bArr, i11, i12);
        }
    }

    public b(File file) {
        this.f110386a = file;
        this.f110387b = new File(file.getPath() + ".bak");
    }

    private void e() {
        if (this.f110387b.exists()) {
            this.f110386a.delete();
            this.f110387b.renameTo(this.f110386a);
        }
    }

    public void a() {
        this.f110386a.delete();
        this.f110387b.delete();
    }

    public void b(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f110387b.delete();
    }

    public boolean c() {
        return this.f110386a.exists() || this.f110387b.exists();
    }

    public InputStream d() {
        e();
        return new FileInputStream(this.f110386a);
    }

    public OutputStream f() throws IOException {
        if (this.f110386a.exists()) {
            if (this.f110387b.exists()) {
                this.f110386a.delete();
            } else if (!this.f110386a.renameTo(this.f110387b)) {
                t.i("AtomicFile", "Couldn't rename file " + this.f110386a + " to backup file " + this.f110387b);
            }
        }
        try {
            return new a(this.f110386a);
        } catch (FileNotFoundException e11) {
            File parentFile = this.f110386a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f110386a, e11);
            }
            try {
                return new a(this.f110386a);
            } catch (FileNotFoundException e12) {
                throw new IOException("Couldn't create " + this.f110386a, e12);
            }
        }
    }
}
