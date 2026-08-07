package py;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.henninghall.date_picker.m;
import java.util.Locale;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AccessibilityManager f104071a = (AccessibilityManager) com.henninghall.date_picker.c.f45183a.getApplicationContext().getSystemService("accessibility");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Locale f104072b = Locale.getDefault();

    /* JADX INFO: renamed from: py.a$a, reason: collision with other inner class name */
    class C2203a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.henninghall.date_picker.pickers.a f104073a;

        C2203a(com.henninghall.date_picker.pickers.a aVar) {
            this.f104073a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            int value = this.f104073a.getValue();
            if (i11 != 4096) {
                if (i11 == 8192 && !this.f104073a.a()) {
                    this.f104073a.c(value + 1);
                }
            } else if (!this.f104073a.a()) {
                this.f104073a.c(value - 1);
            }
            return super.performAccessibilityAction(view, i11, bundle);
        }
    }

    public static AccessibilityEvent a(View view, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        accessibilityEventObtain.setClassName(view.getClass().getName());
        accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    public static String b(com.henninghall.date_picker.pickers.a aVar) {
        String string = aVar.getView().getTag().toString();
        return e(aVar, aVar.getValue()) + ", " + c(string);
    }

    private static String c(String str) {
        return m.e(d(), str + "_description");
    }

    public static Locale d() {
        return f104072b;
    }

    private static String e(com.henninghall.date_picker.pickers.a aVar, int i11) {
        String str = aVar.getDisplayedValues()[i11];
        return str != null ? str : String.valueOf(i11);
    }

    public static void f(AccessibilityEvent accessibilityEvent) {
        AccessibilityManager accessibilityManager = f104071a;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        accessibilityManager.sendAccessibilityEvent(accessibilityEvent);
    }

    public static void g(com.henninghall.date_picker.pickers.a aVar, int i11) {
        AccessibilityEvent accessibilityEventA = a(aVar.getView(), 32);
        accessibilityEventA.getText().add(e(aVar, i11));
        f(accessibilityEventA);
    }

    public static void h(Locale locale) {
        f104072b = locale;
    }

    public static void i(com.henninghall.date_picker.pickers.a aVar, AccessibilityNodeInfo accessibilityNodeInfo) {
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setScrollable(true);
        accessibilityNodeInfo.setContentDescription(b(aVar));
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = new AccessibilityNodeInfo.AccessibilityAction(4096, "Increase value");
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = new AccessibilityNodeInfo.AccessibilityAction(PKIFailureInfo.certRevoked, "Decrease value");
        accessibilityNodeInfo.addAction(accessibilityAction);
        accessibilityNodeInfo.addAction(accessibilityAction2);
    }

    public static boolean j(View view) {
        if (f104071a.isTouchExplorationEnabled()) {
            return view.isAccessibilityFocused();
        }
        return true;
    }

    public static void k(com.henninghall.date_picker.pickers.a aVar) {
        aVar.getView().setAccessibilityDelegate(new C2203a(aVar));
    }
}
