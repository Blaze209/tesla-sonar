package s10;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.u;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0019\u0010\b\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\u000f\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroid/view/View;", "Ljn0/h0;", "e", "(Landroid/view/View;)V", "c", "Landroidx/fragment/app/Fragment;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, DateTokenConverter.CONVERTER_KEY, "(Landroidx/fragment/app/Fragment;Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/bridge/ReadableMap;", "", Action.KEY_ATTRIBUTE, "", "default", "b", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Z)Z", "stripe_stripe-react-native_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class g {
    public static final boolean b(ReadableMap readableMap, String key, boolean z11) {
        s.k(readableMap, "<this>");
        s.k(key, "key");
        return readableMap.hasKey(key) ? readableMap.getBoolean(key) : z11;
    }

    public static final void c(View view) {
        InputMethodManager inputMethodManager;
        s.k(view, "<this>");
        if (!view.requestFocus() || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void d(Fragment fragment, ReactApplicationContext context) {
        FragmentManager supportFragmentManager;
        s.k(fragment, "<this>");
        s.k(context, "context");
        Activity currentActivity = context.getCurrentActivity();
        u uVar = currentActivity instanceof u ? (u) currentActivity : null;
        if (uVar == null || (supportFragmentManager = uVar.getSupportFragmentManager()) == null || supportFragmentManager.o0(fragment.getTag()) == null) {
            return;
        }
        supportFragmentManager.r().n(fragment).h();
    }

    public static final void e(final View view) {
        s.k(view, "<this>");
        view.post(new Runnable() { // from class: s10.f
            @Override // java.lang.Runnable
            public final void run() {
                g.f(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(View view) {
        InputMethodManager inputMethodManager;
        if (!view.requestFocus() || (inputMethodManager = (InputMethodManager) view.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.showSoftInput(view, 1);
    }
}
