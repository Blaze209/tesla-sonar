package com.stripe.android.financialconnections.launcher;

import androidx.p002activity.ComponentActivity;
import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import jn0.h0;
import jn0.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.m;
import p013kotlin.jvm.internal.p;
import p013kotlin.jvm.internal.s;
import wn0.l;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B%\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\u0005\u0010\rJ!\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/financialconnections/launcher/d;", "Ll50/d;", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/stripe/android/financialconnections/launcher/a$b;", "activityResultLauncher", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;)V", "Landroidx/activity/ComponentActivity;", "activity", "Lkotlin/Function1;", "Lcom/stripe/android/financialconnections/launcher/f;", "Ljn0/h0;", "callback", "(Landroidx/activity/ComponentActivity;Lwn0/l;)V", "Lcom/stripe/android/financialconnections/a$b;", "configuration", "Lcom/stripe/android/financialconnections/a$c;", "elementsSessionContext", "a", "(Lcom/stripe/android/financialconnections/a$b;Lcom/stripe/android/financialconnections/a$c;)V", "Landroidx/activity/result/ActivityResultLauncher;", "financial-connections_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d implements l50.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultLauncher<com.stripe.android.financialconnections.launcher.a.ForInstantDebits> activityResultLauncher;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* synthetic */ class a implements ActivityResultCallback, m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ l<f, h0> f50244a;

        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super f, h0> lVar) {
            this.f50244a = lVar;
        }

        @Override // androidx.p002activity.result.ActivityResultCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void onActivityResult(f p11) {
            s.k(p11, "p0");
            this.f50244a.invoke(p11);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof ActivityResultCallback) && (obj instanceof m)) {
                return s.f(getFunctionDelegate(), ((m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final i<?> getFunctionDelegate() {
            return new p(1, this.f50244a, l.class, "invoke", "invoke(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public d(ActivityResultLauncher<com.stripe.android.financialconnections.launcher.a.ForInstantDebits> activityResultLauncher) {
        s.k(activityResultLauncher, "activityResultLauncher");
        this.activityResultLauncher = activityResultLauncher;
    }

    @Override // l50.d
    public void a(com.stripe.android.financialconnections.a.Configuration configuration, com.stripe.android.financialconnections.a.ElementsSessionContext elementsSessionContext) {
        s.k(configuration, "configuration");
        this.activityResultLauncher.b(new com.stripe.android.financialconnections.launcher.a.ForInstantDebits(configuration, elementsSessionContext));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d(ComponentActivity activity, l<? super f, h0> callback) {
        s.k(activity, "activity");
        s.k(callback, "callback");
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = activity.registerForActivityResult(new FinancialConnectionsSheetForInstantDebitsContract(), new a(callback));
        s.j(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this(activityResultLauncherRegisterForActivityResult);
    }
}
