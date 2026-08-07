package com.stripe.android.stripe3ds2.views;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/k;", "Landroidx/fragment/app/y;", "", "directoryServerName", "Lt80/q;", "sdkTransactionId", "", "accentColor", "<init>", "(Ljava/lang/String;Lt80/q;Ljava/lang/Integer;)V", "Ljava/lang/ClassLoader;", "classLoader", "className", "Landroidx/fragment/app/Fragment;", "instantiate", "(Ljava/lang/ClassLoader;Ljava/lang/String;)Landroidx/fragment/app/Fragment;", "a", "Ljava/lang/String;", "b", "Lt80/q;", "c", "Ljava/lang/Integer;", "3ds2sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class k extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String directoryServerName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t80.q sdkTransactionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Integer accentColor;

    public k(String directoryServerName, t80.q sdkTransactionId, Integer num) {
        p013kotlin.jvm.internal.s.k(directoryServerName, "directoryServerName");
        p013kotlin.jvm.internal.s.k(sdkTransactionId, "sdkTransactionId");
        this.directoryServerName = directoryServerName;
        this.sdkTransactionId = sdkTransactionId;
        this.accentColor = num;
    }

    @Override // androidx.fragment.app.y
    public Fragment instantiate(ClassLoader classLoader, String className) {
        p013kotlin.jvm.internal.s.k(classLoader, "classLoader");
        p013kotlin.jvm.internal.s.k(className, "className");
        if (p013kotlin.jvm.internal.s.f(className, ChallengeProgressFragment.class.getName())) {
            return new ChallengeProgressFragment(this.directoryServerName, this.sdkTransactionId, this.accentColor);
        }
        Fragment fragmentInstantiate = super.instantiate(classLoader, className);
        p013kotlin.jvm.internal.s.h(fragmentInstantiate);
        return fragmentInstantiate;
    }
}
