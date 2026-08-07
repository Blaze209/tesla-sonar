package atd.av;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import atd.az.getMessageVersion;
import com.adyen.threeds2.R;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.plaid.internal.EnumC4419g;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKTransactionID extends LinearLayout implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener, View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {
    private static int ChallengeResultCancelled = 0;
    private static int getMessageVersion = 1;
    private final TextView AuthenticationRequestParameters;
    private EnumC0262getSDKTransactionID BuildConfig;
    private float ChallengeResult;
    private final View getDeviceData;
    private final ImageView getSDKAppID;
    private int getSDKEphemeralPublicKey;
    private final getDeviceData getSDKReferenceNumber;
    private final TextView getSDKTransactionID;

    /* JADX INFO: renamed from: atd.av.getSDKTransactionID$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        private static int AuthenticationRequestParameters = 1;
        private static int getDeviceData;
        static final /* synthetic */ int[] getSDKReferenceNumber;

        static {
            int[] iArr = new int[EnumC0262getSDKTransactionID.values().length];
            getSDKReferenceNumber = iArr;
            try {
                iArr[EnumC0262getSDKTransactionID.EXPANDED.ordinal()] = 1;
                int i11 = AuthenticationRequestParameters;
                int i12 = i11 & 113;
                getDeviceData = ((((i11 ^ 113) | i12) << 1) - ((i11 | 113) & (~i12))) % 128;
            } catch (NoSuchFieldError unused) {
            }
            try {
                getSDKReferenceNumber[EnumC0262getSDKTransactionID.COLLAPSED.ordinal()] = 2;
                AuthenticationRequestParameters = (getDeviceData + 13) % 128;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: atd.av.getSDKTransactionID$getSDKTransactionID, reason: collision with other inner class name */
    public static final class EnumC0262getSDKTransactionID {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ EnumC0262getSDKTransactionID[] $VALUES;
        private static int AuthenticationRequestParameters;
        public static final EnumC0262getSDKTransactionID COLLAPSED;
        public static final EnumC0262getSDKTransactionID EXPANDED;
        private static int getSDKAppID;
        private static int getSDKReferenceNumber;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKReferenceNumber = 0;
            getSDKAppID = 1;
            AuthenticationRequestParameters();
            Object[] objArr = new Object[1];
            a(View.resolveSize(0, 0) + 170, false, 9 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u000f\u0007\ufff8\u0005\ufffb￼\ufffb￼", 7 - View.MeasureSpec.getMode(0), objArr);
            EXPANDED = new EnumC0262getSDKTransactionID(((String) objArr[0]).intern(), 0);
            Object[] objArr2 = new Object[1];
            a(170 - Drawable.resolveOpacity(0, 0), true, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9, "\u0003\u0006\ufffa\ufffb￼\n\u0007\ufff8\u0003", 3 - View.MeasureSpec.getSize(0), objArr2);
            COLLAPSED = new EnumC0262getSDKTransactionID(((String) objArr2[0]).intern(), 1);
            $VALUES = getSDKReferenceNumber();
            getSDKReferenceNumber = (getSDKAppID + 51) % 128;
        }

        private EnumC0262getSDKTransactionID(String str, int i11) {
            super(str, i11);
        }

        static void AuthenticationRequestParameters() {
            AuthenticationRequestParameters = 1029304840;
        }

        /* JADX WARN: Code duplicated, block: B:43:0x01b3  */
        /* JADX WARN: Code duplicated, block: B:44:0x01b4  */
        private static void a(int i11, boolean z11, int i12, String str, int i13, Object[] objArr) throws Throwable {
            int i14;
            char[] cArr;
            Throwable cause;
            int i15;
            String str2 = "";
            char[] charArray = str != null ? str.toCharArray() : str;
            getMessageVersion getmessageversion = new getMessageVersion();
            char[] cArr2 = new char[i12];
            int i16 = 0;
            getmessageversion.getDeviceData = 0;
            while (true) {
                int i17 = getmessageversion.getDeviceData;
                if (i17 >= i12) {
                    break;
                }
                $11 = ($10 + 21) % 128;
                char c11 = charArray[i17];
                getmessageversion.getSDKTransactionID = c11;
                char c12 = (char) (i11 + c11);
                cArr2[i17] = c12;
                try {
                    Object[] objArr2 = new Object[2];
                    objArr2[1] = Integer.valueOf(AuthenticationRequestParameters);
                    objArr2[i16] = Integer.valueOf(c12);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(139968170);
                    if (method != null) {
                        i15 = i16;
                    } else {
                        Class cls = (Class) atd.a.getMessageVersion.getSDKTransactionID(TextUtils.indexOf(str2, str2, i16, i16) + 1186, (char) ((-1) - TextUtils.indexOf((CharSequence) str2, '0', i16)), 47 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                        byte b11 = (byte) i16;
                        byte b12 = (byte) (b11 + 1);
                        i15 = i16;
                        Object[] objArr3 = new Object[1];
                        b(b11, b12, (byte) (b12 - 1), objArr3);
                        String str3 = (String) objArr3[i15];
                        Class cls2 = Integer.TYPE;
                        method = cls.getMethod(str3, cls2, cls2);
                        map.put(139968170, method);
                    }
                    cArr2[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    Object[] objArr4 = new Object[2];
                    objArr4[1] = getmessageversion;
                    objArr4[i15] = getmessageversion;
                    Object method2 = map.get(-1388326022);
                    if (method2 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1722 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 48634), 24 - ((Process.getThreadPriority(i15) + 20) >> 6));
                        int i18 = i15;
                        byte b13 = (byte) i18;
                        byte b14 = b13;
                        Object[] objArr5 = new Object[1];
                        b(b13, b14, b14, objArr5);
                        method2 = cls3.getMethod((String) objArr5[i18], Object.class, Object.class);
                        map.put(-1388326022, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    str2 = str2;
                    charArray = charArray;
                    i16 = 0;
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
            if (i13 > 0) {
                getmessageversion.getSDKReferenceNumber = i13;
                char[] cArr3 = new char[i12];
                System.arraycopy(cArr2, 0, cArr3, 0, i12);
                int i19 = getmessageversion.getSDKReferenceNumber;
                System.arraycopy(cArr3, 0, cArr2, i12 - i19, i19);
                int i21 = getmessageversion.getSDKReferenceNumber;
                System.arraycopy(cArr3, i21, cArr2, 0, i12 - i21);
                $11 = ($10 + 113) % 128;
            }
            if (z11) {
                int i22 = $10 + 83;
                $11 = i22 % 128;
                if (i22 % 2 == 0) {
                    cArr = new char[i12];
                    i14 = 0;
                } else {
                    i14 = 0;
                    cArr = new char[i12];
                }
                getmessageversion.getDeviceData = i14;
                while (true) {
                    int i23 = getmessageversion.getDeviceData;
                    if (i23 >= i12) {
                        break;
                    }
                    cArr[i23] = cArr2[(i12 - i23) - 1];
                    Object[] objArr6 = {getmessageversion, getmessageversion};
                    Map map2 = atd.a.getMessageVersion.timedout;
                    Object method3 = map2.get(-1388326022);
                    if (method3 == null) {
                        Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1720 - ExpandableListView.getPackedPositionChild(0L), (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 48633), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24);
                        byte b15 = (byte) 0;
                        byte b16 = b15;
                        Object[] objArr7 = new Object[1];
                        b(b15, b16, b16, objArr7);
                        method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                        map2.put(-1388326022, method3);
                    }
                    ((Method) method3).invoke(null, objArr6);
                }
                $10 = ($11 + 5) % 128;
                cArr2 = cArr;
            }
            objArr[0] = new String(cArr2);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0029  */
        /* JADX WARN: Code duplicated, block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(short r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 2
                int r9 = r9 + 1
                int r7 = r7 * 3
                int r7 = 3 - r7
                int r8 = r8 * 2
                int r8 = r8 + 66
                byte[] r0 = atd.av.getSDKTransactionID.EnumC0262getSDKTransactionID.$$a
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2e
            L17:
                r3 = r2
            L18:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r6
            L2e:
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r8
                r8 = r7
                r7 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.av.getSDKTransactionID.EnumC0262getSDKTransactionID.b(short, short, int, java.lang.Object[]):void");
        }

        private static /* synthetic */ EnumC0262getSDKTransactionID[] getSDKReferenceNumber() {
            EnumC0262getSDKTransactionID[] enumC0262getSDKTransactionIDArr;
            int i11 = getSDKReferenceNumber + 59;
            int i12 = i11 % 128;
            getSDKAppID = i12;
            if (i11 % 2 == 0) {
                enumC0262getSDKTransactionIDArr = new EnumC0262getSDKTransactionID[3];
                enumC0262getSDKTransactionIDArr[0] = EXPANDED;
                enumC0262getSDKTransactionIDArr[0] = COLLAPSED;
            } else {
                enumC0262getSDKTransactionIDArr = new EnumC0262getSDKTransactionID[]{EXPANDED, COLLAPSED};
            }
            getSDKReferenceNumber = (i12 + 47) % 128;
            return enumC0262getSDKTransactionIDArr;
        }

        static void init$0() {
            $$a = new byte[]{92, -30, 107, -94};
            $$b = 94;
        }

        public static EnumC0262getSDKTransactionID valueOf(String str) {
            int i11 = getSDKAppID + 109;
            getSDKReferenceNumber = i11 % 128;
            int i12 = i11 % 2;
            EnumC0262getSDKTransactionID enumC0262getSDKTransactionID = (EnumC0262getSDKTransactionID) Enum.valueOf(EnumC0262getSDKTransactionID.class, str);
            if (i12 != 0) {
                int i13 = 69 / 0;
            }
            return enumC0262getSDKTransactionID;
        }

        public static EnumC0262getSDKTransactionID[] values() {
            EnumC0262getSDKTransactionID[] enumC0262getSDKTransactionIDArr;
            int i11 = getSDKReferenceNumber + 117;
            getSDKAppID = i11 % 128;
            if (i11 % 2 == 0) {
                enumC0262getSDKTransactionIDArr = (EnumC0262getSDKTransactionID[]) $VALUES.clone();
                int i12 = 24 / 0;
            } else {
                enumC0262getSDKTransactionIDArr = (EnumC0262getSDKTransactionID[]) $VALUES.clone();
            }
            getSDKReferenceNumber = (getSDKAppID + 35) % 128;
            return enumC0262getSDKTransactionIDArr;
        }
    }

    public getSDKTransactionID(Context context) {
        this(context, null);
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        ValueAnimator valueAnimator = (ValueAnimator) objArr[1];
        int i11 = getMessageVersion;
        ChallengeResultCancelled = (((((i11 ^ 115) | (i11 & 115)) << 1) - (~(-(((~i11) & 115) | (i11 & (-116)))))) - 1) % 128;
        getsdktransactionid.getSDKTransactionID.setHeight(((Integer) valueAnimator.getAnimatedValue()).intValue());
        int i12 = getMessageVersion;
        int i13 = (((i12 & (-42)) | ((~i12) & 41)) - (~((i12 & 41) << 1))) - 1;
        ChallengeResultCancelled = i13 % 128;
        if (i13 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object BuildConfig(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        int i11 = getMessageVersion;
        int i12 = i11 + 24;
        ChallengeResultCancelled = ((i12 ^ (-1)) + (i12 << 1)) % 128;
        EnumC0262getSDKTransactionID enumC0262getSDKTransactionID = getsdktransactionid.BuildConfig;
        int i13 = i11 & 57;
        int i14 = -(-((i11 ^ 57) | i13));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        ChallengeResultCancelled = i15 % 128;
        if (i15 % 2 == 0) {
            return enumC0262getSDKTransactionID;
        }
        throw null;
    }

    private static /* synthetic */ Object ChallengeResult(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i11 = getMessageVersion;
        int i12 = ((i11 ^ 86) + ((i11 & 86) << 1)) - 1;
        ChallengeResultCancelled = i12 % 128;
        if (i12 % 2 != 0) {
            EnumC0262getSDKTransactionID enumC0262getSDKTransactionID = getsdktransactionid.BuildConfig;
            EnumC0262getSDKTransactionID enumC0262getSDKTransactionID2 = EnumC0262getSDKTransactionID.EXPANDED;
            throw null;
        }
        EnumC0262getSDKTransactionID enumC0262getSDKTransactionID3 = getsdktransactionid.BuildConfig;
        EnumC0262getSDKTransactionID enumC0262getSDKTransactionID4 = EnumC0262getSDKTransactionID.COLLAPSED;
        if (enumC0262getSDKTransactionID3 == enumC0262getSDKTransactionID4) {
            int i13 = ChallengeResultCancelled;
            int i14 = i13 & 73;
            int i15 = -(-((i13 ^ 73) | i14));
            getMessageVersion = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
            return null;
        }
        if (!zBooleanValue) {
            getsdktransactionid.getSDKAppID.setRotation(BitmapDescriptorFactory.HUE_RED);
            getsdktransactionid.getSDKTransactionID.setHeight(0);
            getsdktransactionid.getSDKTransactionID.setAlpha(BitmapDescriptorFactory.HUE_RED);
            getSDKAppID(new Object[]{getsdktransactionid, enumC0262getSDKTransactionID4}, -1518695256, 1518695258, System.identityHashCode(getsdktransactionid));
            int i16 = getMessageVersion;
            int i17 = ((i16 ^ 85) | (i16 & 85)) << 1;
            int i18 = -(((~i16) & 85) | (i16 & (-86)));
            int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
            ChallengeResultCancelled = i19 % 128;
            if (i19 % 2 != 0) {
                int i21 = 16 / 0;
            }
            return null;
        }
        int i22 = ChallengeResultCancelled;
        int i23 = (i22 & 14) + (i22 | 14);
        getMessageVersion = ((i23 ^ (-1)) + (i23 << 1)) % 128;
        getsdktransactionid.getSDKAppID.animate().rotation(BitmapDescriptorFactory.HUE_RED).start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getsdktransactionid.getSDKTransactionID.getHeight(), 0);
        valueAnimatorOfInt.addUpdateListener(getsdktransactionid);
        valueAnimatorOfInt.addListener(getsdktransactionid);
        valueAnimatorOfInt.start();
        getsdktransactionid.getSDKTransactionID.animate().alpha(BitmapDescriptorFactory.HUE_RED).start();
        int i24 = ChallengeResultCancelled;
        int i25 = i24 & 61;
        int i26 = i25 + ((i24 ^ 61) | i25);
        getMessageVersion = i26 % 128;
        if (i26 % 2 == 0) {
            int i27 = 35 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object ChallengeResultCancelled(Object[] objArr) {
        int i11 = ChallengeResultCancelled;
        int i12 = i11 & 47;
        int i13 = ((i11 ^ 47) | i12) << 1;
        int i14 = -((i11 | 47) & (~i12));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        getMessageVersion = i15 % 128;
        if (i15 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getDeviceData(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        int i11 = ChallengeResultCancelled;
        int i12 = i11 & 121;
        getMessageVersion = (i12 + ((i11 ^ 121) | i12)) % 128;
        getsdktransactionid.getSDKTransactionID.getViewTreeObserver().removeOnGlobalLayoutListener(getsdktransactionid);
        getsdktransactionid.ChallengeResult = getsdktransactionid.getSDKTransactionID.getAlpha();
        getsdktransactionid.getSDKEphemeralPublicKey = getsdktransactionid.getSDKTransactionID.getMeasuredHeight();
        getSDKAppID(new Object[]{getsdktransactionid, Boolean.FALSE}, 2071453193, -2071453190, System.identityHashCode(getsdktransactionid));
        int i13 = ChallengeResultCancelled + 121;
        getMessageVersion = i13 % 128;
        if (i13 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getMessageVersion(Object[] objArr) {
        EnumC0262getSDKTransactionID enumC0262getSDKTransactionID;
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        int i11 = ChallengeResultCancelled;
        int i12 = (i11 & 91) + (i11 | 91);
        getMessageVersion = i12 % 128;
        if (i12 % 2 == 0) {
            EnumC0262getSDKTransactionID enumC0262getSDKTransactionID2 = getsdktransactionid.BuildConfig;
            EnumC0262getSDKTransactionID enumC0262getSDKTransactionID3 = EnumC0262getSDKTransactionID.EXPANDED;
            throw null;
        }
        EnumC0262getSDKTransactionID enumC0262getSDKTransactionID4 = getsdktransactionid.BuildConfig;
        EnumC0262getSDKTransactionID enumC0262getSDKTransactionID5 = EnumC0262getSDKTransactionID.COLLAPSED;
        if (enumC0262getSDKTransactionID4 == enumC0262getSDKTransactionID5) {
            enumC0262getSDKTransactionID = EnumC0262getSDKTransactionID.EXPANDED;
            int i13 = ChallengeResultCancelled;
            int i14 = i13 & 71;
            int i15 = i13 | 71;
            getMessageVersion = ((i14 ^ i15) + ((i15 & i14) << 1)) % 128;
        } else {
            int i16 = getMessageVersion;
            int i17 = i16 & 121;
            int i18 = ((i16 ^ 121) | i17) << 1;
            int i19 = -((i16 | 121) & (~i17));
            ChallengeResultCancelled = ((i18 ^ i19) + ((i19 & i18) << 1)) % 128;
            enumC0262getSDKTransactionID = enumC0262getSDKTransactionID5;
        }
        getSDKAppID(new Object[]{getsdktransactionid, enumC0262getSDKTransactionID}, -1518695256, 1518695258, System.identityHashCode(getsdktransactionid));
        getsdktransactionid.getDeviceData.setClickable(true);
        if (getsdktransactionid.BuildConfig != enumC0262getSDKTransactionID5) {
            getsdktransactionid.getSDKTransactionID.sendAccessibilityEvent(8);
            int i21 = getMessageVersion;
            int i22 = i21 & 55;
            int i23 = i21 | 55;
            ChallengeResultCancelled = ((i22 & i23) + (i23 | i22)) % 128;
            return null;
        }
        int i24 = getMessageVersion;
        int i25 = i24 & 47;
        ChallengeResultCancelled = ((i25 - (~(-(-((i24 ^ 47) | i25))))) - 1) % 128;
        getsdktransactionid.getDeviceData.sendAccessibilityEvent(8);
        int i26 = getMessageVersion;
        ChallengeResultCancelled = ((-2) - ((((i26 | 50) << 1) - (i26 ^ 50)) ^ (-1))) % 128;
        return null;
    }

    public static /* synthetic */ Object getSDKAppID(Object[] objArr, int i11, int i12, int i13) {
        int i14 = ~i11;
        int i15 = ~i12;
        int i16 = ~i13;
        switch ((i11 * (-563)) + (i12 * 565) + (((~(i15 | i16)) | i14 | (~(i12 | i13))) * (-564)) + ((~(i13 | i14 | i12)) * 1128) + (((~(i11 | i12)) | (~(i14 | i16))) * 564)) {
            case 1:
                return getSDKTransactionID(objArr);
            case 2:
                getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
                EnumC0262getSDKTransactionID enumC0262getSDKTransactionID = (EnumC0262getSDKTransactionID) objArr[1];
                int i17 = (getMessageVersion + 63) % 128;
                ChallengeResultCancelled = i17;
                getsdktransactionid.BuildConfig = enumC0262getSDKTransactionID;
                getMessageVersion = (((i17 & 126) + (i17 | 126)) - 1) % 128;
                return null;
            case 3:
                return getSDKAppID(objArr);
            case 4:
                return getDeviceData(objArr);
            case 5:
                return AuthenticationRequestParameters(objArr);
            case 6:
                return ChallengeResult(objArr);
            case 7:
                return BuildConfig(objArr);
            case 8:
                return ChallengeResultCancelled(objArr);
            case 9:
                getSDKTransactionID getsdktransactionid2 = (getSDKTransactionID) objArr[0];
                int i18 = ChallengeResultCancelled;
                int i19 = ((i18 ^ 50) + ((i18 & 50) << 1)) - 1;
                getMessageVersion = i19 % 128;
                if (i19 % 2 == 0) {
                    getSDKAppID(new Object[]{getsdktransactionid2, Boolean.TRUE}, 2071453193, -2071453190, System.identityHashCode(getsdktransactionid2));
                } else {
                    getSDKAppID(new Object[]{getsdktransactionid2, Boolean.TRUE}, 2071453193, -2071453190, System.identityHashCode(getsdktransactionid2));
                }
                return null;
            case 10:
                return getSDKEphemeralPublicKey(objArr);
            case 11:
                return getMessageVersion(objArr);
            default:
                return getSDKReferenceNumber(objArr);
        }
    }

    private static /* synthetic */ Object getSDKEphemeralPublicKey(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        int i11 = ChallengeResultCancelled;
        getMessageVersion = ((((i11 | 79) << 1) - (~(-(((~i11) & 79) | (i11 & (-80)))))) - 1) % 128;
        getsdktransactionid.getDeviceData.setClickable(false);
        int iIdentityHashCode = System.identityHashCode(getsdktransactionid);
        int i12 = iIdentityHashCode ^ 1879581191;
        int i13 = iIdentityHashCode & 1879581191;
        int i14 = (i12 & i13) | (i12 ^ i13);
        int i15 = i14 & 232576;
        int i16 = (i14 | 232576) & (~i15);
        int i17 = ((i16 & i15) | (i16 ^ i15)) * 614;
        int i18 = ((808120433 ^ i17) - (~((i17 & 808120433) << 1))) - 1;
        int i19 = ~iIdentityHashCode;
        int i21 = ~(((-2056811032) & i19) | ((-2056811032) ^ i19));
        int i22 = i21 & 1879581191;
        int i23 = (1879581191 | i21) & (~i22);
        int i24 = (i23 & i22) | (i23 ^ i22);
        int i25 = ~iIdentityHashCode;
        int i26 = i25 | iIdentityHashCode;
        int i27 = i19 & i26;
        int i28 = i27 & 177462416;
        int i29 = -(-((i24 | (~(((i27 | 177462416) & (~i28)) | i28))) * (-1228)));
        int i31 = i18 & i29;
        int i32 = (i29 ^ i18) | i31;
        int i33 = ((i31 | i32) << 1) - (i32 ^ i31);
        int i34 = ~(((~i25) & (-177229841)) | (177229840 & i25) | ((-177229841) & i25));
        int i35 = (~iIdentityHashCode) & i26;
        int i36 = i35 & 2056811031;
        int i37 = (i35 | 2056811031) & (~i36);
        int i38 = (i37 & i36) | (i37 ^ i36);
        int i39 = i38 & 177462416;
        int i41 = (i38 | 177462416) & (~i39);
        int i42 = ~((i41 & i39) | (i41 ^ i39));
        int i43 = i34 & i42;
        int i44 = (((i42 | i34) & (~i43)) | i43) * 614;
        int i45 = (((i33 | i44) << 1) - (~(-(i44 ^ i33)))) - 1;
        int iIdentityHashCode2 = System.identityHashCode(getsdktransactionid);
        int i46 = (-1403536171) & iIdentityHashCode2;
        int i47 = ((-1403536171) | iIdentityHashCode2) & (~i46);
        int i48 = ~((i47 & i46) | (i47 ^ i46));
        int i49 = ((~i48) & 1400913922) | ((-1400913923) & i48);
        int i51 = i48 & 1400913922;
        int i52 = -(-(((i51 & i49) | (i49 ^ i51)) * (-283)));
        int i53 = (((-786244760) ^ i52) | ((-786244760) & i52)) << 1;
        int i54 = -((i52 & 786244759) | ((-786244760) & (~i52)));
        int i55 = (i53 ^ i54) + ((i54 & i53) << 1) + 2110087664;
        int i56 = (iIdentityHashCode2 & (-2622249)) | ((-2622249) ^ iIdentityHashCode2);
        int i57 = ((i56 | (~i56)) & (~i56)) * EnumC4419g.SDK_ASSET_ILLUSTRATION_CARD_VALUE;
        if (i45 > (i55 ^ i57) + ((i57 & i55) << 1)) {
            int i58 = 21 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object getSDKReferenceNumber(Object[] objArr) {
        int i11 = getMessageVersion;
        int i12 = (i11 | 29) << 1;
        int i13 = -(((~i11) & 29) | (i11 & (-30)));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        ChallengeResultCancelled = i14 % 128;
        if (i14 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getSDKTransactionID(Object[] objArr) {
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i11 = getMessageVersion + 61;
        ChallengeResultCancelled = i11 % 128;
        if (i11 % 2 != 0) {
            EnumC0262getSDKTransactionID enumC0262getSDKTransactionID = getsdktransactionid.BuildConfig;
            EnumC0262getSDKTransactionID enumC0262getSDKTransactionID2 = EnumC0262getSDKTransactionID.EXPANDED;
            throw null;
        }
        EnumC0262getSDKTransactionID enumC0262getSDKTransactionID3 = getsdktransactionid.BuildConfig;
        EnumC0262getSDKTransactionID enumC0262getSDKTransactionID4 = EnumC0262getSDKTransactionID.EXPANDED;
        if (enumC0262getSDKTransactionID3 == enumC0262getSDKTransactionID4) {
            int i12 = getMessageVersion + 44;
            ChallengeResultCancelled = ((i12 ^ (-1)) + (i12 << 1)) % 128;
            return null;
        }
        if (!zBooleanValue) {
            getsdktransactionid.getSDKAppID.setRotation(180.0f);
            getsdktransactionid.getSDKTransactionID.setHeight(getsdktransactionid.getSDKEphemeralPublicKey);
            getsdktransactionid.getSDKTransactionID.setAlpha(getsdktransactionid.ChallengeResult);
            getSDKAppID(new Object[]{getsdktransactionid, enumC0262getSDKTransactionID4}, -1518695256, 1518695258, System.identityHashCode(getsdktransactionid));
            int i13 = getMessageVersion;
            int i14 = i13 | 71;
            int i15 = (i14 << 1) - ((~(i13 & 71)) & i14);
            ChallengeResultCancelled = i15 % 128;
            if (i15 % 2 == 0) {
                return null;
            }
            throw null;
        }
        ChallengeResultCancelled = (getMessageVersion + 79) % 128;
        getsdktransactionid.getSDKAppID.animate().rotation(180.0f).start();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, getsdktransactionid.getSDKEphemeralPublicKey);
        valueAnimatorOfInt.addUpdateListener(getsdktransactionid);
        valueAnimatorOfInt.addListener(getsdktransactionid);
        valueAnimatorOfInt.start();
        getsdktransactionid.getSDKTransactionID.animate().alpha(getsdktransactionid.ChallengeResult).start();
        int i16 = getMessageVersion;
        int i17 = (i16 & 51) + (i16 | 51);
        ChallengeResultCancelled = i17 % 128;
        if (i17 % 2 != 0) {
            int i18 = 93 / 0;
        }
        return null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        getSDKAppID(new Object[]{this, animator}, 579118130, -579118130, System.identityHashCode(this));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        getSDKAppID(new Object[]{this, animator}, -384665141, 384665152, System.identityHashCode(this));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        getSDKAppID(new Object[]{this, animator}, 402983009, -402983001, System.identityHashCode(this));
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        getSDKAppID(new Object[]{this, animator}, -907343304, 907343314, System.identityHashCode(this));
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        getSDKAppID(new Object[]{this, valueAnimator}, -588442310, 588442315, System.identityHashCode(this));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        getSDKAppID(new Object[]{this, view}, 1731625584, -1731625575, System.identityHashCode(this));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getSDKAppID(new Object[]{this}, 990082987, -990082983, System.identityHashCode(this));
    }

    public final void setHeaderBackgroundColor(int i11) {
        int i12 = ChallengeResultCancelled;
        int i13 = (i12 & 33) + (i12 | 33);
        getMessageVersion = i13 % 128;
        int i14 = i13 % 2;
        Drawable background = this.getDeviceData.getBackground();
        int i15 = ChallengeResultCancelled;
        int i16 = i15 & 5;
        int i17 = ((i15 ^ 5) | i16) << 1;
        int i18 = -((i15 | 5) & (~i16));
        int i19 = ((i17 ^ i18) + ((i18 & i17) << 1)) % 128;
        getMessageVersion = i19;
        if (background instanceof RippleDrawable) {
            int i21 = (i19 & 57) + (i19 | 57);
            ChallengeResultCancelled = i21 % 128;
            if (i21 % 2 == 0) {
                ((RippleDrawable) background).setColor(ColorStateList.valueOf(i11));
                return;
            } else {
                ((RippleDrawable) background).setColor(ColorStateList.valueOf(i11));
                throw null;
            }
        }
        background.setColorFilter(i11, PorterDuff.Mode.SRC_IN);
        int i22 = ChallengeResultCancelled;
        int i23 = i22 & 119;
        int i24 = (i22 | 119) & (~i23);
        int i25 = i23 << 1;
        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
        getMessageVersion = i26 % 128;
        if (i26 % 2 == 0) {
            int i27 = 85 / 0;
        }
    }

    public final void setHorizontalDividerColor(int i11) {
        int i12 = getMessageVersion;
        int i13 = i12 & 17;
        int i14 = -(-((i12 ^ 17) | i13));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        ChallengeResultCancelled = i15 % 128;
        if (i15 % 2 == 0) {
            this.getSDKReferenceNumber.setColor(i11);
        } else {
            this.getSDKReferenceNumber.setColor(i11);
            throw null;
        }
    }

    public final void setHorizontalDividerThickness(int i11) {
        int i12 = ChallengeResultCancelled;
        int i13 = (i12 | 15) << 1;
        int i14 = -(i12 ^ 15);
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        getMessageVersion = i15 % 128;
        if (i15 % 2 != 0) {
            this.getSDKReferenceNumber.setThickness(i11);
        } else {
            this.getSDKReferenceNumber.setThickness(i11);
            throw null;
        }
    }

    public final void setInfo(String str) {
        int i11 = getMessageVersion;
        int i12 = i11 & 119;
        int i13 = ((i11 ^ 119) | i12) << 1;
        int i14 = -((i11 | 119) & (~i12));
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        ChallengeResultCancelled = i15 % 128;
        if (i15 % 2 == 0) {
            this.getSDKTransactionID.setText(str);
        } else {
            this.getSDKTransactionID.setText(str);
            throw null;
        }
    }

    public final void setInfoFontSize(Integer num) {
        int i11 = ChallengeResultCancelled;
        int i12 = i11 ^ 91;
        int i13 = -(-((i11 & 91) << 1));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        getMessageVersion = i14 % 128;
        if (i14 % 2 == 0) {
            this.getSDKTransactionID.setTextSize(num.intValue());
            throw null;
        }
        this.getSDKTransactionID.setTextSize(num.intValue());
        int i15 = getMessageVersion;
        int i16 = i15 & 57;
        ChallengeResultCancelled = ((i16 - (~(-(-((i15 ^ 57) | i16))))) - 1) % 128;
    }

    public final void setInfoTextColor(int i11) {
        int i12 = ChallengeResultCancelled;
        int i13 = (i12 ^ 121) + ((i12 & 121) << 1);
        getMessageVersion = i13 % 128;
        if (i13 % 2 != 0) {
            this.getSDKTransactionID.setTextColor(i11);
        } else {
            this.getSDKTransactionID.setTextColor(i11);
            throw null;
        }
    }

    public final void setInfoTypeface(Typeface typeface) {
        int i11 = getMessageVersion;
        int i12 = i11 ^ 119;
        int i13 = ((i11 & 119) | i12) << 1;
        int i14 = -i12;
        int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
        ChallengeResultCancelled = i15 % 128;
        if (i15 % 2 == 0) {
            this.getSDKTransactionID.setTypeface(typeface);
        } else {
            this.getSDKTransactionID.setTypeface(typeface);
            throw null;
        }
    }

    public final void setStateIndicatorColor(int i11) {
        ChallengeResultCancelled = (getMessageVersion + 85) % 128;
        this.getSDKAppID.setColorFilter(i11);
        getMessageVersion = (ChallengeResultCancelled + 117) % 128;
    }

    public final void setTitle(String str) {
        System.identityHashCode(this);
        System.identityHashCode(this);
        this.AuthenticationRequestParameters.setText(str);
        int i11 = getMessageVersion;
        int i12 = i11 & 1;
        int i13 = (i11 ^ 1) | i12;
        ChallengeResultCancelled = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
    }

    public final void setTitleFontSize(Integer num) {
        int i11 = getMessageVersion;
        int i12 = i11 ^ 31;
        int i13 = (i11 & 31) << 1;
        ChallengeResultCancelled = (((i12 | i13) << 1) - (i13 ^ i12)) % 128;
        this.AuthenticationRequestParameters.setTextSize(num.intValue());
        int i14 = getMessageVersion;
        int i15 = i14 ^ 27;
        int i16 = ((i14 & 27) | i15) << 1;
        int i17 = -i15;
        int i18 = ((i16 | i17) << 1) - (i16 ^ i17);
        ChallengeResultCancelled = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    public final void setTitleTextColor(int i11) {
        int i12 = ChallengeResultCancelled;
        int i13 = i12 & 113;
        int i14 = (i12 ^ 113) | i13;
        getMessageVersion = ((i13 & i14) + (i14 | i13)) % 128;
        this.AuthenticationRequestParameters.setTextColor(i11);
        int i15 = getMessageVersion;
        int i16 = (i15 & (-54)) | ((~i15) & 53);
        int i17 = (i15 & 53) << 1;
        int i18 = ((i16 | i17) << 1) - (i17 ^ i16);
        ChallengeResultCancelled = i18 % 128;
        if (i18 % 2 != 0) {
            throw null;
        }
    }

    public final void setTitleTypeface(Typeface typeface) {
        int i11 = getMessageVersion;
        ChallengeResultCancelled = (((i11 & (-114)) | ((~i11) & 113)) + ((i11 & 113) << 1)) % 128;
        this.AuthenticationRequestParameters.setTypeface(typeface);
        int i12 = getMessageVersion;
        ChallengeResultCancelled = ((i12 ^ 19) + ((i12 & 19) << 1)) % 128;
    }

    public getSDKTransactionID(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void getSDKReferenceNumber(boolean z11) {
        getSDKAppID(new Object[]{this, Boolean.valueOf(z11)}, 1133773340, -1133773339, System.identityHashCode(this));
    }

    public getSDKTransactionID(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.BuildConfig = EnumC0262getSDKTransactionID.EXPANDED;
        View.inflate(context, R.layout.a3ds2_widget_expandable_info_text, this);
        View viewFindViewById = findViewById(R.id.viewGroup_header);
        this.getDeviceData = viewFindViewById;
        viewFindViewById.setOnClickListener(this);
        this.getSDKAppID = (ImageView) findViewById(R.id.imageView_stateIndicator);
        this.AuthenticationRequestParameters = (TextView) findViewById(R.id.textView_title);
        TextView textView = (TextView) findViewById(R.id.textView_info);
        this.getSDKTransactionID = textView;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.getSDKReferenceNumber = (getDeviceData) findViewById(R.id.dividerView_info);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005f  */
    /* JADX WARN: Code duplicated, block: B:19:0x00b6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00b7  */
    private static /* synthetic */ Object getSDKAppID(Object[] objArr) {
        int i11;
        getSDKTransactionID getsdktransactionid = (getSDKTransactionID) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        bool.booleanValue();
        int i12 = ChallengeResultCancelled;
        int i13 = ((i12 | 13) << 1) - (i12 ^ 13);
        getMessageVersion = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = AnonymousClass1.getSDKReferenceNumber[((EnumC0262getSDKTransactionID) getSDKAppID(new Object[]{getsdktransactionid}, -1527545290, 1527545297, System.identityHashCode(getsdktransactionid))).ordinal()];
            int i15 = 95 / 0;
            if (i14 != 1) {
                if (i14 == 2) {
                    getSDKAppID(new Object[]{getsdktransactionid, bool}, 1133773340, -1133773339, System.identityHashCode(getsdktransactionid));
                    int i16 = getMessageVersion;
                    ChallengeResultCancelled = ((((i16 & (-112)) | ((~i16) & 111)) - (~((i16 & 111) << 1))) - 1) % 128;
                }
            }
            getSDKAppID(new Object[]{getsdktransactionid, bool}, 1453179552, -1453179546, System.identityHashCode(getsdktransactionid));
            int i17 = ChallengeResultCancelled;
            int i18 = (i17 & (-110)) | ((~i17) & 109);
            int i19 = -(-((i17 & 109) << 1));
            i11 = ((i18 | i19) << 1) - (i19 ^ i18);
            getMessageVersion = i11 % 128;
            if (i11 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i21 = AnonymousClass1.getSDKReferenceNumber[((EnumC0262getSDKTransactionID) getSDKAppID(new Object[]{getsdktransactionid}, -1527545290, 1527545297, System.identityHashCode(getsdktransactionid))).ordinal()];
        if (i21 != 1) {
            if (i21 == 2) {
                getSDKAppID(new Object[]{getsdktransactionid, bool}, 1133773340, -1133773339, System.identityHashCode(getsdktransactionid));
                int i110 = getMessageVersion;
                ChallengeResultCancelled = ((((i110 & (-112)) | ((~i110) & 111)) - (~((i110 & 111) << 1))) - 1) % 128;
            }
        }
        getSDKAppID(new Object[]{getsdktransactionid, bool}, 1453179552, -1453179546, System.identityHashCode(getsdktransactionid));
        int i111 = ChallengeResultCancelled;
        int i112 = (i111 & (-110)) | ((~i111) & 109);
        int i113 = -(-((i111 & 109) << 1));
        i11 = ((i112 | i113) << 1) - (i113 ^ i112);
        getMessageVersion = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
        int i22 = ChallengeResultCancelled + 111;
        getMessageVersion = i22 % 128;
        if (i22 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private void getSDKAppID(EnumC0262getSDKTransactionID enumC0262getSDKTransactionID) {
        getSDKAppID(new Object[]{this, enumC0262getSDKTransactionID}, -1518695256, 1518695258, System.identityHashCode(this));
    }

    private void getSDKAppID(boolean z11) {
        getSDKAppID(new Object[]{this, Boolean.valueOf(z11)}, 2071453193, -2071453190, System.identityHashCode(this));
    }

    private void getSDKTransactionID(boolean z11) {
        getSDKAppID(new Object[]{this, Boolean.valueOf(z11)}, 1453179552, -1453179546, System.identityHashCode(this));
    }

    private EnumC0262getSDKTransactionID getSDKTransactionID() {
        return (EnumC0262getSDKTransactionID) getSDKAppID(new Object[]{this}, -1527545290, 1527545297, System.identityHashCode(this));
    }
}
