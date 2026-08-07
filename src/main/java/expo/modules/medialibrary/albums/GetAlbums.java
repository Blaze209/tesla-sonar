package expo.modules.medialibrary.albums;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import expo.modules.medialibrary.AlbumException;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lexpo/modules/medialibrary/albums/GetAlbums;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "<init>", "(Landroid/content/Context;Lexpo/modules/kotlin/Promise;)V", "Ljn0/h0;", "execute", "()V", "Landroid/content/Context;", "Lexpo/modules/kotlin/Promise;", "Album", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class GetAlbums {
    private final Context context;
    private final Promise promise;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lexpo/modules/medialibrary/albums/GetAlbums$Album;", "", "id", "", "title", "count", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getCount", "()I", "setCount", "(I)V", "toBundle", "Landroid/os/Bundle;", "expo-media-library_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Album {
        private int count;
        private final String id;
        private final String title;

        public Album(String id2, String title, int i11) {
            s.k(id2, "id");
            s.k(title, "title");
            this.id = id2;
            this.title = title;
            this.count = i11;
        }

        public final int getCount() {
            return this.count;
        }

        public final void setCount(int i11) {
            this.count = i11;
        }

        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putString("id", this.id);
            bundle.putString("title", this.title);
            bundle.putParcelable("type", null);
            bundle.putInt("assetCount", this.count);
            return bundle;
        }

        public /* synthetic */ Album(String str, String str2, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i12 & 4) != 0 ? 0 : i11);
        }
    }

    public GetAlbums(Context context, Promise promise) {
        s.k(context, "context");
        s.k(promise, "promise");
        this.context = context;
        this.promise = promise;
    }

    public final void execute() {
        String[] strArr = {"bucket_id", "bucket_display_name"};
        HashMap map = new HashMap();
        try {
            Cursor cursorQuery = this.context.getContentResolver().query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), strArr, "media_type != 0", null, "bucket_display_name");
            try {
                if (cursorQuery == null) {
                    throw new AlbumException("Could not get albums. Query returns null");
                }
                int columnIndex = cursorQuery.getColumnIndex("bucket_id");
                int columnIndex2 = cursorQuery.getColumnIndex("bucket_display_name");
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(columnIndex);
                    if (cursorQuery.getType(columnIndex2) != 0) {
                        Album album = (Album) map.get(string);
                        if (album == null) {
                            s.h(string);
                            String string2 = cursorQuery.getString(columnIndex2);
                            s.j(string2, "getString(...)");
                            Album album2 = new Album(string, string2, 0, 4, null);
                            map.put(string, album2);
                            album = album2;
                        }
                        album.setCount(album.getCount() + 1);
                    }
                }
                Promise promise = this.promise;
                Collection collectionValues = map.values();
                s.j(collectionValues, "<get-values>(...)");
                Collection collection = collectionValues;
                ArrayList arrayList = new ArrayList(v.y(collection, 10));
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Album) it.next()).toBundle());
                }
                promise.resolve((Collection<? extends Object>) arrayList);
                h0 h0Var = h0.f84049a;
                sn0.b.a(cursorQuery, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(cursorQuery, th2);
                    throw th3;
                }
            }
        } catch (SecurityException e11) {
            this.promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get albums: need READ_EXTERNAL_STORAGE permission.", e11);
        } catch (RuntimeException e12) {
            this.promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_LOAD, "Could not get albums.", e12);
        }
    }
}
