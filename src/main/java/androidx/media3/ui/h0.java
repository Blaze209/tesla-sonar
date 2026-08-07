package androidx.media3.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import s7.q0;

/* JADX INFO: loaded from: classes3.dex */
final class h0 extends FrameLayout implements SubtitleView.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.media3.ui.a f12919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f12920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<r7.a> f12921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ia.a f12922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f12923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f12924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f12925g;

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
        static final /* synthetic */ int[] f12927a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f12927a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12927a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12927a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public h0(Context context) {
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
        int i11 = b.f12927a[alignment.ordinal()];
        if (i11 != 1) {
            return i11 != 2 ? "center" : "end";
        }
        return "start";
    }

    private static String d(ia.a aVar) {
        int i11 = aVar.f77182d;
        if (i11 == 1) {
            return q0.J("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", androidx.media3.ui.b.b(aVar.f77183e));
        }
        if (i11 == 2) {
            return q0.J("0.1em 0.12em 0.15em %s", androidx.media3.ui.b.b(aVar.f77183e));
        }
        if (i11 != 3) {
            return i11 != 4 ? "unset" : q0.J("-0.05em -0.05em 0.15em %s", androidx.media3.ui.b.b(aVar.f77183e));
        }
        return q0.J("0.06em 0.08em 0.15em %s", androidx.media3.ui.b.b(aVar.f77183e));
    }

    private String e(int i11, float f11) {
        float f12 = f0.f(i11, f11, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return f12 == -3.4028235E38f ? "unset" : q0.J("%.2fpx", Float.valueOf(f12 / getContext().getResources().getDisplayMetrics().density));
    }

    private static String f(int i11) {
        if (i11 != 1) {
            return i11 != 2 ? "horizontal-tb" : "vertical-lr";
        }
        return "vertical-rl";
    }

    private static String h(r7.a aVar) {
        float f11 = aVar.f107082q;
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            return "";
        }
        int i11 = aVar.f107081p;
        return q0.J("%s(%.2fdeg)", (i11 == 2 || i11 == 1) ? "skewY" : "skewX", Float.valueOf(f11));
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
        String strJ;
        int iB;
        boolean z11;
        String str;
        float f12;
        String strJ2;
        int i11;
        int i12;
        String str2;
        String str3;
        Object obj;
        String str4;
        z.b bVarA;
        Layout.Alignment alignment;
        String str5;
        boolean z12;
        StringBuilder sb2 = new StringBuilder();
        float f13 = 1.2f;
        sb2.append(q0.J("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", androidx.media3.ui.b.b(this.f12922d.f77179a), e(this.f12924f, this.f12923e), Float.valueOf(1.2f), d(this.f12922d)));
        HashMap map = new HashMap();
        map.put(androidx.media3.ui.b.a("default_bg"), q0.J("background-color:%s;", androidx.media3.ui.b.b(this.f12922d.f77180b)));
        int i13 = 0;
        while (i13 < this.f12921c.size()) {
            r7.a aVar = this.f12921c.get(i13);
            float f14 = aVar.f107073h;
            float f15 = f14 != -3.4028235E38f ? f14 * 100.0f : 50.0f;
            int iB2 = b(aVar.f107074i);
            float f16 = aVar.f107070e;
            float f17 = f13;
            if (f16 != -3.4028235E38f) {
                if (aVar.f107071f != 1) {
                    String strJ3 = q0.J("%.2f%%", Float.valueOf(f16 * 100.0f));
                    iB = aVar.f107081p == 1 ? -b(aVar.f107072g) : b(aVar.f107072g);
                    f11 = -3.4028235E38f;
                    str = strJ3;
                    z11 = false;
                } else {
                    f11 = -3.4028235E38f;
                    if (f16 >= BitmapDescriptorFactory.HUE_RED) {
                        strJ = q0.J("%.2fem", Float.valueOf(f16 * f17));
                        z11 = false;
                        iB = 0;
                    } else {
                        strJ = q0.J("%.2fem", Float.valueOf(((-f16) - 1.0f) * f17));
                        iB = 0;
                        z11 = true;
                    }
                }
                f12 = aVar.f107075j;
                if (f12 != f11) {
                    strJ2 = q0.J("%.2f%%", Float.valueOf(f12 * 100.0f));
                } else {
                    strJ2 = "fit-content";
                }
                String str6 = strJ2;
                String strC = c(aVar.f107067b);
                String strF = f(aVar.f107081p);
                String strE = e(aVar.f107079n, aVar.f107080o);
                if (aVar.f107077l) {
                    i11 = aVar.f107078m;
                } else {
                    i11 = this.f12922d.f77181c;
                }
                String strB = androidx.media3.ui.b.b(i11);
                i12 = aVar.f107081p;
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
                bVarA = z.a(aVar.f107066a, getContext().getResources().getDisplayMetrics().density);
                for (String str8 : map.keySet()) {
                    str5 = (String) map.put(str8, (String) map.get(str8));
                    if (str5 != null || str5.equals(map.get(str8))) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    s7.a.h(z12);
                }
                sb2.append(q0.J("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i13), obj, Float.valueOf(f15), str3, str, str7, str6, strC, strF, strE, strB, Integer.valueOf(iB2), Integer.valueOf(iB), h(aVar)));
                sb2.append(q0.J("<span class='%s'>", "default_bg"));
                alignment = aVar.f107068c;
                if (alignment != null) {
                    sb2.append(q0.J("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                    sb2.append(bVarA.f12987a);
                    sb2.append("</span>");
                } else {
                    sb2.append(bVarA.f12987a);
                }
                sb2.append("</span>");
                sb2.append("</div>");
                i13++;
                f13 = f17;
            } else {
                f11 = -3.4028235E38f;
                strJ = q0.J("%.2f%%", Float.valueOf((1.0f - this.f12925g) * 100.0f));
                iB = -100;
                z11 = false;
            }
            str = strJ;
            f12 = aVar.f107075j;
            if (f12 != f11) {
                strJ2 = q0.J("%.2f%%", Float.valueOf(f12 * 100.0f));
            } else {
                strJ2 = "fit-content";
            }
            String str9 = strJ2;
            String strC2 = c(aVar.f107067b);
            String strF2 = f(aVar.f107081p);
            String strE2 = e(aVar.f107079n, aVar.f107080o);
            if (aVar.f107077l) {
                i11 = aVar.f107078m;
            } else {
                i11 = this.f12922d.f77181c;
            }
            String strB2 = androidx.media3.ui.b.b(i11);
            i12 = aVar.f107081p;
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
            bVarA = z.a(aVar.f107066a, getContext().getResources().getDisplayMetrics().density);
            while (r10.hasNext()) {
                str5 = (String) map.put(str8, (String) map.get(str8));
                if (str5 != null) {
                    z12 = true;
                } else {
                    z12 = true;
                }
                s7.a.h(z12);
            }
            sb2.append(q0.J("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", Integer.valueOf(i13), obj, Float.valueOf(f15), str3, str, str10, str9, strC2, strF2, strE2, strB2, Integer.valueOf(iB2), Integer.valueOf(iB), h(aVar)));
            sb2.append(q0.J("<span class='%s'>", "default_bg"));
            alignment = aVar.f107068c;
            if (alignment != null) {
                sb2.append(q0.J("<span style='display:inline-block; text-align:%s;'>", c(alignment)));
                sb2.append(bVarA.f12987a);
                sb2.append("</span>");
            } else {
                sb2.append(bVarA.f12987a);
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
        sb2.insert(0, (CharSequence) sb3);
        this.f12920b.loadData(Base64.encodeToString(sb2.toString().getBytes(StandardCharsets.UTF_8), 1), "text/html", "base64");
    }

    @Override // androidx.media3.ui.SubtitleView.a
    public void a(List<r7.a> list, ia.a aVar, float f11, int i11, float f12) {
        this.f12922d = aVar;
        this.f12923e = f11;
        this.f12924f = i11;
        this.f12925g = f12;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < list.size(); i12++) {
            r7.a aVar2 = list.get(i12);
            if (aVar2.f107069d != null) {
                arrayList.add(aVar2);
            } else {
                arrayList2.add(aVar2);
            }
        }
        if (!this.f12921c.isEmpty() || !arrayList2.isEmpty()) {
            this.f12921c = arrayList2;
            i();
        }
        this.f12919a.a(arrayList, aVar, f11, i11, f12);
        invalidate();
    }

    public void g() {
        this.f12920b.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (!z11 || this.f12921c.isEmpty()) {
            return;
        }
        i();
    }

    public h0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12921c = Collections.EMPTY_LIST;
        this.f12922d = ia.a.f77178g;
        this.f12923e = 0.0533f;
        this.f12924f = 0;
        this.f12925g = 0.08f;
        androidx.media3.ui.a aVar = new androidx.media3.ui.a(context, attributeSet);
        this.f12919a = aVar;
        a aVar2 = new a(context, attributeSet);
        this.f12920b = aVar2;
        aVar2.setBackgroundColor(0);
        addView(aVar);
        addView(aVar2);
    }
}
