package com.fourthline.scanners.config.orca.kyc.model;

import com.fourthline.scanners.config.orca.kyc.model.serialization.CoordinateModelSerializer;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.DefaultConstructorMarker;
import p013kotlin.jvm.internal.s;
import ro0.d;
import ro0.o;
import ro0.p;
import to0.f;
import vo0.h1;
import vo0.v1;
import vo0.z1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFB\u001d\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006Bs\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0005\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J(\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R*\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010)\u0012\u0004\b-\u0010.\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010,R*\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010/\u0012\u0004\b3\u0010.\u001a\u0004\b0\u0010 \"\u0004\b1\u00102R.\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010)\u001a\u0004\b5\u0010\u001e\"\u0004\b6\u0010,R.\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010)\u001a\u0004\b7\u0010\u001e\"\u0004\b8\u0010,R.\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010)\u001a\u0004\b9\u0010\u001e\"\u0004\b:\u0010,R.\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010)\u001a\u0004\b;\u0010\u001e\"\u0004\b<\u0010,R.\u0010\r\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010)\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u0010,R.\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u00104\u001a\u0004\u0018\u00010\u00028\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010)\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u0010,R*\u0010\u0010\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;", "", "", "ipAddress", "location", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "seen0", "language", "analyticsId", "region", "model", "osVersion", "sdkVersion", "", "osCompromised", "Lvo0/v1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLvo0/v1;)V", "self", "Luo0/d;", "output", "Lto0/f;", "serialDesc", "Ljn0/h0;", "write$Self$fourthline_adapters_json_release", "(Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;Luo0/d;Lto0/f;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/Object;)Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIpAddress", "setIpAddress", "(Ljava/lang/String;)V", "getIpAddress$annotations", "()V", "Ljava/lang/Object;", "getLocation", "setLocation", "(Ljava/lang/Object;)V", "getLocation$annotations", "value", "getLanguage", "setLanguage$fourthline_adapters_json_release", "getAnalyticsId", "setAnalyticsId$fourthline_adapters_json_release", "getRegion", "setRegion$fourthline_adapters_json_release", "getModel", "setModel$fourthline_adapters_json_release", "getOsVersion", "setOsVersion$fourthline_adapters_json_release", "getSdkVersion", "setSdkVersion$fourthline_adapters_json_release", "Z", "getOsCompromised", "()Z", "setOsCompromised$fourthline_adapters_json_release", "(Z)V", "Companion", "$serializer", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@p
public final /* data */ class DeviceMetadataModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private String analyticsId;
    private String ipAddress;
    private String language;
    private Object location;
    private String model;
    private boolean osCompromised;
    private String osVersion;
    private String region;
    private String sdkVersion;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel$Companion;", "", "<init>", "()V", "Lro0/d;", "Lcom/fourthline/scanners/config/orca/kyc/model/DeviceMetadataModel;", "serializer", "()Lro0/d;", "fourthline-adapters-json_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final d<DeviceMetadataModel> serializer() {
            return DeviceMetadataModel$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DeviceMetadataModel(int i11, String str, Object obj, String str2, String str3, String str4, String str5, String str6, String str7, boolean z11, v1 v1Var) {
        if (3 != (i11 & 3)) {
            h1.b(i11, 3, DeviceMetadataModel$$serializer.INSTANCE.getDescriptor());
        }
        this.ipAddress = str;
        this.location = obj;
        if ((i11 & 4) == 0) {
            this.language = null;
        } else {
            this.language = str2;
        }
        if ((i11 & 8) == 0) {
            this.analyticsId = null;
        } else {
            this.analyticsId = str3;
        }
        if ((i11 & 16) == 0) {
            this.region = null;
        } else {
            this.region = str4;
        }
        if ((i11 & 32) == 0) {
            this.model = null;
        } else {
            this.model = str5;
        }
        if ((i11 & 64) == 0) {
            this.osVersion = null;
        } else {
            this.osVersion = str6;
        }
        if ((i11 & 128) == 0) {
            this.sdkVersion = null;
        } else {
            this.sdkVersion = str7;
        }
        if ((i11 & 256) == 0) {
            this.osCompromised = false;
        } else {
            this.osCompromised = z11;
        }
    }

    public static /* synthetic */ DeviceMetadataModel copy$default(DeviceMetadataModel deviceMetadataModel, String str, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            str = deviceMetadataModel.ipAddress;
        }
        if ((i11 & 2) != 0) {
            obj = deviceMetadataModel.location;
        }
        return deviceMetadataModel.copy(str, obj);
    }

    @o("ipAddress")
    public static /* synthetic */ void getIpAddress$annotations() {
    }

    @o("location")
    @p(with = CoordinateModelSerializer.class)
    public static /* synthetic */ void getLocation$annotations() {
    }

    public static final /* synthetic */ void write$Self$fourthline_adapters_json_release(DeviceMetadataModel self, uo0.d output, f serialDesc) {
        z1 z1Var = z1.f119730a;
        output.y(serialDesc, 0, z1Var, self.ipAddress);
        output.y(serialDesc, 1, CoordinateModelSerializer.INSTANCE, self.location);
        if (output.G(serialDesc, 2) || self.language != null) {
            output.y(serialDesc, 2, z1Var, self.language);
        }
        if (output.G(serialDesc, 3) || self.analyticsId != null) {
            output.y(serialDesc, 3, z1Var, self.analyticsId);
        }
        if (output.G(serialDesc, 4) || self.region != null) {
            output.y(serialDesc, 4, z1Var, self.region);
        }
        if (output.G(serialDesc, 5) || self.model != null) {
            output.y(serialDesc, 5, z1Var, self.model);
        }
        if (output.G(serialDesc, 6) || self.osVersion != null) {
            output.y(serialDesc, 6, z1Var, self.osVersion);
        }
        if (output.G(serialDesc, 7) || self.sdkVersion != null) {
            output.y(serialDesc, 7, z1Var, self.sdkVersion);
        }
        if (output.G(serialDesc, 8) || self.osCompromised) {
            output.A(serialDesc, 8, self.osCompromised);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getLocation() {
        return this.location;
    }

    public final DeviceMetadataModel copy(String ipAddress, Object location) {
        return new DeviceMetadataModel(ipAddress, location);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceMetadataModel)) {
            return false;
        }
        DeviceMetadataModel deviceMetadataModel = (DeviceMetadataModel) other;
        return s.f(this.ipAddress, deviceMetadataModel.ipAddress) && s.f(this.location, deviceMetadataModel.location);
    }

    public final String getAnalyticsId() {
        return this.analyticsId;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Object getLocation() {
        return this.location;
    }

    public final String getModel() {
        return this.model;
    }

    public final boolean getOsCompromised() {
        return this.osCompromised;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        String str = this.ipAddress;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.location;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final void setAnalyticsId$fourthline_adapters_json_release(String str) {
        this.analyticsId = str;
    }

    public final void setIpAddress(String str) {
        this.ipAddress = str;
    }

    public final void setLanguage$fourthline_adapters_json_release(String str) {
        this.language = str;
    }

    public final void setLocation(Object obj) {
        this.location = obj;
    }

    public final void setModel$fourthline_adapters_json_release(String str) {
        this.model = str;
    }

    public final void setOsCompromised$fourthline_adapters_json_release(boolean z11) {
        this.osCompromised = z11;
    }

    public final void setOsVersion$fourthline_adapters_json_release(String str) {
        this.osVersion = str;
    }

    public final void setRegion$fourthline_adapters_json_release(String str) {
        this.region = str;
    }

    public final void setSdkVersion$fourthline_adapters_json_release(String str) {
        this.sdkVersion = str;
    }

    public String toString() {
        return "DeviceMetadataModel(ipAddress=" + this.ipAddress + ", location=" + this.location + ")";
    }

    public DeviceMetadataModel(String str, Object obj) {
        this.ipAddress = str;
        this.location = obj;
    }
}
