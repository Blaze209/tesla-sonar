package org.webrtc;

/* JADX INFO: loaded from: classes10.dex */
public class FrameCryptor {
    private long nativeFrameCryptor;
    private long observerPtr = 0;

    public enum FrameCryptionState {
        NEW,
        OK,
        ENCRYPTIONFAILED,
        DECRYPTIONFAILED,
        MISSINGKEY,
        KEYRATCHETED,
        INTERNALERROR;

        @CalledByNative("FrameCryptionState")
        static FrameCryptionState fromNativeIndex(int i11) {
            return values()[i11];
        }
    }

    public interface Observer {
        @CalledByNative("Observer")
        void onFrameCryptionStateChanged(String str, FrameCryptionState frameCryptionState);
    }

    @CalledByNative
    public FrameCryptor(long j11) {
        this.nativeFrameCryptor = j11;
    }

    private void checkFrameCryptorExists() {
        if (this.nativeFrameCryptor == 0) {
            throw new IllegalStateException("FrameCryptor has been disposed.");
        }
    }

    private static native int nativeGetKeyIndex(long j11);

    private static native boolean nativeIsEnabled(long j11);

    private static native void nativeSetEnabled(long j11, boolean z11);

    private static native void nativeSetKeyIndex(long j11, int i11);

    private static native long nativeSetObserver(long j11, Observer observer);

    private static native void nativeUnSetObserver(long j11);

    public void dispose() {
        checkFrameCryptorExists();
        nativeUnSetObserver(this.nativeFrameCryptor);
        JniCommon.nativeReleaseRef(this.nativeFrameCryptor);
        this.nativeFrameCryptor = 0L;
        long j11 = this.observerPtr;
        if (j11 != 0) {
            JniCommon.nativeReleaseRef(j11);
            this.observerPtr = 0L;
        }
    }

    public int getKeyIndex() {
        checkFrameCryptorExists();
        return nativeGetKeyIndex(this.nativeFrameCryptor);
    }

    public long getNativeFrameCryptor() {
        return this.nativeFrameCryptor;
    }

    public boolean isEnabled() {
        checkFrameCryptorExists();
        return nativeIsEnabled(this.nativeFrameCryptor);
    }

    public void setEnabled(boolean z11) {
        checkFrameCryptorExists();
        nativeSetEnabled(this.nativeFrameCryptor, z11);
    }

    public void setKeyIndex(int i11) {
        checkFrameCryptorExists();
        nativeSetKeyIndex(this.nativeFrameCryptor, i11);
    }

    public void setObserver(Observer observer) {
        checkFrameCryptorExists();
        nativeSetObserver(this.nativeFrameCryptor, observer);
        long j11 = this.observerPtr;
        if (j11 != 0) {
            JniCommon.nativeReleaseRef(j11);
            this.observerPtr = 0L;
        }
    }
}
