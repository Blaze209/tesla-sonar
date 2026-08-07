package y7;

import androidx.media3.decoder.DecoderException;
import androidx.media3.decoder.DecoderInputBuffer;
import java.util.ArrayDeque;
import y7.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class f<I extends DecoderInputBuffer, O extends e, E extends DecoderException> implements d<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f125196a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I[] f125200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O[] f125201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f125202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f125203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private I f125204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private E f125205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f125206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f125207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f125208m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f125197b = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f125209n = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f125198c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f125199d = new ArrayDeque<>();

    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            f.this.v();
        }
    }

    protected f(I[] iArr, O[] oArr) {
        this.f125200e = iArr;
        this.f125202g = iArr.length;
        for (int i11 = 0; i11 < this.f125202g; i11++) {
            ((I[]) this.f125200e)[i11] = i();
        }
        this.f125201f = oArr;
        this.f125203h = oArr.length;
        for (int i12 = 0; i12 < this.f125203h; i12++) {
            ((O[]) this.f125201f)[i12] = j();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f125196a = aVar;
        aVar.start();
    }

    private boolean h() {
        return !this.f125198c.isEmpty() && this.f125203h > 0;
    }

    private boolean m() {
        E e11;
        synchronized (this.f125197b) {
            while (!this.f125207l && !h()) {
                try {
                    this.f125197b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f125207l) {
                return false;
            }
            I iRemoveFirst = this.f125198c.removeFirst();
            O[] oArr = this.f125201f;
            int i11 = this.f125203h - 1;
            this.f125203h = i11;
            O o11 = oArr[i11];
            boolean z11 = this.f125206k;
            this.f125206k = false;
            if (iRemoveFirst.i()) {
                o11.e(4);
            } else {
                o11.f125193b = iRemoveFirst.f9288f;
                if (iRemoveFirst.j()) {
                    o11.e(134217728);
                }
                if (!p(iRemoveFirst.f9288f)) {
                    o11.f125195d = true;
                }
                try {
                    e11 = (E) l(iRemoveFirst, o11, z11);
                } catch (OutOfMemoryError e12) {
                    e11 = (E) k(e12);
                } catch (RuntimeException e13) {
                    e11 = (E) k(e13);
                }
                if (e11 != null) {
                    synchronized (this.f125197b) {
                        this.f125205j = e11;
                    }
                    return false;
                }
            }
            synchronized (this.f125197b) {
                try {
                    if (this.f125206k) {
                        o11.o();
                    } else if (o11.f125195d) {
                        this.f125208m++;
                        o11.o();
                    } else {
                        o11.f125194c = this.f125208m;
                        this.f125208m = 0;
                        this.f125199d.addLast(o11);
                    }
                    s(iRemoveFirst);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    private void q() {
        if (h()) {
            this.f125197b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends androidx.media3.decoder.DecoderException */
    private void r() throws E {
        E e11 = this.f125205j;
        if (e11 != null) {
            throw e11;
        }
    }

    private void s(I i11) {
        i11.f();
        I[] iArr = this.f125200e;
        int i12 = this.f125202g;
        this.f125202g = i12 + 1;
        iArr[i12] = i11;
    }

    private void u(O o11) {
        o11.f();
        O[] oArr = this.f125201f;
        int i11 = this.f125203h;
        this.f125203h = i11 + 1;
        oArr[i11] = o11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        do {
            try {
            } catch (InterruptedException e11) {
                throw new IllegalStateException(e11);
            }
        } while (m());
    }

    @Override // y7.d
    public final void e(long j11) {
        synchronized (this.f125197b) {
            try {
                s7.a.h(this.f125202g == this.f125200e.length || this.f125206k);
                this.f125209n = j11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y7.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void d(I i11) {
        synchronized (this.f125197b) {
            r();
            s7.a.a(i11 == this.f125204i);
            this.f125198c.addLast(i11);
            q();
            this.f125204i = null;
        }
    }

    @Override // y7.d
    public final void flush() {
        synchronized (this.f125197b) {
            try {
                this.f125206k = true;
                this.f125208m = 0;
                I i11 = this.f125204i;
                if (i11 != null) {
                    s(i11);
                    this.f125204i = null;
                }
                while (!this.f125198c.isEmpty()) {
                    s(this.f125198c.removeFirst());
                }
                while (!this.f125199d.isEmpty()) {
                    this.f125199d.removeFirst().o();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract I i();

    protected abstract O j();

    protected abstract E k(Throwable th2);

    protected abstract E l(I i11, O o11, boolean z11);

    @Override // y7.d
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final I b() {
        I i11;
        synchronized (this.f125197b) {
            r();
            s7.a.h(this.f125204i == null);
            int i12 = this.f125202g;
            if (i12 == 0) {
                i11 = null;
            } else {
                I[] iArr = this.f125200e;
                int i13 = i12 - 1;
                this.f125202g = i13;
                i11 = iArr[i13];
            }
            this.f125204i = i11;
        }
        return i11;
    }

    @Override // y7.d, i8.b
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final O a() {
        synchronized (this.f125197b) {
            try {
                r();
                if (this.f125199d.isEmpty()) {
                    return null;
                }
                return this.f125199d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final boolean p(long j11) {
        boolean z11;
        synchronized (this.f125197b) {
            long j12 = this.f125209n;
            z11 = j12 == -9223372036854775807L || j11 >= j12;
        }
        return z11;
    }

    @Override // y7.d
    public void release() {
        synchronized (this.f125197b) {
            this.f125207l = true;
            this.f125197b.notify();
        }
        try {
            this.f125196a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected void t(O o11) {
        synchronized (this.f125197b) {
            u(o11);
            q();
        }
    }

    protected final void w(int i11) {
        s7.a.h(this.f125202g == this.f125200e.length);
        for (I i12 : this.f125200e) {
            i12.p(i11);
        }
    }
}
