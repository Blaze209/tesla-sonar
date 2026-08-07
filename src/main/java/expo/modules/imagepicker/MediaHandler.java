package expo.modules.imagepicker;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import ch.qos.logback.core.CoreConstants;
import expo.modules.imagepicker.exporters.CompressionImageExporter;
import expo.modules.imagepicker.exporters.ImageExportResult;
import expo.modules.imagepicker.exporters.ImageExporter;
import expo.modules.imagepicker.exporters.RawImageExporter;
import expo.modules.kotlin.providers.AppContextProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import jn0.t;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.Boxing;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.l0;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\n\u001a\u00020\u000b2\u0018\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0080@¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020\u0010H\u0002J\u0016\u0010 \u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010!R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0015\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lexpo/modules/imagepicker/MediaHandler;", "", "appContextProvider", "Lexpo/modules/kotlin/providers/AppContextProvider;", "<init>", "(Lexpo/modules/kotlin/providers/AppContextProvider;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "readExtras", "Lexpo/modules/imagepicker/ImagePickerResponse;", "bareResult", "", "Lkotlin/Pair;", "Lexpo/modules/imagepicker/MediaType;", "Landroid/net/Uri;", "options", "Lexpo/modules/imagepicker/ImagePickerOptions;", "readExtras$expo_image_picker_release", "(Ljava/util/List;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheDirectory", "Ljava/io/File;", "getCacheDirectory", "()Ljava/io/File;", "handleImage", "Lexpo/modules/imagepicker/ImagePickerAsset;", "sourceUri", "(Landroid/net/Uri;Lexpo/modules/imagepicker/ImagePickerOptions;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAdditionalFileData", "Lexpo/modules/imagepicker/AdditionalFileData;", "uri", "handleVideo", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaHandler {
    private final AppContextProvider appContextProvider;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaType.values().length];
            try {
                iArr[MediaType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaType.IMAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagepicker.MediaHandler$handleImage$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagepicker.MediaHandler", f = "MediaHandler.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {53, 55, 58}, m = "handleImage", n = {"this", "sourceUri", "options", "mimeType", "outputFile", "this", "sourceUri", "options", "mimeType", "outputFile", "exportedImage", "this", "sourceUri", "mimeType", "outputFile", "exportedImage", "base64"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaHandler.this.handleImage(null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagepicker.MediaHandler$handleVideo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagepicker.MediaHandler", f = "MediaHandler.kt", i = {0, 0, 0}, l = {93}, m = "handleVideo", n = {"this", "sourceUri", "outputFile"}, s = {"L$0", "L$1", "L$2"})
    static final class C46281 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C46281(Continuation<? super C46281> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MediaHandler.this.handleVideo(null, this);
        }
    }

    public MediaHandler(AppContextProvider appContextProvider) {
        s.k(appContextProvider, "appContextProvider");
        this.appContextProvider = appContextProvider;
    }

    private final AdditionalFileData getAdditionalFileData(Uri uri) {
        Cursor cursorQuery = getContext().getContentResolver().query(uri, null, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            int columnIndex = cursorQuery.getColumnIndex("_display_name");
            int columnIndex2 = cursorQuery.getColumnIndex("_size");
            cursorQuery.moveToFirst();
            AdditionalFileData additionalFileData = new AdditionalFileData(cursorQuery.getString(columnIndex), Long.valueOf(cursorQuery.getLong(columnIndex2)));
            sn0.b.a(cursorQuery, null);
            return additionalFileData;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(cursorQuery, th2);
                throw th3;
            }
        }
    }

    private final File getCacheDirectory() {
        return this.appContextProvider.getAppContext().getCacheDirectory();
    }

    private final Context getContext() {
        Context reactContext = this.appContextProvider.getAppContext().getReactContext();
        if (reactContext != null) {
            return reactContext;
        }
        throw new IllegalArgumentException("React Application Context is null");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:37:0x0130  */
    /* JADX WARN: Code duplicated, block: B:38:0x013e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0154  */
    /* JADX WARN: Code duplicated, block: B:45:0x0157  */
    /* JADX WARN: Code duplicated, block: B:48:0x0177  */
    /* JADX WARN: Code duplicated, block: B:51:0x0189  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object handleImage(Uri uri, ImagePickerOptions imagePickerOptions, Continuation<? super ImagePickerAsset> continuation) throws IOException, FailedToCreateFileException, FailedToDeduceTypeException {
        AnonymousClass1 anonymousClass1;
        ImagePickerOptions imagePickerOptions2;
        MediaHandler mediaHandler;
        String str;
        File file;
        ImageExportResult imageExportResult;
        Uri uri2;
        ImageExportResult imageExportResult2;
        ImagePickerOptions imagePickerOptions3;
        MediaHandler mediaHandler2;
        Uri uri3;
        String str2;
        Boolean boolBoxBoolean;
        String str3;
        Object objExif;
        ImageExportResult imageExportResult3;
        String str4;
        Uri uri4;
        MediaHandler mediaHandler3;
        ByteArrayOutputStream byteArrayOutputStream;
        AdditionalFileData additionalFileData;
        String name;
        long length;
        Long fileSize;
        Uri uri5 = uri;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i11 = anonymousClass1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i11 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objExportAsync = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anonymousClass1.label;
        Bundle bundle = null;
        if (i12 == 0) {
            t.b(objExportAsync);
            ImageExporter rawImageExporter = imagePickerOptions.getQuality() == 1.0d ? new RawImageExporter() : new CompressionImageExporter(this.appContextProvider, imagePickerOptions.getQuality());
            ContentResolver contentResolver = getContext().getContentResolver();
            s.j(contentResolver, "getContentResolver(...)");
            String type = ImagePickerUtilsKt.getType(contentResolver, uri5);
            File fileCreateOutputFile = ImagePickerUtilsKt.createOutputFile(getCacheDirectory(), ImagePickerUtilsKt.toImageFileExtension(type));
            ContentResolver contentResolver2 = getContext().getContentResolver();
            s.j(contentResolver2, "getContentResolver(...)");
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = uri5;
            imagePickerOptions2 = imagePickerOptions;
            anonymousClass1.L$2 = imagePickerOptions2;
            anonymousClass1.L$3 = type;
            anonymousClass1.L$4 = fileCreateOutputFile;
            anonymousClass1.label = 1;
            objExportAsync = rawImageExporter.exportAsync(uri5, fileCreateOutputFile, contentResolver2, anonymousClass1);
            if (objExportAsync != coroutine_suspended) {
                mediaHandler = this;
                str = type;
                file = fileCreateOutputFile;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            File file2 = (File) anonymousClass1.L$4;
            String str5 = (String) anonymousClass1.L$3;
            ImagePickerOptions imagePickerOptions4 = (ImagePickerOptions) anonymousClass1.L$2;
            Uri uri6 = (Uri) anonymousClass1.L$1;
            mediaHandler = (MediaHandler) anonymousClass1.L$0;
            t.b(objExportAsync);
            imagePickerOptions2 = imagePickerOptions4;
            str = str5;
            file = file2;
            uri5 = uri6;
        } else {
            if (i12 == 2) {
                imageExportResult2 = (ImageExportResult) anonymousClass1.L$5;
                file = (File) anonymousClass1.L$4;
                str = (String) anonymousClass1.L$3;
                imagePickerOptions3 = (ImagePickerOptions) anonymousClass1.L$2;
                uri2 = (Uri) anonymousClass1.L$1;
                mediaHandler2 = (MediaHandler) anonymousClass1.L$0;
                t.b(objExportAsync);
                byteArrayOutputStream = (ByteArrayOutputStream) objExportAsync;
                if (byteArrayOutputStream != null) {
                    String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                    imageExportResult = imageExportResult2;
                    str2 = strEncodeToString;
                    uri3 = uri2;
                    mediaHandler = mediaHandler2;
                } else {
                    imageExportResult = imageExportResult2;
                    uri5 = uri2;
                    mediaHandler = mediaHandler2;
                    imagePickerOptions2 = imagePickerOptions3;
                    uri3 = uri5;
                    str2 = null;
                    imagePickerOptions3 = imagePickerOptions2;
                }
                boolBoxBoolean = Boxing.boxBoolean(imagePickerOptions3.getExif());
                if (!boolBoxBoolean.booleanValue()) {
                    boolBoxBoolean = null;
                }
                if (boolBoxBoolean != null) {
                    ContentResolver contentResolver3 = mediaHandler.getContext().getContentResolver();
                    s.j(contentResolver3, "getContentResolver(...)");
                    anonymousClass1.L$0 = mediaHandler;
                    anonymousClass1.L$1 = uri3;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = file;
                    anonymousClass1.L$4 = imageExportResult;
                    anonymousClass1.L$5 = str2;
                    anonymousClass1.label = 3;
                    objExif = imageExportResult.exif(contentResolver3, anonymousClass1);
                    if (objExif != coroutine_suspended) {
                        imageExportResult3 = imageExportResult;
                        objExportAsync = objExif;
                        str4 = str;
                        uri4 = uri3;
                        mediaHandler3 = mediaHandler;
                    }
                    return coroutine_suspended;
                }
                str3 = str;
                String str6 = str2;
                Bundle bundle2 = bundle;
                additionalFileData = mediaHandler.getAdditionalFileData(uri3);
                MediaType mediaType = MediaType.IMAGE;
                String string = Uri.fromFile(file).toString();
                s.j(string, "toString(...)");
                int width = imageExportResult.getWidth();
                int height = imageExportResult.getHeight();
                if (additionalFileData != null || (name = additionalFileData.getFileName()) == null) {
                    name = file.getName();
                }
                String str7 = name;
                if (additionalFileData != null || (fileSize = additionalFileData.getFileSize()) == null) {
                    length = file.length();
                } else {
                    length = fileSize.longValue();
                }
                return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri3), mediaType, string, width, height, str7, Boxing.boxLong(length), str3, str6, bundle2, null, null, 3072, null);
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (String) anonymousClass1.L$5;
            imageExportResult3 = (ImageExportResult) anonymousClass1.L$4;
            file = (File) anonymousClass1.L$3;
            str4 = (String) anonymousClass1.L$2;
            uri4 = (Uri) anonymousClass1.L$1;
            mediaHandler3 = (MediaHandler) anonymousClass1.L$0;
            t.b(objExportAsync);
        }
        bundle = (Bundle) objExportAsync;
        mediaHandler = mediaHandler3;
        imageExportResult = imageExportResult3;
        str3 = str4;
        uri3 = uri4;
        String str8 = str2;
        Bundle bundle3 = bundle;
        additionalFileData = mediaHandler.getAdditionalFileData(uri3);
        MediaType mediaType2 = MediaType.IMAGE;
        String string2 = Uri.fromFile(file).toString();
        s.j(string2, "toString(...)");
        int width2 = imageExportResult.getWidth();
        int height2 = imageExportResult.getHeight();
        if (additionalFileData != null) {
            name = file.getName();
        } else {
            name = file.getName();
        }
        String str9 = name;
        if (additionalFileData != null) {
            length = file.length();
        } else {
            length = file.length();
        }
        return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri3), mediaType2, string2, width2, height2, str9, Boxing.boxLong(length), str3, str8, bundle3, null, null, 3072, null);
        imageExportResult = (ImageExportResult) objExportAsync;
        Boolean boolBoxBoolean2 = Boxing.boxBoolean(imagePickerOptions2.getBase64());
        if (!boolBoxBoolean2.booleanValue()) {
            boolBoxBoolean2 = null;
        }
        if (boolBoxBoolean2 == null) {
            uri3 = uri5;
            str2 = null;
            imagePickerOptions3 = imagePickerOptions2;
            boolBoxBoolean = Boxing.boxBoolean(imagePickerOptions3.getExif());
            if (!boolBoxBoolean.booleanValue()) {
                boolBoxBoolean = null;
            }
            if (boolBoxBoolean != null) {
                ContentResolver contentResolver4 = mediaHandler.getContext().getContentResolver();
                s.j(contentResolver4, "getContentResolver(...)");
                anonymousClass1.L$0 = mediaHandler;
                anonymousClass1.L$1 = uri3;
                anonymousClass1.L$2 = str;
                anonymousClass1.L$3 = file;
                anonymousClass1.L$4 = imageExportResult;
                anonymousClass1.L$5 = str2;
                anonymousClass1.label = 3;
                objExif = imageExportResult.exif(contentResolver4, anonymousClass1);
                if (objExif != coroutine_suspended) {
                    imageExportResult3 = imageExportResult;
                    objExportAsync = objExif;
                    str4 = str;
                    uri4 = uri3;
                    mediaHandler3 = mediaHandler;
                    bundle = (Bundle) objExportAsync;
                    mediaHandler = mediaHandler3;
                    imageExportResult = imageExportResult3;
                    str3 = str4;
                    uri3 = uri4;
                }
            } else {
                str3 = str;
            }
            String str10 = str2;
            Bundle bundle4 = bundle;
            additionalFileData = mediaHandler.getAdditionalFileData(uri3);
            MediaType mediaType3 = MediaType.IMAGE;
            String string3 = Uri.fromFile(file).toString();
            s.j(string3, "toString(...)");
            int width3 = imageExportResult.getWidth();
            int height3 = imageExportResult.getHeight();
            if (additionalFileData != null) {
                name = file.getName();
            } else {
                name = file.getName();
            }
            String str11 = name;
            if (additionalFileData != null) {
                length = file.length();
            } else {
                length = file.length();
            }
            return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri3), mediaType3, string3, width3, height3, str11, Boxing.boxLong(length), str3, str10, bundle4, null, null, 3072, null);
        }
        ContentResolver contentResolver5 = mediaHandler.getContext().getContentResolver();
        s.j(contentResolver5, "getContentResolver(...)");
        anonymousClass1.L$0 = mediaHandler;
        anonymousClass1.L$1 = uri5;
        anonymousClass1.L$2 = imagePickerOptions2;
        anonymousClass1.L$3 = str;
        anonymousClass1.L$4 = file;
        anonymousClass1.L$5 = imageExportResult;
        anonymousClass1.label = 2;
        Object objData = imageExportResult.data(contentResolver5, anonymousClass1);
        if (objData != coroutine_suspended) {
            MediaHandler mediaHandler4 = mediaHandler;
            uri2 = uri5;
            imageExportResult2 = imageExportResult;
            objExportAsync = objData;
            imagePickerOptions3 = imagePickerOptions2;
            mediaHandler2 = mediaHandler4;
            byteArrayOutputStream = (ByteArrayOutputStream) objExportAsync;
            if (byteArrayOutputStream != null) {
                String strEncodeToString2 = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                imageExportResult = imageExportResult2;
                str2 = strEncodeToString2;
                uri3 = uri2;
                mediaHandler = mediaHandler2;
            } else {
                imageExportResult = imageExportResult2;
                uri5 = uri2;
                mediaHandler = mediaHandler2;
                imagePickerOptions2 = imagePickerOptions3;
                uri3 = uri5;
                str2 = null;
                imagePickerOptions3 = imagePickerOptions2;
            }
            boolBoxBoolean = Boxing.boxBoolean(imagePickerOptions3.getExif());
            if (!boolBoxBoolean.booleanValue()) {
                boolBoxBoolean = null;
            }
            if (boolBoxBoolean != null) {
                ContentResolver contentResolver6 = mediaHandler.getContext().getContentResolver();
                s.j(contentResolver6, "getContentResolver(...)");
                anonymousClass1.L$0 = mediaHandler;
                anonymousClass1.L$1 = uri3;
                anonymousClass1.L$2 = str;
                anonymousClass1.L$3 = file;
                anonymousClass1.L$4 = imageExportResult;
                anonymousClass1.L$5 = str2;
                anonymousClass1.label = 3;
                objExif = imageExportResult.exif(contentResolver6, anonymousClass1);
                if (objExif != coroutine_suspended) {
                    imageExportResult3 = imageExportResult;
                    objExportAsync = objExif;
                    str4 = str;
                    uri4 = uri3;
                    mediaHandler3 = mediaHandler;
                    bundle = (Bundle) objExportAsync;
                    mediaHandler = mediaHandler3;
                    imageExportResult = imageExportResult3;
                    str3 = str4;
                    uri3 = uri4;
                }
            } else {
                str3 = str;
            }
            String str12 = str2;
            Bundle bundle5 = bundle;
            additionalFileData = mediaHandler.getAdditionalFileData(uri3);
            MediaType mediaType4 = MediaType.IMAGE;
            String string4 = Uri.fromFile(file).toString();
            s.j(string4, "toString(...)");
            int width4 = imageExportResult.getWidth();
            int height4 = imageExportResult.getHeight();
            if (additionalFileData != null) {
                name = file.getName();
            } else {
                name = file.getName();
            }
            String str13 = name;
            if (additionalFileData != null) {
                length = file.length();
            } else {
                length = file.length();
            }
            return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri3), mediaType4, string4, width4, height4, str13, Boxing.boxLong(length), str3, str12, bundle5, null, null, 3072, null);
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object handleVideo(Uri uri, Continuation<? super ImagePickerAsset> continuation) throws IOException, FailedToCreateFileException, FailedToDeduceTypeException, FailedToExtractVideoMetadataException {
        C46281 c46281;
        File fileCreateOutputFile;
        MediaHandler mediaHandler;
        Uri uri2 = uri;
        if (continuation instanceof C46281) {
            c46281 = (C46281) continuation;
            int i11 = c46281.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c46281.label = i11 - Integer.MIN_VALUE;
            } else {
                c46281 = new C46281(continuation);
            }
        } else {
            c46281 = new C46281(continuation);
        }
        Object obj = c46281.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c46281.label;
        if (i12 == 0) {
            t.b(obj);
            fileCreateOutputFile = ImagePickerUtilsKt.createOutputFile(getCacheDirectory(), ".mp4");
            ContentResolver contentResolver = getContext().getContentResolver();
            s.j(contentResolver, "getContentResolver(...)");
            c46281.L$0 = this;
            c46281.L$1 = uri2;
            c46281.L$2 = fileCreateOutputFile;
            c46281.label = 1;
            if (ImagePickerUtilsKt.copyFile(uri2, fileCreateOutputFile, contentResolver, c46281) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mediaHandler = this;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            File file = (File) c46281.L$2;
            Uri uri3 = (Uri) c46281.L$1;
            mediaHandler = (MediaHandler) c46281.L$0;
            t.b(obj);
            fileCreateOutputFile = file;
            uri2 = uri3;
        }
        Uri uriFromFile = Uri.fromFile(fileCreateOutputFile);
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(mediaHandler.getContext(), uriFromFile);
            AdditionalFileData additionalFileData = mediaHandler.getAdditionalFileData(uri2);
            ContentResolver contentResolver2 = mediaHandler.getContext().getContentResolver();
            s.j(contentResolver2, "getContentResolver(...)");
            String type = ImagePickerUtilsKt.getType(contentResolver2, uri2);
            l0 l0Var = new l0();
            l0Var.f86527a = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 18);
            l0 l0Var2 = new l0();
            l0Var2.f86527a = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 19);
            int iExtractInt = ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 24);
            if (iExtractInt % 180 != 0) {
                int i13 = l0Var2.f86527a;
                l0Var2.f86527a = l0Var.f86527a;
                l0Var.f86527a = i13;
            }
            MediaType mediaType = MediaType.VIDEO;
            String string = uriFromFile.toString();
            s.j(string, "toString(...)");
            return new ImagePickerAsset(ImagePickerUtilsKt.getMediaStoreAssetId(uri2), mediaType, string, l0Var.f86527a, l0Var2.f86527a, additionalFileData != null ? additionalFileData.getFileName() : null, additionalFileData != null ? additionalFileData.getFileSize() : null, type, null, null, Boxing.boxInt(ImagePickerUtilsKt.extractInt(mediaMetadataRetriever, 9)), Boxing.boxInt(iExtractInt), 768, null);
        } catch (FailedToExtractVideoMetadataException e11) {
            throw new FailedToExtractVideoMetadataException(fileCreateOutputFile, e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0081  */
    /* JADX WARN: Code duplicated, block: B:29:0x00be  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00b2 -> B:26:0x00b5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object readExtras$expo_image_picker_release(java.util.List<? extends p013kotlin.Pair<? extends expo.modules.imagepicker.MediaType, ? extends android.net.Uri>> r9, expo.modules.imagepicker.ImagePickerOptions r10, p013kotlin.coroutines.Continuation<? super expo.modules.imagepicker.ImagePickerResponse> r11) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.imagepicker.MediaHandler.readExtras$expo_image_picker_release(java.util.List, expo.modules.imagepicker.ImagePickerOptions, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
