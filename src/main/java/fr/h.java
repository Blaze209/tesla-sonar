package fr;

import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import fr.f;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class h<I extends DecoderInputBuffer, O extends f, E extends DecoderException> implements d<I, O, E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f66387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f66388b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<I> f66389c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ArrayDeque<O> f66390d = new ArrayDeque<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final I[] f66391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final O[] f66392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f66393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f66394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private I f66395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private E f66396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f66397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f66398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f66399m;

    class a extends Thread {
        a(String str) {
            super(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            h.this.t();
        }
    }

    protected h(I[] iArr, O[] oArr) {
        this.f66391e = iArr;
        this.f66393g = iArr.length;
        for (int i11 = 0; i11 < this.f66393g; i11++) {
            ((I[]) this.f66391e)[i11] = g();
        }
        this.f66392f = oArr;
        this.f66394h = oArr.length;
        for (int i12 = 0; i12 < this.f66394h; i12++) {
            ((O[]) this.f66392f)[i12] = h();
        }
        a aVar = new a("ExoPlayer:SimpleDecoder");
        this.f66387a = aVar;
        aVar.start();
    }

    private boolean f() {
        return !this.f66389c.isEmpty() && this.f66394h > 0;
    }

    private boolean k() {
        E e11;
        synchronized (this.f66388b) {
            while (!this.f66398l && !f()) {
                try {
                    this.f66388b.wait();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (this.f66398l) {
                return false;
            }
            I iRemoveFirst = this.f66389c.removeFirst();
            O[] oArr = this.f66392f;
            int i11 = this.f66394h - 1;
            this.f66394h = i11;
            O o11 = oArr[i11];
            boolean z11 = this.f66397k;
            this.f66397k = false;
            if (iRemoveFirst.k()) {
                o11.e(4);
            } else {
                if (iRemoveFirst.j()) {
                    o11.e(Integer.MIN_VALUE);
                }
                if (iRemoveFirst.l()) {
                    o11.e(134217728);
                }
                try {
                    e11 = (E) j(iRemoveFirst, o11, z11);
                } catch (OutOfMemoryError e12) {
                    e11 = (E) i(e12);
                } catch (RuntimeException e13) {
                    e11 = (E) i(e13);
                }
                if (e11 != null) {
                    synchronized (this.f66388b) {
                        this.f66396j = e11;
                    }
                    return false;
                }
            }
            synchronized (this.f66388b) {
                try {
                    if (this.f66397k) {
                        o11.p();
                    } else if (o11.j()) {
                        this.f66399m++;
                        o11.p();
                    } else {
                        o11.f66355c = this.f66399m;
                        this.f66399m = 0;
                        this.f66390d.addLast(o11);
                    }
                    q(iRemoveFirst);
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return true;
        }
    }

    private void n() {
        if (f()) {
            this.f66388b.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.google.android.exoplayer2.decoder.DecoderException */
    private void o() throws E {
        E e11 = this.f66396j;
        if (e11 != null) {
            throw e11;
        }
    }

    private void q(I i11) {
        i11.f();
        I[] iArr = this.f66391e;
        int i12 = this.f66393g;
        this.f66393g = i12 + 1;
        iArr[i12] = i11;
    }

    private void s(O o11) {
        o11.f();
        O[] oArr = this.f66392f;
        int i11 = this.f66394h;
        this.f66394h = i11 + 1;
        oArr[i11] = o11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        do {
            try {
            } catch (InterruptedException e11) {
                throw new IllegalStateException(e11);
            }
        } while (k());
    }

    @Override // fr.d
    public final void flush() {
        synchronized (this.f66388b) {
            try {
                this.f66397k = true;
                this.f66399m = 0;
                I i11 = this.f66395i;
                if (i11 != null) {
                    q(i11);
                    this.f66395i = null;
                }
                while (!this.f66389c.isEmpty()) {
                    q(this.f66389c.removeFirst());
                }
                while (!this.f66390d.isEmpty()) {
                    this.f66390d.removeFirst().p();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected abstract I g();

    protected abstract O h();

    protected abstract E i(Throwable th2);

    protected abstract E j(I i11, O o11, boolean z11);

    @Override // fr.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final I b() {
        I i11;
        synchronized (this.f66388b) {
            o();
            ts.a.g(this.f66395i == null);
            int i12 = this.f66393g;
            if (i12 == 0) {
                i11 = null;
            } else {
                I[] iArr = this.f66391e;
                int i13 = i12 - 1;
                this.f66393g = i13;
                i11 = iArr[i13];
            }
            this.f66395i = i11;
        }
        return i11;
    }

    @Override // fr.d
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final O a() {
        synchronized (this.f66388b) {
            try {
                o();
                if (this.f66390d.isEmpty()) {
                    return null;
                }
                return this.f66390d.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fr.d
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void d(I i11) {
        synchronized (this.f66388b) {
            o();
            ts.a.a(i11 == this.f66395i);
            this.f66389c.addLast(i11);
            n();
            this.f66395i = null;
        }
    }

    protected void r(O o11) {
        synchronized (this.f66388b) {
            s(o11);
            n();
        }
    }

    @Override // fr.d
    public void release() {
        synchronized (this.f66388b) {
            this.f66398l = true;
            this.f66388b.notify();
        }
        try {
            this.f66387a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    protected final void u(int i11) {
        ts.a.g(this.f66393g == this.f66391e.length);
        for (I i12 : this.f66391e) {
            i12.q(i11);
        }
    }
}
