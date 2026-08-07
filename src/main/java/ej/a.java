package ej;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
class a {
    a() {
    }

    public boolean a(File file) {
        return file.exists();
    }

    public File b(String str) {
        return new File(str);
    }

    public long c(File file) {
        return file.length();
    }
}
