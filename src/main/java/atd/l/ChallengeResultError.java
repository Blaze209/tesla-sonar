package atd.l;

import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult;", "", "Success", "Failure", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Failure$EmptyOrNull;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Failure$MissingPermissions;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Success;", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ChallengeResultError {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Success;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult;", "field", "", "<init>", "(D)V", "getField", "()D", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID implements ChallengeResultError {
        private static int AuthenticationRequestParameters = 0;
        private static int getDeviceData = 1;
        private final double getSDKAppID;

        public getSDKAppID(double d11) {
            this.getSDKAppID = d11;
        }

        public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
            getSDKAppID getsdkappid = (getSDKAppID) objArr[0];
            int i14 = getDeviceData;
            int i15 = i14 & 107;
            int i16 = (i14 | 107) & (~i15);
            int i17 = i15 << 1;
            int i18 = ((i16 ^ i17) + ((i16 & i17) << 1)) % 128;
            AuthenticationRequestParameters = i18;
            double d11 = getsdkappid.getSDKAppID;
            getDeviceData = (((i18 & 100) + (i18 | 100)) - 1) % 128;
            return Double.valueOf(d11);
        }

        public final double getSDKTransactionID() {
            return ((Double) getDeviceData(new Object[]{this}, -1630442064, 1630442064, System.identityHashCode(this))).doubleValue();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Failure;", "", "<init>", "()V", "EmptyOrNull", "MissingPermissions", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKTransactionID {
        private static int getSDKAppID = 0;
        private static int getSDKTransactionID = 1;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Failure$MissingPermissions;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult;", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class getSDKAppID implements ChallengeResultError {
            public static final getSDKAppID getDeviceData = new getSDKAppID();
            private static int getSDKReferenceNumber = 1;
            private static int getSDKTransactionID;

            static {
                int i11 = getSDKReferenceNumber;
                int i12 = (i11 & (-58)) | ((~i11) & 57);
                int i13 = (i11 & 57) << 1;
                int i14 = (i12 & i13) + (i13 | i12);
                getSDKTransactionID = i14 % 128;
                if (i14 % 2 != 0) {
                    int i15 = 25 / 0;
                }
            }

            private getSDKAppID() {
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult$Failure$EmptyOrNull;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/common/LocationResult;", "<init>", "()V", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class getSDKReferenceNumber implements ChallengeResultError {
            private static int AuthenticationRequestParameters = 0;
            private static int getDeviceData = 1;
            public static final getSDKReferenceNumber getSDKTransactionID = new getSDKReferenceNumber();

            static {
                int i11 = getDeviceData + 23;
                AuthenticationRequestParameters = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            }

            private getSDKReferenceNumber() {
            }
        }

        static {
            new getSDKTransactionID();
            int i11 = getSDKAppID;
            getSDKTransactionID = ((((i11 | 46) << 1) - (i11 ^ 46)) - 1) % 128;
        }

        private getSDKTransactionID() {
        }
    }
}
