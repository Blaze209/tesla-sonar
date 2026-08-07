package d5;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import e5.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {
    public static float U0 = 0.5f;
    int A0;
    int B0;
    boolean C0;
    boolean D0;
    boolean E0;
    public boolean F;
    boolean F0;
    public boolean G;
    boolean G0;
    boolean H0;
    boolean I0;
    int J0;
    int K0;
    boolean L0;
    private boolean M;
    boolean M0;
    public float[] N0;
    protected e[] O0;
    protected e[] P0;
    e Q0;
    e R0;
    public int S0;
    public int T0;
    public d X;
    public d[] Y;
    protected ArrayList<d> Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean[] f59429a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public b[] f59431b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e5.c f59432c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public e f59433c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e5.c f59434d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    int f59435d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    int f59437e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public float f59439f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    protected int f59441g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    protected int f59443h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    protected int f59445i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    int f59447j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    int f59449k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    protected int f59451l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected int f59453m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    int f59455n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f59456o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    protected int f59457o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    protected int f59459p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    float f59461q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    float f59463r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private Object f59465s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private int f59467t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f59469u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f59471v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private String f59473w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private String f59475x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    int f59477y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    int f59479z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f59428a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p[] f59430b = new p[2];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e5.l f59436e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e5.n f59438f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean[] f59440g = {true, true};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f59442h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f59444i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f59446j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f59448k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f59450l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f59452m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c5.a f59454n = new c5.a(this);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f59458p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f59460q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f59462r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f59464s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f59466t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f59468u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f59470v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f59472w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f59474x = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int[] f59476y = new int[2];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f59478z = 0;
    public int A = 0;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public float E = 1.0f;
    int H = -1;
    float I = 1.0f;
    private int[] J = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    public float K = Float.NaN;
    private boolean L = false;
    private boolean N = false;
    private int O = 0;
    private int P = 0;
    public d Q = new d(this, d.a.LEFT);
    public d R = new d(this, d.a.TOP);
    public d S = new d(this, d.a.RIGHT);
    public d T = new d(this, d.a.BOTTOM);
    public d U = new d(this, d.a.BASELINE);
    d V = new d(this, d.a.CENTER_X);
    d W = new d(this, d.a.CENTER_Y);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f59480a;

        static {
            int[] iArr = new int[d.a.values().length];
            f59480a = iArr;
            try {
                iArr[d.a.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59480a[d.a.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59480a[d.a.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f59480a[d.a.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f59480a[d.a.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f59480a[d.a.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f59480a[d.a.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f59480a[d.a.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f59480a[d.a.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.a.CENTER);
        this.X = dVar;
        this.Y = new d[]{this.Q, this.S, this.R, this.T, this.U, dVar};
        this.Z = new ArrayList<>();
        this.f59429a0 = new boolean[2];
        b bVar = b.FIXED;
        this.f59431b0 = new b[]{bVar, bVar};
        this.f59433c0 = null;
        this.f59435d0 = 0;
        this.f59437e0 = 0;
        this.f59439f0 = BitmapDescriptorFactory.HUE_RED;
        this.f59441g0 = -1;
        this.f59443h0 = 0;
        this.f59445i0 = 0;
        this.f59447j0 = 0;
        this.f59449k0 = 0;
        this.f59451l0 = 0;
        this.f59453m0 = 0;
        this.f59455n0 = 0;
        float f11 = U0;
        this.f59461q0 = f11;
        this.f59463r0 = f11;
        this.f59467t0 = 0;
        this.f59469u0 = 0;
        this.f59471v0 = false;
        this.f59473w0 = null;
        this.f59475x0 = null;
        this.I0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.N0 = new float[]{-1.0f, -1.0f};
        this.O0 = new e[]{null, null};
        this.P0 = new e[]{null, null};
        this.Q0 = null;
        this.R0 = null;
        this.S0 = -1;
        this.T0 = -1;
        d();
    }

    private void A0(StringBuilder sb2, String str, float f11, float f12) {
        if (f11 == f12) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f11);
        sb2.append(",\n");
    }

    private void B0(StringBuilder sb2, String str, int i11, int i12) {
        if (i11 == i12) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i11);
        sb2.append(",\n");
    }

    private void C0(StringBuilder sb2, String str, String str2, String str3) {
        if (str3.equals(str2)) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(str2);
        sb2.append(",\n");
    }

    private void D0(StringBuilder sb2, String str, float f11, int i11) {
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f11);
        sb2.append(",");
        sb2.append(i11);
        sb2.append("");
        sb2.append("],\n");
    }

    private void R(StringBuilder sb2, String str, int i11, int i12, int i13, int i14, int i15, int i16, float f11, b bVar, float f12) {
        sb2.append(str);
        sb2.append(" :  {\n");
        C0(sb2, "      behavior", bVar.toString(), b.FIXED.toString());
        B0(sb2, "      size", i11, 0);
        B0(sb2, "      min", i12, 0);
        B0(sb2, "      max", i13, Integer.MAX_VALUE);
        B0(sb2, "      matchMin", i15, 0);
        B0(sb2, "      matchDef", i16, 0);
        A0(sb2, "      matchPercent", f11, 1.0f);
        sb2.append("    },\n");
    }

    private void S(StringBuilder sb2, String str, d dVar) {
        if (dVar.f59424f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f59424f);
        sb2.append("'");
        if (dVar.f59426h != Integer.MIN_VALUE || dVar.f59425g != 0) {
            sb2.append(",");
            sb2.append(dVar.f59425g);
            if (dVar.f59426h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f59426h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    private void d() {
        this.Z.add(this.Q);
        this.Z.add(this.R);
        this.Z.add(this.S);
        this.Z.add(this.T);
        this.Z.add(this.V);
        this.Z.add(this.W);
        this.Z.add(this.X);
        this.Z.add(this.U);
    }

    private boolean h0(int i11) {
        d dVar;
        d dVar2;
        int i12 = i11 * 2;
        d[] dVarArr = this.Y;
        d dVar3 = dVarArr[i12];
        d dVar4 = dVar3.f59424f;
        return (dVar4 == null || dVar4.f59424f == dVar3 || (dVar2 = (dVar = dVarArr[i12 + 1]).f59424f) == null || dVar2.f59424f != dVar) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:362:0x0582  */
    private void i(a5.d dVar, boolean z11, boolean z12, boolean z13, boolean z14, a5.i iVar, a5.i iVar2, b bVar, boolean z15, d dVar2, d dVar3, int i11, int i12, int i13, int i14, float f11, boolean z16, boolean z17, boolean z18, boolean z19, boolean z21, int i15, int i16, int i17, int i18, float f12, boolean z22) {
        boolean z23;
        int iMin;
        int i19;
        a5.i iVar3;
        boolean z24;
        boolean z25;
        int i21;
        int i22;
        a5.i iVarQ;
        a5.i iVarQ2;
        int i23;
        char c11;
        char c12;
        d dVar4;
        boolean z26;
        a5.i iVar4;
        boolean z27;
        boolean z28;
        int i24;
        int i25;
        boolean z29;
        boolean z31;
        a5.i iVar5;
        e eVar;
        int i26;
        boolean z32;
        int iMin2;
        int i27;
        int i28;
        int i29;
        int i31;
        int i32;
        int i33;
        int i34;
        e eVar2;
        int i35;
        e eVar3;
        dVar = dVar;
        a5.i iVarQ3 = dVar.q(dVar2);
        a5.i iVarQ4 = dVar.q(dVar3);
        a5.i iVarQ5 = dVar.q(dVar2.j());
        a5.i iVarQ6 = dVar.q(dVar3.j());
        a5.d.x();
        boolean zO = dVar2.o();
        boolean zO2 = dVar3.o();
        boolean zO3 = this.X.o();
        int i36 = zO2 ? (zO ? 1 : 0) + 1 : zO ? 1 : 0;
        if (zO3) {
            i36++;
        }
        int i37 = z16 ? 3 : i15;
        a5.i iVar6 = iVarQ6;
        int iOrdinal = bVar.ordinal();
        boolean z33 = (iOrdinal == 0 || iOrdinal == 1 || iOrdinal != 2 || i37 == 4) ? false : true;
        int i38 = this.f59450l;
        if (i38 != -1 && z11) {
            this.f59450l = -1;
            i12 = i38;
            z33 = false;
        }
        int i39 = this.f59452m;
        if (i39 == -1 || z11) {
            i39 = i12;
        } else {
            this.f59452m = -1;
            z33 = false;
        }
        int i41 = i39;
        if (this.f59469u0 == 8) {
            iMin = 0;
            z23 = false;
        } else {
            z23 = z33;
            iMin = i41;
        }
        if (z22) {
            if (!zO && !zO2 && !zO3) {
                dVar.f(iVarQ3, i11);
            } else if (zO && !zO2) {
                i19 = 8;
                dVar.e(iVarQ3, iVarQ5, dVar2.f(), 8);
            }
            i19 = 8;
        } else {
            i19 = 8;
        }
        if (z23 == 0) {
            if (z15) {
                dVar.e(iVarQ4, iVarQ3, 0, 3);
                if (i13 > 0) {
                    dVar.h(iVarQ4, iVarQ3, i13, 8);
                }
                if (i14 < Integer.MAX_VALUE) {
                    dVar.j(iVarQ4, iVarQ3, i14, 8);
                }
            } else {
                dVar.e(iVarQ4, iVarQ3, iMin, i19);
            }
            i22 = i18;
            iVar3 = iVarQ4;
            i36 = i36 == true ? 1 : 0;
            iVar6 = iVar6;
            z24 = z23;
            z25 = z14;
            i21 = i17;
        } else if (i36 == 2 || z16 || !(i37 == 1 || i37 == 0)) {
            int i42 = i17 == -2 ? iMin : i17;
            int i43 = i18 == -2 ? iMin : i18;
            if (iMin > 0 && i37 != 1) {
                iMin = 0;
            }
            if (i42 > 0) {
                dVar.h(iVarQ4, iVarQ3, i42, 8);
                iMin = Math.max(iMin, i42);
            }
            if (i43 > 0) {
                if (!z12 || i37 != 1) {
                    dVar.j(iVarQ4, iVarQ3, i43, 8);
                }
                iMin = Math.min(iMin, i43);
            }
            if (i37 == 1) {
                if (z12) {
                    dVar.e(iVarQ4, iVarQ3, iMin, 8);
                } else if (z18) {
                    dVar.e(iVarQ4, iVarQ3, iMin, 5);
                    dVar.j(iVarQ4, iVarQ3, iMin, 8);
                } else {
                    dVar.e(iVarQ4, iVarQ3, iMin, 5);
                    dVar.j(iVarQ4, iVarQ3, iMin, 8);
                }
                iVar3 = iVarQ4;
                iVar6 = iVar6;
                z24 = z23;
                z25 = z14;
                i21 = i42;
                i22 = i43;
                i36 = i36 == true ? 1 : 0;
            } else {
                if (i37 == 2) {
                    d.a aVarK = dVar2.k();
                    d.a aVar = d.a.TOP;
                    if (aVarK == aVar || dVar2.k() == d.a.BOTTOM) {
                        iVarQ = dVar.q(this.f59433c0.q(aVar));
                        iVarQ2 = dVar.q(this.f59433c0.q(d.a.BOTTOM));
                    } else {
                        iVarQ = dVar.q(this.f59433c0.q(d.a.LEFT));
                        iVarQ2 = dVar.q(this.f59433c0.q(d.a.RIGHT));
                    }
                    a5.i iVar7 = iVarQ2;
                    iVar3 = iVarQ4;
                    dVar.d(dVar.r().k(iVar3, iVarQ3, iVar7, iVarQ, f12));
                    if (z12) {
                        z23 = false;
                    }
                    z25 = z14;
                    z24 = z23;
                } else {
                    iVar3 = iVarQ4;
                    z24 = z23;
                    z25 = true;
                }
                i21 = i42;
                i22 = i43;
            }
        } else {
            int iMax = Math.max(i17, iMin);
            if (i18 > 0) {
                iMax = Math.min(i18, iMax);
            }
            dVar.e(iVarQ4, iVarQ3, iMax, 8);
            i21 = i17;
            i22 = i18;
            iVar3 = iVarQ4;
            i36 = i36 == true ? 1 : 0;
            iVar6 = iVar6;
            z24 = false;
            z25 = z14;
        }
        if (!z22) {
            i23 = 8;
            c11 = 1;
            c12 = 2;
        } else {
            if (!z18) {
                if (!zO && !zO2 && !zO3) {
                    i28 = 5;
                    z32 = z12;
                    i35 = i28;
                } else if (!zO || zO2) {
                    if (zO || !zO2) {
                        if (zO && zO2) {
                            e eVar4 = dVar2.f59424f.f59422d;
                            e eVar5 = dVar3.f59424f.f59422d;
                            e eVarM = M();
                            int i44 = 6;
                            if (!z24) {
                                z26 = true;
                                if (iVarQ5.f337g && iVar6.f337g) {
                                    a5.i iVar8 = iVar6;
                                    dVar.c(iVarQ3, iVarQ5, dVar2.f(), f11, iVar8, iVar3, dVar3.f(), 8);
                                    if (z12 && z25) {
                                        int iF = dVar3.f59424f != null ? dVar3.f() : 0;
                                        if (iVar8 != iVar2) {
                                            dVar.h(iVar2, iVar3, iF, 5);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                a5.i iVar9 = iVar6;
                                iVarQ3 = iVarQ3;
                                iVar4 = iVar9;
                                dVar = dVar;
                                iVarQ5 = iVarQ5;
                                z27 = true;
                                z28 = true;
                                i44 = 6;
                                i24 = 5;
                                i25 = 4;
                                z29 = false;
                            } else if (i37 == 0) {
                                if (i22 != 0 || i21 != 0) {
                                    i33 = 5;
                                    i34 = 5;
                                    z28 = true;
                                    z29 = false;
                                    z27 = true;
                                } else if (iVarQ5.f337g && iVar6.f337g) {
                                    dVar.e(iVarQ3, iVarQ5, dVar2.f(), 8);
                                    dVar.e(iVar3, iVar6, -dVar3.f(), 8);
                                    return;
                                } else {
                                    i33 = 8;
                                    i34 = 8;
                                    z28 = false;
                                    z29 = true;
                                    z27 = false;
                                }
                                if ((eVar4 instanceof d5.a) || (eVar5 instanceof d5.a)) {
                                    iVar4 = iVar6;
                                    z26 = true;
                                    i25 = 4;
                                } else {
                                    iVar4 = iVar6;
                                    i25 = i34;
                                    z26 = true;
                                }
                                i24 = i33;
                                iVarQ5 = iVarQ5;
                                i44 = 6;
                            } else {
                                if (i37 == 2) {
                                    if ((eVar4 instanceof d5.a) || (eVar5 instanceof d5.a)) {
                                        iVar4 = iVar6;
                                        z26 = true;
                                        i25 = 4;
                                    } else {
                                        iVar4 = iVar6;
                                        z26 = true;
                                        i25 = 5;
                                    }
                                    i24 = 5;
                                } else if (i37 == 1) {
                                    a5.i iVar10 = iVar6;
                                    iVarQ3 = iVarQ3;
                                    iVar4 = iVar10;
                                    iVarQ5 = iVarQ5;
                                    i44 = 6;
                                    z26 = true;
                                    i25 = 4;
                                    i24 = 8;
                                } else if (i37 != 3) {
                                    z26 = true;
                                    a5.i iVar11 = iVar6;
                                    iVarQ3 = iVarQ3;
                                    iVar4 = iVar11;
                                    dVar = dVar;
                                    iVarQ5 = iVarQ5;
                                    i44 = 6;
                                    i25 = 4;
                                    i24 = 5;
                                    z27 = false;
                                    z28 = false;
                                    z29 = false;
                                } else if (this.H == -1) {
                                    if (z19) {
                                        a5.i iVar12 = iVar6;
                                        iVarQ3 = iVarQ3;
                                        iVar4 = iVar12;
                                        dVar = dVar;
                                        iVarQ5 = iVarQ5;
                                        z26 = true;
                                        i44 = z12 ? 5 : 4;
                                    } else {
                                        a5.i iVar13 = iVar6;
                                        iVarQ3 = iVarQ3;
                                        iVar4 = iVar13;
                                        dVar = dVar;
                                        iVarQ5 = iVarQ5;
                                        z26 = true;
                                        i44 = 8;
                                    }
                                    i25 = 5;
                                    i24 = 8;
                                    z27 = true;
                                    z28 = true;
                                    z29 = true;
                                } else {
                                    if (z16) {
                                        if (i16 != 2) {
                                            z26 = true;
                                            if (i16 != 1) {
                                                i31 = 8;
                                                i32 = 5;
                                            }
                                            iVar4 = iVar6;
                                            i24 = i31;
                                            i25 = i32;
                                            z27 = z26;
                                            z28 = z27;
                                            z29 = z28;
                                        } else {
                                            z26 = true;
                                        }
                                        i31 = 5;
                                        i32 = 4;
                                        iVar4 = iVar6;
                                        i24 = i31;
                                        i25 = i32;
                                        z27 = z26;
                                        z28 = z27;
                                        z29 = z28;
                                    } else {
                                        z26 = true;
                                        if (i22 > 0) {
                                            iVar4 = iVar6;
                                            z27 = true;
                                            z28 = true;
                                            z29 = true;
                                            i25 = 5;
                                        } else if (i22 != 0 || i21 != 0) {
                                            iVar4 = iVar6;
                                            z27 = true;
                                            z28 = true;
                                            z29 = true;
                                            i25 = 4;
                                        } else if (z19) {
                                            iVar4 = iVar6;
                                            i24 = (eVar4 == eVarM || eVar5 == eVarM) ? 5 : 4;
                                            z27 = true;
                                            z28 = true;
                                            z29 = true;
                                            i25 = 4;
                                        } else {
                                            iVar4 = iVar6;
                                            z27 = true;
                                            z28 = true;
                                            z29 = true;
                                            i25 = 8;
                                        }
                                        i24 = 5;
                                    }
                                    dVar = dVar;
                                }
                                z27 = true;
                                z28 = true;
                                z29 = false;
                            }
                            if (z27 && iVarQ5 == iVar4 && eVar4 != eVarM) {
                                z27 = false;
                                z31 = false;
                            } else {
                                z31 = z26;
                            }
                            if (z28) {
                                if (z24 || z17 || z19 || iVarQ5 != iVar || iVar4 != iVar2) {
                                    i29 = i44;
                                    z32 = z12;
                                } else {
                                    i29 = 8;
                                    z32 = false;
                                    i24 = 8;
                                    z31 = false;
                                }
                                a5.i iVar14 = iVarQ3;
                                eVar = eVarM;
                                i26 = 8;
                                a5.i iVar15 = iVar3;
                                dVar.c(iVar14, iVarQ5, dVar2.f(), f11, iVar4, iVar15, dVar3.f(), i29);
                                a5.i iVar16 = iVar4;
                                iVar5 = iVar14;
                                iVar6 = iVar16;
                                iVar3 = iVar15;
                            } else {
                                iVar6 = iVar4;
                                iVar5 = iVarQ3;
                                eVar = eVarM;
                                z26 = z26;
                                i26 = 8;
                                z32 = z12;
                            }
                            if (this.f59469u0 == i26 && !dVar3.m()) {
                                return;
                            }
                            if (z27) {
                                int i45 = (!z32 || iVarQ5 == iVar6 || z24 || !((eVar4 instanceof d5.a) || (eVar5 instanceof d5.a))) ? i24 : 6;
                                dVar.h(iVar5, iVarQ5, dVar2.f(), i45);
                                dVar.j(iVar3, iVar6, -dVar3.f(), i45);
                                i24 = i45;
                            }
                            if (!z32 || !z21 || (eVar4 instanceof d5.a) || (eVar5 instanceof d5.a) || eVar5 == eVar) {
                                iMin2 = i25;
                                i27 = i24;
                                z26 = z31;
                            } else {
                                iMin2 = 6;
                                i27 = 6;
                            }
                            if (z26) {
                                if (z29 && (!z19 || z13)) {
                                    if (eVar4 != eVar && eVar5 != eVar) {
                                        i44 = iMin2;
                                    }
                                    if ((eVar4 instanceof h) || (eVar5 instanceof h)) {
                                        i44 = 5;
                                    }
                                    if ((eVar4 instanceof d5.a) || (eVar5 instanceof d5.a)) {
                                        i44 = 5;
                                    }
                                    iMin2 = Math.max(z19 ? 5 : i44, iMin2);
                                }
                                if (z32) {
                                    iMin2 = Math.min(i27, iMin2);
                                    if (z16 && !z19 && (eVar4 == eVar || eVar5 == eVar)) {
                                        iMin2 = 4;
                                    }
                                }
                                dVar.e(iVar5, iVarQ5, dVar2.f(), iMin2);
                                dVar.e(iVar3, iVar6, -dVar3.f(), iMin2);
                            }
                            if (z32) {
                                int iF2 = iVar == iVarQ5 ? dVar2.f() : 0;
                                if (iVarQ5 != iVar) {
                                    dVar.h(iVar5, iVar, iF2, 5);
                                }
                            }
                            if (!z32 || !z24 || i13 != 0 || i21 != 0) {
                                i28 = 5;
                            } else if (z24 && i37 == 3) {
                                dVar.h(iVar3, iVar5, 0, i26);
                                i28 = 5;
                            } else {
                                i28 = 5;
                                dVar.h(iVar3, iVar5, 0, 5);
                            }
                        }
                        i35 = i28;
                    } else {
                        dVar.e(iVar3, iVar6, -dVar3.f(), 8);
                        if (z12) {
                            if (this.f59446j && iVarQ3.f337g && (eVar2 = this.f59433c0) != null) {
                                f fVar = (f) eVar2;
                                if (z11) {
                                    fVar.E1(dVar2);
                                } else {
                                    fVar.J1(dVar2);
                                }
                            } else {
                                i28 = 5;
                                dVar.h(iVarQ3, iVar, 0, 5);
                            }
                        }
                        z32 = z12;
                        i35 = i28;
                    }
                    i28 = 5;
                    z32 = z12;
                    i35 = i28;
                } else {
                    i35 = (z12 && (dVar2.f59424f.f59422d instanceof d5.a)) ? 8 : 5;
                    z32 = z12;
                    iVar6 = iVar6;
                }
                if (z32 && z25) {
                    int iF3 = dVar3.f59424f != null ? dVar3.f() : 0;
                    if (iVar6 != iVar2) {
                        if (!this.f59446j || !iVar3.f337g || (eVar3 = this.f59433c0) == null) {
                            dVar.h(iVar2, iVar3, iF3, i35);
                            return;
                        }
                        f fVar2 = (f) eVar3;
                        if (z11) {
                            fVar2.D1(dVar3);
                            return;
                        } else {
                            fVar2.I1(dVar3);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            c12 = 2;
            i23 = 8;
            c11 = 1;
        }
        if (i36 < c12 && z12 && z25) {
            dVar.h(iVarQ3, iVar, 0, i23);
            char c13 = (z11 || this.U.f59424f == null) ? c11 : (char) 0;
            if (!z11 && (dVar4 = this.U.f59424f) != null) {
                e eVar6 = dVar4.f59422d;
                if (eVar6.f59439f0 != BitmapDescriptorFactory.HUE_RED) {
                    b[] bVarArr = eVar6.f59431b0;
                    b bVar2 = bVarArr[0];
                    b bVar3 = b.MATCH_CONSTRAINT;
                    if (bVar2 == bVar3 && bVarArr[c11] == bVar3) {
                        c13 = c11;
                    } else {
                        c13 = 0;
                    }
                } else {
                    c13 = 0;
                }
            }
            if (c13 != 0) {
                dVar.h(iVar2, iVar3, 0, i23);
            }
        }
    }

    public float A() {
        return this.f59461q0;
    }

    public int B() {
        return this.J0;
    }

    public b C() {
        return this.f59431b0[0];
    }

    public int D() {
        d dVar = this.Q;
        int i11 = dVar != null ? dVar.f59425g : 0;
        d dVar2 = this.S;
        return dVar2 != null ? i11 + dVar2.f59425g : i11;
    }

    public int E() {
        return this.O;
    }

    public void E0(boolean z11) {
        this.f59471v0 = z11;
    }

    public int F() {
        return this.P;
    }

    public void F0(int i11) {
        this.f59455n0 = i11;
        this.L = i11 > 0;
    }

    public int G(int i11) {
        if (i11 == 0) {
            return Y();
        }
        if (i11 == 1) {
            return z();
        }
        return 0;
    }

    public void G0(Object obj) {
        this.f59465s0 = obj;
    }

    public int H() {
        return this.J[1];
    }

    public void H0(String str) {
        this.f59473w0 = str;
    }

    public int I() {
        return this.J[0];
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    public void I0(String str) {
        float fAbs;
        int i11 = 0;
        if (str == null || str.length() == 0) {
            this.f59439f0 = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        int length = str.length();
        int iIndexOf = str.indexOf(44);
        int i12 = 0;
        int i13 = -1;
        if (iIndexOf > 0 && iIndexOf < length - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            if (!strSubstring.equalsIgnoreCase("W")) {
                i12 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            i13 = i12;
            i12 = iIndexOf + 1;
        }
        int iIndexOf2 = str.indexOf(58);
        try {
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i12);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                } else {
                    fAbs = i11;
                }
            } else {
                String strSubstring3 = str.substring(i12, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                    fAbs = i11;
                } else {
                    float f11 = Float.parseFloat(strSubstring3);
                    float f12 = Float.parseFloat(strSubstring4);
                    if (f11 <= BitmapDescriptorFactory.HUE_RED || f12 <= BitmapDescriptorFactory.HUE_RED) {
                        fAbs = i11;
                    } else {
                        fAbs = i13 == 1 ? Math.abs(f12 / f11) : Math.abs(f11 / f12);
                    }
                }
            }
        } catch (NumberFormatException unused) {
        }
        i11 = (fAbs > i11 ? 1 : (fAbs == i11 ? 0 : -1));
        if (i11 > 0) {
            this.f59439f0 = fAbs;
            this.f59441g0 = i13;
        }
    }

    public int J() {
        return this.f59459p0;
    }

    public void J0(int i11) {
        if (this.L) {
            int i12 = i11 - this.f59455n0;
            int i13 = this.f59437e0 + i12;
            this.f59445i0 = i12;
            this.R.t(i12);
            this.T.t(i13);
            this.U.t(i11);
            this.f59460q = true;
        }
    }

    public int K() {
        return this.f59457o0;
    }

    public void K0(int i11, int i12) {
        if (this.f59458p) {
            return;
        }
        this.Q.t(i11);
        this.S.t(i12);
        this.f59443h0 = i11;
        this.f59435d0 = i12 - i11;
        this.f59458p = true;
    }

    public e L(int i11) {
        d dVar;
        d dVar2;
        if (i11 != 0) {
            if (i11 == 1 && (dVar2 = (dVar = this.T).f59424f) != null && dVar2.f59424f == dVar) {
                return dVar2.f59422d;
            }
            return null;
        }
        d dVar3 = this.S;
        d dVar4 = dVar3.f59424f;
        if (dVar4 == null || dVar4.f59424f != dVar3) {
            return null;
        }
        return dVar4.f59422d;
    }

    public void L0(int i11) {
        this.Q.t(i11);
        this.f59443h0 = i11;
    }

    public e M() {
        return this.f59433c0;
    }

    public void M0(int i11) {
        this.R.t(i11);
        this.f59445i0 = i11;
    }

    public e N(int i11) {
        d dVar;
        d dVar2;
        if (i11 != 0) {
            if (i11 == 1 && (dVar2 = (dVar = this.R).f59424f) != null && dVar2.f59424f == dVar) {
                return dVar2.f59422d;
            }
            return null;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f59424f;
        if (dVar4 == null || dVar4.f59424f != dVar3) {
            return null;
        }
        return dVar4.f59422d;
    }

    public void N0(int i11, int i12) {
        if (this.f59460q) {
            return;
        }
        this.R.t(i11);
        this.T.t(i12);
        this.f59445i0 = i11;
        this.f59437e0 = i12 - i11;
        if (this.L) {
            this.U.t(i11 + this.f59455n0);
        }
        this.f59460q = true;
    }

    public int O() {
        return Z() + this.f59435d0;
    }

    public void O0(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17 = i13 - i11;
        int i18 = i14 - i12;
        this.f59443h0 = i11;
        this.f59445i0 = i12;
        if (this.f59469u0 == 8) {
            this.f59435d0 = 0;
            this.f59437e0 = 0;
            return;
        }
        b[] bVarArr = this.f59431b0;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i17 < (i16 = this.f59435d0)) {
            i17 = i16;
        }
        if (bVarArr[1] == bVar2 && i18 < (i15 = this.f59437e0)) {
            i18 = i15;
        }
        this.f59435d0 = i17;
        this.f59437e0 = i18;
        int i19 = this.f59459p0;
        if (i18 < i19) {
            this.f59437e0 = i19;
        }
        int i21 = this.f59457o0;
        if (i17 < i21) {
            this.f59435d0 = i21;
        }
        int i22 = this.A;
        if (i22 > 0 && bVar == b.MATCH_CONSTRAINT) {
            this.f59435d0 = Math.min(this.f59435d0, i22);
        }
        int i23 = this.D;
        if (i23 > 0 && this.f59431b0[1] == b.MATCH_CONSTRAINT) {
            this.f59437e0 = Math.min(this.f59437e0, i23);
        }
        int i24 = this.f59435d0;
        if (i17 != i24) {
            this.f59450l = i24;
        }
        int i25 = this.f59437e0;
        if (i18 != i25) {
            this.f59452m = i25;
        }
    }

    public p P(int i11) {
        if (i11 == 0) {
            return this.f59436e;
        }
        if (i11 == 1) {
            return this.f59438f;
        }
        return null;
    }

    public void P0(boolean z11) {
        this.L = z11;
    }

    public void Q(StringBuilder sb2) {
        sb2.append("  " + this.f59456o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f59435d0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f59437e0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f59443h0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f59445i0);
        sb2.append("\n");
        S(sb2, "left", this.Q);
        S(sb2, "top", this.R);
        S(sb2, "right", this.S);
        S(sb2, "bottom", this.T);
        S(sb2, "baseline", this.U);
        S(sb2, "centerX", this.V);
        S(sb2, "centerY", this.W);
        R(sb2, "    width", this.f59435d0, this.f59457o0, this.J[0], this.f59450l, this.f59478z, this.f59472w, this.B, this.f59431b0[0], this.N0[0]);
        R(sb2, "    height", this.f59437e0, this.f59459p0, this.J[1], this.f59452m, this.C, this.f59474x, this.E, this.f59431b0[1], this.N0[1]);
        D0(sb2, "    dimensionRatio", this.f59439f0, this.f59441g0);
        A0(sb2, "    horizontalBias", this.f59461q0, U0);
        A0(sb2, "    verticalBias", this.f59463r0, U0);
        B0(sb2, "    horizontalChainStyle", this.J0, 0);
        B0(sb2, "    verticalChainStyle", this.K0, 0);
        sb2.append("  }");
    }

    public void Q0(int i11) {
        this.f59437e0 = i11;
        int i12 = this.f59459p0;
        if (i11 < i12) {
            this.f59437e0 = i12;
        }
    }

    public void R0(float f11) {
        this.f59461q0 = f11;
    }

    public void S0(int i11) {
        this.J0 = i11;
    }

    public float T() {
        return this.f59463r0;
    }

    public void T0(int i11, int i12) {
        this.f59443h0 = i11;
        int i13 = i12 - i11;
        this.f59435d0 = i13;
        int i14 = this.f59457o0;
        if (i13 < i14) {
            this.f59435d0 = i14;
        }
    }

    public int U() {
        return this.K0;
    }

    public void U0(b bVar) {
        this.f59431b0[0] = bVar;
    }

    public b V() {
        return this.f59431b0[1];
    }

    public void V0(int i11, int i12, int i13, float f11) {
        this.f59472w = i11;
        this.f59478z = i12;
        if (i13 == Integer.MAX_VALUE) {
            i13 = 0;
        }
        this.A = i13;
        this.B = f11;
        if (f11 <= BitmapDescriptorFactory.HUE_RED || f11 >= 1.0f || i11 != 0) {
            return;
        }
        this.f59472w = 2;
    }

    public int W() {
        int i11 = this.Q != null ? this.R.f59425g : 0;
        return this.S != null ? i11 + this.T.f59425g : i11;
    }

    public void W0(float f11) {
        this.N0[0] = f11;
    }

    public int X() {
        return this.f59469u0;
    }

    protected void X0(int i11, boolean z11) {
        this.f59429a0[i11] = z11;
    }

    public int Y() {
        if (this.f59469u0 == 8) {
            return 0;
        }
        return this.f59435d0;
    }

    public void Y0(boolean z11) {
        this.M = z11;
    }

    public int Z() {
        e eVar = this.f59433c0;
        return (eVar == null || !(eVar instanceof f)) ? this.f59443h0 : ((f) eVar).f59483c1 + this.f59443h0;
    }

    public void Z0(boolean z11) {
        this.N = z11;
    }

    public int a0() {
        e eVar = this.f59433c0;
        return (eVar == null || !(eVar instanceof f)) ? this.f59445i0 : ((f) eVar).f59484d1 + this.f59445i0;
    }

    public void a1(int i11, int i12) {
        this.O = i11;
        this.P = i12;
        d1(false);
    }

    public boolean b0() {
        return this.L;
    }

    public void b1(int i11) {
        this.J[1] = i11;
    }

    public boolean c0(int i11) {
        if (i11 == 0) {
            return (this.Q.f59424f != null ? 1 : 0) + (this.S.f59424f != null ? 1 : 0) < 2;
        }
        return ((this.R.f59424f != null ? 1 : 0) + (this.T.f59424f != null ? 1 : 0)) + (this.U.f59424f != null ? 1 : 0) < 2;
    }

    public void c1(int i11) {
        this.J[0] = i11;
    }

    public boolean d0() {
        int size = this.Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.Z.get(i11).m()) {
                return true;
            }
        }
        return false;
    }

    public void d1(boolean z11) {
        this.f59444i = z11;
    }

    public void e(f fVar, a5.d dVar, HashSet<e> hashSet, int i11, boolean z11) {
        if (z11) {
            if (!hashSet.contains(this)) {
                return;
            }
            k.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.Z1(64));
        }
        if (i11 == 0) {
            HashSet<d> hashSetD = this.Q.d();
            if (hashSetD != null) {
                Iterator<d> it = hashSetD.iterator();
                while (it.hasNext()) {
                    it.next().f59422d.e(fVar, dVar, hashSet, i11, true);
                }
            }
            HashSet<d> hashSetD2 = this.S.d();
            if (hashSetD2 != null) {
                Iterator<d> it2 = hashSetD2.iterator();
                while (it2.hasNext()) {
                    it2.next().f59422d.e(fVar, dVar, hashSet, i11, true);
                }
                return;
            }
            return;
        }
        HashSet<d> hashSetD3 = this.R.d();
        if (hashSetD3 != null) {
            Iterator<d> it3 = hashSetD3.iterator();
            while (it3.hasNext()) {
                it3.next().f59422d.e(fVar, dVar, hashSet, i11, true);
            }
        }
        HashSet<d> hashSetD4 = this.T.d();
        if (hashSetD4 != null) {
            Iterator<d> it4 = hashSetD4.iterator();
            while (it4.hasNext()) {
                it4.next().f59422d.e(fVar, dVar, hashSet, i11, true);
            }
        }
        HashSet<d> hashSetD5 = this.U.d();
        if (hashSetD5 != null) {
            Iterator<d> it5 = hashSetD5.iterator();
            while (it5.hasNext()) {
                it5.next().f59422d.e(fVar, dVar, hashSet, i11, true);
            }
        }
    }

    public boolean e0() {
        return (this.f59450l == -1 && this.f59452m == -1) ? false : true;
    }

    public void e1(int i11) {
        if (i11 < 0) {
            this.f59459p0 = 0;
        } else {
            this.f59459p0 = i11;
        }
    }

    boolean f() {
        return (this instanceof m) || (this instanceof h);
    }

    public boolean f0(int i11, int i12) {
        d dVar;
        d dVar2;
        if (i11 == 0) {
            d dVar3 = this.Q.f59424f;
            return dVar3 != null && dVar3.n() && (dVar2 = this.S.f59424f) != null && dVar2.n() && (this.S.f59424f.e() - this.S.f()) - (this.Q.f59424f.e() + this.Q.f()) >= i12;
        }
        d dVar4 = this.R.f59424f;
        if (dVar4 != null && dVar4.n() && (dVar = this.T.f59424f) != null && dVar.n() && (this.T.f59424f.e() - this.T.f()) - (this.R.f59424f.e() + this.R.f()) >= i12) {
            return true;
        }
        return false;
    }

    public void f1(int i11) {
        if (i11 < 0) {
            this.f59457o0 = 0;
        } else {
            this.f59457o0 = i11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02be  */
    /* JADX WARN: Code duplicated, block: B:187:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:190:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:193:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:197:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:200:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:203:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:205:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:206:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:209:0x030b  */
    /* JADX WARN: Code duplicated, block: B:230:0x036a  */
    /* JADX WARN: Code duplicated, block: B:245:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:261:0x0449  */
    /* JADX WARN: Code duplicated, block: B:264:0x045b  */
    /* JADX WARN: Code duplicated, block: B:265:0x045d  */
    /* JADX WARN: Code duplicated, block: B:267:0x0460  */
    /* JADX WARN: Code duplicated, block: B:304:0x0537  */
    /* JADX WARN: Code duplicated, block: B:306:0x053e  */
    /* JADX WARN: Code duplicated, block: B:308:0x0545  */
    /* JADX WARN: Code duplicated, block: B:309:0x0554  */
    /* JADX WARN: Code duplicated, block: B:310:0x0557  */
    /* JADX WARN: Code duplicated, block: B:313:0x056f  */
    /* JADX WARN: Multi-variable type inference failed */
    public void g(a5.d dVar, boolean z11) {
        boolean z12;
        boolean z13;
        e eVar;
        e eVar2;
        boolean z14;
        boolean z15;
        int i11;
        a5.i iVar;
        int i12;
        int i13;
        boolean z16;
        int i14;
        boolean z17;
        b bVar;
        b bVar2;
        boolean z18;
        int i15;
        int i16;
        boolean z19;
        a5.i iVar2;
        a5.i iVar3;
        a5.i iVar4;
        int i17;
        int i18;
        char c11;
        int i19;
        int i21;
        a5.d dVar2;
        boolean z21;
        e5.n nVar;
        e5.l lVar;
        int i22;
        int i23;
        boolean zK0;
        boolean zM0;
        e5.l lVar2;
        e5.n nVar2;
        a5.d dVar3 = dVar;
        a5.i iVarQ = dVar3.q(this.Q);
        a5.i iVarQ2 = dVar3.q(this.S);
        a5.i iVarQ3 = dVar3.q(this.R);
        a5.i iVarQ4 = dVar3.q(this.T);
        a5.i iVarQ5 = dVar3.q(this.U);
        e eVar3 = this.f59433c0;
        if (eVar3 == null) {
            z12 = false;
            z13 = false;
        } else {
            z13 = eVar3 != null && eVar3.f59431b0[0] == b.WRAP_CONTENT;
            z12 = eVar3 != null && eVar3.f59431b0[1] == b.WRAP_CONTENT;
            int i24 = this.f59470v;
            if (i24 == 1) {
                z12 = false;
            } else if (i24 == 2) {
                z13 = false;
            } else if (i24 == 3) {
                z12 = false;
                z13 = false;
            }
        }
        if (this.f59469u0 == 8 && !this.f59471v0 && !d0()) {
            boolean[] zArr = this.f59429a0;
            if (!zArr[0] && !zArr[1]) {
                return;
            }
        }
        boolean z22 = this.f59458p;
        if (z22 || this.f59460q) {
            if (z22) {
                dVar3.f(iVarQ, this.f59443h0);
                dVar3.f(iVarQ2, this.f59443h0 + this.f59435d0);
                if (z13 && (eVar2 = this.f59433c0) != null) {
                    if (this.f59448k) {
                        f fVar = (f) eVar2;
                        fVar.E1(this.Q);
                        fVar.D1(this.S);
                    } else {
                        dVar3.h(dVar3.q(eVar2.S), iVarQ2, 0, 5);
                    }
                }
            }
            if (this.f59460q) {
                dVar3.f(iVarQ3, this.f59445i0);
                dVar3.f(iVarQ4, this.f59445i0 + this.f59437e0);
                if (this.U.m()) {
                    dVar3.f(iVarQ5, this.f59445i0 + this.f59455n0);
                }
                if (z12 && (eVar = this.f59433c0) != null) {
                    if (this.f59448k) {
                        f fVar2 = (f) eVar;
                        fVar2.J1(this.R);
                        fVar2.I1(this.T);
                    } else {
                        dVar3.h(dVar3.q(eVar.T), iVarQ4, 0, 5);
                    }
                }
            }
            if (this.f59458p && this.f59460q) {
                this.f59458p = false;
                this.f59460q = false;
                return;
            }
        }
        boolean z23 = a5.d.f293s;
        if (z11 && (lVar2 = this.f59436e) != null && (nVar2 = this.f59438f) != null) {
            e5.f fVar3 = lVar2.f61859h;
            if (fVar3.f61818j && lVar2.f61860i.f61818j && nVar2.f61859h.f61818j && nVar2.f61860i.f61818j) {
                dVar3.f(iVarQ, fVar3.f61815g);
                dVar3.f(iVarQ2, this.f59436e.f61860i.f61815g);
                dVar3.f(iVarQ3, this.f59438f.f61859h.f61815g);
                dVar3.f(iVarQ4, this.f59438f.f61860i.f61815g);
                dVar3.f(iVarQ5, this.f59438f.f61835k.f61815g);
                if (this.f59433c0 != null) {
                    if (z13 && this.f59440g[0] && !k0()) {
                        dVar3.h(dVar3.q(this.f59433c0.S), iVarQ2, 0, 8);
                    }
                    if (z12 && this.f59440g[1] && !m0()) {
                        dVar3.h(dVar3.q(this.f59433c0.T), iVarQ4, 0, 8);
                    }
                }
                this.f59458p = false;
                this.f59460q = false;
                return;
            }
        }
        if (this.f59433c0 != null) {
            if (h0(0)) {
                ((f) this.f59433c0).A1(this, 0);
                zK0 = true;
            } else {
                zK0 = k0();
            }
            if (h0(1)) {
                ((f) this.f59433c0).A1(this, 1);
                zM0 = true;
            } else {
                zM0 = m0();
            }
            if (!zK0 && z13 && this.f59469u0 != 8 && this.Q.f59424f == null && this.S.f59424f == null) {
                dVar3.h(dVar3.q(this.f59433c0.S), iVarQ2, 0, 1);
            }
            if (!zM0 && z12 && this.f59469u0 != 8 && this.R.f59424f == null && this.T.f59424f == null && this.U == null) {
                dVar3.h(dVar3.q(this.f59433c0.T), iVarQ4, 0, 1);
            }
            z14 = zK0;
            z15 = zM0;
        } else {
            z14 = false;
            z15 = false;
        }
        int i25 = this.f59435d0;
        int i26 = this.f59457o0;
        if (i25 >= i26) {
            i26 = i25;
        }
        int i27 = this.f59437e0;
        int i28 = this.f59459p0;
        if (i27 >= i28) {
            i28 = i27;
        }
        b[] bVarArr = this.f59431b0;
        b bVar3 = bVarArr[0];
        b bVar4 = b.MATCH_CONSTRAINT;
        boolean z24 = bVar3 != bVar4;
        b bVar5 = bVarArr[1];
        boolean z25 = bVar5 != bVar4;
        int i29 = this.f59441g0;
        this.H = i29;
        int i31 = i26;
        float f11 = this.f59439f0;
        this.I = f11;
        int i32 = this.f59472w;
        int i33 = this.f59474x;
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            i11 = i28;
            if (this.f59469u0 != 8) {
                i12 = (bVar3 == bVar4 && i32 == 0) ? 3 : i32;
                int i34 = (bVar5 == bVar4 && i33 == 0) ? 3 : i33;
                if (bVar3 == bVar4 && bVar5 == bVar4) {
                    iVar = iVarQ2;
                    i23 = 3;
                    if (i12 == 3 && i34 == 3) {
                        t1(z13, z12, z24, z25);
                    }
                    i13 = i34;
                    z16 = true;
                    int[] iArr = this.f59476y;
                    iArr[0] = i12;
                    iArr[1] = i13;
                    this.f59442h = z16;
                    if (z16) {
                        int i35 = this.H;
                        i14 = -1;
                        boolean z26 = i35 != 0 || i35 == -1;
                        if (z16 || !((i22 = this.H) == 1 || i22 == i14)) {
                            z17 = false;
                        } else {
                            z17 = true;
                        }
                        bVar = this.f59431b0[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2 || !(this instanceof f)) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        if (z18) {
                            i15 = 0;
                        } else {
                            i15 = i31;
                        }
                        boolean z27 = !this.X.o();
                        boolean[] zArr2 = this.f59429a0;
                        boolean z28 = zArr2[0];
                        boolean z29 = zArr2[1];
                        if (this.f59466t != 2 || this.f59458p) {
                            i16 = i12;
                            z19 = z13;
                        } else {
                            if (z11 && (lVar = this.f59436e) != null) {
                                e5.f fVar4 = lVar.f61859h;
                                if (fVar4.f61818j && lVar.f61860i.f61818j) {
                                    if (z11) {
                                        dVar3.f(iVarQ, fVar4.f61815g);
                                        a5.i iVar5 = iVar;
                                        dVar3.f(iVar5, this.f59436e.f61860i.f61815g);
                                        if (this.f59433c0 != null && z13 && this.f59440g[0] && !k0()) {
                                            dVar3.h(dVar3.q(this.f59433c0.S), iVar5, 0, 8);
                                        }
                                        iVar = iVar5;
                                    }
                                    i16 = i12;
                                    z19 = z13;
                                }
                            }
                            a5.i iVar6 = iVar;
                            e eVar4 = this.f59433c0;
                            a5.i iVarQ6 = eVar4 != null ? dVar3.q(eVar4.S) : null;
                            e eVar5 = this.f59433c0;
                            a5.i iVarQ7 = eVar5 != null ? dVar3.q(eVar5.Q) : null;
                            boolean z31 = this.f59440g[0];
                            b[] bVarArr2 = this.f59431b0;
                            iVar = iVar6;
                            b bVar6 = bVarArr2[0];
                            d dVar4 = this.Q;
                            a5.i iVar7 = iVarQ7;
                            d dVar5 = this.S;
                            z16 = z16;
                            z19 = z13;
                            int i36 = this.f59443h0;
                            int i37 = this.f59457o0;
                            int i38 = this.J[0];
                            float f12 = this.f59461q0;
                            boolean z32 = bVarArr2[1] == bVar4;
                            iVarQ = iVarQ;
                            boolean z33 = z12;
                            a5.i iVar8 = iVarQ6;
                            z12 = z33;
                            i16 = i12;
                            bVar2 = bVar2;
                            dVar3 = dVar;
                            i(dVar3, true, z19, z12, z31, iVar7, iVar8, bVar6, z18, dVar4, dVar5, i36, i15, i37, i38, f12, z26, z32, z14, z15, z28, i16, i13, this.f59478z, this.A, this.B, z27);
                        }
                        if (z11 || (nVar = this.f59438f) == null) {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i17 = 0;
                            i18 = 8;
                            c11 = 1;
                            i19 = 1;
                        } else {
                            e5.f fVar5 = nVar.f61859h;
                            if (fVar5.f61818j && nVar.f61860i.f61818j) {
                                int i39 = fVar5.f61815g;
                                iVar2 = iVarQ3;
                                dVar3.f(iVar2, i39);
                                iVar3 = iVarQ4;
                                dVar3.f(iVar3, this.f59438f.f61860i.f61815g);
                                iVar4 = iVarQ5;
                                dVar3.f(iVar4, this.f59438f.f61835k.f61815g);
                                e eVar6 = this.f59433c0;
                                if (eVar6 == null || z15 || !z12) {
                                    i17 = 0;
                                    i18 = 8;
                                    c11 = 1;
                                } else {
                                    c11 = 1;
                                    if (this.f59440g[1]) {
                                        i17 = 0;
                                        i18 = 8;
                                        dVar3.h(dVar3.q(eVar6.T), iVar3, 0, 8);
                                    } else {
                                        i17 = 0;
                                        i18 = 8;
                                    }
                                }
                                i19 = i17;
                            } else {
                                iVar2 = r24;
                                iVar3 = r25;
                                iVar4 = r26;
                                i17 = 0;
                                i18 = 8;
                                c11 = 1;
                                i19 = 1;
                            }
                        }
                        if (this.f59468u == 2) {
                            i21 = i17;
                        } else {
                            i21 = i19;
                        }
                        if (i21 == 0 && !this.f59460q) {
                            boolean z34 = (this.f59431b0[c11] == bVar2 && (this instanceof f)) ? c11 : i17;
                            int i41 = z34 != 0 ? i17 : i11;
                            e eVar7 = this.f59433c0;
                            a5.i iVarQ8 = eVar7 != null ? dVar3.q(eVar7.T) : null;
                            e eVar8 = this.f59433c0;
                            a5.i iVarQ9 = eVar8 != null ? dVar3.q(eVar8.R) : null;
                            if (this.f59455n0 > 0 || this.f59469u0 == i18) {
                                z21 = z27;
                                d dVar6 = this.U;
                                if (dVar6.f59424f != null) {
                                    dVar3.e(iVar4, iVar2, r(), i18);
                                    dVar3.e(iVar4, dVar3.q(this.U.f59424f), this.U.f(), i18);
                                    if (z12) {
                                        dVar3.h(iVarQ8, dVar3.q(this.T), i17, 5);
                                    }
                                    z21 = i17;
                                } else if (this.f59469u0 == i18) {
                                    dVar3.e(iVar4, iVar2, dVar6.f(), i18);
                                    z21 = z27;
                                } else {
                                    dVar3.e(iVar4, iVar2, r(), i18);
                                    z21 = z27;
                                }
                            }
                            z21 = z27;
                            boolean z35 = this.f59440g[c11];
                            b[] bVarArr3 = this.f59431b0;
                            int i42 = i17;
                            i(dVar, false, z12, z19, z35, iVarQ9, iVarQ8, bVarArr3[c11], z34, this.R, this.T, this.f59445i0, i41, this.f59459p0, this.J[c11], this.f59463r0, z17, bVarArr3[i42] == bVar4 ? c11 : i42, z15, z14, z29, i13, i16, this.C, this.D, this.E, z21);
                        }
                        if (!z16) {
                            dVar2 = dVar;
                        } else if (this.H == 1) {
                            dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                            dVar2 = dVar;
                        }
                        if (this.X.o()) {
                            dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                        }
                        this.f59458p = false;
                        this.f59460q = false;
                    }
                    i14 = -1;
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    bVar = this.f59431b0[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i15 = 0;
                    } else {
                        i15 = i31;
                    }
                    boolean z210 = !this.X.o();
                    boolean[] zArr3 = this.f59429a0;
                    boolean z211 = zArr3[0];
                    boolean z212 = zArr3[1];
                    if (this.f59466t != 2) {
                        i16 = i12;
                        z19 = z13;
                    } else {
                        i16 = i12;
                        z19 = z13;
                    }
                    if (z11) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i17 = 0;
                        i18 = 8;
                        c11 = 1;
                        i19 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i17 = 0;
                        i18 = 8;
                        c11 = 1;
                        i19 = 1;
                    }
                    if (this.f59468u == 2) {
                        i21 = i17;
                    } else {
                        i21 = i19;
                    }
                    if (i21 == 0) {
                    }
                    if (!z16) {
                        dVar2 = dVar;
                    } else if (this.H == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                        dVar2 = dVar;
                    }
                    if (this.X.o()) {
                        dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.f59458p = false;
                    this.f59460q = false;
                }
                iVar = iVarQ2;
                i23 = 3;
                if (bVar3 == bVar4 && i12 == i23) {
                    this.H = 0;
                    i31 = (int) (i27 * f11);
                    if (bVar5 != bVar4) {
                        i12 = 4;
                        i13 = i34;
                    } else {
                        i13 = i34;
                        z16 = true;
                    }
                    int[] iArr2 = this.f59476y;
                    iArr2[0] = i12;
                    iArr2[1] = i13;
                    this.f59442h = z16;
                    if (z16) {
                        int i310 = this.H;
                        i14 = -1;
                        if (i310 != 0) {
                        }
                        if (z16) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        bVar = this.f59431b0[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            i15 = 0;
                        } else {
                            i15 = i31;
                        }
                        boolean z213 = !this.X.o();
                        boolean[] zArr4 = this.f59429a0;
                        boolean z214 = zArr4[0];
                        boolean z215 = zArr4[1];
                        if (this.f59466t != 2) {
                            i16 = i12;
                            z19 = z13;
                        } else {
                            i16 = i12;
                            z19 = z13;
                        }
                        if (z11) {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i17 = 0;
                            i18 = 8;
                            c11 = 1;
                            i19 = 1;
                        } else {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i17 = 0;
                            i18 = 8;
                            c11 = 1;
                            i19 = 1;
                        }
                        if (this.f59468u == 2) {
                            i21 = i17;
                        } else {
                            i21 = i19;
                        }
                        if (i21 == 0) {
                        }
                        if (!z16) {
                            dVar2 = dVar;
                        } else if (this.H == 1) {
                            dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                            dVar2 = dVar;
                        }
                        if (this.X.o()) {
                            dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                        }
                        this.f59458p = false;
                        this.f59460q = false;
                    }
                    i14 = -1;
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    bVar = this.f59431b0[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i15 = 0;
                    } else {
                        i15 = i31;
                    }
                    boolean z216 = !this.X.o();
                    boolean[] zArr5 = this.f59429a0;
                    boolean z217 = zArr5[0];
                    boolean z218 = zArr5[1];
                    if (this.f59466t != 2) {
                        i16 = i12;
                        z19 = z13;
                    } else {
                        i16 = i12;
                        z19 = z13;
                    }
                    if (z11) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i17 = 0;
                        i18 = 8;
                        c11 = 1;
                        i19 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i17 = 0;
                        i18 = 8;
                        c11 = 1;
                        i19 = 1;
                    }
                    if (this.f59468u == 2) {
                        i21 = i17;
                    } else {
                        i21 = i19;
                    }
                    if (i21 == 0) {
                    }
                    if (!z16) {
                        dVar2 = dVar;
                    } else if (this.H == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                        dVar2 = dVar;
                    }
                    if (this.X.o()) {
                        dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.f59458p = false;
                    this.f59460q = false;
                }
                if (bVar5 == bVar4 && i34 == i23) {
                    this.H = 1;
                    if (i29 == -1) {
                        this.I = 1.0f / f11;
                    }
                    i11 = (int) (this.I * i25);
                    if (bVar3 != bVar4) {
                        i13 = 4;
                    }
                    int[] iArr3 = this.f59476y;
                    iArr3[0] = i12;
                    iArr3[1] = i13;
                    this.f59442h = z16;
                    if (z16) {
                        int i311 = this.H;
                        i14 = -1;
                        if (i311 != 0) {
                        }
                        if (z16) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        bVar = this.f59431b0[0];
                        bVar2 = b.WRAP_CONTENT;
                        if (bVar == bVar2) {
                            z18 = false;
                        } else {
                            z18 = false;
                        }
                        if (z18) {
                            i15 = 0;
                        } else {
                            i15 = i31;
                        }
                        boolean z219 = !this.X.o();
                        boolean[] zArr6 = this.f59429a0;
                        boolean z2110 = zArr6[0];
                        boolean z2111 = zArr6[1];
                        if (this.f59466t != 2) {
                            i16 = i12;
                            z19 = z13;
                        } else {
                            i16 = i12;
                            z19 = z13;
                        }
                        if (z11) {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i17 = 0;
                            i18 = 8;
                            c11 = 1;
                            i19 = 1;
                        } else {
                            iVar2 = r24;
                            iVar3 = r25;
                            iVar4 = r26;
                            i17 = 0;
                            i18 = 8;
                            c11 = 1;
                            i19 = 1;
                        }
                        if (this.f59468u == 2) {
                            i21 = i17;
                        } else {
                            i21 = i19;
                        }
                        if (i21 == 0) {
                        }
                        if (!z16) {
                            dVar2 = dVar;
                        } else if (this.H == 1) {
                            dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                            dVar2 = dVar;
                        } else {
                            dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                            dVar2 = dVar;
                        }
                        if (this.X.o()) {
                            dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                        }
                        this.f59458p = false;
                        this.f59460q = false;
                    }
                    i14 = -1;
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    bVar = this.f59431b0[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i15 = 0;
                    } else {
                        i15 = i31;
                    }
                    boolean z2112 = !this.X.o();
                    boolean[] zArr7 = this.f59429a0;
                    boolean z2113 = zArr7[0];
                    boolean z2114 = zArr7[1];
                    if (this.f59466t != 2) {
                        i16 = i12;
                        z19 = z13;
                    } else {
                        i16 = i12;
                        z19 = z13;
                    }
                    if (z11) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i17 = 0;
                        i18 = 8;
                        c11 = 1;
                        i19 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i17 = 0;
                        i18 = 8;
                        c11 = 1;
                        i19 = 1;
                    }
                    if (this.f59468u == 2) {
                        i21 = i17;
                    } else {
                        i21 = i19;
                    }
                    if (i21 == 0) {
                    }
                    if (!z16) {
                        dVar2 = dVar;
                    } else if (this.H == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                        dVar2 = dVar;
                    }
                    if (this.X.o()) {
                        dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.f59458p = false;
                    this.f59460q = false;
                }
                i13 = i34;
                z16 = true;
                int[] iArr4 = this.f59476y;
                iArr4[0] = i12;
                iArr4[1] = i13;
                this.f59442h = z16;
                if (z16) {
                    int i312 = this.H;
                    i14 = -1;
                    if (i312 != 0) {
                    }
                    if (z16) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    bVar = this.f59431b0[0];
                    bVar2 = b.WRAP_CONTENT;
                    if (bVar == bVar2) {
                        z18 = false;
                    } else {
                        z18 = false;
                    }
                    if (z18) {
                        i15 = 0;
                    } else {
                        i15 = i31;
                    }
                    boolean z2115 = !this.X.o();
                    boolean[] zArr8 = this.f59429a0;
                    boolean z2116 = zArr8[0];
                    boolean z2117 = zArr8[1];
                    if (this.f59466t != 2) {
                        i16 = i12;
                        z19 = z13;
                    } else {
                        i16 = i12;
                        z19 = z13;
                    }
                    if (z11) {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i17 = 0;
                        i18 = 8;
                        c11 = 1;
                        i19 = 1;
                    } else {
                        iVar2 = r24;
                        iVar3 = r25;
                        iVar4 = r26;
                        i17 = 0;
                        i18 = 8;
                        c11 = 1;
                        i19 = 1;
                    }
                    if (this.f59468u == 2) {
                        i21 = i17;
                    } else {
                        i21 = i19;
                    }
                    if (i21 == 0) {
                    }
                    if (!z16) {
                        dVar2 = dVar;
                    } else if (this.H == 1) {
                        dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                        dVar2 = dVar;
                    } else {
                        dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                        dVar2 = dVar;
                    }
                    if (this.X.o()) {
                        dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                    }
                    this.f59458p = false;
                    this.f59460q = false;
                }
                i14 = -1;
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                bVar = this.f59431b0[0];
                bVar2 = b.WRAP_CONTENT;
                if (bVar == bVar2) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (z18) {
                    i15 = 0;
                } else {
                    i15 = i31;
                }
                boolean z2118 = !this.X.o();
                boolean[] zArr9 = this.f59429a0;
                boolean z2119 = zArr9[0];
                boolean z21110 = zArr9[1];
                if (this.f59466t != 2) {
                    i16 = i12;
                    z19 = z13;
                } else {
                    i16 = i12;
                    z19 = z13;
                }
                if (z11) {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i17 = 0;
                    i18 = 8;
                    c11 = 1;
                    i19 = 1;
                } else {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i17 = 0;
                    i18 = 8;
                    c11 = 1;
                    i19 = 1;
                }
                if (this.f59468u == 2) {
                    i21 = i17;
                } else {
                    i21 = i19;
                }
                if (i21 == 0) {
                }
                if (!z16) {
                    dVar2 = dVar;
                } else if (this.H == 1) {
                    dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                    dVar2 = dVar;
                } else {
                    dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                    dVar2 = dVar;
                }
                if (this.X.o()) {
                    dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                }
                this.f59458p = false;
                this.f59460q = false;
            }
            z16 = false;
            int[] iArr5 = this.f59476y;
            iArr5[0] = i12;
            iArr5[1] = i13;
            this.f59442h = z16;
            if (z16) {
                int i313 = this.H;
                i14 = -1;
                if (i313 != 0) {
                }
                if (z16) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                bVar = this.f59431b0[0];
                bVar2 = b.WRAP_CONTENT;
                if (bVar == bVar2) {
                    z18 = false;
                } else {
                    z18 = false;
                }
                if (z18) {
                    i15 = 0;
                } else {
                    i15 = i31;
                }
                boolean z21111 = !this.X.o();
                boolean[] zArr10 = this.f59429a0;
                boolean z21112 = zArr10[0];
                boolean z21113 = zArr10[1];
                if (this.f59466t != 2) {
                    i16 = i12;
                    z19 = z13;
                } else {
                    i16 = i12;
                    z19 = z13;
                }
                if (z11) {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i17 = 0;
                    i18 = 8;
                    c11 = 1;
                    i19 = 1;
                } else {
                    iVar2 = r24;
                    iVar3 = r25;
                    iVar4 = r26;
                    i17 = 0;
                    i18 = 8;
                    c11 = 1;
                    i19 = 1;
                }
                if (this.f59468u == 2) {
                    i21 = i17;
                } else {
                    i21 = i19;
                }
                if (i21 == 0) {
                }
                if (!z16) {
                    dVar2 = dVar;
                } else if (this.H == 1) {
                    dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                    dVar2 = dVar;
                } else {
                    dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                    dVar2 = dVar;
                }
                if (this.X.o()) {
                    dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
                }
                this.f59458p = false;
                this.f59460q = false;
            }
            i14 = -1;
            if (z16) {
                z17 = false;
            } else {
                z17 = false;
            }
            bVar = this.f59431b0[0];
            bVar2 = b.WRAP_CONTENT;
            if (bVar == bVar2) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (z18) {
                i15 = 0;
            } else {
                i15 = i31;
            }
            boolean z21114 = !this.X.o();
            boolean[] zArr11 = this.f59429a0;
            boolean z21115 = zArr11[0];
            boolean z21116 = zArr11[1];
            if (this.f59466t != 2) {
                i16 = i12;
                z19 = z13;
            } else {
                i16 = i12;
                z19 = z13;
            }
            if (z11) {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i17 = 0;
                i18 = 8;
                c11 = 1;
                i19 = 1;
            } else {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i17 = 0;
                i18 = 8;
                c11 = 1;
                i19 = 1;
            }
            if (this.f59468u == 2) {
                i21 = i17;
            } else {
                i21 = i19;
            }
            if (i21 == 0) {
            }
            if (!z16) {
                dVar2 = dVar;
            } else if (this.H == 1) {
                dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                dVar2 = dVar;
            } else {
                dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                dVar2 = dVar;
            }
            if (this.X.o()) {
                dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
            }
            this.f59458p = false;
            this.f59460q = false;
        }
        i11 = i28;
        iVar = iVarQ2;
        i12 = i32;
        i13 = i33;
        z16 = false;
        int[] iArr6 = this.f59476y;
        iArr6[0] = i12;
        iArr6[1] = i13;
        this.f59442h = z16;
        if (z16) {
            int i314 = this.H;
            i14 = -1;
            if (i314 != 0) {
            }
            if (z16) {
                z17 = false;
            } else {
                z17 = false;
            }
            bVar = this.f59431b0[0];
            bVar2 = b.WRAP_CONTENT;
            if (bVar == bVar2) {
                z18 = false;
            } else {
                z18 = false;
            }
            if (z18) {
                i15 = 0;
            } else {
                i15 = i31;
            }
            boolean z21117 = !this.X.o();
            boolean[] zArr12 = this.f59429a0;
            boolean z21118 = zArr12[0];
            boolean z21119 = zArr12[1];
            if (this.f59466t != 2) {
                i16 = i12;
                z19 = z13;
            } else {
                i16 = i12;
                z19 = z13;
            }
            if (z11) {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i17 = 0;
                i18 = 8;
                c11 = 1;
                i19 = 1;
            } else {
                iVar2 = r24;
                iVar3 = r25;
                iVar4 = r26;
                i17 = 0;
                i18 = 8;
                c11 = 1;
                i19 = 1;
            }
            if (this.f59468u == 2) {
                i21 = i17;
            } else {
                i21 = i19;
            }
            if (i21 == 0) {
            }
            if (!z16) {
                dVar2 = dVar;
            } else if (this.H == 1) {
                dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
                dVar2 = dVar;
            } else {
                dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
                dVar2 = dVar;
            }
            if (this.X.o()) {
                dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
            }
            this.f59458p = false;
            this.f59460q = false;
        }
        i14 = -1;
        if (z16) {
            z17 = false;
        } else {
            z17 = false;
        }
        bVar = this.f59431b0[0];
        bVar2 = b.WRAP_CONTENT;
        if (bVar == bVar2) {
            z18 = false;
        } else {
            z18 = false;
        }
        if (z18) {
            i15 = 0;
        } else {
            i15 = i31;
        }
        boolean z211110 = !this.X.o();
        boolean[] zArr13 = this.f59429a0;
        boolean z211111 = zArr13[0];
        boolean z211112 = zArr13[1];
        if (this.f59466t != 2) {
            i16 = i12;
            z19 = z13;
        } else {
            i16 = i12;
            z19 = z13;
        }
        if (z11) {
            iVar2 = r24;
            iVar3 = r25;
            iVar4 = r26;
            i17 = 0;
            i18 = 8;
            c11 = 1;
            i19 = 1;
        } else {
            iVar2 = r24;
            iVar3 = r25;
            iVar4 = r26;
            i17 = 0;
            i18 = 8;
            c11 = 1;
            i19 = 1;
        }
        if (this.f59468u == 2) {
            i21 = i17;
        } else {
            i21 = i19;
        }
        if (i21 == 0) {
        }
        if (!z16) {
            dVar2 = dVar;
        } else if (this.H == 1) {
            dVar.k(iVar3, iVar2, iVar, iVarQ, this.I, 8);
            dVar2 = dVar;
        } else {
            dVar.k(iVar, iVarQ, iVar3, iVar2, this.I, 8);
            dVar2 = dVar;
        }
        if (this.X.o()) {
            dVar2.b(this, this.X.j().h(), (float) Math.toRadians(this.K + 90.0f), this.X.f());
        }
        this.f59458p = false;
        this.f59460q = false;
    }

    public void g0(d.a aVar, e eVar, d.a aVar2, int i11, int i12) {
        q(aVar).b(eVar.q(aVar2), i11, i12, true);
    }

    public void g1(int i11, int i12) {
        this.f59443h0 = i11;
        this.f59445i0 = i12;
    }

    public boolean h() {
        return this.f59469u0 != 8;
    }

    public void h1(e eVar) {
        this.f59433c0 = eVar;
    }

    public boolean i0() {
        return this.f59462r;
    }

    public void i1(float f11) {
        this.f59463r0 = f11;
    }

    public void j(d.a aVar, e eVar, d.a aVar2) {
        k(aVar, eVar, aVar2, 0);
    }

    public boolean j0(int i11) {
        return this.f59429a0[i11];
    }

    public void j1(int i11) {
        this.K0 = i11;
    }

    public void k(d.a aVar, e eVar, d.a aVar2, int i11) {
        d.a aVar3;
        d.a aVar4;
        boolean z11;
        d.a aVar5 = d.a.CENTER;
        if (aVar == aVar5) {
            if (aVar2 != aVar5) {
                d.a aVar6 = d.a.LEFT;
                if (aVar2 == aVar6 || aVar2 == d.a.RIGHT) {
                    k(aVar6, eVar, aVar2, 0);
                    k(d.a.RIGHT, eVar, aVar2, 0);
                    q(aVar5).a(eVar.q(aVar2), 0);
                    return;
                }
                d.a aVar7 = d.a.TOP;
                if (aVar2 == aVar7 || aVar2 == d.a.BOTTOM) {
                    k(aVar7, eVar, aVar2, 0);
                    k(d.a.BOTTOM, eVar, aVar2, 0);
                    q(aVar5).a(eVar.q(aVar2), 0);
                    return;
                }
                return;
            }
            d.a aVar8 = d.a.LEFT;
            d dVarQ = q(aVar8);
            d.a aVar9 = d.a.RIGHT;
            d dVarQ2 = q(aVar9);
            d.a aVar10 = d.a.TOP;
            d dVarQ3 = q(aVar10);
            d.a aVar11 = d.a.BOTTOM;
            d dVarQ4 = q(aVar11);
            boolean z12 = true;
            if ((dVarQ == null || !dVarQ.o()) && (dVarQ2 == null || !dVarQ2.o())) {
                k(aVar8, eVar, aVar8, 0);
                k(aVar9, eVar, aVar9, 0);
                z11 = true;
            } else {
                z11 = false;
            }
            if ((dVarQ3 == null || !dVarQ3.o()) && (dVarQ4 == null || !dVarQ4.o())) {
                k(aVar10, eVar, aVar10, 0);
                k(aVar11, eVar, aVar11, 0);
            } else {
                z12 = false;
            }
            if (z11 && z12) {
                q(aVar5).a(eVar.q(aVar5), 0);
                return;
            }
            if (z11) {
                d.a aVar12 = d.a.CENTER_X;
                q(aVar12).a(eVar.q(aVar12), 0);
                return;
            } else {
                if (z12) {
                    d.a aVar13 = d.a.CENTER_Y;
                    q(aVar13).a(eVar.q(aVar13), 0);
                    return;
                }
                return;
            }
        }
        d.a aVar14 = d.a.CENTER_X;
        if (aVar == aVar14 && (aVar2 == (aVar4 = d.a.LEFT) || aVar2 == d.a.RIGHT)) {
            d dVarQ5 = q(aVar4);
            d dVarQ6 = eVar.q(aVar2);
            d dVarQ7 = q(d.a.RIGHT);
            dVarQ5.a(dVarQ6, 0);
            dVarQ7.a(dVarQ6, 0);
            q(aVar14).a(dVarQ6, 0);
            return;
        }
        d.a aVar15 = d.a.CENTER_Y;
        if (aVar == aVar15 && (aVar2 == (aVar3 = d.a.TOP) || aVar2 == d.a.BOTTOM)) {
            d dVarQ8 = eVar.q(aVar2);
            q(aVar3).a(dVarQ8, 0);
            q(d.a.BOTTOM).a(dVarQ8, 0);
            q(aVar15).a(dVarQ8, 0);
            return;
        }
        if (aVar == aVar14 && aVar2 == aVar14) {
            d.a aVar16 = d.a.LEFT;
            q(aVar16).a(eVar.q(aVar16), 0);
            d.a aVar17 = d.a.RIGHT;
            q(aVar17).a(eVar.q(aVar17), 0);
            q(aVar14).a(eVar.q(aVar2), 0);
            return;
        }
        if (aVar == aVar15 && aVar2 == aVar15) {
            d.a aVar18 = d.a.TOP;
            q(aVar18).a(eVar.q(aVar18), 0);
            d.a aVar19 = d.a.BOTTOM;
            q(aVar19).a(eVar.q(aVar19), 0);
            q(aVar15).a(eVar.q(aVar2), 0);
            return;
        }
        d dVarQ9 = q(aVar);
        d dVarQ10 = eVar.q(aVar2);
        if (dVarQ9.p(dVarQ10)) {
            d.a aVar20 = d.a.BASELINE;
            if (aVar == aVar20) {
                d dVarQ11 = q(d.a.TOP);
                d dVarQ12 = q(d.a.BOTTOM);
                if (dVarQ11 != null) {
                    dVarQ11.q();
                }
                if (dVarQ12 != null) {
                    dVarQ12.q();
                }
            } else if (aVar == d.a.TOP || aVar == d.a.BOTTOM) {
                d dVarQ13 = q(aVar20);
                if (dVarQ13 != null) {
                    dVarQ13.q();
                }
                d dVarQ14 = q(aVar5);
                if (dVarQ14.j() != dVarQ10) {
                    dVarQ14.q();
                }
                d dVarG = q(aVar).g();
                d dVarQ15 = q(aVar15);
                if (dVarQ15.o()) {
                    dVarG.q();
                    dVarQ15.q();
                }
            } else if (aVar == d.a.LEFT || aVar == d.a.RIGHT) {
                d dVarQ16 = q(aVar5);
                if (dVarQ16.j() != dVarQ10) {
                    dVarQ16.q();
                }
                d dVarG2 = q(aVar).g();
                d dVarQ17 = q(aVar14);
                if (dVarQ17.o()) {
                    dVarG2.q();
                    dVarQ17.q();
                }
            }
            dVarQ9.a(dVarQ10, i11);
        }
    }

    public boolean k0() {
        d dVar = this.Q;
        d dVar2 = dVar.f59424f;
        if (dVar2 != null && dVar2.f59424f == dVar) {
            return true;
        }
        d dVar3 = this.S;
        d dVar4 = dVar3.f59424f;
        return dVar4 != null && dVar4.f59424f == dVar3;
    }

    public void k1(int i11, int i12) {
        this.f59445i0 = i11;
        int i13 = i12 - i11;
        this.f59437e0 = i13;
        int i14 = this.f59459p0;
        if (i13 < i14) {
            this.f59437e0 = i14;
        }
    }

    public void l(d dVar, d dVar2, int i11) {
        if (dVar.h() == this) {
            k(dVar.k(), dVar2.h(), dVar2.k(), i11);
        }
    }

    public boolean l0() {
        return this.M;
    }

    public void l1(b bVar) {
        this.f59431b0[1] = bVar;
    }

    public void m(e eVar, float f11, int i11) {
        d.a aVar = d.a.CENTER;
        g0(aVar, eVar, aVar, i11, 0);
        this.K = f11;
    }

    public boolean m0() {
        d dVar = this.R;
        d dVar2 = dVar.f59424f;
        if (dVar2 != null && dVar2.f59424f == dVar) {
            return true;
        }
        d dVar3 = this.T;
        d dVar4 = dVar3.f59424f;
        return dVar4 != null && dVar4.f59424f == dVar3;
    }

    public void m1(int i11, int i12, int i13, float f11) {
        this.f59474x = i11;
        this.C = i12;
        if (i13 == Integer.MAX_VALUE) {
            i13 = 0;
        }
        this.D = i13;
        this.E = f11;
        if (f11 <= BitmapDescriptorFactory.HUE_RED || f11 >= 1.0f || i11 != 0) {
            return;
        }
        this.f59474x = 2;
    }

    public void n(e eVar, HashMap<e, e> map) {
        this.f59466t = eVar.f59466t;
        this.f59468u = eVar.f59468u;
        this.f59472w = eVar.f59472w;
        this.f59474x = eVar.f59474x;
        int[] iArr = this.f59476y;
        int[] iArr2 = eVar.f59476y;
        iArr[0] = iArr2[0];
        iArr[1] = iArr2[1];
        this.f59478z = eVar.f59478z;
        this.A = eVar.A;
        this.C = eVar.C;
        this.D = eVar.D;
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
        this.I = eVar.I;
        int[] iArr3 = eVar.J;
        this.J = Arrays.copyOf(iArr3, iArr3.length);
        this.K = eVar.K;
        this.L = eVar.L;
        this.M = eVar.M;
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.X.q();
        this.f59431b0 = (b[]) Arrays.copyOf(this.f59431b0, 2);
        this.f59433c0 = this.f59433c0 == null ? null : map.get(eVar.f59433c0);
        this.f59435d0 = eVar.f59435d0;
        this.f59437e0 = eVar.f59437e0;
        this.f59439f0 = eVar.f59439f0;
        this.f59441g0 = eVar.f59441g0;
        this.f59443h0 = eVar.f59443h0;
        this.f59445i0 = eVar.f59445i0;
        this.f59447j0 = eVar.f59447j0;
        this.f59449k0 = eVar.f59449k0;
        this.f59451l0 = eVar.f59451l0;
        this.f59453m0 = eVar.f59453m0;
        this.f59455n0 = eVar.f59455n0;
        this.f59457o0 = eVar.f59457o0;
        this.f59459p0 = eVar.f59459p0;
        this.f59461q0 = eVar.f59461q0;
        this.f59463r0 = eVar.f59463r0;
        this.f59465s0 = eVar.f59465s0;
        this.f59467t0 = eVar.f59467t0;
        this.f59469u0 = eVar.f59469u0;
        this.f59471v0 = eVar.f59471v0;
        this.f59473w0 = eVar.f59473w0;
        this.f59475x0 = eVar.f59475x0;
        this.f59477y0 = eVar.f59477y0;
        this.f59479z0 = eVar.f59479z0;
        this.A0 = eVar.A0;
        this.B0 = eVar.B0;
        this.C0 = eVar.C0;
        this.D0 = eVar.D0;
        this.E0 = eVar.E0;
        this.F0 = eVar.F0;
        this.G0 = eVar.G0;
        this.H0 = eVar.H0;
        this.J0 = eVar.J0;
        this.K0 = eVar.K0;
        this.L0 = eVar.L0;
        this.M0 = eVar.M0;
        float[] fArr = this.N0;
        float[] fArr2 = eVar.N0;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        e[] eVarArr = this.O0;
        e[] eVarArr2 = eVar.O0;
        eVarArr[0] = eVarArr2[0];
        eVarArr[1] = eVarArr2[1];
        e[] eVarArr3 = this.P0;
        e[] eVarArr4 = eVar.P0;
        eVarArr3[0] = eVarArr4[0];
        eVarArr3[1] = eVarArr4[1];
        e eVar2 = eVar.Q0;
        this.Q0 = eVar2 == null ? null : map.get(eVar2);
        e eVar3 = eVar.R0;
        this.R0 = eVar3 != null ? map.get(eVar3) : null;
    }

    public boolean n0() {
        return this.N;
    }

    public void n1(float f11) {
        this.N0[1] = f11;
    }

    public void o(a5.d dVar) {
        dVar.q(this.Q);
        dVar.q(this.R);
        dVar.q(this.S);
        dVar.q(this.T);
        if (this.f59455n0 > 0) {
            dVar.q(this.U);
        }
    }

    public boolean o0() {
        return this.f59444i && this.f59469u0 != 8;
    }

    public void o1(int i11) {
        this.f59469u0 = i11;
    }

    public void p() {
        if (this.f59436e == null) {
            this.f59436e = new e5.l(this);
        }
        if (this.f59438f == null) {
            this.f59438f = new e5.n(this);
        }
    }

    public boolean p0() {
        if (this.f59458p) {
            return true;
        }
        return this.Q.n() && this.S.n();
    }

    public void p1(int i11) {
        this.f59435d0 = i11;
        int i12 = this.f59457o0;
        if (i11 < i12) {
            this.f59435d0 = i12;
        }
    }

    public d q(d.a aVar) {
        switch (a.f59480a[aVar.ordinal()]) {
            case 1:
                return this.Q;
            case 2:
                return this.R;
            case 3:
                return this.S;
            case 4:
                return this.T;
            case 5:
                return this.U;
            case 6:
                return this.X;
            case 7:
                return this.V;
            case 8:
                return this.W;
            case 9:
                return null;
            default:
                throw new AssertionError(aVar.name());
        }
    }

    public boolean q0() {
        if (this.f59460q) {
            return true;
        }
        return this.R.n() && this.T.n();
    }

    public void q1(int i11) {
        if (i11 < 0 || i11 > 3) {
            return;
        }
        this.f59470v = i11;
    }

    public int r() {
        return this.f59455n0;
    }

    public boolean r0() {
        return this.f59464s;
    }

    public void r1(int i11) {
        this.f59443h0 = i11;
    }

    public float s(int i11) {
        if (i11 == 0) {
            return this.f59461q0;
        }
        if (i11 == 1) {
            return this.f59463r0;
        }
        return -1.0f;
    }

    public void s0() {
        this.f59462r = true;
    }

    public void s1(int i11) {
        this.f59445i0 = i11;
    }

    public int t() {
        return a0() + this.f59437e0;
    }

    public void t0() {
        this.f59464s = true;
    }

    public void t1(boolean z11, boolean z12, boolean z13, boolean z14) {
        if (this.H == -1) {
            if (z13 && !z14) {
                this.H = 0;
            } else if (!z13 && z14) {
                this.H = 1;
                if (this.f59441g0 == -1) {
                    this.I = 1.0f / this.I;
                }
            }
        }
        if (this.H == 0 && (!this.R.o() || !this.T.o())) {
            this.H = 1;
        } else if (this.H == 1 && (!this.Q.o() || !this.S.o())) {
            this.H = 0;
        }
        if (this.H == -1 && (!this.R.o() || !this.T.o() || !this.Q.o() || !this.S.o())) {
            if (this.R.o() && this.T.o()) {
                this.H = 0;
            } else if (this.Q.o() && this.S.o()) {
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
        if (this.H == -1) {
            int i11 = this.f59478z;
            if (i11 > 0 && this.C == 0) {
                this.H = 0;
            } else {
                if (i11 != 0 || this.C <= 0) {
                    return;
                }
                this.I = 1.0f / this.I;
                this.H = 1;
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (this.f59475x0 != null) {
            str = "type: " + this.f59475x0 + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        if (this.f59473w0 != null) {
            str2 = "id: " + this.f59473w0 + " ";
        }
        sb2.append(str2);
        sb2.append("(");
        sb2.append(this.f59443h0);
        sb2.append(", ");
        sb2.append(this.f59445i0);
        sb2.append(") - (");
        sb2.append(this.f59435d0);
        sb2.append(" x ");
        sb2.append(this.f59437e0);
        sb2.append(")");
        return sb2.toString();
    }

    public Object u() {
        return this.f59465s0;
    }

    public boolean u0() {
        b[] bVarArr = this.f59431b0;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public void u1(boolean z11, boolean z12) {
        int i11;
        int i12;
        boolean zK = z11 & this.f59436e.k();
        boolean zK2 = z12 & this.f59438f.k();
        e5.l lVar = this.f59436e;
        int i13 = lVar.f61859h.f61815g;
        e5.n nVar = this.f59438f;
        int i14 = nVar.f61859h.f61815g;
        int i15 = lVar.f61860i.f61815g;
        int i16 = nVar.f61860i.f61815g;
        int i17 = i16 - i14;
        if (i15 - i13 < 0 || i17 < 0 || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE || i16 == Integer.MIN_VALUE || i16 == Integer.MAX_VALUE) {
            i15 = 0;
            i13 = 0;
            i16 = 0;
            i14 = 0;
        }
        int i18 = i15 - i13;
        int i19 = i16 - i14;
        if (zK) {
            this.f59443h0 = i13;
        }
        if (zK2) {
            this.f59445i0 = i14;
        }
        if (this.f59469u0 == 8) {
            this.f59435d0 = 0;
            this.f59437e0 = 0;
            return;
        }
        if (zK) {
            if (this.f59431b0[0] == b.FIXED && i18 < (i12 = this.f59435d0)) {
                i18 = i12;
            }
            this.f59435d0 = i18;
            int i21 = this.f59457o0;
            if (i18 < i21) {
                this.f59435d0 = i21;
            }
        }
        if (zK2) {
            if (this.f59431b0[1] == b.FIXED && i19 < (i11 = this.f59437e0)) {
                i19 = i11;
            }
            this.f59437e0 = i19;
            int i22 = this.f59459p0;
            if (i19 < i22) {
                this.f59437e0 = i22;
            }
        }
    }

    public String v() {
        return this.f59473w0;
    }

    public void v0() {
        this.Q.q();
        this.R.q();
        this.S.q();
        this.T.q();
        this.U.q();
        this.V.q();
        this.W.q();
        this.X.q();
        this.f59433c0 = null;
        this.K = Float.NaN;
        this.f59435d0 = 0;
        this.f59437e0 = 0;
        this.f59439f0 = BitmapDescriptorFactory.HUE_RED;
        this.f59441g0 = -1;
        this.f59443h0 = 0;
        this.f59445i0 = 0;
        this.f59451l0 = 0;
        this.f59453m0 = 0;
        this.f59455n0 = 0;
        this.f59457o0 = 0;
        this.f59459p0 = 0;
        float f11 = U0;
        this.f59461q0 = f11;
        this.f59463r0 = f11;
        b[] bVarArr = this.f59431b0;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f59465s0 = null;
        this.f59467t0 = 0;
        this.f59469u0 = 0;
        this.f59475x0 = null;
        this.G0 = false;
        this.H0 = false;
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = false;
        this.M0 = false;
        float[] fArr = this.N0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f59466t = -1;
        this.f59468u = -1;
        int[] iArr = this.J;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f59472w = 0;
        this.f59474x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f59478z = 0;
        this.C = 0;
        this.f59442h = false;
        this.H = -1;
        this.I = 1.0f;
        this.I0 = false;
        boolean[] zArr = this.f59440g;
        zArr[0] = true;
        zArr[1] = true;
        this.N = false;
        boolean[] zArr2 = this.f59429a0;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f59444i = true;
        int[] iArr2 = this.f59476y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f59450l = -1;
        this.f59452m = -1;
    }

    public void v1(a5.d dVar, boolean z11) {
        e5.n nVar;
        e5.l lVar;
        int iY = dVar.y(this.Q);
        int iY2 = dVar.y(this.R);
        int iY3 = dVar.y(this.S);
        int iY4 = dVar.y(this.T);
        if (z11 && (lVar = this.f59436e) != null) {
            e5.f fVar = lVar.f61859h;
            if (fVar.f61818j) {
                e5.f fVar2 = lVar.f61860i;
                if (fVar2.f61818j) {
                    iY = fVar.f61815g;
                    iY3 = fVar2.f61815g;
                }
            }
        }
        if (z11 && (nVar = this.f59438f) != null) {
            e5.f fVar3 = nVar.f61859h;
            if (fVar3.f61818j) {
                e5.f fVar4 = nVar.f61860i;
                if (fVar4.f61818j) {
                    iY2 = fVar3.f61815g;
                    iY4 = fVar4.f61815g;
                }
            }
        }
        int i11 = iY4 - iY2;
        if (iY3 - iY < 0 || i11 < 0 || iY == Integer.MIN_VALUE || iY == Integer.MAX_VALUE || iY2 == Integer.MIN_VALUE || iY2 == Integer.MAX_VALUE || iY3 == Integer.MIN_VALUE || iY3 == Integer.MAX_VALUE || iY4 == Integer.MIN_VALUE || iY4 == Integer.MAX_VALUE) {
            iY = 0;
            iY4 = 0;
            iY2 = 0;
            iY3 = 0;
        }
        O0(iY, iY2, iY3, iY4);
    }

    public b w(int i11) {
        if (i11 == 0) {
            return C();
        }
        if (i11 == 1) {
            return V();
        }
        return null;
    }

    public void w0() {
        x0();
        i1(U0);
        R0(U0);
    }

    public float x() {
        return this.f59439f0;
    }

    public void x0() {
        e eVarM = M();
        if (eVarM != null && (eVarM instanceof f) && ((f) M()).R1()) {
            return;
        }
        int size = this.Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.Z.get(i11).q();
        }
    }

    public int y() {
        return this.f59441g0;
    }

    public void y0() {
        this.f59458p = false;
        this.f59460q = false;
        this.f59462r = false;
        this.f59464s = false;
        int size = this.Z.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.Z.get(i11).r();
        }
    }

    public int z() {
        if (this.f59469u0 == 8) {
            return 0;
        }
        return this.f59437e0;
    }

    public void z0(a5.c cVar) {
        this.Q.s(cVar);
        this.R.s(cVar);
        this.S.s(cVar);
        this.T.s(cVar);
        this.U.s(cVar);
        this.X.s(cVar);
        this.V.s(cVar);
        this.W.s(cVar);
    }
}
