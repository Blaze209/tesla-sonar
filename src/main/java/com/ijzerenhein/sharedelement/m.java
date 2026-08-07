package com.ijzerenhein.sharedelement;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.v0;
import com.facebook.react.uimanager.w;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.Iterator;
import org.spongycastle.cms.CMSAttributeTableGenerator;

/* JADX INFO: loaded from: classes6.dex */
public class m extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f45618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.ijzerenhein.sharedelement.b f45619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f45620c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.ijzerenhein.sharedelement.a f45621d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f45622e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f45623f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f45624g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f45625h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ArrayList<n> f45626i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f45627j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f45628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final o f45629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final o f45630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f45631n;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f45632a;

        static {
            int[] iArr = new int[com.ijzerenhein.sharedelement.b.values().length];
            f45632a = iArr;
            try {
                iArr[com.ijzerenhein.sharedelement.b.MOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f45632a[com.ijzerenhein.sharedelement.b.FADE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f45632a[com.ijzerenhein.sharedelement.b.FADE_IN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f45632a[com.ijzerenhein.sharedelement.b.FADE_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    enum b {
        START(0),
        END(1);

        private final int value;

        b(int i11) {
            this.value = i11;
        }

        public int getValue() {
            return this.value;
        }
    }

    public m(v0 v0Var, g gVar) {
        super(v0Var);
        this.f45619b = com.ijzerenhein.sharedelement.b.MOVE;
        this.f45620c = i.STRETCH;
        this.f45621d = com.ijzerenhein.sharedelement.a.CENTER_CENTER;
        this.f45622e = BitmapDescriptorFactory.HUE_RED;
        this.f45623f = false;
        this.f45624g = false;
        this.f45625h = false;
        ArrayList<n> arrayList = new ArrayList<>();
        this.f45626i = arrayList;
        this.f45627j = new int[2];
        this.f45628k = false;
        this.f45631n = -1;
        this.f45618a = gVar;
        arrayList.add(new n(gVar, "start"));
        arrayList.add(new n(gVar, "end"));
        o oVar = new o(v0Var);
        this.f45629l = oVar;
        addView(oVar);
        o oVar2 = new o(v0Var);
        this.f45630m = oVar2;
        addView(oVar2);
    }

    private void c(String str, n nVar, RectF rectF, RectF rectF2) {
        ReactContext reactContext = (ReactContext) getContext();
        j jVarH = nVar.h();
        c cVarB = nVar.b();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("x", w.f(rectF.left - this.f45627j[0]));
        writableMapCreateMap.putDouble("y", w.f(rectF.top - this.f45627j[1]));
        writableMapCreateMap.putDouble(Snapshot.WIDTH, w.f(rectF.width()));
        writableMapCreateMap.putDouble(Snapshot.HEIGHT, w.f(rectF.height()));
        writableMapCreateMap.putDouble("visibleX", w.f(rectF2.left - this.f45627j[0]));
        writableMapCreateMap.putDouble("visibleY", w.f(rectF2.top - this.f45627j[1]));
        writableMapCreateMap.putDouble("visibleWidth", w.f(rectF2.width()));
        writableMapCreateMap.putDouble("visibleHeight", w.f(rectF2.height()));
        writableMapCreateMap.putDouble("contentX", w.f(rectF.left - this.f45627j[0]));
        writableMapCreateMap.putDouble("contentY", w.f(rectF.top - this.f45627j[1]));
        writableMapCreateMap.putDouble("contentWidth", w.f(rectF.width()));
        writableMapCreateMap.putDouble("contentHeight", w.f(rectF.height()));
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putDouble(Snapshot.BORDER_TOP_LEFT_RADIUS, w.f(jVarH.f45606h));
        writableMapCreateMap2.putDouble(Snapshot.BORDER_TOP_RIGHT_RADIUS, w.f(jVarH.f45607i));
        writableMapCreateMap2.putDouble(Snapshot.BORDER_BOTTOM_LEFT_RADIUS, w.f(jVarH.f45608j));
        writableMapCreateMap2.putDouble(Snapshot.BORDER_BOTTOM_RIGHT_RADIUS, w.f(jVarH.f45609k));
        WritableMap writableMapCreateMap3 = Arguments.createMap();
        writableMapCreateMap3.putString("node", str);
        writableMapCreateMap3.putMap("layout", writableMapCreateMap);
        writableMapCreateMap3.putString(CMSAttributeTableGenerator.CONTENT_TYPE, (cVarB != null ? d.e(cVarB.f45553a, jVarH) : d.b.NONE).getValue());
        writableMapCreateMap3.putMap("style", writableMapCreateMap2);
        ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onMeasureNode", writableMapCreateMap3);
    }

    private static RectF d(RectF rectF, RectF rectF2) {
        return new RectF(rectF2.left - rectF.left, rectF2.top - rectF.top, rectF.right - rectF2.right, rectF.bottom - rectF2.bottom);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:31:0x007f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    private static RectF e(RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, RectF rectF5, float f11) {
        float f12;
        float f13;
        float f14;
        RectF rectF6 = new RectF();
        float f15 = rectF4.top;
        if (f15 != BitmapDescriptorFactory.HUE_RED || rectF2.top == BitmapDescriptorFactory.HUE_RED) {
            f12 = rectF2.top;
            if (f12 == BitmapDescriptorFactory.HUE_RED || f15 == BitmapDescriptorFactory.HUE_RED) {
                rectF6.top = f12 + ((f15 - f12) * f11);
            } else {
                float f16 = rectF5.top;
                if (f16 <= rectF3.top) {
                    rectF6.top = Math.max(BitmapDescriptorFactory.HUE_RED, f16 - rectF.top);
                } else {
                    rectF6.top = f12 + ((f15 - f12) * f11);
                }
            }
        } else {
            float f17 = rectF3.top;
            if (f17 <= rectF5.top) {
                rectF6.top = Math.max(BitmapDescriptorFactory.HUE_RED, f17 - rectF.top);
            } else {
                f12 = rectF2.top;
                if (f12 == BitmapDescriptorFactory.HUE_RED) {
                    rectF6.top = f12 + ((f15 - f12) * f11);
                } else {
                    rectF6.top = f12 + ((f15 - f12) * f11);
                }
            }
        }
        float f18 = rectF4.bottom;
        if (f18 != BitmapDescriptorFactory.HUE_RED || rectF2.bottom == BitmapDescriptorFactory.HUE_RED) {
            f13 = rectF2.bottom;
            if (f13 == BitmapDescriptorFactory.HUE_RED || f18 == BitmapDescriptorFactory.HUE_RED) {
                rectF6.bottom = f13 + ((f18 - f13) * f11);
            } else {
                float f19 = rectF5.bottom;
                if (f19 >= rectF3.bottom) {
                    rectF6.bottom = Math.max(BitmapDescriptorFactory.HUE_RED, rectF.bottom - f19);
                } else {
                    rectF6.bottom = f13 + ((f18 - f13) * f11);
                }
            }
        } else {
            float f21 = rectF3.bottom;
            if (f21 >= rectF5.bottom) {
                rectF6.bottom = Math.max(BitmapDescriptorFactory.HUE_RED, rectF.bottom - f21);
            } else {
                f13 = rectF2.bottom;
                if (f13 == BitmapDescriptorFactory.HUE_RED) {
                    rectF6.bottom = f13 + ((f18 - f13) * f11);
                } else {
                    rectF6.bottom = f13 + ((f18 - f13) * f11);
                }
            }
        }
        float f22 = rectF4.left;
        if (f22 != BitmapDescriptorFactory.HUE_RED || rectF2.left == BitmapDescriptorFactory.HUE_RED) {
            f14 = rectF2.left;
            if (f14 == BitmapDescriptorFactory.HUE_RED || f22 == BitmapDescriptorFactory.HUE_RED) {
                rectF6.left = f14 + ((f22 - f14) * f11);
            } else {
                float f23 = rectF5.left;
                if (f23 <= rectF3.left) {
                    rectF6.left = Math.max(BitmapDescriptorFactory.HUE_RED, f23 - rectF.left);
                } else {
                    rectF6.left = f14 + ((f22 - f14) * f11);
                }
            }
        } else {
            float f24 = rectF3.left;
            if (f24 <= rectF5.left) {
                rectF6.left = Math.max(BitmapDescriptorFactory.HUE_RED, f24 - rectF.left);
            } else {
                f14 = rectF2.left;
                if (f14 == BitmapDescriptorFactory.HUE_RED) {
                    rectF6.left = f14 + ((f22 - f14) * f11);
                } else {
                    rectF6.left = f14 + ((f22 - f14) * f11);
                }
            }
        }
        float f25 = rectF4.right;
        if (f25 == BitmapDescriptorFactory.HUE_RED && rectF2.right != BitmapDescriptorFactory.HUE_RED) {
            float f26 = rectF3.right;
            if (f26 >= rectF5.right) {
                rectF6.right = Math.max(BitmapDescriptorFactory.HUE_RED, rectF.right - f26);
                return rectF6;
            }
        }
        float f27 = rectF2.right;
        if (f27 == BitmapDescriptorFactory.HUE_RED && f25 != BitmapDescriptorFactory.HUE_RED) {
            float f28 = rectF5.right;
            if (f28 >= rectF3.right) {
                rectF6.right = Math.max(BitmapDescriptorFactory.HUE_RED, rectF.right - f28);
                return rectF6;
            }
        }
        rectF6.right = f27 + ((f25 - f27) * f11);
        return rectF6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f(n nVar, Object[] objArr) {
        nVar.p((j) objArr[0]);
        k();
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(n nVar, Object[] objArr) {
        nVar.j((c) objArr[0]);
        k();
        l();
    }

    private void i(boolean z11) {
        if (this.f45624g || z11) {
            for (final n nVar : this.f45626i) {
                if (nVar.f()) {
                    nVar.n(false);
                    nVar.g().r(new Callback() { // from class: com.ijzerenhein.sharedelement.k
                        @Override // com.facebook.react.bridge.Callback
                        public final void invoke(Object[] objArr) {
                            this.f45614a.f(nVar, objArr);
                        }
                    });
                }
                if (nVar.e()) {
                    nVar.m(false);
                    nVar.g().q(new Callback() { // from class: com.ijzerenhein.sharedelement.l
                        @Override // com.facebook.react.bridge.Callback
                        public final void invoke(Object[] objArr) {
                            this.f45616a.g(nVar, objArr);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:101:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:103:0x01d5 A[PHI: r13
      0x01d5: PHI (r13v14 float) = (r13v13 float), (r13v30 float) binds: [B:117:0x0200, B:102:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x01d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:110:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:118:0x0202  */
    /* JADX WARN: Code duplicated, block: B:121:0x0209  */
    /* JADX WARN: Code duplicated, block: B:122:0x0225  */
    /* JADX WARN: Code duplicated, block: B:128:0x0239  */
    /* JADX WARN: Code duplicated, block: B:132:0x0268  */
    /* JADX WARN: Code duplicated, block: B:139:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:89:0x014c  */
    /* JADX WARN: Code duplicated, block: B:92:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c9 A[DONT_INVERT] */
    private void k() {
        RectF rectF;
        j jVarG;
        RectF rectF2;
        RectF rectF3;
        RectF rectF4;
        char c11;
        RectF rectF5;
        int i11;
        float f11;
        float f12;
        com.ijzerenhein.sharedelement.b bVar;
        com.ijzerenhein.sharedelement.b bVar2;
        j jVar;
        RectF rectF6;
        float f13;
        com.ijzerenhein.sharedelement.b bVar3;
        float f14;
        j jVar2;
        j jVar3;
        float f15;
        RectF rectF7;
        boolean z11;
        float f16;
        float f17;
        float f18;
        float f19;
        if (this.f45624g) {
            n nVar = this.f45626i.get(b.START.getValue());
            n nVar2 = this.f45626i.get(b.END.getValue());
            View view = (View) getParent();
            if (view == null) {
                return;
            }
            view.getLocationInWindow(this.f45627j);
            j jVarH = nVar.h();
            j jVarH2 = nVar2.h();
            if (jVarH == null && jVarH2 == null) {
                return;
            }
            c cVarB = nVar.b();
            c cVarB2 = nVar2.b();
            com.ijzerenhein.sharedelement.b bVar4 = this.f45619b;
            com.ijzerenhein.sharedelement.b bVar5 = com.ijzerenhein.sharedelement.b.MOVE;
            c cVar = (bVar4 == bVar5 && cVarB == null && cVarB2 != null) ? cVarB2 : cVarB;
            if (this.f45631n < 0) {
                if (jVarH != null && jVarH2 == null) {
                    this.f45631n = nVar2.g() == null ? 1 : 0;
                } else if (jVarH2 != null && jVarH == null) {
                    this.f45631n = nVar.g() == null ? 0 : 1;
                } else if (jVarH != null && jVarH2 != null) {
                    this.f45631n = j.d(view, jVarH2) > j.d(view, jVarH) ? 1 : 0;
                }
            }
            boolean z12 = this.f45631n == 1;
            RectF rectFL = j.l(z12, jVarH, this.f45627j);
            Rect rect = jVarH != null ? jVarH.f45600b : j.f45588p;
            boolean z13 = this.f45631n == 0;
            RectF rectFL2 = j.l(z13, jVarH2, this.f45627j);
            Rect rect2 = jVarH2 != null ? jVarH2.f45600b : j.f45588p;
            RectF rectFK = j.k(z12, jVarH != null ? nVar.a() : j.f45589q, jVarH, this.f45627j);
            RectF rectFD = d(rectFL, rectFK);
            RectF rectFK2 = j.k(z13, jVarH2 != null ? nVar2.a() : j.f45589q, jVarH2, this.f45627j);
            RectF rectFD2 = d(rectFL2, rectFK2);
            float f21 = 1.0f;
            if (jVarH == null || jVarH2 == null) {
                rectF = rectFK2;
                if (jVarH != null) {
                    jVarG = jVarH;
                    rectF2 = rectFL;
                } else {
                    if (!this.f45625h) {
                        this.f45622e = 1.0f;
                        this.f45625h = true;
                    }
                    jVarG = jVarH2;
                    rectF2 = rectFL2;
                    f21 = 1.0f;
                    rectF3 = rectFD2;
                }
                if (rectF3.left <= BitmapDescriptorFactory.HUE_RED || rectF3.top > BitmapDescriptorFactory.HUE_RED || rectF3.right > BitmapDescriptorFactory.HUE_RED || rectF3.bottom > BitmapDescriptorFactory.HUE_RED) {
                    rectF4 = new RectF(rectF2);
                    rectF4.left += rectF3.left;
                    rectF4.top += rectF3.top;
                    rectF4.right -= rectF3.right;
                    rectF4.bottom -= rectF3.bottom;
                    c11 = 1;
                    this.f45628k = true;
                } else {
                    rectF4 = new RectF(rectFL);
                    rectF4.union(rectFL2);
                    this.f45628k = false;
                    c11 = 1;
                }
                rectF5 = rectF4;
                int[] iArr = this.f45627j;
                super.layout(-iArr[r7], -iArr[c11], (int) Math.ceil(rectF5.width() - this.f45627j[0]), (int) Math.ceil(rectF5.height() - this.f45627j[1]));
                setTranslationX(rectF5.left);
                setTranslationY(rectF5.top);
                i11 = a.f45632a[this.f45619b.ordinal()];
                if (i11 != 1) {
                    f11 = jVarG.f45605g;
                    if (jVarH == null) {
                        f12 = f11;
                    } else {
                        f12 = BitmapDescriptorFactory.HUE_RED;
                    }
                } else if (i11 != 2) {
                    if (jVarH != null) {
                        f16 = jVarH.f45605g;
                    } else {
                        f16 = f21;
                    }
                    float f22 = this.f45622e;
                    float f23 = f16 * (f21 - f22);
                    if (jVarH2 != null) {
                        f17 = jVarH2.f45605g;
                    } else {
                        f17 = f21;
                    }
                    float f24 = f17 * f22;
                    f11 = f23;
                    f12 = f24;
                } else if (i11 != 3) {
                    if (jVarH2 != null) {
                        f18 = jVarH2.f45605g;
                    } else {
                        f18 = f21;
                    }
                    f12 = f18 * this.f45622e;
                    f11 = BitmapDescriptorFactory.HUE_RED;
                } else if (i11 != 4) {
                    f12 = f21;
                    f11 = f12;
                } else {
                    if (jVarH != null) {
                        f19 = jVarH.f45605g;
                    } else {
                        f19 = f21;
                    }
                    f11 = (f21 - this.f45622e) * f19;
                    f12 = BitmapDescriptorFactory.HUE_RED;
                }
                bVar = this.f45619b;
                bVar2 = com.ijzerenhein.sharedelement.b.FADE_IN;
                if (bVar != bVar2) {
                    f13 = f11;
                    jVar = jVarG;
                    this.f45629l.b(rectF2, rectF5, rectFL, rect, cVar, jVar, f13, this.f45620c, this.f45621d, this.f45622e);
                    rectF6 = rectFL;
                } else {
                    jVar = jVarG;
                    rectF6 = rectFL;
                    f13 = f11;
                }
                bVar3 = this.f45619b;
                if (bVar3 != com.ijzerenhein.sharedelement.b.FADE || bVar3 == bVar2 || (bVar3 == bVar5 && jVarH == null)) {
                    RectF rectF8 = rectF2;
                    f14 = f12;
                    jVar2 = jVarH2;
                    jVar3 = jVar;
                    f15 = f13;
                    rectF7 = rectFL2;
                    this.f45630m.b(rectF8, rectF5, rectF7, rect2, cVarB2, jVar3, f14, this.f45620c, this.f45621d, this.f45622e);
                    if (jVar3.f45613o > BitmapDescriptorFactory.HUE_RED && Build.VERSION.SDK_INT >= 28) {
                        this.f45629l.setOutlineAmbientShadowColor(Color.argb(f15, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                        this.f45629l.setOutlineSpotShadowColor(Color.argb(f15, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                        this.f45630m.setOutlineAmbientShadowColor(Color.argb(f14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                        this.f45630m.setOutlineSpotShadowColor(Color.argb(f14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                    }
                } else {
                    this.f45630m.a();
                    jVar2 = jVarH2;
                    rectF7 = rectFL2;
                }
                if (jVarH != 0 || nVar.c()) {
                    z11 = true;
                } else {
                    z11 = true;
                    nVar.k(true);
                    c("startNode", nVar, rectF6, rectFK);
                }
                if (jVar2 != null || nVar2.c()) {
                }
                nVar2.k(z11);
                c("endNode", nVar2, rectF7, rectF);
                return;
            }
            RectF rectFF = j.f(rectFL, rectFL2, this.f45622e);
            rectF = rectFK2;
            rectFD = e(rectFF, rectFD, rectFK, rectFD2, rectF, this.f45622e);
            jVarG = j.g(jVarH, rectFL, jVarH2, rectFL2, this.f45622e);
            rectF2 = rectFF;
            rectF3 = rectFD;
            if (rectF3.left <= BitmapDescriptorFactory.HUE_RED) {
                rectF4 = new RectF(rectF2);
                rectF4.left += rectF3.left;
                rectF4.top += rectF3.top;
                rectF4.right -= rectF3.right;
                rectF4.bottom -= rectF3.bottom;
                c11 = 1;
                this.f45628k = true;
            } else {
                rectF4 = new RectF(rectF2);
                rectF4.left += rectF3.left;
                rectF4.top += rectF3.top;
                rectF4.right -= rectF3.right;
                rectF4.bottom -= rectF3.bottom;
                c11 = 1;
                this.f45628k = true;
            }
            rectF5 = rectF4;
            int[] iArr2 = this.f45627j;
            super.layout(-iArr2[r7], -iArr2[c11], (int) Math.ceil(rectF5.width() - this.f45627j[0]), (int) Math.ceil(rectF5.height() - this.f45627j[1]));
            setTranslationX(rectF5.left);
            setTranslationY(rectF5.top);
            i11 = a.f45632a[this.f45619b.ordinal()];
            if (i11 != 1) {
                f11 = jVarG.f45605g;
                if (jVarH == null) {
                    f12 = f11;
                } else {
                    f12 = BitmapDescriptorFactory.HUE_RED;
                }
            } else if (i11 != 2) {
                if (jVarH != null) {
                    f16 = jVarH.f45605g;
                } else {
                    f16 = f21;
                }
                float f25 = this.f45622e;
                float f26 = f16 * (f21 - f25);
                if (jVarH2 != null) {
                    f17 = jVarH2.f45605g;
                } else {
                    f17 = f21;
                }
                float f27 = f17 * f25;
                f11 = f26;
                f12 = f27;
            } else if (i11 != 3) {
                if (jVarH2 != null) {
                    f18 = jVarH2.f45605g;
                } else {
                    f18 = f21;
                }
                f12 = f18 * this.f45622e;
                f11 = BitmapDescriptorFactory.HUE_RED;
            } else if (i11 != 4) {
                f12 = f21;
                f11 = f12;
            } else {
                if (jVarH != null) {
                    f19 = jVarH.f45605g;
                } else {
                    f19 = f21;
                }
                f11 = (f21 - this.f45622e) * f19;
                f12 = BitmapDescriptorFactory.HUE_RED;
            }
            bVar = this.f45619b;
            bVar2 = com.ijzerenhein.sharedelement.b.FADE_IN;
            if (bVar != bVar2) {
                f13 = f11;
                jVar = jVarG;
                this.f45629l.b(rectF2, rectF5, rectFL, rect, cVar, jVar, f13, this.f45620c, this.f45621d, this.f45622e);
                rectF6 = rectFL;
            } else {
                jVar = jVarG;
                rectF6 = rectFL;
                f13 = f11;
            }
            bVar3 = this.f45619b;
            if (bVar3 != com.ijzerenhein.sharedelement.b.FADE) {
                RectF rectF9 = rectF2;
                f14 = f12;
                jVar2 = jVarH2;
                jVar3 = jVar;
                f15 = f13;
                rectF7 = rectFL2;
                this.f45630m.b(rectF9, rectF5, rectF7, rect2, cVarB2, jVar3, f14, this.f45620c, this.f45621d, this.f45622e);
                if (jVar3.f45613o > BitmapDescriptorFactory.HUE_RED) {
                    this.f45629l.setOutlineAmbientShadowColor(Color.argb(f15, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                    this.f45629l.setOutlineSpotShadowColor(Color.argb(f15, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                    this.f45630m.setOutlineAmbientShadowColor(Color.argb(f14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                    this.f45630m.setOutlineSpotShadowColor(Color.argb(f14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                }
            } else {
                RectF rectF10 = rectF2;
                f14 = f12;
                jVar2 = jVarH2;
                jVar3 = jVar;
                f15 = f13;
                rectF7 = rectFL2;
                this.f45630m.b(rectF10, rectF5, rectF7, rect2, cVarB2, jVar3, f14, this.f45620c, this.f45621d, this.f45622e);
                if (jVar3.f45613o > BitmapDescriptorFactory.HUE_RED) {
                    this.f45629l.setOutlineAmbientShadowColor(Color.argb(f15, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                    this.f45629l.setOutlineSpotShadowColor(Color.argb(f15, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                    this.f45630m.setOutlineAmbientShadowColor(Color.argb(f14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                    this.f45630m.setOutlineSpotShadowColor(Color.argb(f14, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED));
                }
            }
            if (jVarH != 0) {
                z11 = true;
            } else {
                z11 = true;
            }
            if (jVar2 != null) {
            }
        }
    }

    private void l() {
        for (n nVar : this.f45626i) {
            boolean z11 = false;
            boolean z12 = (!this.f45624g || nVar.h() == null || nVar.b() == null) ? false : true;
            if (z12 && this.f45619b == com.ijzerenhein.sharedelement.b.FADE_IN && nVar.d().equals("start")) {
                z12 = false;
            }
            if (!z12 || this.f45619b != com.ijzerenhein.sharedelement.b.FADE_OUT || !nVar.d().equals("end")) {
                z11 = z12;
            }
            nVar.l(z11);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f45628k) {
            canvas.clipRect(0, 0, getWidth(), getHeight());
        }
        super.dispatchDraw(canvas);
    }

    g getNodeManager() {
        return this.f45618a;
    }

    void h() {
        Iterator<n> it = this.f45626i.iterator();
        while (it.hasNext()) {
            it.next().o(null);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    void j(b bVar, f fVar) {
        this.f45626i.get(bVar.getValue()).o(fVar);
        i(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        if (this.f45623f) {
            return;
        }
        this.f45623f = true;
        i(true);
        this.f45624g = true;
        k();
        l();
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    void setAlign(com.ijzerenhein.sharedelement.a aVar) {
        if (this.f45621d != aVar) {
            this.f45621d = aVar;
            k();
        }
    }

    void setAnimation(com.ijzerenhein.sharedelement.b bVar) {
        if (this.f45619b != bVar) {
            this.f45619b = bVar;
            k();
        }
    }

    void setNodePosition(float f11) {
        if (this.f45622e != f11) {
            this.f45622e = f11;
            this.f45625h = true;
            k();
        }
    }

    void setResize(i iVar) {
        if (this.f45620c != iVar) {
            this.f45620c = iVar;
            k();
        }
    }
}
