package wa;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\r\u001a\u00020\u0003*\u00020\f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0002\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0006*\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\t*\u00020\fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\u0003*\u00020\u00182\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001b\u001a\u00020\u0006*\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\t*\u00020\u0018H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001d\u0010 \u001a\u00020\u0003*\u00020\u001f2\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b \u0010!\u001a\u0013\u0010\"\u001a\u00020\u0006*\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010$\u001a\u00020\t*\u00020\u001fH\u0000¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010(\u001a\u00020\t2\n\u0010'\u001a\u0006\u0012\u0002\b\u00030&H\u0000¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020**\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0017\u0010-\u001a\u00020**\u0006\u0012\u0002\b\u00030&H\u0002¢\u0006\u0004\b-\u0010,¨\u0006."}, d2 = {"Lwa/r;", "", "other", "", "f", "(Lwa/r;Ljava/lang/Object;)Z", "", "k", "(Lwa/r;)I", "", "q", "(Lwa/r;)Ljava/lang/String;", "Lwa/r$a;", "c", "(Lwa/r$a;Ljava/lang/Object;)Z", "current", "b", "(Ljava/lang/String;Ljava/lang/String;)Z", "a", "(Ljava/lang/String;)Z", "h", "(Lwa/r$a;)I", "n", "(Lwa/r$a;)Ljava/lang/String;", "Lwa/r$c;", DateTokenConverter.CONVERTER_KEY, "(Lwa/r$c;Ljava/lang/Object;)Z", IntegerTokenConverter.CONVERTER_KEY, "(Lwa/r$c;)I", "o", "(Lwa/r$c;)Ljava/lang/String;", "Lwa/r$d;", "e", "(Lwa/r$d;Ljava/lang/Object;)Z", "j", "(Lwa/r$d;)I", "p", "(Lwa/r$d;)Ljava/lang/String;", "", "collection", "g", "(Ljava/util/Collection;)Ljava/lang/String;", "Ljn0/h0;", "m", "(Ljava/util/Collection;)V", "l", "room-runtime_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(((r.a) t11).name, ((r.a) t12).name);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return mn0.a.d(((r.d) t11).name, ((r.d) t12).name);
        }
    }

    private static final boolean a(String str) {
        if (str.length() == 0) {
            return false;
        }
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < str.length()) {
            char cCharAt = str.charAt(i11);
            int i14 = i13 + 1;
            if (i13 == 0 && cCharAt != '(') {
                return false;
            }
            if (cCharAt == '(') {
                i12++;
            } else if (cCharAt == ')' && (i12 = i12 - 1) == 0 && i13 != str.length() - 1) {
                return false;
            }
            i11++;
            i13 = i14;
        }
        return i12 == 0;
    }

    public static final boolean b(String current, String str) {
        p013kotlin.jvm.internal.s.k(current, "current");
        if (p013kotlin.jvm.internal.s.f(current, str)) {
            return true;
        }
        if (!a(current)) {
            return false;
        }
        String strSubstring = current.substring(1, current.length() - 1);
        p013kotlin.jvm.internal.s.j(strSubstring, "substring(...)");
        return p013kotlin.jvm.internal.s.f(t.F1(strSubstring).toString(), str);
    }

    public static final boolean c(r.a aVar, Object obj) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        if (aVar == obj) {
            return true;
        }
        if (!(obj instanceof r.a)) {
            return false;
        }
        r.a aVar2 = (r.a) obj;
        if (aVar.a() != aVar2.a() || !p013kotlin.jvm.internal.s.f(aVar.name, aVar2.name) || aVar.notNull != aVar2.notNull) {
            return false;
        }
        String str = aVar.defaultValue;
        String str2 = aVar2.defaultValue;
        if (aVar.createdFrom == 1 && aVar2.createdFrom == 2 && str != null && !b(str, str2)) {
            return false;
        }
        if (aVar.createdFrom == 2 && aVar2.createdFrom == 1 && str2 != null && !b(str2, str)) {
            return false;
        }
        int i11 = aVar.createdFrom;
        return (i11 == 0 || i11 != aVar2.createdFrom || (str == null ? str2 == null : b(str, str2))) && aVar.affinity == aVar2.affinity;
    }

    public static final boolean d(r.c cVar, Object obj) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        if (cVar == obj) {
            return true;
        }
        if (!(obj instanceof r.c)) {
            return false;
        }
        r.c cVar2 = (r.c) obj;
        if (p013kotlin.jvm.internal.s.f(cVar.referenceTable, cVar2.referenceTable) && p013kotlin.jvm.internal.s.f(cVar.onDelete, cVar2.onDelete) && p013kotlin.jvm.internal.s.f(cVar.onUpdate, cVar2.onUpdate) && p013kotlin.jvm.internal.s.f(cVar.columnNames, cVar2.columnNames)) {
            return p013kotlin.jvm.internal.s.f(cVar.referenceColumnNames, cVar2.referenceColumnNames);
        }
        return false;
    }

    public static final boolean e(r.d dVar, Object obj) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        if (dVar == obj) {
            return true;
        }
        if (!(obj instanceof r.d)) {
            return false;
        }
        r.d dVar2 = (r.d) obj;
        if (dVar.unique == dVar2.unique && p013kotlin.jvm.internal.s.f(dVar.columns, dVar2.columns) && p013kotlin.jvm.internal.s.f(dVar.orders, dVar2.orders)) {
            return t.b0(dVar.name, "index_", false, 2, null) ? t.b0(dVar2.name, "index_", false, 2, null) : p013kotlin.jvm.internal.s.f(dVar.name, dVar2.name);
        }
        return false;
    }

    public static final boolean f(r rVar, Object obj) {
        Set<r.d> set;
        p013kotlin.jvm.internal.s.k(rVar, "<this>");
        if (rVar == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar2 = (r) obj;
        if (!p013kotlin.jvm.internal.s.f(rVar.name, rVar2.name) || !p013kotlin.jvm.internal.s.f(rVar.columns, rVar2.columns) || !p013kotlin.jvm.internal.s.f(rVar.foreignKeys, rVar2.foreignKeys)) {
            return false;
        }
        Set<r.d> set2 = rVar.indices;
        if (set2 == null || (set = rVar2.indices) == null) {
            return true;
        }
        return p013kotlin.jvm.internal.s.f(set2, set);
    }

    public static final String g(Collection<?> collection) {
        p013kotlin.jvm.internal.s.k(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return t.j(v.y0(collection, ",\n", "\n", "\n", 0, null, null, 56, null), null, 1, null) + "},";
    }

    public static final int h(r.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        return (((((aVar.name.hashCode() * 31) + aVar.affinity) * 31) + (aVar.notNull ? 1231 : 1237)) * 31) + aVar.primaryKeyPosition;
    }

    public static final int i(r.c cVar) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        return (((((((cVar.referenceTable.hashCode() * 31) + cVar.onDelete.hashCode()) * 31) + cVar.onUpdate.hashCode()) * 31) + cVar.columnNames.hashCode()) * 31) + cVar.referenceColumnNames.hashCode();
    }

    public static final int j(r.d dVar) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        return ((((((t.b0(dVar.name, "index_", false, 2, null) ? -1184239155 : dVar.name.hashCode()) * 31) + (dVar.unique ? 1 : 0)) * 31) + dVar.columns.hashCode()) * 31) + dVar.orders.hashCode();
    }

    public static final int k(r rVar) {
        p013kotlin.jvm.internal.s.k(rVar, "<this>");
        return (((rVar.name.hashCode() * 31) + rVar.columns.hashCode()) * 31) + rVar.foreignKeys.hashCode();
    }

    private static final void l(Collection<?> collection) {
        t.j(v.y0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        t.j(" }", null, 1, null);
    }

    private static final void m(Collection<?> collection) {
        t.j(v.y0(collection, ",", null, null, 0, null, null, 62, null), null, 1, null);
        t.j("},", null, 1, null);
    }

    public static final String n(r.a aVar) {
        p013kotlin.jvm.internal.s.k(aVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |Column {\n            |   name = '");
        sb2.append(aVar.name);
        sb2.append("',\n            |   type = '");
        sb2.append(aVar.type);
        sb2.append("',\n            |   affinity = '");
        sb2.append(aVar.affinity);
        sb2.append("',\n            |   notNull = '");
        sb2.append(aVar.notNull);
        sb2.append("',\n            |   primaryKeyPosition = '");
        sb2.append(aVar.primaryKeyPosition);
        sb2.append("',\n            |   defaultValue = '");
        String str = aVar.defaultValue;
        if (str == null) {
            str = "undefined";
        }
        sb2.append(str);
        sb2.append("'\n            |}\n        ");
        return t.j(t.p(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final String o(r.c cVar) {
        p013kotlin.jvm.internal.s.k(cVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |ForeignKey {\n            |   referenceTable = '");
        sb2.append(cVar.referenceTable);
        sb2.append("',\n            |   onDelete = '");
        sb2.append(cVar.onDelete);
        sb2.append("',\n            |   onUpdate = '");
        sb2.append(cVar.onUpdate);
        sb2.append("',\n            |   columnNames = {");
        m(v.Y0(cVar.columnNames));
        h0 h0Var = h0.f84049a;
        sb2.append(h0Var);
        sb2.append("\n            |   referenceColumnNames = {");
        l(v.Y0(cVar.referenceColumnNames));
        sb2.append(h0Var);
        sb2.append("\n            |}\n        ");
        return t.j(t.p(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final String p(r.d dVar) {
        p013kotlin.jvm.internal.s.k(dVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |Index {\n            |   name = '");
        sb2.append(dVar.name);
        sb2.append("',\n            |   unique = '");
        sb2.append(dVar.unique);
        sb2.append("',\n            |   columns = {");
        m(dVar.columns);
        h0 h0Var = h0.f84049a;
        sb2.append(h0Var);
        sb2.append("\n            |   orders = {");
        l(dVar.orders);
        sb2.append(h0Var);
        sb2.append("\n            |}\n        ");
        return t.j(t.p(sb2.toString(), null, 1, null), null, 1, null);
    }

    public static final String q(r rVar) {
        List listM;
        p013kotlin.jvm.internal.s.k(rVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n            |TableInfo {\n            |    name = '");
        sb2.append(rVar.name);
        sb2.append("',\n            |    columns = {");
        sb2.append(g(v.a1(rVar.columns.values(), new a())));
        sb2.append("\n            |    foreignKeys = {");
        sb2.append(g(rVar.foreignKeys));
        sb2.append("\n            |    indices = {");
        Set<r.d> set = rVar.indices;
        if (set == null || (listM = v.a1(set, new b())) == null) {
            listM = v.m();
        }
        sb2.append(g(listM));
        sb2.append("\n            |}\n        ");
        return t.p(sb2.toString(), null, 1, null);
    }
}
