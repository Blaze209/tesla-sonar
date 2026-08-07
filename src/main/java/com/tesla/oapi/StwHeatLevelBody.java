package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/tesla/oapi/StwHeatLevelBody;", "", "level", "Lcom/tesla/oapi/StwHeatLevel;", "<init>", "(Lcom/tesla/oapi/StwHeatLevel;)V", "getLevel", "()Lcom/tesla/oapi/StwHeatLevel;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class StwHeatLevelBody {

    @g(name = "level")
    private final StwHeatLevel level;

    public StwHeatLevelBody(StwHeatLevel level) {
        s.k(level, "level");
        this.level = level;
    }

    public static /* synthetic */ StwHeatLevelBody copy$default(StwHeatLevelBody stwHeatLevelBody, StwHeatLevel stwHeatLevel, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            stwHeatLevel = stwHeatLevelBody.level;
        }
        return stwHeatLevelBody.copy(stwHeatLevel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final StwHeatLevel getLevel() {
        return this.level;
    }

    public final StwHeatLevelBody copy(StwHeatLevel level) {
        s.k(level, "level");
        return new StwHeatLevelBody(level);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof StwHeatLevelBody) && this.level == ((StwHeatLevelBody) other).level;
    }

    public final StwHeatLevel getLevel() {
        return this.level;
    }

    public int hashCode() {
        return this.level.hashCode();
    }

    public String toString() {
        return "StwHeatLevelBody(level=" + this.level + ")";
    }
}
