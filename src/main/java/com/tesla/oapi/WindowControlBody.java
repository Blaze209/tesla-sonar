package com.tesla.oapi;

import com.fourthline.adapters.serialization.OrcaKeys;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes8.dex */
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/tesla/oapi/WindowControlBody;", "", OrcaKeys.LATITUDE, "", OrcaKeys.LONGITUDE, "command", "Lcom/tesla/oapi/WindowControlCommand;", "<init>", "(FFLcom/tesla/oapi/WindowControlCommand;)V", "getLatitude", "()F", "getLongitude", "getCommand", "()Lcom/tesla/oapi/WindowControlCommand;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "oapi_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WindowControlBody {

    @g(name = "command")
    private final WindowControlCommand command;

    @g(name = "lat")
    private final float latitude;

    @g(name = "long")
    private final float longitude;

    public WindowControlBody(float f11, float f12, WindowControlCommand command) {
        s.k(command, "command");
        this.latitude = f11;
        this.longitude = f12;
        this.command = command;
    }

    public static /* synthetic */ WindowControlBody copy$default(WindowControlBody windowControlBody, float f11, float f12, WindowControlCommand windowControlCommand, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = windowControlBody.latitude;
        }
        if ((i11 & 2) != 0) {
            f12 = windowControlBody.longitude;
        }
        if ((i11 & 4) != 0) {
            windowControlCommand = windowControlBody.command;
        }
        return windowControlBody.copy(f11, f12, windowControlCommand);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getLatitude() {
        return this.latitude;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getLongitude() {
        return this.longitude;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WindowControlCommand getCommand() {
        return this.command;
    }

    public final WindowControlBody copy(float latitude, float longitude, WindowControlCommand command) {
        s.k(command, "command");
        return new WindowControlBody(latitude, longitude, command);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WindowControlBody)) {
            return false;
        }
        WindowControlBody windowControlBody = (WindowControlBody) other;
        return Float.compare(this.latitude, windowControlBody.latitude) == 0 && Float.compare(this.longitude, windowControlBody.longitude) == 0 && this.command == windowControlBody.command;
    }

    public final WindowControlCommand getCommand() {
        return this.command;
    }

    public final float getLatitude() {
        return this.latitude;
    }

    public final float getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        return (((Float.hashCode(this.latitude) * 31) + Float.hashCode(this.longitude)) * 31) + this.command.hashCode();
    }

    public String toString() {
        return "WindowControlBody(latitude=" + this.latitude + ", longitude=" + this.longitude + ", command=" + this.command + ")";
    }
}
