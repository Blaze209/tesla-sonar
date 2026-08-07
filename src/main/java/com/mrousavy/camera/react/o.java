package com.mrousavy.camera.react;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.view.PreviewView;
import androidx.p003lifecycle.j0;
import c0.h1;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.mrousavy.camera.frameprocessors.Frame;
import com.mrousavy.camera.frameprocessors.FrameProcessor;
import dz.CameraConfiguration;
import dz.CodeScannerFrame;
import ezvcard.property.Gender;
import fz.CameraDeviceFormat;
import fz.CodeScannerOptions;
import java.util.List;
import jn0.h0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.webrtc.MediaStreamTrack;
import p013kotlin.Metadata;
import p013kotlin.coroutines.Continuation;
import p013kotlin.coroutines.intrinsics.IntrinsicsKt;
import p013kotlin.coroutines.jvm.internal.DebugMetadata;
import p013kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ó\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\nJ\r\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\nJ\r\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\nJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\nJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\"H\u0016¢\u0006\u0004\b'\u0010%J%\u0010-\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102R$\u00109\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010@\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010C\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010;\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\"\u0010F\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010;\u001a\u0004\bD\u0010=\"\u0004\bE\u0010?R\"\u0010J\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010;\u001a\u0004\bH\u0010=\"\u0004\bI\u0010?R\"\u0010N\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010;\u001a\u0004\bL\u0010=\"\u0004\bM\u0010?R\"\u0010R\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010;\u001a\u0004\bP\u0010=\"\u0004\bQ\u0010?R\"\u0010V\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bS\u0010;\u001a\u0004\bT\u0010=\"\u0004\bU\u0010?R\"\u0010]\u001a\u00020W8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010a\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010;\u001a\u0004\b_\u0010=\"\u0004\b`\u0010?R*\u0010e\u001a\u00020:2\u0006\u0010b\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010;\u001a\u0004\bc\u0010=\"\u0004\bd\u0010?R$\u0010m\u001a\u0004\u0018\u00010f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010t\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010w\u001a\u0004\u0018\u00010n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010o\u001a\u0004\bu\u0010q\"\u0004\bv\u0010sR$\u0010~\u001a\u0004\u0018\u00010x8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010y\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R$\u0010\u0081\u0001\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0013\n\u0004\b \u0010;\u001a\u0004\b\u007f\u0010=\"\u0005\b\u0080\u0001\u0010?R%\u0010\u0084\u0001\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0015\u0010;\u001a\u0005\b\u0082\u0001\u0010=\"\u0005\b\u0083\u0001\u0010?R*\u0010\u008a\u0001\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b-\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R*\u0010\u008d\u0001\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u0012\u0010\u0085\u0001\u001a\u0006\b\u008b\u0001\u0010\u0087\u0001\"\u0006\b\u008c\u0001\u0010\u0089\u0001R)\u0010\u0094\u0001\u001a\u00030\u008e\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\b\u000b\u0010\u008f\u0001\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R%\u0010\u0097\u0001\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\t\u0010;\u001a\u0005\b\u0095\u0001\u0010=\"\u0005\b\u0096\u0001\u0010?R%\u0010\u009a\u0001\u001a\u00020:8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0005\b\u0098\u0001\u0010;\u001a\u0004\bg\u0010=\"\u0005\b\u0099\u0001\u0010?R*\u0010¢\u0001\u001a\u00030\u009b\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u009c\u0001\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R*\u0010ª\u0001\u001a\u00030£\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R(\u0010°\u0001\u001a\u00020/8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0005\b¯\u0001\u00102R)\u0010#\u001a\u00030±\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R3\u0010¿\u0001\u001a\u00030¸\u00012\u0007\u0010b\u001a\u00030¸\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R.\u0010Ã\u0001\u001a\u00020:2\u0006\u0010b\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\bÀ\u0001\u0010;\u001a\u0005\bÁ\u0001\u0010=\"\u0005\bÂ\u0001\u0010?R3\u0010Ë\u0001\u001a\u00030Ä\u00012\u0007\u0010b\u001a\u00030Ä\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R,\u0010Ò\u0001\u001a\u0005\u0018\u00010Ì\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¬\u0001\u0010Í\u0001\u001a\u0006\bÎ\u0001\u0010Ï\u0001\"\u0006\bÐ\u0001\u0010Ñ\u0001R\u0018\u0010Ô\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÓ\u0001\u0010;R\u0018\u0010×\u0001\u001a\u00030Õ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0001\u0010Ö\u0001R \u0010Ý\u0001\u001a\u00030Ø\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001R,\u0010å\u0001\u001a\u0005\u0018\u00010Þ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R*\u0010ë\u0001\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bæ\u0001\u0010ç\u0001\u001a\u0005\bè\u0001\u0010\u000e\"\u0006\bé\u0001\u0010ê\u0001R\u001a\u0010î\u0001\u001a\u00030ì\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010í\u0001R\u0018\u0010ò\u0001\u001a\u00030ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001¨\u0006ô\u0001"}, d2 = {"Lcom/mrousavy/camera/react/o;", "Landroid/widget/FrameLayout;", "Ldz/j$b;", "Lcom/mrousavy/camera/react/z$a;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "Ljn0/h0;", "u", "()V", "t", "Landroidx/camera/view/PreviewView;", IntegerTokenConverter.CONVERTER_KEY, "()Landroidx/camera/view/PreviewView;", "onAttachedToWindow", "onDetachedFromWindow", "k", "s", "Lcom/mrousavy/camera/frameprocessors/Frame;", "frame", "q", "(Lcom/mrousavy/camera/frameprocessors/Frame;)V", "", AnalyticsAttribute.Error, "onError", "(Ljava/lang/Throwable;)V", DateTokenConverter.CONVERTER_KEY, "o", "b", "Lfz/r;", "type", "p", "(Lfz/r;)V", "Lfz/i;", "outputOrientation", "c", "(Lfz/i;)V", "previewOrientation", "n", "", "Ltx/a;", "codes", "Ldz/x;", "scannerFrame", "r", "(Ljava/util/List;Ldz/x;)V", "", "averageFps", "a", "(D)V", "", "Ljava/lang/String;", "getCameraId", "()Ljava/lang/String;", "setCameraId", "(Ljava/lang/String;)V", "cameraId", "", "Z", "getEnableDepthData", "()Z", "setEnableDepthData", "(Z)V", "enableDepthData", "getEnablePortraitEffectsMatteDelivery", "setEnablePortraitEffectsMatteDelivery", "enablePortraitEffectsMatteDelivery", "m", "setMirrored", "isMirrored", "e", "getPhoto", "setPhoto", "photo", "f", "getVideo", "setVideo", MediaStreamTrack.VIDEO_TRACK_KIND, "g", "getAudio", "setAudio", MediaStreamTrack.AUDIO_TRACK_KIND, "h", "getEnableFrameProcessor", "setEnableFrameProcessor", "enableFrameProcessor", "Lfz/l;", "Lfz/l;", "getPixelFormat", "()Lfz/l;", "setPixelFormat", "(Lfz/l;)V", "pixelFormat", "j", "getEnableLocation", "setEnableLocation", "enableLocation", "value", "getPreview", "setPreview", "preview", "Lfz/b;", "l", "Lfz/b;", "getFormat", "()Lfz/b;", "setFormat", "(Lfz/b;)V", "format", "", "Ljava/lang/Integer;", "getMinFps", "()Ljava/lang/Integer;", "setMinFps", "(Ljava/lang/Integer;)V", "minFps", "getMaxFps", "setMaxFps", "maxFps", "Lfz/y;", "Lfz/y;", "getVideoStabilizationMode", "()Lfz/y;", "setVideoStabilizationMode", "(Lfz/y;)V", "videoStabilizationMode", "getVideoHdr", "setVideoHdr", "videoHdr", "getPhotoHdr", "setPhotoHdr", "photoHdr", "Ljava/lang/Double;", "getVideoBitRateOverride", "()Ljava/lang/Double;", "setVideoBitRateOverride", "(Ljava/lang/Double;)V", "videoBitRateOverride", "getVideoBitRateMultiplier", "setVideoBitRateMultiplier", "videoBitRateMultiplier", "Lfz/o;", "Lfz/o;", "getPhotoQualityBalance", "()Lfz/o;", "setPhotoQualityBalance", "(Lfz/o;)V", "photoQualityBalance", "getLowLightBoost", "setLowLightBoost", "lowLightBoost", "v", "setActive", "isActive", "Lfz/u;", "w", "Lfz/u;", "getTorch", "()Lfz/u;", "setTorch", "(Lfz/u;)V", "torch", "", "x", Gender.FEMALE, "getZoom", "()F", "setZoom", "(F)V", "zoom", "y", "D", "getExposure", "()D", "setExposure", "exposure", "Lfz/j;", "z", "Lfz/j;", "getOutputOrientation", "()Lfz/j;", "setOutputOrientation", "(Lfz/j;)V", "Lfz/n;", "A", "Lfz/n;", "getAndroidPreviewViewType", "()Lfz/n;", "setAndroidPreviewViewType", "(Lfz/n;)V", "androidPreviewViewType", "B", "getEnableZoomGesture", "setEnableZoomGesture", "enableZoomGesture", "Lfz/q;", "C", "Lfz/q;", "getResizeMode", "()Lfz/q;", "setResizeMode", "(Lfz/q;)V", "resizeMode", "Lfz/c;", "Lfz/c;", "getCodeScannerOptions", "()Lfz/c;", "setCodeScannerOptions", "(Lfz/c;)V", "codeScannerOptions", "E", "isMounted", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/CoroutineScope;", "mainCoroutineScope", "Ldz/j;", "G", "Ldz/j;", "getCameraSession$react_native_vision_camera_release", "()Ldz/j;", "cameraSession", "Lcom/mrousavy/camera/frameprocessors/FrameProcessor;", "H", "Lcom/mrousavy/camera/frameprocessors/FrameProcessor;", "getFrameProcessor$react_native_vision_camera_release", "()Lcom/mrousavy/camera/frameprocessors/FrameProcessor;", "setFrameProcessor$react_native_vision_camera_release", "(Lcom/mrousavy/camera/frameprocessors/FrameProcessor;)V", "frameProcessor", "I", "Landroidx/camera/view/PreviewView;", "getPreviewView$react_native_vision_camera_release", "setPreviewView$react_native_vision_camera_release", "(Landroidx/camera/view/PreviewView;)V", "previewView", "", "J", "currentConfigureCall", "Lcom/mrousavy/camera/react/z;", "K", "Lcom/mrousavy/camera/react/z;", "fpsSampleCollector", "L", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ClickableViewAccessibility", "ViewConstructor", "MissingPermission"})
public final class o extends FrameLayout implements dz.j.b, z.a {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private fz.n androidPreviewViewType;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private boolean enableZoomGesture;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private fz.q resizeMode;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private CodeScannerOptions codeScannerOptions;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private boolean isMounted;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final CoroutineScope mainCoroutineScope;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final dz.j cameraSession;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private FrameProcessor frameProcessor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private PreviewView previewView;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private long currentConfigureCall;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final z fpsSampleCollector;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String cameraId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean enableDepthData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean enablePortraitEffectsMatteDelivery;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isMirrored;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean photo;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean video;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean audio;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean enableFrameProcessor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private fz.l pixelFormat;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean enableLocation;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private boolean preview;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private CameraDeviceFormat format;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Integer minFps;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Integer maxFps;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private fz.y videoStabilizationMode;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean videoHdr;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean photoHdr;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Double videoBitRateOverride;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Double videoBitRateMultiplier;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private fz.o photoQualityBalance;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean lowLightBoost;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean isActive;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private fz.u torch;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float zoom;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private double exposure;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private fz.j outputOrientation;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements j0, p013kotlin.jvm.internal.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ wn0.l f45765a;

        b(wn0.l function) {
            p013kotlin.jvm.internal.s.k(function, "function");
            this.f45765a = function;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof j0) && (obj instanceof p013kotlin.jvm.internal.m)) {
                return p013kotlin.jvm.internal.s.f(getFunctionDelegate(), ((p013kotlin.jvm.internal.m) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p013kotlin.jvm.internal.m
        public final jn0.i<?> getFunctionDelegate() {
            return this.f45765a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p003lifecycle.j0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45765a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraView$update$1", f = "CameraView.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f45766n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ long f45768p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j11, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f45768p = j11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h0 b(o oVar, long j11, CameraConfiguration aVar) throws CameraConfiguration.C1247a {
            if (oVar.currentConfigureCall != j11) {
                Log.i("CameraView", "A new configure { ... } call arrived, aborting this one...");
                throw new CameraConfiguration.C1247a();
            }
            aVar.w(oVar.getCameraId());
            PreviewView previewView = oVar.getPreviewView();
            if (previewView != null) {
                CameraConfiguration.g.b.Companion c1250a = CameraConfiguration.g.b.INSTANCE;
                h1.c surfaceProvider = previewView.getSurfaceProvider();
                p013kotlin.jvm.internal.s.j(surfaceProvider, "getSurfaceProvider(...)");
                aVar.H(c1250a.a(new CameraConfiguration.Preview(surfaceProvider)));
            } else {
                aVar.H(CameraConfiguration.g.C1248a.INSTANCE.a());
            }
            if (oVar.getPhoto()) {
                aVar.G(CameraConfiguration.g.b.INSTANCE.a(new CameraConfiguration.Photo(oVar.getIsMirrored(), oVar.getPhotoHdr(), oVar.getPhotoQualityBalance())));
            } else {
                aVar.G(CameraConfiguration.g.C1248a.INSTANCE.a());
            }
            if (oVar.getVideo() || oVar.getEnableFrameProcessor()) {
                aVar.J(CameraConfiguration.g.b.INSTANCE.a(new CameraConfiguration.Video(oVar.getIsMirrored(), oVar.getVideoHdr(), oVar.getVideoBitRateOverride(), oVar.getVideoBitRateMultiplier())));
            } else {
                aVar.J(CameraConfiguration.g.C1248a.INSTANCE.a());
            }
            if (oVar.getEnableFrameProcessor()) {
                aVar.C(CameraConfiguration.g.b.INSTANCE.a(new CameraConfiguration.FrameProcessor(oVar.getIsMirrored(), oVar.getPixelFormat())));
            } else {
                aVar.C(CameraConfiguration.g.C1248a.INSTANCE.a());
            }
            if (oVar.getAudio()) {
                aVar.v(CameraConfiguration.g.b.INSTANCE.a(new CameraConfiguration.Audio(h0.f84049a)));
            } else {
                aVar.v(CameraConfiguration.g.C1248a.INSTANCE.a());
            }
            aVar.y(oVar.getEnableLocation() && oVar.getIsActive());
            CodeScannerOptions codeScannerOptions = oVar.getCodeScannerOptions();
            if (codeScannerOptions != null) {
                aVar.x(CameraConfiguration.g.b.INSTANCE.a(new CameraConfiguration.CodeScanner(codeScannerOptions.a())));
            } else {
                aVar.x(CameraConfiguration.g.C1248a.INSTANCE.a());
            }
            aVar.F(oVar.getOutputOrientation());
            aVar.B(oVar.getFormat());
            aVar.E(oVar.getMinFps());
            aVar.D(oVar.getMaxFps());
            aVar.z(oVar.getLowLightBoost());
            aVar.I(oVar.getTorch());
            aVar.A(Double.valueOf(oVar.getExposure()));
            aVar.K(oVar.getZoom());
            aVar.u(oVar.getIsActive());
            return h0.f84049a;
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return o.this.new c(this.f45768p, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.f45766n;
            if (i11 == 0) {
                jn0.t.b(obj);
                dz.j cameraSession = o.this.getCameraSession();
                final o oVar = o.this;
                final long j11 = this.f45768p;
                wn0.l<? super CameraConfiguration, h0> lVar = new wn0.l() { // from class: com.mrousavy.camera.react.p
                    @Override // wn0.l
                    public final Object invoke(Object obj2) {
                        return o.c.b(oVar, j11, (CameraConfiguration) obj2);
                    }
                };
                this.f45766n = 1;
                if (cameraSession.B(lVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jn0.t.b(obj);
            }
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Ljn0/h0;", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 0, 0})
    @DebugMetadata(c = "com.mrousavy.camera.react.CameraView$updatePreview$1", f = "CameraView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends SuspendLambda implements wn0.p<CoroutineScope, Continuation<? super h0>, Object> {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f45769n;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<h0> create(Object obj, Continuation<?> continuation) {
            return o.this.new d(continuation);
        }

        @Override // p013kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f45769n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jn0.t.b(obj);
            if (o.this.getPreview() && o.this.getPreviewView() == null) {
                o oVar = o.this;
                oVar.setPreviewView$react_native_vision_camera_release(oVar.i());
                o oVar2 = o.this;
                oVar2.addView(oVar2.getPreviewView());
            } else if (!o.this.getPreview() && o.this.getPreviewView() != null) {
                o oVar3 = o.this;
                oVar3.removeView(oVar3.getPreviewView());
                o.this.setPreviewView$react_native_vision_camera_release(null);
            }
            PreviewView previewView = o.this.getPreviewView();
            if (previewView != null) {
                o oVar4 = o.this;
                previewView.setImplementationMode(oVar4.getAndroidPreviewViewType().toPreviewImplementationMode());
                previewView.setScaleType(oVar4.getResizeMode().toScaleType());
            }
            o.this.s();
            return h0.f84049a;
        }

        @Override // wn0.p
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super h0> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(h0.f84049a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/mrousavy/camera/react/o$e", "Landroid/view/ScaleGestureDetector$SimpleOnScaleGestureListener;", "Landroid/view/ScaleGestureDetector;", "detector", "", "onScale", "(Landroid/view/ScaleGestureDetector;)Z", "react-native-vision-camera_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class e extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        e() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector detector) {
            p013kotlin.jvm.internal.s.k(detector, "detector");
            o oVar = o.this;
            oVar.setZoom(oVar.getZoom() * detector.getScaleFactor());
            o.this.s();
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
        this.pixelFormat = fz.l.YUV;
        this.preview = true;
        this.photoQualityBalance = fz.o.SPEED;
        this.torch = fz.u.OFF;
        this.zoom = 1.0f;
        this.outputOrientation = fz.j.DEVICE;
        this.androidPreviewViewType = fz.n.SURFACE_VIEW;
        this.resizeMode = fz.q.COVER;
        this.mainCoroutineScope = CoroutineScopeKt.CoroutineScope(Dispatchers.getMain());
        this.currentConfigureCall = System.currentTimeMillis();
        this.fpsSampleCollector = new z(this);
        setClipToOutline(true);
        this.cameraSession = new dz.j(context, this);
        hz.b.a(this);
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PreviewView i() {
        PreviewView previewView = new PreviewView(getContext());
        hz.b.a(previewView);
        previewView.setImplementationMode(this.androidPreviewViewType.toPreviewImplementationMode());
        previewView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
        final p013kotlin.jvm.internal.j0 j0Var = new p013kotlin.jvm.internal.j0();
        previewView.getPreviewStreamState().observe(this.cameraSession, new b(new wn0.l() { // from class: com.mrousavy.camera.react.n
            @Override // wn0.l
            public final Object invoke(Object obj) {
                return o.j(j0Var, this, (PreviewView.f) obj);
            }
        }));
        return previewView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 j(p013kotlin.jvm.internal.j0 j0Var, o oVar, PreviewView.f fVar) {
        Log.i("CameraView", "PreviewView Stream State changed to " + fVar);
        boolean z11 = fVar == PreviewView.f.STREAMING;
        if (z11 != j0Var.f86523a) {
            if (z11) {
                s.h(oVar);
            } else {
                s.i(oVar);
            }
            j0Var.f86523a = z11;
        }
        return h0.f84049a;
    }

    private final void t() {
        BuildersKt__Builders_commonKt.launch$default(this.mainCoroutineScope, null, null, new d(null), 3, null);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void u() {
        if (!this.enableZoomGesture) {
            setOnTouchListener(null);
        } else {
            final ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), new e());
            setOnTouchListener(new View.OnTouchListener() { // from class: com.mrousavy.camera.react.m
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return o.v(scaleGestureDetector, view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(ScaleGestureDetector scaleGestureDetector, View view, MotionEvent motionEvent) {
        return scaleGestureDetector.onTouchEvent(motionEvent);
    }

    @Override // com.mrousavy.camera.react.z.a
    public void a(double averageFps) {
        s.b(this, averageFps);
    }

    @Override // dz.j.b
    public void b() {
        s.l(this);
    }

    @Override // dz.j.b
    public void c(fz.i outputOrientation) {
        p013kotlin.jvm.internal.s.k(outputOrientation, "outputOrientation");
        s.f(this, outputOrientation);
    }

    @Override // dz.j.b
    public void d() {
        s.e(this);
    }

    public final fz.n getAndroidPreviewViewType() {
        return this.androidPreviewViewType;
    }

    public final boolean getAudio() {
        return this.audio;
    }

    public final String getCameraId() {
        return this.cameraId;
    }

    /* JADX INFO: renamed from: getCameraSession$react_native_vision_camera_release, reason: from getter */
    public final dz.j getCameraSession() {
        return this.cameraSession;
    }

    public final CodeScannerOptions getCodeScannerOptions() {
        return this.codeScannerOptions;
    }

    public final boolean getEnableDepthData() {
        return this.enableDepthData;
    }

    public final boolean getEnableFrameProcessor() {
        return this.enableFrameProcessor;
    }

    public final boolean getEnableLocation() {
        return this.enableLocation;
    }

    public final boolean getEnablePortraitEffectsMatteDelivery() {
        return this.enablePortraitEffectsMatteDelivery;
    }

    public final boolean getEnableZoomGesture() {
        return this.enableZoomGesture;
    }

    public final double getExposure() {
        return this.exposure;
    }

    public final CameraDeviceFormat getFormat() {
        return this.format;
    }

    /* JADX INFO: renamed from: getFrameProcessor$react_native_vision_camera_release, reason: from getter */
    public final FrameProcessor getFrameProcessor() {
        return this.frameProcessor;
    }

    public final boolean getLowLightBoost() {
        return this.lowLightBoost;
    }

    public final Integer getMaxFps() {
        return this.maxFps;
    }

    public final Integer getMinFps() {
        return this.minFps;
    }

    public final fz.j getOutputOrientation() {
        return this.outputOrientation;
    }

    public final boolean getPhoto() {
        return this.photo;
    }

    public final boolean getPhotoHdr() {
        return this.photoHdr;
    }

    public final fz.o getPhotoQualityBalance() {
        return this.photoQualityBalance;
    }

    public final fz.l getPixelFormat() {
        return this.pixelFormat;
    }

    public final boolean getPreview() {
        return this.preview;
    }

    /* JADX INFO: renamed from: getPreviewView$react_native_vision_camera_release, reason: from getter */
    public final PreviewView getPreviewView() {
        return this.previewView;
    }

    public final fz.q getResizeMode() {
        return this.resizeMode;
    }

    public final fz.u getTorch() {
        return this.torch;
    }

    public final boolean getVideo() {
        return this.video;
    }

    public final Double getVideoBitRateMultiplier() {
        return this.videoBitRateMultiplier;
    }

    public final Double getVideoBitRateOverride() {
        return this.videoBitRateOverride;
    }

    public final boolean getVideoHdr() {
        return this.videoHdr;
    }

    public final fz.y getVideoStabilizationMode() {
        return this.videoStabilizationMode;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public final void k() {
        this.cameraSession.close();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsMirrored() {
        return this.isMirrored;
    }

    @Override // dz.j.b
    public void n(fz.i previewOrientation) {
        p013kotlin.jvm.internal.s.k(previewOrientation, "previewOrientation");
        s.g(this, previewOrientation);
    }

    @Override // dz.j.b
    public void o() {
        s.k(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Log.i("CameraView", "CameraView attached to window!");
        super.onAttachedToWindow();
        if (!this.isMounted) {
            this.isMounted = true;
            s.m(this);
        }
        this.fpsSampleCollector.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        Log.i("CameraView", "CameraView detached from window!");
        super.onDetachedFromWindow();
        this.fpsSampleCollector.f();
    }

    @Override // dz.j.b
    public void onError(Throwable error) {
        p013kotlin.jvm.internal.s.k(error, "error");
        s.d(this, error);
    }

    @Override // dz.j.b
    public void p(fz.r type) {
        p013kotlin.jvm.internal.s.k(type, "type");
        s.j(this, type);
    }

    @Override // dz.j.b
    public void q(Frame frame) {
        p013kotlin.jvm.internal.s.k(frame, "frame");
        this.fpsSampleCollector.d();
        FrameProcessor frameProcessor = this.frameProcessor;
        if (frameProcessor != null) {
            frameProcessor.call(frame);
        }
    }

    @Override // dz.j.b
    public void r(List<? extends tx.a> codes, CodeScannerFrame scannerFrame) {
        p013kotlin.jvm.internal.s.k(codes, "codes");
        p013kotlin.jvm.internal.s.k(scannerFrame, "scannerFrame");
        s.c(this, codes, scannerFrame);
    }

    public final void s() {
        Log.i("CameraView", "Updating CameraSession...");
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.currentConfigureCall = jCurrentTimeMillis;
        BuildersKt__Builders_commonKt.launch$default(this.mainCoroutineScope, null, null, new c(jCurrentTimeMillis, null), 3, null);
    }

    public final void setActive(boolean z11) {
        this.isActive = z11;
    }

    public final void setAndroidPreviewViewType(fz.n value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.androidPreviewViewType = value;
        t();
    }

    public final void setAudio(boolean z11) {
        this.audio = z11;
    }

    public final void setCameraId(String str) {
        this.cameraId = str;
    }

    public final void setCodeScannerOptions(CodeScannerOptions cVar) {
        this.codeScannerOptions = cVar;
    }

    public final void setEnableDepthData(boolean z11) {
        this.enableDepthData = z11;
    }

    public final void setEnableFrameProcessor(boolean z11) {
        this.enableFrameProcessor = z11;
    }

    public final void setEnableLocation(boolean z11) {
        this.enableLocation = z11;
    }

    public final void setEnablePortraitEffectsMatteDelivery(boolean z11) {
        this.enablePortraitEffectsMatteDelivery = z11;
    }

    public final void setEnableZoomGesture(boolean z11) {
        this.enableZoomGesture = z11;
        u();
    }

    public final void setExposure(double d11) {
        this.exposure = d11;
    }

    public final void setFormat(CameraDeviceFormat bVar) {
        this.format = bVar;
    }

    public final void setFrameProcessor$react_native_vision_camera_release(FrameProcessor frameProcessor) {
        this.frameProcessor = frameProcessor;
    }

    public final void setLowLightBoost(boolean z11) {
        this.lowLightBoost = z11;
    }

    public final void setMaxFps(Integer num) {
        this.maxFps = num;
    }

    public final void setMinFps(Integer num) {
        this.minFps = num;
    }

    public final void setMirrored(boolean z11) {
        this.isMirrored = z11;
    }

    public final void setOutputOrientation(fz.j jVar) {
        p013kotlin.jvm.internal.s.k(jVar, "<set-?>");
        this.outputOrientation = jVar;
    }

    public final void setPhoto(boolean z11) {
        this.photo = z11;
    }

    public final void setPhotoHdr(boolean z11) {
        this.photoHdr = z11;
    }

    public final void setPhotoQualityBalance(fz.o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<set-?>");
        this.photoQualityBalance = oVar;
    }

    public final void setPixelFormat(fz.l lVar) {
        p013kotlin.jvm.internal.s.k(lVar, "<set-?>");
        this.pixelFormat = lVar;
    }

    public final void setPreview(boolean z11) {
        this.preview = z11;
        t();
    }

    public final void setPreviewView$react_native_vision_camera_release(PreviewView previewView) {
        this.previewView = previewView;
    }

    public final void setResizeMode(fz.q value) {
        p013kotlin.jvm.internal.s.k(value, "value");
        this.resizeMode = value;
        t();
    }

    public final void setTorch(fz.u uVar) {
        p013kotlin.jvm.internal.s.k(uVar, "<set-?>");
        this.torch = uVar;
    }

    public final void setVideo(boolean z11) {
        this.video = z11;
    }

    public final void setVideoBitRateMultiplier(Double d11) {
        this.videoBitRateMultiplier = d11;
    }

    public final void setVideoBitRateOverride(Double d11) {
        this.videoBitRateOverride = d11;
    }

    public final void setVideoHdr(boolean z11) {
        this.videoHdr = z11;
    }

    public final void setVideoStabilizationMode(fz.y yVar) {
        this.videoStabilizationMode = yVar;
    }

    public final void setZoom(float f11) {
        this.zoom = f11;
    }
}
