package atd.i;

import atd.am.ChallengeResultCancelled;
import atd.e.getSDKEphemeralPublicKey;
import com.adyen.checkout.components.core.internal.data.model.StatusResponse;
import com.adyen.threeds2.ProtocolErrorEvent;
import com.adyen.threeds2.RuntimeErrorEvent;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0000\u001a:\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0000\u001a.\u0010\u0010\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0000¨\u0006\u0012"}, d2 = {"toErrorMessageRequest", "Lcom/adyen/threeds2/internal/api/challenge/model/ErrorMessageRequest;", "Lcom/adyen/threeds2/internal/api/challenge/model/type/ErrorType;", "messageRequest", "Lcom/adyen/threeds2/internal/api/challenge/model/MessageRequest;", "errorDetail", "", "toProtocolErrorEvent", "Lcom/adyen/threeds2/ProtocolErrorEvent;", "transactionIdentifiers", "Lcom/adyen/threeds2/internal/result/models/TransactionIdentifiers;", StatusResponse.RESULT_CODE, "Lcom/adyen/threeds2/internal/result/ResultCode;", "field", "Lcom/adyen/threeds2/internal/result/MessageField;", "messageVersion", "toRuntimeErrorEvent", "Lcom/adyen/threeds2/RuntimeErrorEvent;", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getSDKReferenceNumber {
    private static int AuthenticationRequestParameters = 1;
    private static int getSDKTransactionID;

    public static final atd.e.getSDKReferenceNumber AuthenticationRequestParameters(getSDKTransactionID getsdktransactionid, getSDKEphemeralPublicKey getsdkephemeralpublickey, String str) {
        return (atd.e.getSDKReferenceNumber) getSDKTransactionID(new Object[]{getsdktransactionid, getsdkephemeralpublickey, str}, 482849769, -482849767, (int) System.currentTimeMillis());
    }

    public static final RuntimeErrorEvent getSDKReferenceNumber(getSDKTransactionID getsdktransactionid, atd.ao.AuthenticationRequestParameters authenticationRequestParameters, String str, ChallengeResultCancelled challengeResultCancelled, String str2) {
        return (RuntimeErrorEvent) getSDKTransactionID(new Object[]{getsdktransactionid, authenticationRequestParameters, str, challengeResultCancelled, str2}, 213981152, -213981152, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = i11 | i12;
        int i15 = (i11 * 503) + (i12 * 503) + (i14 * (-502));
        int i16 = ~i11;
        int i17 = ~((~i12) | i16);
        int i18 = i16 | (~i13);
        int i19 = i17 | (~i18);
        int i21 = ~(i13 | i14);
        int i22 = i15 + ((i19 | i21) * (-502)) + (((~(i18 | i12)) | i21) * HttpStatusCode.BAD_GATEWAY_502);
        if (i22 == 1) {
            getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
            atd.ao.AuthenticationRequestParameters authenticationRequestParameters = (atd.ao.AuthenticationRequestParameters) objArr[1];
            String str = (String) objArr[2];
            ChallengeResultCancelled challengeResultCancelled = (ChallengeResultCancelled) objArr[3];
            atd.am.getDeviceData getdevicedata = (atd.am.getDeviceData) objArr[4];
            String str2 = (String) objArr[5];
            s.k(getsdktransactionid, "");
            s.k(authenticationRequestParameters, "");
            s.k(challengeResultCancelled, "");
            s.k(getdevicedata, "");
            String str3 = (String) atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(new Object[]{authenticationRequestParameters}, 414390748, -414390748, System.identityHashCode(authenticationRequestParameters));
            return new atd.ab.getDeviceData(str3, new atd.ab.getSDKReferenceNumber(str3, getsdktransactionid.getSDKReferenceNumber(), getsdktransactionid.getDeviceData(), str), atd.am.getSDKReferenceNumber.getDeviceData(challengeResultCancelled, getdevicedata != atd.am.getDeviceData.NONE ? getdevicedata : null, authenticationRequestParameters, str2));
        }
        if (i22 != 2) {
            return getSDKTransactionID(objArr);
        }
        getSDKTransactionID getsdktransactionid2 = (getSDKTransactionID) objArr[0];
        getSDKEphemeralPublicKey getsdkephemeralpublickey = (getSDKEphemeralPublicKey) objArr[1];
        String str4 = (String) objArr[2];
        s.k(getsdktransactionid2, "");
        s.k(getsdkephemeralpublickey, "");
        atd.ao.AuthenticationRequestParameters messageVersion = getsdkephemeralpublickey.getMessageVersion();
        atd.ao.AuthenticationRequestParameters authenticationRequestParameters2 = (atd.ao.AuthenticationRequestParameters) atd.ao.AuthenticationRequestParameters.AuthenticationRequestParameters(new Object[]{messageVersion}, -687165134, 687165139, System.identityHashCode(messageVersion));
        atd.json.AuthenticationRequestParameters authenticationRequestParameters3 = new atd.json.AuthenticationRequestParameters(str4 != null ? str4 : "");
        atd.json.AuthenticationRequestParameters authenticationRequestParametersChallengeResultCancelled = getsdkephemeralpublickey.ChallengeResultCancelled();
        String str5 = (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParametersChallengeResultCancelled}, 680619687, -680619685, System.identityHashCode(authenticationRequestParametersChallengeResultCancelled));
        atd.json.AuthenticationRequestParameters authenticationRequestParametersBuildConfig = getsdkephemeralpublickey.BuildConfig();
        return new atd.e.getSDKReferenceNumber(getsdktransactionid2, authenticationRequestParameters2, authenticationRequestParameters3, str5, authenticationRequestParametersBuildConfig != null ? (String) atd.json.AuthenticationRequestParameters.getDeviceData(new Object[]{authenticationRequestParametersBuildConfig}, 680619687, -680619685, System.identityHashCode(authenticationRequestParametersBuildConfig)) : null);
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        atd.ao.AuthenticationRequestParameters authenticationRequestParameters = (atd.ao.AuthenticationRequestParameters) objArr[1];
        String str = (String) objArr[2];
        ChallengeResultCancelled challengeResultCancelled = (ChallengeResultCancelled) objArr[3];
        String str2 = (String) objArr[4];
        s.k(getsdktransactionid, "");
        s.k(authenticationRequestParameters, "");
        s.k(str, "");
        s.k(challengeResultCancelled, "");
        atd.ab.AuthenticationRequestParameters authenticationRequestParameters2 = new atd.ab.AuthenticationRequestParameters(getsdktransactionid.getSDKReferenceNumber(), getsdktransactionid.getDeviceData(), atd.am.getSDKReferenceNumber.getSDKTransactionID(challengeResultCancelled, authenticationRequestParameters, str2));
        int i11 = AuthenticationRequestParameters;
        int i12 = i11 ^ 61;
        int i13 = ((i11 & 61) | i12) << 1;
        int i14 = -i12;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        getSDKTransactionID = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 58 / 0;
        }
        return authenticationRequestParameters2;
    }

    public static final ProtocolErrorEvent getSDKTransactionID(getSDKTransactionID getsdktransactionid, atd.ao.AuthenticationRequestParameters authenticationRequestParameters, String str, ChallengeResultCancelled challengeResultCancelled, atd.am.getDeviceData getdevicedata, String str2) {
        return (ProtocolErrorEvent) getSDKTransactionID(new Object[]{getsdktransactionid, authenticationRequestParameters, str, challengeResultCancelled, getdevicedata, str2}, 1837895264, -1837895263, (int) System.currentTimeMillis());
    }
}
