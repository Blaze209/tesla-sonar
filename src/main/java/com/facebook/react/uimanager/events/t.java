package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.w;
import java.util.Iterator;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001a8\u0006X\u0087D¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u0012\u0004\b\u001c\u0010\u0003¨\u0006\u001e"}, d2 = {"Lcom/facebook/react/uimanager/events/t;", "", "<init>", "()V", "Lcom/facebook/react/uimanager/events/q;", "event", "", "Lcom/facebook/react/bridge/WritableMap;", "a", "(Lcom/facebook/react/uimanager/events/q;)[Lcom/facebook/react/bridge/WritableMap;", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "touchEvent", "Ljn0/h0;", DateTokenConverter.CONVERTER_KEY, "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;Lcom/facebook/react/uimanager/events/q;)V", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "eventEmitter", "c", "(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;Lcom/facebook/react/uimanager/events/q;)V", "", "copyObjects", "objects", "Lcom/facebook/react/bridge/WritableArray;", "b", "(Z[Lcom/facebook/react/bridge/WritableMap;)Lcom/facebook/react/bridge/WritableArray;", "", "Ljava/lang/String;", "getTARGET_KEY$annotations", "TARGET_KEY", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f23209a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final String TARGET_KEY = "target";

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23211a;

        static {
            int[] iArr = new int[s.values().length];
            try {
                iArr[s.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.MOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.CANCEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f23211a = iArr;
        }
    }

    private t() {
    }

    private final WritableMap[] a(q event) {
        MotionEvent motionEventC = event.c();
        WritableMap[] writableMapArr = new WritableMap[motionEventC.getPointerCount()];
        float x11 = motionEventC.getX() - event.getViewX();
        float y11 = motionEventC.getY() - event.getViewY();
        int pointerCount = motionEventC.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            w wVar = w.f23413a;
            writableMapCreateMap.putDouble("pageX", wVar.d(motionEventC.getX(i11)));
            writableMapCreateMap.putDouble("pageY", wVar.d(motionEventC.getY(i11)));
            float x12 = motionEventC.getX(i11) - x11;
            float y12 = motionEventC.getY(i11) - y11;
            writableMapCreateMap.putDouble("locationX", wVar.d(x12));
            writableMapCreateMap.putDouble("locationY", wVar.d(y12));
            writableMapCreateMap.putInt("targetSurface", event.getSurfaceId());
            writableMapCreateMap.putInt(TARGET_KEY, event.getViewTag());
            writableMapCreateMap.putDouble("timestamp", event.getTimestampMs());
            writableMapCreateMap.putDouble("identifier", motionEventC.getPointerId(i11));
            writableMapArr[i11] = writableMapCreateMap;
        }
        return writableMapArr;
    }

    private final WritableArray b(boolean copyObjects, WritableMap[] objects) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (WritableMap writableMapCopy : objects) {
            if (writableMapCopy != null) {
                if (copyObjects) {
                    writableMapCopy = writableMapCopy.copy();
                }
                writableArrayCreateArray.pushMap(writableMapCopy);
            }
        }
        p013kotlin.jvm.internal.s.h(writableArrayCreateArray);
        return writableArrayCreateArray;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a1 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:3:0x002d, B:11:0x0051, B:31:0x0097, B:32:0x009b, B:34:0x00a1, B:36:0x00a9, B:38:0x00c4, B:14:0x0059, B:15:0x005e, B:16:0x005f, B:17:0x0062, B:19:0x0065, B:21:0x0069, B:23:0x006f, B:25:0x0076, B:26:0x0083, B:28:0x008b, B:30:0x0091), top: B:44:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:3:0x002d, B:11:0x0051, B:31:0x0097, B:32:0x009b, B:34:0x00a1, B:36:0x00a9, B:38:0x00c4, B:14:0x0059, B:15:0x005e, B:16:0x005f, B:17:0x0062, B:19:0x0065, B:21:0x0069, B:23:0x006f, B:25:0x0076, B:26:0x0083, B:28:0x008b, B:30:0x0091), top: B:44:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    public static final void c(RCTModernEventEmitter eventEmitter, q event) {
        WritableMap[] writableMapArr;
        WritableMap[] writableMapArr2;
        Iterator itA;
        WritableMap writableMap;
        WritableMap writableMap2;
        RCTModernEventEmitter eventEmitter2 = eventEmitter;
        p013kotlin.jvm.internal.s.k(eventEmitter2, "eventEmitter");
        p013kotlin.jvm.internal.s.k(event, "event");
        ep.a.c(0L, "TouchesHelper.sentTouchEventModern(" + event.getEventName() + ")");
        try {
            s sVarD = event.d();
            MotionEvent motionEventC = event.c();
            WritableMap[] writableMapArrA = f23209a.a(event);
            int i11 = a.f23211a[sVarD.ordinal()];
            if (i11 == 1) {
                WritableMap writableMap3 = writableMapArrA[motionEventC.getActionIndex()];
                writableMapArr = new WritableMap[]{writableMap3 != null ? writableMap3.copy() : null};
            } else {
                if (i11 != 2) {
                    if (i11 == 3) {
                        writableMapArr = new WritableMap[writableMapArrA.length];
                        for (int i12 = 0; i12 < writableMapArrA.length; i12++) {
                            WritableMap writableMap4 = writableMapArrA[i12];
                            writableMapArr[i12] = writableMap4 != null ? writableMap4.copy() : null;
                        }
                    } else {
                        if (i11 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        writableMapArr2 = new WritableMap[0];
                        writableMapArr = writableMapArrA;
                    }
                    itA = p013kotlin.jvm.internal.c.a(writableMapArr);
                    while (itA.hasNext()) {
                        writableMap = (WritableMap) itA.next();
                        if (writableMap != null) {
                            WritableMap writableMapCopy = writableMap.copy();
                            t tVar = f23209a;
                            WritableArray writableArrayB = tVar.b(true, writableMapArr);
                            WritableArray writableArrayB2 = tVar.b(true, writableMapArr2);
                            writableMapCopy.putArray("changedTouches", writableArrayB);
                            writableMapCopy.putArray("touches", writableArrayB2);
                            writableMap2 = writableMapCopy;
                        } else {
                            writableMap2 = null;
                        }
                        eventEmitter2.receiveEvent(event.getSurfaceId(), event.getViewTag(), event.getEventName(), event.canCoalesce(), 0, writableMap2, event.getEventCategory());
                        eventEmitter2 = eventEmitter;
                    }
                    ep.a.i(0L);
                }
                int actionIndex = motionEventC.getActionIndex();
                WritableMap writableMap5 = writableMapArrA[actionIndex];
                writableMapArrA[actionIndex] = null;
                writableMapArr = new WritableMap[]{writableMap5};
            }
            writableMapArr2 = writableMapArrA;
            itA = p013kotlin.jvm.internal.c.a(writableMapArr);
            while (itA.hasNext()) {
                writableMap = (WritableMap) itA.next();
                if (writableMap != null) {
                    WritableMap writableMapCopy2 = writableMap.copy();
                    t tVar2 = f23209a;
                    WritableArray writableArrayB3 = tVar2.b(true, writableMapArr);
                    WritableArray writableArrayB4 = tVar2.b(true, writableMapArr2);
                    writableMapCopy2.putArray("changedTouches", writableArrayB3);
                    writableMapCopy2.putArray("touches", writableArrayB4);
                    writableMap2 = writableMapCopy2;
                } else {
                    writableMap2 = null;
                }
                eventEmitter2.receiveEvent(event.getSurfaceId(), event.getViewTag(), event.getEventName(), event.canCoalesce(), 0, writableMap2, event.getEventCategory());
                eventEmitter2 = eventEmitter;
            }
            ep.a.i(0L);
        } catch (Throwable th2) {
            ep.a.i(0L);
            throw th2;
        }
    }

    public static final void d(RCTEventEmitter rctEventEmitter, q touchEvent) {
        p013kotlin.jvm.internal.s.k(rctEventEmitter, "rctEventEmitter");
        p013kotlin.jvm.internal.s.k(touchEvent, "touchEvent");
        s sVarD = touchEvent.d();
        t tVar = f23209a;
        WritableArray writableArrayB = tVar.b(false, tVar.a(touchEvent));
        MotionEvent motionEventC = touchEvent.c();
        WritableArray writableArrayCreateArray = Arguments.createArray();
        if (sVarD == s.MOVE || sVarD == s.CANCEL) {
            int pointerCount = motionEventC.getPointerCount();
            for (int i11 = 0; i11 < pointerCount; i11++) {
                writableArrayCreateArray.pushInt(i11);
            }
        } else {
            if (sVarD != s.START && sVarD != s.END) {
                throw new RuntimeException("Unknown touch type: " + sVarD);
            }
            writableArrayCreateArray.pushInt(motionEventC.getActionIndex());
        }
        String strA = s.INSTANCE.a(sVarD);
        p013kotlin.jvm.internal.s.h(writableArrayCreateArray);
        rctEventEmitter.receiveTouches(strA, writableArrayB, writableArrayCreateArray);
    }
}
