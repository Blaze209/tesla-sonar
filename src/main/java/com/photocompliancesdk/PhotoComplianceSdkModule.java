package com.photocompliancesdk;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import bo0.h;
import bo0.n;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.photocompliancesdk.PhotoComplianceSdkModule;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;
import p013kotlin.jvm.internal.t0;
import p013kotlin.text.t;
import sn0.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 !2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/photocompliancesdk/PhotoComplianceSdkModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "calculateLaplaceScore", "(Landroid/graphics/Bitmap;)D", "", "getName", "()Ljava/lang/String;", "a", "b", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Ljn0/h0;", "multiply", "(DDLcom/facebook/react/bridge/Promise;)V", "videoPath", "getVideoDuration", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "intervalMs", "extractFramesWithQualityScores", "(Ljava/lang/String;DLcom/facebook/react/bridge/Promise;)V", "extractFrames", "TAG", "Ljava/lang/String;", "", "useOptimizedQualityScoring", "Z", "Companion", "react-native-monk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PhotoComplianceSdkModule extends ReactContextBaseJavaModule {
    public static final String NAME = "PhotoComplianceSdk";
    private final String TAG;
    private final boolean useOptimizedQualityScoring;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhotoComplianceSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
        s.k(reactContext, "reactContext");
        this.TAG = NAME;
        this.useOptimizedQualityScoring = true;
    }

    private final double calculateLaplaceScore(Bitmap bitmap) {
        Bitmap bitmapCreateScaledBitmap;
        int i11;
        int i12;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (!this.useOptimizedQualityScoring || (width <= 480 && height <= 270)) {
            bitmapCreateScaledBitmap = bitmap;
        } else {
            float f11 = width;
            float f12 = height;
            float fMin = Math.min(480.0f / f11, 270.0f / f12);
            width = (int) (f11 * fMin);
            height = (int) (f12 * fMin);
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, false);
        }
        int i13 = 1;
        int[][] iArr = {new int[]{0, 1, 0}, new int[]{1, -4, 1}, new int[]{0, 1, 0}};
        int i14 = 2;
        int iMin = (((int) (((double) Math.min(height, width)) * 0.8d)) / 2) * 2;
        int i15 = (height - iMin) / 2;
        int i16 = (width - iMin) / 2;
        ArrayList arrayList = new ArrayList();
        int i17 = this.useOptimizedQualityScoring ? 2 : 1;
        h hVarU = n.u(n.w(i15 + 1, (i15 + iMin) - 1), i17);
        int first = hVarU.getFirst();
        int last = hVarU.getLast();
        int step = hVarU.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                h hVarU2 = n.u(n.w(i16 + 1, (i16 + iMin) - i13), i17);
                int first2 = hVarU2.getFirst();
                int last2 = hVarU2.getLast();
                int step2 = hVarU2.getStep();
                if ((step2 > 0 && first2 <= last2) || (step2 < 0 && last2 <= first2)) {
                    while (true) {
                        i11 = i16;
                        int i18 = -1;
                        int i19 = 0;
                        while (i18 < i14) {
                            int iGreen = i19;
                            int i21 = -1;
                            while (i21 < i14) {
                                int i22 = i21 + 1;
                                iGreen += iArr[i18 + 1][i22] * Color.green(bitmapCreateScaledBitmap.getPixel(first2 + i21, first + i18));
                                i21 = i22;
                                i14 = 2;
                            }
                            i18++;
                            i19 = iGreen;
                            i14 = 2;
                        }
                        i12 = step;
                        arrayList.add(Double.valueOf(i19));
                        if (first2 == last2) {
                            break;
                        }
                        first2 += step2;
                        step = i12;
                        i16 = i11;
                        i14 = 2;
                    }
                } else {
                    i11 = i16;
                    i12 = step;
                }
                if (first == last) {
                    break;
                }
                first += i12;
                step = i12;
                i16 = i11;
                i13 = 1;
                i14 = 2;
            }
        }
        if (bitmapCreateScaledBitmap != bitmap) {
            bitmapCreateScaledBitmap.recycle();
        }
        if (arrayList.isEmpty()) {
            Log.d(this.TAG, "No Laplace values calculated");
            return 0.0d;
        }
        double dB1 = v.b1(arrayList) / ((double) arrayList.size());
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            double dDoubleValue = ((Number) it.next()).doubleValue() - dB1;
            arrayList2.add(Double.valueOf(dDoubleValue * dDoubleValue));
        }
        double dSqrt = Math.sqrt(v.b1(arrayList2) / ((double) arrayList.size()));
        String str = this.useOptimizedQualityScoring ? " (optimized)" : "";
        String str2 = this.TAG;
        t0 t0Var = t0.f86535a;
        String str3 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dSqrt)}, 1));
        s.j(str3, "format(...)");
        Log.d(str2, "Laplace score: std=" + str3 + ", samples=" + arrayList.size() + str);
        return dSqrt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:103:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x020f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[Catch: all -> 0x0187, Exception -> 0x01a1, TryCatch #8 {all -> 0x0187, blocks: (B:4:0x0018, B:16:0x003b, B:18:0x005c, B:20:0x0061, B:23:0x00a4, B:26:0x00af, B:28:0x00b6, B:40:0x00fb, B:39:0x00d0), top: B:105:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:22:0x00a1 A[Catch: all -> 0x002e, Exception -> 0x0032, TRY_ENTER, TRY_LEAVE, TryCatch #12 {Exception -> 0x0032, blocks: (B:6:0x0023, B:8:0x0029, B:22:0x00a1), top: B:111:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x00af A[Catch: all -> 0x0187, Exception -> 0x01a1, TRY_LEAVE, TryCatch #8 {all -> 0x0187, blocks: (B:4:0x0018, B:16:0x003b, B:18:0x005c, B:20:0x0061, B:23:0x00a4, B:26:0x00af, B:28:0x00b6, B:40:0x00fb, B:39:0x00d0), top: B:105:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00d0 A[Catch: Exception -> 0x00c9, all -> 0x0187, TRY_ENTER, TryCatch #7 {Exception -> 0x00c9, blocks: (B:28:0x00b6, B:31:0x00be, B:40:0x00fb, B:39:0x00d0), top: B:103:0x00b6 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0193  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d4 A[Catch: all -> 0x0179, Exception -> 0x018f, LOOP:1: B:67:0x01ce->B:69:0x01d4, LOOP_END, TryCatch #0 {Exception -> 0x018f, blocks: (B:63:0x0198, B:59:0x018b, B:66:0x01a5, B:67:0x01ce, B:69:0x01d4, B:70:0x01de), top: B:90:0x0198 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0208 A[Catch: Exception -> 0x020b, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x020b, blocks: (B:79:0x0208, B:71:0x01e1), top: B:97:0x0006 }] */
    public static final void extractFrames$lambda$8(String str, PhotoComplianceSdkModule photoComplianceSdkModule, double d11, Promise promise) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        MediaMetadataRetriever mediaMetadataRetriever2;
        long j11;
        double d12;
        int i11;
        double d13;
        long j12;
        ArrayList arrayList;
        File file;
        int i12;
        long j13;
        WritableArray writableArrayCreateArray;
        Iterator it;
        Bitmap frameAtTime;
        long j14;
        Bitmap bitmapCreateScaledBitmap;
        FileOutputStream fileOutputStream;
        try {
            try {
                String strV = t.V(str, "file://", "", false, 4, null);
                MediaMetadataRetriever mediaMetadataRetriever3 = new MediaMetadataRetriever();
                try {
                    try {
                        mediaMetadataRetriever3.setDataSource(strV);
                        String strExtractMetadata = mediaMetadataRetriever3.extractMetadata(9);
                        if (strExtractMetadata != null) {
                            try {
                                try {
                                    Long lZ = t.z(strExtractMetadata);
                                    long jLongValue = lZ != null ? lZ.longValue() : 0L;
                                    j11 = 1000 * jLongValue;
                                    Log.d(photoComplianceSdkModule.TAG, "Video duration: " + jLongValue + "ms");
                                    d12 = (double) jLongValue;
                                    i11 = (int) (d12 / d11);
                                    if (i11 > 120) {
                                        d13 = d12 / ((double) 120);
                                    } else {
                                        d13 = d11;
                                    }
                                    j12 = (long) (((double) 1000) * d13);
                                    Log.d(photoComplianceSdkModule.TAG, "Estimated frames: " + i11 + ", adjusted interval: " + d13 + "ms");
                                    arrayList = new ArrayList();
                                    file = new File(photoComplianceSdkModule.getReactApplicationContext().getCacheDir(), "frames");
                                    if (file.exists()) {
                                        sn0.h.B(file);
                                    }
                                    file.mkdirs();
                                    i12 = 0;
                                    j13 = 0;
                                    while (j13 < j11) {
                                        frameAtTime = mediaMetadataRetriever3.getFrameAtTime(j13, 2);
                                        if (frameAtTime != null) {
                                            try {
                                                if (frameAtTime.getWidth() <= 1920 || frameAtTime.getHeight() > 1080) {
                                                    float fMin = Math.min(1920.0f / frameAtTime.getWidth(), 1080.0f / frameAtTime.getHeight());
                                                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, (int) (frameAtTime.getWidth() * fMin), (int) (frameAtTime.getHeight() * fMin), true);
                                                    frameAtTime.recycle();
                                                } else {
                                                    bitmapCreateScaledBitmap = frameAtTime;
                                                }
                                                s.h(bitmapCreateScaledBitmap);
                                                t0 t0Var = t0.f86535a;
                                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                try {
                                                    try {
                                                        j14 = j13;
                                                        try {
                                                            String str2 = String.format("%04d", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
                                                            s.j(str2, "format(...)");
                                                            File file2 = new File(file, "frame_" + str2 + ".jpg");
                                                            fileOutputStream = new FileOutputStream(file2);
                                                            try {
                                                                bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                                                                try {
                                                                    b.a(fileOutputStream, null);
                                                                    String absolutePath = file2.getAbsolutePath();
                                                                    s.j(absolutePath, "getAbsolutePath(...)");
                                                                    arrayList.add(absolutePath);
                                                                    Log.d(photoComplianceSdkModule.TAG, "Frame " + i12 + ": saved to " + file2.getAbsolutePath());
                                                                    bitmapCreateScaledBitmap.recycle();
                                                                } catch (Exception unused) {
                                                                    frameAtTime.recycle();
                                                                }
                                                            } catch (Throwable th2) {
                                                                try {
                                                                    throw th2;
                                                                } catch (Throwable th3) {
                                                                    b.a(fileOutputStream, th2);
                                                                    throw th3;
                                                                }
                                                            }
                                                        } catch (Exception unused2) {
                                                            frameAtTime.recycle();
                                                            i12++;
                                                            j13 = j14 + j12;
                                                            mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                        }
                                                    } catch (Exception unused3) {
                                                        j14 = j13;
                                                        frameAtTime.recycle();
                                                        i12++;
                                                        j13 = j14 + j12;
                                                        mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    if (mediaMetadataRetriever != null) {
                                                        try {
                                                            mediaMetadataRetriever.release();
                                                        } catch (Exception unused4) {
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } catch (Exception unused5) {
                                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                            }
                                        } else {
                                            mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                            j14 = j13;
                                        }
                                        try {
                                            i12++;
                                            j13 = j14 + j12;
                                            mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                        } catch (Exception e11) {
                                            e = e11;
                                            mediaMetadataRetriever = mediaMetadataRetriever2;
                                            try {
                                                promise.reject("EXTRACT_ERROR", "Failed to extract frames: " + e.getMessage(), e);
                                                if (mediaMetadataRetriever == null) {
                                                    mediaMetadataRetriever.release();
                                                }
                                                return;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                if (mediaMetadataRetriever != null) {
                                                    mediaMetadataRetriever.release();
                                                }
                                                throw th;
                                            }
                                        }
                                    }
                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                    Log.d(photoComplianceSdkModule.TAG, "Extraction complete: " + arrayList.size() + " frames extracted");
                                    writableArrayCreateArray = Arguments.createArray();
                                    it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        writableArrayCreateArray.pushString((String) it.next());
                                    }
                                    promise.resolve(writableArrayCreateArray);
                                    mediaMetadataRetriever2.release();
                                } catch (Exception e12) {
                                    e = e12;
                                    mediaMetadataRetriever = mediaMetadataRetriever3;
                                    promise.reject("EXTRACT_ERROR", "Failed to extract frames: " + e.getMessage(), e);
                                    if (mediaMetadataRetriever == null) {
                                        return;
                                    } else {
                                        mediaMetadataRetriever.release();
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                mediaMetadataRetriever = mediaMetadataRetriever3;
                                if (mediaMetadataRetriever != null) {
                                    mediaMetadataRetriever.release();
                                }
                                throw th;
                            }
                        }
                        j11 = 1000 * jLongValue;
                        Log.d(photoComplianceSdkModule.TAG, "Video duration: " + jLongValue + "ms");
                        d12 = (double) jLongValue;
                        i11 = (int) (d12 / d11);
                        if (i11 > 120) {
                            d13 = d12 / ((double) 120);
                        } else {
                            d13 = d11;
                        }
                        j12 = (long) (((double) 1000) * d13);
                        Log.d(photoComplianceSdkModule.TAG, "Estimated frames: " + i11 + ", adjusted interval: " + d13 + "ms");
                        arrayList = new ArrayList();
                        file = new File(photoComplianceSdkModule.getReactApplicationContext().getCacheDir(), "frames");
                        if (file.exists()) {
                            sn0.h.B(file);
                        }
                        file.mkdirs();
                        i12 = 0;
                        j13 = 0;
                        while (j13 < j11) {
                            frameAtTime = mediaMetadataRetriever3.getFrameAtTime(j13, 2);
                            if (frameAtTime != null) {
                                if (frameAtTime.getWidth() <= 1920) {
                                    float fMin2 = Math.min(1920.0f / frameAtTime.getWidth(), 1080.0f / frameAtTime.getHeight());
                                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, (int) (frameAtTime.getWidth() * fMin2), (int) (frameAtTime.getHeight() * fMin2), true);
                                    frameAtTime.recycle();
                                } else {
                                    float fMin3 = Math.min(1920.0f / frameAtTime.getWidth(), 1080.0f / frameAtTime.getHeight());
                                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, (int) (frameAtTime.getWidth() * fMin3), (int) (frameAtTime.getHeight() * fMin3), true);
                                    frameAtTime.recycle();
                                }
                                s.h(bitmapCreateScaledBitmap);
                                t0 t0Var2 = t0.f86535a;
                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                j14 = j13;
                                String str3 = String.format("%04d", Arrays.copyOf(new Object[]{Integer.valueOf(i12)}, 1));
                                s.j(str3, "format(...)");
                                File file3 = new File(file, "frame_" + str3 + ".jpg");
                                fileOutputStream = new FileOutputStream(file3);
                                bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                                b.a(fileOutputStream, null);
                                String absolutePath2 = file3.getAbsolutePath();
                                s.j(absolutePath2, "getAbsolutePath(...)");
                                arrayList.add(absolutePath2);
                                Log.d(photoComplianceSdkModule.TAG, "Frame " + i12 + ": saved to " + file3.getAbsolutePath());
                                bitmapCreateScaledBitmap.recycle();
                            } else {
                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                j14 = j13;
                            }
                            i12++;
                            j13 = j14 + j12;
                            mediaMetadataRetriever3 = mediaMetadataRetriever2;
                        }
                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                        Log.d(photoComplianceSdkModule.TAG, "Extraction complete: " + arrayList.size() + " frames extracted");
                        writableArrayCreateArray = Arguments.createArray();
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            writableArrayCreateArray.pushString((String) it.next());
                        }
                        promise.resolve(writableArrayCreateArray);
                        mediaMetadataRetriever2.release();
                    } catch (Throwable th7) {
                        th = th7;
                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                    }
                } catch (Exception e13) {
                    e = e13;
                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                }
            } catch (Exception unused6) {
            }
        } catch (Exception e14) {
            e = e14;
            mediaMetadataRetriever = null;
        } catch (Throwable th8) {
            th = th8;
            mediaMetadataRetriever = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:117:0x033b A[Catch: Exception -> 0x033e, TRY_ENTER, TRY_LEAVE, TryCatch #13 {Exception -> 0x033e, blocks: (B:117:0x033b, B:103:0x0305), top: B:143:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0342 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x00f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x01cc A[EDGE_INSN: B:168:0x01cc->B:72:0x01cc BREAK  A[LOOP:1: B:27:0x00c7->B:67:0x01bb], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x009c A[Catch: all -> 0x002c, Exception -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #24 {Exception -> 0x0030, all -> 0x002c, blocks: (B:7:0x0021, B:9:0x0027, B:19:0x009c), top: B:156:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00da  */
    /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:43:0x0107 A[Catch: all -> 0x00fc, Exception -> 0x0101, TryCatch #20 {all -> 0x00fc, blocks: (B:25:0x00b4, B:33:0x00e7, B:36:0x00f1, B:44:0x0131, B:46:0x013c, B:48:0x014b, B:50:0x0152, B:53:0x0185, B:56:0x0194, B:61:0x01a8, B:43:0x0107, B:80:0x0298, B:99:0x02cf, B:96:0x02c9, B:97:0x02cc, B:100:0x02de, B:102:0x0302), top: B:127:0x00b4 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0185 A[Catch: all -> 0x00fc, Exception -> 0x0189, TryCatch #5 {Exception -> 0x0189, blocks: (B:50:0x0152, B:53:0x0185, B:56:0x0194), top: B:132:0x0152 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0194 A[Catch: all -> 0x00fc, Exception -> 0x0189, TRY_LEAVE, TryCatch #5 {Exception -> 0x0189, blocks: (B:50:0x0152, B:53:0x0185, B:56:0x0194), top: B:132:0x0152 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:98:0x02cd  */
    public static final void extractFramesWithQualityScores$lambda$4(String str, PhotoComplianceSdkModule photoComplianceSdkModule, double d11, double d12, Promise promise) throws Throwable {
        MediaMetadataRetriever mediaMetadataRetriever;
        Promise promise2;
        MediaMetadataRetriever mediaMetadataRetriever2;
        long jLongValue;
        long j11;
        WritableArray writableArrayCreateArray;
        File file;
        long j12;
        long j13;
        int i11;
        long jMin;
        double d13;
        long j14;
        int i12;
        Bitmap bitmap;
        long j15;
        WritableArray writableArray;
        double d14;
        WritableArray writableArray2;
        FileOutputStream fileOutputStream;
        MediaMetadataRetriever mediaMetadataRetriever3;
        Bitmap frameAtTime;
        long j16;
        Bitmap bitmap2;
        double d15;
        Bitmap bitmapCreateScaledBitmap;
        double dCalculateLaplaceScore;
        int i13;
        try {
            try {
                String strV = t.V(str, "file://", "", false, 4, null);
                MediaMetadataRetriever mediaMetadataRetriever4 = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever4.setDataSource(strV);
                    String strExtractMetadata = mediaMetadataRetriever4.extractMetadata(9);
                    long j17 = 0;
                    try {
                        if (strExtractMetadata != null) {
                            try {
                                Long lZ = t.z(strExtractMetadata);
                                if (lZ != null) {
                                    jLongValue = lZ.longValue();
                                }
                                j11 = 1000 * jLongValue;
                                Log.d(photoComplianceSdkModule.TAG, "Video duration: " + jLongValue + "ms");
                                int iCeil = (int) Math.ceil(((double) jLongValue) / d11);
                                Log.d(photoComplianceSdkModule.TAG, "Expected output: " + iCeil + " frames (" + ((int) (d11 / d12)) + " candidates per window)");
                                writableArrayCreateArray = Arguments.createArray();
                                file = new File(photoComplianceSdkModule.getReactApplicationContext().getCacheDir(), "frames");
                                if (file.exists()) {
                                    sn0.h.B(file);
                                }
                                file.mkdirs();
                                double d16 = 1000;
                                j12 = (long) (d12 * d16);
                                j13 = (long) (d16 * d11);
                                i11 = 0;
                                while (j17 < j11) {
                                    mediaMetadataRetriever2 = mediaMetadataRetriever4;
                                    try {
                                        try {
                                            jMin = Math.min(j17 + j13, j11);
                                            long j18 = j11;
                                            d13 = -1.0d;
                                            j14 = j17;
                                            long j19 = j13;
                                            i12 = 0;
                                            bitmap = null;
                                            while (true) {
                                                j15 = j12;
                                                if (j17 < jMin) {
                                                    break;
                                                }
                                                WritableArray writableArray3 = writableArrayCreateArray;
                                                mediaMetadataRetriever3 = mediaMetadataRetriever2;
                                                try {
                                                    frameAtTime = mediaMetadataRetriever3.getFrameAtTime(j17, 2);
                                                    if (frameAtTime != null) {
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                        try {
                                                            d15 = d13;
                                                            if (frameAtTime.getWidth() > 1920) {
                                                                try {
                                                                    if (frameAtTime.getHeight() > 1080) {
                                                                        float fMin = Math.min(1920.0f / frameAtTime.getWidth(), 1080.0f / frameAtTime.getHeight());
                                                                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, (int) (frameAtTime.getWidth() * fMin), (int) (frameAtTime.getHeight() * fMin), true);
                                                                        frameAtTime.recycle();
                                                                    } else {
                                                                        bitmapCreateScaledBitmap = frameAtTime;
                                                                    }
                                                                } catch (Exception unused) {
                                                                    bitmap2 = frameAtTime;
                                                                    j16 = j17;
                                                                    bitmap2.recycle();
                                                                    d13 = d15;
                                                                    j17 = j16 + j15;
                                                                    j12 = j15;
                                                                    writableArrayCreateArray = writableArray3;
                                                                }
                                                            } else {
                                                                float fMin2 = Math.min(1920.0f / frameAtTime.getWidth(), 1080.0f / frameAtTime.getHeight());
                                                                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, (int) (frameAtTime.getWidth() * fMin2), (int) (frameAtTime.getHeight() * fMin2), true);
                                                                frameAtTime.recycle();
                                                            }
                                                            s.h(bitmapCreateScaledBitmap);
                                                            dCalculateLaplaceScore = photoComplianceSdkModule.calculateLaplaceScore(bitmapCreateScaledBitmap);
                                                            i13 = i12 + 1;
                                                            try {
                                                                String str2 = photoComplianceSdkModule.TAG;
                                                                double d17 = j17 / 1000.0d;
                                                                t0 t0Var = t0.f86535a;
                                                                bitmap2 = frameAtTime;
                                                                try {
                                                                    j16 = j17;
                                                                    try {
                                                                        String str3 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dCalculateLaplaceScore)}, 1));
                                                                        s.j(str3, "format(...)");
                                                                        Log.d(str2, "Window " + i11 + " candidate at " + d17 + "ms: quality=" + str3);
                                                                        if (dCalculateLaplaceScore > d15) {
                                                                            if (bitmap != null) {
                                                                                bitmap.recycle();
                                                                            }
                                                                            bitmap = bitmapCreateScaledBitmap;
                                                                            i12 = i13;
                                                                            d13 = dCalculateLaplaceScore;
                                                                            j14 = j16;
                                                                        } else {
                                                                            bitmapCreateScaledBitmap.recycle();
                                                                            d13 = d15;
                                                                            i12 = i13;
                                                                        }
                                                                    } catch (Exception unused2) {
                                                                        i12 = i13;
                                                                        bitmap2.recycle();
                                                                        d13 = d15;
                                                                    }
                                                                } catch (Exception unused3) {
                                                                    j16 = j17;
                                                                    i12 = i13;
                                                                    bitmap2.recycle();
                                                                    d13 = d15;
                                                                    j17 = j16 + j15;
                                                                    j12 = j15;
                                                                    writableArrayCreateArray = writableArray3;
                                                                }
                                                            } catch (Exception unused4) {
                                                                bitmap2 = frameAtTime;
                                                            }
                                                        } catch (Exception unused5) {
                                                            bitmap2 = frameAtTime;
                                                            j16 = j17;
                                                            d15 = d13;
                                                        }
                                                    } else {
                                                        j16 = j17;
                                                        mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                    }
                                                    j17 = j16 + j15;
                                                    j12 = j15;
                                                    writableArrayCreateArray = writableArray3;
                                                } catch (Exception e11) {
                                                    e = e11;
                                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                    promise2 = promise;
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    try {
                                                        promise2.reject("EXTRACT_ERROR", "Failed to extract frames: " + e.getMessage(), e);
                                                        if (mediaMetadataRetriever != null) {
                                                            mediaMetadataRetriever.release();
                                                        }
                                                        return;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        if (mediaMetadataRetriever != null) {
                                                            try {
                                                                mediaMetadataRetriever.release();
                                                            } catch (Exception unused6) {
                                                            }
                                                        }
                                                        throw th;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                                    mediaMetadataRetriever = mediaMetadataRetriever2;
                                                    if (mediaMetadataRetriever != null) {
                                                        mediaMetadataRetriever.release();
                                                    }
                                                    throw th;
                                                }
                                            }
                                            writableArray = writableArrayCreateArray;
                                            d14 = d13;
                                            if (bitmap != null) {
                                                try {
                                                    try {
                                                        t0 t0Var2 = t0.f86535a;
                                                        String str4 = String.format("%04d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                                                        s.j(str4, "format(...)");
                                                        File file2 = new File(file, "frame_" + str4 + ".jpg");
                                                        fileOutputStream = new FileOutputStream(file2);
                                                        try {
                                                            bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                                                            b.a(fileOutputStream, null);
                                                            String str5 = photoComplianceSdkModule.TAG;
                                                            double d18 = j14;
                                                            String str6 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d14)}, 1));
                                                            s.j(str6, "format(...)");
                                                            Log.d(str5, "Window " + i11 + ": SELECTED best frame at " + (d18 / 1000.0d) + "ms with quality=" + str6 + " from " + i12 + " candidates");
                                                            WritableMap writableMapCreateMap = Arguments.createMap();
                                                            s.j(writableMapCreateMap, "createMap(...)");
                                                            writableMapCreateMap.putString("path", file2.getAbsolutePath());
                                                            writableMapCreateMap.putInt(Snapshot.WIDTH, bitmap.getWidth());
                                                            writableMapCreateMap.putInt(Snapshot.HEIGHT, bitmap.getHeight());
                                                            writableMapCreateMap.putDouble("timestamp", d18 / 1000000.0d);
                                                            writableMapCreateMap.putDouble("qualityScore", d14);
                                                            writableArray2 = writableArray;
                                                            try {
                                                                writableArray2.pushMap(writableMapCreateMap);
                                                            } catch (Exception e12) {
                                                                e = e12;
                                                                Log.d(photoComplianceSdkModule.TAG, "Failed to save best frame: " + e.getMessage());
                                                            }
                                                        } catch (Throwable th4) {
                                                            writableArray2 = writableArray;
                                                            try {
                                                                throw th4;
                                                            } catch (Throwable th5) {
                                                                b.a(fileOutputStream, th4);
                                                                throw th5;
                                                            }
                                                        }
                                                    } catch (Exception e13) {
                                                        e = e13;
                                                        writableArray2 = writableArray;
                                                    }
                                                    bitmap.recycle();
                                                } catch (Throwable th6) {
                                                    bitmap.recycle();
                                                    throw th6;
                                                }
                                            } else {
                                                writableArray2 = writableArray;
                                            }
                                            i11++;
                                            j17 = jMin;
                                            j13 = j19;
                                            writableArrayCreateArray = writableArray2;
                                            mediaMetadataRetriever4 = mediaMetadataRetriever2;
                                            j11 = j18;
                                            j12 = j15;
                                        } catch (Exception e14) {
                                            e = e14;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                    }
                                }
                                mediaMetadataRetriever2 = mediaMetadataRetriever4;
                                WritableArray writableArray4 = writableArrayCreateArray;
                                Log.d(photoComplianceSdkModule.TAG, "Extraction complete: " + writableArray4.size() + " best frames selected");
                                promise2 = promise;
                                promise2.resolve(writableArray4);
                                mediaMetadataRetriever2.release();
                            } catch (Exception e15) {
                                e = e15;
                                promise2 = promise;
                                mediaMetadataRetriever = mediaMetadataRetriever4;
                                promise2.reject("EXTRACT_ERROR", "Failed to extract frames: " + e.getMessage(), e);
                                if (mediaMetadataRetriever != null) {
                                    return;
                                } else {
                                    mediaMetadataRetriever.release();
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                mediaMetadataRetriever = mediaMetadataRetriever4;
                                if (mediaMetadataRetriever != null) {
                                    mediaMetadataRetriever.release();
                                }
                                throw th;
                            }
                        }
                        promise2.resolve(writableArray4);
                        mediaMetadataRetriever2.release();
                    } catch (Exception e16) {
                        e = e16;
                        mediaMetadataRetriever = mediaMetadataRetriever2;
                        promise2.reject("EXTRACT_ERROR", "Failed to extract frames: " + e.getMessage(), e);
                        if (mediaMetadataRetriever != null) {
                            return;
                        } else {
                            mediaMetadataRetriever.release();
                        }
                    }
                    jLongValue = 0;
                    j11 = 1000 * jLongValue;
                    Log.d(photoComplianceSdkModule.TAG, "Video duration: " + jLongValue + "ms");
                    int iCeil2 = (int) Math.ceil(((double) jLongValue) / d11);
                    Log.d(photoComplianceSdkModule.TAG, "Expected output: " + iCeil2 + " frames (" + ((int) (d11 / d12)) + " candidates per window)");
                    writableArrayCreateArray = Arguments.createArray();
                    file = new File(photoComplianceSdkModule.getReactApplicationContext().getCacheDir(), "frames");
                    if (file.exists()) {
                        sn0.h.B(file);
                    }
                    file.mkdirs();
                    double d19 = 1000;
                    j12 = (long) (d12 * d19);
                    j13 = (long) (d19 * d11);
                    i11 = 0;
                    while (j17 < j11) {
                        mediaMetadataRetriever2 = mediaMetadataRetriever4;
                        jMin = Math.min(j17 + j13, j11);
                        long j110 = j11;
                        d13 = -1.0d;
                        j14 = j17;
                        long j111 = j13;
                        i12 = 0;
                        bitmap = null;
                        while (true) {
                            j15 = j12;
                            if (j17 < jMin) {
                                break;
                                break;
                            }
                            WritableArray writableArray5 = writableArrayCreateArray;
                            mediaMetadataRetriever3 = mediaMetadataRetriever2;
                            frameAtTime = mediaMetadataRetriever3.getFrameAtTime(j17, 2);
                            if (frameAtTime != null) {
                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                                d15 = d13;
                                if (frameAtTime.getWidth() > 1920) {
                                    float fMin3 = Math.min(1920.0f / frameAtTime.getWidth(), 1080.0f / frameAtTime.getHeight());
                                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, (int) (frameAtTime.getWidth() * fMin3), (int) (frameAtTime.getHeight() * fMin3), true);
                                    frameAtTime.recycle();
                                } else if (frameAtTime.getHeight() > 1080) {
                                    float fMin4 = Math.min(1920.0f / frameAtTime.getWidth(), 1080.0f / frameAtTime.getHeight());
                                    bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(frameAtTime, (int) (frameAtTime.getWidth() * fMin4), (int) (frameAtTime.getHeight() * fMin4), true);
                                    frameAtTime.recycle();
                                } else {
                                    bitmapCreateScaledBitmap = frameAtTime;
                                }
                                s.h(bitmapCreateScaledBitmap);
                                dCalculateLaplaceScore = photoComplianceSdkModule.calculateLaplaceScore(bitmapCreateScaledBitmap);
                                i13 = i12 + 1;
                                String str7 = photoComplianceSdkModule.TAG;
                                double d110 = j17 / 1000.0d;
                                t0 t0Var3 = t0.f86535a;
                                bitmap2 = frameAtTime;
                                j16 = j17;
                                String str8 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(dCalculateLaplaceScore)}, 1));
                                s.j(str8, "format(...)");
                                Log.d(str7, "Window " + i11 + " candidate at " + d110 + "ms: quality=" + str8);
                                if (dCalculateLaplaceScore > d15) {
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                    }
                                    bitmap = bitmapCreateScaledBitmap;
                                    i12 = i13;
                                    d13 = dCalculateLaplaceScore;
                                    j14 = j16;
                                } else {
                                    bitmapCreateScaledBitmap.recycle();
                                    d13 = d15;
                                    i12 = i13;
                                }
                            } else {
                                j16 = j17;
                                mediaMetadataRetriever2 = mediaMetadataRetriever3;
                            }
                            j17 = j16 + j15;
                            j12 = j15;
                            writableArrayCreateArray = writableArray5;
                        }
                        writableArray = writableArrayCreateArray;
                        d14 = d13;
                        if (bitmap != null) {
                            t0 t0Var4 = t0.f86535a;
                            String str9 = String.format("%04d", Arrays.copyOf(new Object[]{Integer.valueOf(i11)}, 1));
                            s.j(str9, "format(...)");
                            File file3 = new File(file, "frame_" + str9 + ".jpg");
                            fileOutputStream = new FileOutputStream(file3);
                            bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                            b.a(fileOutputStream, null);
                            String str10 = photoComplianceSdkModule.TAG;
                            double d111 = j14;
                            String str11 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d14)}, 1));
                            s.j(str11, "format(...)");
                            Log.d(str10, "Window " + i11 + ": SELECTED best frame at " + (d111 / 1000.0d) + "ms with quality=" + str11 + " from " + i12 + " candidates");
                            WritableMap writableMapCreateMap2 = Arguments.createMap();
                            s.j(writableMapCreateMap2, "createMap(...)");
                            writableMapCreateMap2.putString("path", file3.getAbsolutePath());
                            writableMapCreateMap2.putInt(Snapshot.WIDTH, bitmap.getWidth());
                            writableMapCreateMap2.putInt(Snapshot.HEIGHT, bitmap.getHeight());
                            writableMapCreateMap2.putDouble("timestamp", d111 / 1000000.0d);
                            writableMapCreateMap2.putDouble("qualityScore", d14);
                            writableArray2 = writableArray;
                            writableArray2.pushMap(writableMapCreateMap2);
                            bitmap.recycle();
                        } else {
                            writableArray2 = writableArray;
                        }
                        i11++;
                        j17 = jMin;
                        j13 = j111;
                        writableArrayCreateArray = writableArray2;
                        mediaMetadataRetriever4 = mediaMetadataRetriever2;
                        j11 = j110;
                        j12 = j15;
                    }
                    mediaMetadataRetriever2 = mediaMetadataRetriever4;
                    WritableArray writableArray6 = writableArrayCreateArray;
                    Log.d(photoComplianceSdkModule.TAG, "Extraction complete: " + writableArray6.size() + " best frames selected");
                    promise2 = promise;
                } catch (Exception e17) {
                    e = e17;
                    promise2 = promise;
                    mediaMetadataRetriever2 = mediaMetadataRetriever4;
                } catch (Throwable th9) {
                    th = th9;
                    mediaMetadataRetriever2 = mediaMetadataRetriever4;
                }
            } catch (Exception unused7) {
            }
        } catch (Exception e18) {
            e = e18;
            promise2 = promise;
            mediaMetadataRetriever = null;
        } catch (Throwable th10) {
            th = th10;
            mediaMetadataRetriever = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getVideoDuration$lambda$0(String str, PhotoComplianceSdkModule photoComplianceSdkModule, Promise promise) throws Throwable {
        Throwable th2;
        Exception exc;
        Long lZ;
        MediaMetadataRetriever mediaMetadataRetriever = null;
        try {
            try {
                try {
                    String strV = t.V(str, "file://", "", false, 4, null);
                    MediaMetadataRetriever mediaMetadataRetriever2 = new MediaMetadataRetriever();
                    try {
                        mediaMetadataRetriever2.setDataSource(strV);
                        String strExtractMetadata = mediaMetadataRetriever2.extractMetadata(9);
                        double dLongValue = ((strExtractMetadata == null || (lZ = t.z(strExtractMetadata)) == null) ? 0L : lZ.longValue()) / 1000.0d;
                        Log.d(photoComplianceSdkModule.TAG, "Video duration: " + dLongValue + "s");
                        promise.resolve(Double.valueOf(dLongValue));
                        mediaMetadataRetriever2.release();
                    } catch (Exception e11) {
                        exc = e11;
                        mediaMetadataRetriever = mediaMetadataRetriever2;
                        promise.reject("DURATION_ERROR", "Failed to get video duration: " + exc.getMessage(), exc);
                        if (mediaMetadataRetriever == null) {
                        } else {
                            mediaMetadataRetriever.release();
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        mediaMetadataRetriever = mediaMetadataRetriever2;
                        if (mediaMetadataRetriever == null) {
                            throw th2;
                        }
                        try {
                            mediaMetadataRetriever.release();
                            throw th2;
                        } catch (Exception unused) {
                            throw th2;
                        }
                    }
                } catch (Exception unused2) {
                }
            } catch (Exception e12) {
                exc = e12;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    @ReactMethod
    public final void extractFrames(final String videoPath, final double intervalMs, final Promise promise) {
        s.k(videoPath, "videoPath");
        s.k(promise, "promise");
        Log.d(this.TAG, "extractFrames called");
        Log.d(this.TAG, "Video path: " + videoPath);
        Log.d(this.TAG, "Interval: " + intervalMs + "ms");
        new Thread(new Runnable() { // from class: e00.b
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                PhotoComplianceSdkModule.extractFrames$lambda$8(videoPath, this, intervalMs, promise);
            }
        }).start();
    }

    @ReactMethod
    public final void extractFramesWithQualityScores(final String videoPath, final double intervalMs, final Promise promise) {
        s.k(videoPath, "videoPath");
        s.k(promise, "promise");
        Log.d(this.TAG, "extractFramesWithQualityScores called");
        Log.d(this.TAG, "Video path: " + videoPath);
        String str = this.TAG;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Screenshot interval: ");
        final double d11 = 200.0d;
        sb2.append(200.0d);
        sb2.append("ms, Selection interval: ");
        sb2.append(intervalMs);
        sb2.append("ms");
        Log.d(str, sb2.toString());
        new Thread(new Runnable() { // from class: e00.a
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                PhotoComplianceSdkModule.extractFramesWithQualityScores$lambda$4(videoPath, this, intervalMs, d11, promise);
            }
        }).start();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public final void getVideoDuration(final String videoPath, final Promise promise) {
        s.k(videoPath, "videoPath");
        s.k(promise, "promise");
        Log.d(this.TAG, "getVideoDuration called");
        Log.d(this.TAG, "Video path: " + videoPath);
        new Thread(new Runnable() { // from class: e00.c
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                PhotoComplianceSdkModule.getVideoDuration$lambda$0(videoPath, this, promise);
            }
        }).start();
    }

    @ReactMethod
    public final void multiply(double a11, double b11, Promise promise) {
        s.k(promise, "promise");
        promise.resolve(Double.valueOf(a11 * b11));
    }
}
