package com.horcrux.svg;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;

/* JADX INFO: loaded from: classes6.dex */
class y {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final y f45529p = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f45530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f45531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final x0 f45532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ReadableMap f45533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    z0 f45534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f45535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f45536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final String f45537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final y0 f45538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final a1 f45539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b1 f45540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final double f45541l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final double f45542m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final double f45543n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final boolean f45544o;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final z0[] f45545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int[] f45546b;

        static {
            z0 z0Var = z0.w100;
            z0 z0Var2 = z0.w200;
            z0 z0Var3 = z0.w300;
            z0 z0Var4 = z0.Normal;
            z0 z0Var5 = z0.w500;
            z0 z0Var6 = z0.w600;
            z0 z0Var7 = z0.Bold;
            z0 z0Var8 = z0.w800;
            z0 z0Var9 = z0.w900;
            f45545a = new z0[]{z0Var, z0Var, z0Var2, z0Var3, z0Var4, z0Var5, z0Var6, z0Var7, z0Var8, z0Var9, z0Var9};
            f45546b = new int[]{400, 700, 100, 200, 300, 400, 500, 600, 700, 800, 900};
        }

        private static int a(int i11) {
            if (i11 < 350) {
                return 400;
            }
            if (i11 < 550) {
                return 700;
            }
            if (i11 < 900) {
                return 900;
            }
            return i11;
        }

        static int b(z0 z0Var, y yVar) {
            if (z0Var == z0.Bolder) {
                return a(yVar.f45535f);
            }
            return z0Var == z0.Lighter ? c(yVar.f45535f) : f45546b[z0Var.ordinal()];
        }

        private static int c(int i11) {
            if (i11 < 100) {
                return i11;
            }
            if (i11 < 550) {
                return 100;
            }
            return i11 < 750 ? 400 : 700;
        }

        static z0 d(int i11) {
            return f45545a[Math.round(i11 / 100.0f)];
        }
    }

    private y() {
        this.f45533d = null;
        this.f45531b = "";
        this.f45532c = x0.normal;
        this.f45534e = z0.Normal;
        this.f45535f = 400;
        this.f45536g = "";
        this.f45537h = "";
        this.f45538i = y0.normal;
        this.f45539j = a1.start;
        this.f45540k = b1.None;
        this.f45544o = false;
        this.f45541l = 0.0d;
        this.f45530a = 12.0d;
        this.f45542m = 0.0d;
        this.f45543n = 0.0d;
    }

    private void a(y yVar, double d11) {
        long jRound = Math.round(d11);
        if (jRound < 1 || jRound > 1000) {
            b(yVar);
            return;
        }
        int i11 = (int) jRound;
        this.f45535f = i11;
        this.f45534e = a.d(i11);
    }

    private void b(y yVar) {
        this.f45535f = yVar.f45535f;
        this.f45534e = yVar.f45534e;
    }

    private double c(ReadableMap readableMap, String str, double d11, double d12, double d13) {
        return readableMap.getType(str) == ReadableType.Number ? readableMap.getDouble(str) : n0.b(readableMap.getString(str), d13, d11, d12);
    }

    y(ReadableMap readableMap, y yVar, double d11) {
        String string;
        String string2;
        y0 y0VarValueOf;
        a1 a1VarValueOf;
        b1 b1Var;
        double dC;
        double dC2;
        double d12 = yVar.f45530a;
        if (readableMap.hasKey(OrcaFlavourKeys.FONT_SIZE)) {
            this.f45530a = c(readableMap, OrcaFlavourKeys.FONT_SIZE, 1.0d, d12, d12);
        } else {
            this.f45530a = d12;
        }
        if (readableMap.hasKey("fontWeight")) {
            if (readableMap.getType("fontWeight") == ReadableType.Number) {
                a(yVar, readableMap.getDouble("fontWeight"));
            } else {
                String string3 = readableMap.getString("fontWeight");
                if (z0.hasEnum(string3)) {
                    int iB = a.b(z0.get(string3), yVar);
                    this.f45535f = iB;
                    this.f45534e = a.d(iB);
                } else if (string3 != null) {
                    a(yVar, Double.parseDouble(string3));
                } else {
                    b(yVar);
                }
            }
        } else {
            b(yVar);
        }
        this.f45533d = readableMap.hasKey("fontData") ? readableMap.getMap("fontData") : yVar.f45533d;
        this.f45531b = readableMap.hasKey("fontFamily") ? readableMap.getString("fontFamily") : yVar.f45531b;
        this.f45532c = readableMap.hasKey("fontStyle") ? x0.valueOf(readableMap.getString("fontStyle")) : yVar.f45532c;
        if (readableMap.hasKey("fontFeatureSettings")) {
            string = readableMap.getString("fontFeatureSettings");
        } else {
            string = yVar.f45536g;
        }
        this.f45536g = string;
        if (readableMap.hasKey("fontVariationSettings")) {
            string2 = readableMap.getString("fontVariationSettings");
        } else {
            string2 = yVar.f45537h;
        }
        this.f45537h = string2;
        if (readableMap.hasKey("fontVariantLigatures")) {
            y0VarValueOf = y0.valueOf(readableMap.getString("fontVariantLigatures"));
        } else {
            y0VarValueOf = yVar.f45538i;
        }
        this.f45538i = y0VarValueOf;
        if (readableMap.hasKey("textAnchor")) {
            a1VarValueOf = a1.valueOf(readableMap.getString("textAnchor"));
        } else {
            a1VarValueOf = yVar.f45539j;
        }
        this.f45539j = a1VarValueOf;
        if (readableMap.hasKey("textDecoration")) {
            b1Var = b1.getEnum(readableMap.getString("textDecoration"));
        } else {
            b1Var = yVar.f45540k;
        }
        this.f45540k = b1Var;
        boolean zHasKey = readableMap.hasKey("kerning");
        this.f45544o = zHasKey || yVar.f45544o;
        this.f45541l = zHasKey ? c(readableMap, "kerning", d11, this.f45530a, 0.0d) : yVar.f45541l;
        if (readableMap.hasKey("wordSpacing")) {
            dC = c(readableMap, "wordSpacing", d11, this.f45530a, 0.0d);
        } else {
            dC = yVar.f45542m;
        }
        this.f45542m = dC;
        if (readableMap.hasKey("letterSpacing")) {
            dC2 = c(readableMap, "letterSpacing", d11, this.f45530a, 0.0d);
        } else {
            dC2 = yVar.f45543n;
        }
        this.f45543n = dC2;
    }
}
