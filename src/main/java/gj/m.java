package gj;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class m implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f68989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f68990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Bitmap.Config[] f68991f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Bitmap.Config[] f68992g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Bitmap.Config[] f68993h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f68994a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<b, Bitmap> f68995b = new g<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> f68996c = new HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f68997a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f68997a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f68997a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f68997a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f68997a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f68998a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f68999b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap.Config f69000c;

        public b(c cVar) {
            this.f68998a = cVar;
        }

        @Override // gj.l
        public void a() {
            this.f68998a.c(this);
        }

        public void b(int i11, Bitmap.Config config) {
            this.f68999b = i11;
            this.f69000c = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f68999b == bVar.f68999b && xj.l.e(this.f69000c, bVar.f69000c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i11 = this.f68999b * 31;
            Bitmap.Config config = this.f69000c;
            return i11 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.h(this.f68999b, this.f69000c);
        }
    }

    static class c extends gj.c<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // gj.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i11, Bitmap.Config config) {
            b bVarB = b();
            bVarB.b(i11, config);
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f68989d = configArr;
        f68990e = configArr;
        f68991f = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f68992g = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f68993h = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void f(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num2 = navigableMapJ.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapJ.remove(num);
                return;
            } else {
                navigableMapJ.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + e(bitmap) + ", this: " + this);
    }

    private b g(int i11, Bitmap.Config config) {
        b bVarE = this.f68994a.e(i11, config);
        for (Bitmap.Config config2 : i(config)) {
            Integer numCeilingKey = j(config2).ceilingKey(Integer.valueOf(i11));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i11 * 8) {
                if (numCeilingKey.intValue() == i11 && (config2 != null ? config2.equals(config) : config == null)) {
                    break;
                    break;
                }
                this.f68994a.c(bVarE);
                return this.f68994a.e(numCeilingKey.intValue(), config2);
            }
        }
        return bVarE;
    }

    static String h(int i11, Bitmap.Config config) {
        return "[" + i11 + "](" + config + ")";
    }

    private static Bitmap.Config[] i(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f68990e;
        }
        int i11 = a.f68997a[config.ordinal()];
        if (i11 == 1) {
            return f68989d;
        }
        if (i11 == 2) {
            return f68991f;
        }
        if (i11 != 3) {
            return i11 != 4 ? new Bitmap.Config[]{config} : f68993h;
        }
        return f68992g;
    }

    private NavigableMap<Integer, Integer> j(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.f68996c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f68996c.put(config, treeMap);
        return treeMap;
    }

    @Override // gj.k
    public String a(int i11, int i12, Bitmap.Config config) {
        return h(xj.l.h(i11, i12, config), config);
    }

    @Override // gj.k
    public int b(Bitmap bitmap) {
        return xj.l.i(bitmap);
    }

    @Override // gj.k
    public void c(Bitmap bitmap) {
        b bVarE = this.f68994a.e(xj.l.i(bitmap), bitmap.getConfig());
        this.f68995b.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapJ = j(bitmap.getConfig());
        Integer num = navigableMapJ.get(Integer.valueOf(bVarE.f68999b));
        navigableMapJ.put(Integer.valueOf(bVarE.f68999b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // gj.k
    public Bitmap d(int i11, int i12, Bitmap.Config config) {
        b bVarG = g(xj.l.h(i11, i12, config), config);
        Bitmap bitmapA = this.f68995b.a(bVarG);
        if (bitmapA != null) {
            f(Integer.valueOf(bVarG.f68999b), bitmapA);
            bitmapA.reconfigure(i11, i12, config);
        }
        return bitmapA;
    }

    @Override // gj.k
    public String e(Bitmap bitmap) {
        return h(xj.l.i(bitmap), bitmap.getConfig());
    }

    @Override // gj.k
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f68995b.f();
        if (bitmapF != null) {
            f(Integer.valueOf(xj.l.i(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SizeConfigStrategy{groupedMap=");
        sb2.append(this.f68995b);
        sb2.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.f68996c.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append('[');
            sb2.append(entry.getValue());
            sb2.append("], ");
        }
        if (!this.f68996c.isEmpty()) {
            sb2.replace(sb2.length() - 2, sb2.length(), "");
        }
        sb2.append(")}");
        return sb2.toString();
    }
}
