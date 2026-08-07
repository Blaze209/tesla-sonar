package v8;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.m2;
import java.nio.ByteBuffer;
import p7.u;
import s7.c0;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends androidx.media3.exoplayer.h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final DecoderInputBuffer f118328s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final c0 f118329t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private a f118330u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f118331v;

    public b() {
        super(6);
        this.f118328s = new DecoderInputBuffer(1);
        this.f118329t = new c0();
    }

    private float[] q0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.f118329t.Z(byteBuffer.array(), byteBuffer.limit());
        this.f118329t.b0(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i11 = 0; i11 < 3; i11++) {
            fArr[i11] = Float.intBitsToFloat(this.f118329t.z());
        }
        return fArr;
    }

    private void r0() {
        a aVar = this.f118330u;
        if (aVar != null) {
            aVar.e();
        }
    }

    @Override // androidx.media3.exoplayer.l2
    public boolean a() {
        return h();
    }

    @Override // androidx.media3.exoplayer.m2
    public int b(u uVar) {
        return "application/x-camera-motion".equals(uVar.f101544o) ? m2.g(4) : m2.g(0);
    }

    @Override // androidx.media3.exoplayer.h
    protected void c0() {
        r0();
    }

    @Override // androidx.media3.exoplayer.l2
    public void d(long j11, long j12) {
        while (!h() && this.f118331v < 100000 + j11) {
            this.f118328s.f();
            if (n0(U(), this.f118328s, 0) != -4 || this.f118328s.i()) {
                return;
            }
            long j13 = this.f118328s.f9288f;
            this.f118331v = j13;
            boolean z11 = j13 < W();
            if (this.f118330u != null && !z11) {
                this.f118328s.q();
                float[] fArrQ0 = q0((ByteBuffer) q0.l(this.f118328s.f9286d));
                if (fArrQ0 != null) {
                    ((a) q0.l(this.f118330u)).b(this.f118331v - Z(), fArrQ0);
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.h
    protected void f0(long j11, boolean z11) {
        this.f118331v = Long.MIN_VALUE;
        r0();
    }

    @Override // androidx.media3.exoplayer.l2, androidx.media3.exoplayer.m2
    public String getName() {
        return "CameraMotionRenderer";
    }

    @Override // androidx.media3.exoplayer.l2
    public boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.h, androidx.media3.exoplayer.j2.b
    public void k(int i11, Object obj) {
        if (i11 == 8) {
            this.f118330u = (a) obj;
        } else {
            super.k(i11, obj);
        }
    }
}
