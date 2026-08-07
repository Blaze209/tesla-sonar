package com.tesla.domain.model;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.rolling.helper.DateTokenConverter;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.r;
import com.squareup.moshi.u;
import com.squareup.moshi.y;
import expo.modules.contacts.Columns;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.collections.d1;
import p013kotlin.jvm.internal.s;
import v20.c;

/* JADX INFO: renamed from: com.tesla.domain.model.VehicleJsonAdapter, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0017R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0017R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0017R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0017R\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0017R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u0017R\u001c\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0017R\"\u00103\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u000201\u0018\u0001000\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0017R\u001c\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0017¨\u00067"}, d2 = {"Lcom/tesla/domain/model/VehicleJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/tesla/domain/model/Vehicle;", "Lcom/squareup/moshi/u;", "moshi", "<init>", "(Lcom/squareup/moshi/u;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/tesla/domain/model/Vehicle;", "Lcom/squareup/moshi/r;", "writer", "value_", "Ljn0/h0;", "b", "(Lcom/squareup/moshi/r;Lcom/tesla/domain/model/Vehicle;)V", "Lcom/squareup/moshi/k$b;", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/h;", "stringAdapter", "", "c", "nullableIntAdapter", "Lcom/tesla/domain/model/VehicleConfig;", DateTokenConverter.CONVERTER_KEY, "nullableVehicleConfigAdapter", "e", "nullableStringAdapter", "Lcom/tesla/domain/model/ChargeState;", "f", "nullableChargeStateAdapter", "Lcom/tesla/domain/model/VehicleState;", "g", "nullableVehicleStateAdapter", "Lcom/tesla/domain/model/GuiSettings;", "h", "nullableGuiSettingsAdapter", "Lcom/tesla/domain/model/DriveState;", IntegerTokenConverter.CONVERTER_KEY, "nullableDriveStateAdapter", "Lcom/tesla/domain/model/ClimateState;", "j", "nullableClimateStateAdapter", "", "Lcom/tesla/domain/model/ReverseGeocodedObject;", "k", "nullableListOfReverseGeocodedObjectAdapter", "", "l", "nullableBooleanAdapter", "domain_globalPlayRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GeneratedJsonAdapter extends h<Vehicle> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k.b options;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h<String> stringAdapter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h<Integer> nullableIntAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final h<VehicleConfig> nullableVehicleConfigAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h<String> nullableStringAdapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final h<ChargeState> nullableChargeStateAdapter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h<VehicleState> nullableVehicleStateAdapter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final h<GuiSettings> nullableGuiSettingsAdapter;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final h<DriveState> nullableDriveStateAdapter;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final h<ClimateState> nullableClimateStateAdapter;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h<List<ReverseGeocodedObject>> nullableListOfReverseGeocodedObjectAdapter;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final h<Boolean> nullableBooleanAdapter;

    public GeneratedJsonAdapter(u moshi) {
        s.k(moshi, "moshi");
        k.b bVarA = k.b.a("vin", "id", "api_version", "vehicle_config", "snapshotConfigHash", Columns.DISPLAY_NAME, "charge_state", "vehicle_state", "gui_settings", "drive_state", "climate_state", "reverse_geocoded_object", "is_predelivery");
        s.j(bVarA, "of(...)");
        this.options = bVarA;
        h<String> hVarF = moshi.f(String.class, d1.d(), "vin");
        s.j(hVarF, "adapter(...)");
        this.stringAdapter = hVarF;
        h<Integer> hVarF2 = moshi.f(Integer.class, d1.d(), "apiVersion");
        s.j(hVarF2, "adapter(...)");
        this.nullableIntAdapter = hVarF2;
        h<VehicleConfig> hVarF3 = moshi.f(VehicleConfig.class, d1.d(), "config");
        s.j(hVarF3, "adapter(...)");
        this.nullableVehicleConfigAdapter = hVarF3;
        h<String> hVarF4 = moshi.f(String.class, d1.d(), "snapshotConfigHash");
        s.j(hVarF4, "adapter(...)");
        this.nullableStringAdapter = hVarF4;
        h<ChargeState> hVarF5 = moshi.f(ChargeState.class, d1.d(), "chargeState");
        s.j(hVarF5, "adapter(...)");
        this.nullableChargeStateAdapter = hVarF5;
        h<VehicleState> hVarF6 = moshi.f(VehicleState.class, d1.d(), "vehicleState");
        s.j(hVarF6, "adapter(...)");
        this.nullableVehicleStateAdapter = hVarF6;
        h<GuiSettings> hVarF7 = moshi.f(GuiSettings.class, d1.d(), "guiSettings");
        s.j(hVarF7, "adapter(...)");
        this.nullableGuiSettingsAdapter = hVarF7;
        h<DriveState> hVarF8 = moshi.f(DriveState.class, d1.d(), "driveState");
        s.j(hVarF8, "adapter(...)");
        this.nullableDriveStateAdapter = hVarF8;
        h<ClimateState> hVarF9 = moshi.f(ClimateState.class, d1.d(), "climateState");
        s.j(hVarF9, "adapter(...)");
        this.nullableClimateStateAdapter = hVarF9;
        h<List<ReverseGeocodedObject>> hVarF10 = moshi.f(y.j(List.class, ReverseGeocodedObject.class), d1.d(), "reverseGeocodedObject");
        s.j(hVarF10, "adapter(...)");
        this.nullableListOfReverseGeocodedObjectAdapter = hVarF10;
        h<Boolean> hVarF11 = moshi.f(Boolean.class, d1.d(), "isPreDelivery");
        s.j(hVarF11, "adapter(...)");
        this.nullableBooleanAdapter = hVarF11;
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Vehicle fromJson(k reader) {
        s.k(reader, "reader");
        reader.h();
        String strFromJson = null;
        String strFromJson2 = null;
        Integer numFromJson = null;
        VehicleConfig vehicleConfigFromJson = null;
        String strFromJson3 = null;
        String strFromJson4 = null;
        ChargeState chargeStateFromJson = null;
        VehicleState vehicleStateFromJson = null;
        GuiSettings guiSettingsFromJson = null;
        DriveState driveStateFromJson = null;
        ClimateState climateStateFromJson = null;
        List<ReverseGeocodedObject> listFromJson = null;
        Boolean boolFromJson = null;
        while (reader.hasNext()) {
            String str = strFromJson;
            switch (reader.T(this.options)) {
                case -1:
                    reader.e0();
                    reader.F();
                    break;
                case 0:
                    strFromJson = this.stringAdapter.fromJson(reader);
                    if (strFromJson == null) {
                        throw c.x("vin", "vin", reader);
                    }
                    continue;
                    break;
                case 1:
                    strFromJson2 = this.stringAdapter.fromJson(reader);
                    if (strFromJson2 == null) {
                        throw c.x("id", "id", reader);
                    }
                    break;
                case 2:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 3:
                    vehicleConfigFromJson = this.nullableVehicleConfigAdapter.fromJson(reader);
                    break;
                case 4:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    chargeStateFromJson = this.nullableChargeStateAdapter.fromJson(reader);
                    break;
                case 7:
                    vehicleStateFromJson = this.nullableVehicleStateAdapter.fromJson(reader);
                    break;
                case 8:
                    guiSettingsFromJson = this.nullableGuiSettingsAdapter.fromJson(reader);
                    break;
                case 9:
                    driveStateFromJson = this.nullableDriveStateAdapter.fromJson(reader);
                    break;
                case 10:
                    climateStateFromJson = this.nullableClimateStateAdapter.fromJson(reader);
                    break;
                case 11:
                    listFromJson = this.nullableListOfReverseGeocodedObjectAdapter.fromJson(reader);
                    break;
                case 12:
                    boolFromJson = this.nullableBooleanAdapter.fromJson(reader);
                    break;
            }
            strFromJson = str;
        }
        String str2 = strFromJson;
        reader.j();
        if (str2 == null) {
            throw c.o("vin", "vin", reader);
        }
        if (strFromJson2 != null) {
            return new Vehicle(str2, strFromJson2, numFromJson, vehicleConfigFromJson, strFromJson3, strFromJson4, chargeStateFromJson, vehicleStateFromJson, guiSettingsFromJson, driveStateFromJson, climateStateFromJson, listFromJson, boolFromJson);
        }
        throw c.o("id", "id", reader);
    }

    @Override // com.squareup.moshi.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(r writer, Vehicle value_) {
        s.k(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.o();
        writer.b0("vin");
        this.stringAdapter.toJson(writer, value_.getVin());
        writer.b0("id");
        this.stringAdapter.toJson(writer, value_.getId());
        writer.b0("api_version");
        this.nullableIntAdapter.toJson(writer, value_.getApiVersion());
        writer.b0("vehicle_config");
        this.nullableVehicleConfigAdapter.toJson(writer, value_.getConfig());
        writer.b0("snapshotConfigHash");
        this.nullableStringAdapter.toJson(writer, value_.getSnapshotConfigHash());
        writer.b0(Columns.DISPLAY_NAME);
        this.nullableStringAdapter.toJson(writer, value_.getDisplayName());
        writer.b0("charge_state");
        this.nullableChargeStateAdapter.toJson(writer, value_.getChargeState());
        writer.b0("vehicle_state");
        this.nullableVehicleStateAdapter.toJson(writer, value_.getVehicleState());
        writer.b0("gui_settings");
        this.nullableGuiSettingsAdapter.toJson(writer, value_.getGuiSettings());
        writer.b0("drive_state");
        this.nullableDriveStateAdapter.toJson(writer, value_.getDriveState());
        writer.b0("climate_state");
        this.nullableClimateStateAdapter.toJson(writer, value_.getClimateState());
        writer.b0("reverse_geocoded_object");
        this.nullableListOfReverseGeocodedObjectAdapter.toJson(writer, value_.getReverseGeocodedObject());
        writer.b0("is_predelivery");
        this.nullableBooleanAdapter.toJson(writer, value_.isPreDelivery());
        writer.C();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("Vehicle");
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        String string = sb2.toString();
        s.j(string, "toString(...)");
        return string;
    }
}
