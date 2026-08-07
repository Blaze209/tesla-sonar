package s7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class o<E> implements Iterable<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f110445a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<E, Integer> f110446b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<E> f110447c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<E> f110448d = Collections.EMPTY_LIST;

    public Set<E> K2() {
        Set<E> set;
        synchronized (this.f110445a) {
            set = this.f110447c;
        }
        return set;
    }

    public void a(E e11) {
        synchronized (this.f110445a) {
            try {
                ArrayList arrayList = new ArrayList(this.f110448d);
                arrayList.add(e11);
                this.f110448d = Collections.unmodifiableList(arrayList);
                Integer num = this.f110446b.get(e11);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f110447c);
                    hashSet.add(e11);
                    this.f110447c = Collections.unmodifiableSet(hashSet);
                }
                this.f110446b.put(e11, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int b(E e11) {
        int iIntValue;
        synchronized (this.f110445a) {
            try {
                iIntValue = this.f110446b.containsKey(e11) ? this.f110446b.get(e11).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public void d(E e11) {
        synchronized (this.f110445a) {
            try {
                Integer num = this.f110446b.get(e11);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f110448d);
                arrayList.remove(e11);
                this.f110448d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f110446b.remove(e11);
                    HashSet hashSet = new HashSet(this.f110447c);
                    hashSet.remove(e11);
                    this.f110447c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f110446b.put(e11, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f110445a) {
            it = this.f110448d.iterator();
        }
        return it;
    }
}
