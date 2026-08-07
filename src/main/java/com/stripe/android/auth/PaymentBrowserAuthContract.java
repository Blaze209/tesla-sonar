package com.stripe.android.auth;

import a70.DefaultReturnUrl;
import a70.Unvalidated;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.google.android.gms.common.internal.ImagesContract;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import jn0.x;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import q5.d;
import q80.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\n\u000fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "La70/c;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)La70/c;", DateTokenConverter.CONVERTER_KEY, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PaymentBrowserAuthContract extends ActivityResultContract<Args, Unvalidated> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.stripe.android.auth.PaymentBrowserAuthContract$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$b;", "", "<init>", "()V", "Landroid/content/Intent;", AnalyticsAttribute.Intent, "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "a", "(Landroid/content/Intent;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "", "EXTRA_ARGS", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Args a(Intent intent) {
            s.k(intent, "intent");
            return (Args) intent.getParcelableExtra("extra_args");
        }

        private Companion() {
        }
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Args input) {
        Class cls;
        s.k(context, "context");
        s.k(input, "input");
        boolean z11 = !input.getForceInAppWebView() && (input.q(DefaultReturnUrl.INSTANCE.a(context)) || input.getIsInstantApp());
        Bundle bundleS = input.s();
        if (z11) {
            cls = StripeBrowserLauncherActivity.class;
        } else {
            if (z11) {
                throw new NoWhenBranchMatchedException();
            }
            cls = PaymentAuthWebViewActivity.class;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtras(bundleS);
        return intent;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Unvalidated parseResult(int resultCode, Intent intent) {
        Unvalidated unvalidated = intent != null ? (Unvalidated) intent.getParcelableExtra("extra_args") : null;
        return unvalidated == null ? new Unvalidated(null, 0, null, false, null, null, null, 127, null) : unvalidated;
    }

    /* JADX INFO: renamed from: com.stripe.android.auth.PaymentBrowserAuthContract$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u001f\b\u0080\b\u0018\u0000 J2\u00020\u0001:\u0001'B\u0099\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016B\u0011\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0015\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&J°\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0014\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010&J\u001a\u0010.\u001a\u00020\t2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u00100\u001a\u0004\b1\u0010*R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010&R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u0010*R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u0010*R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b9\u00100\u001a\u0004\b:\u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b5\u0010=R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b4\u0010>\u001a\u0004\b?\u0010@R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bA\u00100\u001a\u0004\bB\u0010*R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bC\u0010<\u001a\u0004\bC\u0010=R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bD\u0010<\u001a\u0004\bA\u0010=R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bB\u0010E\u001a\u0004\bD\u0010FR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u00100\u001a\u0004\b9\u0010*R\u0017\u0010\u0012\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\bG\u0010=R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bH\u00100\u001a\u0004\b;\u0010*R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bI\u0010<\u001a\u0004\b7\u0010=¨\u0006K"}, d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "Landroid/os/Parcelable;", "", "objectId", "", "requestCode", "clientSecret", ImagesContract.URL, "returnUrl", "", "enableLogging", "Lq80/k;", "toolbarCustomization", "stripeAccountId", "shouldCancelSource", "shouldCancelIntentOnUserNavigation", "statusBarColor", "publishableKey", "isInstantApp", "referrer", "forceInAppWebView", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLq80/k;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Z)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "La70/a;", "defaultReturnUrl", "q", "(La70/a;)Z", "Landroid/os/Bundle;", "s", "()Landroid/os/Bundle;", "flags", "Ljn0/h0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLq80/k;Ljava/lang/String;ZZLjava/lang/Integer;Ljava/lang/String;ZLjava/lang/String;Z)Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getObjectId", "b", "I", "g", "c", "p", DateTokenConverter.CONVERTER_KEY, "m", "e", "getReturnUrl", "f", "Z", "()Z", "Lq80/k;", "l", "()Lq80/k;", "h", "k", IntegerTokenConverter.CONVERTER_KEY, "j", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "r", "n", "o", "CREATOR", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args implements Parcelable {

        /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final int f49603p = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String objectId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int requestCode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String clientSecret;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String returnUrl;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean enableLogging;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final k toolbarCustomization;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String stripeAccountId;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldCancelSource;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean shouldCancelIntentOnUserNavigation;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer statusBarColor;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String publishableKey;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isInstantApp;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final String referrer;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean forceInAppWebView;

        /* JADX INFO: renamed from: com.stripe.android.auth.PaymentBrowserAuthContract$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract$a$a;", "Landroid/os/Parcelable$Creator;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "", "size", "", "b", "(I)[Lcom/stripe/android/auth/PaymentBrowserAuthContract$a;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion implements Parcelable.Creator<Args> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Args createFromParcel(Parcel parcel) {
                s.k(parcel, "parcel");
                return new Args(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Args[] newArray(int size) {
                return new Args[size];
            }

            private Companion() {
            }
        }

        public Args(String objectId, int i11, String clientSecret, String url, String str, boolean z11, k kVar, String str2, boolean z12, boolean z13, Integer num, String publishableKey, boolean z14, String str3, boolean z15) {
            s.k(objectId, "objectId");
            s.k(clientSecret, "clientSecret");
            s.k(url, "url");
            s.k(publishableKey, "publishableKey");
            this.objectId = objectId;
            this.requestCode = i11;
            this.clientSecret = clientSecret;
            this.url = url;
            this.returnUrl = str;
            this.enableLogging = z11;
            this.toolbarCustomization = kVar;
            this.stripeAccountId = str2;
            this.shouldCancelSource = z12;
            this.shouldCancelIntentOnUserNavigation = z13;
            this.statusBarColor = num;
            this.publishableKey = publishableKey;
            this.isInstantApp = z14;
            this.referrer = str3;
            this.forceInAppWebView = z15;
        }

        public final Args a(String objectId, int requestCode, String clientSecret, String url, String returnUrl, boolean enableLogging, k toolbarCustomization, String stripeAccountId, boolean shouldCancelSource, boolean shouldCancelIntentOnUserNavigation, Integer statusBarColor, String publishableKey, boolean isInstantApp, String referrer, boolean forceInAppWebView) {
            s.k(objectId, "objectId");
            s.k(clientSecret, "clientSecret");
            s.k(url, "url");
            s.k(publishableKey, "publishableKey");
            return new Args(objectId, requestCode, clientSecret, url, returnUrl, enableLogging, toolbarCustomization, stripeAccountId, shouldCancelSource, shouldCancelIntentOnUserNavigation, statusBarColor, publishableKey, isInstantApp, referrer, forceInAppWebView);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getEnableLogging() {
            return this.enableLogging;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getForceInAppWebView() {
            return this.forceInAppWebView;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getPublishableKey() {
            return this.publishableKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return s.f(this.objectId, args.objectId) && this.requestCode == args.requestCode && s.f(this.clientSecret, args.clientSecret) && s.f(this.url, args.url) && s.f(this.returnUrl, args.returnUrl) && this.enableLogging == args.enableLogging && s.f(this.toolbarCustomization, args.toolbarCustomization) && s.f(this.stripeAccountId, args.stripeAccountId) && this.shouldCancelSource == args.shouldCancelSource && this.shouldCancelIntentOnUserNavigation == args.shouldCancelIntentOnUserNavigation && s.f(this.statusBarColor, args.statusBarColor) && s.f(this.publishableKey, args.publishableKey) && this.isInstantApp == args.isInstantApp && s.f(this.referrer, args.referrer) && this.forceInAppWebView == args.forceInAppWebView;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getReferrer() {
            return this.referrer;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getRequestCode() {
            return this.requestCode;
        }

        public final String getReturnUrl() {
            return this.returnUrl;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getShouldCancelIntentOnUserNavigation() {
            return this.shouldCancelIntentOnUserNavigation;
        }

        public int hashCode() {
            int iHashCode = ((((((this.objectId.hashCode() * 31) + Integer.hashCode(this.requestCode)) * 31) + this.clientSecret.hashCode()) * 31) + this.url.hashCode()) * 31;
            String str = this.returnUrl;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.enableLogging)) * 31;
            k kVar = this.toolbarCustomization;
            int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
            String str2 = this.stripeAccountId;
            int iHashCode4 = (((((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.shouldCancelSource)) * 31) + Boolean.hashCode(this.shouldCancelIntentOnUserNavigation)) * 31;
            Integer num = this.statusBarColor;
            int iHashCode5 = (((((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.publishableKey.hashCode()) * 31) + Boolean.hashCode(this.isInstantApp)) * 31;
            String str3 = this.referrer;
            return ((iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.forceInAppWebView);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getShouldCancelSource() {
            return this.shouldCancelSource;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final String getStripeAccountId() {
            return this.stripeAccountId;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final k getToolbarCustomization() {
            return this.toolbarCustomization;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: p, reason: from getter */
        public final String getClientSecret() {
            return this.clientSecret;
        }

        public final boolean q(DefaultReturnUrl defaultReturnUrl) {
            s.k(defaultReturnUrl, "defaultReturnUrl");
            return s.f(this.returnUrl, defaultReturnUrl.a());
        }

        /* JADX INFO: renamed from: r, reason: from getter */
        public final boolean getIsInstantApp() {
            return this.isInstantApp;
        }

        public final Bundle s() {
            return d.b(x.a("extra_args", this));
        }

        public String toString() {
            return "Args(objectId=" + this.objectId + ", requestCode=" + this.requestCode + ", clientSecret=" + this.clientSecret + ", url=" + this.url + ", returnUrl=" + this.returnUrl + ", enableLogging=" + this.enableLogging + ", toolbarCustomization=" + this.toolbarCustomization + ", stripeAccountId=" + this.stripeAccountId + ", shouldCancelSource=" + this.shouldCancelSource + ", shouldCancelIntentOnUserNavigation=" + this.shouldCancelIntentOnUserNavigation + ", statusBarColor=" + this.statusBarColor + ", publishableKey=" + this.publishableKey + ", isInstantApp=" + this.isInstantApp + ", referrer=" + this.referrer + ", forceInAppWebView=" + this.forceInAppWebView + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            s.k(parcel, "parcel");
            parcel.writeString(this.objectId);
            parcel.writeInt(this.requestCode);
            parcel.writeString(this.clientSecret);
            parcel.writeString(this.url);
            parcel.writeString(this.returnUrl);
            parcel.writeByte(this.enableLogging ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.toolbarCustomization, flags);
            parcel.writeString(this.stripeAccountId);
            parcel.writeByte(this.shouldCancelSource ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.shouldCancelIntentOnUserNavigation ? (byte) 1 : (byte) 0);
            parcel.writeValue(this.statusBarColor);
            parcel.writeString(this.publishableKey);
            parcel.writeByte(this.isInstantApp ? (byte) 1 : (byte) 0);
            parcel.writeString(this.referrer);
            parcel.writeByte(this.forceInAppWebView ? (byte) 1 : (byte) 0);
        }

        public /* synthetic */ Args(String str, int i11, String str2, String str3, String str4, boolean z11, k kVar, String str5, boolean z12, boolean z13, Integer num, String str6, boolean z14, String str7, boolean z15, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11, str2, str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? false : z11, (i12 & 64) != 0 ? null : kVar, (i12 & 128) != 0 ? null : str5, (i12 & 256) != 0 ? false : z12, (i12 & 512) != 0 ? true : z13, num, str6, z14, (i12 & PKIFailureInfo.certRevoked) != 0 ? null : str7, (i12 & 16384) != 0 ? false : z15);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Args(Parcel parcel) {
            s.k(parcel, "parcel");
            String string = parcel.readString();
            String str = string == null ? "" : string;
            int i11 = parcel.readInt();
            String string2 = parcel.readString();
            String str2 = string2 == null ? "" : string2;
            String string3 = parcel.readString();
            String str3 = string3 == null ? "" : string3;
            String string4 = parcel.readString();
            boolean z11 = true;
            if (parcel.readByte() == 0) {
                z11 = false;
            }
            k kVar = (k) parcel.readParcelable(k.class.getClassLoader());
            String string5 = parcel.readString();
            boolean z12 = parcel.readByte() != 0;
            boolean z13 = parcel.readByte() != 0 ? z11 : false;
            Object value = parcel.readValue(Integer.TYPE.getClassLoader());
            Integer num = value instanceof Integer ? (Integer) value : null;
            String string6 = parcel.readString();
            this(str, i11, str2, str3, string4, z11, kVar, string5, z12, z13, num, string6 == null ? "" : string6, parcel.readByte() != 0 ? z11 : false, parcel.readString(), parcel.readByte() != 0 ? z11 : false);
        }
    }
}
