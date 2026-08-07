package sn0;

import ch.qos.logback.core.joran.action.Action;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.io.FileSystemException;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsn0/q;", "Lkotlin/io/FileSystemException;", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "<init>", "(Ljava/io/File;)V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(File file) {
        super(file, null, null, 6, null);
        s.k(file, "file");
    }
}
