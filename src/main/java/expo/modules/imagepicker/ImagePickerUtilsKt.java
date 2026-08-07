package expo.modules.imagepicker;

import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ImagesContract;
import expo.modules.core.utilities.FileUtilities;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import jn0.h0;
import jn0.x;
import kotlinx.coroutines.InterruptibleKt;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.collections.v;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;
import p013kotlin.text.t;
import sn0.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0011\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0013\u0010\u0016\u001a\u00020\u0002*\u00020\u0013H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0016\u001a\u00020\u0002*\u00020\u0002H\u0000¢\u0006\u0004\b\u0016\u0010\u000e\u001a\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u001b\u001a\u001b\u0010\u001f\u001a\u00020\u001d*\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0019\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\"*\u00020!H\u0000¢\u0006\u0004\b#\u0010$\u001a(\u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b(\u0010)\u001a(\u0010*\u001a\u00020'2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0080@¢\u0006\u0004\b*\u0010)\u001a\u0015\u0010+\u001a\u0004\u0018\u00010\u0002*\u00020\bH\u0000¢\u0006\u0004\b+\u0010,\"\u001b\u00102\u001a\b\u0012\u0004\u0012\u00020/0.*\u00020-8F¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0018\u00104\u001a\u000203*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u00105\"\u0018\u00106\u001a\u000203*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b6\u00105\"\u0018\u00107\u001a\u000203*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00105¨\u00068"}, d2 = {"Ljava/io/File;", "cacheDir", "", "extension", "createOutputFile", "(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;", "Landroid/content/ContentResolver;", "contentResolver", "Landroid/net/Uri;", "uri", "getType", "(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/lang/String;", ImagesContract.URL, "getTypeFromFileUrl", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "toContentUri", "(Ljava/io/File;Landroid/content/Context;)Landroid/net/Uri;", "Landroid/graphics/Bitmap$CompressFormat;", "toBitmapCompressFormat", "(Ljava/io/File;)Landroid/graphics/Bitmap$CompressFormat;", "toImageFileExtension", "(Landroid/graphics/Bitmap$CompressFormat;)Ljava/lang/String;", "Lexpo/modules/imagepicker/MediaType;", "toMediaType", "(Landroid/net/Uri;Landroid/content/ContentResolver;)Lexpo/modules/imagepicker/MediaType;", "(Ljava/lang/String;)Landroid/graphics/Bitmap$CompressFormat;", "Landroid/media/MediaMetadataRetriever;", "", Action.KEY_ATTRIBUTE, "extractInt", "(Landroid/media/MediaMetadataRetriever;I)I", "Landroid/content/Intent;", "", "getAllDataUris", "(Landroid/content/Intent;)Ljava/util/List;", "sourceUri", "targetFile", "Ljn0/h0;", "copyFile", "(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyExifData", "getMediaStoreAssetId", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ClipData;", "", "Landroid/content/ClipData$Item;", "getItems", "(Landroid/content/ClipData;)Ljava/lang/Iterable;", "items", "", "isMediaProviderUri", "(Landroid/net/Uri;)Z", "isDownloadsProviderUri", "isMediaStoreAssetUri", "expo-image-picker_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ImagePickerUtilsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Object copyExifData(final Uri uri, final File file, final ContentResolver contentResolver, Continuation<? super h0> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new wn0.a() { // from class: expo.modules.imagepicker.c
            @Override // wn0.a
            public final Object invoke() {
                return ImagePickerUtilsKt.copyExifData$lambda$13(file, uri, contentResolver);
            }
        }, continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 copyExifData$lambda$13(File file, Uri uri, ContentResolver contentResolver) throws FailedToWriteFileException, FailedToReadFileException {
        if (uri.compareTo(Uri.fromFile(file)) == 0) {
            return h0.f84049a;
        }
        List listP = v.p("ImageLength", "ImageWidth", "PixelXDimension", "PixelYDimension", "Orientation");
        try {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FailedToReadFileException(p5.b.a(uri), null, 2, null);
            }
            try {
                e7.a aVar = new e7.a(inputStreamOpenInputStream);
                e7.a aVar2 = new e7.a(file);
                Iterable<Pair<String, String>> exif_tags = ImagePickerConstants.INSTANCE.getEXIF_TAGS();
                ArrayList arrayList = new ArrayList();
                for (Pair<String, String> pair : exif_tags) {
                    if (!listP.contains(pair.b())) {
                        arrayList.add(pair);
                    }
                }
                ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) ((Pair) it.next()).b();
                    arrayList2.add(x.a(str, aVar.k(str)));
                }
                ArrayList<Pair> arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (((String) ((Pair) obj).b()) != null) {
                        arrayList3.add(obj);
                    }
                }
                for (Pair pair2 : arrayList3) {
                    aVar2.h0((String) pair2.a(), (String) pair2.b());
                }
                try {
                    aVar2.c0();
                    h0 h0Var = h0.f84049a;
                    sn0.b.a(inputStreamOpenInputStream, null);
                    return h0.f84049a;
                } catch (IOException e11) {
                    throw new FailedToWriteExifDataToFileException(file, e11);
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(inputStreamOpenInputStream, th2);
                    throw th3;
                }
            }
        } catch (FileNotFoundException e12) {
            throw new FailedToWriteFileException(file, e12);
        }
    }

    public static final Object copyFile(final Uri uri, final File file, final ContentResolver contentResolver, Continuation<? super h0> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new wn0.a() { // from class: expo.modules.imagepicker.b
            @Override // wn0.a
            public final Object invoke() {
                return ImagePickerUtilsKt.copyFile$lambda$7(file, uri, contentResolver);
            }
        }, continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 copyFile$lambda$7(File file, Uri uri, ContentResolver contentResolver) throws FailedToWriteFileException, FailedToReadFileException {
        if (uri.compareTo(Uri.fromFile(file)) == 0) {
            return h0.f84049a;
        }
        try {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FailedToReadFileException(p5.b.a(uri), null, 2, null);
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    sn0.a.b(inputStreamOpenInputStream, fileOutputStream, 0, 2, null);
                    h0 h0Var = h0.f84049a;
                    sn0.b.a(fileOutputStream, null);
                    sn0.b.a(inputStreamOpenInputStream, null);
                    return h0Var;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    sn0.b.a(inputStreamOpenInputStream, th4);
                    throw th5;
                }
            }
        } catch (FileNotFoundException e11) {
            throw new FailedToWriteFileException(file, e11);
        }
    }

    public static final File createOutputFile(File cacheDir, String extension) throws IOException, FailedToCreateFileException {
        s.k(cacheDir, "cacheDir");
        s.k(extension, "extension");
        String strGenerateOutputPath = FileUtilities.generateOutputPath(cacheDir, ImagePickerConstants.CACHE_DIR_NAME, extension);
        try {
            File file = new File(strGenerateOutputPath);
            file.createNewFile();
            return file;
        } catch (IOException e11) {
            s.h(strGenerateOutputPath);
            throw new FailedToCreateFileException(strGenerateOutputPath, e11);
        }
    }

    public static final int extractInt(MediaMetadataRetriever mediaMetadataRetriever, int i11) throws FailedToExtractVideoMetadataException {
        s.k(mediaMetadataRetriever, "<this>");
        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(i11);
        if (strExtractMetadata != null) {
            return Integer.parseInt(strExtractMetadata);
        }
        throw new FailedToExtractVideoMetadataException(null, null, 3, null);
    }

    public static final List<Uri> getAllDataUris(Intent intent) {
        Iterable<ClipData.Item> items;
        s.k(intent, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Uri data = intent.getData();
        if (data != null) {
            linkedHashSet.add(data);
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null && (items = getItems(clipData)) != null) {
            ArrayList arrayList = new ArrayList(v.y(items, 10));
            Iterator<ClipData.Item> it = items.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getUri());
            }
            linkedHashSet.addAll(arrayList);
        }
        return v.m1(linkedHashSet);
    }

    public static final Iterable<ClipData.Item> getItems(ClipData clipData) {
        s.k(clipData, "<this>");
        return new ImagePickerUtilsKt$items$1(clipData);
    }

    public static final String getMediaStoreAssetId(Uri uri) {
        s.k(uri, "<this>");
        if (!isMediaStoreAssetUri(uri)) {
            return null;
        }
        String documentId = DocumentsContract.getDocumentId(uri);
        s.h(documentId);
        return t.g0(documentId, CoreConstants.COLON_CHAR, false, 2, null) ? (String) t.e1(documentId, new char[]{CoreConstants.COLON_CHAR}, false, 0, 6, null).get(1) : documentId;
    }

    public static final String getType(ContentResolver contentResolver, Uri uri) throws FailedToDeduceTypeException {
        s.k(contentResolver, "contentResolver");
        s.k(uri, "uri");
        String type = contentResolver.getType(uri);
        if (type != null) {
            return type;
        }
        String string = uri.toString();
        s.j(string, "toString(...)");
        String typeFromFileUrl = getTypeFromFileUrl(string);
        if (typeFromFileUrl != null) {
            return typeFromFileUrl;
        }
        throw new FailedToDeduceTypeException();
    }

    private static final String getTypeFromFileUrl(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    public static final boolean isDownloadsProviderUri(Uri uri) {
        s.k(uri, "<this>");
        return s.f(uri.getAuthority(), "com.android.providers.downloads.documents");
    }

    public static final boolean isMediaProviderUri(Uri uri) {
        s.k(uri, "<this>");
        return s.f(uri.getAuthority(), "com.android.providers.media.documents");
    }

    public static final boolean isMediaStoreAssetUri(Uri uri) {
        s.k(uri, "<this>");
        if (isMediaProviderUri(uri)) {
            return true;
        }
        if (isDownloadsProviderUri(uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            s.j(documentId, "getDocumentId(...)");
            if (t.b0(documentId, "msf:", false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public static final Bitmap.CompressFormat toBitmapCompressFormat(File file) {
        s.k(file, "<this>");
        return t.K(h.C(file), "png", true) ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    public static final Uri toContentUri(File file, Context context) {
        s.k(file, "<this>");
        s.k(context, "context");
        try {
            return FileProvider.getUriForFile(context, context.getPackageName() + ".ImagePickerFileProvider", file);
        } catch (Exception unused) {
            return Uri.fromFile(file);
        }
    }

    public static final String toImageFileExtension(Bitmap.CompressFormat compressFormat) {
        s.k(compressFormat, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[compressFormat.ordinal()];
        if (i11 == 1) {
            return ".png";
        }
        if (i11 == 2) {
            return ".jpeg";
        }
        throw new RuntimeException("Compress format not supported '" + compressFormat.name() + "'");
    }

    public static final MediaType toMediaType(Uri uri, ContentResolver contentResolver) throws FailedToDeduceTypeException {
        s.k(uri, "<this>");
        s.k(contentResolver, "contentResolver");
        String type = getType(contentResolver, uri);
        if (t.h0(type, "image/", false, 2, null)) {
            return MediaType.IMAGE;
        }
        if (t.h0(type, "video/", false, 2, null)) {
            return MediaType.VIDEO;
        }
        throw new FailedToDeduceTypeException();
    }

    public static final Bitmap.CompressFormat toBitmapCompressFormat(String str) {
        s.k(str, "<this>");
        if (!t.K(str, "png", true) && !t.K(str, "gif", true) && !t.K(str, "bmp", true) && !t.K(str, "webp", true)) {
            if (!t.K(str, "jpeg", true)) {
                Log.w(ImagePickerConstants.TAG, "Image file " + str + " is of unsupported type. Falling back to JPEG instead.");
            }
            return Bitmap.CompressFormat.JPEG;
        }
        return Bitmap.CompressFormat.PNG;
    }

    public static final String toImageFileExtension(String str) {
        s.k(str, "<this>");
        if (t.K(str, "png", true)) {
            return ".png";
        }
        if (t.K(str, "gif", true)) {
            return ".gif";
        }
        if (t.K(str, "bmp", true)) {
            return ".bmp";
        }
        if (t.K(str, "webp", true)) {
            return ".webp";
        }
        if (!t.K(str, "jpeg", true)) {
            Log.w(ImagePickerConstants.TAG, "Image file " + str + " is of unsupported type. Falling back to JPEG instead.");
        }
        return ".jpeg";
    }
}
