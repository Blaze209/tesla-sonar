package com.tesla.oapi;

import com.tesla.logging.TeslaLog;
import fc0.g5;
import fc0.i2;
import fc0.l1;
import fc0.p1;
import fc0.r;
import fc0.z;
import gc0.v;
import ic0.k;
import ic0.l;
import ic0.o;
import ic0.p;
import ie0.i0;
import ie0.n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p013kotlin.Metadata;
import p013kotlin.NoWhenBranchMatchedException;
import p013kotlin.jvm.internal.s;
import vc0.a1;
import vc0.b1;
import vc0.e0;
import vc0.f0;
import vc0.f1;
import vc0.i;
import vc0.n3;
import vc0.o2;
import vc0.r0;
import vc0.r1;
import vc0.t;
import vc0.v0;
import vc0.v1;
import vc0.v2;
import vc0.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\t\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\f\u001a\u00020\u0004*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u0004*\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\r\u001a#\u0010\u0012\u001a\u00020\u00012\u0012\u0010\u0011\u001a\u000e\u0012\u0006\b\u0001\u0012\u00020\u0010\u0012\u0002\b\u00030\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\"\u0015\u0010\u0015\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0003\"\u0015\u0010\u0018\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010\u001e\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0017\"\u0015\u0010\u001f\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017\"\u0015\u0010 \u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b \u0010\u0017\"\u0015\u0010!\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017\"\u0015\u0010\"\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017\"\u0015\u0010#\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b#\u0010\u0017\"\u0017\u0010&\u001a\u0004\u0018\u00010\u0007*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0017\u0010(\u001a\u0004\u0018\u00010\u0007*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b'\u0010%\"\u0015\u0010)\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0003\"\u0017\u0010+\u001a\u0004\u0018\u00010\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b*\u0010\u0003\"\u0017\u0010-\u001a\u0004\u0018\u00010\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b,\u0010\u0003\"\u0015\u0010/\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b.\u0010\u0017\"\u0017\u00101\u001a\u0004\u0018\u00010\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b0\u0010\u0003\"\u0015\u00103\u001a\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b2\u0010\u0017\"\u0015\u0010\u0015\u001a\u00020\u0001*\u0002048F¢\u0006\u0006\u001a\u0004\b\u0014\u00105\"\u0015\u0010\u0015\u001a\u00020\u0001*\u0002068F¢\u0006\u0006\u001a\u0004\b\u0014\u00107\"\u0015\u0010;\u001a\u00020\u0001*\u0002088F¢\u0006\u0006\u001a\u0004\b9\u0010:\"\u001b\u0010>\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006*\u0002088F¢\u0006\u0006\u001a\u0004\b<\u0010=\"\u0015\u0010)\u001a\u00020\u0001*\u00020?8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010@\"\u0015\u0010/\u001a\u00020\u0004*\u00020?8F¢\u0006\u0006\u001a\u0004\b.\u0010A\"\u0015\u0010)\u001a\u00020\u0001*\u00020B8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010C\"\u0015\u0010)\u001a\u00020\u0001*\u00020D8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010E\"\u0015\u0010/\u001a\u00020\u0004*\u00020F8F¢\u0006\u0006\u001a\u0004\b.\u0010G\"\u0015\u0010/\u001a\u00020\u0004*\u00020H8F¢\u0006\u0006\u001a\u0004\b.\u0010I\"\u0015\u0010)\u001a\u00020\u0001*\u00020H8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010J\"\u0015\u0010)\u001a\u00020\u0001*\u00020K8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010L\"\u0015\u0010/\u001a\u00020\u0004*\u00020K8F¢\u0006\u0006\u001a\u0004\b.\u0010M\"\u0015\u0010)\u001a\u00020\u0001*\u00020N8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010O\"\u0015\u0010/\u001a\u00020\u0004*\u00020N8F¢\u0006\u0006\u001a\u0004\b.\u0010P\"\u0015\u0010)\u001a\u00020\u0001*\u00020Q8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010R\"\u0018\u0010S\u001a\u00020\u0004*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010\u0017¨\u0006T"}, d2 = {"Lic0/c;", "", "getCommandQueryParamValue", "(Lic0/c;)Ljava/lang/String;", "", "supportsBluetoothRoutableCommands", "", "", "featuresBitmask", "bluetoothSupported", "(Lic0/c;ZLjava/util/List;)Z", "Lcom/tesla/oapi/DoorAndMoveType;", "isOpenAllDoors", "(Ljava/util/List;)Z", "isCloseAllDoors", "Lco0/o;", "", "property", "getCommandCenterName", "(Lco0/o;)Ljava/lang/String;", "getAnalyticsName", "analyticsName", "getRequiresSigning", "(Lic0/c;)Z", "requiresSigning", "Lvc0/v2;", "getSignatureType", "(Lic0/c;)Lvc0/v2;", "signatureType", "getRequiresRemoteBuilding", "requiresRemoteBuilding", "isPiiKey", "isWhitelistOperation", "isSignedByPresentKey", "isSessionInfoRequest", "isProxyCommand", "getKeyVersion", "(Lic0/c;)Ljava/lang/Integer;", "keyVersion", "getApiVersion", "apiVersion", "commandCenterName", "getCommandCenterNameSimplified", "commandCenterNameSimplified", "getNearbyInteractionEndpoints", "nearbyInteractionEndpoints", "getUserInitiated", "userInitiated", "getRequestTypeName", "requestTypeName", "getUseEncryptedResponse", "useEncryptedResponse", "Lsc0/d;", "(Lsc0/d;)Ljava/lang/String;", "Lvc0/f0;", "(Lvc0/f0;)Ljava/lang/String;", "Lvc0/e0;", "getName", "(Lvc0/e0;)Ljava/lang/String;", "name", "getDoorsAndMoveTypes", "(Lvc0/e0;)Ljava/util/List;", "doorsAndMoveTypes", "Lvc0/o2;", "(Lvc0/o2;)Ljava/lang/String;", "(Lvc0/o2;)Z", "Lic0/o;", "(Lic0/o;)Ljava/lang/String;", "Lvc0/f1;", "(Lvc0/f1;)Ljava/lang/String;", "Lvc0/n3;", "(Lvc0/n3;)Z", "Lic0/p;", "(Lic0/p;)Z", "(Lic0/p;)Ljava/lang/String;", "Lfc0/g5;", "(Lfc0/g5;)Ljava/lang/String;", "(Lfc0/g5;)Z", "Lic0/k;", "(Lic0/k;)Ljava/lang/String;", "(Lic0/k;)Z", "Lvc0/a1;", "(Lvc0/a1;)Ljava/lang/String;", "isLegacyBluetoothSupported", "oapi_globalPlayRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class CommandActionExtensionsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[o2.values().length];
            try {
                iArr[o2.RKE_ACTION_CANCEL_EXTERNAL_AUTHENTICATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o2.RKE_ACTION_UNLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o2.RKE_ACTION_LOCK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[o2.RKE_ACTION_OPEN_TRUNK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[o2.RKE_ACTION_OPEN_FRUNK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[o2.RKE_ACTION_OPEN_CHARGE_PORT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[o2.RKE_ACTION_CLOSE_CHARGE_PORT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[o2.RKE_ACTION_AUTO_SECURE_VEHICLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[o2.RKE_ACTION_WAKE_VEHICLE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[o2.RKE_ACTION_REMOTE_DRIVE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[o2.RKE_ACTION_UNLOCK_AND_REMOTE_DRIVE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[o2.RKE_ACTION_UNKNOWN.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[f0.values().length];
            try {
                iArr2[f0.CLOSURE_MOVE_TYPE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[f0.CLOSURE_MOVE_TYPE_MOVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[f0.CLOSURE_MOVE_TYPE_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[f0.CLOSURE_MOVE_TYPE_OPEN.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[f0.CLOSURE_MOVE_TYPE_CLOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[sc0.b.values().length];
            try {
                iArr3[sc0.b.DOMAIN_VEHICLE_SECURITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[sc0.b.DOMAIN_INFOTAINMENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[b1.values().length];
            try {
                iArr4[b1.GET_READER_KEY_COMMAND_START_LOOKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr4[b1.GET_READER_KEY_COMMAND_STOP_LOOKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr4[b1.GET_READER_KEY_COMMAND_UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused22) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[ClosureMoveRequestDoor.values().length];
            try {
                iArr5[ClosureMoveRequestDoor.FRONT_DRIVER_DOOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr5[ClosureMoveRequestDoor.FRONT_PASSENGER_DOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr5[ClosureMoveRequestDoor.REAR_DRIVER_DOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr5[ClosureMoveRequestDoor.REAR_PASSENGER_DOOR.ordinal()] = 4;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr5[ClosureMoveRequestDoor.CHARGE_PORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr5[ClosureMoveRequestDoor.REAR_TRUNK.ordinal()] = 6;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr5[ClosureMoveRequestDoor.FRONT_TRUNK.ordinal()] = 7;
            } catch (NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public static final boolean bluetoothSupported(ic0.c cVar, boolean z11, List<Integer> featuresBitmask) {
        s.k(cVar, "<this>");
        s.k(featuresBitmask, "featuresBitmask");
        if (!z11) {
            if (bluetoothSupported$supportsRemoteStart(cVar, featuresBitmask)) {
                return true;
            }
            return isLegacyBluetoothSupported(cVar);
        }
        if (cVar.getCarServerAction() == null && cVar.getWebrtcRequest() == null && cVar.getTesla_proto_SessionInfoRequest() == null && cVar.getProxyCommand() == null && cVar.getRkeAction() != o2.RKE_ACTION_WAKE_VEHICLE && !bluetoothSupported$supportsRemoteStart(cVar, featuresBitmask) && cVar.getWhitelistOperation() == null && cVar.getTesla_proto_CPDResponse() == null) {
            return isLegacyBluetoothSupported(cVar);
        }
        return true;
    }

    private static final boolean bluetoothSupported$supportsRemoteStart(ic0.c cVar, List<Integer> list) {
        return cVar.getRkeAction() == o2.RKE_ACTION_REMOTE_DRIVE && vb0.c.b(list, v.MOBILE_APP_FEATURE_BLE_REMOTE_START);
    }

    public static final String getAnalyticsName(ic0.c cVar) {
        s.k(cVar, "<this>");
        String lowerCase = getCommandCenterName(cVar).toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final Integer getApiVersion(ic0.c cVar) {
        s.k(cVar, "<this>");
        k proxyCommand = cVar.getProxyCommand();
        if (proxyCommand != null) {
            return Integer.valueOf(proxyCommand.getApiVersion());
        }
        return null;
    }

    public static final String getCommandCenterName(ic0.c cVar) {
        s.k(cVar, "<this>");
        g5 carServerAction = cVar.getCarServerAction();
        if (carServerAction != null) {
            return getCommandCenterName(carServerAction);
        }
        if (cVar.getWebrtcRequest() != null) {
            return "WEBRTC_REQUEST";
        }
        o2 rkeAction = cVar.getRkeAction();
        if (rkeAction != null) {
            return getCommandCenterName(rkeAction);
        }
        e0 closureAction = cVar.getClosureAction();
        if (closureAction != null) {
            return getName(closureAction);
        }
        o tesla_proto_SessionInfoRequest = cVar.getTesla_proto_SessionInfoRequest();
        if (tesla_proto_SessionInfoRequest != null) {
            return getCommandCenterName(tesla_proto_SessionInfoRequest);
        }
        f1 informationRequest = cVar.getInformationRequest();
        if (informationRequest != null) {
            return getCommandCenterName(informationRequest);
        }
        if (cVar.getWhitelistOperation() != null) {
            return "WHITELIST_OPERATION";
        }
        p sharedHmacWhitelistOperation = cVar.getSharedHmacWhitelistOperation();
        if (sharedHmacWhitelistOperation != null) {
            return getCommandCenterName(sharedHmacWhitelistOperation) + "_WHITELIST_OPERATION";
        }
        if (cVar.getPresentKeyWhitelistOperation() != null) {
            return "WHITELIST_OPERATION_PRESENT_KEY";
        }
        k proxyCommand = cVar.getProxyCommand();
        if (proxyCommand != null) {
            return getCommandCenterName(proxyCommand) + "_PROXY_COMMAND";
        }
        if (cVar.getCenterDisplayRequest() != null) {
            return "CENTER_DISPLAY_REQUEST";
        }
        if (cVar.getAuthenticationResponse() != null) {
            return "AUTHENTICATION_RESPONSE";
        }
        if (cVar.getKeyMetadata() != null) {
            return "KEY_METADATA";
        }
        if (cVar.getDeviceMotion() != null) {
            return "DEVICE_MOTION";
        }
        if (cVar.getAppDeviceInfo() != null) {
            return "APP_DEVICE_INFO";
        }
        if (cVar.getAppEventLog() != null) {
            return "APP_EVENT_LOG";
        }
        a1 getReaderKeyRequest = cVar.getGetReaderKeyRequest();
        if (getReaderKeyRequest != null) {
            return "GET_READER_KEY_REQUEST_" + getCommandCenterName(getReaderKeyRequest);
        }
        if (cVar.getTesla_proto_NISessionStopped() != null) {
            return "FIRA_SESSION_STOPPED";
        }
        if (cVar.getFiraCapabilities() != null) {
            return "FIRA_CAPABILITIES";
        }
        if (cVar.getNiBatchResponse() != null) {
            return "NI_BATCH_RESPONSE";
        }
        if (cVar.getFiraResponse() != null) {
            return "FIRA_RESPONSE";
        }
        return cVar.getTesla_proto_CPDResponse() != null ? "CPD_RESPONSE" : "MISSING_PAYLOAD";
    }

    public static final String getCommandCenterNameSimplified(ic0.c cVar) {
        s.k(cVar, "<this>");
        if (cVar.getTesla_proto_NISessionStopped() != null) {
            return "FIRA_SESSION_STOPPED";
        }
        if (cVar.getNiBatchResponse() != null) {
            return "NI_BATCH_RESPONSE";
        }
        if (cVar.getFiraResponse() != null) {
            return "FIRA_RESPONSE";
        }
        return null;
    }

    public static final String getCommandQueryParamValue(ic0.c cVar) {
        s.k(cVar, "<this>");
        if (cVar.getProxyCommand() != null) {
            k proxyCommand = cVar.getProxyCommand();
            l action = proxyCommand != null ? proxyCommand.getAction() : null;
            if ((action != null ? action.getLock() : null) != null) {
                return "lock";
            }
            if ((action != null ? action.getUnlock() : null) != null) {
                return "unlock";
            }
            if ((action != null ? action.getRemoteStart() : null) != null) {
                return "remote_start_drive";
            }
            if ((action != null ? action.getRemoteServiceAccessRequest() : null) != null) {
                return "remote_service_access_request";
            }
            if ((action != null ? action.getServiceDiagnosticRequest() : null) != null) {
                return "service_diagnostic_request";
            }
            if ((action != null ? action.getUnlockAndRemoteStart() : null) != null) {
                return "unlock_and_remote_drive";
            }
        }
        return null;
    }

    public static final List<DoorAndMoveType> getDoorsAndMoveTypes(e0 e0Var) {
        s.k(e0Var, "<this>");
        ArrayList arrayList = new ArrayList();
        f0 frontDriverDoor = e0Var.getFrontDriverDoor();
        f0 f0Var = f0.CLOSURE_MOVE_TYPE_NONE;
        if (frontDriverDoor == f0Var) {
            frontDriverDoor = null;
        }
        if (frontDriverDoor != null) {
            arrayList.add(new DoorAndMoveType(ClosureMoveRequestDoor.FRONT_DRIVER_DOOR, frontDriverDoor));
        }
        f0 frontPassengerDoor = e0Var.getFrontPassengerDoor();
        if (frontPassengerDoor == f0Var) {
            frontPassengerDoor = null;
        }
        if (frontPassengerDoor != null) {
            arrayList.add(new DoorAndMoveType(ClosureMoveRequestDoor.FRONT_PASSENGER_DOOR, frontPassengerDoor));
        }
        f0 rearDriverDoor = e0Var.getRearDriverDoor();
        if (rearDriverDoor == f0Var) {
            rearDriverDoor = null;
        }
        if (rearDriverDoor != null) {
            arrayList.add(new DoorAndMoveType(ClosureMoveRequestDoor.REAR_DRIVER_DOOR, rearDriverDoor));
        }
        f0 rearPassengerDoor = e0Var.getRearPassengerDoor();
        if (rearPassengerDoor == f0Var) {
            rearPassengerDoor = null;
        }
        if (rearPassengerDoor != null) {
            arrayList.add(new DoorAndMoveType(ClosureMoveRequestDoor.REAR_PASSENGER_DOOR, rearPassengerDoor));
        }
        f0 rearTrunk = e0Var.getRearTrunk();
        if (rearTrunk == f0Var) {
            rearTrunk = null;
        }
        if (rearTrunk != null) {
            arrayList.add(new DoorAndMoveType(ClosureMoveRequestDoor.REAR_TRUNK, rearTrunk));
        }
        f0 frontTrunk = e0Var.getFrontTrunk();
        if (frontTrunk == f0Var) {
            frontTrunk = null;
        }
        if (frontTrunk != null) {
            arrayList.add(new DoorAndMoveType(ClosureMoveRequestDoor.FRONT_TRUNK, frontTrunk));
        }
        f0 chargePort = e0Var.getChargePort();
        f0 f0Var2 = chargePort != f0Var ? chargePort : null;
        if (f0Var2 != null) {
            arrayList.add(new DoorAndMoveType(ClosureMoveRequestDoor.CHARGE_PORT, f0Var2));
        }
        return arrayList;
    }

    public static final Integer getKeyVersion(ic0.c cVar) {
        s.k(cVar, "<this>");
        k proxyCommand = cVar.getProxyCommand();
        if (proxyCommand != null) {
            return Integer.valueOf(proxyCommand.getKeyVersion());
        }
        return null;
    }

    public static final String getName(e0 e0Var) {
        s.k(e0Var, "<this>");
        if (getDoorsAndMoveTypes(e0Var).size() != 1) {
            if (e0Var.getTonneau() == f0.CLOSURE_MOVE_TYPE_NONE) {
                return "MULTIPLE_DOORS";
            }
            return "TONNEAU_" + getAnalyticsName(e0Var.getTonneau());
        }
        DoorAndMoveType doorAndMoveType = (DoorAndMoveType) p013kotlin.collections.v.o0(getDoorsAndMoveTypes(e0Var));
        return doorAndMoveType.getDoor().name() + "_" + getAnalyticsName(doorAndMoveType.getMoveType());
    }

    public static final String getNearbyInteractionEndpoints(ic0.c cVar) {
        s.k(cVar, "<this>");
        r1 niBatchResponse = cVar.getNiBatchResponse();
        if (niBatchResponse != null) {
            List<v1> listC = niBatchResponse.c();
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(listC, 10));
            Iterator<T> it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((v1) it.next()).getSessionId().getValue()));
            }
            List listY0 = p013kotlin.collections.v.Y0(arrayList);
            if (listY0.isEmpty()) {
                return null;
            }
            return p013kotlin.collections.v.y0(listY0, ",", null, null, 0, null, null, 62, null);
        }
        r0 firaResponse = cVar.getFiraResponse();
        if (firaResponse != null) {
            List<v0> listB = firaResponse.b();
            ArrayList arrayList2 = new ArrayList(p013kotlin.collections.v.y(listB, 10));
            Iterator<T> it2 = listB.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((v0) it2.next()).getSessionId()));
            }
            List listY1 = p013kotlin.collections.v.Y0(arrayList2);
            if (listY1.isEmpty()) {
                return null;
            }
            return p013kotlin.collections.v.y0(listY1, ",", null, null, 0, null, null, 62, null);
        }
        z1 tesla_proto_NISessionStopped = cVar.getTesla_proto_NISessionStopped();
        if (tesla_proto_NISessionStopped == null) {
            return null;
        }
        List<t> listC2 = tesla_proto_NISessionStopped.c();
        ArrayList arrayList3 = new ArrayList(p013kotlin.collections.v.y(listC2, 10));
        Iterator<T> it3 = listC2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(Integer.valueOf(((t) it3.next()).getValue()));
        }
        List listY2 = p013kotlin.collections.v.Y0(arrayList3);
        if (listY2.isEmpty()) {
            return null;
        }
        return p013kotlin.collections.v.y0(listY2, ",", null, null, 0, null, null, 62, null);
    }

    public static final String getRequestTypeName(ic0.c cVar) {
        s.k(cVar, "<this>");
        if (cVar.getCarServerAction() != null || cVar.getWebrtcRequest() != null || cVar.getRkeAction() != null || cVar.getClosureAction() != null || cVar.getWhitelistOperation() != null || cVar.getSharedHmacWhitelistOperation() != null || cVar.getPresentKeyWhitelistOperation() != null || cVar.getProxyCommand() != null) {
            return "command";
        }
        if (cVar.getTesla_proto_SessionInfoRequest() != null || cVar.getInformationRequest() != null) {
            return "infoRequest";
        }
        if (cVar.getAuthenticationResponse() == null && cVar.getKeyMetadata() == null && cVar.getAppDeviceInfo() == null && cVar.getNiBatchResponse() == null && cVar.getTesla_proto_NISessionResponse() == null && cVar.getFiraResponse() == null && cVar.getFiraCapabilities() == null && cVar.getTesla_proto_CPDResponse() == null) {
            return null;
        }
        return "response";
    }

    public static final boolean getRequiresRemoteBuilding(ic0.c cVar) {
        s.k(cVar, "<this>");
        return cVar.getProxyCommand() != null;
    }

    public static final boolean getRequiresSigning(ic0.c cVar) {
        s.k(cVar, "<this>");
        if (cVar.getRkeAction() != null || cVar.getCarServerAction() != null || cVar.getWebrtcRequest() != null || cVar.getClosureAction() != null || cVar.getWhitelistOperation() != null || cVar.getProxyCommand() != null || cVar.getAuthenticationResponse() != null || cVar.getKeyMetadata() != null || cVar.getDeviceMotion() != null || cVar.getAppDeviceInfo() != null || cVar.getFiraCapabilities() != null || cVar.getFiraResponse() != null || cVar.getTesla_proto_NISessionStopped() != null || cVar.getGetReaderKeyRequest() != null) {
            return true;
        }
        if (cVar.getSharedHmacWhitelistOperation() == null && cVar.getPresentKeyWhitelistOperation() == null && cVar.getTesla_proto_SessionInfoRequest() == null && cVar.getInformationRequest() == null) {
            i appEventLog = cVar.getAppEventLog();
            if ((appEventLog != null ? appEventLog.getPhoneLogForHandlePulledWithoutAuthentication() : null) != null) {
                return true;
            }
            cVar.getTesla_proto_CPDResponse();
        }
        return false;
    }

    public static final v2 getSignatureType(ic0.c cVar) {
        s.k(cVar, "<this>");
        if (cVar.getRkeAction() != null) {
            o2 rkeAction = cVar.getRkeAction();
            return (rkeAction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[rkeAction.ordinal()]) == 1 ? v2.SIGNATURE_TYPE_UNSIGNED : v2.SIGNATURE_TYPE_AES_GCM;
        }
        if (cVar.getCarServerAction() != null || cVar.getWebrtcRequest() != null || cVar.getClosureAction() != null || cVar.getWhitelistOperation() != null || cVar.getProxyCommand() != null || cVar.getKeyMetadata() != null || cVar.getDeviceMotion() != null || cVar.getAppDeviceInfo() != null || cVar.getAppEventLog() != null || cVar.getGetReaderKeyRequest() != null || cVar.getTesla_proto_NISessionResponse() != null || cVar.getTesla_proto_NISessionStopped() != null || cVar.getNiBatchResponse() != null || cVar.getFiraCapabilities() != null || cVar.getFiraResponse() != null) {
            return v2.SIGNATURE_TYPE_AES_GCM;
        }
        if (cVar.getAuthenticationResponse() != null) {
            return v2.SIGNATURE_TYPE_AES_GCM_TOKEN;
        }
        if (cVar.getPresentKeyWhitelistOperation() == null && cVar.getSharedHmacWhitelistOperation() == null) {
            return (cVar.getTesla_proto_SessionInfoRequest() == null && cVar.getInformationRequest() == null && cVar.getTesla_proto_CPDResponse() == null) ? v2.SIGNATURE_TYPE_UNSIGNED : v2.SIGNATURE_TYPE_UNSIGNED;
        }
        return v2.SIGNATURE_TYPE_PRESENT_KEY;
    }

    public static final boolean getUseEncryptedResponse(ic0.c cVar) {
        s.k(cVar, "<this>");
        return cVar.getGetReaderKeyRequest() == null;
    }

    public static final boolean getUserInitiated(ic0.c cVar) {
        s.k(cVar, "<this>");
        g5 carServerAction = cVar.getCarServerAction();
        if (carServerAction != null) {
            return getUserInitiated(carServerAction);
        }
        if (cVar.getWebrtcRequest() != null) {
            return true;
        }
        o2 rkeAction = cVar.getRkeAction();
        if (rkeAction != null) {
            return getUserInitiated(rkeAction);
        }
        if (cVar.getClosureAction() != null) {
            return true;
        }
        n3 whitelistOperation = cVar.getWhitelistOperation();
        if (whitelistOperation != null) {
            return getUserInitiated(whitelistOperation);
        }
        p sharedHmacWhitelistOperation = cVar.getSharedHmacWhitelistOperation();
        if (sharedHmacWhitelistOperation != null) {
            return getUserInitiated(sharedHmacWhitelistOperation);
        }
        n3 presentKeyWhitelistOperation = cVar.getPresentKeyWhitelistOperation();
        if (presentKeyWhitelistOperation != null) {
            return getUserInitiated(presentKeyWhitelistOperation);
        }
        k proxyCommand = cVar.getProxyCommand();
        if (proxyCommand != null) {
            return getUserInitiated(proxyCommand);
        }
        if (cVar.getCenterDisplayRequest() != null || cVar.getTesla_proto_SessionInfoRequest() != null || cVar.getInformationRequest() != null || cVar.getAuthenticationResponse() != null || cVar.getKeyMetadata() != null || cVar.getDeviceMotion() != null || cVar.getAppDeviceInfo() != null || cVar.getAppEventLog() != null || cVar.getGetReaderKeyRequest() != null) {
            return false;
        }
        cVar.getTesla_proto_CPDResponse();
        return false;
    }

    public static final boolean isCloseAllDoors(List<DoorAndMoveType> list) {
        return list != null && list.size() > 1 && ((DoorAndMoveType) p013kotlin.collections.v.o0(list)).getIsCloseMove();
    }

    private static final boolean isLegacyBluetoothSupported(ic0.c cVar) {
        if (cVar.getRkeAction() != null) {
            o2 rkeAction = cVar.getRkeAction();
            switch (rkeAction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[rkeAction.ordinal()]) {
                case -1:
                case 9:
                case 12:
                    return false;
                case 0:
                default:
                    throw new NoWhenBranchMatchedException();
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                    return true;
            }
        }
        if (cVar.getClosureAction() != null) {
            e0 closureAction = cVar.getClosureAction();
            s.h(closureAction);
            List<DoorAndMoveType> doorsAndMoveTypes = getDoorsAndMoveTypes(closureAction);
            if (doorsAndMoveTypes.size() == 1) {
                DoorAndMoveType doorAndMoveType = (DoorAndMoveType) p013kotlin.collections.v.o0(doorsAndMoveTypes);
                switch (WhenMappings.$EnumSwitchMapping$4[doorAndMoveType.getDoor().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                        return true;
                    case 6:
                    case 7:
                        return p013kotlin.collections.v.p(f0.CLOSURE_MOVE_TYPE_CLOSE, f0.CLOSURE_MOVE_TYPE_OPEN, f0.CLOSURE_MOVE_TYPE_MOVE).contains(doorAndMoveType.getMoveType());
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
            if (closureAction.getTonneau() != f0.CLOSURE_MOVE_TYPE_NONE) {
                return true;
            }
            List<DoorAndMoveType> list = doorsAndMoveTypes;
            ArrayList arrayList = new ArrayList(p013kotlin.collections.v.y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((DoorAndMoveType) it.next()).getDoor());
            }
            return arrayList.containsAll(p013kotlin.collections.v.p(ClosureMoveRequestDoor.FRONT_DRIVER_DOOR, ClosureMoveRequestDoor.FRONT_PASSENGER_DOOR, ClosureMoveRequestDoor.REAR_DRIVER_DOOR, ClosureMoveRequestDoor.REAR_PASSENGER_DOOR));
        }
        if (cVar.getAuthenticationResponse() != null || cVar.getKeyMetadata() != null || cVar.getInformationRequest() != null || cVar.getDeviceMotion() != null || cVar.getAppDeviceInfo() != null || cVar.getPresentKeyWhitelistOperation() != null || cVar.getWhitelistOperation() != null || cVar.getAppEventLog() != null || cVar.getFiraCapabilities() != null || cVar.getFiraResponse() != null || cVar.getTesla_proto_NISessionStopped() != null || cVar.getGetReaderKeyRequest() != null) {
            return true;
        }
        if (cVar.getCarServerAction() == null && cVar.getWebrtcRequest() == null && cVar.getTesla_proto_SessionInfoRequest() == null && cVar.getProxyCommand() == null && cVar.getSharedHmacWhitelistOperation() == null && cVar.getTesla_proto_NISessionResponse() == null && cVar.getNiBatchResponse() == null) {
            cVar.getTesla_proto_CPDResponse();
        }
        return false;
    }

    public static final boolean isOpenAllDoors(List<DoorAndMoveType> list) {
        return list != null && list.size() > 1 && ((DoorAndMoveType) p013kotlin.collections.v.o0(list)).getIsOpenMove();
    }

    public static final boolean isPiiKey(ic0.c cVar) {
        s.k(cVar, "<this>");
        return cVar.getProxyCommand() != null;
    }

    public static final boolean isProxyCommand(ic0.c cVar) {
        s.k(cVar, "<this>");
        return cVar.getProxyCommand() != null;
    }

    public static final boolean isSessionInfoRequest(ic0.c cVar) {
        s.k(cVar, "<this>");
        return cVar.getTesla_proto_SessionInfoRequest() != null;
    }

    public static final boolean isSignedByPresentKey(ic0.c cVar) {
        s.k(cVar, "<this>");
        return cVar.getPresentKeyWhitelistOperation() != null;
    }

    public static final boolean isWhitelistOperation(ic0.c cVar) {
        l action;
        s.k(cVar, "<this>");
        if (cVar.getWhitelistOperation() != null || cVar.getPresentKeyWhitelistOperation() != null) {
            return true;
        }
        k proxyCommand = cVar.getProxyCommand();
        return ((proxyCommand == null || (action = proxyCommand.getAction()) == null) ? null : action.getAddKey()) != null;
    }

    public static final String getAnalyticsName(sc0.d dVar) {
        s.k(dVar, "<this>");
        String lowerCase = p013kotlin.text.t.r1(dVar.name(), "MESSAGEFAULT_ERROR_", null, 2, null).toLowerCase(Locale.ROOT);
        s.j(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final String getAnalyticsName(f0 f0Var) {
        s.k(f0Var, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$1[f0Var.ordinal()];
        if (i11 == 1) {
            return "NONE";
        }
        if (i11 == 2) {
            return "MOVE";
        }
        if (i11 == 3) {
            return "STOP";
        }
        if (i11 == 4) {
            return "OPEN";
        }
        if (i11 == 5) {
            return "CLOSE";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean getUserInitiated(o2 o2Var) {
        s.k(o2Var, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[o2Var.ordinal()]) {
            case 1:
            case 9:
            case 12:
                return false;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean getUserInitiated(n3 n3Var) {
        s.k(n3Var, "<this>");
        if (n3Var.getAddPublicKeyToWhitelist() != null) {
            return true;
        }
        if (n3Var.getAddKeyToWhitelistAndAddPermissions() == null && n3Var.getRemovePublicKeyFromWhitelist() == null && n3Var.getAddPermissionsToPublicKey() == null && n3Var.getRemovePermissionsFromPublicKey() == null && n3Var.getUpdateKeyAndPermissions() == null && n3Var.getAddImpermanentKey() == null && n3Var.getAddImpermanentKeyAndRemoveExisting() == null && n3Var.getRemoveAllImpermanentKeys() == null && n3Var.getReplaceKey() == null) {
            String str = "COMMAND_CENTER_USER_INITIATED_NOT_SET: Possibly `" + ((co0.o) ho0.l.T(i0.d(n3Var))) + "` is a new command and isn't setup!";
            TeslaLog.INSTANCE.e("CommandActionsExtensions", str, new Throwable(str));
        }
        return false;
    }

    public static final String getCommandCenterName(o2 o2Var) {
        s.k(o2Var, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[o2Var.ordinal()]) {
            case 2:
                return "UNLOCK";
            case 3:
                return "LOCK";
            case 4:
            case 5:
                return "ACTUATE_TRUNK";
            case 6:
                return "CHARGE_PORT_OPEN";
            case 7:
                return "CHARGE_PORT_DOOR_CLOSE";
            case 8:
                return "CLOSE_DOORS_AND_LOCK";
            case 9:
                return "WAKE";
            case 10:
                return "REMOTE_START";
            default:
                return p013kotlin.text.t.r1(o2Var.name(), "RKE_ACTION_", null, 2, null);
        }
    }

    public static final String getCommandCenterName(o oVar) {
        s.k(oVar, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$2[oVar.getDomain().ordinal()];
        if (i11 == 1) {
            return "GET_SESSION_DATA";
        }
        if (i11 != 2) {
            return p013kotlin.text.t.r1(oVar.getDomain().name(), "DOMAIN_", null, 2, null);
        }
        return "GET_CARAPI_SESSION_DATA";
    }

    public static final boolean getUserInitiated(p pVar) {
        s.k(pVar, "<this>");
        if (pVar.getWhitelistOperation() == null) {
            return false;
        }
        n3 whitelistOperation = pVar.getWhitelistOperation();
        s.h(whitelistOperation);
        return getUserInitiated(whitelistOperation);
    }

    public static final boolean getUserInitiated(g5 g5Var) {
        s.k(g5Var, "<this>");
        if (g5Var.getRemoteStartDrive() != null || g5Var.getChargingSetLimitAction() != null || g5Var.getChargingStartStopAction() != null || g5Var.getDrivingClearSpeedLimitPinAction() != null || g5Var.getDrivingSetSpeedLimitAction() != null || g5Var.getDrivingSpeedLimitAction() != null || g5Var.getHvacAutoAction() != null || g5Var.getHvacSetPreconditioningMaxAction() != null || g5Var.getHvacSteeringWheelHeaterAction() != null || g5Var.getHvacTemperatureAdjustmentAction() != null || g5Var.getMediaPlayAction() != null || g5Var.getMediaUpdateVolume() != null || g5Var.getMediaNextTrack() != null || g5Var.getMediaPreviousTrack() != null || g5Var.getMediaNextFavorite() != null || g5Var.getMediaPreviousFavorite() != null || g5Var.getVehicleControlCancelSoftwareUpdateAction() != null || g5Var.getVehicleControlFlashLightsAction() != null || g5Var.getVehicleControlHonkHornAction() != null || g5Var.getBoomboxAction() != null || g5Var.getSetCopTempAction() != null || g5Var.getVehicleControlResetValetPinAction() != null || g5Var.getVehicleControlScheduleSoftwareUpdateAction() != null || g5Var.getVehicleControlSetSentryModeAction() != null || g5Var.getVehicleControlSetValetModeAction() != null || g5Var.getVehicleControlSunroofOpenCloseAction() != null || g5Var.getVehicleControlTriggerHomelinkAction() != null || g5Var.getVehicleControlWindowAction() != null || g5Var.getHvacBioweaponModeAction() != null || g5Var.getHvacSeatHeaterActions() != null || g5Var.getScheduledChargingAction() != null || g5Var.getScheduledDepartureAction() != null || g5Var.getSetChargingAmpsAction() != null || g5Var.getHvacClimateKeeperAction() != null || g5Var.getHvacRecirculationAction() != null || g5Var.getDashcamSaveClipAction() != null || g5Var.getAutoSeatClimateAction() != null || g5Var.getHvacSeatCoolerActions() != null || g5Var.getSetCabinOverheatProtectionAction() != null || g5Var.getSetVehicleNameAction() != null || g5Var.getChargePortDoorClose() != null || g5Var.getChargePortDoorOpen() != null || g5Var.getBluetoothClassicPairingRequest() != null || g5Var.getGuestModeAction() != null || g5Var.getAutoStwHeatAction() != null || g5Var.getStwHeatLevelAction() != null || g5Var.getVehicleControlSetPinToDriveAction() != null || g5Var.getVehicleControlResetPinToDriveAction() != null || g5Var.getDrivingClearSpeedLimitPinAdminAction() != null || g5Var.getSetOutletsOnOffAction() != null || g5Var.getSetOutletTimerAction() != null || g5Var.getSetOutletSocLimitAction() != null || g5Var.getSetPowerFeedOnOffAction() != null || g5Var.getSetPowerFeedTimerAction() != null || g5Var.getSetPowerFeedSocLimitAction() != null || g5Var.getSetTrailerLightTestStartStopAction() != null || g5Var.getSetTruckBedLightAutoStateAction() != null || g5Var.getSetTruckBedLightBrightnessAction() != null || g5Var.getVehicleControlResetPinToDriveAdminAction() != null || g5Var.getSetPowershareFeatureAction() != null || g5Var.getSetPowershareDischargeLimitAction() != null || g5Var.getSetPowershareRequestAction() != null || g5Var.getSetTentModeRequestAction() != null || g5Var.getSetFrontZoneLightRequestAction() != null || g5Var.getSetRearZoneLightRequestAction() != null || g5Var.getSetLightbarBrightnessAction() != null || g5Var.getSetLightbarMiddleAction() != null || g5Var.getSetLightbarDitchAction() != null || g5Var.getAddChargeScheduleAction() != null || g5Var.getRemoveChargeScheduleAction() != null || g5Var.getAddPreconditionScheduleAction() != null || g5Var.getRemovePreconditionScheduleAction() != null || g5Var.getBatchRemovePreconditionSchedulesAction() != null || g5Var.getBatchRemoveChargeSchedulesAction() != null || g5Var.getStartLightShowAction() != null || g5Var.getStopLightShowAction() != null || g5Var.getSetSuspensionLevelAction() != null || g5Var.getSetDischargeLimitAction() != null || g5Var.getSetLowPowerModeAction() != null || g5Var.getNavigationRouteAction() != null || g5Var.getNavigationRequest() != null || g5Var.getNavigationGpsRequest() != null || g5Var.getNavigationSuperchargerRequest() != null || g5Var.getNavigationWaypointsRequest() != null || g5Var.getNavigationGpsDestinationRequest() != null || g5Var.getAddManagedChargingSiteRequest() != null || g5Var.getRemoveManagedChargingSiteRequest() != null || g5Var.getUpdateChargeOnSolarFeatureRequest() != null || g5Var.getVideoRequestAction() != null || g5Var.getGetMessagesAction() != null || g5Var.getParentalControlsAction() != null || g5Var.getParentalControlsEnableSettingsAction() != null || g5Var.getParentalControlsSetSpeedLimitAction() != null || g5Var.getCancelSohTestAction() != null || g5Var.getFetchKeysInfoAction() != null || g5Var.getParentalControlsClearPinAction() != null || g5Var.getParentalControlsClearPinAdminAction() != null) {
            return true;
        }
        if (g5Var.getGetVehicleData() == null && g5Var.getCreateStreamSession() == null && g5Var.getStreamMessage() == null && g5Var.getGetChargeOnSolarFeatureRequest() == null && g5Var.getGetNearbyChargingSites() == null && g5Var.getVehicleDataSubscription() == null && g5Var.getVehicleDataAck() == null && g5Var.getVitalsSubscription() == null && g5Var.getVitalsAck() == null && g5Var.getPing() == null && g5Var.getPseudonymSyncRequest() == null && g5Var.getPiiKeyRequest() == null && g5Var.getTeslaAuthResponseAction() == null && g5Var.getSetRateTariffRequest() == null && g5Var.getGetRateTariffRequest() == null && g5Var.getEraseUserDataAction() == null && g5Var.getTakeDrivenoteAction() == null && g5Var.getUiSetUpcomingCalendarEntries() == null && g5Var.getGetManagedChargingSitesRequest() == null && g5Var.getSetPhoneSettingPreferencesAction() == null) {
            co0.o oVar = (co0.o) ho0.l.T(i0.d(g5Var));
            if (oVar == null) {
                oVar = (co0.o) ho0.l.T(i0.f(g5Var));
            }
            String str = "COMMAND_CENTER_USER_INITIATED_NOT_SET: Possibly `" + oVar + "` is a new command and isn't setup!";
            TeslaLog.INSTANCE.e("CommandActionsExtensions", str, new Throwable(str));
        }
        return false;
    }

    public static final String getCommandCenterName(f1 f1Var) {
        s.k(f1Var, "<this>");
        return f1Var.getInformationRequestType().name() + "_INFORMATION_REQUEST";
    }

    public static final String getCommandCenterName(p pVar) {
        s.k(pVar, "<this>");
        if (pVar.getWhitelistOperation() == null) {
            return "NO_SUBMESSAGE";
        }
        n3 whitelistOperation = pVar.getWhitelistOperation();
        s.h(whitelistOperation);
        if (whitelistOperation.getMetadataForKey() != null) {
            return "METADATA_FOR_KEY";
        }
        if (whitelistOperation.getAddPublicKeyToWhitelist() != null) {
            return "ADD_PUBLIC_KEY_TO_WHITELIST";
        }
        if (whitelistOperation.getRemovePublicKeyFromWhitelist() != null) {
            return "REMOVE_PUBLIC_KEY_FROM_WHITELIST";
        }
        if (whitelistOperation.getAddPermissionsToPublicKey() != null) {
            return "ADD_PERMISSIONS_TO_PUBLIC_KEY";
        }
        if (whitelistOperation.getRemovePermissionsFromPublicKey() != null) {
            return "REMOVE_PERMISSIONS_FROM_PUBLIC_KEY";
        }
        if (whitelistOperation.getAddKeyToWhitelistAndAddPermissions() != null) {
            return "ADD_KEY_TO_WHITELIST_AND_ADD_PERMISSIONS";
        }
        if (whitelistOperation.getUpdateKeyAndPermissions() != null) {
            return "UPDATE_KEY_AND_PERMISSIONS";
        }
        if (whitelistOperation.getAddImpermanentKey() != null) {
            return "ADD_IMPERMANENT_KEY";
        }
        if (whitelistOperation.getAddImpermanentKeyAndRemoveExisting() != null) {
            return "ADD_IMPERMANENT_KEY_AND_REMOVE_EXISTING";
        }
        if (whitelistOperation.getRemoveAllImpermanentKeys() != null) {
            return "REMOVE_ALL_IMPERMANENT_KEYS";
        }
        co0.o oVar = (co0.o) ho0.l.T(i0.d(pVar));
        return oVar == null ? "NO_SUBMESSAGE" : getCommandCenterName((co0.o<? extends Object, ?>) oVar);
    }

    public static final String getCommandCenterName(g5 g5Var) {
        s.k(g5Var, "<this>");
        if (g5Var.getPing() != null) {
            return "PING";
        }
        if (g5Var.getRemoteStartDrive() != null) {
            return "REMOTE_START";
        }
        if (g5Var.getCreateStreamSession() != null) {
            return "CREATE_STREAM_SESSION";
        }
        if (g5Var.getStreamMessage() != null) {
            return "SEND_STREAM_MESSAGE";
        }
        if (g5Var.getChargingSetLimitAction() != null) {
            return "CHANGE_CHARGE_LIMIT";
        }
        if (g5Var.getDrivingClearSpeedLimitPinAction() != null) {
            return "SPEED_LIMIT_CLEAR_PIN";
        }
        if (g5Var.getDrivingSetSpeedLimitAction() != null) {
            return "SPEED_LIMIT_SET_LIMIT";
        }
        if (g5Var.getHvacSetPreconditioningMaxAction() != null) {
            return "SET_DEFROST";
        }
        if (g5Var.getHvacSteeringWheelHeaterAction() != null) {
            return "REMOTE_STEERING_WHEEL_HEATER_REQUEST";
        }
        if (g5Var.getAutoStwHeatAction() != null) {
            return "REMOTE_AUTO_STEERING_WHEEL_HEAT_CLIMATE_REQUEST";
        }
        if (g5Var.getStwHeatLevelAction() != null) {
            return "REMOTE_STEERING_WHEEL_HEAT_LEVEL_REQUEST";
        }
        if (g5Var.getHvacTemperatureAdjustmentAction() != null) {
            return "CHANGE_CLIMATE_TEMPERATURE_SETTING";
        }
        if (g5Var.getMediaPlayAction() != null) {
            return "MEDIA_TOGGLE_PLAYBACK";
        }
        if (g5Var.getMediaNextTrack() != null) {
            return "MEDIA_NEXT_TRACK";
        }
        if (g5Var.getMediaPreviousTrack() != null) {
            return "MEDIA_PREVIOUS_TRACK";
        }
        if (g5Var.getNavigationRouteAction() != null) {
            return "NAVIGATION_ROUTE_ACTION";
        }
        if (g5Var.getNavigationRequest() != null) {
            return "NAVIGATION_REQUEST";
        }
        if (g5Var.getNavigationGpsRequest() != null) {
            return "NAVIGATION_GPS_REQUEST";
        }
        if (g5Var.getNavigationGpsDestinationRequest() != null) {
            return "NAVIGATION_GPS_DESTINATION_REQUEST";
        }
        if (g5Var.getNavigationSuperchargerRequest() != null) {
            return "NAVIGATION_SC_REQUEST";
        }
        if (g5Var.getNavigationWaypointsRequest() != null) {
            return "NAVIGATION_WAYPOINTS_REQUEST";
        }
        if (g5Var.getVideoRequestAction() != null) {
            return "VIDEO_REQUEST";
        }
        if (g5Var.getUiSetUpcomingCalendarEntries() != null) {
            return "CALENDAR_SYNC";
        }
        if (g5Var.getVehicleControlCancelSoftwareUpdateAction() != null) {
            return "CANCEL_SOFTWARE_UPDATE";
        }
        if (g5Var.getVehicleControlFlashLightsAction() != null) {
            return "FLASH_LIGHTS";
        }
        if (g5Var.getVehicleControlHonkHornAction() != null) {
            return "HONK_HORN";
        }
        if (g5Var.getBoomboxAction() != null) {
            return "REMOTE_BOOMBOX";
        }
        if (g5Var.getVehicleControlResetValetPinAction() != null) {
            return "RESET_VALET_PIN";
        }
        if (g5Var.getVehicleControlScheduleSoftwareUpdateAction() != null) {
            return "SCHEDULE_SOFTWARE_UPDATE";
        }
        if (g5Var.getVehicleControlSetSentryModeAction() != null) {
            return "SET_SENTRY_MODE";
        }
        if (g5Var.getVehicleControlSetValetModeAction() != null) {
            return "SET_VALET_MODE";
        }
        if (g5Var.getVehicleControlSunroofOpenCloseAction() != null) {
            return "CHANGE_SUNROOF_STATE";
        }
        if (g5Var.getVehicleControlTriggerHomelinkAction() != null) {
            return "TRIGGER_HOMELINK";
        }
        if (g5Var.getVehicleControlWindowAction() != null) {
            return "WINDOW_CONTROL";
        }
        if (g5Var.getHvacBioweaponModeAction() != null) {
            return "HVAC_BIOWEAPON_MODE";
        }
        if (g5Var.getHvacSeatHeaterActions() != null) {
            return "REMOTE_SEAT_HEATER_REQUEST";
        }
        if (g5Var.getVehicleDataSubscription() != null) {
            return "VEHICLE_DATA_SUBSCRIPTION";
        }
        if (g5Var.getVehicleDataAck() != null) {
            return "VEHICLE_DATA_ACK";
        }
        if (g5Var.getScheduledChargingAction() != null) {
            return "SET_SCHEDULED_CHARGING";
        }
        if (g5Var.getScheduledDepartureAction() != null) {
            return "SET_SCHEDULED_DEPARTURE";
        }
        if (g5Var.getAddPreconditionScheduleAction() != null) {
            return "ADD_PRECONDITION_SCHEDULE";
        }
        if (g5Var.getRemovePreconditionScheduleAction() != null) {
            return "REMOVE_PRECONDITION_SCHEDULE";
        }
        if (g5Var.getAddChargeScheduleAction() != null) {
            return "ADD_CHARGE_SCHEDULE";
        }
        if (g5Var.getRemoveChargeScheduleAction() != null) {
            return "REMOVE_CHARGE_SCHEDULE";
        }
        if (g5Var.getBatchRemovePreconditionSchedulesAction() != null) {
            return "BATCH_REMOVE_PRECONDITION_SCHEDULES";
        }
        if (g5Var.getBatchRemoveChargeSchedulesAction() != null) {
            return "BATCH_REMOVE_CHARGE_SCHEDULES";
        }
        if (g5Var.getStartLightShowAction() != null) {
            return "START_LIGHT_SHOW";
        }
        if (g5Var.getStopLightShowAction() != null) {
            return "STOP_LIGHT_SHOW";
        }
        if (g5Var.getSetSuspensionLevelAction() != null) {
            return "SET_SUSPENSION_LEVEL";
        }
        if (g5Var.getSetDischargeLimitAction() != null) {
            return "SET_DISCHARGE_LIMIT";
        }
        if (g5Var.getSetLowPowerModeAction() != null) {
            return "SET_LOW_POWER_MODE";
        }
        if (g5Var.getSetChargingAmpsAction() != null) {
            return "SET_CHARGING_AMPS";
        }
        if (g5Var.getHvacClimateKeeperAction() != null) {
            return "SET_CLIMATE_KEEPER_MODE";
        }
        if (g5Var.getAutoSeatClimateAction() != null) {
            return "REMOTE_AUTO_SEAT_CLIMATE_REQUEST";
        }
        if (g5Var.getHvacSeatCoolerActions() != null) {
            return "REMOTE_SEAT_COOLING_REQUEST";
        }
        if (g5Var.getSetCabinOverheatProtectionAction() != null) {
            return "SET_CABIN_OVERHEAT_PROTECTION";
        }
        if (g5Var.getPseudonymSyncRequest() != null) {
            return "SYNC_PSEUDONYM";
        }
        if (g5Var.getTakeDrivenoteAction() != null) {
            return "TAKE_DRIVENOTE";
        }
        if (g5Var.getDrivingSpeedLimitAction() != null) {
            z drivingSpeedLimitAction = g5Var.getDrivingSpeedLimitAction();
            s.h(drivingSpeedLimitAction);
            return drivingSpeedLimitAction.getActivate() ? "SPEED_LIMIT_ACTIVATE" : "SPEED_LIMIT_DEACTIVATE";
        }
        if (g5Var.getHvacAutoAction() != null) {
            p1 hvacAutoAction = g5Var.getHvacAutoAction();
            s.h(hvacAutoAction);
            return hvacAutoAction.getPower_on() ? "CLIMATE_ON" : "CLIMATE_OFF";
        }
        if (g5Var.getMediaUpdateVolume() != null) {
            i2 mediaUpdateVolume = g5Var.getMediaUpdateVolume();
            s.h(mediaUpdateVolume);
            if (mediaUpdateVolume.getVolume_delta() == null) {
                return "ADJUST_VOLUME";
            }
            i2 mediaUpdateVolume2 = g5Var.getMediaUpdateVolume();
            s.h(mediaUpdateVolume2);
            Integer numD = mediaUpdateVolume2.getVolume_delta();
            return (numD != null ? numD.intValue() : 0) > 0 ? "MEDIA_VOLUME_UP" : "MEDIA_VOLUME_DOWN";
        }
        if (g5Var.getChargingStartStopAction() != null) {
            r chargingStartStopAction = g5Var.getChargingStartStopAction();
            s.h(chargingStartStopAction);
            return chargingStartStopAction.getStart() != null ? "START_CHARGE" : "STOP_CHARGE";
        }
        if (g5Var.getGetVehicleData() != null) {
            StringBuilder sb2 = new StringBuilder();
            l1 getVehicleData = g5Var.getGetVehicleData();
            if ((getVehicleData != null ? getVehicleData.getGetVehicleConfig() : null) != null) {
                sb2.append("GET_VEHICLE_CONFIG ");
            }
            l1 getVehicleData2 = g5Var.getGetVehicleData();
            if ((getVehicleData2 != null ? getVehicleData2.getGetClimateState() : null) != null) {
                sb2.append("GET_CLIMATE_STATE ");
            }
            l1 getVehicleData3 = g5Var.getGetVehicleData();
            if ((getVehicleData3 != null ? getVehicleData3.getGetDriveState() : null) != null) {
                sb2.append("GET_DRIVE_STATE ");
            }
            l1 getVehicleData4 = g5Var.getGetVehicleData();
            if ((getVehicleData4 != null ? getVehicleData4.getGetGuiSettings() : null) != null) {
                sb2.append("GET_GUI_SETTINGS ");
            }
            l1 getVehicleData5 = g5Var.getGetVehicleData();
            if ((getVehicleData5 != null ? getVehicleData5.getGetChargeState() : null) != null) {
                sb2.append("GET_CHARGE_STATE ");
            }
            l1 getVehicleData6 = g5Var.getGetVehicleData();
            if ((getVehicleData6 != null ? getVehicleData6.getGetLocationState() : null) != null) {
                sb2.append("GET_LOCATION_STATE ");
            }
            l1 getVehicleData7 = g5Var.getGetVehicleData();
            if ((getVehicleData7 != null ? getVehicleData7.getGetClosuresState() : null) != null) {
                sb2.append("GET_CLOSURES_STATE ");
            }
            l1 getVehicleData8 = g5Var.getGetVehicleData();
            if ((getVehicleData8 != null ? getVehicleData8.getGetLegacyVehicleState() : null) != null) {
                sb2.append("GET_LEGACY_VEHICLE_STATE ");
            }
            l1 getVehicleData9 = g5Var.getGetVehicleData();
            if ((getVehicleData9 != null ? getVehicleData9.getGetParkedAccessoryState() : null) != null) {
                sb2.append("GET_PARKED_ACCESSORY_STATE ");
            }
            l1 getVehicleData10 = g5Var.getGetVehicleData();
            if ((getVehicleData10 != null ? getVehicleData10.getGetPreconditioningScheduleState() : null) != null) {
                sb2.append("GET_PRECONDITIONING_SCHEDULE_STATE ");
            }
            l1 getVehicleData11 = g5Var.getGetVehicleData();
            if ((getVehicleData11 != null ? getVehicleData11.getGetChargeScheduleState() : null) != null) {
                sb2.append("GET_CHARGE_SCHEDULE_STATE ");
            }
            l1 getVehicleData12 = g5Var.getGetVehicleData();
            if ((getVehicleData12 != null ? getVehicleData12.getGetVehicleState() : null) != null) {
                sb2.append("GET_VEHICLE_STATE ");
            }
            l1 getVehicleData13 = g5Var.getGetVehicleData();
            if ((getVehicleData13 != null ? getVehicleData13.getGetVehicleDetailState() : null) != null) {
                sb2.append("GET_VEHICLE_DETAIL_STATE ");
            }
            l1 getVehicleData14 = g5Var.getGetVehicleData();
            if ((getVehicleData14 != null ? getVehicleData14.getGetTirePressureState() : null) != null) {
                sb2.append("GET_TIRE_PRESSURE_STATE ");
            }
            l1 getVehicleData15 = g5Var.getGetVehicleData();
            if ((getVehicleData15 != null ? getVehicleData15.getGetSoftwareUpdateState() : null) != null) {
                sb2.append("GET_SOFTWARE_UPDATE_STATE ");
            }
            l1 getVehicleData16 = g5Var.getGetVehicleData();
            if ((getVehicleData16 != null ? getVehicleData16.getGetParentalControlsState() : null) != null) {
                sb2.append("GET_PARENTAL_CONTROLS_STATE ");
            }
            l1 getVehicleData17 = g5Var.getGetVehicleData();
            if ((getVehicleData17 != null ? getVehicleData17.getGetMediaState() : null) != null) {
                sb2.append("GET_MEDIA_STATE ");
            }
            l1 getVehicleData18 = g5Var.getGetVehicleData();
            if ((getVehicleData18 != null ? getVehicleData18.getGetMediaDetailState() : null) != null) {
                sb2.append("GET_MEDIA_DETAIL_STATE ");
            }
            l1 getVehicleData19 = g5Var.getGetVehicleData();
            if ((getVehicleData19 != null ? getVehicleData19.getGetAlertState() : null) != null) {
                sb2.append("GET_ALERT_STATE ");
            }
            l1 getVehicleData20 = g5Var.getGetVehicleData();
            if ((getVehicleData20 != null ? getVehicleData20.getGetLightShowState() : null) != null) {
                sb2.append("GET_LIGHT_SHOW_STATE ");
            }
            l1 getVehicleData21 = g5Var.getGetVehicleData();
            if ((getVehicleData21 != null ? getVehicleData21.getGetVehicleImageState() : null) != null) {
                sb2.append("GET_VEHICLE_IMAGE_STATE ");
            }
            l1 getVehicleData22 = g5Var.getGetVehicleData();
            if ((getVehicleData22 != null ? getVehicleData22.getGetSohState() : null) != null) {
                sb2.append("GET_SOH_STATE");
            }
            l1 getVehicleData23 = g5Var.getGetVehicleData();
            if ((getVehicleData23 != null ? getVehicleData23.getGetSuspensionState() : null) != null) {
                sb2.append("GET_SUSPENSION_STATE ");
            }
            return "GET_VEHICLE_DATA:" + ((Object) sb2);
        }
        if (g5Var.getPiiKeyRequest() != null) {
            return "PII_KEY_REQUEST";
        }
        if (g5Var.getBluetoothClassicPairingRequest() != null) {
            return "BLUETOOTH_CLASSIC_PAIRING_REQUEST";
        }
        if (g5Var.getGetChargeOnSolarFeatureRequest() != null) {
            return "GET_CHARGE_ON_SOLAR_FEATURE_REQUEST";
        }
        if (g5Var.getEraseUserDataAction() != null) {
            return "ERASE_USER_DATA_ACTION";
        }
        if (g5Var.getGetManagedChargingSitesRequest() != null) {
            return "GET_MANAGED_CHARGING_SITES_REQUEST";
        }
        if (g5Var.getUpdateChargeOnSolarFeatureRequest() != null) {
            return "UPDATE_CHARGE_ON_SOLAR_FEATURE_REQUEST";
        }
        if (g5Var.getVehicleControlSetPinToDriveAction() != null) {
            return "VEHICLE_CONTROLLER_SET_PIN_TO_DRIVE_REQUEST";
        }
        if (g5Var.getVehicleControlResetPinToDriveAction() != null) {
            return "VEHICLE_CONTROLLER_RESET_PIN_TO_DRIVE_REQUEST";
        }
        if (g5Var.getVitalsSubscription() != null) {
            return "VITALS_SUBSCRIPTION";
        }
        if (g5Var.getVitalsAck() != null) {
            return "VITALS_ACK";
        }
        if (g5Var.getSetOutletsOnOffAction() != null) {
            return "SET_OUTLETS_ON_OFF_ACTION";
        }
        if (g5Var.getSetOutletTimerAction() != null) {
            return "SET_OUTLET_TIMER_ACTION";
        }
        if (g5Var.getSetOutletSocLimitAction() != null) {
            return "SET_OUTLET_SOC_LIMIT_ACTION";
        }
        if (g5Var.getSetPowerFeedOnOffAction() != null) {
            return "SET_POWER_FEED_ON_OFF_ACTION";
        }
        if (g5Var.getSetPowerFeedTimerAction() != null) {
            return "SET_POWER_FEED_TIMER_ACTION";
        }
        if (g5Var.getSetPowerFeedSocLimitAction() != null) {
            return "SET_POWER_FEED_SOC_LIMIT_ACTION";
        }
        if (g5Var.getSetTrailerLightTestStartStopAction() != null) {
            return "SET_TRAILER_LIGHT_TEST_START_STOP_ACTION";
        }
        if (g5Var.getSetTruckBedLightAutoStateAction() != null) {
            return "SET_TRUCK_BED_LIGHT_AUTO_STATE_ACTION";
        }
        if (g5Var.getSetTruckBedLightBrightnessAction() != null) {
            return "SET_TRUCK_BED_LIGHT_BRIGHTNESS_ACTION";
        }
        if (g5Var.getAddManagedChargingSiteRequest() != null) {
            return "ADD_MANAGED_CHARGING_SITE_REQUEST";
        }
        if (g5Var.getParentalControlsAction() != null) {
            return "PARENTAL_CONTROLS_ACTION";
        }
        if (g5Var.getParentalControlsClearPinAction() != null) {
            return "PARENTAL_CONTROLS_CLEAR_PIN_ACTION";
        }
        if (g5Var.getParentalControlsClearPinAdminAction() != null) {
            return "PARENTAL_CONTROLS_CLEAR_PIN_ADMIN_ACTION";
        }
        if (g5Var.getParentalControlsEnableSettingsAction() != null) {
            return "PARENTAL_CONTROLS_ENABLE_SETTINGS_ACTION";
        }
        if (g5Var.getParentalControlsSetSpeedLimitAction() != null) {
            return "PARENTAL_CONTROLS_SET_SPEED_LIMIT_ACTION";
        }
        if (g5Var.getFetchKeysInfoAction() != null) {
            return "FETCH_KEYS_INFO_ACTION";
        }
        if (g5Var.getCancelSohTestAction() != null) {
            return "CANCEL_SOH_TEST_ACTION";
        }
        if (g5Var.getSetPhoneSettingPreferencesAction() != null) {
            return "SET_PHONE_SETTING_PREFERENCES_ACTION";
        }
        co0.o oVar = (co0.o) ho0.l.T(i0.d(g5Var));
        if (oVar == null) {
            String str = "COMMAND_CENTER_NAME_NOT_SET: Possibly `" + ((co0.o) ho0.l.T(i0.f(g5Var))) + "` is a new command and isn't setup!";
            TeslaLog.INSTANCE.e("CommandActionsExtensions", str, new Throwable(str));
            return "COMMAND_CENTER_NAME_NOT_SET";
        }
        return getCommandCenterName((co0.o<? extends Object, ?>) oVar);
    }

    public static final boolean getUserInitiated(k kVar) {
        s.k(kVar, "<this>");
        l action = kVar.getAction();
        if ((action != null ? action.getLock() : null) != null) {
            return true;
        }
        l action2 = kVar.getAction();
        if ((action2 != null ? action2.getUnlock() : null) != null) {
            return true;
        }
        l action3 = kVar.getAction();
        if ((action3 != null ? action3.getRemoteStart() : null) != null) {
            return true;
        }
        l action4 = kVar.getAction();
        if ((action4 != null ? action4.getGetReaderKey() : null) != null) {
            return true;
        }
        l action5 = kVar.getAction();
        if ((action5 != null ? action5.getAddKey() : null) != null) {
            return true;
        }
        l action6 = kVar.getAction();
        if ((action6 != null ? action6.getRemoteServiceAccessRequest() : null) == null) {
            l action7 = kVar.getAction();
            if ((action7 != null ? action7.getServiceDiagnosticRequest() : null) == null) {
                String str = "COMMAND_CENTER_USER_INITIATED_NOT_SET: Possibly `" + ((co0.o) ho0.l.T(i0.d(kVar))) + "` is a new command and isn't setup!";
                TeslaLog.INSTANCE.e("CommandActionsExtensions", str, new Throwable(str));
            }
        }
        return false;
    }

    public static final String getCommandCenterName(k kVar) {
        s.k(kVar, "<this>");
        l action = kVar.getAction();
        if ((action != null ? action.getAddKey() : null) != null) {
            return "ADD_KEY";
        }
        l action2 = kVar.getAction();
        if ((action2 != null ? action2.getLock() : null) != null) {
            return "LOCK";
        }
        l action3 = kVar.getAction();
        if ((action3 != null ? action3.getUnlock() : null) != null) {
            return "UNLOCK";
        }
        l action4 = kVar.getAction();
        if ((action4 != null ? action4.getRemoteStart() : null) != null) {
            return "REMOTE_START";
        }
        l action5 = kVar.getAction();
        if ((action5 != null ? action5.getRemoteServiceAccessRequest() : null) != null) {
            return "REMOTE_SERVICE_ACCESS_REQUEST";
        }
        l action6 = kVar.getAction();
        if ((action6 != null ? action6.getServiceDiagnosticRequest() : null) != null) {
            return "SERVICE_DIAGNOSTIC_REQUEST";
        }
        l action7 = kVar.getAction();
        if ((action7 != null ? action7.getGetReaderKey() : null) != null) {
            return "GET_READER_KEY";
        }
        co0.o oVar = (co0.o) ho0.l.T(i0.d(kVar));
        if (oVar == null) {
            return "MISSING_PAYLOAD";
        }
        return getCommandCenterName((co0.o<? extends Object, ?>) oVar);
    }

    public static final String getCommandCenterName(a1 a1Var) {
        s.k(a1Var, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$3[a1Var.getCommand().ordinal()];
        if (i11 == 1) {
            return "START_LOOKING";
        }
        if (i11 == 2) {
            return "STOP_LOOKING";
        }
        if (i11 == 3) {
            return "UNKNOWN";
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final String getCommandCenterName(co0.o<? extends Object, ?> oVar) {
        String name = oVar.getName();
        String strA = n0.a(name);
        String str = "COMMAND_CENTER_NAME_NOT_SET: Add `" + name + "` -> `" + strA + "`";
        TeslaLog.INSTANCE.e("CommandActionsExtensions", str, new Throwable(str));
        return strA;
    }
}
