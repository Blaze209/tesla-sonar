package nz;

import java.util.Collection;

/* JADX INFO: loaded from: classes6.dex */
public class e {
    private static String a(Collection collection) {
        StringBuilder sb2 = new StringBuilder();
        Object[] array = collection.toArray();
        for (int i11 = 0; i11 < array.length; i11++) {
            if (i11 != 0) {
                if (i11 < array.length - 1) {
                    sb2.append(", ");
                } else if (i11 == array.length - 1) {
                    sb2.append(" or ");
                }
            }
            sb2.append(array[i11].toString());
        }
        return sb2.toString();
    }

    public static String b(jz.d dVar, Collection<jz.d> collection) {
        return "Unsupported JWE encryption method " + dVar + ", must be " + a(collection);
    }

    public static String c(jz.h hVar, Collection<jz.h> collection) {
        return "Unsupported JWE algorithm " + hVar + ", must be " + a(collection);
    }

    public static String d(jz.o oVar, Collection<jz.o> collection) {
        return "Unsupported JWS algorithm " + oVar + ", must be " + a(collection);
    }
}
