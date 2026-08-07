package p013kotlin.jvm.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Object> f86534a;

    public s0(int i11) {
        this.f86534a = new ArrayList<>(i11);
    }

    public void a(Object obj) {
        this.f86534a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList<Object> arrayList = this.f86534a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f86534a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f86534a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f86534a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f86534a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f86534a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f86534a.toArray(objArr);
    }
}
