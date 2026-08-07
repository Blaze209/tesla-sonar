package org.webrtc;

/* JADX INFO: loaded from: classes10.dex */
public class MediaStreamTrack {
    public static final String AUDIO_TRACK_KIND = "audio";
    public static final String VIDEO_TRACK_KIND = "video";
    private long nativeTrack;

    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);

        private final int nativeIndex;

        MediaType(int i11) {
            this.nativeIndex = i11;
        }

        @CalledByNative("MediaType")
        static MediaType fromNativeIndex(int i11) {
            for (MediaType mediaType : values()) {
                if (mediaType.getNative() == i11) {
                    return mediaType;
                }
            }
            throw new IllegalArgumentException("Unknown native media type: " + i11);
        }

        @CalledByNative("MediaType")
        int getNative() {
            return this.nativeIndex;
        }
    }

    public enum State {
        LIVE,
        ENDED;

        @CalledByNative("State")
        static State fromNativeIndex(int i11) {
            return values()[i11];
        }
    }

    public MediaStreamTrack(long j11) {
        if (j11 == 0) {
            throw new IllegalArgumentException("nativeTrack may not be null");
        }
        this.nativeTrack = j11;
    }

    private void checkMediaStreamTrackExists() {
        if (this.nativeTrack == 0) {
            throw new IllegalStateException("MediaStreamTrack has been disposed.");
        }
    }

    static MediaStreamTrack createMediaStreamTrack(long j11) {
        if (j11 == 0) {
            return null;
        }
        String strNativeGetKind = nativeGetKind(j11);
        if (strNativeGetKind.equals(AUDIO_TRACK_KIND)) {
            return new AudioTrack(j11);
        }
        if (strNativeGetKind.equals(VIDEO_TRACK_KIND)) {
            return new VideoTrack(j11);
        }
        return null;
    }

    private static native boolean nativeGetEnabled(long j11);

    private static native String nativeGetId(long j11);

    private static native String nativeGetKind(long j11);

    private static native State nativeGetState(long j11);

    private static native boolean nativeSetEnabled(long j11, boolean z11);

    public void dispose() {
        checkMediaStreamTrackExists();
        JniCommon.nativeReleaseRef(this.nativeTrack);
        this.nativeTrack = 0L;
    }

    public boolean enabled() {
        checkMediaStreamTrackExists();
        return nativeGetEnabled(this.nativeTrack);
    }

    long getNativeMediaStreamTrack() {
        checkMediaStreamTrackExists();
        return this.nativeTrack;
    }

    public String id() {
        checkMediaStreamTrackExists();
        return nativeGetId(this.nativeTrack);
    }

    public String kind() {
        checkMediaStreamTrackExists();
        return nativeGetKind(this.nativeTrack);
    }

    public boolean setEnabled(boolean z11) {
        checkMediaStreamTrackExists();
        return nativeSetEnabled(this.nativeTrack, z11);
    }

    public State state() {
        checkMediaStreamTrackExists();
        return nativeGetState(this.nativeTrack);
    }
}
