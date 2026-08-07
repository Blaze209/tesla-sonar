package ez;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lc0/p$a;", "", "id", "b", "(Lc0/p$a;Ljava/lang/String;)Lc0/p$a;", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class c {
    public static final c0.p.a b(c0.p.a aVar, final String id2) {
        s.k(aVar, "<this>");
        s.k(id2, "id");
        c0.p.a aVarA = aVar.a(new c0.m() { // from class: ez.b
            @Override // c0.m
            public final List b(List list) {
                return c.c(id2, list);
            }
        });
        s.j(aVarA, "addCameraFilter(...)");
        return aVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List c(String str, List cameraInfos) {
        s.k(cameraInfos, "cameraInfos");
        ArrayList arrayList = new ArrayList();
        for (Object obj : cameraInfos) {
            c0.n nVar = (c0.n) obj;
            s.h(nVar);
            if (s.f(a.a(nVar), str)) {
                arrayList.add(obj);
            }
        }
        return v.p1(arrayList);
    }
}
