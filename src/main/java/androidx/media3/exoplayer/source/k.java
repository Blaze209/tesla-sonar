package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.o1;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p7.t0;

/* JADX INFO: loaded from: classes3.dex */
final class k implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f11052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f11053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n8.y f11054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f11055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f11056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicReference<Throwable> f11057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f11058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.google.common.util.concurrent.s<?> f11059h;

    class a implements com.google.common.util.concurrent.l<Object> {
        a() {
        }

        @Override // com.google.common.util.concurrent.l
        public void onFailure(Throwable th2) {
            k.this.f11057f.set(th2);
        }

        @Override // com.google.common.util.concurrent.l
        public void onSuccess(Object obj) {
            k.this.f11056e.set(true);
        }
    }

    private final class b implements n8.s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f11061a = 0;

        public b() {
        }

        @Override // n8.s
        public void a() throws IOException {
            Throwable th2 = (Throwable) k.this.f11057f.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        @Override // n8.s
        public int b(long j11) {
            return 0;
        }

        public void c() {
            if (this.f11061a == 2) {
                this.f11061a = 1;
            }
        }

        @Override // n8.s
        public boolean isReady() {
            return k.this.f11056e.get();
        }

        @Override // n8.s
        public int j(z7.u uVar, DecoderInputBuffer decoderInputBuffer, int i11) {
            int i12 = this.f11061a;
            if (i12 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            }
            if ((i11 & 2) != 0 || i12 == 0) {
                uVar.f127112b = k.this.f11054c.b(0).c(0);
                this.f11061a = 1;
                return -5;
            }
            if (!k.this.f11056e.get()) {
                return -3;
            }
            int length = k.this.f11055d.length;
            decoderInputBuffer.e(1);
            decoderInputBuffer.f9288f = 0L;
            if ((i11 & 4) == 0) {
                decoderInputBuffer.p(length);
                decoderInputBuffer.f9286d.put(k.this.f11055d, 0, length);
            }
            if ((i11 & 1) == 0) {
                this.f11061a = 2;
            }
            return -4;
        }
    }

    public k(Uri uri, String str, j jVar) {
        this.f11052a = uri;
        p7.u uVarP = new p7.u.b().y0(str).P();
        this.f11053b = jVar;
        this.f11054c = new n8.y(new t0(uVarP));
        this.f11055d = uri.toString().getBytes(StandardCharsets.UTF_8);
        this.f11056e = new AtomicBoolean();
        this.f11057f = new AtomicReference<>();
        this.f11058g = new ArrayList<>();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean c() {
        return !this.f11056e.get();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long d() {
        return this.f11056e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public void e(long j11) {
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public long f() {
        return this.f11056e.get() ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long g(long j11) {
        for (int i11 = 0; i11 < this.f11058g.size(); i11++) {
            this.f11058g.get(i11).c();
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public n8.y k() {
        return this.f11054c;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.g0
    public boolean l(o1 o1Var) {
        return !this.f11056e.get();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() {
    }

    @Override // androidx.media3.exoplayer.source.q
    public void o(long j11, boolean z11) {
    }

    public void p() {
        com.google.common.util.concurrent.s<?> sVar = this.f11059h;
        if (sVar != null) {
            sVar.cancel(false);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long r(r8.t[] tVarArr, boolean[] zArr, n8.s[] sVarArr, boolean[] zArr2, long j11) {
        for (int i11 = 0; i11 < tVarArr.length; i11++) {
            n8.s sVar = sVarArr[i11];
            if (sVar != null && (tVarArr[i11] == null || !zArr[i11])) {
                this.f11058g.remove(sVar);
                sVarArr[i11] = null;
            }
            if (sVarArr[i11] == null && tVarArr[i11] != null) {
                b bVar = new b();
                this.f11058g.add(bVar);
                sVarArr[i11] = bVar;
                zArr2[i11] = true;
            }
        }
        return j11;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(q.a aVar, long j11) {
        aVar.i(this);
        com.google.common.util.concurrent.s<?> sVarA = this.f11053b.a(new j.a(this.f11052a));
        this.f11059h = sVarA;
        com.google.common.util.concurrent.m.a(sVarA, new a(), com.google.common.util.concurrent.w.b());
    }

    @Override // androidx.media3.exoplayer.source.q
    public long m(long j11, z7.b0 b0Var) {
        return j11;
    }
}
