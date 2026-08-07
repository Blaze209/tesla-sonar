package expo.modules.medialibrary.assets;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import expo.modules.medialibrary.AssetFileException;
import expo.modules.medialibrary.albums.AlbumUtilsKt;
import java.io.File;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0013R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lexpo/modules/medialibrary/assets/CreateAssetWithAlbumId;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "uri", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "", "resolveWithAdditionalData", "albumId", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lexpo/modules/kotlin/Promise;ZLjava/lang/String;)V", "Ljn0/h0;", "execute", "()V", "Landroid/content/Context;", "Ljava/lang/String;", "Lexpo/modules/kotlin/Promise;", "Z", "Ljava/io/File;", "getAlbum", "()Ljava/io/File;", "album", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateAssetWithAlbumId {
    private final String albumId;
    private final Context context;
    private final Promise promise;
    private final boolean resolveWithAdditionalData;
    private final String uri;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateAssetWithAlbumId(Context context, String uri, Promise promise) {
        this(context, uri, promise, false, null, 24, null);
        s.k(context, "context");
        s.k(uri, "uri");
        s.k(promise, "promise");
    }

    private final File getAlbum() {
        String str = this.albumId;
        if (str != null) {
            return AlbumUtilsKt.getAlbumFileOrNull(this.context, str);
        }
        return null;
    }

    public final void execute() throws AssetFileException {
        new CreateAssetWithAlbumFile(this.context, this.uri, this.promise, this.resolveWithAdditionalData, getAlbum()).execute();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CreateAssetWithAlbumId(Context context, String uri, Promise promise, boolean z11) {
        this(context, uri, promise, z11, null, 16, null);
        s.k(context, "context");
        s.k(uri, "uri");
        s.k(promise, "promise");
    }

    public CreateAssetWithAlbumId(Context context, String uri, Promise promise, boolean z11, String str) {
        s.k(context, "context");
        s.k(uri, "uri");
        s.k(promise, "promise");
        this.context = context;
        this.uri = uri;
        this.promise = promise;
        this.resolveWithAdditionalData = z11;
        this.albumId = str;
    }

    public /* synthetic */ CreateAssetWithAlbumId(Context context, String str, Promise promise, boolean z11, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, promise, (i11 & 8) != 0 ? true : z11, (i11 & 16) != 0 ? null : str2);
    }
}
