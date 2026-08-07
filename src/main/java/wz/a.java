package wz;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class a<T> extends wz.f<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static wz.f<int[]> f122425c = new h(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static wz.f<Integer[]> f122426d = new i(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static wz.f<short[]> f122427e = new j(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static wz.f<Short[]> f122428f = new k(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static wz.f<byte[]> f122429g = new l(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static wz.f<Byte[]> f122430h = new m(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static wz.f<char[]> f122431i = new n(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static wz.f<Character[]> f122432j = new o(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static wz.f<long[]> f122433k = new p(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static wz.f<Long[]> f122434l = new C2631a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static wz.f<float[]> f122435m = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static wz.f<Float[]> f122436n = new c(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static wz.f<double[]> f122437o = new d(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static wz.f<Double[]> f122438p = new e(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static wz.f<boolean[]> f122439q = new f(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static wz.f<Boolean[]> f122440r = new g(null);

    /* JADX INFO: renamed from: wz.a$a, reason: collision with other inner class name */
    class C2631a extends a<Long[]> {
        C2631a(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Long[] b(Object obj) {
            List list = (List) obj;
            Long[] lArr = new Long[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Float) {
                        lArr[i11] = (Long) obj2;
                    } else {
                        lArr[i11] = Long.valueOf(((Number) obj2).longValue());
                    }
                    i11++;
                }
            }
            return lArr;
        }
    }

    class b extends a<float[]> {
        b(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public float[] b(Object obj) {
            List list = (List) obj;
            float[] fArr = new float[list.size()];
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                fArr[i11] = ((Number) it.next()).floatValue();
                i11++;
            }
            return fArr;
        }
    }

    class c extends a<Float[]> {
        c(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Float[] b(Object obj) {
            List list = (List) obj;
            Float[] fArr = new Float[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Float) {
                        fArr[i11] = (Float) obj2;
                    } else {
                        fArr[i11] = Float.valueOf(((Number) obj2).floatValue());
                    }
                    i11++;
                }
            }
            return fArr;
        }
    }

    class d extends a<double[]> {
        d(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public double[] b(Object obj) {
            List list = (List) obj;
            double[] dArr = new double[list.size()];
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                dArr[i11] = ((Number) it.next()).doubleValue();
                i11++;
            }
            return dArr;
        }
    }

    class e extends a<Double[]> {
        e(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Double[] b(Object obj) {
            List list = (List) obj;
            Double[] dArr = new Double[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Double) {
                        dArr[i11] = (Double) obj2;
                    } else {
                        dArr[i11] = Double.valueOf(((Number) obj2).doubleValue());
                    }
                    i11++;
                }
            }
            return dArr;
        }
    }

    class f extends a<boolean[]> {
        f(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public boolean[] b(Object obj) {
            List list = (List) obj;
            boolean[] zArr = new boolean[list.size()];
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                zArr[i11] = ((Boolean) it.next()).booleanValue();
                i11++;
            }
            return zArr;
        }
    }

    class g extends a<Boolean[]> {
        g(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean[] b(Object obj) {
            List list = (List) obj;
            Boolean[] boolArr = new Boolean[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Boolean) {
                        boolArr[i11] = (Boolean) obj2;
                    } else {
                        if (!(obj2 instanceof Number)) {
                            throw new RuntimeException("can not convert " + obj2 + " toBoolean");
                        }
                        boolArr[i11] = Boolean.valueOf(((Number) obj2).intValue() != 0);
                    }
                    i11++;
                }
            }
            return boolArr;
        }
    }

    class h extends a<int[]> {
        h(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public int[] b(Object obj) {
            List list = (List) obj;
            int[] iArr = new int[list.size()];
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                iArr[i11] = ((Number) it.next()).intValue();
                i11++;
            }
            return iArr;
        }
    }

    class i extends a<Integer[]> {
        i(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer[] b(Object obj) {
            List list = (List) obj;
            Integer[] numArr = new Integer[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Integer) {
                        numArr[i11] = (Integer) obj2;
                    } else {
                        numArr[i11] = Integer.valueOf(((Number) obj2).intValue());
                    }
                    i11++;
                }
            }
            return numArr;
        }
    }

    class j extends a<short[]> {
        j(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public short[] b(Object obj) {
            List list = (List) obj;
            short[] sArr = new short[list.size()];
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                sArr[i11] = ((Number) it.next()).shortValue();
                i11++;
            }
            return sArr;
        }
    }

    class k extends a<Short[]> {
        k(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Short[] b(Object obj) {
            List list = (List) obj;
            Short[] shArr = new Short[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Short) {
                        shArr[i11] = (Short) obj2;
                    } else {
                        shArr[i11] = Short.valueOf(((Number) obj2).shortValue());
                    }
                    i11++;
                }
            }
            return shArr;
        }
    }

    class l extends a<byte[]> {
        l(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public byte[] b(Object obj) {
            List list = (List) obj;
            byte[] bArr = new byte[list.size()];
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                bArr[i11] = ((Number) it.next()).byteValue();
                i11++;
            }
            return bArr;
        }
    }

    class m extends a<Byte[]> {
        m(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Byte[] b(Object obj) {
            List list = (List) obj;
            Byte[] bArr = new Byte[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    if (obj2 instanceof Byte) {
                        bArr[i11] = (Byte) obj2;
                    } else {
                        bArr[i11] = Byte.valueOf(((Number) obj2).byteValue());
                    }
                    i11++;
                }
            }
            return bArr;
        }
    }

    class n extends a<char[]> {
        n(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public char[] b(Object obj) {
            List list = (List) obj;
            char[] cArr = new char[list.size()];
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                cArr[i11] = it.next().toString().charAt(0);
                i11++;
            }
            return cArr;
        }
    }

    class o extends a<Character[]> {
        o(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Character[] b(Object obj) {
            List list = (List) obj;
            Character[] chArr = new Character[list.size()];
            int i11 = 0;
            for (Object obj2 : list) {
                if (obj2 != null) {
                    chArr[i11] = Character.valueOf(obj2.toString().charAt(0));
                    i11++;
                }
            }
            return chArr;
        }
    }

    class p extends a<long[]> {
        p(wz.e eVar) {
            super(eVar);
        }

        @Override // wz.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public long[] b(Object obj) {
            List list = (List) obj;
            long[] jArr = new long[list.size()];
            Iterator it = list.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                jArr[i11] = ((Number) it.next()).intValue();
                i11++;
            }
            return jArr;
        }
    }

    public a(wz.e eVar) {
        super(eVar);
    }

    @Override // wz.f
    public void a(Object obj, Object obj2) {
        ((List) obj).add(obj2);
    }

    @Override // wz.f
    public Object c() {
        return new ArrayList();
    }
}
