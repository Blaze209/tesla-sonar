package a3;

import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B9\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0018\u00010\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00032\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R(\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR.\u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u0003\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00120\u001c0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u001e"}, d2 = {"La3/h;", "La3/g;", "", "", "", "", "restored", "Lkotlin/Function1;", "", "canBeSaved", "<init>", "(Ljava/util/Map;Lwn0/l;)V", "value", "a", "(Ljava/lang/Object;)Z", Action.KEY_ATTRIBUTE, "f", "(Ljava/lang/String;)Ljava/lang/Object;", "Lkotlin/Function0;", "valueProvider", "La3/g$a;", "b", "(Ljava/lang/String;Lwn0/a;)La3/g$a;", "c", "()Ljava/util/Map;", "Lwn0/l;", "", "Ljava/util/Map;", "", "valueProviders", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wn0.l<Object, Boolean> canBeSaved;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, List<Object>> restored;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, List<wn0.a<Object>>> valueProviders;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"a3/h$a", "La3/g$a;", "Ljn0/h0;", "a", "()V", "runtime-saveable_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements g.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f99b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ wn0.a<Object> f100c;

        a(String str, wn0.a<? extends Object> aVar) {
            this.f99b = str;
            this.f100c = aVar;
        }

        @Override // a3.g.a
        public void a() {
            List list = (List) h.this.valueProviders.remove(this.f99b);
            if (list != null) {
                list.remove(this.f100c);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            h.this.valueProviders.put(this.f99b, list);
        }
    }

    public h(Map<String, ? extends List<? extends Object>> map, wn0.l<Object, Boolean> lVar) {
        Map<String, List<Object>> mapD;
        this.canBeSaved = lVar;
        this.restored = (map == null || (mapD = v0.D(map)) == null) ? new LinkedHashMap<>() : mapD;
        this.valueProviders = new LinkedHashMap();
    }

    @Override // a3.g
    public boolean a(Object value) {
        return this.canBeSaved.invoke(value).booleanValue();
    }

    @Override // a3.g
    public g.a b(String key, wn0.a<? extends Object> valueProvider) {
        if (i.c(key)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        Map<String, List<wn0.a<Object>>> map = this.valueProviders;
        List<wn0.a<Object>> arrayList = map.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            map.put(key, arrayList);
        }
        arrayList.add(valueProvider);
        return new a(key, valueProvider);
    }

    @Override // a3.g
    public Map<String, List<Object>> c() {
        Map<String, List<Object>> mapD = v0.D(this.restored);
        for (Map.Entry<String, List<wn0.a<Object>>> entry : this.valueProviders.entrySet()) {
            String key = entry.getKey();
            List<wn0.a<Object>> value = entry.getValue();
            if (value.size() == 1) {
                Object objInvoke = value.get(0).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!a(objInvoke)) {
                        throw new IllegalStateException(b.b(objInvoke).toString());
                    }
                    mapD.put(key, v.h(objInvoke));
                }
            } else {
                int size = value.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i11 = 0; i11 < size; i11++) {
                    Object objInvoke2 = value.get(i11).invoke();
                    if (objInvoke2 != null && !a(objInvoke2)) {
                        throw new IllegalStateException(b.b(objInvoke2).toString());
                    }
                    arrayList.add(objInvoke2);
                }
                mapD.put(key, arrayList);
            }
        }
        return mapD;
    }

    @Override // a3.g
    public Object f(String key) {
        List<Object> listRemove = this.restored.remove(key);
        if (listRemove == null || listRemove.isEmpty()) {
            return null;
        }
        if (listRemove.size() > 1) {
            this.restored.put(key, listRemove.subList(1, listRemove.size()));
        }
        return listRemove.get(0);
    }
}
