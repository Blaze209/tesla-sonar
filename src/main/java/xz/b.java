package xz;

/* JADX INFO: loaded from: classes6.dex */
final class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0 f124099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f124100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f124101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f124102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f124103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final b f124104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f124105i;

    b(a0 a0Var, boolean z11, d dVar, b bVar) {
        super(589824);
        this.f124099c = a0Var;
        this.f124100d = z11;
        this.f124101e = dVar;
        int i11 = dVar.f124127b;
        this.f124102f = i11 == 0 ? -1 : i11 - 2;
        this.f124104h = bVar;
        if (bVar != null) {
            bVar.f124105i = this;
        }
    }

    static int g(b bVar, b bVar2, b bVar3, b bVar4) {
        int iF = bVar != null ? bVar.f("RuntimeVisibleAnnotations") : 0;
        if (bVar2 != null) {
            iF += bVar2.f("RuntimeInvisibleAnnotations");
        }
        if (bVar3 != null) {
            iF += bVar3.f("RuntimeVisibleTypeAnnotations");
        }
        return bVar4 != null ? iF + bVar4.f("RuntimeInvisibleTypeAnnotations") : iF;
    }

    static int h(String str, b[] bVarArr, int i11) {
        int iF = (i11 * 2) + 7;
        for (int i12 = 0; i12 < i11; i12++) {
            b bVar = bVarArr[i12];
            iF += bVar == null ? 0 : bVar.f(str) - 8;
        }
        return iF;
    }

    static b i(a0 a0Var, int i11, c0 c0Var, String str, b bVar) {
        d dVar = new d();
        d0.a(i11, dVar);
        c0.d(c0Var, dVar);
        dVar.k(a0Var.D(str)).k(0);
        return new b(a0Var, true, dVar, bVar);
    }

    static b j(a0 a0Var, String str, b bVar) {
        d dVar = new d();
        dVar.k(a0Var.D(str)).k(0);
        return new b(a0Var, true, dVar, bVar);
    }

    static void l(a0 a0Var, b bVar, b bVar2, b bVar3, b bVar4, d dVar) {
        if (bVar != null) {
            bVar.k(a0Var.D("RuntimeVisibleAnnotations"), dVar);
        }
        if (bVar2 != null) {
            bVar2.k(a0Var.D("RuntimeInvisibleAnnotations"), dVar);
        }
        if (bVar3 != null) {
            bVar3.k(a0Var.D("RuntimeVisibleTypeAnnotations"), dVar);
        }
        if (bVar4 != null) {
            bVar4.k(a0Var.D("RuntimeInvisibleTypeAnnotations"), dVar);
        }
    }

    static void m(int i11, b[] bVarArr, int i12, d dVar) {
        int iF = (i12 * 2) + 1;
        for (int i13 = 0; i13 < i12; i13++) {
            b bVar = bVarArr[i13];
            iF += bVar == null ? 0 : bVar.f(null) - 8;
        }
        dVar.k(i11);
        dVar.i(iF);
        dVar.g(i12);
        for (int i14 = 0; i14 < i12; i14++) {
            int i15 = 0;
            b bVar2 = null;
            for (b bVar3 = bVarArr[i14]; bVar3 != null; bVar3 = bVar3.f124104h) {
                bVar3.d();
                i15++;
                bVar2 = bVar3;
            }
            dVar.k(i15);
            while (bVar2 != null) {
                d dVar2 = bVar2.f124101e;
                dVar.h(dVar2.f124126a, 0, dVar2.f124127b);
                bVar2 = bVar2.f124105i;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // xz.a
    public void a(String str, Object obj) {
        this.f124103g++;
        if (this.f124100d) {
            this.f124101e.k(this.f124099c.D(str));
        }
        if (obj instanceof String) {
            this.f124101e.e(115, this.f124099c.D((String) obj));
            return;
        }
        if (obj instanceof Byte) {
            this.f124101e.e(66, this.f124099c.l(((Byte) obj).byteValue()).f124301a);
            return;
        }
        if (obj instanceof Boolean) {
            this.f124101e.e(90, this.f124099c.l(((Boolean) obj).booleanValue() ? 1 : 0).f124301a);
            return;
        }
        if (obj instanceof Character) {
            this.f124101e.e(67, this.f124099c.l(((Character) obj).charValue()).f124301a);
            return;
        }
        if (obj instanceof Short) {
            this.f124101e.e(83, this.f124099c.l(((Short) obj).shortValue()).f124301a);
            return;
        }
        if (obj instanceof b0) {
            this.f124101e.e(99, this.f124099c.D(((b0) obj).d()));
            return;
        }
        int i11 = 0;
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            this.f124101e.e(91, bArr.length);
            int length = bArr.length;
            while (i11 < length) {
                this.f124101e.e(66, this.f124099c.l(bArr[i11]).f124301a);
                i11++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            this.f124101e.e(91, zArr.length);
            int length2 = zArr.length;
            while (i11 < length2) {
                this.f124101e.e(90, this.f124099c.l(zArr[i11] ? 1 : 0).f124301a);
                i11++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            this.f124101e.e(91, sArr.length);
            int length3 = sArr.length;
            while (i11 < length3) {
                this.f124101e.e(83, this.f124099c.l(sArr[i11]).f124301a);
                i11++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            this.f124101e.e(91, cArr.length);
            int length4 = cArr.length;
            while (i11 < length4) {
                this.f124101e.e(67, this.f124099c.l(cArr[i11]).f124301a);
                i11++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            this.f124101e.e(91, iArr.length);
            int length5 = iArr.length;
            while (i11 < length5) {
                this.f124101e.e(73, this.f124099c.l(iArr[i11]).f124301a);
                i11++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            this.f124101e.e(91, jArr.length);
            int length6 = jArr.length;
            while (i11 < length6) {
                this.f124101e.e(74, this.f124099c.p(jArr[i11]).f124301a);
                i11++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            this.f124101e.e(91, fArr.length);
            int length7 = fArr.length;
            while (i11 < length7) {
                this.f124101e.e(70, this.f124099c.k(fArr[i11]).f124301a);
                i11++;
            }
            return;
        }
        if (!(obj instanceof double[])) {
            z zVarD = this.f124099c.d(obj);
            this.f124101e.e(".s.IFJDCS".charAt(zVarD.f124302b), zVarD.f124301a);
            return;
        }
        double[] dArr = (double[]) obj;
        this.f124101e.e(91, dArr.length);
        int length8 = dArr.length;
        while (i11 < length8) {
            this.f124101e.e(68, this.f124099c.f(dArr[i11]).f124301a);
            i11++;
        }
    }

    @Override // xz.a
    public a b(String str, String str2) {
        this.f124103g++;
        if (this.f124100d) {
            this.f124101e.k(this.f124099c.D(str));
        }
        this.f124101e.e(64, this.f124099c.D(str2)).k(0);
        return new b(this.f124099c, true, this.f124101e, null);
    }

    @Override // xz.a
    public a c(String str) {
        this.f124103g++;
        if (this.f124100d) {
            this.f124101e.k(this.f124099c.D(str));
        }
        this.f124101e.e(91, 0);
        return new b(this.f124099c, false, this.f124101e, null);
    }

    @Override // xz.a
    public void d() {
        int i11 = this.f124102f;
        if (i11 != -1) {
            byte[] bArr = this.f124101e.f124126a;
            int i12 = this.f124103g;
            bArr[i11] = (byte) (i12 >>> 8);
            bArr[i11 + 1] = (byte) i12;
        }
    }

    @Override // xz.a
    public void e(String str, String str2, String str3) {
        this.f124103g++;
        if (this.f124100d) {
            this.f124101e.k(this.f124099c.D(str));
        }
        this.f124101e.e(101, this.f124099c.D(str2)).k(this.f124099c.D(str3));
    }

    int f(String str) {
        if (str != null) {
            this.f124099c.D(str);
        }
        int i11 = 8;
        for (b bVar = this; bVar != null; bVar = bVar.f124104h) {
            i11 += bVar.f124101e.f124127b;
        }
        return i11;
    }

    void k(int i11, d dVar) {
        int i12 = 2;
        int i13 = 0;
        b bVar = null;
        for (b bVar2 = this; bVar2 != null; bVar2 = bVar2.f124104h) {
            bVar2.d();
            i12 += bVar2.f124101e.f124127b;
            i13++;
            bVar = bVar2;
        }
        dVar.k(i11);
        dVar.i(i12);
        dVar.k(i13);
        while (bVar != null) {
            d dVar2 = bVar.f124101e;
            dVar.h(dVar2.f124126a, 0, dVar2.f124127b);
            bVar = bVar.f124105i;
        }
    }
}
