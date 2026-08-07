package com.stripe.android.view;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import androidx.p002activity.ComponentActivity;
import androidx.p003lifecycle.LifecycleOwner;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Kind;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001b\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/view/a;", "Lcom/stripe/android/view/n;", "Landroidx/activity/ComponentActivity;", "activity", "", "statusBarColor", "<init>", "(Landroidx/activity/ComponentActivity;Ljava/lang/Integer;)V", "Ljava/lang/Class;", "target", "Landroid/os/Bundle;", "extras", "requestCode", "Ljn0/h0;", "b", "(Ljava/lang/Class;Landroid/os/Bundle;I)V", "Landroidx/activity/ComponentActivity;", "getActivity", "()Landroidx/activity/ComponentActivity;", "c", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "Landroidx/lifecycle/LifecycleOwner;", DateTokenConverter.CONVERTER_KEY, "Landroidx/lifecycle/LifecycleOwner;", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/app/Application;", "()Landroid/app/Application;", Kind.APPLICATION, "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a implements n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ComponentActivity activity;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Integer statusBarColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LifecycleOwner lifecycleOwner;

    public a(ComponentActivity activity, Integer num) {
        p013kotlin.jvm.internal.s.k(activity, "activity");
        this.activity = activity;
        this.statusBarColor = num;
        this.lifecycleOwner = activity;
    }

    @Override // com.stripe.android.view.n
    /* JADX INFO: renamed from: a, reason: from getter */
    public Integer getStatusBarColor() {
        return this.statusBarColor;
    }

    @Override // com.stripe.android.view.n
    public void b(Class<?> target, Bundle extras, int requestCode) {
        p013kotlin.jvm.internal.s.k(target, "target");
        p013kotlin.jvm.internal.s.k(extras, "extras");
        Intent intentPutExtras = new Intent(this.activity, target).putExtras(extras);
        p013kotlin.jvm.internal.s.j(intentPutExtras, "putExtras(...)");
        this.activity.startActivityForResult(intentPutExtras, requestCode);
    }

    @Override // com.stripe.android.view.n
    public Application c() {
        Application application = this.activity.getApplication();
        p013kotlin.jvm.internal.s.j(application, "getApplication(...)");
        return application;
    }

    @Override // com.stripe.android.view.n
    /* JADX INFO: renamed from: d, reason: from getter */
    public LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }
}
