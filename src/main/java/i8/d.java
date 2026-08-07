package i8;

import android.graphics.Bitmap;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.h;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.m2;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import p7.u;
import s7.j0;

/* JADX INFO: loaded from: classes3.dex */
public class d extends h {
    private int A;
    private int B;
    private u C;
    private i8.b D;
    private DecoderInputBuffer E;
    private ImageOutput F;
    private Bitmap G;
    private boolean H;
    private b I;
    private b J;
    private int K;
    private boolean L;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final i8.b.a f76201s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DecoderInputBuffer f76202t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final ArrayDeque<a> f76203u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f76204v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f76205w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private a f76206x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f76207y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f76208z;

    private static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f76209c = new a(-9223372036854775807L, -9223372036854775807L);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f76210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f76211b;

        public a(long j11, long j12) {
            this.f76210a = j11;
            this.f76211b = j12;
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f76212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f76213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap f76214c;

        public b(int i11, long j11) {
            this.f76212a = i11;
            this.f76213b = j11;
        }

        public long a() {
            return this.f76213b;
        }

        public Bitmap b() {
            return this.f76214c;
        }

        public int c() {
            return this.f76212a;
        }

        public boolean d() {
            return this.f76214c != null;
        }

        public void e(Bitmap bitmap) {
            this.f76214c = bitmap;
        }
    }

    public d(i8.b.a aVar, ImageOutput imageOutput) {
        super(4);
        this.f76201s = aVar;
        this.F = u0(imageOutput);
        this.f76202t = DecoderInputBuffer.s();
        this.f76206x = a.f76209c;
        this.f76203u = new ArrayDeque<>();
        this.f76208z = -9223372036854775807L;
        this.f76207y = -9223372036854775807L;
        this.A = 0;
        this.B = 1;
    }

    private void A0(long j11) {
        this.f76207y = j11;
        while (!this.f76203u.isEmpty() && j11 >= this.f76203u.peek().f76210a) {
            this.f76206x = this.f76203u.removeFirst();
        }
    }

    private void C0() {
        this.E = null;
        this.A = 0;
        this.f76208z = -9223372036854775807L;
        i8.b bVar = this.D;
        if (bVar != null) {
            bVar.release();
            this.D = null;
        }
    }

    private void D0(ImageOutput imageOutput) {
        this.F = u0(imageOutput);
    }

