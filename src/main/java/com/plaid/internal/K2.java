package com.plaid.internal;

import android.net.Uri;
import com.adyen.checkout.components.core.action.RedirectAction;

/* JADX INFO: loaded from: classes6.dex */
public final class K2 extends androidx.p003lifecycle.c1 {
    public static AbstractC4587y6 a(Uri uri) {
        if (uri == null) {
            return new AbstractC4587y6.d(new IllegalStateException("Redirect with no oauth state provided"));
        }
        if (p013kotlin.jvm.internal.s.f(uri.getHost(), "complete")) {
            String string = uri.toString();
            p013kotlin.jvm.internal.s.j(string, "toString(...)");
            return new AbstractC4587y6.b(string);
        }
        if (p013kotlin.jvm.internal.s.f(uri.getHost(), RedirectAction.ACTION_TYPE)) {
            String string2 = uri.toString();
            p013kotlin.jvm.internal.s.j(string2, "toString(...)");
            return new AbstractC4587y6.a(string2);
        }
        if (p013kotlin.jvm.internal.s.f(uri.getHost(), "resume")) {
            return new AbstractC4587y6.e();
        }
        return new AbstractC4587y6.d(new IllegalStateException("Invalid redirect uri: " + uri));
    }
}
