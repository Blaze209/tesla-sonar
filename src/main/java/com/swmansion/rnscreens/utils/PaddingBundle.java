package com.swmansion.rnscreens.utils;

import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ezvcard.property.Gender;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: com.swmansion.rnscreens.utils.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/swmansion/rnscreens/utils/f;", "", "", Snapshot.HEIGHT, "paddingStart", "paddingEnd", "<init>", "(FFF)V", "component1", "()F", "component2", "component3", "copy", "(FFF)Lcom/swmansion/rnscreens/utils/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", Gender.FEMALE, "getHeight", "getPaddingStart", "getPaddingEnd", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PaddingBundle {
    private final float height;
    private final float paddingEnd;
    private final float paddingStart;

    public PaddingBundle(float f11, float f12, float f13) {
        this.height = f11;
        this.paddingStart = f12;
        this.paddingEnd = f13;
    }

    public static /* synthetic */ PaddingBundle copy$default(PaddingBundle paddingBundle, float f11, float f12, float f13, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = paddingBundle.height;
        }
        if ((i11 & 2) != 0) {
            f12 = paddingBundle.paddingStart;
        }
        if ((i11 & 4) != 0) {
            f13 = paddingBundle.paddingEnd;
        }
        return paddingBundle.copy(f11, f12, f13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getPaddingStart() {
        return this.paddingStart;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getPaddingEnd() {
        return this.paddingEnd;
    }

    public final PaddingBundle copy(float height, float paddingStart, float paddingEnd) {
        return new PaddingBundle(height, paddingStart, paddingEnd);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaddingBundle)) {
            return false;
        }
        PaddingBundle paddingBundle = (PaddingBundle) other;
        return Float.compare(this.height, paddingBundle.height) == 0 && Float.compare(this.paddingStart, paddingBundle.paddingStart) == 0 && Float.compare(this.paddingEnd, paddingBundle.paddingEnd) == 0;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getPaddingEnd() {
        return this.paddingEnd;
    }

    public final float getPaddingStart() {
        return this.paddingStart;
    }

    public int hashCode() {
        return (((Float.hashCode(this.height) * 31) + Float.hashCode(this.paddingStart)) * 31) + Float.hashCode(this.paddingEnd);
    }

    public String toString() {
        return "PaddingBundle(height=" + this.height + ", paddingStart=" + this.paddingStart + ", paddingEnd=" + this.paddingEnd + ")";
    }
}
