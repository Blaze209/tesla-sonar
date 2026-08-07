package com.withpersona.sdk2.inquiry.nfc;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import nh0.PassportNfcReaderConfig;
import nh0.d;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/PassportNfcReaderContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lnh0/e;", "Lcom/withpersona/sdk2/inquiry/nfc/a;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lnh0/e;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/withpersona/sdk2/inquiry/nfc/a;", "nfc_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PassportNfcReaderContract extends ActivityResultContract<PassportNfcReaderConfig, a> {
    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, PassportNfcReaderConfig input) {
        s.k(context, "context");
        s.k(input, "input");
        Intent intent = new Intent(context, d.f95017a.a());
        intent.putExtra("EXTRA_NFC_READER_CONFIG", input);
        return intent;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a parseResult(int resultCode, Intent intent) {
        Bundle extras;
        a aVar;
        return (intent == null || (extras = intent.getExtras()) == null || (aVar = (a) q5.c.a(extras, "EXTRA_RESULT", a.class)) == null) ? new a.b("Unable to extract output from result intent.", a.c.Unknown) : aVar;
    }
}
