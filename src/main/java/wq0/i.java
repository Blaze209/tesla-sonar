package wq0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final List<i> f122305d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Object f122306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    p f122307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    i f122308c;

    private i(Object obj, p pVar) {
        this.f122306a = obj;
        this.f122307b = pVar;
    }

    static i a(p pVar, Object obj) {
        List<i> list = f122305d;
        synchronized (list) {
            try {
                int size = list.size();
                if (size <= 0) {
                    return new i(obj, pVar);
                }
                i iVarRemove = list.remove(size - 1);
                iVarRemove.f122306a = obj;
                iVarRemove.f122307b = pVar;
                iVarRemove.f122308c = null;
                return iVarRemove;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static void b(i iVar) {
        iVar.f122306a = null;
        iVar.f122307b = null;
        iVar.f122308c = null;
        List<i> list = f122305d;
        synchronized (list) {
            try {
                if (list.size() < 10000) {
                    list.add(iVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
