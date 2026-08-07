package androidx.p002activity.result.contract;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import jn0.e;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@e
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"androidx/activity/result/contract/ActivityResultContracts$TakeVideo", "Landroidx/activity/result/contract/ActivityResultContract;", "Landroid/net/Uri;", "Landroid/graphics/Bitmap;", "<init>", "()V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "input", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/content/Intent;", "Landroidx/activity/result/contract/ActivityResultContract$a;", "b", "(Landroid/content/Context;Landroid/net/Uri;)Landroidx/activity/result/contract/ActivityResultContract$a;", "", StatusResponse.RESULT_CODE, AnalyticsAttribute.Intent, "c", "(ILandroid/content/Intent;)Landroid/graphics/Bitmap;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ActivityResultContracts$TakeVideo extends ActivityResultContract<Uri, Bitmap> {
    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, Uri input) {
        s.k(context, "context");
        s.k(input, "input");
        Intent intentPutExtra = new Intent("android.media.action.VIDEO_CAPTURE").putExtra("output", input);
        s.j(intentPutExtra, "Intent(MediaStore.ACTION…tore.EXTRA_OUTPUT, input)");
        return intentPutExtra;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ActivityResultContract.a<Bitmap> getSynchronousResult(Context context, Uri input) {
        s.k(context, "context");
        s.k(input, "input");
        return null;
    }

    @Override // androidx.p002activity.result.contract.ActivityResultContract
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Bitmap parseResult(int resultCode, Intent intent) {
        if (resultCode != -1) {
            intent = null;
        }
        if (intent != null) {
            return (Bitmap) intent.getParcelableExtra("data");
        }
        return null;
    }
}
