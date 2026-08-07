package tb;

import androidx.work.r0;
import androidx.work.t0;
import ch.qos.logback.classic.spi.CallerData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p013kotlin.Metadata;
import sb.c2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\n\u001a\u00020\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/work/t0;", "Lza/f;", "b", "(Landroidx/work/t0;)Lza/f;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "", "count", "Ljn0/h0;", "a", "(Ljava/lang/StringBuilder;I)V", "work-runtime_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class z {
    private static final void a(StringBuilder sb2, int i11) {
        if (i11 <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(CallerData.NA);
        }
        sb2.append(p013kotlin.collections.v.y0(arrayList, ",", null, null, 0, null, null, 62, null));
    }

    public static final za.f b(t0 t0Var) {
        p013kotlin.jvm.internal.s.k(t0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder("SELECT * FROM workspec");
        String str = " AND";
        String str2 = " WHERE";
        if (!t0Var.b().isEmpty()) {
            List<r0.c> listB = t0Var.b();
            ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(listB, 10));
            Iterator<T> it = listB.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(c2.k((r0.c) it.next())));
            }
            sb2.append(" WHERE state IN (");
            a(sb2, arrayList2.size());
            sb2.append(")");
            arrayList.addAll(arrayList2);
            str2 = " AND";
        }
        if (!t0Var.a().isEmpty()) {
            List<UUID> listA = t0Var.a();
            ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(listA, 10));
            Iterator<T> it2 = listA.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((UUID) it2.next()).toString());
            }
            sb2.append(str2 + " id IN (");
            a(sb2, t0Var.a().size());
            sb2.append(")");
            arrayList.addAll(arrayList3);
            str2 = " AND";
        }
        if (t0Var.c().isEmpty()) {
            str = str2;
        } else {
            sb2.append(str2 + " id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            a(sb2, t0Var.c().size());
            sb2.append("))");
            arrayList.addAll(t0Var.c());
        }
        if (!t0Var.d().isEmpty()) {
            sb2.append(str + " id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            a(sb2, t0Var.d().size());
            sb2.append("))");
            arrayList.addAll(t0Var.d());
        }
        sb2.append(";");
        String string = sb2.toString();
        p013kotlin.jvm.internal.s.j(string, "toString(...)");
        return new za.a(string, arrayList.toArray(new Object[0]));
    }
}
