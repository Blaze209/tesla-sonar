package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    private final List<m2> f3296a;

    public r2(@NonNull List<m2> list) {
        this.f3296a = new ArrayList(list);
    }

    @NonNull
    public static String d(@NonNull r2 r2Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<m2> it = r2Var.f3296a.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getClass().getSimpleName());
        }
        return q2.a(" | ", arrayList);
    }

    public boolean a(@NonNull Class<? extends m2> cls) {
        Iterator<m2> it = this.f3296a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    public <T extends m2> T b(@NonNull Class<T> cls) {
        Iterator<m2> it = this.f3296a.iterator();
        while (it.hasNext()) {
            T t11 = (T) it.next();
            if (t11.getClass() == cls) {
                return t11;
            }
        }
        return null;
    }

    @NonNull
    public <T extends m2> List<T> c(@NonNull Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (m2 m2Var : this.f3296a) {
            if (cls.isAssignableFrom(m2Var.getClass())) {
                arrayList.add(m2Var);
            }
        }
        return arrayList;
    }
}
