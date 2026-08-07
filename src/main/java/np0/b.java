package np0;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import yr0.d;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lnp0/b;", "Ljp0/b;", "<init>", "()V", "", "expression", "data", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements jp0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f95285a = new b();

    private b() {
    }

    @Override // jp0.b
    public Object f(Object expression, Object data) {
        Object objQ0;
        String string;
        boolean z11 = expression instanceof List;
        List list = z11 ? (List) expression : null;
        long jC = (list == null || (objQ0 = v.q0(list)) == null || (string = objQ0.toString()) == null) ? 0L : d.c(string);
        List list2 = z11 ? (List) expression : null;
        Object objB = list2 != null ? yr0.c.b(list2) : null;
        List listM = objB instanceof List ? (List) objB : null;
        if (listM == null) {
            listM = v.m();
        }
        List<Object> listF = a.f95284a.f(listM, data);
        List<Object> list3 = ((long) (listM.size() - listF.size())) < jC ? listF : null;
        return list3 == null ? v.m() : list3;
    }
}
