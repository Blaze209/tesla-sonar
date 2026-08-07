package gs;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class h extends fr.h<m, n, SubtitleDecoderException> implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f69521n;

    class a extends n {
        a() {
        }

        @Override // fr.f
        public void p() {
            h.this.r(this);
        }
    }

    protected h(String str) {
        super(new m[2], new n[2]);
        this.f69521n = str;
        u(1024);
    }

    protected abstract i A(byte[] bArr, int i11, boolean z11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fr.h
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final m g() {
        return new m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fr.h
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final n h() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fr.h
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException i(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // fr.h
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException j(m mVar, n nVar, boolean z11) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) ts.a.e(mVar.f39720c);
            nVar.q(mVar.f39722e, A(byteBuffer.array(), byteBuffer.limit(), z11), mVar.f69535i);
            nVar.g(Integer.MIN_VALUE);
            return null;
        } catch (SubtitleDecoderException e11) {
            return e11;
        }
    }

    @Override // gs.j
    public void c(long j11) {
    }
}
