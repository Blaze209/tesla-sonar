package dz;

import ezvcard.property.Kind;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldz/n1;", "Ldz/c;", "", "format", "<init>", "(Ljava/lang/String;)V", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n1 extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(String format) {
        super(Kind.DEVICE, "pixel-format-not-supported", "The pixelFormat " + format + " is not supported on the given Camera Device!", null, 8, null);
        p013kotlin.jvm.internal.s.k(format, "format");
    }
}
