package wa;

import java.util.ArrayList;
import p013kotlin.Metadata;
import p013kotlin.collections.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lya/d;", "stmt", "", "name", "", "c", "(Lya/d;Ljava/lang/String;)I", "a", "b", "room-runtime_release"}, k = 5, mv = {2, 0, 0}, xi = 48, xs = "androidx/room/util/SQLiteStatementUtil")
final /* synthetic */ class n {
    public static final int a(ya.d dVar, String name) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        p013kotlin.jvm.internal.s.k(name, "name");
        if (dVar instanceof h) {
            return ((h) dVar).getColumnIndex(name);
        }
        int columnCount = dVar.getColumnCount();
        for (int i11 = 0; i11 < columnCount; i11++) {
            if (p013kotlin.jvm.internal.s.f(name, dVar.getColumnName(i11))) {
                return i11;
            }
        }
        return -1;
    }

    public static final int b(ya.d stmt, String name) {
        p013kotlin.jvm.internal.s.k(stmt, "stmt");
        p013kotlin.jvm.internal.s.k(name, "name");
        return m.a(stmt, name);
    }

    public static final int c(ya.d stmt, String name) {
        p013kotlin.jvm.internal.s.k(stmt, "stmt");
        p013kotlin.jvm.internal.s.k(name, "name");
        int iA = m.a(stmt, name);
        if (iA >= 0) {
            return iA;
        }
        int columnCount = stmt.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i11 = 0; i11 < columnCount; i11++) {
            arrayList.add(stmt.getColumnName(i11));
        }
        throw new IllegalArgumentException("Column '" + name + "' does not exist. Available columns: [" + v.y0(arrayList, null, null, null, 0, null, null, 63, null) + ']');
    }
}
