package o90;

import android.content.Context;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/content/Context;", "", "b", "(Landroid/content/Context;)Z", "stripe-ui-core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class g {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }
}
