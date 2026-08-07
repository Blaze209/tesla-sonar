package sn0;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "", "a", "(Ljava/lang/String;)I", "Ljava/io/File;", "Lsn0/e;", "b", "(Ljava/io/File;)Lsn0/e;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/io/FilesKt")
class i {
    private static final int a(String str) {
        int iU0;
        char c11 = File.separatorChar;
        int iU1 = t.u0(str, c11, 0, false, 4, null);
        if (iU1 == 0) {
            if (str.length() <= 1 || str.charAt(1) != c11 || (iU0 = t.u0(str, c11, 2, false, 4, null)) < 0) {
                return 1;
            }
            int iU2 = t.u0(str, c11, iU0 + 1, false, 4, null);
            return iU2 >= 0 ? iU2 + 1 : str.length();
        }
        if (iU1 > 0 && str.charAt(iU1 - 1) == ':') {
            return iU1 + 1;
        }
        if (iU1 == -1 && t.l0(str, CoreConstants.COLON_CHAR, false, 2, null)) {
            return str.length();
        }
        return 0;
    }

    public static final FilePathComponents b(File file) {
        List listM;
        s.k(file, "<this>");
        String path = file.getPath();
        s.h(path);
        int iA = a(path);
        String strSubstring = path.substring(0, iA);
        s.j(strSubstring, "substring(...)");
        String strSubstring2 = path.substring(iA);
        s.j(strSubstring2, "substring(...)");
        if (strSubstring2.length() == 0) {
            listM = v.m();
        } else {
            List listE1 = t.e1(strSubstring2, new char[]{File.separatorChar}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(v.y(listE1, 10));
            Iterator it = listE1.iterator();
            while (it.hasNext()) {
                arrayList.add(new File((String) it.next()));
            }
            listM = arrayList;
        }
        return new FilePathComponents(new File(strSubstring), listM);
    }
}
