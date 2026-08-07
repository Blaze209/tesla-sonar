package com.stripe.android.view;

import android.app.Application;
import android.os.Bundle;
import android.view.Window;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Kind;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ+\u0010\t\u001a\u00020\b2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/n;", "", "Ljava/lang/Class;", "target", "Landroid/os/Bundle;", "extras", "", "requestCode", "Ljn0/h0;", "b", "(Ljava/lang/Class;Landroid/os/Bundle;I)V", "a", "()Ljava/lang/Integer;", "statusBarColor", "Landroidx/lifecycle/LifecycleOwner;", DateTokenConverter.CONVERTER_KEY, "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", "c", "()Landroid/app/Application;", Kind.APPLICATION, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f55080a;

    /* JADX INFO: renamed from: com.stripe.android.view.n$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/view/n$a;", "", "<init>", "()V", "Landroidx/activity/ComponentActivity;", "activity", "", "statusBarColor", "Lcom/stripe/android/view/n;", "a", "(Landroidx/activity/ComponentActivity;Ljava/lang/Integer;)Lcom/stripe/android/view/n;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f55080a = new Companion();

        private Companion() {
        }

        public static /* synthetic */ n b(Companion companion, ComponentActivity componentActivity, Integer num, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                Window window = componentActivity.getWindow();
                num = window != null ? Integer.valueOf(window.getStatusBarColor()) : null;
            }
            return companion.a(componentActivity, num);
        }

        public final /* synthetic */ n a(ComponentActivity activity, Integer statusBarColor) {
            p013kotlin.jvm.internal.s.k(activity, "activity");
            return new a(activity, statusBarColor);
        }
    }

    /* JADX INFO: renamed from: a */
    Integer getStatusBarColor();

    void b(Class<?> target, Bundle extras, int requestCode);

    Application c();

    /* JADX INFO: renamed from: d */
    LifecycleOwner getLifecycleOwner();
}
