package sa;

import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\n\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lya/c;", "driver", "", "fileName", "Lsa/b;", "b", "(Lya/c;Ljava/lang/String;)Lsa/b;", "", "maxNumOfReaders", "maxNumOfWriters", "a", "(Lya/c;Ljava/lang/String;II)Lsa/b;", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h {
    public static final b a(ya.c driver, String fileName, int i11, int i12) {
        s.k(driver, "driver");
        s.k(fileName, "fileName");
        return new g(driver, fileName, i11, i12);
    }

    public static final b b(ya.c driver, String fileName) {
        s.k(driver, "driver");
        s.k(fileName, "fileName");
        return new g(driver, fileName);
    }
}
