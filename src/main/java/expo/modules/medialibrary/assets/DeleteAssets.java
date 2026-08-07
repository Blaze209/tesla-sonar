package expo.modules.medialibrary.assets;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import expo.modules.medialibrary.MediaLibraryUtils;
import p013kotlin.Metadata;
import p013kotlin.collections.n;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lexpo/modules/medialibrary/assets/DeleteAssets;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "", "assetIds", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "<init>", "(Landroid/content/Context;[Ljava/lang/String;Lexpo/modules/kotlin/Promise;)V", "Ljn0/h0;", "execute", "()V", "Landroid/content/Context;", "[Ljava/lang/String;", "Lexpo/modules/kotlin/Promise;", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteAssets {
    private final String[] assetIds;
    private final Context context;
    private final Promise promise;

    public DeleteAssets(Context context, String[] assetIds, Promise promise) {
        s.k(context, "context");
        s.k(assetIds, "assetIds");
        s.k(promise, "promise");
        this.context = context;
        this.assetIds = assetIds;
        this.promise = promise;
    }

    public final void execute() {
        MediaLibraryUtils.INSTANCE.deleteAssets(this.context, "_id IN (" + n.T0(this.assetIds, ",", null, null, 0, null, null, 62, null) + " )", null, this.promise);
    }
}
