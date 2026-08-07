package b60;

import android.content.Context;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.u;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb60/c;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Lo30/d;", "logger", "Lh70/h;", "errorReporter", "Lkotlin/Function1;", "La60/d;", "Lcom/stripe/android/googlepaylauncher/l;", "a", "(Landroid/content/Context;Lo30/d;Lh70/h;)Lwn0/l;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c {

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"La60/d;", AnalyticsAttribute.Environment, "Lcom/stripe/android/googlepaylauncher/c;", "a", "(La60/d;)Lcom/stripe/android/googlepaylauncher/c;"}, k = 3, mv = {1, 9, 0})
    static final class a extends u implements l<a60.d, com.stripe.android.googlepaylauncher.c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f16721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ h70.h f16722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ o30.d f16723e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, h70.h hVar, o30.d dVar) {
            super(1);
            this.f16721c = context;
            this.f16722d = hVar;
            this.f16723e = dVar;
        }

        @Override // wn0.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.stripe.android.googlepaylauncher.c invoke(a60.d environment) {
            s.k(environment, "environment");
            return new com.stripe.android.googlepaylauncher.c(this.f16721c, environment, new f30.i.BillingAddressParameters(false, null, false, 7, null), true, true, null, this.f16722d, this.f16723e, 32, null);
        }
    }

    public final l<a60.d, com.stripe.android.googlepaylauncher.l> a(Context appContext, o30.d logger, h70.h errorReporter) {
        s.k(appContext, "appContext");
        s.k(logger, "logger");
        s.k(errorReporter, "errorReporter");
        return new a(appContext, errorReporter, logger);
    }
}
