package tu;

import android.content.Context;
import com.google.firebase.abt.AbtException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yv.b<wu.a> f115142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f115143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f115144c = null;

    public b(Context context, yv.b<wu.a> bVar, String str) {
        this.f115142a = bVar;
        this.f115143b = str;
    }

    private void a(wu.a.c cVar) {
        this.f115142a.get().b(cVar);
    }

    private void b(List<a> list) {
        ArrayDeque arrayDeque = new ArrayDeque(f());
        int i11 = i();
        for (a aVar : list) {
            while (arrayDeque.size() >= i11) {
                k(((wu.a.c) arrayDeque.pollFirst()).f122350b);
            }
            wu.a.c cVarF = aVar.f(this.f115143b);
            a(cVarF);
            arrayDeque.offer(cVarF);
        }
    }

    private static List<a> c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a.b(it.next()));
        }
        return arrayList;
    }

    private boolean d(List<a> list, a aVar) {
        String strC = aVar.c();
        String strE = aVar.e();
        for (a aVar2 : list) {
            if (aVar2.c().equals(strC) && aVar2.e().equals(strE)) {
                return true;
            }
        }
        return false;
    }

    private List<wu.a.c> f() {
        return this.f115142a.get().e(this.f115143b, "");
    }

    private ArrayList<a> g(List<a> list, List<a> list2) {
        ArrayList<a> arrayList = new ArrayList<>();
        for (a aVar : list) {
            if (!d(list2, aVar)) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    private ArrayList<wu.a.c> h(List<a> list, List<a> list2) {
        ArrayList<wu.a.c> arrayList = new ArrayList<>();
        for (a aVar : list) {
            if (!d(list2, aVar)) {
                arrayList.add(aVar.f(this.f115143b));
            }
        }
        return arrayList;
    }

    private int i() {
        if (this.f115144c == null) {
            this.f115144c = Integer.valueOf(this.f115142a.get().d(this.f115143b));
        }
        return this.f115144c.intValue();
    }

    private void k(String str) {
        this.f115142a.get().clearConditionalUserProperty(str, null, null);
    }

    private void l(Collection<wu.a.c> collection) {
        Iterator<wu.a.c> it = collection.iterator();
        while (it.hasNext()) {
            k(it.next().f122350b);
        }
    }

    private void n(List<a> list) throws AbtException {
        if (list.isEmpty()) {
            j();
            return;
        }
        List<a> listE = e();
        l(h(listE, list));
        b(g(list, listE));
    }

    private void o() throws AbtException {
        if (this.f115142a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public List<a> e() throws AbtException {
        o();
        List<wu.a.c> listF = f();
        ArrayList arrayList = new ArrayList();
        Iterator<wu.a.c> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        return arrayList;
    }

    public void j() throws AbtException {
        o();
        l(f());
    }

    public void m(List<Map<String, String>> list) throws AbtException {
        o();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        n(c(list));
    }
}
