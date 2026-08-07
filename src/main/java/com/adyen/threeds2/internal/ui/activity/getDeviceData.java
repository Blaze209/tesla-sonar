package com.adyen.threeds2.internal.ui.activity;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.a0;
import androidx.fragment.app.u;
import atd.a.getMessageVersion;
import atd.ad.AuthenticationRequestParameters;
import atd.at.ChallengeResultCancelled;
import atd.at.getSDKEphemeralPublicKey;
import atd.az.getTransactionStatus;
import atd.e.ChallengeResult;
import atd.e.ChallengeResultKt;
import atd.e.ChallengeResultTimeout;
import atd.e.getAdditionalDetails;
import atd.e.getSDKTransactionID;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import k5.e;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"SyntheticAccessor"})
final class getDeviceData {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static boolean AuthenticationRequestParameters;
    private static int BuildConfig;
    private static long ChallengeResultCancelled;
    private static int getSDKEphemeralPublicKey;
    final atd.ax.getSDKReferenceNumber getDeviceData;
    private getSDKAppID getSDKAppID;
    final Queue<AnimatorSet> getSDKReferenceNumber = new ArrayDeque();
    private final u getSDKTransactionID;

    /* JADX INFO: renamed from: com.adyen.threeds2.internal.ui.activity.getDeviceData$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        private static int AuthenticationRequestParameters = 0;
        static final /* synthetic */ int[] getDeviceData;
        private static int getSDKTransactionID = 1;

