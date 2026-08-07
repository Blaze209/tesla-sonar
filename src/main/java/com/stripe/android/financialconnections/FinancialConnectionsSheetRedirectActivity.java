package com.stripe.android.financialconnections;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.stripe.android.financialconnections.ui.FinancialConnectionsSheetNativeActivity;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetRedirectActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Landroid/net/Uri;", "Landroid/content/Intent;", "p", "(Landroid/net/Uri;)Landroid/content/Intent;", "n", "(Landroid/net/Uri;)Landroid/net/Uri;", "", "m", "(Landroid/net/Uri;)Z", "Landroid/os/Bundle;", "savedInstanceState", "Ljn0/h0;", "onCreate", "(Landroid/os/Bundle;)V", "f", "a", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FinancialConnectionsSheetRedirectActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f50133f = new a(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/financialconnections/FinancialConnectionsSheetRedirectActivity$a;", "", "<init>", "()V", "", "HOST_AUTH_REDIRECT", "Ljava/lang/String;", "HOST_LINK_ACCOUNTS", "HOST_NATIVE_LINK_ACCOUNTS", "HOST_NATIVE_REDIRECT", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final boolean m(Uri uri) {
        return s.f(uri.getScheme(), "stripe-auth") || s.f(uri.getScheme(), "stripe");
    }

    private final Uri n(Uri uri) {
        Application application = getApplication();
        s.j(application, "getApplication(...)");
        Boolean boolA = new l40.a(application).a();
        if (s.f(boolA, Boolean.TRUE)) {
            String string = uri.toString();
            s.j(string, "toString(...)");
            Uri uri2 = Uri.parse(t.V(string, "link-accounts", "link-native-accounts", false, 4, null));
            s.j(uri2, "parse(...)");
            return uri2;
        }
        if (!s.f(boolA, Boolean.FALSE)) {
            if (boolA == null) {
                return uri;
            }
            throw new NoWhenBranchMatchedException();
        }
        String string2 = uri.toString();
        s.j(string2, "toString(...)");
        Uri uri3 = Uri.parse(t.V(string2, "link-native-accounts", "link-accounts", false, 4, null));
        s.j(uri3, "parse(...)");
        return uri3;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0007  */
    private final Intent p(Uri uri) {
        Class cls;
        if (m(uri)) {
            cls = FinancialConnectionsSheetNativeActivity.class;
            if (!s.f(uri.getHost(), "auth-redirect") && !s.f(uri.getHost(), "link-native-accounts")) {
                cls = FinancialConnectionsSheetActivity.class;
                if (!s.f(uri.getHost(), "link-accounts") && !s.f(uri.getHost(), "native-redirect")) {
                    cls = null;
                }
            }
        } else {
            cls = null;
        }
        if (cls != null) {
            return new Intent(this, (Class<?>) cls);
        }
        return null;
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        Uri uriN;
        Intent intentP;
        Intent flags;
        super.onCreate(savedInstanceState);
        Uri data = getIntent().getData();
        if (data != null && (intentP = p((uriN = n(data)))) != null && (flags = intentP.setFlags(603979776)) != null) {
            flags.setData(uriN);
            startActivity(flags);
        }
        finish();
    }
}
