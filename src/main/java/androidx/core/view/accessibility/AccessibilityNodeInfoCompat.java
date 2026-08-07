package androidx.core.view.accessibility;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.adyen.checkout.components.core.Address;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public class AccessibilityNodeInfoCompat {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f7738d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f7739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7740b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7741c = -1;

    public static class AccessibilityActionCompat {
        public static final AccessibilityActionCompat A;
        public static final AccessibilityActionCompat B;
        public static final AccessibilityActionCompat C;
        public static final AccessibilityActionCompat D;
        public static final AccessibilityActionCompat E;
        public static final AccessibilityActionCompat F;
        public static final AccessibilityActionCompat G;
        public static final AccessibilityActionCompat H;
        public static final AccessibilityActionCompat I;
        public static final AccessibilityActionCompat J;
        public static final AccessibilityActionCompat K;
        public static final AccessibilityActionCompat L;
        public static final AccessibilityActionCompat M;
        public static final AccessibilityActionCompat N;
        public static final AccessibilityActionCompat O;
        public static final AccessibilityActionCompat P;
        public static final AccessibilityActionCompat Q;
        public static final AccessibilityActionCompat R;
        public static final AccessibilityActionCompat S;
        public static final AccessibilityActionCompat T;
        public static final AccessibilityActionCompat U;
        public static final AccessibilityActionCompat V;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AccessibilityActionCompat f7742e = new AccessibilityActionCompat(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final AccessibilityActionCompat f7743f = new AccessibilityActionCompat(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final AccessibilityActionCompat f7744g = new AccessibilityActionCompat(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final AccessibilityActionCompat f7745h = new AccessibilityActionCompat(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final AccessibilityActionCompat f7746i = new AccessibilityActionCompat(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final AccessibilityActionCompat f7747j = new AccessibilityActionCompat(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final AccessibilityActionCompat f7748k = new AccessibilityActionCompat(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final AccessibilityActionCompat f7749l = new AccessibilityActionCompat(128, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final AccessibilityActionCompat f7750m = new AccessibilityActionCompat(256, (CharSequence) null, (Class<? extends AccessibilityViewCommand.a>) AccessibilityViewCommand.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final AccessibilityActionCompat f7751n = new AccessibilityActionCompat(512, (CharSequence) null, (Class<? extends AccessibilityViewCommand.a>) AccessibilityViewCommand.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final AccessibilityActionCompat f7752o = new AccessibilityActionCompat(1024, (CharSequence) null, (Class<? extends AccessibilityViewCommand.a>) AccessibilityViewCommand.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final AccessibilityActionCompat f7753p = new AccessibilityActionCompat(2048, (CharSequence) null, (Class<? extends AccessibilityViewCommand.a>) AccessibilityViewCommand.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final AccessibilityActionCompat f7754q = new AccessibilityActionCompat(4096, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final AccessibilityActionCompat f7755r = new AccessibilityActionCompat(PKIFailureInfo.certRevoked, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final AccessibilityActionCompat f7756s = new AccessibilityActionCompat(16384, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final AccessibilityActionCompat f7757t = new AccessibilityActionCompat(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final AccessibilityActionCompat f7758u = new AccessibilityActionCompat(65536, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final AccessibilityActionCompat f7759v = new AccessibilityActionCompat(131072, (CharSequence) null, (Class<? extends AccessibilityViewCommand.a>) AccessibilityViewCommand.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final AccessibilityActionCompat f7760w = new AccessibilityActionCompat(262144, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final AccessibilityActionCompat f7761x = new AccessibilityActionCompat(PKIFailureInfo.signerNotTrusted, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final AccessibilityActionCompat f7762y = new AccessibilityActionCompat(PKIFailureInfo.badCertTemplate, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final AccessibilityActionCompat f7763z = new AccessibilityActionCompat(PKIFailureInfo.badSenderNonce, (CharSequence) null, (Class<? extends AccessibilityViewCommand.a>) AccessibilityViewCommand.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f7764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f7765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class<? extends AccessibilityViewCommand.a> f7766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final AccessibilityViewCommand f7767d;

        static {
            int i11 = Build.VERSION.SDK_INT;
            A = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, AccessibilityViewCommand.e.class);
            C = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
            D = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
            F = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
            G = new AccessibilityActionCompat(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new AccessibilityActionCompat(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new AccessibilityActionCompat(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new AccessibilityActionCompat(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
            L = new AccessibilityActionCompat(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, AccessibilityViewCommand.f.class);
            M = new AccessibilityActionCompat(i11 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, AccessibilityViewCommand.d.class);
            N = new AccessibilityActionCompat(i11 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new AccessibilityActionCompat(i11 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new AccessibilityActionCompat(i11 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new AccessibilityActionCompat(i11 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new AccessibilityActionCompat(i11 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new AccessibilityActionCompat(i11 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new AccessibilityActionCompat(i11 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new AccessibilityActionCompat(i11 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new AccessibilityActionCompat(i11 >= 34 ? c.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public AccessibilityActionCompat(int i11, CharSequence charSequence) {
            this(null, i11, charSequence, null, null);
        }

        public AccessibilityActionCompat a(CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            return new AccessibilityActionCompat(null, this.f7765b, charSequence, accessibilityViewCommand, this.f7766c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f7764a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f7764a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f7767d == null) {
                return false;
            }
            Class<? extends AccessibilityViewCommand.a> cls = this.f7766c;
            AccessibilityViewCommand.a aVar = null;
            if (cls != null) {
                try {
                    AccessibilityViewCommand.a aVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                    try {
                        aVarNewInstance.a(bundle);
                        aVar = aVarNewInstance;
                    } catch (Exception e11) {
                        e = e11;
                        aVar = aVarNewInstance;
                        Class<? extends AccessibilityViewCommand.a> cls2 = this.f7766c;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? Address.ADDRESS_NULL_PLACEHOLDER : cls2.getName()), e);
                    }
                } catch (Exception e12) {
                    e = e12;
                }
            }
            return this.f7767d.a(view, aVar);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof AccessibilityActionCompat)) {
                return false;
            }
            AccessibilityActionCompat accessibilityActionCompat = (AccessibilityActionCompat) obj;
            Object obj2 = this.f7764a;
            if (obj2 == null) {
                return accessibilityActionCompat.f7764a == null;
            }
            return obj2.equals(accessibilityActionCompat.f7764a);
        }

        public int hashCode() {
            Object obj = this.f7764a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strJ = AccessibilityNodeInfoCompat.j(this.f7765b);
            if (strJ.equals("ACTION_UNKNOWN") && c() != null) {
                strJ = c().toString();
            }
            sb2.append(strJ);
            return sb2.toString();
        }

        public AccessibilityActionCompat(int i11, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand) {
            this(null, i11, charSequence, accessibilityViewCommand, null);
        }

        AccessibilityActionCompat(Object obj) {
            this(obj, 0, null, null, null);
        }

        private AccessibilityActionCompat(int i11, CharSequence charSequence, Class<? extends AccessibilityViewCommand.a> cls) {
            this(null, i11, charSequence, null, cls);
        }

        AccessibilityActionCompat(Object obj, int i11, CharSequence charSequence, AccessibilityViewCommand accessibilityViewCommand, Class<? extends AccessibilityViewCommand.a> cls) {
            this.f7765b = i11;
            this.f7767d = accessibilityViewCommand;
            if (obj == null) {
                this.f7764a = new AccessibilityNodeInfo.AccessibilityAction(i11, charSequence);
            } else {
                this.f7764a = obj;
            }
            this.f7766c = cls;
        }
    }

    private static class a {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class b {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    private static class c {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f7768a;

        d(Object obj) {
            this.f7768a = obj;
        }

        public static d a(int i11, int i12, boolean z11) {
            return new d(AccessibilityNodeInfo.CollectionInfo.obtain(i11, i12, z11));
        }

        public static d b(int i11, int i12, boolean z11, int i13) {
            return new d(AccessibilityNodeInfo.CollectionInfo.obtain(i11, i12, z11, i13));
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f7769a;

        e(Object obj) {
            this.f7769a = obj;
        }

        public static e a(int i11, int i12, int i13, int i14, boolean z11) {
            return new e(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, i12, i13, i14, z11));
        }

        public static e b(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
            return new e(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, i12, i13, i14, z11, z12));
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f7770a;

        f(Object obj) {
            this.f7770a = obj;
        }

        public static f d(int i11, float f11, float f12, float f13) {
            return new f(AccessibilityNodeInfo.RangeInfo.obtain(i11, f11, f12, f13));
        }

        public float a() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f7770a).getCurrent();
        }

        public float b() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f7770a).getMax();
        }

        public float c() {
            return ((AccessibilityNodeInfo.RangeInfo) this.f7770a).getMin();
        }
    }

    private AccessibilityNodeInfoCompat(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f7739a = accessibilityNodeInfo;
    }

    private SparseArray<WeakReference<ClickableSpan>> A(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayD = D(view);
        if (sparseArrayD != null) {
            return sparseArrayD;
        }
        SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
        view.setTag(h5.e.I, sparseArray);
        return sparseArray;
    }

    private SparseArray<WeakReference<ClickableSpan>> D(View view) {
        return (SparseArray) view.getTag(h5.e.I);
    }

    private boolean J() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int K(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                if (clickableSpan.equals(sparseArray.valueAt(i11).get())) {
                    return sparseArray.keyAt(i11);
                }
            }
        }
        int i12 = f7738d;
        f7738d = i12 + 1;
        return i12;
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i11) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i11));
    }

    public static AccessibilityNodeInfoCompat f0() {
        return n1(AccessibilityNodeInfo.obtain());
    }

    private void g() {
        this.f7739a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f7739a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f7739a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f7739a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public static AccessibilityNodeInfoCompat g0(View view) {
        return n1(AccessibilityNodeInfo.obtain(view));
    }

    private List<Integer> h(String str) {
        ArrayList<Integer> integerArrayList = this.f7739a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f7739a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static AccessibilityNodeInfoCompat h0(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return n1(AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.f7739a));
    }

    static String j(int i11) {
        if (i11 == 1) {
            return "ACTION_FOCUS";
        }
        if (i11 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i11) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case PKIFailureInfo.certRevoked /* 8192 */:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case PKIFailureInfo.signerNotTrusted /* 524288 */:
                return "ACTION_COLLAPSE";
            case PKIFailureInfo.badSenderNonce /* 2097152 */:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i11) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i11) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i11) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean l(int i11) {
        Bundle bundleW = w();
        return bundleW != null && (bundleW.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i11) == i11;
    }

    private void l0(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArrayD = D(view);
        if (sparseArrayD != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < sparseArrayD.size(); i11++) {
                if (sparseArrayD.valueAt(i11).get() == null) {
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                sparseArrayD.remove(((Integer) arrayList.get(i12)).intValue());
            }
        }
    }

    public static AccessibilityNodeInfoCompat n1(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    private void o0(int i11, boolean z11) {
        Bundle bundleW = w();
        if (bundleW != null) {
            int i12 = bundleW.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i11);
            if (!z11) {
                i11 = 0;
            }
            bundleW.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i11 | i12);
        }
    }

    public static ClickableSpan[] r(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void A0(boolean z11) {
        this.f7739a.setEditable(z11);
    }

    public CharSequence B() {
        return this.f7739a.getPackageName();
    }

    public void B0(boolean z11) {
        this.f7739a.setEnabled(z11);
    }

    public f C() {
        AccessibilityNodeInfo.RangeInfo rangeInfo = this.f7739a.getRangeInfo();
        if (rangeInfo != null) {
            return new f(rangeInfo);
        }
        return null;
    }

    public void C0(CharSequence charSequence) {
        this.f7739a.setError(charSequence);
    }

    public void D0(boolean z11) {
        this.f7739a.setFocusable(z11);
    }

    public CharSequence E() {
        return Build.VERSION.SDK_INT >= 30 ? a.a(this.f7739a) : this.f7739a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void E0(boolean z11) {
        this.f7739a.setFocused(z11);
    }

    public CharSequence F() {
        if (!J()) {
            return this.f7739a.getText();
        }
        List<Integer> listH = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> listH2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> listH3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> listH4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f7739a.getText(), 0, this.f7739a.getText().length()));
        for (int i11 = 0; i11 < listH.size(); i11++) {
            spannableString.setSpan(new z5.a(listH4.get(i11).intValue(), this, w().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), listH.get(i11).intValue(), listH2.get(i11).intValue(), listH3.get(i11).intValue());
        }
        return spannableString;
    }

    public void F0(boolean z11) {
        o0(67108864, z11);
    }

    public CharSequence G() {
        return Build.VERSION.SDK_INT >= 28 ? this.f7739a.getTooltipText() : this.f7739a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void G0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7739a.setHeading(z11);
        } else {
            o0(2, z11);
        }
    }

    public String H() {
        return Build.VERSION.SDK_INT >= 33 ? b.a(this.f7739a) : this.f7739a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void H0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7739a.setHintText(charSequence);
        } else {
            this.f7739a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public String I() {
        return this.f7739a.getViewIdResourceName();
    }

    public void I0(boolean z11) {
        this.f7739a.setImportantForAccessibility(z11);
    }

    public void J0(View view) {
        this.f7739a.setLabelFor(view);
    }

    public void K0(View view) {
        this.f7739a.setLabeledBy(view);
    }

    public boolean L() {
        return Build.VERSION.SDK_INT >= 34 ? c.d(this.f7739a) : l(64);
    }

    public void L0(int i11) {
        this.f7739a.setLiveRegion(i11);
    }

    public boolean M() {
        return this.f7739a.isAccessibilityFocused();
    }

    public void M0(boolean z11) {
        this.f7739a.setLongClickable(z11);
    }

    public boolean N() {
        return this.f7739a.isCheckable();
    }

    public void N0(int i11) {
        this.f7739a.setMaxTextLength(i11);
    }

    public boolean O() {
        return this.f7739a.isChecked();
    }

    public void O0(int i11) {
        this.f7739a.setMovementGranularities(i11);
    }

    public boolean P() {
        return this.f7739a.isClickable();
    }

    public void P0(CharSequence charSequence) {
        this.f7739a.setPackageName(charSequence);
    }

    public boolean Q() {
        return this.f7739a.isContextClickable();
    }

    public void Q0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7739a.setPaneTitle(charSequence);
        } else {
            this.f7739a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public boolean R() {
        return this.f7739a.isEnabled();
    }

    public void R0(View view) {
        this.f7740b = -1;
        this.f7739a.setParent(view);
    }

    public boolean S() {
        return this.f7739a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void S0(View view, int i11) {
        this.f7740b = i11;
        this.f7739a.setParent(view, i11);
    }

    public boolean T() {
        return this.f7739a.isFocusable();
    }

    public void T0(boolean z11) {
        this.f7739a.setPassword(z11);
    }

    public boolean U() {
        return this.f7739a.isFocused();
    }

    public void U0(f fVar) {
        this.f7739a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) fVar.f7770a);
    }

    public boolean V() {
        return l(67108864);
    }

    public void V0(CharSequence charSequence) {
        this.f7739a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean W() {
        return this.f7739a.isImportantForAccessibility();
    }

    public void W0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7739a.setScreenReaderFocusable(z11);
        } else {
            o0(1, z11);
        }
    }

    public boolean X() {
        return this.f7739a.isLongClickable();
    }

    public void X0(boolean z11) {
        this.f7739a.setScrollable(z11);
    }

    public boolean Y() {
        return this.f7739a.isPassword();
    }

    public void Y0(boolean z11) {
        this.f7739a.setSelected(z11);
    }

    public boolean Z() {
        return Build.VERSION.SDK_INT >= 28 ? this.f7739a.isScreenReaderFocusable() : l(1);
    }

    public void Z0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7739a.setShowingHintText(z11);
        } else {
            o0(4, z11);
        }
    }

    public void a(int i11) {
        this.f7739a.addAction(i11);
    }

    public boolean a0() {
        return this.f7739a.isScrollable();
    }

    public void a1(View view) {
        this.f7741c = -1;
        this.f7739a.setSource(view);
    }

    public void b(AccessibilityActionCompat accessibilityActionCompat) {
        this.f7739a.addAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f7764a);
    }

    public boolean b0() {
        return this.f7739a.isSelected();
    }

    public void b1(View view, int i11) {
        this.f7741c = i11;
        this.f7739a.setSource(view, i11);
    }

    public void c(View view) {
        this.f7739a.addChild(view);
    }

    public boolean c0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f7739a.isShowingHintText() : l(4);
    }

    public void c1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            a.b(this.f7739a, charSequence);
        } else {
            this.f7739a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public void d(View view, int i11) {
        this.f7739a.addChild(view, i11);
    }

    public boolean d0() {
        return Build.VERSION.SDK_INT >= 33 ? b.b(this.f7739a) : l(8388608);
    }

    public void d1(CharSequence charSequence) {
        this.f7739a.setText(charSequence);
    }

    public boolean e0() {
        return this.f7739a.isVisibleToUser();
    }

    public void e1(int i11, int i12) {
        this.f7739a.setTextSelection(i11, i12);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityNodeInfoCompat)) {
            return false;
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7739a;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.f7739a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.f7739a)) {
            return false;
        }
        return this.f7741c == accessibilityNodeInfoCompat.f7741c && this.f7740b == accessibilityNodeInfoCompat.f7740b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            l0(view);
            ClickableSpan[] clickableSpanArrR = r(charSequence);
            if (clickableSpanArrR == null || clickableSpanArrR.length <= 0) {
                return;
            }
            w().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", h5.e.f70784a);
            SparseArray<WeakReference<ClickableSpan>> sparseArrayA = A(view);
            for (int i11 = 0; i11 < clickableSpanArrR.length; i11++) {
                int iK = K(clickableSpanArrR[i11], sparseArrayA);
                sparseArrayA.put(iK, new WeakReference<>(clickableSpanArrR[i11]));
                e(clickableSpanArrR[i11], (Spanned) charSequence, iK);
            }
        }
    }

    public void f1(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f7739a.setTooltipText(charSequence);
        } else {
            this.f7739a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void g1(View view) {
        this.f7739a.setTraversalAfter(view);
    }

    public void h1(View view, int i11) {
        this.f7739a.setTraversalAfter(view, i11);
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f7739a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<AccessibilityActionCompat> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f7739a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(new AccessibilityActionCompat(actionList.get(i11)));
        }
        return arrayList;
    }

    public boolean i0(int i11, Bundle bundle) {
        return this.f7739a.performAction(i11, bundle);
    }

    public void i1(View view) {
        this.f7739a.setTraversalBefore(view);
    }

    @Deprecated
    public void j0() {
    }

    public void j1(View view, int i11) {
        this.f7739a.setTraversalBefore(view, i11);
    }

    @Deprecated
    public int k() {
        return this.f7739a.getActions();
    }

    public boolean k0(AccessibilityActionCompat accessibilityActionCompat) {
        return this.f7739a.removeAction((AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.f7764a);
    }

    public void k1(String str) {
        this.f7739a.setViewIdResourceName(str);
    }

    public void l1(boolean z11) {
        this.f7739a.setVisibleToUser(z11);
    }

    @Deprecated
    public void m(Rect rect) {
        this.f7739a.getBoundsInParent(rect);
    }

    public void m0(boolean z11) {
        this.f7739a.setAccessibilityFocused(z11);
    }

    public AccessibilityNodeInfo m1() {
        return this.f7739a;
    }

    public void n(Rect rect) {
        this.f7739a.getBoundsInScreen(rect);
    }

    public void n0(List<String> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f7739a.setAvailableExtraData(list);
        }
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.b(this.f7739a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f7739a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public int p() {
        return this.f7739a.getChildCount();
    }

    @Deprecated
    public void p0(Rect rect) {
        this.f7739a.setBoundsInParent(rect);
    }

    public CharSequence q() {
        return this.f7739a.getClassName();
    }

    public void q0(Rect rect) {
        this.f7739a.setBoundsInScreen(rect);
    }

    public void r0(boolean z11) {
        this.f7739a.setCheckable(z11);
    }

    public d s() {
        AccessibilityNodeInfo.CollectionInfo collectionInfo = this.f7739a.getCollectionInfo();
        if (collectionInfo != null) {
            return new d(collectionInfo);
        }
        return null;
    }

    public void s0(boolean z11) {
        this.f7739a.setChecked(z11);
    }

    public CharSequence t() {
        return Build.VERSION.SDK_INT >= 34 ? c.c(this.f7739a) : this.f7739a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void t0(CharSequence charSequence) {
        this.f7739a.setClassName(charSequence);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        o(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(B());
        sb2.append("; className: ");
        sb2.append(q());
        sb2.append("; text: ");
        sb2.append(F());
        sb2.append("; error: ");
        sb2.append(v());
        sb2.append("; maxTextLength: ");
        sb2.append(y());
        sb2.append("; stateDescription: ");
        sb2.append(E());
        sb2.append("; contentDescription: ");
        sb2.append(u());
        sb2.append("; tooltipText: ");
        sb2.append(G());
        sb2.append("; viewIdResName: ");
        sb2.append(I());
        sb2.append("; uniqueId: ");
        sb2.append(H());
        sb2.append("; checkable: ");
        sb2.append(N());
        sb2.append("; checked: ");
        sb2.append(O());
        sb2.append("; fieldRequired: ");
        sb2.append(S());
        sb2.append("; focusable: ");
        sb2.append(T());
        sb2.append("; focused: ");
        sb2.append(U());
        sb2.append("; selected: ");
        sb2.append(b0());
        sb2.append("; clickable: ");
        sb2.append(P());
        sb2.append("; longClickable: ");
        sb2.append(X());
        sb2.append("; contextClickable: ");
        sb2.append(Q());
        sb2.append("; enabled: ");
        sb2.append(R());
        sb2.append("; password: ");
        sb2.append(Y());
        sb2.append("; scrollable: " + a0());
        sb2.append("; containerTitle: ");
        sb2.append(t());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(V());
        sb2.append("; importantForAccessibility: ");
        sb2.append(W());
        sb2.append("; visible: ");
        sb2.append(e0());
        sb2.append("; isTextSelectable: ");
        sb2.append(d0());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(L());
        sb2.append("; [");
        List<AccessibilityActionCompat> listI = i();
        for (int i11 = 0; i11 < listI.size(); i11++) {
            AccessibilityActionCompat accessibilityActionCompat = listI.get(i11);
            String strJ = j(accessibilityActionCompat.b());
            if (strJ.equals("ACTION_UNKNOWN") && accessibilityActionCompat.c() != null) {
                strJ = accessibilityActionCompat.c().toString();
            }
            sb2.append(strJ);
            if (i11 != listI.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public CharSequence u() {
        return this.f7739a.getContentDescription();
    }

    public void u0(boolean z11) {
        this.f7739a.setClickable(z11);
    }

    public CharSequence v() {
        return this.f7739a.getError();
    }

    public void v0(Object obj) {
        this.f7739a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((d) obj).f7768a);
    }

    public Bundle w() {
        return this.f7739a.getExtras();
    }

    public void w0(Object obj) {
        this.f7739a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((e) obj).f7769a);
    }

    public CharSequence x() {
        return Build.VERSION.SDK_INT >= 26 ? this.f7739a.getHintText() : this.f7739a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
    }

    public void x0(CharSequence charSequence) {
        this.f7739a.setContentDescription(charSequence);
    }

    public int y() {
        return this.f7739a.getMaxTextLength();
    }

    public void y0(boolean z11) {
        this.f7739a.setContentInvalid(z11);
    }

    public int z() {
        return this.f7739a.getMovementGranularities();
    }

    public void z0(boolean z11) {
        this.f7739a.setDismissable(z11);
    }
}
