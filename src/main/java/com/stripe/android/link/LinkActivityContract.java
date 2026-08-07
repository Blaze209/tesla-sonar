package com.stripe.android.link;

import android.content.Context;
import android.content.Intent;
import androidx.p002activity.result.contract.ActivityResultContract;
import c60.LinkConfiguration;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import f30.PaymentConfiguration;
import i60.PopupPayload;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import z60.g;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\f\u0011\u0016B\u0011\b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/link/LinkActivityContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/link/LinkActivityContract$a;", "Lcom/stripe/android/link/a;", "Lz60/g;", "stripeRepository", "<init>", "(Lz60/g;)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/stripe/android/link/LinkActivityContract$a;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/stripe/android/link/a;", DateTokenConverter.CONVERTER_KEY, "Lz60/g;", "e", "c", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LinkActivityContract extends ActivityResultContract<Args, a> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f50901f = 8;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g stripeRepository;

    /* JADX INFO: renamed from: com.stripe.android.link.LinkActivityContract$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/link/LinkActivityContract$a;", "", "Lc60/c;", "configuration", "<init>", "(Lc60/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc60/c;", "()Lc60/c;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Args {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final LinkConfiguration configuration;

        public Args(LinkConfiguration configuration) {
            s.k(configuration, "configuration");
            this.configuration = configuration;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LinkConfiguration getConfiguration() {
            return this.configuration;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && s.f(this.configuration, ((Args) other).configuration);
        }

        public int hashCode() {
            return this.configuration.hashCode();
        }

        public String toString() {
            return "Args(configuration=" + this.configuration + ")";
        }
    }

    /* JADX INFO: renamed from: com.stripe.android.link.LinkActivityContract$c, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/link/LinkActivityContract$c;", "", "Lcom/stripe/android/link/a;", "linkResult", "<init>", "(Lcom/stripe/android/link/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/stripe/android/link/a;", "getLinkResult", "()Lcom/stripe/android/link/a;", "link_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a linkResult;

        public Result(a linkResult) {
            s.k(linkResult, "linkResult");
            this.linkResult = linkResult;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Result) && s.f(this.linkResult, ((Result) other).linkResult);
        }

        public int hashCode() {
            return this.linkResult.hashCode();
        }

        public String toString() {
            return "Result(linkResult=" + this.linkResult + ")";
        }
    }

    public LinkActivityContract(g stripeRepository) {
        s.k(stripeRepository, "stripeRepository");
        this.stripeRepository = stripeRepository;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Args input) {
        s.k(context, "context");
        s.k(input, "input");
        PaymentConfiguration paymentConfigurationA = PaymentConfiguration.INSTANCE.a(context);
        return LinkForegroundActivity.INSTANCE.a(context, PopupPayload.INSTANCE.a(input.getConfiguration(), context, paymentConfigurationA.getPublishableKey(), paymentConfigurationA.getStripeAccountId(), g.a.a(this.stripeRepository, null, 1, null)).b());
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a parseResult(int resultCode, Intent intent) {
        return b.a(resultCode, intent);
    }
}
