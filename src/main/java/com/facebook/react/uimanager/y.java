package com.facebook.react.uimanager;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public class y extends s6.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final HashMap<String, Integer> f23422u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static int f23423v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f23424w;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final View f23425q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Handler f23426r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashMap<Integer, String> f23427s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    View f23428t;

    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ((View) message.obj).sendAccessibilityEvent(4);
        }
    }

    class b extends com.facebook.react.uimanager.events.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WritableMap f23430a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i11, int i12, WritableMap writableMap) {
            super(i11, i12);
            this.f23430a = writableMap;
        }

        @Override // com.facebook.react.uimanager.events.d
        /* JADX INFO: renamed from: getEventData */
        protected WritableMap getData() {
            return this.f23430a;
        }

        @Override // com.facebook.react.uimanager.events.d
        public String getEventName() {
            return "topAccessibilityAction";
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f23432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f23433b;

        static {
            int[] iArr = new int[e.values().length];
            f23433b = iArr;
            try {
                iArr[e.ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23433b[e.BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f23433b[e.CHECKBOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f23433b[e.COMBOBOX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f23433b[e.GRID.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f23433b[e.HEADING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f23433b[e.IMG.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f23433b[e.LINK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f23433b[e.LIST.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f23433b[e.MENU.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f23433b[e.MENUBAR.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f23433b[e.MENUITEM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f23433b[e.NONE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f23433b[e.PROGRESSBAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f23433b[e.RADIO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f23433b[e.RADIOGROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f23433b[e.SCROLLBAR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f23433b[e.SEARCHBOX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f23433b[e.SLIDER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f23433b[e.SPINBUTTON.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f23433b[e.SUMMARY.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f23433b[e.SWITCH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f23433b[e.TAB.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f23433b[e.TABLIST.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f23433b[e.TIMER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f23433b[e.TOOLBAR.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr2 = new int[d.values().length];
            f23432a = iArr2;
            try {
                iArr2[d.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f23432a[d.DROPDOWNLIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f23432a[d.TOGGLEBUTTON.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f23432a[d.SEARCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f23432a[d.IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f23432a[d.IMAGEBUTTON.ordinal()] = 6;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f23432a[d.KEYBOARDKEY.ordinal()] = 7;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f23432a[d.TEXT.ordinal()] = 8;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f23432a[d.ADJUSTABLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f23432a[d.CHECKBOX.ordinal()] = 10;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f23432a[d.RADIO.ordinal()] = 11;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f23432a[d.SPINBUTTON.ordinal()] = 12;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f23432a[d.SWITCH.ordinal()] = 13;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f23432a[d.LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f23432a[d.GRID.ordinal()] = 15;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f23432a[d.SCROLLVIEW.ordinal()] = 16;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f23432a[d.HORIZONTALSCROLLVIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f23432a[d.PAGER.ordinal()] = 18;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f23432a[d.DRAWERLAYOUT.ordinal()] = 19;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f23432a[d.SLIDINGDRAWER.ordinal()] = 20;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f23432a[d.ICONMENU.ordinal()] = 21;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f23432a[d.VIEWGROUP.ordinal()] = 22;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f23432a[d.WEBVIEW.ordinal()] = 23;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f23432a[d.NONE.ordinal()] = 24;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f23432a[d.LINK.ordinal()] = 25;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f23432a[d.SUMMARY.ordinal()] = 26;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f23432a[d.HEADER.ordinal()] = 27;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f23432a[d.ALERT.ordinal()] = 28;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f23432a[d.COMBOBOX.ordinal()] = 29;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f23432a[d.MENU.ordinal()] = 30;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f23432a[d.MENUBAR.ordinal()] = 31;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f23432a[d.MENUITEM.ordinal()] = 32;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f23432a[d.PROGRESSBAR.ordinal()] = 33;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f23432a[d.RADIOGROUP.ordinal()] = 34;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f23432a[d.SCROLLBAR.ordinal()] = 35;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f23432a[d.TAB.ordinal()] = 36;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f23432a[d.TABLIST.ordinal()] = 37;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f23432a[d.TIMER.ordinal()] = 38;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f23432a[d.TOOLBAR.ordinal()] = 39;
            } catch (NoSuchFieldError unused65) {
            }
        }
    }

    public enum d {
        NONE,
        BUTTON,
        DROPDOWNLIST,
        TOGGLEBUTTON,
        LINK,
        SEARCH,
        IMAGE,
        IMAGEBUTTON,
        KEYBOARDKEY,
        TEXT,
        ADJUSTABLE,
        SUMMARY,
        HEADER,
        ALERT,
        CHECKBOX,
        COMBOBOX,
        MENU,
        MENUBAR,
        MENUITEM,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        SCROLLBAR,
        SPINBUTTON,
        SWITCH,
        TAB,
        TABLIST,
        TIMER,
        LIST,
        GRID,
        PAGER,
        SCROLLVIEW,
        HORIZONTALSCROLLVIEW,
        VIEWGROUP,
        WEBVIEW,
        DRAWERLAYOUT,
        SLIDINGDRAWER,
        ICONMENU,
        TOOLBAR;

        public static d fromRole(e eVar) {
            switch (c.f23433b[eVar.ordinal()]) {
                case 1:
                    return ALERT;
                case 2:
                    return BUTTON;
                case 3:
                    return CHECKBOX;
                case 4:
                    return COMBOBOX;
                case 5:
                    return GRID;
                case 6:
                    return HEADER;
                case 7:
                    return IMAGE;
                case 8:
                    return LINK;
                case 9:
                    return LIST;
                case 10:
                    return MENU;
                case 11:
                    return MENUBAR;
                case 12:
                    return MENUITEM;
                case 13:
                    return NONE;
                case 14:
                    return PROGRESSBAR;
                case 15:
                    return RADIO;
                case 16:
                    return RADIOGROUP;
                case 17:
                    return SCROLLBAR;
                case 18:
                    return SEARCH;
                case 19:
                    return ADJUSTABLE;
                case 20:
                    return SPINBUTTON;
                case 21:
                    return SUMMARY;
                case 22:
                    return SWITCH;
                case 23:
                    return TAB;
                case 24:
                    return TABLIST;
                case 25:
                    return TIMER;
                case 26:
                    return TOOLBAR;
                default:
                    return null;
            }
        }

        public static d fromValue(String str) {
            if (str == null) {
                return NONE;
            }
            for (d dVar : values()) {
                if (dVar.name().equalsIgnoreCase(str)) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Invalid accessibility role value: " + str);
        }

        public static d fromViewTag(View view) {
            e eVar = (e) view.getTag(com.facebook.react.m.D);
            return eVar != null ? fromRole(eVar) : (d) view.getTag(com.facebook.react.m.f22657g);
        }

        public static String getValue(d dVar) {
            switch (c.f23432a[dVar.ordinal()]) {
                case 1:
                    return "android.widget.Button";
                case 2:
                    return "android.widget.Spinner";
                case 3:
                    return "android.widget.ToggleButton";
                case 4:
                    return "android.widget.EditText";
                case 5:
                    return "android.widget.ImageView";
                case 6:
                    return "android.widget.ImageButton";
                case 7:
                    return "android.inputmethodservice.Keyboard$Key";
                case 8:
                    return "android.widget.TextView";
                case 9:
                    return "android.widget.SeekBar";
                case 10:
                    return "android.widget.CheckBox";
                case 11:
                    return "android.widget.RadioButton";
                case 12:
                    return "android.widget.SpinButton";
                case 13:
                    return "android.widget.Switch";
                case 14:
                    return "android.widget.AbsListView";
                case 15:
                    return "android.widget.GridView";
                case 16:
                    return "android.widget.ScrollView";
                case 17:
                    return "android.widget.HorizontalScrollView";
                case 18:
                    return "androidx.viewpager.widget.ViewPager";
                case 19:
                    return "androidx.drawerlayout.widget.DrawerLayout";
                case 20:
                    return "android.widget.SlidingDrawer";
                case 21:
                    return "com.android.internal.view.menu.IconMenuView";
                case 22:
                    return "android.view.ViewGroup";
                case 23:
                    return "android.webkit.WebView";
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                    return "android.view.View";
                default:
                    throw new IllegalArgumentException("Invalid accessibility role value: " + dVar);
            }
        }
    }

    public enum e {
        ALERT,
        ALERTDIALOG,
        APPLICATION,
        ARTICLE,
        BANNER,
        BUTTON,
        CELL,
        CHECKBOX,
        COLUMNHEADER,
        COMBOBOX,
        COMPLEMENTARY,
        CONTENTINFO,
        DEFINITION,
        DIALOG,
        DIRECTORY,
        DOCUMENT,
        FEED,
        FIGURE,
        FORM,
        GRID,
        GROUP,
        HEADING,
        IMG,
        LINK,
        LIST,
        LISTITEM,
        LOG,
        MAIN,
        MARQUEE,
        MATH,
        MENU,
        MENUBAR,
        MENUITEM,
        METER,
        NAVIGATION,
        NONE,
        NOTE,
        OPTION,
        PRESENTATION,
        PROGRESSBAR,
        RADIO,
        RADIOGROUP,
        REGION,
        ROW,
        ROWGROUP,
        ROWHEADER,
        SCROLLBAR,
        SEARCHBOX,
        SEPARATOR,
        SLIDER,
        SPINBUTTON,
        STATUS,
        SUMMARY,
        SWITCH,
        TAB,
        TABLE,
        TABLIST,
        TABPANEL,
        TERM,
        TIMER,
        TOOLBAR,
        TOOLTIP,
        TREE,
        TREEGRID,
        TREEITEM;

        public static e fromValue(String str) {
            for (e eVar : values()) {
                if (eVar.name().equalsIgnoreCase(str)) {
                    return eVar;
                }
            }
            return null;
        }
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        f23422u = map;
        f23423v = 1056964608;
        f23424w = 2;
        map.put("activate", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7746i.b()));
        map.put("longpress", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7747j.b()));
        map.put("increment", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7754q.b()));
        map.put("decrement", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7755r.b()));
        map.put("expand", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7760w.b()));
        map.put("collapse", Integer.valueOf(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7761x.b()));
    }

    public y(View view, boolean z11, int i11) {
        super(view);
        this.f23425q = view;
        this.f23427s = new HashMap<>();
        this.f23426r = new a();
        view.setFocusable(z11);
        ViewCompat.z0(view, i11);
    }

    public static AccessibilityNodeInfoCompat W(View view) {
        if (view == null) {
            return null;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatF0 = AccessibilityNodeInfoCompat.f0();
        try {
            ViewCompat.c0(view, accessibilityNodeInfoCompatF0);
            return accessibilityNodeInfoCompatF0;
        } catch (NullPointerException unused) {
            if (accessibilityNodeInfoCompatF0 != null) {
                accessibilityNodeInfoCompatF0.j0();
            }
            return null;
        }
    }

    public static CharSequence Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompatW = accessibilityNodeInfoCompat == null ? W(view) : AccessibilityNodeInfoCompat.h0(accessibilityNodeInfoCompat);
        if (accessibilityNodeInfoCompatW == null) {
            return null;
        }
        try {
            CharSequence charSequenceU = accessibilityNodeInfoCompatW.u();
            CharSequence charSequenceF = accessibilityNodeInfoCompatW.F();
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceF);
            boolean z11 = view instanceof EditText;
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(charSequenceU) && (!z11 || zIsEmpty)) {
                sb2.append(charSequenceU);
                return sb2;
            }
            if (!zIsEmpty) {
                sb2.append(charSequenceF);
                return sb2;
            }
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatF0 = AccessibilityNodeInfoCompat.f0();
                ViewCompat.c0(childAt, accessibilityNodeInfoCompatF0);
                if (f0(accessibilityNodeInfoCompatF0, childAt) && !d0(accessibilityNodeInfoCompatF0, childAt)) {
                    CharSequence charSequenceY = Y(childAt, null);
                    if (!TextUtils.isEmpty(charSequenceY)) {
                        sb3.append(((Object) charSequenceY) + ", ");
                    }
                }
                accessibilityNodeInfoCompatF0.j0();
            }
            return g0(sb3);
        } finally {
            accessibilityNodeInfoCompatW.j0();
        }
    }

    public static boolean Z(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = viewGroup.getChildAt(i11);
                if (childAt != null) {
                    AccessibilityNodeInfoCompat accessibilityNodeInfoCompatF0 = AccessibilityNodeInfoCompat.f0();
                    try {
                        ViewCompat.c0(childAt, accessibilityNodeInfoCompatF0);
                        if (accessibilityNodeInfoCompatF0.e0() && !d0(accessibilityNodeInfoCompatF0, childAt) && f0(accessibilityNodeInfoCompatF0, childAt)) {
                            return true;
                        }
                        accessibilityNodeInfoCompatF0.j0();
                    } finally {
                        if (accessibilityNodeInfoCompatF0 != null) {
                            accessibilityNodeInfoCompatF0.j0();
                        }
                    }
                }
            }
        }
        return false;
    }

    private static boolean a0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat != null) {
            return !TextUtils.isEmpty(accessibilityNodeInfoCompat.E()) || accessibilityNodeInfoCompat.N() || c0(accessibilityNodeInfoCompat);
        }
        return false;
    }

    public static boolean b0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null || accessibilityNodeInfoCompat.s() != null) {
            return false;
        }
        return (TextUtils.isEmpty(accessibilityNodeInfoCompat.F()) && TextUtils.isEmpty(accessibilityNodeInfoCompat.u()) && TextUtils.isEmpty(accessibilityNodeInfoCompat.x())) ? false : true;
    }

    public static boolean c0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        AccessibilityNodeInfoCompat.f fVarC;
        if (accessibilityNodeInfoCompat == null || (fVarC = accessibilityNodeInfoCompat.C()) == null) {
            return false;
        }
        float fB = fVarC.b();
        float fC = fVarC.c();
        float fA = fVarC.a();
        return fB - fC > BitmapDescriptorFactory.HUE_RED && fA >= fC && fA <= fB;
    }

    public static boolean d0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        if (accessibilityNodeInfoCompat == null || view == null || !accessibilityNodeInfoCompat.e0()) {
            return false;
        }
        return accessibilityNodeInfoCompat.Z() || e0(accessibilityNodeInfoCompat);
    }

    public static boolean e0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (accessibilityNodeInfoCompat == null) {
            return false;
        }
        if (!accessibilityNodeInfoCompat.P() && !accessibilityNodeInfoCompat.X() && !accessibilityNodeInfoCompat.T()) {
            List<AccessibilityNodeInfoCompat.AccessibilityActionCompat> listI = accessibilityNodeInfoCompat.i();
            if (!listI.contains(16) && !listI.contains(32) && !listI.contains(1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean f0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, View view) {
        int iY;
        if (accessibilityNodeInfoCompat == null || view == null || (iY = ViewCompat.y(view)) == 4 || (iY == 2 && accessibilityNodeInfoCompat.p() <= 0)) {
            return false;
        }
        return b0(accessibilityNodeInfoCompat) || a0(accessibilityNodeInfoCompat) || accessibilityNodeInfoCompat.N() || Z(accessibilityNodeInfoCompat, view);
    }

    private static String g0(StringBuilder sb2) {
        int length = sb2.length();
        if (length > 0) {
            sb2.delete(length - f23424w, length);
        }
        return sb2.toString();
    }

    private void h0(View view) {
        if (this.f23426r.hasMessages(1, view)) {
            this.f23426r.removeMessages(1, view);
        }
        this.f23426r.sendMessageDelayed(this.f23426r.obtainMessage(1, view), 200L);
    }

    public static void i0(View view, boolean z11, int i11) {
        if (ViewCompat.O(view)) {
            return;
        }
        if (view.getTag(com.facebook.react.m.f22657g) == null && view.getTag(com.facebook.react.m.f22658h) == null && view.getTag(com.facebook.react.m.f22651a) == null && view.getTag(com.facebook.react.m.f22670t) == null && view.getTag(com.facebook.react.m.f22653c) == null && view.getTag(com.facebook.react.m.f22656f) == null && view.getTag(com.facebook.react.m.D) == null) {
            return;
        }
        ViewCompat.p0(view, new y(view, z11, i11));
    }

    public static void j0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, d dVar, Context context) {
        if (dVar == null) {
            dVar = d.NONE;
        }
        accessibilityNodeInfoCompat.t0(d.getValue(dVar));
        if (dVar.equals(d.LINK)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.f22907w));
            return;
        }
        if (dVar.equals(d.IMAGE)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.f22905u));
            return;
        }
        if (dVar.equals(d.IMAGEBUTTON)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.f22906v));
            accessibilityNodeInfoCompat.u0(true);
            return;
        }
        if (dVar.equals(d.BUTTON)) {
            accessibilityNodeInfoCompat.u0(true);
            return;
        }
        if (dVar.equals(d.TOGGLEBUTTON)) {
            accessibilityNodeInfoCompat.u0(true);
            accessibilityNodeInfoCompat.r0(true);
            return;
        }
        if (dVar.equals(d.SUMMARY)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.I));
            return;
        }
        if (dVar.equals(d.HEADER)) {
            accessibilityNodeInfoCompat.G0(true);
            return;
        }
        if (dVar.equals(d.ALERT)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.f22885a));
            return;
        }
        if (dVar.equals(d.COMBOBOX)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.f22904t));
            return;
        }
        if (dVar.equals(d.MENU)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.f22908x));
            return;
        }
        if (dVar.equals(d.MENUBAR)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.f22909y));
            return;
        }
        if (dVar.equals(d.MENUITEM)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.f22910z));
            return;
        }
        if (dVar.equals(d.PROGRESSBAR)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.A));
            return;
        }
        if (dVar.equals(d.RADIOGROUP)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.B));
            return;
        }
        if (dVar.equals(d.SCROLLBAR)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.D));
            return;
        }
        if (dVar.equals(d.SPINBUTTON)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.E));
            return;
        }
        if (dVar.equals(d.TAB)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.C));
            return;
        }
        if (dVar.equals(d.TABLIST)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.J));
        } else if (dVar.equals(d.TIMER)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.K));
        } else if (dVar.equals(d.TOOLBAR)) {
            accessibilityNodeInfoCompat.V0(context.getString(com.facebook.react.p.L));
        }
    }

    private static void k0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ReadableMap readableMap, Context context) {
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            Dynamic dynamic = readableMap.getDynamic(strNextKey);
            if (strNextKey.equals("selected") && dynamic.getType() == ReadableType.Boolean) {
                accessibilityNodeInfoCompat.Y0(dynamic.asBoolean());
            } else if (strNextKey.equals("disabled") && dynamic.getType() == ReadableType.Boolean) {
                accessibilityNodeInfoCompat.B0(!dynamic.asBoolean());
            } else if (strNextKey.equals("checked") && dynamic.getType() == ReadableType.Boolean) {
                boolean zAsBoolean = dynamic.asBoolean();
                accessibilityNodeInfoCompat.r0(true);
                accessibilityNodeInfoCompat.s0(zAsBoolean);
            }
        }
    }

    @Override // s6.a
    protected int B(float f11, float f12) {
        return Integer.MIN_VALUE;
    }

    @Override // s6.a
    protected void C(List<Integer> list) {
    }

    @Override // s6.a
    protected boolean J(int i11, int i12, Bundle bundle) {
        return false;
    }

    @Override // s6.a
    protected void N(int i11, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        accessibilityNodeInfoCompat.x0("");
        accessibilityNodeInfoCompat.p0(new Rect(0, 0, 1, 1));
    }

    protected View X() {
        return this.f23425q;
    }

    @Override // s6.a, androidx.core.view.a
    public AccessibilityNodeProviderCompat b(View view) {
        return null;
    }

    @Override // s6.a, androidx.core.view.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        ReadableMap readableMap = (ReadableMap) view.getTag(com.facebook.react.m.f22660j);
        if (readableMap != null && readableMap.hasKey("min") && readableMap.hasKey("now") && readableMap.hasKey("max")) {
            Dynamic dynamic = readableMap.getDynamic("min");
            Dynamic dynamic2 = readableMap.getDynamic("now");
            Dynamic dynamic3 = readableMap.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 <= iAsInt || iAsInt2 < iAsInt || iAsInt3 < iAsInt2) {
                        return;
                    }
                    accessibilityEvent.setItemCount(iAsInt3 - iAsInt);
                    accessibilityEvent.setCurrentItemIndex(iAsInt2);
                }
            }
        }
    }

    @Override // s6.a, androidx.core.view.a
    public void g(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.g(view, accessibilityNodeInfoCompat);
        if (view.getTag(com.facebook.react.m.f22659i) != null) {
            accessibilityNodeInfoCompat.a(((Boolean) view.getTag(com.facebook.react.m.f22659i)).booleanValue() ? PKIFailureInfo.signerNotTrusted : 262144);
        }
        d dVarFromViewTag = d.fromViewTag(view);
        String str = (String) view.getTag(com.facebook.react.m.f22654d);
        if (dVarFromViewTag != null) {
            j0(accessibilityNodeInfoCompat, dVarFromViewTag, view.getContext());
        }
        if (str != null) {
            accessibilityNodeInfoCompat.f1(str);
        }
        Object tag = view.getTag(com.facebook.react.m.f22667q);
        if (tag != null) {
            View viewA = to.a.a(view.getRootView(), (String) tag);
            this.f23428t = viewA;
            if (viewA != null) {
                accessibilityNodeInfoCompat.K0(viewA);
            }
        }
        ReadableMap readableMap = (ReadableMap) view.getTag(com.facebook.react.m.f22658h);
        if (readableMap != null) {
            k0(accessibilityNodeInfoCompat, readableMap, view.getContext());
        }
        ReadableArray readableArray = (ReadableArray) view.getTag(com.facebook.react.m.f22651a);
        ReadableMap readableMap2 = (ReadableMap) view.getTag(com.facebook.react.m.f22653c);
        if (readableMap2 != null) {
            accessibilityNodeInfoCompat.w0(AccessibilityNodeInfoCompat.e.a(readableMap2.getInt("rowIndex"), readableMap2.getInt("rowSpan"), readableMap2.getInt("columnIndex"), readableMap2.getInt("columnSpan"), readableMap2.getBoolean("heading")));
        }
        boolean z11 = true;
        if (readableArray != null) {
            for (int i11 = 0; i11 < readableArray.size(); i11++) {
                ReadableMap map = readableArray.getMap(i11);
                if (!map.hasKey("name")) {
                    throw new IllegalArgumentException("Unknown accessibility action.");
                }
                int iIntValue = f23423v;
                String string = map.hasKey(AnnotatedPrivateKey.LABEL) ? map.getString(AnnotatedPrivateKey.LABEL) : null;
                HashMap<String, Integer> map2 = f23422u;
                if (map2.containsKey(map.getString("name"))) {
                    iIntValue = map2.get(map.getString("name")).intValue();
                } else {
                    f23423v++;
                }
                this.f23427s.put(Integer.valueOf(iIntValue), map.getString("name"));
                accessibilityNodeInfoCompat.b(new AccessibilityNodeInfoCompat.AccessibilityActionCompat(iIntValue, string));
            }
        }
        ReadableMap readableMap3 = (ReadableMap) view.getTag(com.facebook.react.m.f22660j);
        if (readableMap3 != null && readableMap3.hasKey("min") && readableMap3.hasKey("now") && readableMap3.hasKey("max")) {
            Dynamic dynamic = readableMap3.getDynamic("min");
            Dynamic dynamic2 = readableMap3.getDynamic("now");
            Dynamic dynamic3 = readableMap3.getDynamic("max");
            if (dynamic != null) {
                ReadableType type = dynamic.getType();
                ReadableType readableType = ReadableType.Number;
                if (type == readableType && dynamic2 != null && dynamic2.getType() == readableType && dynamic3 != null && dynamic3.getType() == readableType) {
                    int iAsInt = dynamic.asInt();
                    int iAsInt2 = dynamic2.asInt();
                    int iAsInt3 = dynamic3.asInt();
                    if (iAsInt3 > iAsInt && iAsInt2 >= iAsInt && iAsInt3 >= iAsInt2) {
                        accessibilityNodeInfoCompat.U0(AccessibilityNodeInfoCompat.f.d(0, iAsInt, iAsInt3, iAsInt2));
                    }
                }
            }
        }
        String str2 = (String) view.getTag(com.facebook.react.m.f22670t);
        if (str2 != null) {
            accessibilityNodeInfoCompat.k1(str2);
        }
        boolean z12 = TextUtils.isEmpty(accessibilityNodeInfoCompat.u()) && TextUtils.isEmpty(accessibilityNodeInfoCompat.F());
        if (readableArray == null && readableMap == null && tag == null && dVarFromViewTag == null) {
            z11 = false;
        }
        if (z12 && z11) {
            accessibilityNodeInfoCompat.x0(Y(view, accessibilityNodeInfoCompat));
        }
    }

    @Override // androidx.core.view.a
    public boolean j(View view, int i11, Bundle bundle) {
        if (i11 == 524288) {
            view.setTag(com.facebook.react.m.f22659i, Boolean.FALSE);
        }
        if (i11 == 262144) {
            view.setTag(com.facebook.react.m.f22659i, Boolean.TRUE);
        }
        if (!this.f23427s.containsKey(Integer.valueOf(i11))) {
            return super.j(view, i11, bundle);
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("actionName", this.f23427s.get(Integer.valueOf(i11)));
        ReactContext reactContext = (ReactContext) view.getContext();
        if (reactContext.hasActiveReactInstance()) {
            int id2 = view.getId();
            int iE = b1.e(reactContext);
            UIManager uIManagerG = b1.g(reactContext, oo.a.a(id2));
            if (uIManagerG != null) {
                uIManagerG.getEventDispatcher().h(new b(iE, id2, writableMapCreateMap));
            }
        } else {
            ReactSoftExceptionLogger.logSoftException("ReactAccessibilityDelegate", new ReactNoCrashSoftException("Cannot get RCTEventEmitter, no CatalystInstance"));
        }
        d dVar = (d) view.getTag(com.facebook.react.m.f22657g);
        ReadableMap readableMap = (ReadableMap) view.getTag(com.facebook.react.m.f22660j);
        if (dVar != d.ADJUSTABLE) {
            return true;
        }
        if (i11 != AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7754q.b() && i11 != AccessibilityNodeInfoCompat.AccessibilityActionCompat.f7755r.b()) {
            return true;
        }
        if (readableMap != null && !readableMap.hasKey("text")) {
            h0(view);
        }
        return super.j(view, i11, bundle);
    }

    public AccessibilityNodeProviderCompat l0(View view) {
        return super.b(view);
    }
}
