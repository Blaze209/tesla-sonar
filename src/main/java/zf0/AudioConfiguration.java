package zf0;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: zf0.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lzf0/c;", "", "", "sampleRateInHz", "channelConfig", "audioFormat", "bufferSizeInBytes", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "getChannelConfig", "c", "getAudioFormat", DateTokenConverter.CONVERTER_KEY, "getBufferSizeInBytes", "camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AudioConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int sampleRateInHz;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int channelConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int audioFormat;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int bufferSizeInBytes;

    public AudioConfiguration(int i11, int i12, int i13, int i14) {
        this.sampleRateInHz = i11;
        this.channelConfig = i12;
        this.audioFormat = i13;
        this.bufferSizeInBytes = i14;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getSampleRateInHz() {
        return this.sampleRateInHz;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioConfiguration)) {
            return false;
        }
        AudioConfiguration audioConfiguration = (AudioConfiguration) other;
        return this.sampleRateInHz == audioConfiguration.sampleRateInHz && this.channelConfig == audioConfiguration.channelConfig && this.audioFormat == audioConfiguration.audioFormat && this.bufferSizeInBytes == audioConfiguration.bufferSizeInBytes;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.sampleRateInHz) * 31) + Integer.hashCode(this.channelConfig)) * 31) + Integer.hashCode(this.audioFormat)) * 31) + Integer.hashCode(this.bufferSizeInBytes);
    }

    public String toString() {
        return "AudioConfiguration(sampleRateInHz=" + this.sampleRateInHz + ", channelConfig=" + this.channelConfig + ", audioFormat=" + this.audioFormat + ", bufferSizeInBytes=" + this.bufferSizeInBytes + ")";
    }
}
