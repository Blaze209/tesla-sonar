package dz;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldz/v1;", "Ldz/c;", "", "cause", "<init>", "(Ljava/lang/Throwable;)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v1 extends c {
    public v1(Throwable th2) {
        String message;
        super("unknown", "unknown", (th2 == null || (message = th2.getMessage()) == null) ? "An unknown camera error occured." : message, th2);
    }
}
