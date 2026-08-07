package cq0;

import java.io.File;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public class b extends a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Comparator<File> f58902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator<File> f58903b;

    static {
        b bVar = new b();
        f58902a = bVar;
        f58903b = new c(bVar);
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(File file, File file2) {
        long jLastModified = file.lastModified() - file2.lastModified();
        if (jLastModified < 0) {
            return -1;
        }
        return jLastModified > 0 ? 1 : 0;
    }

    @Override // cq0.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
