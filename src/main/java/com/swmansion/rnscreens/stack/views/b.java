package com.swmansion.rnscreens.stack.views;

import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b \u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000b\"\u0004\b\u000e\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/swmansion/rnscreens/stack/views/b;", "Lcom/swmansion/rnscreens/stack/views/a;", "", "enabled", "<init>", "(Z)V", "Ljn0/h0;", "enable", "()V", "disable", "isEnabled", "()Z", "Z", "getEnabled", "setEnabled", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class b implements a {
    private boolean enabled;

    public b() {
        this(false, 1, null);
    }

    @Override // com.swmansion.rnscreens.stack.views.a
    public abstract /* synthetic */ void apply(List list);

    @Override // com.swmansion.rnscreens.stack.views.a
    public void disable() {
        this.enabled = false;
    }

    @Override // com.swmansion.rnscreens.stack.views.a
    public void enable() {
        this.enabled = true;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // com.swmansion.rnscreens.stack.views.a
    public boolean isEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z11) {
        this.enabled = z11;
    }

    public b(boolean z11) {
        this.enabled = z11;
    }

    public /* synthetic */ b(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}
