package r00;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Base64;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;
import s00.i;
import s00.q;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0012J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J=\u0010 \u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\"\u0010#J/\u0010)\u001a\u00020\u00192\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u001b¢\u0006\u0004\b)\u0010*J+\u0010-\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u0010,\u001a\u00020+2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u00042\b\u00100\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b1\u00102J+\u00104\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\u0006\u00103\u001a\u00020+2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b4\u0010.J%\u00108\u001a\u00020\n2\u0006\u0010,\u001a\u0002052\u0006\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\n¢\u0006\u0004\b8\u00109J#\u0010;\u001a\u0004\u0018\u00010\b2\b\u0010:\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b;\u0010<¨\u0006="}, d2 = {"Lr00/a;", "", "<init>", "()V", "", "filePath", IntegerTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/graphics/Bitmap;", "image", "", "maxWidth", "maxHeight", "Lr00/d;", "h", "(Landroid/graphics/Bitmap;II)Lr00/d;", "value", "f", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "k", "imagePath", "outputUri", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/io/ByteArrayOutputStream;", "imageDataByteArrayOutputStream", "", "isBase64", "outputExtension", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "g", "(Ljava/io/ByteArrayOutputStream;ZLjava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/String;", "m", "(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;", "Lr00/b$d;", "output", "", "quality", "disablePngTransparency", "c", "(Landroid/graphics/Bitmap;Lr00/b$d;FZ)Ljava/io/ByteArrayOutputStream;", "Lr00/b;", "options", "l", "(Ljava/lang/String;Lr00/b;Lcom/facebook/react/bridge/ReactApplicationContext;)Ljava/lang/String;", "sourceFileUrl", "compressedFileUrl", "j", "(Ljava/lang/String;Ljava/lang/String;)Z", "compressorOptions", "a", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "b", "(Landroid/graphics/BitmapFactory$Options;II)I", "bitmap", "e", "(Landroid/graphics/Bitmap;Ljava/lang/String;)Landroid/graphics/Bitmap;", "react-native-compressor_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f106319a = new a();

    private a() {
    }

    public final String a(String imagePath, b compressorOptions, ReactApplicationContext reactContext) {
        Bitmap bitmapCreateBitmap;
        s.k(compressorOptions, "compressorOptions");
        float maxHeight = compressorOptions.getMaxHeight();
        float maxWidth = compressorOptions.getMaxWidth();
        boolean z11 = compressorOptions.getReturnableOutputType() == b.e.base64;
        String path = Uri.parse(imagePath).getPath();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path, options);
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        float f11 = i12;
        float f12 = i11;
        float f13 = f11 / f12;
        float f14 = maxWidth / maxHeight;
        if (f12 > maxHeight || f11 > maxWidth) {
            if (f13 < f14) {
                i12 = (int) ((maxHeight / f12) * f11);
                i11 = (int) maxHeight;
            } else {
                if (f13 > f14) {
                    maxHeight = (maxWidth / f11) * f12;
                }
                i11 = (int) maxHeight;
                i12 = (int) maxWidth;
            }
        }
        options.inSampleSize = b(options, i12, i11);
        options.inJustDecodeBounds = false;
        options.inDither = false;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inTempStorage = new byte[16384];
        try {
            bitmapDecodeFile = BitmapFactory.decodeFile(path, options);
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
        }
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(i12, i11, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e12) {
            e12.printStackTrace();
            bitmapCreateBitmap = null;
        }
        float f15 = i12;
        float f16 = f15 / options.outWidth;
        float f17 = i11;
        float f18 = f17 / options.outHeight;
        float f19 = f15 / 2.0f;
        float f21 = f17 / 2.0f;
        Matrix matrix = new Matrix();
        matrix.setScale(f16, f18, f19, f21);
        s.h(bitmapCreateBitmap);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.setMatrix(matrix);
        s.h(bitmapDecodeFile);
        canvas.drawBitmap(bitmapDecodeFile, f19 - (bitmapDecodeFile.getWidth() / 2), f21 - (bitmapDecodeFile.getHeight() / 2), new Paint(2));
        bitmapDecodeFile.recycle();
        String strG = g(c(e(bitmapCreateBitmap, path), compressorOptions.getOutput(), compressorOptions.getQuality(), compressorOptions.getDisablePngTransparency()), z11, compressorOptions.getOutput().toString(), path, reactContext);
        s.h(path);
        if (j(path, strG)) {
            return strG;
        }
        i iVar = i.f109324a;
        s.h(strG);
        iVar.b(strG);
        return q.f109347a.j(path);
    }

    public final int b(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int iRound;
        s.k(options, "options");
        int i11 = options.outHeight;
        int i12 = options.outWidth;
        if (i11 > reqHeight || i12 > reqWidth) {
            iRound = Math.round(i11 / reqHeight);
            int iRound2 = Math.round(i12 / reqWidth);
            if (iRound >= iRound2) {
                iRound = iRound2;
            }
        } else {
            iRound = 1;
        }
        while ((i12 * i11) / (iRound * iRound) > reqWidth * reqHeight * 2) {
            iRound++;
        }
        return iRound;
    }

    public final ByteArrayOutputStream c(Bitmap image, b.d output, float quality, boolean disablePngTransparency) {
        s.k(output, "output");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (output == b.d.jpg) {
            s.h(image);
            image.compress(Bitmap.CompressFormat.JPEG, Math.round(100 * quality), byteArrayOutputStream);
            return byteArrayOutputStream;
        }
        if (disablePngTransparency) {
            s.h(image);
            image.compress(Bitmap.CompressFormat.JPEG, Math.round(100 * quality), byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            s.j(byteArray, "toByteArray(...)");
            byteArrayOutputStream = new ByteArrayOutputStream();
            image = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        }
        s.h(image);
        image.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream;
    }

    public final void d(String imagePath, String outputUri) {
        String attribute;
        s.k(imagePath, "imagePath");
        s.k(outputUri, "outputUri");
        try {
            ExifInterface exifInterface = new ExifInterface(imagePath);
            ExifInterface exifInterface2 = new ExifInterface(outputUri);
            for (String str : q.f109347a.e()) {
                if (exifInterface2.getAttribute(str) == null && (attribute = exifInterface.getAttribute(str)) != null) {
                    exifInterface2.setAttribute(str, attribute);
                }
            }
            exifInterface2.saveAttributes();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public final Bitmap e(Bitmap bitmap, String imagePath) {
        Bitmap bitmap2;
        IOException iOException;
        if (bitmap == null || imagePath == null) {
            return bitmap;
        }
        try {
            int attributeInt = new ExifInterface(imagePath).getAttributeInt("Orientation", 1);
            Matrix matrix = new Matrix();
            try {
                switch (attributeInt) {
                    case 2:
                        matrix.setScale(-1.0f, 1.0f);
                        bitmap2 = bitmap;
                        try {
                            return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        } catch (IOException e11) {
                            e = e11;
                            iOException = e;
                            iOException.printStackTrace();
                            return bitmap2;
                        }
                    case 3:
                        matrix.setRotate(180.0f);
                        bitmap2 = bitmap;
                        return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    case 4:
                        matrix.setScale(1.0f, -1.0f);
                        bitmap2 = bitmap;
                        return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    case 5:
                        matrix.setRotate(90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        bitmap2 = bitmap;
                        return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    case 6:
                        matrix.setRotate(90.0f);
                        bitmap2 = bitmap;
                        return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    case 7:
                        matrix.setRotate(-90.0f);
                        matrix.postScale(-1.0f, 1.0f);
                        bitmap2 = bitmap;
                        return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    case 8:
                        matrix.setRotate(-90.0f);
                        bitmap2 = bitmap;
                        return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                    default:
                        return bitmap;
                }
            } catch (IOException e12) {
                iOException = e12;
                bitmap2 = bitmap;
                iOException.printStackTrace();
                return bitmap2;
            }
        } catch (IOException e13) {
            e = e13;
            bitmap2 = bitmap;
        }
    }

    public final Bitmap f(String value) {
        byte[] bArrDecode = Base64.decode(value, 0);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
        s.j(bitmapDecodeByteArray, "decodeByteArray(...)");
        return bitmapDecodeByteArray;
    }

    public final String g(ByteArrayOutputStream imageDataByteArrayOutputStream, boolean isBase64, String outputExtension, String imagePath, ReactApplicationContext reactContext) {
        s.k(imageDataByteArrayOutputStream, "imageDataByteArrayOutputStream");
        if (isBase64) {
            return Base64.encodeToString(imageDataByteArrayOutputStream.toByteArray(), 0);
        }
        s.h(outputExtension);
        s.h(reactContext);
        String strC = q.c(outputExtension, reactContext);
        try {
            imageDataByteArrayOutputStream.writeTo(new FileOutputStream(strC));
            s.h(imagePath);
            d(imagePath, strC);
            return i(strC);
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    public final d h(Bitmap image, int maxWidth, int maxHeight) {
        s.k(image, "image");
        float width = image.getWidth();
        float height = image.getHeight();
        if (width > height) {
            int iRound = Math.round(height / (width / maxWidth));
            return new d(maxWidth, iRound, iRound / height);
        }
        int iRound2 = Math.round(width / (height / maxHeight));
        return new d(iRound2, maxHeight, iRound2 / width);
    }

    public final String i(String filePath) {
        try {
            return new File(filePath).toURL().toString();
        } catch (MalformedURLException e11) {
            e11.printStackTrace();
            return filePath;
        }
    }

    public final boolean j(String sourceFileUrl, String compressedFileUrl) {
        s.k(sourceFileUrl, "sourceFileUrl");
        try {
            return ((float) new File(Uri.parse(compressedFileUrl).getPath()).length()) <= ((float) new File(Uri.parse(sourceFileUrl).getPath()).length());
        } catch (OutOfMemoryError e11) {
            e11.printStackTrace();
            return true;
        }
    }

    public final Bitmap k(String value) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(Uri.parse(value).getPath());
        s.j(bitmapDecodeFile, "decodeFile(...)");
        return bitmapDecodeFile;
    }

    public final String l(String imagePath, b options, ReactApplicationContext reactContext) {
        s.k(options, "options");
        String strG = g(c(e(m(options.getInput() == b.c.base64 ? f(imagePath) : k(imagePath), options.getMaxWidth(), options.getMaxHeight()), Uri.parse(imagePath).getPath()), options.getOutput(), options.getQuality(), options.getDisablePngTransparency()), options.getReturnableOutputType() == b.e.base64, options.getOutput().toString(), imagePath, reactContext);
        s.h(imagePath);
        if (j(imagePath, strG)) {
            return strG;
        }
        i iVar = i.f109324a;
        s.h(strG);
        iVar.b(strG);
        return q.f109347a.j(imagePath);
    }

    public final Bitmap m(Bitmap image, int maxWidth, int maxHeight) {
        s.k(image, "image");
        d dVarH = h(image, maxWidth, maxHeight);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dVarH.com.swmansion.reanimated.layoutReanimation.Snapshot.WIDTH java.lang.String, dVarH.com.swmansion.reanimated.layoutReanimation.Snapshot.HEIGHT java.lang.String, Bitmap.Config.ARGB_8888);
        s.j(bitmapCreateBitmap, "createBitmap(...)");
        Matrix matrix = new Matrix();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(2);
        float f11 = dVarH.scale;
        matrix.setScale(f11, f11, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(image, matrix, paint);
        return bitmapCreateBitmap;
    }
}
