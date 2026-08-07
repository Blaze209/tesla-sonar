package fr;

import com.google.android.exoplayer2.decoder.DecoderException;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface d<I, O, E extends DecoderException> {
    O a();

    I b();

    void d(I i11);

    void flush();

    void release();
}
