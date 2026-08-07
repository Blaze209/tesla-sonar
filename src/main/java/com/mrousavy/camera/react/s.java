package com.mrousavy.camera.react;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.EventDispatcher;
import com.fourthline.analytics.internal.AnalyticsAttribute;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import dz.CodeScannerFrame;
import dz.v1;
import java.util.List;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0019\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0019\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u000f\u001a\u0019\u0010\u0014\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0011\u0010\u0016\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0003\u001a\u0019\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010 \u001a\u00020\u0001*\u00020\u00002\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u001f\u0010$\u001a\u00020\u0001*\u00020\u00002\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0017\u0010'\u001a\u00020&2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/mrousavy/camera/react/o;", "Ljn0/h0;", "e", "(Lcom/mrousavy/camera/react/o;)V", "k", "l", "h", IntegerTokenConverter.CONVERTER_KEY, "Lfz/r;", "type", "j", "(Lcom/mrousavy/camera/react/o;Lfz/r;)V", "Lfz/i;", "outputOrientation", "f", "(Lcom/mrousavy/camera/react/o;Lfz/i;)V", "previewOrientation", "g", "", AnalyticsAttribute.Error, DateTokenConverter.CONVERTER_KEY, "(Lcom/mrousavy/camera/react/o;Ljava/lang/Throwable;)V", "m", "", "averageFps", "b", "(Lcom/mrousavy/camera/react/o;D)V", "", "Ltx/a;", "barcodes", "Ldz/x;", "scannerFrame", "c", "(Lcom/mrousavy/camera/react/o;Ljava/util/List;Ldz/x;)V", "Lcom/facebook/react/uimanager/events/d;", "event", "n", "(Lcom/mrousavy/camera/react/o;Lcom/facebook/react/uimanager/events/d;)V", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Ljava/lang/Throwable;)Lcom/facebook/react/bridge/WritableMap;", "react-native-vision-camera_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class s {
    private static final WritableMap a(Throwable th2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("message", th2.getMessage());
        writableMapCreateMap.putString("stacktrace", jn0.g.b(th2));
        Throwable cause = th2.getCause();
        if (cause != null) {
            writableMapCreateMap.putMap("cause", a(cause));
        }
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        return writableMapCreateMap;
    }

    public static final void b(o oVar, double d11) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        Log.i("CameraView", "invokeOnAverageFpsChanged(" + d11 + ")");
        int iF = b1.f(oVar);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("averageFps", d11);
        int id2 = oVar.getId();
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        n(oVar, new a(iF, id2, writableMapCreateMap));
    }

    public static final void c(o oVar, List<? extends tx.a> barcodes, CodeScannerFrame scannerFrame) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        p013kotlin.jvm.internal.s.k(barcodes, "barcodes");
        p013kotlin.jvm.internal.s.k(scannerFrame, "scannerFrame");
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (tx.a aVar : barcodes) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("type", fz.d.INSTANCE.a(aVar.c()).getUnionValue());
            writableMapCreateMap.putString("value", aVar.d());
            Rect rectA = aVar.a();
            if (rectA != null) {
                WritableMap writableMapCreateMap2 = Arguments.createMap();
                writableMapCreateMap2.putInt("x", rectA.left);
                writableMapCreateMap2.putInt("y", rectA.top);
                writableMapCreateMap2.putInt(Snapshot.WIDTH, rectA.right - rectA.left);
                writableMapCreateMap2.putInt(Snapshot.HEIGHT, rectA.bottom - rectA.top);
                writableMapCreateMap.putMap("frame", writableMapCreateMap2);
            }
            Point[] pointArrB = aVar.b();
            if (pointArrB != null) {
                WritableArray writableArrayCreateArray2 = Arguments.createArray();
                for (Point point : pointArrB) {
                    WritableMap writableMapCreateMap3 = Arguments.createMap();
                    writableMapCreateMap3.putInt("x", point.x);
                    writableMapCreateMap3.putInt("y", point.y);
                    writableArrayCreateArray2.pushMap(writableMapCreateMap3);
                }
                writableMapCreateMap.putArray("corners", writableArrayCreateArray2);
            }
            writableArrayCreateArray.pushMap(writableMapCreateMap);
        }
        WritableMap writableMapCreateMap4 = Arguments.createMap();
        writableMapCreateMap4.putArray("codes", writableArrayCreateArray);
        WritableMap writableMapCreateMap5 = Arguments.createMap();
        writableMapCreateMap5.putInt(Snapshot.WIDTH, scannerFrame.getWidth());
        writableMapCreateMap5.putInt(Snapshot.HEIGHT, scannerFrame.getHeight());
        writableMapCreateMap4.putMap("frame", writableMapCreateMap5);
        int iF = b1.f(oVar);
        int id2 = oVar.getId();
        p013kotlin.jvm.internal.s.h(writableMapCreateMap4);
        n(oVar, new b(iF, id2, writableMapCreateMap4));
    }

    public static final void d(o oVar, Throwable error) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        p013kotlin.jvm.internal.s.k(error, "error");
        Log.e("CameraView", "invokeOnError(...):");
        error.printStackTrace();
        dz.c v1Var = error instanceof dz.c ? (dz.c) error : new v1(error);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("code", v1Var.a());
        writableMapCreateMap.putString("message", v1Var.getMessage());
        Throwable cause = v1Var.getCause();
        if (cause != null) {
            writableMapCreateMap.putMap("cause", a(cause));
        }
        int iF = b1.f(oVar);
        int id2 = oVar.getId();
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        n(oVar, new c(iF, id2, writableMapCreateMap));
    }

    public static final void e(o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        Log.i("CameraView", "invokeOnInitialized()");
        n(oVar, new d(b1.f(oVar), oVar.getId()));
    }

    public static final void f(o oVar, fz.i outputOrientation) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        p013kotlin.jvm.internal.s.k(outputOrientation, "outputOrientation");
        Log.i("CameraView", "invokeOnOutputOrientationChanged(" + outputOrientation + ")");
        int iF = b1.f(oVar);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("outputOrientation", outputOrientation.getUnionValue());
        int id2 = oVar.getId();
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        n(oVar, new e(iF, id2, writableMapCreateMap));
    }

    public static final void g(o oVar, fz.i previewOrientation) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        p013kotlin.jvm.internal.s.k(previewOrientation, "previewOrientation");
        Log.i("CameraView", "invokeOnPreviewOrientationChanged(" + previewOrientation + ")");
        int iF = b1.f(oVar);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("previewOrientation", previewOrientation.getUnionValue());
        int id2 = oVar.getId();
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        n(oVar, new g(iF, id2, writableMapCreateMap));
    }

    public static final void h(o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        Log.i("CameraView", "invokeOnPreviewStarted()");
        n(oVar, new h(b1.f(oVar), oVar.getId()));
    }

    public static final void i(o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        Log.i("CameraView", "invokeOnPreviewStopped()");
        n(oVar, new i(b1.f(oVar), oVar.getId()));
    }

    public static final void j(o oVar, fz.r type) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        p013kotlin.jvm.internal.s.k(type, "type");
        Log.i("CameraView", "invokeOnShutter(" + type + ")");
        int iF = b1.f(oVar);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("type", type.getUnionValue());
        int id2 = oVar.getId();
        p013kotlin.jvm.internal.s.h(writableMapCreateMap);
        n(oVar, new j(iF, id2, writableMapCreateMap));
    }

    public static final void k(o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        Log.i("CameraView", "invokeOnStarted()");
        n(oVar, new k(b1.f(oVar), oVar.getId()));
    }

    public static final void l(o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        Log.i("CameraView", "invokeOnStopped()");
        n(oVar, new l(b1.f(oVar), oVar.getId()));
    }

    public static final void m(o oVar) {
        p013kotlin.jvm.internal.s.k(oVar, "<this>");
        n(oVar, new r(b1.f(oVar), oVar.getId()));
    }

    private static final void n(o oVar, com.facebook.react.uimanager.events.d<?> dVar) {
        Context context = oVar.getContext();
        p013kotlin.jvm.internal.s.i(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        EventDispatcher eventDispatcherC = b1.c((ReactContext) context, oVar.getId());
        if (eventDispatcherC != null) {
            eventDispatcherC.h(dVar);
        }
    }
}
