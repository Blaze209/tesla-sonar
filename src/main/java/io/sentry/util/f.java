package io.sentry.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class f {
    public static List<io.sentry.c0> a(List<io.sentry.internal.eventprocessor.a> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator<io.sentry.internal.eventprocessor.a> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().b());
            }
        }
        return new CopyOnWriteArrayList(arrayList);
    }
}
