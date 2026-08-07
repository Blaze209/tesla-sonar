package com.withpersona.sdk2.inquiry.launchers;

import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.ActivityResultLauncher;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00028\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/launchers/g0;", "I", Gender.OTHER, "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Landroidx/activity/result/ActivityResultCallback;", "callback", "<init>", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)V", "input", "Landroidx/core/app/d;", "options", "Ljn0/h0;", "c", "(Ljava/lang/Object;Landroidx/core/app/d;)V", DateTokenConverter.CONVERTER_KEY, "()V", "Lh/b;", "activityResultCaller", "e", "(Lh/b;)V", "a", "Landroidx/activity/result/contract/ActivityResultContract;", "()Landroidx/activity/result/contract/ActivityResultContract;", "b", "Landroidx/activity/result/ActivityResultCallback;", "Landroidx/activity/result/ActivityResultLauncher;", "currentLauncher", "launchers_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g0<I, O> extends ActivityResultLauncher<I> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultContract<I, O> contract;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ActivityResultCallback<O> callback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ActivityResultLauncher<I> currentLauncher;

    public g0(ActivityResultContract<I, O> contract, ActivityResultCallback<O> callback) {
        p013kotlin.jvm.internal.s.k(contract, "contract");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        this.contract = contract;
        this.callback = callback;
    }

    @Override // androidx.p002activity.result.ActivityResultLauncher
    public ActivityResultContract<I, O> a() {
        return this.contract;
    }

    @Override // androidx.p002activity.result.ActivityResultLauncher
    public void c(I input, androidx.core.app.d options) {
        ActivityResultLauncher<I> activityResultLauncher = this.currentLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.c(input, options);
        }
    }

    @Override // androidx.p002activity.result.ActivityResultLauncher
    public void d() {
        ActivityResultLauncher<I> activityResultLauncher = this.currentLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.d();
        }
    }

    public final void e(h.b activityResultCaller) {
        p013kotlin.jvm.internal.s.k(activityResultCaller, "activityResultCaller");
        this.currentLauncher = activityResultCaller.registerForActivityResult(a(), this.callback);
    }
}
