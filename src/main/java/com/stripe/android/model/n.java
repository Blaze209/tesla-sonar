package com.stripe.android.model;

import android.os.Parcelable;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\t\"\u0004\b\f\u0010\r\u0082\u0001\u0002\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/n;", "Lcom/stripe/android/model/o1;", "Landroid/os/Parcelable;", "", "shouldUseStripeSdk", "m2", "(Z)Lcom/stripe/android/model/n;", "", "p", "()Ljava/lang/String;", "clientSecret", "getReturnUrl", "L3", "(Ljava/lang/String;)V", "returnUrl", "Lcom/stripe/android/model/l;", "Lcom/stripe/android/model/m;", "payments-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface n extends o1, Parcelable {
    void L3(String str);

    String getReturnUrl();

    n m2(boolean shouldUseStripeSdk);

    String p();
}
