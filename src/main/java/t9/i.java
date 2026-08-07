package t9;

import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends y7.f<n, o, SubtitleDecoderException> implements k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f112962o;

    class a extends o {
        a() {
        }

        @Override // y7.e
        public void o() {
            i.this.t(this);
        }
    }

    protected i(String str) {
        super(new n[2], new o[2]);
        this.f112962o = str;
        w(1024);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y7.f
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException k(Throwable th2) {
        return new SubtitleDecoderException("Unexpected decode error", th2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y7.f
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final SubtitleDecoderException l(n nVar, o oVar, boolean z11) {
        try {
            ByteBuffer byteBuffer = (ByteBuffer) s7.a.f(nVar.f9286d);
            oVar.p(nVar.f9288f, C(byteBuffer.array(), byteBuffer.limit(), z11), nVar.f112978j);
            oVar.f125195d = false;
            return null;
        } catch (SubtitleDecoderException e11) {
            return e11;
        }
    }

    protected abstract j C(byte[] bArr, int i11, boolean z11);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y7.f
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final n i() {
        return new n();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y7.f
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final o j() {
        return new a();
    }

    @Override // t9.k
    public void c(long j11) {
    }
}
