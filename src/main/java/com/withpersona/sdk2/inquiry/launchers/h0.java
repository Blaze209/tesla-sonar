package com.withpersona.sdk2.inquiry.launchers;

import androidx.p002activity.result.ActivityResultCallback;
import androidx.p002activity.result.contract.ActivityResultContract;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aI\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"I", Gender.OTHER, "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "Landroidx/activity/result/ActivityResultCallback;", "callback", "Lcom/withpersona/sdk2/inquiry/launchers/g0;", "a", "(Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Lcom/withpersona/sdk2/inquiry/launchers/g0;", "launchers_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h0 {
    public static final <I, O> g0<I, O> a(ActivityResultContract<I, O> contract, ActivityResultCallback<O> callback) {
        p013kotlin.jvm.internal.s.k(contract, "contract");
        p013kotlin.jvm.internal.s.k(callback, "callback");
        return new g0<>(contract, callback);
    }
}
