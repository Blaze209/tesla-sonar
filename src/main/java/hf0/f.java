package hf0;

import expo.modules.contacts.Columns;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public enum f {
    SetVin,
    SetAccountEmail,
    ScanForPeripherals,
    ClearPeripheral,
    ResetPeripheral,
    RequestMTU,
    GetTokenForKey,
    GetStatus,
    SetConnectionBehaviorWhenUnauthorized,
    ResendDeviceInfoResponse,
    SendReportServiceRequest,
    UnlockCar,
    LockCar,
    OpenTrunk,
    OpenFrunk,
    ScanForPeripheralsResult,
    ClearPeripheralsResult,
    VehicleStatusMessage,
    VehicleEventMessage,
    NonUserFeedback,
    VehicleNfcSwipeStatusMessage,
    SetEventSubscriptionsReady,
    Register,
    Unregister,
    RegisterComplete,
    AppForegrounded,
    AppBackgrounded,
    SendJsBridgeEvent,
    NFCGetPublicKeyBytes,
    NFCGetPublicKeyBytesInfo,
    NFCEncryptWithSharedSecret,
    NFCEncryptWithSharedSecretResponse,
    NFCProtoMessage,
    SwitchProductMessage,
    SendCommandRequest,
    ReceiveCommandResponse,
    WidgetFetchStatus,
    SendSharedFleetPeripheralsScanResult,
    StartScanPeripheralsInSharedFleet,
    StopScanPeripheralsInSharedFleet,
    UpdateVehicleConnectivityState,
    PhoneKeyLog,
    UpdateBackgroundServicePermission,
    SendRoutableData,
    PhoneKeySettingChanged;

    private static final String key = "data";
    private static final Map<Integer, f> lookup = new HashMap();

    static {
        for (f fVar : EnumSet.allOf(f.class)) {
            lookup.put(Integer.valueOf(fVar.ordinal()), fVar);
        }
    }

    public static f get(int i11) {
        return lookup.get(Integer.valueOf(i11));
    }

    public static String getName(int i11) {
        String str = String.format("Unknown - [%d]", Integer.valueOf(i11));
        f fVar = get(i11);
        return fVar != null ? fVar.name() : str;
    }

    public String getKey() {
        return key;
    }

    public String getKey2() {
        return Columns.TYPE;
    }

    public int getWhat() {
        return ordinal();
    }
}
