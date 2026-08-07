package org.spongycastle.asn1;

import java.io.InputStream;

/* JADX INFO: loaded from: classes10.dex */
abstract class LimitedInputStream extends InputStream {
    protected final InputStream _in;
    private int _limit;

    LimitedInputStream(InputStream inputStream, int i11) {
        this._in = inputStream;
        this._limit = i11;
    }

    int getRemaining() {
        return this._limit;
    }

    protected void setParentEofDetect(boolean z11) {
        InputStream inputStream = this._in;
        if (inputStream instanceof IndefiniteLengthInputStream) {
            ((IndefiniteLengthInputStream) inputStream).setEofOn00(z11);
        }
    }
}
