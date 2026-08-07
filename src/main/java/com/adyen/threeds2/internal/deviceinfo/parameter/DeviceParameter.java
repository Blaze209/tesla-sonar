package com.adyen.threeds2.internal.deviceinfo.parameter;

import java.util.ArrayList;
import java.util.List;
import p013kotlin.Metadata;
import p013kotlin.text.t;

/* JADX INFO: renamed from: com.adyen.threeds2.internal.deviceinfo.parameter.getSDKReferenceNumber, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u0005H$¨\u0006\u000f"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameter;", "", "<init>", "()V", "get", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "handleEmptyString", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringValue;", "handleEmptyString-_vZncUs", "(Ljava/lang/String;)Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "handleEmptyList", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult$Success$StringsListValue;", "handleEmptyList-oLfF5qA", "(Ljava/util/List;)Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class DeviceParameter {
    private static int getDeviceData = 0;
    private static int getSDKAppID = 1;

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        DeviceParameterResult failure;
        DeviceParameter deviceParameter = (DeviceParameter) objArr[0];
        int i11 = getDeviceData;
        int i12 = (((i11 ^ 31) | (i11 & 31)) << 1) - (((~i11) & 31) | (i11 & (-32)));
        getSDKAppID = i12 % 128;
        try {
            if (i12 % 2 == 0) {
                deviceParameter.getDeviceData();
                throw null;
            }
            failure = deviceParameter.getDeviceData();
            if (failure instanceof DeviceParameterResult.Success.StringValue) {
                int i13 = getDeviceData;
                int i14 = i13 & 31;
                int i15 = (((i13 ^ 31) | i14) << 1) - ((i13 | 31) & (~i14));
                getSDKAppID = i15 % 128;
                if (i15 % 2 == 0) {
                    throw null;
                }
                failure = (DeviceParameterResult) getSDKTransactionID(new Object[]{((DeviceParameterResult.Success.StringValue) failure).m55unboximpl()}, 895099559, -895099558, (int) System.currentTimeMillis());
            } else if (failure instanceof DeviceParameterResult.Success.StringsListValue) {
                int i16 = getDeviceData;
                int i17 = i16 & 47;
                int i18 = (i16 ^ 47) | i17;
                getSDKAppID = (((i17 | i18) << 1) - (i18 ^ i17)) % 128;
                failure = (DeviceParameterResult) getSDKTransactionID(new Object[]{((DeviceParameterResult.Success.StringsListValue) failure).m62unboximpl()}, -4128227, 4128227, (int) System.currentTimeMillis());
                int i19 = getDeviceData;
                int i21 = i19 | 29;
                int i22 = i21 << 1;
                int i23 = -((~(i19 & 29)) & i21);
                getSDKAppID = ((i22 ^ i23) + ((i23 & i22) << 1)) % 128;
            } else {
                int i24 = getDeviceData;
                int i25 = (i24 & (-6)) | ((~i24) & 5);
                int i26 = (i24 & 5) << 1;
                getSDKAppID = ((i25 ^ i26) + ((i26 & i25) << 1)) % 128;
            }
            int i27 = getDeviceData;
            int i28 = i27 & 113;
            int i29 = -(-((i27 ^ 113) | i28));
            getSDKAppID = ((i28 ^ i29) + ((i29 & i28) << 1)) % 128;
            int i31 = getSDKAppID;
            int i32 = (((i31 ^ 5) | (i31 & 5)) << 1) - ((5 & (~i31)) | (i31 & (-6)));
            getDeviceData = i32 % 128;
            if (i32 % 2 == 0) {
                return failure;
            }
            throw null;
        } catch (Throwable unused) {
            failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.UNSUPPORTED_OR_DEPRECATED);
        }
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        List<? extends String> listM57constructorimpl;
        DeviceParameterResult.Success.StringsListValue stringsListValueM56boximpl;
        List listM62unboximpl;
        List list = (List) objArr[0];
        ArrayList arrayList = new ArrayList();
        getSDKAppID = (getDeviceData + 87) % 128;
        for (Object obj : list) {
            int i11 = getDeviceData;
            int i12 = i11 | 81;
            int i13 = i12 << 1;
            int i14 = -((~(i11 & 81)) & i12);
            getSDKAppID = (((i13 | i14) << 1) - (i14 ^ i13)) % 128;
            if (t.y0((String) obj)) {
                int i15 = getDeviceData;
                int i16 = i15 & 49;
                getSDKAppID = ((((i15 ^ 49) | i16) << 1) - ((i15 | 49) & (~i16))) % 128;
            } else {
                int i17 = getSDKAppID;
                int i18 = i17 & 95;
                getDeviceData = (i18 + ((i17 ^ 95) | i18)) % 128;
                arrayList.add(obj);
                int i19 = getDeviceData;
                int i21 = i19 & 81;
                int i22 = (i19 ^ 81) | i21;
                getSDKAppID = ((i21 ^ i22) + ((i22 & i21) << 1)) % 128;
            }
        }
        if (arrayList.isEmpty()) {
            int i23 = getSDKAppID;
            getDeviceData = ((i23 & 39) + (i23 | 39)) % 128;
            listM57constructorimpl = null;
        } else {
            int i24 = getDeviceData;
            int i25 = i24 & 5;
            int i26 = ((((i24 ^ 5) | i25) << 1) - ((i24 | 5) & (~i25))) % 128;
            getSDKAppID = i26;
            int i27 = ((i26 & 124) + (i26 | 124)) - 1;
            getDeviceData = i27 % 128;
            if (i27 % 2 != 0) {
                DeviceParameterResult.Success.StringsListValue.m57constructorimpl(arrayList);
                throw null;
            }
            listM57constructorimpl = DeviceParameterResult.Success.StringsListValue.m57constructorimpl(arrayList);
            int i28 = getDeviceData;
            int i29 = i28 & 99;
            int i31 = -(-((i28 ^ 99) | i29));
            getSDKAppID = (((i29 | i31) << 1) - (i31 ^ i29)) % 128;
        }
        if (listM57constructorimpl != null) {
            int i32 = getSDKAppID;
            int i33 = ((i32 | 77) << 1) - (i32 ^ 77);
            getDeviceData = i33 % 128;
            if (i33 % 2 != 0) {
                DeviceParameterResult.Success.StringsListValue.m56boximpl(listM57constructorimpl);
                throw null;
            }
            stringsListValueM56boximpl = DeviceParameterResult.Success.StringsListValue.m56boximpl(listM57constructorimpl);
            int i34 = getDeviceData;
            int i35 = i34 & 121;
            int i36 = -(-((i34 ^ 121) | i35));
            getSDKAppID = (((i35 | i36) << 1) - (i36 ^ i35)) % 128;
        } else {
            getSDKAppID = (getDeviceData + 101) % 128;
            stringsListValueM56boximpl = null;
        }
        if (stringsListValueM56boximpl != null) {
            int i37 = getSDKAppID;
            int i38 = i37 & 65;
            getDeviceData = (((i37 | 65) & (~i38)) + (i38 << 1)) % 128;
            listM62unboximpl = stringsListValueM56boximpl.m62unboximpl();
            int i39 = getDeviceData;
            getSDKAppID = (((((i39 ^ 35) | (i39 & 35)) << 1) - (~(-(((~i39) & 35) | (i39 & (-36)))))) - 1) % 128;
        } else {
            int i41 = getSDKAppID;
            int i42 = ((i41 | 26) << 1) - (i41 ^ 26);
            getDeviceData = ((i42 ^ (-1)) + (i42 << 1)) % 128;
            listM62unboximpl = null;
        }
        if (listM62unboximpl == null) {
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            int i43 = getSDKAppID + 80;
            getDeviceData = ((i43 ^ (-1)) + (i43 << 1)) % 128;
            return failure;
        }
        int i44 = getDeviceData + 1;
        getSDKAppID = i44 % 128;
        if (i44 % 2 != 0) {
            return DeviceParameterResult.Success.StringsListValue.m56boximpl(listM62unboximpl);
        }
        DeviceParameterResult.Success.StringsListValue.m56boximpl(listM62unboximpl);
        throw null;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~(i14 | i13);
        int i16 = ~i13;
        int i17 = (i11 * 905) + (i12 * (-903)) + ((i15 | (~(i16 | i12))) * (-1808));
        int i18 = ~i12;
        int i19 = i11 | i16;
        int i21 = i17 + (((~(i19 | i12)) | (~(i14 | i18 | i13))) * 904) + (((~i19) | (~(i12 | i14)) | (~(i13 | i18))) * 904);
        if (i21 != 1) {
            return i21 != 2 ? getSDKReferenceNumber(objArr) : getDeviceData(objArr);
        }
        return getSDKTransactionID(objArr);
    }

    protected abstract DeviceParameterResult getDeviceData();

    public final DeviceParameterResult getSDKAppID() {
        return (DeviceParameterResult) getSDKTransactionID(new Object[]{this}, 1790528185, -1790528183, System.identityHashCode(this));
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        String str = (String) objArr[0];
        int i11 = getDeviceData;
        int i12 = i11 & 17;
        int i13 = i12 + ((i11 ^ 17) | i12);
        getSDKAppID = i13 % 128;
        if (i13 % 2 == 0) {
            t.y0(str);
            throw null;
        }
        if (t.y0(str)) {
            getDeviceData = (getSDKAppID + 67) % 128;
            DeviceParameterResult.Failure failure = new DeviceParameterResult.Failure(DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
            int i14 = getSDKAppID;
            int i15 = i14 & 11;
            int i16 = (i14 ^ 11) | i15;
            int i17 = (i15 & i16) + (i16 | i15);
            getDeviceData = i17 % 128;
            if (i17 % 2 == 0) {
                return failure;
            }
            throw null;
        }
        int i18 = getSDKAppID;
        int i19 = i18 & 3;
        int i21 = -(-(i18 | 3));
        int i22 = ((i19 & i21) + (i21 | i19)) % 128;
        getDeviceData = i22;
        getSDKAppID = ((((i22 | 68) << 1) - (i22 ^ 68)) - 1) % 128;
        DeviceParameterResult.Success.StringValue stringValueM49boximpl = DeviceParameterResult.Success.StringValue.m49boximpl(str);
        int i23 = getDeviceData;
        int i24 = i23 & 43;
        int i25 = ((i23 ^ 43) | i24) << 1;
        int i26 = -((i23 | 43) & (~i24));
        int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
        getSDKAppID = i27 % 128;
        if (i27 % 2 == 0) {
            int i28 = 41 / 0;
        }
        return stringValueM49boximpl;
    }

    private static DeviceParameterResult getSDKReferenceNumber(List<? extends String> list) {
        return (DeviceParameterResult) getSDKTransactionID(new Object[]{list}, -4128227, 4128227, (int) System.currentTimeMillis());
    }

    private static DeviceParameterResult getSDKReferenceNumber(String str) {
        return (DeviceParameterResult) getSDKTransactionID(new Object[]{str}, 895099559, -895099558, (int) System.currentTimeMillis());
    }
}
