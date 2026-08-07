package atd.as;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.adyen.threeds2.Warning;
import p013kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH$J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\u000bR\u0012\u0010\u0004\u001a\u00020\u0005X¤\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, d2 = {"Lcom/adyen/threeds2/internal/security/SecurityCheck;", "", "<init>", "()V", "warning", "Lcom/adyen/threeds2/Warning;", "getWarning", "()Lcom/adyen/threeds2/Warning;", "shouldWarn", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "generateWarning", "threeds2_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class getDeviceData {
    private static int getDeviceData = 0;
    private static int getSDKTransactionID = 1;

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        return getSDKTransactionID(objArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004f, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        r6 = atd.as.getDeviceData.getDeviceData;
        r0 = r6 & 65;
        r0 = r0 + ((r6 ^ 65) | r0);
        atd.as.getDeviceData.getSDKTransactionID = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        if ((r0 % 2) == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r1.AuthenticationRequestParameters(r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r1.AuthenticationRequestParameters(r6) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        r6 = r1.getDeviceData();
        r0 = atd.as.getDeviceData.getDeviceData;
        r1 = r0 & 35;
        r0 = -(-((r0 ^ 35) | r1));
        atd.as.getDeviceData.getSDKTransactionID = ((r1 & r0) + (r0 | r1)) % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ java.lang.Object getSDKTransactionID(java.lang.Object[] r6) {
        /*
            r0 = 0
            r1 = r6[r0]
            atd.as.getDeviceData r1 = (atd.as.getDeviceData) r1
            r2 = 1
            r6 = r6[r2]
            android.content.Context r6 = (android.content.Context) r6
            int r3 = atd.as.getDeviceData.getDeviceData
            r4 = r3 ^ 7
            r5 = r3 & 7
            r4 = r4 | r5
            int r4 = r4 << r2
            int r5 = ~r5
            r3 = r3 | 7
            r3 = r3 & r5
            int r3 = -r3
            int r3 = ~r3
            int r4 = r4 - r3
            int r4 = r4 - r2
            int r2 = r4 % 128
            atd.as.getDeviceData.getSDKTransactionID = r2
            int r4 = r4 % 2
            java.lang.String r2 = ""
            if (r4 != 0) goto L31
            p013kotlin.jvm.internal.s.k(r6, r2)
            boolean r6 = r1.AuthenticationRequestParameters(r6)
            r2 = 68
            int r2 = r2 / r0
            if (r6 == 0) goto L50
            goto L3a
        L31:
            p013kotlin.jvm.internal.s.k(r6, r2)
            boolean r6 = r1.AuthenticationRequestParameters(r6)
            if (r6 == 0) goto L50
        L3a:
            com.adyen.threeds2.Warning r6 = r1.getDeviceData()
            int r0 = atd.as.getDeviceData.getDeviceData
            r1 = r0 & 35
            r0 = r0 ^ 35
            r0 = r0 | r1
            int r0 = -r0
            int r0 = -r0
            r2 = r1 & r0
            r0 = r0 | r1
            int r2 = r2 + r0
            int r2 = r2 % 128
            atd.as.getDeviceData.getSDKTransactionID = r2
            return r6
        L50:
            int r6 = atd.as.getDeviceData.getDeviceData
            r0 = r6 & 65
            r6 = r6 ^ 65
            r6 = r6 | r0
            int r0 = r0 + r6
            int r6 = r0 % 128
            atd.as.getDeviceData.getSDKTransactionID = r6
            int r0 = r0 % 2
            r6 = 0
            if (r0 == 0) goto L62
            return r6
        L62:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.as.getDeviceData.getSDKTransactionID(java.lang.Object[]):java.lang.Object");
    }

    protected abstract boolean AuthenticationRequestParameters(Context context);

    protected abstract Warning getDeviceData();

    public final Warning getSDKTransactionID(Context context) {
        return (Warning) getSDKAppID(new Object[]{this, context}, -1689566357, 1689566357, System.identityHashCode(this));
    }
}