    private boolean E0() {
        boolean z11 = getState() == 2;
        int i11 = this.B;
        if (i11 == 0) {
            return z11;
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    private boolean q0(u uVar) {
        int iB = this.f76201s.b(uVar);
        return iB == m2.g(4) || iB == m2.g(3);
    }

    private Bitmap r0(int i11) {
        s7.a.j(this.G);
        int width = this.G.getWidth() / ((u) s7.a.j(this.C)).N;
        int height = this.G.getHeight() / ((u) s7.a.j(this.C)).O;
        int i12 = this.C.N;
        return Bitmap.createBitmap(this.G, (i11 % i12) * width, (i11 / i12) * height, width, height);
    }

    private boolean s0(long j11, long j12) throws ExoPlaybackException {
        if (this.G != null && this.I == null) {
            return false;
        }
        if (this.B == 0 && getState() != 2) {
            return false;
        }
        if (this.G == null) {
            s7.a.j(this.D);
            c cVarA = this.D.a();
            if (cVarA == null) {
                return false;
            }
            if (((c) s7.a.j(cVarA)).i()) {
                if (this.A == 3) {
                    C0();
                    s7.a.j(this.C);
                    y0();
                } else {
                    ((c) s7.a.j(cVarA)).o();
                    if (this.f76203u.isEmpty()) {
                        this.f76205w = true;
                    }
                }
                return false;
            }
            s7.a.k(cVarA.f76200e, "Non-EOS buffer came back from the decoder without bitmap.");
            this.G = cVarA.f76200e;
            ((c) s7.a.j(cVarA)).o();
        }
        if (!this.H || this.G == null || this.I == null) {
            return false;
        }
        s7.a.j(this.C);
        u uVar = this.C;
        int i11 = uVar.N;
        boolean z11 = ((i11 == 1 && uVar.O == 1) || i11 == -1 || uVar.O == -1) ? false : true;
        if (!this.I.d()) {
            b bVar = this.I;
            bVar.e(z11 ? r0(bVar.c()) : (Bitmap) s7.a.j(this.G));
        }
        if (!B0(j11, j12, (Bitmap) s7.a.j(this.I.b()), this.I.a())) {
            return false;
        }
        A0(((b) s7.a.j(this.I)).a());
        this.B = 3;
        if (!z11 || ((b) s7.a.j(this.I)).c() == (((u) s7.a.j(this.C)).O * ((u) s7.a.j(this.C)).N) - 1) {
            this.G = null;
        }
        this.I = this.J;
        this.J = null;
        return true;
    }

    private boolean t0(long j11) {
        if (this.H && this.I != null) {
            return false;
        }
        z7.u uVarU = U();
        i8.b bVar = this.D;
        if (bVar == null || this.A == 3 || this.f76204v) {
            return false;
        }
        if (this.E == null) {
            DecoderInputBuffer decoderInputBufferB = bVar.b();
            this.E = decoderInputBufferB;
            if (decoderInputBufferB == null) {
                return false;
            }
        }
        if (this.A == 2) {
            s7.a.j(this.E);
            this.E.n(4);
            ((i8.b) s7.a.j(this.D)).f(this.E);
            this.E = null;
            this.A = 3;
            return false;
        }
        int iN0 = n0(uVarU, this.E, 0);
        if (iN0 == -5) {
            this.C = (u) s7.a.j(uVarU.f127112b);
            this.L = true;
            this.A = 2;
            return true;
        }
        if (iN0 != -4) {
            if (iN0 == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.E.q();
        ByteBuffer byteBuffer = this.E.f9286d;
        boolean z11 = (byteBuffer != null && byteBuffer.remaining() > 0) || ((DecoderInputBuffer) s7.a.j(this.E)).i();
        if (z11) {
            ((DecoderInputBuffer) s7.a.j(this.E)).f9284b = this.C;
            ((i8.b) s7.a.j(this.D)).f((DecoderInputBuffer) s7.a.j(this.E));
            this.K = 0;
        }
        x0(j11, (DecoderInputBuffer) s7.a.j(this.E));
        if (((DecoderInputBuffer) s7.a.j(this.E)).i()) {
            this.f76204v = true;
            this.E = null;
            return false;
        }
        this.f76208z = Math.max(this.f76208z, ((DecoderInputBuffer) s7.a.j(this.E)).f9288f);
        if (z11) {
            this.E = null;
        } else {
            ((DecoderInputBuffer) s7.a.j(this.E)).f();
        }
        return !this.H;
    }

    private static ImageOutput u0(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.f10306a : imageOutput;
    }

    private boolean v0(b bVar) {
        return ((u) s7.a.j(this.C)).N == -1 || this.C.O == -1 || bVar.c() == (((u) s7.a.j(this.C)).O * this.C.N) - 1;
    }

    private void w0(int i11) {
        this.B = Math.min(this.B, i11);
    }

    private void x0(long j11, DecoderInputBuffer decoderInputBuffer) {
        boolean z11 = true;
        if (decoderInputBuffer.i()) {
            this.H = true;
            return;
        }
        b bVar = new b(this.K, decoderInputBuffer.f9288f);
        this.J = bVar;
        this.K++;
        if (!this.H) {
            long jA = bVar.a();
            boolean z12 = jA - 30000 <= j11 && j11 <= 30000 + jA;
            b bVar2 = this.I;
            boolean z13 = bVar2 != null && bVar2.a() <= j11 && j11 < jA;
            boolean zV0 = v0((b) s7.a.j(this.J));
            if (!z12 && !z13 && !zV0) {
                z11 = false;
            }
            this.H = z11;
            if (z13 && !z12) {
                return;
            }
        }
        this.I = this.J;
        this.J = null;
    }

    private boolean y0() throws ExoPlaybackException {
        if (!z0()) {
            return false;
        }
        if (!this.L) {
            return true;
        }
        if (!q0((u) s7.a.f(this.C))) {
            throw Q(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.C, 4005);
        }
        i8.b bVar = this.D;
        if (bVar != null) {
            bVar.release();
        }
        this.D = this.f76201s.a();
        this.L = false;
        return true;
    }

    protected boolean B0(long j11, long j12, Bitmap bitmap, long j13) {
        long j14 = j13 - j11;
        if (!E0() && j14 >= 30000) {
            return false;
        }
        this.F.onImageAvailable(j13 - this.f76206x.f76211b, bitmap);
        return true;
    }

    @Override // androidx.media3.exoplayer.l2
    public boolean a() {
        return this.f76205w;
    }

    @Override // androidx.media3.exoplayer.m2
    public int b(u uVar) {
        return this.f76201s.b(uVar);
    }

    @Override // androidx.media3.exoplayer.h
    protected void c0() {
        this.C = null;
        this.f76206x = a.f76209c;
        this.f76203u.clear();
        C0();
        this.F.a();
    }

    @Override // androidx.media3.exoplayer.l2
    public void d(long j11, long j12) throws ExoPlaybackException {
        if (this.f76205w) {
            return;
        }
        if (this.C == null) {
            z7.u uVarU = U();
            this.f76202t.f();
            int iN0 = n0(uVarU, this.f76202t, 2);
            if (iN0 != -5) {
                if (iN0 == -4) {
                    s7.a.h(this.f76202t.i());
                    this.f76204v = true;
                    this.f76205w = true;
                    return;
                }
                return;
            }
            this.C = (u) s7.a.j(uVarU.f127112b);
            this.L = true;
        }
        if (this.D != null || y0()) {
            try {
                j0.a("drainAndFeedDecoder");
                while (s0(j11, j12)) {
                }
                while (t0(j11)) {
                }
                j0.b();
            } catch (ImageDecoderException e11) {
                throw Q(e11, null, 4003);
            }
        }
    }

    @Override // androidx.media3.exoplayer.h
    protected void d0(boolean z11, boolean z12) {
        this.B = z12 ? 1 : 0;
    }

    @Override // androidx.media3.exoplayer.h
    protected void f0(long j11, boolean z11) {
        w0(1);
        this.f76205w = false;
        this.f76204v = false;
        this.G = null;
        this.I = null;
        this.J = null;
        this.H = false;
        this.E = null;
        i8.b bVar = this.D;
        if (bVar != null) {
            bVar.flush();
        }
        this.f76203u.clear();
    }

    @Override // androidx.media3.exoplayer.h
    protected void g0() {
        C0();
    }

    @Override // androidx.media3.exoplayer.l2, androidx.media3.exoplayer.m2
    public String getName() {
        return "ImageRenderer";
    }

    @Override // androidx.media3.exoplayer.h
    protected void i0() {
        C0();
        w0(1);
    }

    @Override // androidx.media3.exoplayer.l2
    public boolean isReady() {
        int i11 = this.B;
        if (i11 != 3) {
            return i11 == 0 && this.H;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.h, androidx.media3.exoplayer.j2.b
    public void k(int i11, Object obj) {
        if (i11 != 15) {
            super.k(i11, obj);
        } else {
            D0(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // androidx.media3.exoplayer.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void l0(p7.u[] r5, long r6, long r8, androidx.media3.exoplayer.source.r.b r10) {
        /*
            r4 = this;
            super.l0(r5, r6, r8, r10)
            r5 = r4
            i8.d$a r6 = r5.f76206x
            long r6 = r6.f76211b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 == 0) goto L37
            java.util.ArrayDeque<i8.d$a> r6 = r5.f76203u
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L2a
            long r6 = r5.f76208z
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L37
            long r2 = r5.f76207y
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L2a
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L2a
            goto L37
        L2a:
            java.util.ArrayDeque<i8.d$a> r6 = r5.f76203u
            i8.d$a r7 = new i8.d$a
            long r0 = r5.f76208z
            r7.<init>(r0, r8)
            r6.add(r7)
            return
        L37:
            i8.d$a r6 = new i8.d$a
            r6.<init>(r0, r8)
            r5.f76206x = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.d.l0(p7.u[], long, long, androidx.media3.exoplayer.source.r$b):void");
    }

    protected boolean z0() {
        return true;
    }
}
