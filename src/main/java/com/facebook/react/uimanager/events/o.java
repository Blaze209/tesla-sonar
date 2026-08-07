package com.facebook.react.uimanager.events;

import android.view.View;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0017\u001a\u00020\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\u001f\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00162\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b!\u0010 ¨\u0006\""}, d2 = {"Lcom/facebook/react/uimanager/events/o;", "", "<init>", "()V", "", "eventName", "pointerType", "", "buttonState", "b", "(Ljava/lang/String;Ljava/lang/String;I)I", "lastButtonState", "currentButtonState", "a", "(Ljava/lang/String;II)I", "toolType", "e", "(I)Ljava/lang/String;", "Landroid/view/View;", "view", "Lcom/facebook/react/uimanager/events/o$a;", "event", "", "h", "(Landroid/view/View;Lcom/facebook/react/uimanager/events/o$a;)Z", "pointerEventType", "c", "(Ljava/lang/String;)I", "", DateTokenConverter.CONVERTER_KEY, "(ILjava/lang/String;)D", "f", "(Ljava/lang/String;)Z", "g", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f23197a = new o();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/uimanager/events/o$a;", "", "<init>", "(Ljava/lang/String;I)V", "CANCEL", "CANCEL_CAPTURE", "CLICK", "CLICK_CAPTURE", "DOWN", "DOWN_CAPTURE", "ENTER", "ENTER_CAPTURE", "LEAVE", "LEAVE_CAPTURE", "MOVE", "MOVE_CAPTURE", "UP", "UP_CAPTURE", "OUT", "OUT_CAPTURE", "OVER", "OVER_CAPTURE", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        CANCEL,
        CANCEL_CAPTURE,
        CLICK,
        CLICK_CAPTURE,
        DOWN,
        DOWN_CAPTURE,
        ENTER,
        ENTER_CAPTURE,
        LEAVE,
        LEAVE_CAPTURE,
        MOVE,
        MOVE_CAPTURE,
        UP,
        UP_CAPTURE,
        OUT,
        OUT_CAPTURE,
        OVER,
        OVER_CAPTURE;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23198a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.DOWN_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.UP_CAPTURE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.CANCEL_CAPTURE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.CLICK_CAPTURE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            f23198a = iArr;
        }
    }

    private o() {
    }

    public static final int a(String pointerType, int lastButtonState, int currentButtonState) {
        p013kotlin.jvm.internal.s.k(pointerType, "pointerType");
        int i11 = 0;
        if (p013kotlin.jvm.internal.s.f("touch", pointerType)) {
            return 0;
        }
        int i12 = currentButtonState ^ lastButtonState;
        if (i12 == 0) {
            return -1;
        }
        if (i12 != 1) {
            i11 = 2;
            if (i12 != 2) {
                if (i12 == 4) {
                    return 1;
                }
                if (i12 != 8) {
                    return i12 != 16 ? -1 : 4;
                }
                return 3;
            }
        }
        return i11;
    }

    public static final int b(String eventName, String pointerType, int buttonState) {
        p013kotlin.jvm.internal.s.k(pointerType, "pointerType");
        if (f23197a.g(eventName)) {
            return 0;
        }
        if (p013kotlin.jvm.internal.s.f("touch", pointerType)) {
            return 1;
        }
        return buttonState;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:33:0x0055 A[RETURN] */
    public static final int c(String pointerEventType) {
        if (pointerEventType == null) {
            return 2;
        }
        switch (pointerEventType) {
            case "topPointerEnter":
                return 4;
            case "topPointerLeave":
                return 4;
            case "topPointerDown":
                return 3;
            case "topPointerMove":
                return 4;
            case "topPointerOver":
                return 4;
            case "topPointerUp":
                return 3;
            case "topPointerCancel":
                return 3;
            case "topPointerOut":
                return 4;
            default:
                return 2;
        }
    }

    public static final double d(int buttonState, String eventName) {
        return (f23197a.g(eventName) || buttonState == 0) ? 0.0d : 0.5d;
    }

    public static final String e(int toolType) {
        if (toolType == 1) {
            return "touch";
        }
        if (toolType != 2) {
            return toolType != 3 ? "" : "mouse";
        }
        return "pen";
    }

    public static final boolean f(String eventName) {
        if (eventName == null) {
            return false;
        }
        switch (eventName.hashCode()) {
            case -1304584214:
                return eventName.equals("topPointerDown");
            case -1304316135:
                return eventName.equals("topPointerMove");
            case -1304250340:
                return eventName.equals("topPointerOver");
            case -1065042973:
                return eventName.equals("topPointerUp");
            case 383186882:
                return eventName.equals("topPointerCancel");
            case 1343400710:
                return eventName.equals("topPointerOut");
            default:
                return false;
        }
    }

    public static final boolean h(View view, a event) {
        p013kotlin.jvm.internal.s.k(event, "event");
        if (view == null) {
            return true;
        }
        switch (b.f23198a[event.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                Object tag = view.getTag(com.facebook.react.m.f22669s);
                Integer num = tag instanceof Integer ? (Integer) tag : null;
                return (num == null || (num.intValue() & (1 << event.ordinal())) == 0) ? false : true;
        }
    }

    public final boolean g(String eventName) {
        if (eventName == null) {
            return false;
        }
        int iHashCode = eventName.hashCode();
        if (iHashCode == -1780335505) {
            return eventName.equals("topPointerLeave");
        }
        if (iHashCode != -1065042973) {
            return iHashCode == 1343400710 && eventName.equals("topPointerOut");
        }
        return eventName.equals("topPointerUp");
    }
}
