package atd.an;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
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
import atd.az.ChallengeResultKt;
import atd.az.ChallengeStatusHandler;
import atd.az.ChallengeStatusReceiver;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.fastpair.FastPairStatusCodes;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.security.Provider;
import java.security.SecureRandomSpi;
import java.util.Map;
import org.spongycastle.math.ec.Tnaf;

/* JADX INFO: loaded from: classes3.dex */
public final class getSDKEphemeralPublicKey {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static byte[] AuthenticationRequestParameters;
    private static int BuildConfig;
    private static short[] ChallengeResult;
    private static char[] ChallengeResultCancelled;
    private static char ChallengeResultCompleted;
    private static char ChallengeResultError;
    private static char ChallengeResultTimeout;
    private static int ChallengeStatusHandler;
    private static int getAdditionalDetails;
    private static int getDeviceData;
    private static boolean getMessageVersion;
    private static int getSDKAppID;
    private static boolean getSDKEphemeralPublicKey;
    private static int getSDKReferenceNumber;
    private static final byte[] getSDKTransactionID;
    private static char getTransactionStatus;

    public static class getDeviceData extends SecureRandomSpi {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static DataInputStream AuthenticationRequestParameters;
        private static char BuildConfig;
        private static int ChallengeResult;
        private static char ChallengeResultCancelled;
        private static int ChallengeResultTimeout;
        private static char getMessageVersion;
        private static final Object getSDKAppID;
        private static char getSDKEphemeralPublicKey;
        private static final File getSDKReferenceNumber;
        private static OutputStream getSDKTransactionID;
        private boolean getDeviceData;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            ChallengeResult = 0;
            ChallengeResultTimeout = 1;
            getSDKAppID();
            Object[] objArr = new Object[1];
            a("輬쑷\ue019屋쩸虏䭫ꁆ褯揨\uf76a꾽", 12 - Color.argb(0, 0, 0, 0), objArr);
            getSDKReferenceNumber = new File(((String) objArr[0]).intern());
            getSDKAppID = new Object();
            ChallengeResultTimeout = (ChallengeResult + 73) % 128;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0025  */
        /* JADX WARN: Code duplicated, block: B:9:0x0032  */
        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            Object charArray;
            int i12;
            int i13;
            int i14 = $10 + 53;
            $11 = i14 % 128;
            int i15 = 2;
            int i16 = 0;
            if (i14 % 2 == 0) {
                int i17 = 95 / 0;
                if (str != null) {
                    charArray = str.toCharArray();
                    $11 = ($10 + 41) % 128;
                } else {
                    charArray = str;
                }
            } else if (str != null) {
                charArray = str.toCharArray();
                $11 = ($10 + 41) % 128;
            } else {
                charArray = str;
            }
            char[] cArr = (char[]) charArray;
            ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
            char[] cArr2 = new char[cArr.length];
            challengeStatusHandler.getSDKReferenceNumber = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i18 = challengeStatusHandler.getSDKReferenceNumber;
                if (i18 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i11);
                    return;
                }
                int i19 = $11 + 67;
                $10 = i19 % 128;
                int i21 = 58224;
                if (i19 % i15 != 0) {
                    cArr3[i16] = cArr[i18];
                    cArr3[i16] = cArr[i16];
                    i12 = 1;
                } else {
                    cArr3[i16] = cArr[i18];
                    cArr3[1] = cArr[i18 + 1];
                    i12 = i16;
                }
                while (i12 < 16) {
                    char c11 = cArr3[1];
                    char c12 = cArr3[i16];
                    int i22 = i21;
                    int i23 = (c12 + i21) ^ ((c12 << 4) + ((char) (((long) getSDKEphemeralPublicKey) ^ (-2881362678149017980L))));
                    int i24 = c12 >>> 5;
                    int i25 = i15;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(getMessageVersion);
                        objArr2[i25] = Integer.valueOf(i24);
                        objArr2[1] = Integer.valueOf(i23);
                        objArr2[i16] = Integer.valueOf(c11);
                        Map map = atd.a.getMessageVersion.timedout;
                        Object method = map.get(59536824);
                        Class cls = Integer.TYPE;
                        if (method != null) {
                            i13 = i16;
                        } else {
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1744 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 16681), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29);
                            byte b11 = (byte) i16;
                            byte b12 = b11;
                            i13 = i16;
                            Object[] objArr3 = new Object[1];
                            b(b11, b12, (byte) (b12 + 1), objArr3);
                            method = cls2.getMethod((String) objArr3[i13], cls, cls, cls, cls);
                            map.put(59536824, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char c13 = cArr3[i13];
                        int i26 = ((cCharValue << 4) + ((char) (((long) ChallengeResultCancelled) ^ (-2881362678149017980L)))) ^ (cCharValue + i22);
                        int i27 = cCharValue >>> 5;
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(BuildConfig);
                        objArr4[i25] = Integer.valueOf(i27);
                        objArr4[1] = Integer.valueOf(i26);
                        objArr4[i13] = Integer.valueOf(c13);
                        Object method2 = map.get(59536824);
                        if (method2 == null) {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getEdgeSlop() >> 16) + 1745, (char) ((ViewConfiguration.getScrollFriction() > 0 ? 1 : (ViewConfiguration.getScrollFriction() == 0 ? 0 : -1)) + 16681), TextUtils.getTrimmedLength("") + 29);
                            int i28 = i13;
                            byte b13 = (byte) i28;
                            byte b14 = b13;
                            Object[] objArr5 = new Object[1];
                            b(b13, b14, (byte) (b14 + 1), objArr5);
                            method2 = cls3.getMethod((String) objArr5[i28], cls, cls, cls, cls);
                            map.put(59536824, method2);
                        }
                        cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i21 = i22 - FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                        i12++;
                        i15 = i25;
                        cArr = cArr;
                        i16 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                char[] cArr4 = cArr;
                int i29 = i15;
                int i31 = challengeStatusHandler.getSDKReferenceNumber;
                cArr2[i31] = cArr3[0];
                cArr2[i31 + 1] = cArr3[1];
                Object[] objArr6 = new Object[i29];
                objArr6[1] = challengeStatusHandler;
                objArr6[0] = challengeStatusHandler;
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(1312076635);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1596 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 27824), View.MeasureSpec.getSize(0) + 25);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1312076635, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i15 = i29;
                cArr = cArr4;
                i16 = 0;
            }
        }

        private static void b(int i11, short s11, byte b11, Object[] objArr) {
            int i12 = 116 - (b11 * 4);
            int i13 = 4 - (s11 * 3);
            int i14 = i11 * 2;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i14 + 1];
            int i15 = -1;
            if (bArr == null) {
                i12 = i13 + (-i14);
                i13++;
            }
            while (true) {
                i15++;
                bArr2[i15] = (byte) i12;
                if (i15 == i14) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i16 = i12;
                int i17 = i13 + 1;
                i12 = i16 + (-bArr[i13]);
                i13 = i17;
            }
        }

        private static OutputStream getDeviceData() {
            OutputStream outputStream;
            synchronized (getSDKAppID) {
                try {
                    if (getSDKTransactionID == null) {
                        getSDKTransactionID = new FileOutputStream(getSDKReferenceNumber);
                    }
                    outputStream = getSDKTransactionID;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return outputStream;
        }

        static void getSDKAppID() {
            ChallengeResultCancelled = (char) 34469;
            BuildConfig = (char) 63142;
            getSDKEphemeralPublicKey = (char) 23625;
            getMessageVersion = (char) 25917;
        }

        private static DataInputStream getSDKTransactionID() {
            DataInputStream dataInputStream;
            synchronized (getSDKAppID) {
                if (AuthenticationRequestParameters == null) {
                    try {
                        AuthenticationRequestParameters = new DataInputStream(new FileInputStream(getSDKReferenceNumber));
                    } catch (IOException e11) {
                        StringBuilder sb2 = new StringBuilder();
                        Object[] objArr = new Object[1];
                        a("ȸ샛ᝃ쥌\udaaa軭\ue0bf繹\uec81\uf1ee涛墭鰎ꪣᖚ䁰", 15 - View.getDefaultSize(0, 0), objArr);
                        sb2.append(((String) objArr[0]).intern());
                        sb2.append(getSDKReferenceNumber);
                        Object[] objArr2 = new Object[1];
                        a("隳劙쬴೦㓃\u2455ﬣꂐ棹员挐\u20cf", 12 - KeyEvent.getDeadChar(0, 0), objArr2);
                        sb2.append(((String) objArr2[0]).intern());
                        throw new SecurityException(sb2.toString(), e11);
                    }
                }
                dataInputStream = AuthenticationRequestParameters;
            }
            return dataInputStream;
        }

        static void init$0() {
            $$a = new byte[]{101, 91, -23, 21};
            $$b = 82;
        }

        @Override // java.security.SecureRandomSpi
        protected byte[] engineGenerateSeed(int i11) throws Throwable {
            ChallengeResultTimeout = (ChallengeResult + 31) % 128;
            byte[] bArr = new byte[i11];
            engineNextBytes(bArr);
            ChallengeResult = (ChallengeResultTimeout + 105) % 128;
            return bArr;
        }

        @Override // java.security.SecureRandomSpi
        @SuppressLint({"SyntheticAccessor"})
        protected void engineNextBytes(byte[] bArr) throws Throwable {
            DataInputStream sDKTransactionID;
            if (!this.getDeviceData) {
                engineSetSeed(getSDKEphemeralPublicKey.AuthenticationRequestParameters());
            }
            try {
                synchronized (getSDKAppID) {
                    sDKTransactionID = getSDKTransactionID();
                }
                synchronized (sDKTransactionID) {
                    sDKTransactionID.readFully(bArr);
                }
            } catch (IOException e11) {
                StringBuilder sb2 = new StringBuilder();
                Object[] objArr = new Object[1];
                a("ȸ샛ᝃ쥌\udaaa軭\ue0bf繹\uec81\uf1ee炚髐榰餚隳劙뼨ὃ歕\uee03", 19 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr);
                sb2.append(((String) objArr[0]).intern());
                sb2.append(getSDKReferenceNumber);
                throw new SecurityException(sb2.toString(), e11);
            }
        }

        @Override // java.security.SecureRandomSpi
        protected void engineSetSeed(byte[] bArr) {
            OutputStream deviceData;
            try {
                synchronized (getSDKAppID) {
                    deviceData = getDeviceData();
                }
                deviceData.write(bArr);
                deviceData.flush();
                this.getDeviceData = true;
            } catch (IOException unused) {
                this.getDeviceData = true;
            } catch (Throwable th2) {
                this.getDeviceData = true;
                throw th2;
            }
        }
    }

    static class getSDKAppID extends Provider {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static char AuthenticationRequestParameters;
        private static char getSDKAppID;
        private static char getSDKReferenceNumber;
        private static char getSDKTransactionID;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            getSDKReferenceNumber = (char) 50074;
            getSDKAppID = (char) 47234;
            getSDKTransactionID = (char) 41320;
            AuthenticationRequestParameters = (char) 43378;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        getSDKAppID() throws Throwable {
            Object[] objArr = new Object[1];
            a("\ue2bcҠ\u09d9끔\ue1c9\uf57d⛨銘檩㾥", MotionEvent.axisFromString("") + 10, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("\uf8b5\udd82\ue2bcҠ\u09d9끔ᙆ\ue91a톰\uf260콷\udcfc㹖ڏ覓玸超繙药돛찚緪噳︂\u09d9끔佖龛硲멡恤悐\uf6c0캬㽃槁䁸鱋㓱䮪藲⏀ꑱ䆘\uf3c1⌈㷸䬯뗡전퐲‥탺떧ጅ⤀괼妡ᙶ燴쐖߀", 62 - Drawable.resolveOpacity(0, 0), objArr2);
            super(strIntern, 1.0d, ((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a("㼛쁙㈝ꥊ戅⃖\fƛᙶ燴쐖߀\ueeb6䰐ᢔ䰐冱콥⛨銘檩㾥", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 21, objArr3);
            put(((String) objArr3[0]).intern(), getDeviceData.class.getName());
            Object[] objArr4 = new Object[1];
            a("㼛쁙㈝ꥊ戅⃖\fƛᙶ燴쐖߀\ueeb6䰐ᢔ䰐冱콥⛨銘毿\udc24\u05ff齚ﮏ辰ᵴ무犞ﬥܝ낇珸讦ⲩ誖", (ViewConfiguration.getWindowTouchSlop() >> 8) + 35, objArr4);
            String strIntern2 = ((String) objArr4[0]).intern();
            Object[] objArr5 = new Object[1];
            a("誈瑀魌\ue195少㠈戅⃖", 8 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr5);
            put(strIntern2, ((String) objArr5[0]).intern());
        }

        private static void a(String str, int i11, Object[] objArr) throws Throwable {
            char[] charArray;
            int i12;
            int i13 = $10 + 11;
            $11 = i13 % 128;
            int i14 = 2;
            if (i13 % 2 == 0) {
                throw null;
            }
            if (str != null) {
                charArray = str.toCharArray();
                $11 = ($10 + 57) % 128;
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
            char[] cArr2 = new char[cArr.length];
            int i15 = 0;
            challengeStatusHandler.getSDKReferenceNumber = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i16 = challengeStatusHandler.getSDKReferenceNumber;
                if (i16 >= cArr.length) {
                    objArr[0] = new String(cArr2, 0, i11);
                    return;
                }
                cArr3[i15] = cArr[i16];
                cArr3[1] = cArr[i16 + 1];
                int i17 = 58224;
                int i18 = i15;
                while (i18 < 16) {
                    char c11 = cArr3[1];
                    char c12 = cArr3[i15];
                    int i19 = i14;
                    ChallengeStatusHandler challengeStatusHandler2 = challengeStatusHandler;
                    int i21 = (c12 + i17) ^ ((c12 << 4) + ((char) (((long) getSDKTransactionID) ^ (-2881362678149017980L))));
                    int i22 = c12 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(AuthenticationRequestParameters);
                        objArr2[i19] = Integer.valueOf(i22);
                        objArr2[1] = Integer.valueOf(i21);
                        objArr2[i15] = Integer.valueOf(c11);
                        Map map = atd.a.getMessageVersion.timedout;
                        Object method = map.get(59536824);
                        Class cls = Integer.TYPE;
                        if (method != null) {
                            i12 = i15;
                        } else {
                            i12 = i15;
                            Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - TextUtils.getOffsetBefore("", i15), (char) (TextUtils.indexOf((CharSequence) "", '0', i15) + 16683), (-16777187) - Color.rgb(i15, i15, i15));
                            byte b11 = (byte) ($$b & 1);
                            byte b12 = (byte) (b11 - 1);
                            Object[] objArr3 = new Object[1];
                            b(b11, b12, b12, objArr3);
                            method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                            map.put(59536824, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char c13 = cArr3[i12];
                        int i23 = (cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) getSDKReferenceNumber) ^ (-2881362678149017980L))));
                        int i24 = cCharValue >>> 5;
                        Object[] objArr4 = new Object[4];
                        objArr4[3] = Integer.valueOf(getSDKAppID);
                        objArr4[i19] = Integer.valueOf(i24);
                        objArr4[1] = Integer.valueOf(i23);
                        objArr4[i12] = Integer.valueOf(c13);
                        Object method2 = map.get(59536824);
                        if (method2 == null) {
                            Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - TextUtils.indexOf("", ""), (char) (16682 - (TypedValue.complexToFraction(i12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i12, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 29 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                            byte b13 = (byte) ($$b & 1);
                            byte b14 = (byte) (b13 - 1);
                            Object[] objArr5 = new Object[1];
                            b(b13, b14, b14, objArr5);
                            method2 = cls3.getMethod((String) objArr5[0], cls, cls, cls, cls);
                            map.put(59536824, method2);
                        }
                        cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i17 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                        i18++;
                        challengeStatusHandler = challengeStatusHandler2;
                        i14 = i19;
                        cArr = cArr;
                        cArr3 = cArr3;
                        i15 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                char[] cArr4 = cArr;
                int i25 = i14;
                ChallengeStatusHandler challengeStatusHandler3 = challengeStatusHandler;
                char[] cArr5 = cArr3;
                int i26 = challengeStatusHandler3.getSDKReferenceNumber;
                cArr2[i26] = cArr5[0];
                cArr2[i26 + 1] = cArr5[1];
                i14 = i25;
                Object[] objArr6 = new Object[i14];
                objArr6[1] = challengeStatusHandler3;
                objArr6[0] = challengeStatusHandler3;
                Map map2 = atd.a.getMessageVersion.timedout;
                Object method3 = map2.get(1312076635);
                if (method3 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1596 - Gravity.getAbsoluteGravity(0, 0), (char) ((Process.myTid() >> 22) + 27824), 24 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr7 = new Object[1];
                    b(b15, b16, b16, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1312076635, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                challengeStatusHandler = challengeStatusHandler3;
                cArr = cArr4;
                cArr3 = cArr5;
                i15 = 0;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void b(byte r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = atd.an.getSDKEphemeralPublicKey.getSDKAppID.$$a
                int r8 = r8 * 4
                int r8 = 3 - r8
                int r6 = r6 * 4
                int r6 = 116 - r6
                int r7 = r7 * 4
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r7
                r6 = r8
                r4 = r2
                goto L2e
            L17:
                r3 = r8
                r8 = r6
                r6 = r3
                r3 = r2
            L1b:
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                int r6 = r6 + 1
                if (r4 != r7) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2c:
                r3 = r0[r6]
            L2e:
                int r3 = -r3
                int r8 = r8 + r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: atd.an.getSDKEphemeralPublicKey.getSDKAppID.b(byte, int, byte, java.lang.Object[]):void");
        }

        static void init$0() {
            $$a = new byte[]{72, 37, -103, 75};
            $$b = 87;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        getAdditionalDetails = 0;
        ChallengeStatusHandler = 1;
        getSDKTransactionID();
        getDeviceData();
        getSDKTransactionID = getMessageVersion();
        ChallengeStatusHandler = (getAdditionalDetails + 85) % 128;
    }

    private static /* synthetic */ Object AuthenticationRequestParameters(Object[] objArr) throws Throwable {
        int i11 = getAdditionalDetails + 41;
        ChallengeStatusHandler = i11 % 128;
        if (i11 % 2 == 0) {
            getSDKReferenceNumber();
            BuildConfig();
            int i12 = 13 / 0;
        } else {
            getSDKReferenceNumber();
            BuildConfig();
        }
        getAdditionalDetails = (ChallengeStatusHandler + 81) % 128;
        return null;
    }

    private static void BuildConfig() {
    }

    private static void a(int i11, int i12, short s11, int i13, byte b11, Object[] objArr) throws Throwable {
        long j11;
        int i14;
        Object method;
        ChallengeResultKt challengeResultKt = new ChallengeResultKt();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i15 = 1;
            Object[] objArr2 = {Integer.valueOf(i11), Integer.valueOf(getSDKReferenceNumber)};
            int i16 = 0;
            Map map = atd.a.getMessageVersion.timedout;
            Object method2 = map.get(557807898);
            Class cls = Integer.TYPE;
            if (method2 == null) {
                Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Drawable.resolveOpacity(0, 0) + 2105, (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21994), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 30);
                byte b12 = (byte) 0;
                Object[] objArr3 = new Object[1];
                d((byte) ($$b & 23), b12, b12, objArr3);
                method2 = cls2.getMethod((String) objArr3[0], cls, cls);
                map.put(557807898, method2);
            }
            int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
            int i17 = iIntValue == -1 ? 1 : 0;
            if (i17 != 0) {
                $11 = ($10 + 15) % 128;
                byte[] bArr = AuthenticationRequestParameters;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i18 = 0;
                    j11 = -671853308956415234L;
                    while (i18 < length) {
                        Object[] objArr4 = {Integer.valueOf(bArr[i18])};
                        int i19 = i15;
                        Map map2 = atd.a.getMessageVersion.timedout;
                        Object obj = map2.get(-844142059);
                        if (obj != null) {
                            method = obj;
                        } else {
                            method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(2936 - Color.green(i16), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), KeyEvent.getDeadChar(i16, i16) + 33)).getMethod("s", cls);
                            map2.put(-844142059, method);
                        }
                        bArr2[i18] = ((Byte) ((Method) method).invoke(null, objArr4)).byteValue();
                        i18++;
                        i15 = i19;
                        bArr = bArr;
                        i16 = i16;
                    }
                    bArr = bArr2;
                } else {
                    j11 = -671853308956415234L;
                }
                int i21 = i15;
                int i22 = i16;
                if (bArr != null) {
                    byte[] bArr3 = AuthenticationRequestParameters;
                    Object[] objArr5 = new Object[2];
                    objArr5[i21] = Integer.valueOf(getSDKAppID);
                    objArr5[i22] = Integer.valueOf(i13);
                    Map map3 = atd.a.getMessageVersion.timedout;
                    Object method3 = map3.get(557807898);
                    if (method3 == null) {
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2105 - TextUtils.getCapsMode("", i22, i22), (char) (21995 - (ViewConfiguration.getLongPressTimeout() >> 16)), 31 - View.MeasureSpec.getSize(i22));
                        byte b13 = (byte) 0;
                        Object[] objArr6 = new Object[i21];
                        d((byte) ($$b & 23), b13, b13, objArr6);
                        method3 = cls3.getMethod((String) objArr6[0], cls, cls);
                        map3.put(557807898, method3);
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ j11)) + ((int) (((long) getSDKReferenceNumber) ^ j11)));
                } else {
                    iIntValue = (short) (((short) (((long) ChallengeResult[i13 + ((int) (((long) getSDKAppID) ^ j11))]) ^ j11)) + ((int) (((long) getSDKReferenceNumber) ^ j11)));
                }
            } else {
                j11 = -671853308956415234L;
            }
            if (iIntValue > 0) {
                challengeResultKt.getDeviceData = ((i13 + iIntValue) - 2) + ((int) (((long) getSDKAppID) ^ j11)) + i17;
                Object[] objArr7 = {challengeResultKt, Integer.valueOf(i12), Integer.valueOf(getDeviceData), sb2};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-1793105104);
                if (method4 == null) {
                    Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2136 - (ViewConfiguration.getTapTimeout() >> 16), (char) (ViewConfiguration.getTapTimeout() >> 16), 28 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr8 = new Object[1];
                    d(b14, b15, b15, objArr8);
                    method4 = cls4.getMethod((String) objArr8[0], Object.class, cls, cls, Object.class);
                    map4.put(-1793105104, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(challengeResultKt.getSDKTransactionID);
                challengeResultKt.getSDKAppID = challengeResultKt.getSDKTransactionID;
                byte[] bArr4 = AuthenticationRequestParameters;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i23 = 0; i23 < length2; i23++) {
                        bArr5[i23] = (byte) (((long) bArr4[i23]) ^ j11);
                    }
                    bArr4 = bArr5;
                }
                boolean z11 = bArr4 != null;
                challengeResultKt.getSDKReferenceNumber = 1;
                while (challengeResultKt.getSDKReferenceNumber < iIntValue) {
                    int i24 = $10 + 23;
                    int i25 = i24 % 128;
                    $11 = i25;
                    if (i24 % 2 == 0) {
                        throw null;
                    }
                    if (z11) {
                        int i26 = i25 + 113;
                        $10 = i26 % 128;
                        if (i26 % 2 != 0) {
                            byte[] bArr6 = AuthenticationRequestParameters;
                            int i27 = challengeResultKt.getDeviceData;
                            challengeResultKt.getDeviceData = i27 >>> 1;
                            i14 = challengeResultKt.getSDKAppID / (((byte) (((byte) (((long) bArr6[i27]) & j11)) >> s11)) ^ b11);
                        } else {
                            byte[] bArr7 = AuthenticationRequestParameters;
                            int i28 = challengeResultKt.getDeviceData;
                            challengeResultKt.getDeviceData = i28 - 1;
                            i14 = challengeResultKt.getSDKAppID + (((byte) (((byte) (((long) bArr7[i28]) ^ j11)) + s11)) ^ b11);
                        }
                        challengeResultKt.getSDKTransactionID = (char) i14;
                    } else {
                        short[] sArr = ChallengeResult;
                        int i29 = challengeResultKt.getDeviceData;
                        challengeResultKt.getDeviceData = i29 - 1;
                        challengeResultKt.getSDKTransactionID = (char) (challengeResultKt.getSDKAppID + (((short) (((short) (((long) sArr[i29]) ^ j11)) + s11)) ^ b11));
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

    private static void b(int i11, int[] iArr, String str, String str2, Object[] objArr) throws Throwable {
        char[] charArray;
        Class cls;
        Object method;
        String str3 = str2;
        Object bytes = str3;
        if (str3 != null) {
            bytes = str3.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        if (str != null) {
            int i12 = $11 + 9;
            $10 = i12 % 128;
            if (i12 % 2 != 0) {
                str.toCharArray();
                throw null;
            }
            charArray = str.toCharArray();
        } else {
            charArray = str;
        }
        char[] cArr = charArray;
        ChallengeStatusReceiver challengeStatusReceiver = new ChallengeStatusReceiver();
        char[] cArr2 = ChallengeResultCancelled;
        Class cls2 = Integer.TYPE;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i13 = 0;
            while (i13 < length) {
                $11 = ($10 + 91) % 128;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i13])};
                    Map map = atd.a.getMessageVersion.timedout;
                    Object obj = map.get(508097192);
                    if (obj != null) {
                        method = obj;
                        cls = cls2;
                    } else {
                        cls = cls2;
                        method = ((Class) atd.a.getMessageVersion.getSDKTransactionID(328 - Color.blue(0), (char) (Process.myTid() >> 22), 32 - TextUtils.getCapsMode("", 0, 0))).getMethod("o", cls);
                        map.put(508097192, method);
                    }
                    cArr3[i13] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i13++;
                    cls2 = cls;
                    cArr2 = cArr2;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Class cls3 = cls2;
        Object[] objArr3 = {Integer.valueOf(BuildConfig)};
        Map map2 = atd.a.getMessageVersion.timedout;
        Object method2 = map2.get(-852383591);
        if (method2 == null) {
            Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID(2061 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (ViewConfiguration.getEdgeSlop() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 17);
            byte b11 = (byte) 0;
            Object[] objArr4 = new Object[1];
            d((byte) ($$b & 62), b11, b11, objArr4);
            method2 = cls4.getMethod((String) objArr4[0], cls3);
            map2.put(-852383591, method2);
        }
        int iIntValue = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
        char c11 = 3;
        if (getMessageVersion) {
            int length2 = bArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length2;
            char[] cArr4 = new char[length2];
            challengeStatusReceiver.getDeviceData = 0;
            $11 = ($10 + 45) % 128;
            while (true) {
                int i14 = challengeStatusReceiver.getDeviceData;
                int i15 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i14 >= i15) {
                    objArr[0] = new String(cArr4);
                    return;
                }
                cArr4[i14] = (char) (cArr2[bArr[(i15 - 1) - i14] + i11] - iIntValue);
                Object[] objArr5 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map3 = atd.a.getMessageVersion.timedout;
                Object method3 = map3.get(-249860496);
                if (method3 == null) {
                    Class cls5 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1108 - KeyEvent.getDeadChar(0, 0), (char) KeyEvent.keyCodeFromString(""), 50 - Color.argb(0, 0, 0, 0));
                    byte b12 = (byte) 0;
                    Object[] objArr6 = new Object[1];
                    d((byte) (-$$a[c11]), b12, b12, objArr6);
                    method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                    map3.put(-249860496, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                c11 = c11;
            }
        } else if (getSDKEphemeralPublicKey) {
            int length3 = cArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length3;
            char[] cArr5 = new char[length3];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i16 = challengeStatusReceiver.getDeviceData;
                int i17 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i16 >= i17) {
                    objArr[0] = new String(cArr5);
                    return;
                }
                cArr5[i16] = (char) (cArr2[cArr[(i17 - 1) - i16] - i11] - iIntValue);
                Object[] objArr7 = {challengeStatusReceiver, challengeStatusReceiver};
                Map map4 = atd.a.getMessageVersion.timedout;
                Object method4 = map4.get(-249860496);
                if (method4 == null) {
                    Class cls6 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1107 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (char) Color.alpha(0), View.MeasureSpec.getMode(0) + 50);
                    byte b13 = (byte) 0;
                    Object[] objArr8 = new Object[1];
                    d((byte) (-$$a[3]), b13, b13, objArr8);
                    method4 = cls6.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-249860496, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
        } else {
            int length4 = iArr.length;
            challengeStatusReceiver.getSDKReferenceNumber = length4;
            char[] cArr6 = new char[length4];
            challengeStatusReceiver.getDeviceData = 0;
            while (true) {
                int i18 = challengeStatusReceiver.getDeviceData;
                int i19 = challengeStatusReceiver.getSDKReferenceNumber;
                if (i18 >= i19) {
                    objArr[0] = new String(cArr6);
                    return;
                } else {
                    cArr6[i18] = (char) (cArr2[iArr[(i19 - 1) - i18] - i11] - iIntValue);
                    challengeStatusReceiver.getDeviceData = i18 + 1;
                    $10 = ($11 + 37) % 128;
                }
            }
        }
    }

    private static void c(String str, int i11, Object[] objArr) throws Throwable {
        int i12;
        char[] charArray = str != null ? str.toCharArray() : str;
        ChallengeStatusHandler challengeStatusHandler = new ChallengeStatusHandler();
        char[] cArr = new char[charArray.length];
        int i13 = 0;
        challengeStatusHandler.getSDKReferenceNumber = 0;
        int i14 = 2;
        char[] cArr2 = new char[2];
        while (true) {
            int i15 = challengeStatusHandler.getSDKReferenceNumber;
            if (i15 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i11);
                return;
            }
            cArr2[i13] = charArray[i15];
            char c11 = 1;
            cArr2[1] = charArray[i15 + 1];
            int i16 = 58224;
            int i17 = i13;
            while (i17 < 16) {
                char c12 = cArr2[c11];
                char c13 = cArr2[i13];
                int i18 = i14;
                char[] cArr3 = cArr2;
                int i19 = (c13 + i16) ^ ((c13 << 4) + ((char) (((long) getTransactionStatus) ^ (-2881362678149017980L))));
                int i21 = c13 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(ChallengeResultCompleted);
                    objArr2[i18] = Integer.valueOf(i21);
                    objArr2[c11] = Integer.valueOf(i19);
                    objArr2[i13] = Integer.valueOf(c12);
                    Map map = atd.a.getMessageVersion.timedout;
                    Object method = map.get(59536824);
                    Class cls = Integer.TYPE;
                    if (method != null) {
                        i12 = i13;
                    } else {
                        Class cls2 = (Class) atd.a.getMessageVersion.getSDKTransactionID(1745 - View.resolveSizeAndState(i13, i13, i13), (char) (16681 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.lastIndexOf("", '0', i13, i13) + 30);
                        byte b11 = (byte) i13;
                        i12 = i13;
                        Object[] objArr3 = new Object[1];
                        d((byte) ($$b & 57), b11, b11, objArr3);
                        method = cls2.getMethod((String) objArr3[i12], cls, cls, cls, cls);
                        map.put(59536824, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char c14 = cArr3[i12];
                    int i22 = (cCharValue + i16) ^ ((cCharValue << 4) + ((char) (((long) ChallengeResultError) ^ (-2881362678149017980L))));
                    int i23 = cCharValue >>> 5;
                    Object[] objArr4 = new Object[4];
                    objArr4[3] = Integer.valueOf(ChallengeResultTimeout);
                    objArr4[i18] = Integer.valueOf(i23);
                    objArr4[1] = Integer.valueOf(i22);
                    objArr4[i12] = Integer.valueOf(c14);
                    Object method2 = map.get(59536824);
                    if (method2 == null) {
                        int i24 = i12;
                        Class cls3 = (Class) atd.a.getMessageVersion.getSDKTransactionID(Color.alpha(i12) + 1745, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 16682), Gravity.getAbsoluteGravity(i24, i24) + 29);
                        byte b12 = (byte) 0;
                        Object[] objArr5 = new Object[1];
                        d((byte) ($$b & 57), b12, b12, objArr5);
                        method2 = cls3.getMethod((String) objArr5[0], cls, cls, cls, cls);
                        map.put(59536824, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i16 -= FastPairStatusCodes.FAILED_PERMISSION_DENIED;
                    i17++;
                    i14 = i18;
                    cArr2 = cArr3;
                    charArray = charArray;
                    i13 = 0;
                    c11 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = charArray;
            int i25 = i14;
            char[] cArr5 = cArr2;
            int i26 = challengeStatusHandler.getSDKReferenceNumber;
            cArr[i26] = cArr5[0];
            cArr[i26 + 1] = cArr5[1];
            Object[] objArr6 = new Object[i25];
            objArr6[1] = challengeStatusHandler;
            objArr6[0] = challengeStatusHandler;
            Map map2 = atd.a.getMessageVersion.timedout;
            Object method3 = map2.get(1312076635);
            if (method3 == null) {
                Class cls4 = (Class) atd.a.getMessageVersion.getSDKTransactionID((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1595, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 27824), 25 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                byte b13 = (byte) ($$b & 21);
                byte b14 = (byte) (b13 - 5);
                Object[] objArr7 = new Object[1];
                d(b13, b14, b14, objArr7);
                method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1312076635, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            i14 = i25;
            cArr2 = cArr5;
            charArray = cArr4;
            i13 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 121 - r6
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = atd.an.getSDKEphemeralPublicKey.$$a
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r8 = r8 + r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.an.getSDKEphemeralPublicKey.d(short, byte, int, java.lang.Object[]):void");
    }

    static void getDeviceData() {
        getSDKAppID = -638445979;
        getSDKReferenceNumber = -1568970084;
        getDeviceData = 210216271;
        AuthenticationRequestParameters = new byte[]{46, -123, 26, -119, 25, 49, 96, 113, 19, -117, 45, 45, 62, 87, -116, 30, 23, 66, -62, 19, 31, -123, -115, 25, -125, 28, -36, -60, 17, -119, -120, -44, -53, 21, -127, 28, -123, 47, -121, 68, 87, -125, 27, 28, -113, 17, 77, 89, -117, 29, 82, 4, -50, -50, -54, 6, -50, -1, -50, -48, -26, -5, -48, -14, 77, -47, -46, -120, 119, -42, -47, -35, -83, -55, -44, -125, -36, -123, -121, -27, -37, -43, 120, -44, 120, 35, 122, -100, 97, 85, -113, -121, 91, -111, 54, 68, -51, -115, -109, -111, -113, 43, -69, 107, 22, -48, -109, -114, 92, 86, -109, 22, -117, 91, -81, -115, -112, 86, 115, -124, -115, -119, 69, -114, -105, 86, -119, 97, -127, 85, 89, 57, -87, 99, -110, 77, -107, -110, 95, -118, 97, 99, -127, -121, -111, 102, -110, 102, 75, 2, 5, -9, 86, -66, -12, 22, -14, Tnaf.POW_2_WIDTH, -6, 12, 3, 74, -76, -2, 89, -63, 2, -4, 6, 13, 30, 90, -15, 62, 53, -21, 56};
        ChallengeResultCancelled = new char[]{64844, 64863, 64848, 64858, 64833, 64813, 64827, 64826, 64881, 64808, 64811, 64812, 64831, 64816, 64817, 64819, 64843, 64806, 64814, 64829, 64810, 64894, 64828, 64824, 64807, 64850, 64823, 64846, 64857, 64868, 64856, 64818, 64849, 64845, 64809, 64886, 64887, 64821, 64825, 64854, 64879};
        BuildConfig = -185467490;
        getSDKEphemeralPublicKey = true;
        getMessageVersion = true;
    }

    private static byte[] getMessageVersion() throws Throwable {
        StringBuilder sb2 = new StringBuilder();
        String str = Build.FINGERPRINT;
        if (str != null) {
            int i11 = ChallengeStatusHandler + 71;
            getAdditionalDetails = i11 % 128;
            if (i11 % 2 != 0) {
                sb2.append(str);
                throw null;
            }
            sb2.append(str);
        }
        String sDKEphemeralPublicKey = getSDKEphemeralPublicKey();
        if (sDKEphemeralPublicKey != null) {
            ChallengeStatusHandler = (getAdditionalDetails + 37) % 128;
            sb2.append(sDKEphemeralPublicKey);
        }
        return sb2.toString().getBytes(atd.a.AuthenticationRequestParameters.AuthenticationRequestParameters);
    }

    public static void getSDKAppID() {
        getSDKTransactionID(new Object[0], 549537595, -549537595, (int) System.currentTimeMillis());
    }

    private static String getSDKEphemeralPublicKey() throws Throwable {
        ChallengeStatusHandler = (getAdditionalDetails + 55) % 128;
        try {
            Object[] objArr = new Object[1];
            a((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 99, 1359163553 - Process.getGidForName(""), (short) ((-110) - View.MeasureSpec.makeMeasureSpec(0, 0)), (-2072607727) - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) ((ViewConfiguration.getTapTimeout() >> 16) - 86), objArr);
            String str = (String) Build.class.getField(((String) objArr[0]).intern()).get(null);
            int i11 = ChallengeStatusHandler + 125;
            getAdditionalDetails = i11 % 128;
            if (i11 % 2 == 0) {
                return str;
            }
            throw null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void getSDKReferenceNumber() throws Throwable {
        getAdditionalDetails = (ChallengeStatusHandler + 107) % 128;
        int i11 = Build.VERSION.SDK_INT;
        int i12 = getAdditionalDetails + 39;
        ChallengeStatusHandler = i12 % 128;
        if (i12 % 2 != 0 || i11 > 69) {
            return;
        }
        try {
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getTapTimeout() >> 16) - 99, 1359163582 - (ViewConfiguration.getEdgeSlop() >> 16), (short) (View.combineMeasuredStates(0, 0) - 48), (-2072607898) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) ((-80) - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), objArr);
            Class<?> cls = Class.forName(((String) objArr[0]).intern());
            Object[] objArr2 = new Object[1];
            b((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 126, null, null, "\u0088\u0087\u0087\u0086\u0085\u0084\u0083\u0082\u0081", objArr2);
            cls.getMethod(((String) objArr2[0]).intern(), byte[].class).invoke(null, AuthenticationRequestParameters());
            Object[] objArr3 = new Object[1];
            a(65485 - AndroidCharacter.getMirror('0'), View.resolveSize(0, 0) + 1359163582, (short) ((ViewConfiguration.getLongPressTimeout() >> 16) - 48), (-2072607899) - View.MeasureSpec.getSize(0), (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) - 80), objArr3);
            Class<?> cls2 = Class.forName(((String) objArr3[0]).intern());
            Object[] objArr4 = new Object[1];
            a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 99, 1359163553 - Color.argb(0, 0, 0, 0), (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 105), (-2072607850) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) ((-100) - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr4);
            Method method = cls2.getMethod(((String) objArr4[0]).intern(), String.class, Long.TYPE);
            Object[] objArr5 = new Object[1];
            b(127 - (ViewConfiguration.getLongPressTimeout() >> 16), null, null, "\u0090\u008f\u0088\u008e\u008d\u008c\u008b\u0089\u008a\u0087\u0088\u0089", objArr5);
            int iIntValue = ((Integer) method.invoke(null, ((String) objArr5[0]).intern(), 1024)).intValue();
            if (iIntValue == 1024) {
                int i13 = ChallengeStatusHandler + 45;
                getAdditionalDetails = i13 % 128;
                if (i13 % 2 != 0) {
                    throw null;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr6 = new Object[1];
            b(127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, null, "\u0096\u009e\u009d\u0083\u0081\u009c\u0096\u0092\u008b\u008e\u009b\u009a\u0096\u0090\u008f\u008c\u0098\u0096\u0088\u008d\u0087\u008c\u0096\u0086\u0087\u0095\u0099\u0097\u0096\u0098\u008f\u0096\u008c\u0087\u0097\u0090\u008b\u008e\u0096\u0088\u0087\u0095\u0094\u0087\u0093\u0092\u0087\u008e\u0091", objArr6);
            sb2.append(((String) objArr6[0]).intern());
            sb2.append(iIntValue);
            throw new IOException(sb2.toString());
        } catch (Exception e11) {
            Object[] objArr7 = new Object[1];
            b((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 126, null, null, "\u009d\u0083\u0081\u009c\u0096\u009a¢¢\u008e\u0087\u0093¡\u0096\u0088\u0087\u0087\u0086\u0096\u008f\u0095\u0096\u0088\u0087 \u009b\u008d\u009f", objArr7);
            throw new SecurityException(((String) objArr7[0]).intern(), e11);
        }
    }

    public static /* synthetic */ Object getSDKTransactionID(Object[] objArr, int i11, int i12, int i13) {
        return AuthenticationRequestParameters(objArr);
    }

    static void init$0() {
        $$a = new byte[]{91, -66, -77, -12};
        $$b = 79;
    }

    static void getSDKTransactionID() {
        ChallengeResultError = (char) 7221;
        ChallengeResultTimeout = (char) 17018;
        getTransactionStatus = (char) 26108;
        ChallengeResultCompleted = (char) 47745;
    }

    static byte[] AuthenticationRequestParameters() throws Throwable {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeLong(System.currentTimeMillis());
            dataOutputStream.writeLong(System.nanoTime());
            dataOutputStream.writeInt(Process.myPid());
            dataOutputStream.writeInt(Process.myUid());
            dataOutputStream.write(getSDKTransactionID);
            dataOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            getAdditionalDetails = (ChallengeStatusHandler + 115) % 128;
            return byteArray;
        } catch (IOException e11) {
            Object[] objArr = new Object[1];
            a(Process.getGidForName("") - 98, 1359163541 - Drawable.resolveOpacity(0, 0), (short) ((-125) - MotionEvent.axisFromString("")), (-2072607752) + (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) (TextUtils.indexOf("", "", 0, 0) + 127), objArr);
            throw new SecurityException(((String) objArr[0]).intern(), e11);
        }
    }
}
