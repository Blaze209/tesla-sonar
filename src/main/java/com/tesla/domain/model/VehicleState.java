package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import com.tesla.domain.model.adapter.ForceToInt;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u00107\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00108\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010;\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010<\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010=\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001cJ\u0010\u0010@\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010A\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010B\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010C\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010D\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010F\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u0010G\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0002\u00103Jò\u0001\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r2\n\b\u0003\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0002\u0010IJ\u0013\u0010J\u001a\u00020\u00032\b\u0010K\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010L\u001a\u00020\u0006HÖ\u0001J\t\u0010M\u001a\u00020\rHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\"\u0010 R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b#\u0010 R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b$\u0010 R\u001a\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b%\u0010 R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b&\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b)\u0010\u001cR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b*\u0010\u001cR\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b+\u0010 R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b,\u0010 R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b-\u0010 R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b.\u0010 R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010(R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b0\u0010 R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010!\u001a\u0004\b1\u0010 R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\n\n\u0002\u00104\u001a\u0004\b2\u00103¨\u0006N"}, d2 = {"Lcom/tesla/domain/model/VehicleState;", "", "locked", "", "sentryMode", "frunk", "", "trunk", "frontDriverDoor", "frontPassengerDoor", "rearDriverDoor", "rearPassengerDoor", "carVersion", "", "remoteStarted", "remoteStartSupported", "frontDriverWindow", "frontPassengerWindow", "rearDriverWindow", "rearPassengerWindow", "sunRoofState", "sunRoofPercentOpen", "apiVersion", "timestamp", "", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "getLocked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSentryMode", "getFrunk", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrunk", "getFrontDriverDoor", "getFrontPassengerDoor", "getRearDriverDoor", "getRearPassengerDoor", "getCarVersion", "()Ljava/lang/String;", "getRemoteStarted", "getRemoteStartSupported", "getFrontDriverWindow", "getFrontPassengerWindow", "getRearDriverWindow", "getRearPassengerWindow", "getSunRoofState", "getSunRoofPercentOpen", "getApiVersion", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/tesla/domain/model/VehicleState;", "equals", "other", "hashCode", "toString", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class VehicleState {

    @g(name = "api_version")
    private final Integer apiVersion;

    @g(name = "car_version")
    private final String carVersion;

    @g(name = "df")
    private final Integer frontDriverDoor;

    @g(name = "fd_window")
    private final Integer frontDriverWindow;

    @g(name = "pf")
    private final Integer frontPassengerDoor;

    @g(name = "fp_window")
    private final Integer frontPassengerWindow;

    @g(name = "ft")
    private final Integer frunk;

    @g(name = "locked")
    private final Boolean locked;

    @g(name = "dr")
    private final Integer rearDriverDoor;

    @g(name = "rd_window")
    private final Integer rearDriverWindow;

    @g(name = "pr")
    private final Integer rearPassengerDoor;

    @g(name = "rp_window")
    private final Integer rearPassengerWindow;

    @g(name = "remote_start_supported")
    private final Boolean remoteStartSupported;

    @g(name = "remote_start")
    private final Boolean remoteStarted;

    @g(name = "sentry_mode")
    private final Boolean sentryMode;

    @g(name = "sun_roof_percent_open")
    private final Integer sunRoofPercentOpen;

    @g(name = "sun_roof_state")
    private final String sunRoofState;

    @g(name = "timestamp")
    private final Long timestamp;

    @g(name = "rt")
    private final Integer trunk;

    public VehicleState(Boolean bool, Boolean bool2, @ForceToInt Integer num, @ForceToInt Integer num2, @ForceToInt Integer num3, @ForceToInt Integer num4, @ForceToInt Integer num5, @ForceToInt Integer num6, String str, Boolean bool3, Boolean bool4, @ForceToInt Integer num7, @ForceToInt Integer num8, @ForceToInt Integer num9, @ForceToInt Integer num10, String str2, @ForceToInt Integer num11, Integer num12, Long l11) {
        this.locked = bool;
        this.sentryMode = bool2;
        this.frunk = num;
        this.trunk = num2;
        this.frontDriverDoor = num3;
        this.frontPassengerDoor = num4;
        this.rearDriverDoor = num5;
        this.rearPassengerDoor = num6;
        this.carVersion = str;
        this.remoteStarted = bool3;
        this.remoteStartSupported = bool4;
        this.frontDriverWindow = num7;
        this.frontPassengerWindow = num8;
        this.rearDriverWindow = num9;
        this.rearPassengerWindow = num10;
        this.sunRoofState = str2;
        this.sunRoofPercentOpen = num11;
        this.apiVersion = num12;
        this.timestamp = l11;
    }

    public static /* synthetic */ VehicleState copy$default(VehicleState vehicleState, Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, Boolean bool3, Boolean bool4, Integer num7, Integer num8, Integer num9, Integer num10, String str2, Integer num11, Integer num12, Long l11, int i11, Object obj) {
        Long l12;
        Integer num13;
        Boolean bool5 = (i11 & 1) != 0 ? vehicleState.locked : bool;
        Boolean bool6 = (i11 & 2) != 0 ? vehicleState.sentryMode : bool2;
        Integer num14 = (i11 & 4) != 0 ? vehicleState.frunk : num;
        Integer num15 = (i11 & 8) != 0 ? vehicleState.trunk : num2;
        Integer num16 = (i11 & 16) != 0 ? vehicleState.frontDriverDoor : num3;
        Integer num17 = (i11 & 32) != 0 ? vehicleState.frontPassengerDoor : num4;
        Integer num18 = (i11 & 64) != 0 ? vehicleState.rearDriverDoor : num5;
        Integer num19 = (i11 & 128) != 0 ? vehicleState.rearPassengerDoor : num6;
        String str3 = (i11 & 256) != 0 ? vehicleState.carVersion : str;
        Boolean bool7 = (i11 & 512) != 0 ? vehicleState.remoteStarted : bool3;
        Boolean bool8 = (i11 & 1024) != 0 ? vehicleState.remoteStartSupported : bool4;
        Integer num20 = (i11 & 2048) != 0 ? vehicleState.frontDriverWindow : num7;
        Integer num21 = (i11 & 4096) != 0 ? vehicleState.frontPassengerWindow : num8;
        Integer num22 = (i11 & PKIFailureInfo.certRevoked) != 0 ? vehicleState.rearDriverWindow : num9;
        Boolean bool9 = bool5;
        Integer num23 = (i11 & 16384) != 0 ? vehicleState.rearPassengerWindow : num10;
        String str4 = (i11 & 32768) != 0 ? vehicleState.sunRoofState : str2;
        Integer num24 = (i11 & 65536) != 0 ? vehicleState.sunRoofPercentOpen : num11;
        Integer num25 = (i11 & 131072) != 0 ? vehicleState.apiVersion : num12;
        if ((i11 & 262144) != 0) {
            num13 = num25;
            l12 = vehicleState.timestamp;
        } else {
            l12 = l11;
            num13 = num25;
        }
        return vehicleState.copy(bool9, bool6, num14, num15, num16, num17, num18, num19, str3, bool7, bool8, num20, num21, num22, num23, str4, num24, num13, l12);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getLocked() {
        return this.locked;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getRemoteStarted() {
        return this.remoteStarted;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getRemoteStartSupported() {
        return this.remoteStartSupported;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Integer getFrontDriverWindow() {
        return this.frontDriverWindow;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getFrontPassengerWindow() {
        return this.frontPassengerWindow;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Integer getRearDriverWindow() {
        return this.rearDriverWindow;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getRearPassengerWindow() {
        return this.rearPassengerWindow;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getSunRoofState() {
        return this.sunRoofState;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final Integer getSunRoofPercentOpen() {
        return this.sunRoofPercentOpen;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final Integer getApiVersion() {
        return this.apiVersion;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getSentryMode() {
        return this.sentryMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getFrunk() {
        return this.frunk;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getTrunk() {
        return this.trunk;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getFrontDriverDoor() {
        return this.frontDriverDoor;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getFrontPassengerDoor() {
        return this.frontPassengerDoor;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getRearDriverDoor() {
        return this.rearDriverDoor;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getRearPassengerDoor() {
        return this.rearPassengerDoor;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getCarVersion() {
        return this.carVersion;
    }

    public final VehicleState copy(Boolean locked, Boolean sentryMode, @ForceToInt Integer frunk, @ForceToInt Integer trunk, @ForceToInt Integer frontDriverDoor, @ForceToInt Integer frontPassengerDoor, @ForceToInt Integer rearDriverDoor, @ForceToInt Integer rearPassengerDoor, String carVersion, Boolean remoteStarted, Boolean remoteStartSupported, @ForceToInt Integer frontDriverWindow, @ForceToInt Integer frontPassengerWindow, @ForceToInt Integer rearDriverWindow, @ForceToInt Integer rearPassengerWindow, String sunRoofState, @ForceToInt Integer sunRoofPercentOpen, Integer apiVersion, Long timestamp) {
        return new VehicleState(locked, sentryMode, frunk, trunk, frontDriverDoor, frontPassengerDoor, rearDriverDoor, rearPassengerDoor, carVersion, remoteStarted, remoteStartSupported, frontDriverWindow, frontPassengerWindow, rearDriverWindow, rearPassengerWindow, sunRoofState, sunRoofPercentOpen, apiVersion, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleState)) {
            return false;
        }
        VehicleState vehicleState = (VehicleState) other;
        return s.f(this.locked, vehicleState.locked) && s.f(this.sentryMode, vehicleState.sentryMode) && s.f(this.frunk, vehicleState.frunk) && s.f(this.trunk, vehicleState.trunk) && s.f(this.frontDriverDoor, vehicleState.frontDriverDoor) && s.f(this.frontPassengerDoor, vehicleState.frontPassengerDoor) && s.f(this.rearDriverDoor, vehicleState.rearDriverDoor) && s.f(this.rearPassengerDoor, vehicleState.rearPassengerDoor) && s.f(this.carVersion, vehicleState.carVersion) && s.f(this.remoteStarted, vehicleState.remoteStarted) && s.f(this.remoteStartSupported, vehicleState.remoteStartSupported) && s.f(this.frontDriverWindow, vehicleState.frontDriverWindow) && s.f(this.frontPassengerWindow, vehicleState.frontPassengerWindow) && s.f(this.rearDriverWindow, vehicleState.rearDriverWindow) && s.f(this.rearPassengerWindow, vehicleState.rearPassengerWindow) && s.f(this.sunRoofState, vehicleState.sunRoofState) && s.f(this.sunRoofPercentOpen, vehicleState.sunRoofPercentOpen) && s.f(this.apiVersion, vehicleState.apiVersion) && s.f(this.timestamp, vehicleState.timestamp);
    }

    public final Integer getApiVersion() {
        return this.apiVersion;
    }

    public final String getCarVersion() {
        return this.carVersion;
    }

    public final Integer getFrontDriverDoor() {
        return this.frontDriverDoor;
    }

    public final Integer getFrontDriverWindow() {
        return this.frontDriverWindow;
    }

    public final Integer getFrontPassengerDoor() {
        return this.frontPassengerDoor;
    }

    public final Integer getFrontPassengerWindow() {
        return this.frontPassengerWindow;
    }

    public final Integer getFrunk() {
        return this.frunk;
    }

    public final Boolean getLocked() {
        return this.locked;
    }

    public final Integer getRearDriverDoor() {
        return this.rearDriverDoor;
    }

    public final Integer getRearDriverWindow() {
        return this.rearDriverWindow;
    }

    public final Integer getRearPassengerDoor() {
        return this.rearPassengerDoor;
    }

    public final Integer getRearPassengerWindow() {
        return this.rearPassengerWindow;
    }

    public final Boolean getRemoteStartSupported() {
        return this.remoteStartSupported;
    }

    public final Boolean getRemoteStarted() {
        return this.remoteStarted;
    }

    public final Boolean getSentryMode() {
        return this.sentryMode;
    }

    public final Integer getSunRoofPercentOpen() {
        return this.sunRoofPercentOpen;
    }

    public final String getSunRoofState() {
        return this.sunRoofState;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final Integer getTrunk() {
        return this.trunk;
    }

    public int hashCode() {
        Boolean bool = this.locked;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.sentryMode;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.frunk;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.trunk;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.frontDriverDoor;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.frontPassengerDoor;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.rearDriverDoor;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.rearPassengerDoor;
        int iHashCode8 = (iHashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str = this.carVersion;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.remoteStarted;
        int iHashCode10 = (iHashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.remoteStartSupported;
        int iHashCode11 = (iHashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num7 = this.frontDriverWindow;
        int iHashCode12 = (iHashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.frontPassengerWindow;
        int iHashCode13 = (iHashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.rearDriverWindow;
        int iHashCode14 = (iHashCode13 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.rearPassengerWindow;
        int iHashCode15 = (iHashCode14 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str2 = this.sunRoofState;
        int iHashCode16 = (iHashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num11 = this.sunRoofPercentOpen;
        int iHashCode17 = (iHashCode16 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.apiVersion;
        int iHashCode18 = (iHashCode17 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Long l11 = this.timestamp;
        return iHashCode18 + (l11 != null ? l11.hashCode() : 0);
    }

    public String toString() {
        return "VehicleState(locked=" + this.locked + ", sentryMode=" + this.sentryMode + ", frunk=" + this.frunk + ", trunk=" + this.trunk + ", frontDriverDoor=" + this.frontDriverDoor + ", frontPassengerDoor=" + this.frontPassengerDoor + ", rearDriverDoor=" + this.rearDriverDoor + ", rearPassengerDoor=" + this.rearPassengerDoor + ", carVersion=" + this.carVersion + ", remoteStarted=" + this.remoteStarted + ", remoteStartSupported=" + this.remoteStartSupported + ", frontDriverWindow=" + this.frontDriverWindow + ", frontPassengerWindow=" + this.frontPassengerWindow + ", rearDriverWindow=" + this.rearDriverWindow + ", rearPassengerWindow=" + this.rearPassengerWindow + ", sunRoofState=" + this.sunRoofState + ", sunRoofPercentOpen=" + this.sunRoofPercentOpen + ", apiVersion=" + this.apiVersion + ", timestamp=" + this.timestamp + ")";
    }

    public /* synthetic */ VehicleState(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, Boolean bool3, Boolean bool4, Integer num7, Integer num8, Integer num9, Integer num10, String str2, Integer num11, Integer num12, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, bool2, num, num2, (i11 & 16) != 0 ? null : num3, (i11 & 32) != 0 ? null : num4, (i11 & 64) != 0 ? null : num5, (i11 & 128) != 0 ? null : num6, (i11 & 256) != 0 ? null : str, (i11 & 512) != 0 ? null : bool3, (i11 & 1024) != 0 ? null : bool4, (i11 & 2048) != 0 ? null : num7, (i11 & 4096) != 0 ? null : num8, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : num9, (i11 & 16384) != 0 ? null : num10, (32768 & i11) != 0 ? null : str2, (65536 & i11) != 0 ? null : num11, (131072 & i11) != 0 ? null : num12, (i11 & 262144) != 0 ? null : l11);
    }
}
