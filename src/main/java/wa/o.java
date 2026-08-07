package wa;

import android.os.Build;
import ch.qos.logback.core.CoreConstants;
import p013kotlin.Metadata;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lya/d;", "", "name", "", "a", "(Lya/d;Ljava/lang/String;)I", "b", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/SQLiteStatementUtil")
final /* synthetic */ class o {
    public static final int a(ya.d dVar, String name) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        p013kotlin.jvm.internal.s.k(name, "name");
        int iB = m.b(dVar, name);
        if (iB >= 0) {
            return iB;
        }
        int iB2 = m.b(dVar, '`' + name + '`');
        return iB2 >= 0 ? iB2 : b(dVar, name);
    }

    private static final int b(ya.d dVar, String str) {
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount = dVar.getColumnCount();
            String str2 = CoreConstants.DOT + str;
            String str3 = CoreConstants.DOT + str + '`';
            for (int i11 = 0; i11 < columnCount; i11++) {
                String columnName = dVar.getColumnName(i11);
                if (columnName.length() >= str.length() + 2 && (t.L(columnName, str2, false, 2, null) || (columnName.charAt(0) == '`' && t.L(columnName, str3, false, 2, null)))) {
                    return i11;
                }
            }
        }
        return -1;
    }
}
