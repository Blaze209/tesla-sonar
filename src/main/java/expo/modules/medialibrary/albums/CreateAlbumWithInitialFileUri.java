package expo.modules.medialibrary.albums;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.medialibrary.AlbumException;
import expo.modules.medialibrary.AssetFileException;
import expo.modules.medialibrary.MediaLibraryUtils;
import expo.modules.medialibrary.assets.CreateAssetWithAlbumFile;
import java.io.File;
import java.util.Collection;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lexpo/modules/medialibrary/albums/CreateAlbumWithInitialFileUri;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "albumName", "Landroid/net/Uri;", "assetUri", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;Lexpo/modules/kotlin/Promise;)V", "Ljn0/h0;", "execute", "()V", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Ljava/lang/String;", "getAlbumName", "()Ljava/lang/String;", "Landroid/net/Uri;", "getAssetUri", "()Landroid/net/Uri;", "Lexpo/modules/kotlin/Promise;", "getPromise", "()Lexpo/modules/kotlin/Promise;", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CreateAlbumWithInitialFileUri {
    private final String albumName;
    private final Uri assetUri;
    private final Context context;
    private final Promise promise;

    public CreateAlbumWithInitialFileUri(Context context, String albumName, Uri assetUri, Promise promise) {
        s.k(context, "context");
        s.k(albumName, "albumName");
        s.k(assetUri, "assetUri");
        s.k(promise, "promise");
        this.context = context;
        this.albumName = albumName;
        this.assetUri = assetUri;
        this.promise = promise;
    }

    public final void execute() throws AlbumException, AssetFileException {
        MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
        ContentResolver contentResolver = this.context.getContentResolver();
        s.j(contentResolver, "getContentResolver(...)");
        String mimeType = mediaLibraryUtils.getMimeType(contentResolver, this.assetUri);
        if (mimeType == null) {
            this.promise.reject(new AlbumException("Failed to create album: could not determine MIME type of the asset with uri: `" + this.assetUri + "`."));
            return;
        }
        String path = this.assetUri.getPath();
        if (path == null) {
            this.promise.reject(new AlbumException("Failed to create album: could not determine path of the asset with uri: `" + this.assetUri + "`."));
            return;
        }
        File fileCreateAlbumFile = AlbumUtilsKt.createAlbumFile(mimeType, this.albumName);
        if (new File(path).exists()) {
            Promise promise = new Promise() { // from class: expo.modules.medialibrary.albums.CreateAlbumWithInitialFileUri$execute$createAssetPromise$1
                @Override // expo.modules.kotlin.Promise
                public void reject(CodedException codedException) {
                    Promise.DefaultImpls.reject(this, codedException);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve() {
                    Promise.DefaultImpls.resolve(this);
                }

                @Override // expo.modules.kotlin.Promise
                public void reject(String code, String message, Throwable cause) {
                    s.k(code, "code");
                    this.this$0.getPromise().reject(code, "Failed to create the album: " + message, cause);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(double d11) {
                    Promise.DefaultImpls.resolve(this, d11);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(float f11) {
                    Promise.DefaultImpls.resolve((Promise) this, f11);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(int i11) {
                    Promise.DefaultImpls.resolve((Promise) this, i11);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(String str) {
                    Promise.DefaultImpls.resolve(this, str);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(Collection<? extends Object> collection) {
                    Promise.DefaultImpls.resolve(this, collection);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(Map<String, ? extends Object> map) {
                    Promise.DefaultImpls.resolve(this, map);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(boolean z11) {
                    Promise.DefaultImpls.resolve(this, z11);
                }

                @Override // expo.modules.kotlin.Promise
                public void resolve(Object value) {
                    new GetAlbum(this.this$0.getContext(), this.this$0.getAlbumName(), this.this$0.getPromise()).execute();
                }
            };
            Context context = this.context;
            String string = this.assetUri.toString();
            s.j(string, "toString(...)");
            new CreateAssetWithAlbumFile(context, string, promise, false, fileCreateAlbumFile).execute();
            return;
        }
        this.promise.reject(new AlbumException("Failed to create album: the local media file with uri: `" + this.assetUri + "` does not exist."));
    }

    public final String getAlbumName() {
        return this.albumName;
    }

    public final Uri getAssetUri() {
        return this.assetUri;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Promise getPromise() {
        return this.promise;
    }
}
