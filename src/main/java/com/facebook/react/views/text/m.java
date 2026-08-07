package com.facebook.react.views.text;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.w;
import com.facebook.react.uimanager.y;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.DebugKt;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes4.dex */
public class m {
    private static final int F = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f23747e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f23749g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected float f23743a = Float.NaN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f23744b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected boolean f23745c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float f23746d = Float.NaN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f23748f = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected float f23750h = Float.NaN;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f23751i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f23752j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f23753k = -1.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected float f23754l = -1.0f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f23755m = Float.NaN;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected int f23756n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f23757o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NonNull
    protected p f23758p = p.NONE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected float f23759q = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected float f23760r = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected float f23761s = BitmapDescriptorFactory.HUE_RED;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int f23762t = 1426063360;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f23763u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected boolean f23764v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f23765w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected y.d f23766x = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected y.e f23767y = null;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected int f23768z = -1;
    protected int A = -1;
    protected String B = null;
    protected String C = null;
    protected boolean D = false;
    protected float E = Float.NaN;

    private m() {
    }

    private void A(float f11) {
        this.f23750h = f11;
    }

    private void B(y.e eVar) {
        this.f23767y = eVar;
    }

    private void C(String str) {
        this.f23763u = false;
        this.f23764v = false;
        if (str != null) {
            for (String str2 : str.split("-")) {
                if ("underline".equals(str2)) {
                    this.f23763u = true;
                } else if ("strikethrough".equals(str2)) {
                    this.f23764v = true;
                }
            }
        }
    }

    private void D(int i11) {
        if (i11 != this.f23762t) {
            this.f23762t = i11;
        }
    }

    private void E(float f11) {
        this.f23759q = w.h(f11);
    }

    private void F(float f11) {
        this.f23760r = w.h(f11);
    }

    private void G(float f11) {
        if (f11 != this.f23761s) {
            this.f23761s = f11;
        }
    }

    private void H(String str) {
        if (str == null || "none".equals(str)) {
            this.f23758p = p.NONE;
            return;
        }
        if ("uppercase".equals(str)) {
            this.f23758p = p.UPPERCASE;
            return;
        }
        if ("lowercase".equals(str)) {
            this.f23758p = p.LOWERCASE;
            return;
        }
        if ("capitalize".equals(str)) {
            this.f23758p = p.CAPITALIZE;
            return;
        }
        qk.a.I("ReactNative", "Invalid textTransform: " + str);
        this.f23758p = p.NONE;
    }

    public static m a(com.facebook.react.common.mapbuffer.a aVar) {
        m mVar = new m();
        for (com.facebook.react.common.mapbuffer.a.c cVar : aVar) {
            switch (cVar.getKey()) {
                case 0:
                    mVar.q(Integer.valueOf(cVar.b()));
                    break;
                case 1:
                    mVar.p(Integer.valueOf(cVar.b()));
                    break;
                case 2:
                    mVar.A((float) cVar.getDoubleValue());
                    break;
                case 3:
                    mVar.r(cVar.getStringValue());
                    break;
                case 4:
                    mVar.s((float) cVar.getDoubleValue());
                    break;
                case 6:
                    mVar.v(cVar.getStringValue());
                    break;
                case 7:
                    mVar.t(cVar.getStringValue());
                    break;
                case 8:
                    mVar.u(cVar.e());
                    break;
                case 9:
                    mVar.o(cVar.d());
                    break;
                case 10:
                    mVar.x((float) cVar.getDoubleValue());
                    break;
                case 11:
                    mVar.y((float) cVar.getDoubleValue());
                    break;
                case 15:
                    mVar.C(cVar.getStringValue());
                    break;
                case 18:
                    mVar.G((float) cVar.getDoubleValue());
                    break;
                case 19:
                    mVar.D(cVar.b());
                    break;
                case 20:
                    mVar.E((float) cVar.getDoubleValue());
                    break;
                case 21:
                    mVar.F((float) cVar.getDoubleValue());
                    break;
                case 23:
                    mVar.w(cVar.getStringValue());
                    break;
                case 24:
                    mVar.n(cVar.getStringValue());
                    break;
                case 26:
                    mVar.B(y.e.values()[cVar.b()]);
                    break;
                case 27:
                    mVar.H(cVar.getStringValue());
                    break;
                case 29:
                    mVar.z((float) cVar.getDoubleValue());
                    break;
            }
        }
        return mVar;
    }

