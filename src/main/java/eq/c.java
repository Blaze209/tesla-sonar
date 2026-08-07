package eq;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Iterable<Map.Entry<String, List<String>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, List<String>> f63126a = new LinkedHashMap();

    private List<String> a(String str) {
        return this.f63126a.get(str);
    }

    private void b(String str, String str2) {
        List<String> listA = a(str);
        if (listA == null) {
            listA = new ArrayList<>();
            this.f63126a.put(str, listA);
        }
        listA.add(str2);
    }

    private String j(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public String d(String str) {
        List<String> listE = e(str);
        if (listE == null || listE.isEmpty()) {
            return null;
        }
        return listE.get(0);
    }

    public List<String> e(String str) {
        return a(j(str));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f63126a.equals(((c) obj).f63126a);
        }
        return false;
    }

    public Charset f() {
        String strD = d("CHARSET");
        if (strD == null) {
            return null;
        }
        return Charset.forName(strD);
    }

    public Map<String, List<String>> g() {
        return this.f63126a;
    }

    public boolean h() {
        String[] strArr = {"ENCODING", null};
        for (int i11 = 0; i11 < 2; i11++) {
            List<String> listA = a(strArr[i11]);
            if (listA != null) {
                Iterator<String> it = listA.iterator();
                while (it.hasNext()) {
                    if ("QUOTED-PRINTABLE".equalsIgnoreCase(it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f63126a.hashCode();
    }

    public void i(String str, String str2) {
        b(j(str), str2);
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<String, List<String>>> iterator() {
        return this.f63126a.entrySet().iterator();
    }

    public String toString() {
        return this.f63126a.toString();
    }
}
