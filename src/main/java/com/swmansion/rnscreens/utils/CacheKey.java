package com.swmansion.rnscreens.utils;

import com.fourthline.adapters.serialization.OrcaFlavourKeys;
import p013kotlin.Metadata;

/* JADX INFO: renamed from: com.swmansion.rnscreens.utils.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\tJ\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/swmansion/rnscreens/utils/b;", "", "", OrcaFlavourKeys.FONT_SIZE, "", "isTitleEmpty", "<init>", "(IZ)V", "component1", "()I", "component2", "()Z", "copy", "(IZ)Lcom/swmansion/rnscreens/utils/b;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getFontSize", "Z", "react-native-screens_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class CacheKey {
    private final int fontSize;
    private final boolean isTitleEmpty;

    public CacheKey(int i11, boolean z11) {
        this.fontSize = i11;
        this.isTitleEmpty = z11;
    }

    public static /* synthetic */ CacheKey copy$default(CacheKey cacheKey, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = cacheKey.fontSize;
        }
        if ((i12 & 2) != 0) {
            z11 = cacheKey.isTitleEmpty;
        }
        return cacheKey.copy(i11, z11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsTitleEmpty() {
        return this.isTitleEmpty;
    }

    public final CacheKey copy(int fontSize, boolean isTitleEmpty) {
        return new CacheKey(fontSize, isTitleEmpty);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheKey)) {
            return false;
        }
        CacheKey cacheKey = (CacheKey) other;
        return this.fontSize == cacheKey.fontSize && this.isTitleEmpty == cacheKey.isTitleEmpty;
    }

    public final int getFontSize() {
        return this.fontSize;
    }

    public int hashCode() {
        return (Integer.hashCode(this.fontSize) * 31) + Boolean.hashCode(this.isTitleEmpty);
    }

    public final boolean isTitleEmpty() {
        return this.isTitleEmpty;
    }

    public String toString() {
        return "CacheKey(fontSize=" + this.fontSize + ", isTitleEmpty=" + this.isTitleEmpty + ")";
    }
}
