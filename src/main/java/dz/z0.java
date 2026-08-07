package dz;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldz/z0;", "Ldz/c;", "Lfz/y;", "mode", "<init>", "(Lfz/y;)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z0 extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(fz.y mode) {
        super("format", "invalid-video-stabilization-mode", "The given format does not support the videoStabilizationMode \"" + mode.getUnionValue() + "\"! Select a format that contains " + mode.getUnionValue() + " in `format.supportedVideoStabilizationModes`.", null, 8, null);
        p013kotlin.jvm.internal.s.k(mode, "mode");
    }
}
