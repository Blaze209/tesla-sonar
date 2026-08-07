package hk0;

import freemarker.core.BugException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class e0 {

    public interface a {
        i a(j jVar);
    }

    public static i a(j jVar, Map map, ReferenceQueue referenceQueue, a aVar) {
        Map map2;
        Reference reference;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        synchronized (map) {
            try {
                map2 = (Map) map.get(contextClassLoader);
                if (map2 == null) {
                    map2 = new HashMap();
                    map.put(contextClassLoader, map2);
                    reference = null;
                } else {
                    reference = (Reference) map2.get(jVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        i iVar = reference != null ? (i) reference.get() : null;
        if (iVar != null) {
            return iVar;
        }
        j jVar2 = (j) jVar.a(true);
        i iVarA = aVar.a(jVar2);
        if (!iVarA.k()) {
            throw new BugException();
        }
        synchronized (map) {
            try {
                Reference reference2 = (Reference) map2.get(jVar2);
                i iVar2 = reference2 != null ? (i) reference2.get() : null;
                if (iVar2 == null) {
                    map2.put(jVar2, new WeakReference(iVarA, referenceQueue));
                } else {
                    iVarA = iVar2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        b(map, referenceQueue);
        return iVarA;
    }

    private static void b(Map map, ReferenceQueue referenceQueue) {
        while (true) {
            Reference referencePoll = referenceQueue.poll();
            if (referencePoll == null) {
                return;
            }
            synchronized (map) {
                try {
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((Map) it.next()).values().iterator();
                        while (it2.hasNext()) {
                            if (it2.next() == referencePoll) {
                                it2.remove();
                                break;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
