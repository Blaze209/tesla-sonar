package m4;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import java.util.HashMap;
import java.util.LinkedHashSet;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u0;
import q4.u;
import q4.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\rJ1\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\rJ\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010%\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R$\u0010)\u001a\u0012\u0012\u0004\u0012\u00028\u00000&j\b\u0012\u0004\u0012\u00028\u0000`'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R$\u0010.\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048G@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010+R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+¨\u00064"}, d2 = {"Lm4/b;", "K", "V", "", "", "maxSize", "<init>", "(I)V", Action.KEY_ATTRIBUTE, "value", "g", "(Ljava/lang/Object;Ljava/lang/Object;)I", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Ljn0/h0;", "j", "f", "", "evicted", "oldValue", "newValue", "c", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "b", IntegerTokenConverter.CONVERTER_KEY, "", "toString", "()Ljava/lang/String;", "Lq4/v;", "a", "Lq4/v;", "monitor", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "keySet", "<set-?>", "I", "h", "()I", "size", "putCount", "createCount", "evictionCount", "hitCount", "missCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class b<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v monitor = u.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HashMap<K, V> map;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashSet<K> keySet;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int maxSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int putCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int createCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int evictionCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int hitCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int missCount;

    public b(int i11) {
        if (i11 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.maxSize = i11;
        this.map = new HashMap<>(0, 0.75f);
        this.keySet = new LinkedHashSet<>();
    }

    private final int g(K key, V value) {
        int i11 = i(key, value);
        if (i11 >= 0) {
            return i11;
        }
        throw new IllegalStateException(("Negative size: " + key + '=' + value).toString());
    }

    protected V b(K key) {
        return null;
    }

    public final V d(K key) {
        synchronized (this.monitor) {
            V v11 = this.map.get(key);
            if (v11 != null) {
                this.keySet.remove(key);
                this.keySet.add(key);
                this.hitCount++;
                return v11;
            }
            this.missCount++;
            V vB = b(key);
            if (vB == null) {
                return null;
            }
            synchronized (this.monitor) {
                try {
                    this.createCount++;
                    V vPut = this.map.put(key, vB);
                    this.keySet.remove(key);
                    this.keySet.add(key);
                    if (vPut != null) {
                        this.map.put(key, vPut);
                        v11 = vPut;
                    } else {
                        this.size = h() + g(key, vB);
                    }
                    h0 h0Var = h0.f84049a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (v11 != null) {
                c(false, key, vB, v11);
                return v11;
            }
            j(this.maxSize);
            return vB;
        }
    }

    public final V e(K key, V value) {
        V vPut;
        if (key == null || value == null) {
            throw null;
        }
        synchronized (this.monitor) {
            try {
                this.putCount++;
                this.size = h() + g(key, value);
                vPut = this.map.put(key, value);
                if (vPut != null) {
                    this.size = h() - g(key, vPut);
                }
                if (this.keySet.contains(key)) {
                    this.keySet.remove(key);
                }
                this.keySet.add(key);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vPut != null) {
            c(false, key, vPut, value);
        }
        j(this.maxSize);
        return vPut;
    }

    public final V f(K key) {
        V vRemove;
        key.getClass();
        synchronized (this.monitor) {
            try {
                vRemove = this.map.remove(key);
                this.keySet.remove(key);
                if (vRemove != null) {
                    this.size = h() - g(key, vRemove);
                }
                h0 h0Var = h0.f84049a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vRemove != null) {
            c(false, key, vRemove, null);
        }
        return vRemove;
    }

    public final int h() {
        int i11;
        synchronized (this.monitor) {
            i11 = this.size;
        }
        return i11;
    }

    protected int i(K key, V value) {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j(int maxSize) {
        Object objN0;
        V v11;
        while (true) {
            synchronized (this.monitor) {
                try {
                    if (h() >= 0 && (!this.map.isEmpty() || h() == 0)) {
                        if (this.map.isEmpty() != this.keySet.isEmpty()) {
                            break;
                        }
                        if (h() <= maxSize || this.map.isEmpty()) {
                            objN0 = null;
                            v11 = null;
                        } else {
                            objN0 = p013kotlin.collections.v.n0(this.keySet);
                            v11 = this.map.get(objN0);
                            if (v11 == null) {
                                throw new IllegalStateException("inconsistent state");
                            }
                            u0.d(this.map).remove(objN0);
                            u0.a(this.keySet).remove(objN0);
                            int iH = h();
                            s.h(objN0);
                            s.h(v11);
                            this.size = iH - g(objN0, v11);
                            this.evictionCount++;
                        }
                        h0 h0Var = h0.f84049a;
                    } else {
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (objN0 == null && v11 == null) {
                return;
            }
            s.h(objN0);
            s.h(v11);
            c(true, objN0, v11, null);
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }

    public String toString() {
        String str;
        synchronized (this.monitor) {
            try {
                int i11 = this.hitCount;
                int i12 = this.missCount + i11;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i12 != 0 ? (i11 * 100) / i12 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    protected void c(boolean evicted, K key, V oldValue, V newValue) {
    }
}
