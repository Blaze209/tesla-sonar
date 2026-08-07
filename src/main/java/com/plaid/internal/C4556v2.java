package com.plaid.internal;

import android.widget.ProgressBar;
import com.plaid.link.R;

/* JADX INFO: renamed from: com.plaid.internal.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4556v2 extends p013kotlin.jvm.internal.u implements wn0.a<ProgressBar> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4583y2 f48165a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4556v2(C4583y2 c4583y2) {
        super(0);
        this.f48165a = c4583y2;
    }

    @Override // wn0.a
    public final ProgressBar invoke() {
        return (ProgressBar) this.f48165a.findViewById(R.id.progress_bar);
    }
}
