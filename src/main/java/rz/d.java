package rz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public abstract class d<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<Class<?>, d<?>> f109259c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, b> f109260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b[] f109261b;

    private static void a(d<?> dVar, HashMap<String, String> map) {
        if (map == null) {
            return;
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            b bVar = ((d) dVar).f109260a.get(entry.getValue());
            if (bVar != null) {
                map2.put(entry.getValue(), bVar);
            }
        }
        ((d) dVar).f109260a.putAll(map2);
    }

    public static <P> d<P> c(Class<P> cls, j jVar) {
        String strConcat;
        Class<?> clsC;
        d<P> dVar = (d) f109259c.get(cls);
        if (dVar != null) {
            return dVar;
        }
        b[] bVarArrB = a.b(cls, jVar);
        String name = cls.getName();
        if (name.startsWith("java.util.")) {
            strConcat = "com.nimbusds.jose.shaded.asm." + name + "AccAccess";
        } else {
            strConcat = name.concat("AccAccess");
        }
        i iVar = new i(cls.getClassLoader());
        try {
            clsC = iVar.loadClass(strConcat);
        } catch (ClassNotFoundException unused) {
            clsC = null;
        }
        LinkedList<Class<?>> linkedListE = e(cls);
        if (clsC == null) {
            e eVar = new e(cls, bVarArrB, iVar);
            Iterator<Class<?>> it = linkedListE.iterator();
            while (it.hasNext()) {
                eVar.b(f.f109272a.get(it.next()));
            }
            clsC = eVar.c();
        }
        try {
            d<P> dVar2 = (d) clsC.newInstance();
            dVar2.f(bVarArrB);
            f109259c.putIfAbsent(cls, dVar2);
            Iterator<Class<?>> it2 = linkedListE.iterator();
            while (it2.hasNext()) {
                a(dVar2, f.f109273b.get(it2.next()));
            }
            return dVar2;
        } catch (Exception e11) {
            throw new RuntimeException("Error constructing accessor class: " + strConcat, e11);
        }
    }

    private static LinkedList<Class<?>> e(Class<?> cls) {
        LinkedList<Class<?>> linkedList = new LinkedList<>();
        while (cls != null && !cls.equals(Object.class)) {
            linkedList.addLast(cls);
            for (Class<?> cls2 : cls.getInterfaces()) {
                linkedList.addLast(cls2);
            }
            cls = cls.getSuperclass();
        }
        linkedList.addLast(Object.class);
        return linkedList;
    }

    public abstract Object b(T t11, int i11);

    public b[] d() {
        return this.f109261b;
    }

    protected void f(b[] bVarArr) {
        this.f109261b = bVarArr;
        this.f109260a = new HashMap<>();
        int length = bVarArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            b bVar = bVarArr[i11];
            bVar.f109254d = i12;
            this.f109260a.put(bVar.b(), bVar);
            i11++;
            i12++;
        }
    }
}
