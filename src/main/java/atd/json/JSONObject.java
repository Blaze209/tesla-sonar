package atd.json;

import java.util.Iterator;
import java.util.LinkedHashSet;
import org.json.JSONArray;
import org.json.JSONException;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: renamed from: atd.aw.getSDKReferenceNumber, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0002\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lorg/json/JSONObject;", "Ljn0/h0;", "destroy", "(Lorg/json/JSONObject;)V", "Lorg/json/JSONArray;", "(Lorg/json/JSONArray;)V", "", "destroyValue", "(Ljava/lang/Object;)V", "threeds2_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class JSONObject {
    private static int AuthenticationRequestParameters = 0;
    private static int getSDKTransactionID = 1;

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        Object obj = objArr[0];
        int i11 = AuthenticationRequestParameters;
        int i12 = ((i11 & 61) + (i11 | 61)) % 128;
        getSDKTransactionID = i12;
        if (obj instanceof org.json.JSONObject) {
            int i13 = ((i11 | 27) << 1) - (i11 ^ 27);
            getSDKTransactionID = i13 % 128;
            if (i13 % 2 != 0) {
                getSDKAppID(new Object[]{(org.json.JSONObject) obj}, -1150790233, 1150790235, (int) System.currentTimeMillis());
                return null;
            }
            getSDKAppID(new Object[]{(org.json.JSONObject) obj}, -1150790233, 1150790235, (int) System.currentTimeMillis());
            throw null;
        }
        if (obj instanceof JSONArray) {
            int i14 = i12 + 89;
            AuthenticationRequestParameters = i14 % 128;
            if (i14 % 2 != 0) {
                getSDKAppID(new Object[]{(JSONArray) obj}, 224500411, -224500410, (int) System.currentTimeMillis());
                throw null;
            }
            getSDKAppID(new Object[]{(JSONArray) obj}, 224500411, -224500410, (int) System.currentTimeMillis());
        }
        int i15 = AuthenticationRequestParameters;
        int i16 = i15 & 29;
        int i17 = (i15 | 29) & (~i16);
        int i18 = i16 << 1;
        getSDKTransactionID = (((i17 | i18) << 1) - (i17 ^ i18)) % 128;
        return null;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) throws JSONException {
        int i11 = 0;
        JSONArray jSONArray = (JSONArray) objArr[0];
        int i12 = AuthenticationRequestParameters;
        int i13 = i12 & 57;
        int i14 = (((i12 ^ 57) | i13) << 1) - ((i12 | 57) & (~i13));
        int i15 = i14 % 128;
        getSDKTransactionID = i15;
        if (i14 % 2 == 0) {
            throw null;
        }
        if (jSONArray == null) {
            AuthenticationRequestParameters = (i15 + 73) % 128;
            return null;
        }
        int length = jSONArray.length();
        int i16 = getSDKTransactionID;
        int i17 = i16 & 91;
        AuthenticationRequestParameters = (((i16 | 91) & (~i17)) + (i17 << 1)) % 128;
        while (i11 < length) {
            int i18 = getSDKTransactionID + 79;
            AuthenticationRequestParameters = i18 % 128;
            if (i18 % 2 != 0) {
                jSONArray.get(i11);
                throw null;
            }
            Object obj = jSONArray.get(i11);
            if (obj != null) {
                getSDKAppID(new Object[]{obj}, 222929424, -222929424, (int) System.currentTimeMillis());
                int i19 = AuthenticationRequestParameters;
                int i21 = i19 & 89;
                int i22 = -(-(i19 | 89));
                getSDKTransactionID = (((i21 | i22) << 1) - (i22 ^ i21)) % 128;
            } else {
                int i23 = AuthenticationRequestParameters;
                int i24 = i23 & 19;
                getSDKTransactionID = ((((i23 | 19) & (~i24)) - (~(-(-(i24 << 1))))) - 1) % 128;
            }
            jSONArray.put(i11, (Object) null);
            int i25 = i11 & 1;
            i11 = ((i11 ^ 1) | i25) + i25;
            int i26 = getSDKTransactionID;
            AuthenticationRequestParameters = ((-2) - (((i26 & 34) + (i26 | 34)) ^ (-1))) % 128;
        }
        int i27 = AuthenticationRequestParameters;
        int i28 = i27 & 11;
        int i29 = (i28 - (~((i27 ^ 11) | i28))) - 1;
        getSDKTransactionID = i29 % 128;
        if (i29 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~i13;
        int i16 = ~(i14 | i15);
        int i17 = ~i12;
        int i18 = (i11 * 868) + (i12 * 868) + ((i16 | (~(i17 | i15))) * (-867));
        int i19 = i14 | i17;
        int i21 = i18 + (((~i19) | (~(i14 | i13)) | (~(i17 | i13))) * (-1734)) + (((~(i11 | i17 | i13)) | (~(i12 | i14 | i13)) | (~(i15 | i19))) * 867);
        if (i21 != 1) {
            return i21 != 2 ? AuthenticationRequestParameters(objArr) : getSDKTransactionID(objArr);
        }
        return getDeviceData(objArr);
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) throws JSONException {
        org.json.JSONObject jSONObject = (org.json.JSONObject) objArr[0];
        int i11 = getSDKTransactionID;
        int i12 = (i11 & 87) + (i11 | 87);
        int i13 = i12 % 128;
        AuthenticationRequestParameters = i13;
        if (i12 % 2 != 0) {
            throw null;
        }
        if (jSONObject == null) {
            getSDKTransactionID = (i13 + 35) % 128;
            return null;
        }
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        Iterator<String> itKeys = jSONObject.keys();
        s.j(itKeys, "");
        int i14 = getSDKTransactionID;
        AuthenticationRequestParameters = ((i14 & 71) + (i14 | 71)) % 128;
        while (itKeys.hasNext()) {
            int i15 = AuthenticationRequestParameters;
            getSDKTransactionID = ((i15 ^ 93) + ((i15 & 93) << 1)) % 128;
            String next = itKeys.next();
            s.h(next);
            linkedHashSet.add(next);
            AuthenticationRequestParameters = (getSDKTransactionID + 21) % 128;
        }
        int i16 = AuthenticationRequestParameters;
        getSDKTransactionID = ((i16 & 17) + (i16 | 17)) % 128;
        for (String str : linkedHashSet) {
            int i17 = AuthenticationRequestParameters;
            int i18 = i17 & 81;
            getSDKTransactionID = ((i18 - (~((i17 ^ 81) | i18))) - 1) % 128;
            Object obj = jSONObject.get(str);
            s.h(obj);
            getSDKAppID(new Object[]{obj}, 222929424, -222929424, (int) System.currentTimeMillis());
            jSONObject.remove(str);
            int i19 = getSDKTransactionID;
            AuthenticationRequestParameters = ((i19 & 49) + (i19 | 49)) % 128;
        }
        linkedHashSet.clear();
        int i21 = getSDKTransactionID;
        AuthenticationRequestParameters = ((-2) - (((i21 & 54) + (i21 | 54)) ^ (-1))) % 128;
        return null;
    }

    public static final void getSDKAppID(org.json.JSONObject jSONObject) {
        getSDKAppID(new Object[]{jSONObject}, -1150790233, 1150790235, (int) System.currentTimeMillis());
    }

    private static void AuthenticationRequestParameters(JSONArray jSONArray) {
        getSDKAppID(new Object[]{jSONArray}, 224500411, -224500410, (int) System.currentTimeMillis());
    }

    private static final void getDeviceData(Object obj) {
        getSDKAppID(new Object[]{obj}, 222929424, -222929424, (int) System.currentTimeMillis());
    }
}
