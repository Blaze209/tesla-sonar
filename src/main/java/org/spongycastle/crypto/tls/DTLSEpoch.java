package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes10.dex */
class DTLSEpoch {
    private final TlsCipher cipher;
    private final int epoch;
    private final DTLSReplayWindow replayWindow = new DTLSReplayWindow();
    private long sequenceNumber = 0;

    DTLSEpoch(int i11, TlsCipher tlsCipher) {
        if (i11 < 0) {
            throw new IllegalArgumentException("'epoch' must be >= 0");
        }
        if (tlsCipher == null) {
            throw new IllegalArgumentException("'cipher' cannot be null");
        }
        this.epoch = i11;
        this.cipher = tlsCipher;
    }

    long allocateSequenceNumber() {
        long j11 = this.sequenceNumber;
        this.sequenceNumber = 1 + j11;
        return j11;
    }

    TlsCipher getCipher() {
        return this.cipher;
    }

    int getEpoch() {
        return this.epoch;
    }

    DTLSReplayWindow getReplayWindow() {
        return this.replayWindow;
    }

    long getSequenceNumber() {
        return this.sequenceNumber;
    }
}
