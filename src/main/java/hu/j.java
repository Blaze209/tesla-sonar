package hu;

import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
final class j implements k {
    j() {
    }

    @Override // hu.k
    public final boolean a(Object obj, File file, File file2) {
        return new File((String) com.google.android.play.core.splitinstall.internal.c.g(obj.getClass(), "optimizedPathFor", String.class, File.class, file, File.class, file2)).exists();
    }
}
