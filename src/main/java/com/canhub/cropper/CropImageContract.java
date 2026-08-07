package com.canhub.cropper;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.p002activity.result.contract.ActivityResultContract;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@jn0.e
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/canhub/cropper/CropImageContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/canhub/cropper/l;", "Lcom/canhub/cropper/CropImageView$c;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Lcom/canhub/cropper/l;)Landroid/content/Intent;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "b", "(ILandroid/content/Intent;)Lcom/canhub/cropper/CropImageView$c;", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CropImageContract extends ActivityResultContract<CropImageContractOptions, CropImageView.c> {
    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, CropImageContractOptions input) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(input, "input");
        Intent intent = new Intent(context, (Class<?>) CropImageActivity.class);
        Bundle bundle = new Bundle(2);
        bundle.putParcelable("CROP_IMAGE_EXTRA_SOURCE", input.getUri());
        bundle.putParcelable("CROP_IMAGE_EXTRA_OPTIONS", input.getCropImageOptions());
        h0 h0Var = h0.f84049a;
        intent.putExtra("CROP_IMAGE_EXTRA_BUNDLE", bundle);
        return intent;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public CropImageView.c parseResult(int resultCode, Intent intent) {
        d dVar = null;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("CROP_IMAGE_EXTRA_RESULT");
            dVar = (d) (parcelableExtra instanceof d ? parcelableExtra : null);
        }
        return (dVar == null || resultCode == 0) ? e.f21052k : dVar;
    }
}
