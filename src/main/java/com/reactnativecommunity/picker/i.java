package com.reactnativecommunity.picker;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48519a;

    public i(int i11) {
        this.f48519a = i11;
    }

    public int a() {
        return this.f48519a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f48519a == ((i) obj).f48519a;
    }

    public int hashCode() {
        return this.f48519a + 31;
    }

    public String toString() {
        return "RectPickerLocalData{height=" + this.f48519a + CoreConstants.CURLY_RIGHT;
    }
}
