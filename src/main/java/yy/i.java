package yy;

import org.webrtc.ExternalAudioProcessingFactory;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR*\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"Lyy/i;", "", "Lyy/b;", "capturePostProcessor", "renderPreProcessor", "", "bypassRenderPreProcessing", "bypassCapturePostProcessing", "<init>", "(Lyy/b;Lyy/b;ZZ)V", "Lorg/webrtc/ExternalAudioProcessingFactory;", "a", "Lorg/webrtc/ExternalAudioProcessingFactory;", "()Lorg/webrtc/ExternalAudioProcessingFactory;", "externalAudioProcessor", "value", "b", "Z", "getBypassCapturePostProcessing", "()Z", "setBypassCapturePostProcessing", "(Z)V", "c", "getBypassRenderPreProcessing", "setBypassRenderPreProcessing", "livekit_react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ExternalAudioProcessingFactory externalAudioProcessor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean bypassCapturePostProcessing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean bypassRenderPreProcessing;

    public i(b bVar, b bVar2, boolean z11, boolean z12) {
        this.externalAudioProcessor = new ExternalAudioProcessingFactory();
        this.bypassCapturePostProcessing = z12;
        this.bypassRenderPreProcessing = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ExternalAudioProcessingFactory getExternalAudioProcessor() {
        return this.externalAudioProcessor;
    }

    public /* synthetic */ i(b bVar, b bVar2, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : bVar, (i11 & 2) != 0 ? null : bVar2, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12);
    }
}
