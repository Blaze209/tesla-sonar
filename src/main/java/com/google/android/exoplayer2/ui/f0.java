package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import ts.p0;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
final class f0 extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.android.exoplayer2.ui.a f40876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f40877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<gs.b> f40878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private rs.b f40879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f40880e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f40881f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f40882g;

    class a extends WebView {
        a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40884a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f40884a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40884a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40884a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public f0(Context context) {
        this(context, null);
    }

    private static int b(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? 0 : -100;
        }
        return -50;
    }

    private static String c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i11 = b.f40884a[alignment.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? "center" : "end";
        }
        return "start";
    }

    private static String d(rs.b bVar) {
        int i11 = bVar.f109078d;
        if (i11 == 1) {
            return p0.B("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", c.b(bVar.f109079e));
        }
        if (i11 == 2) {
            return p0.B("0.1em 0.12em 0.15em %s", c.b(bVar.f109079e));
        }
        if (i11 != 3) {
            return i11 != 4 ? "unset" : p0.B("-0.05em -0.05em 0.15em %s", c.b(bVar.f109079e));
        }
        return p0.B("0.06em 0.08em 0.15em %s", c.b(bVar.f109079e));
    }

    private String e(int i11, float f11) {
        float f12 = d0.f(i11, f11, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return f12 == -3.4028235E38f ? "unset" : p0.B("%.2fpx", Float.valueOf(f12 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    private static String h(gs.b bVar) {
        float f11 = bVar.f69489q;
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            return "";
        }
        int i11 = bVar.f69488p;
        return p0.B("%s(%.2fdeg)", (i11 == 2 || i11 == 1) ? "skewY" : "skewX", Float.valueOf(f11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:28:0x0109  */
    /* JADX WARN: Code duplicated, block: B:31:0x0124  */
    /* JADX WARN: Code duplicated, block: B:32:0x0127  */
    /* JADX WARN: Code duplicated, block: B:35:0x013a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x013c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x013e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0145 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0148  */
    /* JADX WARN: Code duplicated, block: B:43:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x015c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0186  */
    /* JADX WARN: Code duplicated, block: B:60:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fa  */
    private void i() {
        float f11;
        String strB;
        int iB;
        boolean z11;
        String str;
        float f12;
        String strB2;
        int i11;
        int i12;
        String str2;
        String str3;
        Object obj;
        String str4;
        d.b bVarA;
        Layout.Alignment alignment;
        String str5;
        boolean z12;
        StringBuilder sb2 = new StringBuilder();
        float f13 = 1.2f;
        sb2.append(p0.B("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", c.b(this.f40879d.f109075a), e(this.f40881f, this.f40880e), Float.valueOf(1.2f), d(this.f40879d)));
        HashMap map = new HashMap();
        map.put(c.a("default_bg"), p0.B("background-color:%s;", c.b(this.f40879d.f109076b)));
        int i13 = 0;
        while (i13 < this.f40878c.size()) {
            gs.b bVar = this.f40878c.get(i13);
            float f14 = bVar.f69480h;
            float f15 = f14 != -3.4028235E38f ? f14 * 100.0f : 50.0f;
            int iB2 = b(bVar.f69481i);
            float f16 = bVar.f69477e;
            float f17 = f13;
            if (f16 != -3.4028235E38f) {
                if (bVar.f69478f != 1) {
                    String strB3 = p0.B("%.2f%%", Float.valueOf(f16 * 100.0f));
                    iB = bVar.f69488p == 1 ? -b(bVar.f69479g) : b(bVar.f69479g);
                    f11 = -3.4028235E38f;
                    str = strB3;
                    z11 = false;
                } else {
                    f11 = -3.4028235E38f;
                    if (f16 >= BitmapDescriptorFactory.HUE_RED) {
                        strB = p0.B("%.2fem", Float.valueOf(f16 * f17));
                        z11 = false;
                        iB = 0;
                    } else {
                        strB = p0.B("%.2fem", Float.valueOf(((-f16) - 1.0f) * f17));
                        iB = 0;
                        z11 = true;
                    }
                }
                f12 = bVar.f69482j;
                if (f12 != f11) {
                    strB2 = p0.B("%.2f%%", Float.valueOf(f12 * 100.0f));
                } else {
                    strB2 = "fit-content";
                }
                String str6 = strB2;
                String strC = c(bVar.f69474b);
                String strF = f(bVar.f69488p);
                String strE = e(bVar.f69486n, bVar.f69487o);
                if (bVar.f69484l) {
                    i11 = bVar.f69485m;
                } else {
                    i11 = this.f40879d.f109077c;
                }
                String strB4 = c.b(i11);
                i12 = bVar.f69488p;
                str2 = "right";
                if (i12 != 1) {
                    if (z11) {
                        str2 = "left";
                    }
                    str3 = str2;
                    obj = "top";
                } else if (i12 != 2) {
                    str3 = z11 ? "bottom" : "top";
                    obj = "left";
                } else {
                    if (!z11) {
                        str2 = "left";
                    }
                    str3 = str2;
                    obj = "top";
                }
                if (i12 != 2 || i12 == 1) {
                    str4 = Snapshot.HEIGHT;
                    int i14 = iB;
                    iB = iB2;
                    iB2 = i14;
                } else {
                    str4 = Snapshot.WIDTH;
                }
                String str7 = str4;
                bVarA = d.a(bVar.f69473a, getContext().getResources().getDisplayMetrics().density);
                for (String str8 : map.keySet()) {
                    str5 = (String) map.put(str8, (String) map.get(str8));
                    if (str5 != null || str5.equals(map.get(str8))) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    ts.a.g(z12);
                }
                sb2.append(p0.B("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i13), obj, Float.valueOf(f15), str3, str, str7, str6, strC, strF, strE, strB4, Integer.valueOf(iB2), Integer.valueOf(iB), h(bVar)));
                sb2.append(p0.B("<span class='%s'>", "default_bg"));
                alignment = bVar.f69475c;
                if (alignment != null) {
                    sb2.append(p0.B("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                    sb2.append(bVarA.f40866a);
                    sb2.append("</span>");
                } else {
                    sb2.append(bVarA.f40866a);
                }
                sb2.append("</span>");
                sb2.append("</div>");
                i13++;
                f13 = f17;
            } else {
                f11 = -3.4028235E38f;
                strB = p0.B("%.2f%%", Float.valueOf((1.0f - this.f40882g) * 100.0f));
                iB = -100;
                z11 = false;
            }
            str = strB;
            f12 = bVar.f69482j;
            if (f12 != f11) {
                strB2 = p0.B("%.2f%%", Float.valueOf(f12 * 100.0f));
            } else {
                strB2 = "fit-content";
            }
            String str9 = strB2;
            String strC2 = c(bVar.f69474b);
            String strF2 = f(bVar.f69488p);
            String strE2 = e(bVar.f69486n, bVar.f69487o);
            if (bVar.f69484l) {
                i11 = bVar.f69485m;
            } else {
                i11 = this.f40879d.f109077c;
            }
            String strB5 = c.b(i11);
            i12 = bVar.f69488p;
            str2 = "right";
            if (i12 != 1) {
                if (z11) {
                    str2 = "left";
                }
                str3 = str2;
                obj = "top";
            } else if (i12 != 2) {
                str3 = z11 ? "bottom" : "top";
                obj = "left";
            } else {
                if (!z11) {
                    str2 = "left";
                }
                str3 = str2;
                obj = "top";
            }
            if (i12 != 2) {
                str4 = Snapshot.HEIGHT;
                int i15 = iB;
                iB = iB2;
                iB2 = i15;
            } else {
                str4 = Snapshot.HEIGHT;
                int i16 = iB;
                iB = iB2;
                iB2 = i16;
            }
            String str10 = str4;
            bVarA = d.a(bVar.f69473a, getContext().getResources().getDisplayMetrics().density);
            while (r10.hasNext()) {
                str5 = (String) map.put(str8, (String) map.get(str8));
                if (str5 != null) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                ts.a.g(z12);
            }
            sb2.append(p0.B("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i13), obj, Float.valueOf(f15), str3, str, str10, str9, strC2, strF2, strE2, strB5, Integer.valueOf(iB2), Integer.valueOf(iB), h(bVar)));
            sb2.append(p0.B("<span class='%s'>", "default_bg"));
            alignment = bVar.f69475c;
            if (alignment != null) {
                sb2.append(p0.B("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                sb2.append(bVarA.f40866a);
                sb2.append("</span>");
            } else {
                sb2.append(bVarA.f40866a);
            }
            sb2.append("</span>");
            sb2.append("</div>");
            i13++;
            f13 = f17;
        }
        sb2.append("</div></body></html>");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("<html><head><style>");
        for (String str11 : map.keySet()) {
            sb3.append(str11);
            sb3.append("{");
            sb3.append((String) map.get(str11));
            sb3.append("}");
        }
        sb3.append("</style></head>");
        sb2.insert(0, sb3.toString());
        this.f40877b.loadData(Base64.encodeToString(sb2.toString().getBytes(ou.e.f100000c), 1), "text/html", "base64");
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<gs.b> list, rs.b bVar, float f11, int i11, float f12) {
        this.f40879d = bVar;
        this.f40880e = f11;
        this.f40881f = i11;
        this.f40882g = f12;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            gs.b bVar2 = list.get(i12);
            if (bVar2.f69476d != null) {
                arrayList.add(bVar2);
            } else {
                arrayList2.add(bVar2);
            }
        }
        if (!this.f40878c.isEmpty() || !arrayList2.isEmpty()) {
            this.f40878c = arrayList2;
            i();
        }
        this.f40876a.a(arrayList, bVar, f11, i11, f12);
        invalidate();
    }

    public void g() {
        this.f40877b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (!z11 || this.f40878c.isEmpty()) {
            return;
        }
        i();
    }

    public f0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40878c = Collections.EMPTY_LIST;
        this.f40879d = rs.b.f109074g;
        this.f40880e = 0.0533f;
        this.f40881f = 0;
        this.f40882g = 0.08f;
        com.google.android.exoplayer2.ui.a aVar = new com.google.android.exoplayer2.ui.a(context, attributeSet);
        this.f40876a = aVar;
        a aVar2 = new a(context, attributeSet);
        this.f40877b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}
