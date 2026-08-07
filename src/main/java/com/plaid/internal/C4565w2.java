package com.plaid.internal;

import android.view.View;
import com.plaid.link.R;

/* JADX INFO: renamed from: com.plaid.internal.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4565w2 extends p013kotlin.jvm.internal.u implements wn0.a<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4583y2 f48194a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4565w2(C4583y2 c4583y2) {
        super(0);
        this.f48194a = c4583y2;
    }

    @Override // wn0.a
    public final View invoke() {
        return this.f48194a.findViewById(R.id.retry_button);
    }
}
