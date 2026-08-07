package ix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class g extends hx.f {
    public List<i> f() {
        List<hx.c> listD = d();
        ArrayList arrayList = new ArrayList();
        Iterator<hx.c> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add((i) it.next());
        }
        return arrayList;
    }
}
