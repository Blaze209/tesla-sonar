package ts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class i<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f115007a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<E, Integer> f115008b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<E> f115009c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<E> f115010d = Collections.EMPTY_LIST;

    public Set<E> K2() {
        Set<E> set;
        synchronized (this.f115007a) {
            set = this.f115009c;
        }
        return set;
    }

    public void a(E e11) {
        synchronized (this.f115007a) {
            try {
                ArrayList arrayList = new ArrayList(this.f115010d);
                arrayList.add(e11);
                this.f115010d = Collections.unmodifiableList(arrayList);
                Integer num = this.f115008b.get(e11);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f115009c);
                    hashSet.add(e11);
                    this.f115009c = Collections.unmodifiableSet(hashSet);
                }
                this.f115008b.put(e11, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b(E e11) {
        int iIntValue;
        synchronized (this.f115007a) {
            try {
                iIntValue = this.f115008b.containsKey(e11) ? this.f115008b.get(e11).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public void d(E e11) {
        synchronized (this.f115007a) {
            try {
                Integer num = this.f115008b.get(e11);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f115010d);
                arrayList.remove(e11);
                this.f115010d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f115008b.remove(e11);
                    HashSet hashSet = new HashSet(this.f115009c);
                    hashSet.remove(e11);
                    this.f115009c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f115008b.put(e11, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f115007a) {
            it = this.f115010d.iterator();
        }
        return it;
    }
}
