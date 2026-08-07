package atd.a;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import atd.ai.getSDKEphemeralPublicKey;
import atd.az.ChallengeResultCompleted;
import atd.json.ChallengeResultTimeout;
import ch.qos.logback.core.CoreConstants;
import com.adyen.threeds2.ChallengeStatusHandler;
import com.adyen.threeds2.ChallengeStatusReceiver;
import com.adyen.threeds2.CompletionEvent;
import com.adyen.threeds2.ProgressDialog;
import com.adyen.threeds2.ProtocolErrorEvent;
import com.adyen.threeds2.RuntimeErrorEvent;
import com.adyen.threeds2.Transaction;
import com.adyen.threeds2.exception.SDKRuntimeException;
import com.adyen.threeds2.internal.ui.activity.ChallengeActivity;
import com.adyen.threeds2.parameters.ChallengeParameters;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
import com.plaid.internal.EnumC4419g;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.http2.Http2Connection;
import org.json.JSONException;
import org.json.JSONObject;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes3.dex */
public final class getAdditionalDetails implements getDeviceData, Transaction {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static int[] BuildConfig;
    private static int ChallengeResultCancelled;
    private static int getMessageVersion;
    private ChallengeStatusReceiver AuthenticationRequestParameters;
    private atd.d.getSDKTransactionID ChallengeResult;
    private atd.af.getDeviceData getDeviceData;
    private WeakReference<Activity> getSDKAppID;
    private atd.au.getSDKAppID getSDKEphemeralPublicKey;
    private com.adyen.threeds2.AuthenticationRequestParameters getSDKReferenceNumber;
    private List<X509Certificate> getSDKTransactionID;

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        ChallengeResultCancelled = 0;
        getMessageVersion = 1;
        getDeviceData();
        ExpandableListView.getPackedPositionForChild(0, 0);
        ChallengeResultCancelled = (getMessageVersion + 117) % 128;
    }

    public getAdditionalDetails(List<X509Certificate> list, atd.af.getDeviceData getdevicedata, com.adyen.threeds2.AuthenticationRequestParameters authenticationRequestParameters) {
        this.getSDKTransactionID = list;
        this.getDeviceData = getdevicedata;
        this.getSDKReferenceNumber = authenticationRequestParameters;
    }

    /* JADX WARN: Failed to calculate best type for var: r3v223 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v223 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v224 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v224 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v257 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v257 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v121 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v121 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v121 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v121 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v122 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v122 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v94 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v94 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v121 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    private static /* synthetic */ java.lang.Object AuthenticationRequestParameters(java.lang.Object[] r49) {
        /*
            Method dump skipped, instruction units count: 5080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.getAdditionalDetails.AuthenticationRequestParameters(java.lang.Object[]):java.lang.Object");
    }

    private static Intent a_(Activity activity) {
        int i11 = getMessageVersion + 95;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            ChallengeActivity.da_(activity);
            throw null;
        }
        Intent intentDa_ = ChallengeActivity.da_(activity);
        int i12 = ChallengeResultCancelled + 121;
        getMessageVersion = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 1 / 0;
        }
        return intentDa_;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r0 = atd.a.getAdditionalDetails.$$a
            int r7 = r7 * 2
            int r7 = r7 + 11
            int r8 = r8 + 65
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r6]
        L26:
            int r6 = r6 + 1
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + 2
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.getAdditionalDetails.b(short, short, int, java.lang.Object[]):void");
    }

    private static Intent b_(Activity activity, atd.e.getSDKTransactionID getsdktransactionid) {
        getMessageVersion = (ChallengeResultCancelled + 61) % 128;
        Intent intentDb_ = ChallengeActivity.db_(activity, getsdktransactionid);
        getMessageVersion = (ChallengeResultCancelled + 79) % 128;
        return intentDb_;
    }

    private static void c(int[] iArr, int i11, Object[] objArr) throws Throwable {
        char[] cArr;
        int i12;
        Object method;
        ChallengeResultCompleted challengeResultCompleted = new ChallengeResultCompleted();
        char[] cArr2 = new char[4];
        int i13 = 2;
        char[] cArr3 = new char[iArr.length * 2];
        int[] iArr2 = BuildConfig;
        Class cls = Integer.TYPE;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i14 = 0;
            while (i14 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i14])};
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(2050190164);
                    if (obj != null) {
                        method = obj;
                    } else {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 1863, (char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 21);
                        byte b11 = (byte) 0;
                        byte b12 = (byte) (b11 + 3);
                        Object[] objArr3 = new Object[1];
                        d(b11, b12, (byte) (b12 - 3), objArr3);
                        method = cls2.getMethod((String) objArr3[0], cls);
                        map.put(2050190164, method);
                    }
                    iArr3[i14] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    i14++;
                    cArr2 = cArr2;
                    iArr3 = iArr3;
                    iArr2 = iArr2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
            i12 = 16;
            $11 = ($10 + 21) % 128;
            iArr2 = iArr3;
        } else {
            cArr = cArr2;
            i12 = 16;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = BuildConfig;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i15 = 0;
            while (i15 < length3) {
                Object[] objArr4 = {Integer.valueOf(iArr5[i15])};
                Map map2 = getMessageVersion.timedout;
                Object method2 = map2.get(2050190164);
                if (method2 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + 1862, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 21 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 3);
                    Object[] objArr5 = new Object[1];
                    d(b13, b14, (byte) (b14 - 3), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], cls);
                    map2.put(2050190164, method2);
                }
                iArr6[i15] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                i15++;
                iArr5 = iArr5;
                length3 = length3;
                iArr6 = iArr6;
                cArr3 = cArr3;
            }
            iArr5 = iArr6;
        }
        char[] cArr4 = cArr3;
        char c11 = 0;
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        challengeResultCompleted.getDeviceData = 0;
        while (true) {
            int i16 = challengeResultCompleted.getDeviceData;
            if (i16 >= iArr.length) {
                objArr[0] = new String(cArr4, 0, i11);
                return;
            }
            int i17 = iArr[i16];
            char c12 = (char) (i17 >> 16);
            cArr[c11] = c12;
            char c13 = (char) i17;
            cArr[1] = c13;
            char c14 = (char) (iArr[i16 + 1] >> 16);
            cArr[i13] = c14;
            char c15 = (char) iArr[i16 + 1];
            char c16 = 3;
            cArr[3] = c15;
            challengeResultCompleted.getSDKAppID = (c12 << 16) + c13;
            challengeResultCompleted.getSDKReferenceNumber = (c14 << 16) + c15;
            ChallengeResultCompleted.getSDKAppID(iArr4);
            $11 = ($10 + 75) % 128;
            int i18 = 0;
            while (i18 < i12) {
                int i19 = challengeResultCompleted.getSDKAppID ^ iArr4[i18];
                challengeResultCompleted.getSDKAppID = i19;
                int sDKAppID = ChallengeResultCompleted.getSDKAppID(i19);
                Object[] objArr6 = new Object[4];
                objArr6[c16] = challengeResultCompleted;
                objArr6[i13] = challengeResultCompleted;
                objArr6[1] = Integer.valueOf(sDKAppID);
                objArr6[0] = challengeResultCompleted;
                Map map3 = getMessageVersion.timedout;
                Object method3 = map3.get(929629307);
                if (method3 == null) {
                    Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1299 - View.resolveSize(0, 0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + CipherSuite.TLS_PSK_WITH_AES_256_CCM_8), 33 - Color.green(0));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    d(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, cls, Object.class, Object.class);
                    map3.put(929629307, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                challengeResultCompleted.getSDKAppID = challengeResultCompleted.getSDKReferenceNumber;
                challengeResultCompleted.getSDKReferenceNumber = iIntValue;
                i18++;
                $10 = ($11 + 37) % 128;
                c16 = c16;
                i12 = 16;
            }
            char c17 = c16;
            int i21 = challengeResultCompleted.getSDKAppID;
            int i22 = challengeResultCompleted.getSDKReferenceNumber;
            challengeResultCompleted.getSDKAppID = i22;
            challengeResultCompleted.getSDKReferenceNumber = i21;
            int i23 = i21 ^ iArr4[16];
            challengeResultCompleted.getSDKReferenceNumber = i23;
            int i24 = i22 ^ iArr4[17];
            challengeResultCompleted.getSDKAppID = i24;
            cArr[0] = (char) (i24 >>> 16);
            cArr[1] = (char) i24;
            cArr[i13] = (char) (i23 >>> 16);
            cArr[c17] = (char) i23;
            ChallengeResultCompleted.getSDKAppID(iArr4);
            int i25 = challengeResultCompleted.getDeviceData;
            cArr4[i25 * 2] = cArr[0];
            cArr4[(i25 * 2) + 1] = cArr[1];
            cArr4[(i25 * 2) + 2] = cArr[i13];
            cArr4[(i25 * 2) + 3] = cArr[c17];
            Object[] objArr8 = new Object[i13];
            objArr8[1] = challengeResultCompleted;
            objArr8[0] = challengeResultCompleted;
            Map map4 = getMessageVersion.timedout;
            Object method4 = map4.get(1109131256);
            if (method4 != null) {
                i12 = 16;
            } else {
                i12 = 16;
                Class cls5 = (Class) getMessageVersion.getSDKTransactionID(2061 - Gravity.getAbsoluteGravity(0, 0), (char) ((Process.getThreadPriority(0) + 20) >> 6), 17 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                byte b17 = (byte) 0;
                byte b18 = (byte) (b17 + 1);
                Object[] objArr9 = new Object[1];
                d(b17, b18, (byte) (b18 - 1), objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(1109131256, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            c11 = 0;
            i13 = 2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:43:0x03db  */
    /* JADX WARN: Code duplicated, block: B:44:0x03dc A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:9:0x010a, B:13:0x014c, B:14:0x0152, B:41:0x03c7, B:45:0x0407, B:44:0x03dc, B:50:0x0476, B:54:0x04b7, B:53:0x048d, B:12:0x0121, B:19:0x0193, B:23:0x01d3, B:22:0x01aa), top: B:75:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x040e  */
    /* JADX WARN: Code duplicated, block: B:52:0x048c  */
    /* JADX WARN: Code duplicated, block: B:53:0x048d A[Catch: all -> 0x0156, TryCatch #2 {all -> 0x0156, blocks: (B:9:0x010a, B:13:0x014c, B:14:0x0152, B:41:0x03c7, B:45:0x0407, B:44:0x03dc, B:50:0x0476, B:54:0x04b7, B:53:0x048d, B:12:0x0121, B:19:0x0193, B:23:0x01d3, B:22:0x01aa), top: B:75:0x0072 }] */
    private Intent c_(Activity activity) throws Throwable {
        int i11;
        Context applicationContext;
        int iIntValue;
        Object[] objArr;
        int i12;
        int i13;
        Map map;
        Object method;
        Map map2;
        Object method2;
        Object objInvoke;
        Class cls = (Class) getMessageVersion.getSDKTransactionID(663 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 25 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
        byte[] bArr = $$a;
        byte b11 = bArr[21];
        Object[] objArr2 = new Object[1];
        b(b11, b11, bArr[46], objArr2);
        long j11 = cls.getField((String) objArr2[0]).getLong(null);
        Class cls2 = Integer.TYPE;
        try {
            try {
                if (j11 != -1) {
                    long j12 = j11 + 2036;
                    i11 = 2;
                    Object[] objArr3 = new Object[1];
                    c(new int[]{1698694749, 2050588183, -457991778, -901528728, 1362074750, -823634289, 834510529, 699939542, 1308112024, 2019570505, -1412729764, -2009724205}, 22 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr3);
                    Class<?> cls3 = Class.forName(((String) objArr3[0]).intern());
                    Object[] objArr4 = new Object[1];
                    c(new int[]{-846248326, 940348925, 699608375, -1994483524, 1336578455, -1573688416, -1184665217, 82974096}, Color.green(0) + 15, objArr4);
                    if (j12 >= ((Long) cls3.getDeclaredMethod(((String) objArr4[0]).intern(), null).invoke(null, null)).longValue()) {
                        int i14 = getMessageVersion + 51;
                        ChallengeResultCancelled = i14 % 128;
                        if (i14 % 2 != 0) {
                            Class cls4 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getDoubleTapTimeout() >> 16) + 664, (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 26);
                            Object[] objArr5 = new Object[1];
                            b(bArr[29], bArr[45], bArr[46], objArr5);
                            Object[] objArr6 = {cls4.getField((String) objArr5[0]).get(null), 58573006, 0};
                            Map map3 = getMessageVersion.timedout;
                            Object method3 = map3.get(1046315470);
                            if (method3 == null) {
                                method3 = ((Class) getMessageVersion.getSDKTransactionID(2802 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 64314), 27 - TextUtils.lastIndexOf("", '0', 0, 0))).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                                map3.put(1046315470, method3);
                            }
                            objInvoke = ((Method) method3).invoke(null, objArr6);
                        } else {
                            Class cls5 = (Class) getMessageVersion.getSDKTransactionID(ImageFormat.getBitsPerPixel(0) + 665, (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 25 - (KeyEvent.getMaxKeyCode() >> 16));
                            byte b12 = bArr[29];
                            byte b13 = bArr[45];
                            byte b14 = bArr[46];
                            Object[] objArr7 = new Object[1];
                            b(b12, b13, b14, objArr7);
                            Object[] objArr8 = {cls5.getField((String) objArr7[0]).get(null), 58573006, 0};
                            Map map4 = getMessageVersion.timedout;
                            Object method4 = map4.get(1046315470);
                            if (method4 == null) {
                                method4 = ((Class) getMessageVersion.getSDKTransactionID(2802 - (ViewConfiguration.getLongPressTimeout() >> 16), (char) (TextUtils.getCapsMode("", 0, 0) + 64314), 28 - (ViewConfiguration.getFadingEdgeLength() >> 16))).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                                map4.put(1046315470, method4);
                            }
                            objInvoke = ((Method) method4).invoke(null, objArr8);
                        }
                        objArr = (Object[]) objInvoke;
                    }
                    i12 = ((int[]) objArr[1])[0];
                    i13 = ((int[]) objArr[0])[0];
                    if (i13 == i12) {
                        int i15 = ((int[]) objArr[3])[0];
                        Object[] objArr9 = new Object[3];
                        objArr9[i11] = 0;
                        objArr9[1] = Integer.valueOf(i15);
                        objArr9[0] = objArr;
                        map2 = getMessageVersion.timedout;
                        method2 = map2.get(1046315470);
                        if (method2 != null) {
                            method2 = ((Class) getMessageVersion.getSDKTransactionID(2802 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (64314 - (ViewConfiguration.getEdgeSlop() >> 16)), 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                            map2.put(1046315470, method2);
                        }
                        ((Method) method2).invoke(null, objArr9);
                    } else {
                        long j13 = ((long) (i12 ^ i13)) ^ (-5357280379529068544L);
                        try {
                            Object[] objArr10 = new Object[i11];
                            objArr10[1] = -1247339035L;
                            objArr10[0] = Long.valueOf(j13);
                            byte[] bArr2 = $$d;
                            Object[] objArr11 = new Object[1];
                            a((short) 520, bArr2[206], bArr2[68], objArr11);
                            Class<?> cls6 = Class.forName((String) objArr11[0]);
                            Object[] objArr12 = new Object[1];
                            a((short) 597, (byte) (-bArr2[199]), bArr2[29], objArr12);
                            String str = (String) objArr12[0];
                            Class cls7 = Long.TYPE;
                            cls6.getMethod(str, cls7, cls7).invoke(null, objArr10);
                            Object[] objArr13 = {objArr, Integer.valueOf(((int[]) objArr[3])[0]), 0};
                            map = getMessageVersion.timedout;
                            method = map.get(1046315470);
                            if (method != null) {
                                method = ((Class) getMessageVersion.getSDKTransactionID(2802 - View.MeasureSpec.getSize(0), (char) (64314 - ((Process.getThreadPriority(0) + 20) >> 6)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27)).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                                map.put(1046315470, method);
                            }
                            ((Method) method).invoke(null, objArr13);
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                    }
                    return ChallengeActivity.dc_(activity);
                }
                i11 = 2;
                Object[] objArr14 = new Object[3];
                objArr14[i11] = 58573006;
                objArr14[1] = Integer.valueOf(iIntValue);
                objArr14[0] = applicationContext;
                byte[] bArr3 = $$d;
                Object[] objArr15 = new Object[1];
                a((short) 579, (byte) (-bArr3[57]), bArr3[68], objArr15);
                Class<?> cls8 = Class.forName((String) objArr15[0]);
                Object[] objArr16 = new Object[1];
                a((short) 550, bArr3[173], bArr3[58], objArr16);
                Object[] objArr17 = (Object[]) cls8.getMethod((String) objArr16[0], Context.class, cls2, cls2).invoke(null, objArr14);
                if (applicationContext != null) {
                    Class cls9 = (Class) getMessageVersion.getSDKTransactionID(664 - View.resolveSize(0, 0), (char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 25);
                    Object[] objArr18 = new Object[1];
                    b(bArr[29], bArr[45], bArr[46], objArr18);
                    cls9.getField((String) objArr18[0]).set(null, objArr17);
                    try {
                        Object[] objArr19 = new Object[1];
                        c(new int[]{1698694749, 2050588183, -457991778, -901528728, 1362074750, -823634289, 834510529, 699939542, 1308112024, 2019570505, -1412729764, -2009724205}, KeyEvent.keyCodeFromString("") + 22, objArr19);
                        Class<?> cls10 = Class.forName(((String) objArr19[0]).intern());
                        Object[] objArr20 = new Object[1];
                        c(new int[]{-846248326, 940348925, 699608375, -1994483524, 1336578455, -1573688416, -1184665217, 82974096}, 15 - View.MeasureSpec.getSize(0), objArr20);
                        Long lValueOf = Long.valueOf(((Long) cls10.getDeclaredMethod(((String) objArr20[0]).intern(), null).invoke(null, null)).longValue());
                        Class cls11 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollDefaultDelay() >> 16) + 664, (char) TextUtils.getOffsetAfter("", 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 26);
                        byte b15 = bArr[21];
                        Object[] objArr21 = new Object[1];
                        b(b15, b15, bArr[46], objArr21);
                        cls11.getField((String) objArr21[0]).set(null, lValueOf);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr17;
                i12 = ((int[]) objArr[1])[0];
                i13 = ((int[]) objArr[0])[0];
                if (i13 == i12) {
                    int i16 = ((int[]) objArr[3])[0];
                    Object[] objArr22 = new Object[3];
                    objArr22[i11] = 0;
                    objArr22[1] = Integer.valueOf(i16);
                    objArr22[0] = objArr;
                    map2 = getMessageVersion.timedout;
                    method2 = map2.get(1046315470);
                    if (method2 != null) {
                        method2 = ((Class) getMessageVersion.getSDKTransactionID(2802 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (64314 - (ViewConfiguration.getEdgeSlop() >> 16)), 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16))).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                        map2.put(1046315470, method2);
                    }
                    ((Method) method2).invoke(null, objArr22);
                } else {
                    long j14 = ((long) (i12 ^ i13)) ^ (-5357280379529068544L);
                    Object[] objArr110 = new Object[i11];
                    objArr110[1] = -1247339035L;
                    objArr110[0] = Long.valueOf(j14);
                    byte[] bArr4 = $$d;
                    Object[] objArr111 = new Object[1];
                    a((short) 520, bArr4[206], bArr4[68], objArr111);
                    Class<?> cls12 = Class.forName((String) objArr111[0]);
                    Object[] objArr112 = new Object[1];
                    a((short) 597, (byte) (-bArr4[199]), bArr4[29], objArr112);
                    String str2 = (String) objArr112[0];
                    Class cls13 = Long.TYPE;
                    cls12.getMethod(str2, cls13, cls13).invoke(null, objArr110);
                    Object[] objArr113 = {objArr, Integer.valueOf(((int[]) objArr[3])[0]), 0};
                    map = getMessageVersion.timedout;
                    method = map.get(1046315470);
                    if (method != null) {
                        method = ((Class) getMessageVersion.getSDKTransactionID(2802 - View.MeasureSpec.getSize(0), (char) (64314 - ((Process.getThreadPriority(0) + 20) >> 6)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27)).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                        map.put(1046315470, method);
                    }
                    ((Method) method).invoke(null, objArr113);
                }
                return ChallengeActivity.dc_(activity);
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th3;
            }
            Object[] objArr23 = new Object[1];
            c(new int[]{1698694749, 2050588183, -457991778, -901528728, 817195746, 53710434, -351119689, -863152896, 134460595, -385560032, -1944164246, -842691740, -1851792335, 1506328281}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26, objArr23);
            Class<?> cls14 = Class.forName(((String) objArr23[0]).intern());
            Object[] objArr24 = new Object[1];
            c(new int[]{-1835255182, -1610659434, -1614285291, 457102511, 784845012, 603573056, -596228922, 2092248793, -147281931, 624053858}, 18 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr24);
            applicationContext = (Context) cls14.getMethod(((String) objArr24[0]).intern(), null).invoke(null, null);
            if (applicationContext != null) {
                ChallengeResultCancelled = (getMessageVersion + 61) % 128;
                applicationContext = applicationContext.getApplicationContext();
            }
            Object[] objArr25 = new Object[1];
            c(new int[]{-1003685156, -2124734130, 2093306490, 321888904, -2132043251, -1933089540, 48247998, -1123255394}, ((Process.getThreadPriority(0) + 20) >> 6) + 16, objArr25);
            Class<?> cls15 = Class.forName(((String) objArr25[0]).intern());
            Object[] objArr26 = new Object[1];
            c(new int[]{-1074854073, -1483825130, 7899879, -752894084, 1761197281, -65975081, -1793213686, -637169519}, (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr26);
            iIntValue = ((Integer) cls15.getMethod(((String) objArr26[0]).intern(), Object.class).invoke(null, this)).intValue();
            getMessageVersion = (ChallengeResultCancelled + 113) % 128;
        } catch (Throwable th4) {
            Throwable cause3 = th4.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = atd.a.getAdditionalDetails.$$g
            int r6 = 120 - r6
            int r5 = r5 * 2
            int r1 = 1 - r5
            int r7 = r7 * 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L16
            r3 = r5
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r3 = r0[r7]
        L28:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.getAdditionalDetails.d(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d_(DialogInterface dialogInterface) {
        int i11 = getMessageVersion;
        this.getSDKEphemeralPublicKey = null;
        ChallengeResultCancelled = (i11 + 41) % 128;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) throws Throwable {
        getAdditionalDetails getadditionaldetails = (getAdditionalDetails) objArr[0];
        atd.e.getSDKTransactionID getsdktransactionid = (atd.e.getSDKTransactionID) objArr[1];
        int i11 = getMessageVersion + 11;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            getadditionaldetails.getDeviceData(getsdktransactionid);
            int i12 = 0 / 0;
        } else {
            getadditionaldetails.getDeviceData(getsdktransactionid);
        }
        getMessageVersion = (ChallengeResultCancelled + 59) % 128;
        return null;
    }

    private Object getDeviceData$6866fd82(String str, atd.af.AuthenticationRequestParameters authenticationRequestParameters) throws Throwable {
        ChallengeResultCancelled = (getMessageVersion + 95) % 128;
        if (!(authenticationRequestParameters instanceof atd.af.getDeviceData)) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.getSDKTransactionID();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            Object[] objArr = new Object[1];
            c(new int[]{-1113342313, -1226680767}, (ViewConfiguration.getWindowTouchSlop() >> 8) + 3, objArr);
            jSONObject.put(((String) objArr[0]).intern(), str);
            getMessageVersion = (ChallengeResultCancelled + 37) % 128;
            getSDKEphemeralPublicKey getsdkephemeralpublickey = new getSDKEphemeralPublicKey(atd.ah.BuildConfig.getDeviceData, atd.ag.getSDKTransactionID.getSDKAppID, jSONObject);
            byte[] deviceData = this.getDeviceData.getDeviceData(this.getSDKReferenceNumber.getSDKReferenceNumber(), ((atd.af.getDeviceData) authenticationRequestParameters).getDeviceData());
            atd.af.getSDKReferenceNumber getsdkreferencenumber = new atd.af.getSDKReferenceNumber(null, deviceData);
            atd.json.JSONObject.getSDKAppID(new Object[]{jSONObject}, -1150790233, 1150790235, (int) System.currentTimeMillis());
            authenticationRequestParameters.getSDKTransactionID();
            Arrays.fill(deviceData, (byte) 0);
            try {
                try {
                    try {
                        Object[] objArr2 = {getsdkephemeralpublickey, getsdkephemeralpublickey.getSDKTransactionID().getSDKReferenceNumber(getsdkephemeralpublickey, getsdkreferencenumber), getsdkreferencenumber};
                        Map map = getMessageVersion.timedout;
                        Object declaredConstructor = map.get(-1730172936);
                        if (declaredConstructor == null) {
                            declaredConstructor = ((Class) getMessageVersion.getSDKTransactionID(Drawable.resolveOpacity(0, 0) + 171, (char) (View.getDefaultSize(0, 0) + 10255), 30 - View.getDefaultSize(0, 0))).getDeclaredConstructor(getSDKEphemeralPublicKey.class, atd.ag.getDeviceData.class, atd.af.AuthenticationRequestParameters.class);
                            map.put(-1730172936, declaredConstructor);
                        }
                        Object objNewInstance = ((Constructor) declaredConstructor).newInstance(objArr2);
                        getsdkreferencenumber.getSDKTransactionID();
                        return objNewInstance;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th2;
                    }
                } catch (JSONException unused) {
                    throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
                }
            } catch (Throwable th3) {
                getsdkreferencenumber.getSDKTransactionID();
                throw th3;
            }
        } catch (JSONException unused2) {
            throw atd.ad.AuthenticationRequestParameters.CRYPTO_FAILURE.AuthenticationRequestParameters();
        }
    }

    private Activity getSDKAppID() {
        WeakReference<Activity> weakReference = this.getSDKAppID;
        if (weakReference == null) {
            getMessageVersion = (ChallengeResultCancelled + 3) % 128;
            return null;
        }
        Activity activity = weakReference.get();
        getMessageVersion = (ChallengeResultCancelled + 55) % 128;
        return activity;
    }

    private ChallengeStatusReceiver getSDKEphemeralPublicKey() {
        int i11 = (getMessageVersion + 83) % 128;
        ChallengeResultCancelled = i11;
        ChallengeStatusReceiver challengeStatusReceiver = this.AuthenticationRequestParameters;
        if (challengeStatusReceiver == null) {
            throw atd.ad.AuthenticationRequestParameters.CHALLENGE_PRESENTATION_FAILURE.getSDKTransactionID();
        }
        getMessageVersion = (i11 + 41) % 128;
        return challengeStatusReceiver;
    }

    public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) throws Throwable {
        int i14 = ~i12;
        int i15 = ~i13;
        int i16 = (i11 * 989) + (i12 * (-987)) + (((~(i14 | i15 | i11)) | (~(i11 | i12 | i13))) * 988) + ((i11 | i14) * (-988)) + (((~(i11 | i15 | i12)) | (~(i13 | i14)) | (~((~i11) | i14))) * 988);
        if (i16 == 1) {
            return AuthenticationRequestParameters(objArr);
        }
        if (i16 != 2) {
            return i16 != 3 ? getDeviceData(objArr) : getSDKTransactionID(objArr);
        }
        final getAdditionalDetails getadditionaldetails = (getAdditionalDetails) objArr[0];
        Activity activity = (Activity) objArr[1];
        ChallengeResultCancelled = (getMessageVersion + 37) % 128;
        atd.json.BuildConfig.getSDKTransactionID(activity, atd.ad.getDeviceData.CURRENT_ACTIVITY);
        if (getadditionaldetails.getSDKEphemeralPublicKey == null) {
            getadditionaldetails.getSDKEphemeralPublicKey = new atd.au.getSDKAppID(activity, new DialogInterface.OnDismissListener() { // from class: atd.a.a
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f14995a.d_(dialogInterface);
                }
            });
            ChallengeResultCancelled = (getMessageVersion + 29) % 128;
        }
        return getadditionaldetails.getSDKEphemeralPublicKey;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x091b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0973  */
    /* JADX WARN: Code duplicated, block: B:105:0x0974 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:109:0x09ab  */
    /* JADX WARN: Code duplicated, block: B:111:0x09f5  */
    /* JADX WARN: Code duplicated, block: B:115:0x0a67  */
    /* JADX WARN: Code duplicated, block: B:120:0x0af3  */
    /* JADX WARN: Code duplicated, block: B:124:0x0b09  */
    /* JADX WARN: Code duplicated, block: B:126:0x0b17  */
    /* JADX WARN: Code duplicated, block: B:129:0x0b37  */
    /* JADX WARN: Code duplicated, block: B:130:0x0b38 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0b88  */
    /* JADX WARN: Code duplicated, block: B:137:0x0b89 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:140:0x0bb7  */
    /* JADX WARN: Code duplicated, block: B:145:0x0c36  */
    /* JADX WARN: Code duplicated, block: B:146:0x0c37 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0ca3  */
    /* JADX WARN: Code duplicated, block: B:152:0x0cc4  */
    /* JADX WARN: Code duplicated, block: B:155:0x0d1c  */
    /* JADX WARN: Code duplicated, block: B:156:0x0d1d A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:159:0x0d54  */
    /* JADX WARN: Code duplicated, block: B:166:0x0e4a  */
    /* JADX WARN: Code duplicated, block: B:169:0x0e67  */
    /* JADX WARN: Code duplicated, block: B:170:0x0e68 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:173:0x0e9a  */
    /* JADX WARN: Code duplicated, block: B:178:0x0f26  */
    /* JADX WARN: Code duplicated, block: B:179:0x0f27 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:201:0x10cf  */
    /* JADX WARN: Code duplicated, block: B:203:0x111e  */
    /* JADX WARN: Code duplicated, block: B:207:0x1182  */
    /* JADX WARN: Code duplicated, block: B:209:0x1190  */
    /* JADX WARN: Code duplicated, block: B:213:0x1224  */
    /* JADX WARN: Code duplicated, block: B:220:0x12b5  */
    /* JADX WARN: Code duplicated, block: B:223:0x12d2  */
    /* JADX WARN: Code duplicated, block: B:224:0x12d3 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:227:0x1305  */
    /* JADX WARN: Code duplicated, block: B:232:0x1382  */
    /* JADX WARN: Code duplicated, block: B:233:0x1383 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:237:0x1402  */
    /* JADX WARN: Code duplicated, block: B:238:0x140f  */
    /* JADX WARN: Code duplicated, block: B:242:0x1448  */
    /* JADX WARN: Code duplicated, block: B:243:0x144a A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:248:0x14cc  */
    /* JADX WARN: Code duplicated, block: B:249:0x14cd A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:30:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:31:0x02e8 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0330  */
    /* JADX WARN: Code duplicated, block: B:35:0x0332 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:39:0x037d A[Catch: all -> 0x156e, TRY_ENTER, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0387  */
    /* JADX WARN: Code duplicated, block: B:42:0x0389 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:45:0x03da  */
    /* JADX WARN: Code duplicated, block: B:46:0x03dd A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0436  */
    /* JADX WARN: Code duplicated, block: B:54:0x04b5  */
    /* JADX WARN: Code duplicated, block: B:55:0x04b7 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0507  */
    /* JADX WARN: Code duplicated, block: B:59:0x0508 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0654 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:74:0x067b  */
    /* JADX WARN: Code duplicated, block: B:75:0x067e A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0766  */
    /* JADX WARN: Code duplicated, block: B:85:0x0791  */
    /* JADX WARN: Code duplicated, block: B:86:0x0792 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:89:0x07c7  */
    /* JADX WARN: Code duplicated, block: B:94:0x0887  */
    /* JADX WARN: Code duplicated, block: B:95:0x0888 A[Catch: all -> 0x156e, TryCatch #6 {all -> 0x156e, blocks: (B:20:0x01d2, B:24:0x0245, B:28:0x02d7, B:32:0x0316, B:36:0x0366, B:39:0x037d, B:43:0x03b7, B:47:0x0429, B:67:0x05f4, B:71:0x0642, B:83:0x0777, B:87:0x07bf, B:102:0x0958, B:106:0x099c, B:127:0x0b20, B:131:0x0b62, B:153:0x0d01, B:157:0x0d47, B:167:0x0e51, B:171:0x0e92, B:188:0x0ff6, B:192:0x1039, B:221:0x12bc, B:225:0x12fd, B:240:0x143e, B:244:0x1493, B:246:0x14a7, B:250:0x1542, B:249:0x14cd, B:243:0x144a, B:224:0x12d3, B:230:0x136c, B:234:0x13af, B:233:0x1383, B:191:0x1011, B:195:0x1081, B:199:0x10c2, B:198:0x109c, B:170:0x0e68, B:176:0x0f10, B:180:0x0f4d, B:179:0x0f27, B:156:0x0d1d, B:130:0x0b38, B:134:0x0b72, B:138:0x0baf, B:137:0x0b89, B:143:0x0c20, B:147:0x0c5d, B:146:0x0c37, B:105:0x0974, B:86:0x0792, B:92:0x086d, B:96:0x08b3, B:95:0x0888, B:70:0x0614, B:72:0x0654, B:76:0x06c4, B:75:0x067e, B:46:0x03dd, B:42:0x0389, B:52:0x04ab, B:56:0x04e3, B:60:0x0553, B:59:0x0508, B:55:0x04b7, B:35:0x0332, B:31:0x02e8, B:23:0x01f9, B:14:0x014e, B:18:0x01ba, B:17:0x016e), top: B:286:0x00bb }] */
    /* JADX WARN: Code duplicated, block: B:99:0x08f8  */
    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) throws Throwable {
        int i11;
        Object objInvoke;
        Map map;
        Object method;
        Object[] objArr2;
        int iIntValue;
        Object method2;
        Object[] objArr3;
        int iIntValue2;
        Class cls;
        char c11;
        Object method3;
        Object[] objArr4;
        Object method4;
        char c12;
        long j11;
        Object method5;
        Object[] objArr5;
        char c13;
        char c14;
        int i12;
        int i13;
        Object method6;
        long j12;
        int i14;
        Context applicationContext;
        Context context;
        Object[] objArr6;
        Object[] objArr7;
        int i15;
        int i16;
        Object method7;
        long j13;
        char c15;
        int i17;
        Object[] objArr8;
        int i18;
        int i19;
        Object method8;
        long j14;
        Context applicationContext2;
        Context context2;
        Object[] objArr9;
        int i21;
        Long lValueOf;
        Class cls2;
        Object obj;
        int i22;
        int i23;
        Object method9;
        getAdditionalDetails getadditionaldetails;
        String threeDSRequestorAppURL;
        Object method10;
        Object[] objArr10;
        Object declaredMethod;
        Object method11;
        Object method12;
        Object method13;
        int i24;
        Object method14;
        Object method15;
        Object method16;
        Object method17;
        Object method18;
        Object[] objArr11;
        Object method19;
        getAdditionalDetails getadditionaldetails2 = (getAdditionalDetails) objArr[0];
        Activity activity = (Activity) objArr[1];
        ChallengeParameters challengeParameters = (ChallengeParameters) objArr[2];
        ChallengeStatusReceiver challengeStatusReceiver = (ChallengeStatusReceiver) objArr[3];
        int iIntValue3 = ((Number) objArr[4]).intValue();
        Object[] objArr12 = new Object[1];
        c(new int[]{1698694749, 2050588183, -457991778, -901528728, 1362074750, -823634289, 834510529, 699939542, 1308112024, 2019570505, -1412729764, -2009724205}, (-16777194) - Color.rgb(0, 0, 0), objArr12);
        String strIntern = ((String) objArr12[0]).intern();
        Object[] objArr13 = new Object[1];
        c(new int[]{-846248326, 940348925, 699608375, -1994483524, 1336578455, -1573688416, -1184665217, 82974096}, 15 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr13);
        String strIntern2 = ((String) objArr13[0]).intern();
        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(Color.alpha(0) + 754, (char) (16829 - MotionEvent.axisFromString("")), View.MeasureSpec.getSize(0) + 35);
        byte[] bArr = $$a;
        Object[] objArr14 = new Object[1];
        b((byte) (-bArr[54]), bArr[51], bArr[21], objArr14);
        long j15 = cls3.getField((String) objArr14[0]).getLong(null);
        Class cls4 = Integer.TYPE;
        try {
            try {
                if (j15 != -1) {
                    int i25 = getMessageVersion + 39;
                    i11 = 245738379;
                    ChallengeResultCancelled = i25 % 128;
                    if (i25 % 2 == 0 ? j15 + 1966 >= ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue() : (j15 & 1966) >= ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, new Object[1])).longValue()) {
                        Class cls5 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 753, (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 16829), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36);
                        byte b11 = bArr[21];
                        strIntern = strIntern;
                        byte b12 = bArr[46];
                        bArr = bArr;
                        Object[] objArr15 = new Object[1];
                        b(b11, b11, b12, objArr15);
                        Object[] objArr16 = {cls5.getField((String) objArr15[0]).get(null), -452745806, 0};
                        Map map2 = getMessageVersion.timedout;
                        Object method20 = map2.get(245738379);
                        if (method20 == null) {
                            method20 = ((Class) getMessageVersion.getSDKTransactionID(MotionEvent.axisFromString("") + 2779, (char) (39468 - ExpandableListView.getPackedPositionGroup(0L)), 23 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)))).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID(2749 - (ViewConfiguration.getTapTimeout() >> 16), (char) (TextUtils.indexOf("", "") + 54838), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 29), cls4, cls4);
                            map2.put(245738379, method20);
                        }
                        objInvoke = ((Method) method20).invoke(null, objArr16);
                        getadditionaldetails2 = getadditionaldetails2;
                        iIntValue3 = iIntValue3;
                    }
                    map = getMessageVersion.timedout;
                    method = map.get(693253393);
                    if (method != null) {
                        objArr2 = null;
                    } else {
                        objArr2 = null;
                        method = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2749, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 54838), Color.red(0) + 29)).getMethod("getSDKReferenceNumber", null);
                        map.put(693253393, method);
                    }
                    iIntValue = ((Integer) ((Method) method).invoke(objInvoke, objArr2)).intValue();
                    method2 = map.get(-635346729);
                    if (method2 != null) {
                        objArr3 = null;
                    } else {
                        objArr3 = null;
                        method2 = ((Class) getMessageVersion.getSDKTransactionID(2749 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 54837), View.resolveSizeAndState(0, 0, 0) + 29)).getMethod("getDeviceData", null);
                        map.put(-635346729, method2);
                    }
                    iIntValue2 = ((Integer) ((Method) method2).invoke(objInvoke, objArr3)).intValue();
                    cls = Long.TYPE;
                    if (iIntValue2 == iIntValue) {
                        method18 = map.get(560827737);
                        if (method18 != null) {
                            objArr11 = null;
                        } else {
                            objArr11 = null;
                            method18 = ((Class) getMessageVersion.getSDKTransactionID((KeyEvent.getMaxKeyCode() >> 16) + 2749, (char) (TextUtils.indexOf((CharSequence) "", '0') + 54839), 28 - TextUtils.indexOf((CharSequence) "", '0'))).getMethod("getSDKAppID", null);
                            map.put(560827737, method18);
                        }
                        Integer num = (Integer) ((Method) method18).invoke(objInvoke, objArr11);
                        num.intValue();
                        Object[] objArr17 = {objInvoke, num, 0};
                        method19 = map.get(Integer.valueOf(i11));
                        if (method19 != null) {
                            c11 = 'D';
                        } else {
                            c11 = 'D';
                            method19 = ((Class) getMessageVersion.getSDKTransactionID(2778 - TextUtils.getOffsetAfter("", 0), (char) (39468 - (Process.myTid() >> 22)), 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2749, (char) (View.resolveSize(0, 0) + 54838), 29 - TextUtils.indexOf("", "")), cls4, cls4);
                            map.put(Integer.valueOf(i11), method19);
                        }
                        ((Method) method19).invoke(null, objArr17);
                    } else {
                        c11 = 'D';
                        long j16 = ((long) (iIntValue ^ iIntValue2)) ^ (-4032250438630768640L);
                        ChallengeResultCancelled = (getMessageVersion + 107) % 128;
                        try {
                            Object[] objArr18 = {Long.valueOf(j16), -938829417L};
                            short s11 = (short) ($$e | 9);
                            byte[] bArr2 = $$d;
                            Object[] objArr19 = new Object[1];
                            a(s11, (byte) (-bArr2[24]), bArr2[68], objArr19);
                            Class<?> cls6 = Class.forName((String) objArr19[0]);
                            Object[] objArr20 = new Object[1];
                            a((short) 165, (byte) (-bArr2[506]), bArr2[29], objArr20);
                            cls6.getMethod((String) objArr20[0], cls, cls).invoke(null, objArr18);
                            method3 = map.get(560827737);
                            if (method3 != null) {
                                objArr4 = null;
                            } else {
                                objArr4 = null;
                                method3 = ((Class) getMessageVersion.getSDKTransactionID((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2748, (char) (Color.argb(0, 0, 0, 0) + 54838), (Process.myTid() >> 22) + 29)).getMethod("getSDKAppID", null);
                                map.put(560827737, method3);
                            }
                            Integer num2 = (Integer) ((Method) method3).invoke(objInvoke, objArr4);
                            num2.intValue();
                            Object[] objArr21 = {objInvoke, num2, 0};
                            method4 = map.get(Integer.valueOf(i11));
                            if (method4 != null) {
                                method4 = ((Class) getMessageVersion.getSDKTransactionID(2778 - (KeyEvent.getMaxKeyCode() >> 16), (char) (39468 - ExpandableListView.getPackedPositionType(0L)), MotionEvent.axisFromString("") + 25)).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID(2749 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (54838 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 29 - (KeyEvent.getMaxKeyCode() >> 16)), cls4, cls4);
                                map.put(Integer.valueOf(i11), method4);
                            }
                            ((Method) method4).invoke(null, objArr21);
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th2;
                        }
                    }
                    Class cls7 = (Class) getMessageVersion.getSDKTransactionID(721 - TextUtils.getOffsetAfter("", 0), (char) View.resolveSizeAndState(0, 0, 0), 33 - (ViewConfiguration.getEdgeSlop() >> 16));
                    byte b13 = bArr[29];
                    c12 = CoreConstants.DASH_CHAR;
                    Object[] objArr22 = new Object[1];
                    b(b13, bArr[45], bArr[46], objArr22);
                    j11 = cls7.getField((String) objArr22[0]).getLong(null);
                    if (j11 != -1 || j11 + ConstantsAPI.AppSupportContentFlag.MMAPP_SUPPORT_XLSX < ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
                        Object[] objArr23 = {Integer.valueOf(iIntValue3), 0, 1196282296};
                        method5 = map.get(1459979046);
                        if (method5 == null) {
                            Class cls8 = (Class) getMessageVersion.getSDKTransactionID(721 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), 32 - TextUtils.lastIndexOf("", '0', 0));
                            Object[] objArr24 = new Object[1];
                            b(bArr[6], bArr[29], bArr[46], objArr24);
                            method5 = cls8.getMethod((String) objArr24[0], cls4, cls4, cls4);
                            map.put(1459979046, method5);
                        }
                        objArr5 = (Object[]) ((Method) method5).invoke(null, objArr23);
                        Class cls9 = (Class) getMessageVersion.getSDKTransactionID(721 - TextUtils.getTrimmedLength(""), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                        Object[] objArr25 = new Object[1];
                        b(bArr[6], bArr[29], bArr[46], objArr25);
                        cls9.getField((String) objArr25[0]).set(null, objArr5);
                        try {
                            Long lValueOf2 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                            Class cls10 = (Class) getMessageVersion.getSDKTransactionID(721 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getTouchSlop() >> 8), 32 - Process.getGidForName(""));
                            c13 = 1;
                            Object[] objArr26 = new Object[1];
                            b(bArr[29], bArr[c12], bArr[46], objArr26);
                            c14 = 0;
                            cls10.getField((String) objArr26[0]).set(null, lValueOf2);
                        } catch (Exception unused) {
                            throw new RuntimeException();
                        }
                    } else {
                        Class cls11 = (Class) getMessageVersion.getSDKTransactionID(720 - TextUtils.lastIndexOf("", '0', 0), (char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 33);
                        Object[] objArr27 = new Object[1];
                        b(bArr[6], bArr[29], bArr[46], objArr27);
                        Object[] objArr28 = {cls11.getField((String) objArr27[0]).get(null), 1196282296, 0};
                        Object method21 = map.get(-1124906587);
                        if (method21 == null) {
                            method21 = ((Class) getMessageVersion.getSDKTransactionID(2718 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (Process.myTid() >> 22), 31 - Color.red(0))).getMethod("AuthenticationRequestParameters", Object[].class, cls4, cls4);
                            map.put(-1124906587, method21);
                        }
                        objArr5 = (Object[]) ((Method) method21).invoke(null, objArr28);
                        c12 = '-';
                        c13 = 1;
                        c14 = 0;
                    }
                    i12 = ((int[]) objArr5[c13])[c14];
                    i13 = ((int[]) objArr5[c14])[c14];
                    if (i13 == i12) {
                        getMessageVersion = (ChallengeResultCancelled + 55) % 128;
                        int i26 = ((int[]) objArr5[9])[c14];
                        Object[] objArr29 = new Object[3];
                        objArr29[2] = 0;
                        objArr29[1] = Integer.valueOf(i26);
                        objArr29[c14] = objArr5;
                        method17 = map.get(Integer.valueOf((int) r7));
                        if (method17 != null) {
                            method17 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2718, (char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 30 - Process.getGidForName(""))).getMethod("AuthenticationRequestParameters", Object[].class, cls4, cls4);
                            map.put(-1124906587, method17);
                        }
                        ((Method) method17).invoke(null, objArr29);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add((String) objArr5[2]);
                        arrayList.add((String) objArr5[3]);
                        arrayList.add((String) objArr5[4]);
                        arrayList.add((String) objArr5[5]);
                        arrayList.add((String) objArr5[6]);
                        arrayList.add((String) objArr5[7]);
                        arrayList.add((String) objArr5[8]);
                        Object[] objArr30 = {Long.valueOf(((long) (i12 ^ i13)) ^ (-1026008944746692608L)), -238886324L};
                        byte[] bArr3 = $$d;
                        Object[] objArr31 = new Object[1];
                        a((short) 145, bArr3[174], bArr3[c11], objArr31);
                        Class<?> cls12 = Class.forName((String) objArr31[0]);
                        Object[] objArr32 = new Object[1];
                        a((short) 165, (byte) (-bArr3[506]), bArr3[29], objArr32);
                        cls12.getMethod((String) objArr32[0], cls, cls).invoke(null, objArr30);
                        Object[] objArr33 = {objArr5, Integer.valueOf(((int[]) objArr5[9])[0]), 0};
                        method6 = map.get(Integer.valueOf((int) r7));
                        if (method6 != null) {
                            method6 = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0') + 2719, (char) View.MeasureSpec.getMode(0), 31 - View.resolveSize(0, 0))).getMethod("AuthenticationRequestParameters", Object[].class, cls4, cls4);
                            map.put(Integer.valueOf((int) r7), method6);
                        }
                        ((Method) method6).invoke(null, objArr33);
                    }
                    Class cls13 = (Class) getMessageVersion.getSDKTransactionID(665 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 24 - ImageFormat.getBitsPerPixel(0));
                    byte b14 = bArr[21];
                    Object[] objArr34 = new Object[1];
                    b(b14, b14, bArr[46], objArr34);
                    j12 = cls13.getField((String) objArr34[0]).getLong(null);
                    if (j12 != -1) {
                        getMessageVersion = (ChallengeResultCancelled + 79) % 128;
                        if (j12 + 1915 >= ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
                            Class cls14 = (Class) getMessageVersion.getSDKTransactionID(664 - Drawable.resolveOpacity(0, 0), (char) TextUtils.indexOf("", "", 0), 25 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                            i14 = 64314;
                            Object[] objArr35 = new Object[1];
                            b(bArr[29], bArr[c12], bArr[46], objArr35);
                            Object[] objArr36 = {cls14.getField((String) objArr35[0]).get(null), 1501601261, 0};
                            method16 = map.get(1046315470);
                            if (method16 != null) {
                                method16 = ((Class) getMessageVersion.getSDKTransactionID(2802 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 64314), 28 - ExpandableListView.getPackedPositionType(0L))).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                                map.put(1046315470, method16);
                            }
                            objArr7 = (Object[]) ((Method) method16).invoke(null, objArr36);
                        } else {
                            i14 = 64314;
                            Object[] objArr37 = new Object[1];
                            c(new int[]{1698694749, 2050588183, -457991778, -901528728, 817195746, 53710434, -351119689, -863152896, 134460595, -385560032, -1944164246, -842691740, -1851792335, 1506328281}, 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr37);
                            Class<?> cls15 = Class.forName(((String) objArr37[0]).intern());
                            Object[] objArr38 = new Object[1];
                            c(new int[]{-1835255182, -1610659434, -1614285291, 457102511, 784845012, 603573056, -596228922, 2092248793, -147281931, 624053858}, TextUtils.indexOf("", "", 0, 0) + 18, objArr38);
                            applicationContext = (Context) cls15.getMethod(((String) objArr38[0]).intern(), null).invoke(null, null);
                            if (applicationContext != null) {
                                applicationContext = applicationContext.getApplicationContext();
                            }
                            getMessageVersion = (ChallengeResultCancelled + 49) % 128;
                            try {
                                Object[] objArr39 = {applicationContext, Integer.valueOf(iIntValue3), 1501601261};
                                byte[] bArr4 = $$d;
                                context = applicationContext;
                                Object[] objArr40 = new Object[1];
                                a((short) 109, bArr4[137], bArr4[c11], objArr40);
                                Class<?> cls16 = Class.forName((String) objArr40[0]);
                                Object[] objArr41 = new Object[1];
                                a((short) 597, (byte) (-bArr4[199]), bArr4[29], objArr41);
                                objArr6 = (Object[]) cls16.getMethod((String) objArr41[0], Context.class, cls4, cls4).invoke(null, objArr39);
                                if (context != null) {
                                    Class cls17 = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.blue(0), 25 - TextUtils.getOffsetBefore("", 0));
                                    Object[] objArr42 = new Object[1];
                                    b(bArr[29], bArr[c12], bArr[46], objArr42);
                                    cls17.getField((String) objArr42[0]).set(null, objArr6);
                                    try {
                                        Long lValueOf3 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                                        Class cls18 = (Class) getMessageVersion.getSDKTransactionID(664 - Drawable.resolveOpacity(0, 0), (char) (TextUtils.lastIndexOf("", '0') + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 25);
                                        byte b15 = bArr[21];
                                        Object[] objArr43 = new Object[1];
                                        b(b15, b15, bArr[46], objArr43);
                                        cls18.getField((String) objArr43[0]).set(null, lValueOf3);
                                    } catch (Exception unused2) {
                                        throw new RuntimeException();
                                    }
                                }
                                objArr7 = objArr6;
                            } catch (Throwable th3) {
                                Throwable cause2 = th3.getCause();
                                if (cause2 != null) {
                                    throw cause2;
                                }
                                throw th3;
                            }
                        }
                    } else {
                        i14 = 64314;
                        Object[] objArr310 = new Object[1];
                        c(new int[]{1698694749, 2050588183, -457991778, -901528728, 817195746, 53710434, -351119689, -863152896, 134460595, -385560032, -1944164246, -842691740, -1851792335, 1506328281}, 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr310);
                        Class<?> cls19 = Class.forName(((String) objArr310[0]).intern());
                        Object[] objArr311 = new Object[1];
                        c(new int[]{-1835255182, -1610659434, -1614285291, 457102511, 784845012, 603573056, -596228922, 2092248793, -147281931, 624053858}, TextUtils.indexOf("", "", 0, 0) + 18, objArr311);
                        applicationContext = (Context) cls19.getMethod(((String) objArr311[0]).intern(), null).invoke(null, null);
                        if (applicationContext != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                        getMessageVersion = (ChallengeResultCancelled + 49) % 128;
                        Object[] objArr312 = {applicationContext, Integer.valueOf(iIntValue3), 1501601261};
                        byte[] bArr5 = $$d;
                        context = applicationContext;
                        Object[] objArr44 = new Object[1];
                        a((short) 109, bArr5[137], bArr5[c11], objArr44);
                        Class<?> cls110 = Class.forName((String) objArr44[0]);
                        Object[] objArr45 = new Object[1];
                        a((short) 597, (byte) (-bArr5[199]), bArr5[29], objArr45);
                        objArr6 = (Object[]) cls110.getMethod((String) objArr45[0], Context.class, cls4, cls4).invoke(null, objArr312);
                        if (context != null) {
                            Class cls111 = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.blue(0), 25 - TextUtils.getOffsetBefore("", 0));
                            Object[] objArr46 = new Object[1];
                            b(bArr[29], bArr[c12], bArr[46], objArr46);
                            cls111.getField((String) objArr46[0]).set(null, objArr6);
                            Long lValueOf4 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                            Class cls112 = (Class) getMessageVersion.getSDKTransactionID(664 - Drawable.resolveOpacity(0, 0), (char) (TextUtils.lastIndexOf("", '0') + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 25);
                            byte b16 = bArr[21];
                            Object[] objArr47 = new Object[1];
                            b(b16, b16, bArr[46], objArr47);
                            cls112.getField((String) objArr47[0]).set(null, lValueOf4);
                        }
                        objArr7 = objArr6;
                    }
                    i15 = ((int[]) objArr7[1])[0];
                    i16 = ((int[]) objArr7[0])[0];
                    if (i16 == i15) {
                        i24 = getMessageVersion + 13;
                        ChallengeResultCancelled = i24 % 128;
                        if (i24 % 2 != 0) {
                            Object[] objArr48 = {objArr7, Integer.valueOf(((int[]) objArr7[3])[1]), 1};
                            method15 = map.get(1046315470);
                            if (method15 != null) {
                                method15 = ((Class) getMessageVersion.getSDKTransactionID(2802 - View.resolveSize(0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 64313), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                                map.put(1046315470, method15);
                            }
                            ((Method) method15).invoke(null, objArr48);
                        } else {
                            Object[] objArr49 = {objArr7, Integer.valueOf(((int[]) objArr7[3])[0]), 0};
                            method14 = map.get(1046315470);
                            if (method14 != null) {
                                method14 = ((Class) getMessageVersion.getSDKTransactionID(2802 - Color.red(0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + i14), View.getDefaultSize(0, 0) + 28)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                                map.put(1046315470, method14);
                            }
                            ((Method) method14).invoke(null, objArr49);
                        }
                    } else {
                        Object[] objArr50 = {Long.valueOf(((long) (i15 ^ i16)) ^ (-8174252319764905984L)), -1903216425L};
                        byte[] bArr6 = $$d;
                        Object[] objArr51 = objArr7;
                        Object[] objArr52 = new Object[1];
                        a((short) 355, bArr6[174], bArr6[c11], objArr52);
                        Class<?> cls20 = Class.forName((String) objArr52[0]);
                        Object[] objArr53 = new Object[1];
                        a((short) 597, (byte) (-bArr6[199]), bArr6[29], objArr53);
                        cls20.getMethod((String) objArr53[0], cls, cls).invoke(null, objArr50);
                        Object[] objArr54 = {objArr51, Integer.valueOf(((int[]) objArr51[3])[0]), 0};
                        method7 = map.get(1046315470);
                        if (method7 != null) {
                            method7 = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", 0, 0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (TextUtils.getOffsetAfter("", 0) + i14), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                            map.put(1046315470, method7);
                        }
                        ((Method) method7).invoke(null, objArr54);
                    }
                    Class cls21 = (Class) getMessageVersion.getSDKTransactionID(663 - Process.getGidForName(""), (char) Color.green(0), (KeyEvent.getMaxKeyCode() >> 16) + 25);
                    Object[] objArr55 = new Object[1];
                    b((byte) (bArr[88] + 1), bArr[4], bArr[46], objArr55);
                    j13 = cls21.getField((String) objArr55[0]).getLong(null);
                    if (j13 != -1) {
                        ChallengeResultCancelled = (getMessageVersion + 39) % 128;
                        if (j13 + 1850 >= ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
                            Class cls22 = (Class) getMessageVersion.getSDKTransactionID(664 - TextUtils.indexOf("", ""), (char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 25);
                            Object[] objArr56 = new Object[1];
                            b((byte) (-bArr[r6]), bArr[21], bArr[c12], objArr56);
                            Object[] objArr57 = {cls22.getField((String) objArr56[0]).get(null), 1210009077, 0};
                            method13 = map.get(1046315470);
                            if (method13 != null) {
                                method13 = ((Class) getMessageVersion.getSDKTransactionID(2801 - ExpandableListView.getPackedPositionChild(0L), (char) (i14 - (ViewConfiguration.getPressedStateDuration() >> 16)), 28 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                                map.put(1046315470, method13);
                            }
                            objArr8 = (Object[]) ((Method) method13).invoke(null, objArr57);
                            c15 = 1;
                            i17 = 0;
                        } else {
                            Object[] objArr58 = {Integer.valueOf(iIntValue3), 1210009077};
                            byte[] bArr7 = $$d;
                            Object[] objArr59 = new Object[1];
                            a((short) (bArr7[151] - 1), bArr7[58], bArr7[c11], objArr59);
                            Class<?> cls23 = Class.forName((String) objArr59[0]);
                            Object[] objArr60 = new Object[1];
                            a((short) 441, (byte) (-bArr7[6]), bArr7[29], objArr60);
                            Object[] objArr61 = (Object[]) cls23.getMethod((String) objArr60[0], cls4, cls4).invoke(null, objArr58);
                            Class cls24 = (Class) getMessageVersion.getSDKTransactionID(View.getDefaultSize(0, 0) + 664, (char) Color.alpha(0), 25 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                            Object[] objArr62 = new Object[1];
                            b((byte) (-bArr[r6]), bArr[21], bArr[c12], objArr62);
                            cls24.getField((String) objArr62[0]).set(null, objArr61);
                            try {
                                Long lValueOf5 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                                Class cls25 = (Class) getMessageVersion.getSDKTransactionID(664 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 25 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                                c15 = 1;
                                Object[] objArr63 = new Object[1];
                                b((byte) (bArr[88] + 1), bArr[4], bArr[46], objArr63);
                                i17 = 0;
                                cls25.getField((String) objArr63[0]).set(null, lValueOf5);
                                objArr8 = objArr61;
                            } catch (Exception unused3) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        Object[] objArr510 = {Integer.valueOf(iIntValue3), 1210009077};
                        byte[] bArr8 = $$d;
                        Object[] objArr511 = new Object[1];
                        a((short) (bArr8[151] - 1), bArr8[58], bArr8[c11], objArr511);
                        Class<?> cls26 = Class.forName((String) objArr511[0]);
                        Object[] objArr64 = new Object[1];
                        a((short) 441, (byte) (-bArr8[6]), bArr8[29], objArr64);
                        Object[] objArr65 = (Object[]) cls26.getMethod((String) objArr64[0], cls4, cls4).invoke(null, objArr510);
                        Class cls27 = (Class) getMessageVersion.getSDKTransactionID(View.getDefaultSize(0, 0) + 664, (char) Color.alpha(0), 25 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        Object[] objArr66 = new Object[1];
                        b((byte) (-bArr[r6]), bArr[21], bArr[c12], objArr66);
                        cls27.getField((String) objArr66[0]).set(null, objArr65);
                        Long lValueOf6 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                        Class cls28 = (Class) getMessageVersion.getSDKTransactionID(664 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 25 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        c15 = 1;
                        Object[] objArr67 = new Object[1];
                        b((byte) (bArr[88] + 1), bArr[4], bArr[46], objArr67);
                        i17 = 0;
                        cls28.getField((String) objArr67[0]).set(null, lValueOf6);
                        objArr8 = objArr65;
                    }
                    i18 = ((int[]) objArr8[c15])[i17];
                    i19 = ((int[]) objArr8[i17])[i17];
                    if (i19 == i18) {
                        int i27 = ((int[]) objArr8[3])[i17];
                        Object[] objArr68 = new Object[3];
                        objArr68[2] = 0;
                        objArr68[1] = Integer.valueOf(i27);
                        objArr68[i17] = objArr8;
                        method12 = map.get(1046315470);
                        if (method12 != null) {
                            method12 = ((Class) getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(i17) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64315 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.getCapsMode("", i17, i17) + 28)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                            map.put(1046315470, method12);
                        }
                        ((Method) method12).invoke(null, objArr68);
                    } else {
                        new ArrayList().add((String) objArr8[2]);
                        Object[] objArr69 = {Long.valueOf(((long) (i18 ^ i19)) ^ 2993095591128465408L), 696884357L};
                        byte[] bArr9 = $$d;
                        Object[] objArr70 = objArr8;
                        Object[] objArr71 = new Object[1];
                        a((short) 355, bArr9[174], bArr9[c11], objArr71);
                        Class<?> cls29 = Class.forName((String) objArr71[0]);
                        Object[] objArr72 = new Object[1];
                        a((short) 597, (byte) (-bArr9[199]), bArr9[29], objArr72);
                        cls29.getMethod((String) objArr72[0], cls, cls).invoke(null, objArr69);
                        Object[] objArr73 = {objArr70, Integer.valueOf(((int[]) objArr70[3])[0]), 0};
                        method8 = map.get(1046315470);
                        if (method8 != null) {
                            method8 = ((Class) getMessageVersion.getSDKTransactionID(2850 - AndroidCharacter.getMirror('0'), (char) (KeyEvent.normalizeMetaState(0) + i14), ExpandableListView.getPackedPositionGroup(0L) + 28)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                            map.put(1046315470, method8);
                        }
                        ((Method) method8).invoke(null, objArr73);
                    }
                    Class cls30 = (Class) getMessageVersion.getSDKTransactionID(663 - ExpandableListView.getPackedPositionChild(0L), (char) Color.green(0), Gravity.getAbsoluteGravity(0, 0) + 25);
                    Object[] objArr74 = new Object[1];
                    b(bArr[6], bArr[29], bArr[46], objArr74);
                    j14 = cls30.getField((String) objArr74[0]).getLong(null);
                    if (j14 != -1 || j14 + 1925 < ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
                        Object[] objArr75 = new Object[1];
                        c(new int[]{1698694749, 2050588183, -457991778, -901528728, 817195746, 53710434, -351119689, -863152896, 134460595, -385560032, -1944164246, -842691740, -1851792335, 1506328281}, 25 - TextUtils.lastIndexOf("", '0'), objArr75);
                        Class<?> cls31 = Class.forName(((String) objArr75[0]).intern());
                        Object[] objArr76 = new Object[1];
                        c(new int[]{-1835255182, -1610659434, -1614285291, 457102511, 784845012, 603573056, -596228922, 2092248793, -147281931, 624053858}, (ViewConfiguration.getLongPressTimeout() >> 16) + 18, objArr76);
                        applicationContext2 = (Context) cls31.getMethod(((String) objArr76[0]).intern(), null).invoke(null, null);
                        if (applicationContext2 != null) {
                            applicationContext2 = applicationContext2.getApplicationContext();
                        }
                        Object[] objArr77 = {applicationContext2, Integer.valueOf(iIntValue3), 691818142};
                        byte[] bArr10 = $$d;
                        context2 = applicationContext2;
                        Object[] objArr78 = new Object[1];
                        a((short) 634, bArr10[4], bArr10[c11], objArr78);
                        Class<?> cls32 = Class.forName((String) objArr78[0]);
                        Object[] objArr79 = new Object[1];
                        a((short) 441, (byte) (-bArr10[6]), bArr10[29], objArr79);
                        objArr9 = (Object[]) cls32.getMethod((String) objArr79[0], Context.class, cls4, cls4).invoke(null, objArr77);
                        if (context2 != null) {
                            i21 = ChallengeResultCancelled + 53;
                            getMessageVersion = i21 % 128;
                            try {
                                if (i21 % 2 == 0) {
                                    Class cls33 = (Class) getMessageVersion.getSDKTransactionID((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 664, (char) (ViewConfiguration.getEdgeSlop() >> 16), Process.getGidForName("") + 26);
                                    Object[] objArr80 = new Object[1];
                                    b((byte) (-bArr[54]), bArr[51], bArr[21], objArr80);
                                    cls33.getField((String) objArr80[0]).set(null, objArr9);
                                    lValueOf = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, new Class[1]).invoke(null, new Object[1])).longValue());
                                    cls2 = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), ImageFormat.getBitsPerPixel(0) + 26);
                                    Object[] objArr81 = new Object[1];
                                    b(bArr[6], bArr[29], bArr[46], objArr81);
                                    obj = objArr81[0];
                                } else {
                                    Class cls34 = (Class) getMessageVersion.getSDKTransactionID(663 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), Drawable.resolveOpacity(0, 0) + 25);
                                    Object[] objArr82 = new Object[1];
                                    b((byte) (-bArr[54]), bArr[51], bArr[21], objArr82);
                                    cls34.getField((String) objArr82[0]).set(null, objArr9);
                                    lValueOf = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                                    cls2 = (Class) getMessageVersion.getSDKTransactionID(664 - KeyEvent.normalizeMetaState(0), (char) View.MeasureSpec.getMode(0), 25 - TextUtils.indexOf("", "", 0));
                                    Object[] objArr83 = new Object[1];
                                    b(bArr[6], bArr[29], bArr[46], objArr83);
                                    obj = objArr83[0];
                                }
                                cls2.getField((String) obj).set(null, lValueOf);
                            } catch (Exception unused4) {
                                throw new RuntimeException();
                            }
                        }
                    } else {
                        int i28 = ChallengeResultCancelled + 101;
                        getMessageVersion = i28 % 128;
                        if (i28 % 2 == 0) {
                            Class cls35 = (Class) getMessageVersion.getSDKTransactionID(664 - Color.blue(0), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 25 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                            Object[] objArr84 = new Object[1];
                            b((byte) (-bArr[54]), bArr[51], bArr[21], objArr84);
                            Object[] objArr85 = {cls35.getField((String) objArr84[0]).get(null), 691818142, 0};
                            Object method22 = map.get(1046315470);
                            if (method22 == null) {
                                method22 = ((Class) getMessageVersion.getSDKTransactionID(2802 - TextUtils.getOffsetAfter("", 0), (char) (64313 - TextUtils.lastIndexOf("", '0')), 27 - TextUtils.indexOf((CharSequence) "", '0'))).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                                map.put(1046315470, method22);
                            }
                            objArr9 = (Object[]) ((Method) method22).invoke(null, objArr85);
                        } else {
                            Class cls36 = (Class) getMessageVersion.getSDKTransactionID(663 - Process.getGidForName(""), (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 25 - ExpandableListView.getPackedPositionGroup(0L));
                            Object[] objArr86 = new Object[1];
                            b((byte) (-bArr[54]), bArr[51], bArr[21], objArr86);
                            Object[] objArr87 = {cls36.getField((String) objArr86[0]).get(null), 691818142, 0};
                            Object method23 = map.get(1046315470);
                            if (method23 == null) {
                                method23 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + NearbyMessagesStatusCodes.TOO_MANY_PENDING_INTENTS, (char) (i14 - Gravity.getAbsoluteGravity(0, 0)), Color.green(0) + 28)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                                map.put(1046315470, method23);
                            }
                            objArr9 = (Object[]) ((Method) method23).invoke(null, objArr87);
                        }
                    }
                    i22 = ((int[]) objArr9[1])[0];
                    i23 = ((int[]) objArr9[0])[0];
                    if (i23 == i22) {
                        Object[] objArr88 = {objArr9, Integer.valueOf(((int[]) objArr9[3])[0]), 0};
                        method11 = map.get(1046315470);
                        if (method11 != null) {
                            method11 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (i14 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                            map.put(1046315470, method11);
                        }
                        ((Method) method11).invoke(null, objArr88);
                    } else {
                        Object[] objArr89 = {Long.valueOf(((long) (i22 ^ i23)) ^ (-2246607979908431872L)), -523078670L};
                        short s12 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE;
                        byte[] bArr11 = $$d;
                        Object[] objArr90 = new Object[1];
                        a(s12, (byte) (-bArr11[57]), bArr11[c11], objArr90);
                        Class<?> cls37 = Class.forName((String) objArr90[0]);
                        Object[] objArr91 = new Object[1];
                        a((short) 441, (byte) (-bArr11[6]), bArr11[29], objArr91);
                        cls37.getMethod((String) objArr91[0], cls, cls).invoke(null, objArr89);
                        Object[] objArr92 = {objArr9, Integer.valueOf(((int[]) objArr9[3])[0]), 0};
                        method9 = map.get(1046315470);
                        if (method9 != null) {
                            method9 = ((Class) getMessageVersion.getSDKTransactionID((Process.myPid() >> 22) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (ExpandableListView.getPackedPositionChild(0L) + 64315), 29 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                            map.put(1046315470, method9);
                        }
                        ((Method) method9).invoke(null, objArr92);
                    }
                    atd.json.BuildConfig.getSDKTransactionID(activity, atd.ad.getDeviceData.CURRENT_ACTIVITY);
                    atd.ad.getDeviceData getdevicedata = atd.ad.getDeviceData.CHALLENGE_PARAMETERS;
                    atd.json.BuildConfig.getSDKTransactionID(challengeParameters, getdevicedata);
                    atd.json.BuildConfig.AuthenticationRequestParameters(challengeParameters.getAcsTransactionID(), getdevicedata);
                    atd.json.BuildConfig.AuthenticationRequestParameters(challengeParameters.get3DSServerTransactionID(), getdevicedata);
                    atd.json.BuildConfig.getSDKTransactionID(challengeStatusReceiver, atd.ad.getDeviceData.CHALLENGE_STATUS_RECEIVER);
                    int i29 = iIntValue3;
                    atd.json.BuildConfig.getSDKAppID(i29, atd.ad.getDeviceData.TIMEOUT);
                    getadditionaldetails = getadditionaldetails2;
                    getadditionaldetails.getSDKAppID = new WeakReference<>(activity);
                    getadditionaldetails.AuthenticationRequestParameters = challengeStatusReceiver;
                    atd.g.getDeviceData deviceData = getadditionaldetails.getDeviceData(challengeParameters.getAcsSignedContent());
                    if (getadditionaldetails.getSDKReferenceNumber.getMessageVersion().equals(getSDKAppID.V2_1_0.getSDKReferenceNumber())) {
                        threeDSRequestorAppURL = null;
                    } else {
                        getMessageVersion = (ChallengeResultCancelled + 51) % 128;
                        threeDSRequestorAppURL = challengeParameters.getThreeDSRequestorAppURL();
                    }
                    atd.e.getSDKAppID getsdkappid = new atd.e.getSDKAppID(new atd.ao.AuthenticationRequestParameters(getadditionaldetails.getSDKReferenceNumber.getSDKTransactionID(), challengeParameters.get3DSServerTransactionID(), challengeParameters.getAcsTransactionID(), null), threeDSRequestorAppURL, getadditionaldetails.getSDKReferenceNumber.getMessageVersion());
                    Object deviceData$6866fd82 = getadditionaldetails.getDeviceData$6866fd82(challengeParameters.getAcsTransactionID(), deviceData.getSDKTransactionID());
                    method10 = map.get(-1920284156);
                    if (method10 != null) {
                        objArr10 = null;
                    } else {
                        Class cls38 = (Class) getMessageVersion.getSDKTransactionID((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (54380 - (Process.myTid() >> 22)), Color.red(0) + 36);
                        byte[] bArr12 = $$d;
                        short s13 = bArr12[58];
                        Object[] objArr93 = new Object[1];
                        a(s13, (byte) (s13 | 51), bArr12[29], objArr93);
                        objArr10 = null;
                        method10 = cls38.getMethod((String) objArr93[0], null);
                        map.put(-1920284156, method10);
                    }
                    getadditionaldetails.ChallengeResult = (atd.d.getSDKTransactionID) ((Method) method10).invoke(objArr10, objArr10);
                    String sDKAppID = deviceData.getSDKAppID();
                    deviceData.AuthenticationRequestParameters();
                    atd.d.getSDKTransactionID getsdktransactionid = getadditionaldetails.ChallengeResult;
                    Object[] objArr94 = {sDKAppID, deviceData$6866fd82, getsdkappid, Integer.valueOf(i29), getadditionaldetails};
                    declaredMethod = map.get(-1572593602);
                    if (declaredMethod != null) {
                        Class cls39 = (Class) getMessageVersion.getSDKTransactionID((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) (54379 - TextUtils.lastIndexOf("", '0', 0)), 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        byte[] bArr13 = $$d;
                        short s14 = bArr13[58];
                        Object[] objArr95 = new Object[1];
                        a(s14, (byte) (s14 | 51), bArr13[29], objArr95);
                        declaredMethod = cls39.getDeclaredMethod((String) objArr95[0], String.class, (Class) getMessageVersion.getSDKTransactionID(172 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 10255), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31), atd.e.getSDKAppID.class, cls4, getDeviceData.class);
                        map.put(-1572593602, declaredMethod);
                    }
                    ((Method) declaredMethod).invoke(getsdktransactionid, objArr94);
                    return null;
                }
                i11 = 245738379;
                Long lValueOf7 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                Class cls40 = (Class) getMessageVersion.getSDKTransactionID(754 - (Process.myTid() >> 22), (char) (16830 - (ViewConfiguration.getScrollBarSize() >> 8)), 35 - View.getDefaultSize(0, 0));
                Object[] objArr96 = new Object[1];
                b((byte) (-bArr[54]), (byte) bArr[51], (byte) bArr[21], objArr96);
                cls40.getField((String) objArr96[0]).set(null, lValueOf7);
                map = getMessageVersion.timedout;
                method = map.get(693253393);
                if (method != null) {
                    objArr2 = null;
                } else {
                    objArr2 = null;
                    method = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 2749, (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 54838), Color.red(0) + 29)).getMethod("getSDKReferenceNumber", null);
                    map.put(693253393, method);
                }
                iIntValue = ((Integer) ((Method) method).invoke(objInvoke, objArr2)).intValue();
                method2 = map.get(-635346729);
                if (method2 != null) {
                    objArr3 = null;
                } else {
                    objArr3 = null;
                    method2 = ((Class) getMessageVersion.getSDKTransactionID(2749 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 54837), View.resolveSizeAndState(0, 0, 0) + 29)).getMethod("getDeviceData", null);
                    map.put(-635346729, method2);
                }
                iIntValue2 = ((Integer) ((Method) method2).invoke(objInvoke, objArr3)).intValue();
                cls = Long.TYPE;
                if (iIntValue2 == iIntValue) {
                    method18 = map.get(560827737);
                    if (method18 != null) {
                        objArr11 = null;
                    } else {
                        objArr11 = null;
                        method18 = ((Class) getMessageVersion.getSDKTransactionID((KeyEvent.getMaxKeyCode() >> 16) + 2749, (char) (TextUtils.indexOf((CharSequence) "", '0') + 54839), 28 - TextUtils.indexOf((CharSequence) "", '0'))).getMethod("getSDKAppID", null);
                        map.put(560827737, method18);
                    }
                    Integer num3 = (Integer) ((Method) method18).invoke(objInvoke, objArr11);
                    num3.intValue();
                    Object[] objArr110 = {objInvoke, num3, 0};
                    method19 = map.get(Integer.valueOf(i11));
                    if (method19 != null) {
                        c11 = 'D';
                    } else {
                        c11 = 'D';
                        method19 = ((Class) getMessageVersion.getSDKTransactionID(2778 - TextUtils.getOffsetAfter("", 0), (char) (39468 - (Process.myTid() >> 22)), 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2749, (char) (View.resolveSize(0, 0) + 54838), 29 - TextUtils.indexOf("", "")), cls4, cls4);
                        map.put(Integer.valueOf(i11), method19);
                    }
                    ((Method) method19).invoke(null, objArr110);
                } else {
                    c11 = 'D';
                    long j17 = ((long) (iIntValue ^ iIntValue2)) ^ (-4032250438630768640L);
                    ChallengeResultCancelled = (getMessageVersion + 107) % 128;
                    Object[] objArr111 = {Long.valueOf(j17), -938829417L};
                    short s15 = (short) ($$e | 9);
                    byte[] bArr14 = $$d;
                    Object[] objArr112 = new Object[1];
                    a(s15, (byte) (-bArr14[24]), bArr14[68], objArr112);
                    Class<?> cls41 = Class.forName((String) objArr112[0]);
                    Object[] objArr210 = new Object[1];
                    a((short) 165, (byte) (-bArr14[506]), bArr14[29], objArr210);
                    cls41.getMethod((String) objArr210[0], cls, cls).invoke(null, objArr111);
                    method3 = map.get(560827737);
                    if (method3 != null) {
                        objArr4 = null;
                    } else {
                        objArr4 = null;
                        method3 = ((Class) getMessageVersion.getSDKTransactionID((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2748, (char) (Color.argb(0, 0, 0, 0) + 54838), (Process.myTid() >> 22) + 29)).getMethod("getSDKAppID", null);
                        map.put(560827737, method3);
                    }
                    Integer num4 = (Integer) ((Method) method3).invoke(objInvoke, objArr4);
                    num4.intValue();
                    Object[] objArr211 = {objInvoke, num4, 0};
                    method4 = map.get(Integer.valueOf(i11));
                    if (method4 != null) {
                        method4 = ((Class) getMessageVersion.getSDKTransactionID(2778 - (KeyEvent.getMaxKeyCode() >> 16), (char) (39468 - ExpandableListView.getPackedPositionType(0L)), MotionEvent.axisFromString("") + 25)).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID(2749 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (54838 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 29 - (KeyEvent.getMaxKeyCode() >> 16)), cls4, cls4);
                        map.put(Integer.valueOf(i11), method4);
                    }
                    ((Method) method4).invoke(null, objArr211);
                }
                Class cls42 = (Class) getMessageVersion.getSDKTransactionID(721 - TextUtils.getOffsetAfter("", 0), (char) View.resolveSizeAndState(0, 0, 0), 33 - (ViewConfiguration.getEdgeSlop() >> 16));
                byte b17 = bArr[29];
                c12 = CoreConstants.DASH_CHAR;
                Object[] objArr212 = new Object[1];
                b(b17, bArr[45], bArr[46], objArr212);
                j11 = cls42.getField((String) objArr212[0]).getLong(null);
                if (j11 != -1) {
                    Object[] objArr213 = {Integer.valueOf(iIntValue3), 0, 1196282296};
                    method5 = map.get(1459979046);
                    if (method5 == null) {
                        Class cls43 = (Class) getMessageVersion.getSDKTransactionID(721 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), 32 - TextUtils.lastIndexOf("", '0', 0));
                        Object[] objArr214 = new Object[1];
                        b(bArr[6], bArr[29], bArr[46], objArr214);
                        method5 = cls43.getMethod((String) objArr214[0], cls4, cls4, cls4);
                        map.put(1459979046, method5);
                    }
                    objArr5 = (Object[]) ((Method) method5).invoke(null, objArr213);
                    Class cls44 = (Class) getMessageVersion.getSDKTransactionID(721 - TextUtils.getTrimmedLength(""), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    Object[] objArr215 = new Object[1];
                    b(bArr[6], bArr[29], bArr[46], objArr215);
                    cls44.getField((String) objArr215[0]).set(null, objArr5);
                    Long lValueOf8 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                    Class cls113 = (Class) getMessageVersion.getSDKTransactionID(721 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getTouchSlop() >> 8), 32 - Process.getGidForName(""));
                    c13 = 1;
                    Object[] objArr216 = new Object[1];
                    b(bArr[29], bArr[c12], bArr[46], objArr216);
                    c14 = 0;
                    cls113.getField((String) objArr216[0]).set(null, lValueOf8);
                } else {
                    Object[] objArr217 = {Integer.valueOf(iIntValue3), 0, 1196282296};
                    method5 = map.get(1459979046);
                    if (method5 == null) {
                        Class cls45 = (Class) getMessageVersion.getSDKTransactionID(721 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) KeyEvent.getDeadChar(0, 0), 32 - TextUtils.lastIndexOf("", '0', 0));
                        Object[] objArr218 = new Object[1];
                        b(bArr[6], bArr[29], bArr[46], objArr218);
                        method5 = cls45.getMethod((String) objArr218[0], cls4, cls4, cls4);
                        map.put(1459979046, method5);
                    }
                    objArr5 = (Object[]) ((Method) method5).invoke(null, objArr217);
                    Class cls46 = (Class) getMessageVersion.getSDKTransactionID(721 - TextUtils.getTrimmedLength(""), (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    Object[] objArr219 = new Object[1];
                    b(bArr[6], bArr[29], bArr[46], objArr219);
                    cls46.getField((String) objArr219[0]).set(null, objArr5);
                    Long lValueOf9 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                    Class cls114 = (Class) getMessageVersion.getSDKTransactionID(721 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) (ViewConfiguration.getTouchSlop() >> 8), 32 - Process.getGidForName(""));
                    c13 = 1;
                    Object[] objArr2110 = new Object[1];
                    b(bArr[29], bArr[c12], bArr[46], objArr2110);
                    c14 = 0;
                    cls114.getField((String) objArr2110[0]).set(null, lValueOf9);
                }
                i12 = ((int[]) objArr5[c13])[c14];
                i13 = ((int[]) objArr5[c14])[c14];
                if (i13 == i12) {
                    getMessageVersion = (ChallengeResultCancelled + 55) % 128;
                    int i210 = ((int[]) objArr5[9])[c14];
                    Object[] objArr220 = new Object[3];
                    objArr220[2] = 0;
                    objArr220[1] = Integer.valueOf(i210);
                    objArr220[c14] = objArr5;
                    method17 = map.get(Integer.valueOf((int) r7));
                    if (method17 != null) {
                        method17 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getDoubleTapTimeout() >> 16) + 2718, (char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 30 - Process.getGidForName(""))).getMethod("AuthenticationRequestParameters", Object[].class, cls4, cls4);
                        map.put(-1124906587, method17);
                    }
                    ((Method) method17).invoke(null, objArr220);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add((String) objArr5[2]);
                    arrayList2.add((String) objArr5[3]);
                    arrayList2.add((String) objArr5[4]);
                    arrayList2.add((String) objArr5[5]);
                    arrayList2.add((String) objArr5[6]);
                    arrayList2.add((String) objArr5[7]);
                    arrayList2.add((String) objArr5[8]);
                    Object[] objArr313 = {Long.valueOf(((long) (i12 ^ i13)) ^ (-1026008944746692608L)), -238886324L};
                    byte[] bArr15 = $$d;
                    Object[] objArr314 = new Object[1];
                    a((short) 145, bArr15[174], bArr15[c11], objArr314);
                    Class<?> cls115 = Class.forName((String) objArr314[0]);
                    Object[] objArr315 = new Object[1];
                    a((short) 165, (byte) (-bArr15[506]), bArr15[29], objArr315);
                    cls115.getMethod((String) objArr315[0], cls, cls).invoke(null, objArr313);
                    Object[] objArr316 = {objArr5, Integer.valueOf(((int[]) objArr5[9])[0]), 0};
                    method6 = map.get(Integer.valueOf((int) r7));
                    if (method6 != null) {
                        method6 = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.lastIndexOf("", '0') + 2719, (char) View.MeasureSpec.getMode(0), 31 - View.resolveSize(0, 0))).getMethod("AuthenticationRequestParameters", Object[].class, cls4, cls4);
                        map.put(Integer.valueOf((int) r7), method6);
                    }
                    ((Method) method6).invoke(null, objArr316);
                }
                Class cls116 = (Class) getMessageVersion.getSDKTransactionID(665 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 24 - ImageFormat.getBitsPerPixel(0));
                byte b18 = bArr[21];
                Object[] objArr317 = new Object[1];
                b(b18, b18, bArr[46], objArr317);
                j12 = cls116.getField((String) objArr317[0]).getLong(null);
                if (j12 != -1) {
                    getMessageVersion = (ChallengeResultCancelled + 79) % 128;
                    if (j12 + 1915 >= ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
                        Class cls117 = (Class) getMessageVersion.getSDKTransactionID(664 - Drawable.resolveOpacity(0, 0), (char) TextUtils.indexOf("", "", 0), 25 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        i14 = 64314;
                        Object[] objArr318 = new Object[1];
                        b(bArr[29], bArr[c12], bArr[46], objArr318);
                        Object[] objArr319 = {cls117.getField((String) objArr318[0]).get(null), 1501601261, 0};
                        method16 = map.get(1046315470);
                        if (method16 != null) {
                            method16 = ((Class) getMessageVersion.getSDKTransactionID(2802 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 64314), 28 - ExpandableListView.getPackedPositionType(0L))).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                            map.put(1046315470, method16);
                        }
                        objArr7 = (Object[]) ((Method) method16).invoke(null, objArr319);
                    } else {
                        i14 = 64314;
                        Object[] objArr3110 = new Object[1];
                        c(new int[]{1698694749, 2050588183, -457991778, -901528728, 817195746, 53710434, -351119689, -863152896, 134460595, -385560032, -1944164246, -842691740, -1851792335, 1506328281}, 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3110);
                        Class<?> cls118 = Class.forName(((String) objArr3110[0]).intern());
                        Object[] objArr3111 = new Object[1];
                        c(new int[]{-1835255182, -1610659434, -1614285291, 457102511, 784845012, 603573056, -596228922, 2092248793, -147281931, 624053858}, TextUtils.indexOf("", "", 0, 0) + 18, objArr3111);
                        applicationContext = (Context) cls118.getMethod(((String) objArr3111[0]).intern(), null).invoke(null, null);
                        if (applicationContext != null) {
                            applicationContext = applicationContext.getApplicationContext();
                        }
                        getMessageVersion = (ChallengeResultCancelled + 49) % 128;
                        Object[] objArr3112 = {applicationContext, Integer.valueOf(iIntValue3), 1501601261};
                        byte[] bArr16 = $$d;
                        context = applicationContext;
                        Object[] objArr410 = new Object[1];
                        a((short) 109, bArr16[137], bArr16[c11], objArr410);
                        Class<?> cls119 = Class.forName((String) objArr410[0]);
                        Object[] objArr411 = new Object[1];
                        a((short) 597, (byte) (-bArr16[199]), bArr16[29], objArr411);
                        objArr6 = (Object[]) cls119.getMethod((String) objArr411[0], Context.class, cls4, cls4).invoke(null, objArr3112);
                        if (context != null) {
                            Class cls1110 = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.blue(0), 25 - TextUtils.getOffsetBefore("", 0));
                            Object[] objArr412 = new Object[1];
                            b(bArr[29], bArr[c12], bArr[46], objArr412);
                            cls1110.getField((String) objArr412[0]).set(null, objArr6);
                            Long lValueOf10 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                            Class cls1111 = (Class) getMessageVersion.getSDKTransactionID(664 - Drawable.resolveOpacity(0, 0), (char) (TextUtils.lastIndexOf("", '0') + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 25);
                            byte b19 = bArr[21];
                            Object[] objArr413 = new Object[1];
                            b(b19, b19, bArr[46], objArr413);
                            cls1111.getField((String) objArr413[0]).set(null, lValueOf10);
                        }
                        objArr7 = objArr6;
                    }
                } else {
                    i14 = 64314;
                    Object[] objArr3113 = new Object[1];
                    c(new int[]{1698694749, 2050588183, -457991778, -901528728, 817195746, 53710434, -351119689, -863152896, 134460595, -385560032, -1944164246, -842691740, -1851792335, 1506328281}, 26 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr3113);
                    Class<?> cls1112 = Class.forName(((String) objArr3113[0]).intern());
                    Object[] objArr3114 = new Object[1];
                    c(new int[]{-1835255182, -1610659434, -1614285291, 457102511, 784845012, 603573056, -596228922, 2092248793, -147281931, 624053858}, TextUtils.indexOf("", "", 0, 0) + 18, objArr3114);
                    applicationContext = (Context) cls1112.getMethod(((String) objArr3114[0]).intern(), null).invoke(null, null);
                    if (applicationContext != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    }
                    getMessageVersion = (ChallengeResultCancelled + 49) % 128;
                    Object[] objArr3115 = {applicationContext, Integer.valueOf(iIntValue3), 1501601261};
                    byte[] bArr17 = $$d;
                    context = applicationContext;
                    Object[] objArr414 = new Object[1];
                    a((short) 109, bArr17[137], bArr17[c11], objArr414);
                    Class<?> cls1113 = Class.forName((String) objArr414[0]);
                    Object[] objArr415 = new Object[1];
                    a((short) 597, (byte) (-bArr17[199]), bArr17[29], objArr415);
                    objArr6 = (Object[]) cls1113.getMethod((String) objArr415[0], Context.class, cls4, cls4).invoke(null, objArr3115);
                    if (context != null) {
                        Class cls1114 = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) Color.blue(0), 25 - TextUtils.getOffsetBefore("", 0));
                        Object[] objArr416 = new Object[1];
                        b(bArr[29], bArr[c12], bArr[46], objArr416);
                        cls1114.getField((String) objArr416[0]).set(null, objArr6);
                        Long lValueOf11 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                        Class cls1115 = (Class) getMessageVersion.getSDKTransactionID(664 - Drawable.resolveOpacity(0, 0), (char) (TextUtils.lastIndexOf("", '0') + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 25);
                        byte b110 = bArr[21];
                        Object[] objArr417 = new Object[1];
                        b(b110, b110, bArr[46], objArr417);
                        cls1115.getField((String) objArr417[0]).set(null, lValueOf11);
                    }
                    objArr7 = objArr6;
                }
                i15 = ((int[]) objArr7[1])[0];
                i16 = ((int[]) objArr7[0])[0];
                if (i16 == i15) {
                    i24 = getMessageVersion + 13;
                    ChallengeResultCancelled = i24 % 128;
                    if (i24 % 2 != 0) {
                        Object[] objArr418 = {objArr7, Integer.valueOf(((int[]) objArr7[3])[1]), 1};
                        method15 = map.get(1046315470);
                        if (method15 != null) {
                            method15 = ((Class) getMessageVersion.getSDKTransactionID(2802 - View.resolveSize(0, 0), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 64313), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 27)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                            map.put(1046315470, method15);
                        }
                        ((Method) method15).invoke(null, objArr418);
                    } else {
                        Object[] objArr419 = {objArr7, Integer.valueOf(((int[]) objArr7[3])[0]), 0};
                        method14 = map.get(1046315470);
                        if (method14 != null) {
                            method14 = ((Class) getMessageVersion.getSDKTransactionID(2802 - Color.red(0), (char) ((ViewConfiguration.getScrollBarSize() >> 8) + i14), View.getDefaultSize(0, 0) + 28)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                            map.put(1046315470, method14);
                        }
                        ((Method) method14).invoke(null, objArr419);
                    }
                } else {
                    Object[] objArr512 = {Long.valueOf(((long) (i15 ^ i16)) ^ (-8174252319764905984L)), -1903216425L};
                    byte[] bArr18 = $$d;
                    Object[] objArr513 = objArr7;
                    Object[] objArr514 = new Object[1];
                    a((short) 355, bArr18[174], bArr18[c11], objArr514);
                    Class<?> cls210 = Class.forName((String) objArr514[0]);
                    Object[] objArr515 = new Object[1];
                    a((short) 597, (byte) (-bArr18[199]), bArr18[29], objArr515);
                    cls210.getMethod((String) objArr515[0], cls, cls).invoke(null, objArr512);
                    Object[] objArr516 = {objArr513, Integer.valueOf(((int[]) objArr513[3])[0]), 0};
                    method7 = map.get(1046315470);
                    if (method7 != null) {
                        method7 = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf("", "", 0, 0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (TextUtils.getOffsetAfter("", 0) + i14), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 27)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                        map.put(1046315470, method7);
                    }
                    ((Method) method7).invoke(null, objArr516);
                }
                Class cls211 = (Class) getMessageVersion.getSDKTransactionID(663 - Process.getGidForName(""), (char) Color.green(0), (KeyEvent.getMaxKeyCode() >> 16) + 25);
                Object[] objArr517 = new Object[1];
                b((byte) (bArr[88] + 1), bArr[4], bArr[46], objArr517);
                j13 = cls211.getField((String) objArr517[0]).getLong(null);
                if (j13 != -1) {
                    ChallengeResultCancelled = (getMessageVersion + 39) % 128;
                    if (j13 + 1850 >= ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
                        Class cls212 = (Class) getMessageVersion.getSDKTransactionID(664 - TextUtils.indexOf("", ""), (char) (Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 25);
                        Object[] objArr518 = new Object[1];
                        b((byte) (-bArr[r6]), bArr[21], bArr[c12], objArr518);
                        Object[] objArr519 = {cls212.getField((String) objArr518[0]).get(null), 1210009077, 0};
                        method13 = map.get(1046315470);
                        if (method13 != null) {
                            method13 = ((Class) getMessageVersion.getSDKTransactionID(2801 - ExpandableListView.getPackedPositionChild(0L), (char) (i14 - (ViewConfiguration.getPressedStateDuration() >> 16)), 28 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                            map.put(1046315470, method13);
                        }
                        objArr8 = (Object[]) ((Method) method13).invoke(null, objArr519);
                        c15 = 1;
                        i17 = 0;
                    } else {
                        Object[] objArr5110 = {Integer.valueOf(iIntValue3), 1210009077};
                        byte[] bArr19 = $$d;
                        Object[] objArr5111 = new Object[1];
                        a((short) (bArr19[151] - 1), bArr19[58], bArr19[c11], objArr5111);
                        Class<?> cls213 = Class.forName((String) objArr5111[0]);
                        Object[] objArr610 = new Object[1];
                        a((short) 441, (byte) (-bArr19[6]), bArr19[29], objArr610);
                        Object[] objArr611 = (Object[]) cls213.getMethod((String) objArr610[0], cls4, cls4).invoke(null, objArr5110);
                        Class cls214 = (Class) getMessageVersion.getSDKTransactionID(View.getDefaultSize(0, 0) + 664, (char) Color.alpha(0), 25 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                        Object[] objArr612 = new Object[1];
                        b((byte) (-bArr[r6]), bArr[21], bArr[c12], objArr612);
                        cls214.getField((String) objArr612[0]).set(null, objArr611);
                        Long lValueOf12 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                        Class cls215 = (Class) getMessageVersion.getSDKTransactionID(664 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 25 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                        c15 = 1;
                        Object[] objArr613 = new Object[1];
                        b((byte) (bArr[88] + 1), bArr[4], bArr[46], objArr613);
                        i17 = 0;
                        cls215.getField((String) objArr613[0]).set(null, lValueOf12);
                        objArr8 = objArr611;
                    }
                } else {
                    Object[] objArr5112 = {Integer.valueOf(iIntValue3), 1210009077};
                    byte[] bArr110 = $$d;
                    Object[] objArr5113 = new Object[1];
                    a((short) (bArr110[151] - 1), bArr110[58], bArr110[c11], objArr5113);
                    Class<?> cls216 = Class.forName((String) objArr5113[0]);
                    Object[] objArr614 = new Object[1];
                    a((short) 441, (byte) (-bArr110[6]), bArr110[29], objArr614);
                    Object[] objArr615 = (Object[]) cls216.getMethod((String) objArr614[0], cls4, cls4).invoke(null, objArr5112);
                    Class cls217 = (Class) getMessageVersion.getSDKTransactionID(View.getDefaultSize(0, 0) + 664, (char) Color.alpha(0), 25 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    Object[] objArr616 = new Object[1];
                    b((byte) (-bArr[r6]), bArr[21], bArr[c12], objArr616);
                    cls217.getField((String) objArr616[0]).set(null, objArr615);
                    Long lValueOf13 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                    Class cls218 = (Class) getMessageVersion.getSDKTransactionID(664 - KeyEvent.getDeadChar(0, 0), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 25 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    c15 = 1;
                    Object[] objArr617 = new Object[1];
                    b((byte) (bArr[88] + 1), bArr[4], bArr[46], objArr617);
                    i17 = 0;
                    cls218.getField((String) objArr617[0]).set(null, lValueOf13);
                    objArr8 = objArr615;
                }
                i18 = ((int[]) objArr8[c15])[i17];
                i19 = ((int[]) objArr8[i17])[i17];
                if (i19 == i18) {
                    int i211 = ((int[]) objArr8[3])[i17];
                    Object[] objArr618 = new Object[3];
                    objArr618[2] = 0;
                    objArr618[1] = Integer.valueOf(i211);
                    objArr618[i17] = objArr8;
                    method12 = map.get(1046315470);
                    if (method12 != null) {
                        method12 = ((Class) getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(i17) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64315 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.getCapsMode("", i17, i17) + 28)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                        map.put(1046315470, method12);
                    }
                    ((Method) method12).invoke(null, objArr618);
                } else {
                    new ArrayList().add((String) objArr8[2]);
                    Object[] objArr619 = {Long.valueOf(((long) (i18 ^ i19)) ^ 2993095591128465408L), 696884357L};
                    byte[] bArr20 = $$d;
                    Object[] objArr710 = objArr8;
                    Object[] objArr711 = new Object[1];
                    a((short) 355, bArr20[174], bArr20[c11], objArr711);
                    Class<?> cls219 = Class.forName((String) objArr711[0]);
                    Object[] objArr712 = new Object[1];
                    a((short) 597, (byte) (-bArr20[199]), bArr20[29], objArr712);
                    cls219.getMethod((String) objArr712[0], cls, cls).invoke(null, objArr619);
                    Object[] objArr713 = {objArr710, Integer.valueOf(((int[]) objArr710[3])[0]), 0};
                    method8 = map.get(1046315470);
                    if (method8 != null) {
                        method8 = ((Class) getMessageVersion.getSDKTransactionID(2850 - AndroidCharacter.getMirror('0'), (char) (KeyEvent.normalizeMetaState(0) + i14), ExpandableListView.getPackedPositionGroup(0L) + 28)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                        map.put(1046315470, method8);
                    }
                    ((Method) method8).invoke(null, objArr713);
                }
                Class cls310 = (Class) getMessageVersion.getSDKTransactionID(663 - ExpandableListView.getPackedPositionChild(0L), (char) Color.green(0), Gravity.getAbsoluteGravity(0, 0) + 25);
                Object[] objArr714 = new Object[1];
                b(bArr[6], bArr[29], bArr[46], objArr714);
                j14 = cls310.getField((String) objArr714[0]).getLong(null);
                if (j14 != -1) {
                    Object[] objArr715 = new Object[1];
                    c(new int[]{1698694749, 2050588183, -457991778, -901528728, 817195746, 53710434, -351119689, -863152896, 134460595, -385560032, -1944164246, -842691740, -1851792335, 1506328281}, 25 - TextUtils.lastIndexOf("", '0'), objArr715);
                    Class<?> cls311 = Class.forName(((String) objArr715[0]).intern());
                    Object[] objArr716 = new Object[1];
                    c(new int[]{-1835255182, -1610659434, -1614285291, 457102511, 784845012, 603573056, -596228922, 2092248793, -147281931, 624053858}, (ViewConfiguration.getLongPressTimeout() >> 16) + 18, objArr716);
                    applicationContext2 = (Context) cls311.getMethod(((String) objArr716[0]).intern(), null).invoke(null, null);
                    if (applicationContext2 != null) {
                        applicationContext2 = applicationContext2.getApplicationContext();
                    }
                    Object[] objArr717 = {applicationContext2, Integer.valueOf(iIntValue3), 691818142};
                    byte[] bArr111 = $$d;
                    context2 = applicationContext2;
                    Object[] objArr718 = new Object[1];
                    a((short) 634, bArr111[4], bArr111[c11], objArr718);
                    Class<?> cls312 = Class.forName((String) objArr718[0]);
                    Object[] objArr719 = new Object[1];
                    a((short) 441, (byte) (-bArr111[6]), bArr111[29], objArr719);
                    objArr9 = (Object[]) cls312.getMethod((String) objArr719[0], Context.class, cls4, cls4).invoke(null, objArr717);
                    if (context2 != null) {
                        i21 = ChallengeResultCancelled + 53;
                        getMessageVersion = i21 % 128;
                        if (i21 % 2 == 0) {
                            Class cls313 = (Class) getMessageVersion.getSDKTransactionID((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 664, (char) (ViewConfiguration.getEdgeSlop() >> 16), Process.getGidForName("") + 26);
                            Object[] objArr810 = new Object[1];
                            b((byte) (-bArr[54]), bArr[51], bArr[21], objArr810);
                            cls313.getField((String) objArr810[0]).set(null, objArr9);
                            lValueOf = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, new Class[1]).invoke(null, new Object[1])).longValue());
                            cls2 = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), ImageFormat.getBitsPerPixel(0) + 26);
                            Object[] objArr811 = new Object[1];
                            b(bArr[6], bArr[29], bArr[46], objArr811);
                            obj = objArr811[0];
                        } else {
                            Class cls314 = (Class) getMessageVersion.getSDKTransactionID(663 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), Drawable.resolveOpacity(0, 0) + 25);
                            Object[] objArr812 = new Object[1];
                            b((byte) (-bArr[54]), bArr[51], bArr[21], objArr812);
                            cls314.getField((String) objArr812[0]).set(null, objArr9);
                            lValueOf = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                            cls2 = (Class) getMessageVersion.getSDKTransactionID(664 - KeyEvent.normalizeMetaState(0), (char) View.MeasureSpec.getMode(0), 25 - TextUtils.indexOf("", "", 0));
                            Object[] objArr813 = new Object[1];
                            b(bArr[6], bArr[29], bArr[46], objArr813);
                            obj = objArr813[0];
                        }
                        cls2.getField((String) obj).set(null, lValueOf);
                    }
                } else {
                    Object[] objArr7110 = new Object[1];
                    c(new int[]{1698694749, 2050588183, -457991778, -901528728, 817195746, 53710434, -351119689, -863152896, 134460595, -385560032, -1944164246, -842691740, -1851792335, 1506328281}, 25 - TextUtils.lastIndexOf("", '0'), objArr7110);
                    Class<?> cls315 = Class.forName(((String) objArr7110[0]).intern());
                    Object[] objArr7111 = new Object[1];
                    c(new int[]{-1835255182, -1610659434, -1614285291, 457102511, 784845012, 603573056, -596228922, 2092248793, -147281931, 624053858}, (ViewConfiguration.getLongPressTimeout() >> 16) + 18, objArr7111);
                    applicationContext2 = (Context) cls315.getMethod(((String) objArr7111[0]).intern(), null).invoke(null, null);
                    if (applicationContext2 != null) {
                        applicationContext2 = applicationContext2.getApplicationContext();
                    }
                    Object[] objArr7112 = {applicationContext2, Integer.valueOf(iIntValue3), 691818142};
                    byte[] bArr112 = $$d;
                    context2 = applicationContext2;
                    Object[] objArr7113 = new Object[1];
                    a((short) 634, bArr112[4], bArr112[c11], objArr7113);
                    Class<?> cls316 = Class.forName((String) objArr7113[0]);
                    Object[] objArr7114 = new Object[1];
                    a((short) 441, (byte) (-bArr112[6]), bArr112[29], objArr7114);
                    objArr9 = (Object[]) cls316.getMethod((String) objArr7114[0], Context.class, cls4, cls4).invoke(null, objArr7112);
                    if (context2 != null) {
                        i21 = ChallengeResultCancelled + 53;
                        getMessageVersion = i21 % 128;
                        if (i21 % 2 == 0) {
                            Class cls317 = (Class) getMessageVersion.getSDKTransactionID((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 664, (char) (ViewConfiguration.getEdgeSlop() >> 16), Process.getGidForName("") + 26);
                            Object[] objArr814 = new Object[1];
                            b((byte) (-bArr[54]), bArr[51], bArr[21], objArr814);
                            cls317.getField((String) objArr814[0]).set(null, objArr9);
                            lValueOf = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, new Class[1]).invoke(null, new Object[1])).longValue());
                            cls2 = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), ImageFormat.getBitsPerPixel(0) + 26);
                            Object[] objArr815 = new Object[1];
                            b(bArr[6], bArr[29], bArr[46], objArr815);
                            obj = objArr815[0];
                        } else {
                            Class cls318 = (Class) getMessageVersion.getSDKTransactionID(663 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) TextUtils.getCapsMode("", 0, 0), Drawable.resolveOpacity(0, 0) + 25);
                            Object[] objArr816 = new Object[1];
                            b((byte) (-bArr[54]), bArr[51], bArr[21], objArr816);
                            cls318.getField((String) objArr816[0]).set(null, objArr9);
                            lValueOf = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                            cls2 = (Class) getMessageVersion.getSDKTransactionID(664 - KeyEvent.normalizeMetaState(0), (char) View.MeasureSpec.getMode(0), 25 - TextUtils.indexOf("", "", 0));
                            Object[] objArr817 = new Object[1];
                            b(bArr[6], bArr[29], bArr[46], objArr817);
                            obj = objArr817[0];
                        }
                        cls2.getField((String) obj).set(null, lValueOf);
                    }
                }
                i22 = ((int[]) objArr9[1])[0];
                i23 = ((int[]) objArr9[0])[0];
                if (i23 == i22) {
                    Object[] objArr818 = {objArr9, Integer.valueOf(((int[]) objArr9[3])[0]), 0};
                    method11 = map.get(1046315470);
                    if (method11 != null) {
                        method11 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getJumpTapTimeout() >> 16) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (i14 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 28)).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                        map.put(1046315470, method11);
                    }
                    ((Method) method11).invoke(null, objArr818);
                } else {
                    Object[] objArr819 = {Long.valueOf(((long) (i22 ^ i23)) ^ (-2246607979908431872L)), -523078670L};
                    short s16 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE;
                    byte[] bArr113 = $$d;
                    Object[] objArr97 = new Object[1];
                    a(s16, (byte) (-bArr113[57]), bArr113[c11], objArr97);
                    Class<?> cls319 = Class.forName((String) objArr97[0]);
                    Object[] objArr98 = new Object[1];
                    a((short) 441, (byte) (-bArr113[6]), bArr113[29], objArr98);
                    cls319.getMethod((String) objArr98[0], cls, cls).invoke(null, objArr819);
                    Object[] objArr99 = {objArr9, Integer.valueOf(((int[]) objArr9[3])[0]), 0};
                    method9 = map.get(1046315470);
                    if (method9 != null) {
                        method9 = ((Class) getMessageVersion.getSDKTransactionID((Process.myPid() >> 22) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (ExpandableListView.getPackedPositionChild(0L) + 64315), 29 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))).getMethod("getSDKTransactionID", Object[].class, cls4, cls4);
                        map.put(1046315470, method9);
                    }
                    ((Method) method9).invoke(null, objArr99);
                }
                atd.json.BuildConfig.getSDKTransactionID(activity, atd.ad.getDeviceData.CURRENT_ACTIVITY);
                atd.ad.getDeviceData getdevicedata2 = atd.ad.getDeviceData.CHALLENGE_PARAMETERS;
                atd.json.BuildConfig.getSDKTransactionID(challengeParameters, getdevicedata2);
                atd.json.BuildConfig.AuthenticationRequestParameters(challengeParameters.getAcsTransactionID(), getdevicedata2);
                atd.json.BuildConfig.AuthenticationRequestParameters(challengeParameters.get3DSServerTransactionID(), getdevicedata2);
                atd.json.BuildConfig.getSDKTransactionID(challengeStatusReceiver, atd.ad.getDeviceData.CHALLENGE_STATUS_RECEIVER);
                int i212 = iIntValue3;
                atd.json.BuildConfig.getSDKAppID(i212, atd.ad.getDeviceData.TIMEOUT);
                getadditionaldetails = getadditionaldetails2;
                getadditionaldetails.getSDKAppID = new WeakReference<>(activity);
                getadditionaldetails.AuthenticationRequestParameters = challengeStatusReceiver;
                atd.g.getDeviceData deviceData2 = getadditionaldetails.getDeviceData(challengeParameters.getAcsSignedContent());
                if (getadditionaldetails.getSDKReferenceNumber.getMessageVersion().equals(getSDKAppID.V2_1_0.getSDKReferenceNumber())) {
                    getMessageVersion = (ChallengeResultCancelled + 51) % 128;
                    threeDSRequestorAppURL = challengeParameters.getThreeDSRequestorAppURL();
                } else {
                    threeDSRequestorAppURL = null;
                }
                atd.e.getSDKAppID getsdkappid2 = new atd.e.getSDKAppID(new atd.ao.AuthenticationRequestParameters(getadditionaldetails.getSDKReferenceNumber.getSDKTransactionID(), challengeParameters.get3DSServerTransactionID(), challengeParameters.getAcsTransactionID(), null), threeDSRequestorAppURL, getadditionaldetails.getSDKReferenceNumber.getMessageVersion());
                Object deviceData$6866fd83 = getadditionaldetails.getDeviceData$6866fd82(challengeParameters.getAcsTransactionID(), deviceData2.getSDKTransactionID());
                method10 = map.get(-1920284156);
                if (method10 != null) {
                    objArr10 = null;
                } else {
                    Class cls320 = (Class) getMessageVersion.getSDKTransactionID((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (54380 - (Process.myTid() >> 22)), Color.red(0) + 36);
                    byte[] bArr114 = $$d;
                    short s17 = bArr114[58];
                    Object[] objArr910 = new Object[1];
                    a(s17, (byte) (s17 | 51), bArr114[29], objArr910);
                    objArr10 = null;
                    method10 = cls320.getMethod((String) objArr910[0], null);
                    map.put(-1920284156, method10);
                }
                getadditionaldetails.ChallengeResult = (atd.d.getSDKTransactionID) ((Method) method10).invoke(objArr10, objArr10);
                String sDKAppID2 = deviceData2.getSDKAppID();
                deviceData2.AuthenticationRequestParameters();
                atd.d.getSDKTransactionID getsdktransactionid2 = getadditionaldetails.ChallengeResult;
                Object[] objArr911 = {sDKAppID2, deviceData$6866fd83, getsdkappid2, Integer.valueOf(i212), getadditionaldetails};
                declaredMethod = map.get(-1572593602);
                if (declaredMethod != null) {
                    Class cls321 = (Class) getMessageVersion.getSDKTransactionID((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, (char) (54379 - TextUtils.lastIndexOf("", '0', 0)), 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte[] bArr115 = $$d;
                    short s18 = bArr115[58];
                    Object[] objArr912 = new Object[1];
                    a(s18, (byte) (s18 | 51), bArr115[29], objArr912);
                    declaredMethod = cls321.getDeclaredMethod((String) objArr912[0], String.class, (Class) getMessageVersion.getSDKTransactionID(172 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 10255), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 31), atd.e.getSDKAppID.class, cls4, getDeviceData.class);
                    map.put(-1572593602, declaredMethod);
                }
                ((Method) declaredMethod).invoke(getsdktransactionid2, objArr911);
                return null;
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
            Object[] objArr100 = {Integer.valueOf(iIntValue3), -452745806};
            Map map3 = getMessageVersion.timedout;
            Object method24 = map3.get(-836670848);
            if (method24 == null) {
                Class cls47 = (Class) getMessageVersion.getSDKTransactionID((Process.myTid() >> 22) + 754, (char) (16830 - Color.green(0)), 35 - KeyEvent.getDeadChar(0, 0));
                Object[] objArr101 = new Object[1];
                b((byte) (bArr[88] + 1), (byte) bArr[4], (byte) bArr[46], objArr101);
                method24 = cls47.getMethod((String) objArr101[0], cls4, cls4);
                map3.put(-836670848, method24);
            }
            objInvoke = ((Method) method24).invoke(null, objArr100);
            Class cls48 = (Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 754, (char) (16830 - KeyEvent.getDeadChar(0, 0)), 35 - (ViewConfiguration.getPressedStateDuration() >> 16));
            byte b21 = (byte) bArr[21];
            byte b22 = (byte) bArr[46];
            Object[] objArr102 = new Object[1];
            b(b21, b21, b22, objArr102);
            cls48.getField((String) objArr102[0]).set(null, objInvoke);
        } catch (Throwable th4) {
            Throwable cause3 = th4.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th4;
        }
    }

    static void init$0() {
        $$a = new byte[]{101, 91, -23, 21, 4, -13, 35, 17, -5, 12, -45, 2, 41, 7, 4, -13, 50, -31, -15, 15, 8, 0, 35, -27, -17, 21, -50, 3, 14, 5, -7, -4, 13, 8, 4, -17, 13, -4, 3, 30, -17, -10, -2, 18, -12, 1, 38, -15, -15, 19, -10, 10, -13, 17, -11, 1, 4, -13, 35, 17, -5, -7, -28, 19, -11, -3, 20, 0, -15, 13, -4, 3, 39, 7, 4, -13, 35, 17, -5, -5, -17, 1, 3, -11, 15, -7, 13, 0, 25, -37, 10, 13, -1, -11, -49, 14, -1, 10, 35, -42, 3, 10, -1, 4};
        $$b = 70;
    }

    static void init$1() {
        byte[] bArr = new byte[648];
        System.arraycopy("D.\u0005\u0003\u0018õÏ8\u000eÉ\u00189\u0004ù\u0002\u000e\u000búÿ\u0003\u0018ú\u000b\u0004é\u0018\u0011\tõ\u0013\u0006á\u0016\u0016ô\u0011ý\u0014ö\u0012\u0006\u0003\u0014äö\f\u000e#ô\u0012\nó\u0007\u0016ú\u000b\u0004à\u0000\u0018õÏ8\u0005Ò\u001a*þ\u0010\u0005þ\u000eþ\u0003ó&ò\u0018\u0006\u0003ä\u0018\u0003\u0007\t\u0012ô\u00129\u0004ù\u0002\u000e\u000búÿ\u0003\u0018ú\u000b\u0004é\u0018\u0011\tõ\u0013\u0006á\u0016\u0016ô\u0011ý\u0014ö\u0012\u0006\u0018õÏCÇ\u001a*þ\u0010\u0005þ\u000eþ\u0003ò\u0018\u0013\u0007ü\rå\u001a\tý\u000f\u000b\u0004\u0018õÏ8\u0005Ò>\u0003\u0014äö\fÿ0ý\u0002\rý\u0012ô\u0010é*ò\u000f\u0002ÿí\u001f\u0019°H\u0003\u0014äö\f\f\u0018\u0006\u0004\u0012ø\u000eú\u0007î,ýú\b\u0012\u0003\u0014Õ&\u0016øÿ\u0007ä\"\u0018ò\u0018õÏ8Ò>\u0003\u0014äö\f\u000e#ô\u0012\nó\u0007\u0016ú\u000b\u0004à\u0000åH\u0003\u0014Õ&\u0016øÿ\u0007ä\"\u0018ò\u0018õÏDÆ:\u0011\u0003\b\u0001þ\u0014ö\u0004ÅH\u0003\u0014äö\f\f\u0018\u0006\u0004\u0012ø\u000eú\u0007î,ýú\b\u0012\u0018õÏO»\u001a*þ\u0010\u0005þ\u000eþ\u0003ò\u0018\u0013\u0007ü\rÜ.µH\u0003\u0014Õ&\u0016øÿ\u0007ä\"\u0018ò\u0018õÏN¼>\u0003\u0014äö\f\f\u0018\u0006\u0004\u0012ø\u000eú\u0007î,ýú\b\u0012·H\u0003\u0014äö\f\f\u0018\u0006\u0004\u0012ø\u000eú\u0007î,ýú\b\u0012\u0018õÏN¼>\u0003\u0014å#ô\u0012\nó\u0007\u0016ú\u000b\u0004ê&ò\u0018\u0006\u0003¶H\u0003\u0014Õ&\u0016øÿ\u0007ä\"\u0018ò\u0018õÏ9Ñ>\u0003\u0014äö\fÿ0ý\u0002\rý\u0012ô\u0010é*ò\u000f\u0002ÿí\u001f\u0019\u0018õÏDÆ>\u0003\u0014äö\fû4\u0005Þ\u0000åH\u0003\u0014äö\f\f\u0018\u0006\u0004\u0012ø\u000eú\u0007î,ýú\b\u0012\u0003\u0014äö\f\f\u0018\u0006\u0004\u0012ø\u000eú\u0007î,ýú\b\u0012\u0018õÏN¼>\u0003\u0014Ö2\u0005\u0002\b×&\u0013õ\u0014ü\f\tú\u000b\u0004»H\u0003\u0014äö\fû4\u0005Þ\u0000\u0018õÏO»\u00189\u0004ù\u0002\u000e\u000búÿ\u0003\u0018ú\u000b\u0004é\u0018\u0011\tõ\u0013\u0006á\u0016\u0016ô\u0011ý\u0014ö\u0012\u0006¶H\u0003\u0014äö\fû4\u0005Þ\u0000\u0018õÏDÆ\u001a*þ\u0010\u0005þ\u000eþ\u0003ò\u0018\u0013\u0007ü\rÔ#\u0012ú\u0007\f\u0005þ\u0004Å\"9\u0004ù\u0002\u000e\u000búÿ\u0003\u0018ú\u000b\u0004é\u0018\u0011\tõ\u0013\u0006á\u0016\u0016ô\u0011ý\u0014ö\u0012\u0006\u0003\u0014äö\fû4\u0005Þ\u0000".getBytes("ISO-8859-1"), 0, bArr, 0, 648);
        $$d = bArr;
        $$e = 194;
    }

    static void init$2() {
        $$g = new byte[]{124, -16, -101, -118};
        $$h = EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE;
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public final void cancelled() throws Throwable {
        int i11 = getMessageVersion + 113;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKReferenceNumber();
            getSDKEphemeralPublicKey();
            throw null;
        }
        getSDKReferenceNumber();
        ChallengeStatusReceiver sDKEphemeralPublicKey = getSDKEphemeralPublicKey();
        if (sDKEphemeralPublicKey != null) {
            ChallengeResultCancelled = (getMessageVersion + 75) % 128;
            sDKEphemeralPublicKey.cancelled();
            close();
            ChallengeResultCancelled = (getMessageVersion + 71) % 128;
        }
    }

    @Override // com.adyen.threeds2.Transaction
    public final void close() throws Throwable {
        int i11 = getMessageVersion + 99;
        int i12 = i11 % 128;
        ChallengeResultCancelled = i12;
        if (i11 % 2 != 0) {
            throw null;
        }
        List<X509Certificate> list = this.getSDKTransactionID;
        if (list != null) {
            int i13 = i12 + 85;
            getMessageVersion = i13 % 128;
            if (i13 % 2 == 0) {
                list.iterator();
                throw null;
            }
            Iterator<X509Certificate> it = list.iterator();
            while (it.hasNext()) {
                ChallengeResultTimeout.AuthenticationRequestParameters(new Object[]{it.next()}, 93345123, -93345123, (int) System.currentTimeMillis());
            }
            this.getSDKTransactionID.clear();
            this.getSDKTransactionID = null;
        }
        atd.af.getDeviceData getdevicedata = this.getDeviceData;
        if (getdevicedata != null) {
            getdevicedata.getSDKTransactionID();
            this.getDeviceData = null;
        }
        com.adyen.threeds2.AuthenticationRequestParameters authenticationRequestParameters = this.getSDKReferenceNumber;
        byte[] bArr = $$d;
        Object[] objArr = new Object[1];
        a((short) 634, bArr[4], bArr[68], objArr);
        if (Class.forName((String) objArr[0]).isInstance(authenticationRequestParameters)) {
            atd.aj.AuthenticationRequestParameters authenticationRequestParameters2 = (atd.aj.AuthenticationRequestParameters) this.getSDKReferenceNumber;
            atd.aj.AuthenticationRequestParameters.getSDKTransactionID(new Object[]{authenticationRequestParameters2}, -611445056, 611445058, System.identityHashCode(authenticationRequestParameters2));
        }
        this.getSDKReferenceNumber = null;
        WeakReference<Activity> weakReference = this.getSDKAppID;
        if (weakReference != null) {
            weakReference.clear();
            this.getSDKAppID = null;
        }
        this.AuthenticationRequestParameters = null;
        atd.d.getSDKTransactionID getsdktransactionid = this.ChallengeResult;
        if (getsdktransactionid != null) {
            int i14 = ChallengeResultCancelled + 49;
            getMessageVersion = i14 % 128;
            try {
                if (i14 % 2 == 0) {
                    Map map = getMessageVersion.timedout;
                    Object method = map.get(1469544001);
                    if (method == null) {
                        Class cls = (Class) getMessageVersion.getSDKTransactionID(ViewConfiguration.getPressedStateDuration() >> 16, (char) (54379 - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.normalizeMetaState(0) + 36);
                        Object[] objArr2 = new Object[1];
                        a((short) 597, (byte) (-bArr[199]), bArr[29], objArr2);
                        method = cls.getMethod((String) objArr2[0], null);
                        map.put(1469544001, method);
                    }
                    ((Method) method).invoke(getsdktransactionid, null);
                    this.ChallengeResult = null;
                    int i15 = 27 / 0;
                } else {
                    Map map2 = getMessageVersion.timedout;
                    Object declaredMethod = map2.get(1469544001);
                    if (declaredMethod == null) {
                        Class cls2 = (Class) getMessageVersion.getSDKTransactionID(Process.getGidForName("") + 1, (char) (54380 - TextUtils.getTrimmedLength("")), 36 - ((Process.getThreadPriority(0) + 20) >> 6));
                        Object[] objArr3 = new Object[1];
                        a((short) 597, (byte) (-bArr[199]), bArr[29], objArr3);
                        declaredMethod = cls2.getDeclaredMethod((String) objArr3[0], null);
                        map2.put(1469544001, declaredMethod);
                    }
                    ((Method) declaredMethod).invoke(getsdktransactionid, null);
                    this.ChallengeResult = null;
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        atd.au.getSDKAppID getsdkappid = this.getSDKEphemeralPublicKey;
        if (getsdkappid != null) {
            atd.au.getSDKAppID.getDeviceData(new Object[]{getsdkappid}, -464125639, 464125641, System.identityHashCode(getsdkappid));
            this.getSDKEphemeralPublicKey = null;
        }
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public final void completed(CompletionEvent completionEvent) throws Throwable {
        int i11 = ChallengeResultCancelled + 69;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            getSDKReferenceNumber();
            getSDKEphemeralPublicKey();
            throw null;
        }
        getSDKReferenceNumber();
        ChallengeStatusReceiver sDKEphemeralPublicKey = getSDKEphemeralPublicKey();
        if (sDKEphemeralPublicKey != null) {
            sDKEphemeralPublicKey.completed(completionEvent);
            close();
            getMessageVersion = (ChallengeResultCancelled + 51) % 128;
        }
    }

    @Override // com.adyen.threeds2.Transaction
    public final void doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusReceiver challengeStatusReceiver, int i11) throws Throwable {
        getSDKReferenceNumber(new Object[]{this, activity, challengeParameters, challengeStatusReceiver, Integer.valueOf(i11)}, -1511731160, 1511731163, i11);
    }

    @Override // com.adyen.threeds2.Transaction
    public final com.adyen.threeds2.AuthenticationRequestParameters getAuthenticationRequestParameters() {
        int i11 = ChallengeResultCancelled + 77;
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            return this.getSDKReferenceNumber;
        }
        throw null;
    }

    @Override // com.adyen.threeds2.Transaction
    public final ProgressDialog getProgressView(Activity activity) {
        return (ProgressDialog) getSDKReferenceNumber(new Object[]{this, activity}, -1712072300, 1712072302, System.identityHashCode(this));
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public final void protocolError(ProtocolErrorEvent protocolErrorEvent) throws Throwable {
        ChallengeResultCancelled = (getMessageVersion + 41) % 128;
        getSDKReferenceNumber();
        ChallengeStatusReceiver sDKEphemeralPublicKey = getSDKEphemeralPublicKey();
        if (sDKEphemeralPublicKey != null) {
            getMessageVersion = (ChallengeResultCancelled + 83) % 128;
            sDKEphemeralPublicKey.protocolError(protocolErrorEvent);
            close();
            ChallengeResultCancelled = (getMessageVersion + 25) % 128;
        }
        int i11 = getMessageVersion + 79;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 84 / 0;
        }
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public final void runtimeError(RuntimeErrorEvent runtimeErrorEvent) throws Throwable {
        getMessageVersion = (ChallengeResultCancelled + 29) % 128;
        getSDKReferenceNumber();
        ChallengeStatusReceiver sDKEphemeralPublicKey = getSDKEphemeralPublicKey();
        if (sDKEphemeralPublicKey != null) {
            getMessageVersion = (ChallengeResultCancelled + 87) % 128;
            sDKEphemeralPublicKey.runtimeError(runtimeErrorEvent);
            close();
            ChallengeResultCancelled = (getMessageVersion + 15) % 128;
        }
    }

    @Override // com.adyen.threeds2.ChallengeStatusReceiver
    public final void timedout() throws Throwable {
        ChallengeStatusReceiver sDKEphemeralPublicKey;
        int i11 = getMessageVersion + 19;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            getSDKReferenceNumber();
            sDKEphemeralPublicKey = getSDKEphemeralPublicKey();
            int i12 = 87 / 0;
            if (sDKEphemeralPublicKey == null) {
                return;
            }
        } else {
            getSDKReferenceNumber();
            sDKEphemeralPublicKey = getSDKEphemeralPublicKey();
            if (sDKEphemeralPublicKey == null) {
                return;
            }
        }
        getMessageVersion = (ChallengeResultCancelled + 67) % 128;
        sDKEphemeralPublicKey.timedout();
        close();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(short r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 65
            byte[] r0 = atd.a.getAdditionalDetails.$$d
            int r1 = 62 - r6
            int r5 = 637 - r5
            byte[] r1 = new byte[r1]
            int r6 = 61 - r6
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r5]
        L29:
            int r7 = r7 + r4
            int r7 = r7 + (-5)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a.getAdditionalDetails.a(short, byte, int, java.lang.Object[]):void");
    }

    @Override // com.adyen.threeds2.Transaction
    public final void doChallenge(Activity activity, ChallengeParameters challengeParameters, ChallengeStatusHandler challengeStatusHandler, int i11) throws Throwable {
        getSDKReferenceNumber(new Object[]{this, activity, challengeParameters, challengeStatusHandler, Integer.valueOf(i11)}, -2037645640, 2037645641, i11);
    }

    private void getDeviceData(atd.e.getSDKTransactionID getsdktransactionid) throws Throwable {
        Activity sDKAppID = getSDKAppID();
        if (sDKAppID == null) {
            ChallengeResultCancelled = (getMessageVersion + 35) % 128;
            runtimeError(atd.ad.getSDKAppID.ACTIVITY_REFERENCE_MISSING.getDeviceData());
            return;
        }
        atd.au.getSDKAppID getsdkappid = this.getSDKEphemeralPublicKey;
        if (getsdkappid != null) {
            int i11 = getMessageVersion + 59;
            ChallengeResultCancelled = i11 % 128;
            if (i11 % 2 == 0) {
                atd.au.getSDKAppID.getDeviceData(new Object[]{getsdkappid}, -464125639, 464125641, System.identityHashCode(getsdkappid));
            } else {
                atd.au.getSDKAppID.getDeviceData(new Object[]{getsdkappid}, -464125639, 464125641, System.identityHashCode(getsdkappid));
                throw null;
            }
        }
        sDKAppID.startActivity(b_(sDKAppID, getsdktransactionid));
        getMessageVersion = (ChallengeResultCancelled + 55) % 128;
    }

    private void getSDKReferenceNumber() {
        Activity sDKAppID = getSDKAppID();
        if (sDKAppID == null) {
            ChallengeResultCancelled = (getMessageVersion + 47) % 128;
            return;
        }
        sDKAppID.startActivity(c_(sDKAppID));
        int i11 = ChallengeResultCancelled + 103;
        getMessageVersion = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private atd.g.getDeviceData getDeviceData(String str) {
        try {
            atd.ak.AuthenticationRequestParameters deviceData = atd.ak.AuthenticationRequestParameters.getDeviceData(str, atd.ae.getDeviceData.getDeviceData);
            deviceData.getSDKAppID(this.getSDKTransactionID);
            JSONObject messageVersion = ((atd.ak.getSDKTransactionID) atd.ak.AuthenticationRequestParameters.getSDKTransactionID(new Object[]{deviceData}, -465202534, 465202534, System.identityHashCode(deviceData))).getMessageVersion();
            atd.g.getDeviceData getdevicedata = new atd.g.getDeviceData(messageVersion);
            deviceData.getSDKAppID();
            atd.json.JSONObject.getSDKAppID(new Object[]{messageVersion}, -1150790233, 1150790235, (int) System.currentTimeMillis());
            getMessageVersion = (ChallengeResultCancelled + 1) % 128;
            return getdevicedata;
        } catch (atd.z.AuthenticationRequestParameters | SDKRuntimeException | JSONException unused) {
            throw atd.ad.getDeviceData.CHALLENGE_PARAMETERS.getSDKTransactionID();
        }
    }

    static void getDeviceData() {
        BuildConfig = new int[]{616560914, 430959705, 18520648, 619997138, -723320388, 1516614631, 344040302, -202225756, 311474073, -1788464528, -636713957, 772738873, -595643553, 862245909, 1942725662, -2049190922, 709117077, -1852422171};
    }

    private void AuthenticationRequestParameters() throws Throwable {
        Activity sDKAppID = getSDKAppID();
        if (sDKAppID == null) {
            runtimeError(atd.ad.getSDKAppID.ACTIVITY_REFERENCE_MISSING.getDeviceData());
            return;
        }
        if (!ChallengeActivity.getDeviceData()) {
            int i11 = ChallengeResultCancelled + 91;
            getMessageVersion = i11 % 128;
            if (i11 % 2 == 0) {
                sDKAppID.startActivity(a_(sDKAppID));
                int i12 = 86 / 0;
            } else {
                sDKAppID.startActivity(a_(sDKAppID));
            }
        }
        int i13 = ChallengeResultCancelled + 65;
        getMessageVersion = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 1 / 0;
        }
    }

    @Override // atd.a.getDeviceData
    public final void getSDKTransactionID() throws Throwable {
        int i11 = getMessageVersion + 13;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            AuthenticationRequestParameters();
            int i12 = 66 / 0;
        } else {
            AuthenticationRequestParameters();
        }
    }

    @Override // atd.a.getDeviceData
    public final void getSDKTransactionID(atd.e.getSDKTransactionID getsdktransactionid) throws Throwable {
        getSDKReferenceNumber(new Object[]{this, getsdktransactionid}, -693153309, 693153309, System.identityHashCode(this));
    }
}
