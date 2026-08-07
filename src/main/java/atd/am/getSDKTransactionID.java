package atd.am;

import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lcom/adyen/threeds2/internal/result/AdditionalDetailsField;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "ERROR_CODE", "ERROR_FIELD", "ADDITIONAL_DETAILS", "SDK_TRANSACTION_IDENTIFIER", "SERVER_TRANSACTION_IDENTIFIER", "ACS_TRANSACTION_IDENTIFIER", "ACS_REFERENCE_NUMBER", "MESSAGE_VERSION", "SDK_VERSION", "PLATFORM", "PLATFORM_VERSION", "DEVICE_MODEL", "VERSION", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ getSDKTransactionID[] $VALUES;
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKAppID = 1;
    private final String identifier;
    public static final getSDKTransactionID ERROR_CODE = new getSDKTransactionID("ERROR_CODE", 0, "errorCode");
    public static final getSDKTransactionID ERROR_FIELD = new getSDKTransactionID("ERROR_FIELD", 1, "errorField");
    public static final getSDKTransactionID ADDITIONAL_DETAILS = new getSDKTransactionID("ADDITIONAL_DETAILS", 2, "additionalDetails");
    public static final getSDKTransactionID SDK_TRANSACTION_IDENTIFIER = new getSDKTransactionID("SDK_TRANSACTION_IDENTIFIER", 3, "sdkTransactionIdentifier");
    public static final getSDKTransactionID SERVER_TRANSACTION_IDENTIFIER = new getSDKTransactionID("SERVER_TRANSACTION_IDENTIFIER", 4, "serverTransactionIdentifier");
    public static final getSDKTransactionID ACS_TRANSACTION_IDENTIFIER = new getSDKTransactionID("ACS_TRANSACTION_IDENTIFIER", 5, "acsTransactionIdentifier");
    public static final getSDKTransactionID ACS_REFERENCE_NUMBER = new getSDKTransactionID("ACS_REFERENCE_NUMBER", 6, "acsReferenceNumber");
    public static final getSDKTransactionID MESSAGE_VERSION = new getSDKTransactionID("MESSAGE_VERSION", 7, "messageVersion");
    public static final getSDKTransactionID SDK_VERSION = new getSDKTransactionID("SDK_VERSION", 8, "sdkVersion");
    public static final getSDKTransactionID PLATFORM = new getSDKTransactionID("PLATFORM", 9, "platform");
    public static final getSDKTransactionID PLATFORM_VERSION = new getSDKTransactionID("PLATFORM_VERSION", 10, "platformVersion");
    public static final getSDKTransactionID DEVICE_MODEL = new getSDKTransactionID("DEVICE_MODEL", 11, "deviceModel");
    public static final getSDKTransactionID VERSION = new getSDKTransactionID("VERSION", 12, "version");

    static {
        getSDKTransactionID[] sDKTransactionID = getSDKTransactionID();
        $VALUES = sDKTransactionID;
        on0.a.a(sDKTransactionID);
        int i11 = AuthenticationRequestParameters;
        getSDKAppID = ((((i11 | 44) << 1) - (i11 ^ 44)) - 1) % 128;
    }

    private getSDKTransactionID(String str, int i11, String str2) {
        super(str, i11);
        this.identifier = str2;
    }

    private static final /* synthetic */ getSDKTransactionID[] getSDKTransactionID() {
        int i11 = AuthenticationRequestParameters;
        int i12 = (i11 & 42) + (i11 | 42);
        int i13 = ((i12 ^ (-1)) + (i12 << 1)) % 128;
        getSDKAppID = i13;
        getSDKTransactionID[] getsdktransactionidArr = {ERROR_CODE, ERROR_FIELD, ADDITIONAL_DETAILS, SDK_TRANSACTION_IDENTIFIER, SERVER_TRANSACTION_IDENTIFIER, ACS_TRANSACTION_IDENTIFIER, ACS_REFERENCE_NUMBER, MESSAGE_VERSION, SDK_VERSION, PLATFORM, PLATFORM_VERSION, DEVICE_MODEL, VERSION};
        AuthenticationRequestParameters = (((i13 | 65) << 1) - (i13 ^ 65)) % 128;
        return getsdktransactionidArr;
    }

    public static getSDKTransactionID valueOf(String str) {
        getSDKTransactionID getsdktransactionid;
        int i11 = getSDKAppID;
        int i12 = ((i11 | 43) << 1) - (i11 ^ 43);
        AuthenticationRequestParameters = i12 % 128;
        if (i12 % 2 != 0) {
            getsdktransactionid = (getSDKTransactionID) Enum.valueOf(getSDKTransactionID.class, str);
            int i13 = 54 / 0;
        } else {
            getsdktransactionid = (getSDKTransactionID) Enum.valueOf(getSDKTransactionID.class, str);
        }
        int i14 = getSDKAppID;
        AuthenticationRequestParameters = ((i14 & 85) + (i14 | 85)) % 128;
        return getsdktransactionid;
    }

    public static getSDKTransactionID[] values() {
        int i11 = AuthenticationRequestParameters + 1;
        getSDKAppID = i11 % 128;
        if (i11 % 2 != 0) {
            return (getSDKTransactionID[]) $VALUES.clone();
        }
        throw null;
    }

    public final String AuthenticationRequestParameters() {
        int i11 = getSDKAppID + 111;
        AuthenticationRequestParameters = i11 % 128;
        if (i11 % 2 == 0) {
            return this.identifier;
        }
        int i12 = 51 / 0;
        return this.identifier;
    }
}
