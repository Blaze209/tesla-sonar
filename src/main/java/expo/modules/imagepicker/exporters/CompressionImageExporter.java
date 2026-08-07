package expo.modules.imagepicker.exporters;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import expo.modules.imagepicker.FailedToReadFileException;
import expo.modules.imagepicker.FailedToWriteFileException;
import expo.modules.imagepicker.ImagePickerUtilsKt;
import expo.modules.imagepicker.MissingModuleException;
import expo.modules.interfaces.imageloader.ImageLoaderInterface;
import expo.modules.kotlin.providers.AppContextProvider;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import jn0.t;
import kotlinx.coroutines.InterruptibleKt;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.ContinuationImpl;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@¢\u0006\u0002\u0010\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0015J&\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001aH\u0082@¢\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lexpo/modules/imagepicker/exporters/CompressionImageExporter;", "Lexpo/modules/imagepicker/exporters/ImageExporter;", "appContextProvider", "Lexpo/modules/kotlin/providers/AppContextProvider;", "quality", "", "<init>", "(Lexpo/modules/kotlin/providers/AppContextProvider;D)V", "compressQuality", "", "exportAsync", "Lexpo/modules/imagepicker/exporters/ImageExportResult;", "source", "Landroid/net/Uri;", "output", "Ljava/io/File;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/net/Uri;Ljava/io/File;Landroid/content/ContentResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readBitmap", "Landroid/graphics/Bitmap;", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeImage", "", "bitmap", "compressFormat", "Landroid/graphics/Bitmap$CompressFormat;", "(Landroid/graphics/Bitmap;Ljava/io/File;Landroid/graphics/Bitmap$CompressFormat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CompressionImageExporter implements ImageExporter {
    private final AppContextProvider appContextProvider;
    private final int compressQuality;

    /* JADX INFO: renamed from: expo.modules.imagepicker.exporters.CompressionImageExporter$exportAsync$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagepicker.exporters.CompressionImageExporter", f = "CompressionImageExporter.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2}, l = {34, 36, 37}, m = "exportAsync", n = {"this", "source", "output", "contentResolver", "this", "source", "output", "contentResolver", "bitmap", "this", "output", "bitmap"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CompressionImageExporter.this.exportAsync(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: expo.modules.imagepicker.exporters.CompressionImageExporter$readBitmap$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "expo.modules.imagepicker.exporters.CompressionImageExporter", f = "CompressionImageExporter.kt", i = {}, l = {52}, m = "readBitmap", n = {}, s = {})
    static final class C46291 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C46291(Continuation<? super C46291> continuation) {
            super(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CompressionImageExporter.this.readBitmap(null, this);
        }
    }

    public CompressionImageExporter(AppContextProvider appContextProvider, double d11) {
        s.k(appContextProvider, "appContextProvider");
        this.appContextProvider = appContextProvider;
        this.compressQuality = (int) (d11 * ((double) 100));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object readBitmap(final Uri uri, Continuation<? super Bitmap> continuation) {
        C46291 c46291;
        if (continuation instanceof C46291) {
            c46291 = (C46291) continuation;
            int i11 = c46291.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c46291.label = i11 - Integer.MIN_VALUE;
            } else {
                c46291 = new C46291(continuation);
            }
        } else {
            c46291 = new C46291(continuation);
        }
        Object objRunInterruptible$default = c46291.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c46291.label;
        if (i12 == 0) {
            t.b(objRunInterruptible$default);
            wn0.a aVar = new wn0.a() { // from class: expo.modules.imagepicker.exporters.b
                @Override // wn0.a
                public final Object invoke() {
                    return CompressionImageExporter.readBitmap$lambda$0(this.f63319a, uri);
                }
            };
            c46291.label = 1;
            objRunInterruptible$default = InterruptibleKt.runInterruptible$default(null, aVar, c46291, 1, null);
            if (objRunInterruptible$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(objRunInterruptible$default);
        }
        s.h(objRunInterruptible$default);
        return objRunInterruptible$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap readBitmap$lambda$0(CompressionImageExporter compressionImageExporter, Uri uri) throws MissingModuleException, FailedToReadFileException {
        Future<Bitmap> futureLoadImageForManipulationFromURL;
        ImageLoaderInterface imageLoader = compressionImageExporter.appContextProvider.getAppContext().getImageLoader();
        if (imageLoader == null || (futureLoadImageForManipulationFromURL = imageLoader.loadImageForManipulationFromURL(uri.toString())) == null) {
            throw new MissingModuleException("ImageLoader");
        }
        try {
            return futureLoadImageForManipulationFromURL.get();
        } catch (ExecutionException e11) {
            throw new FailedToReadFileException(p5.b.a(uri), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object writeImage(final Bitmap bitmap, final File file, final Bitmap.CompressFormat compressFormat, Continuation<? super Boolean> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new wn0.a() { // from class: expo.modules.imagepicker.exporters.a
            @Override // wn0.a
            public final Object invoke() {
                return Boolean.valueOf(CompressionImageExporter.writeImage$lambda$2(file, bitmap, compressFormat, this));
            }
        }, continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean writeImage$lambda$2(File file, Bitmap bitmap, Bitmap.CompressFormat compressFormat, CompressionImageExporter compressionImageExporter) throws FailedToWriteFileException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                boolean zCompress = bitmap.compress(compressFormat, compressionImageExporter.compressQuality, fileOutputStream);
                sn0.b.a(fileOutputStream, null);
                return zCompress;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileOutputStream, th2);
                    throw th3;
                }
            }
        } catch (FileNotFoundException e11) {
            throw new FailedToWriteFileException(file, e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // expo.modules.imagepicker.exporters.ImageExporter
    public Object exportAsync(Uri uri, File file, ContentResolver contentResolver, Continuation<? super ImageExportResult> continuation) {
        AnonymousClass1 anonymousClass1;
        CompressionImageExporter compressionImageExporter;
        Uri uri2;
        Bitmap bitmap;
        final CompressionImageExporter compressionImageExporter2;
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
        Object bitmap2 = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = anonymousClass1.label;
        if (i12 == 0) {
            t.b(bitmap2);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = uri;
            anonymousClass1.L$2 = file;
            anonymousClass1.L$3 = contentResolver;
            anonymousClass1.label = 1;
            bitmap2 = readBitmap(uri, anonymousClass1);
            if (bitmap2 != coroutine_suspended) {
                compressionImageExporter = this;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            contentResolver = (ContentResolver) anonymousClass1.L$3;
            file = (File) anonymousClass1.L$2;
            uri = (Uri) anonymousClass1.L$1;
            compressionImageExporter = (CompressionImageExporter) anonymousClass1.L$0;
            t.b(bitmap2);
        } else {
            if (i12 == 2) {
                bitmap = (Bitmap) anonymousClass1.L$4;
                ContentResolver contentResolver2 = (ContentResolver) anonymousClass1.L$3;
                File file2 = (File) anonymousClass1.L$2;
                Uri uri3 = (Uri) anonymousClass1.L$1;
                CompressionImageExporter compressionImageExporter3 = (CompressionImageExporter) anonymousClass1.L$0;
                t.b(bitmap2);
                contentResolver = contentResolver2;
                file = file2;
                uri2 = uri3;
                compressionImageExporter = compressionImageExporter3;
                anonymousClass1.L$0 = compressionImageExporter;
                anonymousClass1.L$1 = file;
                anonymousClass1.L$2 = bitmap;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.label = 3;
                if (ImagePickerUtilsKt.copyExifData(uri2, file, contentResolver, anonymousClass1) != coroutine_suspended) {
                    compressionImageExporter2 = compressionImageExporter;
                }
                return coroutine_suspended;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bitmap = (Bitmap) anonymousClass1.L$2;
            file = (File) anonymousClass1.L$1;
            CompressionImageExporter compressionImageExporter4 = (CompressionImageExporter) anonymousClass1.L$0;
            t.b(bitmap2);
            compressionImageExporter2 = compressionImageExporter4;
        }
        final Bitmap bitmap3 = bitmap;
        return new ImageExportResult(file, bitmap3.getWidth(), bitmap3.getHeight()) { // from class: expo.modules.imagepicker.exporters.CompressionImageExporter.exportAsync.2
            @Override // expo.modules.imagepicker.exporters.ImageExportResult
            public Object data(ContentResolver contentResolver3, Continuation<? super ByteArrayOutputStream> continuation2) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                bitmap3.compress(Bitmap.CompressFormat.JPEG, compressionImageExporter2.compressQuality, byteArrayOutputStream);
                return byteArrayOutputStream;
            }
        };
        Bitmap bitmap4 = (Bitmap) bitmap2;
        Bitmap.CompressFormat bitmapCompressFormat = ImagePickerUtilsKt.toBitmapCompressFormat(file);
        anonymousClass1.L$0 = compressionImageExporter;
        anonymousClass1.L$1 = uri;
        anonymousClass1.L$2 = file;
        anonymousClass1.L$3 = contentResolver;
        anonymousClass1.L$4 = bitmap4;
        anonymousClass1.label = 2;
        if (compressionImageExporter.writeImage(bitmap4, file, bitmapCompressFormat, anonymousClass1) != coroutine_suspended) {
            uri2 = uri;
            bitmap = bitmap4;
            anonymousClass1.L$0 = compressionImageExporter;
            anonymousClass1.L$1 = file;
            anonymousClass1.L$2 = bitmap;
            anonymousClass1.L$3 = null;
            anonymousClass1.L$4 = null;
            anonymousClass1.label = 3;
            if (ImagePickerUtilsKt.copyExifData(uri2, file, contentResolver, anonymousClass1) != coroutine_suspended) {
                compressionImageExporter2 = compressionImageExporter;
                final Bitmap bitmap5 = bitmap;
                return new ImageExportResult(file, bitmap5.getWidth(), bitmap5.getHeight()) { // from class: expo.modules.imagepicker.exporters.CompressionImageExporter.exportAsync.2
                    @Override // expo.modules.imagepicker.exporters.ImageExportResult
                    public Object data(ContentResolver contentResolver3, Continuation<? super ByteArrayOutputStream> continuation2) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bitmap5.compress(Bitmap.CompressFormat.JPEG, compressionImageExporter2.compressQuality, byteArrayOutputStream);
                        return byteArrayOutputStream;
                    }
                };
            }
        }
        return coroutine_suspended;
    }
}
