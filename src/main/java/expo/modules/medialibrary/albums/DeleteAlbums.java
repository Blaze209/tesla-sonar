package expo.modules.medialibrary.albums;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.medialibrary.MediaLibraryUtils;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lexpo/modules/medialibrary/albums/DeleteAlbums;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "", "albumIds", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "<init>", "(Landroid/content/Context;Ljava/util/List;Lexpo/modules/kotlin/Promise;)V", "Ljn0/h0;", "execute", "()V", "Landroid/content/Context;", "Lexpo/modules/kotlin/Promise;", "", "mAlbumIds", "[Ljava/lang/String;", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeleteAlbums {
    private final Context context;
    private final String[] mAlbumIds;
    private final Promise promise;

    public DeleteAlbums(Context context, List<String> albumIds, Promise promise) {
        s.k(context, "context");
        s.k(albumIds, "albumIds");
        s.k(promise, "promise");
        this.context = context;
        this.promise = promise;
        this.mAlbumIds = (String[]) albumIds.toArray(new String[0]);
    }

    public final void execute() {
        MediaLibraryUtils mediaLibraryUtils = MediaLibraryUtils.INSTANCE;
        String str = "bucket_id IN (" + mediaLibraryUtils.queryPlaceholdersFor(this.mAlbumIds) + ")";
        final String str2 = "bucket_id IN (" + mediaLibraryUtils.queryPlaceholdersFor(this.mAlbumIds) + ")";
        final String[] strArr = this.mAlbumIds;
        mediaLibraryUtils.deleteAssets(this.context, str, strArr, new Promise() { // from class: expo.modules.medialibrary.albums.DeleteAlbums$execute$promiseOverride$1
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
                this.this$0.promise.reject(code, message, cause);
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
            public void resolve(String str3) {
                Promise.DefaultImpls.resolve(this, str3);
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
                MediaLibraryUtils.INSTANCE.deleteAssets(this.this$0.context, str2, strArr, this.this$0.promise);
            }
        });
    }
}
