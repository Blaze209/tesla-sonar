package expo.modules.kotlin.exception;

import expo.modules.core.interfaces.DoNotStrip;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/kotlin/exception/InvalidArgsNumberException;", "Lexpo/modules/kotlin/exception/CodedException;", "received", "", "expected", "required", "<init>", "(III)V", "expo-modules-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@DoNotStrip
public final class InvalidArgsNumberException extends CodedException {
    public /* synthetic */ InvalidArgsNumberException(int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, (i14 & 4) != 0 ? i12 : i13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InvalidArgsNumberException(int i11, int i12, int i13) {
        String str;
        if (i13 < i12) {
            str = "Received " + i11 + " arguments, but " + i12 + " was expected and at least " + i13 + " is required";
        } else {
            str = "Received " + i11 + " arguments, but " + i12 + " was expected";
        }
        super(str, null, 2, null);
    }
}