        static {
            int[] iArr = new int[atd.i.getSDKAppID.values().length];
            getDeviceData = iArr;
            try {
                iArr[atd.i.getSDKAppID.SINGLE_TEXT_INPUT.ordinal()] = 1;
                int i11 = AuthenticationRequestParameters;
                getSDKTransactionID = (((i11 | 119) << 1) - (i11 ^ 119)) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getDeviceData[atd.i.getSDKAppID.SINGLE_SELECT.ordinal()] = 2;
                int i12 = AuthenticationRequestParameters;
                int i13 = i12 & 21;
                getSDKTransactionID = (((((i12 ^ 21) | i13) << 1) - (~(-((i12 | 21) & (~i13))))) - 1) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                getDeviceData[atd.i.getSDKAppID.MULTI_SELECT.ordinal()] = 3;
                int i14 = AuthenticationRequestParameters;
                int i15 = i14 & 31;
                getSDKTransactionID = (i15 + ((i14 ^ 31) | i15)) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                getDeviceData[atd.i.getSDKAppID.OUT_OF_BAND.ordinal()] = 4;
                int i16 = AuthenticationRequestParameters;
                int i17 = ((i16 ^ 93) | (i16 & 93)) << 1;
                int i18 = -(((~i16) & 93) | (i16 & (-94)));
                getSDKTransactionID = ((i17 & i18) + (i18 | i17)) % 128;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                getDeviceData[atd.i.getSDKAppID.HTML_UI.ordinal()] = 5;
                int i19 = getSDKTransactionID;
                int i21 = i19 & 25;
                int i22 = (i19 | 25) & (~i21);
                int i23 = -(-(i21 << 1));
                AuthenticationRequestParameters = ((i22 & i23) + (i22 | i23)) % 128;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        BuildConfig = 0;
        getSDKEphemeralPublicKey = 1;
        getSDKEphemeralPublicKey();
        AudioTrack.getMinVolume();
        BuildConfig = (getSDKEphemeralPublicKey + 45) % 128;
    }

    getDeviceData(u uVar, atd.ax.getSDKReferenceNumber getsdkreferencenumber) {
        this.getSDKTransactionID = uVar;
        this.getDeviceData = getsdkreferencenumber;
    }

    static boolean AuthenticationRequestParameters() {
        boolean z11;
        int i11 = BuildConfig;
        int i12 = i11 + 31;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 == 0) {
            z11 = AuthenticationRequestParameters;
            int i13 = 94 / 0;
        } else {
            z11 = AuthenticationRequestParameters;
        }
        int i14 = i11 + 67;
        getSDKEphemeralPublicKey = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 49 / 0;
        }
        return z11;
    }

    private View BuildConfig() {
        int i11 = BuildConfig + 119;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            df_().getChildCount();
            throw null;
        }
        ViewGroup viewGroupDf_ = df_();
        int childCount = viewGroupDf_.getChildCount();
        View childAt = viewGroupDf_.getChildAt(childCount > 0 ? childCount - 1 : 0);
        BuildConfig = (getSDKEphemeralPublicKey + 89) % 128;
        return childAt;
    }

    private View ChallengeResultCancelled() {
        int i11 = BuildConfig + 85;
        getSDKEphemeralPublicKey = i11 % 128;
        int i12 = i11 % 2;
        View childAt = df_().getChildAt(0);
        int i13 = getSDKEphemeralPublicKey + 119;
        BuildConfig = i13 % 128;
        if (i13 % 2 == 0) {
            return childAt;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x01a8  */
    private static void a(String str, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        int i12;
        char[] charArray = str != null ? str.toCharArray() : str;
        getTransactionStatus gettransactionstatus = new getTransactionStatus();
        gettransactionstatus.getSDKAppID = i11;
        int length = charArray.length;
        long[] jArr = new long[length];
        int i13 = 0;
        gettransactionstatus.getSDKTransactionID = 0;
        $11 = ($10 + 43) % 128;
        while (true) {
            int i14 = gettransactionstatus.getSDKTransactionID;
            if (i14 >= charArray.length) {
                break;
            }
            char c11 = charArray[i14];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[2] = gettransactionstatus;
                objArr2[1] = gettransactionstatus;
                objArr2[i13] = Integer.valueOf(c11);
                Map map = getMessageVersion.timedout;
                Object method = map.get(962978490);
                if (method != null) {
                    i12 = i13;
                } else {
                    Class cls = (Class) getMessageVersion.getSDKTransactionID((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 689, (char) (16022 - Color.argb(i13, i13, i13, i13)), TextUtils.getOffsetAfter("", i13) + 32);
                    byte b11 = (byte) i13;
                    byte b12 = b11;
                    i12 = i13;
                    Object[] objArr3 = new Object[1];
                    b(b11, b12, b12, objArr3);
                    method = cls.getMethod((String) objArr3[i12], Integer.TYPE, Object.class, Object.class);
                    map.put(962978490, method);
                }
                jArr[i14] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (ChallengeResultCancelled ^ (-2227742522694838850L));
                Object[] objArr4 = new Object[2];
                objArr4[1] = gettransactionstatus;
                objArr4[i12] = gettransactionstatus;
                Object method2 = map.get(-46730980);
                if (method2 == null) {
                    int i15 = i12;
                    method2 = ((Class) getMessageVersion.getSDKTransactionID(417 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (char) (29017 - (KeyEvent.getMaxKeyCode() >> 16)), (-16777192) - Color.rgb(i15, i15, i15))).getMethod("A", Object.class, Object.class);
                    map.put(-46730980, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                jArr = jArr;
                i13 = 0;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        long[] jArr2 = jArr;
        char[] cArr = new char[length];
        gettransactionstatus.getSDKTransactionID = 0;
        while (true) {
            int i16 = gettransactionstatus.getSDKTransactionID;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            int i17 = $10 + 83;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr[i16] = (char) jArr2[i16];
                Object[] objArr5 = {gettransactionstatus, gettransactionstatus};
                Map map2 = getMessageVersion.timedout;
                Object method3 = map2.get(-46730980);
                if (method3 == null) {
                    method3 = ((Class) getMessageVersion.getSDKTransactionID(417 - Drawable.resolveOpacity(0, 0), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 29016), 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16))).getMethod("A", Object.class, Object.class);
                    map2.put(-46730980, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                int i18 = 22 / 0;
            } else {
                cArr[i16] = (char) jArr2[i16];
                Object[] objArr6 = {gettransactionstatus, gettransactionstatus};
                Map map3 = getMessageVersion.timedout;
                Object method4 = map3.get(-46730980);
                if (method4 == null) {
                    method4 = ((Class) getMessageVersion.getSDKTransactionID((-16776799) - Color.rgb(0, 0, 0), (char) (29018 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 24)).getMethod("A", Object.class, Object.class);
                    map3.put(-46730980, method4);
                }
                ((Method) method4).invoke(null, objArr6);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void b(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 3
            int r7 = 118 - r7
            byte[] r0 = com.adyen.threeds2.internal.ui.activity.getDeviceData.$$a
            int r9 = r9 * 4
            int r9 = 1 - r9
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r0
            r4 = r2
            r0 = r8
            r8 = r9
            goto L2f
        L18:
            r3 = r2
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r0
            r0 = r6
        L2f:
            int r7 = -r7
            int r7 = r7 + r8
            int r8 = r0 + 1
            r0 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.getDeviceData.b(short, int, short, java.lang.Object[]):void");
    }

    private ViewGroup df_() {
        ViewGroup viewGroup;
        int i11 = BuildConfig + 17;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            viewGroup = (ViewGroup) this.getSDKTransactionID.findViewById(R.id.content);
            int i12 = 95 / 0;
        } else {
            viewGroup = (ViewGroup) this.getSDKTransactionID.findViewById(R.id.content);
        }
        BuildConfig = (getSDKEphemeralPublicKey + 15) % 128;
        return viewGroup;
    }

    private void dg_(AnimatorSet animatorSet) {
        int i11 = BuildConfig + 73;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            this.getSDKReferenceNumber.isEmpty();
            throw null;
        }
        if (this.getSDKReferenceNumber.isEmpty()) {
            this.getSDKReferenceNumber.add(animatorSet);
            animatorSet.start();
        } else {
            this.getSDKReferenceNumber.add(animatorSet);
            getSDKEphemeralPublicKey = (BuildConfig + 109) % 128;
        }
    }

    static void getSDKEphemeralPublicKey() {
        ChallengeResultCancelled = -4543688163598213899L;
    }

    private static void getSDKReferenceNumber(boolean z11) {
        int i11 = BuildConfig + 61;
        int i12 = i11 % 128;
        getSDKEphemeralPublicKey = i12;
        if (i11 % 2 == 0) {
            AuthenticationRequestParameters = z11;
            int i13 = 49 / 0;
        } else {
            AuthenticationRequestParameters = z11;
        }
        BuildConfig = (i12 + 79) % 128;
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = (i11 * EnumC4419g.SDK_ASSET_ICON_PROGRESS_VALUE) + (i12 * (-215)) + ((~(i11 | i13)) * EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
        int i15 = (~i12) | i11;
        int i16 = ~i13;
        int i17 = i14 + ((i15 | i16) * (-216)) + (((~(i11 | i16)) | i12) * EnumC4419g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
        if (i17 != 1) {
            return i17 != 2 ? AuthenticationRequestParameters(objArr) : getSDKTransactionID(objArr);
        }
        return getSDKReferenceNumber(objArr);
    }

    static void init$0() {
        $$a = new byte[]{11, 12, 68, 127};
        $$b = 79;
    }

    final void ChallengeResult() {
        AnimatorSet animatorSetPeek;
        int i11 = BuildConfig + 17;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            this.getSDKReferenceNumber.poll();
            this.getSDKReferenceNumber.isEmpty();
            throw null;
        }
        this.getSDKReferenceNumber.poll();
        if (this.getSDKReferenceNumber.isEmpty() || (animatorSetPeek = this.getSDKReferenceNumber.peek()) == null) {
            return;
        }
        BuildConfig = (getSDKEphemeralPublicKey + 103) % 128;
        animatorSetPeek.start();
        getSDKEphemeralPublicKey = (BuildConfig + 31) % 128;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        r6.getSDKAppID = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0064, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0065, code lost:
    
        r0 = com.adyen.threeds2.internal.ui.activity.getSDKAppID.getSDKAppID();
        r6.getSDKAppID = r0;
        r4 = r6.getSDKTransactionID.getSupportFragmentManager();
        r3 = new java.lang.Object[1];
        a("इ惗\udaac㑶깎\u181a現\uedd1䞕녲⬴蔝ﳢ嚹삏㩂", android.view.Gravity.getAbsoluteGravity(0, 0) + 27091, r3);
        r0.show(r4, ((java.lang.String) r3[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003a, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void getDeviceData() throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = AuthenticationRequestParameters()
            if (r0 != 0) goto L87
            int r0 = com.adyen.threeds2.internal.ui.activity.getDeviceData.BuildConfig
            int r0 = r0 + 27
            int r1 = r0 % 128
            com.adyen.threeds2.internal.ui.activity.getDeviceData.getSDKEphemeralPublicKey = r1
            int r0 = r0 % 2
            java.lang.String r1 = "इ惗\udaac㑶깎\u181a現\uedd1䞕녲⬴蔝ﳢ嚹삏㩂"
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L3d
            getSDKReferenceNumber(r3)
            androidx.fragment.app.u r0 = r6.getSDKTransactionID
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            int r4 = android.view.KeyEvent.getModifierMetaStateMask()
            byte r4 = (byte) r4
            r5 = 7394(0x1ce2, float:1.0361E-41)
            int r5 = r5 % r4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            a(r1, r5, r4)
            r4 = r4[r2]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            androidx.fragment.app.Fragment r0 = r0.o0(r4)
            com.adyen.threeds2.internal.ui.activity.getSDKAppID r0 = (com.adyen.threeds2.internal.ui.activity.getSDKAppID) r0
            if (r0 == 0) goto L65
            goto L62
        L3d:
            getSDKReferenceNumber(r3)
            androidx.fragment.app.u r0 = r6.getSDKTransactionID
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            int r4 = android.view.KeyEvent.getModifierMetaStateMask()
            byte r4 = (byte) r4
            int r4 = 27090 - r4
            java.lang.Object[] r5 = new java.lang.Object[r3]
            a(r1, r4, r5)
            r4 = r5[r2]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r4.intern()
            androidx.fragment.app.Fragment r0 = r0.o0(r4)
            com.adyen.threeds2.internal.ui.activity.getSDKAppID r0 = (com.adyen.threeds2.internal.ui.activity.getSDKAppID) r0
            if (r0 == 0) goto L65
        L62:
            r6.getSDKAppID = r0
            return
        L65:
            com.adyen.threeds2.internal.ui.activity.getSDKAppID r0 = com.adyen.threeds2.internal.ui.activity.getSDKAppID.getSDKAppID()
            r6.getSDKAppID = r0
            androidx.fragment.app.u r4 = r6.getSDKTransactionID
            androidx.fragment.app.FragmentManager r4 = r4.getSupportFragmentManager()
            int r5 = android.view.Gravity.getAbsoluteGravity(r2, r2)
            int r5 = r5 + 27091
            java.lang.Object[] r3 = new java.lang.Object[r3]
            a(r1, r5, r3)
            r1 = r3[r2]
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r1.intern()
            r0.show(r4, r1)
        L87:
            int r0 = com.adyen.threeds2.internal.ui.activity.getDeviceData.getSDKEphemeralPublicKey
            int r0 = r0 + 97
            int r0 = r0 % 128
            com.adyen.threeds2.internal.ui.activity.getDeviceData.BuildConfig = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adyen.threeds2.internal.ui.activity.getDeviceData.getDeviceData():void");
    }

    final void getSDKAppID() {
        getSDKEphemeralPublicKey = (BuildConfig + 21) % 128;
        if (AuthenticationRequestParameters()) {
            getSDKReferenceNumber(false);
            getSDKAppID getsdkappid = this.getSDKAppID;
            if (getsdkappid != null) {
                int i11 = getSDKEphemeralPublicKey + 97;
                BuildConfig = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 64 / 0;
                    if (!getsdkappid.isAdded()) {
                        return;
                    }
                } else if (!getsdkappid.isAdded()) {
                    return;
                }
                int i13 = BuildConfig + 29;
                getSDKEphemeralPublicKey = i13 % 128;
                if (i13 % 2 != 0) {
                    this.getSDKAppID.dismiss();
                    this.getSDKAppID = null;
                } else {
                    this.getSDKAppID.dismiss();
                    this.getSDKAppID = null;
                    int i14 = 81 / 0;
                }
            }
        }
    }

    final void AuthenticationRequestParameters(getSDKTransactionID getsdktransactionid) throws Throwable {
        getSDKAppID();
        int i11 = AnonymousClass3.getDeviceData[getsdktransactionid.getDeviceData().ordinal()];
        if (i11 == 1) {
            getSDKEphemeralPublicKey getsdkephemeralpublickey = new getSDKEphemeralPublicKey(this.getSDKTransactionID);
            getSDKTransactionID(new Object[]{this, getsdkephemeralpublickey}, 466406157, -466406156, System.identityHashCode(this));
            getSDKEphemeralPublicKey.AuthenticationRequestParameters(new Object[]{getsdkephemeralpublickey, (ChallengeResultKt) getsdktransactionid}, -1730254345, 1730254347, System.identityHashCode(getsdkephemeralpublickey));
            int i12 = BuildConfig + 37;
            getSDKEphemeralPublicKey = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
            return;
        }
        if (i11 == 2 || i11 == 3) {
            ChallengeResultCancelled challengeResultCancelled = new ChallengeResultCancelled(this.getSDKTransactionID);
            getSDKTransactionID(new Object[]{this, challengeResultCancelled}, 466406157, -466406156, System.identityHashCode(this));
            challengeResultCancelled.getSDKAppID((getAdditionalDetails) getsdktransactionid);
        } else if (i11 == 4) {
            atd.at.getSDKAppID getsdkappid = new atd.at.getSDKAppID(this.getSDKTransactionID);
            getSDKTransactionID(new Object[]{this, getsdkappid}, 466406157, -466406156, System.identityHashCode(this));
            atd.at.getSDKAppID.getDeviceData(new Object[]{getsdkappid, (ChallengeResultTimeout) getsdktransactionid}, -1076334094, 1076334096, System.identityHashCode(getsdkappid));
        } else {
            if (i11 != 5) {
                throw AuthenticationRequestParameters.CHALLENGE_PRESENTATION_FAILURE.getSDKTransactionID();
            }
            atd.at.getSDKTransactionID getsdktransactionid2 = new atd.at.getSDKTransactionID(this.getSDKTransactionID);
            getSDKTransactionID(new Object[]{this, getsdktransactionid2}, 466406157, -466406156, System.identityHashCode(this));
            getsdktransactionid2.AuthenticationRequestParameters((ChallengeResult) getsdktransactionid);
            int i13 = BuildConfig + 79;
            getSDKEphemeralPublicKey = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }
    }

    final void getSDKTransactionID() {
        while (!this.getSDKReferenceNumber.isEmpty()) {
            BuildConfig = (getSDKEphemeralPublicKey + 109) % 128;
            AnimatorSet animatorSetPoll = this.getSDKReferenceNumber.poll();
            if (animatorSetPoll != null) {
                int i11 = BuildConfig + 79;
                getSDKEphemeralPublicKey = i11 % 128;
                if (i11 % 2 == 0) {
                    animatorSetPoll.cancel();
                    animatorSetPoll.removeAllListeners();
                    throw null;
                }
                animatorSetPoll.cancel();
                animatorSetPoll.removeAllListeners();
                BuildConfig = (getSDKEphemeralPublicKey + 107) % 128;
            }
        }
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        View view = (View) objArr[1];
        int i11 = getSDKEphemeralPublicKey + 39;
        BuildConfig = i11 % 128;
        if (i11 % 2 == 0) {
            View viewBuildConfig = getdevicedata.BuildConfig();
            if (viewBuildConfig == null) {
                getdevicedata.getSDKTransactionID.setContentView(view);
            } else if (!viewBuildConfig.equals(view)) {
                getdevicedata.getSDKTransactionID(viewBuildConfig, view);
                BuildConfig = (getSDKEphemeralPublicKey + 29) % 128;
            }
            getdevicedata.getSDKAppID(view);
            return null;
        }
        getdevicedata.BuildConfig();
        throw null;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        View view = (View) objArr[1];
        int i11 = BuildConfig + 125;
        getSDKEphemeralPublicKey = i11 % 128;
        if (i11 % 2 == 0) {
            getdevicedata.df_().removeView(view);
            int i12 = 49 / 0;
        } else {
            getdevicedata.df_().removeView(view);
        }
        BuildConfig = (getSDKEphemeralPublicKey + 97) % 128;
        return null;
    }

    private void getDeviceData(View view) {
        getSDKTransactionID(new Object[]{this, view}, 466406157, -466406156, System.identityHashCode(this));
    }

    private void getSDKAppID(@NonNull View view) {
        final View viewFindViewById = view.findViewById(com.adyen.threeds2.R.id.layout_toolbar);
        atd.aq.getSDKAppID.AuthenticationRequestParameters authenticationRequestParameters = atd.aq.getSDKAppID.getSDKAppID;
        final atd.aq.getSDKAppID deviceData = atd.aq.getSDKAppID.AuthenticationRequestParameters.getDeviceData(viewFindViewById);
        final View viewFindViewById2 = view.findViewById(com.adyen.threeds2.R.id.scrollView_content);
        final atd.aq.getSDKAppID deviceData2 = atd.aq.getSDKAppID.AuthenticationRequestParameters.getDeviceData(viewFindViewById2);
        ViewCompat.E0(view, new a0() { // from class: com.adyen.threeds2.internal.ui.activity.getDeviceData.2
            private static int BuildConfig = 1;
            private static int ChallengeResultCancelled;

            public static /* synthetic */ Object getDeviceData(Object[] objArr, int i11, int i12, int i13) {
                return getSDKReferenceNumber(objArr);
            }

            private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
                AnonymousClass2 anonymousClass2 = (AnonymousClass2) objArr[0];
                WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) objArr[2];
                int iIdentityHashCode = System.identityHashCode(anonymousClass2);
                int i11 = ~(((-1857177657) & iIdentityHashCode) | ((-1857177657) ^ iIdentityHashCode));
                int i12 = ((~i11) & 433367969) | ((-433367970) & i11);
                int i13 = i11 & 433367969;
                int i14 = (-392388643) - (~(((i13 & i12) | (i12 ^ i13)) * (-948)));
                int i15 = ~iIdentityHashCode;
                int i16 = (~((i15 & (-1713520665)) | ((-1713520665) ^ i15))) * (-948);
                int i17 = (i14 & i16) + (i16 | i14);
                int i18 = i17 & 1252124108;
                int i19 = (1252124108 | i17) & (~i18);
                int i21 = -(-(i18 << 1));
                int i22 = (i19 & i21) + (i19 | i21);
                int iIdentityHashCode2 = System.identityHashCode(anonymousClass2);
                int i23 = ~iIdentityHashCode2;
                int i24 = ((~i23) & 1067040966) | ((-1067040967) & i23) | (1067040966 & i23);
                int i25 = ((i24 | (~i24)) & (~i24)) | (-2141055448);
                int i26 = ~iIdentityHashCode2;
                int i27 = i26 & 1142188501;
                int i28 = (i26 | 1142188501) & (~i27);
                int i29 = ~((i28 & i27) | (i28 ^ i27));
                int i31 = -(-(((i25 & i29) | (i25 ^ i29)) * (-397)));
                int i32 = (-815622878) & i31;
                int i33 = -(-(i31 | (-815622878)));
                int i34 = (i32 & i33) + (i33 | i32);
                int i35 = i34 & (-404511752);
                int i36 = (i35 - (~(-(-(((-404511752) ^ i34) | i35))))) - 1;
                int i37 = (i23 & (-2141055448)) | (2141055447 & iIdentityHashCode2);
                int i38 = iIdentityHashCode2 & (-2141055448);
                int i39 = (i38 & i37) | (i37 ^ i38);
                int i41 = i39 & 68174020;
                int i42 = (i39 | 68174020) & (~i41);
                int i43 = ((i42 & i41) | (i42 ^ i41)) * 397;
                int i44 = ((i36 ^ i43) | (i36 & i43)) << 1;
                int i45 = -((i43 & (~i36)) | ((~i43) & i36));
                if (i22 <= ((i44 | i45) << 1) - (i45 ^ i44)) {
                    int iH = WindowInsetsCompat.n.h();
                    int iB = WindowInsetsCompat.n.b();
                    int i46 = (iH & iB) | ((~iB) & iH) | ((~iH) & iB);
                    int iC = WindowInsetsCompat.n.c();
                    int i47 = i46 & iC;
                    int i48 = (i46 | iC) & (~i47);
                    windowInsetsCompat.f((i48 & i47) | (i48 ^ i47));
                    View view2 = viewFindViewById;
                    throw null;
                }
                int iH2 = WindowInsetsCompat.n.h();
                int iB2 = WindowInsetsCompat.n.b();
                int i49 = (iH2 & iB2) | ((~iB2) & iH2) | ((~iH2) & iB2);
                int iC2 = WindowInsetsCompat.n.c();
                int i51 = i49 & iC2;
                int i52 = (i49 | iC2) & (~i51);
                e eVarF = windowInsetsCompat.f((i52 & i51) | (i52 ^ i51));
                View view3 = viewFindViewById;
                if (view3 != null) {
                    int deviceData3 = deviceData.getDeviceData();
                    int i53 = -(-eVarF.f84924a);
                    int i54 = (deviceData3 & i53) + (deviceData3 | i53);
                    int sDKAppID = deviceData.getSDKAppID();
                    int i55 = eVarF.f84925b;
                    int iIdentityHashCode3 = System.identityHashCode(anonymousClass2);
                    int i56 = i55 * EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE;
                    int i57 = -(-(sDKAppID * (-301)));
                    int i58 = i56 & i57;
                    int i59 = (i56 | i57) & (~i58);
                    int i61 = -(-(i58 << 1));
                    int i62 = ((i59 | i61) << 1) - (i59 ^ i61);
                    int i63 = ~i55;
                    int i64 = ((~i55) | i55) & i63;
                    int i65 = ~iIdentityHashCode3;
                    int i66 = ((~i65) & i64) | ((~i64) & i65);
                    int i67 = i64 & i65;
                    int i68 = (i66 & i67) | (i66 ^ i67);
                    int i69 = i68 ^ sDKAppID;
                    int i71 = ~sDKAppID;
                    int i72 = i68 & sDKAppID;
                    int i73 = ~((i69 ^ i72) | (i72 & i69));
                    int i74 = i55 ^ sDKAppID;
                    int i75 = i55 & sDKAppID;
                    int i76 = (i74 ^ i75) | (i74 & i75);
                    int i77 = ((~i76) & iIdentityHashCode3) | (i65 & i76);
                    int i78 = i76 & iIdentityHashCode3;
                    int i79 = ~((i78 & i77) | (i77 ^ i78));
                    int i81 = i73 & i79;
                    int i82 = (i73 | i79) & (~i81);
                    int i83 = -(-(((i82 & i81) | (i82 ^ i81)) * (-302)));
                    int i84 = i62 & i83;
                    int i85 = (i83 ^ i62) | i84;
                    int i86 = ((i84 | i85) << 1) - (i85 ^ i84);
                    int i87 = i63 & sDKAppID;
                    int i88 = (~i87) & (i63 | sDKAppID);
                    int i89 = (i87 & i88) | (i88 ^ i87);
                    int i91 = (~((i89 & iIdentityHashCode3) | (i89 ^ iIdentityHashCode3))) * (-604);
                    int i92 = i86 ^ i91;
                    int i93 = ((((i91 & i86) | i92) << 1) - (~(-i92))) - 1;
                    int i94 = (~sDKAppID) & (i71 | sDKAppID);
                    int i95 = i94 & i55;
                    int i96 = (i94 | i55) & (~i95);
                    int i97 = ~((i96 & i95) | (i96 ^ i95));
                    int i98 = sDKAppID & iIdentityHashCode3;
                    int i99 = (sDKAppID | iIdentityHashCode3) & (~i98);
                    int i100 = ~((i98 & i99) | (i99 ^ i98));
                    int i101 = i97 & i100;
                    int i102 = (i93 - (~((((i97 | i100) & (~i101)) | i101) * EnumC4419g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_VALUE))) - 1;
                    atd.aq.getSDKAppID getsdkappid = deviceData;
                    int iIntValue = ((Integer) atd.aq.getSDKAppID.getDeviceData(new Object[]{getsdkappid}, 2040244595, -2040244595, System.identityHashCode(getsdkappid))).intValue();
                    int i103 = -(~eVarF.f84926c);
                    view3.setPadding(i54, i102, ((iIntValue & i103) + (iIntValue | i103)) - 1, deviceData.getSDKTransactionID());
                    int i104 = BuildConfig;
                    int i105 = i104 & 107;
                    int i106 = (i104 | 107) & (~i105);
                    int i107 = i105 << 1;
                    ChallengeResultCancelled = (((i106 | i107) << 1) - (i106 ^ i107)) % 128;
                }
                View view4 = viewFindViewById2;
                if (view4 != null) {
                    int i108 = BuildConfig;
                    ChallengeResultCancelled = ((-2) - ((((i108 | 46) << 1) - (i108 ^ 46)) ^ (-1))) % 128;
                    int deviceData4 = deviceData2.getDeviceData();
                    int i109 = eVarF.f84924a;
                    int iIdentityHashCode4 = System.identityHashCode(anonymousClass2);
                    int i110 = i109 * (-1975);
                    int i111 = deviceData4 * 989;
                    int i112 = i110 & i111;
                    int i113 = -(-((i110 ^ i111) | i112));
                    int i114 = (i112 ^ i113) + ((i113 & i112) << 1);
                    int i115 = ~i109;
                    int i116 = ~i109;
                    int i117 = i116 | i109;
                    int i118 = i115 & i117;
                    int i119 = ~((i118 & deviceData4) | (i118 ^ deviceData4));
                    int i120 = iIdentityHashCode4 & i119;
                    int i121 = (i119 | iIdentityHashCode4) & (~i120);
                    int i122 = ((i121 & i120) | (i121 ^ i120)) * 988;
                    int i123 = (((~i122) & i114) | ((~i114) & i122)) + ((i114 & i122) << 1);
                    int i124 = ~deviceData4;
                    int i125 = (i116 & i124) | ((~i124) & i109);
                    int i126 = i124 & i109;
                    int i127 = (i125 & i126) | (i125 ^ i126);
                    int i128 = (i127 | (~i127)) & (~i127);
                    int i129 = ~(i109 | (~iIdentityHashCode4));
                    int i130 = ((i129 & i128) | (i128 ^ i129)) * (-1976);
                    int i131 = i123 & i130;
                    int i132 = (i130 | i123) & (~i131);
                    int i133 = i131 << 1;
                    int i134 = (i132 & i133) + (i132 | i133);
                    int i135 = i115 & i117;
                    int i136 = (i135 & deviceData4) | (i135 ^ deviceData4);
                    int i137 = (i136 | (~i136)) & (~i136);
                    int i138 = ((~deviceData4) | deviceData4) & i124;
                    int i139 = ~((i138 & iIdentityHashCode4) | (i138 ^ iIdentityHashCode4));
                    int i140 = ((~i139) & i137) | ((~i137) & i139);
                    int i141 = i137 & i139;
                    int i142 = (i141 & i140) | (i140 ^ i141);
                    int i143 = ~iIdentityHashCode4;
                    int i144 = i143 & deviceData4;
                    int i145 = ~(((deviceData4 | i143) & (~i144)) | i144);
                    int i146 = -(~(((i145 & i142) | (i142 ^ i145)) * 988));
                    int i147 = ((i134 ^ i146) + ((i146 & i134) << 1)) - 1;
                    int sDKAppID2 = deviceData2.getSDKAppID();
                    atd.aq.getSDKAppID getsdkappid2 = deviceData2;
                    int iIntValue2 = ((Integer) atd.aq.getSDKAppID.getDeviceData(new Object[]{getsdkappid2}, 2040244595, -2040244595, System.identityHashCode(getsdkappid2))).intValue();
                    int i148 = -(-eVarF.f84926c);
                    int i149 = iIntValue2 | i148;
                    int i150 = ((i149 << 1) - (~(-((~(iIntValue2 & i148)) & i149)))) - 1;
                    int sDKTransactionID = deviceData2.getSDKTransactionID();
                    int i151 = eVarF.f84927d;
                    view4.setPadding(i147, sDKAppID2, i150, (sDKTransactionID & i151) + (i151 | sDKTransactionID));
                    System.identityHashCode(anonymousClass2);
                    System.identityHashCode(anonymousClass2);
                }
                int iIdentityHashCode5 = System.identityHashCode(anonymousClass2);
                int i152 = ~iIdentityHashCode5;
                int i153 = ((-443947649) & i152) | (iIdentityHashCode5 & 443947648) | ((-443947649) & iIdentityHashCode5);
                int i154 = i153 & (-1268066277);
                int i155 = (i153 | (-1268066277)) & (~i154);
                int i156 = (-2144545062) - (~(-(~(-(-(((i155 & i154) | (i155 ^ i154)) * (-627)))))));
                int i157 = (443947648 ^ iIdentityHashCode5) | (443947648 & iIdentityHashCode5);
                int i158 = (i157 | (~i157)) & (~i157);
                int i159 = 1268066276 & i158;
                int i160 = (i158 | 1268066276) & (~i159);
                int i161 = -(-(((i160 & i159) | (i160 ^ i159)) * (-627)));
                int i162 = (i156 & i161) + (i161 | i156);
                int i163 = (i152 & 443947648) | ((~i152) & (-443947649));
                int i164 = i152 & (-443947649);
                int i165 = ~((i164 & i163) | (i163 ^ i164));
                int i166 = ~((iIdentityHashCode5 & 1268066276) | (1268066276 ^ iIdentityHashCode5));
                int i167 = ((~i166) & i165) | ((~i165) & i166);
                int i168 = i166 & i165;
                int i169 = ((i168 & i167) | (i167 ^ i168)) * 627;
                int i170 = ((~i169) & i162) | ((~i162) & i169);
                int i171 = (i169 & i162) << 1;
                int i172 = (i170 ^ i171) + ((i171 & i170) << 1);
                int iIdentityHashCode6 = System.identityHashCode(anonymousClass2);
                int i173 = ~iIdentityHashCode6;
                int i174 = ~iIdentityHashCode6;
                int i175 = (iIdentityHashCode6 | i174) & i173;
                int i176 = -(~(-(-(((i175 & (-1409892714)) | ((-1409892714) ^ i175)) * 184))));
                int i177 = (-2) - (((199047405 ^ i176) + ((i176 & 199047405) << 1)) ^ (-1));
                int i178 = i174 & 677809814;
                int i179 = (677809814 | i174) & (~i178);
                int i180 = (i179 & i178) | (i179 ^ i178);
                int i181 = (i180 | (~i180)) & (~i180);
                int i182 = 677775494 & i181;
                int i183 = ((i181 | 677775494) & (~i182)) | i182;
                int i184 = i183 & (-2087702528);
                int i185 = -(-((((i183 | (-2087702528)) & (~i184)) | i184) * 184));
                int i186 = ((i177 ^ i185) | (i177 & i185)) << 1;
                int i187 = -(((~i177) & i185) | ((~i185) & i177));
                if (i172 <= ((i186 | i187) << 1) - (i187 ^ i186)) {
                    int i188 = 73 / 0;
                }
                return windowInsetsCompat;
            }

            @Override // androidx.core.view.a0
            @NonNull
            public final WindowInsetsCompat onApplyWindowInsets(@NonNull View view2, @NonNull WindowInsetsCompat windowInsetsCompat) {
                return (WindowInsetsCompat) getDeviceData(new Object[]{this, view2, windowInsetsCompat}, 1398260010, -1398260010, System.identityHashCode(this));
            }
        });
        view.requestApplyInsets();
        getSDKEphemeralPublicKey = (BuildConfig + 119) % 128;
    }

    final atd.at.AuthenticationRequestParameters getSDKReferenceNumber() {
        View viewChallengeResultCancelled = ChallengeResultCancelled();
        if (!(viewChallengeResultCancelled instanceof atd.at.AuthenticationRequestParameters)) {
            return null;
        }
        int i11 = getSDKEphemeralPublicKey + 37;
        int i12 = i11 % 128;
        BuildConfig = i12;
        atd.at.AuthenticationRequestParameters authenticationRequestParameters = (atd.at.AuthenticationRequestParameters) viewChallengeResultCancelled;
        if (i11 % 2 != 0) {
            throw null;
        }
        getSDKEphemeralPublicKey = (i12 + 45) % 128;
        return authenticationRequestParameters;
    }

    private void getSDKReferenceNumber(View view) {
        ViewGroup viewGroupDf_ = df_();
        if (view instanceof atd.at.getSDKReferenceNumber) {
            int i11 = BuildConfig + 3;
            getSDKEphemeralPublicKey = i11 % 128;
            if (i11 % 2 != 0) {
                viewGroupDf_.addView(view, viewGroupDf_.getChildCount());
                return;
            } else {
                viewGroupDf_.addView(view, viewGroupDf_.getChildCount());
                throw null;
            }
        }
        viewGroupDf_.addView(view, 0);
        BuildConfig = (getSDKEphemeralPublicKey + 63) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x003b  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x004f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027 A[PHI: r1
      0x0027: PHI (r1v3 atd.at.AuthenticationRequestParameters) = (r1v2 atd.at.AuthenticationRequestParameters), (r1v7 atd.at.AuthenticationRequestParameters) binds: [B:8:0x0025, B:5:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws Throwable {
        atd.at.AuthenticationRequestParameters sDKReferenceNumber;
        int i11;
        getDeviceData getdevicedata = (getDeviceData) objArr[0];
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[1];
        int i12 = BuildConfig + 67;
        getSDKEphemeralPublicKey = i12 % 128;
        if (i12 % 2 == 0) {
            sDKReferenceNumber = getdevicedata.getSDKReferenceNumber();
            int i13 = 51 / 0;
            if (sDKReferenceNumber != null) {
                if (!(sDKReferenceNumber instanceof atd.at.getSDKReferenceNumber)) {
                    i11 = AnonymousClass3.getDeviceData[getsdktransactionid.getDeviceData().ordinal()];
                    if (i11 != 4) {
                        if (i11 == 5) {
                            ((atd.at.getSDKTransactionID) sDKReferenceNumber).getDeviceData((ChallengeResult) getsdktransactionid);
                            getSDKEphemeralPublicKey = (BuildConfig + 71) % 128;
                        }
                        return null;
                    }
                    atd.at.getSDKAppID getsdkappid = (atd.at.getSDKAppID) sDKReferenceNumber;
                    atd.at.getSDKAppID.getDeviceData(new Object[]{getsdkappid, (ChallengeResultTimeout) getsdktransactionid}, 337895199, -337895196, System.identityHashCode(getsdkappid));
                }
            }
        } else {
            sDKReferenceNumber = getdevicedata.getSDKReferenceNumber();
            if (sDKReferenceNumber != null) {
                if (!(sDKReferenceNumber instanceof atd.at.getSDKReferenceNumber)) {
                    i11 = AnonymousClass3.getDeviceData[getsdktransactionid.getDeviceData().ordinal()];
                    if (i11 != 4) {
                        if (i11 == 5) {
                            ((atd.at.getSDKTransactionID) sDKReferenceNumber).getDeviceData((ChallengeResult) getsdktransactionid);
                            getSDKEphemeralPublicKey = (BuildConfig + 71) % 128;
                        }
                        return null;
                    }
                    atd.at.getSDKAppID getsdkappid2 = (atd.at.getSDKAppID) sDKReferenceNumber;
                    atd.at.getSDKAppID.getDeviceData(new Object[]{getsdkappid2, (ChallengeResultTimeout) getsdktransactionid}, 337895199, -337895196, System.identityHashCode(getsdkappid2));
                }
            }
        }
        return null;
    }

    private void getSDKTransactionID(final View view, final View view2) {
        View viewFindViewById = view.findViewById(com.adyen.threeds2.R.id.scrollView_content);
        View viewFindViewById2 = view2.findViewById(com.adyen.threeds2.R.id.scrollView_content);
        viewFindViewById2.setAlpha(BitmapDescriptorFactory.HUE_RED);
        getSDKReferenceNumber(view2);
        Property property = View.ALPHA;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewFindViewById, (Property<View, Float>) property, 1.0f, BitmapDescriptorFactory.HUE_RED);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(viewFindViewById2, (Property<View, Float>) property, BitmapDescriptorFactory.HUE_RED, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.adyen.threeds2.internal.ui.activity.getDeviceData.5
            private static int AuthenticationRequestParameters = 1;
            private static int getSDKReferenceNumber;

            private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
                AnonymousClass5 anonymousClass5 = (AnonymousClass5) objArr[0];
                Animator animator = (Animator) objArr[1];
                getSDKReferenceNumber = (AuthenticationRequestParameters + 89) % 128;
                animator.removeAllListeners();
                getDeviceData getdevicedata = getDeviceData.this;
                getDeviceData.getSDKTransactionID(new Object[]{getdevicedata, view}, 539135889, -539135887, System.identityHashCode(getdevicedata));
                getDeviceData.this.ChallengeResult();
                if (getDeviceData.this.getSDKReferenceNumber.isEmpty()) {
                    int i11 = getSDKReferenceNumber;
                    int i12 = i11 & 77;
                    int i13 = ((((i11 ^ 77) | i12) << 1) - ((i11 | 77) & (~i12))) % 128;
                    AuthenticationRequestParameters = i13;
                    if (!(view2 instanceof atd.at.getSDKReferenceNumber)) {
                        int i14 = i13 + 125;
                        getSDKReferenceNumber = i14 % 128;
                        if (i14 % 2 != 0) {
                            atd.ax.getSDKReferenceNumber getsdkreferencenumber = getDeviceData.this.getDeviceData;
                            int i15 = 66 / 0;
                        } else {
                            atd.ax.getSDKReferenceNumber getsdkreferencenumber2 = getDeviceData.this.getDeviceData;
                        }
                        System.identityHashCode(anonymousClass5);
                        System.identityHashCode(anonymousClass5);
                    }
                }
                int i16 = getSDKReferenceNumber;
                int i17 = i16 | 45;
                int i18 = i17 << 1;
                int i19 = -((~(i16 & 45)) & i17);
                AuthenticationRequestParameters = ((i18 ^ i19) + ((i19 & i18) << 1)) % 128;
                return null;
            }

            public static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr, int i11, int i12, int i13) {
                return AuthenticationRequestParameters(objArr);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                getSDKReferenceNumber(new Object[]{this, animator}, -1435765579, 1435765579, System.identityHashCode(this));
            }
        });
        dg_(animatorSet);
        int i11 = getSDKEphemeralPublicKey + 103;
        BuildConfig = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    final void getSDKTransactionID(View view) {
        getSDKTransactionID(new Object[]{this, view}, 539135889, -539135887, System.identityHashCode(this));
    }

    final void getSDKTransactionID(getSDKTransactionID getsdktransactionid) {
        getSDKTransactionID(new Object[]{this, getsdktransactionid}, -1518800562, 1518800562, System.identityHashCode(this));
    }
}
