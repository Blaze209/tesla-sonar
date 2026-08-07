package com.facebook.react.views.text;

import android.graphics.Color;
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.IllegalViewOperationException;
import com.facebook.react.uimanager.i0;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.y;
import com.facebook.yoga.YogaValue;
import com.facebook.yoga.w;
import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends com.facebook.react.uimanager.m {
    protected Map<Integer, i0> A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected n f23658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected boolean f23659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f23660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected boolean f23661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f23662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected y.d f23663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected y.e f23664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f23665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f23666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f23667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f23668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f23669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f23670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected float f23671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected float f23672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected int f23673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected boolean f23674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f23675r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f23676s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f23677t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected float f23678u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected int f23679v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected int f23680w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected String f23681x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected String f23682y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected boolean f23683z;

    public c() {
        this(null);
    }

    private static void b(c cVar, SpannableStringBuilder spannableStringBuilder, List<ap.n> list, n nVar, boolean z11, Map<Integer, i0> map, int i11) {
        float layoutWidth;
        float layoutHeight;
        n nVarA = nVar != null ? nVar.a(cVar.f23658a) : cVar.f23658a;
        int childCount = cVar.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            j0 childAt = cVar.getChildAt(i12);
            if (childAt instanceof e) {
                spannableStringBuilder.append((CharSequence) p.apply(((e) childAt).b(), nVarA.l()));
            } else {
                if (childAt instanceof c) {
                    b((c) childAt, spannableStringBuilder, list, nVarA, z11, map, spannableStringBuilder.length());
                } else if (childAt instanceof zo.a) {
                    spannableStringBuilder.append(WebrtcBuildVersion.maint_version);
                    list.add(new ap.n(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), ((zo.a) childAt).b()));
                } else {
                    if (!z11) {
                        throw new IllegalViewOperationException("Unexpected view type nested under a <Text> or <TextInput> node: " + childAt.getClass());
                    }
                    int reactTag = childAt.getReactTag();
                    YogaValue styleWidth = childAt.getStyleWidth();
                    YogaValue styleHeight = childAt.getStyleHeight();
                    w wVar = styleWidth.f23995b;
                    w wVar2 = w.POINT;
                    if (wVar == wVar2 && styleHeight.f23995b == wVar2) {
                        layoutWidth = styleWidth.f23994a;
                        layoutHeight = styleHeight.f23994a;
                    } else {
                        childAt.calculateLayout();
                        layoutWidth = childAt.getLayoutWidth();
                        layoutHeight = childAt.getLayoutHeight();
                    }
                    spannableStringBuilder.append(WebrtcBuildVersion.maint_version);
                    list.add(new ap.n(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), new ap.q(reactTag, (int) layoutWidth, (int) layoutHeight)));
                    map.put(Integer.valueOf(reactTag), childAt);
                }
                childAt.markUpdateSeen();
            }
            childAt.markUpdateSeen();
        }
        int length = spannableStringBuilder.length();
        if (length >= i11) {
            if (cVar.f23659b) {
                list.add(new ap.n(i11, length, new ap.g(cVar.f23660c)));
            }
            if (cVar.f23661d) {
                list.add(new ap.n(i11, length, new ap.e(cVar.f23662e)));
            }
            y.e eVar = cVar.f23664g;
            if (eVar == null ? cVar.f23663f == y.d.LINK : eVar == y.e.LINK) {
                list.add(new ap.n(i11, length, new ap.f(cVar.getReactTag())));
            }
            float fD = nVarA.d();
            if (!Float.isNaN(fD) && (nVar == null || nVar.d() != fD)) {
                list.add(new ap.n(i11, length, new ap.a(fD)));
            }
            int iC = nVarA.c();
            if (nVar == null || nVar.c() != iC) {
                list.add(new ap.n(i11, length, new ap.d(iC)));
            }
            if (cVar.f23679v != -1 || cVar.f23680w != -1 || cVar.f23681x != null) {
                list.add(new ap.n(i11, length, new ap.c(cVar.f23679v, cVar.f23680w, cVar.f23682y, cVar.f23681x, cVar.getThemedContext().getAssets())));
            }
            if (cVar.f23674q) {
                list.add(new ap.n(i11, length, new ap.m()));
            }
            if (cVar.f23675r) {
                list.add(new ap.n(i11, length, new ap.j()));
            }
            if ((cVar.f23670m != BitmapDescriptorFactory.HUE_RED || cVar.f23671n != BitmapDescriptorFactory.HUE_RED || cVar.f23672o != BitmapDescriptorFactory.HUE_RED) && Color.alpha(cVar.f23673p) != 0) {
                list.add(new ap.n(i11, length, new ap.o(cVar.f23670m, cVar.f23671n, cVar.f23672o, cVar.f23673p)));
            }
            float fE = nVarA.e();
            if (!Float.isNaN(fE) && (nVar == null || nVar.e() != fE)) {
                list.add(new ap.n(i11, length, new ap.b(fE)));
            }
            list.add(new ap.n(i11, length, new ap.k(cVar.getReactTag())));
        }
    }

    protected Spannable c(c cVar, String str, boolean z11, u uVar) {
        int iB;
        gn.a.b((z11 && uVar == null) ? false : true, "nativeViewHierarchyOptimizer is required when inline views are supported");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayList arrayList = new ArrayList();
        HashMap map = z11 ? new HashMap() : null;
        if (str != null) {
            spannableStringBuilder.append((CharSequence) p.apply(str, cVar.f23658a.l()));
        }
        b(cVar, spannableStringBuilder, arrayList, null, z11, map, 0);
        cVar.f23683z = false;
        cVar.A = map;
        float f11 = Float.NaN;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ap.n nVar = (ap.n) arrayList.get((arrayList.size() - i11) - 1);
            ap.i iVar = nVar.what;
            boolean z12 = iVar instanceof ap.p;
            if (z12 || (iVar instanceof ap.q)) {
                if (z12) {
                    iB = ((ap.p) iVar).b();
                    cVar.f23683z = true;
                } else {
                    ap.q qVar = (ap.q) iVar;
                    int i12 = qVar.getCom.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String();
                    i0 i0Var = (i0) map.get(Integer.valueOf(qVar.getReactTag()));
                    uVar.h(i0Var);
                    i0Var.setLayoutParent(cVar);
                    iB = i12;
                }
                if (Float.isNaN(f11) || iB > f11) {
                    f11 = iB;
                }
            }
            nVar.a(spannableStringBuilder, i11);
        }
        cVar.f23658a.o(f11);
        return spannableStringBuilder;
    }

    @no.a(name = "accessibilityRole")
    public void setAccessibilityRole(String str) {
        if (isVirtual()) {
            this.f23663f = y.d.fromValue(str);
            markUpdated();
        }
    }

    @no.a(name = "adjustsFontSizeToFit")
    public void setAdjustFontSizeToFit(boolean z11) {
        if (z11 != this.f23677t) {
            this.f23677t = z11;
            markUpdated();
        }
    }

    @no.a(defaultBoolean = true, name = "allowFontScaling")
    public void setAllowFontScaling(boolean z11) {
        if (z11 != this.f23658a.b()) {
            this.f23658a.m(z11);
            markUpdated();
        }
    }

    @no.a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(Integer num) {
        if (isVirtual()) {
            boolean z11 = num != null;
            this.f23661d = z11;
            if (z11) {
                this.f23662e = num.intValue();
            }
            markUpdated();
        }
    }

    @no.a(customType = "Color", name = "color")
    public void setColor(Integer num) {
        boolean z11 = num != null;
        this.f23659b = z11;
        if (z11) {
            this.f23660c = num.intValue();
        }
        markUpdated();
    }

    @no.a(name = "fontFamily")
    public void setFontFamily(String str) {
        this.f23681x = str;
        markUpdated();
    }

    @no.a(defaultFloat = Float.NaN, name = OrcaFlavourKeys.FONT_SIZE)
    public void setFontSize(float f11) {
        this.f23658a.n(f11);
        markUpdated();
    }

    @no.a(name = "fontStyle")
    public void setFontStyle(String str) {
        int iB = k.b(str);
        if (iB != this.f23679v) {
            this.f23679v = iB;
            markUpdated();
        }
    }

    @no.a(name = "fontVariant")
    public void setFontVariant(ReadableArray readableArray) {
        String strC = k.c(readableArray);
        if (TextUtils.equals(strC, this.f23682y)) {
            return;
        }
        this.f23682y = strC;
        markUpdated();
    }

    @no.a(name = "fontWeight")
    public void setFontWeight(String str) {
        int iD = k.d(str);
        if (iD != this.f23680w) {
            this.f23680w = iD;
            markUpdated();
        }
    }

    @no.a(defaultBoolean = true, name = "includeFontPadding")
    public void setIncludeFontPadding(boolean z11) {
        this.f23676s = z11;
    }

    @no.a(defaultFloat = BitmapDescriptorFactory.HUE_RED, name = "letterSpacing")
    public void setLetterSpacing(float f11) {
        this.f23658a.p(f11);
        markUpdated();
    }

    @no.a(defaultFloat = Float.NaN, name = "lineHeight")
    public void setLineHeight(float f11) {
        this.f23658a.q(f11);
        markUpdated();
    }

    @no.a(defaultFloat = Float.NaN, name = "maxFontSizeMultiplier")
    public void setMaxFontSizeMultiplier(float f11) {
        if (f11 != this.f23658a.k()) {
            this.f23658a.r(f11);
            markUpdated();
        }
    }

    @no.a(name = "minimumFontScale")
    public void setMinimumFontScale(float f11) {
        if (f11 != this.f23678u) {
            this.f23678u = f11;
            markUpdated();
        }
    }

    @no.a(defaultInt = -1, name = "numberOfLines")
    public void setNumberOfLines(int i11) {
        if (i11 == 0) {
            i11 = -1;
        }
        this.f23665h = i11;
        markUpdated();
    }

    @no.a(name = "role")
    public void setRole(String str) {
        if (isVirtual()) {
            this.f23664g = y.e.fromValue(str);
            markUpdated();
        }
    }

    @no.a(name = "textAlign")
    public void setTextAlign(String str) {
        if ("justify".equals(str)) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f23669l = 1;
            }
            this.f23666i = 3;
        } else {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f23669l = 0;
            }
            if (str == null || DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str)) {
                this.f23666i = 0;
            } else if ("left".equals(str)) {
                this.f23666i = 3;
            } else if ("right".equals(str)) {
                this.f23666i = 5;
            } else if ("center".equals(str)) {
                this.f23666i = 1;
            } else {
                qk.a.I("ReactNative", "Invalid textAlign: " + str);
                this.f23666i = 0;
            }
        }
        markUpdated();
    }

    @no.a(name = "textBreakStrategy")
    public void setTextBreakStrategy(String str) {
        if (str == null || "highQuality".equals(str)) {
            this.f23667j = 1;
        } else if ("simple".equals(str)) {
            this.f23667j = 0;
        } else if ("balanced".equals(str)) {
            this.f23667j = 2;
        } else {
            qk.a.I("ReactNative", "Invalid textBreakStrategy: " + str);
            this.f23667j = 1;
        }
        markUpdated();
    }

    @no.a(name = "textDecorationLine")
    public void setTextDecorationLine(String str) {
        this.f23674q = false;
        this.f23675r = false;
        if (str != null) {
            for (String str2 : str.split(" ")) {
                if ("underline".equals(str2)) {
                    this.f23674q = true;
                } else if ("line-through".equals(str2)) {
                    this.f23675r = true;
                }
            }
        }
        markUpdated();
    }

    @no.a(customType = "Color", defaultInt = 1426063360, name = "textShadowColor")
    public void setTextShadowColor(int i11) {
        if (i11 != this.f23673p) {
            this.f23673p = i11;
            markUpdated();
        }
    }

    @no.a(name = "textShadowOffset")
    public void setTextShadowOffset(ReadableMap readableMap) {
        this.f23670m = BitmapDescriptorFactory.HUE_RED;
        this.f23671n = BitmapDescriptorFactory.HUE_RED;
        if (readableMap != null) {
            if (readableMap.hasKey(Snapshot.WIDTH) && !readableMap.isNull(Snapshot.WIDTH)) {
                this.f23670m = com.facebook.react.uimanager.w.g(readableMap.getDouble(Snapshot.WIDTH));
            }
            if (readableMap.hasKey(Snapshot.HEIGHT) && !readableMap.isNull(Snapshot.HEIGHT)) {
                this.f23671n = com.facebook.react.uimanager.w.g(readableMap.getDouble(Snapshot.HEIGHT));
            }
        }
        markUpdated();
    }

    @no.a(defaultInt = 1, name = "textShadowRadius")
    public void setTextShadowRadius(float f11) {
        if (f11 != this.f23672o) {
            this.f23672o = f11;
            markUpdated();
        }
    }

    @no.a(name = "textTransform")
    public void setTextTransform(String str) {
        if (str == null) {
            this.f23658a.s(p.UNSET);
        } else if ("none".equals(str)) {
            this.f23658a.s(p.NONE);
        } else if ("uppercase".equals(str)) {
            this.f23658a.s(p.UPPERCASE);
        } else if ("lowercase".equals(str)) {
            this.f23658a.s(p.LOWERCASE);
        } else if ("capitalize".equals(str)) {
            this.f23658a.s(p.CAPITALIZE);
        } else {
            qk.a.I("ReactNative", "Invalid textTransform: " + str);
            this.f23658a.s(p.UNSET);
        }
        markUpdated();
    }

    public c(j jVar) {
        this.f23659b = false;
        this.f23661d = false;
        this.f23663f = null;
        this.f23664g = null;
        this.f23665h = -1;
        this.f23666i = 0;
        this.f23667j = 1;
        this.f23668k = 0;
        this.f23669l = 0;
        this.f23670m = BitmapDescriptorFactory.HUE_RED;
        this.f23671n = BitmapDescriptorFactory.HUE_RED;
        this.f23672o = BitmapDescriptorFactory.HUE_RED;
        this.f23673p = 1426063360;
        this.f23674q = false;
        this.f23675r = false;
        this.f23676s = true;
        this.f23677t = false;
        this.f23678u = BitmapDescriptorFactory.HUE_RED;
        this.f23679v = -1;
        this.f23680w = -1;
        this.f23681x = null;
        this.f23682y = null;
        this.f23683z = false;
        this.f23658a = new n();
    }
}
