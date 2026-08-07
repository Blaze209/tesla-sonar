package i8;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.image.ImageDecoderException;
import p7.u;

/* JADX INFO: loaded from: classes3.dex */
public interface b extends y7.d<DecoderInputBuffer, c, ImageDecoderException> {

    public interface a {
        b a();

        int b(u uVar);
    }

    @Override // 
    c a();

    void f(DecoderInputBuffer decoderInputBuffer);
}
