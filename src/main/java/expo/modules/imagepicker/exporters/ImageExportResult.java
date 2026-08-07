package expo.modules.imagepicker.exporters;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import expo.modules.imagepicker.FailedToReadFileException;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import kotlinx.coroutines.InterruptibleKt;
import p013kotlin.Metadata;
import p013kotlin.Pair;
import p013kotlin.coroutines.Continuation;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@¢\u0006\u0002\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lexpo/modules/imagepicker/exporters/ImageExportResult;", "", Snapshot.WIDTH, "", Snapshot.HEIGHT, "imageFile", "Ljava/io/File;", "<init>", "(IILjava/io/File;)V", "getWidth", "()I", "getHeight", "data", "Ljava/io/ByteArrayOutputStream;", "contentResolver", "Landroid/content/ContentResolver;", "(Landroid/content/ContentResolver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "exif", "Landroid/os/Bundle;", "expo-image-picker_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class ImageExportResult {
    private final int height;
    private final File imageFile;
    private final int width;

    public ImageExportResult(int i11, int i12, File imageFile) {
        s.k(imageFile, "imageFile");
        this.width = i11;
        this.height = i12;
        this.imageFile = imageFile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteArrayOutputStream data$lambda$2(ContentResolver contentResolver, ImageExportResult imageExportResult) throws FailedToReadFileException, FileNotFoundException {
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(Uri.fromFile(imageExportResult.imageFile));
        if (inputStreamOpenInputStream == null) {
            throw new FailedToReadFileException(imageExportResult.imageFile, null, 2, null);
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                sn0.a.b(inputStreamOpenInputStream, byteArrayOutputStream, 0, 2, null);
                sn0.b.a(byteArrayOutputStream, null);
                sn0.b.a(inputStreamOpenInputStream, null);
                return byteArrayOutputStream;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(byteArrayOutputStream, th2);
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
    }

    static /* synthetic */ Object data$suspendImpl(final ImageExportResult imageExportResult, final ContentResolver contentResolver, Continuation<? super ByteArrayOutputStream> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new wn0.a() { // from class: expo.modules.imagepicker.exporters.f
            @Override // wn0.a
            public final Object invoke() {
                return ImageExportResult.data$lambda$2(contentResolver, imageExportResult);
            }
        }, continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle exif$lambda$8(ContentResolver contentResolver, ImageExportResult imageExportResult) throws FailedToReadFileException, FileNotFoundException {
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(Uri.fromFile(imageExportResult.imageFile));
        if (inputStreamOpenInputStream == null) {
            throw new FailedToReadFileException(imageExportResult.imageFile, null, 2, null);
        }
        try {
            Bundle bundle = new Bundle();
            e7.a aVar = new e7.a(inputStreamOpenInputStream);
            Iterable<Pair<String, String>> exif_tags = ImagePickerConstants.INSTANCE.getEXIF_TAGS();
            ArrayList<Pair> arrayList = new ArrayList();
            for (Pair<String, String> pair : exif_tags) {
                if (aVar.k(pair.b()) != null) {
                    arrayList.add(pair);
                }
            }
            for (Pair pair2 : arrayList) {
                String str = (String) pair2.a();
                String str2 = (String) pair2.b();
                int iHashCode = str.hashCode();
                if (iHashCode != -1325958191) {
                    if (iHashCode != -891985903) {
                        if (iHashCode == 104431 && str.equals("int")) {
                            bundle.putInt(str2, aVar.m(str2, 0));
                        }
                    } else if (str.equals(InquiryField.StringField.TYPE)) {
                        bundle.putString(str2, aVar.k(str2));
                    }
                } else if (str.equals("double")) {
                    bundle.putDouble(str2, aVar.l(str2, 0.0d));
                }
            }
            double[] dArrQ = aVar.q();
            if (dArrQ != null) {
                bundle.putDouble("GPSLatitude", dArrQ[0]);
                bundle.putDouble("GPSLongitude", dArrQ[1]);
                bundle.putDouble("GPSAltitude", aVar.j(0.0d));
            }
            sn0.b.a(inputStreamOpenInputStream, null);
            return bundle;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(inputStreamOpenInputStream, th2);
                throw th3;
            }
        }
    }

    static /* synthetic */ Object exif$suspendImpl(final ImageExportResult imageExportResult, final ContentResolver contentResolver, Continuation<? super Bundle> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new wn0.a() { // from class: expo.modules.imagepicker.exporters.e
            @Override // wn0.a
            public final Object invoke() {
                return ImageExportResult.exif$lambda$8(contentResolver, imageExportResult);
            }
        }, continuation, 1, null);
    }

    public Object data(ContentResolver contentResolver, Continuation<? super ByteArrayOutputStream> continuation) {
        return data$suspendImpl(this, contentResolver, continuation);
    }

    public Object exif(ContentResolver contentResolver, Continuation<? super Bundle> continuation) {
        return exif$suspendImpl(this, contentResolver, continuation);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
