package gi0;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import bo0.n;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jn0.h0;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.collections.v0;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.jvm.internal.Boxing;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lgi0/b;", "Lgi0/a;", "<init>", "()V", "Ljava/io/File;", Action.FILE_ATTRIBUTE, "", "", "exifData", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/io/File;Ljava/util/Map;)V", "c", "(Ljava/io/File;)Ljava/util/Map;", "Landroid/graphics/BitmapFactory$Options;", "options", "", "reqWidth", "reqHeight", "b", "(Landroid/graphics/BitmapFactory$Options;II)I", "a", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements a {
    private final int b(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        if (i11 > reqHeight || i12 > reqWidth) {
            return Math.min(yn0.a.d(i11 / reqHeight), yn0.a.d(i12 / reqWidth));
        }
        return 1;
    }

    private final Map<String, String> c(File file) {
        try {
            List listP = v.p("DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "Make", "Model", "Orientation", "SubSecTime", "WhiteBalance");
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                e7.a aVar = new e7.a(fileInputStream);
                List list = listP;
                LinkedHashMap linkedHashMap = new LinkedHashMap(n.f(v0.e(v.y(list, 10)), 16));
                for (Object obj : list) {
                    linkedHashMap.put(obj, aVar.k((String) obj));
                }
                sn0.b.a(fileInputStream, null);
                return linkedHashMap;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (IOException unused) {
            return v0.i();
        }
    }

    private final void d(File file, Map<String, String> exifData) throws Throwable {
        try {
            e7.a aVar = new e7.a(file.getAbsolutePath());
            Iterator<T> it = exifData.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    aVar.h0(str, str2);
                }
            }
            aVar.c0();
        } catch (IOException unused) {
        }
    }

    @Override // gi0.a
    public Object a(File file, Continuation<? super h0> continuation) throws Throwable {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        Map<String, String> mapC = c(file);
        try {
            String absolutePath = file.getAbsolutePath();
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = b(options, 2000, 2000);
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options2);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            if (bitmapDecodeFile != null) {
                try {
                    Boxing.boxBoolean(bitmapDecodeFile.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream));
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(fileOutputStream, th2);
                        throw th3;
                    }
                }
            }
            sn0.b.a(fileOutputStream, null);
            if (bitmapDecodeFile != null) {
                bitmapDecodeFile.recycle();
            }
        } catch (IllegalArgumentException unused) {
        }
        d(file, mapC);
        return h0.f84049a;
    }
}
