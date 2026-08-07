package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.SoftAssertions;
import ezvcard.property.Gender;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001-B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JQ\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0015H\u0016¢\u0006\u0004\b \u0010\u0017J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$H\u0017¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00122\u0006\u0010%\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00102R$\u0010\u000e\u001a\u00020\r2\u0006\u00104\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u00105\u001a\u0004\b6\u00107R$\u0010\u000f\u001a\u00020\r2\u0006\u00104\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00105\u001a\u0004\b8\u00107¨\u00069"}, d2 = {"Lcom/facebook/react/uimanager/events/q;", "Lcom/facebook/react/uimanager/events/d;", "<init>", "()V", "", "surfaceId", "viewTag", "Lcom/facebook/react/uimanager/events/s;", "touchEventType", "Landroid/view/MotionEvent;", "motionEventToCopy", "", "gestureStartTime", "", "viewX", "viewY", "Lcom/facebook/react/uimanager/events/r;", "touchEventCoalescingKeyHelper", "Ljn0/h0;", "g", "(IILcom/facebook/react/uimanager/events/s;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/r;)V", "", IntegerTokenConverter.CONVERTER_KEY, "()Z", "c", "()Landroid/view/MotionEvent;", DateTokenConverter.CONVERTER_KEY, "()Lcom/facebook/react/uimanager/events/s;", "onDispose", "", "getEventName", "()Ljava/lang/String;", "canCoalesce", "", "getCoalescingKey", "()S", "Lcom/facebook/react/uimanager/events/RCTEventEmitter;", "rctEventEmitter", "dispatch", "(Lcom/facebook/react/uimanager/events/RCTEventEmitter;)V", "Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;", "dispatchModern", "(Lcom/facebook/react/uimanager/events/RCTModernEventEmitter;)V", "getEventCategory", "()I", "a", "Landroid/view/MotionEvent;", "motionEvent", "b", "Lcom/facebook/react/uimanager/events/s;", "S", "coalescingKey", "value", Gender.FEMALE, "e", "()F", "f", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q extends d<q> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f23200g = q.class.getSimpleName();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final u5.g<q> f23201h = new u5.g<>(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private MotionEvent motionEvent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private s touchEventType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private short coalescingKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float viewX;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float viewY;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.events.q$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JS\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/facebook/react/uimanager/events/q$a;", "", "<init>", "()V", "", "surfaceId", "viewTag", "Lcom/facebook/react/uimanager/events/s;", "touchEventType", "Landroid/view/MotionEvent;", "motionEventToCopy", "", "gestureStartTime", "", "viewX", "viewY", "Lcom/facebook/react/uimanager/events/r;", "touchEventCoalescingKeyHelper", "Lcom/facebook/react/uimanager/events/q;", "a", "(IILcom/facebook/react/uimanager/events/s;Landroid/view/MotionEvent;JFFLcom/facebook/react/uimanager/events/r;)Lcom/facebook/react/uimanager/events/q;", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "TOUCH_EVENTS_POOL_SIZE", "I", "Lu5/g;", "EVENTS_POOL", "Lu5/g;", "UNSET", "J", "ReactAndroid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a(int surfaceId, int viewTag, s touchEventType, MotionEvent motionEventToCopy, long gestureStartTime, float viewX, float viewY, r touchEventCoalescingKeyHelper) {
            p013kotlin.jvm.internal.s.k(touchEventCoalescingKeyHelper, "touchEventCoalescingKeyHelper");
            q qVar = (q) q.f23201h.b();
            if (qVar == null) {
                qVar = new q(null);
            }
            q qVar2 = qVar;
            Object objC = gn.a.c(motionEventToCopy);
            p013kotlin.jvm.internal.s.j(objC, "assertNotNull(...)");
            qVar2.g(surfaceId, viewTag, touchEventType, (MotionEvent) objC, gestureStartTime, viewX, viewY, touchEventCoalescingKeyHelper);
            return qVar2;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23207a;

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
                iArr[s.CANCEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.MOVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f23207a = iArr;
        }
    }

    public /* synthetic */ q(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(int surfaceId, int viewTag, s touchEventType, MotionEvent motionEventToCopy, long gestureStartTime, float viewX, float viewY, r touchEventCoalescingKeyHelper) {
        super.init(surfaceId, viewTag, motionEventToCopy.getEventTime());
        short sB = 0;
        SoftAssertions.assertCondition(gestureStartTime != Long.MIN_VALUE, "Gesture start time must be initialized");
        int action = motionEventToCopy.getAction() & 255;
        if (action == 0) {
            touchEventCoalescingKeyHelper.a(gestureStartTime);
        } else if (action == 1) {
            touchEventCoalescingKeyHelper.e(gestureStartTime);
        } else if (action == 2) {
            sB = touchEventCoalescingKeyHelper.b(gestureStartTime);
        } else if (action == 3) {
            touchEventCoalescingKeyHelper.e(gestureStartTime);
        } else if (action == 5 || action == 6) {
            touchEventCoalescingKeyHelper.d(gestureStartTime);
        }
        this.motionEvent = MotionEvent.obtain(motionEventToCopy);
        this.touchEventType = touchEventType;
        this.coalescingKey = sB;
        this.viewX = viewX;
        this.viewY = viewY;
    }

    public static final q h(int i11, int i12, s sVar, MotionEvent motionEvent, long j11, float f11, float f12, r rVar) {
        return INSTANCE.a(i11, i12, sVar, motionEvent, j11, f11, f12, rVar);
    }

    private final boolean i() {
        if (this.motionEvent != null) {
            return true;
        }
        String TAG = f23200g;
        p013kotlin.jvm.internal.s.j(TAG, "TAG");
        ReactSoftExceptionLogger.logSoftException(TAG, new IllegalStateException("Cannot dispatch a TouchEvent that has no MotionEvent; the TouchEvent has been recycled"));
        return false;
    }

    public final MotionEvent c() {
        Object objC = gn.a.c(this.motionEvent);
        p013kotlin.jvm.internal.s.j(objC, "assertNotNull(...)");
        return (MotionEvent) objC;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        s sVar = (s) gn.a.c(this.touchEventType);
        int i11 = sVar == null ? -1 : b.f23207a[sVar.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return false;
        }
        if (i11 == 4) {
            return true;
        }
        throw new RuntimeException("Unknown touch event type: " + this.touchEventType);
    }

    public final s d() {
        Object objC = gn.a.c(this.touchEventType);
        p013kotlin.jvm.internal.s.j(objC, "assertNotNull(...)");
        return (s) objC;
    }

    @Override // com.facebook.react.uimanager.events.d
    @jn0.e
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        p013kotlin.jvm.internal.s.k(rctEventEmitter, "rctEventEmitter");
        if (i()) {
            t.d(rctEventEmitter, this);
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public void dispatchModern(RCTModernEventEmitter rctEventEmitter) {
        p013kotlin.jvm.internal.s.k(rctEventEmitter, "rctEventEmitter");
        if (i()) {
            rctEventEmitter.receiveTouches(this);
        }
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getViewX() {
        return this.viewX;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getViewY() {
        return this.viewY;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return this.coalescingKey;
    }

    @Override // com.facebook.react.uimanager.events.d
    public int getEventCategory() {
        s sVar = this.touchEventType;
        if (sVar == null) {
            return 2;
        }
        int i11 = b.f23207a[sVar.ordinal()];
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2 || i11 == 3) {
            return 1;
        }
        if (i11 == 4) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        s.Companion companion = s.INSTANCE;
        Object objC = gn.a.c(this.touchEventType);
        p013kotlin.jvm.internal.s.j(objC, "assertNotNull(...)");
        return companion.a((s) objC);
    }

    @Override // com.facebook.react.uimanager.events.d
    public void onDispose() {
        MotionEvent motionEvent = this.motionEvent;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.motionEvent = null;
        try {
            f23201h.a(this);
        } catch (IllegalStateException e11) {
            String TAG = f23200g;
            p013kotlin.jvm.internal.s.j(TAG, "TAG");
            ReactSoftExceptionLogger.logSoftException(TAG, e11);
        }
    }

    private q() {
    }
}
