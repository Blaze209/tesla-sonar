package sn0;

import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0006\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\b\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Ljava/io/File;", "Lsn0/g;", "direction", "Lsn0/f;", "s", "(Ljava/io/File;Lsn0/g;)Lsn0/f;", "u", "(Ljava/io/File;)Lsn0/f;", "t", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
class l extends k {
    public static final f s(File file, g direction) {
        s.k(file, "<this>");
        s.k(direction, "direction");
        return new f(file, direction);
    }

    public static final f t(File file) {
        s.k(file, "<this>");
        return s(file, g.BOTTOM_UP);
    }

    public static final f u(File file) {
        s.k(file, "<this>");
        return s(file, g.TOP_DOWN);
    }
}
