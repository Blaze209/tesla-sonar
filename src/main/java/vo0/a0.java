package vo0;

import java.lang.annotation.Annotation;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001b\n\u0002\b\u0005\u001a;\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001aq\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00040\u00042\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"", "T", "", "serialName", "", "values", "Lro0/d;", "b", "(Ljava/lang/String;[Ljava/lang/Enum;)Lro0/d;", "names", "", "entryAnnotations", "classAnnotations", "a", "(Ljava/lang/String;[Ljava/lang/Enum;[Ljava/lang/String;[[Ljava/lang/annotation/Annotation;[Ljava/lang/annotation/Annotation;)Lro0/d;", "kotlinx-serialization-core"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class a0 {
    public static final <T extends Enum<T>> ro0.d<T> a(String serialName, T[] values, String[] names, Annotation[][] entryAnnotations, Annotation[] annotationArr) {
        p013kotlin.jvm.internal.s.k(serialName, "serialName");
        p013kotlin.jvm.internal.s.k(values, "values");
        p013kotlin.jvm.internal.s.k(names, "names");
        p013kotlin.jvm.internal.s.k(entryAnnotations, "entryAnnotations");
        x xVar = new x(serialName, values.length);
        if (annotationArr != null) {
            for (Annotation annotation : annotationArr) {
                xVar.w(annotation);
            }
        }
        int length = values.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            T t11 = values[i11];
            int i13 = i12 + 1;
            String strName = (String) p013kotlin.collections.n.x0(names, i12);
            if (strName == null) {
                strName = t11.name();
            }
            m1.p(xVar, strName, false, 2, null);
            Annotation[] annotationArr2 = (Annotation[]) p013kotlin.collections.n.x0(entryAnnotations, i12);
            if (annotationArr2 != null) {
                for (Annotation annotation2 : annotationArr2) {
                    xVar.v(annotation2);
                }
            }
            i11++;
            i12 = i13;
        }
        return new z(serialName, values, xVar);
    }

    public static final <T extends Enum<T>> ro0.d<T> b(String serialName, T[] values) {
        p013kotlin.jvm.internal.s.k(serialName, "serialName");
        p013kotlin.jvm.internal.s.k(values, "values");
        return new z(serialName, values);
    }
}
