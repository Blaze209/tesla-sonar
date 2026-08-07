package p0;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.q2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class z0 {
    public static void a(@NonNull Collection<Integer> collection, int i11) {
        u5.h.b(collection.contains(Integer.valueOf(i11)), String.format(Locale.US, "Effects target %s is not in the supported list %s.", b(i11), c(collection)));
    }

    @NonNull
    public static String b(int i11) {
        ArrayList arrayList = new ArrayList();
        if ((i11 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i11 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i11 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        return q2.a("|", arrayList);
    }

    @NonNull
    private static String c(@NonNull Collection<Integer> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(b(it.next().intValue()));
        }
        return "[" + q2.a(", ", arrayList) + "]";
    }

    public static int d(int i11) {
        int i12 = 0;
        while (i11 != 0) {
            i12 += i11 & 1;
            i11 >>= 1;
        }
        return i12;
    }

    public static boolean e(int i11, int i12) {
        return (i11 & i12) == i12;
    }
}
