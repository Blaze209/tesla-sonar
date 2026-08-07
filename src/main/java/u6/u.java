package u6;

import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ljava/io/File;", Action.FILE_ATTRIBUTE, "Lu6/s;", "a", "(Ljava/io/File;)Lu6/s;", "datastore-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class u {
    public static final s a(File file) {
        p013kotlin.jvm.internal.s.k(file, "file");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        p013kotlin.jvm.internal.s.j(absolutePath, "file.canonicalFile.absolutePath");
        return t.a(absolutePath);
    }
}
