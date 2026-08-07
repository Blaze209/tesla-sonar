package expo.modules.imagepicker;

import android.net.Uri;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.kotlin.exception.CodedException;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lexpo/modules/imagepicker/FailedToWriteExifDataToFileException;", "Lexpo/modules/kotlin/exception/CodedException;", Action.FILE_ATTRIBUTE, "Ljava/io/File;", "cause", "", "<init>", "(Ljava/io/File;Ljava/lang/Throwable;)V", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FailedToWriteExifDataToFileException extends CodedException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FailedToWriteExifDataToFileException(File file, Throwable cause) {
        super("Failed to write EXIF data to file '" + Uri.fromFile(file), cause);
        s.k(file, "file");
        s.k(cause, "cause");
    }
}
