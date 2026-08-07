package hu;

import com.google.android.play.core.splitinstall.internal.zzbh;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
final class q implements h {
    public static void c(ClassLoader classLoader, Set set, p pVar) {
        if (set.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((File) it.next()).getParentFile());
        }
        Object objC = m.c(classLoader);
        com.google.android.play.core.splitinstall.internal.b bVarB = com.google.android.play.core.splitinstall.internal.c.b(objC, "nativeLibraryDirectories", List.class);
        synchronized (gu.h.class) {
            ArrayList arrayList = new ArrayList((Collection) bVarB.a());
            hashSet.removeAll(arrayList);
            arrayList.addAll(hashSet);
            bVarB.c(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        Object[] objArrA = pVar.a(objC, new ArrayList(hashSet), null, arrayList2);
        if (arrayList2.isEmpty()) {
            synchronized (gu.h.class) {
                com.google.android.play.core.splitinstall.internal.c.a(objC, "nativeLibraryPathElements", Object.class).e(Arrays.asList(objArrA));
            }
            return;
        }
        zzbh zzbhVar = new zzbh("Error in makePathElements");
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(zzbhVar, (IOException) arrayList2.get(i11));
            } catch (Exception unused) {
            }
        }
        throw zzbhVar;
    }

    public static boolean d(ClassLoader classLoader, File file, File file2, boolean z11, String str) {
        return m.d(classLoader, file, file2, z11, new n(), "zip", new j());
    }
}
