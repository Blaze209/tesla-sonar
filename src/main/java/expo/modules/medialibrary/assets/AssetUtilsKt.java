package expo.modules.medialibrary.assets;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.fourthline.adapters.serialization.OrcaKeys;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import expo.modules.contacts.Columns;
import expo.modules.kotlin.Promise;
import expo.modules.medialibrary.AssetQueryException;
import expo.modules.medialibrary.MediaLibraryConstantsKt;
import expo.modules.medialibrary.MediaType;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.jvm.internal.s;
import sn0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u001a?\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001aC\u0010\u0017\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010!\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"\u001aC\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140%2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0014¢\u0006\u0004\b&\u0010'\u001a\u0015\u0010(\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\u0014¢\u0006\u0004\b(\u0010)\u001a1\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140%2\u0006\u0010*\u001a\u00020\u00142\u0006\u0010+\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u0014¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "selection", "", "selectionArgs", "", "resolveWithFullInfo", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "queryAssetInfo", "(Landroid/content/Context;Ljava/lang/String;[Ljava/lang/String;ZLexpo/modules/kotlin/Promise;)V", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/database/Cursor;", "cursor", "", "Landroid/os/Bundle;", "response", "", "limit", "offset", "putAssetsInfo", "(Landroid/content/ContentResolver;Landroid/database/Cursor;Ljava/util/List;IIZ)V", "Le7/a;", "exifInterface", "getExifFullInfo", "(Le7/a;Landroid/os/Bundle;)V", "Landroid/net/Uri;", "photoUri", "getExifLocationForUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/os/Bundle;", "getExifLocationLegacy", "(Le7/a;)Landroid/os/Bundle;", "mediaType", "localUriColumnIndex", "Lkotlin/Pair;", "getAssetDimensionsFromCursor", "(Landroid/content/ContentResolver;Le7/a;Landroid/database/Cursor;II)Lkotlin/Pair;", "exportMediaType", "(I)Ljava/lang/String;", Snapshot.WIDTH, Snapshot.HEIGHT, "orientation", "maybeRotateAssetSize", "(III)Lkotlin/Pair;", "expo-media-library_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AssetUtilsKt {
    /* JADX WARN: Code duplicated, block: B:12:0x0012  */
    public static final String exportMediaType(int i11) {
        MediaType mediaType;
        if (i11 == 1) {
            mediaType = MediaType.PHOTO;
        } else if (i11 == 2) {
            mediaType = MediaType.AUDIO;
        } else if (i11 == 3) {
            mediaType = MediaType.VIDEO;
        } else if (i11 != 4) {
            mediaType = MediaType.UNKNOWN;
        } else {
            mediaType = MediaType.AUDIO;
        }
        return mediaType.getApiName();
    }

    public static final Pair<Integer, Integer> getAssetDimensionsFromCursor(ContentResolver contentResolver, e7.a aVar, Cursor cursor, int i11, int i12) {
        int iM;
        s.k(contentResolver, "contentResolver");
        s.k(cursor, "cursor");
        String string = cursor.getString(i12);
        if (i11 == 3) {
            try {
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(Uri.parse("file://" + string), "r");
                try {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever2 = mediaMetadataRetriever;
                        s.h(assetFileDescriptorOpenAssetFileDescriptor);
                        mediaMetadataRetriever2.setDataSource(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                        String strExtractMetadata = mediaMetadataRetriever2.extractMetadata(18);
                        s.h(strExtractMetadata);
                        int i13 = Integer.parseInt(strExtractMetadata);
                        String strExtractMetadata2 = mediaMetadataRetriever2.extractMetadata(19);
                        s.h(strExtractMetadata2);
                        int i14 = Integer.parseInt(strExtractMetadata2);
                        String strExtractMetadata3 = mediaMetadataRetriever2.extractMetadata(24);
                        s.h(strExtractMetadata3);
                        Pair<Integer, Integer> pairMaybeRotateAssetSize = maybeRotateAssetSize(i13, i14, Integer.parseInt(strExtractMetadata3));
                        un0.a.a(mediaMetadataRetriever, null);
                        b.a(assetFileDescriptorOpenAssetFileDescriptor, null);
                        return pairMaybeRotateAssetSize;
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            un0.a.a(mediaMetadataRetriever, th2);
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        b.a(assetFileDescriptorOpenAssetFileDescriptor, th4);
                        throw th5;
                    }
                }
            } catch (FileNotFoundException e11) {
                Log.e("expo-media-library", "ContentResolver failed to read " + string + ": " + e11.getMessage());
            } catch (NumberFormatException e12) {
                Log.e("expo-media-library", "MediaMetadataRetriever unexpectedly returned non-integer: " + e12.getMessage());
            } catch (RuntimeException e13) {
                Log.e("expo-media-library", "MediaMetadataRetriever finished with unexpected error: " + e13.getMessage());
            }
        }
        int columnIndex = cursor.getColumnIndex(Snapshot.WIDTH);
        int columnIndex2 = cursor.getColumnIndex(Snapshot.HEIGHT);
        int columnIndex3 = cursor.getColumnIndex("orientation");
        int i15 = cursor.getInt(columnIndex);
        int i16 = cursor.getInt(columnIndex2);
        int i17 = cursor.getInt(columnIndex3);
        if (i11 == 1 && (i15 <= 0 || i16 <= 0)) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(string, options);
            int i18 = options.outWidth;
            i16 = options.outHeight;
            i15 = i18;
        }
        if (aVar != null && ((iM = aVar.m("Orientation", 1)) == 5 || iM == 6 || iM == 7 || iM == 8)) {
            i17 = 90;
        }
        return maybeRotateAssetSize(i15, i16, i17);
    }

    public static final void getExifFullInfo(e7.a exifInterface, Bundle response) {
        s.k(exifInterface, "exifInterface");
        s.k(response, "response");
        Bundle bundle = new Bundle();
        for (String[] strArr : MediaLibraryConstantsKt.getEXIF_TAGS()) {
            String str = strArr[0];
            String str2 = strArr[1];
            if (exifInterface.k(str2) != null) {
                int iHashCode = str.hashCode();
                if (iHashCode != -1325958191) {
                    if (iHashCode != -891985903) {
                        if (iHashCode == 104431 && str.equals("int")) {
                            bundle.putInt(str2, exifInterface.m(str2, 0));
                        }
                    } else if (str.equals(InquiryField.StringField.TYPE)) {
                        bundle.putString(str2, exifInterface.k(str2));
                    }
                } else if (str.equals("double")) {
                    bundle.putDouble(str2, exifInterface.l(str2, 0.0d));
                }
            }
        }
        response.putParcelable("exif", bundle);
    }

    public static final Bundle getExifLocationForUri(ContentResolver contentResolver, Uri photoUri) {
        Bundle bundle;
        s.k(contentResolver, "contentResolver");
        s.k(photoUri, "photoUri");
        try {
            Uri requireOriginal = MediaStore.setRequireOriginal(photoUri);
            s.j(requireOriginal, "setRequireOriginal(...)");
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(requireOriginal);
            if (inputStreamOpenInputStream == null) {
                return null;
            }
            try {
                double[] dArrQ = new e7.a(inputStreamOpenInputStream).q();
                if (dArrQ != null) {
                    double d11 = dArrQ[0];
                    double d12 = dArrQ[1];
                    bundle = new Bundle();
                    bundle.putDouble(OrcaKeys.LATITUDE, d11);
                    bundle.putDouble(OrcaKeys.LONGITUDE, d12);
                } else {
                    bundle = null;
                }
                b.a(inputStreamOpenInputStream, null);
                return bundle;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    b.a(inputStreamOpenInputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException e11) {
            Log.w("expo-media-library", "Could not parse EXIF tags for " + photoUri);
            e11.printStackTrace();
            return null;
        } catch (UnsupportedOperationException unused) {
            throw new UnsupportedOperationException("Cannot access ExifInterface because of missing ACCESS_MEDIA_LOCATION permission");
        }
    }

    public static final Bundle getExifLocationLegacy(e7.a exifInterface) {
        s.k(exifInterface, "exifInterface");
        double[] dArrQ = exifInterface.q();
        if (dArrQ == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putDouble(OrcaKeys.LATITUDE, dArrQ[0]);
        bundle.putDouble(OrcaKeys.LONGITUDE, dArrQ[1]);
        return bundle;
    }

    public static final Pair<Integer, Integer> maybeRotateAssetSize(int i11, int i12, int i13) {
        return Math.abs(i13) % 180 == 90 ? new Pair<>(Integer.valueOf(i12), Integer.valueOf(i11)) : new Pair<>(Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static final void putAssetsInfo(ContentResolver contentResolver, Cursor cursor, List<Bundle> response, int i11, int i12, boolean z11) {
        e7.a aVar;
        Bundle exifLocationLegacy;
        s.k(contentResolver, "contentResolver");
        s.k(cursor, "cursor");
        s.k(response, "response");
        int columnIndex = cursor.getColumnIndex(Columns.ID);
        int columnIndex2 = cursor.getColumnIndex("_display_name");
        int columnIndex3 = cursor.getColumnIndex("media_type");
        int columnIndex4 = cursor.getColumnIndex("datetaken");
        int columnIndex5 = cursor.getColumnIndex("date_modified");
        int columnIndex6 = cursor.getColumnIndex("duration");
        int columnIndex7 = cursor.getColumnIndex("_data");
        int columnIndex8 = cursor.getColumnIndex("bucket_id");
        if (cursor.moveToPosition(i12)) {
            int i13 = 0;
            while (i13 < i11 && !cursor.isAfterLast()) {
                String string = cursor.getString(columnIndex);
                String string2 = cursor.getString(columnIndex7);
                int i14 = columnIndex;
                StringBuilder sb2 = new StringBuilder();
                int i15 = i13;
                sb2.append("file://");
                sb2.append(string2);
                String string3 = sb2.toString();
                int i16 = cursor.getInt(columnIndex3);
                int i17 = columnIndex3;
                if (i16 == 1) {
                    try {
                        aVar = new e7.a(string2);
                    } catch (IOException e11) {
                        Log.w("expo-media-library", "Could not parse EXIF tags for " + string3);
                        e11.printStackTrace();
                        aVar = null;
                    }
                } else {
                    aVar = null;
                }
                Pair<Integer, Integer> assetDimensionsFromCursor = getAssetDimensionsFromCursor(contentResolver, aVar, cursor, i16, columnIndex7);
                int iIntValue = assetDimensionsFromCursor.a().intValue();
                int i18 = columnIndex7;
                int iIntValue2 = assetDimensionsFromCursor.b().intValue();
                Bundle bundle = new Bundle();
                bundle.putString("id", string);
                bundle.putString("filename", cursor.getString(columnIndex2));
                bundle.putString("uri", string3);
                bundle.putString("mediaType", exportMediaType(i16));
                int i19 = columnIndex2;
                bundle.putLong(Snapshot.WIDTH, iIntValue);
                bundle.putLong(Snapshot.HEIGHT, iIntValue2);
                bundle.putLong("creationTime", cursor.getLong(columnIndex4));
                bundle.putDouble("modificationTime", cursor.getLong(columnIndex5) * 1000.0d);
                bundle.putDouble("duration", ((double) cursor.getInt(columnIndex6)) / 1000.0d);
                bundle.putString("albumId", cursor.getString(columnIndex8));
                if (z11 && aVar != null) {
                    getExifFullInfo(aVar, bundle);
                    if (Build.VERSION.SDK_INT >= 29) {
                        Uri uriWithAppendedPath = Uri.withAppendedPath(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, string);
                        s.h(uriWithAppendedPath);
                        exifLocationLegacy = getExifLocationForUri(contentResolver, uriWithAppendedPath);
                    } else {
                        exifLocationLegacy = getExifLocationLegacy(aVar);
                    }
                    bundle.putParcelable("location", exifLocationLegacy);
                    bundle.putString("localUri", string3);
                }
                cursor.moveToNext();
                response.add(bundle);
                i13 = i15 + 1;
                columnIndex2 = i19;
                columnIndex = i14;
                columnIndex3 = i17;
                columnIndex7 = i18;
            }
        }
    }

    public static final void queryAssetInfo(Context context, String str, String[] strArr, boolean z11, Promise promise) {
        s.k(context, "context");
        s.k(promise, "promise");
        ContentResolver contentResolver = context.getContentResolver();
        try {
            Cursor cursorQuery = contentResolver.query(MediaLibraryConstantsKt.getEXTERNAL_CONTENT_URI(), MediaLibraryConstantsKt.getASSET_PROJECTION(), str, strArr, null);
            try {
                if (cursorQuery == null) {
                    throw new AssetQueryException();
                }
                if (cursorQuery.getCount() == 1) {
                    cursorQuery.moveToFirst();
                    ArrayList arrayList = new ArrayList();
                    s.h(contentResolver);
                    putAssetsInfo(contentResolver, cursorQuery, arrayList, 1, 0, z11);
                    promise.resolve((Collection<? extends Object>) arrayList);
                } else {
                    promise.resolve((Object) null);
                }
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
            promise.reject(MediaLibraryConstantsKt.ERROR_IO_EXCEPTION, "Could not read file", e11);
        } catch (SecurityException e12) {
            promise.reject(MediaLibraryConstantsKt.ERROR_UNABLE_TO_LOAD_PERMISSION, "Could not get asset: need READ_EXTERNAL_STORAGE permission.", e12);
        } catch (UnsupportedOperationException e13) {
            e13.printStackTrace();
            promise.reject(MediaLibraryConstantsKt.ERROR_NO_PERMISSIONS, e13.getMessage(), e13);
        }
    }
}
