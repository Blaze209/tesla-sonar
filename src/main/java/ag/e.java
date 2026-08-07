package ag;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f1024c = new e("COMPOSITION");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f1025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f1026b;

    public e(String... strArr) {
        this.f1025a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.f1025a;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f1025a.add(str);
        return eVar;
    }

    public boolean c(String str, int i11) {
        if (i11 >= this.f1025a.size()) {
            return false;
        }
        boolean z11 = i11 == this.f1025a.size() - 1;
        String str2 = this.f1025a.get(i11);
        if (!str2.equals("**")) {
            return (z11 || (i11 == this.f1025a.size() + (-2) && b())) && (str2.equals(str) || str2.equals(Marker.ANY_MARKER));
        }
        if (!z11 && this.f1025a.get(i11 + 1).equals(str)) {
            return i11 == this.f1025a.size() + (-2) || (i11 == this.f1025a.size() + (-3) && b());
        }
        if (z11) {
            return true;
        }
        int i12 = i11 + 1;
        if (i12 < this.f1025a.size() - 1) {
            return false;
        }
        return this.f1025a.get(i12).equals(str);
    }

    public f d() {
        return this.f1026b;
    }

    public int e(String str, int i11) {
        if (f(str)) {
            return 0;
        }
        if (this.f1025a.get(i11).equals("**")) {
            return (i11 != this.f1025a.size() - 1 && this.f1025a.get(i11 + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f1025a.equals(eVar.f1025a)) {
                return false;
            }
            f fVar = this.f1026b;
            f fVar2 = eVar.f1026b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public boolean g(String str, int i11) {
        if (f(str)) {
            return true;
        }
        if (i11 >= this.f1025a.size()) {
            return false;
        }
        return this.f1025a.get(i11).equals(str) || this.f1025a.get(i11).equals("**") || this.f1025a.get(i11).equals(Marker.ANY_MARKER);
    }

    public boolean h(String str, int i11) {
        return "__container".equals(str) || i11 < this.f1025a.size() - 1 || this.f1025a.get(i11).equals("**");
    }

    public int hashCode() {
        int iHashCode = this.f1025a.hashCode() * 31;
        f fVar = this.f1026b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f1026b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f1025a);
        sb2.append(",resolved=");
        sb2.append(this.f1026b != null);
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    private e(e eVar) {
        this.f1025a = new ArrayList(eVar.f1025a);
        this.f1026b = eVar.f1026b;
    }
}
