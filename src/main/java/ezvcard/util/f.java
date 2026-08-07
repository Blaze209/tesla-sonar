package ezvcard.util;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class f {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
