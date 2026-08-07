package f10;

import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: f10.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0015\u0010\u000eR\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lf10/l;", "", "", "persistentInsetTypes", "deferredInsetTypes", "dispatchMode", "", "hasTranslucentNavigationBar", "<init>", "(IIIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", DateTokenConverter.CONVERTER_KEY, "b", "c", "Z", "()Z", "e", "(Z)V", "react-native-keyboard-controller_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class KeyboardAnimationCallbackConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int persistentInsetTypes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int deferredInsetTypes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int dispatchMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean hasTranslucentNavigationBar;

    public KeyboardAnimationCallbackConfig(int i11, int i12, int i13, boolean z11) {
        this.persistentInsetTypes = i11;
        this.deferredInsetTypes = i12;
        this.dispatchMode = i13;
        this.hasTranslucentNavigationBar = z11;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getDeferredInsetTypes() {
        return this.deferredInsetTypes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getDispatchMode() {
        return this.dispatchMode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getHasTranslucentNavigationBar() {
        return this.hasTranslucentNavigationBar;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPersistentInsetTypes() {
        return this.persistentInsetTypes;
    }

    public final void e(boolean z11) {
        this.hasTranslucentNavigationBar = z11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KeyboardAnimationCallbackConfig)) {
            return false;
        }
        KeyboardAnimationCallbackConfig keyboardAnimationCallbackConfig = (KeyboardAnimationCallbackConfig) other;
        return this.persistentInsetTypes == keyboardAnimationCallbackConfig.persistentInsetTypes && this.deferredInsetTypes == keyboardAnimationCallbackConfig.deferredInsetTypes && this.dispatchMode == keyboardAnimationCallbackConfig.dispatchMode && this.hasTranslucentNavigationBar == keyboardAnimationCallbackConfig.hasTranslucentNavigationBar;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.persistentInsetTypes) * 31) + Integer.hashCode(this.deferredInsetTypes)) * 31) + Integer.hashCode(this.dispatchMode)) * 31) + Boolean.hashCode(this.hasTranslucentNavigationBar);
    }

    public String toString() {
        return "KeyboardAnimationCallbackConfig(persistentInsetTypes=" + this.persistentInsetTypes + ", deferredInsetTypes=" + this.deferredInsetTypes + ", dispatchMode=" + this.dispatchMode + ", hasTranslucentNavigationBar=" + this.hasTranslucentNavigationBar + ")";
    }
}
