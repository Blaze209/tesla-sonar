package com.fourthline.orca.internal;

import com.fourthline.sdk.R;

/* JADX INFO: loaded from: classes4.dex */
public final class TC implements Eh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IC f27860a;

    public TC(boolean z11, Yj networkSpinnerThickLottieSource) {
        p013kotlin.jvm.internal.s.k(networkSpinnerThickLottieSource, "networkSpinnerThickLottieSource");
        this.f27860a = new IC(new QA.d(R.string.step_uploading_kyc_header, 0, 2, null), new QA.d(R.string.step_uploading_kyc_message, 0, 2, null), new QA.d(R.string.step_uploading_kyc_hint_upload, 0, 2, null), networkSpinnerThickLottieSource, 0, z11);
    }

    @Override // com.fourthline.orca.internal.Eh
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public IC getInitialState() {
        return this.f27860a;
    }
}
