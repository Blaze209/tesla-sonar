package hu;

import android.util.Log;
import com.google.android.play.core.splitinstall.internal.zzbh;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class m implements h {
    static Object c(ClassLoader classLoader) {
        return com.google.android.play.core.splitinstall.internal.c.b(classLoader, "pathList", Object.class).a();
    }

    static boolean d(ClassLoader classLoader, File file, File file2, boolean z11, l lVar, String str, k kVar) {
        ArrayList arrayList = new ArrayList();
        Object objC = c(classLoader);
        com.google.android.play.core.splitinstall.internal.a aVarA = com.google.android.play.core.splitinstall.internal.c.a(objC, "dexElements", Object.class);
        List listAsList = Arrays.asList((Object[]) aVarA.a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList2.add((File) com.google.android.play.core.splitinstall.internal.c.b(it.next(), str, File.class).a());
        }
        if (arrayList2.contains(file2)) {
            return true;
        }
        if (!z11 && !kVar.a(objC, file2, file)) {
            Log.w("SplitCompat", "Should be optimized ".concat(String.valueOf(file2.getPath())));
            return false;
        }
        aVarA.d(Arrays.asList(lVar.a(objC, new ArrayList(Collections.singleton(file2)), file, arrayList)));
        if (arrayList.isEmpty()) {
            return true;
        }
        zzbh zzbhVar = new zzbh("DexPathList.makeDexElement failed");
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            IOException iOException = (IOException) arrayList.get(i11);
            Log.e("SplitCompat", "DexPathList.makeDexElement failed", iOException);
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, iOException);
            } catch (Exception unused) {
            }
        }
        com.google.android.play.core.splitinstall.internal.c.a(objC, "dexElementsSuppressedExceptions", IOException.class).d(arrayList);
        throw zzbhVar;
    }
}
