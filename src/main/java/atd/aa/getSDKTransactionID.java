package atd.aa;

import android.app.Application;
import android.os.Process;
import ezvcard.property.Kind;
import p013kotlin.Metadata;
import p013kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/Is5GhzBandSupported;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiDeviceParameter;", "Landroid/app/Application;", Kind.APPLICATION, "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;", "fiveGhzBand", "<init>", "(Landroid/app/Application;Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;)V", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "getDeviceParameterResult", "()Lcom/adyen/threeds2/internal/deviceinfo/parameter/DeviceParameterResult;", "Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/WifiFeatureSupport;", "Companion", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSDKTransactionID extends ChallengeResultKt {
    private static int AuthenticationRequestParameters = 0;
    private static int BuildConfig = 1;
    private static boolean getDeviceData;
    private static int getMessageVersion;
    private static char[] getSDKAppID;
    private static boolean getSDKTransactionID;
    private final runtimeError getSDKReferenceNumber;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/adyen/threeds2/internal/deviceinfo/parameter/wifi/Is5GhzBandSupported$Companion;", "", "<init>", "()V", "IDENTIFIER", "", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class getSDKAppID {
        private getSDKAppID() {
        }

        public /* synthetic */ getSDKAppID(byte b11) {
            this();
        }
    }

    static {
        getSDKReferenceNumber();
        Process.getThreadPriority(0);
        new getSDKAppID((byte) 0);
        BuildConfig = (getMessageVersion + 23) % 128;
    }

    public /* synthetic */ getSDKTransactionID(Application application) {
        this(application, new atd.aa.getSDKAppID(application));
    }

    static void getSDKReferenceNumber() {
        getSDKAppID = new char[]{64835, 64850, 64849, 64848};
        AuthenticationRequestParameters = -185467518;
        getSDKTransactionID = true;
        getDeviceData = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if ((r1 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r1 = 38 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        return new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m14boximpl(com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m15constructorimpl(r0.booleanValue()));
        r1 = atd.aa.getSDKTransactionID.getMessageVersion + 33;
        atd.aa.getSDKTransactionID.BuildConfig = r1 % 128;
     */
    @Override // com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult getDeviceData() {
        /*
            r3 = this;
            int r0 = atd.aa.getSDKTransactionID.BuildConfig
            int r0 = r0 + 45
            int r1 = r0 % 128
            atd.aa.getSDKTransactionID.getMessageVersion = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L19
            atd.aa.runtimeError r0 = r3.getSDKReferenceNumber
            java.lang.Boolean r0 = r0.AuthenticationRequestParameters()
            r1 = 45
            int r1 = r1 / 0
            if (r0 == 0) goto L3e
            goto L21
        L19:
            atd.aa.runtimeError r0 = r3.getSDKReferenceNumber
            java.lang.Boolean r0 = r0.AuthenticationRequestParameters()
            if (r0 == 0) goto L3e
        L21:
            boolean r0 = r0.booleanValue()
            boolean r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m15constructorimpl(r0)
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Success$BooleanValue r0 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Success.BooleanValue.m14boximpl(r0)
            int r1 = atd.aa.getSDKTransactionID.getMessageVersion
            int r1 = r1 + 33
            int r2 = r1 % 128
            atd.aa.getSDKTransactionID.BuildConfig = r2
            int r1 = r1 % 2
            if (r1 != 0) goto L3d
            r1 = 38
            int r1 = r1 / 0
        L3d:
            return r0
        L3e:
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure r0 = new com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure
            com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult$Failure$Reason r1 = com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult.Failure.Reason.NULL_OR_BLANK
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.aa.getSDKTransactionID.getDeviceData():com.adyen.threeds2.internal.deviceinfo.parameter.DeviceParameterResult");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private getSDKTransactionID(Application application, runtimeError runtimeerror) {
        super(application);
        s.k(application, "");
        s.k(runtimeerror, "");
        this.getSDKReferenceNumber = runtimeerror;
    }
}
