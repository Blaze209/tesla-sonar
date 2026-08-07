package iu;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class d0 {
    public static final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", f0Var.a());
            bundle.putLong("event_timestamp", f0Var.b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final void b(int i11, List list) {
        list.add(f0.c(i11, System.currentTimeMillis()));
    }
}
