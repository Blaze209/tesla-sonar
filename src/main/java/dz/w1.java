package dz;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldz/w1;", "Ldz/p1;", "", "wasVideoRecorded", "", "cause", "<init>", "(ZLjava/lang/Throwable;)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w1 extends p1 {
    public w1(boolean z11, Throwable th2) {
        super("recorder-error", "An error occurred while recording a video! " + d.b(z11) + " " + (th2 != null ? th2.getMessage() : null), z11, th2);
    }
}
