package expo.modules.medialibrary.assets;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import expo.modules.medialibrary.AssetQueryException;
import expo.modules.medialibrary.AssetsOptions;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import java.io.IOException;
import java.util.ArrayList;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import sn0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lexpo/modules/medialibrary/assets/GetAssets;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lexpo/modules/medialibrary/AssetsOptions;", "assetOptions", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "<init>", "(Landroid/content/Context;Lexpo/modules/medialibrary/AssetsOptions;Lexpo/modules/kotlin/Promise;)V", "Ljn0/h0;", "execute", "()V", "Landroid/content/Context;", "Lexpo/modules/medialibrary/AssetsOptions;", "Lexpo/modules/kotlin/Promise;", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GetAssets {
    private final AssetsOptions assetOptions;
    private final Context context;
    private final Promise promise;

    public GetAssets(Context context, AssetsOptions assetOptions, Promise promise) {
        s.k(context, "context");
        s.k(assetOptions, "assetOptions");
        s.k(promise, "promise");
        this.context = context;
        this.assetOptions = assetOptions;
        this.promise = promise;
    }

    public final void execute() {
        ContentResolver contentResolver = this.context.getContentResolver();
        try {
            GetAssetsQuery queryFromOptions = GetAssetsQueryKt.getQueryFromOptions(this.assetOptions);
            String selection = queryFromOptions.getSelection();
            String order = queryFromOptions.getOrder();
            double limit = queryFromOptions.getLimit();
            int offset = queryFromOptions.getOffset();
            Cursor cursorQuery = contentResolver.query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), MediaLibraryConstantsKt.getASSET_PROJECTION(), selection, null, order);
            try {
                if (cursorQuery == null) {
                    throw new AssetQueryException();
                }
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                s.h(contentResolver);
                AssetUtilsKt.putAssetsInfo(contentResolver, cursorQuery, arrayList, (int) limit, offset, false);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("assets", arrayList);
                bundle.putBoolean("hasNextPage", !cursorQuery.isAfterLast());
                bundle.putString("endCursor", String.valueOf(cursorQuery.getPosition()));
                bundle.putInt("totalCount", cursorQuery.getCount());
                this.promise.resolve(bundle);
                h0 h0Var = h0.f84049a;
                b.a(cursorQuery, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(cursorQuery, th2);
                    throw th3;
                }
            }
        } catch (IOException e11) {
            this.promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_LOAD, "Could not read file", e11);
        } catch (IllegalArgumentException e12) {
            Promise promise = this.promise;
            String message = e12.getMessage();
            if (message == null) {
                message = "Invalid MediaType";
            }
            promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_LOAD, message, e12);
        } catch (SecurityException e13) {
            this.promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get asset: need READ_EXTERNAL_STORAGE permission.", e13);
        } catch (UnsupportedOperationException e14) {
            e14.printStackTrace();
            this.promise.reject(MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS, e14.getMessage(), e14);
        }
    }
}
