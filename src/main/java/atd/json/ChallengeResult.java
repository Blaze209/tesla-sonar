package atd.json;

/* JADX INFO: loaded from: classes3.dex */
public final class ChallengeResult {
    private static int getSDKAppID = 1;
    private static int getSDKTransactionID;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x002e, code lost:
    
        if (r3.equals(r2) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ java.lang.Object AuthenticationRequestParameters(java.lang.Object[] r2, int r3, int r4, int r5) {
        /*
            r3 = 0
            r3 = r2[r3]
            r4 = 1
            r2 = r2[r4]
            int r5 = atd.json.ChallengeResult.getSDKTransactionID
            int r5 = r5 + 59
            int r5 = r5 % 128
            atd.json.ChallengeResult.getSDKAppID = r5
            if (r3 == r2) goto L40
            java.lang.System.currentTimeMillis()
            java.lang.System.currentTimeMillis()
            if (r3 == 0) goto L31
            int r5 = atd.json.ChallengeResult.getSDKTransactionID
            r0 = r5 & 21
            r5 = r5 ^ 21
            r5 = r5 | r0
            int r5 = -r5
            int r5 = -r5
            r1 = r0 ^ r5
            r5 = r5 & r0
            int r5 = r5 << r4
            int r1 = r1 + r5
            int r1 = r1 % 128
            atd.json.ChallengeResult.getSDKAppID = r1
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L31
            goto L40
        L31:
            int r2 = atd.json.ChallengeResult.getSDKAppID
            r3 = r2 | 31
            int r3 = r3 << r4
            r2 = r2 ^ 31
            int r3 = r3 - r2
            int r3 = r3 % 128
            atd.json.ChallengeResult.getSDKTransactionID = r3
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            return r2
        L40:
            int r2 = atd.json.ChallengeResult.getSDKTransactionID
            r3 = r2 | 73
            int r5 = r3 << 1
            r2 = r2 & 73
            int r2 = ~r2
            r2 = r2 & r3
            int r2 = -r2
            r3 = r5 ^ r2
            r2 = r2 & r5
            int r2 = r2 << r4
            int r3 = r3 + r2
            int r3 = r3 % 128
            atd.json.ChallengeResult.getSDKAppID = r3
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.json.ChallengeResult.AuthenticationRequestParameters(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static boolean AuthenticationRequestParameters(Object obj, Object obj2) {
        return ((Boolean) AuthenticationRequestParameters(new Object[]{obj, obj2}, 931709424, -931709424, (int) System.currentTimeMillis())).booleanValue();
    }
}
