package expo.modules.medialibrary.assets;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/medialibrary/assets/GetAssetInfo;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "assetId", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "<init>", "(Landroid/content/Context;Ljava/lang/String;Lexpo/modules/kotlin/Promise;)V", "Ljn0/h0;", "execute", "()V", "Landroid/content/Context;", "Ljava/lang/String;", "Lexpo/modules/kotlin/Promise;", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetAssetInfo {
    private final String assetId;
    private final Context context;
    private final Promise promise;

    public GetAssetInfo(Context context, String assetId, Promise promise) {
        s.k(context, "context");
        s.k(assetId, "assetId");
        s.k(promise, "promise");
        this.context = context;
        this.assetId = assetId;
        this.promise = promise;
    }

    public final void execute() {
        AssetUtilsKt.queryAssetInfo(this.context, "_id=?", new String[]{this.assetId}, true, this.promise);
    }
}
