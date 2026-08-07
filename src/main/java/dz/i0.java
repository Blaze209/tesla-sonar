package dz;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldz/i0;", "Ldz/c;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Throwable throwable) {
        super("capture", "file-io-error", "An unexpected File IO error occurred! Error: " + throwable.getMessage() + ".", throwable);
        p013kotlin.jvm.internal.s.k(throwable, "throwable");
    }
}
