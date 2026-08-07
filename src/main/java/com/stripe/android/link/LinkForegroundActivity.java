package com.stripe.android.link;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u0019\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/link/LinkForegroundActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Ljn0/h0;", "m", "(Landroid/content/Intent;)V", "n", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onNewIntent", "onResume", "", "f", "Z", "hasLaunchedPopup", "g", "a", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinkForegroundActivity extends androidx.appcompat.app.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f50906h = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasLaunchedPopup;

    /* JADX INFO: renamed from: com.stripe.android.link.LinkForegroundActivity$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/link/LinkForegroundActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "popupUrl", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "Landroid/net/Uri;", "uri", "b", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "ACTION_REDIRECT", "Ljava/lang/String;", "EXTRA_FAILURE", "EXTRA_POPUP_URL", "", "RESULT_COMPLETE", "I", "RESULT_FAILURE", "SAVED_STATE_HAS_LAUNCHED_POPUP", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context, String popupUrl) {
            s.k(context, "context");
            s.k(popupUrl, "popupUrl");
            Intent intentPutExtra = new Intent(context, (Class<?>) LinkForegroundActivity.class).putExtra("LinkPopupUrl", popupUrl);
            s.j(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final Intent b(Context context, Uri uri) {
            s.k(context, "context");
            Intent intent = new Intent(context, (Class<?>) LinkForegroundActivity.class);
            intent.setAction("LinkForegroundActivity.redirect");
            intent.setData(uri);
            intent.addFlags(603979776);
            return intent;
        }

        private Companion() {
        }
    }

    private final void m(Intent intent) {
        if (s.f(intent.getAction(), "LinkForegroundActivity.redirect")) {
            setResult(49871, intent);
            finish();
        }
    }

    private final void n() {
        String string;
        this.hasLaunchedPopup = true;
        Bundle extras = getIntent().getExtras();
        Uri uri = (extras == null || (string = extras.getString("LinkPopupUrl")) == null) ? null : Uri.parse(string);
        if (uri == null) {
            setResult(0);
            finish();
            return;
        }
        try {
            new androidx.browser.customtabs.d.C0067d().j(2).b().a(this, uri);
        } catch (ActivityNotFoundException e11) {
            setResult(91367, new Intent().putExtra("LinkFailure", e11));
            finish();
        }
    }

    @Override // androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.hasLaunchedPopup = savedInstanceState != null ? savedInstanceState.getBoolean("LinkHasLaunchedPopup") : false;
        Intent intent = getIntent();
        s.j(intent, "getIntent(...)");
        m(intent);
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        s.k(intent, "intent");
        super.onNewIntent(intent);
        m(intent);
    }

    @Override // androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (isFinishing()) {
            return;
        }
        if (!this.hasLaunchedPopup) {
            n();
        } else {
            setResult(0);
            finish();
        }
    }

    @Override // androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        s.k(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("LinkHasLaunchedPopup", this.hasLaunchedPopup);
    }
}