    public static int g(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("normal")) {
            return 1;
        }
        return !str.equals("none") ? 2 : 0;
    }

    public static int h(k0 k0Var, int i11) {
        if (!k0Var.d("textAlign")) {
            return i11;
        }
        if (!"justify".equals(k0Var.c("textAlign")) || Build.VERSION.SDK_INT < 26) {
            return F;
        }
        return 1;
    }

    public static int i(String str) {
        if (str != null && !"undefined".equals(str)) {
            if ("rtl".equals(str)) {
                return 1;
            }
            if ("ltr".equals(str)) {
                return 0;
            }
            qk.a.I("ReactNative", "Invalid layoutDirection: " + str);
        }
        return -1;
    }

    public static int l(k0 k0Var, boolean z11, int i11) {
        if (!k0Var.d("textAlign")) {
            return i11;
        }
        String strC = k0Var.c("textAlign");
        if ("justify".equals(strC)) {
            return 3;
        }
        if (strC != null && !DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(strC)) {
            if ("left".equals(strC)) {
                return z11 ? 5 : 3;
            }
            if ("right".equals(strC)) {
                return z11 ? 3 : 5;
            }
            if ("center".equals(strC)) {
                return 1;
            }
            qk.a.I("ReactNative", "Invalid textAlign: " + strC);
        }
        return 0;
    }

    public static int m(String str) {
        if (str == null) {
            return 1;
        }
        if (str.equals("balanced")) {
            return 2;
        }
        return !str.equals("simple") ? 1 : 0;
    }

    private void n(String str) {
        if (str == null) {
            this.f23766x = null;
        } else {
            this.f23766x = y.d.fromValue(str);
        }
    }

    private void o(boolean z11) {
        if (z11 != this.f23745c) {
            this.f23745c = z11;
            s(this.f23753k);
            y(this.f23754l);
        }
    }

    private void p(Integer num) {
        boolean z11 = num != null;
        this.f23748f = z11;
        if (z11) {
            this.f23749g = num.intValue();
        }
    }

    private void q(Integer num) {
        boolean z11 = num != null;
        this.f23744b = z11;
        if (z11) {
            this.f23747e = num.intValue();
        }
    }

    private void r(String str) {
        this.B = str;
    }

    private void s(float f11) {
        this.f23753k = f11;
        if (f11 != -1.0f) {
            f11 = (float) (this.f23745c ? Math.ceil(w.k(f11, this.f23746d)) : Math.ceil(w.h(f11)));
        }
        this.f23752j = (int) f11;
    }

    private void t(String str) {
        this.f23768z = k.b(str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void u(com.facebook.react.common.mapbuffer.a aVar) {
        if (aVar == null || aVar.getCount() == 0) {
            this.C = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<com.facebook.react.common.mapbuffer.a.c> it = aVar.iterator();
        while (it.hasNext()) {
            String stringValue = it.next().getStringValue();
            if (stringValue != null) {
                byte b11 = -1;
                switch (stringValue.hashCode()) {
                    case -1983120972:
                        if (stringValue.equals("stylistic-thirteen")) {
                            b11 = 0;
                        }
                        break;
                    case -1933522176:
                        if (stringValue.equals("stylistic-fifteen")) {
                            b11 = 1;
                        }
                        break;
                    case -1534462052:
                        if (stringValue.equals("stylistic-eighteen")) {
                            b11 = 2;
                        }
                        break;
                    case -1195362251:
                        if (stringValue.equals("proportional-nums")) {
                            b11 = 3;
                        }
                        break;
                    case -1061392823:
                        if (stringValue.equals("lining-nums")) {
                            b11 = 4;
                        }
                        break;
                    case -771984547:
                        if (stringValue.equals("tabular-nums")) {
                            b11 = 5;
                        }
                        break;
                    case -659678800:
                        if (stringValue.equals("oldstyle-nums")) {
                            b11 = 6;
                        }
                        break;
                    case 296506098:
                        if (stringValue.equals("stylistic-eight")) {
                            b11 = 7;
                        }
                        break;
                    case 309330544:
                        if (stringValue.equals("stylistic-seven")) {
                            b11 = 8;
                        }
                        break;
                    case 310339585:
                        if (stringValue.equals("stylistic-three")) {
                            b11 = 9;
                        }
                        break;
                    case 604478526:
                        if (stringValue.equals("stylistic-eleven")) {
                            b11 = 10;
                        }
                        break;
                    case 979426287:
                        if (stringValue.equals("stylistic-five")) {
                            b11 = 11;
                        }
                        break;
                    case 979432035:
                        if (stringValue.equals("stylistic-four")) {
                            b11 = 12;
                        }
                        break;
                    case 979664367:
                        if (stringValue.equals("stylistic-nine")) {
                            b11 = 13;
                        }
                        break;
                    case 1001434505:
                        if (stringValue.equals("stylistic-one")) {
                            b11 = 14;
                        }
                        break;
                    case 1001438213:
                        if (stringValue.equals("stylistic-six")) {
                            b11 = 15;
                        }
                        break;
                    case 1001439040:
                        if (stringValue.equals("stylistic-ten")) {
                            b11 = Tnaf.POW_2_WIDTH;
                        }
                        break;
                    case 1001439599:
                        if (stringValue.equals("stylistic-two")) {
                            b11 = 17;
                        }
                        break;
                    case 1030714463:
                        if (stringValue.equals("stylistic-sixteen")) {
                            b11 = 18;
                        }
                        break;
                    case 1044065430:
                        if (stringValue.equals("stylistic-twelve")) {
                            b11 = 19;
                        }
                        break;
                    case 1044067310:
                        if (stringValue.equals("stylistic-twenty")) {
                            b11 = 20;
                        }
                        break;
                    case 1183323111:
                        if (stringValue.equals("small-caps")) {
                            b11 = 21;
                        }
                        break;
                    case 1463562569:
                        if (stringValue.equals("stylistic-nineteen")) {
                            b11 = 22;
                        }
                        break;
                    case 1648446397:
                        if (stringValue.equals("stylistic-fourteen")) {
                            b11 = 23;
                        }
                        break;
                    case 2097122634:
                        if (stringValue.equals("stylistic-seventeen")) {
                            b11 = 24;
                        }
                        break;
                }
                switch (b11) {
                    case 0:
                        arrayList.add("'ss13'");
                        break;
                    case 1:
                        arrayList.add("'ss15'");
                        break;
                    case 2:
                        arrayList.add("'ss18'");
                        break;
                    case 3:
                        arrayList.add("'pnum'");
                        break;
                    case 4:
                        arrayList.add("'lnum'");
                        break;
                    case 5:
                        arrayList.add("'tnum'");
                        break;
                    case 6:
                        arrayList.add("'onum'");
                        break;
                    case 7:
                        arrayList.add("'ss08'");
                        break;
                    case 8:
                        arrayList.add("'ss07'");
                        break;
                    case 9:
                        arrayList.add("'ss03'");
                        break;
                    case 10:
                        arrayList.add("'ss11'");
                        break;
                    case 11:
                        arrayList.add("'ss05'");
                        break;
                    case 12:
                        arrayList.add("'ss04'");
                        break;
                    case 13:
                        arrayList.add("'ss09'");
                        break;
                    case 14:
                        arrayList.add("'ss01'");
                        break;
                    case 15:
                        arrayList.add("'ss06'");
                        break;
                    case 16:
                        arrayList.add("'ss10'");
                        break;
                    case 17:
                        arrayList.add("'ss02'");
                        break;
                    case 18:
                        arrayList.add("'ss16'");
                        break;
                    case 19:
                        arrayList.add("'ss12'");
                        break;
                    case 20:
                        arrayList.add("'ss20'");
                        break;
                    case 21:
                        arrayList.add("'smcp'");
                        break;
                    case 22:
                        arrayList.add("'ss19'");
                        break;
                    case 23:
                        arrayList.add("'ss14'");
                        break;
                    case 24:
                        arrayList.add("'ss17'");
                        break;
                }
            }
        }
        this.C = TextUtils.join(", ", arrayList);
    }

    private void v(String str) {
        this.A = k.d(str);
    }

    private void w(String str) {
        this.f23757o = i(str);
    }

    private void x(float f11) {
        this.f23755m = f11;
    }

    private void y(float f11) {
        this.f23754l = f11;
        if (f11 == -1.0f) {
            this.f23743a = Float.NaN;
        } else {
            this.f23743a = this.f23745c ? w.j(f11) : w.h(f11);
        }
    }

    private void z(float f11) {
        if (f11 != this.f23746d) {
            this.f23746d = f11;
            s(this.f23753k);
            y(this.f23754l);
        }
    }

    public int b() {
        return this.f23752j;
    }

    public float c() {
        if (!Float.isNaN(this.f23743a) && !Float.isNaN(this.E)) {
            float f11 = this.E;
            if (f11 > this.f23743a) {
                return f11;
            }
        }
        return this.f23743a;
    }

    public String d() {
        return this.B;
    }

    public int e() {
        return this.f23768z;
    }

    public int f() {
        return this.A;
    }

    public float j() {
        float fJ = this.f23745c ? w.j(this.f23755m) : w.h(this.f23755m);
        int i11 = this.f23752j;
        if (i11 > 0) {
            return fJ / i11;
        }
        throw new IllegalArgumentException("FontSize should be a positive value. Current value: " + this.f23752j);
    }

    public float k() {
        return this.f23750h;
    }
}
