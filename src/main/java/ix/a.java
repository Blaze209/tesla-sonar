package ix;

import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a<K> extends HashMap<K, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Object, K> f81939a = new HashMap();

    @Override // java.util.HashMap, java.util.AbstractMap
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a<K> clone() {
        a<K> aVar = new a<>();
        aVar.putAll((Map) super.clone());
        return aVar;
    }

    public Object c(K k11, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f81939a.put(it.next(), k11);
        }
        return super.put(k11, collection);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        super.clear();
        this.f81939a.clear();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(K k11, Object obj) {
        if (obj instanceof Collection) {
            return c(k11, (Collection) obj);
        }
        this.f81939a.put(obj, k11);
        return super.put(k11, obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ?> map) {
        for (Map.Entry<? extends K, ?> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        Object objRemove = super.remove(obj);
        if (!(objRemove instanceof Collection)) {
            this.f81939a.remove(objRemove);
            return objRemove;
        }
        Iterator it = ((Collection) objRemove).iterator();
        while (it.hasNext()) {
            this.f81939a.remove(it.next());
        }
        return objRemove;
    }
}
