package com.tesla.oapi;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlinx.coroutines.DebugKt;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/tesla/oapi/SetCabinOverheatProtectionBody;", "", "fanOnly", "", DebugKt.DEBUG_PROPERTY_VALUE_ON, "<init>", "(ZZ)V", "getFanOnly", "()Z", "getOn", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SetCabinOverheatProtectionBody {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @g(name = "fan_only")
    private final boolean fanOnly;

    @g(name = DebugKt.DEBUG_PROPERTY_VALUE_ON)
    private final boolean on;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005¨\u0006\b"}, d2 = {"Lcom/tesla/oapi/SetCabinOverheatProtectionBody$Companion;", "", "<init>", "()V", DebugKt.DEBUG_PROPERTY_VALUE_OFF, "Lcom/tesla/oapi/SetCabinOverheatProtectionBody;", "noAC", DebugKt.DEBUG_PROPERTY_VALUE_ON, "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SetCabinOverheatProtectionBody noAC() {
            return new SetCabinOverheatProtectionBody(true, true);
        }

        public final SetCabinOverheatProtectionBody off() {
            return new SetCabinOverheatProtectionBody(false, false);
        }

        public final SetCabinOverheatProtectionBody on() {
            return new SetCabinOverheatProtectionBody(false, true);
        }

        private Companion() {
        }
    }

    public SetCabinOverheatProtectionBody(boolean z11, boolean z12) {
        this.fanOnly = z11;
        this.on = z12;
    }

    public static /* synthetic */ SetCabinOverheatProtectionBody copy$default(SetCabinOverheatProtectionBody setCabinOverheatProtectionBody, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = setCabinOverheatProtectionBody.fanOnly;
        }
        if ((i11 & 2) != 0) {
            z12 = setCabinOverheatProtectionBody.on;
        }
        return setCabinOverheatProtectionBody.copy(z11, z12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getFanOnly() {
        return this.fanOnly;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getOn() {
        return this.on;
    }

    public final SetCabinOverheatProtectionBody copy(boolean fanOnly, boolean on2) {
        return new SetCabinOverheatProtectionBody(fanOnly, on2);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetCabinOverheatProtectionBody)) {
            return false;
        }
        SetCabinOverheatProtectionBody setCabinOverheatProtectionBody = (SetCabinOverheatProtectionBody) other;
        return this.fanOnly == setCabinOverheatProtectionBody.fanOnly && this.on == setCabinOverheatProtectionBody.on;
    }

    public final boolean getFanOnly() {
        return this.fanOnly;
    }

    public final boolean getOn() {
        return this.on;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.fanOnly) * 31) + Boolean.hashCode(this.on);
    }

    public String toString() {
        return "SetCabinOverheatProtectionBody(fanOnly=" + this.fanOnly + ", on=" + this.on + ")";
    }
}
