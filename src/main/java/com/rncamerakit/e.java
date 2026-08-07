package com.rncamerakit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioManager;
import android.media.MediaActionSound;
import android.net.Uri;
import android.util.Log;
import android.util.Size;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.OrientationEventListener;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.core.CameraControl;
import androidx.camera.core.ImageCaptureException;
import androidx.camera.view.PreviewView;
import androidx.p003lifecycle.d0;
import androidx.p003lifecycle.w;
import c0.a2;
import c0.c1;
import c0.d2;
import c0.e0;
import c0.h1;
import c0.r0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.facebook.react.uimanager.v0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import jn0.h0;
import kotlinx.coroutines.DebugKt;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.collections.v;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ©\u00012\u00020\u00012\u00020\u0002:\u0001mB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u0010J\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u0010J#\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u001cH\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\f2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u00020\f2\u0006\u00102\u001a\u00020\u001cH\u0002¢\u0006\u0004\b3\u0010-J\u0017\u00104\u001a\u00020\f2\u0006\u00102\u001a\u00020\u001cH\u0002¢\u0006\u0004\b4\u0010-J\u0019\u00106\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b6\u00107J\u001f\u0010#\u001a\u00020\u001c2\u0006\u00108\u001a\u00020\u001c2\u0006\u00109\u001a\u00020\u001cH\u0002¢\u0006\u0004\b#\u0010 J\u000f\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b;\u0010<J\u0015\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001c0=H\u0002¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\fH\u0014¢\u0006\u0004\b@\u0010\u0010J\u000f\u0010A\u001a\u00020\fH\u0014¢\u0006\u0004\bA\u0010\u0010J\u0019\u0010D\u001a\u00020:2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\f2\u0006\u0010F\u001a\u00020\u001c¢\u0006\u0004\bG\u0010-J\u0015\u0010I\u001a\u00020\f2\u0006\u0010H\u001a\u00020:¢\u0006\u0004\bI\u0010JJ)\u0010P\u001a\u00020\f2\u0012\u0010M\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020L0K2\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\f2\b\u0010R\u001a\u0004\u0018\u00010.¢\u0006\u0004\bS\u00101J\u0017\u0010T\u001a\u00020\f2\b\u0010R\u001a\u0004\u0018\u00010.¢\u0006\u0004\bT\u00101J\u0017\u0010U\u001a\u00020\f2\b\b\u0002\u0010R\u001a\u00020.¢\u0006\u0004\bU\u00101J\u0017\u0010V\u001a\u00020\f2\b\u0010R\u001a\u0004\u0018\u00010.¢\u0006\u0004\bV\u00101J\u0017\u0010X\u001a\u00020\f2\b\u0010W\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bX\u00107J\u0017\u0010Y\u001a\u00020\f2\b\u0010W\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\bY\u00107J\u0015\u0010Z\u001a\u00020\f2\u0006\u0010H\u001a\u00020:¢\u0006\u0004\bZ\u0010JJ\u0015\u0010\\\u001a\u00020\f2\u0006\u0010[\u001a\u00020\u001c¢\u0006\u0004\b\\\u0010-J\u0017\u0010^\u001a\u00020\f2\b\b\u0002\u0010]\u001a\u00020.¢\u0006\u0004\b^\u00101J\u0015\u0010`\u001a\u00020\f2\u0006\u0010_\u001a\u00020.¢\u0006\u0004\b`\u00101J\u0015\u0010a\u001a\u00020\f2\u0006\u0010H\u001a\u00020:¢\u0006\u0004\ba\u0010JJ\u0017\u0010c\u001a\u00020\f2\b\b\u0001\u0010b\u001a\u00020\u001c¢\u0006\u0004\bc\u0010-J\u0017\u0010d\u001a\u00020\f2\b\b\u0001\u0010b\u001a\u00020\u001c¢\u0006\u0004\bd\u0010-J\u0015\u0010g\u001a\u00020\f2\u0006\u0010f\u001a\u00020e¢\u0006\u0004\bg\u0010hJ\u0017\u0010k\u001a\u00020\f2\b\u0010j\u001a\u0004\u0018\u00010i¢\u0006\u0004\bk\u0010lR\u0014\u0010o\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010r\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0018\u0010~\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010}R\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001a\u0010\u0086\u0001\u001a\u00030\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u008a\u0001\u001a\u00030\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001a\u0010\u0092\u0001\u001a\u00030\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001c\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u001b\u0010\u0099\u0001\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0018\u0010\u009b\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u009a\u0001\u00100R\u0019\u0010\u009e\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001a\u0010¢\u0001\u001a\u00030\u009f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u0018\u0010¤\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b£\u0001\u00100R\u0019\u0010¦\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010\u0098\u0001R\u0019\u0010¨\u0001\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010\u0098\u0001R\u0018\u0010ª\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001f\u0010©\u0001R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010«\u0001R\u001b\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010«\u0001R\u0017\u0010®\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u00103R\u0017\u0010¯\u0001\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00103R\u0018\u0010°\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b#\u0010\u009d\u0001R\u0018\u0010²\u0001\u001a\u00030±\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00106R\u0017\u0010³\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00100R\u0017\u0010´\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u00100R\u001a\u0010¶\u0001\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010µ\u0001R\"\u0010º\u0001\u001a\f\u0012\u0005\u0012\u00030¸\u0001\u0018\u00010·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\r\u0010¹\u0001¨\u0006»\u0001"}, d2 = {"Lcom/rncamerakit/e;", "Landroid/widget/FrameLayout;", "Landroidx/lifecycle/w;", "Lcom/facebook/react/uimanager/v0;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/uimanager/v0;)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "Landroid/view/ViewGroup;", "view", "Ljn0/h0;", "C", "(Landroid/view/ViewGroup;)V", Gender.MALE, "()V", "Lc0/i;", "videoDevice", "", "zoom", "L", "(Lc0/i;D)V", "K", "(Lc0/i;)V", "A", "(Lc0/i;D)D", "t", "", Snapshot.WIDTH, Snapshot.HEIGHT, "s", "(II)I", "y", "", "x", "z", "(Ljava/lang/Float;Ljava/lang/Float;)V", "", "Ltx/a;", "barcodes", "E", "(Ljava/util/List;)V", "orientation", "H", "(I)V", "", "uri", "I", "(Ljava/lang/String;)V", "keyCode", Gender.FEMALE, "G", "desiredZoom", "J", "(Ljava/lang/Double;)V", "actualWidth", "actualHeight", "", "B", "()Z", "", "w", "()Ljava/util/Set;", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "duration", "setShutterAnimationDuration", "enabled", "setShutterPhotoSound", "(Z)V", "", "", "options", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "v", "(Ljava/util/Map;Lcom/facebook/react/bridge/Promise;)V", "mode", "setFlashMode", "setTorchMode", "setAutoFocus", "setZoomMode", "factor", "setZoom", "setMaxZoom", "setScanBarcode", "delayMs", "setScanThrottleDelay", "type", "setCameraType", "path", "setOutputPath", "setShowFrame", "color", "setLaserColor", "setFrameColor", "Landroid/util/Size;", "size", "setBarcodeFrameSize", "(Landroid/util/Size;)V", "Lcom/facebook/react/bridge/ReadableArray;", "types", "setAllowedBarcodeTypes", "(Lcom/facebook/react/bridge/ReadableArray;)V", "a", "Lcom/facebook/react/uimanager/v0;", "currentContext", "b", "Lc0/i;", "camera", "Lc0/h1;", "c", "Lc0/h1;", "preview", "Lc0/r0;", DateTokenConverter.CONVERTER_KEY, "Lc0/r0;", "imageCapture", "Landroidx/camera/core/f;", "e", "Landroidx/camera/core/f;", "imageAnalyzer", "Landroid/view/OrientationEventListener;", "f", "Landroid/view/OrientationEventListener;", "orientationListener", "Landroidx/camera/view/PreviewView;", "g", "Landroidx/camera/view/PreviewView;", "viewFinder", "Lcom/rncamerakit/p;", "h", "Lcom/rncamerakit/p;", "rectOverlay", "Lu10/a;", IntegerTokenConverter.CONVERTER_KEY, "Lu10/a;", "barcodeFrame", "Ljava/util/concurrent/ExecutorService;", "j", "Ljava/util/concurrent/ExecutorService;", "cameraExecutor", "Lx0/h;", "k", "Lx0/h;", "cameraProvider", "l", "Ljava/lang/String;", "outputPath", "m", "shutterAnimationDuration", "n", "Z", "shutterPhotoSound", "Landroid/view/View;", "o", "Landroid/view/View;", "effectLayer", "p", "lensType", "q", "autoFocus", "r", "zoomMode", "D", "lastOnZoom", "Ljava/lang/Double;", "u", "maxZoom", "zoomStartedAt", "pinchGestureStartedAt", "scanBarcode", "", "scanThrottleDelay", "frameColor", "laserColor", "Landroid/util/Size;", "barcodeFrameSize", "", "Lcom/rncamerakit/f;", "[Lcom/rncamerakit/f;", "allowedBarcodeTypes", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class e extends FrameLayout implements w {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int laserColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private Size barcodeFrameSize;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private com.rncamerakit.f[] allowedBarcodeTypes;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v0 currentContext;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private c0.i camera;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private h1 preview;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private r0 imageCapture;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private androidx.camera.core.f imageAnalyzer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private OrientationEventListener orientationListener;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private PreviewView viewFinder;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private p rectOverlay;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private u10.a barcodeFrame;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private ExecutorService cameraExecutor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private x0.h cameraProvider;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String outputPath;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int shutterAnimationDuration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean shutterPhotoSound;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private View effectLayer;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int lensType;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private String autoFocus;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private String zoomMode;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private double lastOnZoom;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Double zoom;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private Double maxZoom;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float zoomStartedAt;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float pinchGestureStartedAt;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private boolean scanBarcode;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private long scanThrottleDelay;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private int frameColor;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/rncamerakit/e$b", "Lc0/r0$f;", "Landroidx/camera/core/ImageCaptureException;", "ex", "Ljn0/h0;", "c", "(Landroidx/camera/core/ImageCaptureException;)V", "Lc0/r0$h;", "output", DateTokenConverter.CONVERTER_KEY, "(Lc0/r0$h;)V", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements r0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Promise f49004a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ File f49005b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f49006c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ e f49007d;

        b(Promise promise, File file, String str, e eVar) {
            this.f49004a = promise;
            this.f49005b = file;
            this.f49006c = str;
            this.f49007d = eVar;
        }

        @Override // c0.r0.f
        public void c(ImageCaptureException ex2) {
            s.k(ex2, "ex");
            Log.e("CameraKit", "CameraView: Photo capture failed: " + ex2.getMessage(), ex2);
            this.f49004a.reject("E_CAPTURE_FAILED", "takePicture failed: " + ex2.getMessage());
        }

        @Override // c0.r0.f
        public void d(r0.h output) {
            s.k(output, "output");
            try {
                Uri uriA = output.a();
                if (uriA == null) {
                    uriA = Uri.fromFile(this.f49005b);
                }
                String path = uriA != null ? uriA.getPath() : null;
                String lastPathSegment = uriA != null ? uriA.getLastPathSegment() : null;
                String path2 = uriA != null ? uriA.getPath() : null;
                Object objA = output.a();
                if (objA == null) {
                    objA = this.f49006c;
                }
                String string = objA.toString();
                this.f49007d.I(string);
                Log.d("CameraKit", "CameraView: Photo capture succeeded: " + string);
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("uri", uriA.toString());
                writableMapCreateMap.putString("id", path);
                writableMapCreateMap.putString("name", lastPathSegment);
                writableMapCreateMap.putInt(Snapshot.WIDTH, this.f49007d.getWidth());
                writableMapCreateMap.putInt(Snapshot.HEIGHT, this.f49007d.getHeight());
                writableMapCreateMap.putString("path", path2);
                writableMapCreateMap.putDouble("size", new File(path2).length());
                this.f49004a.resolve(writableMapCreateMap);
            } catch (Exception e11) {
                Log.e("CameraKit", "Error while saving or decoding saved photo: " + e11.getMessage(), e11);
                this.f49004a.reject("E_ON_IMG_SAVED", "Error while reading saved photo: " + e11.getMessage());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/rncamerakit/e$c", "Landroid/animation/AnimatorListenerAdapter;", "Landroid/animation/Animator;", "animation", "Ljn0/h0;", "onAnimationEnd", "(Landroid/animation/Animator;)V", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            s.k(animation, "animation");
            e.this.effectLayer.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(e.this.shutterAnimationDuration);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"com/rncamerakit/e$d", "Landroid/view/ViewGroup$OnHierarchyChangeListener;", "Landroid/view/View;", "parent", "child", "Ljn0/h0;", "onChildViewRemoved", "(Landroid/view/View;Landroid/view/View;)V", "onChildViewAdded", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class d implements ViewGroup.OnHierarchyChangeListener {
        d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View parent, View child) {
            if (parent != null) {
                parent.measure(View.MeasureSpec.makeMeasureSpec(e.this.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(e.this.getMeasuredHeight(), 1073741824));
            }
            if (parent != null) {
                parent.layout(0, 0, parent.getMeasuredWidth(), parent.getMeasuredHeight());
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View parent, View child) {
        }
    }

    /* JADX INFO: renamed from: com.rncamerakit.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/rncamerakit/e$e", "Landroid/view/OrientationEventListener;", "", "orientation", "Ljn0/h0;", "onOrientationChanged", "(I)V", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class C0776e extends OrientationEventListener {
        C0776e(Context context) {
            super(context, 2);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int orientation) {
            r0 r0Var = e.this.imageCapture;
            if (r0Var == null) {
                return;
            }
            int iU0 = r0Var.u0();
            if (orientation >= 315 || orientation < 45) {
                iU0 = 0;
            } else if (225 <= orientation && orientation < 315) {
                iU0 = 1;
            } else if (135 <= orientation && orientation < 225) {
                iU0 = 2;
            } else if (45 <= orientation && orientation < 135) {
                iU0 = 3;
            }
            if (iU0 != r0Var.u0()) {
                r0Var.G0(iU0);
                e.this.H(iU0);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/rncamerakit/e$f", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "Landroid/view/ScaleGestureDetector;", "detector", "", "onScaleBegin", "(Landroid/view/ScaleGestureDetector;)Z", "onScale", "react-native-camera-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        f() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            c0.i iVar;
            s.k(detector, "detector");
            if (s.f(e.this.zoomMode, DebugKt.DEBUG_PROPERTY_VALUE_OFF) || (iVar = e.this.camera) == null) {
                return true;
            }
            double dA = e.this.A(iVar, e.this.zoomStartedAt * (detector.getCurrentSpan() / e.this.pinchGestureStartedAt));
            Double dValueOf = Double.valueOf(dA);
            d2 value = iVar.c().l().getValue();
            if (!s.f(dValueOf, value != null ? Float.valueOf(value.d()) : -1)) {
                if (e.this.zoom == null) {
                    iVar.b().e((float) dA);
                }
                e.this.J(Double.valueOf(dA));
            }
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScaleBegin(ScaleGestureDetector detector) {
            c0.n nVarC;
            d0<d2> d0VarL;
            d2 value;
            s.k(detector, "detector");
            c0.i iVar = e.this.camera;
            if (iVar == null || (nVarC = iVar.c()) == null || (d0VarL = nVarC.l()) == null || (value = d0VarL.getValue()) == null) {
                return false;
            }
            e.this.zoomStartedAt = value.d();
            e.this.pinchGestureStartedAt = detector.getCurrentSpan();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v0 context) {
        super(context);
        s.k(context, "context");
        this.currentContext = context;
        this.viewFinder = new PreviewView(context);
        this.rectOverlay = new p(context);
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        s.j(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
        this.cameraExecutor = executorServiceNewSingleThreadExecutor;
        this.shutterAnimationDuration = 50;
        this.shutterPhotoSound = true;
        this.effectLayer = new View(context);
        this.lensType = 1;
        this.autoFocus = DebugKt.DEBUG_PROPERTY_VALUE_ON;
        this.zoomMode = DebugKt.DEBUG_PROPERTY_VALUE_ON;
        this.zoomStartedAt = 1.0f;
        this.scanThrottleDelay = 2000L;
        this.frameColor = -16711936;
        this.laserColor = -65536;
        this.viewFinder.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.viewFinder.setFocusableInTouchMode(true);
        this.viewFinder.requestFocusFromTouch();
        C(this.viewFinder);
        addView(this.viewFinder);
        this.effectLayer.setAlpha(BitmapDescriptorFactory.HUE_RED);
        this.effectLayer.setBackgroundColor(-16777216);
        addView(this.effectLayer);
        addView(this.rectOverlay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double A(c0.i videoDevice, double zoom) {
        c0.n nVarC;
        d0<d2> d0VarL;
        d2 value;
        c0.n nVarC2;
        d0<d2> d0VarL2;
        d2 value2;
        Double dValueOf = null;
        Double dValueOf2 = (videoDevice == null || (nVarC2 = videoDevice.c()) == null || (d0VarL2 = nVarC2.l()) == null || (value2 = d0VarL2.getValue()) == null) ? null : Double.valueOf(value2.c());
        if (videoDevice != null && (nVarC = videoDevice.c()) != null && (d0VarL = nVarC.l()) != null && (value = d0VarL.getValue()) != null) {
            dValueOf = Double.valueOf(value.a());
        }
        Double d11 = this.maxZoom;
        if (d11 != null && d11.doubleValue() > -1.0d) {
            dValueOf = Double.valueOf(Math.min(dValueOf != null ? dValueOf.doubleValue() : d11.doubleValue(), d11.doubleValue()));
        }
        if (dValueOf != null) {
            zoom = Math.min(zoom, dValueOf.doubleValue());
        }
        return dValueOf2 != null ? Math.max(zoom, dValueOf2.doubleValue()) : zoom;
    }

    private final boolean B() {
        String[] strArr = {"android.permission.CAMERA"};
        if (androidx.core.content.b.checkSelfPermission(getContext(), strArr[0]) == 0) {
            return true;
        }
        androidx.core.app.b.f(getActivity(), strArr, 42);
        return false;
    }

    private final void C(ViewGroup view) {
        Log.d("CameraKit", "CameraView looking for ThemedReactContext");
        if (getContext() instanceof v0) {
            Log.d("CameraKit", "CameraView found ThemedReactContext");
            view.setOnHierarchyChangeListener(new d());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(e eVar) {
        eVar.M();
    }

    private final void E(List<? extends tx.a> barcodes) {
        com.rncamerakit.f fVarA = com.rncamerakit.f.INSTANCE.a(((tx.a) v.o0(barcodes)).c());
        int iE = b1.e(this.currentContext);
        EventDispatcher eventDispatcherC = b1.c(this.currentContext, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new v10.f(iE, getId(), ((tx.a) v.o0(barcodes)).d(), fVarA.getCode()));
        }
    }

    private final void F(int keyCode) {
        int iE = b1.e(this.currentContext);
        EventDispatcher eventDispatcherC = b1.c(this.currentContext, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new v10.a(iE, getId(), keyCode));
        }
    }

    private final void G(int keyCode) {
        int iE = b1.e(this.currentContext);
        EventDispatcher eventDispatcherC = b1.c(this.currentContext, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new v10.b(iE, getId(), keyCode));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(int orientation) {
        int i11;
        if (orientation != 0) {
            i11 = 1;
            if (orientation != 1) {
                i11 = 2;
                if (orientation != 2) {
                    i11 = 3;
                    if (orientation != 3) {
                        Log.e("CameraKit", "CameraView: Unknown device orientation detected: " + orientation);
                        return;
                    }
                }
            }
        } else {
            i11 = 0;
        }
        int iE = b1.e(this.currentContext);
        EventDispatcher eventDispatcherC = b1.c(this.currentContext, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new v10.d(iE, getId(), i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(String uri) {
        int iE = b1.e(this.currentContext);
        EventDispatcher eventDispatcherC = b1.c(this.currentContext, getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(new v10.e(iE, getId(), uri));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(Double desiredZoom) {
        c0.n nVarC;
        d0<d2> d0VarL;
        d2 value;
        c0.i iVar = this.camera;
        if (iVar == null || (nVarC = iVar.c()) == null || (d0VarL = nVarC.l()) == null || (value = d0VarL.getValue()) == null) {
            return;
        }
        double d11 = value.d();
        if (desiredZoom != null) {
            d11 = desiredZoom.doubleValue();
        }
        if (desiredZoom == null || d11 != this.lastOnZoom) {
            this.lastOnZoom = d11;
            int iE = b1.e(this.currentContext);
            EventDispatcher eventDispatcherC = b1.c(this.currentContext, getId());
            if (eventDispatcherC != null) {
                eventDispatcherC.h(new v10.g(iE, getId(), d11));
            }
        }
    }

    private final void K(c0.i videoDevice) {
        double dA = A(videoDevice, 1.0d);
        Double d11 = this.zoom;
        if (d11 != null) {
            dA = A(videoDevice, d11.doubleValue());
        }
        L(videoDevice, dA);
        J(Double.valueOf(dA));
    }

    private final void L(c0.i videoDevice, double zoom) {
        videoDevice.b().e((float) zoom);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void M() {
        final com.google.common.util.concurrent.s<x0.h> sVarB = x0.h.INSTANCE.b(getActivity());
        sVarB.b(new Runnable() { // from class: com.rncamerakit.c
            @Override // java.lang.Runnable
            public final void run() {
                e.N(this.f48974a, sVarB);
            }
        }, androidx.core.content.b.getMainExecutor(getActivity()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void N(final e eVar, com.google.common.util.concurrent.s sVar) {
        String message;
        Throwable cause;
        try {
            eVar.cameraProvider = (x0.h) sVar.get();
            C0776e c0776e = eVar.new C0776e(eVar.getContext());
            eVar.orientationListener = c0776e;
            s.h(c0776e);
            c0776e.enable();
            final ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(eVar.getContext(), eVar.new f());
            eVar.viewFinder.setOnTouchListener(new View.OnTouchListener() { // from class: com.rncamerakit.d
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return e.O(scaleGestureDetector, eVar, view, motionEvent);
                }
            });
            eVar.t();
        } catch (Exception e11) {
            Throwable cause2 = e11.getCause();
            if (cause2 == null || (cause = cause2.getCause()) == null || (message = cause.getMessage()) == null) {
                Throwable cause3 = e11.getCause();
                message = cause3 != null ? cause3.getMessage() : null;
                if (message == null && (message = e11.getMessage()) == null) {
                    message = "Camera initialization failed";
                }
            }
            Log.e("CameraKit", "Camera initialization failed: " + message, e11);
            int iE = b1.e(eVar.currentContext);
            EventDispatcher eventDispatcherC = b1.c(eVar.currentContext, eVar.getId());
            if (eventDispatcherC != null) {
                eventDispatcherC.h(new v10.c(iE, eVar.getId(), message));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean O(ScaleGestureDetector scaleGestureDetector, e eVar, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1) {
            return scaleGestureDetector.onTouchEvent(motionEvent);
        }
        eVar.z(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
        return true;
    }

    private final Activity getActivity() {
        Activity currentActivity = this.currentContext.getCurrentActivity();
        s.h(currentActivity);
        return currentActivity;
    }

    private final int s(int width, int height) {
        double dMax = ((double) Math.max(width, height)) / ((double) Math.min(width, height));
        return Math.abs(dMax - 1.3333333333333333d) <= Math.abs(dMax - 1.7777777777777777d) ? 0 : 1;
    }

    public static /* synthetic */ void setAutoFocus$default(e eVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = DebugKt.DEBUG_PROPERTY_VALUE_ON;
        }
        eVar.setAutoFocus(str);
    }

    public static /* synthetic */ void setCameraType$default(e eVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "back";
        }
        eVar.setCameraType(str);
    }

    private final void t() {
        if (this.viewFinder.getDisplay() == null) {
            return;
        }
        int width = this.viewFinder.getWidth();
        int height = this.viewFinder.getHeight();
        Log.d("CameraKit", "Preview dimensions: " + width + " x " + height);
        int iS = s(width, height);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Preview aspect ratio: ");
        sb2.append(iS);
        Log.d("CameraKit", sb2.toString());
        int rotation = this.viewFinder.getDisplay().getRotation();
        x0.h hVar = this.cameraProvider;
        if (hVar == null) {
            throw new IllegalStateException("Camera initialization failed.");
        }
        c0.p pVarB = new c0.p.a().d(this.lensType).b();
        s.j(pVarB, "build(...)");
        this.preview = new h1.a().o(iS).a(rotation).e();
        this.imageCapture = new r0.b().h(1).p(iS).a(rotation).e();
        this.imageAnalyzer = new androidx.camera.core.f.c().h(0).q(iS).e();
        List listS = v.s(this.preview, this.imageCapture);
        if (this.scanBarcode) {
            j jVar = new j(new wn0.p() { // from class: com.rncamerakit.a
                @Override // wn0.p
                public final Object invoke(Object obj, Object obj2) {
                    return e.u(this.f48972a, (List) obj, (Size) obj2);
                }
            }, this.scanThrottleDelay);
            androidx.camera.core.f fVar = this.imageAnalyzer;
            s.h(fVar);
            fVar.n0(this.cameraExecutor, jVar);
            listS.add(this.imageAnalyzer);
        }
        hVar.h();
        try {
            Activity activity = getActivity();
            s.i(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            a2[] a2VarArr = (a2[]) listS.toArray(new a2[0]);
            c0.i iVarE = hVar.e((androidx.appcompat.app.c) activity, pVarB, (a2[]) Arrays.copyOf(a2VarArr, a2VarArr.length));
            this.camera = iVarE;
            K(iVarE);
            h1 h1Var = this.preview;
            if (h1Var != null) {
                h1Var.l0(this.viewFinder.getSurfaceProvider());
            }
        } catch (Exception e11) {
            Log.e("CameraKit", "Use case binding failed", e11);
            int iE = b1.e(this.currentContext);
            EventDispatcher eventDispatcherC = b1.c(this.currentContext, getId());
            if (eventDispatcherC != null) {
                eventDispatcherC.h(new v10.c(iE, getId(), e11.getMessage()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final h0 u(e eVar, List barcodes, Size imageSize) {
        s.k(barcodes, "barcodes");
        s.k(imageSize, "imageSize");
        if (barcodes.isEmpty()) {
            return h0.f84049a;
        }
        Set<Integer> setW = eVar.w();
        if (!setW.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : barcodes) {
                if (setW.contains(Integer.valueOf(((tx.a) obj).c()))) {
                    arrayList.add(obj);
                }
            }
            barcodes = arrayList;
        }
        if (barcodes.isEmpty()) {
            return h0.f84049a;
        }
        u10.a aVar = eVar.barcodeFrame;
        PreviewView previewView = eVar.viewFinder;
        if (aVar == null) {
            eVar.E(barcodes);
            return h0.f84049a;
        }
        Rect frameRect = aVar.getFrameRect();
        float width = previewView.getWidth() / imageSize.getHeight();
        float height = previewView.getHeight() / imageSize.getWidth();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : barcodes) {
            Rect rectA = ((tx.a) obj2).a();
            if (rectA == null ? false : frameRect.contains(new Rect((int) (rectA.left * width), (int) (rectA.top * height), (int) (rectA.right * width), (int) (rectA.bottom * height)))) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            eVar.E(arrayList2);
        }
        return h0.f84049a;
    }

    private final Set<Integer> w() {
        com.rncamerakit.f[] fVarArr = this.allowedBarcodeTypes;
        if (fVarArr != null) {
            ArrayList arrayList = new ArrayList(fVarArr.length);
            for (com.rncamerakit.f fVar : fVarArr) {
                arrayList.add(Integer.valueOf(fVar.toBarcodeType()));
            }
            Set<Integer> setR1 = v.r1(arrayList);
            if (setR1 != null) {
                return setR1;
            }
        }
        return d1.d();
    }

    private final int x(int actualWidth, int actualHeight) {
        return (((float) (actualHeight / actualWidth)) > 1.7777778f ? Float.valueOf(actualWidth * 1.7777778f) : Integer.valueOf(actualHeight)).intValue();
    }

    private final void y() {
        if (this.shutterAnimationDuration == 0) {
            return;
        }
        this.effectLayer.animate().alpha(1.0f).setDuration(this.shutterAnimationDuration).setListener(new c()).start();
    }

    private final void z(Float x11, Float y11) {
        CameraControl cameraControlB;
        CameraControl cameraControlB2;
        if (x11 == null || y11 == null) {
            c0.i iVar = this.camera;
            if (iVar == null || (cameraControlB = iVar.b()) == null) {
                return;
            }
            cameraControlB.k();
            return;
        }
        c1 meteringPointFactory = this.viewFinder.getMeteringPointFactory();
        s.j(meteringPointFactory, "getMeteringPointFactory(...)");
        e0.a aVar = new e0.a(meteringPointFactory.b(x11.floatValue(), y11.floatValue()));
        if (s.f(this.autoFocus, DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
            aVar.c();
        }
        c0.i iVar2 = this.camera;
        if (iVar2 != null && (cameraControlB2 = iVar2.b()) != null) {
            cameraControlB2.g(aVar.b());
        }
        float f11 = 75;
        this.rectOverlay.b(v.e(new RectF(x11.floatValue() - f11, y11.floatValue() - f11, x11.floatValue() + f11, y11.floatValue() + f11)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        Integer numValueOf = event != null ? Integer.valueOf(event.getKeyCode()) : null;
        Integer numValueOf2 = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((numValueOf != null && numValueOf.intValue() == 27) || ((numValueOf != null && numValueOf.intValue() == 25) || (numValueOf != null && numValueOf.intValue() == 24))) {
            if (numValueOf2 != null && numValueOf2.intValue() == 0) {
                F(numValueOf.intValue());
                return true;
            }
            if (numValueOf2 != null && numValueOf2.intValue() == 1) {
                G(numValueOf.intValue());
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (B()) {
            this.viewFinder.post(new Runnable() { // from class: com.rncamerakit.b
                @Override // java.lang.Runnable
                public final void run() {
                    e.D(this.f48973a);
                }
            });
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.cameraExecutor.shutdown();
        OrientationEventListener orientationEventListener = this.orientationListener;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        x0.h hVar = this.cameraProvider;
        if (hVar != null) {
            hVar.h();
        }
    }

    public final void setAllowedBarcodeTypes(ReadableArray types) {
        com.rncamerakit.f fVarB;
        if (types == null || types.size() == 0) {
            this.allowedBarcodeTypes = new com.rncamerakit.f[0];
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = types.size();
        for (int i11 = 0; i11 < size; i11++) {
            String string = types.getString(i11);
            if (string != null && (fVarB = com.rncamerakit.f.INSTANCE.b(string)) != null) {
                arrayList.add(fVarB);
            }
        }
        this.allowedBarcodeTypes = (com.rncamerakit.f[]) arrayList.toArray(new com.rncamerakit.f[0]);
    }

    public final void setAutoFocus(String mode) {
        c0.i iVar;
        CameraControl cameraControlB;
        s.k(mode, "mode");
        this.autoFocus = mode;
        if (!s.f(mode, DebugKt.DEBUG_PROPERTY_VALUE_ON) || (iVar = this.camera) == null || (cameraControlB = iVar.b()) == null) {
            return;
        }
        cameraControlB.k();
    }

    public final void setBarcodeFrameSize(Size size) {
        s.k(size, "size");
        this.barcodeFrameSize = size;
        u10.a aVar = this.barcodeFrame;
        if (aVar != null) {
            s.h(aVar);
            aVar.setFrameSize(size);
        }
    }

    public final void setCameraType(String type) {
        s.k(type, "type");
        int i11 = !s.f(type, "front") ? 1 : 0;
        boolean z11 = this.lensType != i11;
        this.lensType = i11;
        if (z11) {
            t();
        }
    }

    public final void setFlashMode(String mode) {
        c0.i iVar;
        r0 r0Var = this.imageCapture;
        if (r0Var == null || (iVar = this.camera) == null) {
            return;
        }
        if (s.f(mode, DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
            iVar.b().c(false);
            r0Var.D0(1);
        } else if (s.f(mode, DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
            iVar.b().c(false);
            r0Var.D0(2);
        } else {
            r0Var.D0(0);
            s.h(iVar.b().c(false));
        }
    }

    public final void setFrameColor(int color) {
        this.frameColor = color;
        u10.a aVar = this.barcodeFrame;
        if (aVar != null) {
            s.h(aVar);
            aVar.setFrameColor(color);
        }
    }

    public final void setLaserColor(int color) {
        this.laserColor = color;
        u10.a aVar = this.barcodeFrame;
        if (aVar != null) {
            s.h(aVar);
            aVar.setLaserColor(this.laserColor);
        }
    }

    public final void setMaxZoom(Double factor) {
        this.maxZoom = factor;
        setZoom(this.zoom);
    }

    public final void setOutputPath(String path) {
        s.k(path, "path");
        this.outputPath = path;
    }

    public final void setScanBarcode(boolean enabled) {
        boolean z11 = enabled != this.scanBarcode;
        this.scanBarcode = enabled;
        if (z11) {
            t();
        }
    }

    public final void setScanThrottleDelay(int delayMs) {
        long j11 = delayMs < 0 ? 2000L : delayMs;
        boolean z11 = this.scanThrottleDelay != j11 && this.scanBarcode;
        this.scanThrottleDelay = j11;
        if (z11) {
            t();
        }
    }

    public final void setShowFrame(boolean enabled) {
        if (!enabled) {
            u10.a aVar = this.barcodeFrame;
            if (aVar != null) {
                removeView(aVar);
                this.barcodeFrame = null;
                return;
            }
            return;
        }
        Context context = getContext();
        s.j(context, "getContext(...)");
        u10.a aVar2 = new u10.a(context);
        this.barcodeFrame = aVar2;
        s.h(aVar2);
        aVar2.setFrameSize(this.barcodeFrameSize);
        x(getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
        u10.a aVar3 = this.barcodeFrame;
        s.h(aVar3);
        aVar3.setFrameColor(this.frameColor);
        u10.a aVar4 = this.barcodeFrame;
        s.h(aVar4);
        aVar4.setLaserColor(this.laserColor);
        u10.a aVar5 = this.barcodeFrame;
        s.i(aVar5, "null cannot be cast to non-null type android.view.View");
        aVar5.layout(0, 0, this.effectLayer.getWidth(), this.effectLayer.getHeight());
        addView(this.barcodeFrame);
    }

    public final void setShutterAnimationDuration(int duration) {
        this.shutterAnimationDuration = duration;
    }

    public final void setShutterPhotoSound(boolean enabled) {
        this.shutterPhotoSound = enabled;
    }

    public final void setTorchMode(String mode) {
        c0.i iVar = this.camera;
        if (iVar == null) {
            return;
        }
        if (s.f(mode, DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
            iVar.b().c(true);
        } else if (s.f(mode, DebugKt.DEBUG_PROPERTY_VALUE_OFF)) {
            iVar.b().c(false);
        } else {
            iVar.b().c(false);
        }
    }

    public final void setZoom(Double factor) {
        this.zoom = factor;
        if (factor != null) {
            double dDoubleValue = factor.doubleValue();
            c0.i iVar = this.camera;
            if (iVar == null) {
                return;
            }
            L(iVar, A(iVar, dDoubleValue));
        }
    }

    public final void setZoomMode(String mode) {
        if (mode == null) {
            mode = DebugKt.DEBUG_PROPERTY_VALUE_OFF;
        }
        this.zoomMode = mode;
    }

    public final void v(Map<String, ? extends Object> options, Promise promise) throws IOException {
        s.k(options, "options");
        s.k(promise, "promise");
        String canonicalPath = this.outputPath;
        if (canonicalPath != null) {
            s.h(canonicalPath);
        } else {
            File fileCreateTempFile = File.createTempFile("ckcap", ".jpg", getContext().getCacheDir());
            fileCreateTempFile.deleteOnExit();
            canonicalPath = fileCreateTempFile.getCanonicalPath();
            s.h(canonicalPath);
        }
        File file = new File(canonicalPath);
        r0.g gVarA = new r0.g.a(file).a();
        s.j(gVarA, "build(...)");
        y();
        if (this.shutterPhotoSound) {
            Object systemService = getActivity().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            s.i(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            if (((AudioManager) systemService).getRingerMode() == 2) {
                new MediaActionSound().play(0);
            }
        }
        r0 r0Var = this.imageCapture;
        if (r0Var != null) {
            r0Var.I0(gVarA, androidx.core.content.b.getMainExecutor(getActivity()), new b(promise, file, canonicalPath, this));
        }
    }
}
