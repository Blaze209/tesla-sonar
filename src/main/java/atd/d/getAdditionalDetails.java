package atd.d;

import p013kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/adyen/threeds2/internal/api/JsonResult;", "T", "", "EmptyOrNull", "InvalidFormat", "NotPresent", "Valid", "Lcom/adyen/threeds2/internal/api/JsonResult$EmptyOrNull;", "Lcom/adyen/threeds2/internal/api/JsonResult$InvalidFormat;", "Lcom/adyen/threeds2/internal/api/JsonResult$NotPresent;", "Lcom/adyen/threeds2/internal/api/JsonResult$Valid;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface getAdditionalDetails<T> {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/threeds2/internal/api/JsonResult$NotPresent;", "Lcom/adyen/threeds2/internal/api/JsonResult;", "", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AuthenticationRequestParameters implements getAdditionalDetails {
        private static int AuthenticationRequestParameters = 1;
        private static int getDeviceData;
        public static final AuthenticationRequestParameters getSDKAppID = new AuthenticationRequestParameters();

        static {
            int i11 = getDeviceData;
            int i12 = i11 & 87;
            AuthenticationRequestParameters = ((i12 - (~((i11 ^ 87) | i12))) - 1) % 128;
        }

        private AuthenticationRequestParameters() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0003\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/adyen/threeds2/internal/api/JsonResult$Valid;", "T", "Lcom/adyen/threeds2/internal/api/JsonResult;", "value", "<init>", "(Ljava/lang/Object;)V", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getDeviceData<T> implements getAdditionalDetails<T> {
        private static int getDeviceData = 0;
        private static int getSDKTransactionID = 1;
        private final T getSDKReferenceNumber;

        public getDeviceData(T t11) {
            this.getSDKReferenceNumber = t11;
        }

        private static /* synthetic */ Object getDeviceData(Object[] objArr) {
            getDeviceData getdevicedata = (getDeviceData) objArr[0];
            int i11 = getDeviceData;
            int i12 = ((i11 & (-74)) | ((~i11) & 73)) + ((i11 & 73) << 1);
            getSDKTransactionID = i12 % 128;
            int i13 = i12 % 2;
            T t11 = getdevicedata.getSDKReferenceNumber;
            if (i13 != 0) {
                return t11;
            }
            throw null;
        }

        public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
            return getDeviceData(objArr);
        }

        public final T getDeviceData() {
            return (T) getSDKAppID(new Object[]{this}, -825152795, 825152795, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/threeds2/internal/api/JsonResult$InvalidFormat;", "Lcom/adyen/threeds2/internal/api/JsonResult;", "", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID implements getAdditionalDetails {
        public static final getSDKAppID AuthenticationRequestParameters = new getSDKAppID();
        private static int getDeviceData = 0;
        private static int getSDKAppID = 1;

        static {
            int i11 = getDeviceData;
            int i12 = ((i11 ^ 113) | (i11 & 113)) << 1;
            int i13 = -(((~i11) & 113) | (i11 & (-114)));
            getSDKAppID = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        }

        private getSDKAppID() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adyen/threeds2/internal/api/JsonResult$EmptyOrNull;", "Lcom/adyen/threeds2/internal/api/JsonResult;", "", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKReferenceNumber implements getAdditionalDetails {
        public static final getSDKReferenceNumber getDeviceData = new getSDKReferenceNumber();
        private static int getSDKReferenceNumber = 0;
        private static int getSDKTransactionID = 1;

        static {
            int i11 = getSDKTransactionID;
            int i12 = i11 ^ 85;
            getSDKReferenceNumber = ((((i11 & 85) | i12) << 1) - i12) % 128;
        }

        private getSDKReferenceNumber() {
        }
    }
}
