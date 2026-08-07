package com.swmansion.rnscreens.events;

import android.animation.Animator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.rnscreens.u0;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001b\u001c\u001dB!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/swmansion/rnscreens/events/e;", "Landroid/animation/Animator$AnimatorListener;", "Lcom/swmansion/rnscreens/u0;", "wrapper", "Lcom/swmansion/rnscreens/events/i;", "eventEmitter", "Lcom/swmansion/rnscreens/events/e$a;", "animationType", "<init>", "(Lcom/swmansion/rnscreens/u0;Lcom/swmansion/rnscreens/events/i;Lcom/swmansion/rnscreens/events/e$a;)V", "Ljn0/h0;", "progressState", "()V", "Landroid/animation/Animator;", "animation", "onAnimationStart", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationRepeat", "Lcom/swmansion/rnscreens/u0;", "Lcom/swmansion/rnscreens/events/i;", "Lcom/swmansion/rnscreens/events/e$a;", "Lcom/swmansion/rnscreens/events/e$c;", "currentState", "Lcom/swmansion/rnscreens/events/e$c;", "Companion", "a", "c", "b", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e implements Animator.AnimatorListener {
    public static final String TAG = "ScreenEventDelegate";
    private final a animationType;
    private c currentState;
    private final i eventEmitter;
    private final u0 wrapper;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/swmansion/rnscreens/events/e$a;", "", "<init>", "(Ljava/lang/String;I)V", "ENTER", "EXIT", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum a {
        ENTER,
        EXIT;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<a> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/swmansion/rnscreens/events/e$c;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZED", "START_DISPATCHED", "END_DISPATCHED", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private enum c {
        INITIALIZED,
        START_DISPATCHED,
        END_DISPATCHED;

        private static final /* synthetic */ EnumEntries $ENTRIES = on0.a.a(values());

        public static EnumEntries<c> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.START_DISPATCHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.END_DISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[a.values().length];
            try {
                iArr2[a.ENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[a.EXIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public e(u0 wrapper, i iVar, a animationType) {
        p013kotlin.jvm.internal.s.k(wrapper, "wrapper");
        p013kotlin.jvm.internal.s.k(animationType, "animationType");
        this.wrapper = wrapper;
        this.eventEmitter = iVar;
        this.animationType = animationType;
        this.currentState = c.INITIALIZED;
    }

    private final void progressState() {
        c cVar;
        int i11 = d.$EnumSwitchMapping$0[this.currentState.ordinal()];
        if (i11 == 1) {
            cVar = c.START_DISPATCHED;
        } else {
            if (i11 != 2 && i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            cVar = c.END_DISPATCHED;
        }
        this.currentState = cVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animation) {
        p013kotlin.jvm.internal.s.k(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animation) {
        p013kotlin.jvm.internal.s.k(animation, "animation");
        if (this.currentState == c.START_DISPATCHED) {
            progressState();
            animation.removeListener(this);
            int i11 = d.$EnumSwitchMapping$1[this.animationType.ordinal()];
            if (i11 == 1) {
                i iVar = this.eventEmitter;
                if (iVar != null) {
                    iVar.dispatchOnAppear();
                }
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i iVar2 = this.eventEmitter;
                if (iVar2 != null) {
                    iVar2.dispatchOnDisappear();
                }
            }
            boolean z11 = this.animationType == a.EXIT;
            i iVar3 = this.eventEmitter;
            if (iVar3 != null) {
                iVar3.dispatchTransitionProgress(1.0f, z11, z11);
            }
            this.wrapper.getScreen().endRemovalTransition();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animation) {
        p013kotlin.jvm.internal.s.k(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animation) {
        p013kotlin.jvm.internal.s.k(animation, "animation");
        if (this.currentState == c.INITIALIZED) {
            progressState();
            int i11 = d.$EnumSwitchMapping$1[this.animationType.ordinal()];
            if (i11 == 1) {
                i iVar = this.eventEmitter;
                if (iVar != null) {
                    iVar.dispatchOnWillAppear();
                }
            } else {
                if (i11 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i iVar2 = this.eventEmitter;
                if (iVar2 != null) {
                    iVar2.dispatchOnWillDisappear();
                }
            }
            boolean z11 = this.animationType == a.EXIT;
            i iVar3 = this.eventEmitter;
            if (iVar3 != null) {
                iVar3.dispatchTransitionProgress(BitmapDescriptorFactory.HUE_RED, z11, z11);
            }
        }
    }
}
