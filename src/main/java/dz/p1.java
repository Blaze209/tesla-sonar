package dz;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Ldz/p1;", "Ldz/c;", "", "id", "message", "", "wasVideoRecorded", "", "cause", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Throwable;)V", DateTokenConverter.CONVERTER_KEY, "Z", "()Z", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class p1 extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean wasVideoRecorded;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(String id2, String message, boolean z11, Throwable th2) {
        super("capture", id2, message, th2);
        p013kotlin.jvm.internal.s.k(id2, "id");
        p013kotlin.jvm.internal.s.k(message, "message");
        this.wasVideoRecorded = z11;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getWasVideoRecorded() {
        return this.wasVideoRecorded;
    }
}
