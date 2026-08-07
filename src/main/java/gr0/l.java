package gr0;

import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* JADX INFO: loaded from: classes10.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static Logger f69458a = LoggerFactory.getLogger((Class<?>) l.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static Map<Integer, Map<Integer, Class<? extends b>>> f69459b = new HashMap();

    static {
        HashSet<Class<? extends b>> hashSet = new HashSet();
        hashSet.add(f.class);
        hashSet.add(n.class);
        hashSet.add(b.class);
        hashSet.add(i.class);
        hashSet.add(k.class);
        hashSet.add(m.class);
        hashSet.add(a.class);
        hashSet.add(j.class);
        hashSet.add(h.class);
        hashSet.add(e.class);
        for (Class<? extends b> cls : hashSet) {
            g gVar = (g) cls.getAnnotation(g.class);
            int[] iArrTags = gVar.tags();
            int iObjectTypeIndication = gVar.objectTypeIndication();
            Map<Integer, Class<? extends b>> map = f69459b.get(Integer.valueOf(iObjectTypeIndication));
            if (map == null) {
                map = new HashMap<>();
            }
            for (int i11 : iArrTags) {
                map.put(Integer.valueOf(i11), cls);
            }
            f69459b.put(Integer.valueOf(iObjectTypeIndication), map);
        }
    }

    public static b a(int i11, ByteBuffer byteBuffer) {
        b oVar;
        int iL = mr0.d.l(byteBuffer);
        Map<Integer, Class<? extends b>> map = f69459b.get(Integer.valueOf(i11));
        if (map == null) {
            map = f69459b.get(-1);
        }
        Class<? extends b> cls = map.get(Integer.valueOf(iL));
        if (cls == null || cls.isInterface() || Modifier.isAbstract(cls.getModifiers())) {
            if (f69458a.isWarnEnabled()) {
                f69458a.warn("No ObjectDescriptor found for objectTypeIndication {} and tag {} found: {}", Integer.toHexString(i11), Integer.toHexString(iL), cls);
            }
            oVar = new o();
        } else {
            try {
                oVar = cls.newInstance();
            } catch (Exception e11) {
                f69458a.error("Couldn't instantiate BaseDescriptor class " + cls + " for objectTypeIndication " + i11 + " and tag " + iL, (Throwable) e11);
                throw new RuntimeException(e11);
            }
        }
        oVar.d(iL, byteBuffer);
        return oVar;
    }
}
