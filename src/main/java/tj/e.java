package tj;

import androidx.annotation.NonNull;
import dj.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f114634a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f114635b = new HashMap();

    private static class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f114636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<R> f114637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final j<T, R> f114638c;

        public a(@NonNull Class<T> cls, @NonNull Class<R> cls2, j<T, R> jVar) {
            this.f114636a = cls;
            this.f114637b = cls2;
            this.f114638c = jVar;
        }

        public boolean a(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            return this.f114636a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f114637b);
        }
    }

    @NonNull
    private synchronized List<a<?, ?>> c(@NonNull String str) {
        List<a<?, ?>> arrayList;
        try {
            if (!this.f114634a.contains(str)) {
                this.f114634a.add(str);
            }
            arrayList = this.f114635b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f114635b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized <T, R> void a(@NonNull String str, @NonNull j<T, R> jVar, @NonNull Class<T> cls, @NonNull Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, jVar));
    }

    @NonNull
    public synchronized <T, R> List<j<T, R>> b(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f114634a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f114635b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f114638c);
                    }
                }
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <T, R> List<Class<R>> d(@NonNull Class<T> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f114634a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f114635b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f114637b)) {
                        arrayList.add(aVar.f114637b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(@NonNull List<String> list) {
        try {
            ArrayList<String> arrayList = new ArrayList(this.f114634a);
            this.f114634a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f114634a.add(it.next());
            }
            for (String str : arrayList) {
                if (!list.contains(str)) {
                    this.f114634a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
