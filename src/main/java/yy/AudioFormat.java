package yy;

import p013kotlin.Metadata;

/* JADX INFO: renamed from: yy.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0013\u0010\f¨\u0006\u0015"}, d2 = {"Lyy/a;", "", "", "bitsPerSample", "sampleRate", "numberOfChannels", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AudioFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int bitsPerSample;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int sampleRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int numberOfChannels;

    public AudioFormat(int i11, int i12, int i13) {
        this.bitsPerSample = i11;
        this.sampleRate = i12;
        this.numberOfChannels = i13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getBitsPerSample() {
        return this.bitsPerSample;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNumberOfChannels() {
        return this.numberOfChannels;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSampleRate() {
        return this.sampleRate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioFormat)) {
            return false;
        }
        AudioFormat audioFormat = (AudioFormat) other;
        return this.bitsPerSample == audioFormat.bitsPerSample && this.sampleRate == audioFormat.sampleRate && this.numberOfChannels == audioFormat.numberOfChannels;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.bitsPerSample) * 31) + Integer.hashCode(this.sampleRate)) * 31) + Integer.hashCode(this.numberOfChannels);
    }

    public String toString() {
        return "AudioFormat(bitsPerSample=" + this.bitsPerSample + ", sampleRate=" + this.sampleRate + ", numberOfChannels=" + this.numberOfChannels + ")";
    }
}
