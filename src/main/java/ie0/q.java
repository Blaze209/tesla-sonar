package ie0;

import com.tesla.logging.TeslaLog;
import java.io.File;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.text.MatchGroup;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u0017\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Ljava/io/File;", "", "a", "(Ljava/io/File;)Ljava/lang/Long;", "dirLength", "", "c", "(Ljava/io/File;)Z", "isZipFile", "", "b", "(Ljava/io/File;)Ljava/lang/String;", "reportId", "utils_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class q {
    public static final Long a(File file) {
        List listM;
        p013kotlin.jvm.internal.s.k(file, "<this>");
        p013kotlin.collections.m mVar = new p013kotlin.collections.m();
        try {
            if (!file.isDirectory()) {
                return null;
            }
            mVar.add(file);
            long length = 0;
            while (!mVar.isEmpty()) {
                File file2 = (File) mVar.removeFirst();
                if (file2.isDirectory()) {
                    File[] fileArrListFiles = file2.listFiles();
                    if (fileArrListFiles == null || (listM = p013kotlin.collections.n.w1(fileArrListFiles)) == null) {
                        listM = p013kotlin.collections.v.m();
                    }
                    mVar.addAll(listM);
                } else {
                    length += file2.length();
                }
            }
            return Long.valueOf(length);
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e("Files#trackDirSize", "Failed to get child sizes", e11);
            return null;
        }
    }

    public static final String b(File file) {
        p013kotlin.text.l groups;
        MatchGroup matchGroup;
        p013kotlin.jvm.internal.s.k(file, "<this>");
        p013kotlin.text.m mVarD = p013kotlin.text.q.d(new p013kotlin.text.q("(.+)\\..+"), sn0.h.D(file), 0, 2, null);
        if (mVarD == null || (groups = mVarD.getGroups()) == null || (matchGroup = groups.get(1)) == null) {
            return null;
        }
        return matchGroup.getValue();
    }

    public static final boolean c(File file) {
        p013kotlin.jvm.internal.s.k(file, "<this>");
        return p013kotlin.jvm.internal.s.f(sn0.h.C(file), "zip");
    }
}
