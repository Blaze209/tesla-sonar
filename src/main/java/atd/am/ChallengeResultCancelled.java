package atd.am;

import com.google.android.gms.iid.InstanceID;
import p013kotlin.Metadata;
import p013kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\bE\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bG¨\u0006H"}, d2 = {"Lcom/adyen/threeds2/internal/result/ResultCode;", "", "code", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getCode", "()Ljava/lang/String;", "USER_CANCEL", InstanceID.ERROR_TIMEOUT, "MESSAGE_EXTENSION_IS_CRITICAL", "INVALID_MESSAGE_TYPE", "PARSE_MESSAGE_CONTENT_NOT_ENCRYPTED", "POST_ERROR_ESTABLISHING_CONNECTION", "POST_MESSAGE_RESPONSE_TIMEOUT", "MISMATCHING_SDK_TRANSACTION_ID", "MISMATCHING_THREEDS_SERVER_TRANSACTION_ID", "MISMATCHING_ACS_TRANSACTION_ID", "MISMATCHING_MESSAGE_VERSION", "MISMATCHING_COUNTERS", "MESSAGE_FIELD_MISSING_REQUIRED", "MESSAGE_FIELD_EMPTY", "MESSAGE_FIELD_INVALID_FORMAT", "MESSAGE_FIELD_NOT_BASE64URL_ENCODED", "MESSAGE_ISSUER_IMAGE_NO_DENSITY_PRESENT", "MESSAGE_FIELD_TOO_LONG", "EMPTY_MESSAGE", "INVALID_TRANSACTION_STATUS", "TOO_MANY_MESSAGE_EXTENSIONS", "INVALID_CHALLENGE_TYPE", "PARSE_MESSAGE_DECRYPTION_FAILURE", "PARSE_MESSAGE_INVALID_JSON", "PARSE_MESSAGE_CONTENT_TYPE_MISSING", "JWE_AUTHENTICATION_TAG_NOT_BASE64URL_ENCODED", "JWE_KEY_NOT_BASE64URL_ENCODED", "JWE_PAYLOAD_NOT_BASE64URL_ENCODED", "JWE_HEADER_NOT_BASE64URL_ENCODED", "JWE_INITIALIZATION_VECTOR_NOT_BASE64URL_ENCODED", "JWS_HEADER_NOT_BASE64URL_ENCODED", "JWS_PAYLOAD_NOT_BASE64URL_ENCODED", "JWS_SIGNATURE_NOT_BASE64URL_ENCODED", "PUBLIC_KEY_BASE64_DECODING_FAILURE", "PUBLIC_KEY_JSON_DESERIALIZATION_FAILURE", "PUBLIC_KEY_HANDLING_GENERAL_FAILURE", "ROOT_CERTIFICATES_JWS_VERIFICATION_FAILURE", "ROOT_CERTIFICATES_JWS_PAYLOAD_DESERIALIZATION_FAILURE", "ROOT_CERTIFICATES_GENERATION_FAILURE", "ROOT_CERTIFICATES_HANDLING_GENERAL_FAILURE", "INVALID_MESSAGE_VERSION", "DEVICE_INFORMATION_ENCRYPTION_FAILURE", "SDK_IDENTIFIER_FAILURE", "AUTHENTICATION_REQUEST_PARAMETERS_GENERIC_FAILURE", "CREATE_TRANSACTION_GENERIC_FAILURE", "GENERIC_CRYPTOGRAPHIC_FAILURE", "INITIALIZE_RUNTIME_EXCEPTION", "INITIALIZE_GENERIC_EXCEPTION", "ERROR_MESSAGE_FROM_ACS_OTHER", "ERROR_FROM_ACS_MESSAGE_RECEIVED_INVALID", "ERROR_FROM_ACS_MESSAGE_VERSION_NOT_SUPPORTED", "ERROR_FROM_ACS_DATA_ELEMENT_MISSING", "ERROR_FROM_ACS_MESSAGE_EXTENSION_MISSING", "ERROR_FROM_ACS_DATA_ELEMENT_INVALID_FORMAT", "ERROR_FROM_ACS_DUPLICATE_DATA_ELEMENT", "ERROR_FROM_ACS_TRANSACTION_ID_NOT_RECOGNIZED", "ERROR_FROM_ACS_DATA_DECRYPTION_FAILURE", "ERROR_FROM_ACS_ACCESS_DENIED", "ERROR_FROM_ACS_ISO_CODE_INVALID", "ERROR_FROM_ACS_TRANSACTION_DATA_INVALID", "ERROR_FROM_ACS_TRANSACTION_TIMED_OUT", "ERROR_FROM_ACS_TRANSIENT_SYSTEM_FAILURE", "ERROR_FROM_ACS_PERMANENT_SYSTEM_FAILURE", "ERROR_FROM_ACS_SYSTEM_CONNECTION_FAILURE", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChallengeResultCancelled {
    private static final /* synthetic */ EnumEntries $ENTRIES = null;
    private static final /* synthetic */ ChallengeResultCancelled[] $VALUES;
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKTransactionID = 1;
    private final String code;
    public static final ChallengeResultCancelled USER_CANCEL = new ChallengeResultCancelled("USER_CANCEL", 0, "1001");
    public static final ChallengeResultCancelled TIMEOUT = new ChallengeResultCancelled(InstanceID.ERROR_TIMEOUT, 1, "1002");
    public static final ChallengeResultCancelled MESSAGE_EXTENSION_IS_CRITICAL = new ChallengeResultCancelled("MESSAGE_EXTENSION_IS_CRITICAL", 2, "1003");
    public static final ChallengeResultCancelled INVALID_MESSAGE_TYPE = new ChallengeResultCancelled("INVALID_MESSAGE_TYPE", 3, "1004");
    public static final ChallengeResultCancelled PARSE_MESSAGE_CONTENT_NOT_ENCRYPTED = new ChallengeResultCancelled("PARSE_MESSAGE_CONTENT_NOT_ENCRYPTED", 4, "1005");
    public static final ChallengeResultCancelled POST_ERROR_ESTABLISHING_CONNECTION = new ChallengeResultCancelled("POST_ERROR_ESTABLISHING_CONNECTION", 5, "1006");
    public static final ChallengeResultCancelled POST_MESSAGE_RESPONSE_TIMEOUT = new ChallengeResultCancelled("POST_MESSAGE_RESPONSE_TIMEOUT", 6, "1007");
    public static final ChallengeResultCancelled MISMATCHING_SDK_TRANSACTION_ID = new ChallengeResultCancelled("MISMATCHING_SDK_TRANSACTION_ID", 7, "1008");
    public static final ChallengeResultCancelled MISMATCHING_THREEDS_SERVER_TRANSACTION_ID = new ChallengeResultCancelled("MISMATCHING_THREEDS_SERVER_TRANSACTION_ID", 8, "1009");
    public static final ChallengeResultCancelled MISMATCHING_ACS_TRANSACTION_ID = new ChallengeResultCancelled("MISMATCHING_ACS_TRANSACTION_ID", 9, "1010");
    public static final ChallengeResultCancelled MISMATCHING_MESSAGE_VERSION = new ChallengeResultCancelled("MISMATCHING_MESSAGE_VERSION", 10, "1011");
    public static final ChallengeResultCancelled MISMATCHING_COUNTERS = new ChallengeResultCancelled("MISMATCHING_COUNTERS", 11, "1012");
    public static final ChallengeResultCancelled MESSAGE_FIELD_MISSING_REQUIRED = new ChallengeResultCancelled("MESSAGE_FIELD_MISSING_REQUIRED", 12, "1013");
    public static final ChallengeResultCancelled MESSAGE_FIELD_EMPTY = new ChallengeResultCancelled("MESSAGE_FIELD_EMPTY", 13, "1014");
    public static final ChallengeResultCancelled MESSAGE_FIELD_INVALID_FORMAT = new ChallengeResultCancelled("MESSAGE_FIELD_INVALID_FORMAT", 14, "2101");
    public static final ChallengeResultCancelled MESSAGE_FIELD_NOT_BASE64URL_ENCODED = new ChallengeResultCancelled("MESSAGE_FIELD_NOT_BASE64URL_ENCODED", 15, "2102");
    public static final ChallengeResultCancelled MESSAGE_ISSUER_IMAGE_NO_DENSITY_PRESENT = new ChallengeResultCancelled("MESSAGE_ISSUER_IMAGE_NO_DENSITY_PRESENT", 16, "2103");
    public static final ChallengeResultCancelled MESSAGE_FIELD_TOO_LONG = new ChallengeResultCancelled("MESSAGE_FIELD_TOO_LONG", 17, "2104");
    public static final ChallengeResultCancelled EMPTY_MESSAGE = new ChallengeResultCancelled("EMPTY_MESSAGE", 18, "2105");
    public static final ChallengeResultCancelled INVALID_TRANSACTION_STATUS = new ChallengeResultCancelled("INVALID_TRANSACTION_STATUS", 19, "2106");
    public static final ChallengeResultCancelled TOO_MANY_MESSAGE_EXTENSIONS = new ChallengeResultCancelled("TOO_MANY_MESSAGE_EXTENSIONS", 20, "2107");
    public static final ChallengeResultCancelled INVALID_CHALLENGE_TYPE = new ChallengeResultCancelled("INVALID_CHALLENGE_TYPE", 21, "2108");
    public static final ChallengeResultCancelled PARSE_MESSAGE_DECRYPTION_FAILURE = new ChallengeResultCancelled("PARSE_MESSAGE_DECRYPTION_FAILURE", 22, "2201");
    public static final ChallengeResultCancelled PARSE_MESSAGE_INVALID_JSON = new ChallengeResultCancelled("PARSE_MESSAGE_INVALID_JSON", 23, "2202");
    public static final ChallengeResultCancelled PARSE_MESSAGE_CONTENT_TYPE_MISSING = new ChallengeResultCancelled("PARSE_MESSAGE_CONTENT_TYPE_MISSING", 24, "2203");
    public static final ChallengeResultCancelled JWE_AUTHENTICATION_TAG_NOT_BASE64URL_ENCODED = new ChallengeResultCancelled("JWE_AUTHENTICATION_TAG_NOT_BASE64URL_ENCODED", 25, "2301");
    public static final ChallengeResultCancelled JWE_KEY_NOT_BASE64URL_ENCODED = new ChallengeResultCancelled("JWE_KEY_NOT_BASE64URL_ENCODED", 26, "2302");
    public static final ChallengeResultCancelled JWE_PAYLOAD_NOT_BASE64URL_ENCODED = new ChallengeResultCancelled("JWE_PAYLOAD_NOT_BASE64URL_ENCODED", 27, "2303");
    public static final ChallengeResultCancelled JWE_HEADER_NOT_BASE64URL_ENCODED = new ChallengeResultCancelled("JWE_HEADER_NOT_BASE64URL_ENCODED", 28, "2304");
    public static final ChallengeResultCancelled JWE_INITIALIZATION_VECTOR_NOT_BASE64URL_ENCODED = new ChallengeResultCancelled("JWE_INITIALIZATION_VECTOR_NOT_BASE64URL_ENCODED", 29, "2305");
    public static final ChallengeResultCancelled JWS_HEADER_NOT_BASE64URL_ENCODED = new ChallengeResultCancelled("JWS_HEADER_NOT_BASE64URL_ENCODED", 30, "2306");
    public static final ChallengeResultCancelled JWS_PAYLOAD_NOT_BASE64URL_ENCODED = new ChallengeResultCancelled("JWS_PAYLOAD_NOT_BASE64URL_ENCODED", 31, "2307");
    public static final ChallengeResultCancelled JWS_SIGNATURE_NOT_BASE64URL_ENCODED = new ChallengeResultCancelled("JWS_SIGNATURE_NOT_BASE64URL_ENCODED", 32, "2308");
    public static final ChallengeResultCancelled PUBLIC_KEY_BASE64_DECODING_FAILURE = new ChallengeResultCancelled("PUBLIC_KEY_BASE64_DECODING_FAILURE", 33, "2401");
    public static final ChallengeResultCancelled PUBLIC_KEY_JSON_DESERIALIZATION_FAILURE = new ChallengeResultCancelled("PUBLIC_KEY_JSON_DESERIALIZATION_FAILURE", 34, "2402");
    public static final ChallengeResultCancelled PUBLIC_KEY_HANDLING_GENERAL_FAILURE = new ChallengeResultCancelled("PUBLIC_KEY_HANDLING_GENERAL_FAILURE", 35, "2403");
    public static final ChallengeResultCancelled ROOT_CERTIFICATES_JWS_VERIFICATION_FAILURE = new ChallengeResultCancelled("ROOT_CERTIFICATES_JWS_VERIFICATION_FAILURE", 36, "2404");
    public static final ChallengeResultCancelled ROOT_CERTIFICATES_JWS_PAYLOAD_DESERIALIZATION_FAILURE = new ChallengeResultCancelled("ROOT_CERTIFICATES_JWS_PAYLOAD_DESERIALIZATION_FAILURE", 37, "2405");
    public static final ChallengeResultCancelled ROOT_CERTIFICATES_GENERATION_FAILURE = new ChallengeResultCancelled("ROOT_CERTIFICATES_GENERATION_FAILURE", 38, "2406");
    public static final ChallengeResultCancelled ROOT_CERTIFICATES_HANDLING_GENERAL_FAILURE = new ChallengeResultCancelled("ROOT_CERTIFICATES_HANDLING_GENERAL_FAILURE", 39, "2407");
    public static final ChallengeResultCancelled INVALID_MESSAGE_VERSION = new ChallengeResultCancelled("INVALID_MESSAGE_VERSION", 40, "2408");
    public static final ChallengeResultCancelled DEVICE_INFORMATION_ENCRYPTION_FAILURE = new ChallengeResultCancelled("DEVICE_INFORMATION_ENCRYPTION_FAILURE", 41, "2409");
    public static final ChallengeResultCancelled SDK_IDENTIFIER_FAILURE = new ChallengeResultCancelled("SDK_IDENTIFIER_FAILURE", 42, "2410");
    public static final ChallengeResultCancelled AUTHENTICATION_REQUEST_PARAMETERS_GENERIC_FAILURE = new ChallengeResultCancelled("AUTHENTICATION_REQUEST_PARAMETERS_GENERIC_FAILURE", 43, "2411");
    public static final ChallengeResultCancelled CREATE_TRANSACTION_GENERIC_FAILURE = new ChallengeResultCancelled("CREATE_TRANSACTION_GENERIC_FAILURE", 44, "2412");
    public static final ChallengeResultCancelled GENERIC_CRYPTOGRAPHIC_FAILURE = new ChallengeResultCancelled("GENERIC_CRYPTOGRAPHIC_FAILURE", 45, "2413");
    public static final ChallengeResultCancelled INITIALIZE_RUNTIME_EXCEPTION = new ChallengeResultCancelled("INITIALIZE_RUNTIME_EXCEPTION", 46, "2501");
    public static final ChallengeResultCancelled INITIALIZE_GENERIC_EXCEPTION = new ChallengeResultCancelled("INITIALIZE_GENERIC_EXCEPTION", 47, "2502");
    public static final ChallengeResultCancelled ERROR_MESSAGE_FROM_ACS_OTHER = new ChallengeResultCancelled("ERROR_MESSAGE_FROM_ACS_OTHER", 48, "4001");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_MESSAGE_RECEIVED_INVALID = new ChallengeResultCancelled("ERROR_FROM_ACS_MESSAGE_RECEIVED_INVALID", 49, "4101");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_MESSAGE_VERSION_NOT_SUPPORTED = new ChallengeResultCancelled("ERROR_FROM_ACS_MESSAGE_VERSION_NOT_SUPPORTED", 50, "4102");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_DATA_ELEMENT_MISSING = new ChallengeResultCancelled("ERROR_FROM_ACS_DATA_ELEMENT_MISSING", 51, "4201");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_MESSAGE_EXTENSION_MISSING = new ChallengeResultCancelled("ERROR_FROM_ACS_MESSAGE_EXTENSION_MISSING", 52, "4202");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_DATA_ELEMENT_INVALID_FORMAT = new ChallengeResultCancelled("ERROR_FROM_ACS_DATA_ELEMENT_INVALID_FORMAT", 53, "4203");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_DUPLICATE_DATA_ELEMENT = new ChallengeResultCancelled("ERROR_FROM_ACS_DUPLICATE_DATA_ELEMENT", 54, "4204");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_TRANSACTION_ID_NOT_RECOGNIZED = new ChallengeResultCancelled("ERROR_FROM_ACS_TRANSACTION_ID_NOT_RECOGNIZED", 55, "4301");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_DATA_DECRYPTION_FAILURE = new ChallengeResultCancelled("ERROR_FROM_ACS_DATA_DECRYPTION_FAILURE", 56, "4302");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_ACCESS_DENIED = new ChallengeResultCancelled("ERROR_FROM_ACS_ACCESS_DENIED", 57, "4303");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_ISO_CODE_INVALID = new ChallengeResultCancelled("ERROR_FROM_ACS_ISO_CODE_INVALID", 58, "4304");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_TRANSACTION_DATA_INVALID = new ChallengeResultCancelled("ERROR_FROM_ACS_TRANSACTION_DATA_INVALID", 59, "4305");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_TRANSACTION_TIMED_OUT = new ChallengeResultCancelled("ERROR_FROM_ACS_TRANSACTION_TIMED_OUT", 60, "4402");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_TRANSIENT_SYSTEM_FAILURE = new ChallengeResultCancelled("ERROR_FROM_ACS_TRANSIENT_SYSTEM_FAILURE", 61, "4403");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_PERMANENT_SYSTEM_FAILURE = new ChallengeResultCancelled("ERROR_FROM_ACS_PERMANENT_SYSTEM_FAILURE", 62, "4404");
    public static final ChallengeResultCancelled ERROR_FROM_ACS_SYSTEM_CONNECTION_FAILURE = new ChallengeResultCancelled("ERROR_FROM_ACS_SYSTEM_CONNECTION_FAILURE", 63, "4405");

    static {
        ChallengeResultCancelled[] sDKTransactionID = getSDKTransactionID();
        $VALUES = sDKTransactionID;
        on0.a.a(sDKTransactionID);
        int iCurrentTimeMillis = (int) System.currentTimeMillis();
        int i11 = ~iCurrentTimeMillis;
        int i12 = ~((i11 & 123733526) | (123733526 ^ i11));
        int i13 = ~((1866394360 ^ iCurrentTimeMillis) | (1866394360 & iCurrentTimeMillis));
        int i14 = i12 & i13;
        int i15 = (i12 | i13) & (~i14);
        int i16 = -(-(((i15 & i14) | (i15 ^ i14)) * 1150));
        int i17 = (-127893024) & i16;
        int i18 = (i16 ^ (-127893024)) | i17;
        int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
        int i21 = ~((1866394360 ^ iCurrentTimeMillis) | (1866394360 & iCurrentTimeMillis));
        int i22 = ~iCurrentTimeMillis;
        int i23 = ~((1866394360 & i22) | ((~i22) & (-1866394361)) | (i22 & (-1866394361)));
        int i24 = ((~i23) & i21) | ((~i21) & i23);
        int i25 = i21 & i23;
        int i26 = -(~(((i25 & i24) | (i24 ^ i25)) * (-575)));
        int i27 = (((i19 | i26) << 1) - (i26 ^ i19)) - 1;
        int i28 = (iCurrentTimeMillis & 123733526) | (123733526 ^ iCurrentTimeMillis);
        int i29 = (i28 | (~i28)) & (~i28);
        int i31 = i22 ^ (-123733527);
        int i32 = (-123733527) & i22;
        int i33 = ~((i32 & i31) | (i31 ^ i32));
        int i34 = i29 & i33;
        int i35 = (i29 | i33) & (~i34);
        int i36 = -(~(-(-(((i35 & i34) | (i35 ^ i34)) * 575))));
        int i37 = (((i27 | i36) << 1) - (i36 ^ i27)) - 1;
        int iCurrentTimeMillis2 = (int) System.currentTimeMillis();
        int i38 = ~iCurrentTimeMillis2;
        int i39 = (-1822494262) & i38;
        int i41 = (~i39) & ((-1822494262) | i38);
        int i42 = (i39 & i41) | (i41 ^ i39);
        int i43 = i42 ^ 1354795464;
        int i44 = i42 & 1354795464;
        int i45 = ~((i44 & i43) | (i43 ^ i44));
        int i46 = ~iCurrentTimeMillis2;
        int i47 = iCurrentTimeMillis2 | (~iCurrentTimeMillis2);
        int i48 = i46 & i47;
        int i49 = (1354795464 & i48) | ((~i48) & (-1354795465));
        int i51 = i48 & (-1354795465);
        int i52 = (i49 & i51) | (i49 ^ i51);
        int i53 = i52 & 1822494261;
        int i54 = (i52 | 1822494261) & (~i53);
        int i55 = (i54 & i53) | (i54 ^ i53);
        int i56 = (i45 | ((i55 | (~i55)) & (~i55))) * (-184);
        int i57 = (-1623434715) ^ i56;
        int i58 = ((i56 & (-1623434715)) | i57) << 1;
        int i59 = -i57;
        int i61 = (i58 ^ i59) + ((i58 & i59) << 1);
        int i62 = i47 & i38;
        int i63 = ((~i62) & (-1822494262)) | (i62 & 1822494261);
        int i64 = i62 & (-1822494262);
        int i65 = ~((i64 & i63) | (i63 ^ i64));
        int i66 = 1082132480 & i65;
        int i67 = (i65 | 1082132480) & (~i66);
        int i68 = (i67 & i66) | (i67 ^ i66);
        int i69 = (-1354795465) ^ i38;
        int i71 = i38 & (-1354795465);
        int i72 = ~((i71 & i69) | (i69 ^ i71));
        int i73 = i68 & i72;
        int i74 = (i68 | i72) & (~i73);
        int i75 = ((i74 & i73) | (i74 ^ i73)) * 184;
        int i76 = ((i61 | i75) << 1) - (i75 ^ i61);
        int i77 = i76 | (-1038123560);
        int i78 = i77 << 1;
        int i79 = -((~((-1038123560) & i76)) & i77);
        if (i37 > (i78 & i79) + (i79 | i78)) {
            throw null;
        }
    }

    private ChallengeResultCancelled(String str, int i11, String str2) {
        super(str, i11);
        this.code = str2;
    }

    private static final /* synthetic */ ChallengeResultCancelled[] getSDKTransactionID() {
        int i11 = getSDKTransactionID;
        ChallengeResultCancelled[] challengeResultCancelledArr = {USER_CANCEL, TIMEOUT, MESSAGE_EXTENSION_IS_CRITICAL, INVALID_MESSAGE_TYPE, PARSE_MESSAGE_CONTENT_NOT_ENCRYPTED, POST_ERROR_ESTABLISHING_CONNECTION, POST_MESSAGE_RESPONSE_TIMEOUT, MISMATCHING_SDK_TRANSACTION_ID, MISMATCHING_THREEDS_SERVER_TRANSACTION_ID, MISMATCHING_ACS_TRANSACTION_ID, MISMATCHING_MESSAGE_VERSION, MISMATCHING_COUNTERS, MESSAGE_FIELD_MISSING_REQUIRED, MESSAGE_FIELD_EMPTY, MESSAGE_FIELD_INVALID_FORMAT, MESSAGE_FIELD_NOT_BASE64URL_ENCODED, MESSAGE_ISSUER_IMAGE_NO_DENSITY_PRESENT, MESSAGE_FIELD_TOO_LONG, EMPTY_MESSAGE, INVALID_TRANSACTION_STATUS, TOO_MANY_MESSAGE_EXTENSIONS, INVALID_CHALLENGE_TYPE, PARSE_MESSAGE_DECRYPTION_FAILURE, PARSE_MESSAGE_INVALID_JSON, PARSE_MESSAGE_CONTENT_TYPE_MISSING, JWE_AUTHENTICATION_TAG_NOT_BASE64URL_ENCODED, JWE_KEY_NOT_BASE64URL_ENCODED, JWE_PAYLOAD_NOT_BASE64URL_ENCODED, JWE_HEADER_NOT_BASE64URL_ENCODED, JWE_INITIALIZATION_VECTOR_NOT_BASE64URL_ENCODED, JWS_HEADER_NOT_BASE64URL_ENCODED, JWS_PAYLOAD_NOT_BASE64URL_ENCODED, JWS_SIGNATURE_NOT_BASE64URL_ENCODED, PUBLIC_KEY_BASE64_DECODING_FAILURE, PUBLIC_KEY_JSON_DESERIALIZATION_FAILURE, PUBLIC_KEY_HANDLING_GENERAL_FAILURE, ROOT_CERTIFICATES_JWS_VERIFICATION_FAILURE, ROOT_CERTIFICATES_JWS_PAYLOAD_DESERIALIZATION_FAILURE, ROOT_CERTIFICATES_GENERATION_FAILURE, ROOT_CERTIFICATES_HANDLING_GENERAL_FAILURE, INVALID_MESSAGE_VERSION, DEVICE_INFORMATION_ENCRYPTION_FAILURE, SDK_IDENTIFIER_FAILURE, AUTHENTICATION_REQUEST_PARAMETERS_GENERIC_FAILURE, CREATE_TRANSACTION_GENERIC_FAILURE, GENERIC_CRYPTOGRAPHIC_FAILURE, INITIALIZE_RUNTIME_EXCEPTION, INITIALIZE_GENERIC_EXCEPTION, ERROR_MESSAGE_FROM_ACS_OTHER, ERROR_FROM_ACS_MESSAGE_RECEIVED_INVALID, ERROR_FROM_ACS_MESSAGE_VERSION_NOT_SUPPORTED, ERROR_FROM_ACS_DATA_ELEMENT_MISSING, ERROR_FROM_ACS_MESSAGE_EXTENSION_MISSING, ERROR_FROM_ACS_DATA_ELEMENT_INVALID_FORMAT, ERROR_FROM_ACS_DUPLICATE_DATA_ELEMENT, ERROR_FROM_ACS_TRANSACTION_ID_NOT_RECOGNIZED, ERROR_FROM_ACS_DATA_DECRYPTION_FAILURE, ERROR_FROM_ACS_ACCESS_DENIED, ERROR_FROM_ACS_ISO_CODE_INVALID, ERROR_FROM_ACS_TRANSACTION_DATA_INVALID, ERROR_FROM_ACS_TRANSACTION_TIMED_OUT, ERROR_FROM_ACS_TRANSIENT_SYSTEM_FAILURE, ERROR_FROM_ACS_PERMANENT_SYSTEM_FAILURE, ERROR_FROM_ACS_SYSTEM_CONNECTION_FAILURE};
        int i12 = i11 & 73;
        int i13 = (i11 ^ 73) | i12;
        int i14 = (i12 & i13) + (i13 | i12);
        AuthenticationRequestParameters = i14 % 128;
        if (i14 % 2 == 0) {
            return challengeResultCancelledArr;
        }
        throw null;
    }

    public static ChallengeResultCancelled valueOf(String str) {
        int i11 = getSDKTransactionID;
        int i12 = i11 & 97;
        int i13 = -(-((i11 ^ 97) | i12));
        AuthenticationRequestParameters = ((i12 ^ i13) + ((i13 & i12) << 1)) % 128;
        ChallengeResultCancelled challengeResultCancelled = (ChallengeResultCancelled) Enum.valueOf(ChallengeResultCancelled.class, str);
        int i14 = getSDKTransactionID;
        int i15 = (i14 & 90) + (i14 | 90);
        int i16 = (i15 ^ (-1)) + (i15 << 1);
        AuthenticationRequestParameters = i16 % 128;
        if (i16 % 2 == 0) {
            return challengeResultCancelled;
        }
        throw null;
    }

    public static ChallengeResultCancelled[] values() {
        int i11 = getSDKTransactionID;
        int i12 = (i11 ^ 124) + ((i11 & 124) << 1);
        int i13 = (i12 ^ (-1)) + (i12 << 1);
        AuthenticationRequestParameters = i13 % 128;
        if (i13 % 2 == 0) {
            return (ChallengeResultCancelled[]) $VALUES.clone();
        }
        int i14 = 37 / 0;
        return (ChallengeResultCancelled[]) $VALUES.clone();
    }

    public final String getSDKReferenceNumber() {
        int i11 = getSDKTransactionID;
        String str = this.code;
        int i12 = i11 & 15;
        int i13 = -(-(i11 | 15));
        AuthenticationRequestParameters = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        return str;
    }
}
