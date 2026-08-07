package com.adyen.threeds2;

import android.app.Activity;
import com.adyen.threeds2.parameters.ChallengeParameters;
import jn0.e;

/* JADX INFO: loaded from: classes3.dex */
public interface Transaction {
    void close();

    void doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusHandler challengeStatusHandler, int i11);

    @e
    void doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i11);

    AuthenticationRequestParameters getAuthenticationRequestParameters();

    ProgressDialog getProgressView(Activity activity);
}
