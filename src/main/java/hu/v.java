package hu;

import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes5.dex */
final class v implements k {
    v() {
    }

    @Override // hu.k
    public final boolean a(Object obj, File file, File file2) {
        try {
            return !((Boolean) com.google.android.play.core.splitinstall.internal.c.f(Class.forName("dalvik.system.DexFile"), "isDexOptNeeded", Boolean.class, String.class, file.getPath())).booleanValue();
        } catch (ClassNotFoundException unused) {
            Log.e("SplitCompat", "Unexpected missing dalvik.system.DexFile.");
            return false;
        }
    }
}
