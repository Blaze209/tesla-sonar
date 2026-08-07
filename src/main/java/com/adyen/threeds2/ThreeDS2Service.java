package com.adyen.threeds2;

import android.content.Context;
import androidx.annotation.NonNull;
import atd.a.ChallengeResultError;
import com.adyen.threeds2.customization.UiCustomization;
import com.adyen.threeds2.parameters.ConfigParameters;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface ThreeDS2Service {
    public static final ThreeDS2Service INSTANCE = ChallengeResultError.getSDKReferenceNumber;

    void cleanup(Context context);

    TransactionResult createTransaction(String str, @NonNull String str2);

    String getSDKVersion();

    List<Warning> getWarnings();

    InitializeResult initialize(Context context, ConfigParameters configParameters, String str, UiCustomization uiCustomization);
}
