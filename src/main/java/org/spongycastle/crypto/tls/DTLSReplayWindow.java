package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes10.dex */
class DTLSReplayWindow {
    private static final long VALID_SEQ_MASK = 281474976710655L;
    private static final long WINDOW_SIZE = 64;
    private long latestConfirmedSeq = -1;
    private long bitmap = 0;

    DTLSReplayWindow() {
    }

    void reportAuthenticated(long j11) {
        if ((VALID_SEQ_MASK & j11) != j11) {
            throw new IllegalArgumentException("'seq' out of range");
        }
        long j12 = this.latestConfirmedSeq;
        if (j11 <= j12) {
            long j13 = j12 - j11;
            if (j13 < 64) {
                this.bitmap |= 1 << ((int) j13);
                return;
            }
            return;
        }
        long j14 = j11 - j12;
        if (j14 >= 64) {
            this.bitmap = 1L;
        } else {
            this.bitmap = (this.bitmap << ((int) j14)) | 1;
        }
        this.latestConfirmedSeq = j11;
    }

    void reset() {
        this.latestConfirmedSeq = -1L;
        this.bitmap = 0L;
    }

    boolean shouldDiscard(long j11) {
        if ((VALID_SEQ_MASK & j11) != j11) {
            return true;
        }
        long j12 = this.latestConfirmedSeq;
        if (j11 > j12) {
            return false;
        }
        long j13 = j12 - j11;
        return j13 >= 64 || (this.bitmap & (1 << ((int) j13))) != 0;
    }
}
