package xj;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Queue<d> f123596c = l.g(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InputStream f123597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IOException f123598b;

    d() {
    }

    @NonNull
    public static d n(@NonNull InputStream inputStream) {
        d dVarPoll;
        Queue<d> queue = f123596c;
        synchronized (queue) {
            dVarPoll = queue.poll();
        }
        if (dVarPoll == null) {
            dVarPoll = new d();
        }
        dVarPoll.o(inputStream);
        return dVarPoll;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f123597a.available();
    }

    public IOException c() {
        return this.f123598b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f123597a.close();
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f123597a.mark(i11);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f123597a.markSupported();
    }

    void o(@NonNull InputStream inputStream) {
        this.f123597a = inputStream;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        try {
            return this.f123597a.read();
        } catch (IOException e11) {
            this.f123598b = e11;
            throw e11;
        }
    }

    public void release() {
        this.f123598b = null;
        this.f123597a = null;
        Queue<d> queue = f123596c;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f123597a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j11) throws IOException {
        try {
            return this.f123597a.skip(j11);
        } catch (IOException e11) {
            this.f123598b = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        try {
            return this.f123597a.read(bArr);
        } catch (IOException e11) {
            this.f123598b = e11;
            throw e11;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) throws IOException {
        try {
            return this.f123597a.read(bArr, i11, i12);
        } catch (IOException e11) {
            this.f123598b = e11;
            throw e11;
        }
    }
}
