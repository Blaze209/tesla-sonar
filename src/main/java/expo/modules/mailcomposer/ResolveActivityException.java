package expo.modules.mailcomposer;

import expo.modules.kotlin.exception.CodedException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/mailcomposer/ResolveActivityException;", "Lexpo/modules/kotlin/exception/CodedException;", "cause", "", "<init>", "(Ljava/lang/Throwable;)V", "expo-mail-composer_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResolveActivityException extends CodedException {
    /* JADX WARN: Multi-variable type inference failed */
    public ResolveActivityException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ ResolveActivityException(Throwable th2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : th2);
    }

    public ResolveActivityException(Throwable th2) {
        super("Could not check if mail can be opened", th2);
    }
}
