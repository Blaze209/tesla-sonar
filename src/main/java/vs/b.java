package vs;

import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.u0;
import java.nio.ByteBuffer;
import ts.d0;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class b extends com.google.android.exoplayer2.f {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final DecoderInputBuffer f119771p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d0 f119772q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f119773r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private a f119774s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f119775t;

    public b() {
        super(6);
        this.f119771p = new DecoderInputBuffer(1);
        this.f119772q = new d0();
    }

    private float[] a0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f119772q.S(byteBuffer.array(), byteBuffer.limit());
        this.f119772q.U(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i11 = 0; i11 < 3; i11++) {
            fArr[i11] = Float.intBitsToFloat(this.f119772q.u());
        }
        return fArr;
    }

    private void b0() {
        a aVar = this.f119774s;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // com.google.android.exoplayer2.f
    protected void O() {
        b0();
    }

    @Override // com.google.android.exoplayer2.f
    protected void Q(long j11, boolean z11) {
        this.f119775t = Long.MIN_VALUE;
        b0();
    }

    @Override // com.google.android.exoplayer2.f
    protected void W(u0[] u0VarArr, long j11, long j12) {
        this.f119773r = j12;
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean a() {
        return h();
    }

    @Override // com.google.android.exoplayer2.a2
    public int b(u0 u0Var) {
        return "application/x-camera-motion".equals(u0Var.f40712l) ? a2.g(4) : a2.g(0);
    }

    @Override // com.google.android.exoplayer2.z1
    public void d(long j11, long j12) {
        while (!h() && this.f119775t < 100000 + j11) {
            this.f119771p.f();
            if (X(J(), this.f119771p, 0) != -4 || this.f119771p.k()) {
                return;
            }
            DecoderInputBuffer decoderInputBuffer = this.f119771p;
            this.f119775t = decoderInputBuffer.f39722e;
            if (this.f119774s != null && !decoderInputBuffer.j()) {
                this.f119771p.r();
                float[] fArrA0 = a0((ByteBuffer) p0.j(this.f119771p.f39720c));
                if (fArrA0 != null) {
                    ((a) p0.j(this.f119774s)).b(this.f119775t - this.f119773r, fArrA0);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.z1, com.google.android.exoplayer2.a2
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.google.android.exoplayer2.z1
    public boolean isReady() {
        return true;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.w1.b
    public void k(int i11, Object obj) {
        if (i11 == 8) {
            this.f119774s = (a) obj;
        } else {
            super.k(i11, obj);
        }
    }
}
