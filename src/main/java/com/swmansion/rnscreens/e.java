package com.swmansion.rnscreens;

import android.content.Context;
import android.view.ViewGroup;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.swmansion.rnscreens.utils.PaddingBundle;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J-\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\rR\u0016\u0010\u0013\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/swmansion/rnscreens/e;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", Snapshot.WIDTH, Snapshot.HEIGHT, "paddingStart", "paddingEnd", "Ljn0/h0;", "updateState", "(IIII)V", "Lcom/facebook/react/uimanager/u0;", "wrapper", "setStateWrapper", "(Lcom/facebook/react/uimanager/u0;)V", "updateHeaderConfigState", "lastPaddingStart", "I", "lastPaddingEnd", "lastHeight", "Companion", "a", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class e extends ViewGroup {
    private static final double DELTA = 0.9d;
    private int lastHeight;
    private int lastPaddingEnd;
    private int lastPaddingStart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        p013kotlin.jvm.internal.s.k(context, "context");
    }

    private final void updateState(int width, int height, int paddingStart, int paddingEnd) {
        if (Math.abs(this.lastPaddingStart - paddingStart) >= DELTA || Math.abs(this.lastPaddingEnd - paddingEnd) >= DELTA || Math.abs(this.lastHeight - height) >= DELTA) {
            this.lastPaddingStart = paddingStart;
            this.lastPaddingEnd = paddingEnd;
            this.lastHeight = height;
            Context context = getContext();
            ReactContext reactContext = context instanceof ReactContext ? (ReactContext) context : null;
            UIManagerModule uIManagerModule = reactContext != null ? (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class) : null;
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), new PaddingBundle(height, paddingStart, paddingEnd));
            }
        }
    }

    public final void setStateWrapper(com.facebook.react.uimanager.u0 wrapper) {
    }

    public final void updateHeaderConfigState(int width, int height, int paddingStart, int paddingEnd) {
        updateState(width, height, paddingStart, paddingEnd);
    }
}
