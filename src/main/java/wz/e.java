package wz;

import java.lang.reflect.Type;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<Type, f<?>> f122442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f<sz.c> f122443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f<sz.c> f122444c;

    public e() {
        ConcurrentHashMap<Type, f<?>> concurrentHashMap = new ConcurrentHashMap<>(100);
        this.f122442a = concurrentHashMap;
        concurrentHashMap.put(Date.class, b.f122441c);
        concurrentHashMap.put(int[].class, a.f122425c);
        concurrentHashMap.put(Integer[].class, a.f122426d);
        concurrentHashMap.put(short[].class, a.f122425c);
        concurrentHashMap.put(Short[].class, a.f122426d);
        concurrentHashMap.put(long[].class, a.f122433k);
        concurrentHashMap.put(Long[].class, a.f122434l);
        concurrentHashMap.put(byte[].class, a.f122429g);
        concurrentHashMap.put(Byte[].class, a.f122430h);
        concurrentHashMap.put(char[].class, a.f122431i);
        concurrentHashMap.put(Character[].class, a.f122432j);
        concurrentHashMap.put(float[].class, a.f122435m);
        concurrentHashMap.put(Float[].class, a.f122436n);
        concurrentHashMap.put(double[].class, a.f122437o);
        concurrentHashMap.put(Double[].class, a.f122438p);
        concurrentHashMap.put(boolean[].class, a.f122439q);
        concurrentHashMap.put(Boolean[].class, a.f122440r);
        this.f122443b = new c(this);
        this.f122444c = new d(this);
        concurrentHashMap.put(sz.c.class, this.f122443b);
        concurrentHashMap.put(sz.b.class, this.f122443b);
        concurrentHashMap.put(sz.a.class, this.f122443b);
        concurrentHashMap.put(sz.d.class, this.f122443b);
    }
}
