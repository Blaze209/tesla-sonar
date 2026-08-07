package com.adyen.threeds2.internal.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.p002activity.q;
import atd.a.ChallengeResultError;
import atd.a.getMessageVersion;
import atd.ax.AuthenticationRequestParameters;
import atd.ax.getSDKTransactionID;
import atd.az.ChallengeResultKt;
import atd.az.ChallengeStatusReceiver;
import atd.b.BuildConfig;
import atd.b.ChallengeResult;
import atd.b.ChallengeResultCancelled;
import atd.b.getSDKEphemeralPublicKey;
import com.adyen.threeds2.exception.SDKRuntimeException;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes;
import com.plaid.internal.EnumC4419g;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public class ChallengeActivity extends getSDKReferenceNumber implements AuthenticationRequestParameters, atd.ax.getDeviceData, atd.ax.getSDKAppID, getSDKTransactionID {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static final byte[] $$g = null;
    private static final int $$h = 0;
    private static int $10;
    private static int $11;
    private static String AuthenticationRequestParameters;
    private static final String BuildConfig;
    private static String ChallengeResultCancelled;
    private static boolean ChallengeResultError;
    private static int ChallengeResultKt;
    private static boolean ChallengeResultTimeout;
    private static int ChallengeStatusHandler;
    private static int ChallengeStatusReceiver;
    private static int CompletionEvent;
    private static int cancelled;
    private static short[] completed;
    private static int getAdditionalDetails;
    private static String getDeviceData;
    private static final String getMessageVersion;
    private static String getSDKAppID;
    private static String getSDKReferenceNumber;
    private static String getSDKTransactionID;
    private static char[] getTransactionStatus;
    private static byte[] onCompletion;
    private getDeviceData ChallengeResult;
    private boolean ChallengeResultCompleted;
    private atd.e.getSDKTransactionID getSDKEphemeralPublicKey;

    static {
        init$2();
        $10 = 0;
        $11 = 1;
        init$1();
        init$0();
        CompletionEvent = 0;
        cancelled = 1;
        AuthenticationRequestParameters();
        TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        ViewConfiguration.getTouchSlop();
        getDeviceData = ChallengeActivity.class.getSimpleName();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getDeviceData);
        Object[] objArr = new Object[1];
        b((short) ((-16777216) - Color.rgb(0, 0, 0)), (-14) - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1667179988 - Color.alpha(0), (-1042889151) + (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (ExpandableListView.getPackedPositionChild(0L) + 122), objArr);
        sb2.append(((String) objArr[0]).intern());
        getSDKTransactionID = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getDeviceData);
        Object[] objArr2 = new Object[1];
        b((short) Color.alpha(0), (ViewConfiguration.getLongPressTimeout() >> 16) - 14, 1667179988 - (ViewConfiguration.getTapTimeout() >> 16), (-1042889128) - KeyEvent.normalizeMetaState(0), (byte) (View.combineMeasuredStates(0, 0) + 94), objArr2);
        sb3.append(((String) objArr2[0]).intern());
        getSDKReferenceNumber = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(getDeviceData);
        Object[] objArr3 = new Object[1];
        b((short) (Process.myPid() >> 22), (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 14, 1667179988 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-1042889106) - TextUtils.indexOf((CharSequence) "", '0', 0), (byte) (60 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), objArr3);
        sb4.append(((String) objArr3[0]).intern());
        getSDKAppID = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(getDeviceData);
        Object[] objArr4 = new Object[1];
        c(null, null, 127 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), "\u008d¤\u009f\u008d££\u0099¢\u0095 ¢\u0092\u008c\u009f\u008c¡ \u009f\u009e\u008c\u009b\u0095\u0099\u0087", objArr4);
        sb5.append(((String) objArr4[0]).intern());
        AuthenticationRequestParameters = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(getDeviceData);
        Object[] objArr5 = new Object[1];
        b((short) ExpandableListView.getPackedPositionType(0L), (-13) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ExpandableListView.getPackedPositionType(0L) + 1667179988, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1042889084, (byte) (TextUtils.getOffsetAfter("", 0) + 81), objArr5);
        sb6.append(((String) objArr5[0]).intern());
        ChallengeResultCancelled = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(getDeviceData);
        Object[] objArr6 = new Object[1];
        b((short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 15, 1667179988 - (Process.myTid() >> 22), (Process.myTid() >> 22) - 1042889067, (byte) ((-61) - TextUtils.indexOf("", "", 0)), objArr6);
        sb7.append(((String) objArr6[0]).intern());
        getMessageVersion = sb7.toString();
        StringBuilder sb8 = new StringBuilder();
        sb8.append(getDeviceData);
        Object[] objArr7 = new Object[1];
        b((short) (Process.myPid() >> 22), (ViewConfiguration.getWindowTouchSlop() >> 8) - 14, TextUtils.getTrimmedLength("") + 1667179988, (-1042889043) - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) ((-16777102) - Color.rgb(0, 0, 0)), objArr7);
        sb8.append(((String) objArr7[0]).intern());
        BuildConfig = sb8.toString();
        int i11 = CompletionEvent + 55;
        cancelled = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 48 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void a(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 249 - r6
            int r7 = r7 * 2
            int r7 = r7 + 65
            int r0 = 61 - r8
            byte[] r1 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.$$d
            byte[] r0 = new byte[r0]
            int r8 = 60 - r8
            r2 = 0
            if (r1 != 0) goto L16
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r8
            goto L30
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r5
        L30:
            int r1 = r1 + r6
            int r6 = r1 + (-3)
            r1 = r7
            r7 = r6
            r6 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.ChallengeActivity.a(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x01dc A[PHI: r3
      0x01dc: PHI (r3v7 int) = (r3v6 int), (r3v18 int) binds: [B:45:0x01da, B:42:0x01ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:54:0x0212  */
    /* JADX WARN: Code duplicated, block: B:55:0x0213 A[Catch: all -> 0x02d9, TryCatch #0 {all -> 0x02d9, blocks: (B:3:0x0024, B:8:0x007a, B:19:0x00a2, B:23:0x00eb, B:22:0x00bb, B:30:0x0123, B:34:0x0171, B:52:0x01f2, B:56:0x024a, B:55:0x0213, B:33:0x013b, B:7:0x0046), top: B:81:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0260  */
    /* JADX WARN: Code duplicated, block: B:61:0x026e A[LOOP:1: B:60:0x026c->B:61:0x026e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x027d  */
    /* JADX WARN: Code duplicated, block: B:66:0x0280  */
    /* JADX WARN: Code duplicated, block: B:70:0x0288 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x028a  */
    /* JADX WARN: Code duplicated, block: B:72:0x02a5  */
    private static void b(short s11, int i11, int i12, int i13, byte b11, Object[] objArr) throws Throwable {
        int i14;
        int i15;
        long j11;
        int i16;
        int i17;
        int i18;
        Map map;
        Object method;
        byte[] bArr;
        boolean z11;
        int length;
        byte[] bArr2;
        int i19;
        Object method2;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i21 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(ChallengeResultKt)};
            Map map2 = getMessageVersion.timedout;
            Object method3 = map2.get(557807898);
            Class cls = Integer.TYPE;
            if (method3 != null) {
                i14 = 0;
            } else {
                Class cls2 = (Class) getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionType(0L) + 2105, (char) (ExpandableListView.getPackedPositionType(0L) + 21995), MotionEvent.axisFromString("") + 32);
                byte b12 = (byte) 0;
                i14 = 0;
                Object[] objArr3 = new Object[1];
                e(b12, (byte) (b12 | 7), (byte) (-1), objArr3);
                method3 = cls2.getMethod((String) objArr3[0], cls, cls);
                map2.put(557807898, method3);
            }
            int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr2)).intValue();
            int i22 = iIntValue == -1 ? 1 : i14;
            if (i22 != 0) {
                byte[] bArr3 = onCompletion;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    int i23 = i14;
                    j11 = -671853308956415234L;
                    while (i23 < length2) {
                        Object[] objArr4 = {Integer.valueOf(bArr3[i23])};
                        int i24 = i21;
                        Map map3 = getMessageVersion.timedout;
                        Object obj = map3.get(-844142059);
                        if (obj != null) {
                            method2 = obj;
                        } else {
                            int i25 = i14;
                            method2 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getTouchSlop() >> 8) + 2936, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), TextUtils.indexOf("", "", i25, i25) + 33)).getMethod("s", cls);
                            map3.put(-844142059, method2);
                        }
                        bArr4[i23] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i23++;
                        $10 = ($11 + 65) % 128;
                        i21 = i24;
                        i22 = i22;
                        bArr3 = bArr3;
                        i14 = 0;
                    }
                    bArr3 = bArr4;
                } else {
                    j11 = -671853308956415234L;
                }
                i15 = i22;
                int i26 = i21;
                if (bArr3 != null) {
                    byte[] bArr5 = onCompletion;
                    Object[] objArr5 = new Object[2];
                    objArr5[i26] = Integer.valueOf(ChallengeStatusHandler);
                    objArr5[0] = Integer.valueOf(i13);
                    Map map4 = getMessageVersion.timedout;
                    Object method4 = map4.get(557807898);
                    if (method4 == null) {
                        Class cls3 = (Class) getMessageVersion.getSDKTransactionID(2104 - MotionEvent.axisFromString(""), (char) (TextUtils.getCapsMode("", 0, 0) + 21995), 31 - View.resolveSize(0, 0));
                        byte b13 = (byte) 0;
                        Object[] objArr6 = new Object[i26];
                        e(b13, (byte) (b13 | 7), (byte) (-1), objArr6);
                        method4 = cls3.getMethod((String) objArr6[0], cls, cls);
                        map4.put(557807898, method4);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr5[((Integer) ((Method) method4).invoke(null, objArr5)).intValue()]) ^ j11)) + ((int) (((long) ChallengeResultKt) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) completed[i13 + ((int) (((long) ChallengeStatusHandler) ^ j11))]) ^ j11)) + ((int) (((long) ChallengeResultKt) ^ j11)));
                }
            } else {
                i15 = i22;
                j11 = -671853308956415234L;
            }
            if (iIntValue > 0) {
                int i27 = $11;
                int i28 = i27 + 113;
                $10 = i28 % 128;
                if (i28 % 2 != 0) {
                    i16 = ((i13 * iIntValue) >> 5) >>> ((int) (((long) ChallengeStatusHandler) ^ j11));
                    if (i15 != 0) {
                        i17 = i27 + 53;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            i18 = 1;
                        }
                    }
                    challengeResultKt.getDeviceData = i16 + i18;
                    Object[] objArr7 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(ChallengeStatusReceiver), sb2};
                    map = getMessageVersion.timedout;
                    method = map.get(-1793105104);
                    if (method == null) {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(0) + 2136, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        byte b14 = (byte) 0;
                        Object[] objArr8 = new Object[1];
                        e(b14, (byte) (b14 | 14), (byte) (-1), objArr8);
                        method = cls4.getMethod((String) objArr8[0], Object.class, cls, cls, Object.class);
                        map.put(-1793105104, method);
                    }
                    ((StringBuilder) ((Method) method).invoke(null, objArr7)).append(challengeResultKt.getSDKTransactionID);
                    challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                    bArr = onCompletion;
                    if (bArr != null) {
                        $10 = ($11 + 101) % 128;
                        length = bArr.length;
                        bArr2 = new byte[length];
                        for (i19 = 0; i19 < length; i19++) {
                            bArr2[i19] = (byte) (((long) bArr[i19]) ^ j11);
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    challengeResultKt.getSDKReferenceNumber = 1;
                    while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                        if (z11) {
                            byte[] bArr6 = onCompletion;
                            int i29 = challengeResultKt.getDeviceData;
                            challengeResultKt.getDeviceData = i29 - 1;
                            challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr6[i29]) ^ j11)) + s11)) ^ b11));
                        } else {
                            short[] sArr = completed;
                            int i31 = challengeResultKt.getDeviceData;
                            challengeResultKt.getDeviceData = i31 - 1;
                            challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i31]) ^ j11)) + s11)) ^ b11));
                        }
                        sb2.append(challengeResultKt.getSDKTransactionID);
                        challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                        challengeResultKt.getSDKReferenceNumber++;
                    }
                } else {
                    i16 = ((i13 + iIntValue) - 2) + ((int) (((long) ChallengeStatusHandler) ^ j11));
                    if (i15 != 0) {
                        i17 = i27 + 53;
                        $10 = i17 % 128;
                        if (i17 % 2 != 0) {
                            i18 = 1;
                        }
                    }
                    challengeResultKt.getDeviceData = i16 + i18;
                    Object[] objArr9 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(ChallengeStatusReceiver), sb2};
                    map = getMessageVersion.timedout;
                    method = map.get(-1793105104);
                    if (method == null) {
                        Class cls5 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(0) + 2136, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        byte b15 = (byte) 0;
                        Object[] objArr10 = new Object[1];
                        e(b15, (byte) (b15 | 14), (byte) (-1), objArr10);
                        method = cls5.getMethod((String) objArr10[0], Object.class, cls, cls, Object.class);
                        map.put(-1793105104, method);
                    }
                    ((StringBuilder) ((Method) method).invoke(null, objArr9)).append(challengeResultKt.getSDKTransactionID);
                    challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                    bArr = onCompletion;
                    if (bArr != null) {
                        $10 = ($11 + 101) % 128;
                        length = bArr.length;
                        bArr2 = new byte[length];
                        while (i19 < length) {
                            bArr2[i19] = (byte) (((long) bArr[i19]) ^ j11);
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    challengeResultKt.getSDKReferenceNumber = 1;
                    while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                        if (z11) {
                            byte[] bArr7 = onCompletion;
                            int i210 = challengeResultKt.getDeviceData;
                            challengeResultKt.getDeviceData = i210 - 1;
                            challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr7[i210]) ^ j11)) + s11)) ^ b11));
                        } else {
                            short[] sArr2 = completed;
                            int i32 = challengeResultKt.getDeviceData;
                            challengeResultKt.getDeviceData = i32 - 1;
                            challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr2[i32]) ^ j11)) + s11)) ^ b11));
                        }
                        sb2.append(challengeResultKt.getSDKTransactionID);
                        challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                        challengeResultKt.getSDKReferenceNumber++;
                    }
                }
                i18 = 0;
                challengeResultKt.getDeviceData = i16 + i18;
                Object[] objArr11 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(ChallengeStatusReceiver), sb2};
                map = getMessageVersion.timedout;
                method = map.get(-1793105104);
                if (method == null) {
                    Class cls6 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(0) + 2136, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 28 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    byte b16 = (byte) 0;
                    Object[] objArr12 = new Object[1];
                    e(b16, (byte) (b16 | 14), (byte) (-1), objArr12);
                    method = cls6.getMethod((String) objArr12[0], Object.class, cls, cls, Object.class);
                    map.put(-1793105104, method);
                }
                ((StringBuilder) ((Method) method).invoke(null, objArr11)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                bArr = onCompletion;
                if (bArr != null) {
                    $10 = ($11 + 101) % 128;
                    length = bArr.length;
                    bArr2 = new byte[length];
                    while (i19 < length) {
                        bArr2[i19] = (byte) (((long) bArr[i19]) ^ j11);
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    if (z11) {
                        byte[] bArr8 = onCompletion;
                        int i211 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i211 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr8[i211]) ^ j11)) + s11)) ^ b11));
                    } else {
                        short[] sArr3 = completed;
                        int i33 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i33 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr3[i33]) ^ j11)) + s11)) ^ b11));
                    }
                    sb2.append(challengeResultKt.getSDKTransactionID);
                    challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                    challengeResultKt.getSDKReferenceNumber++;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    private static void c(String str, int[] iArr, int i11, String str2, Object[] objArr) throws Throwable {
        long j11;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            int i12 = $10 + 107;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                str3.getBytes("ISO-8859-1");
                throw null;
            }
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
        char[] cArr = getTransactionStatus;
        Class cls = Integer.TYPE;
        if (cArr != null) {
            $11 = ($10 + 59) % 128;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i13 = 0;
            j11 = 0;
            while (i13 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i13])};
                    Map map = getMessageVersion.timedout;
                    Object obj = map.get(508097192);
                    if (obj == null) {
                        Method method = ((Class) getMessageVersion.getSDKTransactionID(328 - (ViewConfiguration.getTouchSlop() >> 8), (char) ExpandableListView.getPackedPositionGroup(0L), 32 - Drawable.resolveOpacity(0, 0))).getMethod("o", cls);
                        map.put(508097192, method);
                        obj = method;
                    }
                    cArr2[i13] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i13++;
                    cArr = cArr;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            $10 = ($11 + 43) % 128;
            cArr = cArr2;
        } else {
            j11 = 0;
        }
        Object[] objArr3 = {Integer.valueOf(getAdditionalDetails)};
        Map map2 = getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 == null) {
            Class cls2 = (Class) getMessageVersion.getSDKTransactionID(((byte) KeyEvent.getModifierMetaStateMask()) + 2062, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 17 - View.MeasureSpec.getSize(0));
            byte b11 = (byte) 0;
            byte b12 = b11;
            Object[] objArr4 = new Object[1];
            e(b11, b12, (byte) (b12 - 1), objArr4);
            method2 = cls2.getMethod((String) objArr4[0], cls);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        if (ChallengeResultError) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr3 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i14 = challengeStatusReceiver.getDeviceData;
                int i15 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr3);
                    return;
                }
                $11 = ($10 + 39) % 128;
                cArr3[i14] = (char) (cArr[bArr[(i15 - 1) - i14] + i11] - iIntValue);
                Object[] objArr5 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map3 = getMessageVersion.timedout;
                Object method3 = map3.get(-249860496);
                if (method3 == null) {
                    Class cls3 = (Class) getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > j11 ? 1 : (SystemClock.uptimeMillis() == j11 ? 0 : -1)) + 1107, (char) (Process.getGidForName("") + 1), ExpandableListView.getPackedPositionChild(j11) + 51);
                    byte b13 = (byte) 0;
                    byte b14 = (byte) (b13 + 2);
                    Object[] objArr6 = new Object[1];
                    e(b13, b14, (byte) (b14 - 3), objArr6);
                    method3 = cls3.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-249860496, method3);
                }
                ((Method) method3).invoke(null, objArr5);
            }
        } else if (ChallengeResultTimeout) {
            int length3 = charArray.length;
            challengeStatusReceiver.getSDKReferenceNumber = length3;
            char[] cArr4 = new char[length3];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i16 = challengeStatusReceiver.getDeviceData;
                int i17 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                int i18 = $10 + 99;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr4[i16] = (char) (cArr[charArray[i17 - i16] - i11] >> iIntValue);
                    Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map4 = getMessageVersion.timedout;
                    Object method4 = map4.get(-249860496);
                    if (method4 == null) {
                        Class cls4 = (Class) getMessageVersion.getSDKTransactionID(1108 - Gravity.getAbsoluteGravity(0, 0), (char) ((SystemClock.uptimeMillis() > j11 ? 1 : (SystemClock.uptimeMillis() == j11 ? 0 : -1)) - 1), 51 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 2);
                        Object[] objArr8 = new Object[1];
                        e(b15, b16, (byte) (b16 - 3), objArr8);
                        method4 = cls4.getMethod((String) objArr8[0], Object.class, Object.class);
                        map4.put(-249860496, method4);
                    }
                    ((Method) method4).invoke(null, objArr7);
                } else {
                    cArr4[i16] = (char) (cArr[charArray[(i17 - 1) - i16] - i11] - iIntValue);
                    Object[] objArr9 = {challengeStatusReceiver, challengeStatusReceiver};
                    Map map5 = getMessageVersion.timedout;
                    Object method5 = map5.get(-249860496);
                    if (method5 == null) {
                        Class cls5 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(0) + 1108, (char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 50);
                        byte b17 = (byte) 0;
                        byte b18 = (byte) (b17 + 2);
                        Object[] objArr10 = new Object[1];
                        e(b17, b18, (byte) (b18 - 3), objArr10);
                        method5 = cls5.getMethod((String) objArr10[0], Object.class, Object.class);
                        map5.put(-249860496, method5);
                    }
                    ((Method) method5).invoke(null, objArr9);
                }
            }
        } else {
            int length4 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length4;
            char[] cArr5 = new char[length4];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i19 = challengeStatusReceiver.getDeviceData;
                int i21 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i19 >= i21) {
                    objArr[0] = new String(cArr5);
                    return;
                } else {
                    cArr5[i19] = (char) (cArr[iArr[(i21 - 1) - i19] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i19 + 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.adyen.threeds2.internal.ui.activity.ChallengeActivity.$$a
            int r8 = r8 + 65
            int r9 = r9 * 2
            int r9 = 73 - r9
            int r7 = r7 * 2
            int r7 = r7 + 11
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r0
            r4 = r2
            r0 = r9
            goto L2e
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r0
            r0 = r6
        L2e:
            int r9 = r9 + r8
            int r8 = r9 + 2
            r9 = r0
            r0 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.ChallengeActivity.d(short, int, short, java.lang.Object[]):void");
    }

    public static Intent da_(Context context) {
        Intent intent = new Intent(context, (Class<?>) ChallengeActivity.class);
        intent.setAction(getSDKTransactionID);
        int i11 = cancelled + 31;
        CompletionEvent = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 21 / 0;
        }
        return intent;
    }

    public static Intent db_(Context context, atd.e.getSDKTransactionID getsdktransactionid) {
        Intent intent = new Intent(context, (Class<?>) ChallengeActivity.class);
        intent.setAction(getSDKAppID);
        intent.putExtra(ChallengeResultCancelled, getsdktransactionid);
        CompletionEvent = (cancelled + 113) % 128;
        return intent;
    }

    public static Intent dc_(Context context) {
        Intent intent = new Intent(context, (Class<?>) ChallengeActivity.class);
        intent.setAction(AuthenticationRequestParameters);
        cancelled = (CompletionEvent + 1) % 128;
        return intent;
    }

    private void de_(Intent intent) throws Throwable {
        String str;
        setIntent(intent);
        if (getSDKTransactionID.equals(intent.getAction())) {
            cancelled = (CompletionEvent + 45) % 128;
            this.ChallengeResult.getDeviceData();
            return;
        }
        if (getSDKReferenceNumber.equals(intent.getAction())) {
            cancelled = (CompletionEvent + 115) % 128;
            this.ChallengeResult.getSDKAppID();
            return;
        }
        if (getSDKAppID.equals(intent.getAction())) {
            atd.e.getSDKTransactionID getsdktransactionid = (atd.e.getSDKTransactionID) intent.getParcelableExtra(ChallengeResultCancelled);
            this.getSDKEphemeralPublicKey = getsdktransactionid;
            this.ChallengeResult.AuthenticationRequestParameters(getsdktransactionid);
            return;
        }
        if (AuthenticationRequestParameters.equals(intent.getAction())) {
            finish();
            return;
        }
        Object[] objArr = new Object[1];
        c(null, null, 127 - ExpandableListView.getPackedPositionGroup(0L), "\u008e\u008d\u008c\u008b\u0087\u0082\u0085\u0086\u0088\u008a\u0081\u0087\u0088\u0082\u0089\u0088\u0082\u0086\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr);
        if (((String) objArr[0]).intern().equals(intent.getAction())) {
            CompletionEvent = (cancelled + 43) % 128;
            if (intent.getData() != null) {
                if (!((Boolean) getSDKTransactionID(new Object[]{intent.getData().getScheme()}, -296066178, 296066178, (int) System.currentTimeMillis())).booleanValue()) {
                    throw atd.ad.AuthenticationRequestParameters.CHALLENGE_PRESENTATION_FAILURE.getSDKTransactionID();
                }
                atd.at.AuthenticationRequestParameters sDKReferenceNumber = this.ChallengeResult.getSDKReferenceNumber();
                if (getSDKAppID(sDKReferenceNumber)) {
                    return;
                }
                if (getSDKReferenceNumber(sDKReferenceNumber)) {
                    atd.at.getSDKAppID getsdkappid = (atd.at.getSDKAppID) sDKReferenceNumber;
                    str = (String) atd.at.getSDKAppID.getDeviceData(new Object[]{getsdkappid}, 1327006645, -1327006645, System.identityHashCode(getsdkappid));
                    cancelled = (CompletionEvent + 61) % 128;
                } else {
                    str = null;
                }
                Object[] objArr2 = new Object[1];
                c(null, null, View.MeasureSpec.getSize(0) + 127, "\u0090\u008f", objArr2);
                getSDKTransactionID(new BuildConfig(((String) objArr2[0]).intern(), null), str);
                return;
            }
        }
        throw atd.ad.AuthenticationRequestParameters.CHALLENGE_PRESENTATION_FAILURE.getSDKTransactionID();
    }

    private static void e(int i11, short s11, byte b11, Object[] objArr) {
        int i12 = b11 + 4;
        int i13 = i11 * 2;
        int i14 = s11 + 107;
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[1 - i13];
        int i15 = 0 - i13;
        int i16 = -1;
        if (bArr == null) {
            i14 += i15;
        }
        while (true) {
            i16++;
            bArr2[i16] = (byte) i14;
            if (i16 == i15) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i12++;
                i14 += bArr[i12];
            }
        }
    }

    public static boolean getDeviceData() {
        int i11 = cancelled + 93;
        CompletionEvent = i11 % 128;
        if (i11 % 2 != 0) {
            getDeviceData.AuthenticationRequestParameters();
            throw null;
        }
        boolean zAuthenticationRequestParameters = getDeviceData.AuthenticationRequestParameters();
        int i12 = CompletionEvent + 45;
        cancelled = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 38 / 0;
        }
        return zAuthenticationRequestParameters;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) throws Throwable {
        int i14 = i11 | i12;
        int i15 = (i11 * 503) + (i12 * 503) + (i14 * (-502));
        int i16 = ~i11;
        int i17 = ~((~i12) | i16);
        int i18 = i16 | (~i13);
        int i19 = i17 | (~i18);
        int i21 = ~(i13 | i14);
        int i22 = i15 + ((i19 | i21) * (-502)) + (((~(i18 | i12)) | i21) * HttpStatusCode.BAD_GATEWAY_502);
        if (i22 == 1) {
            return getSDKReferenceNumber(objArr);
        }
        if (i22 != 2) {
            if (i22 != 3) {
                return getSDKTransactionID(objArr);
            }
            ((ChallengeActivity) objArr[0]).getSDKAppID(new atd.b.AuthenticationRequestParameters());
            cancelled = (CompletionEvent + 111) % 128;
            return null;
        }
        ((ChallengeActivity) objArr[0]).getSDKTransactionID(new atd.b.getMessageVersion(), (String) objArr[1]);
        CompletionEvent = (cancelled + 113) % 128;
        return null;
    }

    static void init$0() {
        $$a = new byte[]{81, 33, -107, -119, -4, 13, -35, -17, 5, -12, 45, -2, -41, -7, -4, 13, -50, 31, 15, -15, -8, 0, -35, 27, 17, -21, -4, 13, -35, -17, 5, 7, 28, -19, 11, 3, -20, 0, 15, -13, 4, -3, -39, -7, 49, -14, 1, -10, -35, 42, -3, -10, 1, -4, -4, 13, -35, -17, 5, 5, 17, -1, -3, 11, -15, 7, -13, 0, -25, 37, -10, -13, 1, 11, 50, -3, -14, -5, 7, 4, -13, -8, -4, 17, -13, 4, -3, -30, 17, 10, 2, -18, 12, -1, -38, 15, 15, -19, 10, -10, 13, -17, 11, -1};
        $$b = 33;
    }

    static void init$1() {
        $$d = new byte[]{117, -87, -71, 36, 1, 18, -30, -12, 10, -7, 50, 3, -36, -2, 22, -13, -51, 54, Tnaf.POW_2_WIDTH, -61, 22, 55, 2, -9, 0, 12, 9, -8, -3, 1, 22, -8, 9, 2, -25, 22, 15, 7, -13, 17, 4, -33, 20, 20, -14, 15, -5, 18, -12, Tnaf.POW_2_WIDTH, 4, -76, 70, 1, 18, -30, -12, 10, 12, 33, -14, Tnaf.POW_2_WIDTH, 8, -15, 5, 20, -8, 9, 2, -34, -2, 22, -13, -51, 77, -71, 24, 40, -4, 14, 3, -4, 12, -4, 1, -16, 22, 17, 5, -6, 11, -38, 44, -77, 70, 1, 18, -45, 36, 20, -10, -3, 5, -30, 32, 22, -16, 1, 18, -30, -12, 10, 12, 33, -14, Tnaf.POW_2_WIDTH, 8, -15, 5, 20, -8, 9, 2, -34, -2, 22, -13, -51, 55, -49, 60, 1, 18, -30, -12, 10, 10, 22, 4, 2, Tnaf.POW_2_WIDTH, -10, 12, -8, 5, -20, 42, -5, -8, 6, Tnaf.POW_2_WIDTH, 55, 2, -9, 0, 12, 9, -8, -3, 1, 22, -8, 9, 2, -25, 22, 15, 7, -13, 17, 4, -33, 20, 20, -14, 15, -5, 18, -12, Tnaf.POW_2_WIDTH, 4, 22, -13, -51, 65, -59, 24, 40, -4, 14, 3, -4, 12, -4, 1, -16, 22, 17, 5, -6, 11, -29, 24, 7, -5, 13, 9, 2, 22, -13, -51, 77, -71, 24, 40, -4, 14, 3, -4, 12, -4, 1, -15, 36, -16, 22, 4, 1, -30, 22, 1, 5, 7, Tnaf.POW_2_WIDTH, -14, Tnaf.POW_2_WIDTH, -75, 70, 1, 18, -45, 36, 20, -10, -3, 5, -30, 32, 22, -16, 22, -13, -51, 76, -70, 24, 40, -4, 14, 3, -4, 12, -4, 1, -15, 36, -16, 22, 4, 1, -30, 22, 1, 5, 7, Tnaf.POW_2_WIDTH, -14, Tnaf.POW_2_WIDTH, -75, 32, 55, 2, -9, 0, 12, 9, -8, -3, 1, 22, -8, 9, 2, -25, 22, 15, 7, -13, 17, 4, -33, 20, 20, -14, 15, -5, 18, -12, Tnaf.POW_2_WIDTH, 4};
        $$e = 137;
    }

    static void init$2() {
        $$g = new byte[]{11, -75, 94, 102};
        $$h = 112;
    }

    @Override // atd.ax.AuthenticationRequestParameters
    public final void AuthenticationRequestParameters(String str) throws Throwable {
        Object[] objArr = new Object[1];
        b((short) ExpandableListView.getPackedPositionType(0L), (-14) - View.resolveSizeAndState(0, 0, 0), 1667179989 - TextUtils.lastIndexOf("", '0', 0), (-1042889266) - (ViewConfiguration.getTouchSlop() >> 8), (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 7), objArr);
        getSDKTransactionID(new BuildConfig(((String) objArr[0]).intern(), null), str);
        int i11 = cancelled + 123;
        CompletionEvent = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.adyen.threeds2.internal.ui.activity.getSDKReferenceNumber, androidx.appcompat.app.c, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        cancelled = (CompletionEvent + 47) % 128;
        super.attachBaseContext(context);
        CompletionEvent = (cancelled + 5) % 128;
    }

    @Override // atd.ax.AuthenticationRequestParameters
    public final void dh_(@NonNull Uri uri, String str) throws Throwable {
        getSDKTransactionID(new Object[]{this, uri, str}, 744689669, -744689668, System.identityHashCode(this));
    }

    @Override // atd.ax.getSDKAppID
    public final void getSDKAppID(@NonNull String str, String str2) throws Throwable {
        getSDKTransactionID(new getSDKEphemeralPublicKey(str), str2);
        CompletionEvent = (cancelled + 109) % 128;
    }

    @Override // atd.ax.getSDKTransactionID
    public final void getSDKReferenceNumber(@NonNull List<String> list, String str) throws Throwable {
        getSDKTransactionID(new ChallengeResultCancelled(list), str);
        int i11 = cancelled + 101;
        CompletionEvent = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 5 / 0;
        }
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    public void onBackPressed() throws Throwable {
        int i11 = cancelled + 121;
        CompletionEvent = i11 % 128;
        if (i11 % 2 != 0) {
            super.onBackPressed();
            getSDKTransactionID(new Object[]{this}, -1306143719, 1306143722, System.identityHashCode(this));
            throw null;
        }
        super.onBackPressed();
        getSDKTransactionID(new Object[]{this}, -1306143719, 1306143722, System.identityHashCode(this));
        cancelled = (CompletionEvent + 65) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0043  */
    /* JADX WARN: Code duplicated, block: B:9:0x0033  */
    @Override // com.adyen.threeds2.internal.ui.activity.getSDKReferenceNumber, androidx.fragment.app.u, androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        char c11;
        char c12;
        int i11 = CompletionEvent + 109;
        cancelled = i11 % 128;
        if (i11 % 2 == 0) {
            super.onCreate(bundle);
            q.a(this);
            int i12 = 25 / 0;
            if (bundle != null) {
                if (Process.myPid() != bundle.getInt(BuildConfig)) {
                    finish();
                } else {
                    this.ChallengeResultCompleted = bundle.getBoolean(getMessageVersion, false);
                    cancelled = (CompletionEvent + 99) % 128;
                }
            }
        } else {
            super.onCreate(bundle);
            q.a(this);
            if (bundle != null) {
                if (Process.myPid() != bundle.getInt(BuildConfig)) {
                    finish();
                } else {
                    this.ChallengeResultCompleted = bundle.getBoolean(getMessageVersion, false);
                    cancelled = (CompletionEvent + 99) % 128;
                }
            }
        }
        this.ChallengeResult = new getDeviceData(this, this);
        try {
            de_(getIntent());
        } catch (SDKRuntimeException e11) {
            try {
                Map map = getMessageVersion.timedout;
                Object method = map.get(-1920284156);
                if (method != null) {
                    c11 = '\n';
                    c12 = '*';
                } else {
                    c11 = '\n';
                    c12 = '*';
                    Class cls = (Class) getMessageVersion.getSDKTransactionID(1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (View.combineMeasuredStates(0, 0) + 54380), 36 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                    short s11 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
                    byte[] bArr = $$d;
                    Object[] objArr = new Object[1];
                    a(s11, (byte) (bArr[42] - 1), bArr[10], objArr);
                    method = cls.getMethod((String) objArr[0], null);
                    map.put(-1920284156, method);
                }
                Object objInvoke = ((Method) method).invoke(null, null);
                Object[] objArr2 = {e11, e11.getMessage()};
                Object method2 = map.get(166029181);
                if (method2 == null) {
                    Class cls2 = (Class) getMessageVersion.getSDKTransactionID((-1) - TextUtils.lastIndexOf("", '0', 0, 0), (char) (54380 - View.MeasureSpec.getSize(0)), 35 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)));
                    short s12 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
                    byte[] bArr2 = $$d;
                    Object[] objArr3 = new Object[1];
                    a(s12, (byte) (bArr2[c12] - 1), bArr2[c11], objArr3);
                    method2 = cls2.getMethod((String) objArr3[0], Throwable.class, String.class);
                    map.put(166029181, method2);
                }
                ((Method) method2).invoke(objInvoke, objArr2);
                finish();
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    protected void onDestroy() {
        int i11 = cancelled + 81;
        CompletionEvent = i11 % 128;
        if (i11 % 2 != 0) {
            super.onDestroy();
            this.ChallengeResult.getSDKTransactionID();
            isFinishing();
            throw null;
        }
        super.onDestroy();
        this.ChallengeResult.getSDKTransactionID();
        if (isFinishing()) {
            int i12 = cancelled + 91;
            CompletionEvent = i12 % 128;
            if (i12 % 2 != 0) {
                throw null;
            }
            atd.e.getSDKTransactionID getsdktransactionid = this.getSDKEphemeralPublicKey;
            if (getsdktransactionid != null) {
                getsdktransactionid.getSDKTransactionID();
                CompletionEvent = (cancelled + 1) % 128;
            }
        }
    }

    @Override // androidx.p002activity.ComponentActivity, android.app.Activity
    protected void onNewIntent(Intent intent) throws Throwable {
        CompletionEvent = (cancelled + 47) % 128;
        super.onNewIntent(intent);
        de_(intent);
        int i11 = CompletionEvent + 39;
        cancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.adyen.threeds2.internal.ui.activity.getSDKReferenceNumber, androidx.fragment.app.u, android.app.Activity
    protected void onPause() {
        CompletionEvent = (cancelled + 77) % 128;
        super.onPause();
        getSDKTransactionID();
        int i11 = cancelled + 111;
        CompletionEvent = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.adyen.threeds2.internal.ui.activity.getSDKReferenceNumber, androidx.fragment.app.u, android.app.Activity
    protected void onResume() {
        CompletionEvent = (cancelled + 39) % 128;
        super.onResume();
        getDeviceData(this);
        if (this.ChallengeResultCompleted) {
            cancelled = (CompletionEvent + 93) % 128;
            atd.e.getSDKTransactionID getsdktransactionid = this.getSDKEphemeralPublicKey;
            if (getsdktransactionid != null) {
                getDeviceData getdevicedata = this.ChallengeResult;
                getDeviceData.getSDKTransactionID(new Object[]{getdevicedata, getsdktransactionid}, -1518800562, 1518800562, System.identityHashCode(getdevicedata));
            }
        }
        CompletionEvent = (cancelled + 79) % 128;
    }

    @Override // androidx.p002activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        int i11 = CompletionEvent + 109;
        cancelled = i11 % 128;
        if (i11 % 2 != 0) {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean(getMessageVersion, this.ChallengeResultCompleted);
            bundle.putInt(BuildConfig, Process.myPid());
        } else {
            super.onSaveInstanceState(bundle);
            bundle.putBoolean(getMessageVersion, this.ChallengeResultCompleted);
            bundle.putInt(BuildConfig, Process.myPid());
            throw null;
        }
    }

    @Override // com.adyen.threeds2.internal.ui.activity.getSDKReferenceNumber, androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    public void onStart() {
        cancelled = (CompletionEvent + 105) % 128;
        super.onStart();
        cancelled = (CompletionEvent + 39) % 128;
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.u, android.app.Activity
    protected void onStop() {
        CompletionEvent = (cancelled + 7) % 128;
        super.onStop();
        this.ChallengeResultCompleted = true;
        CompletionEvent = (cancelled + 21) % 128;
    }

    private void getDeviceData(atd.ax.getSDKReferenceNumber getsdkreferencenumber) {
        cancelled = (CompletionEvent + 117) % 128;
        atd.at.AuthenticationRequestParameters sDKReferenceNumber = this.ChallengeResult.getSDKReferenceNumber();
        if (sDKReferenceNumber != null) {
            cancelled = (CompletionEvent + 117) % 128;
            sDKReferenceNumber.setChallengeListener(getsdkreferencenumber);
            CompletionEvent = (cancelled + 69) % 128;
        }
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) throws Throwable {
        ChallengeActivity challengeActivity = (ChallengeActivity) objArr[0];
        Uri uri = (Uri) objArr[1];
        String str = (String) objArr[2];
        Object[] objArr2 = new Object[1];
        c(null, null, 127 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), "\u008e\u008d\u008c\u008b\u0087\u0082\u0085\u0086\u0088\u008a\u0081\u0087\u0088\u0082\u0089\u0088\u0082\u0086\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
        Intent intent = new Intent(((String) objArr2[0]).intern());
        intent.setData(uri);
        try {
            challengeActivity.startActivity(intent);
            int i11 = CompletionEvent + 87;
            cancelled = i11 % 128;
            if (i11 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Throwable unused) {
            Object[] objArr3 = new Object[1];
            c(null, null, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 126, "\u0090\u008f", objArr3);
            String strIntern = ((String) objArr3[0]).intern();
            Object[] objArr4 = new Object[1];
            b((short) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), KeyEvent.normalizeMetaState(0) - 14, 1667179990 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getTouchSlop() >> 8) - 1042889266, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 7), objArr4);
            challengeActivity.getSDKTransactionID(new BuildConfig(strIntern, ((String) objArr4[0]).intern()), str);
            return null;
        }
    }

    @Override // atd.ax.getDeviceData
    public final void getSDKAppID(String str) throws Throwable {
        getSDKAppID(new atd.b.getSDKAppID(str));
        cancelled = (CompletionEvent + 11) % 128;
    }

    static void AuthenticationRequestParameters() {
        getTransactionStatus = new char[]{64906, 64895, 64905, 64891, 64892, 64898, 64959, 64889, 64902, 64904, 64919, 64930, 64934, 64916, 64957, 64955, 64888, 64920, 64882, 64894, 64936, 64897, 64896, 64893, 64938, 64887, 64921, 64901, 64886, 64924, 64927, 64908, 64935, 64933, 64929, 64932};
        getAdditionalDetails = -185467411;
        ChallengeResultTimeout = true;
        ChallengeResultError = true;
        ChallengeStatusHandler = -1672326964;
        ChallengeResultKt = -1568969997;
        ChallengeStatusReceiver = 1054584996;
        onCompletion = new byte[]{11, -8, -4, -113, 115, -126, 127, 124, -117, 100, -103, -120, -123, 116, 120, -126, 112, -78, -76, 77, 79, 79, -90, 87, -74, 71, 98, 102, -11, 68, 74, 70, 68, -86, 102, 107, -12, 76, -77, 70, 74, 87, -92, 73, -75, 75, -68, 72, -85, 85, 85, -81, 70, -66, -73, 85, 101, 82, -8, 73, -75, 75, -68, 72, -85, 85, -75, 6, -5, 77, -68, 65, 64, 70, -66, -73, 85, 69, 114, -122, 79, -73, -72, 73, -75, 66, 65, 127, -72, -5, 75, -69, 68, -73, 78, -80, 2, -124, 77, -88, 81, 71, 119, -123, -70, 72, 2, 98, -46, -20, 24, -44, 49, -56, -34, -12, 126, -126, 113, -121, -119, -123, 115, 122, -123, 118, -113, -113, -128, 114, 115, -106, 120, -127, 114, -106, -123, -108, -12, 89, -91, 86, -96, -82, -94, 84, 93, -94, 81, -70, -95, 91, -95, 73, -79, 95, -90, 85, -79, -94, -77, -9, 60, 59, -53, 59, -62, -55, 59, -57, 38, -54, -54, -59, 55, 54, -45, 61, -60, 55, -45, -64, -47, -3, 81, 86, -90, 86, -81, -92, 86, -86, 75, -79, 64, 81, 83, -68, -72, -11, -55, -53, 42, -56, 51, -50, 49, 60, -50, -50, 38, -59, -54, 59, 58, -56, -55, 39, -52, 46, -48, 60, 24, -14, 119, 102, -128, -116, -126, -114, 120, 113, -114, 125, -121, -118, -123, 127, -116, 113, -98, 104, -106, 125, -97, 97, -115, -87};
    }

    @Override // com.adyen.threeds2.internal.ui.activity.getSDKReferenceNumber
    final ChallengeResultError getSDKAppID() {
        int i11 = cancelled + 79;
        CompletionEvent = i11 % 128;
        if (i11 % 2 != 0) {
            ChallengeResultError challengeResultError = ChallengeResultError.getSDKReferenceNumber;
            throw null;
        }
        ChallengeResultError challengeResultError2 = ChallengeResultError.getSDKReferenceNumber;
        cancelled = (CompletionEvent + 121) % 128;
        return challengeResultError2;
    }

    private void getSDKAppID(atd.b.getSDKReferenceNumber getsdkreferencenumber) throws Throwable {
        CompletionEvent = (cancelled + 41) % 128;
        getSDKTransactionID(getsdkreferencenumber, null);
        int i11 = CompletionEvent + 23;
        cancelled = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private static boolean getDeviceData(String str) {
        return ((Boolean) getSDKTransactionID(new Object[]{str}, -296066178, 296066178, (int) System.currentTimeMillis())).booleanValue();
    }

    @Override // atd.ax.getSDKReferenceNumber
    public final void getSDKTransactionID(String str) throws Throwable {
        getSDKTransactionID(new ChallengeResult(), str);
        int i11 = CompletionEvent + 115;
        cancelled = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 93 / 0;
        }
    }

    private static boolean getSDKAppID(atd.at.AuthenticationRequestParameters authenticationRequestParameters) {
        int i11 = CompletionEvent + 9;
        cancelled = i11 % 128;
        boolean z11 = authenticationRequestParameters instanceof atd.at.getSDKTransactionID;
        if (i11 % 2 == 0) {
            int i12 = 29 / 0;
        }
        return z11;
    }

    private static boolean getSDKReferenceNumber(atd.at.AuthenticationRequestParameters authenticationRequestParameters) {
        int i11 = cancelled;
        int i12 = i11 + 83;
        CompletionEvent = i12 % 128;
        boolean z11 = authenticationRequestParameters instanceof atd.at.getSDKAppID;
        if (i12 % 2 != 0) {
            int i13 = 15 / 0;
        }
        CompletionEvent = (i11 + 21) % 128;
        return z11;
    }

    private void getSDKTransactionID() {
        int i11 = cancelled + 125;
        CompletionEvent = i11 % 128;
        if (i11 % 2 == 0) {
            atd.at.AuthenticationRequestParameters sDKReferenceNumber = this.ChallengeResult.getSDKReferenceNumber();
            if (sDKReferenceNumber != null) {
                int i12 = CompletionEvent + 105;
                cancelled = i12 % 128;
                if (i12 % 2 == 0) {
                    sDKReferenceNumber.setChallengeListener(null);
                    int i13 = 95 / 0;
                    return;
                } else {
                    sDKReferenceNumber.setChallengeListener(null);
                    return;
                }
            }
            return;
        }
        this.ChallengeResult.getSDKReferenceNumber();
        throw null;
    }

    @Override // atd.ax.getSDKReferenceNumber
    public final void getSDKReferenceNumber() throws Throwable {
        getSDKTransactionID(new Object[]{this}, -1306143719, 1306143722, System.identityHashCode(this));
    }

    @Override // atd.ax.getSDKReferenceNumber
    public final void getSDKReferenceNumber(String str) throws Throwable {
        getSDKTransactionID(new Object[]{this, str}, 1201340754, -1201340752, System.identityHashCode(this));
    }

    private void getSDKTransactionID(atd.b.getSDKReferenceNumber getsdkreferencenumber, String str) throws Throwable {
        int i11;
        Object[] objArr;
        Object[] objArr2;
        char c11;
        Object[] objArr3;
        Object[] objArr4;
        char c12;
        Object[] objArr5;
        int length;
        Object objInvoke;
        Object[] objArr6;
        Object[] objArr7;
        Object[] objArr8;
        Object[] objArr9;
        cancelled = (CompletionEvent + 19) % 128;
        Object[] objArr10 = new Object[1];
        c(null, null, TextUtils.getCapsMode("", 0, 0) + 127, "\u0097\u008a\u0085\u0096\u0095\u0094\u0089\u0088\u0091\u0093\u0092\u0087\u0091\u0085\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr10);
        String strIntern = ((String) objArr10[0]).intern();
        Object[] objArr11 = new Object[1];
        b((short) Color.red(0), (-14) - TextUtils.indexOf("", "", 0, 0), 1667180043 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (-1042889263) - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) ((-119) - (KeyEvent.getMaxKeyCode() >> 16)), objArr11);
        String strIntern2 = ((String) objArr11[0]).intern();
        Class cls = (Class) getMessageVersion.getSDKTransactionID(664 - KeyEvent.keyCodeFromString(""), (char) View.resolveSize(0, 0), 25 - ((Process.getThreadPriority(0) + 20) >> 6));
        byte[] bArr = $$a;
        Object[] objArr12 = new Object[1];
        d(bArr[21], (byte) (-bArr[94]), (byte) (-bArr[6]), objArr12);
        long j11 = cls.getField((String) objArr12[0]).getLong(null);
        Class cls2 = Integer.TYPE;
        if (j11 != -1 && j11 + 1889 >= ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
            Class cls3 = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((-1) - Process.getGidForName("")), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 25);
            i11 = 2;
            Object[] objArr13 = new Object[1];
            d(bArr[46], (byte) (-bArr[94]), (byte) (-bArr[87]), objArr13);
            try {
                Object[] objArr14 = {cls3.getField((String) objArr13[0]).get(null), -535850501, 0};
                Map map = getMessageVersion.timedout;
                Object method = map.get(1046315470);
                if (method == null) {
                    method = ((Class) getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64314 - (ViewConfiguration.getScrollBarSize() >> 8)), 28 - KeyEvent.getDeadChar(0, 0))).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                    map.put(1046315470, method);
                }
                objArr = (Object[]) ((Method) method).invoke(null, objArr14);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        } else {
            i11 = 2;
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                cancelled = (CompletionEvent + 73) % 128;
                Object[] objArr15 = new Object[1];
                c(null, null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "\u0083\u0081\u0089\u0084\u009c\u009b\u0093\u0088\u0086\u009a\u0086\u0088\u008a\u0099\u0087\u0098\u0098\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr15);
                Class<?> cls4 = Class.forName(((String) objArr15[0]).intern());
                Object[] objArr16 = new Object[1];
                c(null, null, 127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "\u0082\u0085\u0086\u0088\u0081\u008a\u0086\u0096\u0098\u0098\u0099\u0088\u0082\u0089\u0084\u0084\u009d\u008a", objArr16);
                baseContext = (Context) cls4.getMethod(((String) objArr16[0]).intern(), null).invoke(null, null);
            }
            if (baseContext != null) {
                int i12 = CompletionEvent + 83;
                cancelled = i12 % 128;
                if (i12 % 2 == 0) {
                    baseContext.getApplicationContext();
                    throw null;
                }
                baseContext = baseContext.getApplicationContext();
            }
            try {
                Object[] objArr17 = {baseContext, Integer.valueOf(str != null ? str.length() : 0), -535850501};
                short s11 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE;
                byte[] bArr2 = $$d;
                Context context = baseContext;
                Object[] objArr18 = new Object[1];
                a(s11, bArr2[18], bArr2[11], objArr18);
                Class<?> cls5 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                a((short) EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, (byte) (bArr2[42] - 1), bArr2[10], objArr19);
                Object[] objArr20 = (Object[]) cls5.getMethod((String) objArr19[0], Context.class, cls2, cls2).invoke(null, objArr17);
                if (context != null) {
                    Class cls6 = (Class) getMessageVersion.getSDKTransactionID(View.MeasureSpec.getSize(0) + 664, (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), View.combineMeasuredStates(0, 0) + 25);
                    Object[] objArr21 = new Object[1];
                    d(bArr[46], (byte) (-bArr[94]), (byte) (-bArr[87]), objArr21);
                    cls6.getField((String) objArr21[0]).set(null, objArr20);
                    try {
                        Long lValueOf = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                        Class cls7 = (Class) getMessageVersion.getSDKTransactionID(664 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 26 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                        Object[] objArr22 = new Object[1];
                        d(bArr[21], (byte) (-bArr[94]), (byte) (-bArr[6]), objArr22);
                        cls7.getField((String) objArr22[0]).set(null, lValueOf);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr20;
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        }
        int i13 = ((int[]) objArr[1])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[3])[0];
            Object[] objArr23 = new Object[3];
            objArr23[i11] = 0;
            objArr23[1] = Integer.valueOf(i15);
            objArr23[0] = objArr;
            Map map2 = getMessageVersion.timedout;
            Object method2 = map2.get(1046315470);
            if (method2 == null) {
                method2 = ((Class) getMessageVersion.getSDKTransactionID(ExpandableListView.getPackedPositionChild(0L) + NearbyMessagesStatusCodes.DISALLOWED_CALLING_CONTEXT, (char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 64314), 28 - ExpandableListView.getPackedPositionType(0L))).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                map2.put(1046315470, method2);
            }
            ((Method) method2).invoke(null, objArr23);
        } else {
            long j12 = ((long) (i13 ^ i14)) ^ (-3323045269548826624L);
            try {
                Object[] objArr24 = new Object[i11];
                objArr24[1] = -773706773L;
                objArr24[0] = Long.valueOf(j12);
                byte[] bArr3 = $$d;
                Object[] objArr25 = objArr;
                Object[] objArr26 = new Object[1];
                a((short) 179, bArr3[18], bArr3[76], objArr26);
                Class<?> cls8 = Class.forName((String) objArr26[0]);
                Object[] objArr27 = new Object[1];
                a((short) ($$e | 6), (byte) (bArr3[42] - 1), bArr3[146], objArr27);
                String str2 = (String) objArr27[0];
                Class cls9 = Long.TYPE;
                cls8.getMethod(str2, cls9, cls9).invoke(null, objArr24);
                Object[] objArr28 = {objArr25, Integer.valueOf(((int[]) objArr25[3])[0]), 0};
                Map map3 = getMessageVersion.timedout;
                Object method3 = map3.get(1046315470);
                if (method3 == null) {
                    method3 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getScrollBarFadeDuration() >> 16) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 64314), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 28)).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                    map3.put(1046315470, method3);
                }
                ((Method) method3).invoke(null, objArr28);
            } catch (Throwable th4) {
                Throwable cause3 = th4.getCause();
                if (cause3 == null) {
                    throw th4;
                }
                throw cause3;
            }
        }
        Class cls10 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.getDeadChar(0, 0) + 664, (char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 25);
        byte b11 = (byte) 24;
        Object[] objArr29 = new Object[1];
        d(bArr[40], (byte) (-bArr[94]), b11, objArr29);
        long j13 = cls10.getField((String) objArr29[0]).getLong(null);
        if (j13 != -1 && j13 + 2018 >= ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
            cancelled = (CompletionEvent + 7) % 128;
            Class cls11 = (Class) getMessageVersion.getSDKTransactionID(KeyEvent.normalizeMetaState(0) + 664, (char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24);
            Object[] objArr30 = new Object[1];
            d(bArr[21], bArr[46], bArr[18], objArr30);
            Object[] objArr31 = {cls11.getField((String) objArr30[0]).get(null), -315006771, 0};
            Map map4 = getMessageVersion.timedout;
            Object method4 = map4.get(1046315470);
            if (method4 == null) {
                method4 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getWindowTouchSlop() >> 8) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 64315), 28 - Color.alpha(0))).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                map4.put(1046315470, method4);
            }
            objArr2 = (Object[]) ((Method) method4).invoke(null, objArr31);
            c11 = 0;
        } else {
            Object[] objArr32 = {Integer.valueOf(str != null ? str.length() : 0), -315006771};
            byte[] bArr4 = $$d;
            Object[] objArr33 = new Object[1];
            a((short) 125, bArr4[18], (byte) (-bArr4[69]), objArr33);
            Class<?> cls12 = Class.forName((String) objArr33[0]);
            Object[] objArr34 = new Object[1];
            a((short) 99, bArr4[24], (byte) (-bArr4[6]), objArr34);
            objArr2 = (Object[]) cls12.getMethod((String) objArr34[0], cls2, cls2).invoke(null, objArr32);
            Class cls13 = (Class) getMessageVersion.getSDKTransactionID(664 - Drawable.resolveOpacity(0, 0), (char) (ViewConfiguration.getLongPressTimeout() >> 16), 24 - TextUtils.lastIndexOf("", '0', 0, 0));
            Object[] objArr35 = new Object[1];
            d(bArr[21], bArr[46], bArr[18], objArr35);
            cls13.getField((String) objArr35[0]).set(null, objArr2);
            try {
                Long lValueOf2 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                Class cls14 = (Class) getMessageVersion.getSDKTransactionID((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 663, (char) View.resolveSizeAndState(0, 0, 0), TextUtils.lastIndexOf("", '0', 0) + 26);
                Object[] objArr36 = new Object[1];
                d(bArr[40], (byte) (-bArr[94]), b11, objArr36);
                c11 = 0;
                cls14.getField((String) objArr36[0]).set(null, lValueOf2);
            } catch (Exception unused2) {
                throw new RuntimeException();
            }
        }
        int i16 = ((int[]) objArr2[1])[c11];
        int i17 = ((int[]) objArr2[c11])[c11];
        if (i17 == i16) {
            int i18 = ((int[]) objArr2[3])[c11];
            Object[] objArr37 = new Object[3];
            objArr37[2] = 0;
            objArr37[1] = Integer.valueOf(i18);
            objArr37[c11] = objArr2;
            Map map5 = getMessageVersion.timedout;
            Object method5 = map5.get(1046315470);
            if (method5 == null) {
                method5 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getTapTimeout() >> 16) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64314 - Color.red(0)), Color.red(0) + 28)).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                map5.put(1046315470, method5);
            }
            ((Method) method5).invoke(null, objArr37);
        } else {
            new ArrayList().add((String) objArr2[2]);
            Object[] objArr38 = {Long.valueOf(((long) (i16 ^ i17)) ^ (-5296854222648639488L)), -1233269962L};
            byte[] bArr5 = $$d;
            short s12 = (short) (bArr5[52] - 1);
            byte b12 = bArr5[18];
            byte b13 = bArr5[59];
            Object[] objArr39 = new Object[1];
            a(s12, b12, b13, objArr39);
            Class<?> cls15 = Class.forName((String) objArr39[0]);
            Object[] objArr40 = new Object[1];
            a((short) ($$e | 6), (byte) (bArr5[42] - 1), bArr5[146], objArr40);
            String str3 = (String) objArr40[0];
            Class cls16 = Long.TYPE;
            cls15.getMethod(str3, cls16, cls16).invoke(null, objArr38);
            Object[] objArr41 = {objArr2, Integer.valueOf(((int[]) objArr2[3])[0]), r2};
            Map map6 = getMessageVersion.timedout;
            Object method6 = map6.get(1046315470);
            if (method6 == null) {
                method6 = ((Class) getMessageVersion.getSDKTransactionID(2802 - TextUtils.getCapsMode("", 0, 0), (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 64314), 28 - View.MeasureSpec.getMode(0))).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                map6.put(1046315470, method6);
            }
            ((Method) method6).invoke(null, objArr41);
        }
        Class cls17 = (Class) getMessageVersion.getSDKTransactionID((KeyEvent.getMaxKeyCode() >> 16) + 664, (char) Color.alpha(0), ExpandableListView.getPackedPositionType(0L) + 25);
        Object[] objArr42 = new Object[1];
        d(bArr[8], (byte) (-bArr[94]), bArr[89], objArr42);
        long j14 = cls17.getField((String) objArr42[0]).getLong(null);
        if (j14 != -1 && j14 + 1875 >= ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
            Class cls18 = (Class) getMessageVersion.getSDKTransactionID(665 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 25);
            byte b14 = bArr[89];
            byte b15 = bArr[21];
            Object[] objArr43 = new Object[1];
            d(b14, b15, b15, objArr43);
            Object[] objArr44 = {cls18.getField((String) objArr43[0]).get(null), -749870339, r2};
            Map map7 = getMessageVersion.timedout;
            Object method7 = map7.get(1046315470);
            if (method7 == null) {
                method7 = ((Class) getMessageVersion.getSDKTransactionID(Color.argb(0, 0, 0, 0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 64314), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 27)).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                map7.put(1046315470, method7);
            }
            objArr3 = (Object[]) ((Method) method7).invoke(null, objArr44);
        } else {
            Context baseContext2 = getBaseContext();
            if (baseContext2 == null) {
                Object[] objArr45 = new Object[1];
                c(null, null, 127 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), "\u0083\u0081\u0089\u0084\u009c\u009b\u0093\u0088\u0086\u009a\u0086\u0088\u008a\u0099\u0087\u0098\u0098\u0081\u0087\u0083\u0086\u0085\u0084\u0083\u0082\u0081", objArr45);
                Class<?> cls19 = Class.forName(((String) objArr45[0]).intern());
                Object[] objArr46 = new Object[1];
                c(null, null, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, "\u0082\u0085\u0086\u0088\u0081\u008a\u0086\u0096\u0098\u0098\u0099\u0088\u0082\u0089\u0084\u0084\u009d\u008a", objArr46);
                baseContext2 = (Context) cls19.getMethod(((String) objArr46[0]).intern(), null).invoke(null, null);
            }
            if (baseContext2 != null) {
                baseContext2 = baseContext2.getApplicationContext();
            }
            Object[] objArr47 = {baseContext2, Integer.valueOf(str != null ? str.length() : 0), -749870339};
            Object[] objArr48 = new Object[1];
            b((short) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (-14) - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1667180041, Color.rgb(0, 0, 0) - 1026112033, (byte) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 71), objArr48);
            Class<?> cls20 = Class.forName(((String) objArr48[0]).intern());
            short s13 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
            byte[] bArr6 = $$d;
            Object[] objArr49 = new Object[1];
            a(s13, (byte) (bArr6[42] - 1), bArr6[10], objArr49);
            Object[] objArr50 = (Object[]) cls20.getMethod((String) objArr49[0], Context.class, cls2, cls2).invoke(null, objArr47);
            if (baseContext2 != null) {
                Class cls21 = (Class) getMessageVersion.getSDKTransactionID((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 663, (char) KeyEvent.normalizeMetaState(0), Color.blue(0) + 25);
                byte b16 = bArr[89];
                byte b17 = bArr[21];
                Object[] objArr51 = new Object[1];
                d(b16, b17, b17, objArr51);
                cls21.getField((String) objArr51[0]).set(null, objArr50);
                try {
                    Long lValueOf3 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                    Class cls22 = (Class) getMessageVersion.getSDKTransactionID(664 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 24 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    Object[] objArr52 = new Object[1];
                    d(bArr[8], (byte) (-bArr[94]), bArr[89], objArr52);
                    cls22.getField((String) objArr52[0]).set(null, lValueOf3);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            }
            objArr3 = objArr50;
        }
        int i19 = ((int[]) objArr3[1])[0];
        int i21 = ((int[]) objArr3[0])[0];
        if (i21 == i19) {
            int i22 = CompletionEvent + 51;
            cancelled = i22 % 128;
            if (i22 % 2 == 0) {
                Object[] objArr53 = {objArr3, Integer.valueOf(((int[]) objArr3[3])[1]), 1};
                Map map8 = getMessageVersion.timedout;
                Object method8 = map8.get(1046315470);
                if (method8 == null) {
                    method8 = ((Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0') + NearbyMessagesStatusCodes.DISALLOWED_CALLING_CONTEXT, (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 64314), (ViewConfiguration.getScrollBarSize() >> 8) + 28)).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                    map8.put(1046315470, method8);
                }
                ((Method) method8).invoke(null, objArr53);
            } else {
                Object[] objArr54 = {objArr3, Integer.valueOf(((int[]) objArr3[3])[0]), r2};
                Map map9 = getMessageVersion.timedout;
                Object method9 = map9.get(1046315470);
                if (method9 == null) {
                    method9 = ((Class) getMessageVersion.getSDKTransactionID(2802 - TextUtils.getCapsMode("", 0, 0), (char) (TextUtils.lastIndexOf("", '0') + 64315), Gravity.getAbsoluteGravity(0, 0) + 28)).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                    map9.put(1046315470, method9);
                }
                ((Method) method9).invoke(null, objArr54);
            }
        } else {
            Object[] objArr55 = {Long.valueOf(((long) (i19 ^ i21)) ^ (-4230350702737620992L)), -984955789L};
            byte[] bArr7 = $$d;
            Object[] objArr56 = new Object[1];
            a((short) (bArr7[52] - 1), bArr7[18], bArr7[59], objArr56);
            Class<?> cls23 = Class.forName((String) objArr56[0]);
            Object[] objArr57 = new Object[1];
            a((short) ($$e | 6), (byte) (bArr7[42] - 1), bArr7[146], objArr57);
            String str4 = (String) objArr57[0];
            Class cls24 = Long.TYPE;
            cls23.getMethod(str4, cls24, cls24).invoke(null, objArr55);
            Object[] objArr58 = {objArr3, Integer.valueOf(((int[]) objArr3[3])[0]), r2};
            Map map10 = getMessageVersion.timedout;
            Object method10 = map10.get(1046315470);
            if (method10 == null) {
                method10 = ((Class) getMessageVersion.getSDKTransactionID(Gravity.getAbsoluteGravity(0, 0) + NearbyMessagesStatusCodes.APP_NOT_OPTED_IN, (char) (64314 - View.getDefaultSize(0, 0)), 28 - Color.green(0))).getMethod("getSDKTransactionID", Object[].class, cls2, cls2);
                map10.put(1046315470, method10);
            }
            ((Method) method10).invoke(null, objArr58);
        }
        Class cls25 = (Class) getMessageVersion.getSDKTransactionID(721 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getScrollBarSize() >> 8) + 33);
        Object[] objArr59 = new Object[1];
        d(bArr[46], (byte) (-bArr[94]), (byte) (-bArr[87]), objArr59);
        long j15 = cls25.getField((String) objArr59[0]).getLong(null);
        if (j15 != -1 && j15 + 1960 >= ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
            Class cls26 = (Class) getMessageVersion.getSDKTransactionID(721 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) Gravity.getAbsoluteGravity(0, 0), 34 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
            Object[] objArr60 = new Object[1];
            d(bArr[8], (byte) (-bArr[94]), bArr[89], objArr60);
            Object[] objArr61 = {cls26.getField((String) objArr60[0]).get(null), -746014973, r2};
            Map map11 = getMessageVersion.timedout;
            Object method11 = map11.get(-1124906587);
            if (method11 == null) {
                method11 = ((Class) getMessageVersion.getSDKTransactionID(2718 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod("AuthenticationRequestParameters", Object[].class, cls2, cls2);
                map11.put(-1124906587, method11);
            }
            objArr4 = (Object[]) ((Method) method11).invoke(null, objArr61);
            c12 = 0;
        } else {
            Object[] objArr62 = {Integer.valueOf(str != null ? str.length() : 0), r2, -746014973};
            Map map12 = getMessageVersion.timedout;
            Object method12 = map12.get(1459979046);
            if (method12 == null) {
                Class cls27 = (Class) getMessageVersion.getSDKTransactionID(Color.alpha(0) + 721, (char) Color.argb(0, 0, 0, 0), 33 - TextUtils.indexOf("", ""));
                Object[] objArr63 = new Object[1];
                d(bArr[8], (byte) (-bArr[94]), bArr[89], objArr63);
                method12 = cls27.getMethod((String) objArr63[0], cls2, cls2, cls2);
                map12.put(1459979046, method12);
            }
            objArr4 = (Object[]) ((Method) method12).invoke(null, objArr62);
            Class cls28 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0) + 722, (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), TextUtils.getTrimmedLength("") + 33);
            Object[] objArr64 = new Object[1];
            d(bArr[8], (byte) (-bArr[94]), bArr[89], objArr64);
            cls28.getField((String) objArr64[0]).set(null, objArr4);
            try {
                Long lValueOf4 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                Class cls29 = (Class) getMessageVersion.getSDKTransactionID(721 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), 34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                Object[] objArr65 = new Object[1];
                d(bArr[46], (byte) (-bArr[94]), (byte) (-bArr[87]), objArr65);
                c12 = 0;
                cls29.getField((String) objArr65[0]).set(null, lValueOf4);
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i23 = ((int[]) objArr4[1])[c12];
        int i24 = ((int[]) objArr4[c12])[c12];
        if (i24 == i23) {
            int i25 = ((int[]) objArr4[9])[c12];
            Object[] objArr66 = new Object[3];
            objArr66[2] = r2;
            objArr66[1] = Integer.valueOf(i25);
            objArr66[c12] = objArr4;
            Map map13 = getMessageVersion.timedout;
            Object method13 = map13.get(-1124906587);
            if (method13 == null) {
                method13 = ((Class) getMessageVersion.getSDKTransactionID(KeyEvent.keyCodeFromString("") + 2718, (char) (TextUtils.lastIndexOf("", '0') + 1), 32 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))).getMethod("AuthenticationRequestParameters", Object[].class, cls2, cls2);
                map13.put(-1124906587, method13);
            }
            ((Method) method13).invoke(null, objArr66);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add((String) objArr4[2]);
            arrayList.add((String) objArr4[3]);
            arrayList.add((String) objArr4[4]);
            arrayList.add((String) objArr4[5]);
            arrayList.add((String) objArr4[6]);
            arrayList.add((String) objArr4[7]);
            arrayList.add((String) objArr4[8]);
            Object[] objArr67 = {Long.valueOf(((long) (i23 ^ i24)) ^ 7452134344392441856L), 1735085237L};
            byte[] bArr8 = $$d;
            Object[] objArr68 = new Object[1];
            a(bArr8[146], bArr8[18], bArr8[5], objArr68);
            Class<?> cls30 = Class.forName((String) objArr68[0]);
            Object[] objArr69 = new Object[1];
            a((short) ($$e | 6), (byte) (bArr8[42] - 1), bArr8[146], objArr69);
            String str5 = (String) objArr69[0];
            Class cls31 = Long.TYPE;
            cls30.getMethod(str5, cls31, cls31).invoke(null, objArr67);
            Object[] objArr70 = {objArr4, Integer.valueOf(((int[]) objArr4[9])[0]), r2};
            Map map14 = getMessageVersion.timedout;
            Object method14 = map14.get(-1124906587);
            if (method14 == null) {
                method14 = ((Class) getMessageVersion.getSDKTransactionID(2719 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) ExpandableListView.getPackedPositionGroup(0L), (-16777185) - Color.rgb(0, 0, 0))).getMethod("AuthenticationRequestParameters", Object[].class, cls2, cls2);
                map14.put(-1124906587, method14);
            }
            ((Method) method14).invoke(null, objArr70);
        }
        Map map15 = getMessageVersion.timedout;
        Object method15 = map15.get(-1920284156);
        if (method15 != null) {
            objArr5 = null;
        } else {
            Class cls32 = (Class) getMessageVersion.getSDKTransactionID(TextUtils.indexOf((CharSequence) "", '0', 0) + 1, (char) (54381 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 35 - TextUtils.indexOf((CharSequence) "", '0'));
            short s14 = (short) EnumC4419g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE;
            byte[] bArr9 = $$d;
            Object[] objArr71 = new Object[1];
            a(s14, (byte) (bArr9[42] - 1), bArr9[10], objArr71);
            String str6 = (String) objArr71[0];
            objArr5 = null;
            method15 = cls32.getMethod(str6, null);
            map15.put(-1920284156, method15);
        }
        Object objInvoke2 = ((Method) method15).invoke(objArr5, objArr5);
        Object[] objArr72 = {getsdkreferencenumber, str};
        Object method16 = map15.get(256747193);
        if (method16 == null) {
            Class cls33 = (Class) getMessageVersion.getSDKTransactionID((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1, (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 54380), TextUtils.getOffsetBefore("", 0) + 36);
            short s15 = (short) ($$e | 6);
            byte[] bArr10 = $$d;
            Object[] objArr73 = new Object[1];
            a(s15, (byte) (bArr10[42] - 1), bArr10[146], objArr73);
            method16 = cls33.getMethod((String) objArr73[0], atd.b.getSDKReferenceNumber.class, String.class);
            map15.put(256747193, method16);
        }
        ((Method) method16).invoke(objInvoke2, objArr72);
        Class cls34 = (Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 754, (char) (16830 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 35);
        byte b18 = bArr[89];
        byte b19 = bArr[21];
        Object[] objArr74 = new Object[1];
        d(b18, b19, b19, objArr74);
        long j16 = cls34.getField((String) objArr74[0]).getLong(null);
        if (j16 != -1 && j16 + 2021 >= ((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue()) {
            Class cls35 = (Class) getMessageVersion.getSDKTransactionID(753 - TextUtils.indexOf((CharSequence) "", '0'), (char) (16830 - (ViewConfiguration.getScrollBarSize() >> 8)), (-16777181) - Color.rgb(0, 0, 0));
            Object[] objArr75 = new Object[1];
            d(bArr[21], (byte) (-bArr[94]), (byte) (-bArr[6]), objArr75);
            Object[] objArr76 = {cls35.getField((String) objArr75[0]).get(null), -572203626, r2};
            Object method17 = map15.get(245738379);
            if (method17 == null) {
                method17 = ((Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getPressedStateDuration() >> 16) + 2778, (char) (39468 - Color.red(0)), 24 - View.MeasureSpec.getMode(0))).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID(2748 - MotionEvent.axisFromString(""), (char) (54838 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 29), cls2, cls2);
                map15.put(245738379, method17);
            }
            objInvoke = ((Method) method17).invoke(null, objArr76);
        } else {
            if (str != null) {
                CompletionEvent = (cancelled + 123) % 128;
                length = str.length();
            } else {
                length = 0;
            }
            Object[] objArr77 = {Integer.valueOf(length), -572203626};
            Object method18 = map15.get(-836670848);
            if (method18 == null) {
                Class cls36 = (Class) getMessageVersion.getSDKTransactionID(754 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (char) (16829 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 35 - Gravity.getAbsoluteGravity(0, 0));
                Object[] objArr78 = new Object[1];
                d(bArr[40], (byte) (-bArr[94]), b11, objArr78);
                method18 = cls36.getMethod((String) objArr78[0], cls2, cls2);
                map15.put(-836670848, method18);
            }
            objInvoke = ((Method) method18).invoke(null, objArr77);
            Class cls37 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 754, (char) (ExpandableListView.getPackedPositionGroup(0L) + 16830), 35 - (ViewConfiguration.getPressedStateDuration() >> 16));
            Object[] objArr79 = new Object[1];
            d(bArr[21], (byte) (-bArr[94]), (byte) (-bArr[6]), objArr79);
            cls37.getField((String) objArr79[0]).set(null, objInvoke);
            try {
                Long lValueOf5 = Long.valueOf(((Long) Class.forName(strIntern).getDeclaredMethod(strIntern2, null).invoke(null, null)).longValue());
                Class cls38 = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 753, (char) (16830 - Color.argb(0, 0, 0, 0)), 35 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                byte b21 = bArr[89];
                byte b22 = bArr[21];
                Object[] objArr80 = new Object[1];
                d(b21, b22, b22, objArr80);
                cls38.getField((String) objArr80[0]).set(null, lValueOf5);
            } catch (Exception unused5) {
                throw new RuntimeException();
            }
        }
        Object method19 = map15.get(693253393);
        if (method19 != null) {
            objArr6 = null;
        } else {
            objArr6 = null;
            method19 = ((Class) getMessageVersion.getSDKTransactionID(Color.alpha(0) + 2749, (char) (54837 - ImageFormat.getBitsPerPixel(0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 30)).getMethod("getSDKReferenceNumber", null);
            map15.put(693253393, method19);
        }
        int iIntValue = ((Integer) ((Method) method19).invoke(objInvoke, objArr6)).intValue();
        Object method20 = map15.get(-635346729);
        if (method20 != null) {
            objArr7 = null;
        } else {
            objArr7 = null;
            method20 = ((Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2749, (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 54839), 29 - Color.green(0))).getMethod("getDeviceData", null);
            map15.put(-635346729, method20);
        }
        int iIntValue2 = ((Integer) ((Method) method20).invoke(objInvoke, objArr7)).intValue();
        if (iIntValue2 == iIntValue) {
            Object method21 = map15.get(560827737);
            if (method21 != null) {
                objArr9 = null;
            } else {
                objArr9 = null;
                method21 = ((Class) getMessageVersion.getSDKTransactionID((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 2749, (char) (54838 - ((Process.getThreadPriority(0) + 20) >> 6)), Gravity.getAbsoluteGravity(0, 0) + 29)).getMethod("getSDKAppID", null);
                map15.put(560827737, method21);
            }
            Integer num = (Integer) ((Method) method21).invoke(objInvoke, objArr9);
            num.intValue();
            Object[] objArr81 = {objInvoke, num, r2};
            Object method22 = map15.get(245738379);
            if (method22 == null) {
                method22 = ((Class) getMessageVersion.getSDKTransactionID(2778 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 39468), 24 - (KeyEvent.getMaxKeyCode() >> 16))).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID(2748 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (54838 - TextUtils.getCapsMode("", 0, 0)), TextUtils.indexOf("", "") + 29), cls2, cls2);
                map15.put(245738379, method22);
            }
            ((Method) method22).invoke(null, objArr81);
            return;
        }
        Object[] objArr82 = {Long.valueOf(((long) (iIntValue ^ iIntValue2)) ^ (-1175033761478213632L)), -273581819L};
        byte[] bArr11 = $$d;
        byte b23 = bArr11[24];
        Object[] objArr83 = new Object[1];
        a(b23, bArr11[18], b23, objArr83);
        Class<?> cls39 = Class.forName((String) objArr83[0]);
        Object[] objArr84 = new Object[1];
        a((short) 99, bArr11[24], (byte) (-bArr11[6]), objArr84);
        String str7 = (String) objArr84[0];
        Class cls40 = Long.TYPE;
        cls39.getMethod(str7, cls40, cls40).invoke(null, objArr82);
        Object method23 = map15.get(560827737);
        if (method23 != null) {
            objArr8 = null;
        } else {
            objArr8 = null;
            method23 = ((Class) getMessageVersion.getSDKTransactionID(2749 - TextUtils.getCapsMode("", 0, 0), (char) (54838 - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28)).getMethod("getSDKAppID", null);
            map15.put(560827737, method23);
        }
        Integer num2 = (Integer) ((Method) method23).invoke(objInvoke, objArr8);
        num2.intValue();
        Object[] objArr85 = {objInvoke, num2, r2};
        Object method24 = map15.get(245738379);
        if (method24 == null) {
            method24 = ((Class) getMessageVersion.getSDKTransactionID(2777 - TextUtils.lastIndexOf("", '0', 0), (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 39468), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24)).getMethod("getSDKReferenceNumber", (Class) getMessageVersion.getSDKTransactionID(2749 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (54838 - TextUtils.getTrimmedLength("")), TextUtils.indexOf((CharSequence) "", '0') + 30), cls2, cls2);
            map15.put(245738379, method24);
        }
        ((Method) method24).invoke(null, objArr85);
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) throws Throwable {
        String str = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        c(null, null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, "\u0091\u0098\u0088\u0088\u009c", objArr2);
        if (!((String) objArr2[0]).intern().equals(str)) {
            Object[] objArr3 = new Object[1];
            c(null, null, 127 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), "\u0098\u0088\u0088\u009c", objArr3);
            if (!((String) objArr3[0]).intern().equals(str)) {
                CompletionEvent = (cancelled + 25) % 128;
                Object[] objArr4 = new Object[1];
                b((short) ((-16777216) - Color.rgb(0, 0, 0)), (-14) - ((Process.getThreadPriority(0) + 20) >> 6), 1667180038 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) - 1042889160, (byte) (35 - View.MeasureSpec.getMode(0)), objArr4);
                if (!((String) objArr4[0]).intern().equals(str)) {
                    int i11 = CompletionEvent + 85;
                    cancelled = i11 % 128;
                    if (i11 % 2 != 0) {
                        return Boolean.FALSE;
                    }
                    throw null;
                }
            }
        }
        return Boolean.TRUE;
    }
}
