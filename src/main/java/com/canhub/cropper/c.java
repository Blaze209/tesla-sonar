package com.canhub.cropper;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.util.Pair;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import jn0.h0;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001:\u0002\u001e<B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u007f\u0010'\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b'\u0010(Jw\u0010+\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001dH\u0002¢\u0006\u0004\b1\u00102J)\u00104\u001a\u0004\u0018\u00010\u00042\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u001d2\u0006\u00103\u001a\u000200H\u0002¢\u0006\u0004\b4\u00105J?\u00106\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b6\u00107JG\u00108\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u00109J/\u0010:\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010<\u001a\u00020\b2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b<\u0010=J/\u0010?\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b?\u0010@J'\u0010B\u001a\u00020A2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u001d¢\u0006\u0004\bB\u0010CJ\u001f\u0010F\u001a\u00020A2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ-\u0010H\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010/\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b¢\u0006\u0004\bH\u0010IJO\u0010J\u001a\u00020&2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\bJ\u0010KJw\u0010L\u001a\u00020&2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010!\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\bL\u0010MJ\u0015\u0010O\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u0006¢\u0006\u0004\bO\u0010PJ\u0015\u0010Q\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u0006¢\u0006\u0004\bQ\u0010PJ\u0015\u0010R\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u0006¢\u0006\u0004\bR\u0010PJ\u0015\u0010S\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u0006¢\u0006\u0004\bS\u0010PJ\u0015\u0010T\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u0006¢\u0006\u0004\bT\u0010PJ\u0015\u0010U\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u0006¢\u0006\u0004\bU\u0010PJ\u0015\u0010V\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u0006¢\u0006\u0004\bV\u0010PJ\u0015\u0010W\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u0006¢\u0006\u0004\bW\u0010PJ=\u0010Z\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\bZ\u0010[J+\u0010]\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\\\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b]\u0010^J7\u0010`\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010_\u001a\u00020\b2\b\u0010\\\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b`\u0010aJ/\u0010c\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u00103\u001a\u00020b¢\u0006\u0004\bc\u0010dR\u0017\u0010h\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b<\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010m\u001a\u00020i8\u0006¢\u0006\f\n\u0004\b:\u0010j\u001a\u0004\bk\u0010lR\u0017\u0010o\u001a\u00020i8\u0006¢\u0006\f\n\u0004\bL\u0010j\u001a\u0004\bn\u0010lR\u0017\u0010s\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010p\u001a\u0004\bq\u0010rR\u0017\u0010u\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010p\u001a\u0004\bt\u0010rR\u0016\u0010w\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010vR6\u0010\u007f\u001a\u0016\u0012\u0004\u0012\u00020y\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040z\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010{\u001a\u0004\b|\u0010}\"\u0004\bv\u0010~R\u0017\u0010\u0082\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001¨\u0006\u0083\u0001"}, d2 = {"Lcom/canhub/cropper/c;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "cropPoints", "", "degreesRotated", "", "fixAspectRatio", "aspectRatioX", "aspectRatioY", "", "scale", "flipHorizontally", "flipVertically", "h", "(Landroid/graphics/Bitmap;[FIZIIFZZ)Landroid/graphics/Bitmap;", "Landroid/graphics/Rect;", "rect", "Ljn0/h0;", "n", "(Landroid/graphics/Rect;II)V", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/graphics/Bitmap$CompressFormat;", "compressFormat", "Landroid/net/Uri;", "a", "(Landroid/content/Context;Landroid/graphics/Bitmap$CompressFormat;)Landroid/net/Uri;", "loadedImageUri", "orgWidth", "orgHeight", "reqWidth", "reqHeight", "sampleMulti", "Lcom/canhub/cropper/c$a;", "e", "(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZI)Lcom/canhub/cropper/c$a;", Snapshot.WIDTH, Snapshot.HEIGHT, "f", "(Landroid/content/Context;Landroid/net/Uri;[FIZIIILandroid/graphics/Rect;IIZZ)Lcom/canhub/cropper/c$a;", "Landroid/content/ContentResolver;", "resolver", "uri", "Landroid/graphics/BitmapFactory$Options;", "k", "(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/BitmapFactory$Options;", "options", "j", "(Landroid/content/ContentResolver;Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;", "m", "(Landroid/content/Context;Landroid/net/Uri;Landroid/graphics/Rect;III)Lcom/canhub/cropper/c$a;", IntegerTokenConverter.CONVERTER_KEY, "(Landroid/graphics/Bitmap;[FLandroid/graphics/Rect;IZII)Landroid/graphics/Bitmap;", "c", "(IIII)I", "b", "(II)I", "degrees", "H", "(Landroid/graphics/Bitmap;IZZ)Landroid/graphics/Bitmap;", "Lcom/canhub/cropper/c$b;", "E", "(Landroid/graphics/Bitmap;Landroid/content/Context;Landroid/net/Uri;)Lcom/canhub/cropper/c$b;", "Le7/a;", "exif", Gender.FEMALE, "(Landroid/graphics/Bitmap;Le7/a;)Lcom/canhub/cropper/c$b;", "l", "(Landroid/content/Context;Landroid/net/Uri;II)Lcom/canhub/cropper/c$a;", "g", "(Landroid/graphics/Bitmap;[FIZIIZZ)Lcom/canhub/cropper/c$a;", DateTokenConverter.CONVERTER_KEY, "(Landroid/content/Context;Landroid/net/Uri;[FIIIZIIIIZZ)Lcom/canhub/cropper/c$a;", "points", "A", "([F)F", "C", "B", "v", "D", "z", "w", "x", "imageWidth", "imageHeight", "y", "([FIIZII)Landroid/graphics/Rect;", "customOutputUri", "K", "(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/net/Uri;)Landroid/net/Uri;", "compressQuality", "J", "(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap$CompressFormat;ILandroid/net/Uri;)Landroid/net/Uri;", "Lcom/canhub/cropper/CropImageView$k;", "G", "(Landroid/graphics/Bitmap;IILcom/canhub/cropper/CropImageView$k;)Landroid/graphics/Bitmap;", "Landroid/graphics/Rect;", "o", "()Landroid/graphics/Rect;", "EMPTY_RECT", "Landroid/graphics/RectF;", "Landroid/graphics/RectF;", "p", "()Landroid/graphics/RectF;", "EMPTY_RECT_F", "u", "RECT", "[F", "s", "()[F", "POINTS", "t", "POINTS2", "I", "mMaxTextureSize", "Landroid/util/Pair;", "", "Ljava/lang/ref/WeakReference;", "Landroid/util/Pair;", "q", "()Landroid/util/Pair;", "(Landroid/util/Pair;)V", "mStateBitmap", "r", "()I", "maxTextureSize", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f21036a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Rect EMPTY_RECT = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final RectF EMPTY_RECT_F = new RectF();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final RectF RECT = new RectF();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float[] POINTS = new float[6];

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float[] POINTS2 = new float[6];

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static int mMaxTextureSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static Pair<String, WeakReference<Bitmap>> mStateBitmap;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/canhub/cropper/c$a;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "sampleSize", "<init>", "(Landroid/graphics/Bitmap;I)V", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "I", "()I", "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Bitmap bitmap;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int sampleSize;

        public a(Bitmap bitmap, int i11) {
            this.bitmap = bitmap;
            this.sampleSize = i11;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getSampleSize() {
            return this.sampleSize;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/canhub/cropper/c$b;", "", "Landroid/graphics/Bitmap;", "bitmap", "", "degrees", "", "flipHorizontally", "flipVertically", "<init>", "(Landroid/graphics/Bitmap;IZZ)V", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "I", "()I", "c", "Z", "()Z", DateTokenConverter.CONVERTER_KEY, "cropper_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Bitmap bitmap;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int degrees;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean flipHorizontally;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean flipVertically;

        public b(Bitmap bitmap, int i11, boolean z11, boolean z12) {
            this.bitmap = bitmap;
            this.degrees = i11;
            this.flipHorizontally = z11;
            this.flipVertically = z12;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getDegrees() {
            return this.degrees;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getFlipHorizontally() {
            return this.flipHorizontally;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getFlipVertically() {
            return this.flipVertically;
        }
    }

    /* JADX INFO: renamed from: com.canhub.cropper.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class C0423c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21050a;

        static {
            int[] iArr = new int[Bitmap.CompressFormat.values().length];
            try {
                iArr[Bitmap.CompressFormat.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Bitmap.CompressFormat.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f21050a = iArr;
        }
    }

    private c() {
    }

    private final Bitmap H(Bitmap bitmap, int degrees, boolean flipHorizontally, boolean flipVertically) {
        if (degrees <= 0 && !flipHorizontally && !flipVertically) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(degrees);
        matrix.postScale(flipHorizontally ? -1 : 1, flipVertically ? -1 : 1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        p013kotlin.jvm.internal.s.j(bitmapCreateBitmap, "createBitmap(...)");
        if (!p013kotlin.jvm.internal.s.f(bitmapCreateBitmap, bitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    private final Uri a(Context context, Bitmap.CompressFormat compressFormat) {
        String str;
        try {
            int i11 = C0423c.f21050a[compressFormat.ordinal()];
            if (i11 != 1) {
                str = i11 != 2 ? ".webp" : ".png";
            } else {
                str = ".jpg";
            }
            if (Build.VERSION.SDK_INT < 29) {
                return Uri.fromFile(File.createTempFile("cropped", str, context.getCacheDir()));
            }
            try {
                File fileCreateTempFile = File.createTempFile("cropped", str, context.getExternalFilesDir(Environment.DIRECTORY_PICTURES));
                p013kotlin.jvm.internal.s.h(fileCreateTempFile);
                return ak.a.b(context, fileCreateTempFile);
            } catch (Exception e11) {
                Log.e("AIC", String.valueOf(e11.getMessage()));
                File fileCreateTempFile2 = File.createTempFile("cropped", str, context.getCacheDir());
                p013kotlin.jvm.internal.s.h(fileCreateTempFile2);
                return ak.a.b(context, fileCreateTempFile2);
            }
        } catch (IOException e12) {
            throw new RuntimeException("Failed to create temp file for output image", e12);
        }
    }

    private final int b(int width, int height) {
        if (mMaxTextureSize == 0) {
            mMaxTextureSize = r();
        }
        int i11 = 1;
        if (mMaxTextureSize <= 0) {
            return 1;
        }
        while (true) {
            int i12 = height / i11;
            int i13 = mMaxTextureSize;
            if (i12 <= i13 && width / i11 <= i13) {
                return i11;
            }
            i11 *= 2;
        }
    }

    private final int c(int width, int height, int reqWidth, int reqHeight) {
        int i11 = 1;
        if (height <= reqHeight && width <= reqWidth) {
            return 1;
        }
        while ((height / 2) / i11 > reqHeight && (width / 2) / i11 > reqWidth) {
            i11 *= 2;
        }
        return i11;
    }

    private final a e(Context context, Uri loadedImageUri, float[] cropPoints, int degreesRotated, int orgWidth, int orgHeight, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, int reqWidth, int reqHeight, boolean flipHorizontally, boolean flipVertically, int sampleMulti) {
        int sampleSize;
        Rect rectY = y(cropPoints, orgWidth, orgHeight, fixAspectRatio, aspectRatioX, aspectRatioY);
        int iWidth = reqWidth > 0 ? reqWidth : rectY.width();
        int iHeight = reqHeight > 0 ? reqHeight : rectY.height();
        Bitmap bitmap = null;
        try {
            a aVarM = m(context, loadedImageUri, rectY, iWidth, iHeight, sampleMulti);
            try {
                bitmap = aVarM.getBitmap();
                sampleSize = aVarM.getSampleSize();
            } catch (Exception unused) {
                sampleSize = 1;
            }
        } catch (Exception unused2) {
            rectY = rectY;
        }
        int i11 = sampleSize;
        Bitmap bitmap2 = bitmap;
        if (bitmap2 == null) {
            return f(context, loadedImageUri, cropPoints, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY, sampleMulti, rectY, iWidth, iHeight, flipHorizontally, flipVertically);
        }
        try {
            Bitmap bitmapH = H(bitmap2, degreesRotated, flipHorizontally, flipVertically);
            try {
                if (degreesRotated % 90 != 0) {
                    bitmapH = i(bitmapH, cropPoints, rectY, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY);
                }
                return new a(bitmapH, i11);
            } catch (OutOfMemoryError e11) {
                e = e11;
                bitmap2 = bitmapH;
                bitmap2.recycle();
                throw e;
            }
        } catch (OutOfMemoryError e12) {
            e = e12;
        }
    }

    private final a f(Context context, Uri loadedImageUri, float[] cropPoints, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, int sampleMulti, Rect rect, int width, int height, boolean flipHorizontally, boolean flipVertically) throws Throwable {
        Bitmap bitmap;
        Bitmap bitmapH = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            int iC = sampleMulti * c(rect.width(), rect.height(), width, height);
            options.inSampleSize = iC;
            ContentResolver contentResolver = context.getContentResolver();
            p013kotlin.jvm.internal.s.j(contentResolver, "getContentResolver(...)");
            Bitmap bitmapJ = j(contentResolver, loadedImageUri, options);
            if (bitmapJ != null) {
                try {
                    int length = cropPoints.length;
                    try {
                        float[] fArr = new float[length];
                        System.arraycopy(cropPoints, 0, fArr, 0, cropPoints.length);
                        for (int i11 = 0; i11 < length; i11++) {
                            fArr[i11] = fArr[i11] / options.inSampleSize;
                        }
                        bitmap = bitmapJ;
                        try {
                            bitmapH = h(bitmap, fArr, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY, 1.0f, flipHorizontally, flipVertically);
                            if (!p013kotlin.jvm.internal.s.f(bitmapH, bitmap)) {
                                bitmap.recycle();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (!p013kotlin.jvm.internal.s.f(null, bitmap)) {
                                bitmap.recycle();
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        bitmap = bitmapJ;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    bitmap = bitmapJ;
                }
            }
            return new a(bitmapH, iC);
        } catch (Exception e11) {
            throw new CropException.FailedToLoadBitmap(loadedImageUri, e11.getMessage());
        } catch (OutOfMemoryError e12) {
            if (0 != 0) {
                bitmapH.recycle();
            }
            throw e12;
        }
    }

    private final Bitmap h(Bitmap bitmap, float[] cropPoints, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, float scale, boolean flipHorizontally, boolean flipVertically) {
        float f11 = scale;
        Rect rectY = y(cropPoints, bitmap.getWidth(), bitmap.getHeight(), fixAspectRatio, aspectRatioX, aspectRatioY);
        Matrix matrix = new Matrix();
        matrix.setRotate(degreesRotated, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
        float f12 = flipHorizontally ? -f11 : f11;
        if (flipVertically) {
            f11 = -f11;
        }
        matrix.postScale(f12, f11);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rectY.left, rectY.top, rectY.width(), rectY.height(), matrix, true);
        p013kotlin.jvm.internal.s.j(bitmapCreateBitmap, "createBitmap(...)");
        if (p013kotlin.jvm.internal.s.f(bitmapCreateBitmap, bitmap)) {
            bitmapCreateBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return degreesRotated % 90 != 0 ? i(bitmapCreateBitmap, cropPoints, rectY, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY) : bitmapCreateBitmap;
    }

    private final Bitmap i(Bitmap bitmap, float[] cropPoints, Rect rect, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY) {
        int iAbs;
        int iAbs2;
        int iAbs3;
        if (degreesRotated % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians(degreesRotated);
        int i11 = (degreesRotated < 90 || (181 <= degreesRotated && degreesRotated < 270)) ? rect.left : rect.right;
        int iAbs4 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= cropPoints.length) {
                iAbs = 0;
                iAbs2 = 0;
                iAbs3 = 0;
                break;
            }
            float f11 = cropPoints[i12];
            if (f11 >= i11 - 1 && f11 <= i11 + 1) {
                int i13 = i12 + 1;
                iAbs4 = (int) Math.abs(Math.sin(radians) * ((double) (rect.bottom - cropPoints[i13])));
                iAbs2 = (int) Math.abs(Math.cos(radians) * ((double) (cropPoints[i13] - rect.top)));
                iAbs3 = (int) Math.abs(((double) (cropPoints[i13] - rect.top)) / Math.sin(radians));
                iAbs = (int) Math.abs(((double) (rect.bottom - cropPoints[i13])) / Math.cos(radians));
                break;
            }
            i12 += 2;
        }
        rect.set(iAbs4, iAbs2, iAbs3 + iAbs4, iAbs + iAbs2);
        if (fixAspectRatio) {
            n(rect, aspectRatioX, aspectRatioY);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (!p013kotlin.jvm.internal.s.f(bitmap, bitmapCreateBitmap)) {
            bitmap.recycle();
        }
        return bitmapCreateBitmap;
    }

    private final Bitmap j(ContentResolver resolver, Uri uri, BitmapFactory.Options options) throws CropException.FailedToDecodeImage, FileNotFoundException {
        do {
            InputStream inputStreamOpenInputStream = resolver.openInputStream(uri);
            try {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, EMPTY_RECT, options);
                    sn0.b.a(inputStreamOpenInputStream, null);
                    return bitmapDecodeStream;
                } catch (OutOfMemoryError unused) {
                    options.inSampleSize *= 2;
                    h0 h0Var = h0.f84049a;
                    sn0.b.a(inputStreamOpenInputStream, null);
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    sn0.b.a(inputStreamOpenInputStream, th2);
                    throw th3;
                }
            }
        } while (options.inSampleSize <= 512);
        throw new CropException.FailedToDecodeImage(uri);
    }

    private final BitmapFactory.Options k(ContentResolver resolver, Uri uri) throws FileNotFoundException {
        InputStream inputStreamOpenInputStream = resolver.openInputStream(uri);
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenInputStream, EMPTY_RECT, options);
            options.inJustDecodeBounds = false;
            sn0.b.a(inputStreamOpenInputStream, null);
            return options;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(inputStreamOpenInputStream, th2);
                throw th3;
            }
        }
    }

    private final a m(Context context, Uri uri, Rect rect, int reqWidth, int reqHeight, int sampleMulti) throws CropException.FailedToLoadBitmap {
        BitmapRegionDecoder bitmapRegionDecoderNewInstance;
        int i11;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = sampleMulti * c(rect.width(), rect.height(), reqWidth, reqHeight);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    p013kotlin.jvm.internal.s.h(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream);
                } else {
                    p013kotlin.jvm.internal.s.h(inputStreamOpenInputStream);
                    bitmapRegionDecoderNewInstance = BitmapRegionDecoder.newInstance(inputStreamOpenInputStream, false);
                }
                do {
                    try {
                        try {
                            p013kotlin.jvm.internal.s.h(bitmapRegionDecoderNewInstance);
                            a aVar = new a(bitmapRegionDecoderNewInstance.decodeRegion(rect, options), options.inSampleSize);
                            bitmapRegionDecoderNewInstance.recycle();
                            sn0.b.a(inputStreamOpenInputStream, null);
                            return aVar;
                        } catch (OutOfMemoryError unused) {
                            i11 = options.inSampleSize * 2;
                            options.inSampleSize = i11;
                        }
                    } catch (Throwable th2) {
                        if (bitmapRegionDecoderNewInstance != null) {
                            bitmapRegionDecoderNewInstance.recycle();
                        }
                        throw th2;
                    }
                } while (i11 <= 512);
                if (bitmapRegionDecoderNewInstance != null) {
                    bitmapRegionDecoderNewInstance.recycle();
                }
                h0 h0Var = h0.f84049a;
                sn0.b.a(inputStreamOpenInputStream, null);
                return new a(null, 1);
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    sn0.b.a(inputStreamOpenInputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e11) {
            throw new CropException.FailedToLoadBitmap(uri, e11.getMessage());
        }
    }

    private final void n(Rect rect, int aspectRatioX, int aspectRatioY) {
        if (aspectRatioX != aspectRatioY || rect.width() == rect.height()) {
            return;
        }
        if (rect.height() > rect.width()) {
            rect.bottom -= rect.height() - rect.width();
        } else {
            rect.right -= rect.width() - rect.height();
        }
    }

    private final int r() {
        try {
            EGL egl = EGLContext.getEGL();
            p013kotlin.jvm.internal.s.i(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            EGL10 egl10 = (EGL10) egl;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2]);
            int[] iArr = new int[1];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, null, 0, iArr);
            int i11 = iArr[0];
            EGLConfig[] eGLConfigArr = new EGLConfig[i11];
            egl10.eglGetConfigs(eGLDisplayEglGetDisplay, eGLConfigArr, i11, iArr);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            int i13 = 0;
            for (int i14 = 0; i14 < i12; i14++) {
                egl10.eglGetConfigAttrib(eGLDisplayEglGetDisplay, eGLConfigArr[i14], 12332, iArr2);
                int i15 = iArr2[0];
                if (i13 < i15) {
                    i13 = i15;
                }
            }
            egl10.eglTerminate(eGLDisplayEglGetDisplay);
            return Math.max(i13, 2048);
        } catch (Exception unused) {
            return 2048;
        }
    }

    public final float A(float[] points) {
        p013kotlin.jvm.internal.s.k(points, "points");
        return Math.min(Math.min(Math.min(points[0], points[2]), points[4]), points[6]);
    }

    public final float B(float[] points) {
        p013kotlin.jvm.internal.s.k(points, "points");
        return Math.max(Math.max(Math.max(points[0], points[2]), points[4]), points[6]);
    }

    public final float C(float[] points) {
        p013kotlin.jvm.internal.s.k(points, "points");
        return Math.min(Math.min(Math.min(points[1], points[3]), points[5]), points[7]);
    }

    public final float D(float[] points) {
        p013kotlin.jvm.internal.s.k(points, "points");
        return B(points) - A(points);
    }

    public final b E(Bitmap bitmap, Context context, Uri uri) {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(uri, "uri");
        e7.a aVar = null;
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    e7.a aVar2 = new e7.a(inputStreamOpenInputStream);
                    sn0.b.a(inputStreamOpenInputStream, null);
                    aVar = aVar2;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        sn0.b.a(inputStreamOpenInputStream, th2);
                        throw th3;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return aVar != null ? F(bitmap, aVar) : new b(bitmap, 0, false, false);
    }

    public final b F(Bitmap bitmap, e7.a exif) {
        int i11;
        p013kotlin.jvm.internal.s.k(exif, "exif");
        boolean z11 = true;
        int iM = exif.m("Orientation", 1);
        if (iM == 3) {
            i11 = 180;
        } else if (iM == 5 || iM == 6 || iM == 7) {
            i11 = 90;
        } else {
            i11 = iM != 8 ? 0 : EnumC4419g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE;
        }
        boolean z12 = iM == 2 || iM == 5;
        if (iM != 4 && iM != 7) {
            z11 = false;
        }
        return new b(bitmap, i11, z12, z11);
    }

    public final Bitmap G(Bitmap bitmap, int reqWidth, int reqHeight, CropImageView.k options) {
        Bitmap bitmapCreateScaledBitmap;
        p013kotlin.jvm.internal.s.k(options, "options");
        if (reqWidth > 0 && reqHeight > 0) {
            try {
                CropImageView.k kVar = CropImageView.k.RESIZE_FIT;
                if (options == kVar || options == CropImageView.k.RESIZE_INSIDE || options == CropImageView.k.RESIZE_EXACT) {
                    if (options == CropImageView.k.RESIZE_EXACT) {
                        p013kotlin.jvm.internal.s.h(bitmap);
                        bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, reqWidth, reqHeight, false);
                    } else {
                        p013kotlin.jvm.internal.s.h(bitmap);
                        float width = bitmap.getWidth();
                        float height = bitmap.getHeight();
                        float fMax = Math.max(width / reqWidth, height / reqHeight);
                        bitmapCreateScaledBitmap = (fMax > 1.0f || options == kVar) ? Bitmap.createScaledBitmap(bitmap, (int) (width / fMax), (int) (height / fMax), false) : null;
                    }
                    if (bitmapCreateScaledBitmap != null) {
                        if (!p013kotlin.jvm.internal.s.f(bitmapCreateScaledBitmap, bitmap)) {
                            bitmap.recycle();
                        }
                        return bitmapCreateScaledBitmap;
                    }
                }
            } catch (Exception e11) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e11);
            }
        }
        p013kotlin.jvm.internal.s.h(bitmap);
        return bitmap;
    }

    public final void I(Pair<String, WeakReference<Bitmap>> pair) {
        mStateBitmap = pair;
    }

    public final Uri J(Context context, Bitmap bitmap, Bitmap.CompressFormat compressFormat, int compressQuality, Uri customOutputUri) throws FileNotFoundException {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(bitmap, "bitmap");
        p013kotlin.jvm.internal.s.k(compressFormat, "compressFormat");
        if (customOutputUri == null) {
            customOutputUri = a(context, compressFormat);
        }
        OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(customOutputUri, "wt");
        p013kotlin.jvm.internal.s.h(outputStreamOpenOutputStream);
        try {
            bitmap.compress(compressFormat, compressQuality, outputStreamOpenOutputStream);
            sn0.b.a(outputStreamOpenOutputStream, null);
            return customOutputUri;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                sn0.b.a(outputStreamOpenOutputStream, th2);
                throw th3;
            }
        }
    }

    public final Uri K(Context context, Bitmap bitmap, Uri customOutputUri) {
        p013kotlin.jvm.internal.s.k(context, "context");
        try {
            p013kotlin.jvm.internal.s.h(bitmap);
            return J(context, bitmap, Bitmap.CompressFormat.JPEG, 95, customOutputUri);
        } catch (Exception e11) {
            Log.w("AIC", "Failed to write bitmap to temp file for image-cropper save instance state", e11);
            return null;
        }
    }

    public final a d(Context context, Uri loadedImageUri, float[] cropPoints, int degreesRotated, int orgWidth, int orgHeight, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, int reqWidth, int reqHeight, boolean flipHorizontally, boolean flipVertically) {
        Context context2 = context;
        p013kotlin.jvm.internal.s.k(context2, "context");
        float[] cropPoints2 = cropPoints;
        p013kotlin.jvm.internal.s.k(cropPoints2, "cropPoints");
        int i11 = 1;
        while (true) {
            try {
                p013kotlin.jvm.internal.s.h(loadedImageUri);
                return e(context2, loadedImageUri, cropPoints2, degreesRotated, orgWidth, orgHeight, fixAspectRatio, aspectRatioX, aspectRatioY, reqWidth, reqHeight, flipHorizontally, flipVertically, i11);
            } catch (OutOfMemoryError e11) {
                i11 *= 2;
                if (i11 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i11 + "): " + loadedImageUri + "\r\n" + e11.getMessage(), e11);
                }
                context2 = context;
                cropPoints2 = cropPoints;
            }
        }
    }

    public final a g(Bitmap bitmap, float[] cropPoints, int degreesRotated, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY, boolean flipHorizontally, boolean flipVertically) {
        p013kotlin.jvm.internal.s.k(cropPoints, "cropPoints");
        int i11 = 1;
        do {
            try {
                p013kotlin.jvm.internal.s.h(bitmap);
                return new a(h(bitmap, cropPoints, degreesRotated, fixAspectRatio, aspectRatioX, aspectRatioY, 1 / i11, flipHorizontally, flipVertically), i11);
            } catch (OutOfMemoryError e11) {
                i11 *= 2;
            }
        } while (i11 <= 8);
        throw e11;
    }

    public final a l(Context context, Uri uri, int reqWidth, int reqHeight) throws CropException.FailedToLoadBitmap {
        p013kotlin.jvm.internal.s.k(context, "context");
        p013kotlin.jvm.internal.s.k(uri, "uri");
        try {
            ContentResolver contentResolver = context.getContentResolver();
            p013kotlin.jvm.internal.s.h(contentResolver);
            BitmapFactory.Options optionsK = k(contentResolver, uri);
            int i11 = optionsK.outWidth;
            if (i11 == -1 && optionsK.outHeight == -1) {
                throw new RuntimeException("File is not a picture");
            }
            optionsK.inSampleSize = Math.max(c(i11, optionsK.outHeight, reqWidth, reqHeight), b(optionsK.outWidth, optionsK.outHeight));
            return new a(j(contentResolver, uri, optionsK), optionsK.inSampleSize);
        } catch (Exception e11) {
            throw new CropException.FailedToLoadBitmap(uri, e11.getMessage());
        }
    }

    public final Rect o() {
        return EMPTY_RECT;
    }

    public final RectF p() {
        return EMPTY_RECT_F;
    }

    public final Pair<String, WeakReference<Bitmap>> q() {
        return mStateBitmap;
    }

    public final float[] s() {
        return POINTS;
    }

    public final float[] t() {
        return POINTS2;
    }

    public final RectF u() {
        return RECT;
    }

    public final float v(float[] points) {
        p013kotlin.jvm.internal.s.k(points, "points");
        return Math.max(Math.max(Math.max(points[1], points[3]), points[5]), points[7]);
    }

    public final float w(float[] points) {
        p013kotlin.jvm.internal.s.k(points, "points");
        return (B(points) + A(points)) / 2.0f;
    }

    public final float x(float[] points) {
        p013kotlin.jvm.internal.s.k(points, "points");
        return (v(points) + C(points)) / 2.0f;
    }

    public final Rect y(float[] cropPoints, int imageWidth, int imageHeight, boolean fixAspectRatio, int aspectRatioX, int aspectRatioY) {
        p013kotlin.jvm.internal.s.k(cropPoints, "cropPoints");
        Rect rect = new Rect(yn0.a.d(Math.max(BitmapDescriptorFactory.HUE_RED, A(cropPoints))), yn0.a.d(Math.max(BitmapDescriptorFactory.HUE_RED, C(cropPoints))), yn0.a.d(Math.min(imageWidth, B(cropPoints))), yn0.a.d(Math.min(imageHeight, v(cropPoints))));
        if (fixAspectRatio) {
            n(rect, aspectRatioX, aspectRatioY);
        }
        return rect;
    }

    public final float z(float[] points) {
        p013kotlin.jvm.internal.s.k(points, "points");
        return v(points) - C(points);
    }
}
